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
public abstract class ho7 extends at2 {
    public static final byte[] n1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final qg7 A;
    public float A0;
    public final qg7 B;
    public boolean B0;
    public final qg7 C;
    public zrb C0;
    public final yv2 D;
    public long D0;
    public final MediaCodec.BufferInfo E;
    public int E0;
    public final ArrayDeque F;
    public boolean F0;
    public iih G;
    public boolean G0;
    public dsc H;
    public boolean H0;
    public MediaFormat I;
    public boolean I0;
    public ArrayDeque J;
    public boolean J0;
    public hs2 K;
    public boolean K0;
    public mih L;
    public long L0;
    public int M0;
    public int N0;
    public hr4 O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public int V0;
    public int W0;
    public MediaCrypto X;
    public int X0;
    public final long Y;
    public boolean Y0;
    public float Z;
    public boolean Z0;
    public boolean a1;
    public long b1;
    public long c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public ig7 h1;
    public is2 i1;
    public long j1;
    public boolean k1;
    public boolean l1;
    public tq4 m1;
    public final rnj r;
    public dsc s;
    public dsc t;
    public zqa u;
    public zqa v;
    public float v0;
    public final gih w;
    public ByteBuffer w0;
    public final rih x;
    public pqb x0;
    public final boolean y;
    public boolean y0;
    public final float z;
    public boolean z0;

    public ho7(int i, gih gihVar, rih rihVar, boolean z, float f) {
        super(i);
        this.w = gihVar;
        rihVar.getClass();
        this.x = rihVar;
        this.y = z;
        this.z = f;
        this.A = new qg7(0);
        this.B = new qg7(0);
        this.C = new qg7(2);
        yv2 yv2Var = new yv2();
        this.D = yv2Var;
        this.E = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.v0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.F = new ArrayDeque();
        this.i1 = is2.e;
        yv2Var.B(0);
        yv2Var.i.order(ByteOrder.nativeOrder());
        this.r = new rnj(0);
        this.A0 = -1.0f;
        this.E0 = 0;
        this.V0 = 0;
        this.M0 = -1;
        this.N0 = -1;
        this.L0 = -9223372036854775807L;
        this.b1 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        this.j1 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.W0 = 0;
        this.X0 = 0;
        this.h1 = new ig7();
        this.l1 = false;
        this.m1 = tq4.e;
    }

    public boolean A0(dsc dscVar) {
        return false;
    }

