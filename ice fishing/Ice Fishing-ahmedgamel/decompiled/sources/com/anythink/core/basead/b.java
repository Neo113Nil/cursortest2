package com.anythink.core.basead;

import android.content.Context;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.af;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f12693a;

    private b() {
    }

    public static b a() {
        if (f12693a == null) {
            synchronized (b.class) {
                try {
                    if (f12693a == null) {
                        f12693a = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12693a;
    }

    public static void b(Context context, String str) {
        af.a(context, u.b.f13637e, str);
    }

    public static void a(Context context, String str, String str2) {
        af.b(context, u.b.f13637e, str, str2);
    }

    public static String a(Context context, String str) {
        return af.c(context, u.b.f13637e, str, "");
    }

    public static String a(x xVar) {
        if (xVar == null) {
            return "";
        }
        return a(xVar.f14942b, xVar.f14943c, xVar.f14946f);
    }

    public static String a(String str, String str2, int i) {
        return str + "_" + str2 + "_" + i;
    }
}
