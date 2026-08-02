package defpackage;

import kotlinx.coroutines.a;
import kotlinx.coroutines.b;

/* loaded from: classes5.dex */
public abstract class rib extends a {
    public static final /* synthetic */ int g = 0;
    public long d;
    public boolean e;
    public zx0 f;

    @Override // kotlinx.coroutines.a
    public final a I0(int i) {
        q5g.B(i);
        return this;
    }

    public final void J0(boolean z) {
        long j = this.d - (z ? 4294967296L : 1L);
        this.d = j;
        if (j <= 0 && this.e) {
            shutdown();
        }
    }

    public final void K0(y98 y98Var) {
        zx0 zx0Var = this.f;
        if (zx0Var == null) {
            zx0Var = new zx0();
            this.f = zx0Var;
        }
        zx0Var.addLast(y98Var);
    }

    public abstract Thread L0();

    public final void M0(boolean z) {
        this.d = (z ? 4294967296L : 1L) + this.d;
        if (z) {
            return;
        }
        this.e = true;
    }

    public abstract long N0();

    public final boolean O0() {
        zx0 zx0Var = this.f;
        if (zx0Var == null) {
            return false;
        }
        y98 y98Var = (y98) (zx0Var.isEmpty() ? null : zx0Var.removeFirst());
        if (y98Var == null) {
            return false;
        }
        y98Var.run();
        return true;
    }

    public void P0(long j, pib pibVar) {
        b.k.U0(j, pibVar);
    }

    public abstract void shutdown();
}
