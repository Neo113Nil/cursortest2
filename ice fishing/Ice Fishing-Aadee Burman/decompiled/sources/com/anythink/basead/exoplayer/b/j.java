package com.anythink.basead.exoplayer.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6481a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6482b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6483c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final long f6484d = 5000000;

    /* renamed from: e, reason: collision with root package name */
    private static final long f6485e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f6486f = 200;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6487g = 10;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6488h = 30000;
    private static final int i = 500000;

    /* renamed from: A, reason: collision with root package name */
    private long f6489A;

    /* renamed from: B, reason: collision with root package name */
    private long f6490B;

    /* renamed from: C, reason: collision with root package name */
    private int f6491C;

    /* renamed from: D, reason: collision with root package name */
    private int f6492D;

    /* renamed from: E, reason: collision with root package name */
    private long f6493E;

    /* renamed from: F, reason: collision with root package name */
    private long f6494F;

    /* renamed from: G, reason: collision with root package name */
    private long f6495G;

    /* renamed from: H, reason: collision with root package name */
    private long f6496H;

    /* renamed from: j, reason: collision with root package name */
    private final a f6497j;

    /* renamed from: k, reason: collision with root package name */
    private final long[] f6498k;

    /* renamed from: l, reason: collision with root package name */
    private AudioTrack f6499l;

    /* renamed from: m, reason: collision with root package name */
    private int f6500m;

    /* renamed from: n, reason: collision with root package name */
    private int f6501n;

    /* renamed from: o, reason: collision with root package name */
    private i f6502o;

    /* renamed from: p, reason: collision with root package name */
    private int f6503p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6504q;

    /* renamed from: r, reason: collision with root package name */
    private long f6505r;

    /* renamed from: s, reason: collision with root package name */
    private long f6506s;

    /* renamed from: t, reason: collision with root package name */
    private long f6507t;

    /* renamed from: u, reason: collision with root package name */
    private Method f6508u;

    /* renamed from: v, reason: collision with root package name */
    private long f6509v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6510w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6511x;

    /* renamed from: y, reason: collision with root package name */
    private long f6512y;

    /* renamed from: z, reason: collision with root package name */
    private long f6513z;

    public interface a {
        void a(int i, long j6);

        void a(long j6);

        void a(long j6, long j9, long j10, long j11);

        void b(long j6, long j9, long j10, long j11);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public j(a aVar) {
        this.f6497j = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
        if (af.f8346a >= 18) {
            try {
                this.f6508u = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f6498k = new long[10];
    }

    private void f(long j6) {
        Method method;
        if (!this.f6511x || (method = this.f6508u) == null || j6 - this.f6512y < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) method.invoke(this.f6499l, null)).intValue() * 1000) - this.f6505r;
            this.f6509v = intValue;
            long max = Math.max(intValue, 0L);
            this.f6509v = max;
            if (max > 5000000) {
                this.f6497j.a(max);
                this.f6509v = 0L;
            }
        } catch (Exception unused) {
            this.f6508u = null;
        }
        this.f6512y = j6;
    }

    private long g(long j6) {
        return (j6 * 1000000) / this.f6503p;
    }

    private long h() {
        return g(i());
    }

    private long i() {
        if (this.f6493E != com.anythink.basead.exoplayer.b.f6382b) {
            return Math.min(this.f6496H, this.f6495G + ((((SystemClock.elapsedRealtime() * 1000) - this.f6493E) * this.f6503p) / 1000000));
        }
        int playState = this.f6499l.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f6499l.getPlaybackHeadPosition() & 4294967295L;
        if (this.f6504q) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f6490B = this.f6513z;
            }
            playbackHeadPosition += this.f6490B;
        }
        if (af.f8346a <= 28) {
            if (playbackHeadPosition == 0 && this.f6513z > 0 && playState == 3) {
                if (this.f6494F == com.anythink.basead.exoplayer.b.f6382b) {
                    this.f6494F = SystemClock.elapsedRealtime();
                }
                return this.f6513z;
            }
            this.f6494F = com.anythink.basead.exoplayer.b.f6382b;
        }
        if (this.f6513z > playbackHeadPosition) {
            this.f6489A++;
        }
        this.f6513z = playbackHeadPosition;
        return playbackHeadPosition + (this.f6489A << 32);
    }

    public final void a(AudioTrack audioTrack, int i6, int i9, int i10) {
        this.f6499l = audioTrack;
        this.f6500m = i9;
        this.f6501n = i10;
        this.f6502o = new i(audioTrack);
        this.f6503p = audioTrack.getSampleRate();
        this.f6504q = af.f8346a < 23 && (i6 == 5 || i6 == 6);
        boolean b9 = af.b(i6);
        this.f6511x = b9;
        this.f6505r = b9 ? g(i10 / i9) : -9223372036854775807L;
        this.f6513z = 0L;
        this.f6489A = 0L;
        this.f6490B = 0L;
        this.f6510w = false;
        this.f6493E = com.anythink.basead.exoplayer.b.f6382b;
        this.f6494F = com.anythink.basead.exoplayer.b.f6382b;
        this.f6509v = 0L;
    }

    public final boolean b() {
        return this.f6499l.getPlayState() == 3;
    }

    public final boolean c(long j6) {
        return this.f6494F != com.anythink.basead.exoplayer.b.f6382b && j6 > 0 && SystemClock.elapsedRealtime() - this.f6494F >= f6486f;
    }

    public final void d(long j6) {
        this.f6495G = i();
        this.f6493E = SystemClock.elapsedRealtime() * 1000;
        this.f6496H = j6;
    }

    public final boolean e(long j6) {
        return j6 > i() || g();
    }

    private boolean g() {
        return this.f6504q && this.f6499l.getPlayState() == 2 && i() == 0;
    }

    public final int b(long j6) {
        return this.f6501n - ((int) (j6 - (i() * this.f6500m)));
    }

    private void e() {
        long h9 = h();
        if (h9 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f6507t >= 30000) {
            long[] jArr = this.f6498k;
            int i6 = this.f6491C;
            jArr[i6] = h9 - nanoTime;
            this.f6491C = (i6 + 1) % 10;
            int i9 = this.f6492D;
            if (i9 < 10) {
                this.f6492D = i9 + 1;
            }
            this.f6507t = nanoTime;
            this.f6506s = 0L;
            int i10 = 0;
            while (true) {
                int i11 = this.f6492D;
                if (i10 >= i11) {
                    break;
                }
                this.f6506s = (this.f6498k[i10] / i11) + this.f6506s;
                i10++;
            }
        }
        if (this.f6504q) {
            return;
        }
        if (this.f6502o.a(nanoTime)) {
            long f3 = this.f6502o.f();
            long g4 = this.f6502o.g();
            if (Math.abs(f3 - nanoTime) > 5000000) {
                this.f6497j.b(g4, f3, nanoTime, h9);
                this.f6502o.a();
            } else if (Math.abs(g(g4) - h9) > 5000000) {
                this.f6497j.a(g4, f3, nanoTime, h9);
                this.f6502o.a();
            } else {
                this.f6502o.b();
            }
        }
        f(nanoTime);
    }

    public final boolean c() {
        f();
        if (this.f6493E != com.anythink.basead.exoplayer.b.f6382b) {
            return false;
        }
        this.f6502o.e();
        return true;
    }

    public final void d() {
        f();
        this.f6499l = null;
        this.f6502o = null;
    }

    private void f() {
        this.f6506s = 0L;
        this.f6492D = 0;
        this.f6491C = 0;
        this.f6507t = 0L;
    }

    public final long a(boolean z3) {
        long j6;
        if (this.f6499l.getPlayState() == 3) {
            long h9 = h();
            if (h9 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f6507t >= 30000) {
                    long[] jArr = this.f6498k;
                    int i6 = this.f6491C;
                    jArr[i6] = h9 - nanoTime;
                    this.f6491C = (i6 + 1) % 10;
                    int i9 = this.f6492D;
                    if (i9 < 10) {
                        this.f6492D = i9 + 1;
                    }
                    this.f6507t = nanoTime;
                    this.f6506s = 0L;
                    int i10 = 0;
                    while (true) {
                        int i11 = this.f6492D;
                        if (i10 >= i11) {
                            break;
                        }
                        this.f6506s = (this.f6498k[i10] / i11) + this.f6506s;
                        i10++;
                    }
                }
                if (!this.f6504q) {
                    if (this.f6502o.a(nanoTime)) {
                        long f3 = this.f6502o.f();
                        long g4 = this.f6502o.g();
                        if (Math.abs(f3 - nanoTime) > 5000000) {
                            this.f6497j.b(g4, f3, nanoTime, h9);
                            this.f6502o.a();
                        } else if (Math.abs(g(g4) - h9) > 5000000) {
                            this.f6497j.a(g4, f3, nanoTime, h9);
                            this.f6502o.a();
                        } else {
                            this.f6502o.b();
                        }
                    }
                    f(nanoTime);
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f6502o.c()) {
            long g9 = g(this.f6502o.g());
            return !this.f6502o.d() ? g9 : (nanoTime2 - this.f6502o.f()) + g9;
        }
        if (this.f6492D == 0) {
            j6 = h();
        } else {
            j6 = nanoTime2 + this.f6506s;
        }
        return !z3 ? j6 - this.f6509v : j6;
    }

    public final void a() {
        this.f6502o.e();
    }

    public final boolean a(long j6) {
        a aVar;
        int playState = this.f6499l.getPlayState();
        if (this.f6504q) {
            if (playState == 2) {
                this.f6510w = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z3 = this.f6510w;
        boolean e9 = e(j6);
        this.f6510w = e9;
        if (z3 && !e9 && playState != 1 && (aVar = this.f6497j) != null) {
            aVar.a(this.f6501n, com.anythink.basead.exoplayer.b.a(this.f6505r));
        }
        return true;
    }

    private void a(long j6, long j9) {
        if (this.f6502o.a(j6)) {
            long f3 = this.f6502o.f();
            long g4 = this.f6502o.g();
            if (Math.abs(f3 - j6) > 5000000) {
                this.f6497j.b(g4, f3, j6, j9);
                this.f6502o.a();
            } else if (Math.abs(g(g4) - j9) > 5000000) {
                this.f6497j.a(g4, f3, j6, j9);
                this.f6502o.a();
            } else {
                this.f6502o.b();
            }
        }
    }

    private static boolean a(int i6) {
        if (af.f8346a < 23) {
            return i6 == 5 || i6 == 6;
        }
        return false;
    }
}
