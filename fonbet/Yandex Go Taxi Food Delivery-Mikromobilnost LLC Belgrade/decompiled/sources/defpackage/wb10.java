package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public abstract class wb10 extends a95 {
    public static final byte[] G0 = {0, 0, 1, 103, 66, DerValue.TAG_PRIVATE, PKIBody._KRP, -38, 37, -112, 0, 0, 1, 104, -50, PKIBody._CCP, 19, BlobHeaderStructure.BLOB_VERSION, 0, 0, 1, 101, -120, -124, PKIBody._RP, -50, Alerts.alert_bad_certificate_status_response, 24, -96, 0, Alerts.alert_illegal_parameter, -65, DerValue.tag_UniversalString, 49, -61, 39, 93, Alerts.alert_no_application_protocol};
    public final ef5 A;
    public boolean A0;
    public final MediaCodec.BufferInfo B;
    public ExoPlaybackException B0;
    public final ArrayDeque C;
    public kyg C0;
    public final rv60 D;
    public vb10 D0;
    public a E;
    public long E0;
    public a F;
    public boolean F0;
    public jmm G;
    public jmm H;
    public j I;
    public MediaCrypto J;
    public final long K;
    public float L;
    public float M;
    public pb10 N;
    public a O;
    public MediaFormat P;
    public boolean Q;
    public float R;
    public ArrayDeque S;
    public MediaCodecRenderer$DecoderInitializationException T;
    public sb10 U;
    public int V;
    public boolean W;
    public boolean Z;
    public final mb10 a;
    public boolean a0;
    public final xb10 b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public boolean d0;
    public long e0;
    public long f0;
    public int g0;
    public int h0;
    public ByteBuffer i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public long v0;
    public final float w;
    public long w0;
    public final nyg x;
    public boolean x0;
    public final nyg y;
    public boolean y0;
    public final nyg z;
    public boolean z0;

    public wb10(int i, mb10 mb10Var, xb10 xb10Var, boolean z, float f) {
        super(i);
        this.a = mb10Var;
        xb10Var.getClass();
        this.b = xb10Var;
        this.c = z;
        this.w = f;
        this.x = new nyg(0);
        this.y = new nyg(0);
        this.z = new nyg(2);
        ef5 ef5Var = new ef5();
        this.A = ef5Var;
        this.B = new MediaCodec.BufferInfo();
        this.L = 1.0f;
        this.M = 1.0f;
        this.K = -9223372036854775807L;
        this.C = new ArrayDeque();
        this.D0 = vb10.e;
        ef5Var.f(0);
        ef5Var.w.order(ByteOrder.nativeOrder());
        this.D = new rv60();
        this.R = -1.0f;
        this.V = 0;
        this.p0 = 0;
        this.g0 = -1;
        this.h0 = -1;
        this.f0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.q0 = 0;
        this.r0 = 0;
        this.C0 = new kyg();
    }

    public final boolean A(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        a aVar = this.F;
        return (aVar != null && Objects.equals(aVar.n, "audio/opus") && xub1.e(j, j2)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r7 != 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        if (r2.getError() != null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B() {
        a aVar;
        MediaCrypto mediaCrypto;
        if (this.N != null || this.l0 || (aVar = this.E) == null) {
            return;
        }
        String str = aVar.n;
        boolean z = true;
        if (this.H == null && a0(aVar)) {
            l();
            boolean equals = "audio/mp4a-latm".equals(str);
            ef5 ef5Var = this.A;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                ef5Var.getClass();
                ef5Var.D = 32;
            } else {
                ef5Var.getClass();
                ef5Var.D = 1;
            }
            this.l0 = true;
            return;
        }
        V(this.H);
        if (this.G != null) {
            d6z.x(this.J == null);
            jmm jmmVar = this.G;
            rcf b = jmmVar.b();
            if (pfs.c && (b instanceof pfs)) {
                int state = jmmVar.getState();
                if (state == 1) {
                    DrmSession$DrmSessionException error = jmmVar.getError();
                    error.getClass();
                    throw createRendererException(error, this.E, error.errorCode);
                }
            }
            if (b != null) {
                if (b instanceof pfs) {
                    pfs pfsVar = (pfs) b;
                    try {
                        this.J = new MediaCrypto(pfsVar.a, pfsVar.b);
                    } catch (MediaCryptoException e) {
                        throw createRendererException(e, this.E, 6006);
                    }
                }
            }
        }
        try {
            jmm jmmVar2 = this.G;
            if (jmmVar2 != null) {
                if (jmmVar2.getState() != 3) {
                    if (this.G.getState() == 4) {
                    }
                }
                jmm jmmVar3 = this.G;
                d6z.z(str);
                if (jmmVar3.i(str)) {
                    C(this.J, z);
                    mediaCrypto = this.J;
                    if (mediaCrypto == null && this.N == null) {
                        mediaCrypto.release();
                        this.J = null;
                        return;
                    }
                }
            }
            z = false;
            C(this.J, z);
            mediaCrypto = this.J;
            if (mediaCrypto == null) {
            }
        } catch (MediaCodecRenderer$DecoderInitializationException e2) {
            throw createRendererException(e2, aVar, 4001);
        }
    }

    public final void C(MediaCrypto mediaCrypto, boolean z) {
        a aVar = this.E;
        aVar.getClass();
        if (this.S == null) {
            try {
                List r = r(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.S = arrayDeque;
                if (this.c) {
                    arrayDeque.addAll(r);
                } else {
                    ArrayList arrayList = (ArrayList) r;
                    if (!arrayList.isEmpty()) {
                        this.S.add((sb10) arrayList.get(0));
                    }
                }
                this.T = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(aVar, e, z, -49998);
            }
        }
        if (this.S.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(aVar, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.S;
        arrayDeque2.getClass();
        while (this.N == null) {
            sb10 sb10Var = (sb10) arrayDeque2.peekFirst();
            sb10Var.getClass();
            if (!D(aVar) || !Z(sb10Var)) {
                return;
            }
            try {
                z(sb10Var, mediaCrypto);
            } catch (Exception e2) {
                lk91.k("Failed to initialize decoder: " + sb10Var, e2);
                arrayDeque2.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + sb10Var.a + Extension.FIX_SPACE + aVar, e2, aVar.n, z, sb10Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null, null);
                E(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.T;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.T = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.T = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.mimeType, mediaCodecRenderer$DecoderInitializationException2.secureDecoderRequired, mediaCodecRenderer$DecoderInitializationException2.codecInfo, mediaCodecRenderer$DecoderInitializationException2.diagnosticInfo, mediaCodecRenderer$DecoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.T;
                }
            }
        }
        this.S = null;
    }

    public boolean D(a aVar) {
        return true;
    }

    public abstract void E(Exception exc);

    public abstract void F(long j, long j2, String str);

    public abstract void G(String str);

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0153, code lost:
    
        if (m() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r4.i(r2) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:
    
        if (m() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0141, code lost:
    
        if (m() == false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qyg H(o7s o7sVar) {
        a aVar;
        rcf b;
        rcf b2;
        boolean z = true;
        this.z0 = true;
        a aVar2 = o7sVar.b;
        aVar2.getClass();
        String str = aVar2.n;
        if (str == null) {
            throw createRendererException(new IllegalArgumentException("Sample MIME type is null."), aVar2, 4005);
        }
        if (!str.equals("video/av01") || aVar2.q.isEmpty()) {
            aVar = aVar2;
        } else {
            f7s a = aVar2.a();
            a.p = null;
            aVar = new a(a);
        }
        jmm jmmVar = o7sVar.a;
        jmm.c(this.H, jmmVar);
        this.H = jmmVar;
        this.E = aVar;
        if (this.l0) {
            this.n0 = true;
            return null;
        }
        pb10 pb10Var = this.N;
        if (pb10Var == null) {
            this.S = null;
            B();
            return null;
        }
        sb10 sb10Var = this.U;
        sb10Var.getClass();
        a aVar3 = this.O;
        aVar3.getClass();
        jmm jmmVar2 = this.G;
        jmm jmmVar3 = this.H;
        int i = 2;
        if (jmmVar2 != jmmVar3) {
            if (jmmVar3 != null && jmmVar2 != null && (b = jmmVar3.b()) != null && (b2 = jmmVar2.b()) != null && b.getClass().equals(b2.getClass())) {
                if (b instanceof pfs) {
                    if (jmmVar3.f().equals(jmmVar2.f()) && tw21.a >= 23) {
                        UUID uuid = b87.e;
                        if (!uuid.equals(jmmVar2.f()) && !uuid.equals(jmmVar3.f())) {
                            if (!sb10Var.g) {
                                if (jmmVar3.getState() != 2) {
                                    if (jmmVar3.getState() == 3 || jmmVar3.getState() == 4) {
                                        String str2 = aVar.n;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.s0) {
                this.q0 = 1;
                this.r0 = 3;
            } else {
                R();
                B();
            }
            return new qyg(sb10Var.a, aVar3, aVar, 0, 128);
        }
        boolean z2 = this.H != this.G;
        d6z.x(!z2 || tw21.a >= 23);
        qyg j = j(sb10Var, aVar3, aVar);
        int i2 = j.d;
        if (i2 != 0) {
            if (i2 == 1) {
                if (c0(aVar)) {
                    this.O = aVar;
                    if (!z2) {
                        if (this.s0) {
                            this.q0 = 1;
                            if (this.Z) {
                                this.r0 = 3;
                            } else {
                                this.r0 = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 == 2) {
                if (c0(aVar)) {
                    this.o0 = true;
                    this.p0 = 1;
                    int i3 = this.V;
                    if (i3 != 2 && (i3 != 1 || aVar.u != aVar3.u || aVar.v != aVar3.v)) {
                        z = false;
                    }
                    this.b0 = z;
                    this.O = aVar;
                    if (z2) {
                    }
                }
                i = 16;
            } else {
                if (i2 != 3) {
                    ny61.k();
                    return null;
                }
                if (c0(aVar)) {
                    this.O = aVar;
                    if (z2) {
                    }
                }
                i = 16;
            }
            return i2 == 0 ? (this.N != pb10Var || this.r0 == 3) ? new qyg(sb10Var.a, aVar3, aVar, 0, i) : j : j;
        }
        if (this.s0) {
            this.q0 = 1;
            this.r0 = 3;
        } else {
            R();
            B();
        }
        i = 0;
        if (i2 == 0) {
        }
    }

    public abstract void I(a aVar, MediaFormat mediaFormat);

    public void J() {
    }

    public void K(long j) {
        this.E0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.C;
            if (arrayDeque.isEmpty() || j < ((vb10) arrayDeque.peek()).a) {
                return;
            }
            vb10 vb10Var = (vb10) arrayDeque.poll();
            vb10Var.getClass();
            W(vb10Var);
            L();
        }
    }

    public abstract void L();

    public void M(nyg nygVar) {
    }

    public void N(j jVar) {
    }

    public final void O() {
        int i = this.r0;
        if (i == 1) {
            p();
            return;
        }
        if (i == 2) {
            p();
            d0();
        } else if (i != 3) {
            this.y0 = true;
            S();
        } else {
            R();
            B();
        }
    }

    public abstract boolean P(long j, long j2, pb10 pb10Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, a aVar);

    public final boolean Q(int i) {
        o7s formatHolder = getFormatHolder();
        nyg nygVar = this.x;
        nygVar.d();
        int readSource = readSource(formatHolder, nygVar, i | 4);
        if (readSource == -5) {
            H(formatHolder);
            return true;
        }
        if (readSource != -4 || !nygVar.b(4)) {
            return false;
        }
        this.x0 = true;
        O();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R() {
        try {
            pb10 pb10Var = this.N;
            if (pb10Var != null) {
                pb10Var.release();
                this.C0.b++;
                sb10 sb10Var = this.U;
                sb10Var.getClass();
                G(sb10Var.a);
            }
            this.N = null;
            try {
                MediaCrypto mediaCrypto = this.J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.N = null;
            try {
                MediaCrypto mediaCrypto2 = this.J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void S();

    public void T() {
        this.g0 = -1;
        this.y.w = null;
        this.h0 = -1;
        this.i0 = null;
        this.f0 = -9223372036854775807L;
        this.t0 = false;
        this.e0 = -9223372036854775807L;
        this.s0 = false;
        this.b0 = false;
        this.c0 = false;
        this.j0 = false;
        this.k0 = false;
        this.v0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.q0 = 0;
        this.r0 = 0;
        this.p0 = this.o0 ? 1 : 0;
    }

    public final void U() {
        T();
        this.B0 = null;
        this.S = null;
        this.U = null;
        this.O = null;
        this.P = null;
        this.Q = false;
        this.u0 = false;
        this.R = -1.0f;
        this.V = 0;
        this.W = false;
        this.Z = false;
        this.a0 = false;
        this.d0 = false;
        this.o0 = false;
        this.p0 = 0;
    }

    public final void V(jmm jmmVar) {
        jmm.c(this.G, jmmVar);
        this.G = jmmVar;
    }

    public final void W(vb10 vb10Var) {
        this.D0 = vb10Var;
        if (vb10Var.c != -9223372036854775807L) {
            this.F0 = true;
            J();
        }
    }

    public final boolean X(long j) {
        long j2 = this.K;
        if (j2 == -9223372036854775807L) {
            return true;
        }
        ((o2x0) getClock()).getClass();
        return SystemClock.elapsedRealtime() - j < j2;
    }

    public boolean Y(nyg nygVar) {
        return false;
    }

    public boolean Z(sb10 sb10Var) {
        return true;
    }

    public boolean a0(a aVar) {
        return false;
    }

    public abstract int b0(xb10 xb10Var, a aVar);

    public final boolean c0(a aVar) {
        if (tw21.a >= 23 && this.N != null && this.r0 != 3 && getState() != 0) {
            float f = this.M;
            aVar.getClass();
            float u = u(f, getStreamFormats());
            float f2 = this.R;
            if (f2 != u) {
                if (u == -1.0f) {
                    if (this.s0) {
                        this.q0 = 1;
                        this.r0 = 3;
                        return false;
                    }
                    R();
                    B();
                    return false;
                }
                if (f2 != -1.0f || u > this.w) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", u);
                    pb10 pb10Var = this.N;
                    pb10Var.getClass();
                    pb10Var.setParameters(bundle);
                    this.R = u;
                }
            }
        }
        return true;
    }

    public final void d0() {
        jmm jmmVar = this.H;
        jmmVar.getClass();
        rcf b = jmmVar.b();
        if (b instanceof pfs) {
            try {
                MediaCrypto mediaCrypto = this.J;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((pfs) b).b);
            } catch (MediaCryptoException e) {
                throw createRendererException(e, this.E, 6006);
            }
        }
        V(this.H);
        this.q0 = 0;
        this.r0 = 0;
    }

    public final void e0(long j) {
        a aVar = (a) this.D0.d.f(j);
        if (aVar == null && this.F0 && this.P != null) {
            aVar = (a) this.D0.d.e();
        }
        if (aVar != null) {
            this.F = aVar;
        } else if (!this.Q || this.F == null) {
            return;
        }
        a aVar2 = this.F;
        aVar2.getClass();
        I(aVar2, this.P);
        this.Q = false;
        this.F0 = false;
    }

    @Override // defpackage.fyi0
    public final long getDurationToProgressUs(long j, long j2) {
        return w(j, j2);
    }

    @Override // defpackage.a95, defpackage.xyc0
    public void handleMessage(int i, Object obj) {
        if (i != 11) {
            super.handleMessage(i, obj);
            return;
        }
        j jVar = (j) obj;
        jVar.getClass();
        this.I = jVar;
        N(jVar);
    }

    public final boolean i(long j, long j2) {
        ef5 ef5Var;
        d6z.x(!this.y0);
        ef5 ef5Var2 = this.A;
        if (ef5Var2.l()) {
            ByteBuffer byteBuffer = ef5Var2.w;
            int i = this.h0;
            int i2 = ef5Var2.C;
            long j3 = ef5Var2.y;
            boolean A = A(getLastResetPositionUs(), ef5Var2.B);
            boolean b = ef5Var2.b(4);
            a aVar = this.F;
            aVar.getClass();
            ef5Var = ef5Var2;
            if (!P(j, j2, null, byteBuffer, i, 0, i2, j3, A, b, aVar)) {
                return false;
            }
            K(ef5Var.B);
            ef5Var.d();
        } else {
            ef5Var = ef5Var2;
        }
        if (this.x0) {
            this.y0 = true;
            return false;
        }
        boolean z = this.m0;
        nyg nygVar = this.z;
        if (z) {
            d6z.x(ef5Var.k(nygVar));
            this.m0 = false;
        }
        if (this.n0) {
            if (ef5Var.l()) {
                return true;
            }
            l();
            this.n0 = false;
            B();
            if (!this.l0) {
                return false;
            }
        }
        d6z.x(!this.x0);
        o7s formatHolder = getFormatHolder();
        nygVar.d();
        do {
            nygVar.d();
            int readSource = readSource(formatHolder, nygVar, 0);
            if (readSource == -5) {
                H(formatHolder);
                break;
            }
            if (readSource == -4) {
                if (!nygVar.b(4)) {
                    this.v0 = Math.max(this.v0, nygVar.y);
                    if (hasReadStreamToEnd() || this.y.b(536870912)) {
                        this.w0 = this.v0;
                    }
                    if (this.z0) {
                        a aVar2 = this.E;
                        aVar2.getClass();
                        this.F = aVar2;
                        if (Objects.equals(aVar2.n, "audio/opus") && !this.F.q.isEmpty()) {
                            int d = xub1.d((byte[]) this.F.q.get(0));
                            f7s a = this.F.a();
                            a.F = d;
                            this.F = new a(a);
                        }
                        I(this.F, null);
                        this.z0 = false;
                    }
                    nygVar.j();
                    a aVar3 = this.F;
                    if (aVar3 != null && Objects.equals(aVar3.n, "audio/opus")) {
                        if (nygVar.b(SelfTester_JCP.IMITA)) {
                            nygVar.b = this.F;
                            y(nygVar);
                        }
                        if (xub1.e(getLastResetPositionUs(), nygVar.y)) {
                            this.D.a(nygVar, this.F.q);
                        }
                    }
                    if (ef5Var.l()) {
                        long lastResetPositionUs = getLastResetPositionUs();
                        if (A(lastResetPositionUs, ef5Var.B) != A(lastResetPositionUs, nygVar.y)) {
                            break;
                        }
                    }
                } else {
                    this.x0 = true;
                    this.w0 = this.v0;
                    break;
                }
            } else {
                if (readSource != -3) {
                    ny61.k();
                    return false;
                }
                if (hasReadStreamToEnd()) {
                    this.w0 = this.v0;
                }
            }
        } while (ef5Var.k(nygVar));
        this.m0 = true;
        if (ef5Var.l()) {
            ef5Var.j();
        }
        return ef5Var.l() || this.x0 || this.n0;
    }

    @Override // defpackage.fyi0
    public boolean isReady() {
        if (this.E == null) {
            return false;
        }
        if (isSourceReady() || this.h0 >= 0) {
            return true;
        }
        if (this.f0 == -9223372036854775807L) {
            return false;
        }
        ((o2x0) getClock()).getClass();
        return SystemClock.elapsedRealtime() < this.f0;
    }

    public abstract qyg j(sb10 sb10Var, a aVar, a aVar2);

    public MediaCodecDecoderException k(IllegalStateException illegalStateException, sb10 sb10Var) {
        return new MediaCodecDecoderException(illegalStateException, sb10Var);
    }

    public final void l() {
        this.n0 = false;
        this.A.d();
        this.z.d();
        this.m0 = false;
        this.l0 = false;
        rv60 rv60Var = this.D;
        rv60Var.getClass();
        rv60Var.a = og3.a;
        rv60Var.c = 0;
        rv60Var.b = 2;
    }

    public final boolean m() {
        if (!this.s0) {
            d0();
            return true;
        }
        this.q0 = 1;
        if (this.Z) {
            this.r0 = 3;
            return false;
        }
        this.r0 = 2;
        return true;
    }

    public final boolean n(long j, long j2) {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean P;
        ByteBuffer byteBuffer;
        int i;
        int i2;
        long j3;
        boolean z3;
        boolean z4;
        a aVar;
        int s;
        pb10 pb10Var = this.N;
        pb10Var.getClass();
        int i3 = this.h0;
        MediaCodec.BufferInfo bufferInfo2 = this.B;
        if (i3 < 0) {
            if (this.a0 && this.t0) {
                try {
                    s = pb10Var.s(bufferInfo2);
                } catch (IllegalStateException unused) {
                    O();
                    if (this.y0) {
                        R();
                    }
                }
            } else {
                s = pb10Var.s(bufferInfo2);
            }
            if (s < 0) {
                if (s == -2) {
                    this.u0 = true;
                    pb10 pb10Var2 = this.N;
                    pb10Var2.getClass();
                    MediaFormat outputFormat = pb10Var2.getOutputFormat();
                    if (this.V != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.c0 = true;
                        return true;
                    }
                    this.P = outputFormat;
                    this.Q = true;
                    return true;
                }
                if (this.d0 && (this.x0 || this.q0 == 2)) {
                    O();
                }
                long j4 = this.e0;
                if (j4 != -9223372036854775807L) {
                    long j5 = j4 + 100;
                    ((o2x0) getClock()).getClass();
                    if (j5 < System.currentTimeMillis()) {
                        O();
                        return false;
                    }
                }
                return false;
            }
            if (this.c0) {
                this.c0 = false;
                pb10Var.b(s);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                O();
                return false;
            }
            this.h0 = s;
            ByteBuffer outputBuffer = pb10Var.getOutputBuffer(s);
            this.i0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.i0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.j0 = bufferInfo2.presentationTimeUs < getLastResetPositionUs();
            long j6 = this.w0;
            this.k0 = j6 != -9223372036854775807L && j6 <= bufferInfo2.presentationTimeUs;
            e0(bufferInfo2.presentationTimeUs);
        }
        if (this.a0 && this.t0) {
            try {
                byteBuffer = this.i0;
                i = this.h0;
                i2 = bufferInfo2.flags;
                j3 = bufferInfo2.presentationTimeUs;
                z3 = this.j0;
                z4 = this.k0;
                aVar = this.F;
                aVar.getClass();
                z = false;
                z2 = true;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                P = P(j, j2, pb10Var, byteBuffer, i, i2, 1, j3, z3, z4, aVar);
            } catch (IllegalStateException unused3) {
                O();
                if (!this.y0) {
                    return z;
                }
                R();
                return z;
            }
        } else {
            z = false;
            z2 = true;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.i0;
            int i4 = this.h0;
            int i5 = bufferInfo.flags;
            long j7 = bufferInfo.presentationTimeUs;
            boolean z5 = this.j0;
            boolean z6 = this.k0;
            a aVar2 = this.F;
            aVar2.getClass();
            P = P(j, j2, pb10Var, byteBuffer2, i4, i5, 1, j7, z5, z6, aVar2);
        }
        if (!P) {
            return z;
        }
        K(bufferInfo.presentationTimeUs);
        boolean z7 = (bufferInfo.flags & 4) != 0 ? z2 : z;
        if (!z7 && this.t0 && this.k0) {
            ((o2x0) getClock()).getClass();
            this.e0 = System.currentTimeMillis();
        }
        this.h0 = -1;
        this.i0 = null;
        if (!z7) {
            return z2;
        }
        O();
        return z;
    }

    public final boolean o() {
        pb10 pb10Var = this.N;
        if (pb10Var != null && this.q0 != 2 && !this.x0) {
            int i = this.g0;
            nyg nygVar = this.y;
            if (i < 0) {
                int y = pb10Var.y();
                this.g0 = y;
                if (y >= 0) {
                    nygVar.w = pb10Var.getInputBuffer(y);
                    nygVar.d();
                }
            }
            if (this.q0 == 1) {
                if (!this.d0) {
                    this.t0 = true;
                    pb10Var.a(this.g0, 0, 0L, 4);
                    this.g0 = -1;
                    nygVar.w = null;
                }
                this.q0 = 2;
                return false;
            }
            if (this.b0) {
                this.b0 = false;
                ByteBuffer byteBuffer = nygVar.w;
                byteBuffer.getClass();
                byteBuffer.put(G0);
                pb10Var.a(this.g0, 38, 0L, 0);
                this.g0 = -1;
                nygVar.w = null;
                this.s0 = true;
                return true;
            }
            if (this.p0 == 1) {
                int i2 = 0;
                while (true) {
                    a aVar = this.O;
                    aVar.getClass();
                    if (i2 >= aVar.q.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.O.q.get(i2);
                    ByteBuffer byteBuffer2 = nygVar.w;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.p0 = 2;
            }
            ByteBuffer byteBuffer3 = nygVar.w;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            o7s formatHolder = getFormatHolder();
            try {
                int readSource = readSource(formatHolder, nygVar, 0);
                if (readSource == -3) {
                    if (hasReadStreamToEnd()) {
                        this.w0 = this.v0;
                        return false;
                    }
                } else {
                    if (readSource == -5) {
                        if (this.p0 == 2) {
                            nygVar.d();
                            this.p0 = 1;
                        }
                        H(formatHolder);
                        return true;
                    }
                    if (!nygVar.b(4)) {
                        if (!this.s0 && !nygVar.b(1)) {
                            nygVar.d();
                            if (this.p0 == 2) {
                                this.p0 = 1;
                                return true;
                            }
                        } else if (!Y(nygVar)) {
                            boolean b = nygVar.b(1073741824);
                            if (b) {
                                ucf ucfVar = nygVar.c;
                                if (position == 0) {
                                    ucfVar.getClass();
                                } else {
                                    if (ucfVar.d == null) {
                                        int[] iArr = new int[1];
                                        ucfVar.d = iArr;
                                        ucfVar.i.numBytesOfClearData = iArr;
                                    }
                                    int[] iArr2 = ucfVar.d;
                                    iArr2[0] = iArr2[0] + position;
                                }
                            }
                            long j = nygVar.y;
                            if (this.z0) {
                                ArrayDeque arrayDeque = this.C;
                                if (arrayDeque.isEmpty()) {
                                    w8z0 w8z0Var = this.D0.d;
                                    a aVar2 = this.E;
                                    aVar2.getClass();
                                    w8z0Var.a(j, aVar2);
                                } else {
                                    w8z0 w8z0Var2 = ((vb10) arrayDeque.peekLast()).d;
                                    a aVar3 = this.E;
                                    aVar3.getClass();
                                    w8z0Var2.a(j, aVar3);
                                }
                                this.z0 = false;
                            }
                            this.v0 = Math.max(this.v0, j);
                            if (hasReadStreamToEnd() || nygVar.b(536870912)) {
                                this.w0 = this.v0;
                            }
                            nygVar.j();
                            if (nygVar.b(SelfTester_JCP.IMITA)) {
                                y(nygVar);
                            }
                            M(nygVar);
                            int s = s(nygVar);
                            int i3 = this.g0;
                            if (b) {
                                pb10Var.f(i3, nygVar.c, j, s);
                            } else {
                                ByteBuffer byteBuffer4 = nygVar.w;
                                byteBuffer4.getClass();
                                pb10Var.a(i3, byteBuffer4.limit(), j, s);
                            }
                            this.g0 = -1;
                            nygVar.w = null;
                            this.s0 = true;
                            this.p0 = 0;
                            this.C0.c++;
                            return true;
                        }
                        return true;
                    }
                    this.w0 = this.v0;
                    if (this.p0 == 2) {
                        nygVar.d();
                        this.p0 = 1;
                    }
                    this.x0 = true;
                    if (!this.s0) {
                        O();
                        return false;
                    }
                    if (!this.d0) {
                        this.t0 = true;
                        pb10Var.a(this.g0, 0, 0L, 4);
                        this.g0 = -1;
                        nygVar.w = null;
                        return false;
                    }
                }
            } catch (DecoderInputBuffer$InsufficientCapacityException e) {
                E(e);
                Q(0);
                p();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a95
    public void onDisabled() {
        this.E = null;
        W(vb10.e);
        this.C.clear();
        q();
    }

    @Override // defpackage.a95
    public void onEnabled(boolean z, boolean z2) {
        this.C0 = new kyg();
    }

    @Override // defpackage.a95
    public void onPositionReset(long j, boolean z) {
        this.x0 = false;
        this.y0 = false;
        this.A0 = false;
        if (this.l0) {
            this.A.d();
            this.z.d();
            this.m0 = false;
            rv60 rv60Var = this.D;
            rv60Var.getClass();
            rv60Var.a = og3.a;
            rv60Var.c = 0;
            rv60Var.b = 2;
        } else if (q()) {
            B();
        }
        if (this.D0.d.h() > 0) {
            this.z0 = true;
        }
        this.D0.d.b();
        this.C.clear();
    }

    @Override // defpackage.a95
    public void onReset() {
        try {
            l();
            R();
        } finally {
            jmm.c(this.H, null);
            this.H = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // defpackage.a95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStreamChanged(a[] aVarArr, long j, long j2, sf10 sf10Var) {
        if (this.D0.c == -9223372036854775807L) {
            W(new vb10(-9223372036854775807L, j, j2));
            return;
        }
        ArrayDeque arrayDeque = this.C;
        if (arrayDeque.isEmpty()) {
            long j3 = this.v0;
            if (j3 != -9223372036854775807L) {
                long j4 = this.E0;
                if (j4 != -9223372036854775807L) {
                }
            }
            W(new vb10(-9223372036854775807L, j, j2));
            if (this.D0.c != -9223372036854775807L) {
                L();
                return;
            }
            return;
        }
        arrayDeque.add(new vb10(this.v0, j, j2));
    }

    public final void p() {
        try {
            pb10 pb10Var = this.N;
            d6z.z(pb10Var);
            pb10Var.flush();
        } finally {
            T();
        }
    }

    public final boolean q() {
        if (this.N == null) {
            return false;
        }
        int i = this.r0;
        if (i == 3 || ((this.W && !this.u0) || (this.Z && this.t0))) {
            R();
            return true;
        }
        if (i == 2) {
            int i2 = tw21.a;
            d6z.x(i2 >= 23);
            if (i2 >= 23) {
                try {
                    d0();
                } catch (ExoPlaybackException e) {
                    lk91.k("Failed to update the DRM session, releasing the codec instead.", e);
                    R();
                    return true;
                }
            }
        }
        p();
        return false;
    }

    public final List r(boolean z) {
        a aVar = this.E;
        aVar.getClass();
        xb10 xb10Var = this.b;
        ArrayList v = v(xb10Var, aVar, z);
        if (!v.isEmpty() || !z) {
            return v;
        }
        ArrayList v2 = v(xb10Var, aVar, false);
        if (!v2.isEmpty()) {
            lk91.j("Drm session requires secure decoder for " + aVar.n + ", but no secure decoder available. Trying to proceed with " + v2 + Extension.DOT_CHAR);
        }
        return v2;
    }

    @Override // defpackage.fyi0
    public void render(long j, long j2) {
        boolean z = false;
        if (this.A0) {
            this.A0 = false;
            O();
        }
        ExoPlaybackException exoPlaybackException = this.B0;
        if (exoPlaybackException != null) {
            this.B0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.y0) {
                S();
                return;
            }
            if (this.E != null || Q(2)) {
                B();
                if (this.l0) {
                    Trace.beginSection("bypassRender");
                    while (i(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.N != null) {
                    ((o2x0) getClock()).getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (n(j, j2) && X(elapsedRealtime)) {
                    }
                    while (o() && X(elapsedRealtime)) {
                    }
                    Trace.endSection();
                } else {
                    this.C0.d += skipSource(j);
                    Q(1);
                }
                synchronized (this.C0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw createRendererException(e, this.E, tw21.A(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            E(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                R();
            }
            MediaCodecDecoderException k = k(e2, this.U);
            throw createRendererException(k, this.E, z, k.errorCode == 1101 ? 4006 : 4003);
        }
    }

    public int s(nyg nygVar) {
        return 0;
    }

    @Override // defpackage.fyi0
    public void setPlaybackSpeed(float f, float f2) {
        this.L = f;
        this.M = f2;
        c0(this.O);
    }

    @Override // defpackage.iyi0
    public final int supportsFormat(a aVar) {
        try {
            return b0(this.b, aVar);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw this.createRendererException(e, aVar, 4002);
        }
    }

    @Override // defpackage.a95, defpackage.iyi0
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public boolean t() {
        return false;
    }

    public abstract float u(float f, a[] aVarArr);

    public abstract ArrayList v(xb10 xb10Var, a aVar, boolean z);

    public long w(long j, long j2) {
        return 10000L;
    }

    public abstract lb10 x(sb10 sb10Var, a aVar, MediaCrypto mediaCrypto, float f);

    public abstract void y(nyg nygVar);

    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(sb10 sb10Var, MediaCrypto mediaCrypto) {
        int i;
        boolean equals;
        String stringId;
        LogSessionId unused;
        a aVar = this.E;
        aVar.getClass();
        String str = sb10Var.a;
        int i2 = tw21.a;
        float u = i2 < 23 ? -1.0f : u(this.M, getStreamFormats());
        float f = u > this.w ? u : -1.0f;
        ((o2x0) getClock()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lb10 x = x(sb10Var, aVar, mediaCrypto, f);
        if (i2 >= 31) {
            LogSessionId a = getPlayerId().a();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (!equals) {
                MediaFormat mediaFormat = x.b;
                stringId = a.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            pb10 o = this.a.o(x);
            this.N = o;
            o.i(new reu(29, this));
            Trace.endSection();
            ((o2x0) getClock()).getClass();
            float f2 = f;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!sb10Var.e(aVar)) {
                String c = a.c(aVar);
                Locale locale = Locale.US;
                lk91.j("Format exceeds selected codec's capabilities [" + c + Extension.FIX_SPACE + str + "]");
            }
            this.U = sb10Var;
            this.R = f2;
            this.O = aVar;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                    this.V = i;
                    this.W = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    this.Z = i2 > 23 && "OMX.google.vorbis.decoder".equals(str);
                    this.a0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str3 = sb10Var.a;
                    this.d0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && sb10Var.g) || t());
                    this.N.getClass();
                    if (getState() == 2) {
                        ((o2x0) getClock()).getClass();
                        this.f0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.C0.a++;
                    F(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                }
            }
            if (i2 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i = 1;
                    this.V = i;
                    this.W = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    this.Z = i2 > 23 && "OMX.google.vorbis.decoder".equals(str);
                    this.a0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str32 = sb10Var.a;
                    if (i2 <= 25) {
                        this.d0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && sb10Var.g) || t());
                        this.N.getClass();
                        if (getState() == 2) {
                        }
                        this.C0.a++;
                        F(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                    }
                    this.d0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && sb10Var.g) || t());
                    this.N.getClass();
                    if (getState() == 2) {
                    }
                    this.C0.a++;
                    F(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                }
            }
            i = 0;
            this.V = i;
            this.W = i2 != 29 && "c2.android.aac.decoder".equals(str);
            this.Z = i2 > 23 && "OMX.google.vorbis.decoder".equals(str);
            this.a0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
            String str322 = sb10Var.a;
            this.d0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str322)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str322) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str322) || "OMX.bcm.vdec.avc.tunnel".equals(str322) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str322) || "OMX.bcm.vdec.hevc.tunnel".equals(str322) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str322))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && sb10Var.g) || t());
            this.N.getClass();
            if (getState() == 2) {
            }
            this.C0.a++;
            F(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
