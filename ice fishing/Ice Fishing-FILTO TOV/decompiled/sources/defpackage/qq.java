package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class qq extends ih {
    public static final /* synthetic */ int JFJ3QoxA = 0;
    public long AvO7iQsrTN;
    public boolean encWxUiV2;
    public v4 mOu10nynGul;

    public final void JFJ3QoxA(boolean z) {
        long j = this.AvO7iQsrTN - (z ? 4294967296L : 1L);
        this.AvO7iQsrTN = j;
        if (j <= 0 && this.encWxUiV2) {
            shutdown();
        }
    }

    public final void XnEVoBF0td1l(boolean z) {
        this.AvO7iQsrTN = (z ? 4294967296L : 1L) + this.AvO7iQsrTN;
        if (z) {
            return;
        }
        this.encWxUiV2 = true;
    }

    public abstract long YmKjaVtbfp5Z();

    public final boolean mE4lRynR() {
        v4 v4Var = this.mOu10nynGul;
        if (v4Var == null) {
            return false;
        }
        km kmVar = (km) (v4Var.isEmpty() ? null : v4Var.removeFirst());
        if (kmVar == null) {
            return false;
        }
        kmVar.run();
        return true;
    }

    public final void rQPn8YBR(km kmVar) {
        v4 v4Var = this.mOu10nynGul;
        if (v4Var == null) {
            v4Var = new v4();
            this.mOu10nynGul = v4Var;
        }
        v4Var.addLast(kmVar);
    }

    public abstract void shutdown();
}
