package defpackage;

import android.content.Context;
import com.yandex.go.walking.navigation.impl.location_mock.settings.interactor.a;

/* loaded from: classes14.dex */
public final class x341 extends pgd {
    public final a441 F;
    public final Context G;
    public final w030 H;
    public final mu5 I;

    public x341(a aVar, a441 a441Var, Context context, w030 w030Var) {
        super(0);
        this.F = a441Var;
        this.G = context;
        this.H = w030Var;
        this.I = new mu5(new e331(12, this, aVar));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.I;
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
