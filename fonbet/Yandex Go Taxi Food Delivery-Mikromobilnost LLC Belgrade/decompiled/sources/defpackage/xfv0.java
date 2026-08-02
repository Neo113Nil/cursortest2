package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;
import java.util.HashMap;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class xfv0 {
    public final evr a;
    public final fgv0 b;
    public final fgv0 c;
    public final e d;
    public final kgl0 e;
    public final yfv0 f;

    public xfv0(evr evrVar, fgv0 fgv0Var, fgv0 fgv0Var2, e eVar, kgl0 kgl0Var, yfv0 yfv0Var) {
        this.a = evrVar;
        this.b = fgv0Var;
        this.c = fgv0Var2;
        this.d = eVar;
        this.e = kgl0Var;
        this.f = yfv0Var;
    }

    public final void a(rfv0 rfv0Var) {
        zfv0 zfv0Var = zfv0.a;
        cgv0 cgv0Var = cgv0.a;
        bgv0 bgv0Var = bgv0.a;
        this.f.c = rfv0Var;
        if (rfv0Var.equals(lfv0.a)) {
            e eVar = this.d;
            fgv0 fgv0Var = this.c;
            kgl0 kgl0Var = this.e;
            evr evrVar = this.a;
            if (!this.f.a()) {
                evrVar.a();
                return;
            }
            egv0 egv0Var = (egv0) this.b.e.getValue();
            if (jl40.l(egv0Var, cgv0Var)) {
                evrVar.a();
                return;
            }
            if (egv0Var instanceof dgv0) {
                kgl0Var.getClass();
                kgl0Var.a.a("Routes.FocusPointA.Tapped", new HashMap(), 1, new HashMap());
                fgv0Var.a();
                eVar.h(SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_A, false, false);
                return;
            }
            if (!(egv0Var instanceof agv0)) {
                if (jl40.l(egv0Var, zfv0Var) || jl40.l(egv0Var, bgv0Var)) {
                    return;
                }
                w511.b();
                return;
            }
            kgl0Var.getClass();
            kgl0Var.a.a("Routes.FocusPointB.Tapped", new HashMap(), 1, new HashMap());
            fgv0Var.a();
            eVar.h(SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_B, false, false);
            return;
        }
        if (rfv0Var.equals(nfv0.a)) {
            if (!this.f.a() || this.b.c) {
                return;
            }
            int i = wfv0.a[this.d.a.a().ordinal()];
            if (i == 1) {
                this.c.c();
                return;
            }
            if (i == 2 || i == 3) {
                this.c.b();
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.a.b();
                return;
            }
        }
        if (rfv0Var instanceof qfv0) {
            if (((qfv0) rfv0Var).a) {
                this.a.b();
            }
            this.b.c = false;
            return;
        }
        if (rfv0Var.equals(ofv0.a)) {
            this.a.b();
            return;
        }
        if (!rfv0Var.equals(pfv0.a)) {
            if (!rfv0Var.equals(mfv0.a)) {
                w511.b();
                return;
            }
            this.b.c = true;
            if (!this.f.a() || jl40.l(this.b.e.getValue(), bgv0Var)) {
                return;
            }
            this.c.a();
            return;
        }
        evr evrVar2 = this.a;
        e eVar2 = this.d;
        fgv0 fgv0Var2 = this.c;
        if (!this.f.a()) {
            egv0 egv0Var2 = (egv0) this.b.e.getValue();
            if (egv0Var2 instanceof dgv0) {
                fgv0Var2.a();
                return;
            }
            if (egv0Var2 instanceof agv0) {
                evrVar2.b();
                return;
            } else {
                if (jl40.l(egv0Var2, cgv0Var) || jl40.l(egv0Var2, zfv0Var) || jl40.l(egv0Var2, bgv0Var)) {
                    return;
                }
                w511.b();
                return;
            }
        }
        int i2 = wfv0.a[eVar2.a.a().ordinal()];
        if (i2 == 1) {
            fgv0Var2.c();
            return;
        }
        if (i2 == 2 || i2 == 3) {
            fgv0Var2.b();
        } else if (i2 != 4) {
            eVar2.h(SourcePointMode.ROUTE, true, true);
        } else {
            evrVar2.b();
        }
    }
}
