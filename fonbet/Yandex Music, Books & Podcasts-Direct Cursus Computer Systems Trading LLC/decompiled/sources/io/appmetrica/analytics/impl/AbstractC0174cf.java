package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0174cf {
    public static Fa a;

    public static final synchronized Fa a(Context context) {
        Fa fa;
        synchronized (AbstractC0174cf.class) {
            fa = a;
            if (fa == null) {
                fa = new Fa(context, "uuid.dat");
                a = fa;
            }
        }
        return fa;
    }
}
