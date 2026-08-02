package defpackage;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.a;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class tkf0 extends c45 {
    public final ipg A;
    public final vfc0 B;
    public final qmm C;
    public final twy D;
    public final int E;
    public final a F;
    public boolean G = true;
    public long H = -9223372036854775807L;
    public boolean I;
    public boolean J;
    public cj01 K;
    public fe10 L;

    public tkf0(fe10 fe10Var, ipg ipgVar, vfc0 vfc0Var, qmm qmmVar, twy twyVar, int i, a aVar) {
        this.L = fe10Var;
        this.A = ipgVar;
        this.B = vfc0Var;
        this.C = qmmVar;
        this.D = twyVar;
        this.E = i;
        this.F = aVar;
    }

    @Override // defpackage.uf10
    public final boolean canUpdateMediaItem(fe10 fe10Var) {
        zd10 zd10Var = getMediaItem().b;
        zd10Var.getClass();
        zd10 zd10Var2 = fe10Var.b;
        return zd10Var2 != null && zd10Var2.a.equals(zd10Var.a) && zd10Var2.f == zd10Var.f && Objects.equals(zd10Var2.d, zd10Var.d);
    }

    @Override // defpackage.uf10
    public final xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        kpg createDataSource = this.A.createDataSource();
        cj01 cj01Var = this.K;
        if (cj01Var != null) {
            createDataSource.addTransferListener(cj01Var);
        }
        zd10 zd10Var = getMediaItem().b;
        zd10Var.getClass();
        Uri uri = zd10Var.a;
        d6z.z(this.z);
        return new qkf0(uri, createDataSource, new vu6((e5p) this.B.b), this.C, new mmm(this.w.c, 0, sf10Var), this.D, a(sf10Var), this, au1Var, zd10Var.d, this.E, this.F, tw21.W(zd10Var.f), null);
    }

    @Override // defpackage.c45
    public final void e(cj01 cj01Var) {
        this.K = cj01Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        vyc0 vyc0Var = this.z;
        d6z.z(vyc0Var);
        qmm qmmVar = this.C;
        qmmVar.setPlayer(myLooper, vyc0Var);
        qmmVar.prepare();
        h();
    }

    @Override // defpackage.c45
    public final void g() {
        this.C.release();
    }

    @Override // defpackage.uf10
    public final synchronized fe10 getMediaItem() {
        return this.L;
    }

    public final void h() {
        a9z0 rhs0Var = new rhs0(this.H, this.I, this.J, getMediaItem());
        if (this.G) {
            rhs0Var = new rkf0(rhs0Var, 0);
        }
        f(rhs0Var);
    }

    public final void i(long j, f7q0 f7q0Var, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.H;
        }
        boolean c = f7q0Var.c();
        if (!this.G && this.H == j && this.I == c && this.J == z) {
            return;
        }
        this.H = j;
        this.I = c;
        this.J = z;
        this.G = false;
        h();
    }

    @Override // defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        qkf0 qkf0Var = (qkf0) xe10Var;
        if (qkf0Var.Q) {
            for (uyl0 uyl0Var : qkf0Var.N) {
                uyl0Var.h();
                jmm jmmVar = uyl0Var.h;
                if (jmmVar != null) {
                    jmmVar.h(uyl0Var.e);
                    uyl0Var.h = null;
                    uyl0Var.g = null;
                }
            }
        }
        qkf0Var.F.f(qkf0Var);
        qkf0Var.K.removeCallbacksAndMessages(null);
        qkf0Var.L = null;
        qkf0Var.k0 = true;
    }

    @Override // defpackage.uf10
    public final synchronized void updateMediaItem(fe10 fe10Var) {
        this.L = fe10Var;
    }
}
