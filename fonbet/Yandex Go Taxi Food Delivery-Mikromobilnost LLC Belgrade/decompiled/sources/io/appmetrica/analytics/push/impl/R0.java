package io.appmetrica.analytics.push.impl;

import android.R;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.appmetrica.analytics.push.AppMetricaPush;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.intent.NotificationActionInfo;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class R0 implements InterfaceC1053l1 {
    @Override // io.appmetrica.analytics.push.impl.InterfaceC1053l1
    public final void a(Context context, Intent intent) {
        NotificationActionInfo notificationActionInfo = (NotificationActionInfo) intent.getParcelableExtra(AppMetricaPush.EXTRA_ACTION_INFO);
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (notificationActionInfo == null || resultsFromIntent == null) {
            return;
        }
        String charSequence = resultsFromIntent.getCharSequence("key_text_reply", "").toString();
        PublicLogger.INSTANCE.info("Received inline input from action %s with text %s", notificationActionInfo.actionId, charSequence);
        if (!CoreUtils.isEmpty(notificationActionInfo.pushId)) {
            ((C1077u) r.a(context).f.d()).a(notificationActionInfo.pushId, notificationActionInfo.actionId, notificationActionInfo.payload, charSequence, notificationActionInfo.transport, notificationActionInfo.targetActionUri);
        }
        context.sendBroadcast(new Intent(context.getPackageName() + ".action.ymp.INLINE_PUSH_RECEIVE").setPackage(context.getPackageName()).putExtra(AppMetricaPush.EXTRA_ACTION_INFO, notificationActionInfo).putExtra("io.appmetrica.analytics.push.extra.INLINE_ACTION_REPLY", charSequence));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            if (!AbstractC1035h.a(28)) {
                notificationManager.cancel(notificationActionInfo.notificationTag, notificationActionInfo.notificationId);
                r.a(context).f().b(notificationActionInfo.pushId);
                return;
            }
            androidx.core.app.v vVar = new androidx.core.app.v(context, notificationActionInfo.channelId);
            vVar.K.icon = R.drawable.ic_dialog_info;
            vVar.f = androidx.core.app.v.d(charSequence);
            vVar.H = TimeUnit.SECONDS.toMillis(notificationActionInfo.hideAfterSeconds);
            notificationManager.notify(notificationActionInfo.notificationTag, notificationActionInfo.notificationId, vVar.b());
        }
    }
}
