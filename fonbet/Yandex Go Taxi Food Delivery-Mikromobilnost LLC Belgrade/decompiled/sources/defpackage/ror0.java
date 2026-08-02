package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes8.dex */
public final class ror0 implements vw60 {
    public final Lifecycle a;
    public final h3y b;

    public ror0(Lifecycle lifecycle, h3y h3yVar) {
        this.a = lifecycle;
        this.b = h3yVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        cey.b(this.a, Lifecycle.Event.ON_DESTROY, new ymp0(2, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SharedPaymentsActivityListener";
    }
}
