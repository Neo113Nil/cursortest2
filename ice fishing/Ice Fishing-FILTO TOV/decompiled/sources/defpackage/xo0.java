package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xo0 {
    public final Object AvO7iQsrTN;
    public final ht0 E7jCp8Ls;
    public final ac1 EljAMC1QTz;
    public final df GWasM1elztuh;
    public ig0 JFJ3QoxA;
    public final boolean OOA6hdeuvCS;
    public final qx X1lG3V04pd;
    public final ye Yi7zF1RB1;
    public final AtomicReference encWxUiV2 = new AtomicReference(zo0.AvO7iQsrTN);
    public long mOu10nynGul = z50.XnEVoBF0td1l();
    public final au0 rQPn8YBR;
    public final lv xqGvceK5x;

    public xo0(df dfVar, ye yeVar, qx qxVar, kg0 kg0Var, lv lvVar, boolean z, ac1 ac1Var, Object obj) {
        this.GWasM1elztuh = dfVar;
        this.Yi7zF1RB1 = yeVar;
        this.X1lG3V04pd = qxVar;
        this.xqGvceK5x = lvVar;
        this.OOA6hdeuvCS = z;
        this.EljAMC1QTz = ac1Var;
        this.AvO7iQsrTN = obj;
        ig0 ig0Var = lx0.GWasM1elztuh;
        ig0Var.getClass();
        this.JFJ3QoxA = ig0Var;
        au0 au0Var = new au0();
        au0Var.AvO7iQsrTN(kg0Var, qxVar.arNh8D4Z5gB());
        this.rQPn8YBR = au0Var;
        this.E7jCp8Ls = new ht0(ac1Var.AvO7iQsrTN);
    }

    public final void GWasM1elztuh() {
        AtomicReference atomicReference = this.encWxUiV2;
        try {
            switch (((zo0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    Yi7zF1RB1();
                    zo0 zo0Var = zo0.JFJ3QoxA;
                    zo0 zo0Var2 = zo0.rQPn8YBR;
                    while (!atomicReference.compareAndSet(zo0Var, zo0Var2)) {
                        if (atomicReference.get() != zo0Var) {
                            tq0.Yi7zF1RB1("Unexpected state change from: " + zo0Var + " to: " + zo0Var2 + '.');
                            return;
                        }
                    }
                    return;
                case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new vc();
            }
        } catch (Exception e) {
            atomicReference.set(zo0.OOA6hdeuvCS);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean OOA6hdeuvCS(l21 l21Var) {
        zo0 zo0Var = zo0.mOu10nynGul;
        AtomicReference atomicReference = this.encWxUiV2;
        try {
            int ordinal = ((zo0) atomicReference.get()).ordinal();
            zo0 zo0Var2 = zo0.encWxUiV2;
            df dfVar = this.GWasM1elztuh;
            ye yeVar = this.Yi7zF1RB1;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    qx qxVar = this.X1lG3V04pd;
                    boolean z = this.OOA6hdeuvCS;
                    if (z) {
                        qxVar.arNh8D4Z5gB = 0;
                        qxVar.WRKkgoJXwDn = true;
                    }
                    try {
                        this.JFJ3QoxA = yeVar.Yi7zF1RB1(dfVar, l21Var, this.xqGvceK5x);
                        zo0 zo0Var3 = zo0.AvO7iQsrTN;
                        while (true) {
                            if (!atomicReference.compareAndSet(zo0Var3, zo0Var2)) {
                                if (atomicReference.get() != zo0Var3) {
                                    tq0.Yi7zF1RB1("Unexpected state change from: " + zo0Var3 + " to: " + zo0Var2 + '.');
                                }
                            }
                        }
                        if (this.JFJ3QoxA.AvO7iQsrTN()) {
                            xqGvceK5x();
                        }
                        return X1lG3V04pd();
                    } finally {
                        if (z) {
                            qxVar.mE4lRynR();
                        }
                    }
                case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                    while (true) {
                        if (!atomicReference.compareAndSet(zo0Var2, zo0Var)) {
                            if (atomicReference.get() != zo0Var2) {
                                tq0.Yi7zF1RB1("Unexpected state change from: " + zo0Var2 + " to: " + zo0Var + '.');
                            }
                        }
                    }
                    long j = this.mOu10nynGul;
                    try {
                        this.mOu10nynGul = z50.XnEVoBF0td1l();
                        this.JFJ3QoxA = yeVar.uFEq9NpZ(dfVar, l21Var, this.JFJ3QoxA);
                        this.mOu10nynGul = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(zo0Var, zo0Var2)) {
                                if (atomicReference.get() != zo0Var) {
                                    tq0.Yi7zF1RB1("Unexpected state change from: " + zo0Var + " to: " + zo0Var2 + '.');
                                }
                            }
                        }
                        if (this.JFJ3QoxA.AvO7iQsrTN()) {
                            xqGvceK5x();
                        }
                        return X1lG3V04pd();
                    } catch (Throwable th) {
                        this.mOu10nynGul = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(zo0Var, zo0Var2)) {
                                if (atomicReference.get() != zo0Var) {
                                    tq0.Yi7zF1RB1("Unexpected state change from: " + zo0Var + " to: " + zo0Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    we.Yi7zF1RB1("Recursive call to resume()");
                    throw new vc();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new vc();
            }
        } catch (Exception e) {
            atomicReference.set(zo0.OOA6hdeuvCS);
            throw e;
        }
    }

    public final boolean X1lG3V04pd() {
        return ((zo0) this.encWxUiV2.get()).compareTo(zo0.JFJ3QoxA) >= 0;
    }

    public final void Yi7zF1RB1() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.AvO7iQsrTN) {
                try {
                    this.E7jCp8Ls.GWasM1elztuh(this.EljAMC1QTz, this.rQPn8YBR);
                    this.rQPn8YBR.X1lG3V04pd();
                    this.rQPn8YBR.xqGvceK5x();
                } finally {
                    this.rQPn8YBR.Yi7zF1RB1();
                    this.GWasM1elztuh.Y6hRI1cF8 = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void xqGvceK5x() {
        zo0 zo0Var;
        zo0 zo0Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.encWxUiV2;
            zo0Var = zo0.encWxUiV2;
            zo0Var2 = zo0.JFJ3QoxA;
            if (atomicReference.compareAndSet(zo0Var, zo0Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != zo0Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        tq0.Yi7zF1RB1("Unexpected state change from: " + zo0Var + " to: " + zo0Var2 + '.');
    }
}
