package defpackage;

import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.summary.mobilityhub.mapper.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class sv20 extends ad5 {
    public final fvr A;
    public final pwy0 B;
    public final a C;
    public final b D;
    public final r0 E;
    public final b01 F;
    public final ah00 x;
    public final a3v y;
    public final et00 z;

    public sv20(ah00 ah00Var, a3v a3vVar, et00 et00Var, fvr fvrVar, pwy0 pwy0Var, a aVar, b bVar) {
        super(rv20.class);
        this.x = ah00Var;
        this.y = a3vVar;
        this.z = et00Var;
        this.A = fvrVar;
        this.B = pwy0Var;
        this.C = aVar;
        this.D = bVar;
        this.E = bvf0.c(Boolean.FALSE);
        this.F = new b01(14, this);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((gh00) this.x).u(this.F);
    }
}
