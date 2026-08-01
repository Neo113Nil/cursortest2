package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Sx extends Rx {
    public static Sx i;

    public static final Sx f(Context context) {
        Sx sx;
        synchronized (Sx.class) {
            try {
                if (i == null) {
                    i = new Sx(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                sx = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sx;
    }
}
