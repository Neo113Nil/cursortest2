package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import kotlin.a;

/* loaded from: classes11.dex */
public final class tcp0 implements pey, j2m0, rs31 {
    public final h2m0 a;
    public final t b;
    public pey c;
    public final i3y w;
    public final wj6 x;

    public tcp0() {
        h2m0 h2m0Var = new h2m0(new i2m0(this, new csf0(20, this)));
        this.a = h2m0Var;
        this.b = new t(this, true);
        this.w = a.a(new c6p0(13));
        h2m0Var.a(null);
        this.x = new wj6(5, this);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.b;
    }

    @Override // defpackage.j2m0
    public final g2m0 getSavedStateRegistry() {
        return this.a.b;
    }

    @Override // defpackage.rs31
    public final qs31 getViewModelStore() {
        return (qs31) this.w.getValue();
    }
}
