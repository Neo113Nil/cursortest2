package defpackage;

import android.content.Context;
import defpackage.agd;
import defpackage.g92;
import defpackage.iin0;
import defpackage.jl40;
import defpackage.ncd;
import defpackage.qjo0;
import defpackage.rjo0;
import defpackage.rol0;
import defpackage.sjo0;
import defpackage.tpr;
import defpackage.uv6;
import defpackage.w511;
import defpackage.wjo0;
import defpackage.yfd;
import defpackage.yjo0;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class uv6 extends pgd {
    public final /* synthetic */ int F = 2;
    public final Context G;
    public final w030 H;
    public final Object I;
    public final wfd J;

    public uv6(w030 w030Var, Context context) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = bvf0.c(tja0.a);
        this.J = new mu5(new qja0(this, 0));
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.F) {
            case 0:
                throw null;
            case 4:
                throw null;
            case 5:
                r0 r0Var = (r0) this.I;
                tsj0 tsj0Var = ((pja0) obj).a;
                sja0 sja0Var = new sja0(tsj0Var.a, tsj0Var.b, tsj0Var.c, tsj0Var.d);
                r0Var.getClass();
                r0Var.m(null, sja0Var);
                return;
            case 7:
                throw null;
            default:
                return;
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        switch (this.F) {
            case 0:
                return (p1b) this.J;
            case 1:
                return (mu5) this.J;
            case 2:
                return (mu5) this.J;
            case 3:
                return (mu5) this.J;
            case 4:
                return (p1b) this.J;
            case 5:
                return (mu5) this.J;
            case 6:
                return (mu5) this.J;
            default:
                return (p1b) this.J;
        }
    }

    @Override // defpackage.pgd
    public final Context Q() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        switch (this.F) {
        }
        return this.H;
    }

    public uv6(Context context, w030 w030Var, xv6 xv6Var, sv6 sv6Var, ie ieVar) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = sv6Var;
        this.J = new p1b(ieVar, new kv5(24, this));
    }

    public uv6(Context context, w030 w030Var, fga fgaVar) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = fgaVar;
        this.J = new mu5(new od9(11, this));
    }

    public uv6(Context context, w030 w030Var, wyd wydVar, syd sydVar, ie ieVar) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = sydVar;
        this.J = new p1b(ieVar, new vqb(18, this));
    }

    public uv6(Context context, w030 w030Var, yjo0 yjo0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = yjo0Var;
        this.J = new mu5(new tls() { // from class: com.yandex.go.scooters.photocontrol.verdict.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                tpr g92Var;
                yfd yfdVar = (yfd) obj;
                sjo0 sjo0Var = (sjo0) ((agd) yfdVar).a;
                boolean l = jl40.l(sjo0Var, qjo0.a);
                uv6 uv6Var = uv6.this;
                if (l) {
                    yjo0 yjo0Var2 = (yjo0) uv6Var.I;
                    yjo0Var2.getClass();
                    g92Var = e.t(new rol0(new ScootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1(yjo0Var2, null)));
                } else {
                    if (!(sjo0Var instanceof rjo0)) {
                        w511.b();
                        return null;
                    }
                    g92Var = new g92(2, new wjo0(((rjo0) ((agd) yfdVar).a).a));
                }
                agd agdVar = (agd) yfdVar;
                agdVar.c = g92Var;
                agdVar.e = new iin0(18, uv6Var);
                ncd.a.getClass();
                agdVar.g = ncd.b;
                return zy11.a;
            }
        });
    }

    public uv6(Context context, w030 w030Var, hd01 hd01Var, jhu0 jhu0Var, ie ieVar) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = jhu0Var;
        this.J = new p1b(ieVar, new pxy0(20, this));
    }

    public uv6(Context context, w030 w030Var, ycq0 ycq0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = ycq0Var;
        this.J = new mu5(new od9(0, this));
    }

    public uv6(sk7 sk7Var, yob yobVar, Context context, w030 w030Var, sue0 sue0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = sue0Var;
        this.J = new mu5(new f89(7, this, sk7Var, yobVar));
    }
}
