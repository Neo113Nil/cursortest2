package com.anythink.basead.exoplayer.b;

import D.y;
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
    public static boolean f6521b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f6522c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final long f6523d = 250000;

    /* renamed from: e, reason: collision with root package name */
    private static final long f6524e = 750000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f6525f = 250000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6526g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6527h = -2;
    private static final int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f6528j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f6529k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f6530l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final String f6531m = "AudioTrack";

    /* renamed from: n, reason: collision with root package name */
    private static final int f6532n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f6533o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f6534p = 2;

    /* renamed from: A, reason: collision with root package name */
    private h.c f6535A;

    /* renamed from: B, reason: collision with root package name */
    private AudioTrack f6536B;

    /* renamed from: C, reason: collision with root package name */
    private AudioTrack f6537C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f6538D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f6539E;

    /* renamed from: F, reason: collision with root package name */
    private int f6540F;

    /* renamed from: G, reason: collision with root package name */
    private int f6541G;

    /* renamed from: H, reason: collision with root package name */
    private int f6542H;

    /* renamed from: I, reason: collision with root package name */
    private int f6543I;
    private com.anythink.basead.exoplayer.b.b J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6544K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f6545L;

    /* renamed from: M, reason: collision with root package name */
    private int f6546M;

    /* renamed from: N, reason: collision with root package name */
    private v f6547N;

    /* renamed from: O, reason: collision with root package name */
    private v f6548O;

    /* renamed from: P, reason: collision with root package name */
    private long f6549P;

    /* renamed from: Q, reason: collision with root package name */
    private long f6550Q;

    /* renamed from: R, reason: collision with root package name */
    private ByteBuffer f6551R;

    /* renamed from: S, reason: collision with root package name */
    private int f6552S;

    /* renamed from: T, reason: collision with root package name */
    private int f6553T;

    /* renamed from: U, reason: collision with root package name */
    private long f6554U;

    /* renamed from: V, reason: collision with root package name */
    private long f6555V;

    /* renamed from: W, reason: collision with root package name */
    private int f6556W;

    /* renamed from: X, reason: collision with root package name */
    private long f6557X;
    private long Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f6558Z;
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
    private final com.anythink.basead.exoplayer.b.c f6559q;

    /* renamed from: r, reason: collision with root package name */
    private final a f6560r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f6561s;

    /* renamed from: t, reason: collision with root package name */
    private final k f6562t;

    /* renamed from: u, reason: collision with root package name */
    private final u f6563u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.b.f[] f6564v;

    /* renamed from: w, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.b.f[] f6565w;

    /* renamed from: x, reason: collision with root package name */
    private final ConditionVariable f6566x;

    /* renamed from: y, reason: collision with root package name */
    private final j f6567y;

    /* renamed from: z, reason: collision with root package name */
    private final ArrayDeque<d> f6568z;

    public interface a {
        long a(long j6);

        v a(v vVar);

        com.anythink.basead.exoplayer.b.f[] a();

        long b();
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.b.f[] f6573a;

        /* renamed from: b, reason: collision with root package name */
        private final q f6574b;

        /* renamed from: c, reason: collision with root package name */
        private final t f6575c;

        public b(com.anythink.basead.exoplayer.b.f... fVarArr) {
            com.anythink.basead.exoplayer.b.f[] fVarArr2 = (com.anythink.basead.exoplayer.b.f[]) Arrays.copyOf(fVarArr, fVarArr.length + 2);
            this.f6573a = fVarArr2;
            q qVar = new q();
            this.f6574b = qVar;
            t tVar = new t();
            this.f6575c = tVar;
            fVarArr2[fVarArr.length] = qVar;
            fVarArr2[fVarArr.length + 1] = tVar;
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final com.anythink.basead.exoplayer.b.f[] a() {
            return this.f6573a;
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final long b() {
            return this.f6574b.j();
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final v a(v vVar) {
            this.f6574b.a(vVar.f8761d);
            return new v(this.f6575c.a(vVar.f8759b), this.f6575c.b(vVar.f8760c), vVar.f8761d);
        }

        @Override // com.anythink.basead.exoplayer.b.l.a
        public final long a(long j6) {
            return this.f6575c.a(j6);
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
        private final v f6576a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6577b;

        /* renamed from: c, reason: collision with root package name */
        private final long f6578c;

        public /* synthetic */ d(v vVar, long j6, long j9, byte b9) {
            this(vVar, j6, j9);
        }

        private d(v vVar, long j6, long j9) {
            this.f6576a = vVar;
            this.f6577b = j6;
            this.f6578c = j9;
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
            y.x(sb, ", ", j10, ", ");
            sb.append(j11);
            sb.append(", ");
            sb.append(l.this.r());
            sb.append(", ");
            sb.append(l.this.s());
            String sb2 = sb.toString();
            if (l.f6522c) {
                throw new c(sb2, (byte) 0);
            }
            Log.w(l.f6531m, sb2);
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void b(long j6, long j9, long j10, long j11) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j6);
            sb.append(", ");
            sb.append(j9);
            y.x(sb, ", ", j10, ", ");
            sb.append(j11);
            sb.append(", ");
            sb.append(l.this.r());
            sb.append(", ");
            sb.append(l.this.s());
            String sb2 = sb.toString();
            if (l.f6522c) {
                throw new c(sb2, (byte) 0);
            }
            Log.w(l.f6531m, sb2);
        }

        public /* synthetic */ e(l lVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void a(long j6) {
            Log.w(l.f6531m, "Ignoring impossibly large audio latency: ".concat(String.valueOf(j6)));
        }

        @Override // com.anythink.basead.exoplayer.b.j.a
        public final void a(int i, long j6) {
            if (l.this.f6535A != null) {
                l.this.f6535A.a(i, j6, SystemClock.elapsedRealtime() - l.this.ao);
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
        int i6 = 0;
        while (true) {
            com.anythink.basead.exoplayer.b.f[] fVarArr = this.ad;
            if (i6 >= fVarArr.length) {
                return;
            }
            com.anythink.basead.exoplayer.b.f fVar = fVarArr[i6];
            fVar.h();
            this.ae[i6] = fVar.f();
            i6++;
        }
    }

    private void m() {
        this.f6566x.block();
        AudioTrack t6 = t();
        this.f6537C = t6;
        int audioSessionId = t6.getAudioSessionId();
        if (f6521b && af.f8346a < 21) {
            AudioTrack audioTrack = this.f6536B;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                p();
            }
            if (this.f6536B == null) {
                this.f6536B = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
            }
        }
        if (this.am != audioSessionId) {
            this.am = audioSessionId;
            h.c cVar = this.f6535A;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        this.f6548O = this.f6545L ? this.f6560r.a(this.f6548O) : v.f8758a;
        k();
        this.f6567y.a(this.f6537C, this.f6543I, this.f6556W, this.f6546M);
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean n() {
        boolean z3;
        int i6;
        com.anythink.basead.exoplayer.b.f[] fVarArr;
        if (this.aj == -1) {
            this.aj = this.f6544K ? 0 : this.ad.length;
            z3 = true;
            i6 = this.aj;
            fVarArr = this.ad;
            if (i6 < fVarArr.length) {
                com.anythink.basead.exoplayer.b.f fVar = fVarArr[i6];
                if (z3) {
                    fVar.e();
                }
                a(com.anythink.basead.exoplayer.b.f6382b);
                if (!fVar.g()) {
                    return false;
                }
                this.aj++;
                z3 = true;
                i6 = this.aj;
                fVarArr = this.ad;
                if (i6 < fVarArr.length) {
                    ByteBuffer byteBuffer = this.ag;
                    if (byteBuffer != null) {
                        b(byteBuffer, com.anythink.basead.exoplayer.b.f6382b);
                        if (this.ag != null) {
                            return false;
                        }
                    }
                    this.aj = -1;
                    return true;
                }
            }
        } else {
            z3 = false;
            i6 = this.aj;
            fVarArr = this.ad;
            if (i6 < fVarArr.length) {
            }
        }
    }

    private void o() {
        if (q()) {
            if (af.f8346a >= 21) {
                this.f6537C.setVolume(this.ac);
                return;
            }
            AudioTrack audioTrack = this.f6537C;
            float f3 = this.ac;
            audioTrack.setStereoVolume(f3, f3);
        }
    }

    private void p() {
        final AudioTrack audioTrack = this.f6536B;
        if (audioTrack == null) {
            return;
        }
        this.f6536B = null;
        new Thread() { // from class: com.anythink.basead.exoplayer.b.l.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                audioTrack.release();
            }
        }.start();
    }

    private boolean q() {
        return this.f6537C != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        return this.f6538D ? this.f6554U / this.f6553T : this.f6555V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long s() {
        return this.f6538D ? this.f6557X / this.f6556W : this.Y;
    }

    private AudioTrack t() {
        AudioTrack audioTrack;
        if (af.f8346a >= 21) {
            AudioAttributes build = this.an ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.J.a();
            AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f6542H).setEncoding(this.f6543I).setSampleRate(this.f6541G).build();
            int i6 = this.am;
            if (i6 == 0) {
                i6 = 0;
            }
            audioTrack = new AudioTrack(build, build2, this.f6546M, 1, i6);
        } else {
            int f3 = af.f(this.J.f6427d);
            audioTrack = this.am == 0 ? new AudioTrack(f3, this.f6541G, this.f6542H, this.f6543I, this.f6546M, 1) : new AudioTrack(f3, this.f6541G, this.f6542H, this.f6543I, this.f6546M, 1, this.am);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new h.b(state, this.f6541G, this.f6542H, this.f6546M);
    }

    private AudioTrack u() {
        AudioAttributes build = this.an ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.J.a();
        AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f6542H).setEncoding(this.f6543I).setSampleRate(this.f6541G).build();
        int i6 = this.am;
        if (i6 == 0) {
            i6 = 0;
        }
        return new AudioTrack(build, build2, this.f6546M, 1, i6);
    }

    private com.anythink.basead.exoplayer.b.f[] v() {
        return this.f6539E ? this.f6565w : this.f6564v;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final v f() {
        return this.f6548O;
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
        if (q() && this.f6567y.c()) {
            this.f6537C.pause();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void i() {
        if (q()) {
            this.f6554U = 0L;
            this.f6555V = 0L;
            this.f6557X = 0L;
            this.Y = 0L;
            this.f6558Z = 0;
            v vVar = this.f6547N;
            if (vVar != null) {
                this.f6548O = vVar;
                this.f6547N = null;
            } else if (!this.f6568z.isEmpty()) {
                this.f6548O = this.f6568z.getLast().f6576a;
            }
            this.f6568z.clear();
            this.f6549P = 0L;
            this.f6550Q = 0L;
            this.af = null;
            this.ag = null;
            l();
            this.ak = false;
            this.aj = -1;
            this.f6551R = null;
            this.f6552S = 0;
            this.aa = 0;
            if (this.f6567y.b()) {
                this.f6537C.pause();
            }
            final AudioTrack audioTrack = this.f6537C;
            this.f6537C = null;
            this.f6567y.d();
            this.f6566x.close();
            new Thread() { // from class: com.anythink.basead.exoplayer.b.l.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        l.this.f6566x.open();
                    }
                }
            }.start();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void j() {
        i();
        p();
        for (com.anythink.basead.exoplayer.b.f fVar : this.f6564v) {
            fVar.i();
        }
        for (com.anythink.basead.exoplayer.b.f fVar2 : this.f6565w) {
            fVar2.i();
        }
        this.am = 0;
        this.al = false;
    }

    private l(com.anythink.basead.exoplayer.b.c cVar, com.anythink.basead.exoplayer.b.f[] fVarArr, byte b9) {
        this(cVar, new b(fVarArr));
    }

    private long f(long j6) {
        return (j6 * this.f6541G) / 1000000;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void a(h.c cVar) {
        this.f6535A = cVar;
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
            this.f6567y.d(s());
            this.f6537C.stop();
            this.f6552S = 0;
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
        return q() && this.f6567y.e(s());
    }

    private l(com.anythink.basead.exoplayer.b.c cVar, a aVar) {
        this.f6559q = cVar;
        this.f6560r = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
        this.f6561s = false;
        this.f6566x = new ConditionVariable(true);
        this.f6567y = new j(new e(this, (byte) 0));
        k kVar = new k();
        this.f6562t = kVar;
        u uVar = new u();
        this.f6563u = uVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p(), kVar, uVar);
        Collections.addAll(arrayList, aVar.a());
        this.f6564v = (com.anythink.basead.exoplayer.b.f[]) arrayList.toArray(new com.anythink.basead.exoplayer.b.f[arrayList.size()]);
        this.f6565w = new com.anythink.basead.exoplayer.b.f[]{new n()};
        this.ac = 1.0f;
        this.aa = 0;
        this.J = com.anythink.basead.exoplayer.b.b.f6424a;
        this.am = 0;
        this.f6548O = v.f8758a;
        this.aj = -1;
        this.ad = new com.anythink.basead.exoplayer.b.f[0];
        this.ae = new ByteBuffer[0];
        this.f6568z = new ArrayDeque<>();
    }

    private long d(long j6) {
        return (j6 * 1000000) / this.f6540F;
    }

    private long e(long j6) {
        return (j6 * 1000000) / this.f6541G;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final boolean a(int i6) {
        if (af.b(i6)) {
            return i6 != 4 || af.f8346a >= 21;
        }
        com.anythink.basead.exoplayer.b.c cVar = this.f6559q;
        return cVar != null && cVar.a(i6);
    }

    private void b(ByteBuffer byteBuffer, long j6) {
        l lVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.ag;
            int i6 = 0;
            if (byteBuffer2 != null) {
                com.anythink.basead.exoplayer.k.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.ag = byteBuffer;
                if (af.f8346a < 21) {
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
            if (af.f8346a < 21) {
                int b9 = this.f6567y.b(this.f6557X);
                if (b9 > 0) {
                    i6 = this.f6537C.write(this.ah, this.ai, Math.min(remaining2, b9));
                    if (i6 > 0) {
                        this.ai += i6;
                        byteBuffer.position(byteBuffer.position() + i6);
                    }
                }
                lVar = this;
            } else if (this.an) {
                com.anythink.basead.exoplayer.k.a.b(j6 != com.anythink.basead.exoplayer.b.f6382b);
                lVar = this;
                i6 = lVar.a(this.f6537C, byteBuffer, remaining2, j6);
            } else {
                lVar = this;
                i6 = lVar.f6537C.write(byteBuffer, remaining2, 1);
            }
            lVar.ao = SystemClock.elapsedRealtime();
            if (i6 >= 0) {
                boolean z3 = lVar.f6538D;
                if (z3) {
                    lVar.f6557X += i6;
                }
                if (i6 == remaining2) {
                    if (!z3) {
                        lVar.Y += lVar.f6558Z;
                    }
                    lVar.ag = null;
                    return;
                }
                return;
            }
            throw new h.d(i6);
        }
    }

    private static AudioTrack d(int i6) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i6);
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final long a(boolean z3) {
        long j6;
        long a9;
        long j9;
        if (!q() || this.aa == 0) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f6567y.a(z3), e(s()));
        long j10 = this.ab;
        d dVar = null;
        while (!this.f6568z.isEmpty() && min >= this.f6568z.getFirst().f6578c) {
            dVar = this.f6568z.remove();
        }
        if (dVar != null) {
            this.f6548O = dVar.f6576a;
            this.f6550Q = dVar.f6578c;
            this.f6549P = dVar.f6577b - this.ab;
        }
        if (this.f6548O.f8759b == 1.0f) {
            j9 = (min + this.f6549P) - this.f6550Q;
        } else {
            if (this.f6568z.isEmpty()) {
                j6 = this.f6549P;
                a9 = this.f6560r.a(min - this.f6550Q);
            } else {
                j6 = this.f6549P;
                a9 = af.a(min - this.f6550Q, this.f6548O.f8759b);
            }
            j9 = a9 + j6;
        }
        return j9 + e(this.f6560r.b()) + j10;
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void c(int i6) {
        com.anythink.basead.exoplayer.k.a.b(af.f8346a >= 21);
        if (this.an && this.am == i6) {
            return;
        }
        this.an = true;
        this.am = i6;
        i();
    }

    private long c(long j6) {
        return j6 + e(this.f6560r.b());
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
    public final void a(int i6, int i9, int i10, int[] iArr, int i11, int i12) {
        int i13;
        boolean z3;
        int i14;
        boolean z6;
        int i15;
        int i16;
        int i17;
        int i18;
        this.f6540F = i10;
        this.f6538D = af.b(i6);
        this.f6539E = this.f6561s && a(1073741824) && af.c(i6);
        if (this.f6538D) {
            this.f6553T = af.b(i6, i9);
        }
        int i19 = 4;
        if (this.f6538D) {
            i13 = i6;
            if (i13 != 4) {
                z3 = true;
                this.f6545L = (z3 || this.f6539E) ? false : true;
                if (z3) {
                    i14 = i10;
                    z6 = false;
                    i15 = i9;
                } else {
                    this.f6563u.a(i11, i12);
                    this.f6562t.a(iArr);
                    i14 = i10;
                    z6 = false;
                    i15 = i9;
                    for (com.anythink.basead.exoplayer.b.f fVar : v()) {
                        try {
                            z6 |= fVar.a(i14, i15, i13);
                            if (fVar.a()) {
                                i15 = fVar.b();
                                i14 = fVar.d();
                                i13 = fVar.c();
                            }
                        } catch (f.a e9) {
                            throw new h.a(e9);
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
                        i19 = BaseATView.a.f9767C;
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
                        i19 = com.anythink.basead.exoplayer.b.f6359C;
                        break;
                    default:
                        throw new h.a("Unsupported channel count: ".concat(String.valueOf(i15)));
                }
                i17 = af.f8346a;
                if (i17 <= 23 && "foster".equals(af.f8347b) && "NVIDIA".equals(af.f8348c)) {
                    if (i15 != 3 && i15 != 5) {
                        if (i15 == 7) {
                            i16 = com.anythink.basead.exoplayer.b.f6359C;
                        }
                    }
                    i18 = (i17 <= 25 || !"fugu".equals(af.f8347b) || this.f6538D || i15 != 1) ? i16 : 12;
                    if (z6 && q() && this.f6543I == i13 && this.f6541G == i14 && this.f6542H == i18) {
                        return;
                    }
                    i();
                    this.f6544K = z3;
                    this.f6541G = i14;
                    this.f6542H = i18;
                    this.f6543I = i13;
                    this.f6556W = !this.f6538D ? af.b(i13, i15) : -1;
                    if (!this.f6538D) {
                        int minBufferSize = AudioTrack.getMinBufferSize(i14, i18, this.f6543I);
                        com.anythink.basead.exoplayer.k.a.b(minBufferSize != -2);
                        this.f6546M = af.a(minBufferSize * 4, ((int) f(250000L)) * this.f6556W, (int) Math.max(minBufferSize, f(f6524e) * this.f6556W));
                        return;
                    }
                    int i20 = this.f6543I;
                    if (i20 == 5 || i20 == 6) {
                        this.f6546M = com.anythink.basead.exoplayer.j.a.b.f8021a;
                        return;
                    } else if (i20 == 7) {
                        this.f6546M = 49152;
                        return;
                    } else {
                        this.f6546M = 294912;
                        return;
                    }
                }
                i16 = i19;
                if (i17 <= 25) {
                }
                if (z6) {
                }
                i();
                this.f6544K = z3;
                this.f6541G = i14;
                this.f6542H = i18;
                this.f6543I = i13;
                this.f6556W = !this.f6538D ? af.b(i13, i15) : -1;
                if (!this.f6538D) {
                }
            }
        } else {
            i13 = i6;
        }
        z3 = false;
        this.f6545L = (z3 || this.f6539E) ? false : true;
        if (z3) {
        }
        i16 = 252;
        switch (i15) {
        }
        i17 = af.f8346a;
        if (i17 <= 23) {
            if (i15 != 3) {
                if (i15 == 7) {
                }
            }
            if (i17 <= 25) {
            }
            if (z6) {
            }
            i();
            this.f6544K = z3;
            this.f6541G = i14;
            this.f6542H = i18;
            this.f6543I = i13;
            this.f6556W = !this.f6538D ? af.b(i13, i15) : -1;
            if (!this.f6538D) {
            }
        }
        i16 = i19;
        if (i17 <= 25) {
        }
        if (z6) {
        }
        i();
        this.f6544K = z3;
        this.f6541G = i14;
        this.f6542H = i18;
        this.f6543I = i13;
        this.f6556W = !this.f6538D ? af.b(i13, i15) : -1;
        if (!this.f6538D) {
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void b(int i6) {
        if (this.am != i6) {
            this.am = i6;
            i();
        }
    }

    private long b(long j6) {
        d dVar = null;
        while (!this.f6568z.isEmpty() && j6 >= this.f6568z.getFirst().f6578c) {
            dVar = this.f6568z.remove();
        }
        if (dVar != null) {
            this.f6548O = dVar.f6576a;
            this.f6550Q = dVar.f6578c;
            this.f6549P = dVar.f6577b - this.ab;
        }
        if (this.f6548O.f8759b == 1.0f) {
            return (j6 + this.f6549P) - this.f6550Q;
        }
        if (this.f6568z.isEmpty()) {
            return this.f6560r.a(j6 - this.f6550Q) + this.f6549P;
        }
        return af.a(j6 - this.f6550Q, this.f6548O.f8759b) + this.f6549P;
    }

    private static void b(AudioTrack audioTrack, float f3) {
        audioTrack.setStereoVolume(f3, f3);
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final void a() {
        this.al = true;
        if (q()) {
            this.f6567y.a();
            this.f6537C.play();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final boolean a(ByteBuffer byteBuffer, long j6) {
        boolean z3;
        int a9;
        v vVar;
        ByteBuffer byteBuffer2 = this.af;
        com.anythink.basead.exoplayer.k.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!q()) {
            this.f6566x.block();
            AudioTrack t6 = t();
            this.f6537C = t6;
            int audioSessionId = t6.getAudioSessionId();
            if (f6521b && af.f8346a < 21) {
                AudioTrack audioTrack = this.f6536B;
                if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                    p();
                }
                if (this.f6536B == null) {
                    this.f6536B = new AudioTrack(3, 4000, 4, 2, 2, 0, audioSessionId);
                }
            }
            if (this.am != audioSessionId) {
                this.am = audioSessionId;
                h.c cVar = this.f6535A;
                if (cVar != null) {
                    cVar.a(audioSessionId);
                }
            }
            if (this.f6545L) {
                vVar = this.f6560r.a(this.f6548O);
            } else {
                vVar = v.f8758a;
            }
            this.f6548O = vVar;
            k();
            this.f6567y.a(this.f6537C, this.f6543I, this.f6556W, this.f6546M);
            o();
            if (this.al) {
                a();
            }
        }
        if (!this.f6567y.a(s())) {
            return false;
        }
        if (this.af != null) {
            z3 = false;
        } else {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.f6538D && this.f6558Z == 0) {
                int i6 = this.f6543I;
                if (i6 == 7 || i6 == 8) {
                    a9 = m.a(byteBuffer);
                } else if (i6 == 5) {
                    a9 = com.anythink.basead.exoplayer.b.a.a();
                } else if (i6 == 6) {
                    a9 = com.anythink.basead.exoplayer.b.a.a(byteBuffer);
                } else if (i6 == 14) {
                    int b9 = com.anythink.basead.exoplayer.b.a.b(byteBuffer);
                    a9 = b9 == -1 ? 0 : com.anythink.basead.exoplayer.b.a.a(byteBuffer, b9) * 16;
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i6)));
                }
                this.f6558Z = a9;
                if (a9 == 0) {
                    return true;
                }
            }
            if (this.f6547N == null) {
                z3 = false;
            } else {
                if (!n()) {
                    return false;
                }
                v vVar2 = this.f6547N;
                this.f6547N = null;
                z3 = false;
                this.f6568z.add(new d(this.f6560r.a(vVar2), Math.max(0L, j6), e(s()), (byte) 0));
                k();
            }
            if (this.aa == 0) {
                this.ab = Math.max(0L, j6);
                this.aa = 1;
            } else {
                long r9 = ((r() * 1000000) / this.f6540F) + this.ab;
                if (this.aa == 1 && Math.abs(r9 - j6) > 200000) {
                    Log.e(f6531m, "Discontinuity detected [expected " + r9 + ", got " + j6 + "]");
                    this.aa = 2;
                }
                if (this.aa == 2) {
                    this.ab = (j6 - r9) + this.ab;
                    this.aa = 1;
                    h.c cVar2 = this.f6535A;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                }
            }
            if (this.f6538D) {
                this.f6554U += byteBuffer.remaining();
            } else {
                this.f6555V += this.f6558Z;
            }
            this.af = byteBuffer;
        }
        if (this.f6544K) {
            a(j6);
        } else {
            b(this.af, j6);
        }
        if (!this.af.hasRemaining()) {
            this.af = null;
            return true;
        }
        if (!this.f6567y.c(s())) {
            return z3;
        }
        Log.w(f6531m, "Resetting stalled audio track");
        i();
        return true;
    }

    private void a(long j6) {
        ByteBuffer byteBuffer;
        int length = this.ad.length;
        int i6 = length;
        while (i6 >= 0) {
            if (i6 > 0) {
                byteBuffer = this.ae[i6 - 1];
            } else {
                byteBuffer = this.af;
                if (byteBuffer == null) {
                    byteBuffer = com.anythink.basead.exoplayer.b.f.f6440a;
                }
            }
            if (i6 == length) {
                b(byteBuffer, j6);
            } else {
                com.anythink.basead.exoplayer.b.f fVar = this.ad[i6];
                fVar.a(byteBuffer);
                ByteBuffer f3 = fVar.f();
                this.ae[i6] = f3;
                if (f3.hasRemaining()) {
                    i6++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i6--;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.b.h
    public final v a(v vVar) {
        if (q() && !this.f6545L) {
            v vVar2 = v.f8758a;
            this.f6548O = vVar2;
            return vVar2;
        }
        v vVar3 = this.f6547N;
        if (vVar3 == null) {
            if (!this.f6568z.isEmpty()) {
                vVar3 = this.f6568z.getLast().f6576a;
            } else {
                vVar3 = this.f6548O;
            }
        }
        if (!vVar.equals(vVar3)) {
            if (q()) {
                this.f6547N = vVar;
            } else {
                this.f6548O = this.f6560r.a(vVar);
            }
        }
        return this.f6548O;
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
    public final void a(float f3) {
        if (this.ac != f3) {
            this.ac = f3;
            o();
        }
    }

    private static int a(int i6, ByteBuffer byteBuffer) {
        if (i6 == 7 || i6 == 8) {
            return m.a(byteBuffer);
        }
        if (i6 == 5) {
            return com.anythink.basead.exoplayer.b.a.a();
        }
        if (i6 == 6) {
            return com.anythink.basead.exoplayer.b.a.a(byteBuffer);
        }
        if (i6 == 14) {
            int b9 = com.anythink.basead.exoplayer.b.a.b(byteBuffer);
            if (b9 == -1) {
                return 0;
            }
            return com.anythink.basead.exoplayer.b.a.a(byteBuffer, b9) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i6)));
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i6) {
        return audioTrack.write(byteBuffer, i6, 1);
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i6, long j6) {
        if (this.f6551R == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f6551R = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f6551R.putInt(1431633921);
        }
        if (this.f6552S == 0) {
            this.f6551R.putInt(4, i6);
            this.f6551R.putLong(8, j6 * 1000);
            this.f6551R.position(0);
            this.f6552S = i6;
        }
        int remaining = this.f6551R.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f6551R, remaining, 1);
            if (write < 0) {
                this.f6552S = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, i6, 1);
        if (write2 < 0) {
            this.f6552S = 0;
            return write2;
        }
        this.f6552S -= write2;
        return write2;
    }

    private static void a(AudioTrack audioTrack, float f3) {
        audioTrack.setVolume(f3);
    }
}
