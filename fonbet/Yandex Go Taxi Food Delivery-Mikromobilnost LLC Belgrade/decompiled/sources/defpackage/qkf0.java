package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class qkf0 implements xe10, d5p, oyy, qyy, tyl0 {
    public static final Map l0;
    public static final a m0;
    public final au1 A;
    public final String B;
    public final long C;
    public final a D;
    public final long E;
    public final androidx.media3.exoplayer.upstream.a F;
    public final vu6 G;
    public final cyd H;
    public final lkf0 I;
    public final lkf0 J;
    public final Handler K;
    public we10 L;
    public r5v M;
    public uyl0[] N;
    public pkf0[] O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public kdd0 T;
    public f7q0 U;
    public long V;
    public boolean W;
    public int Z;
    public final Uri a;
    public boolean a0;
    public final kpg b;
    public boolean b0;
    public final qmm c;
    public boolean c0;
    public int d0;
    public boolean e0;
    public long f0;
    public long g0;
    public boolean h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final twy w;
    public final xf10 x;
    public final mmm y;
    public final tkf0 z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        l0 = Collections.unmodifiableMap(hashMap);
        f7s f7sVar = new f7s();
        f7sVar.a = "icy";
        f7sVar.m = eh20.q("application/x-icy");
        m0 = new a(f7sVar);
    }

    public qkf0(Uri uri, kpg kpgVar, vu6 vu6Var, qmm qmmVar, mmm mmmVar, twy twyVar, xf10 xf10Var, tkf0 tkf0Var, au1 au1Var, String str, int i, a aVar, long j, tsi0 tsi0Var) {
        this.a = uri;
        this.b = kpgVar;
        this.c = qmmVar;
        this.y = mmmVar;
        this.w = twyVar;
        this.x = xf10Var;
        this.z = tkf0Var;
        this.A = au1Var;
        this.B = str;
        this.C = i;
        this.D = aVar;
        this.F = tsi0Var != null ? new androidx.media3.exoplayer.upstream.a(tsi0Var) : new androidx.media3.exoplayer.upstream.a("ProgressiveMediaPeriod");
        this.G = vu6Var;
        this.E = j;
        this.H = new cyd();
        this.I = new lkf0(this, 1);
        this.J = new lkf0(this, 2);
        this.K = tw21.n(null);
        this.O = new pkf0[0];
        this.N = new uyl0[0];
        this.g0 = -9223372036854775807L;
        this.Z = 1;
    }

    @Override // defpackage.d5p
    public final void A() {
        this.P = true;
        this.K.post(this.I);
    }

    @Override // defpackage.d5p
    public final g001 B(int i, int i2) {
        return z(new pkf0(i, false));
    }

    public final void C(f7q0 f7q0Var) {
        this.U = this.M == null ? f7q0Var : new qb4(-9223372036854775807L);
        this.V = f7q0Var.k();
        boolean z = !this.e0 && f7q0Var.k() == -9223372036854775807L;
        this.W = z;
        this.Z = z ? 7 : 1;
        if (this.Q) {
            this.z.i(this.V, f7q0Var, z);
        } else {
            v();
        }
    }

    public final void D() {
        nkf0 nkf0Var = new nkf0(this, this.a, this.b, this.G, this, this.H);
        if (this.Q) {
            d6z.x(u());
            long j = this.V;
            if (j != -9223372036854775807L && this.g0 > j) {
                this.j0 = true;
                this.g0 = -9223372036854775807L;
                return;
            }
            f7q0 f7q0Var = this.U;
            f7q0Var.getClass();
            long j2 = f7q0Var.b(this.g0).a.b;
            long j3 = this.g0;
            nkf0Var.z.a = j2;
            nkf0Var.C = j3;
            nkf0Var.B = true;
            nkf0Var.F = false;
            for (uyl0 uyl0Var : this.N) {
                uyl0Var.t = this.g0;
            }
            this.g0 = -9223372036854775807L;
        }
        this.i0 = r();
        this.F.g(nkf0Var, this, this.w.getMinimumLoadableRetryCount(this.Z));
    }

    public final boolean E() {
        return this.b0 || u();
    }

    @Override // defpackage.qyy
    public final void a() {
        for (uyl0 uyl0Var : this.N) {
            uyl0Var.z();
        }
        vu6 vu6Var = this.G;
        b5p b5pVar = vu6Var.b;
        if (b5pVar != null) {
            b5pVar.release();
            vu6Var.b = null;
        }
        vu6Var.c = null;
    }

    @Override // defpackage.tyl0
    public final void b() {
        this.K.post(this.I);
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        q();
        if (!this.U.c()) {
            return 0L;
        }
        e7q0 b = this.U.b(j);
        return g7q0Var.a(j, b.a.a, b.b.a);
    }

    @Override // defpackage.oyy
    public final void d(pyy pyyVar, long j, long j2, boolean z) {
        nkf0 nkf0Var = (nkf0) pyyVar;
        x7u0 x7u0Var = nkf0Var.c;
        long j3 = nkf0Var.a;
        uwy uwyVar = new uwy(nkf0Var.D, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.w.onLoadTaskConcluded(j3);
        this.x.c(uwyVar, 1, -1, null, 0, null, nkf0Var.C, this.V);
        if (z) {
            return;
        }
        for (uyl0 uyl0Var : this.N) {
            uyl0Var.A(false);
        }
        if (this.d0 > 0) {
            we10 we10Var = this.L;
            we10Var.getClass();
            we10Var.onContinueLoadingRequested(this);
        }
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        q();
        boolean[] zArr = (boolean[]) this.T.b;
        if (!this.U.c()) {
            j = 0;
        }
        this.b0 = false;
        boolean z = this.f0 == j;
        this.f0 = j;
        if (u()) {
            this.g0 = j;
            return j;
        }
        int i = this.Z;
        androidx.media3.exoplayer.upstream.a aVar = this.F;
        if (i != 7 && (this.j0 || aVar.d())) {
            int length = this.N.length;
            for (int i2 = 0; i2 < length; i2++) {
                uyl0 uyl0Var = this.N[i2];
                if (uyl0Var.p() != 0 || !z) {
                    if (this.S ? uyl0Var.B(uyl0Var.q) : uyl0Var.C(j, false)) {
                        continue;
                    } else if (!zArr[i2] && this.R) {
                    }
                }
            }
            return j;
        }
        this.h0 = false;
        this.g0 = j;
        this.j0 = false;
        this.c0 = false;
        if (aVar.d()) {
            for (uyl0 uyl0Var2 : this.N) {
                uyl0Var2.h();
            }
            aVar.a();
            return j;
        }
        aVar.c = null;
        for (uyl0 uyl0Var3 : this.N) {
            uyl0Var3.A(false);
        }
        return j;
    }

    @Override // defpackage.xe10
    public final long f() {
        if (this.c0) {
            this.c0 = false;
            return this.f0;
        }
        if (!this.b0) {
            return -9223372036854775807L;
        }
        if (!this.j0 && r() <= this.i0) {
            return -9223372036854775807L;
        }
        this.b0 = false;
        return this.f0;
    }

    @Override // defpackage.urq0
    public final long g() {
        long j;
        boolean z;
        q();
        if (this.j0 || this.d0 == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.g0;
        }
        if (this.R) {
            int length = this.N.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                kdd0 kdd0Var = this.T;
                if (((boolean[]) kdd0Var.b)[i] && ((boolean[]) kdd0Var.c)[i]) {
                    uyl0 uyl0Var = this.N[i];
                    synchronized (uyl0Var) {
                        z = uyl0Var.w;
                    }
                    if (!z) {
                        j = Math.min(j, this.N[i].n());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            j = t(false);
        }
        return j == Long.MIN_VALUE ? this.f0 : j;
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        q();
        return (yzz0) this.T.a;
    }

    @Override // defpackage.urq0
    public final void h(long j) {
    }

    @Override // defpackage.urq0
    public final long i() {
        return g();
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        boolean z;
        if (!this.F.d()) {
            return false;
        }
        cyd cydVar = this.H;
        synchronized (cydVar) {
            z = cydVar.a;
        }
        return z;
    }

    @Override // defpackage.xe10
    public final void j() {
        this.F.e(this.w.getMinimumLoadableRetryCount(this.Z));
        if (this.j0 && !this.Q) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.xe10
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        loo looVar;
        q();
        kdd0 kdd0Var = this.T;
        yzz0 yzz0Var = (yzz0) kdd0Var.a;
        boolean[] zArr3 = (boolean[]) kdd0Var.c;
        int i = this.d0;
        int i2 = 0;
        for (int i3 = 0; i3 < looVarArr.length; i3++) {
            xyl0 xyl0Var = xyl0VarArr[i3];
            if (xyl0Var != null && (looVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((okf0) xyl0Var).a;
                d6z.x(zArr3[i4]);
                this.d0--;
                zArr3[i4] = false;
                xyl0VarArr[i3] = null;
            }
        }
        boolean z = !this.a0 ? j == 0 || this.S : i != 0;
        for (int i5 = 0; i5 < looVarArr.length; i5++) {
            if (xyl0VarArr[i5] == null && (looVar = looVarArr[i5]) != null) {
                d6z.x(looVar.length() == 1);
                d6z.x(looVar.getIndexInTrackGroup(0) == 0);
                int b = yzz0Var.b(looVar.getTrackGroup());
                d6z.x(!zArr3[b]);
                this.d0++;
                zArr3[b] = true;
                this.c0 = looVar.getSelectedFormat().t | this.c0;
                xyl0VarArr[i5] = new okf0(this, b);
                zArr2[i5] = true;
                if (!z) {
                    uyl0 uyl0Var = this.N[b];
                    z = (uyl0Var.p() == 0 || uyl0Var.C(j, true)) ? false : true;
                }
            }
        }
        if (this.d0 == 0) {
            this.h0 = false;
            this.b0 = false;
            this.c0 = false;
            androidx.media3.exoplayer.upstream.a aVar = this.F;
            if (aVar.d()) {
                uyl0[] uyl0VarArr = this.N;
                int length = uyl0VarArr.length;
                while (i2 < length) {
                    uyl0VarArr[i2].h();
                    i2++;
                }
                aVar.a();
            } else {
                this.j0 = false;
                for (uyl0 uyl0Var2 : this.N) {
                    uyl0Var2.A(false);
                }
            }
        } else if (z) {
            j = e(j);
            while (i2 < xyl0VarArr.length) {
                if (xyl0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.a0 = true;
        return j;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        this.L = we10Var;
        a aVar = this.D;
        if (aVar == null) {
            this.H.d();
            D();
        } else {
            B(0, 3).d(aVar);
            C(new frv(-9223372036854775807L, new long[]{0}, new long[]{0}));
            A();
            this.g0 = j;
        }
    }

    @Override // defpackage.oyy
    public final void m(pyy pyyVar, long j, long j2) {
        nkf0 nkf0Var = (nkf0) pyyVar;
        if (this.V == -9223372036854775807L && this.U != null) {
            long t = t(true);
            long j3 = t == Long.MIN_VALUE ? 0L : t + 10000;
            this.V = j3;
            this.z.i(j3, this.U, this.W);
        }
        x7u0 x7u0Var = nkf0Var.c;
        long j4 = nkf0Var.a;
        uwy uwyVar = new uwy(nkf0Var.D, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.w.onLoadTaskConcluded(j4);
        this.x.e(uwyVar, 1, -1, null, 0, null, nkf0Var.C, this.V);
        this.j0 = true;
        we10 we10Var = this.L;
        we10Var.getClass();
        we10Var.onContinueLoadingRequested(this);
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        if (this.j0) {
            return false;
        }
        androidx.media3.exoplayer.upstream.a aVar = this.F;
        if (aVar.c() || this.h0) {
            return false;
        }
        if ((this.Q || this.D != null) && this.d0 == 0) {
            return false;
        }
        boolean d = this.H.d();
        if (aVar.d()) {
            return d;
        }
        D();
        return true;
    }

    @Override // defpackage.oyy
    public final void o(pyy pyyVar, long j, long j2, int i) {
        nkf0 nkf0Var = (nkf0) pyyVar;
        x7u0 x7u0Var = nkf0Var.c;
        this.x.h(i == 0 ? new uwy(nkf0Var.D) : new uwy(nkf0Var.D, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b), 1, -1, null, 0, null, nkf0Var.C, this.V, i);
    }

    @Override // defpackage.oyy
    public final h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        h0n h0nVar;
        f7q0 f7q0Var;
        nkf0 nkf0Var = (nkf0) pyyVar;
        x7u0 x7u0Var = nkf0Var.c;
        uwy uwyVar = new uwy(nkf0Var.D, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        tw21.l0(nkf0Var.C);
        tw21.l0(this.V);
        swy swyVar = new swy(iOException, i);
        twy twyVar = this.w;
        long retryDelayMsFor = twyVar.getRetryDelayMsFor(swyVar);
        if (retryDelayMsFor == -9223372036854775807L) {
            h0nVar = androidx.media3.exoplayer.upstream.a.f;
        } else {
            int r = r();
            int i2 = r > this.i0 ? 1 : 0;
            if (this.e0 || !((f7q0Var = this.U) == null || f7q0Var.k() == -9223372036854775807L)) {
                this.i0 = r;
            } else if (!this.Q || E()) {
                this.b0 = this.Q;
                this.f0 = 0L;
                this.i0 = 0;
                for (uyl0 uyl0Var : this.N) {
                    uyl0Var.A(false);
                }
                nkf0Var.z.a = 0L;
                nkf0Var.C = 0L;
                nkf0Var.B = true;
                nkf0Var.F = false;
            } else {
                this.h0 = true;
                h0nVar = androidx.media3.exoplayer.upstream.a.e;
            }
            h0nVar = new h0n(false, i2, retryDelayMsFor);
        }
        boolean b = h0nVar.b();
        this.x.f(uwyVar, 1, -1, null, 0, null, nkf0Var.C, this.V, iOException, !b);
        if (!b) {
            twyVar.onLoadTaskConcluded(nkf0Var.a);
        }
        return h0nVar;
    }

    public final void q() {
        d6z.x(this.Q);
        this.T.getClass();
        this.U.getClass();
    }

    public final int r() {
        int i = 0;
        for (uyl0 uyl0Var : this.N) {
            i += uyl0Var.q + uyl0Var.p;
        }
        return i;
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        if (this.S) {
            return;
        }
        q();
        if (u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.T.c;
        int length = this.N.length;
        for (int i = 0; i < length; i++) {
            this.N[i].g(j, z, zArr[i]);
        }
    }

    public final long t(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (i < this.N.length) {
            if (!z) {
                kdd0 kdd0Var = this.T;
                kdd0Var.getClass();
                i = ((boolean[]) kdd0Var.c)[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.N[i].n());
        }
        return j;
    }

    public final boolean u() {
        return this.g0 != -9223372036854775807L;
    }

    public final void v() {
        long j;
        if (this.k0 || this.Q || !this.P || this.U == null) {
            return;
        }
        for (uyl0 uyl0Var : this.N) {
            if (uyl0Var.s() == null) {
                return;
            }
        }
        this.H.c();
        int length = this.N.length;
        xzz0[] xzz0VarArr = new xzz0[length];
        boolean[] zArr = new boolean[length];
        int i = 0;
        while (true) {
            j = this.E;
            if (i >= length) {
                break;
            }
            a s = this.N[i].s();
            s.getClass();
            String str = s.n;
            boolean l = eh20.l(str);
            boolean z = l || eh20.p(str);
            zArr[i] = z;
            this.R = z | this.R;
            this.S = j != -9223372036854775807L && length == 1 && eh20.n(str);
            r5v r5vVar = this.M;
            if (r5vVar != null) {
                int i2 = r5vVar.a;
                if (l || this.O[i].b) {
                    w820 w820Var = s.l;
                    w820 w820Var2 = w820Var == null ? new w820(r5vVar) : w820Var.a(r5vVar);
                    f7s a = s.a();
                    a.k = w820Var2;
                    s = new a(a);
                }
                if (l && s.h == -1 && s.i == -1 && i2 != -1) {
                    f7s a2 = s.a();
                    a2.h = i2;
                    s = new a(a2);
                }
            }
            int cryptoType = this.c.getCryptoType(s);
            f7s a3 = s.a();
            a3.L = cryptoType;
            a aVar = new a(a3);
            xzz0VarArr[i] = new xzz0(Integer.toString(i), aVar);
            this.c0 = aVar.t | this.c0;
            i++;
        }
        yzz0 yzz0Var = new yzz0(xzz0VarArr);
        kdd0 kdd0Var = new kdd0();
        kdd0Var.a = yzz0Var;
        kdd0Var.b = zArr;
        int i3 = yzz0Var.a;
        kdd0Var.c = new boolean[i3];
        kdd0Var.d = new boolean[i3];
        this.T = kdd0Var;
        if (this.S && this.V == -9223372036854775807L) {
            this.V = j;
            this.U = new mkf0(this, this.U);
        }
        this.z.i(this.V, this.U, this.W);
        this.Q = true;
        we10 we10Var = this.L;
        we10Var.getClass();
        we10Var.onPrepared(this);
    }

    @Override // defpackage.d5p
    public final void w(f7q0 f7q0Var) {
        this.K.post(new yo90(29, this, f7q0Var));
    }

    public final void x(int i) {
        q();
        kdd0 kdd0Var = this.T;
        boolean[] zArr = (boolean[]) kdd0Var.d;
        if (zArr[i]) {
            return;
        }
        a aVar = ((yzz0) kdd0Var.a).a(i).d[0];
        this.x.b(eh20.i(aVar.n), aVar, 0, null, this.f0);
        zArr[i] = true;
    }

    public final void y(int i) {
        q();
        if (this.h0) {
            if ((!this.R || ((boolean[]) this.T.b)[i]) && !this.N[i].t(false)) {
                this.g0 = 0L;
                this.h0 = false;
                this.b0 = true;
                this.f0 = 0L;
                this.i0 = 0;
                for (uyl0 uyl0Var : this.N) {
                    uyl0Var.A(false);
                }
                we10 we10Var = this.L;
                we10Var.getClass();
                we10Var.onContinueLoadingRequested(this);
            }
        }
    }

    public final g001 z(pkf0 pkf0Var) {
        int length = this.N.length;
        for (int i = 0; i < length; i++) {
            if (pkf0Var.equals(this.O[i])) {
                return this.N[i];
            }
        }
        if (this.P) {
            lk91.j("Extractor added new track (id=" + pkf0Var.a + ") after finishing tracks.");
            return new coj();
        }
        qmm qmmVar = this.c;
        qmmVar.getClass();
        uyl0 uyl0Var = new uyl0(this.A, qmmVar, this.y);
        uyl0Var.f = this;
        int i2 = length + 1;
        pkf0[] pkf0VarArr = (pkf0[]) Arrays.copyOf(this.O, i2);
        pkf0VarArr[length] = pkf0Var;
        int i3 = tw21.a;
        this.O = pkf0VarArr;
        uyl0[] uyl0VarArr = (uyl0[]) Arrays.copyOf(this.N, i2);
        uyl0VarArr[length] = uyl0Var;
        this.N = uyl0VarArr;
        return uyl0Var;
    }
}
