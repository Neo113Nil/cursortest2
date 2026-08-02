package com.yandex.plus.core.utils;

import android.content.Context;
import defpackage.u76;

/* loaded from: classes4.dex */
public final class b {
    public static final b a = new b();
    public static volatile u76 b;

    public final u76 a(Context context) {
        u76 u76Var;
        context.getClass();
        u76 u76Var2 = b;
        if (u76Var2 != null) {
            return u76Var2;
        }
        synchronized (this) {
            u76Var = b;
            if (u76Var == null) {
                context.getClass();
                u76Var = new u76();
                u76Var.a = context.getSharedPreferences("metrica_settings", 0);
                b = u76Var;
            }
        }
        return u76Var;
    }
}
