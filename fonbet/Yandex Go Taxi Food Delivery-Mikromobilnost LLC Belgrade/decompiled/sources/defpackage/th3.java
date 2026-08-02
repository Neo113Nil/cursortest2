package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.media3.exoplayer.audio.c;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class th3 {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public y3c I;
    public final sae a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public qh3 e;
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

    public th3(sae saeVar) {
        this.a = saeVar;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.I = y3c.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0220 A[Catch: Exception -> 0x0236, TRY_LEAVE, TryCatch #0 {Exception -> 0x0236, blocks: (B:91:0x01fb, B:93:0x0220), top: B:90:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
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
        Method method;
        long max2;
        AudioTimestamp audioTimestamp;
        c cVar = (c) this.a.b;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        long j6 = 0;
        if (audioTrack.getPlayState() == 3) {
            ((o2x0) this.I).getClass();
            long nanoTime = System.nanoTime() / 1000;
            j2 = -9223372036854775807L;
            if (nanoTime - this.l >= 30000) {
                long c0 = tw21.c0(this.f, b());
                if (c0 != 0) {
                    int i = this.v;
                    j = 1000;
                    long H = tw21.H(this.i, c0) - nanoTime;
                    long[] jArr = this.b;
                    jArr[i] = H;
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
                        j3 = j6;
                        if (i3 >= i4) {
                            break;
                        }
                        this.k = (jArr[i3] / i4) + this.k;
                        i3++;
                        j6 = j3;
                    }
                } else {
                    j = 1000;
                }
            } else {
                j = 1000;
                j3 = 0;
            }
            if (!this.g) {
                qh3 qh3Var = this.e;
                qh3Var.getClass();
                ph3 ph3Var = (ph3) qh3Var.f;
                if (ph3Var != null) {
                    AudioTimestamp audioTimestamp2 = ph3Var.b;
                    j4 = 500000;
                    if (nanoTime - qh3Var.d >= qh3Var.c) {
                        qh3Var.d = nanoTime;
                        z = ph3Var.a.getTimestamp(audioTimestamp2);
                        if (z) {
                            long j7 = audioTimestamp2.framePosition;
                            long j8 = ph3Var.d;
                            if (j8 <= j7) {
                                audioTimestamp = audioTimestamp2;
                            } else if (ph3Var.f) {
                                audioTimestamp = audioTimestamp2;
                                ph3Var.g += j8;
                                ph3Var.f = false;
                            } else {
                                audioTimestamp = audioTimestamp2;
                                ph3Var.c++;
                            }
                            ph3Var.d = j7;
                            ph3Var.e = j7 + ph3Var.g + (ph3Var.c << 32);
                        } else {
                            audioTimestamp = audioTimestamp2;
                        }
                        int i5 = qh3Var.a;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 != 4) {
                                            ny61.k();
                                            return j3;
                                        }
                                    } else if (z) {
                                        qh3Var.c();
                                    }
                                } else if (!z) {
                                    qh3Var.c();
                                }
                            } else if (!z) {
                                qh3Var.c();
                            } else if (ph3Var.e > qh3Var.e) {
                                qh3Var.d(2);
                            }
                        } else if (z) {
                            if (audioTimestamp.nanoTime / j >= qh3Var.b) {
                                qh3Var.e = ph3Var.e;
                                qh3Var.d(1);
                            }
                        } else if (nanoTime - qh3Var.b > 500000) {
                            qh3Var.d(3);
                        }
                        if (z) {
                            j5 = 5000000;
                        } else {
                            long j9 = ph3Var != null ? ph3Var.b.nanoTime / j : -9223372036854775807L;
                            long j10 = ph3Var != null ? ph3Var.e : -1L;
                            j5 = 5000000;
                            long c02 = tw21.c0(this.f, b());
                            if (Math.abs(j9 - nanoTime) > 5000000) {
                                StringBuilder w = unr0.w(j10, "Spurious audio timestamp (system clock mismatch): ", Extension.FIX_SPACE);
                                w.append(j9);
                                x4e.A(nanoTime, Extension.FIX_SPACE, Extension.FIX_SPACE, w);
                                w.append(c02);
                                w.append(Extension.FIX_SPACE);
                                w.append(cVar.l());
                                w.append(Extension.FIX_SPACE);
                                w.append(cVar.m());
                                lk91.j(w.toString());
                                qh3Var.d(4);
                            } else if (Math.abs(tw21.c0(this.f, j10) - c02) > 5000000) {
                                StringBuilder w2 = unr0.w(j10, "Spurious audio timestamp (frame position mismatch): ", Extension.FIX_SPACE);
                                w2.append(j9);
                                x4e.A(nanoTime, Extension.FIX_SPACE, Extension.FIX_SPACE, w2);
                                w2.append(c02);
                                w2.append(Extension.FIX_SPACE);
                                w2.append(cVar.l());
                                w2.append(Extension.FIX_SPACE);
                                w2.append(cVar.m());
                                lk91.j(w2.toString());
                                qh3Var.d(4);
                            } else if (qh3Var.a == 4) {
                                qh3Var.c();
                            }
                        }
                        if (this.p && (method = this.m) != null && nanoTime - this.q >= j4) {
                            try {
                                AudioTrack audioTrack2 = this.c;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                int i6 = tw21.a;
                                long intValue = (num.intValue() * j) - this.h;
                                this.n = intValue;
                                max2 = Math.max(intValue, j3);
                                this.n = max2;
                                if (max2 > j5) {
                                    lk91.j("Ignoring impossibly large audio latency: " + max2);
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
                    int i62 = tw21.a;
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
        ((o2x0) this.I).getClass();
        long nanoTime2 = System.nanoTime() / j;
        qh3 qh3Var2 = this.e;
        qh3Var2.getClass();
        ph3 ph3Var2 = (ph3) qh3Var2.f;
        boolean z2 = qh3Var2.a == 2;
        if (z2) {
            long c03 = tw21.c0(this.f, ph3Var2 != null ? ph3Var2.e : -1L);
            if (ph3Var2 != null) {
                j2 = ph3Var2.b.nanoTime / j;
            }
            max = tw21.D(this.i, nanoTime2 - j2) + c03;
        } else {
            max = Math.max(0L, (this.w == 0 ? this.x != j2 ? tw21.c0(this.f, c()) : tw21.c0(this.f, b()) : tw21.D(this.i, this.k + nanoTime2)) - this.n);
            if (this.x != j2) {
                max = Math.min(tw21.c0(this.f, this.A), max);
            }
        }
        if (this.D != z2) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = nanoTime2 - this.F;
        if (j11 < 1000000) {
            long D = tw21.D(this.i, j11) + this.E;
            long j12 = (j11 * j) / 1000000;
            max = (((j - j12) * D) + (max * j12)) / j;
        }
        if (!this.j && max > this.B && audioTrack.getPlayState() == 3) {
            this.j = true;
            long H2 = tw21.H(this.i, tw21.l0(max - this.B));
            ((o2x0) this.I).getClass();
            long currentTimeMillis = System.currentTimeMillis() - tw21.l0(H2);
            bh3 bh3Var = cVar.s;
            if (bh3Var != null) {
                bh3Var.p(currentTimeMillis);
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
        ((o2x0) this.I).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.r >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                if (this.g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.u = this.s;
                    }
                    playbackHeadPosition += this.u;
                }
                if (tw21.a <= 29) {
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
        ((o2x0) this.I).getClass();
        return this.z + tw21.e0(tw21.D(this.i, tw21.W(SystemClock.elapsedRealtime()) - this.x), this.f, 1000000L, RoundingMode.UP);
    }

    public final boolean d(long j) {
        long a = a();
        int i = this.f;
        int i2 = tw21.a;
        if (j > tw21.e0(a, i, 1000000L, RoundingMode.UP)) {
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
