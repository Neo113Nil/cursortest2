package io.appmetrica.analytics.push.impl;

/* renamed from: io.appmetrica.analytics.push.impl.z1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C1094z1 {
    public final /* synthetic */ A1 a;

    public C1094z1(A1 a1) {
        this.a = a1;
    }

    public C1076t1 a() {
        boolean areNotificationsEnabled = this.a.b.b.areNotificationsEnabled();
        Boolean a = this.a.d.a("app_notification_status");
        this.a.d.a("app_notification_status", areNotificationsEnabled);
        return new C1076t1(areNotificationsEnabled, (a == null || a.booleanValue() == areNotificationsEnabled) ? false : true);
    }
}