    public abstract int B0(rih rihVar, dsc dscVar);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // defpackage.at2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(dsc[] dscVarArr, long j, long j2, uvh uvhVar) {
        if (this.i1.c == -9223372036854775807L) {
            x0(new is2(-9223372036854775807L, j, j2));
            return;
        }
        ArrayDeque arrayDeque = this.F;
        if (arrayDeque.isEmpty()) {
            long j3 = this.b1;
            if (j3 != -9223372036854775807L) {
                long j4 = this.j1;
                if (j4 != -9223372036854775807L) {
                }
            }
            x0(new is2(-9223372036854775807L, j, j2));
            if (this.i1.c != -9223372036854775807L) {
                n0();
                return;
            }
            return;
        }
        arrayDeque.add(new is2(this.b1, j, j2));
    }

    public final boolean C0(dsc dscVar) {
        if (dvt.a >= 23 && this.G != null && this.X0 != 3 && this.h != 0) {
            float f = this.v0;
            dscVar.getClass();
            dsc[] dscVarArr = this.j;
            dscVarArr.getClass();
            float W = W(f, dscVarArr);
            float f2 = this.A0;
            if (f2 != W) {
                if (W == -1.0f) {
                    if (this.Y0) {
                        this.W0 = 1;
                        this.X0 = 3;
                        return false;
                    }
                    s0();
                    d0();
                    return false;
                }
                if (f2 != -1.0f || W > this.z) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", W);
                    iih iihVar = this.G;
                    iihVar.getClass();
                    iihVar.b(bundle);
                    this.A0 = W;
                }
            }
        }
        return true;
    }

    public final void D0() {
        vvc v = this.v.v();
        if (v != null) {
            try {
                MediaCrypto mediaCrypto = this.X;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(v.b);
            } catch (MediaCryptoException e) {
                throw h(e, this.s, false, 6006);
            }
        }
        w0(this.v);
        this.W0 = 0;
        this.X0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0078 A[LOOP:1: B:34:0x0053->B:43:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079 A[EDGE_INSN: B:44:0x0079->B:45:0x0079 BREAK  A[LOOP:1: B:34:0x0053->B:43:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1 A[LOOP:2: B:46:0x0081->B:55:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2 A[EDGE_INSN: B:56:0x00a2->B:57:0x00a2 BREAK  A[LOOP:2: B:46:0x0081->B:55:0x00a1], SYNTHETIC] */
    @Override // defpackage.at2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(long j, long j2) {
        boolean z;
        boolean z2;
        if (this.g1) {
            this.g1 = false;
            p0();
        }
        pqb pqbVar = this.x0;
        if (pqbVar != null) {
            this.x0 = null;
            throw pqbVar;
        }
        try {
            if (this.e1) {
                t0();
                return;
            }
            if (this.s != null || r0(2)) {
                d0();
                if (this.R0) {
                    Trace.beginSection("bypassRender");
                    while (K(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.G != null) {
                    this.g.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainOutput");
                    while (P(j, j2)) {
                        long j3 = this.Y;
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
                    Trace.endSection();
                    Trace.beginSection("feedInput");
                    while (Q()) {
                        long j4 = this.Y;
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
                    this.h1.d += H(j);
                    r0(1);
                }
                synchronized (this.h1) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw h(e, this.s, false, dvt.D(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            Z(e2);
        }
    }

    public final void E0(long j) {
        dsc dscVar = (dsc) this.i1.d.f(j);
        if (dscVar == null && this.k1 && this.I != null) {
            dscVar = (dsc) this.i1.d.e();
        }
        if (dscVar != null) {
            this.t = dscVar;
        } else if (!this.z0 || this.t == null) {
            return;
        }
        dsc dscVar2 = this.t;
        dscVar2.getClass();
        k0(dscVar2, this.I);
        this.z0 = false;
        this.k1 = false;
    }

    public final void F0(IllegalStateException illegalStateException) {
        g0(illegalStateException);
        boolean z = (illegalStateException instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        if (z) {
            s0();
        }
        lih M = M(illegalStateException, this.L);
        throw h(M, this.s, z, M.c == 1101 ? 4006 : 4003);
    }

    @Override // defpackage.at2
    public void G(float f, float f2) {
        this.Z = f;
        this.v0 = f2;
        C0(this.H);
    }

    @Override // defpackage.at2
    public final int I(dsc dscVar) {
        try {
            return B0(this.x, dscVar);
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
        vq1.A(!this.e1);
        yv2 yv2Var2 = this.D;
        if (yv2Var2.E()) {
            ByteBuffer byteBuffer = yv2Var2.i;
            int i = this.N0;
            int i2 = yv2Var2.o;
            long j3 = yv2Var2.k;
            boolean c0 = c0(this.l, yv2Var2.n);
            boolean f = yv2Var2.f(4);
            dsc dscVar = this.t;
            dscVar.getClass();
            yv2Var = yv2Var2;
            if (!q0(j, j2, null, byteBuffer, i, 0, i2, j3, c0, f, dscVar)) {
                return false;
            }
            m0(yv2Var.n);
            yv2Var.z();
        } else {
            yv2Var = yv2Var2;
        }
        if (this.d1) {
            this.e1 = true;
            return false;
        }
        boolean z = this.S0;
        qg7 qg7Var = this.C;
        if (z) {
            vq1.A(yv2Var.D(qg7Var));
            this.S0 = false;
        }
        if (this.T0) {
            if (yv2Var.E()) {
                return true;
            }
            N();
            this.T0 = false;
            d0();
            if (!this.R0) {
                return false;
            }
        }
        vq1.A(!this.d1);
        qdc qdcVar = this.c;
        qdcVar.s();
        qg7Var.z();
        do {
            qg7Var.z();
            int D = D(qdcVar, qg7Var, 0);
            if (D == -5) {
                j0(qdcVar);
                break;
            }
            if (D == -4) {
                if (!qg7Var.f(4)) {
                    this.b1 = Math.max(this.b1, qg7Var.k);
                    if (l() || this.B.f(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
                        this.c1 = this.b1;
                    }
                    if (this.f1) {
                        dsc dscVar2 = this.s;
                        dscVar2.getClass();
                        this.t = dscVar2;
                        if (Objects.equals(dscVar2.n, "audio/opus") && !this.t.q.isEmpty()) {
                            int N = u7g.N((byte[]) this.t.q.get(0));
                            bsc a = this.t.a();
                            a.F = N;
                            this.t = new dsc(a);
                        }
                        k0(this.t, null);
                        this.f1 = false;
                    }
                    qg7Var.C();
                    dsc dscVar3 = this.t;
                    if (dscVar3 != null && Objects.equals(dscVar3.n, "audio/opus")) {
                        if (qg7Var.f(268435456)) {
                            qg7Var.g = this.t;
                            a0(qg7Var);
                        }
                        if (u7g.R(this.l, qg7Var.k)) {
                            this.r.q(qg7Var, this.t.q);
                        }
                    }
                    if (yv2Var.E()) {
                        long j4 = this.l;
                        if (c0(j4, yv2Var.n) != c0(j4, qg7Var.k)) {
                            break;
                        }
                    }
                } else {
                    this.d1 = true;
                    this.c1 = this.b1;
                    break;
                }
            } else {
                if (D != -3) {
                    e7o.n();
                    return false;
                }
                if (l()) {
                    this.c1 = this.b1;
                }
            }
        } while (yv2Var.D(qg7Var));
        this.S0 = true;
        if (yv2Var.E()) {
            yv2Var.C();
        }
        return yv2Var.E() || this.d1 || this.T0;
    }

    public abstract tg7 L(mih mihVar, dsc dscVar, dsc dscVar2);

    public lih M(IllegalStateException illegalStateException, mih mihVar) {
        return new lih(illegalStateException, mihVar);
    }

    public final void N() {
        this.T0 = false;
        this.D.z();
        this.C.z();
        this.S0 = false;
        this.R0 = false;
        rnj rnjVar = this.r;
        rnjVar.getClass();
        rnjVar.d = vx1.a;
        rnjVar.c = 0;
        rnjVar.b = 2;
    }

    public final boolean O() {
        if (!this.Y0) {
            D0();
            return true;
        }
        this.W0 = 1;
        if (this.G0) {
            this.X0 = 3;
            return false;
        }
        this.X0 = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P(long j, long j2) {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean q0;
        ByteBuffer byteBuffer;
        int i;
        int i2;
        long j3;
        boolean z3;
        boolean z4;
        dsc dscVar;
        int t;
        iih iihVar = this.G;
        iihVar.getClass();
        int i3 = this.N0;
        MediaCodec.BufferInfo bufferInfo2 = this.E;
        if (i3 < 0) {
            try {
                if (this.H0) {
                    try {
                        if (this.Z0) {
                            Trace.beginSection("dequeueOutputBufferIndex");
                            t = iihVar.t(bufferInfo2);
                            if (t >= 0) {
                                if (t == -2) {
                                    this.a1 = true;
                                    iih iihVar2 = this.G;
                                    iihVar2.getClass();
                                    MediaFormat d = iihVar2.d();
                                    if (this.E0 != 0 && d.getInteger(CameraProperty.WIDTH) == 32 && d.getInteger(CameraProperty.HEIGHT) == 32) {
                                        this.J0 = true;
                                        return true;
                                    }
                                    this.I = d;
                                    this.z0 = true;
                                    return true;
                                }
                                if (this.K0 && (this.d1 || this.W0 == 2)) {
                                    p0();
                                }
                                long j4 = this.D0;
                                if (j4 != -9223372036854775807L) {
                                    long j5 = j4 + 100;
                                    this.g.getClass();
                                    if (j5 < System.currentTimeMillis()) {
                                        p0();
                                        return false;
                                    }
                                }
                                return false;
                            }
                            if (this.J0) {
                                this.J0 = false;
                                iihVar.k(t);
                                return true;
                            }
                            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                p0();
                                return false;
                            }
                            this.N0 = t;
                            ByteBuffer m = iihVar.m(t);
                            this.w0 = m;
                            if (m != null) {
                                m.position(bufferInfo2.offset);
                                this.w0.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j6 = bufferInfo2.presentationTimeUs;
                            this.P0 = j6 < this.l;
                            long j7 = this.c1;
                            this.Q0 = j7 != -9223372036854775807L && j7 <= j6;
                            E0(j6);
                        }
                    } catch (IllegalStateException unused) {
                        p0();
                        if (this.e1) {
                            s0();
                        }
                        return false;
                    } finally {
                    }
                }
                Trace.beginSection("dequeueOutputBufferIndex");
                t = iihVar.t(bufferInfo2);
                if (t >= 0) {
                }
            } finally {
            }
        }
        try {
            if (this.H0) {
                try {
                    if (this.Z0) {
                        try {
                            Trace.beginSection("processOutputBuffer");
                            byteBuffer = this.w0;
                            i = this.N0;
                            i2 = bufferInfo2.flags;
                            j3 = bufferInfo2.presentationTimeUs;
                            z3 = this.P0;
                            z4 = this.Q0;
                            dscVar = this.t;
                            dscVar.getClass();
                            z = true;
                            z2 = false;
                            bufferInfo = bufferInfo2;
                        } catch (IllegalStateException unused2) {
                            z2 = false;
                        }
                        try {
                            q0 = q0(j, j2, iihVar, byteBuffer, i, i2, 1, j3, z3, z4, dscVar);
                            if (q0) {
                                return z2;
                            }
                            m0(bufferInfo.presentationTimeUs);
                            boolean z5 = (bufferInfo.flags & 4) != 0 ? z : z2;
                            if (!z5 && this.Z0 && this.Q0) {
                                this.g.getClass();
                                this.D0 = System.currentTimeMillis();
                            }
                            this.N0 = -1;
                            this.w0 = null;
                            if (!z5) {
                                return z;
                            }
                            p0();
                            return z2;
                        } catch (IllegalStateException unused3) {
                            p0();
                            if (this.e1) {
                                s0();
                            }
                            return z2;
                        }
                    }
                } finally {
                }
            }
            Trace.beginSection("processOutputBuffer");
            ByteBuffer byteBuffer2 = this.w0;
            int i4 = this.N0;
            int i5 = bufferInfo.flags;
            long j8 = bufferInfo.presentationTimeUs;
            boolean z6 = this.P0;
            boolean z7 = this.Q0;
            dsc dscVar2 = this.t;
            dscVar2.getClass();
            q0 = q0(j, j2, iihVar, byteBuffer2, i4, i5, 1, j8, z6, z7, dscVar2);
            if (q0) {
            }
        } finally {
        }
        z = true;
        z2 = false;
        bufferInfo = bufferInfo2;
    }

    public final boolean Q() {
        iih iihVar = this.G;
        if (iihVar != null && this.W0 != 2 && !this.d1) {
            int i = this.M0;
            qg7 qg7Var = this.B;
            if (i < 0) {
                int s = iihVar.s();
                this.M0 = s;
                if (s >= 0) {
                    qg7Var.i = iihVar.i(s);
                    qg7Var.z();
                }
            }
            if (this.W0 == 1) {
                if (!this.K0) {
                    this.Z0 = true;
                    iihVar.c(this.M0, 0, 0L, 4);
                    this.M0 = -1;
                    qg7Var.i = null;
                }
                this.W0 = 2;
                return false;
            }
            if (this.I0) {
                this.I0 = false;
                ByteBuffer byteBuffer = qg7Var.i;
                byteBuffer.getClass();
                byteBuffer.put(n1);
                iihVar.c(this.M0, 38, 0L, 0);
                this.M0 = -1;
                qg7Var.i = null;
                this.Y0 = true;
                return true;
            }
            if (this.V0 == 1) {
                int i2 = 0;
                while (true) {
                    dsc dscVar = this.H;
                    dscVar.getClass();
                    if (i2 >= dscVar.q.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.H.q.get(i2);
                    ByteBuffer byteBuffer2 = qg7Var.i;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.V0 = 2;
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
                        this.c1 = this.b1;
                        return false;
                    }
                } else {
                    if (D == -5) {
                        if (this.V0 == 2) {
                            qg7Var.z();
                            this.V0 = 1;
                        }
                        j0(qdcVar);
                        return true;
                    }
                    if (!qg7Var.f(4)) {
                        if (!this.Y0 && !qg7Var.f(1)) {
                            qg7Var.z();
                            if (this.V0 == 2) {
                                this.V0 = 1;
                                return true;
                            }
                        } else if (!y0(qg7Var)) {
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
                            if (this.f1) {
                                ArrayDeque arrayDeque = this.F;
                                if (arrayDeque.isEmpty()) {
                                    lis lisVar = this.i1.d;
                                    dsc dscVar2 = this.s;
                                    dscVar2.getClass();
                                    lisVar.a(j, dscVar2);
                                } else {
                                    lis lisVar2 = ((is2) arrayDeque.peekLast()).d;
                                    dsc dscVar3 = this.s;
                                    dscVar3.getClass();
                                    lisVar2.a(j, dscVar3);
                                }
                                this.f1 = false;
                            }
                            this.b1 = Math.max(this.b1, j);
                            if (l() || qg7Var.f(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
                                this.c1 = this.b1;
                            }
                            qg7Var.C();
                            if (qg7Var.f(268435456)) {
                                a0(qg7Var);
                            }
                            o0(qg7Var);
                            int U = U(qg7Var);
                            if (f) {
                                Trace.beginSection("queueSecureInputBuffer");
                                iihVar.f(this.M0, qg7Var.h, j, U);
                            } else {
                                Trace.beginSection("queueInputBuffer");
                                int i3 = this.M0;
                                ByteBuffer byteBuffer4 = qg7Var.i;
                                byteBuffer4.getClass();
                                iihVar.c(i3, byteBuffer4.limit(), j, U);
                            }
                            Trace.endSection();
                            this.M0 = -1;
                            qg7Var.i = null;
                            this.Y0 = true;
                            this.V0 = 0;
                            this.h1.c++;
                            return true;
                        }
                        return true;
                    }
                    this.c1 = this.b1;
                    if (this.V0 == 2) {
                        qg7Var.z();
                        this.V0 = 1;
                    }
                    this.d1 = true;
                    if (!this.Y0) {
                        p0();
                        return false;
                    }
                    if (!this.K0) {
                        this.Z0 = true;
                        Trace.beginSection("queueEosBuffer");
                        iihVar.c(this.M0, 0, 0L, 4);
                        this.M0 = -1;
                        qg7Var.i = null;
                        Trace.endSection();
                        return false;
                    }
                }
            } catch (pg7 e) {
                g0(e);
                r0(0);
                R();
                return true;
            }
        }
        return false;
    }

    public final void R() {
        try {
            iih iihVar = this.G;
            vq1.B(iihVar);
            iihVar.flush();
        } finally {
            u0();
        }
    }

    public boolean S() {
        if (this.G == null) {
            return false;
        }
        int i = this.X0;
        if (i == 3 || ((this.F0 && !this.a1) || (this.G0 && this.Z0))) {
            s0();
            return true;
        }
        if (i == 2) {
            int i2 = dvt.a;
            vq1.A(i2 >= 23);
            if (i2 >= 23) {
                try {
                    D0();
                } catch (pqb e) {
                    vq1.o0("BaseMediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    s0();
                    return true;
                }
            }
        }
        R();
        return false;
    }

    public final List T(boolean z) {
        dsc dscVar = this.s;
        dscVar.getClass();
        rih rihVar = this.x;
        ArrayList X = X(rihVar, dscVar, z);
        if (!X.isEmpty() || !z) {
            return X;
        }
        ArrayList X2 = X(rihVar, dscVar, false);
        if (!X2.isEmpty()) {
            vq1.n0("BaseMediaCodecRenderer", "Drm session requires secure decoder for " + dscVar.n + ", but no secure decoder available. Trying to proceed with " + X2 + ".");
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

    public void Z(IllegalStateException illegalStateException) {
        if (!(illegalStateException instanceof MediaCodec.CodecException)) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            if (stackTrace.length <= 0) {
                throw illegalStateException;
            }
            if (!stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                throw illegalStateException;
            }
        }
        F0(illegalStateException);
        throw null;
    }

    public abstract void a0(qg7 qg7Var);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(mih mihVar, MediaCrypto mediaCrypto) {
        float W;
        int i;
        hr4 hr4Var;
        dsc dscVar = this.s;
        dscVar.getClass();
        String str = mihVar.a;
        int i2 = dvt.a;
        if (i2 < 23) {
            W = -1.0f;
        } else {
            float f = this.v0;
            dsc[] dscVarArr = this.j;
            dscVarArr.getClass();
            W = W(f, dscVarArr);
        }
        float f2 = W > this.z ? W : -1.0f;
        this.g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        rdk Y = Y(mihVar, dscVar, mediaCrypto, f2);
        if (i2 >= 31) {
            ndl ndlVar = this.f;
            ndlVar.getClass();
            rf0.z(Y, ndlVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            gih gihVar = this.w;
            iih h = (!(gihVar instanceof n0c) || (hr4Var = this.O0) == null) ? gihVar.h(Y) : ((n0c) gihVar).c(Y, hr4Var);
            this.G = h;
            h.p(new ix6(10, this));
            Trace.endSection();
            this.g.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mihVar.e(dscVar)) {
                String c = dsc.c(dscVar);
                Locale locale = Locale.US;
                vq1.n0("BaseMediaCodecRenderer", hrg.s("Format exceeds selected codec's capabilities [", c, ", ", str, "]"));
            }
            this.L = mihVar;
            this.A0 = f2;
            this.H = dscVar;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                    this.E0 = i;
                    this.F0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    this.G0 = (i2 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (this.y0 && str.startsWith("OMX.amlogic.avc.decoder.awesome") && !str.contains("awesome2")) || (this.B0 && str.startsWith("OMX.amlogic.avc.decoder.awesome2"));
                    this.H0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str3 = mihVar.a;
                    this.K0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mihVar.g) || V());
                    this.G.getClass();
                    if (this.h == 2) {
                        this.g.getClass();
                        this.L0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.h1.a++;
                    h0(str, Y, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            if (i2 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i = 1;
                    this.E0 = i;
                    this.F0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    this.G0 = (i2 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (this.y0 && str.startsWith("OMX.amlogic.avc.decoder.awesome") && !str.contains("awesome2")) || (this.B0 && str.startsWith("OMX.amlogic.avc.decoder.awesome2"));
                    this.H0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str32 = mihVar.a;
                    if (i2 <= 25) {
                        this.K0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mihVar.g) || V());
                        this.G.getClass();
                        if (this.h == 2) {
                        }
                        this.h1.a++;
                        h0(str, Y, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    this.K0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mihVar.g) || V());
                    this.G.getClass();
                    if (this.h == 2) {
                    }
                    this.h1.a++;
                    h0(str, Y, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            i = 0;
            this.E0 = i;
            this.F0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
            this.G0 = (i2 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (this.y0 && str.startsWith("OMX.amlogic.avc.decoder.awesome") && !str.contains("awesome2")) || (this.B0 && str.startsWith("OMX.amlogic.avc.decoder.awesome2"));
            this.H0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
            String str322 = mihVar.a;
            this.K0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str322)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str322) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str322) || "OMX.bcm.vdec.avc.tunnel".equals(str322) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str322) || "OMX.bcm.vdec.hevc.tunnel".equals(str322) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str322))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mihVar.g) || V());
            this.G.getClass();
            if (this.h == 2) {
            }
            this.h1.a++;
            h0(str, Y, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean c0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        dsc dscVar = this.t;
        return (dscVar != null && Objects.equals(dscVar.n, "audio/opus") && u7g.R(j, j2)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r7 != 4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        if (r2.s() != null) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0() {
        dsc dscVar;
        MediaCrypto mediaCrypto;
        if (this.G != null || this.R0 || (dscVar = this.s) == null) {
            return;
        }
        String str = dscVar.n;
        boolean z = true;
        if (this.v == null && A0(dscVar)) {
            N();
            boolean equals = "audio/mp4a-latm".equals(str);
            yv2 yv2Var = this.D;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                yv2Var.getClass();
                yv2Var.p = 32;
            } else {
                yv2Var.getClass();
                yv2Var.p = 1;
            }
            this.R0 = true;
            return;
        }
        w0(this.v);
        if (this.u != null) {
            vq1.A(this.X == null);
            zqa zqaVar = this.u;
            vvc v = zqaVar.v();
            if (vvc.c && v != null) {
                int state = zqaVar.getState();
                if (state == 1) {
                    yqa s = zqaVar.s();
                    s.getClass();
                    throw h(s, this.s, false, s.a);
                }
            }
            if (v != null) {
                try {
                    this.X = new MediaCrypto(v.a, v.b);
                } catch (MediaCryptoException e) {
                    throw h(e, this.s, false, 6006);
                }
            }
        }
        try {
            zqa zqaVar2 = this.u;
            if (zqaVar2 != null) {
                if (zqaVar2.getState() != 3) {
                    if (this.u.getState() == 4) {
                    }
                }
                zqa zqaVar3 = this.u;
                vq1.B(str);
                if (zqaVar3.z(str)) {
                    e0(this.X, z);
                    mediaCrypto = this.X;
                    if (mediaCrypto == null && this.G == null) {
                        mediaCrypto.release();
                        this.X = null;
                        return;
                    }
                }
            }
            z = false;
            e0(this.X, z);
            mediaCrypto = this.X;
            if (mediaCrypto == null) {
            }
        } catch (hs2 e2) {
            throw h(e2, dscVar, false, 4001);
        }
    }

    public final void e0(MediaCrypto mediaCrypto, boolean z) {
        tq4 tq4Var = this.m1;
        boolean z2 = this.l1;
        boolean z3 = this.y;
        int i = 0;
        ArrayDeque arrayDeque = null;
        if (!z2 && !tq4Var.a) {
            dsc dscVar = this.s;
            dscVar.getClass();
            if (this.J == null) {
                try {
                    List T = T(z);
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.J = arrayDeque2;
                    if (z3) {
                        arrayDeque2.addAll(T);
                    } else {
                        ArrayList arrayList = (ArrayList) T;
                        if (!arrayList.isEmpty()) {
                            this.J.add((mih) arrayList.get(0));
                        }
                    }
                    this.K = null;
                } catch (wjh e) {
                    throw new hs2(dscVar, e, z, -49998);
                }
            }
            if (this.J.isEmpty()) {
                throw new hs2(dscVar, (wjh) null, z, -49999);
            }
            ArrayDeque arrayDeque3 = this.J;
            arrayDeque3.getClass();
            while (this.G == null) {
                mih mihVar = (mih) arrayDeque3.peekFirst();
                mihVar.getClass();
                if (!f0(dscVar) || !z0(mihVar)) {
                    return;
                }
                try {
                    b0(mihVar, mediaCrypto);
                } catch (Exception e2) {
                    vq1.o0("BaseMediaCodecRenderer", "Failed to initialize decoder: " + mihVar, e2);
                    arrayDeque3.removeFirst();
                    hs2 hs2Var = new hs2(dscVar, e2, z, mihVar);
                    g0(hs2Var);
                    if (this.K == null) {
                        this.K = hs2Var;
                    } else {
                        hs2 hs2Var2 = this.K;
                        this.K = new hs2(hs2Var2.getMessage(), hs2Var2.getCause(), hs2Var2.a, hs2Var2.b, hs2Var2.c, hs2Var2.d);
                    }
                    if (arrayDeque3.isEmpty()) {
                        throw this.K;
                    }
                }
            }
            this.J = null;
            return;
        }
        if (this.J == null) {
            try {
                List T2 = T(z);
                ArrayDeque arrayDeque4 = new ArrayDeque();
                this.J = arrayDeque4;
                if (z3) {
                    arrayDeque4.addAll(T2);
                } else {
                    ArrayList arrayList2 = (ArrayList) T2;
                    if (!arrayList2.isEmpty()) {
                        this.J.add((mih) arrayList2.get(0));
                    }
                }
                this.K = null;
            } catch (wjh e3) {
                throw new hs2(this.s, e3, z, -49998);
            }
        }
        if (this.J.isEmpty()) {
            throw new hs2(this.s, (wjh) null, z, -49999);
        }
        mih mihVar2 = (mih) this.J.peekFirst();
        while (this.G == null) {
            mih mihVar3 = (mih) this.J.peekFirst();
            if (!z0(mihVar3)) {
                return;
            }
            try {
                b0(mihVar3, mediaCrypto);
            } catch (Exception e4) {
                e = e4;
                try {
                    if (!tq4Var.a || mihVar3 != mihVar2) {
                        throw e;
                    }
                    int i2 = i;
                    int i3 = i2;
                    while (tq4Var.b > i2) {
                        i2++;
                        boolean z4 = tq4Var.d;
                        long j = tq4Var.c;
                        if (z4) {
                            Thread.sleep(j * i2);
                        } else {
                            Thread.sleep(j);
                        }
                        try {
                            b0(mihVar3, mediaCrypto);
                            i3 = 1;
                        } catch (Exception e5) {
                            e = e5;
                        }
                    }
                    if (i3 == 0) {
                        throw e;
                    }
                } catch (Exception e6) {
                    vq1.o0("BaseMediaCodecRenderer", "Failed to initialize decoder: " + mihVar3, e6);
                    this.J.removeFirst();
                    hs2 hs2Var3 = new hs2(this.s, e6, z, mihVar3);
                    g0(hs2Var3);
                    hs2 hs2Var4 = this.K;
                    if (hs2Var4 == null) {
                        this.K = hs2Var3;
                    } else {
                        this.K = new hs2(hs2Var4.getMessage(), hs2Var4.getCause(), hs2Var4.a, hs2Var4.b, hs2Var4.c, hs2Var4.d);
                    }
                    if (this.J.isEmpty()) {
                        throw this.K;
                    }
                }
            }
            i = 0;
            arrayDeque = null;
        }
        this.J = arrayDeque;
    }

    public boolean f0(dsc dscVar) {
        return true;
    }

    public abstract void g0(Exception exc);

    public abstract void h0(String str, rdk rdkVar, long j, long j2);

    public abstract void i0(String str);

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
    public tg7 j0(qdc qdcVar) {
        dsc dscVar;
        int i;
        boolean z = true;
        this.f1 = true;
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
        zqa.w(this.v, zqaVar);
        this.v = zqaVar;
        this.s = dscVar;
        if (this.R0) {
            this.T0 = true;
            return null;
        }
        iih iihVar = this.G;
        if (iihVar == null) {
            this.J = null;
            d0();
            return null;
        }
        mih mihVar = this.L;
        mihVar.getClass();
        dsc dscVar3 = this.H;
        dscVar3.getClass();
        zqa zqaVar2 = this.u;
        zqa zqaVar3 = this.v;
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
            if (this.Y0) {
                this.W0 = 1;
                this.X0 = 3;
            } else {
                s0();
                d0();
            }
            return new tg7(mihVar.a, dscVar3, dscVar, 0, 128);
        }
        boolean z2 = this.v != this.u;
        vq1.A(!z2 || dvt.a >= 23);
        tg7 L = L(mihVar, dscVar3, dscVar);
        int i2 = L.d;
        if (i2 != 0) {
            i = 16;
            if (i2 == 1) {
                if (C0(dscVar)) {
                    this.H = dscVar;
                    if (!z2) {
                        if (this.Y0) {
                            this.W0 = 1;
                            if (this.G0) {
                                this.X0 = 3;
                                i = 2;
                            } else {
                                this.X0 = 1;
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
                if (C0(dscVar)) {
                    this.H = dscVar;
                    if (z2) {
                    }
                }
                return (i2 != 0 || (this.G == iihVar && this.X0 != 3)) ? L : new tg7(mihVar.a, dscVar3, dscVar, 0, i);
            }
            if (C0(dscVar)) {
                this.U0 = true;
                this.V0 = 1;
                int i3 = this.E0;
                if (i3 != 2 && (i3 != 1 || dscVar.u != dscVar3.u || dscVar.v != dscVar3.v)) {
                    z = false;
                }
                this.I0 = z;
                this.H = dscVar;
                if (z2) {
                }
            }
            if (i2 != 0) {
            }
        }
        if (this.Y0) {
            this.W0 = 1;
            this.X0 = 3;
        } else {
            s0();
            d0();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    public abstract void k0(dsc dscVar, MediaFormat mediaFormat);

    public void m0(long j) {
        this.j1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.F;
            if (arrayDeque.isEmpty() || j < ((is2) arrayDeque.peek()).a) {
                return;
            }
            is2 is2Var = (is2) arrayDeque.poll();
            is2Var.getClass();
            x0(is2Var);
            n0();
        }
    }

    public abstract void n0();

    @Override // defpackage.at2
    public boolean p() {
        if (this.s == null) {
            return false;
        }
        if (q() || this.N0 >= 0) {
            return true;
        }
        if (this.L0 == -9223372036854775807L) {
            return false;
        }
        this.g.getClass();
        return SystemClock.elapsedRealtime() < this.L0;
    }

    public final void p0() {
        int i = this.X0;
        if (i == 1) {
            R();
            return;
        }
        if (i == 2) {
            R();
            D0();
        } else if (i != 3) {
            this.e1 = true;
            t0();
        } else {
            s0();
            d0();
        }
    }

    public abstract boolean q0(long j, long j2, iih iihVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, dsc dscVar);

    public final boolean r0(int i) {
        qdc qdcVar = this.c;
        qdcVar.s();
        qg7 qg7Var = this.A;
        qg7Var.z();
        int D = D(qdcVar, qg7Var, i | 4);
        if (D == -5) {
            j0(qdcVar);
            return true;
        }
        if (D != -4 || !qg7Var.f(4)) {
            return false;
        }
        this.d1 = true;
        p0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s0() {
        try {
            Trace.beginSection("releaseCodec");
            iih iihVar = this.G;
            if (iihVar != null) {
                iihVar.a();
                this.h1.b++;
                mih mihVar = this.L;
                mihVar.getClass();
                i0(mihVar.a);
            }
            this.G = null;
            try {
                MediaCrypto mediaCrypto = this.X;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.G = null;
            try {
                MediaCrypto mediaCrypto2 = this.X;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void t0();

    @Override // defpackage.at2
    public void u() {
        this.s = null;
        x0(is2.e);
        this.F.clear();
        S();
    }

    public void u0() {
        this.M0 = -1;
        this.B.i = null;
        this.N0 = -1;
        this.w0 = null;
        this.L0 = -9223372036854775807L;
        this.Z0 = false;
        this.D0 = -9223372036854775807L;
        this.Y0 = false;
        this.I0 = false;
        this.J0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.b1 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        this.j1 = -9223372036854775807L;
        this.W0 = 0;
        this.X0 = 0;
        this.V0 = this.U0 ? 1 : 0;
    }

    public final void v0() {
        u0();
        this.x0 = null;
        this.J = null;
        this.L = null;
        this.H = null;
        this.I = null;
        this.z0 = false;
        this.a1 = false;
        this.A0 = -1.0f;
        this.E0 = 0;
        this.F0 = false;
        this.G0 = false;
        this.H0 = false;
        this.K0 = false;
        this.U0 = false;
        this.V0 = 0;
    }

    @Override // defpackage.at2
    public void w(long j, boolean z) {
        this.d1 = false;
        this.e1 = false;
        this.g1 = false;
        if (this.R0) {
            this.D.z();
            this.C.z();
            this.S0 = false;
            rnj rnjVar = this.r;
            rnjVar.getClass();
            rnjVar.d = vx1.a;
            rnjVar.c = 0;
            rnjVar.b = 2;
        } else if (S()) {
            d0();
        }
        if (this.i1.d.h() > 0) {
            this.f1 = true;
        }
        this.i1.d.b();
        this.F.clear();
    }

    public final void w0(zqa zqaVar) {
        zqa.w(this.u, zqaVar);
        this.u = zqaVar;
    }

    public final void x0(is2 is2Var) {
        this.i1 = is2Var;
        if (is2Var.c != -9223372036854775807L) {
            this.k1 = true;
            l0();
        }
    }

    public boolean y0(qg7 qg7Var) {
        return false;
    }

    public abstract boolean z0(mih mihVar);

    public void l0() {
    }

    public void o0(qg7 qg7Var) {
    }
}
