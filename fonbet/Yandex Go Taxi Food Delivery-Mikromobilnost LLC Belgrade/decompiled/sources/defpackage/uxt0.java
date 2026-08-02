package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class uxt0 extends c45 implements oyy {
    public final boolean A;
    public final Uri B;
    public final ipg C;
    public final tis0 D;
    public final z8h E;
    public final qmm F;
    public final twy G;
    public final long H;
    public final xf10 I;
    public final gg90 J;
    public final ArrayList K;
    public kpg L;
    public a M;
    public tyy N;
    public cj01 O;
    public long P;
    public pxt0 Q;
    public Handler R;
    public fe10 S;

    static {
        ge10.a("media3.exoplayer.smoothstreaming");
    }

    public uxt0(fe10 fe10Var, ipg ipgVar, gg90 gg90Var, tis0 tis0Var, z8h z8hVar, qmm qmmVar, twy twyVar, long j) {
        this.S = fe10Var;
        zd10 zd10Var = fe10Var.b;
        zd10Var.getClass();
        Uri uri = zd10Var.a;
        this.Q = null;
        if (uri.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            String path = uri.getPath();
            if (path != null) {
                Matcher matcher = tw21.h.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri = Uri.withAppendedPath(uri, "Manifest");
                }
            }
        }
        this.B = uri;
        this.C = ipgVar;
        this.J = gg90Var;
        this.D = tis0Var;
        this.E = z8hVar;
        this.F = qmmVar;
        this.G = twyVar;
        this.H = j;
        this.I = a(null);
        this.A = false;
        this.K = new ArrayList();
    }

    @Override // defpackage.uf10
    public final boolean canUpdateMediaItem(fe10 fe10Var) {
        zd10 zd10Var = getMediaItem().b;
        zd10Var.getClass();
        zd10 zd10Var2 = fe10Var.b;
        return zd10Var2 != null && zd10Var2.a.equals(zd10Var.a) && zd10Var2.c.equals(zd10Var.c) && Objects.equals(null, null);
    }

    @Override // defpackage.uf10
    public final xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        xf10 a = a(sf10Var);
        mmm mmmVar = new mmm(this.w.c, 0, sf10Var);
        txt0 txt0Var = new txt0(this.Q, this.D, this.O, this.E, this.F, mmmVar, this.G, a, this.N, au1Var);
        this.K.add(txt0Var);
        return txt0Var;
    }

    @Override // defpackage.oyy
    public final void d(pyy pyyVar, long j, long j2, boolean z) {
        hg90 hg90Var = (hg90) pyyVar;
        long j3 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.G.onLoadTaskConcluded(j3);
        this.I.c(uwyVar, hg90Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.c45
    public final void e(cj01 cj01Var) {
        this.O = cj01Var;
        Looper myLooper = Looper.myLooper();
        vyc0 vyc0Var = this.z;
        d6z.z(vyc0Var);
        qmm qmmVar = this.F;
        qmmVar.setPlayer(myLooper, vyc0Var);
        qmmVar.prepare();
        if (this.A) {
            this.N = new syy();
            h();
            return;
        }
        this.L = this.C.createDataSource();
        a aVar = new a("SsMediaSource");
        this.M = aVar;
        this.N = aVar;
        this.R = tw21.n(null);
        i();
    }

    @Override // defpackage.c45
    public final void g() {
        this.Q = this.A ? this.Q : null;
        this.L = null;
        this.P = 0L;
        a aVar = this.M;
        if (aVar != null) {
            aVar.f(null);
            this.M = null;
        }
        Handler handler = this.R;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.R = null;
        }
        this.F.release();
    }

    @Override // defpackage.uf10
    public final synchronized fe10 getMediaItem() {
        return this.S;
    }

    public final void h() {
        rhs0 rhs0Var;
        boolean z;
        oxt0[] oxt0VarArr;
        boolean z2 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i >= arrayList.size()) {
                break;
            }
            txt0 txt0Var = (txt0) arrayList.get(i);
            pxt0 pxt0Var = this.Q;
            txt0Var.E = pxt0Var;
            for (tsb tsbVar : txt0Var.F) {
                tkh tkhVar = (tkh) tsbVar.x;
                oxt0[] oxt0VarArr2 = tkhVar.f.f;
                int i2 = tkhVar.b;
                oxt0 oxt0Var = oxt0VarArr2[i2];
                int i3 = oxt0Var.k;
                long[] jArr = oxt0Var.o;
                oxt0 oxt0Var2 = pxt0Var.f[i2];
                if (i3 == 0 || oxt0Var2.k == 0) {
                    tkhVar.g += i3;
                } else {
                    int i4 = i3 - 1;
                    long c = oxt0Var.c(i4) + jArr[i4];
                    long j = oxt0Var2.o[0];
                    int i5 = tkhVar.g;
                    if (c <= j) {
                        tkhVar.g = i5 + i3;
                    } else {
                        tkhVar.g = tw21.e(jArr, j, true) + i5;
                    }
                }
                tkhVar.f = pxt0Var;
            }
            we10 we10Var = txt0Var.D;
            we10Var.getClass();
            we10Var.onContinueLoadingRequested(txt0Var);
            i++;
        }
        oxt0[] oxt0VarArr3 = this.Q.f;
        int length = oxt0VarArr3.length;
        long j2 = Long.MIN_VALUE;
        int i6 = 0;
        long j3 = Long.MAX_VALUE;
        while (i6 < length) {
            oxt0 oxt0Var3 = oxt0VarArr3[i6];
            int i7 = oxt0Var3.k;
            long[] jArr2 = oxt0Var3.o;
            if (i7 > 0) {
                z = z2;
                oxt0VarArr = oxt0VarArr3;
                j3 = Math.min(j3, jArr2[z ? 1 : 0]);
                int i8 = oxt0Var3.k - 1;
                j2 = Math.max(j2, oxt0Var3.c(i8) + jArr2[i8]);
            } else {
                z = z2;
                oxt0VarArr = oxt0VarArr3;
            }
            i6++;
            z2 = z;
            oxt0VarArr3 = oxt0VarArr;
        }
        pxt0 pxt0Var2 = this.Q;
        if (j3 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            long j4 = pxt0Var2.d ? -9223372036854775807L : 0L;
            pxt0 pxt0Var3 = this.Q;
            boolean z3 = pxt0Var3.d;
            rhs0Var = new rhs0(j4, 0L, 0L, 0L, true, z3, z3, pxt0Var3, getMediaItem());
        } else if (pxt0Var2.d) {
            long j5 = pxt0Var2.h;
            if (j5 != -9223372036854775807L && j5 > 0) {
                j3 = Math.max(j3, j2 - j5);
            }
            long j6 = j3;
            long j7 = j2 - j6;
            long W = j7 - tw21.W(this.H);
            if (W < 5000000) {
                W = Math.min(5000000L, j7 / 2);
            }
            rhs0Var = new rhs0(-9223372036854775807L, j7, j6, W, true, true, true, this.Q, getMediaItem());
        } else {
            long j8 = pxt0Var2.g;
            if (j8 == -9223372036854775807L) {
                j8 = j2 - j3;
            }
            long j9 = j8;
            long j10 = j3;
            rhs0Var = new rhs0(-9223372036854775807L, -9223372036854775807L, j10 + j9, j9, j10, 0L, true, false, false, this.Q, getMediaItem(), null);
        }
        f(rhs0Var);
    }

    public final void i() {
        if (this.M.c()) {
            return;
        }
        mpg mpgVar = new mpg();
        mpgVar.a = this.B;
        mpgVar.i = 1;
        hg90 hg90Var = new hg90(this.L, mpgVar.a(), 4, this.J);
        this.M.g(hg90Var, this, this.G.getMinimumLoadableRetryCount(hg90Var.c));
    }

    @Override // defpackage.oyy
    public final void m(pyy pyyVar, long j, long j2) {
        hg90 hg90Var = (hg90) pyyVar;
        long j3 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.G.onLoadTaskConcluded(j3);
        this.I.d(uwyVar, hg90Var.c);
        this.Q = (pxt0) hg90Var.y;
        this.P = j - j2;
        h();
        if (this.Q.d) {
            this.R.postDelayed(new m8t0(18, this), Math.max(0L, (this.P + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
        this.N.b();
    }

    @Override // defpackage.oyy
    public final void o(pyy pyyVar, long j, long j2, int i) {
        uwy uwyVar;
        hg90 hg90Var = (hg90) pyyVar;
        if (i == 0) {
            long j3 = hg90Var.a;
            uwyVar = new uwy(hg90Var.b);
        } else {
            long j4 = hg90Var.a;
            npg npgVar = hg90Var.b;
            x7u0 x7u0Var = hg90Var.w;
            uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        }
        this.I.h(uwyVar, hg90Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.oyy
    public final h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        hg90 hg90Var = (hg90) pyyVar;
        long j3 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        int i2 = hg90Var.c;
        swy swyVar = new swy(iOException, i);
        twy twyVar = this.G;
        long retryDelayMsFor = twyVar.getRetryDelayMsFor(swyVar);
        h0n h0nVar = retryDelayMsFor == -9223372036854775807L ? a.f : new h0n(false, 0, retryDelayMsFor);
        boolean b = h0nVar.b();
        this.I.g(uwyVar, i2, iOException, !b);
        if (!b) {
            twyVar.onLoadTaskConcluded(hg90Var.a);
        }
        return h0nVar;
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        txt0 txt0Var = (txt0) xe10Var;
        for (tsb tsbVar : txt0Var.F) {
            tsbVar.z(null);
        }
        txt0Var.D = null;
        this.K.remove(xe10Var);
    }

    @Override // defpackage.uf10
    public final synchronized void updateMediaItem(fe10 fe10Var) {
        this.S = fe10Var;
    }
}
