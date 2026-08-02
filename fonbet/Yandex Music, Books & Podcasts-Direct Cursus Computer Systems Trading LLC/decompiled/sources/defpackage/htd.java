package defpackage;

import android.os.Build;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class htd extends xci implements yr5, amd, qof, ekj, ipa, w9t {
    public long A;
    public float B;
    public float C;
    public o6g D;
    public long E;
    public c5b F;
    public std G;
    public float H;
    public Object I;
    public y73 J;
    public cib o;
    public g83 p;
    public int q;
    public boolean r;
    public ltd s;
    public qtd t;
    public qtd u;
    public long v;
    public Object w;
    public long x;
    public long y;
    public long z;

    @Override // defpackage.amd
    public final void G(f8j f8jVar) {
        S0(f8jVar);
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.ekj
    public final void J() {
        neg.y(this, new v2d(0, this, htd.class, "updateEffect", "updateEffect()V", 0, 2));
    }

    @Override // defpackage.xci
    public final void K0() {
        J();
    }

    @Override // defpackage.qof
    public final void R(wof wofVar) {
        wofVar.getClass();
        if ((this.v & 9223372034707292159L) == 9205357640488583168L) {
            S0(wofVar);
        }
    }

    public final void S0(wof wofVar) {
        wofVar.getClass();
        long K = wofVar.K(0L);
        if (!enj.c(K, this.v)) {
            this.q |= 4;
            this.v = K;
        }
        long Q = nt0.Q(wofVar.j());
        if (!nmq.a(Q, this.y)) {
            this.q |= 16;
            this.y = Q;
        }
        U0();
    }

    public final void T0(qtd qtdVar, qtd qtdVar2) {
        if (!Intrinsics.d(qtdVar != null ? qtdVar.b : null, qtdVar2.b)) {
            this.q |= RemoteCameraConfig.Mic.BUFFER_SIZE;
        }
        if (!Intrinsics.d(qtdVar != null ? qtdVar.e : null, qtdVar2.e)) {
            this.q |= RemoteCameraConfig.Mic.BUFFER_SIZE;
        }
        if (!Intrinsics.d(qtdVar != null ? new d85(qtdVar.a) : null, new d85(qtdVar2.a))) {
            this.q |= 256;
        }
        if (!Intrinsics.c(qtdVar != null ? Float.valueOf(qtdVar.d) : null, Float.valueOf(qtdVar2.d))) {
            this.q |= 64;
        }
        if (Intrinsics.d(qtdVar != null ? new cma(qtdVar.c) : null, new cma(qtdVar2.c))) {
            return;
        }
        this.q |= 32;
    }

    public final void U0() {
        float f;
        float f2;
        float f3;
        float f4;
        qtd qtdVar = (qtd) men.t(this, rtd.a);
        qtdVar.getClass();
        if (!Intrinsics.d(this.t, qtdVar)) {
            T0(this.t, qtdVar);
            this.t = qtdVar;
        }
        g83 g83Var = this.p;
        if (g83Var != null) {
            g83Var.invoke(this);
        }
        w9t E = q7g.E(this, ttd.b);
        ntd ntdVar = null;
        ntd ntdVar2 = E instanceof ntd ? (ntd) E : null;
        if (ntdVar2 != null && Intrinsics.d(ntdVar2.p, this.o)) {
            ntdVar = ntdVar2;
        }
        ArrayList l = jhp.l(new lcc(CollectionsKt.F(((s2r) this.o.b).q().c), true, new lhd(this, ntdVar)));
        if (l.size() > 1) {
            y75.s(l, new zda(14));
        }
        if (!l.equals(this.I)) {
            this.q |= RemoteCameraConfig.Notification.ID;
            this.I = l;
        }
        Iterable iterable = (Iterable) this.I;
        int a = tah.a(v75.o(iterable, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : iterable) {
            linkedHashMap.put(obj, new enj(enj.g(this.v, ((ftd) obj).c())));
        }
        if (!linkedHashMap.equals(this.w)) {
            this.q |= 8;
            this.w = linkedHashMap;
        }
        long j = 0;
        while (((Iterable) this.I).iterator().hasNext()) {
            j += ((ftd) r0.next()).f.h();
        }
        if (j != this.x) {
            this.q |= 16384;
            this.x = j;
        }
        if (this.y == 9205357640488583168L || !swf.U(this.v)) {
            long j2 = this.y;
            if (!nmq.a(j2, this.z)) {
                this.q |= SQLiteDatabase.OPEN_NOMUTEX;
                this.z = j2;
            }
            if (!enj.c(9205357640488583168L, this.A)) {
                this.q |= SQLiteDatabase.OPEN_FULLMUTEX;
                this.A = 9205357640488583168L;
            }
        } else {
            Iterator it = ((Iterable) this.I).iterator();
            ynn ynnVar = ynn.e;
            ynn ynnVar2 = ynnVar;
            while (true) {
                f = ynnVar2.d;
                f2 = ynnVar2.c;
                f3 = ynnVar2.b;
                f4 = ynnVar2.a;
                if (!it.hasNext()) {
                    break;
                }
                ynn a2 = ((ftd) it.next()).a();
                if (a2 == null) {
                    a2 = ynnVar;
                }
                ynnVar2 = new ynn(Math.min(f4, a2.a), Math.min(f3, a2.b), Math.max(f2, a2.c), Math.max(f, a2.d));
            }
            jx7 jx7Var = (jx7) men.t(this, es5.h);
            float b = itd.b(this);
            if (Float.isNaN(b)) {
                b = 0;
            }
            float n0 = jx7Var.n0(b);
            ynn d = ywf.d(this.v, this.y);
            float f5 = d.a - n0;
            float f6 = d.b - n0;
            float f7 = d.c + n0;
            float f8 = d.d + n0;
            float max = Math.max(f5, f4);
            float max2 = Math.max(f6, f3);
            float min = Math.min(f7, f2);
            float min2 = Math.min(f8, f);
            float f9 = min - max;
            if (f9 < 0.0f) {
                f9 = 0.0f;
            }
            float f10 = min2 - max2;
            long i = a4g.i(f9, f10 >= 0.0f ? f10 : 0.0f);
            if (!nmq.a(i, this.z)) {
                this.q |= SQLiteDatabase.OPEN_NOMUTEX;
                this.z = i;
            }
            long g = enj.g(this.v, (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
            if (!enj.c(g, this.A)) {
                this.q |= SQLiteDatabase.OPEN_FULLMUTEX;
                this.A = g;
            }
        }
        if ((this.q & 131067) != 0) {
            vq1.Z(this);
        }
    }

    @Override // defpackage.w9t
    public final Object h() {
        return ttd.a;
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        if (this.y != 9205357640488583168L && this.z != 9205357640488583168L && !((Collection) this.I).isEmpty()) {
            boolean z = Build.VERSION.SDK_INT >= 31 && vd0.a(opfVar.a.b.s()).isHardwareAccelerated();
            if (this.r && z) {
                y73 y73Var = this.J;
                if (!(y73Var instanceof rwn)) {
                    rwn rwnVar = new rwn(this);
                    if (!rwnVar.equals(y73Var)) {
                        this.J.getClass();
                        this.J = rwnVar;
                    }
                }
            } else {
                y73 y73Var2 = this.J;
                if (!(y73Var2 instanceof zvo)) {
                    zvo zvoVar = new zvo(this);
                    if (!zvoVar.equals(y73Var2)) {
                        this.J.getClass();
                        this.J = zvoVar;
                    }
                }
            }
            this.J.a(opfVar);
        }
        opfVar.a();
        this.q = 0;
    }
}
