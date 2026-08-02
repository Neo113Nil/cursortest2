package defpackage;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.flac.c;
import androidx.media3.extractor.FlacStreamMetadata;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* loaded from: classes.dex */
public final class oxf extends at2 implements fih {
    public qg7 A;
    public siq B;
    public zqa C;
    public zqa D;
    public int E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public final long[] X;
    public int Y;
    public boolean Z;
    public final xiu r;
    public final oy1 s;
    public final qg7 t;
    public ig7 u;
    public dsc v;
    public long v0;
    public int w;
    public long w0;
    public int x;
    public boolean y;
    public c z;

    public oxf(Handler handler, fy1 fy1Var, oy1 oy1Var) {
        super(1);
        this.r = new xiu(handler, fy1Var);
        this.s = oy1Var;
        ((gk7) oy1Var).r = new gg7(this);
        this.t = new qg7(0);
        this.E = 0;
        this.G = true;
        P(-9223372036854775807L);
        this.X = new long[10];
        this.v0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
    }

    @Override // defpackage.at2
    public final void A() {
        ((gk7) this.s).v();
    }

    @Override // defpackage.at2
    public final void B() {
        Q();
        ((gk7) this.s).u();
    }

    @Override // defpackage.at2
    public final void C(dsc[] dscVarArr, long j, long j2, uvh uvhVar) {
        this.y = false;
        if (this.L == -9223372036854775807L) {
            P(j2);
            return;
        }
        int i = this.Y;
        long[] jArr = this.X;
        if (i == jArr.length) {
            vq1.n0("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.Y - 1]);
        } else {
            this.Y = i + 1;
        }
        jArr[this.Y - 1] = j2;
    }

    @Override // defpackage.at2
    public final void E(long j, long j2) {
        if (this.K) {
            try {
                ((gk7) this.s).x();
                return;
            } catch (ny1 e) {
                throw h(e, e.c, e.b, ScreenMirroringConfig.Test.pcAudioUdpPort);
            }
        }
        if (this.v == null) {
            qdc qdcVar = this.c;
            qdcVar.s();
            this.t.z();
            int D = D(qdcVar, this.t, 2);
            if (D != -5) {
                if (D == -4) {
                    vq1.A(this.t.f(4));
                    this.J = true;
                    try {
                        this.K = true;
                        ((gk7) this.s).x();
                        return;
                    } catch (ny1 e2) {
                        throw h(e2, null, false, ScreenMirroringConfig.Test.pcAudioUdpPort);
                    }
                }
                return;
            }
            N(qdcVar);
        }
        M();
        if (this.z != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (K()) {
                }
                while (L()) {
                }
                Trace.endSection();
                synchronized (this.u) {
                }
            } catch (jy1 e3) {
                throw h(e3, e3.a, false, 5001);
            } catch (ky1 e4) {
                throw h(e4, e4.c, e4.b, 5001);
            } catch (ny1 e5) {
                throw h(e5, e5.c, e5.b, ScreenMirroringConfig.Test.pcAudioUdpPort);
            } catch (og7 e6) {
                vq1.L("DecoderAudioRenderer", "Audio codec error", e6);
                this.r.h(e6);
                throw h(e6, this.v, false, 4003);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    @Override // defpackage.at2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int I(dsc dscVar) {
        int i;
        dsc J;
        int i2;
        if (!l5i.k(dscVar.n)) {
            return at2.e(0, 0, 0, 0);
        }
        if (tgc.isAvailable()) {
            String str = dscVar.n;
            List list = dscVar.q;
            if ("audio/flac".equalsIgnoreCase(str)) {
                if (list.isEmpty()) {
                    J = dvt.J(2, dscVar.D, dscVar.E);
                } else {
                    FlacStreamMetadata flacStreamMetadata = new FlacStreamMetadata((byte[]) list.get(0), 8);
                    J = dvt.J(dvt.I(flacStreamMetadata.bitsPerSample), flacStreamMetadata.channels, flacStreamMetadata.sampleRate);
                }
                if (!((gk7) this.s).L(J)) {
                    i2 = 1;
                } else {
                    if (dscVar.M != 0) {
                        i = 2;
                        return i <= 2 ? at2.e(i, 0, 0, 0) : at2.f(i, 8, 32, 0, 128, 0);
                    }
                    i2 = 4;
                }
                i = i2;
                if (i <= 2) {
                }
            }
        }
        i = 0;
        if (i <= 2) {
        }
    }

    public final boolean K() {
        siq siqVar = this.B;
        oy1 oy1Var = this.s;
        if (siqVar == null) {
            siq siqVar2 = (siq) this.z.g();
            this.B = siqVar2;
            if (siqVar2 == null) {
                return false;
            }
            int i = siqVar2.h;
            if (i > 0) {
                this.u.f += i;
                ((gk7) oy1Var).L = true;
            }
            if (siqVar2.f(134217728)) {
                ((gk7) oy1Var).L = true;
                if (this.Y != 0) {
                    long[] jArr = this.X;
                    P(jArr[0]);
                    int i2 = this.Y - 1;
                    this.Y = i2;
                    System.arraycopy(jArr, 1, jArr, 0, i2);
                }
            }
        }
        if (this.B.f(4)) {
            if (this.E == 2) {
                O();
                M();
                this.G = true;
                return false;
            }
            this.B.A();
            this.B = null;
            try {
                this.K = true;
                ((gk7) oy1Var).x();
                return false;
            } catch (ny1 e) {
                throw h(e, e.c, e.b, ScreenMirroringConfig.Test.pcAudioUdpPort);
            }
        }
        if (this.G) {
            FlacStreamMetadata flacStreamMetadata = this.z.o;
            bsc a = dvt.J(dvt.I(flacStreamMetadata.bitsPerSample), flacStreamMetadata.channels, flacStreamMetadata.sampleRate).a();
            a.F = this.w;
            a.G = this.x;
            dsc dscVar = this.v;
            a.k = dscVar.l;
            a.a = dscVar.a;
            a.b = dscVar.b;
            a.c = yde.v(dscVar.c);
            dsc dscVar2 = this.v;
            a.d = dscVar2.d;
            a.e = dscVar2.e;
            a.f = dscVar2.f;
            ((gk7) oy1Var).d(new dsc(a), null);
            this.G = false;
        }
        siq siqVar3 = this.B;
        if (!((gk7) oy1Var).n(siqVar3.k, siqVar3.g, 1)) {
            long j = this.B.g;
            return false;
        }
        this.u.e++;
        this.B.A();
        this.B = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L() {
        c cVar = this.z;
        if (cVar != null && this.E != 2 && !this.J) {
            if (this.A == null) {
                qg7 qg7Var = (qg7) cVar.f();
                this.A = qg7Var;
            }
            if (this.E == 1) {
                qg7 qg7Var2 = this.A;
                qg7Var2.b = 4;
                c cVar2 = this.z;
                cVar2.getClass();
                cVar2.h(qg7Var2);
                this.A = null;
                this.E = 2;
                return false;
            }
            qdc qdcVar = this.c;
            qdcVar.s();
            int D = D(qdcVar, this.A, 0);
            if (D == -5) {
                N(qdcVar);
                return true;
            }
            if (D == -4) {
                if (this.A.f(4)) {
                    this.J = true;
                    this.w0 = this.v0;
                    c cVar3 = this.z;
                    qg7 qg7Var3 = this.A;
                    cVar3.getClass();
                    cVar3.h(qg7Var3);
                    this.A = null;
                    return false;
                }
                if (!this.y) {
                    this.y = true;
                    this.A.b(134217728);
                }
                this.v0 = this.A.k;
                if (l() || this.A.f(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
                    this.w0 = this.v0;
                }
                this.A.C();
                qg7 qg7Var4 = this.A;
                qg7Var4.g = this.v;
                c cVar4 = this.z;
                cVar4.getClass();
                cVar4.h(qg7Var4);
                this.F = true;
                this.u.c++;
                this.A = null;
                return true;
            }
            if (D != -3) {
                e7o.n();
                return false;
            }
            if (l()) {
                this.w0 = this.v0;
                return false;
            }
        }
        return false;
    }

    public final void M() {
        xiu xiuVar = this.r;
        if (this.z != null) {
            return;
        }
        zqa zqaVar = this.D;
        zqa.w(this.C, zqaVar);
        this.C = zqaVar;
        if (zqaVar != null && zqaVar.v() == null && this.C.s() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            dsc dscVar = this.v;
            Trace.beginSection("createFlacDecoder");
            c cVar = new c(dscVar.q, dscVar.o);
            Trace.endSection();
            this.z = cVar;
            cVar.i(this.l);
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.z.getClass();
            String str = "libflac";
            long j = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) xiuVar.b;
            if (handler != null) {
                handler.post(new yx1(xiuVar, str, elapsedRealtime2, j, 0));
            }
            this.u.a++;
        } catch (OutOfMemoryError e) {
            throw h(e, this.v, false, 4001);
        } catch (og7 e2) {
            vq1.L("DecoderAudioRenderer", "Audio codec error", e2);
            xiuVar.h(e2);
            throw h(e2, this.v, false, 4001);
        }
    }

    public final void N(qdc qdcVar) {
        dsc dscVar = (dsc) qdcVar.c;
        dscVar.getClass();
        zqa zqaVar = (zqa) qdcVar.b;
        zqa.w(this.D, zqaVar);
        this.D = zqaVar;
        dsc dscVar2 = this.v;
        this.v = dscVar;
        this.w = dscVar.G;
        this.x = dscVar.H;
        c cVar = this.z;
        xiu xiuVar = this.r;
        if (cVar == null) {
            M();
            xiuVar.u(this.v, null);
            return;
        }
        tg7 tg7Var = zqaVar != this.C ? new tg7("libflac", dscVar2, dscVar, 0, 128) : new tg7("libflac", dscVar2, dscVar, 0, 1);
        if (tg7Var.d == 0) {
            if (this.F) {
                this.E = 1;
            } else {
                O();
                M();
                this.G = true;
            }
        }
        xiuVar.u(this.v, tg7Var);
    }

    public final void O() {
        this.A = null;
        this.B = null;
        this.E = 0;
        this.F = false;
        this.v0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        c cVar = this.z;
        if (cVar != null) {
            this.u.b++;
            cVar.a();
            this.z.getClass();
            xiu xiuVar = this.r;
            Handler handler = (Handler) xiuVar.b;
            if (handler != null) {
                handler.post(new qf0(4, xiuVar, "libflac"));
            }
            this.z = null;
        }
        zqa.w(this.C, null);
        this.C = null;
    }

    public final void P(long j) {
        this.L = j;
        if (j != -9223372036854775807L) {
            this.s.getClass();
        }
    }

    public final void Q() {
        n();
        long i = ((gk7) this.s).i();
        if (i != Long.MIN_VALUE) {
            if (!this.I) {
                i = Math.max(this.H, i);
            }
            this.H = i;
            this.I = false;
        }
    }

    @Override // defpackage.at2, defpackage.ogl
    public final void a(int i, Object obj) {
        oy1 oy1Var = this.s;
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            gk7 gk7Var = (gk7) oy1Var;
            if (gk7Var.O != floatValue) {
                gk7Var.O = floatValue;
                if (gk7Var.q()) {
                    gk7Var.v.setVolume(gk7Var.O);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            ((gk7) oy1Var).B((dv1) obj);
            return;
        }
        if (i == 6) {
            ((gk7) oy1Var).E((ag2) obj);
            return;
        }
        if (i == 12) {
            if (dvt.a >= 23) {
                ((gk7) oy1Var).J((AudioDeviceInfo) obj);
                return;
            }
            return;
        }
        if (i == 9) {
            ((gk7) oy1Var).K(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                return;
            }
            ((gk7) oy1Var).C(((Integer) obj).intValue());
        }
    }

    @Override // defpackage.at2
    public final String k() {
        return "LibflacAudioRenderer";
    }

    @Override // defpackage.fih
    public final p0l m() {
        return ((gk7) this.s).C;
    }

    @Override // defpackage.at2
    public final boolean n() {
        return this.K && ((gk7) this.s).r();
    }

    @Override // defpackage.at2
    public final boolean p() {
        if (((gk7) this.s).o()) {
            return true;
        }
        if (this.v != null) {
            return q() || this.B != null;
        }
        return false;
    }

    @Override // defpackage.fih
    public final void r(p0l p0lVar) {
        ((gk7) this.s).I(p0lVar);
    }

    @Override // defpackage.fih
    public final boolean s() {
        boolean z = this.Z;
        this.Z = false;
        return z;
    }

    @Override // defpackage.fih
    public final long t() {
        if (this.h == 2) {
            Q();
        }
        return this.H;
    }

    @Override // defpackage.at2
    public final void u() {
        xiu xiuVar = this.r;
        this.v = null;
        this.G = true;
        P(-9223372036854775807L);
        this.Z = false;
        try {
            zqa.w(this.D, null);
            this.D = null;
            O();
            ((gk7) this.s).A();
        } finally {
            xiuVar.k(this.u);
        }
    }

    @Override // defpackage.at2
    public final void v(boolean z, boolean z2) {
        ig7 ig7Var = new ig7();
        this.u = ig7Var;
        xiu xiuVar = this.r;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new xx1(xiuVar, ig7Var, 0));
        }
        gxn gxnVar = this.d;
        gxnVar.getClass();
        boolean z3 = gxnVar.b;
        oy1 oy1Var = this.s;
        if (z3) {
            ((gk7) oy1Var).g();
        } else {
            gk7 gk7Var = (gk7) oy1Var;
            if (gk7Var.a0) {
                gk7Var.a0 = false;
                gk7Var.h();
            }
        }
        ndl ndlVar = this.f;
        ndlVar.getClass();
        gk7 gk7Var2 = (gk7) oy1Var;
        gk7Var2.q = ndlVar;
        dzr dzrVar = this.g;
        dzrVar.getClass();
        gk7Var2.g.I = dzrVar;
    }

    @Override // defpackage.at2
    public final void w(long j, boolean z) {
        ((gk7) this.s).h();
        this.H = j;
        this.Z = false;
        this.I = true;
        this.J = false;
        this.K = false;
        if (this.z != null) {
            if (this.E != 0) {
                O();
                M();
                return;
            }
            this.A = null;
            siq siqVar = this.B;
            if (siqVar != null) {
                siqVar.A();
                this.B = null;
            }
            c cVar = this.z;
            cVar.getClass();
            cVar.flush();
            cVar.i(this.l);
            this.F = false;
        }
    }

    @Override // defpackage.at2
    public final fih j() {
        return this;
    }
}
