package com.anythink.basead.exoplayer.b;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7248a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7249b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7250c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7251d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f7252e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7253f = 5000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7254g = 10000000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7255h = 500000;
    private static final int i = 500000;

    /* renamed from: j, reason: collision with root package name */
    private final a f7256j;

    /* renamed from: k, reason: collision with root package name */
    private int f7257k;

    /* renamed from: l, reason: collision with root package name */
    private long f7258l;

    /* renamed from: m, reason: collision with root package name */
    private long f7259m;

    /* renamed from: n, reason: collision with root package name */
    private long f7260n;

    /* renamed from: o, reason: collision with root package name */
    private long f7261o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f7262a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f7263b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f7264c;

        /* renamed from: d, reason: collision with root package name */
        private long f7265d;

        /* renamed from: e, reason: collision with root package name */
        private long f7266e;

        public a(AudioTrack audioTrack) {
            this.f7262a = audioTrack;
        }

        public final boolean a() {
            boolean timestamp = this.f7262a.getTimestamp(this.f7263b);
            if (timestamp) {
                long j6 = this.f7263b.framePosition;
                if (this.f7265d > j6) {
                    this.f7264c++;
                }
                this.f7265d = j6;
                this.f7266e = j6 + (this.f7264c << 32);
            }
            return timestamp;
        }

        public final long b() {
            return this.f7263b.nanoTime / 1000;
        }

        public final long c() {
            return this.f7266e;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public i(AudioTrack audioTrack) {
        if (af.f9132a >= 19) {
            this.f7256j = new a(audioTrack);
            e();
        } else {
            this.f7256j = null;
            a(3);
        }
    }

    public final boolean a(long j6) {
        a aVar = this.f7256j;
        if (aVar == null || j6 - this.f7260n < this.f7259m) {
            return false;
        }
        this.f7260n = j6;
        boolean a9 = aVar.a();
        int i4 = this.f7257k;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (a9) {
                        e();
                        return a9;
                    }
                } else if (!a9) {
                    e();
                    return a9;
                }
            } else {
                if (!a9) {
                    e();
                    return a9;
                }
                if (this.f7256j.c() > this.f7261o) {
                    a(2);
                    return a9;
                }
            }
        } else {
            if (a9) {
                if (this.f7256j.b() < this.f7258l) {
                    return false;
                }
                this.f7261o = this.f7256j.c();
                a(1);
                return a9;
            }
            if (j6 - this.f7258l > 500000) {
                a(3);
            }
        }
        return a9;
    }

    public final void b() {
        if (this.f7257k == 4) {
            e();
        }
    }

    public final boolean c() {
        int i4 = this.f7257k;
        return i4 == 1 || i4 == 2;
    }

    public final boolean d() {
        return this.f7257k == 2;
    }

    public final void e() {
        if (this.f7256j != null) {
            a(0);
        }
    }

    public final long f() {
        a aVar = this.f7256j;
        return aVar != null ? aVar.b() : com.anythink.basead.exoplayer.b.f7168b;
    }

    public final long g() {
        a aVar = this.f7256j;
        if (aVar != null) {
            return aVar.c();
        }
        return -1L;
    }

    public final void a() {
        a(4);
    }

    private void a(int i4) {
        this.f7257k = i4;
        if (i4 == 0) {
            this.f7260n = 0L;
            this.f7261o = -1L;
            this.f7258l = System.nanoTime() / 1000;
            this.f7259m = com.anythink.basead.exoplayer.f.f7973a;
            return;
        }
        if (i4 == 1) {
            this.f7259m = com.anythink.basead.exoplayer.f.f7973a;
            return;
        }
        if (i4 == 2 || i4 == 3) {
            this.f7259m = 10000000L;
        } else {
            if (i4 == 4) {
                this.f7259m = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
