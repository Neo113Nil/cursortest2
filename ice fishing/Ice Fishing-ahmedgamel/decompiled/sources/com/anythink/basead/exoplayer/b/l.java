package com.anythink.basead.exoplayer.b;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.b.h;
import com.anythink.basead.exoplayer.b.j;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.v;
import com.anythink.basead.ui.BaseATView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f7307b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f7308c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final long f7309d = 250000;

    /* renamed from: e, reason: collision with root package name */
    private static final long f7310e = 750000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f7311f = 250000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7312g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7313h = -2;
    private static final int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f7314j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f7315k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f7316l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final String f7317m = "AudioTrack";

    /* renamed from: n, reason: collision with root package name */
    private static final int f7318n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f7319o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7320p = 2;

    /* renamed from: A, reason: collision with root package name */
    private h.c f7321A;

    /* renamed from: B, reason: collision with root package name */
    private AudioTrack f7322B;

    /* renamed from: C, reason: collision with root package name */
    private AudioTrack f7323C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7324D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f7325E;

    /* renamed from: F, reason: collision with root package name */
    private int f7326F;

    /* renamed from: G, reason: collision with root package name */
    private int f7327G;

    /* renamed from: H, reason: collision with root package name */
    private int f7328H;

    /* renamed from: I, reason: collision with root package name */
    private int f7329I;
    private com.anythink.basead.exoplayer.b.b J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f7330K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7331L;

    /* renamed from: M, reason: collision with root package name */
    private int f7332M;

    /* renamed from: N, reason: collision with root package name */
    private v f7333N;

    /* renamed from: O, reason: collision with root package name */
    private v f7334O;

    /* renamed from: P, reason: collision with root package name */
    private long f7335P;

    /* renamed from: Q, reason: collision with root package name */
    private long f7336Q;

    /* renamed from: R, reason: collision with root package name */
    private ByteBuffer f7337R;

    /* renamed from: S, reason: collision with root package name */
    private int f7338S;

    /* renamed from: T, reason: collision with root package name */
    private int f7339T;

    /* renamed from: U, reason: collision with root package name */
    private long f7340U;

    /* renamed from: V, reason: collision with root package name */
    private long f7341V;

    /* renamed from: W, reason: collision with root package name */
    private int f7342W;

    /* renamed from: X, reason: collision with root package name */
    private long f7343X;
    private long Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f7344Z;
    private int aa;
    private long ab;
    private float ac;
    private com.anythink.basead.exoplayer.b.f[] ad;
    private ByteBuffer[] ae;
    private ByteBuffer af;
    private ByteBuffer ag;
    private byte[] ah;
    private int ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private int am;
    private boolean an;
    private long ao;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.b.c f7345q;

    /* renamed from: r, reason: collision with root package name */
    private final a f7346r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f7347s;

    /* renamed from: t, reason: collision with root package name */
    private final k f7348t;

    /* renamed from: u, reason: collision with root package name */
    private final u f7349u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.b.f[] f7350v;

    /* renamed from: w, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.b.f[] f7351w;

    /* renamed from: x, reason: collision with root package name */
    private final ConditionVariable f7352x;

    /* renamed from: y, reason: collision with root package name */
    private final j f7353y;

    /* renamed from: z, reason: collision with root package name */
    private final ArrayDeque<d> f7354z;

    public interface a {
        long a(long j6);

        v a(v vVar);

        com.anythink.basead.exoplayer.b.f[] a();

        long b();
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.b.f[] f7359a;

        /* renamed from: b, reason: collision with root package name */
        private final q f7360b;

        /* renamed from: c, reason: collision with root package name */
        private final t f7361c;

        public b(com.anythink.basead.exoplayer.b.f... fVarArr) {
            com.anythink.basead.exoplayer.b.f[] fVarArr2 = (com.anythink.basead.exoplayer.b.f[]) Arrays.copyOf(fVarArr, fVarArr.length + 2);
            this.f7359a = fVarArr2;
            q qVar = new q();
            this.f7360b = qVar;
            t tVar = new t();
            this.f7361c = tVar;
            fVarArr2[fVarArr.length] = qVar;
            fVarArr2[fVarArr.length + 1] = tVar;
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final com.anythink.basead.exoplayer.b.f[] a() {
            return this.f7359a;
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final long b() {
            return this.f7360b.j();
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final v a(v vVar) {
            this.f7360b.a(vVar.f9547d);
            return new v(this.f7361c.a(vVar.f9545b), this.f7361c.b(vVar.f9546c), vVar.f9547d);
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final long a(long j6) {
            return this.f7361c.a(j6);
        }
    }

    public static final class c extends RuntimeException {
        public /* synthetic */ c(String str, byte b9) {
            this(str);
        }

        private c(String str) {
            super(str);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final v f7362a;

        /* renamed from: b, reason: collision with root package name */
        private final long f7363b;

        /* renamed from: c, reason: collision with root package name */
        private final long f7364c;

        public /* synthetic */ d(v vVar, long j6, long j9, byte b9) {
            this(vVar, j6, j9);
        }

        private d(v vVar, long j6, long j9) {
            this.f7362a = vVar;
            this.f7363b = j6;
            this.f7364c = j9;
        }
    }

    public final class e implements j.a {
        private e() {
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void a(long j6, long j9, long j10, long j11) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j6);
            sb.append(", ");
            sb.append(j9);
            com.IceFishing.LiveIceFishing.k.z(sb, ", ", j10, ", ");
            sb.append(j11);
            sb.append(", ");
            sb.append(l.this.r());
            sb.append(", ");
            sb.append(l.this.s());
            String sb2 = sb.toString();
            if (l.f7308c) {
                throw new c(sb2, (byte) 0);
            }
            Log.w(l.f7317m, sb2);
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void b(long j6, long j9, long j10, long j11) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j6);
            sb.append(", ");
            sb.append(j9);
            com.IceFishing.LiveIceFishing.k.z(sb, ", ", j10, ", ");
            sb.append(j11);
            sb.append(", ");
            sb.append(l.this.r());
            sb.append(", ");
            sb.append(l.this.s());
            String sb2 = sb.toString();
            if (l.f7308c) {
                throw new c(sb2, (byte) 0);
            }
            Log.w(l.f7317m, sb2);
        }

        public /* synthetic */ e(l lVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void a(long j6) {
            Log.w(l.f7317m, "Ignoring impossibly large audio latency: ".concat(String.valueOf(j6)));
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void a(int i, long j6) {
            if (l.this.f7321A != null) {
                l.this.f7321A.a(i, j6, SystemClock.elapsedRealtime() - l.this.ao);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public l(com.anythink.basead.exoplayer.b.c cVar, com.anythink.basead.exoplayer.b.f[] fVarArr) {
        this(cVar, fVarArr, (byte) 0);
    }

    private void k() {
        ArrayList arrayList = new ArrayList();
        for (com.anythink.basead.exoplayer.b.f fVar : v()) {
            if (fVar.a()) {
                arrayList.add(fVar);
            } else {
                fVar.h();
            }
        }
        int size = arrayList.size();
        this.ad = (com.anythink.basead.exoplayer.b.f[]) arrayList.toArray(new com.anythink.basead.exoplayer.b.f[size]);
        this.ae = new ByteBuffer[size];
        l();
    }

    private void l() {
        int i4 = 0;
        while (true) {
            com.anythink.basead.exoplayer.b.f[] fVarArr = this.ad;
            if (i4 >= fVarArr.length) {
                return;
            }
            com.anythink.basead.exoplayer.b.f fVar = fVarArr[i4];
            fVar.h();
            this.ae[i4] = fVar.f();
            i4++;
        }
    }

    private void m() {
        this.f7352x.block();
        AudioTrack t6 = t();
        this.f7323C = t6;
        int audioSessionId = t6.getAudioSessionId();
        if (f7307b && af.f9132a < 21) {
            AudioTrack audioTrack = this.f7322B;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                p();
            }
            if (this.f7322B == null) {
                this.f7322B = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
            }
        }
        if (this.am != audioSessionId) {
            this.am = audioSessionId;
            h.c cVar = this.f7321A;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        this.f7334O = this.f7331L ? this.f7346r.a(this.f7334O) : v.f9544a;
        k();
        this.f7353y.a(this.f7323C, this.f7329I, this.f7342W, this.f7332M);
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean n() {
        boolean z6;
        int i4;
        com.anythink.basead.exoplayer.b.f[] fVarArr;
        if (this.aj == -1) {
            this.aj = this.f7330K ? 0 : this.ad.length;
            z6 = true;
            i4 = this.aj;
            fVarArr = this.ad;
            if (i4 < fVarArr.length) {
                com.anythink.basead.exoplayer.b.f fVar = fVarArr[i4];
                if (z6) {
                    fVar.e();
                }
                a(com.anythink.basead.exoplayer.b.f7168b);
                if (!fVar.g()) {
                    return false;
                }
                this.aj++;
                z6 = true;
                i4 = this.aj;
                fVarArr = this.ad;
                if (i4 < fVarArr.length) {
                    ByteBuffer byteBuffer = this.ag;
                    if (byteBuffer != null) {
                        b(byteBuffer, com.anythink.basead.exoplayer.b.f7168b);
                        if (this.ag != null) {
                            return false;
                        }
                    }
                    this.aj = -1;
                    return true;
                }
            }
        } else {
            z6 = false;
            i4 = this.aj;
            fVarArr = this.ad;
            if (i4 < fVarArr.length) {
            }
        }
    }

    private void o() {
        if (q()) {
            if (af.f9132a >= 21) {
                this.f7323C.setVolume(this.ac);
                return;
            }
            AudioTrack audioTrack = this.f7323C;
            float f2 = this.ac;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    private void p() {
        final AudioTrack audioTrack = this.f7322B;
        if (audioTrack == null) {
            return;
        }
        this.f7322B = null;
        new Thread() { // from class: com.anythink.basead.exoplayer.b.l.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                audioTrack.release();
            }
        }.start();
    }

    private boolean q() {
        return this.f7323C != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        return this.f7324D ? this.f7340U / this.f7339T : this.f7341V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long s() {
        return this.f7324D ? this.f7343X / this.f7342W : this.Y;
    }

    private AudioTrack t() {
        AudioTrack audioTrack;
        if (af.f9132a >= 21) {
            AudioAttributes build = this.an ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.J.a();
            AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f7328H).setEncoding(this.f7329I).setSampleRate(this.f7327G).build();
            int i4 = this.am;
            if (i4 == 0) {
                i4 = 0;
            }
            audioTrack = new AudioTrack(build, build2, this.f7332M, 1, i4);
        } else {
            int f2 = af.f(this.J.f7213d);
            audioTrack = this.am == 0 ? new AudioTrack(f2, this.f7327G, this.f7328H, this.f7329I, this.f7332M, 1) : new AudioTrack(f2, this.f7327G, this.f7328H, this.f7329I, this.f7332M, 1, this.am);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new h.b(state, this.f7327G, this.f7328H, this.f7332M);
    }

    private AudioTrack u() {
        AudioAttributes build = this.an ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.J.a();
        AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f7328H).setEncoding(this.f7329I).setSampleRate(this.f7327G).build();
        int i4 = this.am;
        if (i4 == 0) {
            i4 = 0;
        }
        return new AudioTrack(build, build2, this.f7332M, 1, i4);
    }

    private com.anythink.basead.exoplayer.b.f[] v() {
        return this.f7325E ? this.f7351w : this.f7350v;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final v f() {
        return this.f7334O;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void g() {
        if (this.an) {
            this.an = false;
            this.am = 0;
            i();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void h() {
        this.al = false;
        if (q() && this.f7353y.c()) {
            this.f7323C.pause();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void i() {
        if (q()) {
            this.f7340U = 0L;
            this.f7341V = 0L;
            this.f7343X = 0L;
            this.Y = 0L;
            this.f7344Z = 0;
            v vVar = this.f7333N;
            if (vVar != null) {
                this.f7334O = vVar;
                this.f7333N = null;
            } else if (!this.f7354z.isEmpty()) {
                this.f7334O = this.f7354z.getLast().f7362a;
            }
            this.f7354z.clear();
            this.f7335P = 0L;
            this.f7336Q = 0L;
            this.af = null;
            this.ag = null;
            l();
            this.ak = false;
            this.aj = -1;
            this.f7337R = null;
            this.f7338S = 0;
            this.aa = 0;
            if (this.f7353y.b()) {
                this.f7323C.pause();
            }
            final AudioTrack audioTrack = this.f7323C;
            this.f7323C = null;
            this.f7353y.d();
            this.f7352x.close();
            new Thread() { // from class: com.anythink.basead.exoplayer.b.l.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        l.this.f7352x.open();
                    }
                }
            }.start();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void j() {
        i();
        p();
        for (com.anythink.basead.exoplayer.b.f fVar : this.f7350v) {
            fVar.i();
        }
        for (com.anythink.basead.exoplayer.b.f fVar2 : this.f7351w) {
            fVar2.i();
        }
        this.am = 0;
        this.al = false;
    }

    private l(com.anythink.basead.exoplayer.b.c cVar, com.anythink.basead.exoplayer.b.f[] fVarArr, byte b9) {
        this(cVar, new b(fVarArr));
    }

    private long f(long j6) {
        return (j6 * this.f7327G) / 1000000;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void a(h.c cVar) {
        this.f7321A = cVar;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void b() {
        if (this.aa == 1) {
            this.aa = 2;
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void c() {
        if (!this.ak && q() && n()) {
            this.f7353y.d(s());
            this.f7323C.stop();
            this.f7338S = 0;
            this.ak = true;
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final boolean d() {
        if (q()) {
            return this.ak && !e();
        }
        return true;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final boolean e() {
        return q() && this.f7353y.e(s());
    }

    private l(com.anythink.basead.exoplayer.b.c cVar, a aVar) {
        this.f7345q = cVar;
        this.f7346r = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
        this.f7347s = false;
        this.f7352x = new ConditionVariable(true);
        this.f7353y = new j(new e(this, (byte) 0));
        k kVar = new k();
        this.f7348t = kVar;
        u uVar = new u();
        this.f7349u = uVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p(), kVar, uVar);
        Collections.addAll(arrayList, aVar.a());
        this.f7350v = (com.anythink.basead.exoplayer.b.f[]) arrayList.toArray(new com.anythink.basead.exoplayer.b.f[arrayList.size()]);
        this.f7351w = new com.anythink.basead.exoplayer.b.f[]{new n()};
        this.ac = 1.0f;
        this.aa = 0;
        this.J = com.anythink.basead.exoplayer.b.b.f7210a;
        this.am = 0;
        this.f7334O = v.f9544a;
        this.aj = -1;
        this.ad = new com.anythink.basead.exoplayer.b.f[0];
        this.ae = new ByteBuffer[0];
        this.f7354z = new ArrayDeque<>();
    }

    private long d(long j6) {
        return (j6 * 1000000) / this.f7326F;
    }

    private long e(long j6) {
        return (j6 * 1000000) / this.f7327G;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final boolean a(int i4) {
        if (af.b(i4)) {
            return i4 != 4 || af.f9132a >= 21;
        }
        com.anythink.basead.exoplayer.b.c cVar = this.f7345q;
        return cVar != null && cVar.a(i4);
    }

    private void b(ByteBuffer byteBuffer, long j6) {
        l lVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.ag;
            int i4 = 0;
            if (byteBuffer2 != null) {
                com.anythink.basead.exoplayer.k.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.ag = byteBuffer;
                if (af.f9132a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.ah;
                    if (bArr == null || bArr.length < remaining) {
                        this.ah = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.ah, 0, remaining);
                    byteBuffer.position(position);
                    this.ai = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (af.f9132a < 21) {
                int b9 = this.f7353y.b(this.f7343X);
                if (b9 > 0) {
                    i4 = this.f7323C.write(this.ah, this.ai, Math.min(remaining2, b9));
                    if (i4 > 0) {
                        this.ai += i4;
                        byteBuffer.position(byteBuffer.position() + i4);
                    }
                }
                lVar = this;
            } else if (this.an) {
                com.anythink.basead.exoplayer.k.a.b(j6 != com.anythink.basead.exoplayer.b.f7168b);
                lVar = this;
                i4 = lVar.a(this.f7323C, byteBuffer, remaining2, j6);
            } else {
                lVar = this;
                i4 = lVar.f7323C.write(byteBuffer, remaining2, 1);
            }
            lVar.ao = SystemClock.elapsedRealtime();
            if (i4 >= 0) {
                boolean z6 = lVar.f7324D;
                if (z6) {
                    lVar.f7343X += i4;
                }
                if (i4 == remaining2) {
                    if (!z6) {
                        lVar.Y += lVar.f7344Z;
                    }
                    lVar.ag = null;
                    return;
                }
                return;
            }
            throw new h.d(i4);
        }
    }

    private static AudioTrack d(int i4) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i4);
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final long a(boolean z6) {
        long j6;
        long a9;
        long j9;
        if (!q() || this.aa == 0) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f7353y.a(z6), e(s()));
        long j10 = this.ab;
        d dVar = null;
        while (!this.f7354z.isEmpty() && min >= this.f7354z.getFirst().f7364c) {
            dVar = this.f7354z.remove();
        }
        if (dVar != null) {
            this.f7334O = dVar.f7362a;
            this.f7336Q = dVar.f7364c;
            this.f7335P = dVar.f7363b - this.ab;
        }
        if (this.f7334O.f9545b == 1.0f) {
            j9 = (min + this.f7335P) - this.f7336Q;
        } else {
            if (this.f7354z.isEmpty()) {
                j6 = this.f7335P;
                a9 = this.f7346r.a(min - this.f7336Q);
            } else {
                j6 = this.f7335P;
                a9 = af.a(min - this.f7336Q, this.f7334O.f9545b);
            }
            j9 = a9 + j6;
        }
        return j9 + e(this.f7346r.b()) + j10;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void c(int i4) {
        com.anythink.basead.exoplayer.k.a.b(af.f9132a >= 21);
        if (this.an && this.am == i4) {
            return;
        }
        this.an = true;
        this.am = i4;
        i();
    }

    private long c(long j6) {
        return j6 + e(this.f7346r.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @Override // com.anythink.basead.exoplayer.b.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i4, int i6, int i9, int[] iArr, int i10, int i11) {
        int i12;
        boolean z6;
        int i13;
        boolean z9;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f7326F = i9;
        this.f7324D = af.b(i4);
        this.f7325E = this.f7347s && a(1073741824) && af.c(i4);
        if (this.f7324D) {
            this.f7339T = af.b(i4, i6);
        }
        int i18 = 4;
        if (this.f7324D) {
            i12 = i4;
            if (i12 != 4) {
                z6 = true;
                this.f7331L = (z6 || this.f7325E) ? false : true;
                if (z6) {
                    i13 = i9;
                    z9 = false;
                    i14 = i6;
                } else {
                    this.f7349u.a(i10, i11);
                    this.f7348t.a(iArr);
                    i13 = i9;
                    z9 = false;
                    i14 = i6;
                    for (com.anythink.basead.exoplayer.b.f fVar : v()) {
                        try {
                            z9 |= fVar.a(i13, i14, i12);
                            if (fVar.a()) {
                                i14 = fVar.b();
                                i13 = fVar.d();
                                i12 = fVar.c();
                            }
                        } catch (f.a e9) {
                            throw new h.a(e9);
                        }
                    }
                }
                i15 = 252;
                switch (i14) {
                    case 1:
                        break;
                    case 2:
                        i18 = 12;
                        break;
                    case 3:
                        i18 = 28;
                        break;
                    case 4:
                        i18 = BaseATView.a.f10553C;
                        break;
                    case 5:
                        i18 = 220;
                        break;
                    case 6:
                        i18 = 252;
                        break;
                    case 7:
                        i18 = 1276;
                        break;
                    case 8:
                        i18 = com.anythink.basead.exoplayer.b.f7145C;
                        break;
                    default:
                        throw new h.a("Unsupported channel count: ".concat(String.valueOf(i14)));
                }
                i16 = af.f9132a;
                if (i16 <= 23 && "foster".equals(af.f9133b) && "NVIDIA".equals(af.f9134c)) {
                    if (i14 != 3 && i14 != 5) {
                        if (i14 == 7) {
                            i15 = com.anythink.basead.exoplayer.b.f7145C;
                        }
                    }
                    i17 = (i16 <= 25 || !"fugu".equals(af.f9133b) || this.f7324D || i14 != 1) ? i15 : 12;
                    if (z9 && q() && this.f7329I == i12 && this.f7327G == i13 && this.f7328H == i17) {
                        return;
                    }
                    i();
                    this.f7330K = z6;
                    this.f7327G = i13;
                    this.f7328H = i17;
                    this.f7329I = i12;
                    this.f7342W = !this.f7324D ? af.b(i12, i14) : -1;
                    if (!this.f7324D) {
                        int minBufferSize = AudioTrack.getMinBufferSize(i13, i17, this.f7329I);
                        com.anythink.basead.exoplayer.k.a.b(minBufferSize != -2);
                        this.f7332M = af.a(minBufferSize * 4, ((int) f(250000L)) * this.f7342W, (int) Math.max(minBufferSize, f(f7310e) * this.f7342W));
                        return;
                    }
                    int i19 = this.f7329I;
                    if (i19 == 5 || i19 == 6) {
                        this.f7332M = com.anythink.basead.exoplayer.j.a.b.f8807a;
                        return;
                    } else if (i19 == 7) {
                        this.f7332M = 49152;
                        return;
                    } else {
                        this.f7332M = 294912;
                        return;
                    }
                }
                i15 = i18;
                if (i16 <= 25) {
                }
                if (z9) {
                }
                i();
                this.f7330K = z6;
                this.f7327G = i13;
                this.f7328H = i17;
                this.f7329I = i12;
                this.f7342W = !this.f7324D ? af.b(i12, i14) : -1;
                if (!this.f7324D) {
                }
            }
        } else {
            i12 = i4;
        }
        z6 = false;
        this.f7331L = (z6 || this.f7325E) ? false : true;
        if (z6) {
        }
        i15 = 252;
        switch (i14) {
        }
        i16 = af.f9132a;
        if (i16 <= 23) {
            if (i14 != 3) {
                if (i14 == 7) {
                }
            }
            if (i16 <= 25) {
            }
            if (z9) {
            }
            i();
            this.f7330K = z6;
            this.f7327G = i13;
            this.f7328H = i17;
            this.f7329I = i12;
            this.f7342W = !this.f7324D ? af.b(i12, i14) : -1;
            if (!this.f7324D) {
            }
        }
        i15 = i18;
        if (i16 <= 25) {
        }
        if (z9) {
        }
        i();
        this.f7330K = z6;
        this.f7327G = i13;
        this.f7328H = i17;
        this.f7329I = i12;
        this.f7342W = !this.f7324D ? af.b(i12, i14) : -1;
        if (!this.f7324D) {
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void b(int i4) {
        if (this.am != i4) {
            this.am = i4;
            i();
        }
    }

    private long b(long j6) {
        d dVar = null;
        while (!this.f7354z.isEmpty() && j6 >= this.f7354z.getFirst().f7364c) {
            dVar = this.f7354z.remove();
        }
        if (dVar != null) {
            this.f7334O = dVar.f7362a;
            this.f7336Q = dVar.f7364c;
            this.f7335P = dVar.f7363b - this.ab;
        }
        if (this.f7334O.f9545b == 1.0f) {
            return (j6 + this.f7335P) - this.f7336Q;
        }
        if (this.f7354z.isEmpty()) {
            return this.f7346r.a(j6 - this.f7336Q) + this.f7335P;
        }
        return af.a(j6 - this.f7336Q, this.f7334O.f9545b) + this.f7335P;
    }

    private static void b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void a() {
        this.al = true;
        if (q()) {
            this.f7353y.a();
            this.f7323C.play();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final boolean a(ByteBuffer byteBuffer, long j6) {
        boolean z6;
        int a9;
        v vVar;
        ByteBuffer byteBuffer2 = this.af;
        com.anythink.basead.exoplayer.k.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!q()) {
            this.f7352x.block();
            AudioTrack t6 = t();
            this.f7323C = t6;
            int audioSessionId = t6.getAudioSessionId();
            if (f7307b && af.f9132a < 21) {
                AudioTrack audioTrack = this.f7322B;
                if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                    p();
                }
                if (this.f7322B == null) {
                    this.f7322B = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
                }
            }
            if (this.am != audioSessionId) {
                this.am = audioSessionId;
                h.c cVar = this.f7321A;
                if (cVar != null) {
                    cVar.a(audioSessionId);
                }
            }
            if (this.f7331L) {
                vVar = this.f7346r.a(this.f7334O);
            } else {
                vVar = v.f9544a;
            }
            this.f7334O = vVar;
            k();
            this.f7353y.a(this.f7323C, this.f7329I, this.f7342W, this.f7332M);
            o();
            if (this.al) {
                a();
            }
        }
        if (!this.f7353y.a(s())) {
            return false;
        }
        if (this.af != null) {
            z6 = false;
        } else {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.f7324D && this.f7344Z == 0) {
                int i4 = this.f7329I;
                if (i4 == 7 || i4 == 8) {
                    a9 = m.a(byteBuffer);
                } else if (i4 == 5) {
                    a9 = com.anythink.basead.exoplayer.b.a.a();
                } else if (i4 == 6) {
                    a9 = com.anythink.basead.exoplayer.b.a.a(byteBuffer);
                } else if (i4 == 14) {
                    int b9 = com.anythink.basead.exoplayer.b.a.b(byteBuffer);
                    a9 = b9 == -1 ? 0 : com.anythink.basead.exoplayer.b.a.a(byteBuffer, b9) * 16;
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i4)));
                }
                this.f7344Z = a9;
                if (a9 == 0) {
                    return true;
                }
            }
            if (this.f7333N == null) {
                z6 = false;
            } else {
                if (!n()) {
                    return false;
                }
                v vVar2 = this.f7333N;
                this.f7333N = null;
                z6 = false;
                this.f7354z.add(new d(this.f7346r.a(vVar2), Math.max(0L, j6), e(s()), (byte) 0));
                k();
            }
            if (this.aa == 0) {
                this.ab = Math.max(0L, j6);
                this.aa = 1;
            } else {
                long r9 = ((r() * 1000000) / this.f7326F) + this.ab;
                if (this.aa == 1 && Math.abs(r9 - j6) > 200000) {
                    Log.e(f7317m, "Discontinuity detected [expected " + r9 + ", got " + j6 + "]");
                    this.aa = 2;
                }
                if (this.aa == 2) {
                    this.ab = (j6 - r9) + this.ab;
                    this.aa = 1;
                    h.c cVar2 = this.f7321A;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                }
            }
            if (this.f7324D) {
                this.f7340U += byteBuffer.remaining();
            } else {
                this.f7341V += this.f7344Z;
            }
            this.af = byteBuffer;
        }
        if (this.f7330K) {
            a(j6);
        } else {
            b(this.af, j6);
        }
        if (!this.af.hasRemaining()) {
            this.af = null;
            return true;
        }
        if (!this.f7353y.c(s())) {
            return z6;
        }
        Log.w(f7317m, "Resetting stalled audio track");
        i();
        return true;
    }

    private void a(long j6) {
        ByteBuffer byteBuffer;
        int length = this.ad.length;
        int i4 = length;
        while (i4 >= 0) {
            if (i4 > 0) {
                byteBuffer = this.ae[i4 - 1];
            } else {
                byteBuffer = this.af;
                if (byteBuffer == null) {
                    byteBuffer = com.anythink.basead.exoplayer.b.f.f7226a;
                }
            }
            if (i4 == length) {
                b(byteBuffer, j6);
            } else {
                com.anythink.basead.exoplayer.b.f fVar = this.ad[i4];
                fVar.a(byteBuffer);
                ByteBuffer f2 = fVar.f();
                this.ae[i4] = f2;
                if (f2.hasRemaining()) {
                    i4++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i4--;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final v a(v vVar) {
        if (q() && !this.f7331L) {
            v vVar2 = v.f9544a;
            this.f7334O = vVar2;
            return vVar2;
        }
        v vVar3 = this.f7333N;
        if (vVar3 == null) {
            if (!this.f7354z.isEmpty()) {
                vVar3 = this.f7354z.getLast().f7362a;
            } else {
                vVar3 = this.f7334O;
            }
        }
        if (!vVar.equals(vVar3)) {
            if (q()) {
                this.f7333N = vVar;
            } else {
                this.f7334O = this.f7346r.a(vVar);
            }
        }
        return this.f7334O;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void a(com.anythink.basead.exoplayer.b.b bVar) {
        if (this.J.equals(bVar)) {
            return;
        }
        this.J = bVar;
        if (this.an) {
            return;
        }
        i();
        this.am = 0;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void a(float f2) {
        if (this.ac != f2) {
            this.ac = f2;
            o();
        }
    }

    private static int a(int i4, ByteBuffer byteBuffer) {
        if (i4 == 7 || i4 == 8) {
            return m.a(byteBuffer);
        }
        if (i4 == 5) {
            return com.anythink.basead.exoplayer.b.a.a();
        }
        if (i4 == 6) {
            return com.anythink.basead.exoplayer.b.a.a(byteBuffer);
        }
        if (i4 == 14) {
            int b9 = com.anythink.basead.exoplayer.b.a.b(byteBuffer);
            if (b9 == -1) {
                return 0;
            }
            return com.anythink.basead.exoplayer.b.a.a(byteBuffer, b9) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i4)));
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i4) {
        return audioTrack.write(byteBuffer, i4, 1);
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i4, long j6) {
        if (this.f7337R == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f7337R = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f7337R.putInt(1431633921);
        }
        if (this.f7338S == 0) {
            this.f7337R.putInt(4, i4);
            this.f7337R.putLong(8, j6 * 1000);
            this.f7337R.position(0);
            this.f7338S = i4;
        }
        int remaining = this.f7337R.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f7337R, remaining, 1);
            if (write < 0) {
                this.f7338S = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, i4, 1);
        if (write2 < 0) {
            this.f7338S = 0;
            return write2;
        }
        this.f7338S -= write2;
        return write2;
    }

    private static void a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }
}
