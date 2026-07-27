package com.anythink.basead.exoplayer.b;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6462a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6463b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6464c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f6465d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f6466e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f6467f = 5000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6468g = 10000000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6469h = 500000;
    private static final int i = 500000;

    /* renamed from: j, reason: collision with root package name */
    private final a f6470j;

    /* renamed from: k, reason: collision with root package name */
    private int f6471k;

    /* renamed from: l, reason: collision with root package name */
    private long f6472l;

    /* renamed from: m, reason: collision with root package name */
    private long f6473m;

    /* renamed from: n, reason: collision with root package name */
    private long f6474n;

    /* renamed from: o, reason: collision with root package name */
    private long f6475o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f6476a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f6477b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f6478c;

        /* renamed from: d, reason: collision with root package name */
        private long f6479d;

        /* renamed from: e, reason: collision with root package name */
        private long f6480e;

        public a(AudioTrack audioTrack) {
            this.f6476a = audioTrack;
        }

        public final boolean a() {
            boolean timestamp = this.f6476a.getTimestamp(this.f6477b);
            if (timestamp) {
                long j6 = this.f6477b.framePosition;
                if (this.f6479d > j6) {
                    this.f6478c++;
                }
                this.f6479d = j6;
                this.f6480e = j6 + (this.f6478c << 32);
            }
            return timestamp;
        }

        public final long b() {
            return this.f6477b.nanoTime / 1000;
        }

        public final long c() {
            return this.f6480e;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public i(AudioTrack audioTrack) {
        if (af.f8346a >= 19) {
            this.f6470j = new a(audioTrack);
            e();
        } else {
            this.f6470j = null;
            a(3);
        }
    }

    public final boolean a(long j6) {
        a aVar = this.f6470j;
        if (aVar == null || j6 - this.f6474n < this.f6473m) {
            return false;
        }
        this.f6474n = j6;
        boolean a9 = aVar.a();
        int i6 = this.f6471k;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
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
                if (this.f6470j.c() > this.f6475o) {
                    a(2);
                    return a9;
                }
            }
        } else {
            if (a9) {
                if (this.f6470j.b() < this.f6472l) {
                    return false;
                }
                this.f6475o = this.f6470j.c();
                a(1);
                return a9;
            }
            if (j6 - this.f6472l > 500000) {
                a(3);
            }
        }
        return a9;
    }

    public final void b() {
        if (this.f6471k == 4) {
            e();
        }
    }

    public final boolean c() {
        int i6 = this.f6471k;
        return i6 == 1 || i6 == 2;
    }

    public final boolean d() {
        return this.f6471k == 2;
    }

    public final void e() {
        if (this.f6470j != null) {
            a(0);
        }
    }

    public final long f() {
        a aVar = this.f6470j;
        return aVar != null ? aVar.b() : com.anythink.basead.exoplayer.b.f6382b;
    }

    public final long g() {
        a aVar = this.f6470j;
        if (aVar != null) {
            return aVar.c();
        }
        return -1L;
    }

    public final void a() {
        a(4);
    }

    private void a(int i6) {
        this.f6471k = i6;
        if (i6 == 0) {
            this.f6474n = 0L;
            this.f6475o = -1L;
            this.f6472l = System.nanoTime() / 1000;
            this.f6473m = com.anythink.basead.exoplayer.f.f7187a;
            return;
        }
        if (i6 == 1) {
            this.f6473m = com.anythink.basead.exoplayer.f.f7187a;
            return;
        }
        if (i6 == 2 || i6 == 3) {
            this.f6473m = 10000000L;
        } else {
            if (i6 == 4) {
                this.f6473m = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
