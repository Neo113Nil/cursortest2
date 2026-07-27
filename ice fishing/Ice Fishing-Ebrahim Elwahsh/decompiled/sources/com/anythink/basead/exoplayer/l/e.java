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
import com.anythink.basead.exoplayer.k.C0544a;
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
    private static boolean f8728A = false;

    /* renamed from: s, reason: collision with root package name */
    private static final String f8729s = "MediaCodecVideoRenderer";

    /* renamed from: t, reason: collision with root package name */
    private static final String f8730t = "crop-left";

    /* renamed from: u, reason: collision with root package name */
    private static final String f8731u = "crop-right";

    /* renamed from: v, reason: collision with root package name */
    private static final String f8732v = "crop-bottom";

    /* renamed from: w, reason: collision with root package name */
    private static final String f8733w = "crop-top";

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f8734x = {1920, 1600, com.onesignal.core.internal.config.e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1280, 960, 854, 640, 540, 480};

    /* renamed from: y, reason: collision with root package name */
    private static final int f8735y = 10;

    /* renamed from: z, reason: collision with root package name */
    private static boolean f8736z;

    /* renamed from: B, reason: collision with root package name */
    private final Context f8737B;

    /* renamed from: C, reason: collision with root package name */
    private final f f8738C;

    /* renamed from: D, reason: collision with root package name */
    private final h.a f8739D;

    /* renamed from: E, reason: collision with root package name */
    private final long f8740E;

    /* renamed from: F, reason: collision with root package name */
    private final int f8741F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f8742G;

    /* renamed from: H, reason: collision with root package name */
    private final long[] f8743H;

    /* renamed from: I, reason: collision with root package name */
    private final long[] f8744I;
    private a J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f8745K;

    /* renamed from: L, reason: collision with root package name */
    private Surface f8746L;

    /* renamed from: M, reason: collision with root package name */
    private Surface f8747M;

    /* renamed from: N, reason: collision with root package name */
    private int f8748N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f8749O;

    /* renamed from: P, reason: collision with root package name */
    private long f8750P;

    /* renamed from: Q, reason: collision with root package name */
    private long f8751Q;

    /* renamed from: R, reason: collision with root package name */
    private long f8752R;

    /* renamed from: S, reason: collision with root package name */
    private int f8753S;

    /* renamed from: T, reason: collision with root package name */
    private int f8754T;

    /* renamed from: U, reason: collision with root package name */
    private int f8755U;

    /* renamed from: V, reason: collision with root package name */
    private long f8756V;

    /* renamed from: W, reason: collision with root package name */
    private int f8757W;

    /* renamed from: X, reason: collision with root package name */
    private float f8758X;
    private int Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f8759Z;
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
    b f8760r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8761a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8762b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8763c;

        public a(int i, int i4, int i9) {
            this.f8761a = i;
            this.f8762b = i4;
            this.f8763c = i9;
        }
    }

    public final class b implements MediaCodec.OnFrameRenderedListener {
        public /* synthetic */ b(e eVar, MediaCodec mediaCodec, byte b9) {
            this(mediaCodec);
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(MediaCodec mediaCodec, long j9, long j10) {
            e eVar = e.this;
            if (this != eVar.f8760r) {
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
        this.f8751Q = this.f8740E > 0 ? SystemClock.elapsedRealtime() + this.f8740E : com.anythink.basead.exoplayer.b.f6539b;
    }

    private void E() {
        MediaCodec y6;
        byte b9 = 0;
        this.f8749O = false;
        if (af.f8503a < 23 || !this.ag || (y6 = y()) == null) {
            return;
        }
        this.f8760r = new b(this, y6, b9);
    }

    private void F() {
        if (this.f8749O) {
            this.f8739D.a(this.f8746L);
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
        if (i == -1 && this.f8759Z == -1) {
            return;
        }
        if (this.ac == i && this.ad == this.f8759Z && this.ae == this.aa && this.af == this.ab) {
            return;
        }
        this.f8739D.a(i, this.f8759Z, this.aa, this.ab);
        this.ac = this.Y;
        this.ad = this.f8759Z;
        this.ae = this.aa;
        this.af = this.ab;
    }

    private void I() {
        int i = this.ac;
        if (i == -1 && this.ad == -1) {
            return;
        }
        this.f8739D.a(i, this.ad, this.ae, this.af);
    }

    private void J() {
        if (this.f8753S > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f8739D.a(this.f8753S, elapsedRealtime - this.f8752R);
            this.f8753S = 0;
            this.f8752R = elapsedRealtime;
        }
    }

    private static boolean K() {
        return af.f8503a <= 22 && "foster".equals(af.f8504b) && "NVIDIA".equals(af.f8505c);
    }

    private static boolean d(long j9) {
        return g(j9);
    }

    private static boolean e(long j9) {
        return j9 < -500000;
    }

    private boolean f(long j9) {
        int b9 = b(j9);
        if (b9 == 0) {
            return false;
        }
        ((com.anythink.basead.exoplayer.f.b) this).f7397q.i++;
        b(this.f8755U + b9);
        B();
        return true;
    }

    private static boolean g(long j9) {
        return j9 < -30000;
    }

    private static boolean h(long j9) {
        return j9 < -500000;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void A() {
        try {
            super.A();
            this.f8755U = 0;
            Surface surface = this.f8747M;
            if (surface != null) {
                if (this.f8746L == surface) {
                    this.f8746L = null;
                }
                surface.release();
                this.f8747M = null;
            }
        } catch (Throwable th) {
            this.f8755U = 0;
            if (this.f8747M != null) {
                Surface surface2 = this.f8746L;
                Surface surface3 = this.f8747M;
                if (surface2 == surface3) {
                    this.f8746L = null;
                }
                surface3.release();
                this.f8747M = null;
            }
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void B() {
        super.B();
        this.f8755U = 0;
    }

    public final void C() {
        if (this.f8749O) {
            return;
        }
        this.f8749O = true;
        this.f8739D.a(this.f8746L);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<k> gVar, m mVar) {
        boolean z8;
        int i;
        int i4;
        String str = mVar.f8822h;
        if (!o.b(str)) {
            return 0;
        }
        com.anythink.basead.exoplayer.d.e eVar = mVar.f8824k;
        if (eVar != null) {
            z8 = false;
            for (int i9 = 0; i9 < eVar.f7002b; i9++) {
                z8 |= eVar.a(i9).f7008d;
            }
        } else {
            z8 = false;
        }
        com.anythink.basead.exoplayer.f.a a9 = cVar.a(str, z8);
        if (a9 == null) {
            return (!z8 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (!com.anythink.basead.exoplayer.a.a(gVar, eVar)) {
            return 2;
        }
        boolean b9 = a9.b(mVar.f8819e);
        if (b9 && (i = mVar.f8826m) > 0 && (i4 = mVar.f8827n) > 0) {
            if (af.f8503a >= 21) {
                b9 = a9.a(i, i4, mVar.f8828o);
            } else {
                boolean z9 = i * i4 <= com.anythink.basead.exoplayer.f.d.b();
                if (!z9) {
                    Log.d(f8729s, "FalseCheck [legacyFrameSize, " + mVar.f8826m + "x" + mVar.f8827n + "] [" + af.f8507e + "]");
                }
                b9 = z9;
            }
        }
        return (b9 ? 4 : 3) | (a9.f7358f ? 16 : 8) | (a9.f7359g ? 32 : 0);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void b(m mVar) {
        super.b(mVar);
        this.f8739D.a(mVar);
        this.f8758X = mVar.f8830q;
        this.f8757W = mVar.f8829p;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void c(long j9) {
        this.f8755U--;
        while (true) {
            int i = this.ak;
            if (i == 0 || j9 < this.f8744I[0]) {
                return;
            }
            long[] jArr = this.f8743H;
            this.aj = jArr[0];
            int i4 = i - 1;
            this.ak = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
            long[] jArr2 = this.f8744I;
            System.arraycopy(jArr2, 1, jArr2, 0, this.ak);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void n() {
        super.n();
        this.f8753S = 0;
        this.f8752R = SystemClock.elapsedRealtime();
        this.f8756V = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void o() {
        this.f8751Q = com.anythink.basead.exoplayer.b.f6539b;
        J();
        super.o();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void p() {
        this.Y = -1;
        this.f8759Z = -1;
        this.ab = -1.0f;
        this.f8758X = -1.0f;
        this.aj = com.anythink.basead.exoplayer.b.f6539b;
        this.ai = com.anythink.basead.exoplayer.b.f6539b;
        this.ak = 0;
        G();
        E();
        this.f8738C.b();
        this.f8760r = null;
        this.ag = false;
        try {
            super.p();
        } finally {
            this.f8739D.b(((com.anythink.basead.exoplayer.f.b) this).f7397q);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.y
    public final boolean u() {
        Surface surface;
        if (super.u() && (this.f8749O || (((surface = this.f8747M) != null && this.f8746L == surface) || y() == null || this.ag))) {
            this.f8751Q = com.anythink.basead.exoplayer.b.f6539b;
            return true;
        }
        if (this.f8751Q == com.anythink.basead.exoplayer.b.f6539b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f8751Q) {
            return true;
        }
        this.f8751Q = com.anythink.basead.exoplayer.b.f6539b;
        return false;
    }

    private e(Context context, com.anythink.basead.exoplayer.f.c cVar, byte b9) {
        this(context, cVar, null, null);
    }

    private e(Context context, com.anythink.basead.exoplayer.f.c cVar, Handler handler, h hVar) {
        this(context, cVar, 0L, null, handler, hVar, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, com.anythink.basead.exoplayer.f.c cVar, long j9, com.anythink.basead.exoplayer.d.g<k> gVar, Handler handler, h hVar, int i) {
        super(2, cVar, gVar, false);
        boolean z8 = false;
        this.f8740E = j9;
        this.f8741F = i;
        Context applicationContext = context.getApplicationContext();
        this.f8737B = applicationContext;
        this.f8738C = new f(applicationContext);
        this.f8739D = new h.a(handler, hVar);
        if (af.f8503a <= 22 && "foster".equals(af.f8504b) && "NVIDIA".equals(af.f8505c)) {
            z8 = true;
        }
        this.f8742G = z8;
        this.f8743H = new long[10];
        this.f8744I = new long[10];
        this.aj = com.anythink.basead.exoplayer.b.f6539b;
        this.ai = com.anythink.basead.exoplayer.b.f6539b;
        this.f8751Q = com.anythink.basead.exoplayer.b.f6539b;
        this.Y = -1;
        this.f8759Z = -1;
        this.ab = -1.0f;
        this.f8758X = -1.0f;
        this.f8748N = 1;
        G();
    }

    private static boolean b(long j9, long j10) {
        return g(j9) && j10 > 100000;
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
        this.f8756V = SystemClock.elapsedRealtime() * 1000;
        ((com.anythink.basead.exoplayer.f.b) this).f7397q.f6891e++;
        this.f8754T = 0;
        C();
    }

    private void b(int i) {
        com.anythink.basead.exoplayer.c.d dVar = ((com.anythink.basead.exoplayer.f.b) this).f7397q;
        dVar.f6893g += i;
        this.f8753S += i;
        int i4 = this.f8754T + i;
        this.f8754T = i4;
        dVar.f6894h = Math.max(i4, dVar.f6894h);
        if (this.f8753S >= this.f8741F) {
            J();
        }
    }

    private boolean b(com.anythink.basead.exoplayer.f.a aVar) {
        if (af.f8503a < 23 || this.ag || a(aVar.f7355c)) {
            return false;
        }
        return !aVar.f7360h || c.a(this.f8737B);
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(boolean z8) {
        super.a(z8);
        int i = r().f6467b;
        this.ah = i;
        this.ag = i != 0;
        this.f8739D.a(((com.anythink.basead.exoplayer.f.b) this).f7397q);
        this.f8738C.a();
    }

    private static int b(com.anythink.basead.exoplayer.f.a aVar, m mVar) {
        if (mVar.i != -1) {
            int size = mVar.f8823j.size();
            int i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i += mVar.f8823j.get(i4).length;
            }
            return mVar.i + i;
        }
        return a(aVar, mVar.f8822h, mVar.f8826m, mVar.f8827n);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(m[] mVarArr, long j9) {
        if (this.aj == com.anythink.basead.exoplayer.b.f6539b) {
            this.aj = j9;
        } else {
            int i = this.ak;
            if (i == this.f8743H.length) {
                Log.w(f8729s, "Too many stream changes, so dropping offset: " + this.f8743H[this.ak - 1]);
            } else {
                this.ak = i + 1;
            }
            long[] jArr = this.f8743H;
            int i4 = this.ak;
            jArr[i4 - 1] = j9;
            this.f8744I[i4 - 1] = this.ai;
        }
        super.a(mVarArr, j9);
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(long j9, boolean z8) {
        super.a(j9, z8);
        E();
        this.f8750P = com.anythink.basead.exoplayer.b.f6539b;
        this.f8754T = 0;
        this.ai = com.anythink.basead.exoplayer.b.f6539b;
        int i = this.ak;
        if (i != 0) {
            this.aj = this.f8743H[i - 1];
            this.ak = 0;
        }
        if (z8) {
            D();
        } else {
            this.f8751Q = com.anythink.basead.exoplayer.b.f6539b;
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i != 1) {
            if (i == 4) {
                this.f8748N = ((Integer) obj).intValue();
                MediaCodec y6 = y();
                if (y6 != null) {
                    y6.setVideoScalingMode(this.f8748N);
                    return;
                }
                return;
            }
            super.a(i, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.f8747M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.anythink.basead.exoplayer.f.a z8 = z();
                if (z8 != null && b(z8)) {
                    surface = c.a(this.f8737B, z8.f7360h);
                    this.f8747M = surface;
                }
            }
        }
        if (this.f8746L != surface) {
            this.f8746L = surface;
            int a_ = a_();
            if (a_ == 1 || a_ == 2) {
                MediaCodec y8 = y();
                if (af.f8503a >= 23 && y8 != null && surface != null && !this.f8745K) {
                    y8.setOutputSurface(surface);
                } else {
                    A();
                    x();
                }
            }
            if (surface != null && surface != this.f8747M) {
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
        if (surface == null || surface == this.f8747M) {
            return;
        }
        I();
        if (this.f8749O) {
            this.f8739D.a(this.f8746L);
        }
    }

    private void a(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f8747M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.anythink.basead.exoplayer.f.a z8 = z();
                if (z8 != null && b(z8)) {
                    surface = c.a(this.f8737B, z8.f7360h);
                    this.f8747M = surface;
                }
            }
        }
        if (this.f8746L != surface) {
            this.f8746L = surface;
            int a_ = a_();
            if (a_ == 1 || a_ == 2) {
                MediaCodec y6 = y();
                if (af.f8503a >= 23 && y6 != null && surface != null && !this.f8745K) {
                    y6.setOutputSurface(surface);
                } else {
                    A();
                    x();
                }
            }
            if (surface != null && surface != this.f8747M) {
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
        if (surface == null || surface == this.f8747M) {
            return;
        }
        I();
        if (this.f8749O) {
            this.f8739D.a(this.f8746L);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final boolean a(com.anythink.basead.exoplayer.f.a aVar) {
        return this.f8746L != null || b(aVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.f.a aVar, MediaCodec mediaCodec, m mVar, MediaCrypto mediaCrypto) {
        a aVar2;
        m[] q6 = q();
        int i = mVar.f8826m;
        int i4 = mVar.f8827n;
        int b9 = b(aVar, mVar);
        byte b10 = 0;
        if (q6.length == 1) {
            aVar2 = new a(i, i4, b9);
        } else {
            boolean z8 = false;
            for (m mVar2 : q6) {
                if (a(aVar.f7358f, mVar, mVar2)) {
                    int i9 = mVar2.f8826m;
                    z8 |= i9 == -1 || mVar2.f8827n == -1;
                    i = Math.max(i, i9);
                    i4 = Math.max(i4, mVar2.f8827n);
                    b9 = Math.max(b9, b(aVar, mVar2));
                }
            }
            if (z8) {
                Log.w(f8729s, "Resolutions unknown. Codec max resolution: " + i + "x" + i4);
                Point a9 = a(aVar, mVar);
                if (a9 != null) {
                    i = Math.max(i, a9.x);
                    i4 = Math.max(i4, a9.y);
                    b9 = Math.max(b9, a(aVar, mVar.f8822h, i, i4));
                    Log.w(f8729s, "Codec max resolution adjusted to: " + i + "x" + i4);
                }
            }
            aVar2 = new a(i, i4, b9);
        }
        this.J = aVar2;
        boolean z9 = this.f8742G;
        int i10 = this.ah;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f8822h);
        mediaFormat.setInteger("width", mVar.f8826m);
        mediaFormat.setInteger("height", mVar.f8827n);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f8823j);
        float f6 = mVar.f8828o;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "rotation-degrees", mVar.f8829p);
        com.anythink.basead.exoplayer.l.b bVar = mVar.f8833t;
        if (bVar != null) {
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-transfer", bVar.f8708c);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-standard", bVar.f8706a);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-range", bVar.f8707b);
            byte[] bArr = bVar.f8709d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar2.f8761a);
        mediaFormat.setInteger("max-height", aVar2.f8762b);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", aVar2.f8763c);
        int i11 = af.f8503a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z9) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (this.f8746L == null) {
            C0544a.b(b(aVar));
            if (this.f8747M == null) {
                this.f8747M = c.a(this.f8737B, aVar.f7360h);
            }
            this.f8746L = this.f8747M;
        }
        mediaCodec.configure(mediaFormat, this.f8746L, mediaCrypto, 0);
        if (i11 < 23 || !this.ag) {
            return;
        }
        this.f8760r = new b(this, mediaCodec, b10);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.a aVar, m mVar, m mVar2) {
        if (!a(aVar.f7358f, mVar, mVar2)) {
            return 0;
        }
        int i = mVar2.f8826m;
        a aVar2 = this.J;
        if (i > aVar2.f8761a || mVar2.f8827n > aVar2.f8762b || b(aVar, mVar2) > this.J.f8763c) {
            return 0;
        }
        return mVar.b(mVar2) ? 1 : 3;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(String str, long j9, long j10) {
        this.f8739D.a(str, j9, j10);
        this.f8745K = a(str);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.c.e eVar) {
        this.f8755U++;
        this.ai = Math.max(eVar.f6900f, this.ai);
        if (af.f8503a >= 23 || !this.ag) {
            return;
        }
        C();
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z8 = mediaFormat.containsKey(f8731u) && mediaFormat.containsKey(f8730t) && mediaFormat.containsKey(f8732v) && mediaFormat.containsKey(f8733w);
        if (z8) {
            integer = (mediaFormat.getInteger(f8731u) - mediaFormat.getInteger(f8730t)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.Y = integer;
        if (z8) {
            integer2 = (mediaFormat.getInteger(f8732v) - mediaFormat.getInteger(f8733w)) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f8759Z = integer2;
        float f6 = this.f8758X;
        this.ab = f6;
        if (af.f8503a >= 21) {
            int i = this.f8757W;
            if (i == 90 || i == 270) {
                int i4 = this.Y;
                this.Y = integer2;
                this.f8759Z = i4;
                this.ab = 1.0f / f6;
            }
        } else {
            this.aa = this.f8757W;
        }
        mediaCodec.setVideoScalingMode(this.f8748N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r7 > 100000) goto L62;
     */
    @Override // com.anythink.basead.exoplayer.f.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j9, long j10, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i4, long j11, boolean z8) {
        int b9;
        if (this.f8750P == com.anythink.basead.exoplayer.b.f6539b) {
            this.f8750P = j9;
        }
        if (z8) {
            a(mediaCodec, i);
            return true;
        }
        long j12 = j11 - j9;
        if (this.f8746L == this.f8747M) {
            if (!g(j12)) {
                return false;
            }
            a(mediaCodec, i);
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z9 = a_() == 2;
        if (this.f8749O) {
            if (z9) {
                long j13 = elapsedRealtime - this.f8756V;
                if (g(j12)) {
                }
            }
            if (z9 && j9 != this.f8750P) {
                long j14 = j12 - (elapsedRealtime - j10);
                long nanoTime = System.nanoTime();
                long a9 = this.f8738C.a(j11, (j14 * 1000) + nanoTime);
                long j15 = (a9 - nanoTime) / 1000;
                if (j15 < -500000 && (b9 = b(j9)) != 0) {
                    ((com.anythink.basead.exoplayer.f.b) this).f7397q.i++;
                    b(this.f8755U + b9);
                    B();
                    return false;
                }
                if (g(j15)) {
                    ad.a("dropVideoBuffer");
                    mediaCodec.releaseOutputBuffer(i, false);
                    ad.a();
                    b(1);
                    return true;
                }
                if (af.f8503a >= 21) {
                    if (j15 < 50000) {
                        a(mediaCodec, i, a9);
                        return true;
                    }
                } else if (j15 < 30000) {
                    if (j15 > 11000) {
                        try {
                            Thread.sleep((j15 - 10000) / 1000);
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
        if (af.f8503a >= 21) {
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
        ((com.anythink.basead.exoplayer.f.b) this).f7397q.f6892f++;
    }

    private void a(MediaCodec mediaCodec, int i, long j9) {
        H();
        ad.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j9);
        ad.a();
        this.f8756V = SystemClock.elapsedRealtime() * 1000;
        ((com.anythink.basead.exoplayer.f.b) this).f7397q.f6891e++;
        this.f8754T = 0;
        C();
    }

    private static void a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private static void a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private static MediaFormat a(m mVar, a aVar, boolean z8, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f8822h);
        mediaFormat.setInteger("width", mVar.f8826m);
        mediaFormat.setInteger("height", mVar.f8827n);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f8823j);
        float f6 = mVar.f8828o;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "rotation-degrees", mVar.f8829p);
        com.anythink.basead.exoplayer.l.b bVar = mVar.f8833t;
        if (bVar != null) {
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-transfer", bVar.f8708c);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-standard", bVar.f8706a);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-range", bVar.f8707b);
            byte[] bArr = bVar.f8709d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar.f8761a);
        mediaFormat.setInteger("max-height", aVar.f8762b);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", aVar.f8763c);
        if (af.f8503a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z8) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        return mediaFormat;
    }

    private static a a(com.anythink.basead.exoplayer.f.a aVar, m mVar, m[] mVarArr) {
        int i = mVar.f8826m;
        int i4 = mVar.f8827n;
        int b9 = b(aVar, mVar);
        if (mVarArr.length == 1) {
            return new a(i, i4, b9);
        }
        boolean z8 = false;
        for (m mVar2 : mVarArr) {
            if (a(aVar.f7358f, mVar, mVar2)) {
                int i9 = mVar2.f8826m;
                z8 |= i9 == -1 || mVar2.f8827n == -1;
                i = Math.max(i, i9);
                i4 = Math.max(i4, mVar2.f8827n);
                b9 = Math.max(b9, b(aVar, mVar2));
            }
        }
        if (z8) {
            Log.w(f8729s, "Resolutions unknown. Codec max resolution: " + i + "x" + i4);
            Point a9 = a(aVar, mVar);
            if (a9 != null) {
                i = Math.max(i, a9.x);
                i4 = Math.max(i4, a9.y);
                b9 = Math.max(b9, a(aVar, mVar.f8822h, i, i4));
                Log.w(f8729s, "Codec max resolution adjusted to: " + i + "x" + i4);
            }
        }
        return new a(i, i4, b9);
    }

    private static Point a(com.anythink.basead.exoplayer.f.a aVar, m mVar) {
        int i = mVar.f8827n;
        int i4 = mVar.f8826m;
        boolean z8 = i > i4;
        int i9 = z8 ? i : i4;
        if (z8) {
            i = i4;
        }
        float f6 = i / i9;
        for (int i10 : f8734x) {
            int i11 = (int) (i10 * f6);
            if (i10 <= i9 || i11 <= i) {
                break;
            }
            if (af.f8503a >= 21) {
                int i12 = z8 ? i11 : i10;
                if (!z8) {
                    i10 = i11;
                }
                Point a9 = aVar.a(i12, i10);
                if (aVar.a(a9.x, a9.y, mVar.f8828o)) {
                    return a9;
                }
            } else {
                int a10 = af.a(i10, 16) * 16;
                int a11 = af.a(i11, 16) * 16;
                if (a10 * a11 <= com.anythink.basead.exoplayer.f.d.b()) {
                    int i13 = z8 ? a11 : a10;
                    if (!z8) {
                        a10 = a11;
                    }
                    return new Point(i13, a10);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(com.anythink.basead.exoplayer.f.a aVar, String str, int i, int i4) {
        char c4;
        int i9;
        int i10 = 4;
        if (i == -1 || i4 == -1) {
            return -1;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(o.f8607g)) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1662541442:
                if (str.equals(o.i)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1187890754:
                if (str.equals(o.f8611l)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1331836730:
                if (str.equals(o.f8608h)) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1599127256:
                if (str.equals(o.f8609j)) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 1599127257:
                if (str.equals(o.f8610k)) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
            case 2:
            case 4:
                i9 = i * i4;
                i10 = 2;
                break;
            case 1:
            case 5:
                i9 = i * i4;
                break;
            case 3:
                String str2 = af.f8506d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(af.f8505c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !aVar.f7360h)))) {
                    i9 = af.a(i4, 16) * af.a(i, 16) * 256;
                    i10 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    private static boolean a(boolean z8, m mVar, m mVar2) {
        if (mVar.f8822h.equals(mVar2.f8822h) && mVar.f8829p == mVar2.f8829p) {
            return (z8 || (mVar.f8826m == mVar2.f8826m && mVar.f8827n == mVar2.f8827n)) && af.a(mVar.f8833t, mVar2.f8833t);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x05cb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(String str) {
        boolean z8 = false;
        char c4 = 27;
        if (af.f8503a >= 27 || str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (e.class) {
            try {
                if (!f8736z) {
                    String str2 = af.f8504b;
                    switch (str2.hashCode()) {
                        case -2144781245:
                            if (str2.equals("GIONEE_SWW1609")) {
                                c4 = '\'';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -2144781185:
                            if (str2.equals("GIONEE_SWW1627")) {
                                c4 = '(';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -2144781160:
                            if (str2.equals("GIONEE_SWW1631")) {
                                c4 = ')';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -2097309513:
                            if (str2.equals("K50a40")) {
                                c4 = '9';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -2022874474:
                            if (str2.equals("CP8676_I02")) {
                                c4 = 16;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1978993182:
                            if (str2.equals("NX541J")) {
                                c4 = 'E';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1978990237:
                            if (str2.equals("NX573J")) {
                                c4 = 'F';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1936688988:
                            if (str2.equals("PGN528")) {
                                c4 = 'P';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1936688066:
                            if (str2.equals("PGN610")) {
                                c4 = 'Q';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1936688065:
                            if (str2.equals("PGN611")) {
                                c4 = 'R';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1931988508:
                            if (str2.equals("AquaPowerM")) {
                                c4 = '\n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1696512866:
                            if (str2.equals("XT1663")) {
                                c4 = 's';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1680025915:
                            if (str2.equals("ComioS1")) {
                                c4 = 15;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1615810839:
                            if (str2.equals("Phantom6")) {
                                c4 = 'S';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1554255044:
                            if (str2.equals("vernee_M5")) {
                                c4 = 'l';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1481772737:
                            if (str2.equals("panell_dl")) {
                                c4 = 'L';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1481772730:
                            if (str2.equals("panell_ds")) {
                                c4 = 'M';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1481772729:
                            if (str2.equals("panell_dt")) {
                                c4 = 'N';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1320080169:
                            if (str2.equals("GiONEE_GBL7319")) {
                                c4 = '%';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1217592143:
                            if (str2.equals("BRAVIA_ATV2")) {
                                c4 = '\r';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1180384755:
                            if (str2.equals("iris60")) {
                                c4 = '5';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1139198265:
                            if (str2.equals("Slate_Pro")) {
                                c4 = '`';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1052835013:
                            if (str2.equals("namath")) {
                                c4 = 'C';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -993250464:
                            if (str2.equals("A10-70F")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -965403638:
                            if (str2.equals("s905x018")) {
                                c4 = 'b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -958336948:
                            if (str2.equals("ELUGA_Ray_X")) {
                                c4 = 26;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -879245230:
                            if (str2.equals("tcl_eu")) {
                                c4 = 'h';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -842500323:
                            if (str2.equals("nicklaus_f")) {
                                c4 = 'D';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -821392978:
                            if (str2.equals("A7000-a")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -797483286:
                            if (str2.equals("SVP-DTV15")) {
                                c4 = 'a';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -794946968:
                            if (str2.equals("watson")) {
                                c4 = 'm';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -788334647:
                            if (str2.equals("whyred")) {
                                c4 = 'n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -782144577:
                            if (str2.equals("OnePlus5T")) {
                                c4 = 'G';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -575125681:
                            if (str2.equals("GiONEE_CBL7513")) {
                                c4 = '$';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -521118391:
                            if (str2.equals("GIONEE_GBL7360")) {
                                c4 = '&';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -430914369:
                            if (str2.equals("Pixi4-7_3G")) {
                                c4 = 'T';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -290434366:
                            if (str2.equals("taido_row")) {
                                c4 = 'c';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -282781963:
                            if (str2.equals("BLACK-1X")) {
                                c4 = '\f';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -277133239:
                            if (str2.equals("Z12_PRO")) {
                                c4 = 't';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -173639913:
                            if (str2.equals("ELUGA_A3_Pro")) {
                                c4 = 23;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -56598463:
                            if (str2.equals("woods_fn")) {
                                c4 = 'p';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2126:
                            if (str2.equals("C1")) {
                                c4 = 14;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2564:
                            if (str2.equals("Q5")) {
                                c4 = '\\';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2715:
                            if (str2.equals("V1")) {
                                c4 = 'i';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2719:
                            if (str2.equals("V5")) {
                                c4 = 'k';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3483:
                            if (str2.equals("mh")) {
                                c4 = '@';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 73405:
                            if (str2.equals("JGZ")) {
                                c4 = '8';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 75739:
                            if (str2.equals("M5c")) {
                                c4 = '<';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 76779:
                            if (str2.equals("MX6")) {
                                c4 = 'B';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 78669:
                            if (str2.equals("P85")) {
                                c4 = 'J';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 79305:
                            if (str2.equals("PLE")) {
                                c4 = 'V';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 80618:
                            if (str2.equals("QX1")) {
                                c4 = '^';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 88274:
                            if (str2.equals("Z80")) {
                                c4 = 'u';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 98846:
                            if (str2.equals("cv1")) {
                                c4 = 19;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 98848:
                            if (str2.equals("cv3")) {
                                c4 = 20;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 99329:
                            if (str2.equals("deb")) {
                                c4 = 21;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 101481:
                            if (str2.equals("flo")) {
                                c4 = '#';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1513190:
                            if (str2.equals("1601")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1514184:
                            if (str2.equals("1713")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1514185:
                            if (str2.equals("1714")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2436959:
                            if (str2.equals("P681")) {
                                c4 = 'I';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2463773:
                            if (str2.equals("Q350")) {
                                c4 = 'X';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2464648:
                            if (str2.equals("Q427")) {
                                c4 = 'Z';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2689555:
                            if (str2.equals("XE2X")) {
                                c4 = 'r';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3351335:
                            if (str2.equals("mido")) {
                                c4 = 'A';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3386211:
                            if (str2.equals("p212")) {
                                c4 = 'H';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 41325051:
                            if (str2.equals("MEIZU_M5")) {
                                c4 = '?';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 55178625:
                            if (str2.equals("Aura_Note_2")) {
                                c4 = 11;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 61542055:
                            if (str2.equals("A1601")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 65355429:
                            if (str2.equals("E5643")) {
                                c4 = 22;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 66214468:
                            if (str2.equals("F3111")) {
                                c4 = 28;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 66214470:
                            if (str2.equals("F3113")) {
                                c4 = 29;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 66214473:
                            if (str2.equals("F3116")) {
                                c4 = 30;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 66215429:
                            if (str2.equals("F3211")) {
                                c4 = 31;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 66215431:
                            if (str2.equals("F3213")) {
                                c4 = ' ';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 66215433:
                            if (str2.equals("F3215")) {
                                c4 = '!';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 66216390:
                            if (str2.equals("F3311")) {
                                c4 = '\"';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 76402249:
                            if (str2.equals("PRO7S")) {
                                c4 = 'W';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 76404105:
                            if (str2.equals("Q4260")) {
                                c4 = 'Y';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 76404911:
                            if (str2.equals("Q4310")) {
                                c4 = '[';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 80963634:
                            if (str2.equals("V23GB")) {
                                c4 = 'j';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 82882791:
                            if (str2.equals("X3_HK")) {
                                c4 = 'q';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 102844228:
                            if (str2.equals("le_x6")) {
                                c4 = ':';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 165221241:
                            if (str2.equals("A2016a40")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 182191441:
                            if (str2.equals("CPY83_I00")) {
                                c4 = 18;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 245388979:
                            if (str2.equals("marino_f")) {
                                c4 = '>';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 287431619:
                            if (str2.equals("griffin")) {
                                c4 = '-';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 307593612:
                            if (str2.equals("A7010a48")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 308517133:
                            if (str2.equals("A7020a48")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 316215098:
                            if (str2.equals("TB3-730F")) {
                                c4 = 'd';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 316215116:
                            if (str2.equals("TB3-730X")) {
                                c4 = 'e';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 316246811:
                            if (str2.equals("TB3-850F")) {
                                c4 = 'f';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 316246818:
                            if (str2.equals("TB3-850M")) {
                                c4 = 'g';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 407160593:
                            if (str2.equals("Pixi5-10_4G")) {
                                c4 = 'U';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 507412548:
                            if (str2.equals("QM16XE_U")) {
                                c4 = ']';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 793982701:
                            if (str2.equals("GIONEE_WBL5708")) {
                                c4 = '*';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 794038622:
                            if (str2.equals("GIONEE_WBL7365")) {
                                c4 = '+';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 794040393:
                            if (str2.equals("GIONEE_WBL7519")) {
                                c4 = ',';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 835649806:
                            if (str2.equals("manning")) {
                                c4 = '=';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 917340916:
                            if (str2.equals("A7000plus")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 958008161:
                            if (str2.equals("j2xlteins")) {
                                c4 = '7';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1060579533:
                            if (str2.equals("panell_d")) {
                                c4 = 'K';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1150207623:
                            if (str2.equals("LS-5017")) {
                                c4 = ';';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1176899427:
                            if (str2.equals("itel_S41")) {
                                c4 = '6';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1280332038:
                            if (str2.equals("hwALE-H")) {
                                c4 = '/';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1306947716:
                            if (str2.equals("EverStar_S")) {
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1349174697:
                            if (str2.equals("htc_e56ml_dtul")) {
                                c4 = '.';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1522194893:
                            if (str2.equals("woods_f")) {
                                c4 = 'o';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1691543273:
                            if (str2.equals("CPH1609")) {
                                c4 = 17;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1709443163:
                            if (str2.equals("iball8735_9806")) {
                                c4 = '3';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1865889110:
                            if (str2.equals("santoni")) {
                                c4 = '_';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1906253259:
                            if (str2.equals("PB2-670M")) {
                                c4 = 'O';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1977196784:
                            if (str2.equals("Infinix-X572")) {
                                c4 = '4';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2029784656:
                            if (str2.equals("HWBLN-H")) {
                                c4 = '0';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2030379515:
                            if (str2.equals("HWCAM-H")) {
                                c4 = '1';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2047190025:
                            if (str2.equals("ELUGA_Note")) {
                                c4 = 24;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2047252157:
                            if (str2.equals("ELUGA_Prim")) {
                                c4 = 25;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2048319463:
                            if (str2.equals("HWVNS-H")) {
                                c4 = '2';
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
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
                        case j.f5963M /* 38 */:
                        case '\'':
                        case j.f5965O /* 40 */:
                        case ')':
                        case '*':
                        case j.f5968R /* 43 */:
                        case j.f5969S /* 44 */:
                        case j.f5970T /* 45 */:
                        case '.':
                        case '/':
                        case j.f5973W /* 48 */:
                        case j.f5974X /* 49 */:
                        case '2':
                        case '3':
                        case '4':
                        case i.f14980d /* 53 */:
                        case '6':
                        case '7':
                        case p.a.f19837e /* 56 */:
                        case '9':
                        case ':':
                        case j.v.f12748n /* 59 */:
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case j.v.f12733G /* 65 */:
                        case 'B':
                        case j.v.f12739d /* 67 */:
                        case 'D':
                        case j.v.f12730D /* 69 */:
                        case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                        case 'G':
                        case 'H':
                        case 'I':
                        case j.v.f12755u /* 74 */:
                        case j.v.f12756v /* 75 */:
                        case j.v.f12760z /* 76 */:
                        case j.v.f12728B /* 77 */:
                        case 'N':
                        case j.v.f12727A /* 79 */:
                        case j.v.f12729C /* 80 */:
                        case j.v.f12731E /* 81 */:
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
                        case j.v.f12734H /* 92 */:
                        case j.v.f12735I /* 93 */:
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
                        case com.anythink.expressad.video.module.a.a.f21914z /* 109 */:
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                            f8728A = true;
                            break;
                    }
                    String str3 = af.f8506d;
                    int hashCode = str3.hashCode();
                    if (hashCode != 2006354) {
                        if (hashCode == 2006367 && str3.equals("AFTN")) {
                            z8 = true;
                            if (z8 || z8) {
                                f8728A = true;
                            }
                            f8736z = true;
                        }
                        z8 = -1;
                        if (z8) {
                        }
                        f8728A = true;
                        f8736z = true;
                    } else {
                        if (str3.equals("AFTA")) {
                            if (z8) {
                            }
                            f8728A = true;
                            f8736z = true;
                        }
                        z8 = -1;
                        if (z8) {
                        }
                        f8728A = true;
                        f8736z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8728A;
    }
}
