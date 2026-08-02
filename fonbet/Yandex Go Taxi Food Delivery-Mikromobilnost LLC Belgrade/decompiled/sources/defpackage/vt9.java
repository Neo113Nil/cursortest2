package defpackage;

import android.content.Context;
import com.yandex.go.chargers.discounts.activate.d;

/* loaded from: classes12.dex */
public final class vt9 extends pgd {
    public final Context F;
    public final em9 G;
    public final w030 H;
    public final d I;
    public final c06 J;
    public final mu5 K;

    public vt9(Context context, em9 em9Var, w030 w030Var, d dVar, c06 c06Var) {
        super(0);
        this.F = context;
        this.G = em9Var;
        this.H = w030Var;
        this.I = dVar;
        this.J = c06Var;
        this.K = new mu5(new od9(5, this));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.H;
    }
}
