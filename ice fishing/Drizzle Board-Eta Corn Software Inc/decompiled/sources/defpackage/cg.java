package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class cg extends n9 {
    public static final /* synthetic */ int b2ZJblxo = 0;
    public q0 P7K7Inc8;
    public boolean VgvYg0wo;
    public long wxUZMvaN;

    public final void DK9slbsy(boolean z) {
        long j = this.wxUZMvaN - (z ? 4294967296L : 1L);
        this.wxUZMvaN = j;
        if (j <= 0 && this.VgvYg0wo) {
            shutdown();
        }
    }

    public final boolean Mq3SeTnW() {
        q0 q0Var = this.P7K7Inc8;
        if (q0Var == null) {
            return false;
        }
        cd cdVar = (cd) (q0Var.isEmpty() ? null : q0Var.removeFirst());
        if (cdVar == null) {
            return false;
        }
        cdVar.run();
        return true;
    }

    public final void U0LaHZX7(boolean z) {
        this.wxUZMvaN = (z ? 4294967296L : 1L) + this.wxUZMvaN;
        if (z) {
            return;
        }
        this.VgvYg0wo = true;
    }

    public abstract long i7xS8jrb();

    public final void lwWCatUu(cd cdVar) {
        q0 q0Var = this.P7K7Inc8;
        if (q0Var == null) {
            q0Var = new q0();
            this.P7K7Inc8 = q0Var;
        }
        q0Var.addLast(cdVar);
    }

    public abstract void shutdown();
}
