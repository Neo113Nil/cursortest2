package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes10.dex */
public final class tcs implements kds {
    public final Lifecycle a;
    public final kds b;
    public final pcs c;

    public tcs(Lifecycle lifecycle, kds kdsVar, pcs pcsVar) {
        this.a = lifecycle;
        this.b = kdsVar;
        this.c = pcsVar;
    }

    public final boolean a(Lifecycle.State state) {
        return this.a.b().a(state);
    }

    public final void b() {
        this.a.d(this.c);
    }

    @Override // defpackage.kds
    public final void s(Bundle bundle, String str) {
        this.b.s(bundle, str);
    }
}
