package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.rP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3836rP {
    public static final AtomicInteger Y = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public long f33590A;

    /* renamed from: B, reason: collision with root package name */
    public int f33591B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f33592C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f33593D;

    /* renamed from: E, reason: collision with root package name */
    public long f33594E;

    /* renamed from: F, reason: collision with root package name */
    public long f33595F;

    /* renamed from: G, reason: collision with root package name */
    public float f33596G;

    /* renamed from: H, reason: collision with root package name */
    public ByteBuffer f33597H;

    /* renamed from: I, reason: collision with root package name */
    public int f33598I;
    public ByteBuffer J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f33599K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f33600L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f33601M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f33602N;

    /* renamed from: O, reason: collision with root package name */
    public int f33603O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f33604P;

    /* renamed from: Q, reason: collision with root package name */
    public C2939ao f33605Q;

    /* renamed from: R, reason: collision with root package name */
    public AudioDeviceInfo f33606R;

    /* renamed from: S, reason: collision with root package name */
    public int f33607S;

    /* renamed from: T, reason: collision with root package name */
    public long f33608T;

    /* renamed from: U, reason: collision with root package name */
    public long f33609U;

    /* renamed from: V, reason: collision with root package name */
    public long f33610V;

    /* renamed from: W, reason: collision with root package name */
    public Handler f33611W;

    /* renamed from: X, reason: collision with root package name */
    public final C3481ku f33612X;

    /* renamed from: a, reason: collision with root package name */
    public final Context f33613a;

    /* renamed from: b, reason: collision with root package name */
    public final C3513lP f33614b;

    /* renamed from: c, reason: collision with root package name */
    public final C4160xP f33615c;

    /* renamed from: d, reason: collision with root package name */
    public final C3363ij f33616d;

    /* renamed from: e, reason: collision with root package name */
    public final C3363ij f33617e;

    /* renamed from: f, reason: collision with root package name */
    public final C3500lC f33618f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f33619g;

    /* renamed from: h, reason: collision with root package name */
    public C3567mP f33620h;
    public final N1.l i;

    /* renamed from: j, reason: collision with root package name */
    public final N1.l f33621j;

    /* renamed from: k, reason: collision with root package name */
    public IO f33622k;

    /* renamed from: l, reason: collision with root package name */
    public C3534lt f33623l;

    /* renamed from: m, reason: collision with root package name */
    public C3675oP f33624m;

    /* renamed from: n, reason: collision with root package name */
    public C3675oP f33625n;

    /* renamed from: o, reason: collision with root package name */
    public C2932ah f33626o;

    /* renamed from: p, reason: collision with root package name */
    public final C4300b f33627p;

    /* renamed from: q, reason: collision with root package name */
    public C3729pP f33628q;

    /* renamed from: r, reason: collision with root package name */
    public C3405jP f33629r;

    /* renamed from: s, reason: collision with root package name */
    public C2744Qj f33630s;

    /* renamed from: t, reason: collision with root package name */
    public C3783qP f33631t;

    /* renamed from: u, reason: collision with root package name */
    public C3783qP f33632u;

    /* renamed from: v, reason: collision with root package name */
    public C3924t5 f33633v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33634w;

    /* renamed from: x, reason: collision with root package name */
    public long f33635x;

    /* renamed from: y, reason: collision with root package name */
    public long f33636y;

    /* renamed from: z, reason: collision with root package name */
    public long f33637z;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0081, code lost:
    
        r9 = r0.getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3836rP(C3621nP c3621nP) {
        int deviceId;
        Context context = c3621nP.f32726a;
        this.f33613a = context == null ? null : context.getApplicationContext();
        this.f33630s = C2744Qj.f27058b;
        this.f33612X = c3621nP.f32731f;
        this.f33627p = c3621nP.f32730e;
        C3513lP c3513lP = new C3513lP();
        this.f33614b = c3513lP;
        C4160xP c4160xP = new C4160xP();
        c4160xP.f35016m = AbstractC3159eu.f29994b;
        this.f33615c = c4160xP;
        this.f33616d = new C3363ij(0);
        this.f33617e = new C3363ij(1);
        this.f33618f = RB.k(c4160xP, c3513lP);
        this.f33596G = 1.0f;
        this.f33603O = 0;
        this.f33605Q = new C2939ao();
        C3924t5 c3924t5 = C3924t5.f34215d;
        this.f33632u = new C3783qP(c3924t5, 0L, 0L);
        this.f33633v = c3924t5;
        this.f33634w = false;
        this.f33619g = new ArrayDeque();
        this.i = new N1.l();
        this.f33621j = new N1.l();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && deviceId != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.f33607S = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i, ByteBuffer byteBuffer) {
        int i6;
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
                i6 = 0;
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
                i6 = i17 + i16;
            }
            int i20 = byteBuffer.get(26 + i6) + 27 + i6;
            return (int) ((AbstractC3043cl.F(byteBuffer.get(i20), byteBuffer.limit() - i20 > 1 ? byteBuffer.get(i20 + 1) : (byte) 0) * 48000) / 1000000);
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
                    String str = AbstractC3159eu.f29993a;
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
                                    String str2 = AbstractC3159eu.f29993a;
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
                            return MA.n(new C4233yr(bArr, 16)).f3773c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(D.y.m(i, "Unexpected audio encoding: ", new StringBuilder(String.valueOf(i).length() + 27)));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return AbstractC3043cl.f29573u[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
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
            this.f33635x = 0L;
            this.f33636y = 0L;
            this.f33637z = 0L;
            this.f33590A = 0L;
            this.f33591B = 0;
            this.f33632u = new C3783qP(this.f33633v, 0L, 0L);
            this.f33594E = 0L;
            this.f33631t = null;
            this.f33619g.clear();
            this.f33597H = null;
            this.f33598I = 0;
            this.J = null;
            this.f33600L = false;
            this.f33599K = false;
            this.f33601M = false;
            this.f33615c.f35018o = 0L;
            d(com.anythink.basead.exoplayer.b.f6382b);
            this.f33620h = null;
            C3675oP c3675oP = this.f33624m;
            if (c3675oP != null) {
                this.f33625n = c3675oP;
                this.f33624m = null;
            }
            Y.incrementAndGet();
            C3405jP c3405jP = this.f33629r;
            if (c3405jP.f31252e.f31427d.getPlayState() == 3) {
                c3405jP.f31248a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && c3405jP.b()) {
                C3481ku c3481ku = c3405jP.f31255h;
                c3481ku.getClass();
                ((C3405jP) c3481ku.f31665w).f31248a.unregisterStreamEventCallback((C3353iP) c3481ku.f31664v);
                ((Handler) c3481ku.f31663u).removeCallbacksAndMessages(null);
            }
            ME me = c3405jP.f31251d;
            if (me != null) {
                C3245gP c3245gP = (C3245gP) me.f26273e;
                c3245gP.getClass();
                ((AudioTrack) me.f26270b).removeOnRoutingChangedListener(c3245gP);
                me.f26273e = null;
                c3405jP.f31251d = null;
            }
            AudioTrack audioTrack = c3405jP.f31248a;
            C3530lp c3530lp = c3405jP.i;
            Handler p9 = AbstractC3159eu.p();
            synchronized (C3405jP.f31245o) {
                try {
                    if (C3405jP.f31246p == null) {
                        C3405jP.f31246p = Executors.newSingleThreadScheduledExecutor(new It());
                    }
                    C3405jP.f31247q++;
                    C3405jP.f31246p.schedule(new RunnableC3865s0(16, audioTrack, p9, c3530lp), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f33629r = null;
        }
        N1.l lVar = this.f33621j;
        lVar.f1926v = null;
        lVar.f1924n = com.anythink.basead.exoplayer.b.f6382b;
        lVar.f1925u = com.anythink.basead.exoplayer.b.f6382b;
        N1.l lVar2 = this.i;
        lVar2.f1926v = null;
        lVar2.f1924n = com.anythink.basead.exoplayer.b.f6382b;
        lVar2.f1925u = com.anythink.basead.exoplayer.b.f6382b;
        this.f33609U = 0L;
        this.f33610V = 0L;
        Handler handler = this.f33611W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        a();
        C3500lC c3500lC = this.f33618f;
        int i = c3500lC.f31747w;
        for (int i6 = 0; i6 < i; i6++) {
            ((InterfaceC3147ei) c3500lC.get(i6)).j();
        }
        this.f33616d.j();
        this.f33617e.j();
        C2932ah c2932ah = this.f33626o;
        if (c2932ah != null) {
            int i9 = 0;
            while (true) {
                C3500lC c3500lC2 = c2932ah.f29070a;
                if (i9 >= c3500lC2.f31747w) {
                    break;
                }
                InterfaceC3147ei interfaceC3147ei = (InterfaceC3147ei) c3500lC2.get(i9);
                interfaceC3147ei.f(C2640Kh.f25958d);
                interfaceC3147ei.j();
                i9++;
            }
            c2932ah.f29071b.clear();
            c2932ah.f29072c = new ByteBuffer[0];
            C3630nh c3630nh = C3630nh.f32748e;
            c2932ah.f29073d = false;
        }
        this.f33602N = false;
    }

    public final void d(long j6) {
        long j9;
        C3675oP c3675oP = this.f33625n;
        this.f33626o = (C2932ah) c3675oP.f32902f;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            j9 = 0;
        } else {
            j9 = j6 - this.f33595F;
            if (((AbstractC3604n8) c3675oP.f32903g) != AbstractC3604n8.f32690a && c3675oP.f32904h != null) {
                K7 k72 = new K7();
                C3675oP c3675oP2 = this.f33625n;
                ((AbstractC3604n8) c3675oP2.f32903g).o(c3675oP2.f32904h, k72);
            }
        }
        C2932ah c2932ah = this.f33626o;
        C2487Bh c2487Bh = new C2487Bh();
        C3675oP c3675oP3 = this.f33625n;
        c2487Bh.f23933b = (AbstractC3604n8) c3675oP3.f32903g;
        c2487Bh.f23934c = c3675oP3.f32904h;
        c2487Bh.f23932a = j9;
        C2640Kh a9 = c2487Bh.a();
        ArrayList arrayList = c2932ah.f29071b;
        arrayList.clear();
        c2932ah.f29073d = false;
        int i = 0;
        while (true) {
            C3500lC c3500lC = c2932ah.f29070a;
            if (i >= c3500lC.f31747w) {
                break;
            }
            InterfaceC3147ei interfaceC3147ei = (InterfaceC3147ei) c3500lC.get(i);
            interfaceC3147ei.f(a9);
            if (interfaceC3147ei.i()) {
                C2487Bh c2487Bh2 = new C2487Bh();
                long j10 = a9.f25959a;
                c2487Bh2.f23932a = j10;
                c2487Bh2.f23933b = a9.f25960b;
                c2487Bh2.f23934c = a9.f25961c;
                c2487Bh2.f23932a = interfaceC3147ei.b(j10);
                a9 = c2487Bh2.a();
                arrayList.add(interfaceC3147ei);
            }
            i++;
        }
        c2932ah.f29072c = new ByteBuffer[arrayList.size()];
        for (int i6 = 0; i6 <= c2932ah.e(); i6++) {
            c2932ah.f29072c[i6] = ((InterfaceC3147ei) arrayList.get(i6)).e();
        }
    }

    public final C3405jP e(VO vo) {
        try {
            return this.f33627p.f(vo);
        } catch (UO e9) {
            String valueOf = String.valueOf((DP) this.f33625n.f32899c);
            int i = vo.f28192b;
            int length = String.valueOf(i).length();
            int i6 = vo.f28193c;
            int length2 = String.valueOf(i6).length();
            int i9 = vo.f28191a;
            int length3 = String.valueOf(i9).length();
            int i10 = vo.f28194d;
            StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i10).length() + 2 + valueOf.length());
            u1.h.h(sb, "AudioTrack init failed 0 Config(", i, ", ", i6);
            u1.h.h(sb, ", ", i9, ", ", i10);
            C2923aP c2923aP = new C2923aP(D.y.s(sb, ") ", valueOf, ""), e9);
            C3534lt c3534lt = this.f33623l;
            if (c3534lt == null) {
                throw c2923aP;
            }
            c3534lt.o(c2923aP);
            throw c2923aP;
        }
    }

    public final void f(long j6) {
        ByteBuffer byteBuffer;
        i(j6);
        if (this.J != null) {
            return;
        }
        if (!this.f33626o.b()) {
            ByteBuffer byteBuffer2 = this.f33597H;
            if (byteBuffer2 != null) {
                h(byteBuffer2);
                i(j6);
                return;
            }
            return;
        }
        while (!this.f33626o.c()) {
            do {
                C2932ah c2932ah = this.f33626o;
                if (c2932ah.b()) {
                    ByteBuffer byteBuffer3 = c2932ah.f29072c[c2932ah.e()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c2932ah.d(InterfaceC3147ei.f29965a);
                        byteBuffer = c2932ah.f29072c[c2932ah.e()];
                    }
                } else {
                    byteBuffer = InterfaceC3147ei.f29965a;
                }
                if (byteBuffer.hasRemaining()) {
                    h(byteBuffer);
                    i(j6);
                } else {
                    ByteBuffer byteBuffer4 = this.f33597H;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C2932ah c2932ah2 = this.f33626o;
                    ByteBuffer byteBuffer5 = this.f33597H;
                    if (c2932ah2.b() && !c2932ah2.f29073d) {
                        c2932ah2.d(byteBuffer5);
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
        if (!this.f33626o.b()) {
            i(Long.MIN_VALUE);
            return this.J == null;
        }
        C2932ah c2932ah = this.f33626o;
        if (c2932ah.b() && !c2932ah.f29073d) {
            c2932ah.f29073d = true;
            ((InterfaceC3147ei) c2932ah.f29071b.get(0)).d();
        }
        f(Long.MIN_VALUE);
        if (!this.f33626o.c() || ((byteBuffer = this.J) != null && byteBuffer.hasRemaining())) {
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
        int i6;
        int i9;
        float max;
        float f3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        double max2;
        double d2;
        AbstractC2772Sd.H(this.J == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f33625n.n()) {
                int w6 = (int) AbstractC3159eu.w(AbstractC3159eu.u(20L), ((VO) this.f33625n.f32901e).f28192b, 1000000L, RoundingMode.UP);
                long m4 = m();
                long j6 = w6;
                if (m4 < j6) {
                    C3675oP c3675oP = this.f33625n;
                    VO vo = (VO) c3675oP.f32901e;
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i17 = (int) m4;
                    while (byteBuffer.hasRemaining() && i17 < w6) {
                        int i18 = vo.f28191a;
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
                                            i6 = (byteBuffer.get() & 255) << 16;
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
                                i9 = (int) f3;
                            } else {
                                i9 = (byteBuffer.get() & 255) << 24;
                            }
                            int i19 = (int) ((i9 * i17) / j6);
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
                            if (byteBuffer.position() != c3675oP.f32898b + position) {
                                i17++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i6 = (byteBuffer.get() & 255) << 24;
                        }
                        i9 = i | i6;
                        int i192 = (int) ((i9 * i17) / j6);
                        if (i18 != 2) {
                        }
                        if (byteBuffer.position() != c3675oP.f32898b + position) {
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

    public final void i(long j6) {
        if (this.J == null) {
            return;
        }
        N1.l lVar = this.f33621j;
        if (((Exception) lVar.f1926v) != null && (Y.get() > 0 || SystemClock.elapsedRealtime() < lVar.f1925u)) {
            return;
        }
        int remaining = this.J.remaining();
        try {
            boolean a9 = this.f33629r.a(this.f33598I, this.J);
            this.f33608T = SystemClock.elapsedRealtime();
            lVar.f1926v = null;
            lVar.f1924n = com.anythink.basead.exoplayer.b.f6382b;
            lVar.f1925u = com.anythink.basead.exoplayer.b.f6382b;
            this.f33629r.b();
            if (this.f33625n.n()) {
                this.f33637z += remaining - this.J.remaining();
            }
            if (a9) {
                if (!this.f33625n.n()) {
                    AbstractC2772Sd.H(this.J == this.f33597H);
                    this.f33590A = (this.f33591B * this.f33598I) + this.f33590A;
                }
                this.J = null;
            }
        } catch (PO e9) {
            boolean z3 = e9.f26814u;
            if (z3) {
                if (m() <= 0) {
                    if (this.f33629r.b()) {
                        this.f33625n.getClass();
                    }
                }
                r0 = true;
            }
            C2977bP c2977bP = new C2977bP(e9.f26813n, (DP) this.f33625n.f32899c, r0);
            C3534lt c3534lt = this.f33623l;
            if (c3534lt != null) {
                c3534lt.o(c2977bP);
            }
            if (z3) {
                throw c2977bP;
            }
            lVar.h(c2977bP);
        }
    }

    public final void j() {
        if (this.f33625n != null) {
            C3675oP c3675oP = this.f33624m;
            if (c3675oP != null) {
                this.f33625n = c3675oP;
                this.f33624m = null;
            }
            try {
                this.f33625n = this.f33625n.m(this.f33627p.c(n((DP) this.f33625n.f32900d)));
            } catch (QO e9) {
                throw new IllegalStateException(new ZO(e9, (DP) this.f33625n.f32899c));
            }
        }
        a();
    }

    public final void k(long j6) {
        boolean z3;
        C3924t5 c3924t5;
        boolean z6 = false;
        if (this.f33625n.n()) {
            int i = ((DP) this.f33625n.f32899c).f24411K;
            z3 = true;
        } else {
            z3 = false;
        }
        C3481ku c3481ku = this.f33612X;
        if (z3) {
            c3924t5 = this.f33633v;
            c3481ku.getClass();
            float f3 = c3924t5.f34216a;
            C3041cj c3041cj = (C3041cj) c3481ku.f31665w;
            c3041cj.getClass();
            AbstractC2772Sd.i(f3 > 0.0f);
            if (c3041cj.f29538c != f3) {
                c3041cj.f29538c = f3;
                c3041cj.i = true;
            }
            float f9 = c3924t5.f34217b;
            AbstractC2772Sd.i(f9 > 0.0f);
            if (c3041cj.f29539d != f9) {
                c3041cj.f29539d = f9;
                c3041cj.i = true;
            }
        } else {
            c3924t5 = C3924t5.f34215d;
        }
        C3924t5 c3924t52 = c3924t5;
        this.f33633v = c3924t52;
        if (this.f33625n.n()) {
            int i6 = ((DP) this.f33625n.f32899c).f24411K;
            z6 = this.f33634w;
            ((C3998uP) c3481ku.f31664v).f34535j = z6;
        }
        this.f33634w = z6;
        this.f33619g.add(new C3783qP(c3924t52, Math.max(0L, j6), AbstractC3159eu.v(((VO) this.f33625n.f32901e).f28192b, m())));
        d(j6);
        C3534lt c3534lt = this.f33623l;
        if (c3534lt != null) {
            boolean z9 = this.f33634w;
            S0.l lVar = ((C3944tP) c3534lt.f31863u).f34279l1;
            Handler handler = (Handler) lVar.f2797u;
            if (handler != null) {
                handler.post(new C2.C(4, lVar, z9));
            }
        }
    }

    public final boolean l() {
        return this.f33629r != null;
    }

    public final long m() {
        if (!this.f33625n.n()) {
            return this.f33590A;
        }
        long j6 = this.f33637z;
        long j9 = this.f33625n.f32898b;
        String str = AbstractC3159eu.f29993a;
        return ((j6 + j9) - 1) / j9;
    }

    public final RO n(DP dp) {
        RO ro = new RO(dp);
        ro.f27200b = this.f33630s;
        ro.f27201c = this.f33606R;
        ro.f27202d = this.f33603O;
        ro.f27204f = -1;
        ro.f27203e = this.f33607S;
        return new RO(ro);
    }

    public final void o() {
        if (this.f33600L) {
            return;
        }
        this.f33600L = true;
        if (this.f33629r.b()) {
            this.f33601M = false;
        }
        C3405jP c3405jP = this.f33629r;
        if (c3405jP.f31256j) {
            return;
        }
        c3405jP.f31256j = true;
        long c9 = c3405jP.c();
        C3459kP c3459kP = c3405jP.f31252e;
        c3459kP.f31445w = c3459kP.d();
        c3459kP.f31425b.getClass();
        c3459kP.f31443u = AbstractC3159eu.u(SystemClock.elapsedRealtime());
        c3459kP.f31446x = c9;
        c3405jP.f31248a.stop();
    }

    public final int p(DP dp) {
        boolean z3;
        int i = dp.f24411K;
        if (!AbstractC3159eu.d(i) || i == 2) {
            z3 = false;
        } else {
            C3299hP c3299hP = new C3299hP(dp);
            c3299hP.J = 2;
            dp = new DP(c3299hP);
            z3 = true;
        }
        int i6 = this.f33627p.a(n(dp)).f27739d;
        if (i6 != 1) {
            if (i6 != 2) {
                return 0;
            }
            if (!z3) {
                return 2;
            }
        }
        return 1;
    }

    public final void q(YO yo) {
        C2932ah c2932ah;
        int i;
        int i6;
        DP dp;
        C3729pP c3729pP = this.f33628q;
        C4300b c4300b = this.f33627p;
        if (c3729pP == null && this.f33613a != null) {
            C3729pP c3729pP2 = new C3729pP(this);
            this.f33628q = c3729pP2;
            c4300b.i();
            if (((C3530lp) c4300b.f35650c) == null) {
                c4300b.f35650c = new C3530lp(Thread.currentThread());
            }
            ((C3530lp) c4300b.f35650c).a(c3729pP2);
        }
        DP dp2 = yo.f28677a;
        if (com.anythink.basead.exoplayer.k.o.f8465w.equals(dp2.f24431o)) {
            int i9 = dp2.f24411K;
            AbstractC2772Sd.i(AbstractC3159eu.d(i9));
            int f3 = AbstractC3159eu.f(i9);
            int i10 = dp2.f24409H;
            int i11 = f3 * i10;
            OB ob = new OB(4);
            ob.b(this.f33618f);
            ob.a(this.f33616d);
            InterfaceC3147ei[] interfaceC3147eiArr = (InterfaceC3147ei[]) this.f33612X.f31663u;
            AbstractC2772Sd.j(interfaceC3147eiArr, 2);
            ob.e(2);
            System.arraycopy(interfaceC3147eiArr, 0, ob.f26265a, ob.f26266b, 2);
            ob.f26266b += 2;
            c2932ah = new C2932ah(ob.f());
            if (c2932ah.equals(this.f33626o)) {
                c2932ah = this.f33626o;
            }
            int i12 = dp2.f24412L;
            C4160xP c4160xP = this.f33615c;
            c4160xP.i = i12;
            c4160xP.f35013j = dp2.f24413M;
            this.f33614b.i = yo.f28678b;
            try {
                C3630nh a9 = c2932ah.a(new C3630nh(dp2.J, i10, i9));
                C3299hP c3299hP = new C3299hP(dp2);
                int i13 = a9.f32751c;
                c3299hP.J = i13;
                c3299hP.f30774I = a9.f32749a;
                int i14 = a9.f32750b;
                c3299hP.f30772G = i14;
                c3299hP.f30773H = i14 == i10 ? dp2.f24410I : -1;
                DP dp3 = new DP(c3299hP);
                i6 = i14 * AbstractC3159eu.f(i13);
                i = i11;
                dp = dp3;
            } catch (C2840Wh e9) {
                throw new ZO(e9, dp2);
            }
        } else {
            c2932ah = new C2932ah(C3500lC.f31745x);
            i = -1;
            i6 = -1;
            dp = dp2;
        }
        C2932ah c2932ah2 = c2932ah;
        RO n9 = n(dp);
        try {
            VO c9 = c4300b.c(n9);
            int i15 = c9.f28191a;
            DP dp4 = (DP) n9.f27199a;
            if (i15 == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new ZO(sb.toString(), dp4);
            }
            if (c9.f28193c == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new ZO(sb2.toString(), dp4);
            }
            C3676oQ c3676oQ = yo.f28680d;
            C3675oP c3675oP = new C3675oP(dp2, dp, i, i6, c9, c2932ah2, yo.f28679c, c3676oQ != null ? c3676oQ.f32905a : null);
            if (l()) {
                this.f33624m = c3675oP;
            } else {
                this.f33625n = c3675oP;
            }
        } catch (QO e10) {
            throw new ZO(e10, dp2);
        }
    }

    public final void r() {
        this.f33602N = true;
        if (l()) {
            C3405jP c3405jP = this.f33629r;
            C3459kP c3459kP = c3405jP.f31252e;
            if (c3459kP.f31443u != com.anythink.basead.exoplayer.b.f6382b) {
                c3459kP.f31425b.getClass();
                c3459kP.f31443u = AbstractC3159eu.u(SystemClock.elapsedRealtime());
            }
            c3459kP.f31432j = AbstractC3159eu.v(c3459kP.f31428e, c3459kP.d());
            c3459kP.f31431h.a(0);
            if (!c3405jP.f31256j || c3405jP.b()) {
                c3405jP.f31248a.play();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0089, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r9.f1925u) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x024e, code lost:
    
        if (r0 != 0) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j6, ByteBuffer byteBuffer, int i) {
        boolean z3;
        C3405jP c3405jP;
        S0.c cVar;
        LogSessionId logSessionId;
        boolean equals;
        long j9;
        long j10;
        long j11;
        LogSessionId unused;
        ByteBuffer byteBuffer2 = this.f33597H;
        AbstractC2772Sd.i(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f33624m != null) {
            if (g()) {
                if (this.f33629r != null) {
                    VO vo = (VO) this.f33625n.f32901e;
                    n((DP) this.f33624m.f32900d);
                    if (!((VO) this.f33624m.f32901e).equals(vo)) {
                        o();
                        if (!t()) {
                            a();
                            k(j6);
                        }
                    }
                }
                this.f33625n = this.f33624m;
                this.f33624m = null;
                C3405jP c3405jP2 = this.f33629r;
                if (c3405jP2 != null && c3405jP2.b()) {
                    this.f33625n.getClass();
                }
                k(j6);
            }
            return false;
        }
        boolean l9 = l();
        N1.l lVar = this.i;
        if (!l9) {
            try {
                if (((Exception) lVar.f1926v) != null) {
                    if (Y.get() > 0) {
                    }
                    z3 = true;
                    if (!z3) {
                        try {
                            c3405jP = e((VO) this.f33625n.f32901e);
                        } catch (C2923aP e9) {
                            int i6 = ((VO) this.f33625n.f32901e).f28194d;
                            while (i6 > 1000000) {
                                int i9 = i6 >> 1;
                                C3675oP c3675oP = this.f33625n;
                                int i10 = c3675oP.f32898b;
                                if (i10 == -1) {
                                    i10 = 1;
                                }
                                int i11 = i9 % i10;
                                int i12 = i11 != 0 ? (i10 - i11) + i9 : i9;
                                C3006c1 c3006c1 = new C3006c1((VO) c3675oP.f32901e);
                                c3006c1.f29411d = i12;
                                VO vo2 = new VO(c3006c1);
                                try {
                                    C3405jP e10 = e(vo2);
                                    this.f33625n = this.f33625n.m(vo2);
                                    c3405jP = e10;
                                } catch (C2923aP e11) {
                                    e9.addSuppressed(e11);
                                    i6 = i12;
                                }
                            }
                            this.f33625n.getClass();
                            throw e9;
                        }
                        this.f33629r = c3405jP;
                        C3567mP c3567mP = new C3567mP(this, (VO) this.f33625n.f32901e);
                        this.f33620h = c3567mP;
                        c3405jP.i.a(c3567mP);
                        if (this.f33629r.b()) {
                            this.f33625n.getClass();
                        }
                        IO io = this.f33622k;
                        if (io != null) {
                            C3405jP c3405jP3 = this.f33629r;
                            c3405jP3.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                synchronized (io) {
                                    C3534lt c3534lt = io.f25500b;
                                    if (c3534lt == null) {
                                        throw null;
                                    }
                                    logSessionId = (LogSessionId) c3534lt.f31863u;
                                }
                                unused = LogSessionId.LOG_SESSION_ID_NONE;
                                equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                if (!equals) {
                                    c3405jP3.f31248a.setLogSessionId(logSessionId);
                                }
                            }
                        }
                        if (l()) {
                            this.f33629r.f31248a.setVolume(this.f33596G);
                        }
                        this.f33605Q.getClass();
                        AudioDeviceInfo audioDeviceInfo = this.f33606R;
                        if (audioDeviceInfo != null) {
                            this.f33629r.f31248a.setPreferredDevice(audioDeviceInfo);
                        }
                        this.f33593D = true;
                        int audioSessionId = this.f33629r.f31248a.getAudioSessionId();
                        int i13 = this.f33603O;
                        this.f33603O = audioSessionId;
                        C3534lt c3534lt2 = this.f33623l;
                        if (c3534lt2 != null) {
                            Object obj = this.f33625n.f32901e;
                            C4267zO c4267zO = new C4267zO(28);
                            S0.l lVar2 = ((C3944tP) c3534lt2.f31863u).f34279l1;
                            Handler handler = (Handler) lVar2.f2797u;
                            if (handler != null) {
                                handler.post(new WO(lVar2, c4267zO, 7));
                            }
                            if (audioSessionId != i13) {
                                this.f33604P = true;
                                C3675oP c3675oP2 = this.f33625n;
                                C3006c1 c3006c12 = new C3006c1((VO) c3675oP2.f32901e);
                                c3006c12.f29412e = this.f33603O;
                                this.f33625n = c3675oP2.m(new VO(c3006c12));
                                C3675oP c3675oP3 = this.f33624m;
                                if (c3675oP3 != null) {
                                    C3006c1 c3006c13 = new C3006c1((VO) c3675oP3.f32901e);
                                    c3006c13.f29412e = this.f33603O;
                                    this.f33624m = c3675oP3.m(new VO(c3006c13));
                                }
                                C3534lt c3534lt3 = this.f33623l;
                                int i14 = this.f33603O;
                                if (Build.VERSION.SDK_INT >= 35 && (cVar = ((C3944tP) c3534lt3.f31863u).n1) != null) {
                                    cVar.s(i14);
                                }
                                S0.l lVar3 = ((C3944tP) c3534lt3.f31863u).f34279l1;
                                Handler handler2 = (Handler) lVar3.f2797u;
                                if (handler2 != null) {
                                    handler2.post(new L.a(lVar3, i14, 11));
                                }
                            }
                        }
                    }
                    return false;
                }
                z3 = false;
                if (!z3) {
                }
                return false;
            } catch (C2923aP e12) {
                lVar.h(e12);
                return false;
            }
        }
        lVar.f1926v = null;
        lVar.f1924n = com.anythink.basead.exoplayer.b.f6382b;
        lVar.f1925u = com.anythink.basead.exoplayer.b.f6382b;
        if (this.f33593D) {
            this.f33594E = Math.max(0L, j6);
            this.f33592C = false;
            this.f33593D = false;
            k(j6);
            if (this.f33602N) {
                r();
            }
        }
        if (this.f33597H == null) {
            AbstractC2772Sd.i(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!this.f33625n.n() && this.f33591B == 0) {
                    int c9 = c(((VO) this.f33625n.f32901e).f28191a, byteBuffer);
                    this.f33591B = c9;
                }
                if (this.f33631t != null) {
                    if (g()) {
                        k(j6);
                        this.f33631t = null;
                    }
                    return false;
                }
                long j12 = this.f33594E;
                C3675oP c3675oP4 = this.f33625n;
                if (c3675oP4.n()) {
                    j9 = -9223372036854775807L;
                    j10 = 0;
                    j11 = this.f33635x / this.f33625n.f32897a;
                } else {
                    j9 = -9223372036854775807L;
                    j10 = 0;
                    j11 = this.f33636y;
                }
                long v9 = AbstractC3159eu.v(((DP) c3675oP4.f32899c).J, j11 - this.f33615c.f35018o) + j12;
                if (!this.f33592C && Math.abs(v9 - j6) > 200000) {
                    C3534lt c3534lt4 = this.f33623l;
                    if (c3534lt4 != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(v9).length() + 63 + String.valueOf(j6).length());
                        D.y.x(sb, "Unexpected audio track timestamp discontinuity: expected ", v9, ", got ");
                        sb.append(j6);
                        c3534lt4.o(new L2.m(sb.toString()));
                    }
                    this.f33592C = true;
                }
                if (this.f33592C) {
                    if (g()) {
                        long j13 = j6 - v9;
                        this.f33594E += j13;
                        this.f33592C = false;
                        k(j6);
                        C3534lt c3534lt5 = this.f33623l;
                        if (c3534lt5 != null && j13 != j10) {
                            ((C3944tP) c3534lt5.f31863u).f34285t1 = true;
                        }
                    }
                    return false;
                }
                if (this.f33625n.n()) {
                    this.f33635x += byteBuffer.remaining();
                } else {
                    this.f33636y = (this.f33591B * i) + this.f33636y;
                }
                this.f33597H = byteBuffer;
                this.f33598I = i;
            }
            return true;
        }
        j9 = -9223372036854775807L;
        j10 = 0;
        f(j6);
        if (!this.f33597H.hasRemaining()) {
            this.f33597H = null;
            this.f33598I = 0;
            return true;
        }
        C3405jP c3405jP4 = this.f33629r;
        long c10 = c3405jP4.c();
        C3459kP c3459kP = c3405jP4.f31252e;
        if (c3459kP.f31444v != j9 && c10 > j10) {
            c3459kP.f31425b.getClass();
            if (SystemClock.elapsedRealtime() - c3459kP.f31444v >= 200) {
                AbstractC2968bG.y("DefaultAudioSink", "Resetting stalled audio output");
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
        if (Build.VERSION.SDK_INT >= 29 && this.f33629r.b() && this.f33601M) {
            return false;
        }
        long m4 = m();
        long a9 = this.f33629r.f31252e.a();
        C3405jP c3405jP = this.f33629r;
        c3405jP.getClass();
        return m4 > AbstractC3159eu.w(a9, (long) c3405jP.f31248a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
