package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dz extends ih implements wk {
    public final Handler AvO7iQsrTN;
    public final dz JFJ3QoxA;
    public final String encWxUiV2;
    public final boolean mOu10nynGul;

    public dz(Handler handler, String str, boolean z) {
        this.AvO7iQsrTN = handler;
        this.encWxUiV2 = str;
        this.mOu10nynGul = z;
        this.JFJ3QoxA = z ? this : new dz(handler, str, true);
    }

    @Override // defpackage.ih
    public final boolean EljAMC1QTz(gh ghVar) {
        return (this.mOu10nynGul && o30.rQPn8YBR(Looper.myLooper(), this.AvO7iQsrTN.getLooper())) ? false : true;
    }

    public final void JFJ3QoxA(gh ghVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        f40 f40Var = (f40) ghVar.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
        if (f40Var != null) {
            f40Var.GWasM1elztuh(cancellationException);
        }
        pk pkVar = mm.GWasM1elztuh;
        kk.AvO7iQsrTN.OOA6hdeuvCS(ghVar, runnable);
    }

    @Override // defpackage.ih
    public final void OOA6hdeuvCS(gh ghVar, Runnable runnable) {
        if (this.AvO7iQsrTN.post(runnable)) {
            return;
        }
        JFJ3QoxA(ghVar, runnable);
    }

    @Override // defpackage.wk
    public final um X1lG3V04pd(long j, final r91 r91Var, gh ghVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.AvO7iQsrTN.postDelayed(r91Var, j)) {
            return new um() { // from class: bz
                @Override // defpackage.um
                public final void GWasM1elztuh() {
                    dz.this.AvO7iQsrTN.removeCallbacks(r91Var);
                }
            };
        }
        JFJ3QoxA(ghVar, r91Var);
        return ik0.OOA6hdeuvCS;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        return dzVar.AvO7iQsrTN == this.AvO7iQsrTN && dzVar.mOu10nynGul == this.mOu10nynGul;
    }

    public final int hashCode() {
        return (this.mOu10nynGul ? 1231 : 1237) ^ System.identityHashCode(this.AvO7iQsrTN);
    }

    @Override // defpackage.ih
    public final String toString() {
        dz dzVar;
        String str;
        pk pkVar = mm.GWasM1elztuh;
        dz dzVar2 = cc0.GWasM1elztuh;
        if (this == dzVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dzVar = dzVar2.JFJ3QoxA;
            } catch (UnsupportedOperationException unused) {
                dzVar = null;
            }
            str = this == dzVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.encWxUiV2;
        if (str2 == null) {
            str2 = this.AvO7iQsrTN.toString();
        }
        if (!this.mOu10nynGul) {
            return str2;
        }
        return str2 + ".immediate";
    }

    @Override // defpackage.wk
    public final void xqGvceK5x(long j, n9 n9Var) {
        cz czVar = new cz(n9Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.AvO7iQsrTN.postDelayed(czVar, j)) {
            n9Var.WdrkLMV3xh(new X1lG3V04pd(9, this, czVar));
        } else {
            JFJ3QoxA(n9Var.mOu10nynGul, czVar);
        }
    }

    public dz(Handler handler) {
        this(handler, null, false);
    }
}
