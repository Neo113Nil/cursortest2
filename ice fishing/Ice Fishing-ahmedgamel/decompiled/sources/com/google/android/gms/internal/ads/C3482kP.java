package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.kP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3482kP {

    /* renamed from: a, reason: collision with root package name */
    public final C3128du f32203a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f32204b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f32205c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioTrack f32206d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32207e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32208f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32209g;

    /* renamed from: h, reason: collision with root package name */
    public final C3053cP f32210h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public long f32211j;

    /* renamed from: k, reason: collision with root package name */
    public long f32212k;

    /* renamed from: l, reason: collision with root package name */
    public long f32213l;

    /* renamed from: m, reason: collision with root package name */
    public Method f32214m;

    /* renamed from: n, reason: collision with root package name */
    public long f32215n;

    /* renamed from: o, reason: collision with root package name */
    public long f32216o;

    /* renamed from: p, reason: collision with root package name */
    public long f32217p;

    /* renamed from: q, reason: collision with root package name */
    public long f32218q;

    /* renamed from: r, reason: collision with root package name */
    public long f32219r;

    /* renamed from: s, reason: collision with root package name */
    public int f32220s;

    /* renamed from: t, reason: collision with root package name */
    public int f32221t;

    /* renamed from: u, reason: collision with root package name */
    public long f32222u;

    /* renamed from: v, reason: collision with root package name */
    public long f32223v;

    /* renamed from: w, reason: collision with root package name */
    public long f32224w;

    /* renamed from: x, reason: collision with root package name */
    public long f32225x;

    /* renamed from: y, reason: collision with root package name */
    public long f32226y;

    /* renamed from: z, reason: collision with root package name */
    public long f32227z;

    public C3482kP(C3128du c3128du, V2 v22, AudioTrack audioTrack, int i, int i4, int i6) {
        this.f32203a = c3128du;
        this.f32204b = v22;
        this.f32206d = audioTrack;
        try {
            this.f32214m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f32205c = new long[10];
        this.f32227z = com.anythink.basead.exoplayer.b.f7168b;
        this.f32226y = com.anythink.basead.exoplayer.b.f7168b;
        this.f32210h = new C3053cP(audioTrack, c3128du);
        int sampleRate = audioTrack.getSampleRate();
        this.f32207e = sampleRate;
        boolean d9 = AbstractC3182eu.d(i);
        this.f32209g = d9;
        this.f32208f = d9 ? AbstractC3182eu.v(sampleRate, i6 / i4) : -9223372036854775807L;
        this.f32218q = 0L;
        this.f32219r = 0L;
        this.f32222u = com.anythink.basead.exoplayer.b.f7168b;
        this.f32223v = com.anythink.basead.exoplayer.b.f7168b;
        this.f32216o = 0L;
        this.f32215n = 0L;
        this.i = 1.0f;
        this.f32211j = com.anythink.basead.exoplayer.b.f7168b;
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
        float f2;
        AudioTrack audioTrack;
        long j6;
        V2 v22;
        long j9;
        C3053cP c3053cP;
        boolean z6;
        boolean z9;
        C3482kP c3482kP;
        long c9;
        int playState;
        int i;
        C3053cP c3053cP2;
        int i4;
        String str;
        long j10;
        AudioTimestamp audioTimestamp;
        boolean z10;
        long j11;
        Method method;
        int i6 = 1;
        float f9 = this.i;
        AudioTrack audioTrack2 = this.f32206d;
        int playState2 = audioTrack2.getPlayState();
        C3053cP c3053cP3 = this.f32210h;
        V2 v23 = this.f32204b;
        if (playState2 == 3) {
            v23.getClass();
            long nanoTime = System.nanoTime() / 1000;
            j6 = 1000;
            if (nanoTime - this.f32213l >= 30000) {
                long v9 = AbstractC3182eu.v(this.f32207e, d());
                if (v9 != 0) {
                    int i9 = this.f32220s;
                    if (f9 == 1.0f) {
                        c3053cP2 = c3053cP3;
                        i4 = 2;
                    } else {
                        c3053cP2 = c3053cP3;
                        i4 = 2;
                        v9 = Math.round(v9 / f9);
                    }
                    long[] jArr = this.f32205c;
                    jArr[i9] = v9 - nanoTime;
                    this.f32220s = (this.f32220s + 1) % 10;
                    int i10 = this.f32221t;
                    if (i10 < 10) {
                        this.f32221t = i10 + 1;
                    }
                    this.f32213l = nanoTime;
                    this.f32212k = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.f32221t;
                        if (i11 >= i12) {
                            break;
                        }
                        this.f32212k = (jArr[i11] / i12) + this.f32212k;
                        i11++;
                        f9 = f9;
                        jArr = jArr;
                        i6 = i6;
                    }
                } else {
                    f2 = f9;
                    audioTrack = audioTrack2;
                }
            } else {
                c3053cP2 = c3053cP3;
                i4 = 2;
            }
            int i13 = i6;
            float f10 = f9;
            long j12 = this.f32215n;
            if (this.f32209g && (method = this.f32214m) != null && nanoTime - this.f32216o >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                    String str2 = AbstractC3182eu.f30782a;
                    long intValue = (num.intValue() * 1000) - this.f32208f;
                    this.f32215n = intValue;
                    long max = Math.max(intValue, 0L);
                    this.f32215n = max;
                    if (max > 10000000) {
                        StringBuilder sb = new StringBuilder(String.valueOf(max).length() + 41);
                        sb.append("Ignoring impossibly large audio latency: ");
                        sb.append(max);
                        AbstractC2991bG.y("AudioTrackAudioOutput", sb.toString());
                        this.f32215n = 0L;
                    }
                } catch (Exception unused) {
                    this.f32214m = null;
                }
                this.f32216o = nanoTime;
            }
            int i14 = j12 != this.f32215n ? i13 : 0;
            long c10 = c(nanoTime);
            if (i14 == 0) {
                c3053cP = c3053cP2;
                j9 = 0;
                if (nanoTime - c3053cP.f30277g < c3053cP.f30276f) {
                    audioTrack = audioTrack2;
                    f2 = f10;
                    v22 = v23;
                    z6 = false;
                    v22.getClass();
                    long nanoTime2 = System.nanoTime() / j6;
                    z9 = c3053cP.f30274d == 2 ? true : z6;
                    if (z9) {
                        R4 r42 = c3053cP.f30271a;
                        c9 = AbstractC3182eu.y(nanoTime2 - (((AudioTimestamp) r42.f27927e).nanoTime / j6), f2) + AbstractC3182eu.v(c3053cP.f30272b, r42.f27925c);
                        c3482kP = this;
                    } else {
                        c3482kP = this;
                        c9 = c3482kP.c(nanoTime2);
                    }
                    playState = audioTrack.getPlayState();
                    if (playState == 3) {
                        if (z9 || ((i = c3053cP.f30274d) != 0 && i != 1)) {
                            c3482kP.b(c9);
                        }
                        long j13 = c3482kP.f32227z;
                        if (j13 != com.anythink.basead.exoplayer.b.f7168b) {
                            long j14 = c9 - c3482kP.f32226y;
                            long y7 = AbstractC3182eu.y(nanoTime2 - j13, f2);
                            long j15 = c3482kP.f32226y + y7;
                            long abs = Math.abs(j15 - c9);
                            if (j14 != j9 && abs < 1000000) {
                                long j16 = (y7 * 10) / 100;
                                c9 = Math.max(j15 - j16, Math.min(c9, j15 + j16));
                            }
                        }
                        c3482kP.f32227z = nanoTime2;
                        c3482kP.f32226y = c9;
                    } else if (playState == 1) {
                        c3482kP.b(c9);
                        return c9;
                    }
                    return c9;
                }
            } else {
                j9 = 0;
                c3053cP = c3053cP2;
            }
            c3053cP.f30277g = nanoTime;
            R4 r43 = c3053cP.f30271a;
            AudioTrack audioTrack3 = (AudioTrack) r43.f27926d;
            AudioTimestamp audioTimestamp2 = (AudioTimestamp) r43.f27927e;
            boolean timestamp = audioTrack3.getTimestamp(audioTimestamp2);
            if (timestamp) {
                str = "AudioTrackAudioOutput";
                long j17 = audioTimestamp2.framePosition;
                j10 = nanoTime;
                if (r43.f27924b > j17) {
                    r43.f27923a++;
                }
                r43.f27924b = j17;
                r43.f27925c = j17 + (r43.f27923a << 32);
            } else {
                str = "AudioTrackAudioOutput";
                j10 = nanoTime;
            }
            int i15 = c3053cP.f30272b;
            if (timestamp) {
                long j18 = audioTimestamp2.nanoTime / 1000;
                audioTrack = audioTrack2;
                v22 = v23;
                f2 = f10;
                long y9 = AbstractC3182eu.y(j10 - (((AudioTimestamp) r43.f27927e).nanoTime / 1000), f2) + AbstractC3182eu.v(i15, r43.f27925c);
                long abs2 = Math.abs(j18 - j10);
                C3128du c3128du = c3053cP.f30273c;
                String str3 = str;
                if (abs2 > 5000000) {
                    long j19 = r43.f27925c;
                    long c11 = ((C3428jP) c3128du.f30647u).c();
                    z10 = timestamp;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j19).length() + 52 + String.valueOf(j18).length() + 2 + String.valueOf(j10).length() + 2 + String.valueOf(c10).length() + 2 + String.valueOf(c11).length());
                    com.IceFishing.LiveIceFishing.k.z(sb2, "Spurious audio timestamp (system clock mismatch): ", j19, ", ");
                    sb2.append(j18);
                    j11 = j10;
                    com.IceFishing.LiveIceFishing.k.z(sb2, ", ", j11, ", ");
                    sb2.append(c10);
                    sb2.append(", ");
                    sb2.append(c11);
                    AbstractC2991bG.y(str3, sb2.toString());
                    c3053cP = c3053cP;
                    c3053cP.a(4);
                    audioTimestamp = audioTimestamp2;
                } else {
                    z10 = timestamp;
                    if (Math.abs(y9 - c10) > 5000000) {
                        long j20 = r43.f27925c;
                        audioTimestamp = audioTimestamp2;
                        long c12 = ((C3428jP) c3128du.f30647u).c();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j20).length() + 54 + String.valueOf(j18).length() + 2 + String.valueOf(j10).length() + 2 + String.valueOf(c10).length() + 2 + String.valueOf(c12).length());
                        com.IceFishing.LiveIceFishing.k.z(sb3, "Spurious audio timestamp (frame position mismatch): ", j20, ", ");
                        sb3.append(j18);
                        j11 = j10;
                        com.IceFishing.LiveIceFishing.k.z(sb3, ", ", j11, ", ");
                        sb3.append(c10);
                        sb3.append(", ");
                        sb3.append(c12);
                        AbstractC2991bG.y(str3, sb3.toString());
                        c3053cP.a(4);
                    } else {
                        audioTimestamp = audioTimestamp2;
                        j11 = j10;
                        if (c3053cP.f30274d == 4) {
                            c3053cP.a(0);
                        }
                    }
                }
            } else {
                audioTrack = audioTrack2;
                f2 = f10;
                v22 = v23;
                audioTimestamp = audioTimestamp2;
                z10 = timestamp;
                j11 = j10;
            }
            int i16 = c3053cP.f30274d;
            if (i16 == 0) {
                AudioTimestamp audioTimestamp3 = audioTimestamp;
                z6 = false;
                if (z10) {
                    long j21 = audioTimestamp3.nanoTime;
                    if (j21 / 1000 >= c3053cP.f30275e) {
                        c3053cP.f30278h = r43.f27925c;
                        c3053cP.i = j21 / 1000;
                        c3053cP.a(1);
                    }
                } else if (j11 - c3053cP.f30275e > 500000) {
                    c3053cP.a(3);
                }
            } else if (i16 != i13) {
                if (i16 != i4) {
                    if (i16 == 3 && z10) {
                        z6 = false;
                        c3053cP.a(0);
                    }
                    z6 = false;
                } else {
                    z6 = false;
                    if (!z10) {
                        c3053cP.a(0);
                    }
                }
            } else if (z10) {
                long j22 = r43.f27925c;
                long j23 = c3053cP.f30278h;
                if (j22 > j23) {
                    if (Math.abs((AbstractC3182eu.y(j11 - (((AudioTimestamp) r43.f27927e).nanoTime / 1000), f2) + AbstractC3182eu.v(i15, r43.f27925c)) - (AbstractC3182eu.y(j11 - c3053cP.i, f2) + AbstractC3182eu.v(i15, j23))) < 1000) {
                        c3053cP.a(2);
                        z6 = false;
                    }
                }
                if (j11 - c3053cP.f30275e > 2000000) {
                    c3053cP.a(3);
                } else {
                    c3053cP.f30278h = r43.f27925c;
                    c3053cP.i = audioTimestamp.nanoTime / 1000;
                }
                z6 = false;
            } else {
                z6 = false;
                c3053cP.a(0);
            }
            v22.getClass();
            long nanoTime22 = System.nanoTime() / j6;
            if (c3053cP.f30274d == 2) {
            }
            if (z9) {
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
            }
            return c9;
        }
        f2 = f9;
        audioTrack = audioTrack2;
        j6 = 1000;
        c3053cP = c3053cP3;
        v22 = v23;
        z6 = false;
        j9 = 0;
        v22.getClass();
        long nanoTime222 = System.nanoTime() / j6;
        if (c3053cP.f30274d == 2) {
        }
        if (z9) {
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
        }
        return c9;
    }

    public final void b(long j6) {
        long j9 = this.f32211j;
        if (j9 == com.anythink.basead.exoplayer.b.f7168b || j6 < j9) {
            return;
        }
        float f2 = this.i;
        long j10 = j6 - j9;
        String str = AbstractC3182eu.f30782a;
        if (f2 != 1.0f) {
            j10 = Math.round(j10 / f2);
        }
        long t6 = AbstractC3182eu.t(j10);
        this.f32204b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - t6;
        this.f32211j = com.anythink.basead.exoplayer.b.f7168b;
        C3428jP c3428jP = (C3428jP) this.f32203a.f30647u;
        C3553lp c3553lp = c3428jP.i;
        c3553lp.getClass();
        if (Thread.currentThread() == c3553lp.f32631a) {
            U0 u02 = new U0();
            u02.f28641n = currentTimeMillis;
            C3553lp c3553lp2 = c3428jP.i;
            c3553lp2.c(-1, u02);
            c3553lp2.d();
        }
    }

    public final long c(long j6) {
        int i = this.f32221t;
        int i4 = this.f32207e;
        long max = Math.max(0L, (i == 0 ? this.f32222u != com.anythink.basead.exoplayer.b.f7168b ? AbstractC3182eu.v(i4, e()) : AbstractC3182eu.v(i4, d()) : AbstractC3182eu.y(j6 + this.f32212k, this.i)) - this.f32215n);
        return this.f32222u != com.anythink.basead.exoplayer.b.f7168b ? Math.min(AbstractC3182eu.v(i4, this.f32225x), max) : max;
    }

    public final long d() {
        if (this.f32222u != com.anythink.basead.exoplayer.b.f7168b) {
            return Math.min(this.f32225x, e());
        }
        this.f32204b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f32217p >= 5) {
            int playState = this.f32206d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.f32218q <= 0 || playState != 3) {
                        this.f32223v = com.anythink.basead.exoplayer.b.f7168b;
                    } else if (this.f32223v == com.anythink.basead.exoplayer.b.f7168b) {
                        this.f32223v = elapsedRealtime;
                    }
                }
                if (this.f32218q > playbackHeadPosition) {
                    this.f32219r++;
                }
                this.f32218q = playbackHeadPosition;
            }
            this.f32217p = elapsedRealtime;
        }
        return this.f32218q + (this.f32219r << 32);
    }

    public final long e() {
        if (this.f32206d.getPlayState() == 2) {
            return this.f32224w;
        }
        this.f32204b.getClass();
        return this.f32224w + AbstractC3182eu.w(AbstractC3182eu.y(AbstractC3182eu.u(SystemClock.elapsedRealtime()) - this.f32222u, this.i), this.f32207e, 1000000L, RoundingMode.UP);
    }
}
