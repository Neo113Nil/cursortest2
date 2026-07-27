package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class Ux extends Sx {
    public static Ux i;

    public static final Ux f(Context context) {
        Ux ux;
        synchronized (Ux.class) {
            try {
                if (i == null) {
                    i = new Ux(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                ux = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ux;
    }

    public final void g() {
        synchronized (Ux.class) {
            try {
                if (((SharedPreferences) this.f27654f.f25416u).contains(this.f27649a)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
