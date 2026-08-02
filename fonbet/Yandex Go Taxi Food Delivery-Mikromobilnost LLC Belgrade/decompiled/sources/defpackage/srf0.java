package defpackage;

import com.yandex.go.promocodes.d;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class srf0 implements dpj {
    public final /* synthetic */ d a;

    public srf0(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.dpj
    public final void E0(wlf0 wlf0Var) {
        d dVar = this.a;
        if (dVar.F.a(wlf0Var)) {
            dVar.z((m950) dVar.J.get(), new mo30(18, dVar));
            return;
        }
        cmf0 cmf0Var = wlf0Var.i;
        if (cmf0Var == null) {
            return;
        }
        dVar.A((m950) dVar.I.get(), new brj(wlf0Var, cmf0Var, EmptyList.a), new qrj(dVar, 1));
    }

    @Override // defpackage.dpj
    public final void R0() {
        this.a.r(new gdf0(17));
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.dpj
    public final void w0() {
        this.a.r(new gdf0(16));
    }
}
