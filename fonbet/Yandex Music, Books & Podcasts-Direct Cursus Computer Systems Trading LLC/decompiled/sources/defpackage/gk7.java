package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class gk7 implements oy1 {
    public static final Object j0 = new Object();
    public static ScheduledExecutorService k0;
    public static int l0;
    public ak7 A;
    public ak7 B;
    public p0l C;
    public boolean D;
    public ByteBuffer E;
    public int F;
    public long G;
    public long H;
    public long I;
    public long J;
    public int K;
    public boolean L;
    public boolean M;
    public long N;
    public float O;
    public ByteBuffer P;
    public int Q;
    public ByteBuffer R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public ag2 Y;
    public qxp Z;
    public final Context a;
    public boolean a0;
    public final es6 b;
    public long b0;
    public final bd4 c;
    public long c0;
    public final uat d;
    public boolean d0;
    public final qsn e;
    public boolean e0;
    public final qsn f;
    public Looper f0;
    public final ty1 g;
    public long g0;
    public final ArrayDeque h;
    public long h0;
    public final boolean i;
    public Handler i0;
    public int j;
    public fk7 k;
    public final ck7 l;
    public final ck7 m;
    public final imp n;
    public final qne o;
    public final hk7 p;
    public ndl q;
    public ly1 r;
    public yj7 s;
    public yj7 t;
    public sx1 u;
    public AudioTrack v;
    public yv1 w;
    public bw1 x;
    public vx6 y;
    public dv1 z;

    public gk7(jp0 jp0Var) {
        Context context = (Context) jp0Var.b;
        this.a = context;
        this.z = dv1.g;
        this.w = context != null ? null : (yv1) jp0Var.c;
        this.b = (es6) jp0Var.d;
        int i = dvt.a;
        this.i = false;
        this.j = 0;
        this.n = (imp) jp0Var.e;
        qne qneVar = (qne) jp0Var.g;
        qneVar.getClass();
        this.o = qneVar;
        this.g = new ty1(new xzi(this));
        bd4 bd4Var = new bd4();
        this.c = bd4Var;
        uat uatVar = new uat();
        uatVar.m = dvt.c;
        this.d = uatVar;
        wks wksVar = new wks();
        ude udeVar = yde.b;
        Object[] objArr = {wksVar, bd4Var, uatVar};
        gdg.r(3, objArr);
        this.e = yde.t(3, objArr);
        Object[] objArr2 = {new vks(), bd4Var, uatVar};
        gdg.r(3, objArr2);
        this.f = yde.t(3, objArr2);
        this.O = 1.0f;
        this.X = 0;
        this.Y = new ag2();
        p0l p0lVar = p0l.d;
        this.B = new ak7(p0lVar, 0L, 0L);
        this.C = p0lVar;
        this.D = false;
        this.h = new ArrayDeque();
        this.l = new ck7();
        this.m = new ck7();
        this.p = (hk7) jp0Var.f;
    }

    public static boolean s(AudioTrack audioTrack) {
        return dvt.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A() {
        h();
        ude listIterator = this.e.listIterator(0);
        while (listIterator.hasNext()) {
            ((vx1) listIterator.next()).reset();
        }
        ude listIterator2 = this.f.listIterator(0);
        while (listIterator2.hasNext()) {
            ((vx1) listIterator2.next()).reset();
        }
        sx1 sx1Var = this.u;
        if (sx1Var != null) {
            yde ydeVar = sx1Var.a;
            for (int i = 0; i < ydeVar.size(); i++) {
                vx1 vx1Var = (vx1) ydeVar.get(i);
                vx1Var.flush();
                vx1Var.reset();
            }
            sx1Var.c = new ByteBuffer[0];
            tx1 tx1Var = tx1.e;
            sx1Var.d = false;
        }
        this.V = false;
        this.d0 = false;
    }

    public final void B(dv1 dv1Var) {
        if (this.z.equals(dv1Var)) {
            return;
        }
        this.z = dv1Var;
        if (this.a0) {
            return;
        }
        bw1 bw1Var = this.x;
        if (bw1Var != null) {
            bw1Var.k = dv1Var;
            bw1Var.r(yv1.b((Context) bw1Var.c, dv1Var, (qxp) bw1Var.j));
        }
        h();
    }

    public final void C(int i) {
        if (this.X != i) {
            this.X = i;
            this.W = i != 0;
            h();
        }
    }

    public final void D() {
        if (q()) {
            try {
                this.v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.C.a).setPitch(this.C.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                vq1.o0("DefaultAudioSink", "Failed to set playback params", e);
            }
            p0l p0lVar = new p0l(this.v.getPlaybackParams().getSpeed(), this.v.getPlaybackParams().getPitch());
            this.C = p0lVar;
            float f = p0lVar.a;
            ty1 ty1Var = this.g;
            ty1Var.i = f;
            ry1 ry1Var = ty1Var.e;
            if (ry1Var != null) {
                ry1Var.a();
            }
            ty1Var.e();
        }
    }

    public final void E(ag2 ag2Var) {
        if (this.Y.equals(ag2Var)) {
            return;
        }
        ag2Var.getClass();
        if (this.v != null) {
            this.Y.getClass();
        }
        this.Y = ag2Var;
    }

    public final void F(int i, int i2) {
        yj7 yj7Var;
        AudioTrack audioTrack = this.v;
        if (audioTrack == null || !s(audioTrack) || (yj7Var = this.t) == null || !yj7Var.k) {
            return;
        }
        this.v.setOffloadDelayPadding(i, i2);
    }

    public final void G(int i) {
        vq1.A(dvt.a >= 29);
        this.j = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        byte b;
        int i2;
        int i3;
        vq1.A(this.R == null);
        if (byteBuffer.hasRemaining()) {
            if (this.t.c == 0) {
                int g0 = (int) dvt.g0(dvt.Y(20L), this.t.e, 1000000L, RoundingMode.UP);
                long m = m();
                long j = g0;
                if (m < j) {
                    yj7 yj7Var = this.t;
                    int i4 = yj7Var.g;
                    int i5 = yj7Var.d;
                    int i6 = (int) m;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < g0) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i4 == 4) {
                                float h = dvt.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (h < 0.0f ? (-h) * (-2.1474836E9f) : h * 2.1474836E9f);
                            } else if (i4 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i4 != 22) {
                                if (i4 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i4 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i4 != 1610612736) {
                                    e7o.n();
                                    return;
                                } else {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            int i7 = (int) ((i3 * i6) / j);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i7 >> 16));
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i7);
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                } else {
                                    if (i4 != 1610612736) {
                                        e7o.n();
                                        return;
                                    }
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) i7);
                                }
                            } else if (i7 < 0) {
                                byteBuffer2.putFloat((-i7) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i7 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        int i72 = (int) ((i3 * i6) / j);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.R = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.R = byteBuffer2;
        }
    }

    public final void I(p0l p0lVar) {
        this.C = new p0l(dvt.h(p0lVar.a, 0.1f, 8.0f), dvt.h(p0lVar.b, 0.1f, 8.0f));
        if (M()) {
            D();
            return;
        }
        ak7 ak7Var = new ak7(p0lVar, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.A = ak7Var;
        } else {
            this.B = ak7Var;
        }
    }

    public final void J(AudioDeviceInfo audioDeviceInfo) {
        this.Z = audioDeviceInfo == null ? null : new qxp(audioDeviceInfo);
        bw1 bw1Var = this.x;
        if (bw1Var != null) {
            bw1Var.t(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.v;
        if (audioTrack != null) {
            qxp qxpVar = this.Z;
            audioTrack.setPreferredDevice(qxpVar != null ? (AudioDeviceInfo) qxpVar.a : null);
        }
    }

    public final void K(boolean z) {
        this.D = z;
        ak7 ak7Var = new ak7(M() ? p0l.d : this.C, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.A = ak7Var;
        } else {
            this.B = ak7Var;
        }
    }

    public final boolean L(dsc dscVar) {
        return k(dscVar) != 0;
    }

    public final boolean M() {
        yj7 yj7Var = this.t;
        return yj7Var != null && yj7Var.j && dvt.a >= 23;
    }

    public final void a(long j) {
        p0l p0lVar;
        boolean M = M();
        boolean z = false;
        es6 es6Var = this.b;
        if (M) {
            p0lVar = p0l.d;
        } else {
            if (!this.a0) {
                yj7 yj7Var = this.t;
                if (yj7Var.c == 0) {
                    int i = yj7Var.a.F;
                    p0lVar = this.C;
                    k3r k3rVar = (k3r) es6Var.c;
                    float f = p0lVar.a;
                    k3rVar.getClass();
                    vq1.v(f > 0.0f);
                    if (k3rVar.c != f) {
                        k3rVar.c = f;
                        k3rVar.i = true;
                    }
                    float f2 = p0lVar.b;
                    vq1.v(f2 > 0.0f);
                    if (k3rVar.d != f2) {
                        k3rVar.d = f2;
                        k3rVar.i = true;
                    }
                    this.C = p0lVar;
                }
            }
            p0lVar = p0l.d;
            this.C = p0lVar;
        }
        p0l p0lVar2 = p0lVar;
        if (!this.a0) {
            yj7 yj7Var2 = this.t;
            if (yj7Var2.c == 0) {
                int i2 = yj7Var2.a.F;
                z = this.D;
                ((cgq) es6Var.b).o = z;
            }
        }
        this.D = z;
        this.h.add(new ak7(p0lVar2, Math.max(0L, j), dvt.e0(this.t.e, m())));
        sx1 sx1Var = this.t.i;
        this.u = sx1Var;
        sx1Var.a();
        ly1 ly1Var = this.r;
        if (ly1Var != null) {
            ly1Var.e(this.D);
        }
    }

    public final AudioTrack b(z9 z9Var, dv1 dv1Var, int i, dsc dscVar) {
        try {
            AudioTrack a = this.p.a(z9Var, dv1Var, i);
            int state = a.getState();
            if (state == 1) {
                return a;
            }
            try {
                a.release();
            } catch (Exception unused) {
            }
            throw new ky1(state, z9Var.b, z9Var.c, z9Var.a, dscVar, z9Var.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new ky1(0, z9Var.b, z9Var.c, z9Var.a, dscVar, z9Var.e, e);
        }
    }

    public final AudioTrack c(yj7 yj7Var) {
        try {
            return b(yj7Var.a(), this.z, this.X, yj7Var.a);
        } catch (ky1 e) {
            ly1 ly1Var = this.r;
            if (ly1Var != null) {
                ly1Var.f(e);
            }
            throw e;
        }
    }

    public final void d(dsc dscVar, int[] iArr) {
        int i;
        sx1 sx1Var;
        boolean z;
        int intValue;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        sx1 sx1Var2;
        int i6;
        int i7;
        int w;
        t();
        String str = dscVar.n;
        int i8 = dscVar.E;
        int i9 = dscVar.D;
        int i10 = dscVar.F;
        boolean equals = "audio/raw".equals(str);
        boolean z3 = this.i;
        if (equals) {
            vq1.v(dvt.T(i10));
            i4 = dvt.v(i10) * i9;
            tde tdeVar = new tde(4);
            tdeVar.c(this.e);
            vx1[] vx1VarArr = (vx1[]) this.b.a;
            int length = vx1VarArr.length;
            gdg.r(length, vx1VarArr);
            tdeVar.d(length);
            System.arraycopy(vx1VarArr, 0, tdeVar.a, tdeVar.b, length);
            tdeVar.b += length;
            sx1 sx1Var3 = new sx1(tdeVar.f());
            if (sx1Var3.equals(this.u)) {
                sx1Var3 = this.u;
            }
            int i11 = dscVar.G;
            int i12 = dscVar.H;
            uat uatVar = this.d;
            uatVar.i = i11;
            uatVar.j = i12;
            this.c.i = iArr;
            tx1 tx1Var = new tx1(i8, i9, i10);
            try {
                yde ydeVar = sx1Var3.a;
                if (tx1Var.equals(tx1.e)) {
                    throw new ux1(tx1Var);
                }
                for (int i13 = 0; i13 < ydeVar.size(); i13++) {
                    vx1 vx1Var = (vx1) ydeVar.get(i13);
                    tx1 e = vx1Var.e(tx1Var);
                    if (vx1Var.b()) {
                        vq1.A(!e.equals(tx1.e));
                        tx1Var = e;
                    }
                }
                int i14 = tx1Var.b;
                i2 = tx1Var.c;
                int i15 = tx1Var.a;
                int u = dvt.u(i14);
                int v = dvt.v(i2) * i14;
                z = z3;
                intValue = u;
                sx1Var = sx1Var3;
                i5 = 0;
                i = i15;
                i3 = v;
                z2 = false;
            } catch (ux1 e2) {
                throw new jy1(e2, dscVar);
            }
        } else {
            sx1 sx1Var4 = new sx1(qsn.e);
            ix1 j = this.j != 0 ? j(dscVar) : ix1.d;
            if (this.j == 0 || !j.a) {
                Pair d = this.w.d(this.z, dscVar);
                if (d == null) {
                    throw new jy1("Unable to configure passthrough for: " + dscVar, dscVar);
                }
                int intValue2 = ((Integer) d.first).intValue();
                i = i8;
                sx1Var = sx1Var4;
                z = z3;
                intValue = ((Integer) d.second).intValue();
                i2 = intValue2;
                i3 = -1;
                i4 = -1;
                z2 = false;
                i5 = 2;
            } else {
                str.getClass();
                int d2 = l5i.d(str, dscVar.k);
                int u2 = dvt.u(i9);
                i = i8;
                sx1Var = sx1Var4;
                z2 = j.b;
                i2 = d2;
                i5 = 1;
                i3 = -1;
                i4 = -1;
                intValue = u2;
                z = true;
            }
        }
        if (i2 == 0) {
            throw new jy1("Invalid output encoding (mode=" + i5 + ") for: " + dscVar, dscVar);
        }
        if (intValue == 0) {
            throw new jy1("Invalid output channel config (mode=" + i5 + ") for: " + dscVar, dscVar);
        }
        int i16 = dscVar.j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i16 == -1) {
            i16 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i, intValue, i2);
        vq1.A(minBufferSize != -2);
        int i17 = i3 != -1 ? i3 : 1;
        double d3 = z ? 8.0d : 1.0d;
        this.n.getClass();
        if (i5 != 0) {
            if (i5 == 1) {
                sx1Var2 = sx1Var;
                i7 = zc4.s((50000000 * imp.w(i2)) / 1000000);
            } else {
                if (i5 != 2) {
                    e7o.e();
                    return;
                }
                int i18 = i2 == 5 ? 500000 : i2 == 8 ? 1000000 : 250000;
                if (i16 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    w = pd.E(i16, 8);
                } else {
                    w = imp.w(i2);
                }
                sx1Var2 = sx1Var;
                i7 = zc4.s((i18 * w) / 1000000);
            }
            i6 = i2;
        } else {
            sx1Var2 = sx1Var;
            i6 = i2;
            long j2 = i;
            long j3 = 250000 * j2;
            long j4 = i17;
            i7 = dvt.i(minBufferSize * 4, zc4.s((j3 * j4) / 1000000), zc4.s(((750000 * j2) * j4) / 1000000));
        }
        this.d0 = false;
        yj7 yj7Var = new yj7(dscVar, i4, i5, i3, i, intValue, i6, (((Math.max(minBufferSize, (int) (i7 * d3)) + i17) - 1) / i17) * i17, sx1Var2, z, z2, this.a0);
        if (q()) {
            this.s = yj7Var;
        } else {
            this.t = yj7Var;
        }
    }

    public final void e(long j) {
        int write;
        ly1 ly1Var;
        boolean z;
        ck7 ck7Var = this.m;
        if (this.R == null) {
            return;
        }
        if (((Exception) ck7Var.c) != null) {
            synchronized (j0) {
                z = l0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < ck7Var.b) {
                return;
            }
        }
        int remaining = this.R.remaining();
        if (this.a0) {
            vq1.A(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.b0;
            } else {
                this.b0 = j;
            }
            AudioTrack audioTrack = this.v;
            ByteBuffer byteBuffer = this.R;
            if (dvt.a >= 26) {
                write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j);
            } else {
                if (this.E == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.E = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.E.putInt(1431633921);
                }
                if (this.F == 0) {
                    this.E.putInt(4, remaining);
                    this.E.putLong(8, j * 1000);
                    this.E.position(0);
                    this.F = remaining;
                }
                int remaining2 = this.E.remaining();
                if (remaining2 > 0) {
                    int write2 = audioTrack.write(this.E, remaining2, 1);
                    if (write2 < 0) {
                        this.F = 0;
                        write = write2;
                    } else if (write2 < remaining2) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining, 1);
                if (write < 0) {
                    this.F = 0;
                } else {
                    this.F -= write;
                }
            }
        } else {
            write = this.v.write(this.R, remaining, 1);
        }
        this.c0 = SystemClock.elapsedRealtime();
        if (write < 0) {
            if ((dvt.a >= 24 && write == -6) || write == -32) {
                if (m() <= 0) {
                    if (s(this.v)) {
                        if (this.t.c == 1) {
                            this.d0 = true;
                        }
                    }
                }
                r2 = true;
            }
            ny1 ny1Var = new ny1(write, this.t.a, r2);
            ly1 ly1Var2 = this.r;
            if (ly1Var2 != null) {
                ly1Var2.f(ny1Var);
            }
            if (!ny1Var.b || this.a == null) {
                ck7Var.e(ny1Var);
                return;
            } else {
                this.w = yv1.c;
                throw ny1Var;
            }
        }
        ck7Var.c = null;
        ck7Var.a = -9223372036854775807L;
        ck7Var.b = -9223372036854775807L;
        if (s(this.v)) {
            if (this.J > 0) {
                this.e0 = false;
            }
            if (this.V && (ly1Var = this.r) != null && write < remaining && !this.e0) {
                ly1Var.q();
            }
        }
        int i = this.t.c;
        if (i == 0) {
            this.I += write;
        }
        if (write == remaining) {
            if (i != 0) {
                vq1.A(this.R == this.P);
                this.J = (this.K * this.Q) + this.J;
            }
            this.R = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        ByteBuffer byteBuffer;
        if (!this.u.d()) {
            e(Long.MIN_VALUE);
            return this.R == null;
        }
        sx1 sx1Var = this.u;
        if (sx1Var.d() && !sx1Var.d) {
            sx1Var.d = true;
            ((vx1) sx1Var.b.get(0)).f();
        }
        y(Long.MIN_VALUE);
        if (!this.u.c() || ((byteBuffer = this.R) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void g() {
        vq1.A(this.W);
        if (this.a0) {
            return;
        }
        this.a0 = true;
        h();
    }

    public final void h() {
        vx6 vx6Var;
        if (q()) {
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.e0 = false;
            this.K = 0;
            this.B = new ak7(this.C, 0L, 0L);
            this.N = 0L;
            this.A = null;
            this.h.clear();
            this.P = null;
            this.Q = 0;
            this.R = null;
            this.T = false;
            this.S = false;
            this.U = false;
            this.E = null;
            this.F = 0;
            this.d.o = 0L;
            sx1 sx1Var = this.t.i;
            this.u = sx1Var;
            sx1Var.a();
            AudioTrack audioTrack = this.g.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.v.pause();
            }
            if (s(this.v)) {
                fk7 fk7Var = this.k;
                fk7Var.getClass();
                fk7Var.a(this.v);
            }
            z9 a = this.t.a();
            yj7 yj7Var = this.s;
            if (yj7Var != null) {
                this.t = yj7Var;
                this.s = null;
            }
            ty1 ty1Var = this.g;
            ty1Var.e();
            ty1Var.c = null;
            ty1Var.e = null;
            if (dvt.a >= 24 && (vx6Var = this.y) != null) {
                AudioTrack audioTrack2 = (AudioTrack) vx6Var.b;
                bk7 bk7Var = (bk7) vx6Var.d;
                bk7Var.getClass();
                audioTrack2.removeOnRoutingChangedListener(bk7Var);
                vx6Var.d = null;
                this.y = null;
            }
            AudioTrack audioTrack3 = this.v;
            ly1 ly1Var = this.r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (j0) {
                try {
                    if (k0 == null) {
                        k0 = Executors.newSingleThreadScheduledExecutor(new jt7(4));
                    }
                    l0++;
                    k0.schedule(new r8(audioTrack3, ly1Var, handler, a, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.v = null;
        }
        ck7 ck7Var = this.m;
        ck7Var.c = null;
        ck7Var.a = -9223372036854775807L;
        ck7Var.b = -9223372036854775807L;
        ck7 ck7Var2 = this.l;
        ck7Var2.c = null;
        ck7Var2.a = -9223372036854775807L;
        ck7Var2.b = -9223372036854775807L;
        this.g0 = 0L;
        this.h0 = 0L;
        Handler handler2 = this.i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long i() {
        ArrayDeque arrayDeque;
        long j;
        if (!q() || this.M) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.g.a(), dvt.e0(this.t.e, m()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((ak7) arrayDeque.getFirst()).c) {
                break;
            }
            this.B = (ak7) arrayDeque.remove();
        }
        ak7 ak7Var = this.B;
        long j2 = min - ak7Var.c;
        long G = dvt.G(ak7Var.a.a, j2);
        boolean isEmpty = arrayDeque.isEmpty();
        es6 es6Var = this.b;
        if (isEmpty) {
            k3r k3rVar = (k3r) es6Var.c;
            if (k3rVar.b()) {
                if (k3rVar.o >= 1024) {
                    long j3 = k3rVar.n;
                    k3rVar.j.getClass();
                    long j4 = j3 - ((r8.k * r8.b) * 2);
                    int i = k3rVar.h.a;
                    int i2 = k3rVar.g.a;
                    long j5 = k3rVar.o;
                    j2 = i == i2 ? dvt.g0(j2, j4, j5, RoundingMode.DOWN) : dvt.g0(j2, j4 * i, j5 * i2, RoundingMode.DOWN);
                } else {
                    j2 = (long) (k3rVar.c * j2);
                }
            }
            ak7 ak7Var2 = this.B;
            j = ak7Var2.b + j2;
            ak7Var2.d = j2 - G;
        } else {
            ak7 ak7Var3 = this.B;
            j = ak7Var3.b + G + ak7Var3.d;
        }
        long j6 = ((cgq) es6Var.b).q;
        long e0 = dvt.e0(this.t.e, j6) + j;
        long j7 = this.g0;
        if (j6 > j7) {
            long e02 = dvt.e0(this.t.e, j6 - j7);
            this.g0 = j6;
            this.h0 += e02;
            if (this.i0 == null) {
                this.i0 = new Handler(Looper.myLooper());
            }
            this.i0.removeCallbacksAndMessages(null);
            this.i0.postDelayed(new he0(26, this), 100L);
        }
        return e0;
    }

    public final ix1 j(dsc dscVar) {
        boolean booleanValue;
        if (this.d0) {
            return ix1.d;
        }
        dv1 dv1Var = this.z;
        qne qneVar = this.o;
        qneVar.getClass();
        dscVar.getClass();
        int i = dscVar.E;
        dv1Var.getClass();
        int i2 = dvt.a;
        if (i2 < 29 || i == -1) {
            return ix1.d;
        }
        Context context = (Context) qneVar.a;
        Boolean bool = (Boolean) qneVar.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = fx1.f(context).getParameters("offloadVariableRateSupported");
                qneVar.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                qneVar.b = Boolean.FALSE;
            }
            booleanValue = ((Boolean) qneVar.b).booleanValue();
        }
        String str = dscVar.n;
        str.getClass();
        int d = l5i.d(str, dscVar.k);
        if (d == 0 || i2 < dvt.s(d)) {
            return ix1.d;
        }
        int u = dvt.u(dscVar.D);
        if (u == 0) {
            return ix1.d;
        }
        try {
            AudioFormat t = dvt.t(i, u, d);
            return i2 >= 31 ? rf0.n(t, (AudioAttributes) dv1Var.b().a, booleanValue) : mi.r(t, (AudioAttributes) dv1Var.b().a, booleanValue);
        } catch (IllegalArgumentException unused) {
            return ix1.d;
        }
    }

    public final int k(dsc dscVar) {
        t();
        String str = dscVar.n;
        int i = dscVar.F;
        if ("audio/raw".equals(str)) {
            if (!dvt.T(i)) {
                dfi.o(i, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        } else if (this.w.d(this.z, dscVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        return this.t.c == 0 ? this.G / r0.b : this.H;
    }

    public final long m() {
        yj7 yj7Var = this.t;
        if (yj7Var.c != 0) {
            return this.J;
        }
        long j = this.I;
        long j2 = yj7Var.d;
        int i = dvt.a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x00b5, code lost:
    
        if (p() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
    
        if (r9.b() == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0386, code lost:
    
        if (r13 == 0) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(ByteBuffer byteBuffer, long j, int i) {
        int i2;
        int M;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        qy1 qy1Var;
        ByteBuffer byteBuffer2 = this.P;
        vq1.v(byteBuffer2 == null || byteBuffer == byteBuffer2);
        yj7 yj7Var = this.s;
        ty1 ty1Var = this.g;
        if (yj7Var != null) {
            if (f()) {
                yj7 yj7Var2 = this.s;
                yj7 yj7Var3 = this.t;
                yj7Var2.getClass();
                if (yj7Var3.c == yj7Var2.c && yj7Var3.g == yj7Var2.g && yj7Var3.e == yj7Var2.e && yj7Var3.f == yj7Var2.f && yj7Var3.d == yj7Var2.d && yj7Var3.j == yj7Var2.j && yj7Var3.k == yj7Var2.k) {
                    this.t = this.s;
                    this.s = null;
                    AudioTrack audioTrack = this.v;
                    if (audioTrack != null && s(audioTrack) && this.t.k) {
                        if (this.v.getPlayState() == 3) {
                            this.v.setOffloadEndOfStream();
                            ty1Var.G = true;
                            ry1 ry1Var = ty1Var.e;
                            if (ry1Var != null && (qy1Var = ry1Var.a) != null) {
                                qy1Var.f = true;
                            }
                        }
                        AudioTrack audioTrack2 = this.v;
                        dsc dscVar = this.t.a;
                        audioTrack2.setOffloadDelayPadding(dscVar.G, dscVar.H);
                        this.e0 = true;
                    }
                } else {
                    w();
                    if (!o()) {
                        h();
                    }
                }
                a(j);
            }
            return false;
        }
        boolean q = q();
        ck7 ck7Var = this.l;
        if (!q) {
            try {
            } catch (ky1 e) {
                if (e.b) {
                    throw e;
                }
                ck7Var.e(e);
                return false;
            }
        }
        ck7Var.c = null;
        ck7Var.a = -9223372036854775807L;
        ck7Var.b = -9223372036854775807L;
        if (this.M) {
            this.N = Math.max(0L, j);
            this.L = false;
            this.M = false;
            if (M()) {
                D();
            }
            a(j);
            if (this.V) {
                v();
            }
        }
        long m = m();
        AudioTrack audioTrack3 = ty1Var.c;
        audioTrack3.getClass();
        int playState = audioTrack3.getPlayState();
        if (ty1Var.g) {
            if (playState == 2) {
                ty1Var.o = false;
                return false;
            }
            if (playState == 1) {
            }
        }
        boolean z = ty1Var.o;
        boolean d = ty1Var.d(m);
        ty1Var.o = d;
        if (z && !d && playState != 1) {
            xzi xziVar = ty1Var.a;
            int i9 = ty1Var.d;
            long m0 = dvt.m0(ty1Var.h);
            gk7 gk7Var = (gk7) xziVar.a;
            if (gk7Var.r != null) {
                gk7Var.r.Q(i9, m0, SystemClock.elapsedRealtime() - gk7Var.c0);
            }
        }
        if (this.P == null) {
            vq1.v(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                yj7 yj7Var4 = this.t;
                if (yj7Var4.c != 0 && this.K == 0) {
                    int i10 = yj7Var4.g;
                    if (i10 != 20) {
                        if (i10 != 30) {
                            switch (i10) {
                                case 5:
                                case 6:
                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                        M = nt0.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                        break;
                                    } else {
                                        M = 1536;
                                        break;
                                    }
                                case 7:
                                case 8:
                                    break;
                                case 9:
                                    int i11 = byteBuffer.getInt(byteBuffer.position());
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i11 = Integer.reverseBytes(i11);
                                    }
                                    if ((i11 & (-2097152)) == -2097152 && (i6 = (i11 >>> 19) & 3) != 1 && (i7 = (i11 >>> 17) & 3) != 0) {
                                        int i12 = (i11 >>> 12) & 15;
                                        int i13 = (i11 >>> 10) & 3;
                                        if (i12 != 0 && i12 != 15 && i13 != 3) {
                                            i5 = 1152;
                                            if (i7 != 1) {
                                                if (i7 != 2) {
                                                    if (i7 != 3) {
                                                        e7o.e();
                                                        return false;
                                                    }
                                                    i5 = 384;
                                                }
                                            } else if (i6 != 3) {
                                                i5 = 576;
                                            }
                                            if (i5 != -1) {
                                                e7o.e();
                                                return false;
                                            }
                                            M = i5;
                                            break;
                                        }
                                    }
                                    i5 = -1;
                                    if (i5 != -1) {
                                    }
                                    break;
                                case 10:
                                    M = 1024;
                                    break;
                                case 11:
                                case 12:
                                    M = 2048;
                                    break;
                                default:
                                    char c = 16;
                                    switch (i10) {
                                        case 14:
                                            int position = byteBuffer.position();
                                            int limit = byteBuffer.limit() - 10;
                                            int i14 = position;
                                            while (true) {
                                                if (i14 <= limit) {
                                                    int i15 = byteBuffer.getInt(i14 + 4);
                                                    char c2 = c;
                                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                        i15 = Integer.reverseBytes(i15);
                                                    }
                                                    if ((i15 & (-2)) == -126718022) {
                                                        i8 = i14 - position;
                                                    } else {
                                                        i14++;
                                                        c = c2;
                                                    }
                                                } else {
                                                    i8 = -1;
                                                }
                                            }
                                            if (i8 == -1) {
                                                M = 0;
                                                break;
                                            } else {
                                                M = (40 << ((byteBuffer.get((byteBuffer.position() + i8) + ((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                                break;
                                            }
                                        case 15:
                                            M = RemoteCameraConfig.Mic.BUFFER_SIZE;
                                            break;
                                        case 16:
                                            break;
                                        case 17:
                                            byte[] bArr = new byte[16];
                                            int position2 = byteBuffer.position();
                                            byteBuffer.get(bArr);
                                            byteBuffer.position(position2);
                                            M = ot0.O(new v94(bArr, 16)).c;
                                            break;
                                        case 18:
                                            break;
                                        default:
                                            xq0.q(k5r.i(i10, "Unexpected audio encoding: "));
                                            return false;
                                    }
                            }
                        }
                        if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                M = 4096;
                            } else {
                                int position3 = byteBuffer.position();
                                byte b3 = byteBuffer.get(position3);
                                if (b3 != -2) {
                                    if (b3 == -1) {
                                        i3 = (byteBuffer.get(position3 + 4) & 7) << 4;
                                        b2 = byteBuffer.get(position3 + 7);
                                    } else if (b3 != 31) {
                                        i3 = (byteBuffer.get(position3 + 4) & 1) << 6;
                                        b = byteBuffer.get(position3 + 5);
                                    } else {
                                        i3 = (byteBuffer.get(position3 + 5) & 7) << 4;
                                        b2 = byteBuffer.get(position3 + 6);
                                    }
                                    i4 = b2 & 60;
                                    M = (((i4 >> 2) | i3) + 1) * 32;
                                } else {
                                    i3 = (byteBuffer.get(position3 + 5) & 1) << 6;
                                    b = byteBuffer.get(position3 + 4);
                                }
                                i4 = b & 252;
                                M = (((i4 >> 2) | i3) + 1) * 32;
                            }
                        }
                        M = 1024;
                    } else {
                        if ((byteBuffer.get(5) & 2) == 0) {
                            i2 = 0;
                        } else {
                            byte b4 = byteBuffer.get(26);
                            int i16 = 28;
                            int i17 = 28;
                            for (int i18 = 0; i18 < b4; i18++) {
                                i17 += byteBuffer.get(i18 + 27);
                            }
                            byte b5 = byteBuffer.get(i17 + 26);
                            for (int i19 = 0; i19 < b5; i19++) {
                                i16 += byteBuffer.get(i17 + 27 + i19);
                            }
                            i2 = i17 + i16;
                        }
                        int i20 = byteBuffer.get(i2 + 26) + 27 + i2;
                        M = (int) ((u7g.M(byteBuffer.get(i20), byteBuffer.limit() - i20 > 1 ? byteBuffer.get(i20 + 1) : (byte) 0) * 48000) / 1000000);
                    }
                    this.K = M;
                }
                if (this.A != null) {
                    if (f()) {
                        a(j);
                        this.A = null;
                    }
                    return false;
                }
                long e0 = dvt.e0(this.t.a.E, l() - this.d.o) + this.N;
                if (!this.L && Math.abs(e0 - j) > 200000) {
                    ly1 ly1Var = this.r;
                    if (ly1Var != null) {
                        StringBuilder l = tlm.l(e0, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        l.append(j);
                        ly1Var.f(new my1(l.toString()));
                    }
                    this.L = true;
                }
                if (this.L) {
                    if (f()) {
                        long j2 = j - e0;
                        this.N += j2;
                        this.L = false;
                        a(j);
                        ly1 ly1Var2 = this.r;
                        if (ly1Var2 != null && j2 != 0) {
                            ly1Var2.W();
                        }
                    }
                    return false;
                }
                if (this.t.c == 0) {
                    this.G += byteBuffer.remaining();
                } else {
                    this.H = (this.K * i) + this.H;
                }
                this.P = byteBuffer;
                this.Q = i;
            }
            return true;
        }
        y(j);
        if (!this.P.hasRemaining()) {
            this.P = null;
            this.Q = 0;
            return true;
        }
        long m2 = m();
        if (ty1Var.y != -9223372036854775807L && m2 > 0) {
            ty1Var.I.getClass();
            if (SystemClock.elapsedRealtime() - ty1Var.y >= 200) {
                vq1.n0("DefaultAudioSink", "Resetting stalled audio track");
                h();
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        if (q()) {
            return !(dvt.a >= 29 && this.v.isOffloadedPlayback() && this.U) && this.g.d(m());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        AudioTrack c;
        bw1 bw1Var;
        ndl ndlVar;
        boolean z;
        ck7 ck7Var = this.l;
        if (((Exception) ck7Var.c) != null) {
            synchronized (j0) {
                z = l0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < ck7Var.b) {
                return false;
            }
        }
        try {
            yj7 yj7Var = this.t;
            yj7Var.getClass();
            c = c(yj7Var);
        } catch (ky1 e) {
            yj7 yj7Var2 = this.t;
            if (yj7Var2.h > 1000000) {
                yj7 yj7Var3 = new yj7(yj7Var2.a, yj7Var2.b, yj7Var2.c, yj7Var2.d, yj7Var2.e, yj7Var2.f, yj7Var2.g, 1000000, yj7Var2.i, yj7Var2.j, yj7Var2.k, yj7Var2.l);
                try {
                    c = c(yj7Var3);
                    this.t = yj7Var3;
                } catch (ky1 e2) {
                    e.addSuppressed(e2);
                    if (this.t.c == 1) {
                    }
                }
            }
            if (this.t.c == 1) {
                throw e;
            }
            this.d0 = true;
            throw e;
        }
        this.v = c;
        if (s(c)) {
            AudioTrack audioTrack = this.v;
            if (this.k == null) {
                this.k = new fk7(this);
            }
            fk7 fk7Var = this.k;
            Handler handler = fk7Var.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new dk7(handler, 0), fk7Var.b);
            yj7 yj7Var4 = this.t;
            if (yj7Var4.k) {
                AudioTrack audioTrack2 = this.v;
                dsc dscVar = yj7Var4.a;
                audioTrack2.setOffloadDelayPadding(dscVar.G, dscVar.H);
            }
        }
        int i = dvt.a;
        if (i >= 31 && (ndlVar = this.q) != null) {
            rf0.x(this.v, ndlVar);
        }
        this.X = this.v.getAudioSessionId();
        ty1 ty1Var = this.g;
        AudioTrack audioTrack3 = this.v;
        yj7 yj7Var5 = this.t;
        boolean z2 = yj7Var5.c == 2;
        int i2 = yj7Var5.g;
        int i3 = yj7Var5.d;
        int i4 = yj7Var5.h;
        ty1Var.c = audioTrack3;
        ty1Var.d = i4;
        ty1Var.e = new ry1(audioTrack3);
        ty1Var.f = audioTrack3.getSampleRate();
        ty1Var.g = z2 && i < 23 && (i2 == 5 || i2 == 6);
        boolean T = dvt.T(i2);
        ty1Var.p = T;
        ty1Var.h = T ? dvt.e0(ty1Var.f, i4 / i3) : -9223372036854775807L;
        ty1Var.s = 0L;
        ty1Var.t = 0L;
        ty1Var.G = false;
        ty1Var.H = 0L;
        ty1Var.u = 0L;
        ty1Var.o = false;
        ty1Var.x = -9223372036854775807L;
        ty1Var.y = -9223372036854775807L;
        ty1Var.q = 0L;
        ty1Var.n = 0L;
        ty1Var.i = 1.0f;
        if (q()) {
            this.v.setVolume(this.O);
        }
        this.Y.getClass();
        qxp qxpVar = this.Z;
        if (qxpVar != null && i >= 23) {
            this.v.setPreferredDevice((AudioDeviceInfo) qxpVar.a);
            bw1 bw1Var2 = this.x;
            if (bw1Var2 != null) {
                bw1Var2.t((AudioDeviceInfo) this.Z.a);
            }
        }
        if (i >= 24 && (bw1Var = this.x) != null) {
            this.y = new vx6(this.v, bw1Var);
        }
        this.M = true;
        ly1 ly1Var = this.r;
        if (ly1Var != null) {
            ly1Var.r(this.t.a());
        }
        return true;
    }

    public final boolean q() {
        return this.v != null;
    }

    public final boolean r() {
        if (q()) {
            return this.S && !o();
        }
        return true;
    }

    public final void t() {
        Context context;
        yv1 c;
        zv1 zv1Var;
        if (this.x == null && (context = this.a) != null) {
            this.f0 = Looper.myLooper();
            bw1 bw1Var = new bw1(context, new n(25, this), this.z, this.Z);
            this.x = bw1Var;
            Handler handler = (Handler) bw1Var.e;
            Context context2 = (Context) bw1Var.c;
            if (bw1Var.b) {
                c = (yv1) bw1Var.i;
                c.getClass();
            } else {
                bw1Var.b = true;
                aw1 aw1Var = (aw1) bw1Var.h;
                if (aw1Var != null) {
                    aw1Var.a.registerContentObserver(aw1Var.b, false, aw1Var);
                }
                if (dvt.a >= 23 && (zv1Var = (zv1) bw1Var.f) != null) {
                    fx1.f(context2).registerAudioDeviceCallback(zv1Var, handler);
                }
                c = yv1.c(context2, context2.registerReceiver((l83) bw1Var.g, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (dv1) bw1Var.k, (qxp) bw1Var.j);
                bw1Var.i = c;
            }
            this.w = c;
        }
        this.w.getClass();
    }

    public final void u() {
        this.V = false;
        if (q()) {
            ty1 ty1Var = this.g;
            ty1Var.e();
            if (ty1Var.x == -9223372036854775807L) {
                ry1 ry1Var = ty1Var.e;
                ry1Var.getClass();
                ry1Var.a();
            } else {
                ty1Var.z = ty1Var.b();
                if (!s(this.v)) {
                    return;
                }
            }
            this.v.pause();
        }
    }

    public final void v() {
        this.V = true;
        if (q()) {
            ty1 ty1Var = this.g;
            if (ty1Var.x != -9223372036854775807L) {
                ty1Var.I.getClass();
                ty1Var.x = dvt.Y(SystemClock.elapsedRealtime());
            }
            ry1 ry1Var = ty1Var.e;
            ry1Var.getClass();
            ry1Var.a();
            this.v.play();
        }
    }

    public final void w() {
        if (this.T) {
            return;
        }
        this.T = true;
        long m = m();
        ty1 ty1Var = this.g;
        ty1Var.z = ty1Var.b();
        ty1Var.I.getClass();
        ty1Var.x = dvt.Y(SystemClock.elapsedRealtime());
        ty1Var.A = m;
        if (s(this.v)) {
            this.U = false;
        }
        this.v.stop();
        this.F = 0;
    }

    public final void x() {
        if (!this.S && q() && f()) {
            w();
            this.S = true;
        }
    }

    public final void y(long j) {
        ByteBuffer byteBuffer;
        e(j);
        if (this.R != null) {
            return;
        }
        if (!this.u.d()) {
            ByteBuffer byteBuffer2 = this.P;
            if (byteBuffer2 != null) {
                H(byteBuffer2);
                e(j);
                return;
            }
            return;
        }
        while (!this.u.c()) {
            do {
                sx1 sx1Var = this.u;
                if (sx1Var.d()) {
                    ByteBuffer byteBuffer3 = sx1Var.c[sx1Var.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        sx1Var.e(vx1.a);
                        byteBuffer = sx1Var.c[sx1Var.b()];
                    }
                } else {
                    byteBuffer = vx1.a;
                }
                if (byteBuffer.hasRemaining()) {
                    H(byteBuffer);
                    e(j);
                } else {
                    ByteBuffer byteBuffer4 = this.P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    sx1 sx1Var2 = this.u;
                    ByteBuffer byteBuffer5 = this.P;
                    if (sx1Var2.d() && !sx1Var2.d) {
                        sx1Var2.e(byteBuffer5);
                    }
                }
            } while (this.R == null);
            return;
        }
    }

    public final void z() {
        zv1 zv1Var;
        bw1 bw1Var = this.x;
        if (bw1Var != null) {
            Context context = (Context) bw1Var.c;
            if (bw1Var.b) {
                bw1Var.i = null;
                if (dvt.a >= 23 && (zv1Var = (zv1) bw1Var.f) != null) {
                    fx1.f(context).unregisterAudioDeviceCallback(zv1Var);
                }
                context.unregisterReceiver((l83) bw1Var.g);
                aw1 aw1Var = (aw1) bw1Var.h;
                if (aw1Var != null) {
                    aw1Var.a.unregisterContentObserver(aw1Var);
                }
                bw1Var.b = false;
            }
        }
    }
}
