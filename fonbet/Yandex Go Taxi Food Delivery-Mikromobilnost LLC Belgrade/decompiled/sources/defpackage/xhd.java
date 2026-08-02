package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;

/* loaded from: classes10.dex */
public final class xhd implements j2m0 {
    public final t a;
    public final h2m0 b;

    public xhd() {
        t tVar = new t(this, false);
        this.a = tVar;
        h2m0 h2m0Var = new h2m0(new i2m0(this, new csf0(20, this)));
        h2m0Var.a(new Bundle());
        this.b = h2m0Var;
        tVar.i(Lifecycle.State.RESUMED);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.a;
    }

    @Override // defpackage.j2m0
    public final g2m0 getSavedStateRegistry() {
        return this.b.b;
    }
}
