package defpackage;

/* loaded from: classes.dex */
public abstract class hu extends defpackage.nj {
    public static final /* synthetic */ int SH1y5HwkJhh = 0;
    public long AARZUJiTa;
    public boolean EXtogiMhuM;
    public defpackage.l6 riuEU0zW4;

    public abstract long XZx205DYe();

    public final boolean mAr5m2L7gYDP() {
        defpackage.l6 l6Var = this.riuEU0zW4;
        if (l6Var == null) {
            return false;
        }
        defpackage.yp ypVar = (defpackage.yp) (l6Var.isEmpty() ? null : l6Var.removeFirst());
        if (ypVar == null) {
            return false;
        }
        ypVar.run();
        return true;
    }

    public final void p4kuH6PDtgom(boolean z) {
        long j = this.AARZUJiTa - (z ? 4294967296L : 1L);
        this.AARZUJiTa = j;
        if (j <= 0 && this.EXtogiMhuM) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final void wll2JLbTBC2(boolean z) {
        this.AARZUJiTa = (z ? 4294967296L : 1L) + this.AARZUJiTa;
        if (z) {
            return;
        }
        this.EXtogiMhuM = true;
    }

    public final void yIx6ChFVk(defpackage.yp ypVar) {
        defpackage.l6 l6Var = this.riuEU0zW4;
        if (l6Var == null) {
            l6Var = new defpackage.l6();
            this.riuEU0zW4 = l6Var;
        }
        l6Var.addLast(ypVar);
    }
}
