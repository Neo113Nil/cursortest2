package com.anythink.core.a;

import android.content.Context;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.af;
import com.anythink.core.d.l;
import com.google.android.gms.internal.ads.CL;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f11738a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11739b = "pacing_";

    public static d a() {
        if (f11738a == null) {
            f11738a = new d();
        }
        return f11738a;
    }

    private static void b() {
    }

    private static void c() {
    }

    public static int a(String str, l lVar) {
        if (lVar == null) {
            return 3;
        }
        int a9 = b.a(t.b().g()).a(str, String.valueOf(lVar.aq()), lVar.ax());
        if (a9 != b.f11704n) {
            return a9;
        }
        if (!t.b().v()) {
            if (lVar.ax() == -1) {
                return b.f11704n;
            }
            long b9 = af.b(t.b().g(), u.b.f13004a, "pacing_".concat(String.valueOf(str)), 0L);
            if (System.currentTimeMillis() - b9 < 0) {
                return b.f11704n;
            }
            if (System.currentTimeMillis() - b9 < lVar.ax()) {
                return 3;
            }
        }
        return b.f11704n;
    }

    public static int a(String str, bv bvVar) {
        if (bvVar == null) {
            return 3;
        }
        int a9 = b.a(t.b().g()).a(String.valueOf(bvVar.g()), bvVar.z(), String.valueOf(bvVar.bf()), bvVar.y());
        if (a9 != b.f11704n) {
            return a9;
        }
        if (!t.b().v()) {
            if (bvVar.y() == -1) {
                return b.f11704n;
            }
            Context g9 = t.b().g();
            StringBuilder m8 = CL.m("pacing_", str, "_");
            m8.append(bvVar.z());
            long b9 = af.b(g9, u.b.f13004a, m8.toString(), 0L);
            if (System.currentTimeMillis() - b9 < 0) {
                bvVar.z();
                return b.f11704n;
            }
            if (System.currentTimeMillis() - b9 < bvVar.y()) {
                return 3;
            }
        }
        return b.f11704n;
    }
}
