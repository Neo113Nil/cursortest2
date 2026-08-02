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
    private static boolean f9357A = false;

    /* renamed from: s, reason: collision with root package name */
    private static final String f9358s = "MediaCodecVideoRenderer";

    /* renamed from: t, reason: collision with root package name */
    private static final String f9359t = "crop-left";

    /* renamed from: u, reason: collision with root package name */
    private static final String f9360u = "crop-right";

    /* renamed from: v, reason: collision with root package name */
    private static final String f9361v = "crop-bottom";

    /* renamed from: w, reason: collision with root package name */
    private static final String f9362w = "crop-top";

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f9363x = {1920, 1600, com.onesignal.core.internal.config.e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1280, 960, 854, 640, 540, 480};

    /* renamed from: y, reason: collision with root package name */
    private static final int f9364y = 10;

    /* renamed from: z, reason: collision with root package name */
    private static boolean f9365z;

    /* renamed from: B, reason: collision with root package name */
    private final Context f9366B;

    /* renamed from: C, reason: collision with root package name */
    private final f f9367C;

    /* renamed from: D, reason: collision with root package name */
    private final h.a f9368D;

    /* renamed from: E, reason: collision with root package name */
    private final long f9369E;

    /* renamed from: F, reason: collision with root package name */
    private final int f9370F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f9371G;

    /* renamed from: H, reason: collision with root package name */
    private final long[] f9372H;

    /* renamed from: I, reason: collision with root package name */
    private final long[] f9373I;
    private a J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f9374K;

    /* renamed from: L, reason: collision with root package name */
    private Surface f9375L;

    /* renamed from: M, reason: collision with root package name */
    private Surface f9376M;

    /* renamed from: N, reason: collision with root package name */
    private int f9377N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f9378O;

    /* renamed from: P, reason: collision with root package name */
    private long f9379P;

    /* renamed from: Q, reason: collision with root package name */
    private long f9380Q;

    /* renamed from: R, reason: collision with root package name */
    private long f9381R;

    /* renamed from: S, reason: collision with root package name */
    private int f9382S;

    /* renamed from: T, reason: collision with root package name */
    private int f9383T;

    /* renamed from: U, reason: collision with root package name */
    private int f9384U;

    /* renamed from: V, reason: collision with root package name */
    private long f9385V;

    /* renamed from: W, reason: collision with root package name */
    private int f9386W;

    /* renamed from: X, reason: collision with root package name */
    private float f9387X;
    private int Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f9388Z;
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
    b f9389r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f9390a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9391b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9392c;

        public a(int i, int i4, int i6) {
            this.f9390a = i;
            this.f9391b = i4;
            this.f9392c = i6;
        }
    }

    public final class b implements MediaCodec.OnFrameRenderedListener {
        public /* synthetic */ b(e eVar, MediaCodec mediaCodec, byte b9) {
            this(mediaCodec);
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(MediaCodec mediaCodec, long j6, long j9) {
            e eVar = e.this;
            if (this != eVar.f9389r) {
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
        this.f9380Q = this.f9369E > 0 ? SystemClock.elapsedRealtime() + this.f9369E : com.anythink.basead.exoplayer.b.f7168b;
    }

    private void E() {
        MediaCodec y7;
        byte b9 = 0;
        this.f9378O = false;
        if (af.f9132a < 23 || !this.ag || (y7 = y()) == null) {
            return;
        }
        this.f9389r = new b(this, y7, b9);
    }

    private void F() {
        if (this.f9378O) {
            this.f9368D.a(this.f9375L);
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
        if (i == -1 && this.f9388Z == -1) {
            return;
        }
        if (this.ac == i && this.ad == this.f9388Z && this.ae == this.aa && this.af == this.ab) {
            return;
        }
        this.f9368D.a(i, this.f9388Z, this.aa, this.ab);
        this.ac = this.Y;
        this.ad = this.f9388Z;
        this.ae = this.aa;
        this.af = this.ab;
    }

    private void I() {
        int i = this.ac;
        if (i == -1 && this.ad == -1) {
            return;
        }
        this.f9368D.a(i, this.ad, this.ae, this.af);
    }

    private void J() {
        if (this.f9382S > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f9368D.a(this.f9382S, elapsedRealtime - this.f9381R);
            this.f9382S = 0;
            this.f9381R = elapsedRealtime;
        }
    }

    private static boolean K() {
        return af.f9132a <= 22 && "foster".equals(af.f9133b) && "NVIDIA".equals(af.f9134c);
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
        ((com.anythink.basead.exoplayer.f.b) this).f8026q.i++;
        b(this.f9384U + b9);
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
            this.f9384U = 0;
            Surface surface = this.f9376M;
            if (surface != null) {
                if (this.f9375L == surface) {
                    this.f9375L = null;
                }
                surface.release();
                this.f9376M = null;
            }
        } catch (Throwable th) {
            this.f9384U = 0;
            if (this.f9376M != null) {
                Surface surface2 = this.f9375L;
                Surface surface3 = this.f9376M;
                if (surface2 == surface3) {
                    this.f9375L = null;
                }
                surface3.release();
                this.f9376M = null;
            }
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void B() {
        super.B();
        this.f9384U = 0;
    }

    public final void C() {
        if (this.f9378O) {
            return;
        }
        this.f9378O = true;
        this.f9368D.a(this.f9375L);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.c cVar, com.anythink.basead.exoplayer.d.g<k> gVar, m mVar) {
        boolean z6;
        int i;
        int i4;
        String str = mVar.f9451h;
        if (!o.b(str)) {
            return 0;
        }
        com.anythink.basead.exoplayer.d.e eVar = mVar.f9453k;
        if (eVar != null) {
            z6 = false;
            for (int i6 = 0; i6 < eVar.f7631b; i6++) {
                z6 |= eVar.a(i6).f7637d;
            }
        } else {
            z6 = false;
        }
        com.anythink.basead.exoplayer.f.a a9 = cVar.a(str, z6);
        if (a9 == null) {
            return (!z6 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (!com.anythink.basead.exoplayer.a.a(gVar, eVar)) {
            return 2;
        }
        boolean b9 = a9.b(mVar.f9448e);
        if (b9 && (i = mVar.f9455m) > 0 && (i4 = mVar.f9456n) > 0) {
            if (af.f9132a >= 21) {
                b9 = a9.a(i, i4, mVar.f9457o);
            } else {
                boolean z9 = i * i4 <= com.anythink.basead.exoplayer.f.d.b();
                if (!z9) {
                    Log.d(f9358s, "FalseCheck [legacyFrameSize, " + mVar.f9455m + "x" + mVar.f9456n + "] [" + af.f9136e + "]");
                }
                b9 = z9;
            }
        }
        return (b9 ? 4 : 3) | (a9.f7987f ? 16 : 8) | (a9.f7988g ? 32 : 0);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void b(m mVar) {
        super.b(mVar);
        this.f9368D.a(mVar);
        this.f9387X = mVar.f9459q;
        this.f9386W = mVar.f9458p;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void c(long j6) {
        this.f9384U--;
        while (true) {
            int i = this.ak;
            if (i == 0 || j6 < this.f9373I[0]) {
                return;
            }
            long[] jArr = this.f9372H;
            this.aj = jArr[0];
            int i4 = i - 1;
            this.ak = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
            long[] jArr2 = this.f9373I;
            System.arraycopy(jArr2, 1, jArr2, 0, this.ak);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void n() {
        super.n();
        this.f9382S = 0;
        this.f9381R = SystemClock.elapsedRealtime();
        this.f9385V = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void o() {
        this.f9380Q = com.anythink.basead.exoplayer.b.f7168b;
        J();
        super.o();
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void p() {
        this.Y = -1;
        this.f9388Z = -1;
        this.ab = -1.0f;
        this.f9387X = -1.0f;
        this.aj = com.anythink.basead.exoplayer.b.f7168b;
        this.ai = com.anythink.basead.exoplayer.b.f7168b;
        this.ak = 0;
        G();
        E();
        this.f9367C.b();
        this.f9389r = null;
        this.ag = false;
        try {
            super.p();
        } finally {
            this.f9368D.b(((com.anythink.basead.exoplayer.f.b) this).f8026q);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.y
    public final boolean u() {
        Surface surface;
        if (super.u() && (this.f9378O || (((surface = this.f9376M) != null && this.f9375L == surface) || y() == null || this.ag))) {
            this.f9380Q = com.anythink.basead.exoplayer.b.f7168b;
            return true;
        }
        if (this.f9380Q == com.anythink.basead.exoplayer.b.f7168b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f9380Q) {
            return true;
        }
        this.f9380Q = com.anythink.basead.exoplayer.b.f7168b;
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
        boolean z6 = false;
        this.f9369E = j6;
        this.f9370F = i;
        Context applicationContext = context.getApplicationContext();
        this.f9366B = applicationContext;
        this.f9367C = new f(applicationContext);
        this.f9368D = new h.a(handler, hVar);
        if (af.f9132a <= 22 && "foster".equals(af.f9133b) && "NVIDIA".equals(af.f9134c)) {
            z6 = true;
        }
        this.f9371G = z6;
        this.f9372H = new long[10];
        this.f9373I = new long[10];
        this.aj = com.anythink.basead.exoplayer.b.f7168b;
        this.ai = com.anythink.basead.exoplayer.b.f7168b;
        this.f9380Q = com.anythink.basead.exoplayer.b.f7168b;
        this.Y = -1;
        this.f9388Z = -1;
        this.ab = -1.0f;
        this.f9387X = -1.0f;
        this.f9377N = 1;
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
        this.f9385V = SystemClock.elapsedRealtime() * 1000;
        ((com.anythink.basead.exoplayer.f.b) this).f8026q.f7520e++;
        this.f9383T = 0;
        C();
    }

    private void b(int i) {
        com.anythink.basead.exoplayer.c.d dVar = ((com.anythink.basead.exoplayer.f.b) this).f8026q;
        dVar.f7522g += i;
        this.f9382S += i;
        int i4 = this.f9383T + i;
        this.f9383T = i4;
        dVar.f7523h = Math.max(i4, dVar.f7523h);
        if (this.f9382S >= this.f9370F) {
            J();
        }
    }

    private boolean b(com.anythink.basead.exoplayer.f.a aVar) {
        if (af.f9132a < 23 || this.ag || a(aVar.f7984c)) {
            return false;
        }
        return !aVar.f7989h || c.a(this.f9366B);
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(boolean z6) {
        super.a(z6);
        int i = r().f7096b;
        this.ah = i;
        this.ag = i != 0;
        this.f9368D.a(((com.anythink.basead.exoplayer.f.b) this).f8026q);
        this.f9367C.a();
    }

    private static int b(com.anythink.basead.exoplayer.f.a aVar, m mVar) {
        if (mVar.i != -1) {
            int size = mVar.f9452j.size();
            int i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i += mVar.f9452j.get(i4).length;
            }
            return mVar.i + i;
        }
        return a(aVar, mVar.f9451h, mVar.f9455m, mVar.f9456n);
    }

    @Override // com.anythink.basead.exoplayer.a
    public final void a(m[] mVarArr, long j6) {
        if (this.aj == com.anythink.basead.exoplayer.b.f7168b) {
            this.aj = j6;
        } else {
            int i = this.ak;
            if (i == this.f9372H.length) {
                Log.w(f9358s, "Too many stream changes, so dropping offset: " + this.f9372H[this.ak - 1]);
            } else {
                this.ak = i + 1;
            }
            long[] jArr = this.f9372H;
            int i4 = this.ak;
            jArr[i4 - 1] = j6;
            this.f9373I[i4 - 1] = this.ai;
        }
        super.a(mVarArr, j6);
    }

    @Override // com.anythink.basead.exoplayer.f.b, com.anythink.basead.exoplayer.a
    public final void a(long j6, boolean z6) {
        super.a(j6, z6);
        E();
        this.f9379P = com.anythink.basead.exoplayer.b.f7168b;
        this.f9383T = 0;
        this.ai = com.anythink.basead.exoplayer.b.f7168b;
        int i = this.ak;
        if (i != 0) {
            this.aj = this.f9372H[i - 1];
            this.ak = 0;
        }
        if (z6) {
            D();
        } else {
            this.f9380Q = com.anythink.basead.exoplayer.b.f7168b;
        }
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.x.b
    public final void a(int i, Object obj) {
        if (i != 1) {
            if (i == 4) {
                this.f9377N = ((Integer) obj).intValue();
                MediaCodec y7 = y();
                if (y7 != null) {
                    y7.setVideoScalingMode(this.f9377N);
                    return;
                }
                return;
            }
            super.a(i, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.f9376M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.anythink.basead.exoplayer.f.a z6 = z();
                if (z6 != null && b(z6)) {
                    surface = c.a(this.f9366B, z6.f7989h);
                    this.f9376M = surface;
                }
            }
        }
        if (this.f9375L != surface) {
            this.f9375L = surface;
            int a_ = a_();
            if (a_ == 1 || a_ == 2) {
                MediaCodec y9 = y();
                if (af.f9132a >= 23 && y9 != null && surface != null && !this.f9374K) {
                    y9.setOutputSurface(surface);
                } else {
                    A();
                    x();
                }
            }
            if (surface != null && surface != this.f9376M) {
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
        if (surface == null || surface == this.f9376M) {
            return;
        }
        I();
        if (this.f9378O) {
            this.f9368D.a(this.f9375L);
        }
    }

    private void a(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f9376M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.anythink.basead.exoplayer.f.a z6 = z();
                if (z6 != null && b(z6)) {
                    surface = c.a(this.f9366B, z6.f7989h);
                    this.f9376M = surface;
                }
            }
        }
        if (this.f9375L != surface) {
            this.f9375L = surface;
            int a_ = a_();
            if (a_ == 1 || a_ == 2) {
                MediaCodec y7 = y();
                if (af.f9132a >= 23 && y7 != null && surface != null && !this.f9374K) {
                    y7.setOutputSurface(surface);
                } else {
                    A();
                    x();
                }
            }
            if (surface != null && surface != this.f9376M) {
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
        if (surface == null || surface == this.f9376M) {
            return;
        }
        I();
        if (this.f9378O) {
            this.f9368D.a(this.f9375L);
        }
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final boolean a(com.anythink.basead.exoplayer.f.a aVar) {
        return this.f9375L != null || b(aVar);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.f.a aVar, MediaCodec mediaCodec, m mVar, MediaCrypto mediaCrypto) {
        a aVar2;
        m[] q8 = q();
        int i = mVar.f9455m;
        int i4 = mVar.f9456n;
        int b9 = b(aVar, mVar);
        byte b10 = 0;
        if (q8.length == 1) {
            aVar2 = new a(i, i4, b9);
        } else {
            boolean z6 = false;
            for (m mVar2 : q8) {
                if (a(aVar.f7987f, mVar, mVar2)) {
                    int i6 = mVar2.f9455m;
                    z6 |= i6 == -1 || mVar2.f9456n == -1;
                    i = Math.max(i, i6);
                    i4 = Math.max(i4, mVar2.f9456n);
                    b9 = Math.max(b9, b(aVar, mVar2));
                }
            }
            if (z6) {
                Log.w(f9358s, "Resolutions unknown. Codec max resolution: " + i + "x" + i4);
                Point a9 = a(aVar, mVar);
                if (a9 != null) {
                    i = Math.max(i, a9.x);
                    i4 = Math.max(i4, a9.y);
                    b9 = Math.max(b9, a(aVar, mVar.f9451h, i, i4));
                    Log.w(f9358s, "Codec max resolution adjusted to: " + i + "x" + i4);
                }
            }
            aVar2 = new a(i, i4, b9);
        }
        this.J = aVar2;
        boolean z9 = this.f9371G;
        int i9 = this.ah;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f9451h);
        mediaFormat.setInteger("width", mVar.f9455m);
        mediaFormat.setInteger("height", mVar.f9456n);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f9452j);
        float f2 = mVar.f9457o;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "rotation-degrees", mVar.f9458p);
        com.anythink.basead.exoplayer.l.b bVar = mVar.f9462t;
        if (bVar != null) {
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-transfer", bVar.f9337c);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-standard", bVar.f9335a);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-range", bVar.f9336b);
            byte[] bArr = bVar.f9338d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar2.f9390a);
        mediaFormat.setInteger("max-height", aVar2.f9391b);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", aVar2.f9392c);
        int i10 = af.f9132a;
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z9) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i9 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i9);
        }
        if (this.f9375L == null) {
            com.anythink.basead.exoplayer.k.a.b(b(aVar));
            if (this.f9376M == null) {
                this.f9376M = c.a(this.f9366B, aVar.f7989h);
            }
            this.f9375L = this.f9376M;
        }
        mediaCodec.configure(mediaFormat, this.f9375L, mediaCrypto, 0);
        if (i10 < 23 || !this.ag) {
            return;
        }
        this.f9389r = new b(this, mediaCodec, b10);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final int a(com.anythink.basead.exoplayer.f.a aVar, m mVar, m mVar2) {
        if (!a(aVar.f7987f, mVar, mVar2)) {
            return 0;
        }
        int i = mVar2.f9455m;
        a aVar2 = this.J;
        if (i > aVar2.f9390a || mVar2.f9456n > aVar2.f9391b || b(aVar, mVar2) > this.J.f9392c) {
            return 0;
        }
        return mVar.b(mVar2) ? 1 : 3;
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(String str, long j6, long j9) {
        this.f9368D.a(str, j6, j9);
        this.f9374K = a(str);
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(com.anythink.basead.exoplayer.c.e eVar) {
        this.f9384U++;
        this.ai = Math.max(eVar.f7529f, this.ai);
        if (af.f9132a >= 23 || !this.ag) {
            return;
        }
        C();
    }

    @Override // com.anythink.basead.exoplayer.f.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z6 = mediaFormat.containsKey(f9360u) && mediaFormat.containsKey(f9359t) && mediaFormat.containsKey(f9361v) && mediaFormat.containsKey(f9362w);
        if (z6) {
            integer = (mediaFormat.getInteger(f9360u) - mediaFormat.getInteger(f9359t)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.Y = integer;
        if (z6) {
            integer2 = (mediaFormat.getInteger(f9361v) - mediaFormat.getInteger(f9362w)) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f9388Z = integer2;
        float f2 = this.f9387X;
        this.ab = f2;
        if (af.f9132a >= 21) {
            int i = this.f9386W;
            if (i == 90 || i == 270) {
                int i4 = this.Y;
                this.Y = integer2;
                this.f9388Z = i4;
                this.ab = 1.0f / f2;
            }
        } else {
            this.aa = this.f9386W;
        }
        mediaCodec.setVideoScalingMode(this.f9377N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r7 > 100000) goto L62;
     */
    @Override // com.anythink.basead.exoplayer.f.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j6, long j9, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i4, long j10, boolean z6) {
        int b9;
        if (this.f9379P == com.anythink.basead.exoplayer.b.f7168b) {
            this.f9379P = j6;
        }
        if (z6) {
            a(mediaCodec, i);
            return true;
        }
        long j11 = j10 - j6;
        if (this.f9375L == this.f9376M) {
            if (!g(j11)) {
                return false;
            }
            a(mediaCodec, i);
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z9 = a_() == 2;
        if (this.f9378O) {
            if (z9) {
                long j12 = elapsedRealtime - this.f9385V;
                if (g(j11)) {
                }
            }
            if (z9 && j6 != this.f9379P) {
                long j13 = j11 - (elapsedRealtime - j9);
                long nanoTime = System.nanoTime();
                long a9 = this.f9367C.a(j10, (j13 * 1000) + nanoTime);
                long j14 = (a9 - nanoTime) / 1000;
                if (j14 < -500000 && (b9 = b(j6)) != 0) {
                    ((com.anythink.basead.exoplayer.f.b) this).f8026q.i++;
                    b(this.f9384U + b9);
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
                if (af.f9132a >= 21) {
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
        if (af.f9132a >= 21) {
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
        ((com.anythink.basead.exoplayer.f.b) this).f8026q.f7521f++;
    }

    private void a(MediaCodec mediaCodec, int i, long j6) {
        H();
        ad.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j6);
        ad.a();
        this.f9385V = SystemClock.elapsedRealtime() * 1000;
        ((com.anythink.basead.exoplayer.f.b) this).f8026q.f7520e++;
        this.f9383T = 0;
        C();
    }

    private static void a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private static void a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private static MediaFormat a(m mVar, a aVar, boolean z6, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f9451h);
        mediaFormat.setInteger("width", mVar.f9455m);
        mediaFormat.setInteger("height", mVar.f9456n);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, mVar.f9452j);
        float f2 = mVar.f9457o;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "rotation-degrees", mVar.f9458p);
        com.anythink.basead.exoplayer.l.b bVar = mVar.f9462t;
        if (bVar != null) {
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-transfer", bVar.f9337c);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-standard", bVar.f9335a);
            com.anythink.basead.exoplayer.f.e.a(mediaFormat, "color-range", bVar.f9336b);
            byte[] bArr = bVar.f9338d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar.f9390a);
        mediaFormat.setInteger("max-height", aVar.f9391b);
        com.anythink.basead.exoplayer.f.e.a(mediaFormat, "max-input-size", aVar.f9392c);
        if (af.f9132a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z6) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        return mediaFormat;
    }

    private static a a(com.anythink.basead.exoplayer.f.a aVar, m mVar, m[] mVarArr) {
        int i = mVar.f9455m;
        int i4 = mVar.f9456n;
        int b9 = b(aVar, mVar);
        if (mVarArr.length == 1) {
            return new a(i, i4, b9);
        }
        boolean z6 = false;
        for (m mVar2 : mVarArr) {
            if (a(aVar.f7987f, mVar, mVar2)) {
                int i6 = mVar2.f9455m;
                z6 |= i6 == -1 || mVar2.f9456n == -1;
                i = Math.max(i, i6);
                i4 = Math.max(i4, mVar2.f9456n);
                b9 = Math.max(b9, b(aVar, mVar2));
            }
        }
        if (z6) {
            Log.w(f9358s, "Resolutions unknown. Codec max resolution: " + i + "x" + i4);
            Point a9 = a(aVar, mVar);
            if (a9 != null) {
                i = Math.max(i, a9.x);
                i4 = Math.max(i4, a9.y);
                b9 = Math.max(b9, a(aVar, mVar.f9451h, i, i4));
                Log.w(f9358s, "Codec max resolution adjusted to: " + i + "x" + i4);
            }
        }
        return new a(i, i4, b9);
    }

    private static Point a(com.anythink.basead.exoplayer.f.a aVar, m mVar) {
        int i = mVar.f9456n;
        int i4 = mVar.f9455m;
        boolean z6 = i > i4;
        int i6 = z6 ? i : i4;
        if (z6) {
            i = i4;
        }
        float f2 = i / i6;
        for (int i9 : f9363x) {
            int i10 = (int) (i9 * f2);
            if (i9 <= i6 || i10 <= i) {
                break;
            }
            if (af.f9132a >= 21) {
                int i11 = z6 ? i10 : i9;
                if (!z6) {
                    i9 = i10;
                }
                Point a9 = aVar.a(i11, i9);
                if (aVar.a(a9.x, a9.y, mVar.f9457o)) {
                    return a9;
                }
            } else {
                int a10 = af.a(i9, 16) * 16;
                int a11 = af.a(i10, 16) * 16;
                if (a10 * a11 <= com.anythink.basead.exoplayer.f.d.b()) {
                    int i12 = z6 ? a11 : a10;
                    if (!z6) {
                        a10 = a11;
                    }
                    return new Point(i12, a10);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(com.anythink.basead.exoplayer.f.a aVar, String str, int i, int i4) {
        char c9;
        int i6;
        int i9 = 4;
        if (i == -1 || i4 == -1) {
            return -1;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(o.f9236g)) {
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
                if (str.equals(o.f9240l)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1331836730:
                if (str.equals(o.f9237h)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1599127256:
                if (str.equals(o.f9238j)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1599127257:
                if (str.equals(o.f9239k)) {
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
                i6 = i * i4;
                i9 = 2;
                break;
            case 1:
            case 5:
                i6 = i * i4;
                break;
            case 3:
                String str2 = af.f9135d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(af.f9134c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !aVar.f7989h)))) {
                    i6 = af.a(i4, 16) * af.a(i, 16) * 256;
                    i9 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    private static boolean a(boolean z6, m mVar, m mVar2) {
        if (mVar.f9451h.equals(mVar2.f9451h) && mVar.f9458p == mVar2.f9458p) {
            return (z6 || (mVar.f9455m == mVar2.f9455m && mVar.f9456n == mVar2.f9456n)) && af.a(mVar.f9462t, mVar2.f9462t);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x05cb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(String str) {
        boolean z6 = false;
        char c9 = 27;
        if (af.f9132a >= 27 || str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (e.class) {
            try {
                if (!f9365z) {
                    String str2 = af.f9133b;
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
                        case j.f6592M /* 38 */:
                        case '\'':
                        case j.f6594O /* 40 */:
                        case ')':
                        case '*':
                        case j.f6597R /* 43 */:
                        case j.f6598S /* 44 */:
                        case j.f6599T /* 45 */:
                        case '.':
                        case '/':
                        case j.f6602W /* 48 */:
                        case j.f6603X /* 49 */:
                        case '2':
                        case '3':
                        case '4':
                        case i.f15609d /* 53 */:
                        case '6':
                        case '7':
                        case p.a.f20466e /* 56 */:
                        case '9':
                        case ':':
                        case j.v.f13377n /* 59 */:
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case j.v.f13362G /* 65 */:
                        case 'B':
                        case j.v.f13368d /* 67 */:
                        case 'D':
                        case j.v.f13359D /* 69 */:
                        case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                        case 'G':
                        case 'H':
                        case 'I':
                        case j.v.f13384u /* 74 */:
                        case j.v.f13385v /* 75 */:
                        case j.v.f13389z /* 76 */:
                        case j.v.f13357B /* 77 */:
                        case 'N':
                        case j.v.f13356A /* 79 */:
                        case j.v.f13358C /* 80 */:
                        case j.v.f13360E /* 81 */:
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
                        case j.v.f13363H /* 92 */:
                        case j.v.f13364I /* 93 */:
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
                        case com.anythink.expressad.video.module.a.a.f22543z /* 109 */:
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                            f9357A = true;
                            break;
                    }
                    String str3 = af.f9135d;
                    int hashCode = str3.hashCode();
                    if (hashCode != 2006354) {
                        if (hashCode == 2006367 && str3.equals("AFTN")) {
                            z6 = true;
                            if (z6 || z6) {
                                f9357A = true;
                            }
                            f9365z = true;
                        }
                        z6 = -1;
                        if (z6) {
                        }
                        f9357A = true;
                        f9365z = true;
                    } else {
                        if (str3.equals("AFTA")) {
                            if (z6) {
                            }
                            f9357A = true;
                            f9365z = true;
                        }
                        z6 = -1;
                        if (z6) {
                        }
                        f9357A = true;
                        f9365z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9357A;
    }
}
