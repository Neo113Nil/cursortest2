package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class ulh implements jkh {
    public TextureView A;
    public c9e C;
    public MediaController D;
    public long E;
    public long F;
    public rdl G;
    public pdl H;
    public Bundle I;
    public final kkh a;
    public final ps1 b;
    public final gmh c;
    public final Context d;
    public final bnp e;
    public final Bundle f;
    public final klh g;
    public final tlh h;
    public final bdg i;
    public final j6e j;
    public final cz0 k;
    public bnp l;
    public rlh m;
    public boolean n;
    public PendingIntent p;
    public yde q;
    public yde r;
    public qsn s;
    public qsn t;
    public d8l v;
    public d8l w;
    public d8l x;
    public Surface y;
    public SurfaceHolder z;
    public rdl o = rdl.F;
    public kmq B = kmq.c;
    public blp u = blp.b;

    /* JADX WARN: Type inference failed for: r4v4, types: [klh] */
    public ulh(Context context, kkh kkhVar, bnp bnpVar, Bundle bundle, Looper looper) {
        qsn qsnVar = qsn.e;
        this.q = qsnVar;
        this.r = qsnVar;
        this.s = qsnVar;
        this.t = qsnVar;
        d8l d8lVar = d8l.b;
        this.v = d8lVar;
        this.w = d8lVar;
        this.x = R0(d8lVar, d8lVar);
        this.i = new bdg(looper, dzr.a, new clh(this, 6));
        this.a = kkhVar;
        vq1.y(bnpVar, "token must not be null");
        this.d = context;
        this.b = new ps1();
        this.c = new gmh(this);
        this.k = new cz0(0);
        this.e = bnpVar;
        this.f = bundle;
        this.g = new IBinder.DeathRecipient() { // from class: klh
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                kkh kkhVar2 = ulh.this.a;
                Objects.requireNonNull(kkhVar2);
                kkhVar2.j1(new dyg(5, kkhVar2));
            }
        };
        this.h = new tlh(this);
        this.I = Bundle.EMPTY;
        this.m = bnpVar.a.getType() == 0 ? null : new rlh(0, this, bundle);
        j6e j6eVar = new j6e();
        j6eVar.b = this;
        j6eVar.a = new Handler(looper, new xcg(1, j6eVar));
        this.j = j6eVar;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
    }

    public static d8l R0(d8l d8lVar, d8l d8lVar2) {
        d8l d = vwh.d(d8lVar, d8lVar2);
        if (d.a(32)) {
            return d;
        }
        bz2 bz2Var = new bz2(11);
        bz2Var.j(d.a);
        bz2Var.i(32);
        return new d8l(bz2Var.q());
    }

    public static pis S0(ArrayList arrayList, ArrayList arrayList2) {
        tde tdeVar = new tde(4);
        tdeVar.c(arrayList);
        qsn f = tdeVar.f();
        tde tdeVar2 = new tde(4);
        tdeVar2.c(arrayList2);
        qsn f2 = tdeVar2.f();
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new pis(f, f2, iArr);
    }

    public static int W0(rdl rdlVar) {
        int i = rdlVar.c.a.b;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static rdl b1(rdl rdlVar, int i, List list, long j, long j2) {
        int size;
        sis sisVar = rdlVar.j;
        tmp tmpVar = rdlVar.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < sisVar.o(); i3++) {
            arrayList.add(sisVar.m(i3, new ris(), 0L));
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            onh onhVar = (onh) list.get(i4);
            ris risVar = new ris();
            risVar.b(0, onhVar, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i4 + i, risVar);
        }
        i1(sisVar, arrayList, arrayList2);
        pis S0 = S0(arrayList, arrayList2);
        if (rdlVar.j.p()) {
            size = 0;
        } else {
            int i5 = tmpVar.a.b;
            i2 = i5 >= i ? list.size() + i5 : i5;
            int i6 = tmpVar.a.e;
            size = i6 >= i ? list.size() + i6 : i6;
        }
        return d1(rdlVar, S0, i2, size, j, j2, 5);
    }

    public static rdl c1(rdl rdlVar, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int i4;
        int i5;
        rdl d1;
        sis sisVar = rdlVar.j;
        boolean z2 = rdlVar.i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < sisVar.o(); i6++) {
            if (i6 < i || i6 >= i2) {
                arrayList.add(sisVar.m(i6, new ris(), 0L));
            }
        }
        i1(sisVar, arrayList, arrayList2);
        pis S0 = S0(arrayList, arrayList2);
        int W0 = W0(rdlVar);
        int i7 = rdlVar.c.a.e;
        ris risVar = new ris();
        boolean z3 = W0 >= i && W0 < i2;
        if (S0.p()) {
            i7 = 0;
            i4 = -1;
            i3 = 1;
        } else {
            if (z3) {
                int i8 = rdlVar.h;
                int o = sisVar.o();
                i4 = W0;
                i3 = 1;
                for (int i9 = 0; i9 < o; i9++) {
                    i4 = sisVar.e(i4, i8, z2);
                    if (i4 == -1) {
                        break;
                    }
                    if (i4 < i || i4 >= i2) {
                        break;
                    }
                }
                i4 = -1;
                if (i4 == -1) {
                    i4 = S0.a(z2);
                } else if (i4 >= i2) {
                    i4 -= i2 - i;
                }
                S0.m(i4, risVar, 0L);
                i5 = risVar.n;
            } else {
                i3 = 1;
                if (W0 >= i2) {
                    i4 = W0 - (i2 - i);
                    if (i7 != -1) {
                        for (int i10 = i; i10 < i2; i10++) {
                            ris risVar2 = new ris();
                            sisVar.n(i10, risVar2);
                            i7 -= (risVar2.o - risVar2.n) + 1;
                        }
                    }
                    i5 = i7;
                } else {
                    i4 = W0;
                }
            }
            i7 = i5;
        }
        if (!z3) {
            d1 = d1(rdlVar, S0, i4, i7, j, j2, 4);
        } else if (i4 == -1) {
            d1 = e1(rdlVar, S0, tmp.k, tmp.l, 4);
        } else if (z) {
            d1 = d1(rdlVar, S0, i4, i7, j, j2, 4);
        } else {
            int i11 = i4;
            ris risVar3 = new ris();
            S0.m(i11, risVar3, 0L);
            long m0 = dvt.m0(risVar3.l);
            long m02 = dvt.m0(risVar3.m);
            g8l g8lVar = new g8l(null, i11, risVar3.c, null, i7, m0, m0, -1, -1);
            d1 = e1(rdlVar, S0, g8lVar, new tmp(g8lVar, false, SystemClock.elapsedRealtime(), m02, m0, vwh.b(m0, m02), 0L, -9223372036854775807L, m02, m0), 4);
        }
        int i12 = d1.y;
        return (i12 == i3 || i12 == 4 || i >= i2 || i2 != sisVar.o() || W0 < i) ? d1 : d1.f(4, null);
    }

    public static rdl d1(rdl rdlVar, pis pisVar, int i, int i2, long j, long j2, int i3) {
        ris risVar = new ris();
        pisVar.m(i, risVar, 0L);
        onh onhVar = risVar.c;
        g8l g8lVar = rdlVar.c.a;
        g8l g8lVar2 = new g8l(null, i, onhVar, null, i2, j, j2, g8lVar.h, g8lVar.i);
        tmp tmpVar = rdlVar.c;
        return e1(rdlVar, pisVar, g8lVar2, new tmp(g8lVar2, tmpVar.b, SystemClock.elapsedRealtime(), tmpVar.d, tmpVar.e, tmpVar.f, tmpVar.g, tmpVar.h, tmpVar.i, tmpVar.j), i3);
    }

    public static rdl e1(rdl rdlVar, sis sisVar, g8l g8lVar, tmp tmpVar, int i) {
        tmp tmpVar2;
        w0t w0tVar;
        e3t e3tVar;
        boolean z;
        hzk hzkVar = rdlVar.a;
        int i2 = rdlVar.b;
        tmp tmpVar3 = rdlVar.c;
        p0l p0lVar = rdlVar.g;
        int i3 = rdlVar.h;
        boolean z2 = rdlVar.i;
        int i4 = rdlVar.k;
        tcu tcuVar = rdlVar.l;
        hoh hohVar = rdlVar.m;
        float f = rdlVar.n;
        dv1 dv1Var = rdlVar.o;
        sv6 sv6Var = rdlVar.p;
        p08 p08Var = rdlVar.q;
        int i5 = rdlVar.r;
        boolean z3 = rdlVar.s;
        boolean z4 = rdlVar.t;
        int i6 = rdlVar.u;
        boolean z5 = rdlVar.v;
        boolean z6 = rdlVar.w;
        int i7 = rdlVar.x;
        int i8 = rdlVar.y;
        hoh hohVar2 = rdlVar.z;
        long j = rdlVar.A;
        long j2 = rdlVar.B;
        long j3 = rdlVar.C;
        e3t e3tVar2 = rdlVar.D;
        w0t w0tVar2 = rdlVar.E;
        g8l g8lVar2 = tmpVar3.a;
        if (sisVar.p()) {
            tmpVar2 = tmpVar;
            w0tVar = w0tVar2;
            e3tVar = e3tVar2;
        } else {
            tmpVar2 = tmpVar;
            w0tVar = w0tVar2;
            e3tVar = e3tVar2;
            if (tmpVar2.a.b >= sisVar.o()) {
                z = false;
                vq1.A(z);
                return new rdl(hzkVar, i2, tmpVar2, g8lVar2, g8lVar, i, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
            }
        }
        z = true;
        vq1.A(z);
        return new rdl(hzkVar, i2, tmpVar2, g8lVar2, g8lVar, i, p0lVar, i3, z2, tcuVar, sisVar, i4, hohVar, f, dv1Var, sv6Var, p08Var, i5, z3, z4, i6, i7, i8, z5, z6, hohVar2, j, j2, j3, e3tVar, w0tVar);
    }

    public static void i1(sis sisVar, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            ris risVar = (ris) arrayList.get(i);
            int i2 = risVar.n;
            int i3 = risVar.o;
            if (i2 == -1 || i3 == -1) {
                risVar.n = arrayList2.size();
                risVar.o = arrayList2.size();
                ois oisVar = new ois();
                oisVar.j(null, null, i, -9223372036854775807L, 0L, lj.f, true);
                arrayList2.add(oisVar);
            } else {
                risVar.n = arrayList2.size();
                risVar.o = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    ois oisVar2 = new ois();
                    sisVar.f(i2, oisVar2, false);
                    oisVar2.c = i;
                    arrayList2.add(oisVar2);
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qsn l1(qsn qsnVar, List list, Bundle bundle, blp blpVar, d8l d8lVar) {
        boolean z;
        if (!list.isEmpty()) {
            return tb5.c(list, blpVar, d8lVar);
        }
        boolean z2 = false;
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            if (!d8lVar.a.a(6, 7)) {
                z = true;
                if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                    if (!d8lVar.a.a(8, 9)) {
                        z2 = true;
                    }
                }
                return tb5.e(qsnVar, z, z2);
            }
        }
        z = false;
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
        }
        return tb5.e(qsnVar, z, z2);
    }

    public static qsn m1(List list, List list2, blp blpVar, d8l d8lVar, Bundle bundle) {
        if (list.isEmpty()) {
            list = tb5.f(list2, d8lVar, bundle);
        }
        return tb5.c(list, blpVar, d8lVar);
    }

    @Override // defpackage.jkh
    public final int A() {
        return this.o.c.f;
    }

    @Override // defpackage.jkh
    public final void A0(List list) {
        if (a1(20)) {
            U0(new hlh(this, list, 1));
            z(list, this.o.j.o());
        }
    }

    @Override // defpackage.jkh
    public final void B() {
        if (a1(6)) {
            U0(new clh(this, 5));
            if (Z0() != -1) {
                n1(Z0(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.jkh
    public final boolean B0() {
        return this.o.s;
    }

    @Override // defpackage.jkh
    public final void C() {
        if (a1(4)) {
            U0(new clh(this, 16));
            n1(W0(this.o), -9223372036854775807L);
        }
    }

    @Override // defpackage.jkh
    public final boolean C0() {
        return this.o.i;
    }

    @Override // defpackage.jkh
    public final void D(int i, boolean z) {
        if (a1(34)) {
            U0(new pj7(this, z, i));
            rdl rdlVar = this.o;
            if (rdlVar.s != z) {
                this.o = rdlVar.c(rdlVar.r, z);
                alh alhVar = new alh(this, z, 0);
                bdg bdgVar = this.i;
                bdgVar.c(30, alhVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final long D0() {
        return this.o.c.j;
    }

    @Override // defpackage.jkh
    public final void E() {
        if (a1(26)) {
            U0(new clh(this, 4));
            rdl rdlVar = this.o;
            int i = rdlVar.r - 1;
            if (i >= rdlVar.q.b) {
                this.o = rdlVar.c(i, rdlVar.s);
                zkh zkhVar = new zkh(this, i, 5);
                bdg bdgVar = this.i;
                bdgVar.c(30, zkhVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final void E0(int i) {
        if (a1(25)) {
            U0(new zkh(this, i, 3));
            rdl rdlVar = this.o;
            p08 p08Var = rdlVar.q;
            if (rdlVar.r == i || p08Var.b > i) {
                return;
            }
            int i2 = p08Var.c;
            if (i2 == 0 || i <= i2) {
                this.o = rdlVar.c(i, rdlVar.s);
                zkh zkhVar = new zkh(this, i, 4);
                bdg bdgVar = this.i;
                bdgVar.c(30, zkhVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final void F(int i) {
        if (a1(34)) {
            U0(new zkh(this, i, 0));
            rdl rdlVar = this.o;
            int i2 = rdlVar.r + 1;
            int i3 = rdlVar.q.c;
            if (i3 == 0 || i2 <= i3) {
                this.o = rdlVar.c(i2, rdlVar.s);
                zkh zkhVar = new zkh(this, i2, 1);
                bdg bdgVar = this.i;
                bdgVar.c(30, zkhVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final void F0() {
        if (a1(12)) {
            U0(new clh(this, 14));
            o1(this.o.B);
        }
    }

    @Override // defpackage.jkh
    public final void G(final int i, final int i2, final List list) {
        if (a1(20)) {
            vq1.v(i >= 0 && i <= i2);
            U0(new qlh() { // from class: ilh
                @Override // defpackage.qlh
                public final void b(c9e c9eVar, int i3) {
                    tde u = yde.u();
                    int i4 = 0;
                    while (true) {
                        List list2 = list;
                        if (i4 >= list2.size()) {
                            break;
                        }
                        u.a(((onh) list2.get(i4)).e(true));
                        i4++;
                    }
                    vk3 vk3Var = new vk3(u.f());
                    ulh ulhVar = ulh.this;
                    bnp bnpVar = ulhVar.l;
                    bnpVar.getClass();
                    int v = bnpVar.a.v();
                    gmh gmhVar = ulhVar.c;
                    int i5 = i;
                    int i6 = i2;
                    if (v >= 2) {
                        c9eVar.k0(gmhVar, i3, i5, i6, vk3Var);
                    } else {
                        c9eVar.r0(gmhVar, i3, i6, vk3Var);
                        c9eVar.v(ulhVar.c, i3, i5, i6);
                    }
                }
            });
            k1(i, i2, list);
        }
    }

    @Override // defpackage.jkh
    public final void G0() {
        if (a1(11)) {
            U0(new clh(this, 17));
            o1(-this.o.A);
        }
    }

    @Override // defpackage.jkh
    public final void H(w0t w0tVar) {
        if (a1(29)) {
            U0(new v13(16, this, w0tVar));
            rdl rdlVar = this.o;
            if (w0tVar != rdlVar.E) {
                this.o = rdlVar.o(w0tVar);
                nrb nrbVar = new nrb(w0tVar, 1);
                bdg bdgVar = this.i;
                bdgVar.c(19, nrbVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final hoh H0() {
        return this.o.z;
    }

    @Override // defpackage.jkh
    public final void I(int i) {
        if (a1(20)) {
            vq1.v(i >= 0);
            U0(new zkh(this, i, 7));
            j1(i, i + 1);
        }
    }

    @Override // defpackage.jkh
    public final void I0(List list) {
        if (a1(20)) {
            U0(new hlh(this, list, 0));
            q1(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.jkh
    public final void J(int i, int i2) {
        if (a1(20)) {
            vq1.v(i >= 0 && i2 >= i);
            U0(new flh(this, i, i2, 1));
            j1(i, i2);
        }
    }

    @Override // defpackage.jkh
    public final long J0() {
        long c = vwh.c(this.o, this.E, this.F, this.a.f);
        this.E = c;
        return c;
    }

    @Override // defpackage.jkh
    public final void K() {
        if (a1(7)) {
            U0(new clh(this, 8));
            sis sisVar = this.o.j;
            if (sisVar.p() || i()) {
                return;
            }
            boolean z = Z0() != -1;
            ris m = sisVar.m(W0(this.o), new ris(), 0L);
            if (m.i && m.a()) {
                if (z) {
                    n1(Z0(), -9223372036854775807L);
                }
            } else if (!z || J0() > this.o.C) {
                n1(W0(this.o), 0L);
            } else {
                n1(Z0(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.jkh
    public final void K0(List list, int i) {
        if (a1(20)) {
            vq1.v(i >= 0);
            U0(new nj7(this, i, list, 2));
            z(list, i);
        }
    }

    @Override // defpackage.jkh
    public final void L(boolean z) {
        if (a1(1)) {
            U0(new alh(this, z, 3));
            r1(z);
        } else if (z) {
            vq1.n0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // defpackage.jkh
    public final long L0() {
        return this.o.A;
    }

    @Override // defpackage.jkh
    public final void M() {
        if (a1(8)) {
            U0(new clh(this, 3));
            if (X0() != -1) {
                n1(X0(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.jkh
    public final blp M0() {
        return this.u;
    }

    @Override // defpackage.jkh
    public final void N(int i) {
        if (a1(34)) {
            U0(new zkh(this, i, 10));
            rdl rdlVar = this.o;
            int i2 = rdlVar.r - 1;
            if (i2 >= rdlVar.q.b) {
                this.o = rdlVar.c(i2, rdlVar.s);
                zkh zkhVar = new zkh(this, i2, 11);
                bdg bdgVar = this.i;
                bdgVar.c(30, zkhVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final yde N0() {
        return this.s;
    }

    @Override // defpackage.jkh
    public final e3t O() {
        return this.o.D;
    }

    @Override // defpackage.jkh
    public final Bundle O0() {
        return this.f;
    }

    @Override // defpackage.jkh
    public final void P(dv1 dv1Var, boolean z) {
        if (a1(35)) {
            U0(new h6c(this, dv1Var, z));
            if (this.o.o.equals(dv1Var)) {
                return;
            }
            this.o = this.o.a(dv1Var);
            rrb rrbVar = new rrb(dv1Var, 1);
            bdg bdgVar = this.i;
            bdgVar.c(20, rrbVar);
            bdgVar.b();
        }
    }

    @Override // defpackage.jkh
    public final lcg P0(alp alpVar) {
        c9e c9eVar;
        Bundle bundle = Bundle.EMPTY;
        v13 v13Var = new v13(this, alpVar);
        vq1.v(alpVar.a == 0);
        if (this.u.a.contains(alpVar)) {
            c9eVar = this.C;
        } else {
            vq1.n0("MCImplBase", "Controller isn't allowed to call custom session command:" + alpVar.b);
            c9eVar = null;
        }
        return T0(c9eVar, v13Var, false);
    }

    @Override // defpackage.jkh
    public final void Q(hoh hohVar) {
        if (a1(19)) {
            U0(new v13(19, this, hohVar));
            if (this.o.m.equals(hohVar)) {
                return;
            }
            this.o = this.o.g(hohVar);
            lrb lrbVar = new lrb(hohVar, 1);
            bdg bdgVar = this.i;
            bdgVar.c(15, lrbVar);
            bdgVar.b();
        }
    }

    public final void Q0() {
        if (a1(27)) {
            X();
            V0(new clh(this, 13));
            f1(0, 0);
        }
    }

    @Override // defpackage.jkh
    public final int R() {
        return this.o.c.a.h;
    }

    @Override // defpackage.jkh
    public final void S(boolean z) {
        if (a1(26)) {
            U0(new alh(this, z, 1));
            rdl rdlVar = this.o;
            if (rdlVar.s != z) {
                this.o = rdlVar.c(rdlVar.r, z);
                alh alhVar = new alh(this, z, 2);
                bdg bdgVar = this.i;
                bdgVar.c(30, alhVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final void T(onh onhVar) {
        if (a1(31)) {
            U0(new v13(17, this, onhVar));
            q1(Collections.singletonList(onhVar), -1, -9223372036854775807L, true);
        }
    }

    public final lcg T0(c9e c9eVar, qlh qlhVar, boolean z) {
        if (c9eVar == null) {
            return leu.S(new ump(-4));
        }
        ump umpVar = new ump(1);
        ps1 ps1Var = this.b;
        chp b = ps1Var.b(umpVar);
        int i = b.h;
        cz0 cz0Var = this.k;
        if (z) {
            cz0Var.add(Integer.valueOf(i));
        }
        try {
            qlhVar.b(c9eVar, i);
            return b;
        } catch (RemoteException e) {
            vq1.o0("MCImplBase", "Cannot connect to the service or the session is gone", e);
            cz0Var.remove(Integer.valueOf(i));
            ps1Var.e(i, new ump(-100));
            return b;
        }
    }

    @Override // defpackage.jkh
    public final int U() {
        return this.o.x;
    }

    public final void U0(qlh qlhVar) {
        j6e j6eVar = this.j;
        Handler handler = (Handler) j6eVar.a;
        if (((ulh) j6eVar.b).C != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        T0(this.C, qlhVar, true);
    }

    @Override // defpackage.jkh
    public final sis V() {
        return this.o.j;
    }

    public final void V0(qlh qlhVar) {
        j6e j6eVar = this.j;
        Handler handler = (Handler) j6eVar.a;
        if (((ulh) j6eVar.b).C != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        lcg T0 = T0(this.C, qlhVar, true);
        try {
            rwf.t(T0);
        } catch (ExecutionException e) {
            wvs.m(e);
        } catch (TimeoutException e2) {
            if (T0 instanceof chp) {
                int i = ((chp) T0).h;
                this.k.remove(Integer.valueOf(i));
                this.b.e(i, new ump(-1));
            }
            vq1.o0("MCImplBase", "Synchronous command takes too long on the session side.", e2);
        }
    }

    @Override // defpackage.jkh
    public final void W(int i, onh onhVar) {
        if (a1(20)) {
            vq1.v(i >= 0);
            U0(new nj7(this, i, onhVar, 3));
            k1(i, i + 1, yde.y(onhVar));
        }
    }

    public final void X() {
        TextureView textureView = this.A;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.A = null;
        }
        SurfaceHolder surfaceHolder = this.z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.h);
            this.z = null;
        }
        if (this.y != null) {
            this.y = null;
        }
    }

    public final int X0() {
        if (this.o.j.p()) {
            return -1;
        }
        rdl rdlVar = this.o;
        sis sisVar = rdlVar.j;
        int W0 = W0(rdlVar);
        rdl rdlVar2 = this.o;
        int i = rdlVar2.h;
        if (i == 1) {
            i = 0;
        }
        return sisVar.e(W0, i, rdlVar2.i);
    }

    @Override // defpackage.jkh
    public final void Y() {
        if (a1(26)) {
            U0(new clh(this, 1));
            rdl rdlVar = this.o;
            int i = rdlVar.r + 1;
            int i2 = rdlVar.q.c;
            if (i2 == 0 || i <= i2) {
                this.o = rdlVar.c(i, rdlVar.s);
                zkh zkhVar = new zkh(this, i, 2);
                bdg bdgVar = this.i;
                bdgVar.c(30, zkhVar);
                bdgVar.b();
            }
        }
    }

    public final mdr Y0(sis sisVar, int i, long j) {
        if (sisVar.p()) {
            return null;
        }
        ris risVar = new ris();
        ois oisVar = new ois();
        if (i == -1 || i >= sisVar.o()) {
            i = sisVar.a(this.o.i);
            j = dvt.m0(sisVar.m(i, risVar, 0L).l);
        }
        long Y = dvt.Y(j);
        vq1.w(i, sisVar.o());
        sisVar.n(i, risVar);
        if (Y == -9223372036854775807L) {
            Y = risVar.l;
            if (Y == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = risVar.n;
        sisVar.f(i2, oisVar, false);
        while (i2 < risVar.o && oisVar.e != Y) {
            int i3 = i2 + 1;
            if (sisVar.f(i3, oisVar, false).e > Y) {
                break;
            }
            i2 = i3;
        }
        sisVar.f(i2, oisVar, false);
        return new mdr(i2, Y - oisVar.e, false);
    }

    @Override // defpackage.jkh
    public final w0t Z() {
        return this.o.E;
    }

    public final int Z0() {
        if (this.o.j.p()) {
            return -1;
        }
        rdl rdlVar = this.o;
        sis sisVar = rdlVar.j;
        int W0 = W0(rdlVar);
        rdl rdlVar2 = this.o;
        int i = rdlVar2.h;
        if (i == 1) {
            i = 0;
        }
        return sisVar.k(W0, i, rdlVar2.i);
    }

    @Override // defpackage.jkh
    public final void a() {
        c9e c9eVar = this.C;
        if (this.n) {
            return;
        }
        this.n = true;
        this.l = null;
        j6e j6eVar = this.j;
        Handler handler = (Handler) j6eVar.a;
        if (handler.hasMessages(1)) {
            try {
                ulh ulhVar = (ulh) j6eVar.b;
                ulhVar.C.I(ulhVar.c);
            } catch (RemoteException unused) {
                vq1.n0("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.C = null;
        if (c9eVar != null) {
            int c = this.b.c();
            try {
                c9eVar.asBinder().unlinkToDeath(this.g, 0);
                c9eVar.v0(this.c, c);
            } catch (RemoteException unused2) {
            }
        }
        this.i.d();
        ps1 ps1Var = this.b;
        dyg dygVar = new dyg(6, this);
        synchronized (ps1Var.c) {
            try {
                Handler p = dvt.p(null);
                ps1Var.f = p;
                ps1Var.e = dygVar;
                if (((xy0) ps1Var.d).isEmpty()) {
                    ps1Var.d();
                } else {
                    p.postDelayed(new bhp(0, ps1Var), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jkh
    public final void a0(final int i, final long j, final List list) {
        if (a1(20)) {
            U0(new qlh() { // from class: glh
                @Override // defpackage.qlh
                public final void b(c9e c9eVar, int i2) {
                    gmh gmhVar = ulh.this.c;
                    tde u = yde.u();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            c9eVar.a0(gmhVar, i2, new vk3(u.f()), i, j);
                            return;
                        } else {
                            u.a(((onh) list2.get(i3)).e(true));
                            i3++;
                        }
                    }
                }
            });
            q1(list, i, j, false);
        }
    }

    public final boolean a1(int i) {
        if (this.x.a(i)) {
            return true;
        }
        dfi.o(i, "Controller isn't allowed to call command= ", "MCImplBase");
        return false;
    }

    @Override // defpackage.jkh
    public final void b() {
        if (a1(1)) {
            U0(new clh(this, 9));
            r1(false);
        }
    }

    @Override // defpackage.jkh
    public final void b0() {
        if (a1(9)) {
            U0(new clh(this, 7));
            sis sisVar = this.o.j;
            if (sisVar.p() || i()) {
                return;
            }
            if (X0() != -1) {
                n1(X0(), -9223372036854775807L);
                return;
            }
            ris m = sisVar.m(W0(this.o), new ris(), 0L);
            if (m.i && m.a()) {
                n1(W0(this.o), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.jkh
    public final int c() {
        return this.o.y;
    }

    @Override // defpackage.jkh
    public final int c0() {
        return this.o.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [c9e] */
    @Override // defpackage.jkh
    public final void connect() {
        z8e z8eVar;
        bnp bnpVar = this.e;
        anp anpVar = bnpVar.a;
        anp anpVar2 = bnpVar.a;
        int type = anpVar.getType();
        kkh kkhVar = this.a;
        Context context = this.d;
        Bundle bundle = this.f;
        if (type == 0) {
            this.m = null;
            Object u = anpVar2.u();
            vq1.B(u);
            IBinder iBinder = (IBinder) u;
            int i = gvh.m;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof c9e)) {
                z8e z8eVar2 = new z8e();
                z8eVar2.a = iBinder;
                z8eVar = z8eVar2;
            } else {
                z8eVar = (c9e) queryLocalInterface;
            }
            int c = this.b.c();
            String packageName = context.getPackageName();
            int myPid = Process.myPid();
            kkhVar.getClass();
            try {
                z8eVar.z0(this.c, c, new g66(packageName, myPid, bundle).b());
                return;
            } catch (RemoteException e) {
                vq1.o0("MCImplBase", "Failed to call connection request.", e);
            }
        } else {
            this.m = new rlh(0, this, bundle);
            int i2 = dvt.a >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(anpVar2.w(), anpVar2.getServiceName());
            if (context.bindService(intent, this.m, i2)) {
                return;
            }
            vq1.n0("MCImplBase", "bind to " + bnpVar + " failed");
        }
        Objects.requireNonNull(kkhVar);
        kkhVar.j1(new dyg(5, kkhVar));
    }

    @Override // defpackage.jkh
    public final void d() {
        MediaController mediaController;
        if (!a1(1)) {
            vq1.n0("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (dvt.a >= 31 && (mediaController = this.D) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        U0(new clh(this, 10));
        r1(true);
    }

    @Override // defpackage.jkh
    public final long d0() {
        return this.o.c.h;
    }

    @Override // defpackage.jkh
    public final boolean e() {
        return this.o.v;
    }

    @Override // defpackage.jkh
    public final void e0(int i, long j) {
        if (a1(10)) {
            vq1.v(i >= 0);
            U0(new aj7(j, this, i));
            n1(i, j);
        }
    }

    @Override // defpackage.jkh
    public final boolean f() {
        return this.o.w;
    }

    @Override // defpackage.jkh
    public final d8l f0() {
        return this.x;
    }

    public final void f1(int i, int i2) {
        kmq kmqVar = this.B;
        if (kmqVar.a == i && kmqVar.b == i2) {
            return;
        }
        this.B = new kmq(i, i2);
        this.i.f(24, new orb(i, i2, 1));
    }

    @Override // defpackage.jkh
    public final int g() {
        return this.o.h;
    }

    @Override // defpackage.jkh
    public final boolean g0() {
        return this.o.t;
    }

    public final void g1(int i, int i2, int i3) {
        int i4;
        int i5;
        sis sisVar = this.o.j;
        int o = sisVar.o();
        int min = Math.min(i2, o);
        int i6 = min - i;
        int min2 = Math.min(i3, o - i6);
        if (i >= o || i == min || i == min2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < o; i7++) {
            arrayList.add(sisVar.m(i7, new ris(), 0L));
        }
        dvt.X(i, min, min2, arrayList);
        i1(sisVar, arrayList, arrayList2);
        pis S0 = S0(arrayList, arrayList2);
        if (S0.p()) {
            return;
        }
        int W0 = W0(this.o);
        if (W0 >= i && W0 < min) {
            i5 = (W0 - i) + min2;
        } else if (min <= W0 && min2 > W0) {
            i5 = W0 - i6;
        } else {
            if (min <= W0 || min2 > W0) {
                i4 = W0;
                ris risVar = new ris();
                int i8 = this.o.c.a.e - sisVar.m(W0, risVar, 0L).n;
                S0.m(i4, risVar, 0L);
                s1(d1(this.o, S0, i4, risVar.n + i8, J0(), s0(), 5), 0, null, null, null);
            }
            i5 = W0 + i6;
        }
        i4 = i5;
        ris risVar2 = new ris();
        int i82 = this.o.c.a.e - sisVar.m(W0, risVar2, 0L).n;
        S0.m(i4, risVar2, 0L);
        s1(d1(this.o, S0, i4, risVar2.n + i82, J0(), s0(), 5), 0, null, null, null);
    }

    @Override // defpackage.jkh
    public final long getDuration() {
        return this.o.c.d;
    }

    @Override // defpackage.jkh
    public final float getVolume() {
        return this.o.n;
    }

    @Override // defpackage.jkh
    public final void h(Surface surface) {
        if (a1(27)) {
            X();
            this.y = surface;
            V0(new jlh(this, surface, 0));
            int i = surface == null ? 0 : -1;
            f1(i, i);
        }
    }

    @Override // defpackage.jkh
    public final void h0(boolean z) {
        if (a1(14)) {
            U0(new alh(this, z, 4));
            rdl rdlVar = this.o;
            if (rdlVar.i != z) {
                this.o = rdlVar.k(z);
                qrb qrbVar = new qrb(2, z);
                bdg bdgVar = this.i;
                bdgVar.c(9, qrbVar);
                bdgVar.b();
            }
        }
    }

    public final void h1(rdl rdlVar, final rdl rdlVar2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        bdg bdgVar = this.i;
        if (num != null) {
            final int i = 0;
            bdgVar.c(0, new ycg() { // from class: llh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i) {
                        case 0:
                            f8lVar.R(rdlVar2.j, num.intValue());
                            break;
                        case 1:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.u(num.intValue(), rdlVar3.d, rdlVar3.e);
                            break;
                        default:
                            f8lVar.G(num.intValue(), rdlVar2.t);
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i2 = 1;
            bdgVar.c(11, new ycg() { // from class: llh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i2) {
                        case 0:
                            f8lVar.R(rdlVar2.j, num3.intValue());
                            break;
                        case 1:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.u(num3.intValue(), rdlVar3.d, rdlVar3.e);
                            break;
                        default:
                            f8lVar.G(num3.intValue(), rdlVar2.t);
                            break;
                    }
                }
            });
        }
        onh s = rdlVar2.s();
        if (num4 != null) {
            bdgVar.c(1, new v13(20, s, num4));
        }
        hzk hzkVar = rdlVar.a;
        hzk hzkVar2 = rdlVar2.a;
        if (hzkVar != hzkVar2 && (hzkVar == null || !hzkVar.a(hzkVar2))) {
            bdgVar.c(10, new nlh(0, hzkVar2));
            if (hzkVar2 != null) {
                bdgVar.c(10, new nlh(1, hzkVar2));
            }
        }
        if (!rdlVar.D.equals(rdlVar2.D)) {
            final int i3 = 17;
            bdgVar.c(2, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i3) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.z.equals(rdlVar2.z)) {
            final int i4 = 18;
            bdgVar.c(14, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i4) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.w != rdlVar2.w) {
            final int i5 = 19;
            bdgVar.c(3, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i5) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.y != rdlVar2.y) {
            final int i6 = 20;
            bdgVar.c(4, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i6) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i7 = 2;
            bdgVar.c(5, new ycg() { // from class: llh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i7) {
                        case 0:
                            f8lVar.R(rdlVar2.j, num2.intValue());
                            break;
                        case 1:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.u(num2.intValue(), rdlVar3.d, rdlVar3.e);
                            break;
                        default:
                            f8lVar.G(num2.intValue(), rdlVar2.t);
                            break;
                    }
                }
            });
        }
        if (rdlVar.x != rdlVar2.x) {
            final int i8 = 0;
            bdgVar.c(6, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i8) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.v != rdlVar2.v) {
            final int i9 = 1;
            bdgVar.c(7, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i9) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.g.equals(rdlVar2.g)) {
            final int i10 = 2;
            bdgVar.c(12, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i10) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.h != rdlVar2.h) {
            final int i11 = 3;
            bdgVar.c(8, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i11) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.i != rdlVar2.i) {
            final int i12 = 4;
            bdgVar.c(9, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i12) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.m.equals(rdlVar2.m)) {
            final int i13 = 5;
            bdgVar.c(15, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i13) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.n != rdlVar2.n) {
            final int i14 = 6;
            bdgVar.c(22, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i14) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.o.equals(rdlVar2.o)) {
            final int i15 = 7;
            bdgVar.c(20, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i15) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.p.a.equals(rdlVar2.p.a)) {
            final int i16 = 8;
            bdgVar.c(27, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i16) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
            final int i17 = 9;
            bdgVar.c(27, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i17) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.q.equals(rdlVar2.q)) {
            final int i18 = 10;
            bdgVar.c(29, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i18) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.r != rdlVar2.r || rdlVar.s != rdlVar2.s) {
            final int i19 = 11;
            bdgVar.c(30, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i19) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.l.equals(rdlVar2.l)) {
            final int i20 = 12;
            bdgVar.c(25, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i20) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.A != rdlVar2.A) {
            final int i21 = 13;
            bdgVar.c(16, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i21) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.B != rdlVar2.B) {
            final int i22 = 14;
            bdgVar.c(17, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i22) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (rdlVar.C != rdlVar2.C) {
            final int i23 = 15;
            bdgVar.c(18, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i23) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.E.equals(rdlVar2.E)) {
            final int i24 = 16;
            bdgVar.c(19, new ycg() { // from class: mlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i24) {
                        case 0:
                            f8lVar.m(rdlVar2.x);
                            break;
                        case 1:
                            f8lVar.X(rdlVar2.v);
                            break;
                        case 2:
                            f8lVar.U(rdlVar2.g);
                            break;
                        case 3:
                            f8lVar.b(rdlVar2.h);
                            break;
                        case 4:
                            f8lVar.q(rdlVar2.i);
                            break;
                        case 5:
                            f8lVar.v(rdlVar2.m);
                            break;
                        case 6:
                            f8lVar.H(rdlVar2.n);
                            break;
                        case 7:
                            f8lVar.D(rdlVar2.o);
                            break;
                        case 8:
                            f8lVar.a(rdlVar2.p.a);
                            break;
                        case 9:
                            f8lVar.l(rdlVar2.p);
                            break;
                        case 10:
                            f8lVar.z(rdlVar2.q);
                            break;
                        case 11:
                            rdl rdlVar3 = rdlVar2;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 12:
                            f8lVar.k(rdlVar2.l);
                            break;
                        case 13:
                            f8lVar.t(rdlVar2.A);
                            break;
                        case 14:
                            f8lVar.Q(rdlVar2.B);
                            break;
                        case 15:
                            f8lVar.W(rdlVar2.C);
                            break;
                        case 16:
                            f8lVar.E(rdlVar2.E);
                            break;
                        case 17:
                            f8lVar.M(rdlVar2.D);
                            break;
                        case 18:
                            f8lVar.P(rdlVar2.z);
                            break;
                        case 19:
                            f8lVar.F(rdlVar2.w);
                            break;
                        default:
                            f8lVar.p(rdlVar2.y);
                            break;
                    }
                }
            });
        }
        bdgVar.b();
    }

    @Override // defpackage.jkh
    public final boolean i() {
        return this.o.c.b;
    }

    @Override // defpackage.jkh
    public final long i0() {
        return this.o.C;
    }

    @Override // defpackage.jkh
    public final boolean isConnected() {
        return this.C != null;
    }

    @Override // defpackage.jkh
    public final void j(SurfaceView surfaceView) {
        if (a1(27)) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            if (a1(27)) {
                if (holder == null) {
                    Q0();
                    return;
                }
                if (this.z == holder) {
                    return;
                }
                X();
                this.z = holder;
                holder.addCallback(this.h);
                Surface surface = holder.getSurface();
                if (surface == null || !surface.isValid()) {
                    this.y = null;
                    V0(new clh(this, 15));
                    f1(0, 0);
                } else {
                    this.y = surface;
                    V0(new jlh(this, surface, 1));
                    Rect surfaceFrame = holder.getSurfaceFrame();
                    f1(surfaceFrame.width(), surfaceFrame.height());
                }
            }
        }
    }

    @Override // defpackage.jkh
    public final void j0(f8l f8lVar) {
        this.i.a(f8lVar);
    }

    public final void j1(int i, int i2) {
        int o = this.o.j.o();
        int min = Math.min(i2, o);
        if (i >= o || i == min || o == 0) {
            return;
        }
        boolean z = W0(this.o) >= i && W0(this.o) < min;
        rdl c1 = c1(this.o, i, min, false, J0(), s0());
        int i3 = this.o.c.a.b;
        s1(c1, 0, null, z ? 4 : null, i3 >= i && i3 < min ? 3 : null);
    }

    @Override // defpackage.jkh
    public final hzk k() {
        return this.o.a;
    }

    @Override // defpackage.jkh
    public final int k0() {
        return this.o.c.a.e;
    }

    public final void k1(int i, int i2, List list) {
        int o = this.o.j.o();
        if (i > o) {
            return;
        }
        if (this.o.j.p()) {
            q1(list, -1, -9223372036854775807L, false);
            return;
        }
        int min = Math.min(i2, o);
        rdl c1 = c1(b1(this.o, min, list, J0(), s0()), i, min, true, J0(), s0());
        int i3 = this.o.c.a.b;
        boolean z = i3 >= i && i3 < min;
        s1(c1, 0, null, z ? 4 : null, z ? 3 : null);
    }

    @Override // defpackage.jkh
    public final sv6 l() {
        return this.o.p;
    }

    @Override // defpackage.jkh
    public final tcu l0() {
        return this.o.l;
    }

    @Override // defpackage.jkh
    public final p0l m() {
        return this.o.g;
    }

    @Override // defpackage.jkh
    public final dv1 m0() {
        return this.o.o;
    }

    @Override // defpackage.jkh
    public final void n(TextureView textureView) {
        if (a1(27)) {
            if (textureView == null) {
                Q0();
                return;
            }
            if (this.A == textureView) {
                return;
            }
            X();
            this.A = textureView;
            textureView.setSurfaceTextureListener(this.h);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                V0(new clh(this, 19));
                f1(0, 0);
            } else {
                this.y = new Surface(surfaceTexture);
                V0(new clh(this, 20));
                f1(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    @Override // defpackage.jkh
    public final p08 n0() {
        return this.o.q;
    }

    public final void n1(int i, long j) {
        int i2;
        int i3;
        rdl rdlVar;
        sis sisVar = this.o.j;
        if ((sisVar.p() || i < sisVar.o()) && !i()) {
            rdl rdlVar2 = this.o;
            rdl f = rdlVar2.f(rdlVar2.y == 1 ? 1 : 2, rdlVar2.a);
            mdr Y0 = Y0(sisVar, i, j);
            if (Y0 == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                g8l g8lVar = new g8l(null, i, null, null, i, j3, j2, -1, -1);
                rdl rdlVar3 = this.o;
                sis sisVar2 = rdlVar3.j;
                boolean z = this.o.c.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                tmp tmpVar = this.o.c;
                rdlVar = e1(rdlVar3, sisVar2, g8lVar, new tmp(g8lVar, z, elapsedRealtime, tmpVar.d, j == -9223372036854775807L ? 0L : j, 0, 0L, tmpVar.h, tmpVar.i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                tmp tmpVar2 = f.c;
                g8l g8lVar2 = tmpVar2.a;
                g8l g8lVar3 = tmpVar2.a;
                int i4 = g8lVar2.e;
                int i5 = Y0.a;
                ois oisVar = new ois();
                sisVar.f(i4, oisVar, false);
                ois oisVar2 = new ois();
                sisVar.f(i5, oisVar2, false);
                boolean z2 = i4 != i5;
                long j4 = Y0.b;
                long Y = dvt.Y(J0()) - oisVar.e;
                if (z2 || j4 != Y) {
                    vq1.A(g8lVar3.h == -1);
                    g8l g8lVar4 = new g8l(null, oisVar.c, g8lVar3.c, null, i4, dvt.m0(oisVar.e + Y), dvt.m0(oisVar.e + Y), -1, -1);
                    sisVar.f(i5, oisVar2, false);
                    ris risVar = new ris();
                    sisVar.n(oisVar2.c, risVar);
                    g8l g8lVar5 = new g8l(null, oisVar2.c, risVar.c, null, i5, dvt.m0(oisVar2.e + j4), dvt.m0(oisVar2.e + j4), -1, -1);
                    rdl h = f.h(1, g8lVar4, g8lVar5);
                    if (z2 || j4 < Y) {
                        f = h.j(new tmp(g8lVar5, false, SystemClock.elapsedRealtime(), dvt.m0(risVar.m), dvt.m0(oisVar2.e + j4), vwh.b(dvt.m0(oisVar2.e + j4), dvt.m0(risVar.m)), 0L, -9223372036854775807L, -9223372036854775807L, dvt.m0(oisVar2.e + j4)));
                    } else {
                        long max = Math.max(0L, dvt.Y(h.c.g) - (j4 - Y));
                        long j5 = j4 + max;
                        f = h.j(new tmp(g8lVar5, false, SystemClock.elapsedRealtime(), dvt.m0(risVar.m), dvt.m0(j5), vwh.b(dvt.m0(j5), dvt.m0(risVar.m)), dvt.m0(max), -9223372036854775807L, -9223372036854775807L, dvt.m0(j5)));
                    }
                }
                rdlVar = f;
            }
            tmp tmpVar3 = rdlVar.c;
            int i6 = (this.o.j.p() || tmpVar3.a.b == this.o.c.a.b) ? 0 : i2;
            if (i6 == 0 && tmpVar3.a.f == this.o.c.a.f) {
                return;
            }
            s1(rdlVar, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    @Override // defpackage.jkh
    public final long o() {
        return this.o.c.i;
    }

    @Override // defpackage.jkh
    public final void o0(int i, int i2) {
        if (a1(33)) {
            U0(new flh(this, i, i2, 2));
            rdl rdlVar = this.o;
            p08 p08Var = rdlVar.q;
            if (rdlVar.r == i || p08Var.b > i) {
                return;
            }
            int i3 = p08Var.c;
            if (i3 == 0 || i <= i3) {
                this.o = rdlVar.c(i, rdlVar.s);
                zkh zkhVar = new zkh(this, i, 8);
                bdg bdgVar = this.i;
                bdgVar.c(30, zkhVar);
                bdgVar.b();
            }
        }
    }

    public final void o1(long j) {
        long J0 = J0() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            J0 = Math.min(J0, duration);
        }
        n1(W0(this.o), Math.max(J0, 0L));
    }

    @Override // defpackage.jkh
    public final void p(TextureView textureView) {
        if (a1(27) && textureView != null && this.A == textureView) {
            Q0();
        }
    }

    @Override // defpackage.jkh
    public final int p0() {
        return this.o.c.a.i;
    }

    public final void p1(int i, lcg lcgVar) {
        lcgVar.a(new e02(this, lcgVar, i, 7), e48.a);
    }

    @Override // defpackage.jkh
    public final void q() {
        if (a1(2)) {
            U0(new clh(this, 18));
            rdl rdlVar = this.o;
            if (rdlVar.y == 1) {
                s1(rdlVar.f(rdlVar.j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // defpackage.jkh
    public final void q0(int i) {
        if (a1(10)) {
            vq1.v(i >= 0);
            U0(new zkh(this, i, 6));
            n1(i, -9223372036854775807L);
        }
    }

    public final void q1(List list, int i, long j, boolean z) {
        int i2;
        boolean z2;
        long j2;
        g8l g8lVar;
        tmp tmpVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < list.size()) {
            onh onhVar = (onh) list.get(i3);
            hee heeVar = rwf.a;
            ris risVar = new ris();
            int i4 = i3;
            risVar.b(0, onhVar, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i4, i4, 0L);
            arrayList.add(risVar);
            ois oisVar = new ois();
            oisVar.j(null, null, i4, -9223372036854775807L, 0L, lj.f, true);
            arrayList2.add(oisVar);
            i3 = i4 + 1;
        }
        pis S0 = S0(arrayList, arrayList2);
        yde ydeVar = S0.e;
        if (!S0.p() && i >= ydeVar.size()) {
            throw new dbe();
        }
        if (z) {
            i2 = S0.a(this.o.i);
            z2 = false;
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            g8l g8lVar2 = this.o.c.a;
            int i5 = g8lVar2.b;
            long j3 = g8lVar2.f;
            if (S0.p() || i5 < ydeVar.size()) {
                z2 = false;
                j2 = j3;
                i2 = i5;
            } else {
                i2 = S0.a(this.o.i);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            i2 = i;
            z2 = false;
            j2 = j;
        }
        mdr Y0 = Y0(S0, i2, j2);
        if (Y0 == null) {
            g8lVar = new g8l(null, i2, null, null, i2, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            tmpVar = new tmp(g8lVar, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = Y0.b;
            g8lVar = new g8l(null, i2, (onh) list.get(i2), null, Y0.a, dvt.m0(j4), dvt.m0(j4), -1, -1);
            tmpVar = new tmp(g8lVar, false, SystemClock.elapsedRealtime(), -9223372036854775807L, dvt.m0(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, dvt.m0(j4));
        }
        rdl e1 = e1(this.o, S0, g8lVar, tmpVar, 4);
        int i6 = e1.y;
        if (i2 != -1 && i6 != 1) {
            i6 = (S0.p() || z2) ? 4 : 2;
        }
        rdl f = e1.f(i6, this.o.a);
        s1(f, 0, null, !this.o.j.p() ? 4 : null, (this.o.j.p() && f.j.p()) ? null : 3);
    }

    @Override // defpackage.jkh
    public final void r(p0l p0lVar) {
        if (a1(13)) {
            U0(new v13(21, this, p0lVar));
            if (this.o.g.equals(p0lVar)) {
                return;
            }
            this.o = this.o.e(p0lVar);
            olh olhVar = new olh(p0lVar, 0);
            bdg bdgVar = this.i;
            bdgVar.c(12, olhVar);
            bdgVar.b();
        }
    }

    @Override // defpackage.jkh
    public final long r0() {
        return this.o.B;
    }

    public final void r1(boolean z) {
        rdl rdlVar = this.o;
        int i = rdlVar.x;
        int i2 = i == 1 ? 0 : i;
        if (rdlVar.t == z && i == i2) {
            return;
        }
        this.E = vwh.c(rdlVar, this.E, this.F, this.a.f);
        this.F = SystemClock.elapsedRealtime();
        s1(this.o.d(1, i2, z), null, 1, null, null);
    }

    @Override // defpackage.jkh
    public final void s(long j) {
        if (a1(5)) {
            U0(new plh(j, this));
            n1(W0(this.o), j);
        }
    }

    @Override // defpackage.jkh
    public final long s0() {
        tmp tmpVar = this.o.c;
        return !tmpVar.b ? J0() : tmpVar.a.g;
    }

    public final void s1(rdl rdlVar, Integer num, Integer num2, Integer num3, Integer num4) {
        rdl rdlVar2 = this.o;
        this.o = rdlVar;
        h1(rdlVar2, rdlVar, num, num2, num3, num4);
    }

    @Override // defpackage.jkh
    public final void stop() {
        if (a1(3)) {
            U0(new clh(this, 2));
            rdl rdlVar = this.o;
            tmp tmpVar = this.o.c;
            g8l g8lVar = tmpVar.a;
            boolean z = tmpVar.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            tmp tmpVar2 = this.o.c;
            long j = tmpVar2.d;
            long j2 = tmpVar2.a.f;
            int b = vwh.b(j2, j);
            tmp tmpVar3 = this.o.c;
            rdl j3 = rdlVar.j(new tmp(g8lVar, z, elapsedRealtime, j, j2, b, 0L, tmpVar3.h, tmpVar3.i, tmpVar3.a.f));
            this.o = j3;
            if (j3.y != 1) {
                this.o = j3.f(1, j3.a);
                dlh dlhVar = new dlh(0);
                bdg bdgVar = this.i;
                bdgVar.c(4, dlhVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final void t(float f) {
        if (a1(24)) {
            U0(new elh(this, f, 0));
            rdl rdlVar = this.o;
            if (rdlVar.n != f) {
                this.o = rdlVar.p(f);
                mrb mrbVar = new mrb(2, f);
                bdg bdgVar = this.i;
                bdgVar.c(22, mrbVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final long t0() {
        return this.o.c.e;
    }

    @Override // defpackage.jkh
    public final void u(float f) {
        if (a1(13)) {
            U0(new elh(this, f, 1));
            p0l p0lVar = this.o.g;
            if (p0lVar.a != f) {
                p0l a = p0lVar.a(f);
                this.o = this.o.e(a);
                olh olhVar = new olh(a, 1);
                bdg bdgVar = this.i;
                bdgVar.c(12, olhVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final hoh u0() {
        return this.o.m;
    }

    @Override // defpackage.jkh
    public final void v(SurfaceView surfaceView) {
        if (a1(27)) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            if (a1(27) && holder != null && this.z == holder) {
                Q0();
            }
        }
    }

    @Override // defpackage.jkh
    public final int v0() {
        return W0(this.o);
    }

    @Override // defpackage.jkh
    public final long w() {
        return this.o.c.g;
    }

    @Override // defpackage.jkh
    public final void w0(int i) {
        if (a1(15)) {
            U0(new zkh(this, i, 9));
            rdl rdlVar = this.o;
            if (rdlVar.h != i) {
                this.o = rdlVar.i(i);
                irb irbVar = new irb(i, 2);
                bdg bdgVar = this.i;
                bdgVar.c(8, irbVar);
                bdgVar.b();
            }
        }
    }

    @Override // defpackage.jkh
    public final void x(onh onhVar, long j) {
        if (a1(31)) {
            U0(new np6(j, this, onhVar));
            q1(Collections.singletonList(onhVar), -1, j, false);
        }
    }

    @Override // defpackage.jkh
    public final void x0(f8l f8lVar) {
        this.i.e(f8lVar);
    }

    @Override // defpackage.jkh
    public final void y() {
        if (a1(20)) {
            U0(new clh(this, 0));
            j1(0, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.jkh
    public final void y0(int i, int i2) {
        if (a1(20)) {
            vq1.v(i >= 0 && i2 >= 0);
            U0(new flh(this, i, i2, 0));
            g1(i, i + 1, i2);
        }
    }

    public final void z(List list, int i) {
        if (list.isEmpty()) {
            return;
        }
        if (this.o.j.p()) {
            q1(list, -1, -9223372036854775807L, false);
        } else {
            s1(b1(this.o, Math.min(i, this.o.j.o()), list, J0(), s0()), 0, null, null, this.o.j.p() ? 3 : null);
        }
    }

    @Override // defpackage.jkh
    public final void z0(final int i, final int i2, final int i3) {
        if (a1(20)) {
            vq1.v(i >= 0 && i <= i2 && i3 >= 0);
            U0(new qlh() { // from class: blh
                @Override // defpackage.qlh
                public final void b(c9e c9eVar, int i4) {
                    c9eVar.Q(ulh.this.c, i4, i, i2, i3);
                }
            });
            g1(i, i2, i3);
        }
    }
}
