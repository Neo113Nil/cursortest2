package com.yandex.passport.internal.ui.domik;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.x1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.report.aa;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.u0;
import defpackage.dfi;
import defpackage.f9h;
import defpackage.g7w;
import defpackage.tah;
import defpackage.tn3;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v {
    public final f a;
    public final com.yandex.passport.internal.flags.i b;
    public final com.yandex.passport.internal.properties.l c;
    public final n0 d;
    public final u0 e;

    public v(f fVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.properties.l lVar, n0 n0Var, u0 u0Var) {
        fVar.getClass();
        iVar.getClass();
        lVar.getClass();
        n0Var.getClass();
        u0Var.getClass();
        this.a = fVar;
        this.b = iVar;
        this.c = lVar;
        this.d = n0Var;
        this.e = u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.yandex.passport.internal.l] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static void a(v vVar, com.yandex.passport.internal.l lVar, boolean z) {
        com.yandex.passport.internal.a0 a0Var;
        com.yandex.passport.internal.a0 a0Var2;
        com.yandex.passport.internal.a0 a0Var3;
        f fVar = vVar.a;
        com.yandex.passport.internal.properties.l lVar2 = vVar.c;
        com.yandex.passport.internal.a0 a0Var4 = 0;
        a0Var4 = 0;
        a0Var4 = 0;
        a0Var4 = 0;
        if (lVar == null) {
            String str = lVar2.k;
            if (TextUtils.isEmpty(str)) {
                vVar.c();
                return;
            } else {
                str.getClass();
                fVar.q.m(new com.yandex.passport.internal.ui.base.m(new g7w(vVar, str, (com.yandex.passport.internal.l) a0Var4, z), "com.yandex.passport.internal.ui.domik.relogin.a", false, 1));
                return;
            }
        }
        com.yandex.passport.common.core.g gVar = lVar.e;
        String str2 = gVar.g;
        int i = gVar.h;
        if (lVar.k() != null) {
            if (i == 6) {
                String k = lVar.k();
                x1 x1Var = x1.VKONTAKTE;
                if (Intrinsics.d(k, "vk")) {
                    a0Var3 = new com.yandex.passport.internal.a0(w1.a, com.yandex.passport.internal.z.a, (String) null, (f9h) null, 20);
                } else if (Intrinsics.d(k, "fb")) {
                    a0Var3 = new com.yandex.passport.internal.a0(w1.b, com.yandex.passport.internal.z.a, (String) null, (f9h) null, 20);
                } else if (Intrinsics.d(k, "tw")) {
                    a0Var3 = new com.yandex.passport.internal.a0(w1.c, com.yandex.passport.internal.z.a, (String) null, (f9h) null, 20);
                } else if (Intrinsics.d(k, "ok")) {
                    a0Var3 = new com.yandex.passport.internal.a0(w1.d, com.yandex.passport.internal.z.a, (String) null, (f9h) null, 20);
                } else if (Intrinsics.d(k, "gg")) {
                    a0Var2 = new com.yandex.passport.internal.a0(w1.f, com.yandex.passport.internal.z.a, (String) null, (f9h) null, 20);
                    a0Var4 = a0Var2;
                } else if (Intrinsics.d(k, "mr")) {
                    a0Var = new com.yandex.passport.internal.a0(w1.e, com.yandex.passport.internal.z.a, (String) null, (f9h) null, 20);
                    a0Var4 = a0Var;
                }
                a0Var4 = a0Var3;
            } else if (i == 12) {
                String k2 = lVar.k();
                x1 x1Var2 = x1.VKONTAKTE;
                if (Intrinsics.d(k2, "gg")) {
                    a0Var2 = new com.yandex.passport.internal.a0(w1.i, com.yandex.passport.internal.z.b, "https://mail.google.com/", true, dfi.n("force_prompt", "1"));
                    a0Var4 = a0Var2;
                } else if (Intrinsics.d(k2, "mr")) {
                    a0Var4 = com.yandex.passport.internal.y.b(lVar.i());
                } else if (Intrinsics.d(k2, "ms")) {
                    a0Var4 = com.yandex.passport.internal.y.c(lVar.i());
                } else if (Intrinsics.d(k2, "yh")) {
                    a0Var4 = com.yandex.passport.internal.y.d(lVar.i());
                } else if (Intrinsics.d(k2, "ra")) {
                    a0Var4 = new com.yandex.passport.internal.a0(w1.m, com.yandex.passport.internal.z.c, (String) null, (f9h) null, 28);
                } else if (Intrinsics.d(k2, "other")) {
                    a0Var = new com.yandex.passport.internal.a0(w1.n, com.yandex.passport.internal.z.c, (String) null, (f9h) null, 28);
                    a0Var4 = a0Var;
                }
            }
        }
        if (a0Var4 != 0) {
            vVar.e(false, a0Var4, true, lVar);
            return;
        }
        if (str2 != null) {
            fVar.q.m(new com.yandex.passport.internal.ui.base.m(new g7w(vVar, str2, lVar, z), "com.yandex.passport.internal.ui.domik.relogin.a", false, 1));
        } else {
            if (i != 10) {
                vVar.c();
                return;
            }
            z zVar = z.a;
            lVar2.getClass();
            vVar.d(a0.i(a0.i(new a0(lVar2, null, null, null, null, null, null, null, null, zVar, null, null, null, null, false, b0.NOT_SHOWED), null, lVar.j, null, null, null, null, 65519), null, null, null, lVar, null, null, 64511));
        }
    }

    public final void b(d dVar, t tVar) {
        b0 b0Var;
        tVar.getClass();
        if (dVar != null && (b0Var = dVar.r) != null) {
            n0 n0Var = this.d;
            n0Var.getClass();
            n0Var.c(n0Var.e, l0.AUTH_SUCCESS, tah.b(new Pair("unsubscribe_from_maillists", b0Var.a)));
        }
        f(dVar, tVar);
    }

    public final void c() {
        Parcelable.Creator<d> creator = d.CREATOR;
        d a = s.a(this.c);
        d(new a0(a.a, null, null, null, null, null, null, null, null, z.a, null, null, null, null, false, b0.NOT_SHOWED));
    }

    public final void d(a0 a0Var) {
        z1 z1Var;
        com.yandex.passport.internal.properties.l lVar = this.c;
        if (lVar.y && (z1Var = lVar.g) != null) {
            com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(z1Var);
            boolean z = !lVar.p.a;
            u0 u0Var = this.e;
            u0Var.getClass();
            u0Var.n(aa.d, new ff(L), new com.yandex.passport.internal.report.a(z));
        }
        this.a.q.m(new com.yandex.passport.internal.ui.base.m(new tn3(10, a0Var), "com.yandex.passport.internal.ui.domik.phone_number.a", false, 1));
    }

    public final void e(boolean z, com.yandex.passport.internal.a0 a0Var, boolean z2, com.yandex.passport.internal.l lVar) {
        a0Var.getClass();
        this.a.q.m(new com.yandex.passport.internal.ui.base.m(new g7w(this, a0Var, z2, lVar), com.yandex.passport.internal.ui.social.o.k, z, 3));
    }

    public final void f(d dVar, t tVar) {
        Log.d("SOCIAL", "validateFinishRegistrationRequired");
        String str = dVar != null ? dVar.e : null;
        if (dVar == null) {
            dVar = null;
        }
        this.a.t.m(new android.util.Pair(new g(tVar, str), dVar));
    }
}
