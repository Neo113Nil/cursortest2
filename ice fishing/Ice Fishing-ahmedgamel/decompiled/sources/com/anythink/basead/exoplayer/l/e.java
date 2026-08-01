package com.anythink.basead.exoplayer.l;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.anythink.basead.b.b.j;
import com.anythink.basead.exoplayer.d.k;
import com.anythink.basead.exoplayer.k.ad;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.exoplayer.l.h;
import com.anythink.basead.exoplayer.m;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.anythink.core.common.d.j;
import com.anythink.core.common.n.a.i;
import com.anythink.expressad.foundation.h.p;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class e extends com.anythink.basead.exoplayer.f.b {

    /* renamed from: A, reason: collision with root package name */
    private static boolean f8571A = false;

    /* renamed from: s, reason: collision with root package name */
    private static final String f8572s = "MediaCodecVideoRenderer";

    /* renamed from: t, reason: collision with root package name */
    private static final String f8573t = "crop-left";

    /* renamed from: u, reason: collision with root package name */
    private static final String f8574u = "crop-right";

    /* renamed from: v, reason: collision with root package name */
    private static final String f8575v = "crop-bottom";

    /* renamed from: w, reason: collision with root package name */
    private static final String f8576w = "crop-top";

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f8577x = {1920, 1600, com.onesignal.core.internal.config.e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1280, 960, 854, 640, 540, 480};

    /* renamed from: y, reason: collision with root package name */
    private static final int f8578y = 10;

    /* renamed from: z, reason: collision with root package name */
    private static boolean f8579z;

    /* renamed from: B, reason: collision with root package name */
    private final Context f8580B;

    /* renamed from: C, reason: collision with root package name */
    private final f f8581C;

    /* renamed from: D, reason: collision with root package name */
    private final h.a f8582D;

    /* renamed from: E, reason: collision with root package name */
    private final long f8583E;

    /* renamed from: F, reason: collision with root package name */
    private final int f8584F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f8585G;

    /* renamed from: H, reason: collision with root package name */
    private final long[] f8586H;

    /* renamed from: I, reason: collision with root package name */
    private final long[] f8587I;
    private a J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f8588K;

    /* renamed from: L, reason: collision with root package name */
    private Surface f8589L;

    /* renamed from: M, reason: collision with root package name */
    private Surface f8590M;

    /* renamed from: N, reason: collision with root package name */
    private int f8591N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f8592O;

    /* renamed from: P, reason: collision with root package name */
    private long f8593P;

    /* renamed from: Q, reason: collision with root package name */
    private long f8594Q;

    /* renamed from: R, reason: collision with root package name */
    private long f8595R;

    /* renamed from: S, reason: collision with root package name */
    private int f8596S;

    /* renamed from: T, reason: collision with root package name */
    private int f8597T;

    /* renamed from: U, reason: collision with root package name */
    private int f8598U;

    /* renamed from: V, reason: collision with root package name */
    private long f8599V;

    /* renamed from: W, reason: collision with root package name */
    private int f8600W;

    /* renamed from: X, reason: collision with root package name */
    private float f8601X;
    private int Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f8602Z;
    private int aa;
    private float ab;
    private int ac;
    private int ad;
    private int ae;
    private float af;
    private boolean ag;
    private int ah;
    private long ai;
    private long aj;
    private int ak;

    /* renamed from: r, reason: collision with root package name */
    b f8603r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8604a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8605b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8606c;

        public a(int i, int i6, int i9) {
            this.f8604a = i;
            this.f8605b = i6;
            this.f8606c = i9;
        }
    }

    public final class b implements MediaCodec.OnFrameRenderedListener {
        public /* synthetic */ b(e eVar, MediaCodec mediaCodec, byte b9) {
            this(mediaCodec);
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(MediaCodec mediaCodec, long j6, long j9) {
            e eVar = e.this;
            if (this != eVar.f8603r) {
                return;
            }
            eVar.C();
        }

        private b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    private e(Context context, com.anythink.basead.exoplayer.f.c cVar) {
        this(context, cVar, (byte) 0);
    }

    private void D() {
        this.f8594Q = this.f8583E > 0 ? SystemClock.elapsedRealtime() + this.f8583E : com.anythink.basead.exoplayer.b.f6382b;
    }

    private void E() {
        MediaCodec y7;
        byte b9 = 0;
        this.f8592O = false;
        if (af.f8346a < 23 || !this.ag || (y7 = y()) == null) {
            return;
        }
        this.f8603r = new b(this, y7, b9);
    }

    private void F() {
        if (this.f8592O) {
            this.f8582D.a(this.f8589L);
        }
    }

    private void G() {
        this.ac = -1;
        this.ad = -1;
        this.af = -1.0f;
        this.ae = -1;
    }

    private void H() {
        int i = this.Y;
        if (i == -1 && this.f8602Z == -1) {
            return;
        }
        if (this.ac == i && this.ad == this.f8602Z && this.ae == this.aa && this.af == this.ab) {
            return;
        }
        this.f8582D.a(i, this.f8602Z, this.aa, this.ab);
        this.ac = this.Y;
        this.ad = this.f8602Z;
        this.ae = this.aa;
        this.af = this.ab;
    }

    private void I() {
        int i = this.ac;
        if (i == -1 && this.ad == -1) {
            return;
        }
        this.f8582D.a(i, this.ad, this.ae, this.af);
    }

    private void J() {
        if (this.f8596S > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f8582D.a(this.f8596S, elapsedRealtime - this.f8595R);
            this.f8596S = 0;
            this.f8595R = elapsedRealtime;
        }
    }

    private static boolean K() {
        return af.f8346a <= 22 && "foster".equals(af.f8347b) && "NVIDIA".equals(af.f8348c);
    }

    private static boolean d(long j6) {
        return g(j6);
    }

    private static boolean e(long j6) {
        return j6 < -500000;
    }

    private boolean f(long j6) {
        int b9 = b(j6);
        if (b9 == 0) {
            return false;
        }
        ((com.anythink.basead.exoplayer.f.b) this).f7240q.i++;
        b(this.f8598U + b9);
        B();
        return true;
    }

    private static boolean g(long j6) {
        return j6 < -30000;
    }

    private static boolean h(long j6) {
        return j6 < -500000;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void A() {
        try {
            super.A();
            this.f8598U = 0;
            Surface surface = this.f8590M;
            if (surface != null) {
                if (this.f8589L == surface) {
                    this.f8589L = null;
                }
                surface.release();
                this.f8590M = null;
            }
        } catch (Throwable th) {
            this.f8598U = 0;
            if (this.f8590M != null) {
                Surface surface2 = this.f8589L;
                Surface surface3 = this.f8590M;
                if (surface2 == surface3) {
                    this.f8589L = null;
                }
                surface3.release();
                this.f8590M = null;
            }
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void B() {
        super.B();
        this.f8598U = 0;
    }

    public final void C() {
        if (this.f8592O) {
            return;
        }
        this.f8592O = true;
        this.f8582D.a(this.f8589L);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<k> gVar, m mVar) {
        boolean z3;
        int i;
        int i6;
        String str = mVar.f8665h;
        if (!o.b(str)) {
            return 0;
        }
        com.anythink.basead.exoplayer.d.e eVar = mVar.f8667k;
        if (eVar != null) {
            z3 = false;
            for (int i9 = 0; i9 < eVar.f6845b; i9++) {
                z3 |= eVar.a(i9).f6851d;
            }
        } else {
            z3 = false;
        }
        com.anythink.basead.exoplayer.f.a a9 = cVar.a(str, z3);
        if (a9 == null) {
            return (!z3 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (!com.anythink.basead.exoplayer.a.a(gVar, eVar)) {
            return 2;
        }
        boolean b9 = a9.b(mVar.f8662e);
        if (b9 && (i = mVar.f8669m) > 0 && (i6 = mVar.f8670n) > 0) {
            if (af.f8346a >= 21) {
                b9 = a9.a(i, i6, mVar.f8671o);
            } else {
                boolean z6 = i * i6 <= com.anythink.basead.exoplayer.f.d.b();
                if (!z6) {
                    Log.d(f8572s, "FalseCheck [legacyFrameSize, " + mVar.f8669m + "x" + mVar.f8670n + "] [" + af.f8350e + "]");
                }
                b9 = z6;
            }
        }
        return (b9 ? 4 : 3) | (a9.f7201f ? 16 : 8) | (a9.f7202g ? 32 : 0);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void b(m mVar) {
        super.b(mVar);
        this.f8582D.a(mVar);
        this.f8601X = mVar.f8673q;
        this.f8600W = mVar.f8672p;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void c(long j6) {
        this.f8598U--;
        while (true) {
            int i = this.ak;
            if (i == 0 || j6 < this.f8587I[0]) {
                return;
            }
            long[] jArr = this.f8586H;
            this.aj = jArr[0];
            int i6 = i - 1;
            this.ak = i6;
            System.arraycopy(jArr, 1, jArr, 0, i6);
            long[] jArr2 = this.f8587I;
            System.arraycopy(jArr2, 1, jArr2, 0, this.ak);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void n() {
        super.n();
        this.f8596S = 0;
        this.f8595R = SystemClock.elapsedRealtime();
        this.f8599V = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void o() {
        this.f8594Q = com.anythink.basead.exoplayer.b.f6382b;
        J();
        super.o();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void p() {
        this.Y = -1;
        this.f8602Z = -1;
        this.ab = -1.0f;
        this.f8601X = -1.0f;
        this.aj = com.anythink.basead.exoplayer.b.f6382b;
        this.ai = com.anythink.basead.exoplayer.b.f6382b;
        this.ak = 0;
        G();
        E();
        this.f8581C.b();
        this.f8603r = null;
        this.ag = false;
        try {
            super.p();
        } finally {
            this.f8582D.b(((com.anythink.basead.exoplayer.f.b) this).f7240q);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.y
    public final boolean u() {
        Surface surface;
        if (super.u() && (this.f8592O || (((surface = this.f8590M) != null && this.f8589L == surface) || y() == null || this.ag))) {
            this.f8594Q = com.anythink.basead.exoplayer.b.f6382b;
            return true;
        }
        if (this.f8594Q == com.anythink.basead.exoplayer.b.f6382b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f8594Q) {
            return true;
        }
        this.f8594Q = com.anythink.basead.exoplayer.b.f6382b;
        return false;
    }

    private e(Context context, com.anythink.basead.exoplayer.f.c cVar, byte b9) {
        this(context, cVar, null, null);
    }

    private e(Context context, com.anythink.basead.exoplayer.f.c cVar, Handler handler, h hVar) {
        this(context, cVar, 0L, null, handler, hVar, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, com.anythink.basead.exoplayer.f.c cVar, long j6, com.anythink.basead.exoplayer.d.g<k> gVar, Handler handler, h hVar, int i) {
        super(2, cVar, gVar, false);
        boolean z3 = false;
        this.f8583E = j6;
        this.f8584F = i;
        Context applicationContext = context.getApplicationContext();
        this.f8580B = applicationContext;
        this.f8581C = new f(applicationContext);
        this.f8582D = new h.a(handler, hVar);
        if (af.f8346a <= 22 && "foster".equals(af.f8347b) && "NVIDIA".equals(af.f8348c)) {
            z3 = true;
        }
        this.f8585G = z3;
        this.f8586H = new long[10];
        this.f8587I = new long[10];
        this.aj = com.anythink.basead.exoplayer.b.f6382b;
        this.ai = com.anythink.basead.exoplayer.b.f6382b;
        this.f8594Q = com.anythink.basead.exoplayer.b.f6382b;
        this.Y = -1;
        this.f8602Z = -1;
        this.ab = -1.0f;
        this.f8601X = -1.0f;
        this.f8591N = 1;
        G();
    }

    private static boolean b(long j6, long j9) {
        return g(j6) && j9 > 100000;
    }

    private void b(MediaCodec mediaCodec, int i) {
        ad.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        ad.a();
        b(1);
    }

    private void c(MediaCodec mediaCodec, int i) {
        H();
        ad.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        ad.a();
        this.f8599V = SystemClock.elapsedRealtime() * 1000;
        ((com.anythink.basead.exoplayer.f.b) this).f7240q.f6734e++;
        this.f8597T = 0;
        C();
    }

    private void b(int i) {
        com.anythink.basead.exoplayer.c.d dVar = ((com.anythink.basead.exoplayer.f.b) this).f7240q;
        dVar.f6736g += i;
        this.f8596S += i;
        int i6 = this.f8597T + i;
        this.f8597T = i6;
        dVar.f6737h = Math.max(i6, dVar.f6737h);
        if (this.f8596S >= this.f8584F) {
            J();
        }
    }

    private boolean b(com.anythink.basead.exoplayer.f.a aVar) {
        if (af.f8346a < 23 || this.ag || a(aVar.f7198c)) {
            return false;
        }
        return !aVar.f7203h || c.a(this.f8580B);
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(boolean z3) {
        super.a(z3);
        int i = r().f6310b;
        this.ah = i;
        this.ag = i != 0;
        this.f8582D.a(((com.anythink.basead.exoplayer.f.b) this).f7240q);
        this.f8581C.a();
    }

    private static int b(com.anythink.basead.exoplayer.f.a aVar, m mVar) {
        if (mVar.i != -1) {
            int size = mVar.f8666j.size();
            int i = 0;
            for (int i6 = 0; i6 < size; i6++) {
                i += mVar.f8666j.get(i6).length;
            }
            return mVar.i + i;
        }
        return a(aVar, mVar.f8665h, mVar.f8669m, mVar.f8670n);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(m[] mVarArr, long j6) {
        if (this.aj == com.anythink.basead.exoplayer.b.f6382b) {
            this.aj = j6;
        } else {
            int i = this.ak;
            if (i == this.f8586H.length) {
                Log.w(f8572s, "Too many stream changes, so dropping offset: " + this.f8586H[this.ak - 1]);
            } else {
                this.ak = i + 1;
            }
            long[] jArr = this.f8586H;
            int i6 = this.ak;
            jArr[i6 - 1] = j6;
            this.f8587I[i6 - 1] = this.ai;
        }
        super.a(mVarArr, j6);
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(long j6, boolean z3) {
        super.a(j6, z3);
        E();
        this.f8593P = com.anythink.basead.exoplayer.b.f6382b;
        this.f8597T = 0;
        this.ai = com.anythink.basead.exoplayer.b.f6382b;
        int i = this.ak;
        if (i != 0) {
            this.aj = this.f8586H[i - 1];
            this.ak = 0;
        }
        if (z3) {
            D();
        } else {
            this.f8594Q = com.anythink.basead.exoplayer.b.f6382b;
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i != 1) {
            if (i == 4) {
                this.f8591N = ((Integer) obj).intValue();
                MediaCodec y7 = y();
                if (y7 != null) {
                    y7.setVideoScalingMode(this.f8591N);
                    return;
                }
                return;
            }
            super.a(i, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.f8590M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.anythink.basead.exoplayer.f.a z3 = z();
                if (z3 != null && b(z3)) {
                    surface = c.a(this.f8580B, z3.f7203h);
                    this.f8590M = surface;
                }
            }
        }
        if (this.f8589L != surface) {
            this.f8589L = surface;
            int a_ = a_();
            if (a_ == 1 || a_ == 2) {
                MediaCodec y9 = y();
                if (af.f8346a >= 23 && y9 != null && surface != null && !this.f8588K) {
                    y9.setOutputSurface(surface);
                } else {
                    A();
                    x();
                }
            }
            if (surface != null && surface != this.f8590M) {
                I();
                E();
                if (a_ == 2) {
                    D();
                    return;
                }
                return;
            }
            G();
            E();
            return;
        }
        if (surface == null || surface == this.f8590M) {
            return;
        }
        I();
        if (this.f8592O) {
            this.f8582D.a(this.f8589L);
        }
    }

    private void a(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f8590M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.anythink.basead.exoplayer.f.a z3 = z();
                if (z3 != null && b(z3)) {
                    surface = c.a(this.f8580B, z3.f7203h);
                    this.f8590M = surface;
                }
            }
        }
        if (this.f8589L != surface) {
            this.f8589L = surface;
            int a_ = a_();
            if (a_ == 1 || a_ == 2) {
                MediaCodec y7 = y();
                if (af.f8346a >= 23 && y7 != null && surface != null && !this.f8588K) {
                    y7.setOutputSurface(surface);
                } else {
                    A();
                    x();
                }
            }
            if (surface != null && surface != this.f8590M) {
                I();
                E();
                if (a_ == 2) {
                    D();
                    return;
                }
                return;
            }
            G();
            E();
            return;
        }
        if (surface == null || surface == this.f8590M) {
            return;
        }
        I();
        if (this.f8592O) {
            this.f8582D.a(this.f8589L);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final boolean a(com.anythink.basead.exoplayer.f.a aVar) {
        return this.f8589L != null || b(aVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.f.a aVar, MediaCodec mediaCodec, m mVar, MediaCrypto mediaCrypto) {
        a aVar2;
        m[] q8 = q();
        int i = mVar.f8669m;
        int i6 = mVar.f8670n;
        int b9 = b(aVar, mVar);
        byte b10 = 0;
        if (q8.length == 1) {
            aVar2 = new a(i, i6, b9);
        } else {
            boolean z3 = false;
            for (m mVar2 : q8) {
                if (a(aVar.f7201f, mVar, mVar2)) {
                    int i9 = mVar2.f8669m;
                    z3 |= i9 == -1 || mVar2.f8670n == -1;
                    i = Math.max(i, i9);
                    i6 = Math.max(i6, mVar2.f8670n);
                    b9 = Math.max(b9, b(aVar, mVar2));
                }
            }
            if (z3) {
                Log.w(f8572s, "Resolutions unknown. Codec max resolution: " + i + "x" + i6);
                Point a9 = a(aVar, mVar);
                if (a9 != null) {
                    i = Math.max(i, a9.x);
                    i6 = Math.max(i6, a9.y);
                    b9 = Math.max(b9, a(aVar, mVar.f8665h, i, i6));
                    Log.w(f8572s, "Codec max resolution adjusted to: " + i + "x" + i6);
                }
            }
            aVar2 = new a(i, i6, b9);
        }
        this.J = aVar2;
        boolean z6 = this.f8585G;
        int i10 = this.ah;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f8665h);
        mediaFormat.setInteger("width", mVar.f8669m);
        mediaFormat.setInteger("height", mVar.f8670n);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f8666j);
        float f3 = mVar.f8671o;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "rotation-degrees", mVar.f8672p);
        com.anythink.basead.exoplayer.l.b bVar = mVar.f8676t;
        if (bVar != null) {
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-transfer", bVar.f8551c);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-standard", bVar.f8549a);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-range", bVar.f8550b);
            byte[] bArr = bVar.f8552d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar2.f8604a);
        mediaFormat.setInteger("max-height", aVar2.f8605b);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", aVar2.f8606c);
        int i11 = af.f8346a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z6) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (this.f8589L == null) {
            com.anythink.basead.exoplayer.k.a.b(b(aVar));
            if (this.f8590M == null) {
                this.f8590M = c.a(this.f8580B, aVar.f7203h);
            }
            this.f8589L = this.f8590M;
        }
        mediaCodec.configure(mediaFormat, this.f8589L, mediaCrypto, 0);
        if (i11 < 23 || !this.ag) {
            return;
        }
        this.f8603r = new b(this, mediaCodec, b10);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.a aVar, m mVar, m mVar2) {
        if (!a(aVar.f7201f, mVar, mVar2)) {
            return 0;
        }
        int i = mVar2.f8669m;
        a aVar2 = this.J;
        if (i > aVar2.f8604a || mVar2.f8670n > aVar2.f8605b || b(aVar, mVar2) > this.J.f8606c) {
            return 0;
        }
        return mVar.b(mVar2) ? 1 : 3;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(String str, long j6, long j9) {
        this.f8582D.a(str, j6, j9);
        this.f8588K = a(str);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.c.e eVar) {
        this.f8598U++;
        this.ai = Math.max(eVar.f6743f, this.ai);
        if (af.f8346a >= 23 || !this.ag) {
            return;
        }
        C();
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z3 = mediaFormat.containsKey(f8574u) && mediaFormat.containsKey(f8573t) && mediaFormat.containsKey(f8575v) && mediaFormat.containsKey(f8576w);
        if (z3) {
            integer = (mediaFormat.getInteger(f8574u) - mediaFormat.getInteger(f8573t)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.Y = integer;
        if (z3) {
            integer2 = (mediaFormat.getInteger(f8575v) - mediaFormat.getInteger(f8576w)) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f8602Z = integer2;
        float f3 = this.f8601X;
        this.ab = f3;
        if (af.f8346a >= 21) {
            int i = this.f8600W;
            if (i == 90 || i == 270) {
                int i6 = this.Y;
                this.Y = integer2;
                this.f8602Z = i6;
                this.ab = 1.0f / f3;
            }
        } else {
            this.aa = this.f8600W;
        }
        mediaCodec.setVideoScalingMode(this.f8591N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r7 > 100000) goto L62;
     */
    @Override // com.anythink.basead.exoplayer.f.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j6, long j9, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i6, long j10, boolean z3) {
        int b9;
        if (this.f8593P == com.anythink.basead.exoplayer.b.f6382b) {
            this.f8593P = j6;
        }
        if (z3) {
            a(mediaCodec, i);
            return true;
        }
        long j11 = j10 - j6;
        if (this.f8589L == this.f8590M) {
            if (!g(j11)) {
                return false;
            }
            a(mediaCodec, i);
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z6 = a_() == 2;
        if (this.f8592O) {
            if (z6) {
                long j12 = elapsedRealtime - this.f8599V;
                if (g(j11)) {
                }
            }
            if (z6 && j6 != this.f8593P) {
                long j13 = j11 - (elapsedRealtime - j9);
                long nanoTime = System.nanoTime();
                long a9 = this.f8581C.a(j10, (j13 * 1000) + nanoTime);
                long j14 = (a9 - nanoTime) / 1000;
                if (j14 < -500000 && (b9 = b(j6)) != 0) {
                    ((com.anythink.basead.exoplayer.f.b) this).f7240q.i++;
                    b(this.f8598U + b9);
                    B();
                    return false;
                }
                if (g(j14)) {
                    ad.a("dropVideoBuffer");
                    mediaCodec.releaseOutputBuffer(i, false);
                    ad.a();
                    b(1);
                    return true;
                }
                if (af.f8346a >= 21) {
                    if (j14 < 50000) {
                        a(mediaCodec, i, a9);
                        return true;
                    }
                } else if (j14 < 30000) {
                    if (j14 > 11000) {
                        try {
                            Thread.sleep((j14 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    c(mediaCodec, i);
                    return true;
                }
            }
            return false;
        }
        if (af.f8346a >= 21) {
            a(mediaCodec, i, System.nanoTime());
            return true;
        }
        c(mediaCodec, i);
        return true;
    }

    private void a(MediaCodec mediaCodec, int i) {
        ad.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        ad.a();
        ((com.anythink.basead.exoplayer.f.b) this).f7240q.f6735f++;
    }

    private void a(MediaCodec mediaCodec, int i, long j6) {
        H();
        ad.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j6);
        ad.a();
        this.f8599V = SystemClock.elapsedRealtime() * 1000;
        ((com.anythink.basead.exoplayer.f.b) this).f7240q.f6734e++;
        this.f8597T = 0;
        C();
    }

    private static void a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private static void a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private static MediaFormat a(m mVar, a aVar, boolean z3, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f8665h);
        mediaFormat.setInteger("width", mVar.f8669m);
        mediaFormat.setInteger("height", mVar.f8670n);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f8666j);
        float f3 = mVar.f8671o;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "rotation-degrees", mVar.f8672p);
        com.anythink.basead.exoplayer.l.b bVar = mVar.f8676t;
        if (bVar != null) {
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-transfer", bVar.f8551c);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-standard", bVar.f8549a);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-range", bVar.f8550b);
            byte[] bArr = bVar.f8552d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar.f8604a);
        mediaFormat.setInteger("max-height", aVar.f8605b);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", aVar.f8606c);
        if (af.f8346a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z3) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        return mediaFormat;
    }

    private static a a(com.anythink.basead.exoplayer.f.a aVar, m mVar, m[] mVarArr) {
        int i = mVar.f8669m;
        int i6 = mVar.f8670n;
        int b9 = b(aVar, mVar);
        if (mVarArr.length == 1) {
            return new a(i, i6, b9);
        }
        boolean z3 = false;
        for (m mVar2 : mVarArr) {
            if (a(aVar.f7201f, mVar, mVar2)) {
                int i9 = mVar2.f8669m;
                z3 |= i9 == -1 || mVar2.f8670n == -1;
                i = Math.max(i, i9);
                i6 = Math.max(i6, mVar2.f8670n);
                b9 = Math.max(b9, b(aVar, mVar2));
            }
        }
        if (z3) {
            Log.w(f8572s, "Resolutions unknown. Codec max resolution: " + i + "x" + i6);
            Point a9 = a(aVar, mVar);
            if (a9 != null) {
                i = Math.max(i, a9.x);
                i6 = Math.max(i6, a9.y);
                b9 = Math.max(b9, a(aVar, mVar.f8665h, i, i6));
                Log.w(f8572s, "Codec max resolution adjusted to: " + i + "x" + i6);
            }
        }
        return new a(i, i6, b9);
    }

    private static Point a(com.anythink.basead.exoplayer.f.a aVar, m mVar) {
        int i = mVar.f8670n;
        int i6 = mVar.f8669m;
        boolean z3 = i > i6;
        int i9 = z3 ? i : i6;
        if (z3) {
            i = i6;
        }
        float f3 = i / i9;
        for (int i10 : f8577x) {
            int i11 = (int) (i10 * f3);
            if (i10 <= i9 || i11 <= i) {
                break;
            }
            if (af.f8346a >= 21) {
                int i12 = z3 ? i11 : i10;
                if (!z3) {
                    i10 = i11;
                }
                Point a9 = aVar.a(i12, i10);
                if (aVar.a(a9.x, a9.y, mVar.f8671o)) {
                    return a9;
                }
            } else {
                int a10 = af.a(i10, 16) * 16;
                int a11 = af.a(i11, 16) * 16;
                if (a10 * a11 <= com.anythink.basead.exoplayer.f.d.b()) {
                    int i13 = z3 ? a11 : a10;
                    if (!z3) {
                        a10 = a11;
                    }
                    return new Point(i13, a10);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(com.anythink.basead.exoplayer.f.a aVar, String str, int i, int i6) {
        char c9;
        int i9;
        int i10 = 4;
        if (i == -1 || i6 == -1) {
            return -1;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(o.f8450g)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -1662541442:
                if (str.equals(o.i)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1187890754:
                if (str.equals(o.f8454l)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1331836730:
                if (str.equals(o.f8451h)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1599127256:
                if (str.equals(o.f8452j)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1599127257:
                if (str.equals(o.f8453k)) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
            case 2:
            case 4:
                i9 = i * i6;
                i10 = 2;
                break;
            case 1:
            case 5:
                i9 = i * i6;
                break;
            case 3:
                String str2 = af.f8349d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(af.f8348c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !aVar.f7203h)))) {
                    i9 = af.a(i6, 16) * af.a(i, 16) * 256;
                    i10 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    private static boolean a(boolean z3, m mVar, m mVar2) {
        if (mVar.f8665h.equals(mVar2.f8665h) && mVar.f8672p == mVar2.f8672p) {
            return (z3 || (mVar.f8669m == mVar2.f8669m && mVar.f8670n == mVar2.f8670n)) && af.a(mVar.f8676t, mVar2.f8676t);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x05cb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(String str) {
        boolean z3 = false;
        char c9 = 27;
        if (af.f8346a >= 27 || str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (e.class) {
            try {
                if (!f8579z) {
                    String str2 = af.f8347b;
                    switch (str2.hashCode()) {
                        case -2144781245:
                            if (str2.equals("GIONEE_SWW1609")) {
                                c9 = '\'';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -2144781185:
                            if (str2.equals("GIONEE_SWW1627")) {
                                c9 = '(';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -2144781160:
                            if (str2.equals("GIONEE_SWW1631")) {
                                c9 = ')';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -2097309513:
                            if (str2.equals("K50a40")) {
                                c9 = '9';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -2022874474:
                            if (str2.equals("CP8676_I02")) {
                                c9 = 16;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1978993182:
                            if (str2.equals("NX541J")) {
                                c9 = 'E';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1978990237:
                            if (str2.equals("NX573J")) {
                                c9 = 'F';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1936688988:
                            if (str2.equals("PGN528")) {
                                c9 = 'P';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1936688066:
                            if (str2.equals("PGN610")) {
                                c9 = 'Q';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1936688065:
                            if (str2.equals("PGN611")) {
                                c9 = 'R';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1931988508:
                            if (str2.equals("AquaPowerM")) {
                                c9 = '\n';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1696512866:
                            if (str2.equals("XT1663")) {
                                c9 = 's';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1680025915:
                            if (str2.equals("ComioS1")) {
                                c9 = 15;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1615810839:
                            if (str2.equals("Phantom6")) {
                                c9 = 'S';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1554255044:
                            if (str2.equals("vernee_M5")) {
                                c9 = 'l';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1481772737:
                            if (str2.equals("panell_dl")) {
                                c9 = 'L';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1481772730:
                            if (str2.equals("panell_ds")) {
                                c9 = 'M';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1481772729:
                            if (str2.equals("panell_dt")) {
                                c9 = 'N';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1320080169:
                            if (str2.equals("GiONEE_GBL7319")) {
                                c9 = '%';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1217592143:
                            if (str2.equals("BRAVIA_ATV2")) {
                                c9 = '\r';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1180384755:
                            if (str2.equals("iris60")) {
                                c9 = '5';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1139198265:
                            if (str2.equals("Slate_Pro")) {
                                c9 = '`';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1052835013:
                            if (str2.equals("namath")) {
                                c9 = 'C';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -993250464:
                            if (str2.equals("A10-70F")) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -965403638:
                            if (str2.equals("s905x018")) {
                                c9 = 'b';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -958336948:
                            if (str2.equals("ELUGA_Ray_X")) {
                                c9 = 26;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -879245230:
                            if (str2.equals("tcl_eu")) {
                                c9 = 'h';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -842500323:
                            if (str2.equals("nicklaus_f")) {
                                c9 = 'D';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -821392978:
                            if (str2.equals("A7000-a")) {
                                c9 = 6;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -797483286:
                            if (str2.equals("SVP-DTV15")) {
                                c9 = 'a';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -794946968:
                            if (str2.equals("watson")) {
                                c9 = 'm';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -788334647:
                            if (str2.equals("whyred")) {
                                c9 = 'n';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -782144577:
                            if (str2.equals("OnePlus5T")) {
                                c9 = 'G';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -575125681:
                            if (str2.equals("GiONEE_CBL7513")) {
                                c9 = '$';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -521118391:
                            if (str2.equals("GIONEE_GBL7360")) {
                                c9 = '&';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -430914369:
                            if (str2.equals("Pixi4-7_3G")) {
                                c9 = 'T';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -290434366:
                            if (str2.equals("taido_row")) {
                                c9 = 'c';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -282781963:
                            if (str2.equals("BLACK-1X")) {
                                c9 = '\f';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -277133239:
                            if (str2.equals("Z12_PRO")) {
                                c9 = 't';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -173639913:
                            if (str2.equals("ELUGA_A3_Pro")) {
                                c9 = 23;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -56598463:
                            if (str2.equals("woods_fn")) {
                                c9 = 'p';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2126:
                            if (str2.equals("C1")) {
                                c9 = 14;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2564:
                            if (str2.equals("Q5")) {
                                c9 = '\\';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2715:
                            if (str2.equals("V1")) {
                                c9 = 'i';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2719:
                            if (str2.equals("V5")) {
                                c9 = 'k';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3483:
                            if (str2.equals("mh")) {
                                c9 = '@';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 73405:
                            if (str2.equals("JGZ")) {
                                c9 = '8';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 75739:
                            if (str2.equals("M5c")) {
                                c9 = '<';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 76779:
                            if (str2.equals("MX6")) {
                                c9 = 'B';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 78669:
                            if (str2.equals("P85")) {
                                c9 = 'J';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 79305:
                            if (str2.equals("PLE")) {
                                c9 = 'V';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 80618:
                            if (str2.equals("QX1")) {
                                c9 = '^';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 88274:
                            if (str2.equals("Z80")) {
                                c9 = 'u';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 98846:
                            if (str2.equals("cv1")) {
                                c9 = 19;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 98848:
                            if (str2.equals("cv3")) {
                                c9 = 20;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 99329:
                            if (str2.equals("deb")) {
                                c9 = 21;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 101481:
                            if (str2.equals("flo")) {
                                c9 = '#';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1513190:
                            if (str2.equals("1601")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1514184:
                            if (str2.equals("1713")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1514185:
                            if (str2.equals("1714")) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2436959:
                            if (str2.equals("P681")) {
                                c9 = 'I';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2463773:
                            if (str2.equals("Q350")) {
                                c9 = 'X';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2464648:
                            if (str2.equals("Q427")) {
                                c9 = 'Z';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2689555:
                            if (str2.equals("XE2X")) {
                                c9 = 'r';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3351335:
                            if (str2.equals("mido")) {
                                c9 = 'A';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3386211:
                            if (str2.equals("p212")) {
                                c9 = 'H';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 41325051:
                            if (str2.equals("MEIZU_M5")) {
                                c9 = '?';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 55178625:
                            if (str2.equals("Aura_Note_2")) {
                                c9 = 11;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 61542055:
                            if (str2.equals("A1601")) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 65355429:
                            if (str2.equals("E5643")) {
                                c9 = 22;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66214468:
                            if (str2.equals("F3111")) {
                                c9 = 28;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66214470:
                            if (str2.equals("F3113")) {
                                c9 = 29;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66214473:
                            if (str2.equals("F3116")) {
                                c9 = 30;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66215429:
                            if (str2.equals("F3211")) {
                                c9 = 31;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66215431:
                            if (str2.equals("F3213")) {
                                c9 = ' ';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66215433:
                            if (str2.equals("F3215")) {
                                c9 = '!';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66216390:
                            if (str2.equals("F3311")) {
                                c9 = '\"';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 76402249:
                            if (str2.equals("PRO7S")) {
                                c9 = 'W';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 76404105:
                            if (str2.equals("Q4260")) {
                                c9 = 'Y';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 76404911:
                            if (str2.equals("Q4310")) {
                                c9 = '[';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 80963634:
                            if (str2.equals("V23GB")) {
                                c9 = 'j';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 82882791:
                            if (str2.equals("X3_HK")) {
                                c9 = 'q';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 102844228:
                            if (str2.equals("le_x6")) {
                                c9 = ':';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 165221241:
                            if (str2.equals("A2016a40")) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 182191441:
                            if (str2.equals("CPY83_I00")) {
                                c9 = 18;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 245388979:
                            if (str2.equals("marino_f")) {
                                c9 = '>';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 287431619:
                            if (str2.equals("griffin")) {
                                c9 = '-';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 307593612:
                            if (str2.equals("A7010a48")) {
                                c9 = '\b';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 308517133:
                            if (str2.equals("A7020a48")) {
                                c9 = '\t';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 316215098:
                            if (str2.equals("TB3-730F")) {
                                c9 = 'd';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 316215116:
                            if (str2.equals("TB3-730X")) {
                                c9 = 'e';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 316246811:
                            if (str2.equals("TB3-850F")) {
                                c9 = 'f';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 316246818:
                            if (str2.equals("TB3-850M")) {
                                c9 = 'g';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 407160593:
                            if (str2.equals("Pixi5-10_4G")) {
                                c9 = 'U';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 507412548:
                            if (str2.equals("QM16XE_U")) {
                                c9 = ']';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 793982701:
                            if (str2.equals("GIONEE_WBL5708")) {
                                c9 = '*';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 794038622:
                            if (str2.equals("GIONEE_WBL7365")) {
                                c9 = '+';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 794040393:
                            if (str2.equals("GIONEE_WBL7519")) {
                                c9 = ',';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 835649806:
                            if (str2.equals("manning")) {
                                c9 = '=';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 917340916:
                            if (str2.equals("A7000plus")) {
                                c9 = 7;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 958008161:
                            if (str2.equals("j2xlteins")) {
                                c9 = '7';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1060579533:
                            if (str2.equals("panell_d")) {
                                c9 = 'K';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1150207623:
                            if (str2.equals("LS-5017")) {
                                c9 = ';';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1176899427:
                            if (str2.equals("itel_S41")) {
                                c9 = '6';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1280332038:
                            if (str2.equals("hwALE-H")) {
                                c9 = '/';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1306947716:
                            if (str2.equals("EverStar_S")) {
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1349174697:
                            if (str2.equals("htc_e56ml_dtul")) {
                                c9 = '.';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1522194893:
                            if (str2.equals("woods_f")) {
                                c9 = 'o';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1691543273:
                            if (str2.equals("CPH1609")) {
                                c9 = 17;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1709443163:
                            if (str2.equals("iball8735_9806")) {
                                c9 = '3';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1865889110:
                            if (str2.equals("santoni")) {
                                c9 = '_';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1906253259:
                            if (str2.equals("PB2-670M")) {
                                c9 = 'O';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1977196784:
                            if (str2.equals("Infinix-X572")) {
                                c9 = '4';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2029784656:
                            if (str2.equals("HWBLN-H")) {
                                c9 = '0';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2030379515:
                            if (str2.equals("HWCAM-H")) {
                                c9 = '1';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2047190025:
                            if (str2.equals("ELUGA_Note")) {
                                c9 = 24;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2047252157:
                            if (str2.equals("ELUGA_Prim")) {
                                c9 = 25;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2048319463:
                            if (str2.equals("HWVNS-H")) {
                                c9 = '2';
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case ' ':
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case j.f5806M /* 38 */:
                        case '\'':
                        case j.f5808O /* 40 */:
                        case ')':
                        case '*':
                        case j.f5811R /* 43 */:
                        case j.f5812S /* 44 */:
                        case j.f5813T /* 45 */:
                        case '.':
                        case '/':
                        case j.f5816W /* 48 */:
                        case j.f5817X /* 49 */:
                        case '2':
                        case '3':
                        case '4':
                        case i.f14823d /* 53 */:
                        case '6':
                        case '7':
                        case p.a.f19679e /* 56 */:
                        case '9':
                        case ':':
                        case j.v.f12591n /* 59 */:
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case j.v.f12576G /* 65 */:
                        case 'B':
                        case j.v.f12582d /* 67 */:
                        case 'D':
                        case j.v.f12573D /* 69 */:
                        case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                        case 'G':
                        case 'H':
                        case 'I':
                        case j.v.f12598u /* 74 */:
                        case j.v.f12599v /* 75 */:
                        case j.v.f12603z /* 76 */:
                        case j.v.f12571B /* 77 */:
                        case 'N':
                        case j.v.f12570A /* 79 */:
                        case j.v.f12572C /* 80 */:
                        case j.v.f12574E /* 81 */:
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                        case '[':
                        case j.v.f12577H /* 92 */:
                        case j.v.f12578I /* 93 */:
                        case '^':
                        case '_':
                        case '`':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case com.anythink.expressad.video.module.a.a.f21756z /* 109 */:
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                            f8571A = true;
                            break;
                    }
                    String str3 = af.f8349d;
                    int hashCode = str3.hashCode();
                    if (hashCode != 2006354) {
                        if (hashCode == 2006367 && str3.equals("AFTN")) {
                            z3 = true;
                            if (z3 || z3) {
                                f8571A = true;
                            }
                            f8579z = true;
                        }
                        z3 = -1;
                        if (z3) {
                        }
                        f8571A = true;
                        f8579z = true;
                    } else {
                        if (str3.equals("AFTA")) {
                            if (z3) {
                            }
                            f8571A = true;
                            f8579z = true;
                        }
                        z3 = -1;
                        if (z3) {
                        }
                        f8571A = true;
                        f8579z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8571A;
    }
}
