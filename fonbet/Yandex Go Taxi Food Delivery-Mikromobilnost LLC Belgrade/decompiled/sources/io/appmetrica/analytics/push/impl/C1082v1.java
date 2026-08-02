package io.appmetrica.analytics.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import defpackage.evu0;
import defpackage.ny61;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.push.impl.v1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1082v1 implements PushFilter {
    public final NotificationManager a;
    public final androidx.core.app.s0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1082v1(Context context) {
        this((NotificationManager) r0, new androidx.core.app.s0(context));
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
        } else {
            ny61.t("null cannot be cast to non-null type android.app.NotificationManager");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r4 == null) goto L19;
     */
    @Override // io.appmetrica.analytics.push.settings.PushFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        String str;
        if (pushMessage.isSilent()) {
            return PushFilter.FilterResult.show();
        }
        if (!this.b.b.areNotificationsEnabled()) {
            return PushFilter.FilterResult.silence("Disabled system notification", "Disabled all notifications");
        }
        PushNotification notification = pushMessage.getNotification();
        if (notification != null && (str = notification.getChannelId()) != null) {
            if (evu0.J(str)) {
                str = null;
            }
        }
        str = "appmetrica_push";
        return A.b(this.a, str) == 0 ? PushFilter.FilterResult.silence("Disabled system notification", String.format("Disabled notifications for \"%s\" channel", Arrays.copyOf(new Object[]{str}, 1))) : B.a(this.a, str) ? PushFilter.FilterResult.silence("Disabled system notification", String.format("Disabled notifications for \"%s\" group", Arrays.copyOf(new Object[]{A.a(this.a, str)}, 1))) : PushFilter.FilterResult.show();
    }

    public C1082v1(NotificationManager notificationManager, androidx.core.app.s0 s0Var) {
        this.a = notificationManager;
        this.b = s0Var;
    }
}
