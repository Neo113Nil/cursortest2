package defpackage;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.exoplayer.upstream.a;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class vnu extends c45 {
    public final jch A;
    public final gyc B;
    public final z8h C;
    public final qmm D;
    public final twy E;
    public final boolean F;
    public final int G;
    public final mch H;
    public final long I;
    public yd10 J;
    public cj01 K;
    public fe10 L;

    static {
        ge10.a("media3.exoplayer.hls");
    }

    public vnu(fe10 fe10Var, gyc gycVar, jch jchVar, z8h z8hVar, qmm qmmVar, twy twyVar, mch mchVar, long j, boolean z, int i) {
        this.L = fe10Var;
        this.J = fe10Var.c;
        this.B = gycVar;
        this.A = jchVar;
        this.C = z8hVar;
        this.D = qmmVar;
        this.E = twyVar;
        this.H = mchVar;
        this.I = j;
        this.F = z;
        this.G = i;
    }

    public static pnu h(long j, List list) {
        pnu pnuVar = null;
        for (int i = 0; i < list.size(); i++) {
            pnu pnuVar2 = (pnu) list.get(i);
            long j2 = pnuVar2.x;
            if (j2 > j || !pnuVar2.E) {
                if (j2 > j) {
                    break;
                }
            } else {
                pnuVar = pnuVar2;
            }
        }
        return pnuVar;
    }

    @Override // defpackage.uf10
    public final boolean canUpdateMediaItem(fe10 fe10Var) {
        fe10 mediaItem = getMediaItem();
        zd10 zd10Var = mediaItem.b;
        zd10Var.getClass();
        zd10 zd10Var2 = fe10Var.b;
        return zd10Var2 != null && zd10Var2.a.equals(zd10Var.a) && zd10Var2.c.equals(zd10Var.c) && Objects.equals(null, null) && mediaItem.c.equals(fe10Var.c);
    }

    @Override // defpackage.uf10
    public final xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        xf10 a = a(sf10Var);
        mmm mmmVar = new mmm(this.w.c, 0, sf10Var);
        cj01 cj01Var = this.K;
        vyc0 vyc0Var = this.z;
        d6z.z(vyc0Var);
        return new mnu(this.A, this.H, this.B, cj01Var, this.D, mmmVar, this.E, a, au1Var, this.C, this.F, this.G, vyc0Var);
    }

    @Override // defpackage.c45
    public final void e(cj01 cj01Var) {
        this.K = cj01Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        vyc0 vyc0Var = this.z;
        d6z.z(vyc0Var);
        qmm qmmVar = this.D;
        qmmVar.setPlayer(myLooper, vyc0Var);
        qmmVar.prepare();
        xf10 a = a(null);
        zd10 zd10Var = getMediaItem().b;
        zd10Var.getClass();
        Uri uri = zd10Var.a;
        mch mchVar = this.H;
        mchVar.getClass();
        mchVar.A = tw21.n(null);
        mchVar.y = a;
        mchVar.B = this;
        mpg mpgVar = new mpg();
        mpgVar.a = uri;
        mpgVar.i = 1;
        hg90 hg90Var = new hg90(((ipg) mchVar.a.a).createDataSource(), mpgVar.a(), 4, mchVar.b.createPlaylistParser());
        d6z.x(mchVar.z == null);
        a aVar = new a("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        mchVar.z = aVar;
        aVar.g(hg90Var, mchVar, mchVar.c.getMinimumLoadableRetryCount(hg90Var.c));
    }

    @Override // defpackage.c45
    public final void g() {
        mch mchVar = this.H;
        mchVar.D = null;
        mchVar.E = null;
        mchVar.C = null;
        mchVar.G = -9223372036854775807L;
        mchVar.z.f(null);
        mchVar.z = null;
        HashMap hashMap = mchVar.w;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((androidx.media3.exoplayer.hls.playlist.a) it.next()).b.f(null);
        }
        mchVar.A.removeCallbacksAndMessages(null);
        mchVar.A = null;
        hashMap.clear();
        this.D.release();
    }

    @Override // defpackage.uf10
    public final synchronized fe10 getMediaItem() {
        return this.L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(unu unuVar) {
        long j;
        rhs0 rhs0Var;
        long j2;
        long j3;
        long j4;
        boolean z = unuVar.p;
        boolean z2 = unuVar.g;
        ImmutableList immutableList = unuVar.r;
        long j5 = unuVar.u;
        long j6 = unuVar.e;
        int i = unuVar.d;
        long j7 = unuVar.h;
        long l0 = z ? tw21.l0(j7) : -9223372036854775807L;
        long j8 = (i == 2 || i == 1) ? l0 : -9223372036854775807L;
        mch mchVar = this.H;
        ynu ynuVar = mchVar.C;
        ynuVar.getClass();
        knu knuVar = new knu(ynuVar, unuVar);
        long j9 = 0;
        if (mchVar.F) {
            tnu tnuVar = unuVar.v;
            long j10 = j7 - mchVar.G;
            boolean z3 = unuVar.o;
            long j11 = z3 ? j10 + j5 : -9223372036854775807L;
            long W = unuVar.p ? tw21.W(tw21.E(this.I)) - (j7 + j5) : 0L;
            long j12 = this.J.a;
            if (j12 != -9223372036854775807L) {
                j3 = tw21.W(j12);
            } else {
                if (j6 != -9223372036854775807L) {
                    j2 = j5 - j6;
                } else {
                    j2 = tnuVar.d;
                    if (j2 == -9223372036854775807L || unuVar.n == -9223372036854775807L) {
                        j2 = tnuVar.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * unuVar.m;
                        }
                    }
                }
                j3 = j2 + W;
            }
            long j13 = j5 + W;
            long j14 = tw21.j(j3, W, j13);
            yd10 yd10Var = getMediaItem().c;
            boolean z4 = yd10Var.d == -3.4028235E38f && yd10Var.e == -3.4028235E38f && tnuVar.c == -9223372036854775807L && tnuVar.d == -9223372036854775807L;
            xd10 xd10Var = new xd10();
            xd10Var.a = tw21.l0(j14);
            xd10Var.d = z4 ? 1.0f : this.J.d;
            xd10Var.e = z4 ? 1.0f : this.J.e;
            yd10 yd10Var2 = new yd10(xd10Var);
            this.J = yd10Var2;
            if (j6 == -9223372036854775807L) {
                j6 = j13 - tw21.W(yd10Var2.a);
            }
            if (z2) {
                j9 = j6;
            } else {
                pnu h = h(j6, unuVar.s);
                if (h != null) {
                    j4 = h.x;
                } else if (!immutableList.isEmpty()) {
                    rnu rnuVar = (rnu) immutableList.get(tw21.c(immutableList, Long.valueOf(j6), true));
                    pnu h2 = h(j6, rnuVar.F);
                    j4 = h2 != null ? h2.x : rnuVar.x;
                }
                j9 = j4;
            }
            rhs0Var = new rhs0(j8, l0, j11, unuVar.u, j10, j9, true, !z3, i == 2 && unuVar.f, knuVar, getMediaItem(), this.J);
        } else {
            if (j6 == -9223372036854775807L || immutableList.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && j6 != j5) {
                    j6 = ((rnu) immutableList.get(tw21.c(immutableList, Long.valueOf(j6), true))).x;
                }
                j = j6;
            }
            long j15 = unuVar.u;
            rhs0Var = new rhs0(j8, l0, j15, j15, 0L, j, true, false, true, knuVar, getMediaItem(), null);
        }
        f(rhs0Var);
    }

    @Override // defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
        mch mchVar = this.H;
        a aVar = mchVar.z;
        if (aVar != null) {
            aVar.b();
        }
        Uri uri = mchVar.D;
        if (uri != null) {
            androidx.media3.exoplayer.hls.playlist.a aVar2 = (androidx.media3.exoplayer.hls.playlist.a) mchVar.w.get(uri);
            aVar2.b.b();
            IOException iOException = aVar2.C;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        mnu mnuVar = (mnu) xe10Var;
        mnuVar.b.x.remove(mnuVar);
        for (hou houVar : mnuVar.M) {
            if (houVar.W) {
                for (gou gouVar : houVar.O) {
                    gouVar.h();
                    jmm jmmVar = gouVar.h;
                    if (jmmVar != null) {
                        jmmVar.h(gouVar.e);
                        gouVar.h = null;
                        gouVar.g = null;
                    }
                }
            }
            inu inuVar = houVar.w;
            androidx.media3.exoplayer.hls.playlist.a aVar = (androidx.media3.exoplayer.hls.playlist.a) inuVar.g.w.get(inuVar.e[inuVar.q.getSelectedIndexInTrackGroup()]);
            if (aVar != null) {
                aVar.D = false;
            }
            inuVar.n = null;
            houVar.C.f(houVar);
            houVar.K.removeCallbacksAndMessages(null);
            houVar.c0 = true;
            houVar.L.clear();
        }
        mnuVar.J = null;
    }

    @Override // defpackage.uf10
    public final synchronized void updateMediaItem(fe10 fe10Var) {
        this.L = fe10Var;
    }
}
