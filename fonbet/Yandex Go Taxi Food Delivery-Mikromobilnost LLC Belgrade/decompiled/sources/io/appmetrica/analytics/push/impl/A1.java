package io.appmetrica.analytics.push.impl;

import android.app.NotificationManager;

/* loaded from: classes9.dex */
public final class A1 {
    public final NotificationManager a;
    public final androidx.core.app.s0 b;
    public final C1094z1 c;
    public final M1 d;

    public A1(NotificationManager notificationManager, androidx.core.app.s0 s0Var, M1 m1) {
        this.a = notificationManager;
        this.b = s0Var;
        this.d = m1;
        if (AbstractC1035h.a(28)) {
            this.c = new C1091y1(this);
        } else if (AbstractC1035h.a(26)) {
            this.c = new C1088x1(this);
        } else {
            this.c = new C1094z1(this);
        }
    }
}
