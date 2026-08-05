package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class em extends n9 implements ub {
    public final em P7K7Inc8;
    public final boolean VgvYg0wo;
    public final Handler wxUZMvaN;

    public em(Handler handler, boolean z) {
        this.wxUZMvaN = handler;
        this.VgvYg0wo = z;
        this.P7K7Inc8 = z ? this : new em(handler, true);
    }

    public final void DK9slbsy(l9 l9Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        vn vnVar = (vn) l9Var.OnDfzHZD(re.VgvYg0wo);
        if (vnVar != null) {
            vnVar.b2ZJblxo(cancellationException);
        }
        hb hbVar = ed.qoPGr6Ce;
        xa.wxUZMvaN.RXQxj5Oe(l9Var, runnable);
    }

    @Override // defpackage.ub
    public final void P7K7Inc8(long j, m3 m3Var) {
        int i = 0;
        XrPeKzBk xrPeKzBk = new XrPeKzBk(m3Var, this, 6, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (!this.wxUZMvaN.postDelayed(xrPeKzBk, j)) {
            DK9slbsy(m3Var.P7K7Inc8, xrPeKzBk);
        } else {
            m3Var.FySoLYna(new i3(1, new cm(this, i, xrPeKzBk)));
        }
    }

    @Override // defpackage.n9
    public final void RXQxj5Oe(l9 l9Var, Runnable runnable) {
        if (this.wxUZMvaN.post(runnable)) {
            return;
        }
        DK9slbsy(l9Var, runnable);
    }

    @Override // defpackage.ub
    public final kd VgvYg0wo(long j, final pc0 pc0Var, l9 l9Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.wxUZMvaN.postDelayed(pc0Var, j)) {
            return new kd() { // from class: dm
                @Override // defpackage.kd
                public final void qoPGr6Ce() {
                    em.this.wxUZMvaN.removeCallbacks(pc0Var);
                }
            };
        }
        DK9slbsy(l9Var, pc0Var);
        return hw.NCTxEWno;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        return emVar.wxUZMvaN == this.wxUZMvaN && emVar.VgvYg0wo == this.VgvYg0wo;
    }

    @Override // defpackage.n9
    public final boolean gjV1z5T1(l9 l9Var) {
        return (this.VgvYg0wo && fn.qoPGr6Ce(Looper.myLooper(), this.wxUZMvaN.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return (this.VgvYg0wo ? 1231 : 1237) ^ System.identityHashCode(this.wxUZMvaN);
    }

    @Override // defpackage.n9
    public final String toString() {
        em emVar;
        String str;
        hb hbVar = ed.qoPGr6Ce;
        em emVar2 = qq.qoPGr6Ce;
        if (this == emVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                emVar = emVar2.P7K7Inc8;
            } catch (UnsupportedOperationException unused) {
                emVar = null;
            }
            str = this == emVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.wxUZMvaN.toString();
        if (!this.VgvYg0wo) {
            return handler;
        }
        return handler + ".immediate";
    }
}
