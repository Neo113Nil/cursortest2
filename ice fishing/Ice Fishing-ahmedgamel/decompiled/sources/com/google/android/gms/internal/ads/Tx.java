package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class Tx extends Rx {
    public static Tx i;

    public static final Tx f(Context context) {
        Tx tx;
        synchronized (Tx.class) {
            try {
                if (i == null) {
                    i = new Tx(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                tx = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx;
    }

    public final void g() {
        synchronized (Tx.class) {
            try {
                if (((SharedPreferences) this.f28093f.f2909v).contains(this.f28088a)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
