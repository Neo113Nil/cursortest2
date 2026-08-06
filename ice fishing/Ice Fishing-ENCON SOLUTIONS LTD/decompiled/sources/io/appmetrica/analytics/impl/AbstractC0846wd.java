package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0846wd {

    /* renamed from: a, reason: collision with root package name */
    public static C0868x9 f7108a;

    public static final synchronized C0868x9 a(Context context) {
        C0868x9 c0868x9;
        synchronized (AbstractC0846wd.class) {
            c0868x9 = f7108a;
            if (c0868x9 == null) {
                c0868x9 = new C0868x9(context, "uuid.dat");
                f7108a = c0868x9;
            }
        }
        return c0868x9;
    }
}
