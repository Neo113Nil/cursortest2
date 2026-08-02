package defpackage;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.exoplayer.source.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xvm extends js2 {
    public final va7 h;
    public final uvg i;
    public final gra j;
    public final xeg k;
    public final int l;
    public final dsc m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public t6t r;
    public onh s;

    public xvm(onh onhVar, va7 va7Var, uvg uvgVar, gra graVar, xeg xegVar, int i, dsc dscVar) {
        this.s = onhVar;
        this.h = va7Var;
        this.i = uvgVar;
        this.j = graVar;
        this.k = xegVar;
        this.l = i;
        this.m = dscVar;
    }

    public final void A() {
        sis bVar = new b(this.o, this.p, this.q, f());
        if (this.n) {
            bVar = new vvm(bVar, 0);
        }
        y(bVar);
    }

    public final void B(long j, fap fapVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean g = fapVar.g();
        if (!this.n && this.o == j && this.p == g && this.q == z) {
            return;
        }
        this.o = j;
        this.p = g;
        this.q = z;
        this.n = false;
        A();
    }

    @Override // defpackage.wvh
    public final boolean a(onh onhVar) {
        gnh gnhVar = f().b;
        gnhVar.getClass();
        gnh gnhVar2 = onhVar.b;
        return gnhVar2 != null && gnhVar2.a.equals(gnhVar.a) && gnhVar2.h == gnhVar.h && Objects.equals(gnhVar2.f, gnhVar.f);
    }

    @Override // defpackage.wvh
    public final synchronized onh f() {
        return this.s;
    }

    @Override // defpackage.wvh
    public final synchronized void i(onh onhVar) {
        this.s = onhVar;
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        db7 a = this.h.a();
        t6t t6tVar = this.r;
        if (t6tVar != null) {
            a.q(t6tVar);
        }
        gnh gnhVar = f().b;
        gnhVar.getClass();
        Uri uri = gnhVar.a;
        vq1.B(this.g);
        return new uvm(uri, a, new nsh((u2c) this.i.b), this.j, new cra(this.d.c, 0, uvhVar), this.k, t(uvhVar), this, zi7Var, gnhVar.f, this.l, this.m, dvt.Y(gnhVar.h), null);
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        uvm uvmVar = (uvm) wohVar;
        if (uvmVar.x) {
            for (zno znoVar : uvmVar.u) {
                znoVar.h();
                zqa zqaVar = znoVar.h;
                if (zqaVar != null) {
                    zqaVar.x(znoVar.e);
                    znoVar.h = null;
                    znoVar.g = null;
                }
            }
        }
        uvmVar.m.P(uvmVar);
        uvmVar.r.removeCallbacksAndMessages(null);
        uvmVar.s = null;
        uvmVar.v0 = true;
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        this.r = t6tVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        ndl ndlVar = this.g;
        vq1.B(ndlVar);
        gra graVar = this.j;
        graVar.s(myLooper, ndlVar);
        graVar.q();
        A();
    }

    @Override // defpackage.js2
    public final void z() {
        this.j.a();
    }

    @Override // defpackage.wvh
    public final void p() {
    }
}
