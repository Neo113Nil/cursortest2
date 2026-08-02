package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.appmetrica.analytics.push.AppMetricaPush;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.intent.NotificationActionInfo;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;

/* loaded from: classes4.dex */
public abstract class D1 implements InterfaceC1053l1 {
    public final C1011b a = new C1011b();

    public final void a(Context context, NotificationActionInfo notificationActionInfo) {
        C1011b c1011b = this.a;
        String str = notificationActionInfo.targetActionUri;
        c1011b.getClass();
        Intent a = C1011b.a(context, str);
        if (a == null) {
            PublicLogger.INSTANCE.warning("Intent action for pushId = %s is null", notificationActionInfo.pushId);
            TrackersHub.getInstance().reportError("Open action intent is null", null);
            return;
        }
        try {
            a.putExtra(AppMetricaPush.EXTRA_PAYLOAD, notificationActionInfo.payload);
            Bundle bundle = notificationActionInfo.extraBundle;
            if (bundle != null) {
                a.putExtras(bundle);
            }
            if (notificationActionInfo.explicitIntent) {
                a.setPackage(context.getPackageName());
            }
            context.startActivity(a);
        } catch (Exception e) {
            PublicLogger.INSTANCE.error(e, "Smth wrong when starting activity for push message with pushId=%s", notificationActionInfo.pushId);
            TrackersHub.getInstance().reportError("Error starting activity", e);
        }
    }
}
