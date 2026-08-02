package defpackage;

import android.content.Context;
import com.yandex.go.settings.domain.a;
import com.yandex.go.settings.domain.b;
import com.yandex.go.settings.presentation.models.AppSettingsTransitionMode;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class uw2 extends pgd {
    public final b F;
    public final Context G;
    public final w030 H;
    public final a I;
    public final yvf0 J;
    public final oc60 K;
    public final yvf0 L;
    public final ji3 M;
    public final b8w N;
    public final y50 O;
    public final r0 P;
    public final sw2 Q;
    public final mu5 R;

    public uw2(b bVar, Context context, w030 w030Var, a aVar, yvf0 yvf0Var, yvf0 yvf0Var2, oc60 oc60Var, yvf0 yvf0Var3, yvf0 yvf0Var4, ji3 ji3Var, b8w b8wVar, y50 y50Var) {
        super(0);
        this.F = bVar;
        this.G = context;
        this.H = w030Var;
        this.I = aVar;
        this.J = yvf0Var;
        this.K = oc60Var;
        this.L = yvf0Var3;
        this.M = ji3Var;
        this.N = b8wVar;
        this.O = y50Var;
        this.P = bvf0.c(AppSettingsTransitionMode.Forward);
        this.Q = new sw2(this, 0);
        this.R = new mu5(new eo1(10, this));
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        this.P.l(this.z ? AppSettingsTransitionMode.Reverse : AppSettingsTransitionMode.None);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.R;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.H;
    }
}
