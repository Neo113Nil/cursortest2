package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Tx extends Sx {
    public static Tx i;

    public static final Tx f(Context context) {
        Tx tx;
        synchronized (Tx.class) {
            try {
                if (i == null) {
                    i = new Tx(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                tx = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx;
    }
}
