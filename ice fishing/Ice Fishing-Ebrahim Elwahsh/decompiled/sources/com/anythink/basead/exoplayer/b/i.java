package com.anythink.basead.exoplayer.b;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6619a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6620b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6621c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f6622d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f6623e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f6624f = 5000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6625g = 10000000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6626h = 500000;
    private static final int i = 500000;

    /* renamed from: j, reason: collision with root package name */
    private final a f6627j;

    /* renamed from: k, reason: collision with root package name */
    private int f6628k;

    /* renamed from: l, reason: collision with root package name */
    private long f6629l;

    /* renamed from: m, reason: collision with root package name */
    private long f6630m;

    /* renamed from: n, reason: collision with root package name */
    private long f6631n;

    /* renamed from: o, reason: collision with root package name */
    private long f6632o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f6633a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f6634b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f6635c;

        /* renamed from: d, reason: collision with root package name */
        private long f6636d;

        /* renamed from: e, reason: collision with root package name */
        private long f6637e;

        public a(AudioTrack audioTrack) {
            this.f6633a = audioTrack;
        }

        public final boolean a() {
            boolean timestamp = this.f6633a.getTimestamp(this.f6634b);
            if (timestamp) {
                long j9 = this.f6634b.framePosition;
                if (this.f6636d > j9) {
                    this.f6635c++;
                }
                this.f6636d = j9;
                this.f6637e = j9 + (this.f6635c << 32);
            }
            return timestamp;
        }

        public final long b() {
            return this.f6634b.nanoTime / 1000;
        }

        public final long c() {
            return this.f6637e;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public i(AudioTrack audioTrack) {
        if (af.f8503a >= 19) {
            this.f6627j = new a(audioTrack);
            e();
        } else {
            this.f6627j = null;
            a(3);
        }
    }

    public final boolean a(long j9) {
        a aVar = this.f6627j;
        if (aVar == null || j9 - this.f6631n < this.f6630m) {
            return false;
        }
        this.f6631n = j9;
        boolean a9 = aVar.a();
        int i4 = this.f6628k;
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
                if (this.f6627j.c() > this.f6632o) {
                    a(2);
                    return a9;
                }
            }
        } else {
            if (a9) {
                if (this.f6627j.b() < this.f6629l) {
                    return false;
                }
                this.f6632o = this.f6627j.c();
                a(1);
                return a9;
            }
            if (j9 - this.f6629l > 500000) {
                a(3);
            }
        }
        return a9;
    }

    public final void b() {
        if (this.f6628k == 4) {
            e();
        }
    }

    public final boolean c() {
        int i4 = this.f6628k;
        return i4 == 1 || i4 == 2;
    }

    public final boolean d() {
        return this.f6628k == 2;
    }

    public final void e() {
        if (this.f6627j != null) {
            a(0);
        }
    }

    public final long f() {
        a aVar = this.f6627j;
        return aVar != null ? aVar.b() : com.anythink.basead.exoplayer.b.f6539b;
    }

    public final long g() {
        a aVar = this.f6627j;
        if (aVar != null) {
            return aVar.c();
        }
        return -1L;
    }

    public final void a() {
        a(4);
    }

    private void a(int i4) {
        this.f6628k = i4;
        if (i4 == 0) {
            this.f6631n = 0L;
            this.f6632o = -1L;
            this.f6629l = System.nanoTime() / 1000;
            this.f6630m = com.anythink.basead.exoplayer.f.f7344a;
            return;
        }
        if (i4 == 1) {
            this.f6630m = com.anythink.basead.exoplayer.f.f7344a;
            return;
        }
        if (i4 == 2 || i4 == 3) {
            this.f6630m = 10000000L;
        } else {
            if (i4 == 4) {
                this.f6630m = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
