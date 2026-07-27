package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class EP {
    public static final AtomicInteger Y = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public long f24719A;

    /* renamed from: B, reason: collision with root package name */
    public int f24720B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f24721C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f24722D;

    /* renamed from: E, reason: collision with root package name */
    public long f24723E;

    /* renamed from: F, reason: collision with root package name */
    public long f24724F;

    /* renamed from: G, reason: collision with root package name */
    public float f24725G;

    /* renamed from: H, reason: collision with root package name */
    public ByteBuffer f24726H;

    /* renamed from: I, reason: collision with root package name */
    public int f24727I;
    public ByteBuffer J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f24728K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f24729L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f24730M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f24731N;

    /* renamed from: O, reason: collision with root package name */
    public int f24732O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f24733P;

    /* renamed from: Q, reason: collision with root package name */
    public C3488ko f24734Q;

    /* renamed from: R, reason: collision with root package name */
    public AudioDeviceInfo f24735R;

    /* renamed from: S, reason: collision with root package name */
    public int f24736S;

    /* renamed from: T, reason: collision with root package name */
    public long f24737T;

    /* renamed from: U, reason: collision with root package name */
    public long f24738U;

    /* renamed from: V, reason: collision with root package name */
    public long f24739V;

    /* renamed from: W, reason: collision with root package name */
    public Handler f24740W;

    /* renamed from: X, reason: collision with root package name */
    public final C3602mu f24741X;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24742a;

    /* renamed from: b, reason: collision with root package name */
    public final C4227yP f24743b;

    /* renamed from: c, reason: collision with root package name */
    public final KP f24744c;

    /* renamed from: d, reason: collision with root package name */
    public final C3645nj f24745d;

    /* renamed from: e, reason: collision with root package name */
    public final C3645nj f24746e;

    /* renamed from: f, reason: collision with root package name */
    public final C3675oC f24747f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f24748g;

    /* renamed from: h, reason: collision with root package name */
    public C4281zP f24749h;
    public final N1.l i;

    /* renamed from: j, reason: collision with root package name */
    public final N1.l f24750j;

    /* renamed from: k, reason: collision with root package name */
    public VO f24751k;

    /* renamed from: l, reason: collision with root package name */
    public Mt f24752l;

    /* renamed from: m, reason: collision with root package name */
    public BP f24753m;

    /* renamed from: n, reason: collision with root package name */
    public BP f24754n;

    /* renamed from: o, reason: collision with root package name */
    public C3213fh f24755o;

    /* renamed from: p, reason: collision with root package name */
    public final C4313b f24756p;

    /* renamed from: q, reason: collision with root package name */
    public CP f24757q;

    /* renamed from: r, reason: collision with root package name */
    public C4119wP f24758r;

    /* renamed from: s, reason: collision with root package name */
    public C2777Sj f24759s;

    /* renamed from: t, reason: collision with root package name */
    public DP f24760t;

    /* renamed from: u, reason: collision with root package name */
    public DP f24761u;

    /* renamed from: v, reason: collision with root package name */
    public C4045v5 f24762v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24763w;

    /* renamed from: x, reason: collision with root package name */
    public long f24764x;

    /* renamed from: y, reason: collision with root package name */
    public long f24765y;

    /* renamed from: z, reason: collision with root package name */
    public long f24766z;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0081, code lost:
    
        r9 = r0.getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EP(AP ap) {
        int deviceId;
        Context context = ap.f23867a;
        this.f24742a = context == null ? null : context.getApplicationContext();
        this.f24759s = C2777Sj.f27609b;
        this.f24741X = ap.f23872f;
        this.f24756p = ap.f23871e;
        C4227yP c4227yP = new C4227yP();
        this.f24743b = c4227yP;
        KP kp = new KP();
        kp.f25971m = AbstractC3548lu.f32614b;
        this.f24744c = kp;
        this.f24745d = new C3645nj(0);
        this.f24746e = new C3645nj(1);
        this.f24747f = UB.k(kp, c4227yP);
        this.f24725G = 1.0f;
        this.f24732O = 0;
        this.f24734Q = new C3488ko();
        C4045v5 c4045v5 = C4045v5.f34711d;
        this.f24761u = new DP(c4045v5, 0L, 0L);
        this.f24762v = c4045v5;
        this.f24763w = false;
        this.f24748g = new ArrayDeque();
        this.i = new N1.l();
        this.f24750j = new N1.l();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && deviceId != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.f24736S = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i, ByteBuffer byteBuffer) {
        int i4;
        int i9;
        int i10;
        byte b9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i4 = 0;
            } else {
                byte b10 = byteBuffer.get(26);
                int i16 = 28;
                int i17 = 28;
                for (int i18 = 0; i18 < b10; i18++) {
                    i17 += byteBuffer.get(i18 + 27);
                }
                byte b11 = byteBuffer.get(i17 + 26);
                for (int i19 = 0; i19 < b11; i19++) {
                    i16 += byteBuffer.get(i17 + 27 + i19);
                }
                i4 = i17 + i16;
            }
            int i20 = byteBuffer.get(26 + i4) + 27 + i4;
            return (int) ((AbstractC3035cL.E(byteBuffer.get(i20), byteBuffer.limit() - i20 > 1 ? byteBuffer.get(i20 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = AbstractC3548lu.f32613a;
                    int i21 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i21 = Integer.reverseBytes(i21);
                    }
                    if ((i21 & (-2097152)) == -2097152 && (i13 = (i21 >>> 19) & 3) != 1 && (i14 = (i21 >>> 17) & 3) != 0) {
                        int i22 = i21 >>> 12;
                        int i23 = (i21 >>> 10) & 3;
                        int i24 = i22 & 15;
                        if (i24 != 0 && i24 != 15 && i23 != 3) {
                            i12 = 1152;
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    i12 = 384;
                                }
                            } else if (i13 != 3) {
                                i12 = 576;
                            }
                            if (i12 == -1) {
                                return i12;
                            }
                            throw new IllegalArgumentException();
                        }
                    }
                    i12 = -1;
                    if (i12 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i25 = position2;
                            while (true) {
                                if (i25 <= limit) {
                                    String str2 = AbstractC3548lu.f32613a;
                                    int i26 = byteBuffer.getInt(i25 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i26 = Integer.reverseBytes(i26);
                                    }
                                    if ((i26 & (-2)) == -126718022) {
                                        i15 = i25 - position2;
                                    } else {
                                        i25++;
                                    }
                                } else {
                                    i15 = -1;
                                }
                            }
                            if (i15 != -1) {
                                return (40 << ((byteBuffer.get((byteBuffer.position() + i15) + ((byteBuffer.get((byteBuffer.position() + i15) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            return 0;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return AbstractC3217fl.v(new Er(bArr, 16)).f3425c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(D.y.j(i, "Unexpected audio encoding: ", new StringBuilder(String.valueOf(i).length() + 27)));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return AbstractC2655Lg.f26184u[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position4 = byteBuffer.position();
        byte b12 = byteBuffer.get(position4);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b9 = byteBuffer.get(position4 + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(position4 + 4) & 1) << 6;
                i11 = byteBuffer.get(position4 + 5) & 252;
                i9 = (i11 >> 2) | i10;
            } else {
                i10 = (byteBuffer.get(5 + position4) & 7) << 4;
                b9 = byteBuffer.get(position4 + 6);
            }
            i11 = b9 & 60;
            i9 = (i11 >> 2) | i10;
        } else {
            i9 = ((byteBuffer.get(position4 + 5) & 1) << 6) | ((byteBuffer.get(position4 + 4) & 252) >> 2);
        }
        return (i9 + 1) * 32;
    }

    public final void a() {
        if (l()) {
            this.f24764x = 0L;
            this.f24765y = 0L;
            this.f24766z = 0L;
            this.f24719A = 0L;
            this.f24720B = 0;
            this.f24761u = new DP(this.f24762v, 0L, 0L);
            this.f24723E = 0L;
            this.f24760t = null;
            this.f24748g.clear();
            this.f24726H = null;
            this.f24727I = 0;
            this.J = null;
            this.f24729L = false;
            this.f24728K = false;
            this.f24730M = false;
            this.f24744c.f25973o = 0L;
            d(com.anythink.basead.exoplayer.b.f6539b);
            this.f24749h = null;
            BP bp = this.f24753m;
            if (bp != null) {
                this.f24754n = bp;
                this.f24753m = null;
            }
            Y.incrementAndGet();
            C4119wP c4119wP = this.f24758r;
            if (c4119wP.f34988e.f35152d.getPlayState() == 3) {
                c4119wP.f34984a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && c4119wP.b()) {
                C3602mu c3602mu = c4119wP.f34991h;
                c3602mu.getClass();
                ((C4119wP) c3602mu.f32776w).f34984a.unregisterStreamEventCallback((C4011uP) c3602mu.f32775v);
                ((Handler) c3602mu.f32774u).removeCallbacksAndMessages(null);
            }
            PE pe = c4119wP.f34987d;
            if (pe != null) {
                C3957tP c3957tP = (C3957tP) pe.f26885e;
                c3957tP.getClass();
                ((AudioTrack) pe.f26882b).removeOnRoutingChangedListener(c3957tP);
                pe.f26885e = null;
                c4119wP.f34987d = null;
            }
            AudioTrack audioTrack = c4119wP.f34984a;
            C3759pp c3759pp = c4119wP.i;
            Handler p6 = AbstractC3548lu.p();
            synchronized (C4119wP.f34981o) {
                try {
                    if (C4119wP.f34982p == null) {
                        C4119wP.f34982p = Executors.newSingleThreadScheduledExecutor(new Ot());
                    }
                    C4119wP.f34983q++;
                    C4119wP.f34982p.schedule(new RunnableC3771q0(audioTrack, p6, c3759pp, 16), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f24758r = null;
        }
        N1.l lVar = this.f24750j;
        lVar.f1970v = null;
        lVar.f1968n = com.anythink.basead.exoplayer.b.f6539b;
        lVar.f1969u = com.anythink.basead.exoplayer.b.f6539b;
        N1.l lVar2 = this.i;
        lVar2.f1970v = null;
        lVar2.f1968n = com.anythink.basead.exoplayer.b.f6539b;
        lVar2.f1969u = com.anythink.basead.exoplayer.b.f6539b;
        this.f24738U = 0L;
        this.f24739V = 0L;
        Handler handler = this.f24740W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        a();
        C3675oC c3675oC = this.f24747f;
        int i = c3675oC.f33117w;
        for (int i4 = 0; i4 < i; i4++) {
            ((InterfaceC3050ci) c3675oC.get(i4)).h();
        }
        this.f24745d.h();
        this.f24746e.h();
        C3213fh c3213fh = this.f24755o;
        if (c3213fh != null) {
            int i9 = 0;
            while (true) {
                C3675oC c3675oC2 = c3213fh.f30746a;
                if (i9 >= c3675oC2.f33117w) {
                    break;
                }
                InterfaceC3050ci interfaceC3050ci = (InterfaceC3050ci) c3675oC2.get(i9);
                interfaceC3050ci.g(C2673Mh.f26359d);
                interfaceC3050ci.h();
                i9++;
            }
            c3213fh.f30747b.clear();
            c3213fh.f30748c = new ByteBuffer[0];
            C3751ph c3751ph = C3751ph.f33430e;
            c3213fh.f30749d = false;
        }
        this.f24731N = false;
    }

    public final void d(long j9) {
        long j10;
        BP bp = this.f24754n;
        this.f24755o = (C3213fh) bp.f24040f;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            j10 = 0;
        } else {
            j10 = j9 - this.f24724F;
            if (((AbstractC3832r8) bp.f24041g) != AbstractC3832r8.f33969a && bp.f24042h != null) {
                L7 l72 = new L7();
                BP bp2 = this.f24754n;
                ((AbstractC3832r8) bp2.f24041g).o(bp2.f24042h, l72);
            }
        }
        C3213fh c3213fh = this.f24755o;
        C2503Ch c2503Ch = new C2503Ch();
        BP bp3 = this.f24754n;
        c2503Ch.f24243b = (AbstractC3832r8) bp3.f24041g;
        c2503Ch.f24244c = bp3.f24042h;
        c2503Ch.f24242a = j10;
        C2673Mh a9 = c2503Ch.a();
        ArrayList arrayList = c3213fh.f30747b;
        arrayList.clear();
        c3213fh.f30749d = false;
        int i = 0;
        while (true) {
            C3675oC c3675oC = c3213fh.f30746a;
            if (i >= c3675oC.f33117w) {
                break;
            }
            InterfaceC3050ci interfaceC3050ci = (InterfaceC3050ci) c3675oC.get(i);
            interfaceC3050ci.g(a9);
            if (interfaceC3050ci.i()) {
                C2503Ch c2503Ch2 = new C2503Ch();
                long j11 = a9.f26360a;
                c2503Ch2.f24242a = j11;
                c2503Ch2.f24243b = a9.f26361b;
                c2503Ch2.f24244c = a9.f26362c;
                c2503Ch2.f24242a = interfaceC3050ci.d(j11);
                a9 = c2503Ch2.a();
                arrayList.add(interfaceC3050ci);
            }
            i++;
        }
        c3213fh.f30748c = new ByteBuffer[arrayList.size()];
        for (int i4 = 0; i4 <= c3213fh.e(); i4++) {
            c3213fh.f30748c[i4] = ((InterfaceC3050ci) arrayList.get(i4)).f();
        }
    }

    public final C4119wP e(C3366iP c3366iP) {
        try {
            return this.f24756p.f(c3366iP);
        } catch (C3312hP e6) {
            String valueOf = String.valueOf((TP) this.f24754n.f24037c);
            int i = c3366iP.f31385b;
            int length = String.valueOf(i).length();
            int i4 = c3366iP.f31386c;
            int length2 = String.valueOf(i4).length();
            int i9 = c3366iP.f31384a;
            int length3 = String.valueOf(i9).length();
            int i10 = c3366iP.f31387d;
            StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i10).length() + 2 + valueOf.length());
            AbstractC5051n.i(sb, "AudioTrack init failed 0 Config(", i, ", ", i4);
            AbstractC5051n.i(sb, ", ", i9, ", ", i10);
            C3634nP c3634nP = new C3634nP(D.y.o(sb, ") ", valueOf, ""), e6);
            Mt mt = this.f24752l;
            if (mt == null) {
                throw c3634nP;
            }
            mt.n(c3634nP);
            throw c3634nP;
        }
    }

    public final void f(long j9) {
        ByteBuffer byteBuffer;
        i(j9);
        if (this.J != null) {
            return;
        }
        if (!this.f24755o.b()) {
            ByteBuffer byteBuffer2 = this.f24726H;
            if (byteBuffer2 != null) {
                h(byteBuffer2);
                i(j9);
                return;
            }
            return;
        }
        while (!this.f24755o.c()) {
            do {
                C3213fh c3213fh = this.f24755o;
                if (c3213fh.b()) {
                    ByteBuffer byteBuffer3 = c3213fh.f30748c[c3213fh.e()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c3213fh.d(InterfaceC3050ci.f29732a);
                        byteBuffer = c3213fh.f30748c[c3213fh.e()];
                    }
                } else {
                    byteBuffer = InterfaceC3050ci.f29732a;
                }
                if (byteBuffer.hasRemaining()) {
                    h(byteBuffer);
                    i(j9);
                } else {
                    ByteBuffer byteBuffer4 = this.f24726H;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C3213fh c3213fh2 = this.f24755o;
                    ByteBuffer byteBuffer5 = this.f24726H;
                    if (c3213fh2.b() && !c3213fh2.f30749d) {
                        c3213fh2.d(byteBuffer5);
                    }
                }
            } while (this.J == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        ByteBuffer byteBuffer;
        if (!this.f24755o.b()) {
            i(Long.MIN_VALUE);
            return this.J == null;
        }
        C3213fh c3213fh = this.f24755o;
        if (c3213fh.b() && !c3213fh.f30749d) {
            c3213fh.f30749d = true;
            ((InterfaceC3050ci) c3213fh.f30747b.get(0)).c();
        }
        f(Long.MIN_VALUE);
        if (!this.f24755o.c() || ((byteBuffer = this.J) != null && byteBuffer.hasRemaining())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f7, code lost:
    
        if (r10 < 0.0d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0193, code lost:
    
        if (r10 < 0.0f) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (r10 < 0.0d) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        r10 = (-r10) * (-2.147483648E9d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00bd, code lost:
    
        r10 = r10 * 2.147483647E9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00de, code lost:
    
        if (r10 < 0.0f) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00e0, code lost:
    
        r10 = (-r10) * (-2.1474836E9f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00e6, code lost:
    
        r10 = r10 * 2.1474836E9f;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i4;
        int i9;
        float max;
        float f6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        double max2;
        double d2;
        PA.T(this.J == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f24754n.n()) {
                int w9 = (int) AbstractC3548lu.w(AbstractC3548lu.u(20L), ((C3366iP) this.f24754n.f24039e).f31385b, 1000000L, RoundingMode.UP);
                long m8 = m();
                long j9 = w9;
                if (m8 < j9) {
                    BP bp = this.f24754n;
                    C3366iP c3366iP = (C3366iP) bp.f24039e;
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i17 = (int) m8;
                    while (byteBuffer.hasRemaining() && i17 < w9) {
                        int i18 = c3366iP.f31384a;
                        if (i18 != 2) {
                            if (i18 != 3) {
                                if (i18 != 4) {
                                    if (i18 != 21) {
                                        if (i18 == 22) {
                                            i13 = byteBuffer.get() & 255;
                                            i14 = (byteBuffer.get() & 255) << 8;
                                            i15 = (byteBuffer.get() & 255) << 16;
                                            i16 = (byteBuffer.get() & 255) << 24;
                                        } else if (i18 == 268435456) {
                                            i = (byteBuffer.get() & 255) << 24;
                                            i4 = (byteBuffer.get() & 255) << 16;
                                        } else if (i18 == 1342177280) {
                                            i10 = (byteBuffer.get() & 255) << 24;
                                            i11 = (byteBuffer.get() & 255) << 16;
                                            i12 = (byteBuffer.get() & 255) << 8;
                                        } else if (i18 != 1610612736) {
                                            if (i18 == 1879048192) {
                                                max2 = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                            } else if (i18 == 1895825408) {
                                                max = Math.max(-1.0f, Math.min(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), 1.0f));
                                            } else {
                                                if (i18 != 1912602624) {
                                                    throw new IllegalStateException();
                                                }
                                                max2 = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                            }
                                            i9 = (int) d2;
                                        } else {
                                            i13 = (byteBuffer.get() & 255) << 24;
                                            i14 = (byteBuffer.get() & 255) << 16;
                                            i15 = (byteBuffer.get() & 255) << 8;
                                            i16 = byteBuffer.get() & 255;
                                        }
                                        i9 = i13 | i14 | i15 | i16;
                                    } else {
                                        i10 = (byteBuffer.get() & 255) << 8;
                                        i11 = (byteBuffer.get() & 255) << 16;
                                        i12 = (byteBuffer.get() & 255) << 24;
                                    }
                                    i9 = i10 | i11 | i12;
                                } else {
                                    max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                }
                                i9 = (int) f6;
                            } else {
                                i9 = (byteBuffer.get() & 255) << 24;
                            }
                            int i19 = (int) ((i9 * i17) / j9);
                            if (i18 != 2) {
                                order.put((byte) (i19 >> 16));
                                order.put((byte) (i19 >> 24));
                            } else if (i18 == 3) {
                                order.put((byte) (i19 >> 24));
                            } else if (i18 != 4) {
                                if (i18 == 21) {
                                    order.put((byte) (i19 >> 8));
                                    order.put((byte) (i19 >> 16));
                                    order.put((byte) (i19 >> 24));
                                } else if (i18 == 22) {
                                    order.put((byte) i19);
                                    order.put((byte) (i19 >> 8));
                                    order.put((byte) (i19 >> 16));
                                    order.put((byte) (i19 >> 24));
                                } else if (i18 == 268435456) {
                                    order.put((byte) (i19 >> 24));
                                    order.put((byte) (i19 >> 16));
                                } else if (i18 == 1342177280) {
                                    order.put((byte) (i19 >> 24));
                                    order.put((byte) (i19 >> 16));
                                    order.put((byte) (i19 >> 8));
                                } else if (i18 == 1610612736) {
                                    order.put((byte) (i19 >> 24));
                                    order.put((byte) (i19 >> 16));
                                    order.put((byte) (i19 >> 8));
                                    order.put((byte) i19);
                                } else if (i18 != 1879048192) {
                                    if (i18 == 1895825408) {
                                        order.putInt(Integer.reverseBytes(Float.floatToIntBits(i19 < 0 ? (-i19) / (-2.1474836E9f) : i19 / 2.1474836E9f)));
                                    } else {
                                        if (i18 != 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                        order.putLong(Long.reverseBytes(Double.doubleToLongBits(i19 < 0 ? (-i19) / (-2.147483648E9d) : i19 / 2.147483647E9d)));
                                    }
                                } else if (i19 < 0) {
                                    order.putDouble((-i19) / (-2.147483648E9d));
                                } else {
                                    order.putDouble(i19 / 2.147483647E9d);
                                }
                            } else if (i19 < 0) {
                                order.putFloat((-i19) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i19 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != bp.f24036b + position) {
                                i17++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i4 = (byteBuffer.get() & 255) << 24;
                        }
                        i9 = i | i4;
                        int i192 = (int) ((i9 * i17) / j9);
                        if (i18 != 2) {
                        }
                        if (byteBuffer.position() != bp.f24036b + position) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.J = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.J = byteBuffer2;
        }
    }

    public final void i(long j9) {
        if (this.J == null) {
            return;
        }
        N1.l lVar = this.f24750j;
        if (((Exception) lVar.f1970v) != null && (Y.get() > 0 || SystemClock.elapsedRealtime() < lVar.f1969u)) {
            return;
        }
        int remaining = this.J.remaining();
        try {
            boolean a9 = this.f24758r.a(this.f24727I, this.J);
            this.f24737T = SystemClock.elapsedRealtime();
            lVar.f1970v = null;
            lVar.f1968n = com.anythink.basead.exoplayer.b.f6539b;
            lVar.f1969u = com.anythink.basead.exoplayer.b.f6539b;
            this.f24758r.b();
            if (this.f24754n.n()) {
                this.f24766z += remaining - this.J.remaining();
            }
            if (a9) {
                if (!this.f24754n.n()) {
                    PA.T(this.J == this.f24726H);
                    this.f24719A = (this.f24720B * this.f24727I) + this.f24719A;
                }
                this.J = null;
            }
        } catch (C3039cP e6) {
            boolean z8 = e6.f29705u;
            if (z8) {
                if (m() <= 0) {
                    if (this.f24758r.b()) {
                        this.f24754n.getClass();
                    }
                }
                r0 = true;
            }
            C3688oP c3688oP = new C3688oP(e6.f29704n, (TP) this.f24754n.f24037c, r0);
            Mt mt = this.f24752l;
            if (mt != null) {
                mt.n(c3688oP);
            }
            if (z8) {
                throw c3688oP;
            }
            lVar.h(c3688oP);
        }
    }

    public final void j() {
        if (this.f24754n != null) {
            BP bp = this.f24753m;
            if (bp != null) {
                this.f24754n = bp;
                this.f24753m = null;
            }
            try {
                this.f24754n = this.f24754n.m(this.f24756p.c(n((TP) this.f24754n.f24038d)));
            } catch (C3094dP e6) {
                throw new IllegalStateException(new C3580mP(e6, (TP) this.f24754n.f24037c));
            }
        }
        a();
    }

    public final void k(long j9) {
        boolean z8;
        C4045v5 c4045v5;
        boolean z9 = false;
        if (this.f24754n.n()) {
            int i = ((TP) this.f24754n.f24037c).J;
            z8 = true;
        } else {
            z8 = false;
        }
        C3602mu c3602mu = this.f24741X;
        if (z8) {
            c4045v5 = this.f24762v;
            c3602mu.getClass();
            float f6 = c4045v5.f34712a;
            C3160ej c3160ej = (C3160ej) c3602mu.f32776w;
            c3160ej.getClass();
            PA.n(f6 > 0.0f);
            if (c3160ej.f30464c != f6) {
                c3160ej.f30464c = f6;
                c3160ej.i = true;
            }
            float f9 = c4045v5.f34713b;
            PA.n(f9 > 0.0f);
            if (c3160ej.f30465d != f9) {
                c3160ej.f30465d = f9;
                c3160ej.i = true;
            }
        } else {
            c4045v5 = C4045v5.f34711d;
        }
        C4045v5 c4045v52 = c4045v5;
        this.f24762v = c4045v52;
        if (this.f24754n.n()) {
            int i4 = ((TP) this.f24754n.f24037c).J;
            z9 = this.f24763w;
            ((HP) c3602mu.f32775v).f25364j = z9;
        }
        this.f24763w = z9;
        this.f24748g.add(new DP(c4045v52, Math.max(0L, j9), AbstractC3548lu.v(((C3366iP) this.f24754n.f24039e).f31385b, m())));
        d(j9);
        Mt mt = this.f24752l;
        if (mt != null) {
            boolean z10 = this.f24763w;
            C3932t0 c3932t0 = ((GP) mt.f26393u).f25156m1;
            Handler handler = c3932t0.f34332a;
            if (handler != null) {
                handler.post(new B2.D(4, c3932t0, z10));
            }
        }
    }

    public final boolean l() {
        return this.f24758r != null;
    }

    public final long m() {
        if (!this.f24754n.n()) {
            return this.f24719A;
        }
        long j9 = this.f24766z;
        long j10 = this.f24754n.f24036b;
        String str = AbstractC3548lu.f32613a;
        return ((j9 + j10) - 1) / j10;
    }

    public final C3148eP n(TP tp) {
        C3148eP c3148eP = new C3148eP(tp);
        c3148eP.f30349b = this.f24759s;
        c3148eP.f30350c = this.f24735R;
        c3148eP.f30351d = this.f24732O;
        c3148eP.f30353f = -1;
        c3148eP.f30352e = this.f24736S;
        return new C3148eP(c3148eP);
    }

    public final void o() {
        if (this.f24729L) {
            return;
        }
        this.f24729L = true;
        if (this.f24758r.b()) {
            this.f24730M = false;
        }
        C4119wP c4119wP = this.f24758r;
        if (c4119wP.f34992j) {
            return;
        }
        c4119wP.f34992j = true;
        long c4 = c4119wP.c();
        C4173xP c4173xP = c4119wP.f34988e;
        c4173xP.f35170w = c4173xP.d();
        c4173xP.f35150b.getClass();
        c4173xP.f35168u = AbstractC3548lu.u(SystemClock.elapsedRealtime());
        c4173xP.f35171x = c4;
        c4119wP.f34984a.stop();
    }

    public final int p(TP tp) {
        boolean z8;
        int i = tp.J;
        if (!AbstractC3548lu.d(i) || i == 2) {
            z8 = false;
        } else {
            C4065vP c4065vP = new C4065vP(tp);
            c4065vP.f34768I = 2;
            tp = new TP(c4065vP);
            z8 = true;
        }
        int i4 = this.f24756p.a(n(tp)).f31009d;
        if (i4 != 1) {
            if (i4 != 2) {
                return 0;
            }
            if (!z8) {
                return 2;
            }
        }
        return 1;
    }

    public final void q(C3472kP c3472kP) {
        C3213fh c3213fh;
        int i;
        int i4;
        TP tp;
        CP cp = this.f24757q;
        C4313b c4313b = this.f24756p;
        if (cp == null && this.f24742a != null) {
            CP cp2 = new CP(this);
            this.f24757q = cp2;
            c4313b.i();
            if (((C3759pp) c4313b.f35813c) == null) {
                c4313b.f35813c = new C3759pp(Thread.currentThread());
            }
            ((C3759pp) c4313b.f35813c).a(cp2);
        }
        TP tp2 = c3472kP.f32295a;
        if (com.anythink.basead.exoplayer.k.o.f8622w.equals(tp2.f27776o)) {
            int i9 = tp2.J;
            PA.n(AbstractC3548lu.d(i9));
            int f6 = AbstractC3548lu.f(i9);
            int i10 = tp2.f27754G;
            int i11 = f6 * i10;
            RB rb = new RB(4);
            rb.b(this.f24747f);
            rb.a(this.f24745d);
            InterfaceC3050ci[] interfaceC3050ciArr = (InterfaceC3050ci[]) this.f24741X.f32774u;
            PA.o(interfaceC3050ciArr, 2);
            rb.e(2);
            System.arraycopy(interfaceC3050ciArr, 0, rb.f26876a, rb.f26877b, 2);
            rb.f26877b += 2;
            c3213fh = new C3213fh(rb.f());
            if (c3213fh.equals(this.f24755o)) {
                c3213fh = this.f24755o;
            }
            int i12 = tp2.f27757K;
            KP kp = this.f24744c;
            kp.i = i12;
            kp.f25968j = tp2.f27758L;
            this.f24743b.i = c3472kP.f32296b;
            try {
                C3751ph a9 = c3213fh.a(new C3751ph(tp2.f27756I, i10, i9));
                C4065vP c4065vP = new C4065vP(tp2);
                int i13 = a9.f33433c;
                c4065vP.f34768I = i13;
                c4065vP.f34767H = a9.f33431a;
                int i14 = a9.f33432b;
                c4065vP.f34765F = i14;
                c4065vP.f34766G = i14 == i10 ? tp2.f27755H : -1;
                TP tp3 = new TP(c4065vP);
                i4 = i14 * AbstractC3548lu.f(i13);
                i = i11;
                tp = tp3;
            } catch (C2894Zh e6) {
                throw new C3580mP(e6, tp2);
            }
        } else {
            c3213fh = new C3213fh(C3675oC.f33115x);
            i = -1;
            i4 = -1;
            tp = tp2;
        }
        C3213fh c3213fh2 = c3213fh;
        C3148eP n9 = n(tp);
        try {
            C3366iP c4 = c4313b.c(n9);
            int i15 = c4.f31384a;
            TP tp4 = (TP) n9.f30348a;
            if (i15 == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new C3580mP(sb.toString(), tp4);
            }
            if (c4.f31386c == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new C3580mP(sb2.toString(), tp4);
            }
            BQ bq = c3472kP.f32298d;
            BP bp = new BP(tp2, tp, i, i4, c4, c3213fh2, c3472kP.f32297c, bq != null ? bq.f24043a : null);
            if (l()) {
                this.f24753m = bp;
            } else {
                this.f24754n = bp;
            }
        } catch (C3094dP e9) {
            throw new C3580mP(e9, tp2);
        }
    }

    public final void r() {
        this.f24731N = true;
        if (l()) {
            C4119wP c4119wP = this.f24758r;
            C4173xP c4173xP = c4119wP.f34988e;
            if (c4173xP.f35168u != com.anythink.basead.exoplayer.b.f6539b) {
                c4173xP.f35150b.getClass();
                c4173xP.f35168u = AbstractC3548lu.u(SystemClock.elapsedRealtime());
            }
            c4173xP.f35157j = AbstractC3548lu.v(c4173xP.f35153e, c4173xP.d());
            c4173xP.f35156h.a(0);
            if (!c4119wP.f34992j || c4119wP.b()) {
                c4119wP.f34984a.play();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0089, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r9.f1969u) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x024a, code lost:
    
        if (r0 != 0) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j9, ByteBuffer byteBuffer, int i) {
        boolean z8;
        C4119wP c4119wP;
        C4164xG c4164xG;
        LogSessionId logSessionId;
        boolean equals;
        long j10;
        long j11;
        long j12;
        LogSessionId unused;
        ByteBuffer byteBuffer2 = this.f24726H;
        PA.n(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f24753m != null) {
            if (g()) {
                if (this.f24758r != null) {
                    C3366iP c3366iP = (C3366iP) this.f24754n.f24039e;
                    n((TP) this.f24753m.f24038d);
                    if (!((C3366iP) this.f24753m.f24039e).equals(c3366iP)) {
                        o();
                        if (!t()) {
                            a();
                            k(j9);
                        }
                    }
                }
                this.f24754n = this.f24753m;
                this.f24753m = null;
                C4119wP c4119wP2 = this.f24758r;
                if (c4119wP2 != null && c4119wP2.b()) {
                    this.f24754n.getClass();
                }
                k(j9);
            }
            return false;
        }
        boolean l9 = l();
        N1.l lVar = this.i;
        if (!l9) {
            try {
                if (((Exception) lVar.f1970v) != null) {
                    if (Y.get() > 0) {
                    }
                    z8 = true;
                    if (!z8) {
                        try {
                            c4119wP = e((C3366iP) this.f24754n.f24039e);
                        } catch (C3634nP e6) {
                            int i4 = ((C3366iP) this.f24754n.f24039e).f31387d;
                            while (i4 > 1000000) {
                                int i9 = i4 >> 1;
                                BP bp = this.f24754n;
                                int i10 = bp.f24036b;
                                if (i10 == -1) {
                                    i10 = 1;
                                }
                                int i11 = i9 % i10;
                                int i12 = i11 != 0 ? (i10 - i11) + i9 : i9;
                                C2906a1 c2906a1 = new C2906a1((C3366iP) bp.f24039e);
                                c2906a1.f29156d = i12;
                                C3366iP c3366iP2 = new C3366iP(c2906a1);
                                try {
                                    C4119wP e9 = e(c3366iP2);
                                    this.f24754n = this.f24754n.m(c3366iP2);
                                    c4119wP = e9;
                                } catch (C3634nP e10) {
                                    e6.addSuppressed(e10);
                                    i4 = i12;
                                }
                            }
                            this.f24754n.getClass();
                            throw e6;
                        }
                        this.f24758r = c4119wP;
                        C4281zP c4281zP = new C4281zP(this, (C3366iP) this.f24754n.f24039e);
                        this.f24749h = c4281zP;
                        c4119wP.i.a(c4281zP);
                        if (this.f24758r.b()) {
                            this.f24754n.getClass();
                        }
                        VO vo = this.f24751k;
                        if (vo != null) {
                            C4119wP c4119wP3 = this.f24758r;
                            c4119wP3.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                synchronized (vo) {
                                    Mt mt = vo.f28246b;
                                    if (mt == null) {
                                        throw null;
                                    }
                                    logSessionId = (LogSessionId) mt.f26393u;
                                }
                                unused = LogSessionId.LOG_SESSION_ID_NONE;
                                equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                if (!equals) {
                                    c4119wP3.f34984a.setLogSessionId(logSessionId);
                                }
                            }
                        }
                        if (l()) {
                            this.f24758r.f34984a.setVolume(this.f24725G);
                        }
                        this.f24734Q.getClass();
                        AudioDeviceInfo audioDeviceInfo = this.f24735R;
                        if (audioDeviceInfo != null) {
                            this.f24758r.f34984a.setPreferredDevice(audioDeviceInfo);
                        }
                        this.f24722D = true;
                        int audioSessionId = this.f24758r.f34984a.getAudioSessionId();
                        int i13 = this.f24732O;
                        this.f24732O = audioSessionId;
                        Mt mt2 = this.f24752l;
                        if (mt2 != null) {
                            Object obj = this.f24754n.f24039e;
                            MO mo = new MO(28);
                            C3932t0 c3932t0 = ((GP) mt2.f26393u).f25156m1;
                            Handler handler = c3932t0.f34332a;
                            if (handler != null) {
                                handler.post(new RunnableC3418jP(c3932t0, mo, 7));
                            }
                            if (audioSessionId != i13) {
                                this.f24733P = true;
                                BP bp2 = this.f24754n;
                                C2906a1 c2906a12 = new C2906a1((C3366iP) bp2.f24039e);
                                c2906a12.f29157e = this.f24732O;
                                this.f24754n = bp2.m(new C3366iP(c2906a12));
                                BP bp3 = this.f24753m;
                                if (bp3 != null) {
                                    C2906a1 c2906a13 = new C2906a1((C3366iP) bp3.f24039e);
                                    c2906a13.f29157e = this.f24732O;
                                    this.f24753m = bp3.m(new C3366iP(c2906a13));
                                }
                                Mt mt3 = this.f24752l;
                                int i14 = this.f24732O;
                                if (Build.VERSION.SDK_INT >= 35 && (c4164xG = ((GP) mt3.f26393u).f25157o1) != null) {
                                    c4164xG.L(i14);
                                }
                                C3932t0 c3932t02 = ((GP) mt3.f26393u).f25156m1;
                                Handler handler2 = c3932t02.f34332a;
                                if (handler2 != null) {
                                    handler2.post(new L.a(c3932t02, i14, 11));
                                }
                            }
                        }
                    }
                    return false;
                }
                z8 = false;
                if (!z8) {
                }
                return false;
            } catch (C3634nP e11) {
                lVar.h(e11);
                return false;
            }
        }
        lVar.f1970v = null;
        lVar.f1968n = com.anythink.basead.exoplayer.b.f6539b;
        lVar.f1969u = com.anythink.basead.exoplayer.b.f6539b;
        if (this.f24722D) {
            this.f24723E = Math.max(0L, j9);
            this.f24721C = false;
            this.f24722D = false;
            k(j9);
            if (this.f24731N) {
                r();
            }
        }
        if (this.f24726H == null) {
            PA.n(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!this.f24754n.n() && this.f24720B == 0) {
                    int c4 = c(((C3366iP) this.f24754n.f24039e).f31384a, byteBuffer);
                    this.f24720B = c4;
                }
                if (this.f24760t != null) {
                    if (g()) {
                        k(j9);
                        this.f24760t = null;
                    }
                    return false;
                }
                long j13 = this.f24723E;
                BP bp4 = this.f24754n;
                if (bp4.n()) {
                    j10 = -9223372036854775807L;
                    j11 = 0;
                    j12 = this.f24764x / this.f24754n.f24035a;
                } else {
                    j10 = -9223372036854775807L;
                    j11 = 0;
                    j12 = this.f24765y;
                }
                long v6 = AbstractC3548lu.v(((TP) bp4.f24037c).f27756I, j12 - this.f24744c.f25973o) + j13;
                if (!this.f24721C && Math.abs(v6 - j9) > 200000) {
                    Mt mt4 = this.f24752l;
                    if (mt4 != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(v6).length() + 63 + String.valueOf(j9).length());
                        com.anythink.basead.b.c.i.x(sb, "Unexpected audio track timestamp discontinuity: expected ", v6, ", got ");
                        sb.append(j9);
                        mt4.n(new K2.m(sb.toString()));
                    }
                    this.f24721C = true;
                }
                if (this.f24721C) {
                    if (g()) {
                        long j14 = j9 - v6;
                        this.f24723E += j14;
                        this.f24721C = false;
                        k(j9);
                        Mt mt5 = this.f24752l;
                        if (mt5 != null && j14 != j11) {
                            ((GP) mt5.f26393u).f25162u1 = true;
                        }
                    }
                    return false;
                }
                if (this.f24754n.n()) {
                    this.f24764x += byteBuffer.remaining();
                } else {
                    this.f24765y = (this.f24720B * i) + this.f24765y;
                }
                this.f24726H = byteBuffer;
                this.f24727I = i;
            }
            return true;
        }
        j10 = -9223372036854775807L;
        j11 = 0;
        f(j9);
        if (!this.f24726H.hasRemaining()) {
            this.f24726H = null;
            this.f24727I = 0;
            return true;
        }
        C4119wP c4119wP4 = this.f24758r;
        long c9 = c4119wP4.c();
        C4173xP c4173xP = c4119wP4.f34988e;
        if (c4173xP.f35169v != j10 && c9 > j11) {
            c4173xP.f35150b.getClass();
            if (SystemClock.elapsedRealtime() - c4173xP.f35169v >= 200) {
                AbstractC3217fl.I("DefaultAudioSink", "Resetting stalled audio output");
                a();
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        if (!l()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f24758r.b() && this.f24730M) {
            return false;
        }
        long m8 = m();
        long a9 = this.f24758r.f34988e.a();
        C4119wP c4119wP = this.f24758r;
        c4119wP.getClass();
        return m8 > AbstractC3548lu.w(a9, (long) c4119wP.f34984a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
