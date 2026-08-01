package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class RP implements InterfaceC3674oO {

    /* renamed from: j1, reason: collision with root package name */
    public static final byte[] f27205j1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public int f27206A;

    /* renamed from: A0, reason: collision with root package name */
    public int f27207A0;

    /* renamed from: B, reason: collision with root package name */
    public IQ f27208B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f27209B0;

    /* renamed from: C, reason: collision with root package name */
    public DP[] f27210C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public long f27211D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f27212D0;

    /* renamed from: E, reason: collision with root package name */
    public long f27213E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f27214E0;

    /* renamed from: F0, reason: collision with root package name */
    public long f27216F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f27217G;

    /* renamed from: G0, reason: collision with root package name */
    public long f27218G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f27219H;

    /* renamed from: H0, reason: collision with root package name */
    public int f27220H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f27222I0;
    public C3676oQ J;

    /* renamed from: J0, reason: collision with root package name */
    public ByteBuffer f27223J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f27225K0;

    /* renamed from: L, reason: collision with root package name */
    public C3649o f27226L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f27227L0;

    /* renamed from: M, reason: collision with root package name */
    public final Context f27228M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f27229M0;

    /* renamed from: N, reason: collision with root package name */
    public final C3193fa f27230N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f27231N0;

    /* renamed from: O, reason: collision with root package name */
    public final C3084dP f27232O;

    /* renamed from: O0, reason: collision with root package name */
    public int f27233O0;

    /* renamed from: P, reason: collision with root package name */
    public final C3996uN f27234P;

    /* renamed from: P0, reason: collision with root package name */
    public int f27235P0;

    /* renamed from: Q, reason: collision with root package name */
    public final C3996uN f27236Q;

    /* renamed from: Q0, reason: collision with root package name */
    public int f27237Q0;

    /* renamed from: R, reason: collision with root package name */
    public final C3996uN f27238R;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f27239R0;

    /* renamed from: S, reason: collision with root package name */
    public final JP f27240S;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f27241S0;

    /* renamed from: T, reason: collision with root package name */
    public final MediaCodec.BufferInfo f27242T;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f27243T0;

    /* renamed from: U, reason: collision with root package name */
    public final ArrayDeque f27244U;

    /* renamed from: U0, reason: collision with root package name */
    public long f27245U0;

    /* renamed from: V, reason: collision with root package name */
    public final C3921t2 f27246V;

    /* renamed from: V0, reason: collision with root package name */
    public long f27247V0;

    /* renamed from: W, reason: collision with root package name */
    public final AtomicInteger f27248W;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f27249W0;

    /* renamed from: X, reason: collision with root package name */
    public DP f27250X;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f27251X0;
    public DP Y;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f27252Y0;

    /* renamed from: Z, reason: collision with root package name */
    public C3105du f27253Z;

    /* renamed from: Z0, reason: collision with root package name */
    public C4158xN f27254Z0;

    /* renamed from: a1, reason: collision with root package name */
    public QP f27255a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f27256b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f27257c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f27258d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f27259e1;

    /* renamed from: f1, reason: collision with root package name */
    public long f27260f1;

    /* renamed from: g1, reason: collision with root package name */
    public final C4104wN f27261g1;

    /* renamed from: h1, reason: collision with root package name */
    public C4104wN f27262h1;

    /* renamed from: i1, reason: collision with root package name */
    public final C3823rC f27263i1;

    /* renamed from: n0, reason: collision with root package name */
    public C3105du f27265n0;

    /* renamed from: o0, reason: collision with root package name */
    public QN f27266o0;

    /* renamed from: p0, reason: collision with root package name */
    public final long f27267p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f27268q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f27269r0;

    /* renamed from: s0, reason: collision with root package name */
    public LP f27270s0;

    /* renamed from: t0, reason: collision with root package name */
    public DP f27271t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f27272u;

    /* renamed from: u0, reason: collision with root package name */
    public MediaFormat f27273u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f27275v0;

    /* renamed from: w, reason: collision with root package name */
    public C3889sO f27276w;

    /* renamed from: w0, reason: collision with root package name */
    public float f27277w0;

    /* renamed from: x, reason: collision with root package name */
    public int f27278x;

    /* renamed from: x0, reason: collision with root package name */
    public ArrayDeque f27279x0;

    /* renamed from: y, reason: collision with root package name */
    public IO f27280y;

    /* renamed from: y0, reason: collision with root package name */
    public PP f27281y0;

    /* renamed from: z, reason: collision with root package name */
    public V2 f27282z;

    /* renamed from: z0, reason: collision with root package name */
    public OP f27283z0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f27264n = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final S0.l f27274v = new S0.l(22);

    /* renamed from: F, reason: collision with root package name */
    public long f27215F = Long.MIN_VALUE;

    /* renamed from: I, reason: collision with root package name */
    public AbstractC3604n8 f27221I = AbstractC3604n8.f32690a;

    /* renamed from: K, reason: collision with root package name */
    public long f27224K = com.anythink.basead.exoplayer.b.f6382b;

    public RP(Context context, int i, C3193fa c3193fa, C3084dP c3084dP) {
        this.f27272u = i;
        this.f27228M = context.getApplicationContext();
        this.f27230N = c3193fa;
        c3084dP.getClass();
        this.f27232O = c3084dP;
        this.f27248W = new AtomicInteger();
        this.f27234P = new C3996uN(0);
        this.f27236Q = new C3996uN(0);
        this.f27238R = new C3996uN(2);
        JP jp = new JP(2);
        jp.f25684k = 32;
        this.f27240S = jp;
        this.f27242T = new MediaCodec.BufferInfo();
        this.f27268q0 = 1.0f;
        this.f27269r0 = 1.0f;
        this.f27267p0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27244U = new ArrayDeque();
        this.f27255a1 = QP.f27024g;
        jp.j(0);
        jp.f34528e.order(ByteOrder.nativeOrder());
        C3921t2 c3921t2 = new C3921t2();
        c3921t2.f34193v = InterfaceC3147ei.f29965a;
        c3921t2.f34192u = 0;
        c3921t2.f34191n = 2;
        this.f27246V = c3921t2;
        this.f27277w0 = -1.0f;
        this.f27207A0 = 0;
        this.f27233O0 = 0;
        this.f27220H0 = -1;
        this.f27222I0 = -1;
        this.f27218G0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27245U0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27247V0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27256b1 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27216F0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27235P0 = 0;
        this.f27237Q0 = 0;
        this.f27254Z0 = new C4158xN();
        this.f27259e1 = false;
        this.f27260f1 = 0L;
        int i6 = XB.f28503v;
        this.f27263i1 = C3823rC.f33537C;
        C4104wN c4104wN = C4104wN.f34830b;
        this.f27261g1 = c4104wN;
        this.f27262h1 = c4104wN;
    }

    public static boolean K(int i, boolean z3) {
        int i6 = i & 7;
        if (i6 != 4) {
            return z3 && i6 == 3;
        }
        return true;
    }

    public void A() {
        this.f27220H0 = -1;
        this.f27236Q.f34528e = null;
        this.f27222I0 = -1;
        this.f27223J0 = null;
        this.f27245U0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27247V0 = com.anythink.basead.exoplayer.b.f6382b;
        n0().f27030f = com.anythink.basead.exoplayer.b.f6382b;
        this.f27256b1 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27218G0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27241S0 = false;
        this.f27216F0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27239R0 = false;
        this.C0 = false;
        this.f27212D0 = false;
        this.f27235P0 = 0;
        this.f27237Q0 = 0;
        this.f27233O0 = this.f27231N0 ? 1 : 0;
        this.f27259e1 = false;
        this.f27260f1 = 0L;
    }

    public final void B() {
        A();
        this.f27279x0 = null;
        this.f27283z0 = null;
        this.f27271t0 = null;
        this.f27273u0 = null;
        this.f27275v0 = false;
        this.f27243T0 = false;
        this.f27277w0 = -1.0f;
        this.f27207A0 = 0;
        this.f27209B0 = false;
        this.f27214E0 = false;
        this.f27231N0 = false;
        this.f27233O0 = 0;
    }

    public NP C(IllegalStateException illegalStateException, OP op) {
        return new NP(illegalStateException, op);
    }

    public void E(C3996uN c3996uN) {
    }

    public int F(C3996uN c3996uN) {
        return 0;
    }

    public boolean G(C3996uN c3996uN) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x052c, code lost:
    
        if (r0 == null) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0534, code lost:
    
        if (r6 >= r0.f24434r.size()) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0536, code lost:
    
        r0 = (byte[]) r34.f27271t0.f24434r.get(r6);
        r5 = r11.f34528e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0542, code lost:
    
        if (r5 == null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0544, code lost:
    
        r5.put(r0);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0549, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x054a, code lost:
    
        r34.f27233O0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x054d, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x054e, code lost:
    
        r0 = r11.f34528e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0550, code lost:
    
        if (r0 == null) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0552, code lost:
    
        r0 = r0.position();
        r15 = r31;
        r15.f2797u = r3;
        r15.f2798v = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x055c, code lost:
    
        r4.r(new com.google.android.gms.internal.ads.RunnableC3191fP(r13, (java.lang.Object) r34, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0564, code lost:
    
        r5 = r34.f27248W.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x056b, code lost:
    
        if (r5 != (-3)) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0582, code lost:
    
        if (r5 != (-5)) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0586, code lost:
    
        if (r34.f27233O0 != 2) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0588, code lost:
    
        r11.i();
        r34.f27233O0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x058d, code lost:
    
        Y(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x059a, code lost:
    
        if (r11.h(r10) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x05d3, code lost:
    
        if (r34.f27239R0 != false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x05d9, code lost:
    
        if (r11.f() != false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x05db, code lost:
    
        r11.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x05e0, code lost:
    
        if (r34.f27233O0 != 2) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x05e2, code lost:
    
        r34.f27233O0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x05e5, code lost:
    
        r7 = r11.f34529f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x05eb, code lost:
    
        if (G(r11) != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x05ed, code lost:
    
        r5 = r11.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x05f1, code lost:
    
        if (r5 == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x05f3, code lost:
    
        r11.f34527d.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x05fa, code lost:
    
        if (r34.f27252Y0 == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x05fc, code lost:
    
        r0 = n0();
        r9 = r0.f27028d;
        r6 = r34.f27250X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0604, code lost:
    
        if (r6 == null) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0606, code lost:
    
        r9.c(r7, r6);
        r0.b();
        r34.f27252Y0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x060f, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0610, code lost:
    
        r34.f27245U0 = java.lang.Math.max(r34.f27245U0, r7);
        r12 = m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x061e, code lost:
    
        if (r12 == com.anythink.basead.exoplayer.b.f6382b) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x062c, code lost:
    
        if ((r7 - n0().a()) >= r12) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x063f, code lost:
    
        if (r0() != false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0647, code lost:
    
        if (r11.h(536870912) == false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x064c, code lost:
    
        r0 = n0();
        n0();
        r0.c(r34.f27245U0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0658, code lost:
    
        r11.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0661, code lost:
    
        if (r11.h(268435456) == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0663, code lost:
    
        f0(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0668, code lost:
    
        if (r34.f27259e1 == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x066a, code lost:
    
        r35 = r4;
        r3 = r34.f27245U0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0670, code lost:
    
        if (r7 > r3) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0672, code lost:
    
        r34.f27260f1 = ((r3 - r7) + 1) + r34.f27260f1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0680, code lost:
    
        r34.f27245U0 = r7;
        r34.f27247V0 = r7;
        r34.f27259e1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0689, code lost:
    
        E(r11);
        r9 = F(r11);
        r7 = r7 + r34.f27260f1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0693, code lost:
    
        if (r5 == false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0695, code lost:
    
        r35.i(r34.f27220H0, r11.f34527d, r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x06a0, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x06b9, code lost:
    
        r34.f27220H0 = -1;
        r11.f34528e = null;
        r34.f27239R0 = true;
        r34.f27233O0 = 0;
        r34.f27254Z0.f34995c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x06a2, code lost:
    
        r4 = r35;
        r5 = r34.f27220H0;
        r0 = r11.f34528e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x06af, code lost:
    
        if (r0 == null) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x06b1, code lost:
    
        r4.x(r5, r0.limit(), r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x06cd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0687, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0633, code lost:
    
        r34.f27247V0 = java.lang.Math.max(r34.f27247V0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x059c, code lost:
    
        r0 = n0();
        n0();
        r0.c(r34.f27245U0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05aa, code lost:
    
        if (r34.f27233O0 != 2) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05ac, code lost:
    
        r11.i();
        r34.f27233O0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05b1, code lost:
    
        r34.f27249W0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05b5, code lost:
    
        if (r34.f27239R0 != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x05b7, code lost:
    
        l0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05be, code lost:
    
        if (r34.f27214E0 != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05c0, code lost:
    
        r34.f27241S0 = true;
        r4.x(r34.f27220H0, 0, 4, 0);
        r34.f27220H0 = r2;
        r11.f34528e = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0571, code lost:
    
        if (r0() == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0573, code lost:
    
        r0 = n0();
        n0();
        r0.c(r34.f27245U0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x06ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x06cf, code lost:
    
        X(r0);
        u(0);
        t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x06fe, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04dd, code lost:
    
        if (r34.f27214E0 != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04df, code lost:
    
        r34.f27241S0 = true;
        r4.x(r34.f27220H0, 0, 4, 0);
        r34.f27220H0 = r2;
        r11.f34528e = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04f2, code lost:
    
        r34.f27235P0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04ef, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0010, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x073a, code lost:
    
        r3 = r0.getStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x073f, code lost:
    
        if (r3.length <= 0) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x077d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x075d, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0762, code lost:
    
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0771, code lost:
    
        r2 = 4006;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0774, code lost:
    
        r2 = 4003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04d4, code lost:
    
        r11 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x070b, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x036f, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03ee, code lost:
    
        if (r34.Y != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x01fb, code lost:
    
        r34.f27227L0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0098, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0099, code lost:
    
        r34.f27251X0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x008a, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x009c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x009d, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04a3, code lost:
    
        n0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x04aa, code lost:
    
        if (q0() == null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04ac, code lost:
    
        r4 = r34.f27270s0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04ae, code lost:
    
        if (r4 == null) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04b0, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x04b3, code lost:
    
        if (r34.f27235P0 == 2) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04b7, code lost:
    
        if (r34.f27249W0 == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x04be, code lost:
    
        if (r34.f27220H0 >= 0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04c0, code lost:
    
        r0 = r4.d();
        r34.f27220H0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x04c6, code lost:
    
        if (r0 < 0) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x04c8, code lost:
    
        r11 = r30;
        r11.f34528e = r4.D(r0);
        r11.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x04d8, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x04d9, code lost:
    
        if (r34.f27235P0 != 1) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x04f7, code lost:
    
        if (r34.C0 == false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04f9, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x04fa, code lost:
    
        r34.C0 = false;
        r0 = r11.f34528e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x04fe, code lost:
    
        if (r0 == null) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0500, code lost:
    
        r0.put(com.google.android.gms.internal.ads.RP.f27205j1);
        r4.x(r34.f27220H0, 38, 0, 0);
        r34.f27220H0 = r2;
        r11.f34528e = r3;
        r34.f27239R0 = true;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0523, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0524, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0527, code lost:
    
        if (r34.f27233O0 != 1) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0529, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x052a, code lost:
    
        r0 = r34.f27271t0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0158 A[Catch: IllegalStateException -> 0x00b2, CryptoException -> 0x00b7, TRY_ENTER, TryCatch #5 {IllegalStateException -> 0x00b2, blocks: (B:410:0x021c, B:398:0x00af, B:399:0x00c2, B:401:0x00c6, B:406:0x00d4, B:411:0x00e4, B:412:0x00f3, B:480:0x0100, B:482:0x0106, B:459:0x0204, B:461:0x020a, B:462:0x020d, B:464:0x0213, B:466:0x0217, B:416:0x0114, B:478:0x011b, B:418:0x012a, B:420:0x013a, B:423:0x0149, B:424:0x0152, B:427:0x0158, B:429:0x015c, B:431:0x0166, B:433:0x0170, B:434:0x0198, B:436:0x01a0, B:437:0x01a1, B:439:0x01a8, B:441:0x01b0, B:443:0x01b8, B:444:0x01bf, B:448:0x01d0, B:450:0x01d9, B:453:0x01f0, B:458:0x01fb, B:473:0x01e0, B:485:0x01fe, B:18:0x0237, B:35:0x0264, B:39:0x026d, B:41:0x0273, B:43:0x027b, B:45:0x0285, B:47:0x028d, B:246:0x0299, B:250:0x02a1, B:253:0x02a9, B:254:0x02b4, B:256:0x02bd, B:259:0x02c9, B:270:0x02db, B:272:0x02e1, B:273:0x02e5, B:274:0x02fb, B:275:0x0303, B:276:0x030f, B:277:0x031b, B:280:0x0327, B:282:0x0334, B:283:0x0339, B:285:0x033f, B:287:0x0340, B:289:0x0344, B:291:0x0348, B:293:0x034c, B:294:0x034f, B:296:0x0355, B:298:0x0365, B:301:0x0372, B:303:0x0381, B:304:0x0392, B:306:0x0396, B:309:0x039c, B:310:0x03aa, B:312:0x03b4, B:313:0x03c3, B:315:0x03d1, B:317:0x03d5, B:319:0x03d9, B:321:0x03e5, B:322:0x03f0, B:324:0x03f4, B:327:0x0407, B:364:0x03fe, B:365:0x03e8, B:367:0x03ec), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x01b8 A[Catch: IllegalStateException -> 0x00b2, CryptoException -> 0x00b7, TryCatch #5 {IllegalStateException -> 0x00b2, blocks: (B:410:0x021c, B:398:0x00af, B:399:0x00c2, B:401:0x00c6, B:406:0x00d4, B:411:0x00e4, B:412:0x00f3, B:480:0x0100, B:482:0x0106, B:459:0x0204, B:461:0x020a, B:462:0x020d, B:464:0x0213, B:466:0x0217, B:416:0x0114, B:478:0x011b, B:418:0x012a, B:420:0x013a, B:423:0x0149, B:424:0x0152, B:427:0x0158, B:429:0x015c, B:431:0x0166, B:433:0x0170, B:434:0x0198, B:436:0x01a0, B:437:0x01a1, B:439:0x01a8, B:441:0x01b0, B:443:0x01b8, B:444:0x01bf, B:448:0x01d0, B:450:0x01d9, B:453:0x01f0, B:458:0x01fb, B:473:0x01e0, B:485:0x01fe, B:18:0x0237, B:35:0x0264, B:39:0x026d, B:41:0x0273, B:43:0x027b, B:45:0x0285, B:47:0x028d, B:246:0x0299, B:250:0x02a1, B:253:0x02a9, B:254:0x02b4, B:256:0x02bd, B:259:0x02c9, B:270:0x02db, B:272:0x02e1, B:273:0x02e5, B:274:0x02fb, B:275:0x0303, B:276:0x030f, B:277:0x031b, B:280:0x0327, B:282:0x0334, B:283:0x0339, B:285:0x033f, B:287:0x0340, B:289:0x0344, B:291:0x0348, B:293:0x034c, B:294:0x034f, B:296:0x0355, B:298:0x0365, B:301:0x0372, B:303:0x0381, B:304:0x0392, B:306:0x0396, B:309:0x039c, B:310:0x03aa, B:312:0x03b4, B:313:0x03c3, B:315:0x03d1, B:317:0x03d5, B:319:0x03d9, B:321:0x03e5, B:322:0x03f0, B:324:0x03f4, B:327:0x0407, B:364:0x03fe, B:365:0x03e8, B:367:0x03ec), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01d0 A[Catch: IllegalStateException -> 0x00b2, CryptoException -> 0x00b7, TryCatch #5 {IllegalStateException -> 0x00b2, blocks: (B:410:0x021c, B:398:0x00af, B:399:0x00c2, B:401:0x00c6, B:406:0x00d4, B:411:0x00e4, B:412:0x00f3, B:480:0x0100, B:482:0x0106, B:459:0x0204, B:461:0x020a, B:462:0x020d, B:464:0x0213, B:466:0x0217, B:416:0x0114, B:478:0x011b, B:418:0x012a, B:420:0x013a, B:423:0x0149, B:424:0x0152, B:427:0x0158, B:429:0x015c, B:431:0x0166, B:433:0x0170, B:434:0x0198, B:436:0x01a0, B:437:0x01a1, B:439:0x01a8, B:441:0x01b0, B:443:0x01b8, B:444:0x01bf, B:448:0x01d0, B:450:0x01d9, B:453:0x01f0, B:458:0x01fb, B:473:0x01e0, B:485:0x01fe, B:18:0x0237, B:35:0x0264, B:39:0x026d, B:41:0x0273, B:43:0x027b, B:45:0x0285, B:47:0x028d, B:246:0x0299, B:250:0x02a1, B:253:0x02a9, B:254:0x02b4, B:256:0x02bd, B:259:0x02c9, B:270:0x02db, B:272:0x02e1, B:273:0x02e5, B:274:0x02fb, B:275:0x0303, B:276:0x030f, B:277:0x031b, B:280:0x0327, B:282:0x0334, B:283:0x0339, B:285:0x033f, B:287:0x0340, B:289:0x0344, B:291:0x0348, B:293:0x034c, B:294:0x034f, B:296:0x0355, B:298:0x0365, B:301:0x0372, B:303:0x0381, B:304:0x0392, B:306:0x0396, B:309:0x039c, B:310:0x03aa, B:312:0x03b4, B:313:0x03c3, B:315:0x03d1, B:317:0x03d5, B:319:0x03d9, B:321:0x03e5, B:322:0x03f0, B:324:0x03f4, B:327:0x0407, B:364:0x03fe, B:365:0x03e8, B:367:0x03ec), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x01f7 A[LOOP:5: B:412:0x00f3->B:455:0x01f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x01e0 A[Catch: IllegalStateException -> 0x00b2, CryptoException -> 0x00b7, TryCatch #5 {IllegalStateException -> 0x00b2, blocks: (B:410:0x021c, B:398:0x00af, B:399:0x00c2, B:401:0x00c6, B:406:0x00d4, B:411:0x00e4, B:412:0x00f3, B:480:0x0100, B:482:0x0106, B:459:0x0204, B:461:0x020a, B:462:0x020d, B:464:0x0213, B:466:0x0217, B:416:0x0114, B:478:0x011b, B:418:0x012a, B:420:0x013a, B:423:0x0149, B:424:0x0152, B:427:0x0158, B:429:0x015c, B:431:0x0166, B:433:0x0170, B:434:0x0198, B:436:0x01a0, B:437:0x01a1, B:439:0x01a8, B:441:0x01b0, B:443:0x01b8, B:444:0x01bf, B:448:0x01d0, B:450:0x01d9, B:453:0x01f0, B:458:0x01fb, B:473:0x01e0, B:485:0x01fe, B:18:0x0237, B:35:0x0264, B:39:0x026d, B:41:0x0273, B:43:0x027b, B:45:0x0285, B:47:0x028d, B:246:0x0299, B:250:0x02a1, B:253:0x02a9, B:254:0x02b4, B:256:0x02bd, B:259:0x02c9, B:270:0x02db, B:272:0x02e1, B:273:0x02e5, B:274:0x02fb, B:275:0x0303, B:276:0x030f, B:277:0x031b, B:280:0x0327, B:282:0x0334, B:283:0x0339, B:285:0x033f, B:287:0x0340, B:289:0x0344, B:291:0x0348, B:293:0x034c, B:294:0x034f, B:296:0x0355, B:298:0x0365, B:301:0x0372, B:303:0x0381, B:304:0x0392, B:306:0x0396, B:309:0x039c, B:310:0x03aa, B:312:0x03b4, B:313:0x03c3, B:315:0x03d1, B:317:0x03d5, B:319:0x03d9, B:321:0x03e5, B:322:0x03f0, B:324:0x03f4, B:327:0x0407, B:364:0x03fe, B:365:0x03e8, B:367:0x03ec), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x047d A[Catch: CryptoException -> 0x0013, IllegalStateException -> 0x0086, TRY_LEAVE, TryCatch #14 {IllegalStateException -> 0x0086, blocks: (B:383:0x0049, B:385:0x0068, B:387:0x007c, B:506:0x008e, B:52:0x047d, B:70:0x04c0, B:72:0x04c8, B:334:0x041a, B:343:0x044c, B:347:0x045c, B:350:0x0462, B:351:0x046d, B:354:0x0475), top: B:16:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0493 A[LOOP:0: B:28:0x0250->B:57:0x0493, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04a3 A[EDGE_INSN: B:58:0x04a3->B:59:? BREAK  A[LOOP:0: B:28:0x0250->B:57:0x0493], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06f5 A[LOOP:1: B:60:0x04a3->B:89:0x06f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0703 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.google.android.gms.internal.ads.RP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.uN] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H(long j6, long j9) {
        boolean z3;
        boolean z6;
        ?? r14;
        boolean z9;
        boolean z10;
        NP C8;
        int i;
        boolean z11;
        AbstractC3376ix abstractC3376ix;
        S0.l lVar;
        ?? r52;
        boolean z12;
        S0.l lVar2;
        char c9;
        AbstractC3376ix abstractC3376ix2;
        int i6;
        DP dp;
        boolean z13;
        long r9;
        Throwable th;
        boolean z14;
        boolean z15;
        long j10;
        C3996uN c3996uN;
        S0.l lVar3;
        int i9;
        Throwable th2;
        C3996uN c3996uN2;
        boolean z16;
        S0.l lVar4;
        boolean z17;
        boolean z18;
        Throwable th3;
        int valueTypeForKey;
        long j11 = this.f27267p0;
        int i10 = 2;
        boolean z19 = true;
        try {
            try {
                if (this.f27251X0) {
                    d0();
                    return;
                }
                if (this.f27250X == null && !u(2)) {
                    return;
                }
                v();
                boolean z20 = this.f27225K0;
                ?? r72 = this.f27236Q;
                char c10 = 0;
                char c11 = 0;
                S0.l lVar5 = this.f27274v;
                int i11 = 4;
                z6 = false;
                Throwable th4 = null;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (z20) {
                                        try {
                                            try {
                                                Trace.beginSection("bypassRender");
                                                AbstractC3376ix abstractC3376ix3 = r72;
                                                while (true) {
                                                    AbstractC2772Sd.H(this.f27251X0 ^ z19);
                                                    JP jp = this.f27240S;
                                                    if (jp.o()) {
                                                        AbstractC3376ix abstractC3376ix4 = abstractC3376ix3;
                                                        ByteBuffer byteBuffer = jp.f34528e;
                                                        int i12 = this.f27222I0;
                                                        S0.l lVar6 = lVar5;
                                                        int n9 = jp.n();
                                                        long j12 = jp.f34529f;
                                                        boolean o02 = o0(this.f27213E, jp.i);
                                                        boolean h9 = jp.h(i11);
                                                        DP dp2 = this.Y;
                                                        if (dp2 == null) {
                                                            throw th4;
                                                        }
                                                        abstractC3376ix = abstractC3376ix4;
                                                        lVar = lVar6;
                                                        if (!b0(j6, j9, null, byteBuffer, i12, 0, n9, j12, o02, h9, dp2)) {
                                                            z11 = true;
                                                            break;
                                                        } else {
                                                            h0(jp.i);
                                                            jp.i();
                                                            r52 = 0;
                                                        }
                                                    } else {
                                                        abstractC3376ix = abstractC3376ix3;
                                                        lVar = lVar5;
                                                        r52 = th4;
                                                    }
                                                    try {
                                                        if (this.f27249W0) {
                                                            break;
                                                        }
                                                        z11 = true;
                                                        try {
                                                            boolean z21 = this.f27227L0;
                                                            C3996uN c3996uN3 = this.f27238R;
                                                            if (z21) {
                                                                AbstractC2772Sd.H(jp.p(c3996uN3));
                                                                z12 = false;
                                                                this.f27227L0 = false;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (this.f27229M0) {
                                                                if (!jp.o()) {
                                                                    this.f27225K0 = z12;
                                                                    g0();
                                                                    this.f27229M0 = z12;
                                                                    v();
                                                                    if (!this.f27225K0) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    abstractC3376ix2 = abstractC3376ix;
                                                                    lVar2 = lVar;
                                                                    c9 = 65531;
                                                                    i6 = 4;
                                                                    th4 = r52;
                                                                    z19 = true;
                                                                    abstractC3376ix3 = abstractC3376ix2;
                                                                    c11 = 0;
                                                                    i11 = i6;
                                                                    lVar5 = lVar2;
                                                                    c10 = 0;
                                                                }
                                                            }
                                                            AbstractC2772Sd.H(!this.f27249W0);
                                                            lVar2 = lVar;
                                                            lVar2.f2797u = r52;
                                                            lVar2.f2798v = r52;
                                                            c3996uN3.i();
                                                            while (true) {
                                                                c3996uN3.i();
                                                                int o6 = o(lVar2, c3996uN3, z12 ? 1 : 0);
                                                                c9 = 65531;
                                                                if (o6 == -5) {
                                                                    abstractC3376ix2 = abstractC3376ix;
                                                                    i6 = 4;
                                                                    Y(lVar2);
                                                                    break;
                                                                }
                                                                if (o6 != -4) {
                                                                    if (r0()) {
                                                                        n0().c(this.f27245U0);
                                                                    }
                                                                    abstractC3376ix2 = abstractC3376ix;
                                                                    i6 = 4;
                                                                } else {
                                                                    i6 = 4;
                                                                    if (c3996uN3.h(4)) {
                                                                        this.f27249W0 = true;
                                                                        n0().c(this.f27245U0);
                                                                        abstractC3376ix2 = abstractC3376ix;
                                                                        break;
                                                                    }
                                                                    this.f27245U0 = Math.max(this.f27245U0, c3996uN3.f34529f);
                                                                    if (r0()) {
                                                                        abstractC3376ix2 = abstractC3376ix;
                                                                    } else {
                                                                        abstractC3376ix2 = abstractC3376ix;
                                                                        if (abstractC3376ix2.h(536870912)) {
                                                                        }
                                                                        if (this.f27252Y0) {
                                                                            DP dp3 = this.f27250X;
                                                                            if (dp3 == null) {
                                                                                throw r52;
                                                                            }
                                                                            this.Y = dp3;
                                                                            if (Objects.equals(dp3.f24431o, com.anythink.basead.exoplayer.k.o.f8427H) && !this.Y.f24434r.isEmpty()) {
                                                                                byte[] bArr = (byte[]) this.Y.f24434r.get(z12 ? 1 : 0);
                                                                                int i13 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                                                                C3299hP a9 = this.Y.a();
                                                                                a9.a(i13);
                                                                                this.Y = a9.b();
                                                                            }
                                                                            Z(this.Y, r52);
                                                                            this.f27252Y0 = z12;
                                                                        }
                                                                        c3996uN3.l();
                                                                        dp = this.Y;
                                                                        if (dp != null && Objects.equals(dp.f24431o, com.anythink.basead.exoplayer.k.o.f8427H)) {
                                                                            if (c3996uN3.h(268435456)) {
                                                                                c3996uN3.f34526c = this.Y;
                                                                                f0(c3996uN3);
                                                                            }
                                                                            if (this.f27213E - c3996uN3.f34529f > 80000 ? true : z12 ? 1 : 0) {
                                                                                this.f27246V.b(c3996uN3, this.Y.f24434r);
                                                                            }
                                                                        }
                                                                        if (!jp.o()) {
                                                                            long j13 = this.f27213E;
                                                                            if (o0(j13, jp.i) != o0(j13, c3996uN3.f34529f)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (jp.p(c3996uN3)) {
                                                                            break;
                                                                        } else {
                                                                            abstractC3376ix = abstractC3376ix2;
                                                                        }
                                                                    }
                                                                    n0().c(this.f27245U0);
                                                                    if (this.f27252Y0) {
                                                                    }
                                                                    c3996uN3.l();
                                                                    dp = this.Y;
                                                                    if (dp != null) {
                                                                        if (c3996uN3.h(268435456)) {
                                                                        }
                                                                        if (this.f27213E - c3996uN3.f34529f > 80000 ? true : z12 ? 1 : 0) {
                                                                        }
                                                                    }
                                                                    if (!jp.o()) {
                                                                    }
                                                                    if (jp.p(c3996uN3)) {
                                                                    }
                                                                }
                                                            }
                                                            if (jp.o()) {
                                                                jp.l();
                                                            }
                                                            if (!jp.o() && !this.f27249W0 && !this.f27229M0) {
                                                                break;
                                                            }
                                                            th4 = r52;
                                                            z19 = true;
                                                            abstractC3376ix3 = abstractC3376ix2;
                                                            c11 = 0;
                                                            i11 = i6;
                                                            lVar5 = lVar2;
                                                            c10 = 0;
                                                        } catch (IllegalStateException e9) {
                                                            e = e9;
                                                            r72 = 0;
                                                            z6 = z11;
                                                            r14 = r72;
                                                            z9 = e instanceof MediaCodec.CodecException;
                                                            if (!z9) {
                                                            }
                                                            X(e);
                                                            if (z9) {
                                                            }
                                                            z10 = r14;
                                                            if (z10) {
                                                            }
                                                            C8 = C(e, this.f27283z0);
                                                            if (C8.f26489n != 1101) {
                                                            }
                                                            throw n(C8, this.f27250X, z10, i);
                                                        }
                                                    } catch (IllegalStateException e10) {
                                                        e = e10;
                                                        z11 = true;
                                                    }
                                                }
                                                Trace.endSection();
                                            } catch (IllegalStateException e11) {
                                                e = e11;
                                                z11 = z19;
                                            }
                                        } catch (MediaCodec.CryptoException e12) {
                                            e = e12;
                                            r72 = 0;
                                            z3 = r72;
                                            throw n(e, this.f27250X, z3, AbstractC3159eu.g(e.getErrorCode()));
                                        }
                                    } else {
                                        boolean z22 = true;
                                        S0.l lVar7 = lVar5;
                                        int i14 = 4;
                                        Throwable th5 = null;
                                        C3996uN c3996uN4 = r72;
                                        boolean z23 = false;
                                        try {
                                            if (this.f27270s0 != null) {
                                                try {
                                                    V2 v22 = this.f27282z;
                                                    v22.getClass();
                                                    r9 = v22.r();
                                                    Trace.beginSection("drainAndFeed");
                                                    while (true) {
                                                        LP lp = this.f27270s0;
                                                        if (lp == null) {
                                                            throw th5;
                                                        }
                                                        boolean z24 = this.f27222I0 >= 0 ? z22 : z23;
                                                        MediaCodec.BufferInfo bufferInfo = this.f27242T;
                                                        try {
                                                            if (!z24) {
                                                                int t6 = lp.t(bufferInfo);
                                                                if (t6 >= 0) {
                                                                    th = th5;
                                                                    int i15 = i14;
                                                                    bufferInfo.presentationTimeUs -= this.f27260f1;
                                                                    if (!this.f27212D0) {
                                                                        if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                            l0();
                                                                            j10 = j11;
                                                                            lVar3 = lVar7;
                                                                            c3996uN = c3996uN4;
                                                                            i14 = i15;
                                                                            th2 = th;
                                                                            break;
                                                                        }
                                                                        this.f27222I0 = t6;
                                                                        ByteBuffer b9 = lp.b(t6);
                                                                        this.f27223J0 = b9;
                                                                        if (b9 != null) {
                                                                            b9.position(bufferInfo.offset);
                                                                            this.f27223J0.limit(bufferInfo.offset + bufferInfo.size);
                                                                        }
                                                                        DP dp4 = (DP) this.f27255a1.f27028d.f(bufferInfo.presentationTimeUs);
                                                                        if (dp4 == null && this.f27257c1 && this.f27273u0 != null) {
                                                                            dp4 = (DP) this.f27255a1.f27028d.e();
                                                                        }
                                                                        if (dp4 != null) {
                                                                            this.Y = dp4;
                                                                        } else if (this.f27275v0) {
                                                                        }
                                                                        DP dp5 = this.Y;
                                                                        if (dp5 == null) {
                                                                            throw th;
                                                                        }
                                                                        Z(dp5, this.f27273u0);
                                                                        this.f27275v0 = z23;
                                                                        this.f27257c1 = z23;
                                                                    } else {
                                                                        this.f27212D0 = z23;
                                                                        lp.q(t6);
                                                                        j10 = j11;
                                                                        lVar3 = lVar7;
                                                                        c3996uN = c3996uN4;
                                                                        i14 = i15;
                                                                        th3 = th;
                                                                        i9 = -1;
                                                                        th2 = th3;
                                                                        if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                                                                        }
                                                                        z18 = true;
                                                                        if (z18) {
                                                                        }
                                                                    }
                                                                } else if (t6 == -2) {
                                                                    this.f27243T0 = z22;
                                                                    LP lp2 = this.f27270s0;
                                                                    if (lp2 == null) {
                                                                        throw th5;
                                                                    }
                                                                    MediaFormat h10 = lp2.h();
                                                                    if (this.f27207A0 != 0 && h10.getInteger("width") == 32 && h10.getInteger("height") == 32) {
                                                                        this.f27212D0 = z22;
                                                                    } else {
                                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                                            C3823rC c3823rC = this.f27263i1;
                                                                            if (!c3823rC.isEmpty()) {
                                                                                C4104wN c4104wN = C4104wN.f34830b;
                                                                                HashMap hashMap = new HashMap();
                                                                                Iterator it = c3823rC.iterator();
                                                                                while (true) {
                                                                                    AbstractC3499lB abstractC3499lB = (AbstractC3499lB) it;
                                                                                    if (!abstractC3499lB.hasNext()) {
                                                                                        break;
                                                                                    }
                                                                                    String str = (String) abstractC3499lB.next();
                                                                                    if (h10.containsKey(str)) {
                                                                                        valueTypeForKey = h10.getValueTypeForKey(str);
                                                                                        if (valueTypeForKey == z22) {
                                                                                            hashMap.put(str, Integer.valueOf(h10.getInteger(str)));
                                                                                        } else if (valueTypeForKey == i10) {
                                                                                            hashMap.put(str, Long.valueOf(h10.getLong(str)));
                                                                                        } else if (valueTypeForKey == 3) {
                                                                                            hashMap.put(str, Float.valueOf(h10.getFloat(str)));
                                                                                        } else if (valueTypeForKey == i14) {
                                                                                            hashMap.put(str, h10.getString(str));
                                                                                        } else if (valueTypeForKey == 5) {
                                                                                            ByteBuffer byteBuffer2 = h10.getByteBuffer(str);
                                                                                            if (byteBuffer2 == null) {
                                                                                                hashMap.put(str, th5);
                                                                                            } else {
                                                                                                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer2.remaining());
                                                                                                allocate.put(byteBuffer2.duplicate());
                                                                                                allocate.flip();
                                                                                                hashMap.put(str, allocate);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                C4104wN c4104wN2 = new C4104wN(hashMap);
                                                                                if (!c4104wN2.equals(this.f27262h1)) {
                                                                                    this.f27262h1 = c4104wN2;
                                                                                    c0(c4104wN2);
                                                                                }
                                                                            }
                                                                        }
                                                                        this.f27273u0 = h10;
                                                                        this.f27275v0 = z22;
                                                                    }
                                                                    j10 = j11;
                                                                    th3 = th5;
                                                                    lVar3 = lVar7;
                                                                    c3996uN = c3996uN4;
                                                                    i9 = -1;
                                                                    th2 = th3;
                                                                    if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                                                                        this.f27282z.getClass();
                                                                        if (SystemClock.elapsedRealtime() - r9 >= j10) {
                                                                            z18 = false;
                                                                            if (z18) {
                                                                                break;
                                                                            }
                                                                            th5 = th2;
                                                                            j11 = j10;
                                                                            c3996uN4 = c3996uN;
                                                                            lVar7 = lVar3;
                                                                            i10 = 2;
                                                                            z22 = true;
                                                                            z23 = false;
                                                                        }
                                                                    }
                                                                    z18 = true;
                                                                    if (z18) {
                                                                    }
                                                                } else {
                                                                    if (this.f27214E0 && (this.f27249W0 || this.f27235P0 == i10)) {
                                                                        l0();
                                                                    }
                                                                    long j14 = this.f27216F0;
                                                                    if (j14 != com.anythink.basead.exoplayer.b.f6382b) {
                                                                        long j15 = j14 + 100;
                                                                        this.f27282z.getClass();
                                                                        if (j15 < System.currentTimeMillis()) {
                                                                            l0();
                                                                        }
                                                                    }
                                                                    j10 = j11;
                                                                    th2 = th5;
                                                                    lVar3 = lVar7;
                                                                    c3996uN = c3996uN4;
                                                                }
                                                            } else {
                                                                th = th5;
                                                            }
                                                            ByteBuffer byteBuffer3 = this.f27223J0;
                                                            S0.l lVar8 = lVar7;
                                                            int i16 = this.f27222I0;
                                                            int i17 = bufferInfo.flags;
                                                            C3996uN c3996uN5 = c3996uN4;
                                                            long j16 = bufferInfo.presentationTimeUs;
                                                            DP dp6 = this.Y;
                                                            if (dp6 == null) {
                                                                throw th;
                                                            }
                                                            boolean z25 = z15;
                                                            j10 = j11;
                                                            c3996uN = c3996uN5;
                                                            lVar3 = lVar8;
                                                            if (!b0(j6, j9, lp, byteBuffer3, i16, i17, 1, j16, z14, z25, dp6)) {
                                                                i9 = -1;
                                                                th2 = 0;
                                                                i14 = 4;
                                                                break;
                                                            }
                                                            h0(bufferInfo.presentationTimeUs);
                                                            i14 = 4;
                                                            boolean z26 = (bufferInfo.flags & 4) != 0;
                                                            if (!z26 && this.f27241S0 && z25) {
                                                                this.f27282z.getClass();
                                                                this.f27216F0 = System.currentTimeMillis();
                                                            }
                                                            i9 = -1;
                                                            this.f27222I0 = -1;
                                                            th2 = 0;
                                                            th2 = 0;
                                                            this.f27223J0 = null;
                                                            if (z26) {
                                                                l0();
                                                                break;
                                                            }
                                                            if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                                                            }
                                                            z18 = true;
                                                            if (z18) {
                                                            }
                                                        } catch (IllegalStateException e13) {
                                                            e = e13;
                                                            z13 = false;
                                                            z6 = true;
                                                            r14 = z13;
                                                            z9 = e instanceof MediaCodec.CodecException;
                                                            if (!z9) {
                                                            }
                                                            X(e);
                                                            if (z9) {
                                                            }
                                                            z10 = r14;
                                                            if (z10) {
                                                            }
                                                            C8 = C(e, this.f27283z0);
                                                            if (C8.f26489n != 1101) {
                                                            }
                                                            throw n(C8, this.f27250X, z10, i);
                                                        }
                                                        z14 = (this.f27259e1 || bufferInfo.presentationTimeUs < this.f27213E) ? z22 : z23;
                                                        long j17 = this.f27255a1.f27030f;
                                                        z15 = j17 != com.anythink.basead.exoplayer.b.f6382b && j17 <= bufferInfo.presentationTimeUs;
                                                    }
                                                } catch (IllegalStateException e14) {
                                                    e = e14;
                                                    z13 = z23;
                                                }
                                            } else {
                                                C4158xN c4158xN = this.f27254Z0;
                                                int i18 = c4158xN.f34996d;
                                                IQ iq = this.f27208B;
                                                iq.getClass();
                                                c4158xN.f34996d = i18 + iq.a(j6 - this.f27211D);
                                                u(1);
                                            }
                                        } catch (IllegalStateException e15) {
                                            e = e15;
                                        }
                                    }
                                    this.f27254Z0.a();
                                    return;
                                } catch (IllegalStateException e16) {
                                    e = e16;
                                }
                            } catch (IllegalStateException e17) {
                                e = e17;
                            }
                        } catch (MediaCodec.CryptoException e18) {
                            e = e18;
                            throw n(e, this.f27250X, z3, AbstractC3159eu.g(e.getErrorCode()));
                        }
                    } catch (IllegalStateException e19) {
                        e = e19;
                        z6 = true;
                    }
                } catch (MediaCodec.CryptoException e20) {
                    e = e20;
                }
                if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                    this.f27282z.getClass();
                    if (SystemClock.elapsedRealtime() - r9 >= j10) {
                        z17 = z16;
                        if (z17) {
                            Trace.endSection();
                            this.f27254Z0.a();
                            return;
                        } else {
                            c3996uN = c3996uN2;
                            lVar3 = lVar4;
                            th2 = 0;
                        }
                    }
                }
                z17 = true;
                if (z17) {
                }
            } catch (IllegalStateException e21) {
                e = e21;
                z6 = true;
            }
        } catch (MediaCodec.CryptoException e22) {
            e = e22;
            z3 = false;
        }
    }

    public abstract boolean I();

    public abstract boolean J();

    public final int L(DP dp) {
        try {
            return M(this.f27232O, dp);
        } catch (TP e9) {
            throw n(e9, dp, false, 4002);
        }
    }

    public abstract int M(C3084dP c3084dP, DP dp);

    public final void N(long j6, boolean z3, boolean z6) {
        this.f27217G = false;
        this.f27213E = j6;
        this.f27215F = j6;
        if (!z6) {
            IQ iq = this.f27208B;
            iq.getClass();
            z6 = iq.a(j6 - this.f27211D) != 0;
        }
        c(j6, z3, z6);
    }

    public abstract ArrayList O(C3084dP c3084dP, DP dp);

    public final void P() {
        C3676oQ c3676oQ;
        int e9;
        if (this.f27221I.g() || (c3676oQ = this.J) == null || (e9 = this.f27221I.e(c3676oQ.f32905a)) == -1) {
            this.f27224K = com.anythink.basead.exoplayer.b.f6382b;
            return;
        }
        K7 d2 = this.f27221I.d(e9, new K7(), false);
        this.f27224K = d2.f25868d;
        int i = c3676oQ.f32906b;
        if (i != -1) {
            this.f27224K = d2.f25870f.a(i).f28987e[c3676oQ.f32907c];
            return;
        }
        int i6 = c3676oQ.f32909e;
        if (i6 != -1) {
            d2.f25870f.a(i6).getClass();
            this.f27224K = 0L;
        }
    }

    public boolean Q(DP dp) {
        return false;
    }

    public abstract C3864s R(OP op, DP dp, float f3);

    public abstract C4212yN S(OP op, DP dp, DP dp2, boolean z3);

    public long T(long j6) {
        if (this.f27206A == 1) {
            return (I() || J()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract float U(float f3, DP dp, DP[] dpArr);

    public abstract void V(String str, long j6, long j9);

    public abstract void W(String str);

    public abstract void X(Exception exc);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (java.util.Objects.equals(r3, "video/av01") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (k0() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00eb, code lost:
    
        if (k0() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f9, code lost:
    
        if (k0() == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4212yN Y(S0.l lVar) {
        int i;
        Pair c9;
        String str;
        boolean z3 = true;
        this.f27252Y0 = true;
        DP dp = (DP) lVar.f2798v;
        dp.getClass();
        String str2 = dp.f24431o;
        if (str2 == null) {
            throw n(new IllegalArgumentException("Sample MIME type is null."), dp, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals(com.anythink.basead.exoplayer.k.o.f8453k)) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = AbstractC4228ym.f35218a;
                if (str2.equals("video/dolby-vision") && (c9 = AbstractC4228ym.c(dp)) != null) {
                    int intValue = ((Integer) c9.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = com.anythink.basead.exoplayer.k.o.i;
                    } else if (intValue == 512) {
                        str = com.anythink.basead.exoplayer.k.o.f8451h;
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = null;
            }
            DP dp2 = dp;
            this.f27265n0 = (C3105du) lVar.f2797u;
            this.f27250X = dp2;
            if (!this.f27225K0) {
                this.f27229M0 = true;
                return null;
            }
            LP lp = this.f27270s0;
            if (lp == null) {
                this.f27279x0 = null;
                v();
                return null;
            }
            OP op = this.f27283z0;
            op.getClass();
            DP dp3 = this.f27271t0;
            dp3.getClass();
            C3105du c3105du = this.f27253Z;
            C3105du c3105du2 = this.f27265n0;
            if (c3105du != c3105du2) {
                if (this.f27239R0) {
                    this.f27235P0 = 1;
                    this.f27237Q0 = 3;
                } else {
                    x();
                    v();
                }
                return new C4212yN(op.f26604a, dp3, dp2, 0, 128);
            }
            C4212yN S8 = S(op, dp3, dp2, n0().f27029e);
            int i6 = S8.f35155d;
            if (i6 != 0) {
                if (i6 == 1) {
                    j0(dp2);
                    this.f27271t0 = dp2;
                    if (c3105du2 == c3105du) {
                        if (this.f27239R0) {
                            this.f27235P0 = 1;
                            if (y()) {
                                this.f27237Q0 = 3;
                                i = 2;
                            } else {
                                this.f27237Q0 = 1;
                            }
                        }
                    }
                } else if (i6 != 2) {
                    j0(dp2);
                    this.f27271t0 = dp2;
                    if (c3105du2 != c3105du) {
                    }
                } else {
                    j0(dp2);
                    this.f27231N0 = true;
                    this.f27233O0 = 1;
                    int i9 = this.f27207A0;
                    if (i9 != 2 && (i9 != 1 || dp2.f24438v != dp3.f24438v || dp2.f24439w != dp3.f24439w)) {
                        z3 = false;
                    }
                    this.C0 = z3;
                    this.f27271t0 = dp2;
                    if (c3105du2 != c3105du) {
                    }
                }
                return (i6 != 0 || (this.f27270s0 == lp && this.f27237Q0 != 3)) ? S8 : new C4212yN(op.f26604a, dp3, dp2, 0, i);
            }
            if (this.f27239R0) {
                this.f27235P0 = 1;
                this.f27237Q0 = 3;
            } else {
                x();
                v();
            }
            i = 0;
            if (i6 != 0) {
            }
        }
        if (!dp.f24434r.isEmpty()) {
            C3299hP c3299hP = new C3299hP(dp);
            c3299hP.f30795q = null;
            dp = new DP(c3299hP);
        }
        DP dp22 = dp;
        this.f27265n0 = (C3105du) lVar.f2797u;
        this.f27250X = dp22;
        if (!this.f27225K0) {
        }
    }

    public abstract void Z(DP dp, MediaFormat mediaFormat);

    public abstract void a0();

    public abstract boolean b0(long j6, long j9, LP lp, ByteBuffer byteBuffer, int i, int i6, int i9, long j10, boolean z3, boolean z6, DP dp);

    public void c(long j6, boolean z3, boolean z6) {
        ArrayDeque arrayDeque = this.f27244U;
        if (!arrayDeque.isEmpty()) {
            this.f27255a1 = (QP) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z6) {
            this.f27249W0 = false;
            this.f27251X0 = false;
            if (this.f27225K0) {
                g0();
            } else if (this.f27270s0 != null) {
                if (y()) {
                    x();
                    v();
                } else if (z()) {
                    t();
                } else {
                    this.f27259e1 = true;
                }
            }
            if (this.f27255a1.f27028d.d() > 0) {
                this.f27252Y0 = true;
            }
            H3.q qVar = this.f27255a1.f27028d;
            synchronized (qVar) {
                qVar.f1146a = 0;
                qVar.f1147b = 0;
                Arrays.fill((Object[]) qVar.f1149d, (Object) null);
            }
            this.f27255a1.f27029e = false;
        }
    }

    public abstract void c0(C4104wN c4104wN);

    public abstract void d();

    public abstract void d0();

    public abstract void e();

    public void e0(long j6) {
    }

    public void f() {
        this.f27250X = null;
        m0(QP.f27024g);
        this.f27244U.clear();
        if (this.f27225K0) {
            this.f27225K0 = false;
            g0();
        } else {
            if (this.f27270s0 == null) {
                return;
            }
            if (y()) {
                x();
            } else if (z()) {
                t();
            } else {
                this.f27259e1 = true;
            }
        }
    }

    public abstract void f0(C3996uN c3996uN);

    public final void g0() {
        this.f27245U0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27247V0 = com.anythink.basead.exoplayer.b.f6382b;
        n0().f27030f = com.anythink.basead.exoplayer.b.f6382b;
        this.f27256b1 = com.anythink.basead.exoplayer.b.f6382b;
        this.f27229M0 = false;
        this.f27240S.i();
        this.f27238R.i();
        this.f27227L0 = false;
        C3921t2 c3921t2 = this.f27246V;
        c3921t2.getClass();
        c3921t2.f34193v = InterfaceC3147ei.f29965a;
        c3921t2.f34192u = 0;
        c3921t2.f34191n = 2;
    }

    public void h0(long j6) {
        this.f27256b1 = Math.max(j6, this.f27256b1);
        while (true) {
            ArrayDeque arrayDeque = this.f27244U;
            if (arrayDeque.isEmpty() || j6 < ((QP) arrayDeque.peek()).f27025a) {
                return;
            }
            QP qp = (QP) arrayDeque.poll();
            qp.getClass();
            m0(qp);
            a0();
        }
    }

    public abstract void i();

    public final void i0(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.f27261g1.f34831a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    public final void j0(DP dp) {
        if (this.f27270s0 == null || this.f27237Q0 == 3 || this.f27206A == 0) {
            return;
        }
        float f3 = this.f27269r0;
        dp.getClass();
        DP[] dpArr = this.f27210C;
        dpArr.getClass();
        float U3 = U(f3, dp, dpArr);
        float f9 = this.f27277w0;
        if (f9 == U3 || U3 == -1.0f) {
            return;
        }
        if (f9 != -1.0f || U3 > 0.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", U3);
            LP lp = this.f27270s0;
            lp.getClass();
            lp.j(bundle);
            this.f27277w0 = U3;
        }
    }

    public abstract void k();

    public final boolean k0() {
        if (this.f27239R0) {
            this.f27235P0 = 1;
            if (y()) {
                this.f27237Q0 = 3;
                return false;
            }
            this.f27237Q0 = 2;
            return true;
        }
        C3105du c3105du = this.f27265n0;
        c3105du.getClass();
        this.f27253Z = c3105du;
        this.f27235P0 = 0;
        this.f27237Q0 = 0;
        return true;
    }

    public final void l() {
        this.f27276w.getClass();
    }

    public final void l0() {
        int i = this.f27237Q0;
        if (i == 1) {
            t();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.f27251X0 = true;
                d0();
                return;
            } else {
                x();
                v();
                return;
            }
        }
        t();
        C3105du c3105du = this.f27265n0;
        c3105du.getClass();
        this.f27253Z = c3105du;
        this.f27235P0 = 0;
        this.f27237Q0 = 0;
    }

    public final long m() {
        return this.f27224K;
    }

    public final void m0(QP qp) {
        this.f27255a1 = qp;
        long j6 = qp.f27027c;
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            this.f27257c1 = true;
            e0(j6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DN n(Exception exc, DP dp, boolean z3, int i) {
        int i6;
        if (dp != null && !this.f27219H) {
            this.f27219H = true;
            try {
                i6 = L(dp) & 7;
            } catch (DN unused) {
            } finally {
                this.f27219H = false;
            }
            return new DN(1, exc, i, p(), this.f27278x, dp, dp != null ? 4 : i6, this.J, z3);
        }
        i6 = 4;
        return new DN(1, exc, i, p(), this.f27278x, dp, dp != null ? 4 : i6, this.J, z3);
    }

    public final QP n0() {
        ArrayDeque arrayDeque = this.f27244U;
        return !arrayDeque.isEmpty() ? (QP) arrayDeque.getLast() : this.f27255a1;
    }

    public final int o(S0.l lVar, C3996uN c3996uN, int i) {
        IQ iq = this.f27208B;
        iq.getClass();
        int b9 = iq.b(lVar, c3996uN, i);
        if (b9 == -4) {
            int i6 = i & 1;
            if (c3996uN.h(4)) {
                if (i6 == 0) {
                    this.f27215F = Long.MIN_VALUE;
                }
                return this.f27217G ? -4 : -3;
            }
            long j6 = c3996uN.f34529f + this.f27211D;
            c3996uN.f34529f = j6;
            if (i6 == 0) {
                this.f27215F = Math.max(this.f27215F, j6);
                return -4;
            }
        } else if (b9 == -5) {
            DP dp = (DP) lVar.f2798v;
            dp.getClass();
            long j9 = dp.f24436t;
            if (j9 != Long.MAX_VALUE) {
                C3299hP c3299hP = new C3299hP(dp);
                c3299hP.f30797s = j9 + this.f27211D;
                lVar.f2798v = new DP(c3299hP);
                return -5;
            }
        }
        return b9;
    }

    public final boolean o0(long j6, long j9) {
        if (j9 >= j6) {
            return false;
        }
        DP dp = this.Y;
        return dp == null || !Objects.equals(dp.f24431o, com.anythink.basead.exoplayer.k.o.f8427H) || j6 - j9 > 80000;
    }

    public abstract String p();

    public final void p0(DP[] dpArr, IQ iq, long j6, long j9, C3676oQ c3676oQ) {
        AbstractC2772Sd.H(!this.f27217G);
        this.f27208B = iq;
        this.J = c3676oQ;
        P();
        if (this.f27215F == Long.MIN_VALUE) {
            this.f27215F = j6;
        }
        this.f27210C = dpArr;
        this.f27211D = j9;
        v0(dpArr, j6, j9, c3676oQ);
    }

    public boolean q(long j6) {
        return false;
    }

    public final IQ q0() {
        return this.f27208B;
    }

    public void r(float f3, float f9) {
        this.f27268q0 = f3;
        this.f27269r0 = f9;
        j0(this.f27271t0);
    }

    public final boolean r0() {
        return this.f27215F == Long.MIN_VALUE;
    }

    public InterfaceC2976bO s0() {
        return null;
    }

    public final void t() {
        try {
            LP lp = this.f27270s0;
            if (lp == null) {
                throw null;
            }
            lp.k();
        } finally {
            A();
        }
    }

    public final void t0() {
        synchronized (this.f27264n) {
            this.f27226L = null;
        }
    }

    public final boolean u(int i) {
        S0.l lVar = this.f27274v;
        lVar.f2797u = null;
        lVar.f2798v = null;
        C3996uN c3996uN = this.f27234P;
        c3996uN.i();
        int o6 = o(lVar, c3996uN, i | 4);
        if (o6 == -5) {
            Y(lVar);
            return true;
        }
        if (o6 != -4 || !c3996uN.h(4)) {
            return false;
        }
        this.f27249W0 = true;
        l0();
        return false;
    }

    public abstract void u0(boolean z3, boolean z6);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c5 A[Catch: PP -> 0x02e0, TryCatch #8 {PP -> 0x02e0, blocks: (B:145:0x0297, B:147:0x02c5, B:148:0x02d0, B:150:0x02dd, B:151:0x02f7, B:156:0x02ff, B:157:0x0301, B:158:0x02e2, B:202:0x0305, B:204:0x0306, B:207:0x0313, B:208:0x0314, B:209:0x0321, B:221:0x0327), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02dd A[Catch: PP -> 0x02e0, TryCatch #8 {PP -> 0x02e0, blocks: (B:145:0x0297, B:147:0x02c5, B:148:0x02d0, B:150:0x02dd, B:151:0x02f7, B:156:0x02ff, B:157:0x0301, B:158:0x02e2, B:202:0x0305, B:204:0x0306, B:207:0x0313, B:208:0x0314, B:209:0x0321, B:221:0x0327), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e2 A[Catch: PP -> 0x02e0, TryCatch #8 {PP -> 0x02e0, blocks: (B:145:0x0297, B:147:0x02c5, B:148:0x02d0, B:150:0x02dd, B:151:0x02f7, B:156:0x02ff, B:157:0x0301, B:158:0x02e2, B:202:0x0305, B:204:0x0306, B:207:0x0313, B:208:0x0314, B:209:0x0321, B:221:0x0327), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb A[Catch: Exception -> 0x010f, TRY_ENTER, TryCatch #0 {Exception -> 0x010f, blocks: (B:168:0x00e7, B:169:0x00ec, B:175:0x00f7, B:176:0x00f8, B:178:0x0101, B:68:0x0156, B:72:0x0188, B:74:0x0190, B:76:0x019a, B:78:0x01a2, B:80:0x01aa, B:86:0x01bb, B:91:0x01cb, B:99:0x022d, B:104:0x024c, B:106:0x0252, B:108:0x0256, B:110:0x0264, B:120:0x01d9, B:122:0x01e1, B:124:0x01e9, B:126:0x01f1, B:128:0x01f9, B:130:0x0201, B:134:0x0213, B:136:0x021d, B:184:0x0117, B:172:0x00ef, B:174:0x00f3, B:179:0x0114), top: B:167:0x00e7, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0229 A[Catch: Exception -> 0x0275, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0275, blocks: (B:65:0x0145, B:97:0x0229), top: B:64:0x0145 }] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        DP dp;
        ?? r17;
        boolean z3;
        RP rp;
        Exception exc;
        PP pp;
        boolean z6;
        RP rp2;
        DP dp2;
        int i;
        long j6;
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        long elapsedRealtime;
        int i6;
        boolean z9;
        LogSessionId unused;
        RP rp3 = this;
        RP rp4 = null;
        if (rp3.f27270s0 == null && !rp3.f27225K0 && (dp = rp3.f27250X) != null) {
            boolean z10 = true;
            if (rp3.f27265n0 == null && rp3.Q(dp)) {
                rp3.f27225K0 = false;
                rp3.g0();
                String str = dp.f24431o;
                boolean equals2 = com.anythink.basead.exoplayer.k.o.f8460r.equals(str);
                JP jp = rp3.f27240S;
                if (equals2 || com.anythink.basead.exoplayer.k.o.f8462t.equals(str) || com.anythink.basead.exoplayer.k.o.f8427H.equals(str)) {
                    jp.f25684k = 32;
                } else {
                    jp.f25684k = 1;
                }
                rp3.f27225K0 = true;
                return;
            }
            rp3.f27253Z = rp3.f27265n0;
            try {
                DP dp3 = rp3.f27250X;
                try {
                    if (dp3 == null) {
                        throw null;
                    }
                    if (rp3.f27279x0 == null) {
                        try {
                            ArrayList O8 = rp3.O(rp3.f27232O, dp3);
                            O8.isEmpty();
                            rp3.f27279x0 = new ArrayDeque();
                            if (!O8.isEmpty()) {
                                rp3.f27279x0.add((OP) O8.get(0));
                            }
                            rp3.f27281y0 = null;
                        } catch (TP e9) {
                            throw new PP(dp3, e9, -49998);
                        }
                    }
                    if (rp3.f27279x0.isEmpty()) {
                        throw new PP(dp3, null, -49999);
                    }
                    ArrayDeque arrayDeque = rp3.f27279x0;
                    if (arrayDeque == null) {
                        throw null;
                    }
                    while (rp3.f27270s0 == null) {
                        OP op = (OP) arrayDeque.peekFirst();
                        if (op == null) {
                            throw rp4;
                        }
                        String str2 = op.f26604a;
                        rp3.D(dp3);
                        if (rp3.w(op)) {
                            try {
                                rp3.f27283z0 = op;
                                dp2 = rp3.f27250X;
                            } catch (Exception e10) {
                                e = e10;
                                r17 = rp4;
                                z3 = z10;
                            }
                            if (dp2 == null) {
                                throw rp4;
                            }
                            float f3 = rp3.f27269r0;
                            try {
                                DP[] dpArr = rp3.f27210C;
                                dpArr.getClass();
                                float U3 = rp3.U(f3, dp2, dpArr);
                                if (U3 <= 0.0f) {
                                    U3 = -1.0f;
                                }
                                rp3.f27282z.getClass();
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                z3 = z10;
                                try {
                                    C3864s R8 = rp3.R(op, dp2, U3);
                                    i = Build.VERSION.SDK_INT;
                                    r17 = rp4;
                                    ?? r72 = 31;
                                    if (i >= 31) {
                                        try {
                                            IO io = rp3.f27280y;
                                            io.getClass();
                                            synchronized (io) {
                                                j6 = elapsedRealtime2;
                                                C3534lt c3534lt = io.f25500b;
                                                if (c3534lt == null) {
                                                    throw r17;
                                                }
                                                logSessionId = (LogSessionId) c3534lt.f31863u;
                                            }
                                            unused = LogSessionId.LOG_SESSION_ID_NONE;
                                            equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                            r72 = io;
                                            if (!equals) {
                                                MediaFormat mediaFormat = (MediaFormat) R8.f33787v;
                                                stringId = logSessionId.getStringId();
                                                mediaFormat.setString("log-session-id", stringId);
                                                r72 = "log-session-id";
                                            }
                                        } catch (Exception e11) {
                                            exc = e11;
                                            rp = rp3;
                                            r17 = r17;
                                            AbstractC2968bG.C("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                            arrayDeque.removeFirst();
                                            String str3 = op.f26604a;
                                            int length = str3.length();
                                            String dp4 = dp3.toString();
                                            PP pp2 = new PP(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(length + 23 + dp4.length()), "Decoder init failed: ", str3, ", ", dp4), exc, dp3.f24431o, op, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                            rp.X(pp2);
                                            pp = rp.f27281y0;
                                            if (pp == null) {
                                                rp.f27281y0 = pp2;
                                            } else {
                                                rp.f27281y0 = new PP(pp.getMessage(), pp.getCause(), pp.f26815n, pp.f26816u, pp.f26817v);
                                            }
                                            if (arrayDeque.isEmpty()) {
                                                throw rp.f27281y0;
                                            }
                                            rp3 = rp;
                                            z10 = z3;
                                            rp4 = r17;
                                        }
                                    } else {
                                        j6 = elapsedRealtime2;
                                    }
                                    try {
                                        try {
                                            StringBuilder sb = new StringBuilder(str2.length() + 12);
                                            sb.append("createCodec:");
                                            sb.append(str2);
                                            Trace.beginSection(sb.toString());
                                            LP b9 = rp3.f27230N.b(R8);
                                            rp3.f27270s0 = b9;
                                            b9.o(new C4019ut(rp3));
                                            try {
                                                Trace.endSection();
                                                try {
                                                    rp3.f27282z.getClass();
                                                    elapsedRealtime = SystemClock.elapsedRealtime();
                                                    if (!op.b(rp3.f27228M, dp2)) {
                                                        String c9 = DP.c(dp2);
                                                        String str4 = AbstractC3159eu.f29993a;
                                                        Locale locale = Locale.US;
                                                        AbstractC2968bG.y("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + c9 + ", " + str2 + "]");
                                                    }
                                                    rp3.f27277w0 = U3;
                                                    rp3.f27271t0 = dp2;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    rp2 = rp3;
                                                    z6 = r17;
                                                    exc = e;
                                                    rp = rp2;
                                                    r17 = z6;
                                                    AbstractC2968bG.C("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                                    arrayDeque.removeFirst();
                                                    String str32 = op.f26604a;
                                                    int length2 = str32.length();
                                                    String dp42 = dp3.toString();
                                                    PP pp22 = new PP(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(length2 + 23 + dp42.length()), "Decoder init failed: ", str32, ", ", dp42), exc, dp3.f24431o, op, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                                    rp.X(pp22);
                                                    pp = rp.f27281y0;
                                                    if (pp == null) {
                                                    }
                                                    if (arrayDeque.isEmpty()) {
                                                    }
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            rp2 = r72;
                                            z6 = r17;
                                            exc = e;
                                            rp = rp2;
                                            r17 = z6;
                                            AbstractC2968bG.C("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                            arrayDeque.removeFirst();
                                            String str322 = op.f26604a;
                                            int length22 = str322.length();
                                            String dp422 = dp3.toString();
                                            PP pp222 = new PP(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(length22 + 23 + dp422.length()), "Decoder init failed: ", str322, ", ", dp422), exc, dp3.f24431o, op, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                            rp.X(pp222);
                                            pp = rp.f27281y0;
                                            if (pp == null) {
                                            }
                                            if (arrayDeque.isEmpty()) {
                                            }
                                        }
                                    } catch (Throwable th) {
                                        Trace.endSection();
                                        throw th;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    r17 = rp4;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                r17 = rp4;
                                z3 = z10;
                            }
                            if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                                String str5 = Build.MODEL;
                                if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                                    i6 = 2;
                                    rp3.f27207A0 = i6;
                                    rp3.f27209B0 = (i == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z3;
                                    if (i <= 25) {
                                        if ("OMX.rk.video_decoder.avc".equals(str2)) {
                                        }
                                        z9 = z3;
                                        rp3.f27214E0 = z9;
                                        if (rp3.f27270s0 != null) {
                                            throw r17;
                                        }
                                        if (rp3.f27206A == 2) {
                                            rp3.f27282z.getClass();
                                            rp3.f27218G0 = SystemClock.elapsedRealtime() + 1000;
                                        }
                                        rp3.f27254Z0.f34993a++;
                                        long j9 = elapsedRealtime - j6;
                                        if (i >= 31) {
                                            C3823rC c3823rC = rp3.f27263i1;
                                            if (!c3823rC.isEmpty()) {
                                                LP lp = rp3.f27270s0;
                                                if (lp == null) {
                                                    throw r17;
                                                }
                                                lp.g(new ArrayList(c3823rC));
                                            }
                                        }
                                        rp3.V(str2, elapsedRealtime, j9);
                                        rp = rp3;
                                        rp3 = rp;
                                        z10 = z3;
                                        rp4 = r17;
                                    }
                                    if ((i <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str2) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str2) && !"OMX.bcm.vdec.avc.tunnel".equals(str2) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str2) && !"OMX.bcm.vdec.hevc.tunnel".equals(str2) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !op.f26609f)) {
                                        z9 = false;
                                        rp3.f27214E0 = z9;
                                        if (rp3.f27270s0 != null) {
                                        }
                                    }
                                    z9 = z3;
                                    rp3.f27214E0 = z9;
                                    if (rp3.f27270s0 != null) {
                                    }
                                }
                            }
                            i6 = 0;
                            rp3.f27207A0 = i6;
                            rp3.f27209B0 = (i == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z3;
                            if (i <= 25) {
                            }
                            if (i <= 29) {
                            }
                            z9 = false;
                            rp3.f27214E0 = z9;
                            if (rp3.f27270s0 != null) {
                            }
                        }
                    }
                    rp3.f27279x0 = rp4;
                } catch (PP e17) {
                    e = e17;
                    throw rp4.n(e, dp, false, 4001);
                }
            } catch (PP e18) {
                e = e18;
                rp4 = rp3;
                throw rp4.n(e, dp, false, 4001);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r4 >= r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v0(DP[] dpArr, long j6, long j9, C3676oQ c3676oQ) {
        this.f27208B.getClass();
        if (this.f27255a1.f27027c == com.anythink.basead.exoplayer.b.f6382b) {
            m0(new QP(com.anythink.basead.exoplayer.b.f6382b, j6, j9));
            if (this.f27258d1) {
                a0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.f27244U;
        if (arrayDeque.isEmpty()) {
            long j10 = this.f27245U0;
            if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                long j11 = this.f27256b1;
                if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                }
            }
            m0(new QP(com.anythink.basead.exoplayer.b.f6382b, j6, j9));
            if (this.f27255a1.f27027c != com.anythink.basead.exoplayer.b.f6382b) {
                a0();
                return;
            }
            return;
        }
        arrayDeque.add(new QP(this.f27245U0, j6, j9));
    }

    public boolean w(OP op) {
        return true;
    }

    public final void x() {
        try {
            LP lp = this.f27270s0;
            if (lp != null) {
                lp.l();
                this.f27254Z0.f34994b++;
                OP op = this.f27283z0;
                if (op == null) {
                    throw null;
                }
                W(op.f26604a);
            }
            this.f27270s0 = null;
            this.f27253Z = null;
            B();
        } catch (Throwable th) {
            this.f27270s0 = null;
            this.f27253Z = null;
            B();
            throw th;
        }
    }

    public boolean y() {
        int i = this.f27237Q0;
        if (i == 3 || (this.f27209B0 && !this.f27243T0)) {
            return true;
        }
        if (i == 2) {
            try {
                C3105du c3105du = this.f27265n0;
                c3105du.getClass();
                this.f27253Z = c3105du;
                this.f27235P0 = 0;
                this.f27237Q0 = 0;
            } catch (DN e9) {
                AbstractC2968bG.C("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e9);
                return true;
            }
        }
        return false;
    }

    public boolean z() {
        return true;
    }

    public void s() {
    }

    public void D(DP dp) {
    }
}
