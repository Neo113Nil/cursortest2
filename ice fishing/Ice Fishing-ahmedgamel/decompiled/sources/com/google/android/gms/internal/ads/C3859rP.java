package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.rP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3859rP {
    public static final AtomicInteger Y = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public long f34358A;

    /* renamed from: B, reason: collision with root package name */
    public int f34359B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f34360C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f34361D;

    /* renamed from: E, reason: collision with root package name */
    public long f34362E;

    /* renamed from: F, reason: collision with root package name */
    public long f34363F;

    /* renamed from: G, reason: collision with root package name */
    public float f34364G;

    /* renamed from: H, reason: collision with root package name */
    public ByteBuffer f34365H;

    /* renamed from: I, reason: collision with root package name */
    public int f34366I;
    public ByteBuffer J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f34367K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f34368L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f34369M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f34370N;

    /* renamed from: O, reason: collision with root package name */
    public int f34371O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f34372P;

    /* renamed from: Q, reason: collision with root package name */
    public C3016bo f34373Q;

    /* renamed from: R, reason: collision with root package name */
    public AudioDeviceInfo f34374R;

    /* renamed from: S, reason: collision with root package name */
    public int f34375S;

    /* renamed from: T, reason: collision with root package name */
    public long f34376T;

    /* renamed from: U, reason: collision with root package name */
    public long f34377U;

    /* renamed from: V, reason: collision with root package name */
    public long f34378V;

    /* renamed from: W, reason: collision with root package name */
    public Handler f34379W;

    /* renamed from: X, reason: collision with root package name */
    public final C3504ku f34380X;

    /* renamed from: a, reason: collision with root package name */
    public final Context f34381a;

    /* renamed from: b, reason: collision with root package name */
    public final C3536lP f34382b;

    /* renamed from: c, reason: collision with root package name */
    public final C4183xP f34383c;

    /* renamed from: d, reason: collision with root package name */
    public final C3386ij f34384d;

    /* renamed from: e, reason: collision with root package name */
    public final C3386ij f34385e;

    /* renamed from: f, reason: collision with root package name */
    public final C3523lC f34386f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f34387g;

    /* renamed from: h, reason: collision with root package name */
    public C3590mP f34388h;
    public final P1.l i;

    /* renamed from: j, reason: collision with root package name */
    public final P1.l f34389j;

    /* renamed from: k, reason: collision with root package name */
    public IO f34390k;

    /* renamed from: l, reason: collision with root package name */
    public C3557lt f34391l;

    /* renamed from: m, reason: collision with root package name */
    public C3698oP f34392m;

    /* renamed from: n, reason: collision with root package name */
    public C3698oP f34393n;

    /* renamed from: o, reason: collision with root package name */
    public C2955ah f34394o;

    /* renamed from: p, reason: collision with root package name */
    public final C4323b f34395p;

    /* renamed from: q, reason: collision with root package name */
    public C3752pP f34396q;

    /* renamed from: r, reason: collision with root package name */
    public C3428jP f34397r;

    /* renamed from: s, reason: collision with root package name */
    public C2764Qj f34398s;

    /* renamed from: t, reason: collision with root package name */
    public C3806qP f34399t;

    /* renamed from: u, reason: collision with root package name */
    public C3806qP f34400u;

    /* renamed from: v, reason: collision with root package name */
    public C3947t5 f34401v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34402w;

    /* renamed from: x, reason: collision with root package name */
    public long f34403x;

    /* renamed from: y, reason: collision with root package name */
    public long f34404y;

    /* renamed from: z, reason: collision with root package name */
    public long f34405z;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0081, code lost:
    
        r9 = r0.getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3859rP(C3644nP c3644nP) {
        int deviceId;
        Context context = c3644nP.f33504a;
        this.f34381a = context == null ? null : context.getApplicationContext();
        this.f34398s = C2764Qj.f27843b;
        this.f34380X = c3644nP.f33509f;
        this.f34395p = c3644nP.f33508e;
        C3536lP c3536lP = new C3536lP();
        this.f34382b = c3536lP;
        C4183xP c4183xP = new C4183xP();
        c4183xP.f35797m = AbstractC3182eu.f30783b;
        this.f34383c = c4183xP;
        this.f34384d = new C3386ij(0);
        this.f34385e = new C3386ij(1);
        this.f34386f = RB.k(c4183xP, c3536lP);
        this.f34364G = 1.0f;
        this.f34371O = 0;
        this.f34373Q = new C3016bo();
        C3947t5 c3947t5 = C3947t5.f35001d;
        this.f34400u = new C3806qP(c3947t5, 0L, 0L);
        this.f34401v = c3947t5;
        this.f34402w = false;
        this.f34387g = new ArrayDeque();
        this.i = new P1.l();
        this.f34389j = new P1.l();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && deviceId != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.f34375S = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i, ByteBuffer byteBuffer) {
        int i4;
        int i6;
        int i9;
        byte b9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i4 = 0;
            } else {
                byte b10 = byteBuffer.get(26);
                int i15 = 28;
                int i16 = 28;
                for (int i17 = 0; i17 < b10; i17++) {
                    i16 += byteBuffer.get(i17 + 27);
                }
                byte b11 = byteBuffer.get(i16 + 26);
                for (int i18 = 0; i18 < b11; i18++) {
                    i15 += byteBuffer.get(i16 + 27 + i18);
                }
                i4 = i16 + i15;
            }
            int i19 = byteBuffer.get(26 + i4) + 27 + i4;
            return (int) ((AbstractC3066cl.F(byteBuffer.get(i19), byteBuffer.limit() - i19 > 1 ? byteBuffer.get(i19 + 1) : (byte) 0) * 48000) / 1000000);
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
                    String str = AbstractC3182eu.f30782a;
                    int i20 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i20 = Integer.reverseBytes(i20);
                    }
                    if ((i20 & (-2097152)) == -2097152 && (i12 = (i20 >>> 19) & 3) != 1 && (i13 = (i20 >>> 17) & 3) != 0) {
                        int i21 = i20 >>> 12;
                        int i22 = (i20 >>> 10) & 3;
                        int i23 = i21 & 15;
                        if (i23 != 0 && i23 != 15 && i22 != 3) {
                            i11 = 1152;
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    i11 = 384;
                                }
                            } else if (i12 != 3) {
                                i11 = 576;
                            }
                            if (i11 == -1) {
                                return i11;
                            }
                            throw new IllegalArgumentException();
                        }
                    }
                    i11 = -1;
                    if (i11 == -1) {
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
                            int i24 = position2;
                            while (true) {
                                if (i24 <= limit) {
                                    String str2 = AbstractC3182eu.f30782a;
                                    int i25 = byteBuffer.getInt(i24 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i25 = Integer.reverseBytes(i25);
                                    }
                                    if ((i25 & (-2)) == -126718022) {
                                        i14 = i24 - position2;
                                    } else {
                                        i24++;
                                    }
                                } else {
                                    i14 = -1;
                                }
                            }
                            if (i14 != -1) {
                                return (40 << ((byteBuffer.get((byteBuffer.position() + i14) + ((byteBuffer.get((byteBuffer.position() + i14) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
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
                            return MA.n(new C4256yr(bArr, 16)).f186c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(D.x.k(i, "Unexpected audio encoding: ", new StringBuilder(String.valueOf(i).length() + 27)));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return AbstractC3066cl.f30358u[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
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
                i9 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b9 = byteBuffer.get(position4 + 7);
            } else if (b12 != 31) {
                i9 = (byteBuffer.get(position4 + 4) & 1) << 6;
                i10 = byteBuffer.get(position4 + 5) & 252;
                i6 = (i10 >> 2) | i9;
            } else {
                i9 = (byteBuffer.get(5 + position4) & 7) << 4;
                b9 = byteBuffer.get(position4 + 6);
            }
            i10 = b9 & 60;
            i6 = (i10 >> 2) | i9;
        } else {
            i6 = ((byteBuffer.get(position4 + 5) & 1) << 6) | ((byteBuffer.get(position4 + 4) & 252) >> 2);
        }
        return (i6 + 1) * 32;
    }

    public final void a() {
        if (l()) {
            this.f34403x = 0L;
            this.f34404y = 0L;
            this.f34405z = 0L;
            this.f34358A = 0L;
            this.f34359B = 0;
            this.f34400u = new C3806qP(this.f34401v, 0L, 0L);
            this.f34362E = 0L;
            this.f34399t = null;
            this.f34387g.clear();
            this.f34365H = null;
            this.f34366I = 0;
            this.J = null;
            this.f34368L = false;
            this.f34367K = false;
            this.f34369M = false;
            this.f34383c.f35799o = 0L;
            d(com.anythink.basead.exoplayer.b.f7168b);
            this.f34388h = null;
            C3698oP c3698oP = this.f34392m;
            if (c3698oP != null) {
                this.f34393n = c3698oP;
                this.f34392m = null;
            }
            Y.incrementAndGet();
            C3428jP c3428jP = this.f34397r;
            if (c3428jP.f32039e.f32206d.getPlayState() == 3) {
                c3428jP.f32035a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && c3428jP.b()) {
                C3504ku c3504ku = c3428jP.f32042h;
                c3504ku.getClass();
                ((C3428jP) c3504ku.f32447w).f32035a.unregisterStreamEventCallback((C3376iP) c3504ku.f32446v);
                ((Handler) c3504ku.f32445u).removeCallbacksAndMessages(null);
            }
            ME me = c3428jP.f32038d;
            if (me != null) {
                C3268gP c3268gP = (C3268gP) me.f27064e;
                c3268gP.getClass();
                ((AudioTrack) me.f27061b).removeOnRoutingChangedListener(c3268gP);
                me.f27064e = null;
                c3428jP.f32038d = null;
            }
            AudioTrack audioTrack = c3428jP.f32035a;
            C3553lp c3553lp = c3428jP.i;
            Handler p9 = AbstractC3182eu.p();
            synchronized (C3428jP.f32032o) {
                try {
                    if (C3428jP.f32033p == null) {
                        C3428jP.f32033p = Executors.newSingleThreadScheduledExecutor(new It());
                    }
                    C3428jP.f32034q++;
                    C3428jP.f32033p.schedule(new RunnableC3888s0(16, audioTrack, p9, c3553lp), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f34397r = null;
        }
        P1.l lVar = this.f34389j;
        lVar.f2370v = null;
        lVar.f2368n = com.anythink.basead.exoplayer.b.f7168b;
        lVar.f2369u = com.anythink.basead.exoplayer.b.f7168b;
        P1.l lVar2 = this.i;
        lVar2.f2370v = null;
        lVar2.f2368n = com.anythink.basead.exoplayer.b.f7168b;
        lVar2.f2369u = com.anythink.basead.exoplayer.b.f7168b;
        this.f34377U = 0L;
        this.f34378V = 0L;
        Handler handler = this.f34379W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        a();
        C3523lC c3523lC = this.f34386f;
        int i = c3523lC.f32527w;
        for (int i4 = 0; i4 < i; i4++) {
            ((InterfaceC3170ei) c3523lC.get(i4)).j();
        }
        this.f34384d.j();
        this.f34385e.j();
        C2955ah c2955ah = this.f34394o;
        if (c2955ah != null) {
            int i6 = 0;
            while (true) {
                C3523lC c3523lC2 = c2955ah.f29845a;
                if (i6 >= c3523lC2.f32527w) {
                    break;
                }
                InterfaceC3170ei interfaceC3170ei = (InterfaceC3170ei) c3523lC2.get(i6);
                interfaceC3170ei.f(C2660Kh.f26736d);
                interfaceC3170ei.j();
                i6++;
            }
            c2955ah.f29846b.clear();
            c2955ah.f29847c = new ByteBuffer[0];
            C3653nh c3653nh = C3653nh.f33535e;
            c2955ah.f29848d = false;
        }
        this.f34370N = false;
    }

    public final void d(long j6) {
        long j9;
        C3698oP c3698oP = this.f34393n;
        this.f34394o = (C2955ah) c3698oP.f33689f;
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            j9 = 0;
        } else {
            j9 = j6 - this.f34363F;
            if (((AbstractC3627n8) c3698oP.f33690g) != AbstractC3627n8.f33468a && c3698oP.f33691h != null) {
                K7 k72 = new K7();
                C3698oP c3698oP2 = this.f34393n;
                ((AbstractC3627n8) c3698oP2.f33690g).o(c3698oP2.f33691h, k72);
            }
        }
        C2955ah c2955ah = this.f34394o;
        C2507Bh c2507Bh = new C2507Bh();
        C3698oP c3698oP3 = this.f34393n;
        c2507Bh.f24706b = (AbstractC3627n8) c3698oP3.f33690g;
        c2507Bh.f24707c = c3698oP3.f33691h;
        c2507Bh.f24705a = j9;
        C2660Kh a9 = c2507Bh.a();
        ArrayList arrayList = c2955ah.f29846b;
        arrayList.clear();
        c2955ah.f29848d = false;
        int i = 0;
        while (true) {
            C3523lC c3523lC = c2955ah.f29845a;
            if (i >= c3523lC.f32527w) {
                break;
            }
            InterfaceC3170ei interfaceC3170ei = (InterfaceC3170ei) c3523lC.get(i);
            interfaceC3170ei.f(a9);
            if (interfaceC3170ei.i()) {
                C2507Bh c2507Bh2 = new C2507Bh();
                long j10 = a9.f26737a;
                c2507Bh2.f24705a = j10;
                c2507Bh2.f24706b = a9.f26738b;
                c2507Bh2.f24707c = a9.f26739c;
                c2507Bh2.f24705a = interfaceC3170ei.b(j10);
                a9 = c2507Bh2.a();
                arrayList.add(interfaceC3170ei);
            }
            i++;
        }
        c2955ah.f29847c = new ByteBuffer[arrayList.size()];
        for (int i4 = 0; i4 <= c2955ah.e(); i4++) {
            c2955ah.f29847c[i4] = ((InterfaceC3170ei) arrayList.get(i4)).e();
        }
    }

    public final C3428jP e(VO vo) {
        try {
            return this.f34395p.f(vo);
        } catch (UO e9) {
            String valueOf = String.valueOf((DP) this.f34393n.f33686c);
            int i = vo.f28988b;
            int length = String.valueOf(i).length();
            int i4 = vo.f28989c;
            int length2 = String.valueOf(i4).length();
            int i6 = vo.f28987a;
            int length3 = String.valueOf(i6).length();
            int i9 = vo.f28990d;
            StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i9).length() + 2 + valueOf.length());
            AbstractC5128c.g(sb, "AudioTrack init failed 0 Config(", i, ", ", i4);
            AbstractC5128c.g(sb, ", ", i6, ", ", i9);
            C2946aP c2946aP = new C2946aP(D.x.p(sb, ") ", valueOf, ""), e9);
            C3557lt c3557lt = this.f34391l;
            if (c3557lt == null) {
                throw c2946aP;
            }
            c3557lt.m(c2946aP);
            throw c2946aP;
        }
    }

    public final void f(long j6) {
        ByteBuffer byteBuffer;
        i(j6);
        if (this.J != null) {
            return;
        }
        if (!this.f34394o.b()) {
            ByteBuffer byteBuffer2 = this.f34365H;
            if (byteBuffer2 != null) {
                h(byteBuffer2);
                i(j6);
                return;
            }
            return;
        }
        while (!this.f34394o.c()) {
            do {
                C2955ah c2955ah = this.f34394o;
                if (c2955ah.b()) {
                    ByteBuffer byteBuffer3 = c2955ah.f29847c[c2955ah.e()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c2955ah.d(InterfaceC3170ei.f30756a);
                        byteBuffer = c2955ah.f29847c[c2955ah.e()];
                    }
                } else {
                    byteBuffer = InterfaceC3170ei.f30756a;
                }
                if (byteBuffer.hasRemaining()) {
                    h(byteBuffer);
                    i(j6);
                } else {
                    ByteBuffer byteBuffer4 = this.f34365H;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C2955ah c2955ah2 = this.f34394o;
                    ByteBuffer byteBuffer5 = this.f34365H;
                    if (c2955ah2.b() && !c2955ah2.f29848d) {
                        c2955ah2.d(byteBuffer5);
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
        if (!this.f34394o.b()) {
            i(Long.MIN_VALUE);
            return this.J == null;
        }
        C2955ah c2955ah = this.f34394o;
        if (c2955ah.b() && !c2955ah.f29848d) {
            c2955ah.f29848d = true;
            ((InterfaceC3170ei) c2955ah.f29846b.get(0)).d();
        }
        f(Long.MIN_VALUE);
        if (!this.f34394o.c() || ((byteBuffer = this.J) != null && byteBuffer.hasRemaining())) {
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
        int i6;
        float max;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        double max2;
        double d9;
        AbstractC2792Sd.H(this.J == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f34393n.n()) {
                int w3 = (int) AbstractC3182eu.w(AbstractC3182eu.u(20L), ((VO) this.f34393n.f33688e).f28988b, 1000000L, RoundingMode.UP);
                long m9 = m();
                long j6 = w3;
                if (m9 < j6) {
                    C3698oP c3698oP = this.f34393n;
                    VO vo = (VO) c3698oP.f33688e;
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i16 = (int) m9;
                    while (byteBuffer.hasRemaining() && i16 < w3) {
                        int i17 = vo.f28987a;
                        if (i17 != 2) {
                            if (i17 != 3) {
                                if (i17 != 4) {
                                    if (i17 != 21) {
                                        if (i17 == 22) {
                                            i12 = byteBuffer.get() & 255;
                                            i13 = (byteBuffer.get() & 255) << 8;
                                            i14 = (byteBuffer.get() & 255) << 16;
                                            i15 = (byteBuffer.get() & 255) << 24;
                                        } else if (i17 == 268435456) {
                                            i = (byteBuffer.get() & 255) << 24;
                                            i4 = (byteBuffer.get() & 255) << 16;
                                        } else if (i17 == 1342177280) {
                                            i9 = (byteBuffer.get() & 255) << 24;
                                            i10 = (byteBuffer.get() & 255) << 16;
                                            i11 = (byteBuffer.get() & 255) << 8;
                                        } else if (i17 != 1610612736) {
                                            if (i17 == 1879048192) {
                                                max2 = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                            } else if (i17 == 1895825408) {
                                                max = Math.max(-1.0f, Math.min(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), 1.0f));
                                            } else {
                                                if (i17 != 1912602624) {
                                                    throw new IllegalStateException();
                                                }
                                                max2 = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                            }
                                            i6 = (int) d9;
                                        } else {
                                            i12 = (byteBuffer.get() & 255) << 24;
                                            i13 = (byteBuffer.get() & 255) << 16;
                                            i14 = (byteBuffer.get() & 255) << 8;
                                            i15 = byteBuffer.get() & 255;
                                        }
                                        i6 = i12 | i13 | i14 | i15;
                                    } else {
                                        i9 = (byteBuffer.get() & 255) << 8;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 24;
                                    }
                                    i6 = i9 | i10 | i11;
                                } else {
                                    max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                }
                                i6 = (int) f2;
                            } else {
                                i6 = (byteBuffer.get() & 255) << 24;
                            }
                            int i18 = (int) ((i6 * i16) / j6);
                            if (i17 != 2) {
                                order.put((byte) (i18 >> 16));
                                order.put((byte) (i18 >> 24));
                            } else if (i17 == 3) {
                                order.put((byte) (i18 >> 24));
                            } else if (i17 != 4) {
                                if (i17 == 21) {
                                    order.put((byte) (i18 >> 8));
                                    order.put((byte) (i18 >> 16));
                                    order.put((byte) (i18 >> 24));
                                } else if (i17 == 22) {
                                    order.put((byte) i18);
                                    order.put((byte) (i18 >> 8));
                                    order.put((byte) (i18 >> 16));
                                    order.put((byte) (i18 >> 24));
                                } else if (i17 == 268435456) {
                                    order.put((byte) (i18 >> 24));
                                    order.put((byte) (i18 >> 16));
                                } else if (i17 == 1342177280) {
                                    order.put((byte) (i18 >> 24));
                                    order.put((byte) (i18 >> 16));
                                    order.put((byte) (i18 >> 8));
                                } else if (i17 == 1610612736) {
                                    order.put((byte) (i18 >> 24));
                                    order.put((byte) (i18 >> 16));
                                    order.put((byte) (i18 >> 8));
                                    order.put((byte) i18);
                                } else if (i17 != 1879048192) {
                                    if (i17 == 1895825408) {
                                        order.putInt(Integer.reverseBytes(Float.floatToIntBits(i18 < 0 ? (-i18) / (-2.1474836E9f) : i18 / 2.1474836E9f)));
                                    } else {
                                        if (i17 != 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                        order.putLong(Long.reverseBytes(Double.doubleToLongBits(i18 < 0 ? (-i18) / (-2.147483648E9d) : i18 / 2.147483647E9d)));
                                    }
                                } else if (i18 < 0) {
                                    order.putDouble((-i18) / (-2.147483648E9d));
                                } else {
                                    order.putDouble(i18 / 2.147483647E9d);
                                }
                            } else if (i18 < 0) {
                                order.putFloat((-i18) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i18 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != c3698oP.f33685b + position) {
                                i16++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i4 = (byteBuffer.get() & 255) << 24;
                        }
                        i6 = i | i4;
                        int i182 = (int) ((i6 * i16) / j6);
                        if (i17 != 2) {
                        }
                        if (byteBuffer.position() != c3698oP.f33685b + position) {
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
        P1.l lVar = this.f34389j;
        if (((Exception) lVar.f2370v) != null && (Y.get() > 0 || SystemClock.elapsedRealtime() < lVar.f2369u)) {
            return;
        }
        int remaining = this.J.remaining();
        try {
            boolean a9 = this.f34397r.a(this.f34366I, this.J);
            this.f34376T = SystemClock.elapsedRealtime();
            lVar.f2370v = null;
            lVar.f2368n = com.anythink.basead.exoplayer.b.f7168b;
            lVar.f2369u = com.anythink.basead.exoplayer.b.f7168b;
            this.f34397r.b();
            if (this.f34393n.n()) {
                this.f34405z += remaining - this.J.remaining();
            }
            if (a9) {
                if (!this.f34393n.n()) {
                    AbstractC2792Sd.H(this.J == this.f34365H);
                    this.f34358A = (this.f34359B * this.f34366I) + this.f34358A;
                }
                this.J = null;
            }
        } catch (PO e9) {
            boolean z6 = e9.f27596u;
            if (z6) {
                if (m() <= 0) {
                    if (this.f34397r.b()) {
                        this.f34393n.getClass();
                    }
                }
                r0 = true;
            }
            C3000bP c3000bP = new C3000bP(e9.f27595n, (DP) this.f34393n.f33686c, r0);
            C3557lt c3557lt = this.f34391l;
            if (c3557lt != null) {
                c3557lt.m(c3000bP);
            }
            if (z6) {
                throw c3000bP;
            }
            lVar.h(c3000bP);
        }
    }

    public final void j() {
        if (this.f34393n != null) {
            C3698oP c3698oP = this.f34392m;
            if (c3698oP != null) {
                this.f34393n = c3698oP;
                this.f34392m = null;
            }
            try {
                this.f34393n = this.f34393n.m(this.f34395p.c(n((DP) this.f34393n.f33687d)));
            } catch (QO e9) {
                throw new IllegalStateException(new ZO(e9, (DP) this.f34393n.f33686c));
            }
        }
        a();
    }

    public final void k(long j6) {
        boolean z6;
        C3947t5 c3947t5;
        boolean z9 = false;
        if (this.f34393n.n()) {
            int i = ((DP) this.f34393n.f33686c).f25156K;
            z6 = true;
        } else {
            z6 = false;
        }
        C3504ku c3504ku = this.f34380X;
        if (z6) {
            c3947t5 = this.f34401v;
            c3504ku.getClass();
            float f2 = c3947t5.f35002a;
            C3064cj c3064cj = (C3064cj) c3504ku.f32447w;
            c3064cj.getClass();
            AbstractC2792Sd.i(f2 > 0.0f);
            if (c3064cj.f30323c != f2) {
                c3064cj.f30323c = f2;
                c3064cj.i = true;
            }
            float f9 = c3947t5.f35003b;
            AbstractC2792Sd.i(f9 > 0.0f);
            if (c3064cj.f30324d != f9) {
                c3064cj.f30324d = f9;
                c3064cj.i = true;
            }
        } else {
            c3947t5 = C3947t5.f35001d;
        }
        C3947t5 c3947t52 = c3947t5;
        this.f34401v = c3947t52;
        if (this.f34393n.n()) {
            int i4 = ((DP) this.f34393n.f33686c).f25156K;
            z9 = this.f34402w;
            ((C4021uP) c3504ku.f32446v).f35309j = z9;
        }
        this.f34402w = z9;
        this.f34387g.add(new C3806qP(c3947t52, Math.max(0L, j6), AbstractC3182eu.v(((VO) this.f34393n.f33688e).f28988b, m())));
        d(j6);
        C3557lt c3557lt = this.f34391l;
        if (c3557lt != null) {
            boolean z10 = this.f34402w;
            S0.l lVar = ((C3967tP) c3557lt.f32643u).f35065g1;
            Handler handler = (Handler) lVar.f2926u;
            if (handler != null) {
                handler.post(new E2.B(4, lVar, z10));
            }
        }
    }

    public final boolean l() {
        return this.f34397r != null;
    }

    public final long m() {
        if (!this.f34393n.n()) {
            return this.f34358A;
        }
        long j6 = this.f34405z;
        long j9 = this.f34393n.f33685b;
        String str = AbstractC3182eu.f30782a;
        return ((j6 + j9) - 1) / j9;
    }

    public final RO n(DP dp) {
        RO ro = new RO(dp);
        ro.f27956b = this.f34398s;
        ro.f27957c = this.f34374R;
        ro.f27958d = this.f34371O;
        ro.f27960f = -1;
        ro.f27959e = this.f34375S;
        return new RO(ro);
    }

    public final void o() {
        if (this.f34368L) {
            return;
        }
        this.f34368L = true;
        if (this.f34397r.b()) {
            this.f34369M = false;
        }
        C3428jP c3428jP = this.f34397r;
        if (c3428jP.f32043j) {
            return;
        }
        c3428jP.f32043j = true;
        long c9 = c3428jP.c();
        C3482kP c3482kP = c3428jP.f32039e;
        c3482kP.f32224w = c3482kP.d();
        c3482kP.f32204b.getClass();
        c3482kP.f32222u = AbstractC3182eu.u(SystemClock.elapsedRealtime());
        c3482kP.f32225x = c9;
        c3428jP.f32035a.stop();
    }

    public final int p(DP dp) {
        boolean z6;
        int i = dp.f25156K;
        if (!AbstractC3182eu.d(i) || i == 2) {
            z6 = false;
        } else {
            C3322hP c3322hP = new C3322hP(dp);
            c3322hP.J = 2;
            dp = new DP(c3322hP);
            z6 = true;
        }
        int i4 = this.f34395p.a(n(dp)).f28522d;
        if (i4 != 1) {
            if (i4 != 2) {
                return 0;
            }
            if (!z6) {
                return 2;
            }
        }
        return 1;
    }

    public final void q(YO yo) {
        C2955ah c2955ah;
        int i;
        int i4;
        DP dp;
        C3752pP c3752pP = this.f34396q;
        C4323b c4323b = this.f34395p;
        if (c3752pP == null && this.f34381a != null) {
            C3752pP c3752pP2 = new C3752pP(this);
            this.f34396q = c3752pP2;
            c4323b.i();
            if (((C3553lp) c4323b.f36419c) == null) {
                c4323b.f36419c = new C3553lp(Thread.currentThread());
            }
            ((C3553lp) c4323b.f36419c).a(c3752pP2);
        }
        DP dp2 = yo.f29454a;
        if (com.anythink.basead.exoplayer.k.o.f9251w.equals(dp2.f25176o)) {
            int i6 = dp2.f25156K;
            AbstractC2792Sd.i(AbstractC3182eu.d(i6));
            int f2 = AbstractC3182eu.f(i6);
            int i9 = dp2.f25154H;
            int i10 = f2 * i9;
            OB ob = new OB(4);
            ob.b(this.f34386f);
            ob.a(this.f34384d);
            InterfaceC3170ei[] interfaceC3170eiArr = (InterfaceC3170ei[]) this.f34380X.f32445u;
            AbstractC2792Sd.j(interfaceC3170eiArr, 2);
            ob.e(2);
            System.arraycopy(interfaceC3170eiArr, 0, ob.f27056a, ob.f27057b, 2);
            ob.f27057b += 2;
            c2955ah = new C2955ah(ob.f());
            if (c2955ah.equals(this.f34394o)) {
                c2955ah = this.f34394o;
            }
            int i11 = dp2.f25157L;
            C4183xP c4183xP = this.f34383c;
            c4183xP.i = i11;
            c4183xP.f35794j = dp2.f25158M;
            this.f34382b.i = yo.f29455b;
            try {
                C3653nh a9 = c2955ah.a(new C3653nh(dp2.J, i9, i6));
                C3322hP c3322hP = new C3322hP(dp2);
                int i12 = a9.f33538c;
                c3322hP.J = i12;
                c3322hP.f31540I = a9.f33536a;
                int i13 = a9.f33537b;
                c3322hP.f31538G = i13;
                c3322hP.f31539H = i13 == i9 ? dp2.f25155I : -1;
                DP dp3 = new DP(c3322hP);
                i4 = i13 * AbstractC3182eu.f(i12);
                i = i10;
                dp = dp3;
            } catch (C2863Wh e9) {
                throw new ZO(e9, dp2);
            }
        } else {
            c2955ah = new C2955ah(C3523lC.f32525x);
            i = -1;
            i4 = -1;
            dp = dp2;
        }
        C2955ah c2955ah2 = c2955ah;
        RO n9 = n(dp);
        try {
            VO c9 = c4323b.c(n9);
            int i14 = c9.f28987a;
            DP dp4 = (DP) n9.f27955a;
            if (i14 == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new ZO(sb.toString(), dp4);
            }
            if (c9.f28989c == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new ZO(sb2.toString(), dp4);
            }
            C3860rQ c3860rQ = yo.f29457d;
            C3698oP c3698oP = new C3698oP(dp2, dp, i, i4, c9, c2955ah2, yo.f29456c, c3860rQ != null ? c3860rQ.f34406a : null);
            if (l()) {
                this.f34392m = c3698oP;
            } else {
                this.f34393n = c3698oP;
            }
        } catch (QO e10) {
            throw new ZO(e10, dp2);
        }
    }

    public final void r() {
        this.f34370N = true;
        if (l()) {
            C3428jP c3428jP = this.f34397r;
            C3482kP c3482kP = c3428jP.f32039e;
            if (c3482kP.f32222u != com.anythink.basead.exoplayer.b.f7168b) {
                c3482kP.f32204b.getClass();
                c3482kP.f32222u = AbstractC3182eu.u(SystemClock.elapsedRealtime());
            }
            c3482kP.f32211j = AbstractC3182eu.v(c3482kP.f32207e, c3482kP.d());
            c3482kP.f32210h.a(0);
            if (!c3428jP.f32043j || c3428jP.b()) {
                c3428jP.f32035a.play();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0089, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r9.f2369u) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x024e, code lost:
    
        if (r0 != 0) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j6, ByteBuffer byteBuffer, int i) {
        boolean z6;
        C3428jP c3428jP;
        LP lp;
        LogSessionId logSessionId;
        boolean equals;
        long j9;
        long j10;
        long j11;
        LogSessionId unused;
        ByteBuffer byteBuffer2 = this.f34365H;
        AbstractC2792Sd.i(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f34392m != null) {
            if (g()) {
                if (this.f34397r != null) {
                    VO vo = (VO) this.f34393n.f33688e;
                    n((DP) this.f34392m.f33687d);
                    if (!((VO) this.f34392m.f33688e).equals(vo)) {
                        o();
                        if (!t()) {
                            a();
                            k(j6);
                        }
                    }
                }
                this.f34393n = this.f34392m;
                this.f34392m = null;
                C3428jP c3428jP2 = this.f34397r;
                if (c3428jP2 != null && c3428jP2.b()) {
                    this.f34393n.getClass();
                }
                k(j6);
            }
            return false;
        }
        boolean l9 = l();
        P1.l lVar = this.i;
        if (!l9) {
            try {
                if (((Exception) lVar.f2370v) != null) {
                    if (Y.get() > 0) {
                    }
                    z6 = true;
                    if (!z6) {
                        try {
                            c3428jP = e((VO) this.f34393n.f33688e);
                        } catch (C2946aP e9) {
                            int i4 = ((VO) this.f34393n.f33688e).f28990d;
                            while (i4 > 1000000) {
                                int i6 = i4 >> 1;
                                C3698oP c3698oP = this.f34393n;
                                int i9 = c3698oP.f33685b;
                                if (i9 == -1) {
                                    i9 = 1;
                                }
                                int i10 = i6 % i9;
                                int i11 = i10 != 0 ? (i9 - i10) + i6 : i6;
                                C3029c1 c3029c1 = new C3029c1((VO) c3698oP.f33688e);
                                c3029c1.f30194d = i11;
                                VO vo2 = new VO(c3029c1);
                                try {
                                    C3428jP e10 = e(vo2);
                                    this.f34393n = this.f34393n.m(vo2);
                                    c3428jP = e10;
                                } catch (C2946aP e11) {
                                    e9.addSuppressed(e11);
                                    i4 = i11;
                                }
                            }
                            this.f34393n.getClass();
                            throw e9;
                        }
                        this.f34397r = c3428jP;
                        C3590mP c3590mP = new C3590mP(this, (VO) this.f34393n.f33688e);
                        this.f34388h = c3590mP;
                        c3428jP.i.a(c3590mP);
                        if (this.f34397r.b()) {
                            this.f34393n.getClass();
                        }
                        IO io = this.f34390k;
                        if (io != null) {
                            C3428jP c3428jP3 = this.f34397r;
                            c3428jP3.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                synchronized (io) {
                                    C3557lt c3557lt = io.f26243b;
                                    if (c3557lt == null) {
                                        throw null;
                                    }
                                    logSessionId = (LogSessionId) c3557lt.f32643u;
                                }
                                unused = LogSessionId.LOG_SESSION_ID_NONE;
                                equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                if (!equals) {
                                    c3428jP3.f32035a.setLogSessionId(logSessionId);
                                }
                            }
                        }
                        if (l()) {
                            this.f34397r.f32035a.setVolume(this.f34364G);
                        }
                        this.f34373Q.getClass();
                        AudioDeviceInfo audioDeviceInfo = this.f34374R;
                        if (audioDeviceInfo != null) {
                            this.f34397r.f32035a.setPreferredDevice(audioDeviceInfo);
                        }
                        this.f34361D = true;
                        int audioSessionId = this.f34397r.f32035a.getAudioSessionId();
                        int i12 = this.f34371O;
                        this.f34371O = audioSessionId;
                        C3557lt c3557lt2 = this.f34391l;
                        if (c3557lt2 != null) {
                            Object obj = this.f34393n.f33688e;
                            C4290zO c4290zO = new C4290zO(28);
                            S0.l lVar2 = ((C3967tP) c3557lt2.f32643u).f35065g1;
                            Handler handler = (Handler) lVar2.f2926u;
                            if (handler != null) {
                                handler.post(new WO(lVar2, c4290zO, 7));
                            }
                            if (audioSessionId != i12) {
                                this.f34372P = true;
                                C3698oP c3698oP2 = this.f34393n;
                                C3029c1 c3029c12 = new C3029c1((VO) c3698oP2.f33688e);
                                c3029c12.f30195e = this.f34371O;
                                this.f34393n = c3698oP2.m(new VO(c3029c12));
                                C3698oP c3698oP3 = this.f34392m;
                                if (c3698oP3 != null) {
                                    C3029c1 c3029c13 = new C3029c1((VO) c3698oP3.f33688e);
                                    c3029c13.f30195e = this.f34371O;
                                    this.f34392m = c3698oP3.m(new VO(c3029c13));
                                }
                                C3557lt c3557lt3 = this.f34391l;
                                int i13 = this.f34371O;
                                if (Build.VERSION.SDK_INT >= 35 && (lp = ((C3967tP) c3557lt3.f32643u).f35067i1) != null) {
                                    lp.k(i13);
                                }
                                S0.l lVar3 = ((C3967tP) c3557lt3.f32643u).f35065g1;
                                Handler handler2 = (Handler) lVar3.f2926u;
                                if (handler2 != null) {
                                    handler2.post(new L.a(lVar3, i13, 11));
                                }
                            }
                        }
                    }
                    return false;
                }
                z6 = false;
                if (!z6) {
                }
                return false;
            } catch (C2946aP e12) {
                lVar.h(e12);
                return false;
            }
        }
        lVar.f2370v = null;
        lVar.f2368n = com.anythink.basead.exoplayer.b.f7168b;
        lVar.f2369u = com.anythink.basead.exoplayer.b.f7168b;
        if (this.f34361D) {
            this.f34362E = Math.max(0L, j6);
            this.f34360C = false;
            this.f34361D = false;
            k(j6);
            if (this.f34370N) {
                r();
            }
        }
        if (this.f34365H == null) {
            AbstractC2792Sd.i(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!this.f34393n.n() && this.f34359B == 0) {
                    int c9 = c(((VO) this.f34393n.f33688e).f28987a, byteBuffer);
                    this.f34359B = c9;
                }
                if (this.f34399t != null) {
                    if (g()) {
                        k(j6);
                        this.f34399t = null;
                    }
                    return false;
                }
                long j12 = this.f34362E;
                C3698oP c3698oP4 = this.f34393n;
                if (c3698oP4.n()) {
                    j9 = -9223372036854775807L;
                    j10 = 0;
                    j11 = this.f34403x / this.f34393n.f33684a;
                } else {
                    j9 = -9223372036854775807L;
                    j10 = 0;
                    j11 = this.f34404y;
                }
                long v9 = AbstractC3182eu.v(((DP) c3698oP4.f33686c).J, j11 - this.f34383c.f35799o) + j12;
                if (!this.f34360C && Math.abs(v9 - j6) > 200000) {
                    C3557lt c3557lt4 = this.f34391l;
                    if (c3557lt4 != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(v9).length() + 63 + String.valueOf(j6).length());
                        com.IceFishing.LiveIceFishing.k.z(sb, "Unexpected audio track timestamp discontinuity: expected ", v9, ", got ");
                        sb.append(j6);
                        c3557lt4.m(new N2.n(sb.toString()));
                    }
                    this.f34360C = true;
                }
                if (this.f34360C) {
                    if (g()) {
                        long j13 = j6 - v9;
                        this.f34362E += j13;
                        this.f34360C = false;
                        k(j6);
                        C3557lt c3557lt5 = this.f34391l;
                        if (c3557lt5 != null && j13 != j10) {
                            ((C3967tP) c3557lt5.f32643u).f35073o1 = true;
                        }
                    }
                    return false;
                }
                if (this.f34393n.n()) {
                    this.f34403x += byteBuffer.remaining();
                } else {
                    this.f34404y = (this.f34359B * i) + this.f34404y;
                }
                this.f34365H = byteBuffer;
                this.f34366I = i;
            }
            return true;
        }
        j9 = -9223372036854775807L;
        j10 = 0;
        f(j6);
        if (!this.f34365H.hasRemaining()) {
            this.f34365H = null;
            this.f34366I = 0;
            return true;
        }
        C3428jP c3428jP4 = this.f34397r;
        long c10 = c3428jP4.c();
        C3482kP c3482kP = c3428jP4.f32039e;
        if (c3482kP.f32223v != j9 && c10 > j10) {
            c3482kP.f32204b.getClass();
            if (SystemClock.elapsedRealtime() - c3482kP.f32223v >= 200) {
                AbstractC2991bG.y("DefaultAudioSink", "Resetting stalled audio output");
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
        if (Build.VERSION.SDK_INT >= 29 && this.f34397r.b() && this.f34369M) {
            return false;
        }
        long m9 = m();
        long a9 = this.f34397r.f32039e.a();
        C3428jP c3428jP = this.f34397r;
        c3428jP.getClass();
        return m9 > AbstractC3182eu.w(a9, (long) c3428jP.f32035a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
