package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0680rf {
    public static Ma a;

    public static final synchronized Ma a(Context context) {
        Ma ma;
        synchronized (AbstractC0680rf.class) {
            ma = a;
            if (ma == null) {
                ma = new Ma(context, "uuid.dat");
                a = ma;
            }
        }
        return ma;
    }
}
