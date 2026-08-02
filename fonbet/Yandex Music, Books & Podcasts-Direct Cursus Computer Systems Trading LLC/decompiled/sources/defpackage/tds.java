package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tds extends at2 implements Handler.Callback {
    public qpr A;
    public int B;
    public final Handler C;
    public final nds D;
    public final qdc E;
    public boolean F;
    public boolean G;
    public dsc H;
    public long I;
    public long J;
    public boolean K;
    public IOException L;
    public final o6c r;
    public final qg7 s;
    public tv6 t;
    public final lpr u;
    public boolean v;
    public int w;
    public jpr x;
    public ppr y;
    public qpr z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tds(nds ndsVar, Looper looper) {
        super(3);
        Handler handler;
        sml smlVar = lpr.o0;
        this.D = ndsVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = dvt.a;
            handler = new Handler(looper, this);
        }
        this.C = handler;
        this.u = smlVar;
        this.r = new o6c(19);
        this.s = new qg7(1);
        this.E = new qdc(1);
        this.J = -9223372036854775807L;
        this.I = -9223372036854775807L;
        this.K = false;
    }

    @Override // defpackage.at2
    public final void C(dsc[] dscVarArr, long j, long j2, uvh uvhVar) {
        dsc dscVar = dscVarArr[0];
        this.H = dscVar;
        if (Objects.equals(dscVar.n, "application/x-media3-cues")) {
            this.t = this.H.J == 1 ? new xyh() : new joe(1);
            return;
        }
        K();
        if (this.x != null) {
            this.w = 1;
        } else {
            N();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024a A[EXC_TOP_SPLITTER, LOOP:2: B:99:0x024a->B:121:0x02b8, LOOP_START, PHI: r7 r16
      0x024a: PHI (r7v1 int) = (r7v0 int), (r7v4 int) binds: [B:98:0x0246, B:121:0x02b8] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r16v2 qdc) = (r16v1 qdc), (r16v3 qdc) binds: [B:98:0x0246, B:121:0x02b8] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.at2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(long j, long j2) {
        boolean z;
        qdc qdcVar;
        boolean z2;
        long j3;
        if (this.n) {
            long j4 = this.J;
            if (j4 != -9223372036854775807L && j >= j4) {
                O();
                this.G = true;
            }
        }
        if (this.G) {
            return;
        }
        dsc dscVar = this.H;
        dscVar.getClass();
        boolean equals = Objects.equals(dscVar.n, "application/x-media3-cues");
        nds ndsVar = this.D;
        Handler handler = this.C;
        int i = 4;
        qdc qdcVar2 = this.E;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (equals) {
            this.t.getClass();
            if (!this.F) {
                qg7 qg7Var = this.s;
                if (D(qdcVar2, qg7Var, 0) == -4) {
                    if (qg7Var.f(4)) {
                        this.F = true;
                    } else {
                        qg7Var.C();
                        ByteBuffer byteBuffer = qg7Var.i;
                        byteBuffer.getClass();
                        long j5 = qg7Var.k;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.r.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        tde u = yde.u();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle = (Bundle) parcelableArrayList.get(i2);
                            bundle.getClass();
                            u.a(rv6.b(bundle));
                        }
                        uv6 uv6Var = new uv6(j5, readBundle.getLong("d"), u.f());
                        qg7Var.z();
                        z3 = this.t.a(uv6Var, j);
                    }
                }
            }
            long d = this.t.d(this.I);
            if (d == Long.MIN_VALUE && this.F && !z3) {
                this.G = true;
            }
            if (d != Long.MIN_VALUE && d <= j) {
                z3 = true;
            }
            if (z3) {
                yde b = this.t.b(j);
                long c = this.t.c(j);
                sv6 sv6Var = new sv6(b, M(c));
                if (handler != null) {
                    handler.obtainMessage(1, sv6Var).sendToTarget();
                } else {
                    ndsVar.a(sv6Var.a);
                    ndsVar.l(sv6Var);
                }
                this.t.e(c);
            }
            this.I = j;
            return;
        }
        K();
        this.I = j;
        if (this.A == null) {
            jpr jprVar = this.x;
            jprVar.getClass();
            jprVar.b(j);
            try {
                jpr jprVar2 = this.x;
                jprVar2.getClass();
                this.A = (qpr) jprVar2.g();
            } catch (kpr e) {
                vq1.L("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.H, e);
                sv6 sv6Var2 = new sv6(qsn.e, M(this.I));
                if (handler != null) {
                    handler.obtainMessage(1, sv6Var2).sendToTarget();
                } else {
                    ndsVar.a(sv6Var2.a);
                    ndsVar.l(sv6Var2);
                }
                O();
                jpr jprVar3 = this.x;
                jprVar3.getClass();
                jprVar3.a();
                this.x = null;
                this.w = 0;
                N();
                return;
            }
        }
        if (this.h != 2) {
            return;
        }
        if (this.z != null) {
            long L = L();
            z = false;
            while (L <= j) {
                this.B++;
                L = L();
                z = true;
            }
        } else {
            z = false;
        }
        qpr qprVar = this.A;
        if (qprVar != null) {
            if (!qprVar.f(4)) {
                qdcVar = qdcVar2;
                z2 = z;
                if (qprVar.g <= j) {
                    qpr qprVar2 = this.z;
                    if (qprVar2 != null) {
                        qprVar2.A();
                    }
                    this.B = qprVar.e(j);
                    this.z = qprVar;
                    this.A = null;
                    z2 = true;
                }
                if (z2) {
                    this.z.getClass();
                    int e2 = this.z.e(j);
                    if (e2 == 0 || this.z.q() == 0) {
                        j3 = this.z.g;
                    } else {
                        qpr qprVar3 = this.z;
                        j3 = e2 == -1 ? qprVar3.o(qprVar3.q() - 1) : qprVar3.o(e2 - 1);
                    }
                    sv6 sv6Var3 = new sv6(this.z.g(j), M(j3));
                    if (handler != null) {
                        handler.obtainMessage(1, sv6Var3).sendToTarget();
                    } else {
                        ndsVar.a(sv6Var3.a);
                        ndsVar.l(sv6Var3);
                    }
                }
                if (this.w != 2) {
                    return;
                }
                while (!this.F) {
                    try {
                        ppr pprVar = this.y;
                        if (pprVar == null) {
                            jpr jprVar4 = this.x;
                            jprVar4.getClass();
                            pprVar = (ppr) jprVar4.f();
                            if (pprVar == null) {
                                return;
                            } else {
                                this.y = pprVar;
                            }
                        }
                        if (this.w == 1) {
                            pprVar.b = i;
                            jpr jprVar5 = this.x;
                            jprVar5.getClass();
                            jprVar5.h(pprVar);
                            this.y = null;
                            this.w = 2;
                            return;
                        }
                        qdc qdcVar3 = qdcVar;
                        int D = D(qdcVar3, pprVar, 0);
                        if (D == -4) {
                            if (pprVar.f(i)) {
                                this.F = true;
                                this.v = false;
                            } else {
                                dsc dscVar2 = (dsc) qdcVar3.c;
                                if (dscVar2 == null) {
                                    return;
                                }
                                pprVar.n = dscVar2.s;
                                pprVar.C();
                                this.v &= !pprVar.f(1);
                            }
                            if (!this.v) {
                                jpr jprVar6 = this.x;
                                jprVar6.getClass();
                                jprVar6.h(pprVar);
                                this.y = null;
                            }
                        } else if (D == -3) {
                            return;
                        }
                        qdcVar = qdcVar3;
                        i = 4;
                    } catch (kpr e3) {
                        vq1.L("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.H, e3);
                        sv6 sv6Var4 = new sv6(qsn.e, M(this.I));
                        if (handler != null) {
                            handler.obtainMessage(1, sv6Var4).sendToTarget();
                        } else {
                            ndsVar.a(sv6Var4.a);
                            ndsVar.l(sv6Var4);
                        }
                        O();
                        jpr jprVar7 = this.x;
                        jprVar7.getClass();
                        jprVar7.a();
                        this.x = null;
                        this.w = 0;
                        N();
                        return;
                    }
                }
                return;
            }
            if (!z && L() == Long.MAX_VALUE) {
                if (this.w == 2) {
                    O();
                    jpr jprVar8 = this.x;
                    jprVar8.getClass();
                    jprVar8.a();
                    this.x = null;
                    this.w = 0;
                    N();
                } else {
                    O();
                    this.G = true;
                }
            }
        }
        qdcVar = qdcVar2;
        z2 = z;
        if (z2) {
        }
        if (this.w != 2) {
        }
    }

    @Override // defpackage.at2
    public final int I(dsc dscVar) {
        boolean equals = Objects.equals(dscVar.n, "application/x-media3-cues");
        String str = dscVar.n;
        if (!equals) {
            sml smlVar = (sml) this.u;
            smlVar.getClass();
            if (!((mvt) smlVar.a).d(dscVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return l5i.n(str) ? at2.e(1, 0, 0, 0) : at2.e(0, 0, 0, 0);
            }
        }
        return at2.e(dscVar.M == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void K() {
        vq1.z("Legacy decoding is disabled, can't handle " + this.H.n + " samples (expected application/x-media3-cues).", this.K || Objects.equals(this.H.n, "application/cea-608") || Objects.equals(this.H.n, "application/x-mp4-cea-608") || Objects.equals(this.H.n, "application/cea-708"));
    }

    public final long L() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        this.z.getClass();
        if (this.B >= this.z.q()) {
            return Long.MAX_VALUE;
        }
        return this.z.o(this.B);
    }

    public final long M(long j) {
        vq1.A(j != -9223372036854775807L);
        return j - this.k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        jpr i33Var;
        char c = 1;
        this.v = true;
        dsc dscVar = this.H;
        dscVar.getClass();
        mvt mvtVar = (mvt) ((sml) this.u).a;
        String str = dscVar.n;
        int i = dscVar.I;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i33Var = new s94(str, i);
                    break;
                case 2:
                    i33Var = new w94(dscVar.q, i);
                    break;
            }
            this.x = i33Var;
            i33Var.i(this.l);
        }
        if (!mvtVar.d(dscVar)) {
            xq0.x(f1d.g("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        }
        upr f = mvtVar.f(dscVar);
        i33Var = new i33(f.getClass().getSimpleName().concat("Decoder"), f);
        this.x = i33Var;
        i33Var.i(this.l);
    }

    public final void O() {
        this.y = null;
        this.B = -1;
        qpr qprVar = this.z;
        if (qprVar != null) {
            qprVar.A();
            this.z = null;
        }
        qpr qprVar2 = this.A;
        if (qprVar2 != null) {
            qprVar2.A();
            this.A = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            e7o.n();
            return false;
        }
        sv6 sv6Var = (sv6) message.obj;
        yde ydeVar = sv6Var.a;
        nds ndsVar = this.D;
        ndsVar.a(ydeVar);
        ndsVar.l(sv6Var);
        return true;
    }

    @Override // defpackage.at2
    public final String k() {
        return "TextRenderer";
    }

    @Override // defpackage.at2
    public final boolean n() {
        return this.G;
    }

    @Override // defpackage.at2
    public final boolean p() {
        if (this.H != null) {
            if (this.L == null) {
                try {
                    aoo aooVar = this.i;
                    aooVar.getClass();
                    aooVar.b();
                } catch (IOException e) {
                    this.L = e;
                }
            }
            if (this.L != null) {
                dsc dscVar = this.H;
                dscVar.getClass();
                if (Objects.equals(dscVar.n, "application/x-media3-cues")) {
                    tv6 tv6Var = this.t;
                    tv6Var.getClass();
                    return tv6Var.d(this.I) != Long.MIN_VALUE;
                }
                if (!this.G) {
                    if (this.F) {
                        qpr qprVar = this.z;
                        long j = this.I;
                        if (qprVar == null || qprVar.o(qprVar.q() - 1) <= j) {
                            qpr qprVar2 = this.A;
                            long j2 = this.I;
                            if ((qprVar2 == null || qprVar2.o(qprVar2.q() - 1) <= j2) && this.y != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.at2
    public final void u() {
        this.H = null;
        this.J = -9223372036854775807L;
        sv6 sv6Var = new sv6(qsn.e, M(this.I));
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, sv6Var).sendToTarget();
        } else {
            yde ydeVar = sv6Var.a;
            nds ndsVar = this.D;
            ndsVar.a(ydeVar);
            ndsVar.l(sv6Var);
        }
        this.I = -9223372036854775807L;
        if (this.x != null) {
            O();
            jpr jprVar = this.x;
            jprVar.getClass();
            jprVar.a();
            this.x = null;
            this.w = 0;
        }
    }

    @Override // defpackage.at2
    public final void w(long j, boolean z) {
        this.I = j;
        tv6 tv6Var = this.t;
        if (tv6Var != null) {
            tv6Var.clear();
        }
        sv6 sv6Var = new sv6(qsn.e, M(this.I));
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, sv6Var).sendToTarget();
        } else {
            yde ydeVar = sv6Var.a;
            nds ndsVar = this.D;
            ndsVar.a(ydeVar);
            ndsVar.l(sv6Var);
        }
        this.F = false;
        this.G = false;
        this.J = -9223372036854775807L;
        dsc dscVar = this.H;
        if (dscVar == null || Objects.equals(dscVar.n, "application/x-media3-cues")) {
            return;
        }
        if (this.w == 0) {
            O();
            jpr jprVar = this.x;
            jprVar.getClass();
            jprVar.flush();
            jprVar.i(this.l);
            return;
        }
        O();
        jpr jprVar2 = this.x;
        jprVar2.getClass();
        jprVar2.a();
        this.x = null;
        this.w = 0;
        N();
    }
}
