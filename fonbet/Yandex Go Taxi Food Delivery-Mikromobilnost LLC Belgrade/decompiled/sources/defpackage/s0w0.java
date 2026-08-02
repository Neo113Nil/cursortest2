package defpackage;

import android.content.Context;
import com.yandex.go.superapp.discovery.map.impl.ui.location_permission.SuperAppLocationPermissionRequestModalView;

/* loaded from: classes14.dex */
public final class s0w0 extends m230 {
    public final w030 E;
    public final ktv0 F;
    public final r0w0 G;
    public final o0w0 H;
    public final boolean I;

    public s0w0(w030 w030Var, ktv0 ktv0Var, r0w0 r0w0Var, o0w0 o0w0Var) {
        super(null);
        this.E = w030Var;
        this.F = ktv0Var;
        this.G = r0w0Var;
        this.H = o0w0Var;
        this.I = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.I;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        wor0 wor0Var = new wor0(this);
        amp0 amp0Var = this.G.a;
        q0w0 q0w0Var = new q0w0(wor0Var, (y50) ((bag) amp0Var.a).get(), (v7j0) ((jag) amp0Var.b).get(), (ney) ((iag) amp0Var.c).get());
        zz7 zz7Var = this.H.a;
        return new SuperAppLocationPermissionRequestModalView((Context) zz7Var.a.get(), (ip11) zz7Var.b.get(), this.F, q0w0Var);
    }
}
