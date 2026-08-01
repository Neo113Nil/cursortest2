package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.kP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3459kP {

    /* renamed from: a, reason: collision with root package name */
    public final C3105du f31424a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f31425b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f31426c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioTrack f31427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31428e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31429f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31430g;

    /* renamed from: h, reason: collision with root package name */
    public final C3030cP f31431h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public long f31432j;

    /* renamed from: k, reason: collision with root package name */
    public long f31433k;

    /* renamed from: l, reason: collision with root package name */
    public long f31434l;

    /* renamed from: m, reason: collision with root package name */
    public Method f31435m;

    /* renamed from: n, reason: collision with root package name */
    public long f31436n;

    /* renamed from: o, reason: collision with root package name */
    public long f31437o;

    /* renamed from: p, reason: collision with root package name */
    public long f31438p;

    /* renamed from: q, reason: collision with root package name */
    public long f31439q;

    /* renamed from: r, reason: collision with root package name */
    public long f31440r;

    /* renamed from: s, reason: collision with root package name */
    public int f31441s;

    /* renamed from: t, reason: collision with root package name */
    public int f31442t;

    /* renamed from: u, reason: collision with root package name */
    public long f31443u;

    /* renamed from: v, reason: collision with root package name */
    public long f31444v;

    /* renamed from: w, reason: collision with root package name */
    public long f31445w;

    /* renamed from: x, reason: collision with root package name */
    public long f31446x;

    /* renamed from: y, reason: collision with root package name */
    public long f31447y;

    /* renamed from: z, reason: collision with root package name */
    public long f31448z;

    public C3459kP(C3105du c3105du, V2 v22, AudioTrack audioTrack, int i, int i6, int i9) {
        this.f31424a = c3105du;
        this.f31425b = v22;
        this.f31427d = audioTrack;
        try {
            this.f31435m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f31426c = new long[10];
        this.f31448z = com.anythink.basead.exoplayer.b.f6382b;
        this.f31447y = com.anythink.basead.exoplayer.b.f6382b;
        this.f31431h = new C3030cP(audioTrack, c3105du);
        int sampleRate = audioTrack.getSampleRate();
        this.f31428e = sampleRate;
        boolean d2 = AbstractC3159eu.d(i);
        this.f31430g = d2;
        this.f31429f = d2 ? AbstractC3159eu.v(sampleRate, i9 / i6) : -9223372036854775807L;
        this.f31439q = 0L;
        this.f31440r = 0L;
        this.f31443u = com.anythink.basead.exoplayer.b.f6382b;
        this.f31444v = com.anythink.basead.exoplayer.b.f6382b;
        this.f31437o = 0L;
        this.f31436n = 0L;
        this.i = 1.0f;
        this.f31432j = com.anythink.basead.exoplayer.b.f6382b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        float f3;
        AudioTrack audioTrack;
        long j6;
        V2 v22;
        long j9;
        C3030cP c3030cP;
        boolean z3;
        boolean z6;
        C3459kP c3459kP;
        long c9;
        int playState;
        int i;
        C3030cP c3030cP2;
        int i6;
        String str;
        long j10;
        AudioTimestamp audioTimestamp;
        boolean z9;
        long j11;
        Method method;
        int i9 = 1;
        float f9 = this.i;
        AudioTrack audioTrack2 = this.f31427d;
        int playState2 = audioTrack2.getPlayState();
        C3030cP c3030cP3 = this.f31431h;
        V2 v23 = this.f31425b;
        if (playState2 == 3) {
            v23.getClass();
            long nanoTime = System.nanoTime() / 1000;
            j6 = 1000;
            if (nanoTime - this.f31434l >= 30000) {
                long v9 = AbstractC3159eu.v(this.f31428e, d());
                if (v9 != 0) {
                    int i10 = this.f31441s;
                    if (f9 == 1.0f) {
                        c3030cP2 = c3030cP3;
                        i6 = 2;
                    } else {
                        c3030cP2 = c3030cP3;
                        i6 = 2;
                        v9 = Math.round(v9 / f9);
                    }
                    long[] jArr = this.f31426c;
                    jArr[i10] = v9 - nanoTime;
                    this.f31441s = (this.f31441s + 1) % 10;
                    int i11 = this.f31442t;
                    if (i11 < 10) {
                        this.f31442t = i11 + 1;
                    }
                    this.f31434l = nanoTime;
                    this.f31433k = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f31442t;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f31433k = (jArr[i12] / i13) + this.f31433k;
                        i12++;
                        f9 = f9;
                        jArr = jArr;
                        i9 = i9;
                    }
                } else {
                    f3 = f9;
                    audioTrack = audioTrack2;
                }
            } else {
                c3030cP2 = c3030cP3;
                i6 = 2;
            }
            int i14 = i9;
            float f10 = f9;
            long j12 = this.f31436n;
            if (this.f31430g && (method = this.f31435m) != null && nanoTime - this.f31437o >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                    String str2 = AbstractC3159eu.f29993a;
                    long intValue = (num.intValue() * 1000) - this.f31429f;
                    this.f31436n = intValue;
                    long max = Math.max(intValue, 0L);
                    this.f31436n = max;
                    if (max > 10000000) {
                        StringBuilder sb = new StringBuilder(String.valueOf(max).length() + 41);
                        sb.append("Ignoring impossibly large audio latency: ");
                        sb.append(max);
                        AbstractC2968bG.y("AudioTrackAudioOutput", sb.toString());
                        this.f31436n = 0L;
                    }
                } catch (Exception unused) {
                    this.f31435m = null;
                }
                this.f31437o = nanoTime;
            }
            int i15 = j12 != this.f31436n ? i14 : 0;
            long c10 = c(nanoTime);
            if (i15 == 0) {
                c3030cP = c3030cP2;
                j9 = 0;
                if (nanoTime - c3030cP.f29494g < c3030cP.f29493f) {
                    audioTrack = audioTrack2;
                    f3 = f10;
                    v22 = v23;
                    z3 = false;
                    v22.getClass();
                    long nanoTime2 = System.nanoTime() / j6;
                    z6 = c3030cP.f29491d == 2 ? true : z3;
                    if (z6) {
                        R4 r42 = c3030cP.f29488a;
                        c9 = AbstractC3159eu.y(nanoTime2 - (((AudioTimestamp) r42.f27171e).nanoTime / j6), f3) + AbstractC3159eu.v(c3030cP.f29489b, r42.f27169c);
                        c3459kP = this;
                    } else {
                        c3459kP = this;
                        c9 = c3459kP.c(nanoTime2);
                    }
                    playState = audioTrack.getPlayState();
                    if (playState == 3) {
                        if (z6 || ((i = c3030cP.f29491d) != 0 && i != 1)) {
                            c3459kP.b(c9);
                        }
                        long j13 = c3459kP.f31448z;
                        if (j13 != com.anythink.basead.exoplayer.b.f6382b) {
                            long j14 = c9 - c3459kP.f31447y;
                            long y7 = AbstractC3159eu.y(nanoTime2 - j13, f3);
                            long j15 = c3459kP.f31447y + y7;
                            long abs = Math.abs(j15 - c9);
                            if (j14 != j9 && abs < 1000000) {
                                long j16 = (y7 * 10) / 100;
                                c9 = Math.max(j15 - j16, Math.min(c9, j15 + j16));
                            }
                        }
                        c3459kP.f31448z = nanoTime2;
                        c3459kP.f31447y = c9;
                    } else if (playState == 1) {
                        c3459kP.b(c9);
                        return c9;
                    }
                    return c9;
                }
            } else {
                j9 = 0;
                c3030cP = c3030cP2;
            }
            c3030cP.f29494g = nanoTime;
            R4 r43 = c3030cP.f29488a;
            AudioTrack audioTrack3 = (AudioTrack) r43.f27170d;
            AudioTimestamp audioTimestamp2 = (AudioTimestamp) r43.f27171e;
            boolean timestamp = audioTrack3.getTimestamp(audioTimestamp2);
            if (timestamp) {
                str = "AudioTrackAudioOutput";
                long j17 = audioTimestamp2.framePosition;
                j10 = nanoTime;
                if (r43.f27168b > j17) {
                    r43.f27167a++;
                }
                r43.f27168b = j17;
                r43.f27169c = j17 + (r43.f27167a << 32);
            } else {
                str = "AudioTrackAudioOutput";
                j10 = nanoTime;
            }
            int i16 = c3030cP.f29489b;
            if (timestamp) {
                long j18 = audioTimestamp2.nanoTime / 1000;
                audioTrack = audioTrack2;
                v22 = v23;
                f3 = f10;
                long y9 = AbstractC3159eu.y(j10 - (((AudioTimestamp) r43.f27171e).nanoTime / 1000), f3) + AbstractC3159eu.v(i16, r43.f27169c);
                long abs2 = Math.abs(j18 - j10);
                C3105du c3105du = c3030cP.f29490c;
                String str3 = str;
                if (abs2 > 5000000) {
                    long j19 = r43.f27169c;
                    long c11 = ((C3405jP) c3105du.f29859u).c();
                    z9 = timestamp;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j19).length() + 52 + String.valueOf(j18).length() + 2 + String.valueOf(j10).length() + 2 + String.valueOf(c10).length() + 2 + String.valueOf(c11).length());
                    D.y.x(sb2, "Spurious audio timestamp (system clock mismatch): ", j19, ", ");
                    sb2.append(j18);
                    j11 = j10;
                    D.y.x(sb2, ", ", j11, ", ");
                    sb2.append(c10);
                    sb2.append(", ");
                    sb2.append(c11);
                    AbstractC2968bG.y(str3, sb2.toString());
                    c3030cP = c3030cP;
                    c3030cP.a(4);
                    audioTimestamp = audioTimestamp2;
                } else {
                    z9 = timestamp;
                    if (Math.abs(y9 - c10) > 5000000) {
                        long j20 = r43.f27169c;
                        audioTimestamp = audioTimestamp2;
                        long c12 = ((C3405jP) c3105du.f29859u).c();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j20).length() + 54 + String.valueOf(j18).length() + 2 + String.valueOf(j10).length() + 2 + String.valueOf(c10).length() + 2 + String.valueOf(c12).length());
                        D.y.x(sb3, "Spurious audio timestamp (frame position mismatch): ", j20, ", ");
                        sb3.append(j18);
                        j11 = j10;
                        D.y.x(sb3, ", ", j11, ", ");
                        sb3.append(c10);
                        sb3.append(", ");
                        sb3.append(c12);
                        AbstractC2968bG.y(str3, sb3.toString());
                        c3030cP.a(4);
                    } else {
                        audioTimestamp = audioTimestamp2;
                        j11 = j10;
                        if (c3030cP.f29491d == 4) {
                            c3030cP.a(0);
                        }
                    }
                }
            } else {
                audioTrack = audioTrack2;
                f3 = f10;
                v22 = v23;
                audioTimestamp = audioTimestamp2;
                z9 = timestamp;
                j11 = j10;
            }
            int i17 = c3030cP.f29491d;
            if (i17 == 0) {
                AudioTimestamp audioTimestamp3 = audioTimestamp;
                z3 = false;
                if (z9) {
                    long j21 = audioTimestamp3.nanoTime;
                    if (j21 / 1000 >= c3030cP.f29492e) {
                        c3030cP.f29495h = r43.f27169c;
                        c3030cP.i = j21 / 1000;
                        c3030cP.a(1);
                    }
                } else if (j11 - c3030cP.f29492e > 500000) {
                    c3030cP.a(3);
                }
            } else if (i17 != i14) {
                if (i17 != i6) {
                    if (i17 == 3 && z9) {
                        z3 = false;
                        c3030cP.a(0);
                    }
                    z3 = false;
                } else {
                    z3 = false;
                    if (!z9) {
                        c3030cP.a(0);
                    }
                }
            } else if (z9) {
                long j22 = r43.f27169c;
                long j23 = c3030cP.f29495h;
                if (j22 > j23) {
                    if (Math.abs((AbstractC3159eu.y(j11 - (((AudioTimestamp) r43.f27171e).nanoTime / 1000), f3) + AbstractC3159eu.v(i16, r43.f27169c)) - (AbstractC3159eu.y(j11 - c3030cP.i, f3) + AbstractC3159eu.v(i16, j23))) < 1000) {
                        c3030cP.a(2);
                        z3 = false;
                    }
                }
                if (j11 - c3030cP.f29492e > 2000000) {
                    c3030cP.a(3);
                } else {
                    c3030cP.f29495h = r43.f27169c;
                    c3030cP.i = audioTimestamp.nanoTime / 1000;
                }
                z3 = false;
            } else {
                z3 = false;
                c3030cP.a(0);
            }
            v22.getClass();
            long nanoTime22 = System.nanoTime() / j6;
            if (c3030cP.f29491d == 2) {
            }
            if (z6) {
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
            }
            return c9;
        }
        f3 = f9;
        audioTrack = audioTrack2;
        j6 = 1000;
        c3030cP = c3030cP3;
        v22 = v23;
        z3 = false;
        j9 = 0;
        v22.getClass();
        long nanoTime222 = System.nanoTime() / j6;
        if (c3030cP.f29491d == 2) {
        }
        if (z6) {
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
        }
        return c9;
    }

    public final void b(long j6) {
        long j9 = this.f31432j;
        if (j9 == com.anythink.basead.exoplayer.b.f6382b || j6 < j9) {
            return;
        }
        float f3 = this.i;
        long j10 = j6 - j9;
        String str = AbstractC3159eu.f29993a;
        if (f3 != 1.0f) {
            j10 = Math.round(j10 / f3);
        }
        long t6 = AbstractC3159eu.t(j10);
        this.f31425b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - t6;
        this.f31432j = com.anythink.basead.exoplayer.b.f6382b;
        C3405jP c3405jP = (C3405jP) this.f31424a.f29859u;
        C3530lp c3530lp = c3405jP.i;
        c3530lp.getClass();
        if (Thread.currentThread() == c3530lp.f31851a) {
            U0 u02 = new U0();
            u02.f27844n = currentTimeMillis;
            C3530lp c3530lp2 = c3405jP.i;
            c3530lp2.c(-1, u02);
            c3530lp2.d();
        }
    }

    public final long c(long j6) {
        int i = this.f31442t;
        int i6 = this.f31428e;
        long max = Math.max(0L, (i == 0 ? this.f31443u != com.anythink.basead.exoplayer.b.f6382b ? AbstractC3159eu.v(i6, e()) : AbstractC3159eu.v(i6, d()) : AbstractC3159eu.y(j6 + this.f31433k, this.i)) - this.f31436n);
        return this.f31443u != com.anythink.basead.exoplayer.b.f6382b ? Math.min(AbstractC3159eu.v(i6, this.f31446x), max) : max;
    }

    public final long d() {
        if (this.f31443u != com.anythink.basead.exoplayer.b.f6382b) {
            return Math.min(this.f31446x, e());
        }
        this.f31425b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f31438p >= 5) {
            int playState = this.f31427d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.f31439q <= 0 || playState != 3) {
                        this.f31444v = com.anythink.basead.exoplayer.b.f6382b;
                    } else if (this.f31444v == com.anythink.basead.exoplayer.b.f6382b) {
                        this.f31444v = elapsedRealtime;
                    }
                }
                if (this.f31439q > playbackHeadPosition) {
                    this.f31440r++;
                }
                this.f31439q = playbackHeadPosition;
            }
            this.f31438p = elapsedRealtime;
        }
        return this.f31439q + (this.f31440r << 32);
    }

    public final long e() {
        if (this.f31427d.getPlayState() == 2) {
            return this.f31445w;
        }
        this.f31425b.getClass();
        return this.f31445w + AbstractC3159eu.w(AbstractC3159eu.y(AbstractC3159eu.u(SystemClock.elapsedRealtime()) - this.f31443u, this.i), this.f31428e, 1000000L, RoundingMode.UP);
    }
}
