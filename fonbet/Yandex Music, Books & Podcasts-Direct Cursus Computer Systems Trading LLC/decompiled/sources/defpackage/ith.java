package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.media3.session.i;

/* loaded from: classes.dex */
public final class ith extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ith(i iVar, Looper looper) {
        super(looper);
        this.c = iVar;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        i iVar = this.c;
        gvh gvhVar = iVar.g;
        if (message.what != 1) {
            dlh.d(message.what, "Invalid message what=");
            return;
        }
        rdl n = iVar.s.n(iVar.t.n1(), iVar.t.l1(), iVar.s.k);
        iVar.s = n;
        boolean z = this.a;
        boolean z2 = this.b;
        rdl p0 = gvhVar.p0(n);
        g06 g06Var = gvhVar.i;
        yde x = g06Var.x();
        for (int i2 = 0; i2 < x.size(); i2++) {
            wrh wrhVar = (wrh) x.get(i2);
            try {
                ps1 E = g06Var.E(wrhVar);
                if (E != null) {
                    i = E.c();
                } else if (!iVar.i(wrhVar)) {
                    break;
                } else {
                    i = 0;
                }
                d8l d = vwh.d(g06Var.w(wrhVar), iVar.t.f0());
                vrh vrhVar = wrhVar.d;
                vq1.B(vrhVar);
                vrhVar.m(i, p0, d, z, z2);
            } catch (DeadObjectException unused) {
                gvhVar.i.U(wrhVar);
            } catch (RemoteException e) {
                vq1.o0("MediaSessionImpl", "Exception in ".concat(wrhVar.toString()), e);
            }
        }
        this.a = true;
        this.b = true;
    }
}
