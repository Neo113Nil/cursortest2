package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class km extends u71 {
    public int AvO7iQsrTN;

    public km(int i) {
        super(0L, false);
        this.AvO7iQsrTN = i;
    }

    public abstract Object E7jCp8Ls();

    public Throwable EljAMC1QTz(Object obj) {
        uc ucVar = obj instanceof uc ? (uc) obj : null;
        if (ucVar != null) {
            return ucVar.GWasM1elztuh;
        }
        return null;
    }

    public abstract vg X1lG3V04pd();

    public final void mOu10nynGul(Throwable th) {
        rj0.pog2g9KITJA(X1lG3V04pd().OOA6hdeuvCS(), new th("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.f40) r5.E7jCp8Ls(defpackage.b9xEq24R1.VeqTn1PQw7);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            vg X1lG3V04pd = X1lG3V04pd();
            X1lG3V04pd.getClass();
            im imVar = (im) X1lG3V04pd;
            wg wgVar = imVar.mOu10nynGul;
            Object obj = imVar.rQPn8YBR;
            gh OOA6hdeuvCS = wgVar.OOA6hdeuvCS();
            Object M3K9sHhK = p.M3K9sHhK(OOA6hdeuvCS, obj);
            f40 f40Var = null;
            hc1 qugwajBSa59j = M3K9sHhK != p.EXrPz3p7hFb ? o30.qugwajBSa59j(wgVar, OOA6hdeuvCS, M3K9sHhK) : null;
            try {
                gh OOA6hdeuvCS2 = wgVar.OOA6hdeuvCS();
                Object E7jCp8Ls = E7jCp8Ls();
                Throwable EljAMC1QTz = EljAMC1QTz(E7jCp8Ls);
                if (EljAMC1QTz == null) {
                    int i = this.AvO7iQsrTN;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (f40Var != null && !f40Var.Yi7zF1RB1()) {
                    CancellationException iwATDS1i01k = f40Var.iwATDS1i01k();
                    Yi7zF1RB1(iwATDS1i01k);
                    wgVar.AvO7iQsrTN(o50.rQPn8YBR(iwATDS1i01k));
                } else if (EljAMC1QTz != null) {
                    wgVar.AvO7iQsrTN(new su0(EljAMC1QTz));
                } else {
                    wgVar.AvO7iQsrTN(encWxUiV2(E7jCp8Ls));
                }
                if (qugwajBSa59j != null && !qugwajBSa59j.JB4pnjMK()) {
                    return;
                }
                p.jivtDDk9H(OOA6hdeuvCS, M3K9sHhK);
            } catch (Throwable th) {
                if (qugwajBSa59j == null || qugwajBSa59j.JB4pnjMK()) {
                    p.jivtDDk9H(OOA6hdeuvCS, M3K9sHhK);
                }
                throw th;
            }
        } catch (Throwable th2) {
            mOu10nynGul(th2);
        }
    }

    public void Yi7zF1RB1(CancellationException cancellationException) {
    }

    public Object encWxUiV2(Object obj) {
        return obj;
    }
}
