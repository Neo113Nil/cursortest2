package defpackage;

import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import java.util.HashMap;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.summary.tariffpage.requirements.a;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;

/* loaded from: classes6.dex */
public final class vot0 extends ad5 {
    public final a A;
    public final pav B;
    public final g580 C;
    public final ru.yandex.taxi.summary.requirements.list.router.a D;
    public final b E;
    public final pwy0 F;
    public final TariffInfoGroupDefinition G;
    public final f580 H;
    public final wor0 I;
    public final roj0 x;
    public final k0 y;
    public final lot0 z;

    public vot0(roj0 roj0Var, k0 k0Var, lot0 lot0Var, a aVar, pav pavVar, g580 g580Var, ru.yandex.taxi.summary.requirements.list.router.a aVar2, b bVar, pwy0 pwy0Var, TariffInfoGroupDefinition tariffInfoGroupDefinition, f580 f580Var, wor0 wor0Var) {
        super(sot0.class);
        this.x = roj0Var;
        this.y = k0Var;
        this.z = lot0Var;
        this.A = aVar;
        this.B = pavVar;
        this.C = g580Var;
        this.D = aVar2;
        this.E = bVar;
        this.F = pwy0Var;
        this.G = tariffInfoGroupDefinition;
        this.H = f580Var;
        this.I = wor0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        String str = this.G.a;
        boolean w8 = ((sot0) Dg()).w8();
        xcv0 xcv0Var = this.H.c;
        HashMap m = nnm.m(xcv0Var, "group_id", str);
        xcv0Var.a.a("Summary.Requirements.RequirementGroup.Closed", m, 1, x4e.r(w8, m, "at_least_one_enabled"));
        super.Cg();
    }
}
