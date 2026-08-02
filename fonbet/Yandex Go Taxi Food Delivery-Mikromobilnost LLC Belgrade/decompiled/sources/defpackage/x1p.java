package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;

/* loaded from: classes12.dex */
public final class x1p extends Lifecycle implements pey {
    public final t b = new t(this, true);
    public l30 c;

    public x1p(String str) {
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(oey oeyVar) {
        this.b.a(oeyVar);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.b.w;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(oey oeyVar) {
        this.b.d(oeyVar);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.b;
    }
}
