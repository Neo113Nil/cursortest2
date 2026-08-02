package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class uvm implements woh, t2c, hgg, kgg, yno {
    public static final Map w0;
    public static final dsc x0;
    public xdh A;
    public fap B;
    public long C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public boolean X;
    public int Y;
    public boolean Z;
    public final Uri a;
    public final db7 b;
    public final gra c;
    public final xeg d;
    public final x0 e;
    public final cra f;
    public final xvm g;
    public final zi7 h;
    public final String i;
    public final long j;
    public final dsc k;
    public final long l;
    public final osh m;
    public final nsh n;
    public final n20 o;
    public final pvm p;
    public final pvm q;
    public final Handler r;
    public voh s;
    public lae t;
    public zno[] u;
    public tvm[] v;
    public boolean v0;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        w0 = Collections.unmodifiableMap(hashMap);
        bsc bscVar = new bsc();
        bscVar.a = "icy";
        bscVar.m = l5i.p("application/x-icy");
        x0 = new dsc(bscVar);
    }

    public uvm(Uri uri, db7 db7Var, nsh nshVar, gra graVar, cra craVar, xeg xegVar, x0 x0Var, xvm xvmVar, zi7 zi7Var, String str, int i, dsc dscVar, long j, z7h z7hVar) {
        this.a = uri;
        this.b = db7Var;
        this.c = graVar;
        this.f = craVar;
        this.d = xegVar;
        this.e = x0Var;
        this.g = xvmVar;
        this.h = zi7Var;
        this.i = str;
        this.j = i;
        this.k = dscVar;
        this.m = z7hVar != null ? new osh(z7hVar) : new osh("ProgressiveMediaPeriod");
        this.n = nshVar;
        this.l = j;
        this.o = new n20();
        this.p = new pvm(this, 1);
        this.q = new pvm(this, 2);
        this.r = dvt.p(null);
        this.v = new tvm[0];
        this.u = new zno[0];
        this.L = -9223372036854775807L;
        this.E = 1;
    }

    public final azs A(tvm tvmVar) {
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            if (tvmVar.equals(this.v[i])) {
                return this.u[i];
            }
        }
        if (this.w) {
            vq1.n0("ProgressiveMediaPeriod", "Extractor added new track (id=" + tvmVar.a + ") after finishing tracks.");
            return new z48();
        }
        gra graVar = this.c;
        graVar.getClass();
        zno znoVar = new zno(this.h, graVar, this.f);
        znoVar.f = this;
        int i2 = length + 1;
        tvm[] tvmVarArr = (tvm[]) Arrays.copyOf(this.v, i2);
        tvmVarArr[length] = tvmVar;
        int i3 = dvt.a;
        this.v = tvmVarArr;
        zno[] znoVarArr = (zno[]) Arrays.copyOf(this.u, i2);
        znoVarArr[length] = znoVar;
        this.u = znoVarArr;
        return znoVar;
    }

    public final void B(fap fapVar) {
        this.B = this.t == null ? fapVar : new zg2(-9223372036854775807L);
        this.C = fapVar.k();
        boolean z = !this.J && fapVar.k() == -9223372036854775807L;
        this.D = z;
        this.E = z ? 7 : 1;
        if (this.x) {
            this.g.B(this.C, fapVar, z);
        } else {
            x();
        }
    }

    public final void C() {
        rvm rvmVar = new rvm(this, this.a, this.b, this.n, this, this.o);
        if (this.x) {
            vq1.A(w());
            long j = this.C;
            if (j != -9223372036854775807L && this.L > j) {
                this.Z = true;
                this.L = -9223372036854775807L;
                return;
            }
            fap fapVar = this.B;
            fapVar.getClass();
            long j2 = fapVar.e(this.L).a.b;
            long j3 = this.L;
            rvmVar.f.a = j2;
            rvmVar.i = j3;
            rvmVar.h = true;
            rvmVar.l = false;
            for (zno znoVar : this.u) {
                znoVar.t = this.L;
            }
            this.L = -9223372036854775807L;
        }
        this.Y = q();
        this.m.X(rvmVar, this, this.d.r(this.E));
    }

    public final boolean D() {
        return this.G || w();
    }

    @Override // defpackage.t2c
    public final void E(fap fapVar) {
        this.r.post(new zvh(17, this, fapVar));
    }

    @Override // defpackage.t2c
    public final void K() {
        this.w = true;
        this.r.post(this.p);
    }

    @Override // defpackage.t2c
    public final azs M(int i, int i2) {
        return A(new tvm(i, false));
    }

    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        zsb zsbVar;
        p();
        xdh xdhVar = this.A;
        yvs yvsVar = (yvs) xdhVar.a;
        boolean[] zArr3 = (boolean[]) xdhVar.c;
        int i = this.I;
        int i2 = 0;
        for (int i3 = 0; i3 < zsbVarArr.length; i3++) {
            aoo aooVar = aooVarArr[i3];
            if (aooVar != null && (zsbVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((svm) aooVar).a;
                vq1.A(zArr3[i4]);
                this.I--;
                zArr3[i4] = false;
                aooVarArr[i3] = null;
            }
        }
        boolean z = !this.F ? j == 0 || this.z : i != 0;
        for (int i5 = 0; i5 < zsbVarArr.length; i5++) {
            if (aooVarArr[i5] == null && (zsbVar = zsbVarArr[i5]) != null) {
                vq1.A(zsbVar.length() == 1);
                vq1.A(zsbVar.f(0) == 0);
                int b = yvsVar.b(zsbVar.n());
                vq1.A(!zArr3[b]);
                this.I++;
                zArr3[b] = true;
                this.H = zsbVar.s().t | this.H;
                aooVarArr[i5] = new svm(this, b);
                zArr2[i5] = true;
                if (!z) {
                    zno znoVar = this.u[b];
                    z = (znoVar.p() == 0 || znoVar.C(j, true)) ? false : true;
                }
            }
        }
        if (this.I == 0) {
            this.X = false;
            this.G = false;
            this.H = false;
            osh oshVar = this.m;
            if (oshVar.I()) {
                zno[] znoVarArr = this.u;
                int length = znoVarArr.length;
                while (i2 < length) {
                    znoVarArr[i2].h();
                    i2++;
                }
                oshVar.w();
            } else {
                this.Z = false;
                for (zno znoVar2 : this.u) {
                    znoVar2.A(false);
                }
            }
        } else if (z) {
            j = h(j);
            while (i2 < aooVarArr.length) {
                if (aooVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.F = true;
        return j;
    }

    @Override // defpackage.yno
    public final void b() {
        this.r.post(this.p);
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        p();
        if (!this.B.g()) {
            return 0L;
        }
        eap e = this.B.e(j);
        return hapVar.a(j, e.a.a, e.b.a);
    }

    @Override // defpackage.hgg
    public final void d(jgg jggVar, long j, long j2, boolean z) {
        rvm rvmVar = (rvm) jggVar;
        ngr ngrVar = rvmVar.b;
        cfg cfgVar = new cfg(rvmVar.j, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.d.getClass();
        this.e.L(cfgVar, 1, -1, null, 0, null, rvmVar.i, this.C);
        if (z) {
            return;
        }
        for (zno znoVar : this.u) {
            znoVar.A(false);
        }
        if (this.I > 0) {
            voh vohVar = this.s;
            vohVar.getClass();
            vohVar.b(this);
        }
    }

    @Override // defpackage.ahp
    public final long e() {
        return r();
    }

    @Override // defpackage.ahp
    public final boolean f() {
        boolean z;
        if (!this.m.I()) {
            return false;
        }
        n20 n20Var = this.o;
        synchronized (n20Var) {
            z = n20Var.a;
        }
        return z;
    }

    @Override // defpackage.hgg
    public final void g(jgg jggVar, long j, long j2) {
        rvm rvmVar = (rvm) jggVar;
        if (this.C == -9223372036854775807L && this.B != null) {
            long u = u(true);
            long j3 = u == Long.MIN_VALUE ? 0L : u + 10000;
            this.C = j3;
            this.g.B(j3, this.B, this.D);
        }
        ngr ngrVar = rvmVar.b;
        cfg cfgVar = new cfg(rvmVar.j, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.d.getClass();
        this.e.N(cfgVar, 1, -1, null, 0, null, rvmVar.i, this.C);
        this.Z = true;
        voh vohVar = this.s;
        vohVar.getClass();
        vohVar.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r3 != false) goto L49;
     */
    @Override // defpackage.woh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j) {
        p();
        boolean[] zArr = (boolean[]) this.A.b;
        if (!this.B.g()) {
            j = 0;
        }
        this.G = false;
        boolean z = true;
        boolean z2 = this.K == j;
        this.K = j;
        if (w()) {
            this.L = j;
            return j;
        }
        int i = this.E;
        osh oshVar = this.m;
        if (i != 7 && (this.Z || oshVar.I())) {
            int length = this.u.length;
            for (int i2 = 0; i2 < length; i2++) {
                zno znoVar = this.u[i2];
                if (znoVar.p() != 0 || !z2) {
                    if (!(this.z ? znoVar.B(znoVar.q) : znoVar.C(j, false)) && (zArr[i2] || !this.y)) {
                        z = false;
                        break;
                    }
                }
            }
        }
        this.X = false;
        this.L = j;
        this.Z = false;
        this.H = false;
        if (oshVar.I()) {
            for (zno znoVar2 : this.u) {
                znoVar2.h();
            }
            oshVar.w();
            return j;
        }
        oshVar.c = null;
        for (zno znoVar3 : this.u) {
            znoVar3.A(false);
        }
        return j;
    }

    @Override // defpackage.woh
    public final long i() {
        if (this.H) {
            this.H = false;
            return this.K;
        }
        if (!this.G) {
            return -9223372036854775807L;
        }
        if (!this.Z && q() <= this.Y) {
            return -9223372036854775807L;
        }
        this.G = false;
        return this.K;
    }

    @Override // defpackage.kgg
    public final void j() {
        for (zno znoVar : this.u) {
            znoVar.z();
        }
        nsh nshVar = this.n;
        r2c r2cVar = (r2c) nshVar.c;
        if (r2cVar != null) {
            r2cVar.a();
            nshVar.c = null;
        }
        nshVar.d = null;
    }

    @Override // defpackage.woh
    public final void k() {
        int r = this.d.r(this.E);
        osh oshVar = this.m;
        IOException iOException = (IOException) oshVar.c;
        if (iOException != null) {
            throw iOException;
        }
        igg iggVar = (igg) oshVar.b;
        if (iggVar != null) {
            if (r == Integer.MIN_VALUE) {
                r = iggVar.a;
            }
            IOException iOException2 = iggVar.e;
            if (iOException2 != null && iggVar.f > r) {
                throw iOException2;
            }
        }
        if (this.Z && !this.x) {
            throw r7k.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        this.s = vohVar;
        dsc dscVar = this.k;
        if (dscVar == null) {
            this.o.h();
            C();
        } else {
            M(0, 3).d(dscVar);
            B(new wie(-9223372036854775807L, new long[]{0}, new long[]{0}));
            K();
            this.L = j;
        }
    }

    @Override // defpackage.woh
    public final yvs m() {
        p();
        return (yvs) this.A.a;
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        if (this.Z) {
            return false;
        }
        osh oshVar = this.m;
        if (oshVar.H() || this.X) {
            return false;
        }
        if ((this.x || this.k != null) && this.I == 0) {
            return false;
        }
        boolean h = this.o.h();
        if (oshVar.I()) {
            return h;
        }
        C();
        return true;
    }

    @Override // defpackage.hgg
    public final void o(jgg jggVar, long j, long j2, int i) {
        rvm rvmVar = (rvm) jggVar;
        ngr ngrVar = rvmVar.b;
        this.e.R(i == 0 ? new cfg(rvmVar.j) : new cfg(rvmVar.j, ngrVar.c, ngrVar.d, j2, ngrVar.b), 1, -1, null, 0, null, rvmVar.i, this.C, i);
    }

    public final void p() {
        vq1.A(this.x);
        this.A.getClass();
        this.B.getClass();
    }

    public final int q() {
        int i = 0;
        for (zno znoVar : this.u) {
            i += znoVar.q + znoVar.p;
        }
        return i;
    }

    @Override // defpackage.ahp
    public final long r() {
        long j;
        boolean z;
        p();
        if (this.Z || this.I == 0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.L;
        }
        if (this.y) {
            int length = this.u.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                xdh xdhVar = this.A;
                if (((boolean[]) xdhVar.b)[i] && ((boolean[]) xdhVar.c)[i]) {
                    zno znoVar = this.u[i];
                    synchronized (znoVar) {
                        z = znoVar.w;
                    }
                    if (!z) {
                        j = Math.min(j, this.u[i].n());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = u(false);
        }
        return j == Long.MIN_VALUE ? this.K : j;
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        if (this.z) {
            return;
        }
        p();
        if (w()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.A.c;
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            this.u[i].g(j, z, zArr[i]);
        }
    }

    public final long u(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (i < this.u.length) {
            if (!z) {
                xdh xdhVar = this.A;
                xdhVar.getClass();
                i = ((boolean[]) xdhVar.c)[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.u[i].n());
        }
        return j;
    }

    @Override // defpackage.hgg
    public final mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        mdr mdrVar;
        fap fapVar;
        rvm rvmVar = (rvm) jggVar;
        ngr ngrVar = rvmVar.b;
        cfg cfgVar = new cfg(rvmVar.j, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        dvt.m0(rvmVar.i);
        dvt.m0(this.C);
        long C = this.d.C(new j4x(iOException, i, 9));
        if (C == -9223372036854775807L) {
            mdrVar = osh.m;
        } else {
            int q = q();
            int i2 = q > this.Y ? 1 : 0;
            if (this.J || !((fapVar = this.B) == null || fapVar.k() == -9223372036854775807L)) {
                this.Y = q;
            } else if (!this.x || D()) {
                this.G = this.x;
                this.K = 0L;
                this.Y = 0;
                for (zno znoVar : this.u) {
                    znoVar.A(false);
                }
                rvmVar.f.a = 0L;
                rvmVar.i = 0L;
                rvmVar.h = true;
                rvmVar.l = false;
            } else {
                this.X = true;
                mdrVar = osh.l;
            }
            mdrVar = new mdr(i2, C, false);
        }
        this.e.O(cfgVar, 1, -1, null, 0, null, rvmVar.i, this.C, iOException, !mdrVar.b());
        return mdrVar;
    }

    public final boolean w() {
        return this.L != -9223372036854775807L;
    }

    public final void x() {
        long j;
        if (this.v0 || this.x || !this.w || this.B == null) {
            return;
        }
        for (zno znoVar : this.u) {
            if (znoVar.s() == null) {
                return;
            }
        }
        this.o.d();
        int length = this.u.length;
        xvs[] xvsVarArr = new xvs[length];
        boolean[] zArr = new boolean[length];
        int i = 0;
        while (true) {
            j = this.l;
            if (i >= length) {
                break;
            }
            dsc s = this.u[i].s();
            s.getClass();
            String str = s.n;
            boolean k = l5i.k(str);
            boolean z = k || l5i.o(str);
            zArr[i] = z;
            this.y = z | this.y;
            this.z = j != -9223372036854775807L && length == 1 && l5i.m(str);
            lae laeVar = this.t;
            if (laeVar != null) {
                int i2 = laeVar.a;
                if (k || this.v[i].b) {
                    u2i u2iVar = s.l;
                    u2i u2iVar2 = u2iVar == null ? new u2i(laeVar) : u2iVar.a(laeVar);
                    bsc a = s.a();
                    a.k = u2iVar2;
                    s = new dsc(a);
                }
                if (k && s.h == -1 && s.i == -1 && i2 != -1) {
                    bsc a2 = s.a();
                    a2.h = i2;
                    s = new dsc(a2);
                }
            }
            int t = this.c.t(s);
            bsc a3 = s.a();
            a3.L = t;
            dsc dscVar = new dsc(a3);
            xvsVarArr[i] = new xvs(Integer.toString(i), dscVar);
            this.H = dscVar.t | this.H;
            i++;
        }
        this.A = new xdh(new yvs(xvsVarArr), zArr);
        if (this.z && this.C == -9223372036854775807L) {
            this.C = j;
            this.B = new qvm(this, this.B);
        }
        this.g.B(this.C, this.B, this.D);
        this.x = true;
        voh vohVar = this.s;
        vohVar.getClass();
        vohVar.g(this);
    }

    public final void y(int i) {
        p();
        xdh xdhVar = this.A;
        boolean[] zArr = (boolean[]) xdhVar.d;
        if (zArr[i]) {
            return;
        }
        dsc dscVar = ((yvs) xdhVar.a).a(i).d[0];
        this.e.y(l5i.i(dscVar.n), dscVar, 0, null, this.K);
        zArr[i] = true;
    }

    public final void z(int i) {
        p();
        if (this.X) {
            if ((!this.y || ((boolean[]) this.A.b)[i]) && !this.u[i].t(false)) {
                this.L = 0L;
                this.X = false;
                this.G = true;
                this.K = 0L;
                this.Y = 0;
                for (zno znoVar : this.u) {
                    znoVar.A(false);
                }
                voh vohVar = this.s;
                vohVar.getClass();
                vohVar.b(this);
            }
        }
    }

    @Override // defpackage.ahp
    public final void t(long j) {
    }
}
