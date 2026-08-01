package com.anythink.core.basead;

import android.content.Context;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.af;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f11907a;

    private b() {
    }

    public static b a() {
        if (f11907a == null) {
            synchronized (b.class) {
                try {
                    if (f11907a == null) {
                        f11907a = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11907a;
    }

    public static void b(Context context, String str) {
        af.a(context, u.b.f12851e, str);
    }

    public static void a(Context context, String str, String str2) {
        af.b(context, u.b.f12851e, str, str2);
    }

    public static String a(Context context, String str) {
        return af.c(context, u.b.f12851e, str, "");
    }

    public static String a(x xVar) {
        if (xVar == null) {
            return "";
        }
        return a(xVar.f14156b, xVar.f14157c, xVar.f14160f);
    }

    public static String a(String str, String str2, int i) {
        return str + "_" + str2 + "_" + i;
    }
}
