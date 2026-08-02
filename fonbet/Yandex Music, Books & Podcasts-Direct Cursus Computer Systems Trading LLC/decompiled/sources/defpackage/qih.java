package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class qih extends at2 {
    public static final byte[] i1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ArrayDeque A;
    public boolean A0;
    public final rnj B;
    public boolean B0;
    public dsc C;
    public boolean C0;
    public dsc D;
    public boolean D0;
    public zqa E;
    public boolean E0;
    public zqa F;
    public boolean F0;
    public zrb G;
    public long G0;
    public MediaCrypto H;
    public long H0;
    public final long I;
    public int I0;
    public float J;
    public int J0;
    public float K;
    public ByteBuffer K0;
    public iih L;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public int S0;
    public int T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public dsc X;
    public long X0;
    public MediaFormat Y;
    public long Y0;
    public boolean Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public pqb d1;
    public ig7 e1;
    public pih f1;
    public long g1;
    public boolean h1;
    public final gih r;
    public final rih s;
    public final boolean t;
    public final float u;
    public final qg7 v;
    public float v0;
    public final qg7 w;
    public ArrayDeque w0;
    public final qg7 x;
    public oih x0;
    public final yv2 y;
    public mih y0;
    public final MediaCodec.BufferInfo z;
    public int z0;

    public qih(int i, gih gihVar, rih rihVar, boolean z, float f) {
        super(i);
        this.r = gihVar;
        rihVar.getClass();
        this.s = rihVar;
        this.t = z;
        this.u = f;
        this.v = new qg7(0);
        this.w = new qg7(0);
        this.x = new qg7(2);
        yv2 yv2Var = new yv2();
        this.y = yv2Var;
        this.z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.A = new ArrayDeque();
        this.f1 = pih.e;
        yv2Var.B(0);
        yv2Var.i.order(ByteOrder.nativeOrder());
        this.B = new rnj(0);
        this.v0 = -1.0f;
        this.z0 = 0;
        this.R0 = 0;
        this.I0 = -1;
        this.J0 = -1;
        this.H0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.Y0 = -9223372036854775807L;
        this.g1 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.S0 = 0;
        this.T0 = 0;
        this.e1 = new ig7();
    }

    public abstract int A0(rih rihVar, dsc dscVar);

    public final boolean B0(dsc dscVar) {
        if (dvt.a >= 23 && this.L != null && this.T0 != 3 && this.h != 0) {
            float f = this.K;
            dscVar.getClass();
            dsc[] dscVarArr = this.j;
            dscVarArr.getClass();
            float W = W(f, dscVarArr);
            float f2 = this.v0;
            if (f2 != W) {
                if (W == -1.0f) {
                    if (this.U0) {
                        this.S0 = 1;
                        this.T0 = 3;
                        return false;
                    }
                    r0();
                    c0();
                    return false;
                }
                if (f2 != -1.0f || W > this.u) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", W);
                    iih iihVar = this.L;
                    iihVar.getClass();
                    iihVar.b(bundle);
                    this.v0 = W;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // defpackage.at2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(dsc[] dscVarArr, long j, long j2, uvh uvhVar) {
        if (this.f1.c == -9223372036854775807L) {
            w0(new pih(-9223372036854775807L, j, j2));
            return;
        }
        ArrayDeque arrayDeque = this.A;
        if (arrayDeque.isEmpty()) {
            long j3 = this.X0;
            if (j3 != -9223372036854775807L) {
                long j4 = this.g1;
                if (j4 != -9223372036854775807L) {
                }
            }
            w0(new pih(-9223372036854775807L, j, j2));
            if (this.f1.c != -9223372036854775807L) {
                m0();
                return;
            }
            return;
        }
        arrayDeque.add(new pih(this.X0, j, j2));
    }

    public final void C0() {
        zqa zqaVar = this.F;
        zqaVar.getClass();
        vvc v = zqaVar.v();
        if (v != null) {
            try {
                MediaCrypto mediaCrypto = this.H;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(v.b);
            } catch (MediaCryptoException e) {
                throw h(e, this.C, false, 6006);
            }
        }
        v0(this.F);
        this.S0 = 0;
        this.T0 = 0;
    }

    public final void D0(long j) {
        dsc dscVar = (dsc) this.f1.d.f(j);
        if (dscVar == null && this.h1 && this.Y != null) {
            dscVar = (dsc) this.f1.d.e();
        }
        if (dscVar != null) {
            this.D = dscVar;
        } else if (!this.Z || this.D == null) {
            return;
        }
        dsc dscVar2 = this.D;
        dscVar2.getClass();
        j0(dscVar2, this.Y);
        this.Z = false;
        this.h1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:? BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // defpackage.at2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.c1) {
            this.c1 = false;
            o0();
        }
        pqb pqbVar = this.d1;
        if (pqbVar != null) {
            this.d1 = null;
            throw pqbVar;
        }
        try {
            if (this.a1) {
                s0();
                return;
            }
            if (this.C != null || q0(2)) {
                c0();
                if (this.N0) {
                    Trace.beginSection("bypassRender");
                    while (K(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.L != null) {
                    this.g.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (P(j, j2)) {
                        long j3 = this.I;
                        if (j3 != -9223372036854775807L) {
                            this.g.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j3) {
                                z2 = false;
                                if (z2) {
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    }
                    while (Q()) {
                        long j4 = this.I;
                        if (j4 != -9223372036854775807L) {
                            this.g.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j4) {
                                z = false;
                                if (z) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    Trace.endSection();
                } else {
                    this.e1.d += H(j);
                    q0(1);
                }
                synchronized (this.e1) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw h(e, this.C, false, dvt.D(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            f0(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                r0();
            }
            lih M = M(e2, this.y0);
            throw h(M, this.C, z3, M.c == 1101 ? 4006 : 4003);
        }
    }

    @Override // defpackage.at2
    public void G(float f, float f2) {
        this.J = f;
        this.K = f2;
        B0(this.X);
    }

    @Override // defpackage.at2
    public final int I(dsc dscVar) {
        try {
            return A0(this.s, dscVar);
        } catch (wjh e) {
            throw g(e, dscVar);
        }
    }

    @Override // defpackage.at2
    public final int J() {
        return 8;
    }

    public final boolean K(long j, long j2) {
        yv2 yv2Var;
        vq1.A(!this.a1);
        yv2 yv2Var2 = this.y;
        if (yv2Var2.E()) {
            ByteBuffer byteBuffer = yv2Var2.i;
            int i = this.J0;
            int i2 = yv2Var2.o;
            long j3 = yv2Var2.k;
            boolean b0 = b0(this.l, yv2Var2.n);
            boolean f = yv2Var2.f(4);
            dsc dscVar = this.D;
            dscVar.getClass();
            yv2Var = yv2Var2;
            if (!p0(j, j2, null, byteBuffer, i, 0, i2, j3, b0, f, dscVar)) {
                return false;
            }
            l0(yv2Var.n);
            yv2Var.z();
        } else {
            yv2Var = yv2Var2;
        }
        if (this.Z0) {
            this.a1 = true;
            return false;
        }
        boolean z = this.O0;
        qg7 qg7Var = this.x;
        if (z) {
            vq1.A(yv2Var.D(qg7Var));
            this.O0 = false;
        }
        if (this.P0) {
            if (yv2Var.E()) {
                return true;
            }
            N();
            this.P0 = false;
            c0();
            if (!this.N0) {
                return false;
            }
        }
        vq1.A(!this.Z0);
        qdc qdcVar = this.c;
        qdcVar.s();
        qg7Var.z();
        do {
            qg7Var.z();
            int D = D(qdcVar, qg7Var, 0);
            if (D == -5) {
                i0(qdcVar);
                break;
            }
            if (D == -4) {
                if (!qg7Var.f(4)) {
                    this.X0 = Math.max(this.X0, qg7Var.k);
                    if (l() || this.w.f(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
                        this.Y0 = this.X0;
                    }
                    if (this.b1) {
                        dsc dscVar2 = this.C;
                        dscVar2.getClass();
                        this.D = dscVar2;
                        if (Objects.equals(dscVar2.n, "audio/opus") && !this.D.q.isEmpty()) {
                            int N = u7g.N((byte[]) this.D.q.get(0));
                            bsc a = this.D.a();
                            a.F = N;
                            this.D = new dsc(a);
                        }
                        j0(this.D, null);
                        this.b1 = false;
                    }
                    qg7Var.C();
                    dsc dscVar3 = this.D;
                    if (dscVar3 != null && Objects.equals(dscVar3.n, "audio/opus")) {
                        if (qg7Var.f(268435456)) {
                            qg7Var.g = this.D;
                            Z(qg7Var);
                        }
                        if (u7g.R(this.l, qg7Var.k)) {
                            this.B.q(qg7Var, this.D.q);
                        }
                    }
                    if (yv2Var.E()) {
                        long j4 = this.l;
                        if (b0(j4, yv2Var.n) != b0(j4, qg7Var.k)) {
                            break;
                        }
                    }
                } else {
                    this.Z0 = true;
                    this.Y0 = this.X0;
                    break;
                }
            } else {
                if (D != -3) {
                    e7o.n();
                    return false;
                }
                if (l()) {
                    this.Y0 = this.X0;
                }
            }
        } while (yv2Var.D(qg7Var));
        this.O0 = true;
        if (yv2Var.E()) {
            yv2Var.C();
        }
        return yv2Var.E() || this.Z0 || this.P0;
    }

    public abstract tg7 L(mih mihVar, dsc dscVar, dsc dscVar2);

    public lih M(IllegalStateException illegalStateException, mih mihVar) {
        return new lih(illegalStateException, mihVar);
    }

    public final void N() {
        this.P0 = false;
        this.y.z();
        this.x.z();
        this.O0 = false;
        this.N0 = false;
        rnj rnjVar = this.B;
        rnjVar.getClass();
        rnjVar.d = vx1.a;
        rnjVar.c = 0;
        rnjVar.b = 2;
    }

    public final boolean O() {
        if (!this.U0) {
            C0();
            return true;
        }
        this.S0 = 1;
        if (this.B0) {
            this.T0 = 3;
            return false;
        }
        this.T0 = 2;
        return true;
    }

    public final boolean P(long j, long j2) {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean p0;
        ByteBuffer byteBuffer;
        int i;
        int i2;
        long j3;
        boolean z3;
        boolean z4;
        dsc dscVar;
        int t;
        iih iihVar = this.L;
        iihVar.getClass();
        int i3 = this.J0;
        MediaCodec.BufferInfo bufferInfo2 = this.z;
        if (i3 < 0) {
            if (this.C0 && this.V0) {
                try {
                    t = iihVar.t(bufferInfo2);
                } catch (IllegalStateException unused) {
                    o0();
                    if (this.a1) {
                        r0();
                    }
                }
            } else {
                t = iihVar.t(bufferInfo2);
            }
            if (t < 0) {
                if (t == -2) {
                    this.W0 = true;
                    iih iihVar2 = this.L;
                    iihVar2.getClass();
                    MediaFormat d = iihVar2.d();
                    if (this.z0 != 0 && d.getInteger(CameraProperty.WIDTH) == 32 && d.getInteger(CameraProperty.HEIGHT) == 32) {
                        this.E0 = true;
                        return true;
                    }
                    this.Y = d;
                    this.Z = true;
                    return true;
                }
                if (this.F0 && (this.Z0 || this.S0 == 2)) {
                    o0();
                }
                long j4 = this.G0;
                if (j4 != -9223372036854775807L) {
                    long j5 = j4 + 100;
                    this.g.getClass();
                    if (j5 < System.currentTimeMillis()) {
                        o0();
                        return false;
                    }
                }
                return false;
            }
            if (this.E0) {
                this.E0 = false;
                iihVar.k(t);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                o0();
                return false;
            }
            this.J0 = t;
            ByteBuffer m = iihVar.m(t);
            this.K0 = m;
            if (m != null) {
                m.position(bufferInfo2.offset);
                this.K0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j6 = bufferInfo2.presentationTimeUs;
            this.L0 = j6 < this.l;
            long j7 = this.Y0;
            this.M0 = j7 != -9223372036854775807L && j7 <= j6;
            D0(j6);
        }
        if (this.C0 && this.V0) {
            try {
                byteBuffer = this.K0;
                i = this.J0;
                i2 = bufferInfo2.flags;
                j3 = bufferInfo2.presentationTimeUs;
                z3 = this.L0;
                z4 = this.M0;
                dscVar = this.D;
                dscVar.getClass();
                z = false;
                z2 = true;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                p0 = p0(j, j2, iihVar, byteBuffer, i, i2, 1, j3, z3, z4, dscVar);
            } catch (IllegalStateException unused3) {
                o0();
                if (!this.a1) {
                    return z;
                }
                r0();
                return z;
            }
        } else {
            z = false;
            z2 = true;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.K0;
            int i4 = this.J0;
            int i5 = bufferInfo.flags;
            long j8 = bufferInfo.presentationTimeUs;
            boolean z5 = this.L0;
            boolean z6 = this.M0;
            dsc dscVar2 = this.D;
            dscVar2.getClass();
            p0 = p0(j, j2, iihVar, byteBuffer2, i4, i5, 1, j8, z5, z6, dscVar2);
        }
        if (!p0) {
            return z;
        }
        l0(bufferInfo.presentationTimeUs);
        boolean z7 = (bufferInfo.flags & 4) != 0 ? z2 : z;
        if (!z7 && this.V0 && this.M0) {
            this.g.getClass();
            this.G0 = System.currentTimeMillis();
        }
        this.J0 = -1;
        this.K0 = null;
        if (!z7) {
            return z2;
        }
        o0();
        return z;
    }

    public final boolean Q() {
        iih iihVar = this.L;
        if (iihVar != null && this.S0 != 2 && !this.Z0) {
            int i = this.I0;
            qg7 qg7Var = this.w;
            if (i < 0) {
                int s = iihVar.s();
                this.I0 = s;
                if (s >= 0) {
                    qg7Var.i = iihVar.i(s);
                    qg7Var.z();
                }
            }
            if (this.S0 == 1) {
                if (!this.F0) {
                    this.V0 = true;
                    iihVar.c(this.I0, 0, 0L, 4);
                    this.I0 = -1;
                    qg7Var.i = null;
                }
                this.S0 = 2;
                return false;
            }
            if (this.D0) {
                this.D0 = false;
                ByteBuffer byteBuffer = qg7Var.i;
                byteBuffer.getClass();
                byteBuffer.put(i1);
                iihVar.c(this.I0, 38, 0L, 0);
                this.I0 = -1;
                qg7Var.i = null;
                this.U0 = true;
                return true;
            }
            if (this.R0 == 1) {
                int i2 = 0;
                while (true) {
                    dsc dscVar = this.X;
                    dscVar.getClass();
                    if (i2 >= dscVar.q.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.X.q.get(i2);
                    ByteBuffer byteBuffer2 = qg7Var.i;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.R0 = 2;
            }
            ByteBuffer byteBuffer3 = qg7Var.i;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            qdc qdcVar = this.c;
            qdcVar.s();
            try {
                int D = D(qdcVar, qg7Var, 0);
                if (D == -3) {
                    if (l()) {
                        this.Y0 = this.X0;
                        return false;
                    }
                } else {
                    if (D == -5) {
                        if (this.R0 == 2) {
                            qg7Var.z();
                            this.R0 = 1;
                        }
                        i0(qdcVar);
                        return true;
                    }
                    if (!qg7Var.f(4)) {
                        if (!this.U0 && !qg7Var.f(1)) {
                            qg7Var.z();
                            if (this.R0 == 2) {
                                this.R0 = 1;
                                return true;
                            }
                        } else if (!x0(qg7Var)) {
                            boolean f = qg7Var.f(1073741824);
                            if (f) {
                                nv6 nv6Var = qg7Var.h;
                                if (position == 0) {
                                    nv6Var.getClass();
                                } else {
                                    if (nv6Var.d == null) {
                                        int[] iArr = new int[1];
                                        nv6Var.d = iArr;
                                        nv6Var.i.numBytesOfClearData = iArr;
                                    }
                                    int[] iArr2 = nv6Var.d;
                                    iArr2[0] = iArr2[0] + position;
                                }
                            }
                            long j = qg7Var.k;
                            if (this.b1) {
                                ArrayDeque arrayDeque = this.A;
                                if (arrayDeque.isEmpty()) {
                                    lis lisVar = this.f1.d;
                                    dsc dscVar2 = this.C;
                                    dscVar2.getClass();
                                    lisVar.a(j, dscVar2);
                                } else {
                                    lis lisVar2 = ((pih) arrayDeque.peekLast()).d;
                                    dsc dscVar3 = this.C;
                                    dscVar3.getClass();
                                    lisVar2.a(j, dscVar3);
                                }
                                this.b1 = false;
                            }
                            this.X0 = Math.max(this.X0, j);
                            if (l() || qg7Var.f(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
                                this.Y0 = this.X0;
                            }
                            qg7Var.C();
                            if (qg7Var.f(268435456)) {
                                Z(qg7Var);
                            }
                            n0(qg7Var);
                            int U = U(qg7Var);
                            int i3 = this.I0;
                            if (f) {
                                iihVar.f(i3, qg7Var.h, j, U);
                            } else {
                                ByteBuffer byteBuffer4 = qg7Var.i;
                                byteBuffer4.getClass();
                                iihVar.c(i3, byteBuffer4.limit(), j, U);
                            }
                            this.I0 = -1;
                            qg7Var.i = null;
                            this.U0 = true;
                            this.R0 = 0;
                            this.e1.c++;
                            return true;
                        }
                        return true;
                    }
                    this.Y0 = this.X0;
                    if (this.R0 == 2) {
                        qg7Var.z();
                        this.R0 = 1;
                    }
                    this.Z0 = true;
                    if (!this.U0) {
                        o0();
                        return false;
                    }
                    if (!this.F0) {
                        this.V0 = true;
                        iihVar.c(this.I0, 0, 0L, 4);
                        this.I0 = -1;
                        qg7Var.i = null;
                        return false;
                    }
                }
            } catch (pg7 e) {
                f0(e);
                q0(0);
                R();
                return true;
            }
        }
        return false;
    }

    public final void R() {
        try {
            iih iihVar = this.L;
            vq1.B(iihVar);
            iihVar.flush();
        } finally {
            t0();
        }
    }

    public final boolean S() {
        if (this.L == null) {
            return false;
        }
        int i = this.T0;
        if (i == 3 || ((this.A0 && !this.W0) || (this.B0 && this.V0))) {
            r0();
            return true;
        }
        if (i == 2) {
            int i2 = dvt.a;
            vq1.A(i2 >= 23);
            if (i2 >= 23) {
                try {
                    C0();
                } catch (pqb e) {
                    vq1.o0("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    r0();
                    return true;
                }
            }
        }
        R();
        return false;
    }

    public final List T(boolean z) {
        dsc dscVar = this.C;
        dscVar.getClass();
        rih rihVar = this.s;
        ArrayList X = X(rihVar, dscVar, z);
        if (!X.isEmpty() || !z) {
            return X;
        }
        ArrayList X2 = X(rihVar, dscVar, false);
        if (!X2.isEmpty()) {
            vq1.n0("MediaCodecRenderer", "Drm session requires secure decoder for " + dscVar.n + ", but no secure decoder available. Trying to proceed with " + X2 + ".");
        }
        return X2;
    }

    public int U(qg7 qg7Var) {
        return 0;
    }

    public boolean V() {
        return false;
    }

    public abstract float W(float f, dsc[] dscVarArr);

    public abstract ArrayList X(rih rihVar, dsc dscVar, boolean z);

    public abstract rdk Y(mih mihVar, dsc dscVar, MediaCrypto mediaCrypto, float f);

    public abstract void Z(qg7 qg7Var);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(mih mihVar, MediaCrypto mediaCrypto) {
        float W;
        int i;
        dsc dscVar = this.C;
        dscVar.getClass();
        String str = mihVar.a;
        int i2 = dvt.a;
        if (i2 < 23) {
            W = -1.0f;
        } else {
            float f = this.K;
            dsc[] dscVarArr = this.j;
            dscVarArr.getClass();
            W = W(f, dscVarArr);
        }
        float f2 = W > this.u ? W : -1.0f;
        this.g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        rdk Y = Y(mihVar, dscVar, mediaCrypto, f2);
        if (i2 >= 31) {
            ndl ndlVar = this.f;
            ndlVar.getClass();
            rf0.A(Y, ndlVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            iih h = this.r.h(Y);
            this.L = h;
            h.p(new cib(15, this));
            Trace.endSection();
            this.g.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mihVar.e(dscVar)) {
                String c = dsc.c(dscVar);
                Locale locale = Locale.US;
                vq1.n0("MediaCodecRenderer", hrg.s("Format exceeds selected codec's capabilities [", c, ", ", str, "]"));
            }
            this.y0 = mihVar;
            this.v0 = f2;
            this.X = dscVar;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                    this.z0 = i;
                    this.A0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    this.B0 = i2 > 23 && "OMX.google.vorbis.decoder".equals(str);
                    this.C0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str3 = mihVar.a;
                    this.F0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mihVar.g) || V());
                    this.L.getClass();
                    if (this.h == 2) {
                        this.g.getClass();
                        this.H0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.e1.a++;
                    g0(str, Y, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            if (i2 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i = 1;
                    this.z0 = i;
                    this.A0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    this.B0 = i2 > 23 && "OMX.google.vorbis.decoder".equals(str);
                    this.C0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str32 = mihVar.a;
                    if (i2 <= 25) {
                        this.F0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mihVar.g) || V());
                        this.L.getClass();
                        if (this.h == 2) {
                        }
                        this.e1.a++;
                        g0(str, Y, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    this.F0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mihVar.g) || V());
                    this.L.getClass();
                    if (this.h == 2) {
                    }
                    this.e1.a++;
                    g0(str, Y, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            i = 0;
            this.z0 = i;
            this.A0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
            this.B0 = i2 > 23 && "OMX.google.vorbis.decoder".equals(str);
            this.C0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
            String str322 = mihVar.a;
            this.F0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str322)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str322) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str322) || "OMX.bcm.vdec.avc.tunnel".equals(str322) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str322) || "OMX.bcm.vdec.hevc.tunnel".equals(str322) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str322))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mihVar.g) || V());
            this.L.getClass();
            if (this.h == 2) {
            }
            this.e1.a++;
            g0(str, Y, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean b0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        dsc dscVar = this.D;
        return (dscVar != null && Objects.equals(dscVar.n, "audio/opus") && u7g.R(j, j2)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r7 != 4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        if (r2.s() != null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        dsc dscVar;
        MediaCrypto mediaCrypto;
        if (this.L != null || this.N0 || (dscVar = this.C) == null) {
            return;
        }
        String str = dscVar.n;
        boolean z = true;
        if (this.F == null && z0(dscVar)) {
            N();
            boolean equals = "audio/mp4a-latm".equals(str);
            yv2 yv2Var = this.y;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                yv2Var.getClass();
                yv2Var.p = 32;
            } else {
                yv2Var.getClass();
                yv2Var.p = 1;
            }
            this.N0 = true;
            return;
        }
        v0(this.F);
        if (this.E != null) {
            vq1.A(this.H == null);
            zqa zqaVar = this.E;
            vvc v = zqaVar.v();
            if (vvc.c && v != null) {
                int state = zqaVar.getState();
                if (state == 1) {
                    yqa s = zqaVar.s();
                    s.getClass();
                    throw h(s, this.C, false, s.a);
                }
            }
            if (v != null) {
                try {
                    this.H = new MediaCrypto(v.a, v.b);
                } catch (MediaCryptoException e) {
                    throw h(e, this.C, false, 6006);
                }
            }
        }
        try {
            zqa zqaVar2 = this.E;
            if (zqaVar2 != null) {
                if (zqaVar2.getState() != 3) {
                    if (this.E.getState() == 4) {
                    }
                }
                zqa zqaVar3 = this.E;
                vq1.B(str);
                if (zqaVar3.z(str)) {
                    d0(this.H, z);
                    mediaCrypto = this.H;
                    if (mediaCrypto == null && this.L == null) {
                        mediaCrypto.release();
                        this.H = null;
                        return;
                    }
                }
            }
            z = false;
            d0(this.H, z);
            mediaCrypto = this.H;
            if (mediaCrypto == null) {
            }
        } catch (oih e2) {
            throw h(e2, dscVar, false, 4001);
        }
    }

    public final void d0(MediaCrypto mediaCrypto, boolean z) {
        dsc dscVar = this.C;
        dscVar.getClass();
        if (this.w0 == null) {
            try {
                List T = T(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.w0 = arrayDeque;
                if (this.t) {
                    arrayDeque.addAll(T);
                } else {
                    ArrayList arrayList = (ArrayList) T;
                    if (!arrayList.isEmpty()) {
                        this.w0.add((mih) arrayList.get(0));
                    }
                }
                this.x0 = null;
            } catch (wjh e) {
                throw new oih(dscVar, e, z, -49998);
            }
        }
        if (this.w0.isEmpty()) {
            throw new oih(dscVar, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.w0;
        arrayDeque2.getClass();
        while (this.L == null) {
            mih mihVar = (mih) arrayDeque2.peekFirst();
            mihVar.getClass();
            if (!e0(dscVar) || !y0(mihVar)) {
                return;
            }
            try {
                a0(mihVar, mediaCrypto);
            } catch (Exception e2) {
                vq1.o0("MediaCodecRenderer", "Failed to initialize decoder: " + mihVar, e2);
                arrayDeque2.removeFirst();
                oih oihVar = new oih("Decoder init failed: " + mihVar.a + ", " + dscVar, e2, dscVar.n, z, mihVar, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                f0(oihVar);
                oih oihVar2 = this.x0;
                if (oihVar2 == null) {
                    this.x0 = oihVar;
                } else {
                    this.x0 = new oih(oihVar2.getMessage(), oihVar2.getCause(), oihVar2.a, oihVar2.b, oihVar2.c, oihVar2.d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.x0;
                }
            }
        }
        this.w0 = null;
    }

    public boolean e0(dsc dscVar) {
        return true;
    }

    public abstract void f0(Exception exc);

    public abstract void g0(String str, rdk rdkVar, long j, long j2);

    public abstract void h0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x014d, code lost:
    
        if (O() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        if (r4.z(r2) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0108, code lost:
    
        if (O() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013b, code lost:
    
        if (O() == false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tg7 i0(qdc qdcVar) {
        dsc dscVar;
        int i;
        boolean z = true;
        this.b1 = true;
        dsc dscVar2 = (dsc) qdcVar.c;
        dscVar2.getClass();
        String str = dscVar2.n;
        if (str == null) {
            throw h(new IllegalArgumentException("Sample MIME type is null."), dscVar2, false, 4005);
        }
        if (!str.equals("video/av01") || dscVar2.q.isEmpty()) {
            dscVar = dscVar2;
        } else {
            bsc a = dscVar2.a();
            a.p = null;
            dscVar = new dsc(a);
        }
        zqa zqaVar = (zqa) qdcVar.b;
        zqa.w(this.F, zqaVar);
        this.F = zqaVar;
        this.C = dscVar;
        if (this.N0) {
            this.P0 = true;
            return null;
        }
        iih iihVar = this.L;
        if (iihVar == null) {
            this.w0 = null;
            c0();
            return null;
        }
        mih mihVar = this.y0;
        mihVar.getClass();
        dsc dscVar3 = this.X;
        dscVar3.getClass();
        zqa zqaVar2 = this.E;
        zqa zqaVar3 = this.F;
        if (zqaVar2 != zqaVar3) {
            if (zqaVar3 != null && zqaVar2 != null && zqaVar3.v() != null && zqaVar2.v() != null && vvc.class.equals(vvc.class) && zqaVar3.t().equals(zqaVar2.t()) && dvt.a >= 23) {
                UUID uuid = un3.e;
                if (!uuid.equals(zqaVar2.t()) && !uuid.equals(zqaVar3.t())) {
                    if (!mihVar.g) {
                        if (zqaVar3.getState() != 2) {
                            if (zqaVar3.getState() == 3 || zqaVar3.getState() == 4) {
                                String str2 = dscVar.n;
                                str2.getClass();
                            }
                        }
                    }
                }
            }
            if (this.U0) {
                this.S0 = 1;
                this.T0 = 3;
            } else {
                r0();
                c0();
            }
            return new tg7(mihVar.a, dscVar3, dscVar, 0, 128);
        }
        boolean z2 = this.F != this.E;
        vq1.A(!z2 || dvt.a >= 23);
        tg7 L = L(mihVar, dscVar3, dscVar);
        int i2 = L.d;
        if (i2 != 0) {
            i = 16;
            if (i2 == 1) {
                if (B0(dscVar)) {
                    this.X = dscVar;
                    if (!z2) {
                        if (this.U0) {
                            this.S0 = 1;
                            if (this.B0) {
                                this.T0 = 3;
                                i = 2;
                            } else {
                                this.T0 = 1;
                            }
                        }
                    }
                }
                if (i2 != 0) {
                }
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    e7o.n();
                    return null;
                }
                if (B0(dscVar)) {
                    this.X = dscVar;
                    if (z2) {
                    }
                }
                return (i2 != 0 || (this.L == iihVar && this.T0 != 3)) ? L : new tg7(mihVar.a, dscVar3, dscVar, 0, i);
            }
            if (B0(dscVar)) {
                this.Q0 = true;
                this.R0 = 1;
                int i3 = this.z0;
                if (i3 != 2 && (i3 != 1 || dscVar.u != dscVar3.u || dscVar.v != dscVar3.v)) {
                    z = false;
                }
                this.D0 = z;
                this.X = dscVar;
                if (z2) {
                }
            }
            if (i2 != 0) {
            }
        }
        if (this.U0) {
            this.S0 = 1;
            this.T0 = 3;
        } else {
            r0();
            c0();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    public abstract void j0(dsc dscVar, MediaFormat mediaFormat);

    public void l0(long j) {
        this.g1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.A;
            if (arrayDeque.isEmpty() || j < ((pih) arrayDeque.peek()).a) {
                return;
            }
            pih pihVar = (pih) arrayDeque.poll();
            pihVar.getClass();
            w0(pihVar);
            m0();
        }
    }

    public abstract void m0();

    public final void o0() {
        int i = this.T0;
        if (i == 1) {
            R();
            return;
        }
        if (i == 2) {
            R();
            C0();
        } else if (i != 3) {
            this.a1 = true;
            s0();
        } else {
            r0();
            c0();
        }
    }

    @Override // defpackage.at2
    public boolean p() {
        if (this.C == null) {
            return false;
        }
        if (q() || this.J0 >= 0) {
            return true;
        }
        if (this.H0 == -9223372036854775807L) {
            return false;
        }
        this.g.getClass();
        return SystemClock.elapsedRealtime() < this.H0;
    }

    public abstract boolean p0(long j, long j2, iih iihVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, dsc dscVar);

    public final boolean q0(int i) {
        qdc qdcVar = this.c;
        qdcVar.s();
        qg7 qg7Var = this.v;
        qg7Var.z();
        int D = D(qdcVar, qg7Var, i | 4);
        if (D == -5) {
            i0(qdcVar);
            return true;
        }
        if (D != -4 || !qg7Var.f(4)) {
            return false;
        }
        this.Z0 = true;
        o0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0() {
        try {
            iih iihVar = this.L;
            if (iihVar != null) {
                iihVar.a();
                this.e1.b++;
                mih mihVar = this.y0;
                mihVar.getClass();
                h0(mihVar.a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void s0();

    public void t0() {
        this.I0 = -1;
        this.w.i = null;
        this.J0 = -1;
        this.K0 = null;
        this.H0 = -9223372036854775807L;
        this.V0 = false;
        this.G0 = -9223372036854775807L;
        this.U0 = false;
        this.D0 = false;
        this.E0 = false;
        this.L0 = false;
        this.M0 = false;
        this.X0 = -9223372036854775807L;
        this.Y0 = -9223372036854775807L;
        this.g1 = -9223372036854775807L;
        this.S0 = 0;
        this.T0 = 0;
        this.R0 = this.Q0 ? 1 : 0;
    }

    @Override // defpackage.at2
    public void u() {
        this.C = null;
        w0(pih.e);
        this.A.clear();
        S();
    }

    public final void u0() {
        t0();
        this.d1 = null;
        this.w0 = null;
        this.y0 = null;
        this.X = null;
        this.Y = null;
        this.Z = false;
        this.W0 = false;
        this.v0 = -1.0f;
        this.z0 = 0;
        this.A0 = false;
        this.B0 = false;
        this.C0 = false;
        this.F0 = false;
        this.Q0 = false;
        this.R0 = 0;
    }

    public final void v0(zqa zqaVar) {
        zqa.w(this.E, zqaVar);
        this.E = zqaVar;
    }

    @Override // defpackage.at2
    public void w(long j, boolean z) {
        this.Z0 = false;
        this.a1 = false;
        this.c1 = false;
        if (this.N0) {
            this.y.z();
            this.x.z();
            this.O0 = false;
            rnj rnjVar = this.B;
            rnjVar.getClass();
            rnjVar.d = vx1.a;
            rnjVar.c = 0;
            rnjVar.b = 2;
        } else if (S()) {
            c0();
        }
        if (this.f1.d.h() > 0) {
            this.b1 = true;
        }
        this.f1.d.b();
        this.A.clear();
    }

    public final void w0(pih pihVar) {
        this.f1 = pihVar;
        if (pihVar.c != -9223372036854775807L) {
            this.h1 = true;
            k0();
        }
    }

    public boolean x0(qg7 qg7Var) {
        return false;
    }

    public boolean y0(mih mihVar) {
        return true;
    }

    public boolean z0(dsc dscVar) {
        return false;
    }

    public void k0() {
    }

    public void n0(qg7 qg7Var) {
    }
}
