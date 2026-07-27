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

/* renamed from: com.google.android.gms.internal.ads.eQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3149eQ implements BO {

    /* renamed from: k1, reason: collision with root package name */
    public static final byte[] f30354k1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public int f30355A;

    /* renamed from: A0, reason: collision with root package name */
    public C2986bQ f30356A0;

    /* renamed from: B, reason: collision with root package name */
    public VQ f30357B;

    /* renamed from: B0, reason: collision with root package name */
    public int f30358B0;

    /* renamed from: C, reason: collision with root package name */
    public TP[] f30359C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public long f30360D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f30361D0;

    /* renamed from: E, reason: collision with root package name */
    public long f30362E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f30363E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f30365F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f30366G;

    /* renamed from: G0, reason: collision with root package name */
    public long f30367G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f30368H;

    /* renamed from: H0, reason: collision with root package name */
    public long f30369H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f30371I0;
    public BQ J;

    /* renamed from: J0, reason: collision with root package name */
    public int f30372J0;

    /* renamed from: K0, reason: collision with root package name */
    public ByteBuffer f30374K0;

    /* renamed from: L, reason: collision with root package name */
    public C3554m f30375L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f30376L0;

    /* renamed from: M, reason: collision with root package name */
    public final Context f30377M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f30378M0;

    /* renamed from: N, reason: collision with root package name */
    public final C3042ca f30379N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f30380N0;

    /* renamed from: O, reason: collision with root package name */
    public final C3796qP f30381O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f30382O0;

    /* renamed from: P, reason: collision with root package name */
    public final float f30383P;

    /* renamed from: P0, reason: collision with root package name */
    public int f30384P0;

    /* renamed from: Q, reason: collision with root package name */
    public final IN f30385Q;

    /* renamed from: Q0, reason: collision with root package name */
    public int f30386Q0;

    /* renamed from: R, reason: collision with root package name */
    public final IN f30387R;

    /* renamed from: R0, reason: collision with root package name */
    public int f30388R0;

    /* renamed from: S, reason: collision with root package name */
    public final IN f30389S;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f30390S0;

    /* renamed from: T, reason: collision with root package name */
    public final WP f30391T;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f30392T0;

    /* renamed from: U, reason: collision with root package name */
    public final MediaCodec.BufferInfo f30393U;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f30394U0;

    /* renamed from: V, reason: collision with root package name */
    public final ArrayDeque f30395V;

    /* renamed from: V0, reason: collision with root package name */
    public long f30396V0;

    /* renamed from: W, reason: collision with root package name */
    public final C3826r2 f30397W;

    /* renamed from: W0, reason: collision with root package name */
    public long f30398W0;

    /* renamed from: X, reason: collision with root package name */
    public final AtomicInteger f30399X;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f30400X0;
    public TP Y;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f30401Y0;

    /* renamed from: Z, reason: collision with root package name */
    public TP f30402Z;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f30403Z0;

    /* renamed from: a1, reason: collision with root package name */
    public LN f30404a1;

    /* renamed from: b1, reason: collision with root package name */
    public C3095dQ f30405b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f30406c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f30407d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f30408e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f30409f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f30410g1;

    /* renamed from: h1, reason: collision with root package name */
    public final KN f30411h1;

    /* renamed from: i1, reason: collision with root package name */
    public KN f30412i1;

    /* renamed from: j1, reason: collision with root package name */
    public final C3998uC f30413j1;

    /* renamed from: n0, reason: collision with root package name */
    public Mu f30415n0;

    /* renamed from: o0, reason: collision with root package name */
    public Mu f30416o0;

    /* renamed from: p0, reason: collision with root package name */
    public C3147eO f30417p0;

    /* renamed from: q0, reason: collision with root package name */
    public final long f30418q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f30419r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f30420s0;

    /* renamed from: t0, reason: collision with root package name */
    public YP f30421t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f30422u;

    /* renamed from: u0, reason: collision with root package name */
    public TP f30423u0;

    /* renamed from: v0, reason: collision with root package name */
    public MediaFormat f30425v0;

    /* renamed from: w, reason: collision with root package name */
    public FO f30426w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f30427w0;

    /* renamed from: x, reason: collision with root package name */
    public int f30428x;

    /* renamed from: x0, reason: collision with root package name */
    public float f30429x0;

    /* renamed from: y, reason: collision with root package name */
    public VO f30430y;

    /* renamed from: y0, reason: collision with root package name */
    public ArrayDeque f30431y0;

    /* renamed from: z, reason: collision with root package name */
    public T2 f30432z;

    /* renamed from: z0, reason: collision with root package name */
    public C3040cQ f30433z0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f30414n = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final C4164xG f30424v = new C4164xG(9);

    /* renamed from: F, reason: collision with root package name */
    public long f30364F = Long.MIN_VALUE;

    /* renamed from: I, reason: collision with root package name */
    public AbstractC3832r8 f30370I = AbstractC3832r8.f33969a;

    /* renamed from: K, reason: collision with root package name */
    public long f30373K = com.anythink.basead.exoplayer.b.f6539b;

    public AbstractC3149eQ(Context context, int i, C3042ca c3042ca, C3796qP c3796qP, float f6) {
        this.f30422u = i;
        this.f30377M = context.getApplicationContext();
        this.f30379N = c3042ca;
        c3796qP.getClass();
        this.f30381O = c3796qP;
        this.f30383P = f6;
        this.f30399X = new AtomicInteger();
        this.f30385Q = new IN(0);
        this.f30387R = new IN(0);
        this.f30389S = new IN(2);
        WP wp = new WP(2);
        wp.f28393k = 32;
        this.f30391T = wp;
        this.f30393U = new MediaCodec.BufferInfo();
        this.f30419r0 = 1.0f;
        this.f30420s0 = 1.0f;
        this.f30418q0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30395V = new ArrayDeque();
        this.f30405b1 = C3095dQ.f30053g;
        wp.j(0);
        wp.f25552e.order(ByteOrder.nativeOrder());
        C3826r2 c3826r2 = new C3826r2();
        c3826r2.f33938v = InterfaceC3050ci.f29732a;
        c3826r2.f33937u = 0;
        c3826r2.f33936n = 2;
        this.f30397W = c3826r2;
        this.f30429x0 = -1.0f;
        this.f30358B0 = 0;
        this.f30384P0 = 0;
        this.f30371I0 = -1;
        this.f30372J0 = -1;
        this.f30369H0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30396V0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30398W0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30406c1 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30367G0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30386Q0 = 0;
        this.f30388R0 = 0;
        this.f30404a1 = new LN();
        this.f30409f1 = false;
        this.f30410g1 = 0L;
        int i4 = AbstractC2917aC.f29181v;
        this.f30413j1 = C3998uC.f34563C;
        KN kn = KN.f25957b;
        this.f30411h1 = kn;
        this.f30412i1 = kn;
    }

    public static boolean J(int i, boolean z8) {
        int i4 = i & 7;
        if (i4 != 4) {
            return z8 && i4 == 3;
        }
        return true;
    }

    public final void A() {
        z();
        this.f30431y0 = null;
        this.f30356A0 = null;
        this.f30423u0 = null;
        this.f30425v0 = null;
        this.f30427w0 = false;
        this.f30394U0 = false;
        this.f30429x0 = -1.0f;
        this.f30358B0 = 0;
        this.C0 = false;
        this.f30365F0 = false;
        this.f30382O0 = false;
        this.f30384P0 = 0;
    }

    public C2931aQ B(IllegalStateException illegalStateException, C2986bQ c2986bQ) {
        return new C2931aQ(illegalStateException, c2986bQ);
    }

    public void D(IN in) {
    }

    public int E(IN in) {
        return 0;
    }

    public boolean F(IN in) {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:149|(1:150)|151|152|153|154|155|(3:160|(2:167|(2:178|(2:185|(16:187|(1:189)|190|(2:192|(1:194)(1:195))|196|(1:224)|200|(1:223)(9:202|(1:204)|206|(1:208)|209|(3:211|(1:213)|214)|215|(1:217)(2:219|(1:221)(1:222))|218)|205|206|(0)|209|(0)|215|(0)(0)|218))(2:182|(1:184)))(4:169|(1:171)|172|(1:174)(2:175|(1:177))))(3:162|(1:164)|165)|166)(2:157|(1:159))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0739, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x073e, code lost:
    
        w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x074d, code lost:
    
        r2 = 4006;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0750, code lost:
    
        r2 = 4003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04f6, code lost:
    
        if (r36.f30361D0 != false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04f9, code lost:
    
        r36.f30361D0 = false;
        r0 = r12.f25552e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04fd, code lost:
    
        if (r0 != null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04ff, code lost:
    
        r0.put(com.google.android.gms.internal.ads.AbstractC3149eQ.f30354k1);
        r4.G(r36.f30371I0, 38, 0, 0);
        r36.f30371I0 = r2;
        r12.f25552e = r3;
        r36.f30390S0 = true;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x06c7, code lost:
    
        if (r20 != com.anythink.basead.exoplayer.b.f6539b) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x06c9, code lost:
    
        r36.f30432z.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x06d6, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r16) < r20) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x06d9, code lost:
    
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x06dc, code lost:
    
        if (r5 != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x06de, code lost:
    
        r31 = r12;
        r32 = r15;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0369, code lost:
    
        r11 = 4;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x06db, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0522, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0523, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0526, code lost:
    
        if (r36.f30384P0 == 1) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0528, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0529, code lost:
    
        r0 = r36.f30423u0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x052b, code lost:
    
        if (r0 == null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0533, code lost:
    
        if (r6 < r0.f27779r.size()) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0535, code lost:
    
        r0 = (byte[]) r36.f30423u0.f27779r.get(r6);
        r5 = r12.f25552e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0541, code lost:
    
        if (r5 != null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0543, code lost:
    
        r5.put(r0);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0548, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0549, code lost:
    
        r36.f30384P0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x054c, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x054d, code lost:
    
        r0 = r12.f25552e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x054f, code lost:
    
        if (r0 != null) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0551, code lost:
    
        r0 = r0.position();
        r15 = r32;
        r15.f35132u = r3;
        r15.f35133v = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x055e, code lost:
    
        r4.r(new com.google.android.gms.internal.ads.RunnableC3903sP(3, r36, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0564, code lost:
    
        r5 = r36.f30399X.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x056b, code lost:
    
        if (r5 != (-3)) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0571, code lost:
    
        if (q0() != false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0573, code lost:
    
        n0().c(r36.f30396V0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x057f, code lost:
    
        if (r5 != (-5)) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0583, code lost:
    
        if (r36.f30384P0 == 2) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0585, code lost:
    
        r12.i();
        r36.f30384P0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x058a, code lost:
    
        X(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0597, code lost:
    
        if (r12.h(r11) == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0599, code lost:
    
        n0().c(r36.f30396V0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x05a4, code lost:
    
        if (r36.f30384P0 == 2) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x05a6, code lost:
    
        r12.i();
        r36.f30384P0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x05ab, code lost:
    
        r36.f30400X0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x05af, code lost:
    
        if (r36.f30390S0 == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x05b1, code lost:
    
        l0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x05b8, code lost:
    
        if (r36.f30365F0 == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x05ba, code lost:
    
        r36.f30392T0 = true;
        r4.G(r36.f30371I0, 0, 4, 0);
        r36.f30371I0 = r2;
        r12.f25552e = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x05cd, code lost:
    
        if (r36.f30390S0 != false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05d5, code lost:
    
        r12.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05da, code lost:
    
        if (r36.f30384P0 == 2) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05dc, code lost:
    
        r36.f30384P0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05df, code lost:
    
        r8 = r12.f25553f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05e5, code lost:
    
        if (F(r12) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05e7, code lost:
    
        r5 = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x05eb, code lost:
    
        if (r5 != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x05ed, code lost:
    
        r12.f25551d.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05f4, code lost:
    
        if (r36.f30403Z0 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x05f6, code lost:
    
        r0 = n0();
        r6 = r0.f30057d;
        r7 = r36.Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05fe, code lost:
    
        if (r7 != null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0600, code lost:
    
        r6.c(r8, r7);
        r0.b();
        r36.f30403Z0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0609, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x060a, code lost:
    
        r36.f30396V0 = java.lang.Math.max(r36.f30396V0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0616, code lost:
    
        if (r36.f30373K == com.anythink.basead.exoplayer.b.f6539b) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0634, code lost:
    
        if (q0() != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x063c, code lost:
    
        if (r12.h(536870912) != false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0641, code lost:
    
        n0().c(r36.f30396V0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x064a, code lost:
    
        r12.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0653, code lost:
    
        if (r12.h(268435456) != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0655, code lost:
    
        e0(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x065a, code lost:
    
        if (r36.f30409f1 != false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x065c, code lost:
    
        r6 = r36.f30396V0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0660, code lost:
    
        if (r8 <= r6) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0662, code lost:
    
        r36.f30410g1 = ((r6 - r8) + 1) + r36.f30410g1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x066c, code lost:
    
        r36.f30396V0 = r8;
        r36.f30398W0 = r8;
        r36.f30409f1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0672, code lost:
    
        D(r12);
        r7 = E(r12);
        r8 = r8 + r36.f30410g1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x067c, code lost:
    
        if (r5 == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x067e, code lost:
    
        r4.t(r36.f30371I0, r12.f25551d, r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x06a0, code lost:
    
        r36.f30371I0 = r2;
        r12.f25552e = r3;
        r36.f30390S0 = true;
        r36.f30384P0 = 0;
        r36.f30404a1.f26149c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x068f, code lost:
    
        r5 = r36.f30371I0;
        r0 = r12.f25552e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0697, code lost:
    
        if (r0 != null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0699, code lost:
    
        r4.G(r5, r0.limit(), r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x06b0, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0628, code lost:
    
        r36.f30398W0 = java.lang.Math.max(r36.f30398W0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x06b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x06bc, code lost:
    
        W(r0);
        t(0);
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x06b7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x06e4, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04d3, code lost:
    
        r12 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x03f2, code lost:
    
        if (r36.f30402Z != null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01f8, code lost:
    
        r36.f30378M0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x008d, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x04aa, code lost:
    
        r4 = r36.f30421t0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04ac, code lost:
    
        if (r4 != null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x04bd, code lost:
    
        if (r36.f30371I0 < 0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x04bf, code lost:
    
        r0 = r4.c();
        r36.f30371I0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x04c5, code lost:
    
        if (r0 >= 0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x04c7, code lost:
    
        r12 = r31;
        r12.f25552e = r4.A(r0);
        r12.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04d7, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x04d8, code lost:
    
        if (r36.f30386Q0 == 1) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x04dc, code lost:
    
        if (r36.f30365F0 == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x04de, code lost:
    
        r36.f30392T0 = true;
        r4.G(r36.f30371I0, 0, 4, 0);
        r36.f30371I0 = r2;
        r12.f25552e = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x04f1, code lost:
    
        r36.f30386Q0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x06e5, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04ee, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0010, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0716, code lost:
    
        r3 = r0.getStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x071b, code lost:
    
        if (r3.length <= 0) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0759, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00a0: MOVE (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:161), block:B:490:0x00a0 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06c9 A[Catch: IllegalStateException -> 0x051c, CryptoException -> 0x051f, TryCatch #16 {CryptoException -> 0x051f, IllegalStateException -> 0x051c, blocks: (B:86:0x070b, B:85:0x06e5, B:117:0x04f9, B:119:0x04ff, B:122:0x06c9, B:130:0x0522, B:131:0x0523, B:134:0x0529, B:136:0x052d, B:138:0x0535, B:140:0x0543, B:142:0x0548, B:144:0x0549, B:146:0x054c, B:147:0x054d, B:149:0x0551, B:151:0x055b, B:154:0x055e, B:155:0x0564, B:157:0x056d, B:159:0x0573, B:162:0x0581, B:164:0x0585, B:165:0x058a, B:167:0x0593, B:169:0x0599, B:171:0x05a6, B:172:0x05ab, B:174:0x05b1, B:175:0x05b6, B:177:0x05ba, B:178:0x05cb, B:180:0x05cf, B:182:0x05d5, B:184:0x05dc, B:185:0x05df, B:187:0x05e7, B:189:0x05ed, B:190:0x05f2, B:192:0x05f6, B:194:0x0600, B:195:0x0609, B:196:0x060a, B:198:0x0618, B:200:0x0630, B:202:0x0636, B:205:0x0641, B:206:0x064a, B:208:0x0655, B:209:0x0658, B:211:0x065c, B:213:0x0662, B:214:0x066c, B:215:0x0672, B:217:0x067e, B:218:0x06a0, B:219:0x068f, B:221:0x0699, B:222:0x06b0, B:224:0x0628, B:228:0x06bc, B:232:0x06e4, B:243:0x06ed, B:353:0x06f1, B:354:0x06f2), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0655 A[Catch: IllegalStateException -> 0x051c, CryptoException -> 0x051f, TryCatch #16 {CryptoException -> 0x051f, IllegalStateException -> 0x051c, blocks: (B:86:0x070b, B:85:0x06e5, B:117:0x04f9, B:119:0x04ff, B:122:0x06c9, B:130:0x0522, B:131:0x0523, B:134:0x0529, B:136:0x052d, B:138:0x0535, B:140:0x0543, B:142:0x0548, B:144:0x0549, B:146:0x054c, B:147:0x054d, B:149:0x0551, B:151:0x055b, B:154:0x055e, B:155:0x0564, B:157:0x056d, B:159:0x0573, B:162:0x0581, B:164:0x0585, B:165:0x058a, B:167:0x0593, B:169:0x0599, B:171:0x05a6, B:172:0x05ab, B:174:0x05b1, B:175:0x05b6, B:177:0x05ba, B:178:0x05cb, B:180:0x05cf, B:182:0x05d5, B:184:0x05dc, B:185:0x05df, B:187:0x05e7, B:189:0x05ed, B:190:0x05f2, B:192:0x05f6, B:194:0x0600, B:195:0x0609, B:196:0x060a, B:198:0x0618, B:200:0x0630, B:202:0x0636, B:205:0x0641, B:206:0x064a, B:208:0x0655, B:209:0x0658, B:211:0x065c, B:213:0x0662, B:214:0x066c, B:215:0x0672, B:217:0x067e, B:218:0x06a0, B:219:0x068f, B:221:0x0699, B:222:0x06b0, B:224:0x0628, B:228:0x06bc, B:232:0x06e4, B:243:0x06ed, B:353:0x06f1, B:354:0x06f2), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x065c A[Catch: IllegalStateException -> 0x051c, CryptoException -> 0x051f, TryCatch #16 {CryptoException -> 0x051f, IllegalStateException -> 0x051c, blocks: (B:86:0x070b, B:85:0x06e5, B:117:0x04f9, B:119:0x04ff, B:122:0x06c9, B:130:0x0522, B:131:0x0523, B:134:0x0529, B:136:0x052d, B:138:0x0535, B:140:0x0543, B:142:0x0548, B:144:0x0549, B:146:0x054c, B:147:0x054d, B:149:0x0551, B:151:0x055b, B:154:0x055e, B:155:0x0564, B:157:0x056d, B:159:0x0573, B:162:0x0581, B:164:0x0585, B:165:0x058a, B:167:0x0593, B:169:0x0599, B:171:0x05a6, B:172:0x05ab, B:174:0x05b1, B:175:0x05b6, B:177:0x05ba, B:178:0x05cb, B:180:0x05cf, B:182:0x05d5, B:184:0x05dc, B:185:0x05df, B:187:0x05e7, B:189:0x05ed, B:190:0x05f2, B:192:0x05f6, B:194:0x0600, B:195:0x0609, B:196:0x060a, B:198:0x0618, B:200:0x0630, B:202:0x0636, B:205:0x0641, B:206:0x064a, B:208:0x0655, B:209:0x0658, B:211:0x065c, B:213:0x0662, B:214:0x066c, B:215:0x0672, B:217:0x067e, B:218:0x06a0, B:219:0x068f, B:221:0x0699, B:222:0x06b0, B:224:0x0628, B:228:0x06bc, B:232:0x06e4, B:243:0x06ed, B:353:0x06f1, B:354:0x06f2), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x067e A[Catch: IllegalStateException -> 0x051c, CryptoException -> 0x051f, TryCatch #16 {CryptoException -> 0x051f, IllegalStateException -> 0x051c, blocks: (B:86:0x070b, B:85:0x06e5, B:117:0x04f9, B:119:0x04ff, B:122:0x06c9, B:130:0x0522, B:131:0x0523, B:134:0x0529, B:136:0x052d, B:138:0x0535, B:140:0x0543, B:142:0x0548, B:144:0x0549, B:146:0x054c, B:147:0x054d, B:149:0x0551, B:151:0x055b, B:154:0x055e, B:155:0x0564, B:157:0x056d, B:159:0x0573, B:162:0x0581, B:164:0x0585, B:165:0x058a, B:167:0x0593, B:169:0x0599, B:171:0x05a6, B:172:0x05ab, B:174:0x05b1, B:175:0x05b6, B:177:0x05ba, B:178:0x05cb, B:180:0x05cf, B:182:0x05d5, B:184:0x05dc, B:185:0x05df, B:187:0x05e7, B:189:0x05ed, B:190:0x05f2, B:192:0x05f6, B:194:0x0600, B:195:0x0609, B:196:0x060a, B:198:0x0618, B:200:0x0630, B:202:0x0636, B:205:0x0641, B:206:0x064a, B:208:0x0655, B:209:0x0658, B:211:0x065c, B:213:0x0662, B:214:0x066c, B:215:0x0672, B:217:0x067e, B:218:0x06a0, B:219:0x068f, B:221:0x0699, B:222:0x06b0, B:224:0x0628, B:228:0x06bc, B:232:0x06e4, B:243:0x06ed, B:353:0x06f1, B:354:0x06f2), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x068f A[Catch: IllegalStateException -> 0x051c, CryptoException -> 0x051f, TryCatch #16 {CryptoException -> 0x051f, IllegalStateException -> 0x051c, blocks: (B:86:0x070b, B:85:0x06e5, B:117:0x04f9, B:119:0x04ff, B:122:0x06c9, B:130:0x0522, B:131:0x0523, B:134:0x0529, B:136:0x052d, B:138:0x0535, B:140:0x0543, B:142:0x0548, B:144:0x0549, B:146:0x054c, B:147:0x054d, B:149:0x0551, B:151:0x055b, B:154:0x055e, B:155:0x0564, B:157:0x056d, B:159:0x0573, B:162:0x0581, B:164:0x0585, B:165:0x058a, B:167:0x0593, B:169:0x0599, B:171:0x05a6, B:172:0x05ab, B:174:0x05b1, B:175:0x05b6, B:177:0x05ba, B:178:0x05cb, B:180:0x05cf, B:182:0x05d5, B:184:0x05dc, B:185:0x05df, B:187:0x05e7, B:189:0x05ed, B:190:0x05f2, B:192:0x05f6, B:194:0x0600, B:195:0x0609, B:196:0x060a, B:198:0x0618, B:200:0x0630, B:202:0x0636, B:205:0x0641, B:206:0x064a, B:208:0x0655, B:209:0x0658, B:211:0x065c, B:213:0x0662, B:214:0x066c, B:215:0x0672, B:217:0x067e, B:218:0x06a0, B:219:0x068f, B:221:0x0699, B:222:0x06b0, B:224:0x0628, B:228:0x06bc, B:232:0x06e4, B:243:0x06ed, B:353:0x06f1, B:354:0x06f2), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0155 A[Catch: IllegalStateException -> 0x00b5, CryptoException -> 0x00ba, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x00b5, blocks: (B:386:0x0218, B:374:0x00b2, B:375:0x00c5, B:377:0x00c9, B:382:0x00d5, B:387:0x00e5, B:388:0x00f4, B:457:0x0101, B:459:0x0107, B:435:0x0200, B:437:0x0206, B:438:0x0209, B:440:0x020f, B:442:0x0213, B:392:0x0114, B:454:0x011b, B:394:0x0127, B:396:0x0137, B:399:0x0146, B:400:0x014f, B:403:0x0155, B:405:0x0159, B:407:0x0163, B:409:0x016d, B:410:0x0195, B:412:0x019d, B:413:0x019e, B:415:0x01a5, B:417:0x01ad, B:419:0x01b5, B:420:0x01bc, B:424:0x01cd, B:426:0x01d6, B:429:0x01ed, B:434:0x01f8, B:449:0x01dd, B:461:0x01fb, B:18:0x0231, B:20:0x023a, B:21:0x0248, B:23:0x024c, B:251:0x0265, B:253:0x026b, B:255:0x0273, B:257:0x027d, B:259:0x0285, B:262:0x0292, B:266:0x029a, B:269:0x02a2, B:270:0x02ad, B:272:0x02b6, B:275:0x02c2, B:286:0x02d4, B:288:0x02da, B:289:0x02de, B:290:0x02f4, B:291:0x02fc, B:292:0x0308, B:293:0x0314, B:296:0x0320, B:298:0x032d, B:299:0x0332, B:301:0x0338, B:303:0x0339, B:305:0x033d, B:307:0x0341, B:309:0x0345, B:310:0x0348, B:312:0x034e, B:314:0x035e), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01b5 A[Catch: IllegalStateException -> 0x00b5, CryptoException -> 0x00ba, TryCatch #3 {IllegalStateException -> 0x00b5, blocks: (B:386:0x0218, B:374:0x00b2, B:375:0x00c5, B:377:0x00c9, B:382:0x00d5, B:387:0x00e5, B:388:0x00f4, B:457:0x0101, B:459:0x0107, B:435:0x0200, B:437:0x0206, B:438:0x0209, B:440:0x020f, B:442:0x0213, B:392:0x0114, B:454:0x011b, B:394:0x0127, B:396:0x0137, B:399:0x0146, B:400:0x014f, B:403:0x0155, B:405:0x0159, B:407:0x0163, B:409:0x016d, B:410:0x0195, B:412:0x019d, B:413:0x019e, B:415:0x01a5, B:417:0x01ad, B:419:0x01b5, B:420:0x01bc, B:424:0x01cd, B:426:0x01d6, B:429:0x01ed, B:434:0x01f8, B:449:0x01dd, B:461:0x01fb, B:18:0x0231, B:20:0x023a, B:21:0x0248, B:23:0x024c, B:251:0x0265, B:253:0x026b, B:255:0x0273, B:257:0x027d, B:259:0x0285, B:262:0x0292, B:266:0x029a, B:269:0x02a2, B:270:0x02ad, B:272:0x02b6, B:275:0x02c2, B:286:0x02d4, B:288:0x02da, B:289:0x02de, B:290:0x02f4, B:291:0x02fc, B:292:0x0308, B:293:0x0314, B:296:0x0320, B:298:0x032d, B:299:0x0332, B:301:0x0338, B:303:0x0339, B:305:0x033d, B:307:0x0341, B:309:0x0345, B:310:0x0348, B:312:0x034e, B:314:0x035e), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x01cd A[Catch: IllegalStateException -> 0x00b5, CryptoException -> 0x00ba, TryCatch #3 {IllegalStateException -> 0x00b5, blocks: (B:386:0x0218, B:374:0x00b2, B:375:0x00c5, B:377:0x00c9, B:382:0x00d5, B:387:0x00e5, B:388:0x00f4, B:457:0x0101, B:459:0x0107, B:435:0x0200, B:437:0x0206, B:438:0x0209, B:440:0x020f, B:442:0x0213, B:392:0x0114, B:454:0x011b, B:394:0x0127, B:396:0x0137, B:399:0x0146, B:400:0x014f, B:403:0x0155, B:405:0x0159, B:407:0x0163, B:409:0x016d, B:410:0x0195, B:412:0x019d, B:413:0x019e, B:415:0x01a5, B:417:0x01ad, B:419:0x01b5, B:420:0x01bc, B:424:0x01cd, B:426:0x01d6, B:429:0x01ed, B:434:0x01f8, B:449:0x01dd, B:461:0x01fb, B:18:0x0231, B:20:0x023a, B:21:0x0248, B:23:0x024c, B:251:0x0265, B:253:0x026b, B:255:0x0273, B:257:0x027d, B:259:0x0285, B:262:0x0292, B:266:0x029a, B:269:0x02a2, B:270:0x02ad, B:272:0x02b6, B:275:0x02c2, B:286:0x02d4, B:288:0x02da, B:289:0x02de, B:290:0x02f4, B:291:0x02fc, B:292:0x0308, B:293:0x0314, B:296:0x0320, B:298:0x032d, B:299:0x0332, B:301:0x0338, B:303:0x0339, B:305:0x033d, B:307:0x0341, B:309:0x0345, B:310:0x0348, B:312:0x034e, B:314:0x035e), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x01f4 A[LOOP:4: B:388:0x00f4->B:431:0x01f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x01dd A[Catch: IllegalStateException -> 0x00b5, CryptoException -> 0x00ba, TryCatch #3 {IllegalStateException -> 0x00b5, blocks: (B:386:0x0218, B:374:0x00b2, B:375:0x00c5, B:377:0x00c9, B:382:0x00d5, B:387:0x00e5, B:388:0x00f4, B:457:0x0101, B:459:0x0107, B:435:0x0200, B:437:0x0206, B:438:0x0209, B:440:0x020f, B:442:0x0213, B:392:0x0114, B:454:0x011b, B:394:0x0127, B:396:0x0137, B:399:0x0146, B:400:0x014f, B:403:0x0155, B:405:0x0159, B:407:0x0163, B:409:0x016d, B:410:0x0195, B:412:0x019d, B:413:0x019e, B:415:0x01a5, B:417:0x01ad, B:419:0x01b5, B:420:0x01bc, B:424:0x01cd, B:426:0x01d6, B:429:0x01ed, B:434:0x01f8, B:449:0x01dd, B:461:0x01fb, B:18:0x0231, B:20:0x023a, B:21:0x0248, B:23:0x024c, B:251:0x0265, B:253:0x026b, B:255:0x0273, B:257:0x027d, B:259:0x0285, B:262:0x0292, B:266:0x029a, B:269:0x02a2, B:270:0x02ad, B:272:0x02b6, B:275:0x02c2, B:286:0x02d4, B:288:0x02da, B:289:0x02de, B:290:0x02f4, B:291:0x02fc, B:292:0x0308, B:293:0x0314, B:296:0x0320, B:298:0x032d, B:299:0x0332, B:301:0x0338, B:303:0x0339, B:305:0x033d, B:307:0x0341, B:309:0x0345, B:310:0x0348, B:312:0x034e, B:314:0x035e), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0483 A[Catch: CryptoException -> 0x0013, IllegalStateException -> 0x0089, TryCatch #12 {IllegalStateException -> 0x0089, blocks: (B:359:0x0047, B:361:0x0068, B:363:0x007f, B:478:0x0091, B:58:0x0483, B:66:0x04aa, B:68:0x04ae, B:70:0x04b3, B:72:0x04bb, B:74:0x04bf, B:76:0x04c7, B:77:0x04d5, B:31:0x040b, B:34:0x0416, B:36:0x041e, B:39:0x0429, B:44:0x044c, B:46:0x0452, B:50:0x0462, B:53:0x0468, B:54:0x0473, B:237:0x047b), top: B:16:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0499 A[LOOP:0: B:21:0x0248->B:63:0x0499, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0716  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.google.android.gms.internal.ads.eQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0369 -> B:57:0x04aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(long j9, long j10) {
        ?? r14;
        boolean z8;
        boolean z9;
        boolean z10;
        C2931aQ B8;
        int i;
        boolean z11;
        boolean z12;
        IN in;
        C4164xG c4164xG;
        ?? r52;
        boolean z13;
        C4164xG c4164xG2;
        IN in2;
        TP tp;
        Throwable th;
        long j11;
        C4164xG c4164xG3;
        IN in3;
        int i4;
        ?? r32;
        int i9;
        Throwable th2;
        Throwable th3;
        int valueTypeForKey;
        Throwable th4;
        boolean z14;
        long j12 = this.f30418q0;
        int i10 = 3;
        boolean z15 = true;
        try {
            try {
                if (this.f30401Y0) {
                    c0();
                    return;
                }
                int i11 = 2;
                if (this.Y == null && !t(2)) {
                    return;
                }
                u();
                boolean z16 = this.f30376L0;
                IN in4 = this.f30387R;
                char c4 = 0;
                C4164xG c4164xG4 = this.f30424v;
                int i12 = 4;
                z8 = false;
                Throwable th5 = null;
                ?? r142 = -5;
                char c9 = 65531;
                r14 = -5;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (z16) {
                                        try {
                                            try {
                                                Trace.beginSection("bypassRender");
                                                while (true) {
                                                    PA.T(this.f30401Y0 ^ z15);
                                                    WP wp = this.f30391T;
                                                    if (wp.o()) {
                                                        ByteBuffer byteBuffer = wp.f25552e;
                                                        IN in5 = in4;
                                                        int i13 = this.f30372J0;
                                                        int n9 = wp.n();
                                                        long j13 = wp.f25553f;
                                                        boolean o02 = o0(this.f30362E, wp.i);
                                                        boolean h9 = wp.h(i12);
                                                        TP tp2 = this.f30402Z;
                                                        if (tp2 == null) {
                                                            throw th5;
                                                        }
                                                        in = in5;
                                                        c4164xG = c4164xG4;
                                                        if (!a0(j9, j10, null, byteBuffer, i13, 0, n9, j13, o02, h9, tp2)) {
                                                            z12 = true;
                                                            break;
                                                        } else {
                                                            g0(wp.i);
                                                            wp.i();
                                                            r52 = 0;
                                                        }
                                                    } else {
                                                        in = in4;
                                                        c4164xG = c4164xG4;
                                                        r52 = th5;
                                                    }
                                                    try {
                                                        if (this.f30400X0) {
                                                            z12 = true;
                                                            this.f30401Y0 = true;
                                                            break;
                                                        }
                                                        z12 = true;
                                                        try {
                                                            boolean z17 = this.f30378M0;
                                                            IN in6 = this.f30389S;
                                                            if (z17) {
                                                                PA.T(wp.p(in6));
                                                                z13 = false;
                                                                this.f30378M0 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            if (this.f30380N0) {
                                                                if (!wp.o()) {
                                                                    this.f30376L0 = z13;
                                                                    f0();
                                                                    this.f30380N0 = z13;
                                                                    u();
                                                                    if (!this.f30376L0) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    in2 = in;
                                                                    c4164xG2 = c4164xG;
                                                                    th5 = r52;
                                                                    z15 = true;
                                                                    c4164xG4 = c4164xG2;
                                                                    in4 = in2;
                                                                    c4 = 0;
                                                                    i12 = 4;
                                                                    c9 = 65531;
                                                                }
                                                            }
                                                            PA.T(!this.f30400X0);
                                                            c4164xG2 = c4164xG;
                                                            c4164xG2.f35132u = r52;
                                                            c4164xG2.f35133v = r52;
                                                            in6.i();
                                                            while (true) {
                                                                in6.i();
                                                                int n10 = n(c4164xG2, in6, z13 ? 1 : 0);
                                                                if (n10 == -5) {
                                                                    in2 = in;
                                                                    X(c4164xG2);
                                                                    break;
                                                                }
                                                                if (n10 != -4) {
                                                                    if (q0()) {
                                                                        n0().c(this.f30396V0);
                                                                    }
                                                                } else {
                                                                    if (in6.h(4)) {
                                                                        this.f30400X0 = true;
                                                                        n0().c(this.f30396V0);
                                                                        break;
                                                                    }
                                                                    this.f30396V0 = Math.max(this.f30396V0, in6.f25553f);
                                                                    if (q0()) {
                                                                        in2 = in;
                                                                    } else {
                                                                        in2 = in;
                                                                        if (in2.h(536870912)) {
                                                                        }
                                                                        if (this.f30403Z0) {
                                                                            TP tp3 = this.Y;
                                                                            if (tp3 == null) {
                                                                                throw r52;
                                                                            }
                                                                            this.f30402Z = tp3;
                                                                            if (Objects.equals(tp3.f27776o, com.anythink.basead.exoplayer.k.o.f8584H) && !this.f30402Z.f27779r.isEmpty()) {
                                                                                byte[] bArr = (byte[]) this.f30402Z.f27779r.get(z13 ? 1 : 0);
                                                                                int i14 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                                                                C4065vP a9 = this.f30402Z.a();
                                                                                a9.a(i14);
                                                                                this.f30402Z = a9.b();
                                                                            }
                                                                            Y(this.f30402Z, r52);
                                                                            this.f30403Z0 = z13;
                                                                        }
                                                                        in6.l();
                                                                        tp = this.f30402Z;
                                                                        if (tp != null && Objects.equals(tp.f27776o, com.anythink.basead.exoplayer.k.o.f8584H)) {
                                                                            if (in6.h(268435456)) {
                                                                                in6.f25550c = this.f30402Z;
                                                                                e0(in6);
                                                                            }
                                                                            if (this.f30362E - in6.f25553f > 80000 ? true : z13 ? 1 : 0) {
                                                                                this.f30397W.c(in6, this.f30402Z.f27779r);
                                                                            }
                                                                        }
                                                                        if (!wp.o()) {
                                                                            long j14 = this.f30362E;
                                                                            if (o0(j14, wp.i) != o0(j14, in6.f25553f)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (wp.p(in6)) {
                                                                            break;
                                                                        } else {
                                                                            in = in2;
                                                                        }
                                                                    }
                                                                    n0().c(this.f30396V0);
                                                                    if (this.f30403Z0) {
                                                                    }
                                                                    in6.l();
                                                                    tp = this.f30402Z;
                                                                    if (tp != null) {
                                                                        if (in6.h(268435456)) {
                                                                        }
                                                                        if (this.f30362E - in6.f25553f > 80000 ? true : z13 ? 1 : 0) {
                                                                        }
                                                                    }
                                                                    if (!wp.o()) {
                                                                    }
                                                                    if (wp.p(in6)) {
                                                                    }
                                                                }
                                                            }
                                                            in2 = in;
                                                            if (wp.o()) {
                                                                wp.l();
                                                            }
                                                            if (!wp.o() && !this.f30400X0 && !this.f30380N0) {
                                                                break;
                                                            }
                                                            th5 = r52;
                                                            z15 = true;
                                                            c4164xG4 = c4164xG2;
                                                            in4 = in2;
                                                            c4 = 0;
                                                            i12 = 4;
                                                            c9 = 65531;
                                                        } catch (IllegalStateException e6) {
                                                            e = e6;
                                                            in4 = null;
                                                            z8 = z12;
                                                            r142 = in4;
                                                            z9 = e instanceof MediaCodec.CodecException;
                                                            if (!z9) {
                                                            }
                                                            W(e);
                                                            if (z9) {
                                                            }
                                                            z10 = r142;
                                                            if (z10) {
                                                            }
                                                            B8 = B(e, this.f30356A0);
                                                            if (B8.f29206n != 1101) {
                                                            }
                                                            throw m(B8, this.Y, z10, i);
                                                        }
                                                    } catch (IllegalStateException e9) {
                                                        e = e9;
                                                        z12 = true;
                                                    }
                                                }
                                                Trace.endSection();
                                            } catch (MediaCodec.CryptoException e10) {
                                                e = e10;
                                                in4 = null;
                                                r14 = in4;
                                                throw m(e, this.Y, r14, AbstractC3548lu.g(e.getErrorCode()));
                                            }
                                        } catch (IllegalStateException e11) {
                                            e = e11;
                                            z12 = z15;
                                        }
                                    } else {
                                        boolean z18 = true;
                                        IN in7 = in4;
                                        C4164xG c4164xG5 = c4164xG4;
                                        Throwable th6 = null;
                                        boolean z19 = false;
                                        if (this.f30421t0 != null) {
                                            T2 t22 = this.f30432z;
                                            t22.getClass();
                                            long r9 = t22.r();
                                            Trace.beginSection("drainAndFeed");
                                            while (true) {
                                                YP yp = this.f30421t0;
                                                if (yp == null) {
                                                    throw th6;
                                                }
                                                boolean z20 = this.f30372J0 >= 0 ? z18 : z19;
                                                MediaCodec.BufferInfo bufferInfo = this.f30393U;
                                                if (z20) {
                                                    th = th6;
                                                } else {
                                                    try {
                                                        int v6 = yp.v(bufferInfo);
                                                        if (v6 >= 0) {
                                                            th = th6;
                                                            bufferInfo.presentationTimeUs -= this.f30410g1;
                                                            if (this.f30363E0) {
                                                                this.f30363E0 = z19;
                                                                yp.D(v6);
                                                                j11 = j12;
                                                                c4164xG3 = c4164xG5;
                                                                in3 = in7;
                                                                th2 = th;
                                                            } else {
                                                                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                    l0();
                                                                    j11 = j12;
                                                                    c4164xG3 = c4164xG5;
                                                                    in3 = in7;
                                                                    i4 = 4;
                                                                    r32 = th;
                                                                    i9 = -1;
                                                                    break;
                                                                }
                                                                this.f30372J0 = v6;
                                                                ByteBuffer d2 = yp.d(v6);
                                                                this.f30374K0 = d2;
                                                                if (d2 != null) {
                                                                    d2.position(bufferInfo.offset);
                                                                    this.f30374K0.limit(bufferInfo.offset + bufferInfo.size);
                                                                }
                                                                TP tp4 = (TP) this.f30405b1.f30057d.f(bufferInfo.presentationTimeUs);
                                                                if (tp4 == null && this.f30407d1 && this.f30425v0 != null) {
                                                                    tp4 = (TP) this.f30405b1.f30057d.e();
                                                                }
                                                                if (tp4 != null) {
                                                                    this.f30402Z = tp4;
                                                                } else if (this.f30427w0) {
                                                                }
                                                                TP tp5 = this.f30402Z;
                                                                if (tp5 == null) {
                                                                    throw th;
                                                                }
                                                                Y(tp5, this.f30425v0);
                                                                this.f30427w0 = z19;
                                                                this.f30407d1 = z19;
                                                            }
                                                        } else if (v6 == -2) {
                                                            this.f30394U0 = z18;
                                                            YP yp2 = this.f30421t0;
                                                            if (yp2 == null) {
                                                                throw th6;
                                                            }
                                                            MediaFormat e12 = yp2.e();
                                                            if (this.f30358B0 != 0 && e12.getInteger("width") == 32 && e12.getInteger("height") == 32) {
                                                                this.f30363E0 = z18;
                                                            } else {
                                                                if (Build.VERSION.SDK_INT >= 29) {
                                                                    C3998uC c3998uC = this.f30413j1;
                                                                    if (!c3998uC.isEmpty()) {
                                                                        KN kn = KN.f25957b;
                                                                        HashMap hashMap = new HashMap();
                                                                        Iterator it = c3998uC.iterator();
                                                                        while (true) {
                                                                            AbstractC3674oB abstractC3674oB = (AbstractC3674oB) it;
                                                                            if (!abstractC3674oB.hasNext()) {
                                                                                break;
                                                                            }
                                                                            String str = (String) abstractC3674oB.next();
                                                                            if (e12.containsKey(str)) {
                                                                                valueTypeForKey = e12.getValueTypeForKey(str);
                                                                                if (valueTypeForKey == z18) {
                                                                                    hashMap.put(str, Integer.valueOf(e12.getInteger(str)));
                                                                                } else if (valueTypeForKey == i11) {
                                                                                    hashMap.put(str, Long.valueOf(e12.getLong(str)));
                                                                                } else if (valueTypeForKey == i10) {
                                                                                    hashMap.put(str, Float.valueOf(e12.getFloat(str)));
                                                                                } else if (valueTypeForKey == 4) {
                                                                                    hashMap.put(str, e12.getString(str));
                                                                                } else if (valueTypeForKey == 5) {
                                                                                    ByteBuffer byteBuffer2 = e12.getByteBuffer(str);
                                                                                    if (byteBuffer2 == null) {
                                                                                        hashMap.put(str, th6);
                                                                                    } else {
                                                                                        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer2.remaining());
                                                                                        allocate.put(byteBuffer2.duplicate());
                                                                                        allocate.flip();
                                                                                        hashMap.put(str, allocate);
                                                                                    }
                                                                                }
                                                                                i10 = 3;
                                                                            }
                                                                        }
                                                                        KN kn2 = new KN(hashMap);
                                                                        if (!kn2.equals(this.f30412i1)) {
                                                                            this.f30412i1 = kn2;
                                                                            b0(kn2);
                                                                        }
                                                                    }
                                                                }
                                                                this.f30425v0 = e12;
                                                                this.f30427w0 = z18;
                                                            }
                                                            j11 = j12;
                                                            th2 = th6;
                                                            c4164xG3 = c4164xG5;
                                                            in3 = in7;
                                                        } else {
                                                            if (this.f30365F0 && (this.f30400X0 || this.f30386Q0 == i11)) {
                                                                l0();
                                                            }
                                                            long j15 = this.f30367G0;
                                                            if (j15 != com.anythink.basead.exoplayer.b.f6539b) {
                                                                long j16 = j15 + 100;
                                                                this.f30432z.getClass();
                                                                if (j16 < System.currentTimeMillis()) {
                                                                    l0();
                                                                }
                                                            }
                                                            j11 = j12;
                                                            th3 = th6;
                                                            c4164xG3 = c4164xG5;
                                                            in3 = in7;
                                                            i9 = -1;
                                                        }
                                                        i9 = -1;
                                                        i4 = 4;
                                                        th4 = th2;
                                                        if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
                                                            this.f30432z.getClass();
                                                            if (SystemClock.elapsedRealtime() - r9 >= j11) {
                                                                z14 = false;
                                                                if (!z14) {
                                                                    r32 = th4;
                                                                    break;
                                                                }
                                                                th6 = th4;
                                                                j12 = j11;
                                                                in7 = in3;
                                                                c4164xG5 = c4164xG3;
                                                                i10 = 3;
                                                                z18 = true;
                                                                i11 = 2;
                                                                z19 = false;
                                                            }
                                                        }
                                                        z14 = true;
                                                        if (!z14) {
                                                        }
                                                    } catch (IllegalStateException e13) {
                                                        e = e13;
                                                        r142 = z19;
                                                        z8 = true;
                                                        z9 = e instanceof MediaCodec.CodecException;
                                                        if (!z9) {
                                                        }
                                                        W(e);
                                                        if (z9) {
                                                        }
                                                        z10 = r142;
                                                        if (z10) {
                                                        }
                                                        B8 = B(e, this.f30356A0);
                                                        if (B8.f29206n != 1101) {
                                                        }
                                                        throw m(B8, this.Y, z10, i);
                                                    }
                                                }
                                                boolean z21 = this.f30409f1 || bufferInfo.presentationTimeUs < this.f30362E;
                                                long j17 = this.f30405b1.f30059f;
                                                boolean z22 = j17 != com.anythink.basead.exoplayer.b.f6539b && j17 <= bufferInfo.presentationTimeUs;
                                                ByteBuffer byteBuffer3 = this.f30374K0;
                                                int i15 = this.f30372J0;
                                                C4164xG c4164xG6 = c4164xG5;
                                                int i16 = bufferInfo.flags;
                                                IN in8 = in7;
                                                long j18 = bufferInfo.presentationTimeUs;
                                                TP tp6 = this.f30402Z;
                                                if (tp6 == null) {
                                                    throw th;
                                                }
                                                j11 = j12;
                                                in3 = in8;
                                                c4164xG3 = c4164xG6;
                                                if (!a0(j9, j10, yp, byteBuffer3, i15, i16, 1, j18, z21, z22, tp6)) {
                                                    i9 = -1;
                                                    th3 = null;
                                                    break;
                                                }
                                                g0(bufferInfo.presentationTimeUs);
                                                i4 = 4;
                                                boolean z23 = (bufferInfo.flags & 4) != 0;
                                                if (!z23 && this.f30392T0 && z22) {
                                                    this.f30432z.getClass();
                                                    this.f30367G0 = System.currentTimeMillis();
                                                }
                                                i9 = -1;
                                                this.f30372J0 = -1;
                                                th4 = null;
                                                r32 = 0;
                                                this.f30374K0 = null;
                                                if (z23) {
                                                    l0();
                                                    break;
                                                }
                                                if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
                                                }
                                                z14 = true;
                                                if (!z14) {
                                                }
                                            }
                                        } else {
                                            LN ln = this.f30404a1;
                                            int i17 = ln.f26150d;
                                            VQ vq = this.f30357B;
                                            vq.getClass();
                                            ln.f26150d = i17 + vq.b(j9 - this.f30360D);
                                            t(1);
                                        }
                                    }
                                    this.f30404a1.a();
                                } catch (IllegalStateException e14) {
                                    e = e14;
                                }
                            } catch (IllegalStateException e15) {
                                e = e15;
                                z8 = z11;
                            }
                        } catch (MediaCodec.CryptoException e16) {
                            e = e16;
                        }
                    } catch (IllegalStateException e17) {
                        e = e17;
                        z8 = true;
                    }
                } catch (MediaCodec.CryptoException e18) {
                    e = e18;
                    throw m(e, this.Y, r14, AbstractC3548lu.g(e.getErrorCode()));
                } catch (IllegalStateException e19) {
                    e = e19;
                }
            } catch (IllegalStateException e20) {
                e = e20;
                z8 = true;
            }
        } catch (MediaCodec.CryptoException e21) {
            e = e21;
            r14 = 0;
        }
    }

    public abstract boolean H();

    public abstract boolean I();

    public final int K(TP tp) {
        try {
            return L(this.f30381O, tp);
        } catch (C3259gQ e6) {
            throw m(e6, tp, false, 4002);
        }
    }

    public abstract int L(C3796qP c3796qP, TP tp);

    public final void M(long j9, boolean z8, boolean z9) {
        this.f30366G = false;
        this.f30362E = j9;
        this.f30364F = j9;
        if (!z9) {
            VQ vq = this.f30357B;
            vq.getClass();
            z9 = vq.b(j9 - this.f30360D) != 0;
        }
        a(j9, z8, z9);
    }

    public abstract ArrayList N(C3796qP c3796qP, TP tp);

    public final void O() {
        BQ bq;
        int e6;
        if (this.f30370I.g() || (bq = this.J) == null || (e6 = this.f30370I.e(bq.f24043a)) == -1) {
            this.f30373K = com.anythink.basead.exoplayer.b.f6539b;
        } else {
            this.f30373K = this.f30370I.d(e6, new L7(), false).f26109d;
        }
    }

    public boolean P(TP tp) {
        return false;
    }

    public abstract r Q(C2986bQ c2986bQ, TP tp, float f6);

    public abstract MN R(C2986bQ c2986bQ, TP tp, TP tp2, boolean z8);

    public long S(long j9) {
        if (this.f30355A == 1) {
            return (H() || I()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract float T(float f6, TP tp, TP[] tpArr);

    public abstract void U(String str, long j9, long j10);

    public abstract void V(String str);

    public abstract void W(Exception exc);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (java.util.Objects.equals(r3, "video/av01") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
    
        if (j0() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f5, code lost:
    
        if (j0() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0107, code lost:
    
        if (j0() == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MN X(C4164xG c4164xG) {
        int i;
        Pair b9;
        String str;
        boolean z8 = true;
        this.f30403Z0 = true;
        TP tp = (TP) c4164xG.f35133v;
        tp.getClass();
        String str2 = tp.f27776o;
        if (str2 == null) {
            throw m(new IllegalArgumentException("Sample MIME type is null."), tp, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals(com.anythink.basead.exoplayer.k.o.f8610k)) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = AbstractC4295zm.f35602a;
                if (str2.equals("video/dolby-vision") && (b9 = AbstractC4295zm.b(tp)) != null) {
                    int intValue = ((Integer) b9.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = com.anythink.basead.exoplayer.k.o.i;
                    } else if (intValue == 512) {
                        str = com.anythink.basead.exoplayer.k.o.f8608h;
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = null;
            }
            TP tp2 = tp;
            this.f30416o0 = (Mu) c4164xG.f35132u;
            this.Y = tp2;
            if (!this.f30376L0) {
                this.f30380N0 = true;
                return null;
            }
            YP yp = this.f30421t0;
            if (yp == null) {
                this.f30431y0 = null;
                u();
                return null;
            }
            C2986bQ c2986bQ = this.f30356A0;
            c2986bQ.getClass();
            TP tp3 = this.f30423u0;
            tp3.getClass();
            Mu mu = this.f30415n0;
            Mu mu2 = this.f30416o0;
            if (mu != mu2) {
                k0();
                return new MN(c2986bQ.f29490a, tp3, tp2, 0, 128);
            }
            MN R8 = R(c2986bQ, tp3, tp2, n0().f30058e);
            int i4 = R8.f26334d;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (i0(tp2)) {
                        this.f30423u0 = tp2;
                        if (mu2 == mu) {
                            if (this.f30390S0) {
                                this.f30386Q0 = 1;
                                if (x()) {
                                    this.f30388R0 = 3;
                                    i = 2;
                                } else {
                                    this.f30388R0 = 1;
                                }
                            }
                        }
                    }
                    i = 16;
                } else if (i4 != 2) {
                    if (i0(tp2)) {
                        this.f30423u0 = tp2;
                        if (mu2 != mu) {
                        }
                    }
                    i = 16;
                } else {
                    if (i0(tp2)) {
                        this.f30382O0 = true;
                        this.f30384P0 = 1;
                        int i9 = this.f30358B0;
                        if (i9 != 2 && (i9 != 1 || tp2.f27783v != tp3.f27783v || tp2.f27784w != tp3.f27784w)) {
                            z8 = false;
                        }
                        this.f30361D0 = z8;
                        this.f30423u0 = tp2;
                        if (mu2 != mu) {
                        }
                    }
                    i = 16;
                }
                return (i4 != 0 || (this.f30421t0 == yp && this.f30388R0 != 3)) ? R8 : new MN(c2986bQ.f29490a, tp3, tp2, 0, i);
            }
            k0();
            i = 0;
            if (i4 != 0) {
            }
        }
        if (!tp.f27779r.isEmpty()) {
            C4065vP c4065vP = new C4065vP(tp);
            c4065vP.f34788q = null;
            tp = new TP(c4065vP);
        }
        TP tp22 = tp;
        this.f30416o0 = (Mu) c4164xG.f35132u;
        this.Y = tp22;
        if (!this.f30376L0) {
        }
    }

    public abstract void Y(TP tp, MediaFormat mediaFormat);

    public abstract void Z();

    public void a(long j9, boolean z8, boolean z9) {
        ArrayDeque arrayDeque = this.f30395V;
        if (!arrayDeque.isEmpty()) {
            this.f30405b1 = (C3095dQ) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z9) {
            this.f30400X0 = false;
            this.f30401Y0 = false;
            if (this.f30376L0) {
                f0();
            } else if (this.f30421t0 != null) {
                if (x()) {
                    w();
                    u();
                } else if (y()) {
                    s();
                } else {
                    this.f30409f1 = true;
                }
            }
            if (this.f30405b1.f30057d.d() > 0) {
                this.f30403Z0 = true;
            }
            F3.q qVar = this.f30405b1.f30057d;
            synchronized (qVar) {
                qVar.f1059a = 0;
                qVar.f1060b = 0;
                Arrays.fill((Object[]) qVar.f1062d, (Object) null);
            }
            this.f30405b1.f30058e = false;
        }
    }

    public abstract boolean a0(long j9, long j10, YP yp, ByteBuffer byteBuffer, int i, int i4, int i9, long j11, boolean z8, boolean z9, TP tp);

    public abstract void b0(KN kn);

    public abstract void c0();

    public abstract void d();

    public void d0(long j9) {
    }

    public abstract void e0(IN in);

    public abstract void f();

    public final void f0() {
        this.f30396V0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30398W0 = com.anythink.basead.exoplayer.b.f6539b;
        n0().f30059f = com.anythink.basead.exoplayer.b.f6539b;
        this.f30406c1 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30380N0 = false;
        this.f30391T.i();
        this.f30389S.i();
        this.f30378M0 = false;
        C3826r2 c3826r2 = this.f30397W;
        c3826r2.getClass();
        c3826r2.f33938v = InterfaceC3050ci.f29732a;
        c3826r2.f33937u = 0;
        c3826r2.f33936n = 2;
    }

    public void g0(long j9) {
        this.f30406c1 = Math.max(j9, this.f30406c1);
        while (true) {
            ArrayDeque arrayDeque = this.f30395V;
            if (arrayDeque.isEmpty() || j9 < ((C3095dQ) arrayDeque.peek()).f30054a) {
                return;
            }
            C3095dQ c3095dQ = (C3095dQ) arrayDeque.poll();
            c3095dQ.getClass();
            m0(c3095dQ);
            Z();
        }
    }

    public final void h0(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.f30411h1.f25958a.entrySet()) {
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

    public void i() {
        this.Y = null;
        m0(C3095dQ.f30053g);
        this.f30395V.clear();
        if (this.f30376L0) {
            this.f30376L0 = false;
            f0();
        } else {
            if (this.f30421t0 == null) {
                return;
            }
            if (x()) {
                w();
            } else if (y()) {
                s();
            } else {
                this.f30409f1 = true;
            }
        }
    }

    public final boolean i0(TP tp) {
        if (this.f30421t0 != null && this.f30388R0 != 3 && this.f30355A != 0) {
            float f6 = this.f30420s0;
            tp.getClass();
            TP[] tpArr = this.f30359C;
            tpArr.getClass();
            float T8 = T(f6, tp, tpArr);
            float f9 = this.f30429x0;
            if (f9 != T8) {
                if (T8 == -1.0f) {
                    k0();
                    return false;
                }
                if (f9 != -1.0f || T8 > this.f30383P) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", T8);
                    YP yp = this.f30421t0;
                    yp.getClass();
                    yp.g(bundle);
                    this.f30429x0 = T8;
                }
            }
        }
        return true;
    }

    public abstract void j();

    public final boolean j0() {
        if (this.f30390S0) {
            this.f30386Q0 = 1;
            if (x()) {
                this.f30388R0 = 3;
                return false;
            }
            this.f30388R0 = 2;
            return true;
        }
        Mu mu = this.f30416o0;
        mu.getClass();
        this.f30415n0 = mu;
        this.f30386Q0 = 0;
        this.f30388R0 = 0;
        return true;
    }

    public abstract void k();

    public final void k0() {
        if (this.f30390S0) {
            this.f30386Q0 = 1;
            this.f30388R0 = 3;
        } else {
            w();
            u();
        }
    }

    public final void l() {
        this.f30426w.getClass();
    }

    public final void l0() {
        int i = this.f30388R0;
        if (i == 1) {
            s();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.f30401Y0 = true;
                c0();
                return;
            } else {
                w();
                u();
                return;
            }
        }
        s();
        Mu mu = this.f30416o0;
        mu.getClass();
        this.f30415n0 = mu;
        this.f30386Q0 = 0;
        this.f30388R0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RN m(Exception exc, TP tp, boolean z8, int i) {
        int i4;
        if (tp != null && !this.f30368H) {
            this.f30368H = true;
            try {
                i4 = K(tp) & 7;
            } catch (RN unused) {
            } finally {
                this.f30368H = false;
            }
            return new RN(1, exc, i, o(), this.f30428x, tp, tp != null ? 4 : i4, this.J, z8);
        }
        i4 = 4;
        return new RN(1, exc, i, o(), this.f30428x, tp, tp != null ? 4 : i4, this.J, z8);
    }

    public final void m0(C3095dQ c3095dQ) {
        this.f30405b1 = c3095dQ;
        long j9 = c3095dQ.f30056c;
        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
            this.f30407d1 = true;
            d0(j9);
        }
    }

    public final int n(C4164xG c4164xG, IN in, int i) {
        VQ vq = this.f30357B;
        vq.getClass();
        int c4 = vq.c(c4164xG, in, i);
        if (c4 == -4) {
            int i4 = i & 1;
            if (in.h(4)) {
                if (i4 == 0) {
                    this.f30364F = Long.MIN_VALUE;
                }
                return this.f30366G ? -4 : -3;
            }
            long j9 = in.f25553f + this.f30360D;
            in.f25553f = j9;
            if (i4 == 0) {
                this.f30364F = Math.max(this.f30364F, j9);
                return -4;
            }
        } else if (c4 == -5) {
            TP tp = (TP) c4164xG.f35133v;
            tp.getClass();
            long j10 = tp.f27781t;
            if (j10 != Long.MAX_VALUE) {
                C4065vP c4065vP = new C4065vP(tp);
                c4065vP.f34790s = j10 + this.f30360D;
                c4164xG.f35133v = new TP(c4065vP);
                return -5;
            }
        }
        return c4;
    }

    public final C3095dQ n0() {
        ArrayDeque arrayDeque = this.f30395V;
        return !arrayDeque.isEmpty() ? (C3095dQ) arrayDeque.getLast() : this.f30405b1;
    }

    public abstract String o();

    public final boolean o0(long j9, long j10) {
        if (j10 >= j9) {
            return false;
        }
        TP tp = this.f30402Z;
        return tp == null || !Objects.equals(tp.f27776o, com.anythink.basead.exoplayer.k.o.f8584H) || j9 - j10 > 80000;
    }

    public boolean p(long j9) {
        return false;
    }

    public final void p0(TP[] tpArr, VQ vq, long j9, long j10, BQ bq) {
        PA.T(!this.f30366G);
        this.f30357B = vq;
        this.J = bq;
        O();
        if (this.f30364F == Long.MIN_VALUE) {
            this.f30364F = j9;
        }
        this.f30359C = tpArr;
        this.f30360D = j10;
        u0(tpArr, j9, j10, bq);
    }

    public void q(float f6, float f9) {
        this.f30419r0 = f6;
        this.f30420s0 = f9;
        i0(this.f30423u0);
    }

    public final boolean q0() {
        return this.f30364F == Long.MIN_VALUE;
    }

    public InterfaceC3687oO r0() {
        return null;
    }

    public final void s() {
        try {
            YP yp = this.f30421t0;
            if (yp == null) {
                throw null;
            }
            yp.j();
        } finally {
            z();
        }
    }

    public final void s0() {
        synchronized (this.f30414n) {
            this.f30375L = null;
        }
    }

    public final boolean t(int i) {
        C4164xG c4164xG = this.f30424v;
        c4164xG.f35132u = null;
        c4164xG.f35133v = null;
        IN in = this.f30385Q;
        in.i();
        int n9 = n(c4164xG, in, i | 4);
        if (n9 == -5) {
            X(c4164xG);
            return true;
        }
        if (n9 != -4 || !in.h(4)) {
            return false;
        }
        this.f30400X0 = true;
        l0();
        return false;
    }

    public abstract void t0(boolean z8, boolean z9);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c6 A[Catch: cQ -> 0x02e1, TryCatch #3 {cQ -> 0x02e1, blocks: (B:145:0x0298, B:147:0x02c6, B:148:0x02d1, B:150:0x02de, B:151:0x02f8, B:156:0x0300, B:157:0x0302, B:158:0x02e3, B:202:0x0306, B:204:0x0307, B:207:0x0314, B:208:0x0315, B:209:0x0322, B:221:0x0328), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02de A[Catch: cQ -> 0x02e1, TryCatch #3 {cQ -> 0x02e1, blocks: (B:145:0x0298, B:147:0x02c6, B:148:0x02d1, B:150:0x02de, B:151:0x02f8, B:156:0x0300, B:157:0x0302, B:158:0x02e3, B:202:0x0306, B:204:0x0307, B:207:0x0314, B:208:0x0315, B:209:0x0322, B:221:0x0328), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e3 A[Catch: cQ -> 0x02e1, TryCatch #3 {cQ -> 0x02e1, blocks: (B:145:0x0298, B:147:0x02c6, B:148:0x02d1, B:150:0x02de, B:151:0x02f8, B:156:0x0300, B:157:0x0302, B:158:0x02e3, B:202:0x0306, B:204:0x0307, B:207:0x0314, B:208:0x0315, B:209:0x0322, B:221:0x0328), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cc A[Catch: Exception -> 0x0110, TRY_ENTER, TryCatch #0 {Exception -> 0x0110, blocks: (B:168:0x00e8, B:169:0x00ed, B:175:0x00f8, B:176:0x00f9, B:178:0x0102, B:68:0x0157, B:72:0x0189, B:74:0x0191, B:76:0x019b, B:78:0x01a3, B:80:0x01ab, B:86:0x01bc, B:91:0x01cc, B:99:0x022e, B:104:0x024d, B:106:0x0253, B:108:0x0257, B:110:0x0265, B:120:0x01da, B:122:0x01e2, B:124:0x01ea, B:126:0x01f2, B:128:0x01fa, B:130:0x0202, B:134:0x0214, B:136:0x021e, B:184:0x0118, B:172:0x00f0, B:174:0x00f4, B:179:0x0115), top: B:167:0x00e8, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022a A[Catch: Exception -> 0x0276, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0276, blocks: (B:65:0x0146, B:97:0x022a), top: B:64:0x0146 }] */
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
    public final void u() {
        TP tp;
        TP tp2;
        ?? r17;
        boolean z8;
        AbstractC3149eQ abstractC3149eQ;
        Exception exc;
        C3040cQ c3040cQ;
        boolean z9;
        AbstractC3149eQ abstractC3149eQ2;
        TP tp3;
        int i;
        long j9;
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        long elapsedRealtime;
        int i4;
        boolean z10;
        LogSessionId unused;
        AbstractC3149eQ abstractC3149eQ3 = this;
        AbstractC3149eQ abstractC3149eQ4 = null;
        if (abstractC3149eQ3.f30421t0 == null && !abstractC3149eQ3.f30376L0 && (tp = abstractC3149eQ3.Y) != null) {
            boolean z11 = true;
            if (abstractC3149eQ3.f30416o0 == null && abstractC3149eQ3.P(tp)) {
                abstractC3149eQ3.f30376L0 = false;
                abstractC3149eQ3.f0();
                String str = tp.f27776o;
                boolean equals2 = com.anythink.basead.exoplayer.k.o.f8617r.equals(str);
                WP wp = abstractC3149eQ3.f30391T;
                if (equals2 || com.anythink.basead.exoplayer.k.o.f8619t.equals(str) || com.anythink.basead.exoplayer.k.o.f8584H.equals(str)) {
                    wp.f28393k = 32;
                } else {
                    wp.f28393k = 1;
                }
                abstractC3149eQ3.f30376L0 = true;
                return;
            }
            abstractC3149eQ3.f30415n0 = abstractC3149eQ3.f30416o0;
            try {
                tp2 = abstractC3149eQ3.Y;
            } catch (C3040cQ e6) {
                e = e6;
                abstractC3149eQ4 = abstractC3149eQ3;
            }
            try {
                if (tp2 == null) {
                    throw null;
                }
                if (abstractC3149eQ3.f30431y0 == null) {
                    try {
                        ArrayList N8 = abstractC3149eQ3.N(abstractC3149eQ3.f30381O, tp2);
                        N8.isEmpty();
                        abstractC3149eQ3.f30431y0 = new ArrayDeque();
                        if (!N8.isEmpty()) {
                            abstractC3149eQ3.f30431y0.add((C2986bQ) N8.get(0));
                        }
                        abstractC3149eQ3.f30433z0 = null;
                    } catch (C3259gQ e9) {
                        throw new C3040cQ(tp2, e9, -49998);
                    }
                }
                if (abstractC3149eQ3.f30431y0.isEmpty()) {
                    throw new C3040cQ(tp2, null, -49999);
                }
                ArrayDeque arrayDeque = abstractC3149eQ3.f30431y0;
                if (arrayDeque == null) {
                    throw null;
                }
                while (abstractC3149eQ3.f30421t0 == null) {
                    C2986bQ c2986bQ = (C2986bQ) arrayDeque.peekFirst();
                    if (c2986bQ == null) {
                        throw abstractC3149eQ4;
                    }
                    String str2 = c2986bQ.f29490a;
                    abstractC3149eQ3.C(tp2);
                    if (abstractC3149eQ3.v(c2986bQ)) {
                        try {
                            abstractC3149eQ3.f30356A0 = c2986bQ;
                            tp3 = abstractC3149eQ3.Y;
                        } catch (Exception e10) {
                            e = e10;
                            r17 = abstractC3149eQ4;
                            z8 = z11;
                        }
                        if (tp3 == null) {
                            throw abstractC3149eQ4;
                        }
                        float f6 = abstractC3149eQ3.f30420s0;
                        try {
                            TP[] tpArr = abstractC3149eQ3.f30359C;
                            tpArr.getClass();
                            float T8 = abstractC3149eQ3.T(f6, tp3, tpArr);
                            if (T8 <= abstractC3149eQ3.f30383P) {
                                T8 = -1.0f;
                            }
                            abstractC3149eQ3.f30432z.getClass();
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            z8 = z11;
                            try {
                                r Q3 = abstractC3149eQ3.Q(c2986bQ, tp3, T8);
                                i = Build.VERSION.SDK_INT;
                                r17 = abstractC3149eQ4;
                                ?? r72 = 31;
                                if (i >= 31) {
                                    try {
                                        VO vo = abstractC3149eQ3.f30430y;
                                        vo.getClass();
                                        synchronized (vo) {
                                            j9 = elapsedRealtime2;
                                            Mt mt = vo.f28246b;
                                            if (mt == null) {
                                                throw r17;
                                            }
                                            logSessionId = (LogSessionId) mt.f26393u;
                                        }
                                        unused = LogSessionId.LOG_SESSION_ID_NONE;
                                        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                        r72 = vo;
                                        if (!equals) {
                                            MediaFormat mediaFormat = (MediaFormat) Q3.f33920v;
                                            stringId = logSessionId.getStringId();
                                            mediaFormat.setString("log-session-id", stringId);
                                            r72 = "log-session-id";
                                        }
                                    } catch (Exception e11) {
                                        exc = e11;
                                        abstractC3149eQ = abstractC3149eQ3;
                                        r17 = r17;
                                        AbstractC3217fl.O("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                        arrayDeque.removeFirst();
                                        String str3 = c2986bQ.f29490a;
                                        int length = str3.length();
                                        String tp4 = tp2.toString();
                                        C3040cQ c3040cQ2 = new C3040cQ(com.anythink.basead.b.c.i.q(new StringBuilder(length + 23 + tp4.length()), "Decoder init failed: ", str3, ", ", tp4), exc, tp2.f27776o, c2986bQ, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                        abstractC3149eQ.W(c3040cQ2);
                                        c3040cQ = abstractC3149eQ.f30433z0;
                                        if (c3040cQ == null) {
                                            abstractC3149eQ.f30433z0 = c3040cQ2;
                                        } else {
                                            abstractC3149eQ.f30433z0 = new C3040cQ(c3040cQ.getMessage(), c3040cQ.getCause(), c3040cQ.f29706n, c3040cQ.f29707u, c3040cQ.f29708v);
                                        }
                                        if (arrayDeque.isEmpty()) {
                                            throw abstractC3149eQ.f30433z0;
                                        }
                                        abstractC3149eQ3 = abstractC3149eQ;
                                        z11 = z8;
                                        abstractC3149eQ4 = r17;
                                    }
                                } else {
                                    j9 = elapsedRealtime2;
                                }
                                try {
                                    try {
                                        StringBuilder sb = new StringBuilder(str2.length() + 12);
                                        sb.append("createCodec:");
                                        sb.append(str2);
                                        Trace.beginSection(sb.toString());
                                        YP c4 = abstractC3149eQ3.f30379N.c(Q3);
                                        abstractC3149eQ3.f30421t0 = c4;
                                        c4.x(new C4086vt(abstractC3149eQ3));
                                        try {
                                            Trace.endSection();
                                            try {
                                                abstractC3149eQ3.f30432z.getClass();
                                                elapsedRealtime = SystemClock.elapsedRealtime();
                                                if (!c2986bQ.b(abstractC3149eQ3.f30377M, tp3)) {
                                                    String c9 = TP.c(tp3);
                                                    String str4 = AbstractC3548lu.f32613a;
                                                    Locale locale = Locale.US;
                                                    AbstractC3217fl.I("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + c9 + ", " + str2 + "]");
                                                }
                                                abstractC3149eQ3.f30429x0 = T8;
                                                abstractC3149eQ3.f30423u0 = tp3;
                                            } catch (Exception e12) {
                                                e = e12;
                                                abstractC3149eQ2 = abstractC3149eQ3;
                                                z9 = r17;
                                                exc = e;
                                                abstractC3149eQ = abstractC3149eQ2;
                                                r17 = z9;
                                                AbstractC3217fl.O("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                                arrayDeque.removeFirst();
                                                String str32 = c2986bQ.f29490a;
                                                int length2 = str32.length();
                                                String tp42 = tp2.toString();
                                                C3040cQ c3040cQ22 = new C3040cQ(com.anythink.basead.b.c.i.q(new StringBuilder(length2 + 23 + tp42.length()), "Decoder init failed: ", str32, ", ", tp42), exc, tp2.f27776o, c2986bQ, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                                abstractC3149eQ.W(c3040cQ22);
                                                c3040cQ = abstractC3149eQ.f30433z0;
                                                if (c3040cQ == null) {
                                                }
                                                if (arrayDeque.isEmpty()) {
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        abstractC3149eQ2 = r72;
                                        z9 = r17;
                                        exc = e;
                                        abstractC3149eQ = abstractC3149eQ2;
                                        r17 = z9;
                                        AbstractC3217fl.O("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                        arrayDeque.removeFirst();
                                        String str322 = c2986bQ.f29490a;
                                        int length22 = str322.length();
                                        String tp422 = tp2.toString();
                                        C3040cQ c3040cQ222 = new C3040cQ(com.anythink.basead.b.c.i.q(new StringBuilder(length22 + 23 + tp422.length()), "Decoder init failed: ", str322, ", ", tp422), exc, tp2.f27776o, c2986bQ, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                        abstractC3149eQ.W(c3040cQ222);
                                        c3040cQ = abstractC3149eQ.f30433z0;
                                        if (c3040cQ == null) {
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
                                r17 = abstractC3149eQ4;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            r17 = abstractC3149eQ4;
                            z8 = z11;
                        }
                        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                            String str5 = Build.MODEL;
                            if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                                i4 = 2;
                                abstractC3149eQ3.f30358B0 = i4;
                                abstractC3149eQ3.C0 = (i == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z8;
                                if (i <= 25) {
                                    if ("OMX.rk.video_decoder.avc".equals(str2)) {
                                    }
                                    z10 = z8;
                                    abstractC3149eQ3.f30365F0 = z10;
                                    if (abstractC3149eQ3.f30421t0 != null) {
                                        throw r17;
                                    }
                                    if (abstractC3149eQ3.f30355A == 2) {
                                        abstractC3149eQ3.f30432z.getClass();
                                        abstractC3149eQ3.f30369H0 = SystemClock.elapsedRealtime() + 1000;
                                    }
                                    abstractC3149eQ3.f30404a1.f26147a++;
                                    long j10 = elapsedRealtime - j9;
                                    if (i >= 31) {
                                        C3998uC c3998uC = abstractC3149eQ3.f30413j1;
                                        if (!c3998uC.isEmpty()) {
                                            YP yp = abstractC3149eQ3.f30421t0;
                                            if (yp == null) {
                                                throw r17;
                                            }
                                            yp.f(new ArrayList(c3998uC));
                                        }
                                    }
                                    abstractC3149eQ3.U(str2, elapsedRealtime, j10);
                                    abstractC3149eQ = abstractC3149eQ3;
                                    abstractC3149eQ3 = abstractC3149eQ;
                                    z11 = z8;
                                    abstractC3149eQ4 = r17;
                                }
                                if ((i <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str2) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str2) && !"OMX.bcm.vdec.avc.tunnel".equals(str2) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str2) && !"OMX.bcm.vdec.hevc.tunnel".equals(str2) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !c2986bQ.f29495f)) {
                                    z10 = false;
                                    abstractC3149eQ3.f30365F0 = z10;
                                    if (abstractC3149eQ3.f30421t0 != null) {
                                    }
                                }
                                z10 = z8;
                                abstractC3149eQ3.f30365F0 = z10;
                                if (abstractC3149eQ3.f30421t0 != null) {
                                }
                            }
                        }
                        i4 = 0;
                        abstractC3149eQ3.f30358B0 = i4;
                        abstractC3149eQ3.C0 = (i == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z8;
                        if (i <= 25) {
                        }
                        if (i <= 29) {
                        }
                        z10 = false;
                        abstractC3149eQ3.f30365F0 = z10;
                        if (abstractC3149eQ3.f30421t0 != null) {
                        }
                    }
                }
                abstractC3149eQ3.f30431y0 = abstractC3149eQ4;
            } catch (C3040cQ e17) {
                e = e17;
                throw abstractC3149eQ4.m(e, tp, false, 4001);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u0(TP[] tpArr, long j9, long j10, BQ bq) {
        if (this.f30405b1.f30056c == com.anythink.basead.exoplayer.b.f6539b) {
            m0(new C3095dQ(com.anythink.basead.exoplayer.b.f6539b, j9, j10));
            if (this.f30408e1) {
                Z();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.f30395V;
        if (arrayDeque.isEmpty()) {
            long j11 = this.f30396V0;
            if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
                long j12 = this.f30406c1;
                if (j12 != com.anythink.basead.exoplayer.b.f6539b) {
                }
            }
            m0(new C3095dQ(com.anythink.basead.exoplayer.b.f6539b, j9, j10));
            if (this.f30405b1.f30056c != com.anythink.basead.exoplayer.b.f6539b) {
                Z();
                return;
            }
            return;
        }
        arrayDeque.add(new C3095dQ(this.f30396V0, j9, j10));
    }

    public boolean v(C2986bQ c2986bQ) {
        return true;
    }

    public final void w() {
        try {
            YP yp = this.f30421t0;
            if (yp != null) {
                yp.k();
                this.f30404a1.f26148b++;
                C2986bQ c2986bQ = this.f30356A0;
                if (c2986bQ == null) {
                    throw null;
                }
                V(c2986bQ.f29490a);
            }
            this.f30421t0 = null;
            this.f30415n0 = null;
            A();
        } catch (Throwable th) {
            this.f30421t0 = null;
            this.f30415n0 = null;
            A();
            throw th;
        }
    }

    public boolean x() {
        int i = this.f30388R0;
        if (i == 3 || (this.C0 && !this.f30394U0)) {
            return true;
        }
        if (i == 2) {
            try {
                Mu mu = this.f30416o0;
                mu.getClass();
                this.f30415n0 = mu;
                this.f30386Q0 = 0;
                this.f30388R0 = 0;
            } catch (RN e6) {
                AbstractC3217fl.O("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e6);
                return true;
            }
        }
        return false;
    }

    public boolean y() {
        return true;
    }

    public void z() {
        this.f30371I0 = -1;
        this.f30387R.f25552e = null;
        this.f30372J0 = -1;
        this.f30374K0 = null;
        this.f30396V0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30398W0 = com.anythink.basead.exoplayer.b.f6539b;
        n0().f30059f = com.anythink.basead.exoplayer.b.f6539b;
        this.f30406c1 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30369H0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30392T0 = false;
        this.f30367G0 = com.anythink.basead.exoplayer.b.f6539b;
        this.f30390S0 = false;
        this.f30361D0 = false;
        this.f30363E0 = false;
        this.f30386Q0 = 0;
        this.f30388R0 = 0;
        this.f30384P0 = this.f30382O0 ? 1 : 0;
        this.f30409f1 = false;
        this.f30410g1 = 0L;
    }

    public void r() {
    }

    public void C(TP tp) {
    }
}
