package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class dpr implements lke {
    public final arf a;
    public final arf b;
    public final arf c;
    public final tf6 d;
    public x3n e;
    public final AtomicBoolean f;
    public final String g;
    public final lm4 h;
    public final jyr i;
    public final jyr j;
    public final List k;

    public dpr(nke nkeVar) {
        bdt I = hag.I(skr.class);
        l18 l18Var = l18.b;
        jyr b = l18Var.b(I, true);
        jyr b2 = l18Var.b(hag.I(qnr.class), true);
        jyr b3 = l18Var.b(hag.I(rwc.class), true);
        this.a = b2;
        this.b = b;
        this.c = b3;
        this.d = gld.e(e.c(a4g.n(), dm6.b()));
        this.f = new AtomicBoolean(false);
        this.g = "freemium";
        this.h = ern.a(dpr.class);
        this.i = btf.b(new rln(27, nkeVar, this));
        this.j = btf.b(new eyq(14, this));
        this.k = t75.c(vke.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
    @Override // defpackage.lke
    public final void b(int i, hq5 hq5Var) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1199901236);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            x3n x3nVar = this.e;
            if (x3nVar != null) {
                oq5Var.Z(-754929914);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = gld.R(g.a, oq5Var);
                    oq5Var.k0(K);
                }
                mm6 mm6Var = (mm6) K;
                qs5 qs5Var = qpg.a;
                ((qnr) this.a.getValue()).getClass();
                etn.l(qs5Var.a(new wnr((List) lwc.l.getValue(), 20)), ild.C(869366031, new gvl(this, context, mm6Var, x3nVar, 28), oq5Var), oq5Var, 56);
            } else {
                oq5Var.Z(-759138226);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(this, i, 22);
        }
    }

    @Override // defpackage.lke
    public final float c(jx7 jx7Var) {
        jx7Var.getClass();
        float f = (12 * 3) + 4;
        cma cmaVar = new cma(jx7Var.p(v7g.z(20)));
        cma cmaVar2 = new cma(48);
        if (cmaVar.compareTo(cmaVar2) < 0) {
            cmaVar = cmaVar2;
        }
        float p = 2 * jx7Var.p(v7g.z(14));
        cma cmaVar3 = new cma(cmaVar.a);
        cma cmaVar4 = new cma(p);
        if (cmaVar3.compareTo(cmaVar4) < 0) {
            cmaVar3 = cmaVar4;
        }
        return cmaVar3.a + f;
    }

    @Override // defpackage.lke
    public final List d() {
        return this.k;
    }

    @Override // defpackage.lke
    public final void e(boolean z) {
        jyr jyrVar = this.i;
        if (z) {
            ((eke) jyrVar.getValue()).b();
        } else {
            ((eke) jyrVar.getValue()).a();
        }
    }

    @Override // defpackage.lke
    public final lm4 g() {
        return this.h;
    }

    @Override // defpackage.lke
    public final String getTag() {
        return this.g;
    }

    @Override // defpackage.lke
    public final vdr getVisibility() {
        return (vdr) this.j.getValue();
    }

    @Override // defpackage.lke
    public final void start() {
        if (this.f.compareAndSet(false, true)) {
            skr skrVar = (skr) this.b.getValue();
            rwc rwcVar = (rwc) this.c.getValue();
            vdr visibility = getVisibility();
            tf6 tf6Var = this.d;
            uwc a = rwcVar.a(tf6Var, visibility);
            tf6Var.getClass();
            skrVar.getClass();
            final x3n x3nVar = new x3n();
            x3nVar.a = skrVar;
            final int i = 0;
            x3nVar.b = btf.b(new Function0() { // from class: for
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    x3n x3nVar2 = x3nVar;
                    switch (i2) {
                        case 0:
                            jyr jyrVar = (jyr) x3nVar2.c;
                            return new qor((String) jyrVar.getValue(), (String) jyrVar.getValue(), (String) null, 12);
                        default:
                            return ((skr) x3nVar2.a).c(R.string.let_in_fallback_banner_text);
                    }
                }
            });
            final int i2 = 1;
            x3nVar.c = btf.b(new Function0() { // from class: for
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    x3n x3nVar2 = x3nVar;
                    switch (i22) {
                        case 0:
                            jyr jyrVar = (jyr) x3nVar2.c;
                            return new qor((String) jyrVar.getValue(), (String) jyrVar.getValue(), (String) null, 12);
                        default:
                            return ((skr) x3nVar2.a).c(R.string.let_in_fallback_banner_text);
                    }
                }
            });
            x3nVar.d = zsd.F0(new mpq(2, a.g, x3nVar), tf6Var, lbq.b, bor.a);
            this.e = x3nVar;
        }
    }
}
