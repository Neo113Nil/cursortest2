package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.c;
import com.yandex.plus.home.feature.webviews.internal.d;
import com.yandex.plus.home.feature.webviews.internal.smart.b;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class yld0 extends iz4 implements p3d0, so41 {
    public final boolean A;
    public final hov B;
    public final uu60 C;
    public final bzd0 D;
    public final ul60 E;
    public final i3y F;
    public pzt0 G;
    public final gsd0 H;
    public final i3y I;
    public final b J;
    public final rzg f;
    public final y4a0 g;
    public final jse h;
    public final jse i;
    public final jse j;
    public final a k;
    public final p4z l;
    public final com.yandex.plus.home.feature.webviews.internal.settings.domain.b m;
    public final mum n;
    public final imd0 o;
    public final v920 p;
    public final com.yandex.plus.home.feature.webviews.internal.container.b q;
    public final y821 r;
    public final d s;
    public final vio t;
    public final wio u;
    public final dc20 v;
    public final c w;
    public final com.yandex.plus.home.api.prefetch.a x;
    public final hsd0 y;
    public final String z;

    public yld0(cjw0 cjw0Var, rzg rzgVar, com.yandex.plus.home.auth.b bVar, y4a0 y4a0Var, jse jseVar, jse jseVar2, jse jseVar3, a aVar, p4z p4zVar, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar2, mum mumVar, imd0 imd0Var, v920 v920Var, com.yandex.plus.home.feature.webviews.internal.container.a aVar2, y821 y821Var, d dVar, kio kioVar, vio vioVar, wio wioVar, dc20 dc20Var, c cVar, com.yandex.plus.home.api.prefetch.a aVar3, hsd0 hsd0Var, String str, boolean z, boolean z2, hov hovVar, uu60 uu60Var, bzd0 bzd0Var, ul60 ul60Var) {
        super(jseVar, new xld0());
        this.f = rzgVar;
        this.g = y4a0Var;
        this.h = jseVar;
        this.i = jseVar2;
        this.j = jseVar3;
        this.k = aVar;
        this.l = p4zVar;
        this.m = bVar2;
        this.n = mumVar;
        this.o = imd0Var;
        this.p = v920Var;
        this.q = aVar2;
        this.r = y821Var;
        this.s = dVar;
        this.t = vioVar;
        this.u = wioVar;
        this.v = dc20Var;
        this.w = cVar;
        this.x = aVar3;
        this.y = hsd0Var;
        this.z = str;
        this.A = z;
        this.B = hovVar;
        this.C = uu60Var;
        this.D = bzd0Var;
        this.E = ul60Var;
        this.F = kotlin.a.a(new r0d0(9, this));
        this.H = new gsd0();
        this.I = kotlin.a.a(new ty4(cjw0Var, 1));
        this.J = new b(this, rzgVar.a.toString(), bVar, kioVar, aVar2, v920Var, z2, jseVar);
    }

    @Override // defpackage.iz4
    public final void d() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = null;
        super.d();
        com.yandex.plus.home.common.utils.a.b(this.J.h);
        skd0.b(PlusLogTag.UI, "detachView()");
        gsd0 gsd0Var = this.H;
        gsd0Var.e = false;
        gsd0Var.a();
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            k(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.u.c(str, i, str2, str3, z);
    }

    @Override // defpackage.iz4
    public final void g() {
        this.J.getClass();
        skd0.b(PlusLogTag.UI, "onPause()");
        this.H.b();
    }

    @Override // defpackage.iz4
    public final void h() {
        b bVar = this.J;
        bVar.getClass();
        skd0.b(PlusLogTag.UI, "onResume()");
        bVar.a(new bbd0(23));
        this.H.d();
    }

    public final void k(String str, String str2) {
        if (!this.A) {
            pzt0 pzt0Var = this.G;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.G = null;
        }
        this.g.s();
        skd0.c(PlusLogTag.UI, str, null);
        ((asd0) this.b).showError(str);
        if (str2 == null) {
            str2 = this.J.g;
        }
        this.y.d(this.z, str2);
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            k("ssl error", str);
        }
        this.u.e(str, i, str2, str3, z);
    }

    public final void m() {
        this.g.s();
        skd0.c(PlusLogTag.UI, "web view timeout", null);
        ((asd0) this.b).showError("loading timeout");
        String uri = this.f.a.toString();
        this.u.d(this.D.b, uri);
        this.y.d(this.z, this.J.g);
    }

    public final void n(gov govVar) {
        if (this.A) {
            ((asd0) this.b).sendMessage(govVar);
        } else {
            ((com.yandex.plus.home.feature.webviews.internal.smart.a) this.F.getValue()).A(govVar);
        }
    }

    @Override // defpackage.p3d0
    public final void onMessage(String str) {
        ((com.yandex.plus.home.feature.webviews.internal.smart.a) this.F.getValue()).onMessage(str);
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            k(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.u.b(str, i, str2, str3, z);
    }
}
