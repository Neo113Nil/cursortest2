package defpackage;

import android.content.Context;
import com.yandex.go.chargers.surge.info.e;

/* loaded from: classes12.dex */
public final class zva extends pgd {
    public final Context F;
    public final pwy0 G;
    public final e H;
    public final w030 I;
    public final mu5 J;

    public zva(fwa fwaVar, Context context, pwy0 pwy0Var, e eVar, w030 w030Var) {
        super(0);
        this.F = context;
        this.G = pwy0Var;
        this.H = eVar;
        this.I = w030Var;
        this.J = new mu5(new cs8(22, this, fwaVar));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.I;
    }
}
