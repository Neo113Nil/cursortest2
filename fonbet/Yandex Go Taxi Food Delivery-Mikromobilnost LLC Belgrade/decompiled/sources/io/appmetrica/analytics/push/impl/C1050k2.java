package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.push.AppMetricaPush;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.model.PushMessage;

/* renamed from: io.appmetrica.analytics.push.impl.k2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1050k2 implements InterfaceC1026e2 {
    @Override // io.appmetrica.analytics.push.impl.InterfaceC1026e2
    public final void a(Context context, PushMessage pushMessage) {
        Intent intent = new Intent(context.getPackageName() + ".action.ymp.SILENT_PUSH_RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(AppMetricaPush.EXTRA_PAYLOAD, pushMessage.getPayload());
        context.sendBroadcast(intent);
        boolean z = r.a(context).f.a().trackingProcessedAction;
        if (CoreUtils.isEmpty(pushMessage.getNotificationId()) || !z) {
            return;
        }
        Y1.b.onSilentPushProcessed(pushMessage.getNotificationId(), pushMessage.getPayload(), pushMessage.getTransport());
    }
}
