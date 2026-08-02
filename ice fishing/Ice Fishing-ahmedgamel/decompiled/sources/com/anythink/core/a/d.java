package com.anythink.core.a;

import android.content.Context;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.af;
import com.anythink.core.d.l;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f12367a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12368b = "pacing_";

    public static d a() {
        if (f12367a == null) {
            f12367a = new d();
        }
        return f12367a;
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
        if (a9 != b.f12333n) {
            return a9;
        }
        if (!t.b().v()) {
            if (lVar.ax() == -1) {
                return b.f12333n;
            }
            long b9 = af.b(t.b().g(), u.b.f13633a, "pacing_".concat(String.valueOf(str)), 0L);
            if (System.currentTimeMillis() - b9 < 0) {
                return b.f12333n;
            }
            if (System.currentTimeMillis() - b9 < lVar.ax()) {
                return 3;
            }
        }
        return b.f12333n;
    }

    public static int a(String str, bv bvVar) {
        if (bvVar == null) {
            return 3;
        }
        int a9 = b.a(t.b().g()).a(String.valueOf(bvVar.g()), bvVar.z(), String.valueOf(bvVar.bf()), bvVar.y());
        if (a9 != b.f12333n) {
            return a9;
        }
        if (!t.b().v()) {
            if (bvVar.y() == -1) {
                return b.f12333n;
            }
            Context g9 = t.b().g();
            StringBuilder l9 = Wv.l("pacing_", str, "_");
            l9.append(bvVar.z());
            long b9 = af.b(g9, u.b.f13633a, l9.toString(), 0L);
            if (System.currentTimeMillis() - b9 < 0) {
                bvVar.z();
                return b.f12333n;
            }
            if (System.currentTimeMillis() - b9 < bvVar.y()) {
                return 3;
            }
        }
        return b.f12333n;
    }
}
