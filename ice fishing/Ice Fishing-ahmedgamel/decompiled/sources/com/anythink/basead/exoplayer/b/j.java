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
    private static final int f7267a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7268b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7269c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final long f7270d = 5000000;

    /* renamed from: e, reason: collision with root package name */
    private static final long f7271e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f7272f = 200;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7273g = 10;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7274h = 30000;
    private static final int i = 500000;

    /* renamed from: A, reason: collision with root package name */
    private long f7275A;

    /* renamed from: B, reason: collision with root package name */
    private long f7276B;

    /* renamed from: C, reason: collision with root package name */
    private int f7277C;

    /* renamed from: D, reason: collision with root package name */
    private int f7278D;

    /* renamed from: E, reason: collision with root package name */
    private long f7279E;

    /* renamed from: F, reason: collision with root package name */
    private long f7280F;

    /* renamed from: G, reason: collision with root package name */
    private long f7281G;

    /* renamed from: H, reason: collision with root package name */
    private long f7282H;

    /* renamed from: j, reason: collision with root package name */
    private final a f7283j;

    /* renamed from: k, reason: collision with root package name */
    private final long[] f7284k;

    /* renamed from: l, reason: collision with root package name */
    private AudioTrack f7285l;

    /* renamed from: m, reason: collision with root package name */
    private int f7286m;

    /* renamed from: n, reason: collision with root package name */
    private int f7287n;

    /* renamed from: o, reason: collision with root package name */
    private i f7288o;

    /* renamed from: p, reason: collision with root package name */
    private int f7289p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7290q;

    /* renamed from: r, reason: collision with root package name */
    private long f7291r;

    /* renamed from: s, reason: collision with root package name */
    private long f7292s;

    /* renamed from: t, reason: collision with root package name */
    private long f7293t;

    /* renamed from: u, reason: collision with root package name */
    private Method f7294u;

    /* renamed from: v, reason: collision with root package name */
    private long f7295v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7296w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7297x;

    /* renamed from: y, reason: collision with root package name */
    private long f7298y;

    /* renamed from: z, reason: collision with root package name */
    private long f7299z;

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
        this.f7283j = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
        if (af.f9132a >= 18) {
            try {
                this.f7294u = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7284k = new long[10];
    }

    private void f(long j6) {
        Method method;
        if (!this.f7297x || (method = this.f7294u) == null || j6 - this.f7298y < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) method.invoke(this.f7285l, null)).intValue() * 1000) - this.f7291r;
            this.f7295v = intValue;
            long max = Math.max(intValue, 0L);
            this.f7295v = max;
            if (max > 5000000) {
                this.f7283j.a(max);
                this.f7295v = 0L;
            }
        } catch (Exception unused) {
            this.f7294u = null;
        }
        this.f7298y = j6;
    }

    private long g(long j6) {
        return (j6 * 1000000) / this.f7289p;
    }

    private long h() {
        return g(i());
    }

    private long i() {
        if (this.f7279E != com.anythink.basead.exoplayer.b.f7168b) {
            return Math.min(this.f7282H, this.f7281G + ((((SystemClock.elapsedRealtime() * 1000) - this.f7279E) * this.f7289p) / 1000000));
        }
        int playState = this.f7285l.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f7285l.getPlaybackHeadPosition() & 4294967295L;
        if (this.f7290q) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f7276B = this.f7299z;
            }
            playbackHeadPosition += this.f7276B;
        }
        if (af.f9132a <= 28) {
            if (playbackHeadPosition == 0 && this.f7299z > 0 && playState == 3) {
                if (this.f7280F == com.anythink.basead.exoplayer.b.f7168b) {
                    this.f7280F = SystemClock.elapsedRealtime();
                }
                return this.f7299z;
            }
            this.f7280F = com.anythink.basead.exoplayer.b.f7168b;
        }
        if (this.f7299z > playbackHeadPosition) {
            this.f7275A++;
        }
        this.f7299z = playbackHeadPosition;
        return playbackHeadPosition + (this.f7275A << 32);
    }

    public final void a(AudioTrack audioTrack, int i4, int i6, int i9) {
        this.f7285l = audioTrack;
        this.f7286m = i6;
        this.f7287n = i9;
        this.f7288o = new i(audioTrack);
        this.f7289p = audioTrack.getSampleRate();
        this.f7290q = af.f9132a < 23 && (i4 == 5 || i4 == 6);
        boolean b9 = af.b(i4);
        this.f7297x = b9;
        this.f7291r = b9 ? g(i9 / i6) : -9223372036854775807L;
        this.f7299z = 0L;
        this.f7275A = 0L;
        this.f7276B = 0L;
        this.f7296w = false;
        this.f7279E = com.anythink.basead.exoplayer.b.f7168b;
        this.f7280F = com.anythink.basead.exoplayer.b.f7168b;
        this.f7295v = 0L;
    }

    public final boolean b() {
        return this.f7285l.getPlayState() == 3;
    }

    public final boolean c(long j6) {
        return this.f7280F != com.anythink.basead.exoplayer.b.f7168b && j6 > 0 && SystemClock.elapsedRealtime() - this.f7280F >= f7272f;
    }

    public final void d(long j6) {
        this.f7281G = i();
        this.f7279E = SystemClock.elapsedRealtime() * 1000;
        this.f7282H = j6;
    }

    public final boolean e(long j6) {
        return j6 > i() || g();
    }

    private boolean g() {
        return this.f7290q && this.f7285l.getPlayState() == 2 && i() == 0;
    }

    public final int b(long j6) {
        return this.f7287n - ((int) (j6 - (i() * this.f7286m)));
    }

    private void e() {
        long h3 = h();
        if (h3 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f7293t >= 30000) {
            long[] jArr = this.f7284k;
            int i4 = this.f7277C;
            jArr[i4] = h3 - nanoTime;
            this.f7277C = (i4 + 1) % 10;
            int i6 = this.f7278D;
            if (i6 < 10) {
                this.f7278D = i6 + 1;
            }
            this.f7293t = nanoTime;
            this.f7292s = 0L;
            int i9 = 0;
            while (true) {
                int i10 = this.f7278D;
                if (i9 >= i10) {
                    break;
                }
                this.f7292s = (this.f7284k[i9] / i10) + this.f7292s;
                i9++;
            }
        }
        if (this.f7290q) {
            return;
        }
        if (this.f7288o.a(nanoTime)) {
            long f2 = this.f7288o.f();
            long g9 = this.f7288o.g();
            if (Math.abs(f2 - nanoTime) > 5000000) {
                this.f7283j.b(g9, f2, nanoTime, h3);
                this.f7288o.a();
            } else if (Math.abs(g(g9) - h3) > 5000000) {
                this.f7283j.a(g9, f2, nanoTime, h3);
                this.f7288o.a();
            } else {
                this.f7288o.b();
            }
        }
        f(nanoTime);
    }

    public final boolean c() {
        f();
        if (this.f7279E != com.anythink.basead.exoplayer.b.f7168b) {
            return false;
        }
        this.f7288o.e();
        return true;
    }

    public final void d() {
        f();
        this.f7285l = null;
        this.f7288o = null;
    }

    private void f() {
        this.f7292s = 0L;
        this.f7278D = 0;
        this.f7277C = 0;
        this.f7293t = 0L;
    }

    public final long a(boolean z6) {
        long j6;
        if (this.f7285l.getPlayState() == 3) {
            long h3 = h();
            if (h3 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f7293t >= 30000) {
                    long[] jArr = this.f7284k;
                    int i4 = this.f7277C;
                    jArr[i4] = h3 - nanoTime;
                    this.f7277C = (i4 + 1) % 10;
                    int i6 = this.f7278D;
                    if (i6 < 10) {
                        this.f7278D = i6 + 1;
                    }
                    this.f7293t = nanoTime;
                    this.f7292s = 0L;
                    int i9 = 0;
                    while (true) {
                        int i10 = this.f7278D;
                        if (i9 >= i10) {
                            break;
                        }
                        this.f7292s = (this.f7284k[i9] / i10) + this.f7292s;
                        i9++;
                    }
                }
                if (!this.f7290q) {
                    if (this.f7288o.a(nanoTime)) {
                        long f2 = this.f7288o.f();
                        long g9 = this.f7288o.g();
                        if (Math.abs(f2 - nanoTime) > 5000000) {
                            this.f7283j.b(g9, f2, nanoTime, h3);
                            this.f7288o.a();
                        } else if (Math.abs(g(g9) - h3) > 5000000) {
                            this.f7283j.a(g9, f2, nanoTime, h3);
                            this.f7288o.a();
                        } else {
                            this.f7288o.b();
                        }
                    }
                    f(nanoTime);
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f7288o.c()) {
            long g10 = g(this.f7288o.g());
            return !this.f7288o.d() ? g10 : (nanoTime2 - this.f7288o.f()) + g10;
        }
        if (this.f7278D == 0) {
            j6 = h();
        } else {
            j6 = nanoTime2 + this.f7292s;
        }
        return !z6 ? j6 - this.f7295v : j6;
    }

    public final void a() {
        this.f7288o.e();
    }

    public final boolean a(long j6) {
        a aVar;
        int playState = this.f7285l.getPlayState();
        if (this.f7290q) {
            if (playState == 2) {
                this.f7296w = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z6 = this.f7296w;
        boolean e9 = e(j6);
        this.f7296w = e9;
        if (z6 && !e9 && playState != 1 && (aVar = this.f7283j) != null) {
            aVar.a(this.f7287n, com.anythink.basead.exoplayer.b.a(this.f7291r));
        }
        return true;
    }

    private void a(long j6, long j9) {
        if (this.f7288o.a(j6)) {
            long f2 = this.f7288o.f();
            long g9 = this.f7288o.g();
            if (Math.abs(f2 - j6) > 5000000) {
                this.f7283j.b(g9, f2, j6, j9);
                this.f7288o.a();
            } else if (Math.abs(g(g9) - j9) > 5000000) {
                this.f7283j.a(g9, f2, j6, j9);
                this.f7288o.a();
            } else {
                this.f7288o.b();
            }
        }
    }

    private static boolean a(int i4) {
        if (af.f9132a < 23) {
            return i4 == 5 || i4 == 6;
        }
        return false;
    }
}
