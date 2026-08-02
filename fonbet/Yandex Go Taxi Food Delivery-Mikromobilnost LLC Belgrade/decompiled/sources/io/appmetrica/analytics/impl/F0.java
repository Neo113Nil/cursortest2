package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes9.dex */
public final class F0 {
    public static boolean a() {
        boolean z;
        synchronized (E0.class) {
            z = E0.f;
        }
        return z;
    }

    public static void b() {
        synchronized (E0.class) {
            E0.f = true;
        }
    }

    public static E0 a(Context context) {
        return E0.a(context);
    }
}
