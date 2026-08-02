package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class ty1 {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public dzr I;
    public final xzi a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public ry1 e;
    public int f;
    public boolean g;
    public long h;
    public float i;
    public boolean j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public ty1(xzi xziVar) {
        this.a = xziVar;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.I = dzr.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220 A[Catch: Exception -> 0x0236, TRY_LEAVE, TryCatch #0 {Exception -> 0x0236, blocks: (B:93:0x01fb, B:95:0x0220), top: B:92:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        long j;
        long j2;
        long max;
        long j3;
        long j4;
        boolean z;
        long j5;
        long j6;
        Method method;
        long max2;
        AudioTimestamp audioTimestamp;
        gk7 gk7Var = (gk7) this.a.a;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        long j7 = 0;
        if (audioTrack.getPlayState() == 3) {
            this.I.getClass();
            long nanoTime = System.nanoTime() / 1000;
            j2 = -9223372036854775807L;
            if (nanoTime - this.l >= 30000) {
                long e0 = dvt.e0(this.f, b());
                if (e0 != 0) {
                    int i = this.v;
                    j = 1000;
                    long K = dvt.K(this.i, e0) - nanoTime;
                    long[] jArr = this.b;
                    jArr[i] = K;
                    this.v = (this.v + 1) % 10;
                    int i2 = this.w;
                    if (i2 < 10) {
                        this.w = i2 + 1;
                    }
                    this.l = nanoTime;
                    this.k = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.w;
                        j3 = j7;
                        if (i3 >= i4) {
                            break;
                        }
                        this.k = (jArr[i3] / i4) + this.k;
                        i3++;
                        j7 = j3;
                    }
                } else {
                    j = 1000;
                }
            } else {
                j = 1000;
                j3 = 0;
            }
            if (!this.g) {
                ry1 ry1Var = this.e;
                ry1Var.getClass();
                qy1 qy1Var = ry1Var.a;
                if (qy1Var != null) {
                    AudioTimestamp audioTimestamp2 = qy1Var.b;
                    j4 = 500000;
                    if (nanoTime - ry1Var.e >= ry1Var.d) {
                        ry1Var.e = nanoTime;
                        z = qy1Var.a.getTimestamp(audioTimestamp2);
                        if (z) {
                            long j8 = audioTimestamp2.framePosition;
                            long j9 = qy1Var.d;
                            if (j9 <= j8) {
                                audioTimestamp = audioTimestamp2;
                            } else if (qy1Var.f) {
                                audioTimestamp = audioTimestamp2;
                                qy1Var.g += j9;
                                qy1Var.f = false;
                            } else {
                                audioTimestamp = audioTimestamp2;
                                qy1Var.c++;
                            }
                            qy1Var.d = j8;
                            qy1Var.e = j8 + qy1Var.g + (qy1Var.c << 32);
                        } else {
                            audioTimestamp = audioTimestamp2;
                        }
                        int i5 = ry1Var.b;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 != 4) {
                                            e7o.n();
                                            return j3;
                                        }
                                    } else if (z) {
                                        ry1Var.a();
                                    }
                                } else if (!z) {
                                    ry1Var.a();
                                }
                            } else if (!z) {
                                ry1Var.a();
                            } else if (qy1Var.e > ry1Var.f) {
                                ry1Var.b(2);
                            }
                        } else if (z) {
                            if (audioTimestamp.nanoTime / j >= ry1Var.c) {
                                ry1Var.f = qy1Var.e;
                                ry1Var.b(1);
                            }
                        } else if (nanoTime - ry1Var.c > 500000) {
                            ry1Var.b(3);
                        }
                        if (z) {
                            j5 = 5000000;
                        } else {
                            if (qy1Var != null) {
                                j5 = 5000000;
                                j6 = qy1Var.b.nanoTime / j;
                            } else {
                                j5 = 5000000;
                                j6 = -9223372036854775807L;
                            }
                            long j10 = qy1Var != null ? qy1Var.e : -1L;
                            long e02 = dvt.e0(this.f, b());
                            if (Math.abs(j6 - nanoTime) > j5) {
                                StringBuilder l = tlm.l(j10, "Spurious audio timestamp (system clock mismatch): ", ", ");
                                l.append(j6);
                                ouj.C(l, ", ", nanoTime, ", ");
                                l.append(e02);
                                l.append(", ");
                                l.append(gk7Var.l());
                                l.append(", ");
                                l.append(gk7Var.m());
                                vq1.n0("DefaultAudioSink", l.toString());
                                ry1Var.b(4);
                            } else if (Math.abs(dvt.e0(this.f, j10) - e02) > j5) {
                                StringBuilder l2 = tlm.l(j10, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                l2.append(j6);
                                ouj.C(l2, ", ", nanoTime, ", ");
                                l2.append(e02);
                                l2.append(", ");
                                l2.append(gk7Var.l());
                                l2.append(", ");
                                l2.append(gk7Var.m());
                                vq1.n0("DefaultAudioSink", l2.toString());
                                ry1Var.b(4);
                            } else if (ry1Var.b == 4) {
                                ry1Var.a();
                            }
                        }
                        if (this.p && (method = this.m) != null && nanoTime - this.q >= j4) {
                            try {
                                AudioTrack audioTrack2 = this.c;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                int i6 = dvt.a;
                                long intValue = (num.intValue() * j) - this.h;
                                this.n = intValue;
                                max2 = Math.max(intValue, j3);
                                this.n = max2;
                                if (max2 > j5) {
                                    vq1.n0("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max2);
                                    this.n = 0L;
                                }
                            } catch (Exception unused) {
                                this.m = null;
                            }
                            this.q = nanoTime;
                        }
                    }
                } else {
                    j4 = 500000;
                }
                z = false;
                if (z) {
                }
                if (this.p) {
                    AudioTrack audioTrack22 = this.c;
                    audioTrack22.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack22, null);
                    int i62 = dvt.a;
                    long intValue2 = (num2.intValue() * j) - this.h;
                    this.n = intValue2;
                    max2 = Math.max(intValue2, j3);
                    this.n = max2;
                    if (max2 > j5) {
                    }
                    this.q = nanoTime;
                }
            }
        } else {
            j = 1000;
            j2 = -9223372036854775807L;
        }
        this.I.getClass();
        long nanoTime2 = System.nanoTime() / j;
        ry1 ry1Var2 = this.e;
        ry1Var2.getClass();
        qy1 qy1Var2 = ry1Var2.a;
        boolean z2 = ry1Var2.b == 2;
        if (z2) {
            long e03 = dvt.e0(this.f, qy1Var2 != null ? qy1Var2.e : -1L);
            if (qy1Var2 != null) {
                j2 = qy1Var2.b.nanoTime / j;
            }
            max = dvt.G(this.i, nanoTime2 - j2) + e03;
        } else {
            max = Math.max(0L, (this.w == 0 ? this.x != j2 ? dvt.e0(this.f, c()) : dvt.e0(this.f, b()) : dvt.G(this.i, this.k + nanoTime2)) - this.n);
            if (this.x != j2) {
                max = Math.min(dvt.e0(this.f, this.A), max);
            }
        }
        if (this.D != z2) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = nanoTime2 - this.F;
        if (j11 < 1000000) {
            long G = dvt.G(this.i, j11) + this.E;
            long j12 = (j11 * j) / 1000000;
            max = (((j - j12) * G) + (max * j12)) / j;
        }
        if (!this.j && max > this.B && audioTrack.getPlayState() == 3) {
            this.j = true;
            long K2 = dvt.K(this.i, dvt.m0(max - this.B));
            this.I.getClass();
            long currentTimeMillis = System.currentTimeMillis() - dvt.m0(K2);
            ly1 ly1Var = gk7Var.r;
            if (ly1Var != null) {
                ly1Var.I(currentTimeMillis);
            }
        }
        this.C = nanoTime2;
        this.B = max;
        this.D = z2;
        return max;
    }

    public final long b() {
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, c());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.r >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.u = this.s;
                    }
                    playbackHeadPosition += this.u;
                }
                if (dvt.a <= 29) {
                    if (playbackHeadPosition != 0 || this.s <= 0 || playState != 3) {
                        this.y = -9223372036854775807L;
                    } else if (this.y == -9223372036854775807L) {
                        this.y = elapsedRealtime;
                    }
                }
                long j = this.s;
                if (j > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j;
                        this.G = false;
                    } else {
                        this.t++;
                    }
                }
                this.s = playbackHeadPosition;
            }
            this.r = elapsedRealtime;
        }
        return this.s + this.H + (this.t << 32);
    }

    public final long c() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.z;
        }
        this.I.getClass();
        return this.z + dvt.g0(dvt.G(this.i, dvt.Y(SystemClock.elapsedRealtime()) - this.x), this.f, 1000000L, RoundingMode.UP);
    }

    public final boolean d(long j) {
        long a = a();
        int i = this.f;
        int i2 = dvt.a;
        if (j > dvt.g0(a, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.g) {
            return false;
        }
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && b() == 0;
    }

    public final void e() {
        this.k = 0L;
        this.w = 0;
        this.v = 0;
        this.l = 0L;
        this.C = 0L;
        this.F = 0L;
        this.j = false;
    }
}
