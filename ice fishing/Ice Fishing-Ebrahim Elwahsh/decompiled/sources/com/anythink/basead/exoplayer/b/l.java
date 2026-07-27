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
import com.anythink.basead.exoplayer.k.C0544a;
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
    public static boolean f6678b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f6679c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final long f6680d = 250000;

    /* renamed from: e, reason: collision with root package name */
    private static final long f6681e = 750000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f6682f = 250000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6683g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6684h = -2;
    private static final int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f6685j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f6686k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f6687l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final String f6688m = "AudioTrack";

    /* renamed from: n, reason: collision with root package name */
    private static final int f6689n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f6690o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f6691p = 2;

    /* renamed from: A, reason: collision with root package name */
    private h.c f6692A;

    /* renamed from: B, reason: collision with root package name */
    private AudioTrack f6693B;

    /* renamed from: C, reason: collision with root package name */
    private AudioTrack f6694C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f6695D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f6696E;

    /* renamed from: F, reason: collision with root package name */
    private int f6697F;

    /* renamed from: G, reason: collision with root package name */
    private int f6698G;

    /* renamed from: H, reason: collision with root package name */
    private int f6699H;

    /* renamed from: I, reason: collision with root package name */
    private int f6700I;
    private com.anythink.basead.exoplayer.b.b J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6701K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f6702L;

    /* renamed from: M, reason: collision with root package name */
    private int f6703M;

    /* renamed from: N, reason: collision with root package name */
    private v f6704N;

    /* renamed from: O, reason: collision with root package name */
    private v f6705O;

    /* renamed from: P, reason: collision with root package name */
    private long f6706P;

    /* renamed from: Q, reason: collision with root package name */
    private long f6707Q;

    /* renamed from: R, reason: collision with root package name */
    private ByteBuffer f6708R;

    /* renamed from: S, reason: collision with root package name */
    private int f6709S;

    /* renamed from: T, reason: collision with root package name */
    private int f6710T;

    /* renamed from: U, reason: collision with root package name */
    private long f6711U;

    /* renamed from: V, reason: collision with root package name */
    private long f6712V;

    /* renamed from: W, reason: collision with root package name */
    private int f6713W;

    /* renamed from: X, reason: collision with root package name */
    private long f6714X;
    private long Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f6715Z;
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
    private final com.anythink.basead.exoplayer.b.c f6716q;

    /* renamed from: r, reason: collision with root package name */
    private final a f6717r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f6718s;

    /* renamed from: t, reason: collision with root package name */
    private final k f6719t;

    /* renamed from: u, reason: collision with root package name */
    private final u f6720u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.b.f[] f6721v;

    /* renamed from: w, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.b.f[] f6722w;

    /* renamed from: x, reason: collision with root package name */
    private final ConditionVariable f6723x;

    /* renamed from: y, reason: collision with root package name */
    private final j f6724y;

    /* renamed from: z, reason: collision with root package name */
    private final ArrayDeque<d> f6725z;

    public interface a {
        long a(long j9);

        v a(v vVar);

        com.anythink.basead.exoplayer.b.f[] a();

        long b();
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.b.f[] f6730a;

        /* renamed from: b, reason: collision with root package name */
        private final q f6731b;

        /* renamed from: c, reason: collision with root package name */
        private final t f6732c;

        public b(com.anythink.basead.exoplayer.b.f... fVarArr) {
            com.anythink.basead.exoplayer.b.f[] fVarArr2 = (com.anythink.basead.exoplayer.b.f[]) Arrays.copyOf(fVarArr, fVarArr.length + 2);
            this.f6730a = fVarArr2;
            q qVar = new q();
            this.f6731b = qVar;
            t tVar = new t();
            this.f6732c = tVar;
            fVarArr2[fVarArr.length] = qVar;
            fVarArr2[fVarArr.length + 1] = tVar;
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final com.anythink.basead.exoplayer.b.f[] a() {
            return this.f6730a;
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final long b() {
            return this.f6731b.j();
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final v a(v vVar) {
            this.f6731b.a(vVar.f8918d);
            return new v(this.f6732c.a(vVar.f8916b), this.f6732c.b(vVar.f8917c), vVar.f8918d);
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final long a(long j9) {
            return this.f6732c.a(j9);
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
        private final v f6733a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6734b;

        /* renamed from: c, reason: collision with root package name */
        private final long f6735c;

        public /* synthetic */ d(v vVar, long j9, long j10, byte b9) {
            this(vVar, j9, j10);
        }

        private d(v vVar, long j9, long j10) {
            this.f6733a = vVar;
            this.f6734b = j9;
            this.f6735c = j10;
        }
    }

    public final class e implements j.a {
        private e() {
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void a(long j9, long j10, long j11, long j12) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j9);
            sb.append(", ");
            sb.append(j10);
            com.anythink.basead.b.c.i.x(sb, ", ", j11, ", ");
            sb.append(j12);
            sb.append(", ");
            sb.append(l.this.r());
            sb.append(", ");
            sb.append(l.this.s());
            String sb2 = sb.toString();
            if (l.f6679c) {
                throw new c(sb2, (byte) 0);
            }
            Log.w(l.f6688m, sb2);
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void b(long j9, long j10, long j11, long j12) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j9);
            sb.append(", ");
            sb.append(j10);
            com.anythink.basead.b.c.i.x(sb, ", ", j11, ", ");
            sb.append(j12);
            sb.append(", ");
            sb.append(l.this.r());
            sb.append(", ");
            sb.append(l.this.s());
            String sb2 = sb.toString();
            if (l.f6679c) {
                throw new c(sb2, (byte) 0);
            }
            Log.w(l.f6688m, sb2);
        }

        public /* synthetic */ e(l lVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void a(long j9) {
            Log.w(l.f6688m, "Ignoring impossibly large audio latency: ".concat(String.valueOf(j9)));
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void a(int i, long j9) {
            if (l.this.f6692A != null) {
                l.this.f6692A.a(i, j9, SystemClock.elapsedRealtime() - l.this.ao);
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
        this.f6723x.block();
        AudioTrack t9 = t();
        this.f6694C = t9;
        int audioSessionId = t9.getAudioSessionId();
        if (f6678b && af.f8503a < 21) {
            AudioTrack audioTrack = this.f6693B;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                p();
            }
            if (this.f6693B == null) {
                this.f6693B = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
            }
        }
        if (this.am != audioSessionId) {
            this.am = audioSessionId;
            h.c cVar = this.f6692A;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        this.f6705O = this.f6702L ? this.f6717r.a(this.f6705O) : v.f8915a;
        k();
        this.f6724y.a(this.f6694C, this.f6700I, this.f6713W, this.f6703M);
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean n() {
        boolean z8;
        int i4;
        com.anythink.basead.exoplayer.b.f[] fVarArr;
        if (this.aj == -1) {
            this.aj = this.f6701K ? 0 : this.ad.length;
            z8 = true;
            i4 = this.aj;
            fVarArr = this.ad;
            if (i4 < fVarArr.length) {
                com.anythink.basead.exoplayer.b.f fVar = fVarArr[i4];
                if (z8) {
                    fVar.e();
                }
                a(com.anythink.basead.exoplayer.b.f6539b);
                if (!fVar.g()) {
                    return false;
                }
                this.aj++;
                z8 = true;
                i4 = this.aj;
                fVarArr = this.ad;
                if (i4 < fVarArr.length) {
                    ByteBuffer byteBuffer = this.ag;
                    if (byteBuffer != null) {
                        b(byteBuffer, com.anythink.basead.exoplayer.b.f6539b);
                        if (this.ag != null) {
                            return false;
                        }
                    }
                    this.aj = -1;
                    return true;
                }
            }
        } else {
            z8 = false;
            i4 = this.aj;
            fVarArr = this.ad;
            if (i4 < fVarArr.length) {
            }
        }
    }

    private void o() {
        if (q()) {
            if (af.f8503a >= 21) {
                this.f6694C.setVolume(this.ac);
                return;
            }
            AudioTrack audioTrack = this.f6694C;
            float f6 = this.ac;
            audioTrack.setStereoVolume(f6, f6);
        }
    }

    private void p() {
        final AudioTrack audioTrack = this.f6693B;
        if (audioTrack == null) {
            return;
        }
        this.f6693B = null;
        new Thread() { // from class: com.anythink.basead.exoplayer.b.l.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                audioTrack.release();
            }
        }.start();
    }

    private boolean q() {
        return this.f6694C != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        return this.f6695D ? this.f6711U / this.f6710T : this.f6712V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long s() {
        return this.f6695D ? this.f6714X / this.f6713W : this.Y;
    }

    private AudioTrack t() {
        AudioTrack audioTrack;
        if (af.f8503a >= 21) {
            AudioAttributes build = this.an ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.J.a();
            AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f6699H).setEncoding(this.f6700I).setSampleRate(this.f6698G).build();
            int i4 = this.am;
            if (i4 == 0) {
                i4 = 0;
            }
            audioTrack = new AudioTrack(build, build2, this.f6703M, 1, i4);
        } else {
            int f6 = af.f(this.J.f6584d);
            audioTrack = this.am == 0 ? new AudioTrack(f6, this.f6698G, this.f6699H, this.f6700I, this.f6703M, 1) : new AudioTrack(f6, this.f6698G, this.f6699H, this.f6700I, this.f6703M, 1, this.am);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new h.b(state, this.f6698G, this.f6699H, this.f6703M);
    }

    private AudioTrack u() {
        AudioAttributes build = this.an ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.J.a();
        AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f6699H).setEncoding(this.f6700I).setSampleRate(this.f6698G).build();
        int i4 = this.am;
        if (i4 == 0) {
            i4 = 0;
        }
        return new AudioTrack(build, build2, this.f6703M, 1, i4);
    }

    private com.anythink.basead.exoplayer.b.f[] v() {
        return this.f6696E ? this.f6722w : this.f6721v;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final v f() {
        return this.f6705O;
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
        if (q() && this.f6724y.c()) {
            this.f6694C.pause();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void i() {
        if (q()) {
            this.f6711U = 0L;
            this.f6712V = 0L;
            this.f6714X = 0L;
            this.Y = 0L;
            this.f6715Z = 0;
            v vVar = this.f6704N;
            if (vVar != null) {
                this.f6705O = vVar;
                this.f6704N = null;
            } else if (!this.f6725z.isEmpty()) {
                this.f6705O = this.f6725z.getLast().f6733a;
            }
            this.f6725z.clear();
            this.f6706P = 0L;
            this.f6707Q = 0L;
            this.af = null;
            this.ag = null;
            l();
            this.ak = false;
            this.aj = -1;
            this.f6708R = null;
            this.f6709S = 0;
            this.aa = 0;
            if (this.f6724y.b()) {
                this.f6694C.pause();
            }
            final AudioTrack audioTrack = this.f6694C;
            this.f6694C = null;
            this.f6724y.d();
            this.f6723x.close();
            new Thread() { // from class: com.anythink.basead.exoplayer.b.l.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        l.this.f6723x.open();
                    }
                }
            }.start();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void j() {
        i();
        p();
        for (com.anythink.basead.exoplayer.b.f fVar : this.f6721v) {
            fVar.i();
        }
        for (com.anythink.basead.exoplayer.b.f fVar2 : this.f6722w) {
            fVar2.i();
        }
        this.am = 0;
        this.al = false;
    }

    private l(com.anythink.basead.exoplayer.b.c cVar, com.anythink.basead.exoplayer.b.f[] fVarArr, byte b9) {
        this(cVar, new b(fVarArr));
    }

    private long f(long j9) {
        return (j9 * this.f6698G) / 1000000;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void a(h.c cVar) {
        this.f6692A = cVar;
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
            this.f6724y.d(s());
            this.f6694C.stop();
            this.f6709S = 0;
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
        return q() && this.f6724y.e(s());
    }

    private l(com.anythink.basead.exoplayer.b.c cVar, a aVar) {
        this.f6716q = cVar;
        this.f6717r = (a) C0544a.a(aVar);
        this.f6718s = false;
        this.f6723x = new ConditionVariable(true);
        this.f6724y = new j(new e(this, (byte) 0));
        k kVar = new k();
        this.f6719t = kVar;
        u uVar = new u();
        this.f6720u = uVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p(), kVar, uVar);
        Collections.addAll(arrayList, aVar.a());
        this.f6721v = (com.anythink.basead.exoplayer.b.f[]) arrayList.toArray(new com.anythink.basead.exoplayer.b.f[arrayList.size()]);
        this.f6722w = new com.anythink.basead.exoplayer.b.f[]{new n()};
        this.ac = 1.0f;
        this.aa = 0;
        this.J = com.anythink.basead.exoplayer.b.b.f6581a;
        this.am = 0;
        this.f6705O = v.f8915a;
        this.aj = -1;
        this.ad = new com.anythink.basead.exoplayer.b.f[0];
        this.ae = new ByteBuffer[0];
        this.f6725z = new ArrayDeque<>();
    }

    private long d(long j9) {
        return (j9 * 1000000) / this.f6697F;
    }

    private long e(long j9) {
        return (j9 * 1000000) / this.f6698G;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final boolean a(int i4) {
        if (af.b(i4)) {
            return i4 != 4 || af.f8503a >= 21;
        }
        com.anythink.basead.exoplayer.b.c cVar = this.f6716q;
        return cVar != null && cVar.a(i4);
    }

    private void b(ByteBuffer byteBuffer, long j9) {
        l lVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.ag;
            int i4 = 0;
            if (byteBuffer2 != null) {
                C0544a.a(byteBuffer2 == byteBuffer);
            } else {
                this.ag = byteBuffer;
                if (af.f8503a < 21) {
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
            if (af.f8503a < 21) {
                int b9 = this.f6724y.b(this.f6714X);
                if (b9 > 0) {
                    i4 = this.f6694C.write(this.ah, this.ai, Math.min(remaining2, b9));
                    if (i4 > 0) {
                        this.ai += i4;
                        byteBuffer.position(byteBuffer.position() + i4);
                    }
                }
                lVar = this;
            } else if (this.an) {
                C0544a.b(j9 != com.anythink.basead.exoplayer.b.f6539b);
                lVar = this;
                i4 = lVar.a(this.f6694C, byteBuffer, remaining2, j9);
            } else {
                lVar = this;
                i4 = lVar.f6694C.write(byteBuffer, remaining2, 1);
            }
            lVar.ao = SystemClock.elapsedRealtime();
            if (i4 >= 0) {
                boolean z8 = lVar.f6695D;
                if (z8) {
                    lVar.f6714X += i4;
                }
                if (i4 == remaining2) {
                    if (!z8) {
                        lVar.Y += lVar.f6715Z;
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
    public final long a(boolean z8) {
        long j9;
        long a9;
        long j10;
        if (!q() || this.aa == 0) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f6724y.a(z8), e(s()));
        long j11 = this.ab;
        d dVar = null;
        while (!this.f6725z.isEmpty() && min >= this.f6725z.getFirst().f6735c) {
            dVar = this.f6725z.remove();
        }
        if (dVar != null) {
            this.f6705O = dVar.f6733a;
            this.f6707Q = dVar.f6735c;
            this.f6706P = dVar.f6734b - this.ab;
        }
        if (this.f6705O.f8916b == 1.0f) {
            j10 = (min + this.f6706P) - this.f6707Q;
        } else {
            if (this.f6725z.isEmpty()) {
                j9 = this.f6706P;
                a9 = this.f6717r.a(min - this.f6707Q);
            } else {
                j9 = this.f6706P;
                a9 = af.a(min - this.f6707Q, this.f6705O.f8916b);
            }
            j10 = a9 + j9;
        }
        return j10 + e(this.f6717r.b()) + j11;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void c(int i4) {
        C0544a.b(af.f8503a >= 21);
        if (this.an && this.am == i4) {
            return;
        }
        this.an = true;
        this.am = i4;
        i();
    }

    private long c(long j9) {
        return j9 + e(this.f6717r.b());
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
    public final void a(int i4, int i9, int i10, int[] iArr, int i11, int i12) {
        int i13;
        boolean z8;
        int i14;
        boolean z9;
        int i15;
        int i16;
        int i17;
        int i18;
        this.f6697F = i10;
        this.f6695D = af.b(i4);
        this.f6696E = this.f6718s && a(1073741824) && af.c(i4);
        if (this.f6695D) {
            this.f6710T = af.b(i4, i9);
        }
        int i19 = 4;
        if (this.f6695D) {
            i13 = i4;
            if (i13 != 4) {
                z8 = true;
                this.f6702L = (z8 || this.f6696E) ? false : true;
                if (z8) {
                    i14 = i10;
                    z9 = false;
                    i15 = i9;
                } else {
                    this.f6720u.a(i11, i12);
                    this.f6719t.a(iArr);
                    i14 = i10;
                    z9 = false;
                    i15 = i9;
                    for (com.anythink.basead.exoplayer.b.f fVar : v()) {
                        try {
                            z9 |= fVar.a(i14, i15, i13);
                            if (fVar.a()) {
                                i15 = fVar.b();
                                i14 = fVar.d();
                                i13 = fVar.c();
                            }
                        } catch (f.a e6) {
                            throw new h.a(e6);
                        }
                    }
                }
                i16 = 252;
                switch (i15) {
                    case 1:
                        break;
                    case 2:
                        i19 = 12;
                        break;
                    case 3:
                        i19 = 28;
                        break;
                    case 4:
                        i19 = BaseATView.a.f9924C;
                        break;
                    case 5:
                        i19 = 220;
                        break;
                    case 6:
                        i19 = 252;
                        break;
                    case 7:
                        i19 = 1276;
                        break;
                    case 8:
                        i19 = com.anythink.basead.exoplayer.b.f6516C;
                        break;
                    default:
                        throw new h.a("Unsupported channel count: ".concat(String.valueOf(i15)));
                }
                i17 = af.f8503a;
                if (i17 <= 23 && "foster".equals(af.f8504b) && "NVIDIA".equals(af.f8505c)) {
                    if (i15 != 3 && i15 != 5) {
                        if (i15 == 7) {
                            i16 = com.anythink.basead.exoplayer.b.f6516C;
                        }
                    }
                    i18 = (i17 <= 25 || !"fugu".equals(af.f8504b) || this.f6695D || i15 != 1) ? i16 : 12;
                    if (z9 && q() && this.f6700I == i13 && this.f6698G == i14 && this.f6699H == i18) {
                        return;
                    }
                    i();
                    this.f6701K = z8;
                    this.f6698G = i14;
                    this.f6699H = i18;
                    this.f6700I = i13;
                    this.f6713W = !this.f6695D ? af.b(i13, i15) : -1;
                    if (!this.f6695D) {
                        int minBufferSize = AudioTrack.getMinBufferSize(i14, i18, this.f6700I);
                        C0544a.b(minBufferSize != -2);
                        this.f6703M = af.a(minBufferSize * 4, ((int) f(250000L)) * this.f6713W, (int) Math.max(minBufferSize, f(f6681e) * this.f6713W));
                        return;
                    }
                    int i20 = this.f6700I;
                    if (i20 == 5 || i20 == 6) {
                        this.f6703M = com.anythink.basead.exoplayer.j.a.b.f8178a;
                        return;
                    } else if (i20 == 7) {
                        this.f6703M = 49152;
                        return;
                    } else {
                        this.f6703M = 294912;
                        return;
                    }
                }
                i16 = i19;
                if (i17 <= 25) {
                }
                if (z9) {
                }
                i();
                this.f6701K = z8;
                this.f6698G = i14;
                this.f6699H = i18;
                this.f6700I = i13;
                this.f6713W = !this.f6695D ? af.b(i13, i15) : -1;
                if (!this.f6695D) {
                }
            }
        } else {
            i13 = i4;
        }
        z8 = false;
        this.f6702L = (z8 || this.f6696E) ? false : true;
        if (z8) {
        }
        i16 = 252;
        switch (i15) {
        }
        i17 = af.f8503a;
        if (i17 <= 23) {
            if (i15 != 3) {
                if (i15 == 7) {
                }
            }
            if (i17 <= 25) {
            }
            if (z9) {
            }
            i();
            this.f6701K = z8;
            this.f6698G = i14;
            this.f6699H = i18;
            this.f6700I = i13;
            this.f6713W = !this.f6695D ? af.b(i13, i15) : -1;
            if (!this.f6695D) {
            }
        }
        i16 = i19;
        if (i17 <= 25) {
        }
        if (z9) {
        }
        i();
        this.f6701K = z8;
        this.f6698G = i14;
        this.f6699H = i18;
        this.f6700I = i13;
        this.f6713W = !this.f6695D ? af.b(i13, i15) : -1;
        if (!this.f6695D) {
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void b(int i4) {
        if (this.am != i4) {
            this.am = i4;
            i();
        }
    }

    private long b(long j9) {
        d dVar = null;
        while (!this.f6725z.isEmpty() && j9 >= this.f6725z.getFirst().f6735c) {
            dVar = this.f6725z.remove();
        }
        if (dVar != null) {
            this.f6705O = dVar.f6733a;
            this.f6707Q = dVar.f6735c;
            this.f6706P = dVar.f6734b - this.ab;
        }
        if (this.f6705O.f8916b == 1.0f) {
            return (j9 + this.f6706P) - this.f6707Q;
        }
        if (this.f6725z.isEmpty()) {
            return this.f6717r.a(j9 - this.f6707Q) + this.f6706P;
        }
        return af.a(j9 - this.f6707Q, this.f6705O.f8916b) + this.f6706P;
    }

    private static void b(AudioTrack audioTrack, float f6) {
        audioTrack.setStereoVolume(f6, f6);
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void a() {
        this.al = true;
        if (q()) {
            this.f6724y.a();
            this.f6694C.play();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final boolean a(ByteBuffer byteBuffer, long j9) {
        boolean z8;
        int a9;
        v vVar;
        ByteBuffer byteBuffer2 = this.af;
        C0544a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!q()) {
            this.f6723x.block();
            AudioTrack t9 = t();
            this.f6694C = t9;
            int audioSessionId = t9.getAudioSessionId();
            if (f6678b && af.f8503a < 21) {
                AudioTrack audioTrack = this.f6693B;
                if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                    p();
                }
                if (this.f6693B == null) {
                    this.f6693B = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
                }
            }
            if (this.am != audioSessionId) {
                this.am = audioSessionId;
                h.c cVar = this.f6692A;
                if (cVar != null) {
                    cVar.a(audioSessionId);
                }
            }
            if (this.f6702L) {
                vVar = this.f6717r.a(this.f6705O);
            } else {
                vVar = v.f8915a;
            }
            this.f6705O = vVar;
            k();
            this.f6724y.a(this.f6694C, this.f6700I, this.f6713W, this.f6703M);
            o();
            if (this.al) {
                a();
            }
        }
        if (!this.f6724y.a(s())) {
            return false;
        }
        if (this.af != null) {
            z8 = false;
        } else {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.f6695D && this.f6715Z == 0) {
                int i4 = this.f6700I;
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
                this.f6715Z = a9;
                if (a9 == 0) {
                    return true;
                }
            }
            if (this.f6704N == null) {
                z8 = false;
            } else {
                if (!n()) {
                    return false;
                }
                v vVar2 = this.f6704N;
                this.f6704N = null;
                z8 = false;
                this.f6725z.add(new d(this.f6717r.a(vVar2), Math.max(0L, j9), e(s()), (byte) 0));
                k();
            }
            if (this.aa == 0) {
                this.ab = Math.max(0L, j9);
                this.aa = 1;
            } else {
                long r9 = ((r() * 1000000) / this.f6697F) + this.ab;
                if (this.aa == 1 && Math.abs(r9 - j9) > 200000) {
                    Log.e(f6688m, "Discontinuity detected [expected " + r9 + ", got " + j9 + "]");
                    this.aa = 2;
                }
                if (this.aa == 2) {
                    this.ab = (j9 - r9) + this.ab;
                    this.aa = 1;
                    h.c cVar2 = this.f6692A;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                }
            }
            if (this.f6695D) {
                this.f6711U += byteBuffer.remaining();
            } else {
                this.f6712V += this.f6715Z;
            }
            this.af = byteBuffer;
        }
        if (this.f6701K) {
            a(j9);
        } else {
            b(this.af, j9);
        }
        if (!this.af.hasRemaining()) {
            this.af = null;
            return true;
        }
        if (!this.f6724y.c(s())) {
            return z8;
        }
        Log.w(f6688m, "Resetting stalled audio track");
        i();
        return true;
    }

    private void a(long j9) {
        ByteBuffer byteBuffer;
        int length = this.ad.length;
        int i4 = length;
        while (i4 >= 0) {
            if (i4 > 0) {
                byteBuffer = this.ae[i4 - 1];
            } else {
                byteBuffer = this.af;
                if (byteBuffer == null) {
                    byteBuffer = com.anythink.basead.exoplayer.b.f.f6597a;
                }
            }
            if (i4 == length) {
                b(byteBuffer, j9);
            } else {
                com.anythink.basead.exoplayer.b.f fVar = this.ad[i4];
                fVar.a(byteBuffer);
                ByteBuffer f6 = fVar.f();
                this.ae[i4] = f6;
                if (f6.hasRemaining()) {
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
        if (q() && !this.f6702L) {
            v vVar2 = v.f8915a;
            this.f6705O = vVar2;
            return vVar2;
        }
        v vVar3 = this.f6704N;
        if (vVar3 == null) {
            if (!this.f6725z.isEmpty()) {
                vVar3 = this.f6725z.getLast().f6733a;
            } else {
                vVar3 = this.f6705O;
            }
        }
        if (!vVar.equals(vVar3)) {
            if (q()) {
                this.f6704N = vVar;
            } else {
                this.f6705O = this.f6717r.a(vVar);
            }
        }
        return this.f6705O;
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
    public final void a(float f6) {
        if (this.ac != f6) {
            this.ac = f6;
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

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i4, long j9) {
        if (this.f6708R == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f6708R = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f6708R.putInt(1431633921);
        }
        if (this.f6709S == 0) {
            this.f6708R.putInt(4, i4);
            this.f6708R.putLong(8, j9 * 1000);
            this.f6708R.position(0);
            this.f6709S = i4;
        }
        int remaining = this.f6708R.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f6708R, remaining, 1);
            if (write < 0) {
                this.f6709S = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, i4, 1);
        if (write2 < 0) {
            this.f6709S = 0;
            return write2;
        }
        this.f6709S -= write2;
        return write2;
    }

    private static void a(AudioTrack audioTrack, float f6) {
        audioTrack.setVolume(f6);
    }
}
