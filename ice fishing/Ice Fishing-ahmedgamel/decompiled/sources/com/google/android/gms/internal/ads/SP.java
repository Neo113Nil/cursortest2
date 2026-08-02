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
public abstract class SP implements InterfaceC3697oO {

    /* renamed from: e1, reason: collision with root package name */
    public static final byte[] f28195e1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public int f28196A;

    /* renamed from: A0, reason: collision with root package name */
    public long f28197A0;

    /* renamed from: B, reason: collision with root package name */
    public LQ f28198B;

    /* renamed from: B0, reason: collision with root package name */
    public long f28199B0;

    /* renamed from: C, reason: collision with root package name */
    public DP[] f28200C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public long f28201D;

    /* renamed from: D0, reason: collision with root package name */
    public int f28202D0;

    /* renamed from: E, reason: collision with root package name */
    public long f28203E;

    /* renamed from: E0, reason: collision with root package name */
    public ByteBuffer f28204E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f28206F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f28207G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f28208G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f28209H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f28210H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f28212I0;
    public C3860rQ J;

    /* renamed from: J0, reason: collision with root package name */
    public int f28213J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f28215K0;

    /* renamed from: L, reason: collision with root package name */
    public C3672o f28216L;

    /* renamed from: L0, reason: collision with root package name */
    public int f28217L0;

    /* renamed from: M, reason: collision with root package name */
    public final Context f28218M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f28219M0;

    /* renamed from: N, reason: collision with root package name */
    public final C3216fa f28220N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f28221N0;

    /* renamed from: O, reason: collision with root package name */
    public final C3107dP f28222O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f28223O0;

    /* renamed from: P, reason: collision with root package name */
    public final C4019uN f28224P;

    /* renamed from: P0, reason: collision with root package name */
    public long f28225P0;

    /* renamed from: Q, reason: collision with root package name */
    public final C4019uN f28226Q;

    /* renamed from: Q0, reason: collision with root package name */
    public long f28227Q0;

    /* renamed from: R, reason: collision with root package name */
    public final C4019uN f28228R;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f28229R0;

    /* renamed from: S, reason: collision with root package name */
    public final JP f28230S;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f28231S0;

    /* renamed from: T, reason: collision with root package name */
    public final MediaCodec.BufferInfo f28232T;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f28233T0;

    /* renamed from: U, reason: collision with root package name */
    public final ArrayDeque f28234U;

    /* renamed from: U0, reason: collision with root package name */
    public C4181xN f28235U0;

    /* renamed from: V, reason: collision with root package name */
    public final C3944t2 f28236V;

    /* renamed from: V0, reason: collision with root package name */
    public RP f28237V0;

    /* renamed from: W, reason: collision with root package name */
    public final AtomicInteger f28238W;

    /* renamed from: W0, reason: collision with root package name */
    public long f28239W0;

    /* renamed from: X, reason: collision with root package name */
    public DP f28240X;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f28241X0;
    public DP Y;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f28242Y0;

    /* renamed from: Z, reason: collision with root package name */
    public C3128du f28243Z;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f28244Z0;

    /* renamed from: a1, reason: collision with root package name */
    public long f28245a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C4127wN f28246b1;

    /* renamed from: c1, reason: collision with root package name */
    public C4127wN f28247c1;

    /* renamed from: d1, reason: collision with root package name */
    public final C3846rC f28248d1;

    /* renamed from: i0, reason: collision with root package name */
    public C3128du f28249i0;

    /* renamed from: j0, reason: collision with root package name */
    public QN f28250j0;

    /* renamed from: k0, reason: collision with root package name */
    public final long f28251k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f28252l0;
    public float m0;

    /* renamed from: n0, reason: collision with root package name */
    public MP f28254n0;

    /* renamed from: o0, reason: collision with root package name */
    public DP f28255o0;

    /* renamed from: p0, reason: collision with root package name */
    public MediaFormat f28256p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f28257q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f28258r0;

    /* renamed from: s0, reason: collision with root package name */
    public ArrayDeque f28259s0;

    /* renamed from: t0, reason: collision with root package name */
    public QP f28260t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f28261u;

    /* renamed from: u0, reason: collision with root package name */
    public PP f28262u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f28264v0;

    /* renamed from: w, reason: collision with root package name */
    public C3912sO f28265w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f28266w0;

    /* renamed from: x, reason: collision with root package name */
    public int f28267x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f28268x0;

    /* renamed from: y, reason: collision with root package name */
    public IO f28269y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f28270y0;

    /* renamed from: z, reason: collision with root package name */
    public V2 f28271z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f28272z0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f28253n = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final S0.l f28263v = new S0.l(25, false);

    /* renamed from: F, reason: collision with root package name */
    public long f28205F = Long.MIN_VALUE;

    /* renamed from: I, reason: collision with root package name */
    public AbstractC3627n8 f28211I = AbstractC3627n8.f33468a;

    /* renamed from: K, reason: collision with root package name */
    public long f28214K = com.anythink.basead.exoplayer.b.f7168b;

    public SP(Context context, int i, C3216fa c3216fa, C3107dP c3107dP) {
        this.f28261u = i;
        this.f28218M = context.getApplicationContext();
        this.f28220N = c3216fa;
        c3107dP.getClass();
        this.f28222O = c3107dP;
        this.f28238W = new AtomicInteger();
        this.f28224P = new C4019uN(0);
        this.f28226Q = new C4019uN(0);
        this.f28228R = new C4019uN(2);
        JP jp = new JP(2);
        jp.f26437k = 32;
        this.f28230S = jp;
        this.f28232T = new MediaCodec.BufferInfo();
        this.f28252l0 = 1.0f;
        this.m0 = 1.0f;
        this.f28251k0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28234U = new ArrayDeque();
        this.f28237V0 = RP.f27961g;
        jp.j(0);
        jp.f35302e.order(ByteOrder.nativeOrder());
        C3944t2 c3944t2 = new C3944t2();
        c3944t2.f34979v = InterfaceC3170ei.f30756a;
        c3944t2.f34978u = 0;
        c3944t2.f34977n = 2;
        this.f28236V = c3944t2;
        this.f28258r0 = -1.0f;
        this.f28264v0 = 0;
        this.f28213J0 = 0;
        this.C0 = -1;
        this.f28202D0 = -1;
        this.f28199B0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28225P0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28227Q0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28239W0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28197A0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28215K0 = 0;
        this.f28217L0 = 0;
        this.f28235U0 = new C4181xN();
        this.f28244Z0 = false;
        this.f28245a1 = 0L;
        int i4 = XB.f29283v;
        this.f28248d1 = C3846rC.f34305C;
        C4127wN c4127wN = C4127wN.f35599b;
        this.f28246b1 = c4127wN;
        this.f28247c1 = c4127wN;
    }

    public static boolean K(int i, boolean z6) {
        int i4 = i & 7;
        if (i4 != 4) {
            return z6 && i4 == 3;
        }
        return true;
    }

    public void A() {
        this.C0 = -1;
        this.f28226Q.f35302e = null;
        this.f28202D0 = -1;
        this.f28204E0 = null;
        this.f28225P0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28227Q0 = com.anythink.basead.exoplayer.b.f7168b;
        n0().f27967f = com.anythink.basead.exoplayer.b.f7168b;
        this.f28239W0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28199B0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28221N0 = false;
        this.f28197A0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28219M0 = false;
        this.f28268x0 = false;
        this.f28270y0 = false;
        this.f28215K0 = 0;
        this.f28217L0 = 0;
        this.f28213J0 = this.f28212I0 ? 1 : 0;
        this.f28244Z0 = false;
        this.f28245a1 = 0L;
    }

    public final void B() {
        A();
        this.f28259s0 = null;
        this.f28262u0 = null;
        this.f28255o0 = null;
        this.f28256p0 = null;
        this.f28257q0 = false;
        this.f28223O0 = false;
        this.f28258r0 = -1.0f;
        this.f28264v0 = 0;
        this.f28266w0 = false;
        this.f28272z0 = false;
        this.f28212I0 = false;
        this.f28213J0 = 0;
    }

    public OP C(IllegalStateException illegalStateException, PP pp) {
        return new OP(illegalStateException, pp);
    }

    public void E(C4019uN c4019uN) {
    }

    public int F(C4019uN c4019uN) {
        return 0;
    }

    public boolean G(C4019uN c4019uN) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x052c, code lost:
    
        if (r0 == null) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0534, code lost:
    
        if (r6 >= r0.f25179r.size()) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0536, code lost:
    
        r0 = (byte[]) r34.f28255o0.f25179r.get(r6);
        r5 = r11.f35302e;
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
    
        r34.f28213J0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x054d, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x054e, code lost:
    
        r0 = r11.f35302e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0550, code lost:
    
        if (r0 == null) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0552, code lost:
    
        r0 = r0.position();
        r15 = r31;
        r15.f2926u = r3;
        r15.f2927v = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x055c, code lost:
    
        r4.u(new com.google.android.gms.internal.ads.RunnableC3214fP(r13, (java.lang.Object) r34, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0564, code lost:
    
        r5 = r34.f28238W.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x056b, code lost:
    
        if (r5 != (-3)) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0582, code lost:
    
        if (r5 != (-5)) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0586, code lost:
    
        if (r34.f28213J0 != 2) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0588, code lost:
    
        r11.i();
        r34.f28213J0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x058d, code lost:
    
        Y(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x059a, code lost:
    
        if (r11.h(r10) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x05d3, code lost:
    
        if (r34.f28219M0 != false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x05d9, code lost:
    
        if (r11.f() != false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x05db, code lost:
    
        r11.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x05e0, code lost:
    
        if (r34.f28213J0 != 2) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x05e2, code lost:
    
        r34.f28213J0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x05e5, code lost:
    
        r7 = r11.f35303f;
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
    
        r11.f35301d.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x05fa, code lost:
    
        if (r34.f28233T0 == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x05fc, code lost:
    
        r0 = n0();
        r9 = r0.f27965d;
        r6 = r34.f28240X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0604, code lost:
    
        if (r6 == null) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0606, code lost:
    
        r9.c(r7, r6);
        r0.b();
        r34.f28233T0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x060f, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0610, code lost:
    
        r34.f28225P0 = java.lang.Math.max(r34.f28225P0, r7);
        r12 = m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x061e, code lost:
    
        if (r12 == com.anythink.basead.exoplayer.b.f7168b) goto L390;
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
        r0.c(r34.f28225P0);
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
    
        if (r34.f28244Z0 == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x066a, code lost:
    
        r35 = r4;
        r3 = r34.f28225P0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0670, code lost:
    
        if (r7 > r3) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0672, code lost:
    
        r34.f28245a1 = ((r3 - r7) + 1) + r34.f28245a1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0680, code lost:
    
        r34.f28225P0 = r7;
        r34.f28227Q0 = r7;
        r34.f28244Z0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0689, code lost:
    
        E(r11);
        r9 = F(r11);
        r7 = r7 + r34.f28245a1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0693, code lost:
    
        if (r5 == false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0695, code lost:
    
        r35.i(r34.C0, r11.f35301d, r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x06a0, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x06b9, code lost:
    
        r34.C0 = -1;
        r11.f35302e = null;
        r34.f28219M0 = true;
        r34.f28213J0 = 0;
        r34.f28235U0.f35776c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x06a2, code lost:
    
        r4 = r35;
        r5 = r34.C0;
        r0 = r11.f35302e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x06af, code lost:
    
        if (r0 == null) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x06b1, code lost:
    
        r4.A(r5, r0.limit(), r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x06cd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0687, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0633, code lost:
    
        r34.f28227Q0 = java.lang.Math.max(r34.f28227Q0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x059c, code lost:
    
        r0 = n0();
        n0();
        r0.c(r34.f28225P0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05aa, code lost:
    
        if (r34.f28213J0 != 2) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05ac, code lost:
    
        r11.i();
        r34.f28213J0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05b1, code lost:
    
        r34.f28229R0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05b5, code lost:
    
        if (r34.f28219M0 != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x05b7, code lost:
    
        l0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05be, code lost:
    
        if (r34.f28272z0 != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05c0, code lost:
    
        r34.f28221N0 = true;
        r4.A(r34.C0, 0, 4, 0);
        r34.C0 = r2;
        r11.f35302e = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0571, code lost:
    
        if (r0() == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0573, code lost:
    
        r0 = n0();
        n0();
        r0.c(r34.f28225P0);
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
    
        if (r34.f28272z0 != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04df, code lost:
    
        r34.f28221N0 = true;
        r4.A(r34.C0, 0, 4, 0);
        r34.C0 = r2;
        r11.f35302e = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04f2, code lost:
    
        r34.f28215K0 = 2;
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
    
        r34.f28208G0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0098, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0099, code lost:
    
        r34.f28231S0 = true;
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
    
        r4 = r34.f28254n0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04ae, code lost:
    
        if (r4 == null) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04b0, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x04b3, code lost:
    
        if (r34.f28215K0 == 2) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04b7, code lost:
    
        if (r34.f28229R0 == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x04be, code lost:
    
        if (r34.C0 >= 0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04c0, code lost:
    
        r0 = r4.d();
        r34.C0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x04c6, code lost:
    
        if (r0 < 0) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x04c8, code lost:
    
        r11 = r30;
        r11.f35302e = r4.D(r0);
        r11.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x04d8, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x04d9, code lost:
    
        if (r34.f28215K0 != 1) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x04f7, code lost:
    
        if (r34.f28268x0 == false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04f9, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x04fa, code lost:
    
        r34.f28268x0 = false;
        r0 = r11.f35302e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x04fe, code lost:
    
        if (r0 == null) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0500, code lost:
    
        r0.put(com.google.android.gms.internal.ads.SP.f28195e1);
        r4.A(r34.C0, 38, 0, 0);
        r34.C0 = r2;
        r11.f35302e = r3;
        r34.f28219M0 = true;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0523, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0524, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0527, code lost:
    
        if (r34.f28213J0 != 1) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0529, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x052a, code lost:
    
        r0 = r34.f28255o0;
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
    /* JADX WARN: Type inference failed for: r34v0, types: [com.google.android.gms.internal.ads.SP, java.lang.Object] */
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
        boolean z6;
        boolean z9;
        ?? r14;
        boolean z10;
        boolean z11;
        OP C8;
        int i;
        boolean z12;
        AbstractC3399ix abstractC3399ix;
        S0.l lVar;
        ?? r52;
        boolean z13;
        S0.l lVar2;
        char c9;
        AbstractC3399ix abstractC3399ix2;
        int i4;
        DP dp;
        boolean z14;
        long r9;
        Throwable th;
        boolean z15;
        boolean z16;
        long j10;
        C4019uN c4019uN;
        S0.l lVar3;
        int i6;
        Throwable th2;
        C4019uN c4019uN2;
        boolean z17;
        S0.l lVar4;
        boolean z18;
        boolean z19;
        Throwable th3;
        int valueTypeForKey;
        long j11 = this.f28251k0;
        int i9 = 2;
        boolean z20 = true;
        try {
            try {
                if (this.f28231S0) {
                    d0();
                    return;
                }
                if (this.f28240X == null && !u(2)) {
                    return;
                }
                v();
                boolean z21 = this.f28206F0;
                ?? r72 = this.f28226Q;
                char c10 = 0;
                char c11 = 0;
                S0.l lVar5 = this.f28263v;
                int i10 = 4;
                z9 = false;
                Throwable th4 = null;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (z21) {
                                        try {
                                            try {
                                                Trace.beginSection("bypassRender");
                                                AbstractC3399ix abstractC3399ix3 = r72;
                                                while (true) {
                                                    AbstractC2792Sd.H(this.f28231S0 ^ z20);
                                                    JP jp = this.f28230S;
                                                    if (jp.o()) {
                                                        AbstractC3399ix abstractC3399ix4 = abstractC3399ix3;
                                                        ByteBuffer byteBuffer = jp.f35302e;
                                                        int i11 = this.f28202D0;
                                                        S0.l lVar6 = lVar5;
                                                        int n9 = jp.n();
                                                        long j12 = jp.f35303f;
                                                        boolean o02 = o0(this.f28203E, jp.i);
                                                        boolean h3 = jp.h(i10);
                                                        DP dp2 = this.Y;
                                                        if (dp2 == null) {
                                                            throw th4;
                                                        }
                                                        abstractC3399ix = abstractC3399ix4;
                                                        lVar = lVar6;
                                                        if (!b0(j6, j9, null, byteBuffer, i11, 0, n9, j12, o02, h3, dp2)) {
                                                            z12 = true;
                                                            break;
                                                        } else {
                                                            h0(jp.i);
                                                            jp.i();
                                                            r52 = 0;
                                                        }
                                                    } else {
                                                        abstractC3399ix = abstractC3399ix3;
                                                        lVar = lVar5;
                                                        r52 = th4;
                                                    }
                                                    try {
                                                        if (this.f28229R0) {
                                                            break;
                                                        }
                                                        z12 = true;
                                                        try {
                                                            boolean z22 = this.f28208G0;
                                                            C4019uN c4019uN3 = this.f28228R;
                                                            if (z22) {
                                                                AbstractC2792Sd.H(jp.p(c4019uN3));
                                                                z13 = false;
                                                                this.f28208G0 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            if (this.f28210H0) {
                                                                if (!jp.o()) {
                                                                    this.f28206F0 = z13;
                                                                    g0();
                                                                    this.f28210H0 = z13;
                                                                    v();
                                                                    if (!this.f28206F0) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    abstractC3399ix2 = abstractC3399ix;
                                                                    lVar2 = lVar;
                                                                    c9 = 65531;
                                                                    i4 = 4;
                                                                    th4 = r52;
                                                                    z20 = true;
                                                                    abstractC3399ix3 = abstractC3399ix2;
                                                                    c11 = 0;
                                                                    i10 = i4;
                                                                    lVar5 = lVar2;
                                                                    c10 = 0;
                                                                }
                                                            }
                                                            AbstractC2792Sd.H(!this.f28229R0);
                                                            lVar2 = lVar;
                                                            lVar2.f2926u = r52;
                                                            lVar2.f2927v = r52;
                                                            c4019uN3.i();
                                                            while (true) {
                                                                c4019uN3.i();
                                                                int o4 = o(lVar2, c4019uN3, z13 ? 1 : 0);
                                                                c9 = 65531;
                                                                if (o4 == -5) {
                                                                    abstractC3399ix2 = abstractC3399ix;
                                                                    i4 = 4;
                                                                    Y(lVar2);
                                                                    break;
                                                                }
                                                                if (o4 != -4) {
                                                                    if (r0()) {
                                                                        n0().c(this.f28225P0);
                                                                    }
                                                                    abstractC3399ix2 = abstractC3399ix;
                                                                    i4 = 4;
                                                                } else {
                                                                    i4 = 4;
                                                                    if (c4019uN3.h(4)) {
                                                                        this.f28229R0 = true;
                                                                        n0().c(this.f28225P0);
                                                                        abstractC3399ix2 = abstractC3399ix;
                                                                        break;
                                                                    }
                                                                    this.f28225P0 = Math.max(this.f28225P0, c4019uN3.f35303f);
                                                                    if (r0()) {
                                                                        abstractC3399ix2 = abstractC3399ix;
                                                                    } else {
                                                                        abstractC3399ix2 = abstractC3399ix;
                                                                        if (abstractC3399ix2.h(536870912)) {
                                                                        }
                                                                        if (this.f28233T0) {
                                                                            DP dp3 = this.f28240X;
                                                                            if (dp3 == null) {
                                                                                throw r52;
                                                                            }
                                                                            this.Y = dp3;
                                                                            if (Objects.equals(dp3.f25176o, com.anythink.basead.exoplayer.k.o.f9213H) && !this.Y.f25179r.isEmpty()) {
                                                                                byte[] bArr = (byte[]) this.Y.f25179r.get(z13 ? 1 : 0);
                                                                                int i12 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                                                                C3322hP a9 = this.Y.a();
                                                                                a9.a(i12);
                                                                                this.Y = a9.b();
                                                                            }
                                                                            Z(this.Y, r52);
                                                                            this.f28233T0 = z13;
                                                                        }
                                                                        c4019uN3.l();
                                                                        dp = this.Y;
                                                                        if (dp != null && Objects.equals(dp.f25176o, com.anythink.basead.exoplayer.k.o.f9213H)) {
                                                                            if (c4019uN3.h(268435456)) {
                                                                                c4019uN3.f35300c = this.Y;
                                                                                f0(c4019uN3);
                                                                            }
                                                                            if (this.f28203E - c4019uN3.f35303f > 80000 ? true : z13 ? 1 : 0) {
                                                                                this.f28236V.b(c4019uN3, this.Y.f25179r);
                                                                            }
                                                                        }
                                                                        if (!jp.o()) {
                                                                            long j13 = this.f28203E;
                                                                            if (o0(j13, jp.i) != o0(j13, c4019uN3.f35303f)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (jp.p(c4019uN3)) {
                                                                            break;
                                                                        } else {
                                                                            abstractC3399ix = abstractC3399ix2;
                                                                        }
                                                                    }
                                                                    n0().c(this.f28225P0);
                                                                    if (this.f28233T0) {
                                                                    }
                                                                    c4019uN3.l();
                                                                    dp = this.Y;
                                                                    if (dp != null) {
                                                                        if (c4019uN3.h(268435456)) {
                                                                        }
                                                                        if (this.f28203E - c4019uN3.f35303f > 80000 ? true : z13 ? 1 : 0) {
                                                                        }
                                                                    }
                                                                    if (!jp.o()) {
                                                                    }
                                                                    if (jp.p(c4019uN3)) {
                                                                    }
                                                                }
                                                            }
                                                            if (jp.o()) {
                                                                jp.l();
                                                            }
                                                            if (!jp.o() && !this.f28229R0 && !this.f28210H0) {
                                                                break;
                                                            }
                                                            th4 = r52;
                                                            z20 = true;
                                                            abstractC3399ix3 = abstractC3399ix2;
                                                            c11 = 0;
                                                            i10 = i4;
                                                            lVar5 = lVar2;
                                                            c10 = 0;
                                                        } catch (IllegalStateException e9) {
                                                            e = e9;
                                                            r72 = 0;
                                                            z9 = z12;
                                                            r14 = r72;
                                                            z10 = e instanceof MediaCodec.CodecException;
                                                            if (!z10) {
                                                            }
                                                            X(e);
                                                            if (z10) {
                                                            }
                                                            z11 = r14;
                                                            if (z11) {
                                                            }
                                                            C8 = C(e, this.f28262u0);
                                                            if (C8.f27386n != 1101) {
                                                            }
                                                            throw n(C8, this.f28240X, z11, i);
                                                        }
                                                    } catch (IllegalStateException e10) {
                                                        e = e10;
                                                        z12 = true;
                                                    }
                                                }
                                                Trace.endSection();
                                            } catch (IllegalStateException e11) {
                                                e = e11;
                                                z12 = z20;
                                            }
                                        } catch (MediaCodec.CryptoException e12) {
                                            e = e12;
                                            r72 = 0;
                                            z6 = r72;
                                            throw n(e, this.f28240X, z6, AbstractC3182eu.g(e.getErrorCode()));
                                        }
                                    } else {
                                        boolean z23 = true;
                                        S0.l lVar7 = lVar5;
                                        int i13 = 4;
                                        Throwable th5 = null;
                                        C4019uN c4019uN4 = r72;
                                        boolean z24 = false;
                                        try {
                                            if (this.f28254n0 != null) {
                                                try {
                                                    V2 v22 = this.f28271z;
                                                    v22.getClass();
                                                    r9 = v22.r();
                                                    Trace.beginSection("drainAndFeed");
                                                    while (true) {
                                                        MP mp = this.f28254n0;
                                                        if (mp == null) {
                                                            throw th5;
                                                        }
                                                        boolean z25 = this.f28202D0 >= 0 ? z23 : z24;
                                                        MediaCodec.BufferInfo bufferInfo = this.f28232T;
                                                        try {
                                                            if (!z25) {
                                                                int v9 = mp.v(bufferInfo);
                                                                if (v9 >= 0) {
                                                                    th = th5;
                                                                    int i14 = i13;
                                                                    bufferInfo.presentationTimeUs -= this.f28245a1;
                                                                    if (!this.f28270y0) {
                                                                        if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                            l0();
                                                                            j10 = j11;
                                                                            lVar3 = lVar7;
                                                                            c4019uN = c4019uN4;
                                                                            i13 = i14;
                                                                            th2 = th;
                                                                            break;
                                                                        }
                                                                        this.f28202D0 = v9;
                                                                        ByteBuffer b9 = mp.b(v9);
                                                                        this.f28204E0 = b9;
                                                                        if (b9 != null) {
                                                                            b9.position(bufferInfo.offset);
                                                                            this.f28204E0.limit(bufferInfo.offset + bufferInfo.size);
                                                                        }
                                                                        DP dp4 = (DP) this.f28237V0.f27965d.f(bufferInfo.presentationTimeUs);
                                                                        if (dp4 == null && this.f28241X0 && this.f28256p0 != null) {
                                                                            dp4 = (DP) this.f28237V0.f27965d.e();
                                                                        }
                                                                        if (dp4 != null) {
                                                                            this.Y = dp4;
                                                                        } else if (this.f28257q0) {
                                                                        }
                                                                        DP dp5 = this.Y;
                                                                        if (dp5 == null) {
                                                                            throw th;
                                                                        }
                                                                        Z(dp5, this.f28256p0);
                                                                        this.f28257q0 = z24;
                                                                        this.f28241X0 = z24;
                                                                    } else {
                                                                        this.f28270y0 = z24;
                                                                        mp.t(v9);
                                                                        j10 = j11;
                                                                        lVar3 = lVar7;
                                                                        c4019uN = c4019uN4;
                                                                        i13 = i14;
                                                                        th3 = th;
                                                                        i6 = -1;
                                                                        th2 = th3;
                                                                        if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                                                                        }
                                                                        z19 = true;
                                                                        if (z19) {
                                                                        }
                                                                    }
                                                                } else if (v9 == -2) {
                                                                    this.f28223O0 = z23;
                                                                    MP mp2 = this.f28254n0;
                                                                    if (mp2 == null) {
                                                                        throw th5;
                                                                    }
                                                                    MediaFormat h9 = mp2.h();
                                                                    if (this.f28264v0 != 0 && h9.getInteger("width") == 32 && h9.getInteger("height") == 32) {
                                                                        this.f28270y0 = z23;
                                                                    } else {
                                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                                            C3846rC c3846rC = this.f28248d1;
                                                                            if (!c3846rC.isEmpty()) {
                                                                                C4127wN c4127wN = C4127wN.f35599b;
                                                                                HashMap hashMap = new HashMap();
                                                                                Iterator it = c3846rC.iterator();
                                                                                while (true) {
                                                                                    AbstractC3522lB abstractC3522lB = (AbstractC3522lB) it;
                                                                                    if (!abstractC3522lB.hasNext()) {
                                                                                        break;
                                                                                    }
                                                                                    String str = (String) abstractC3522lB.next();
                                                                                    if (h9.containsKey(str)) {
                                                                                        valueTypeForKey = h9.getValueTypeForKey(str);
                                                                                        if (valueTypeForKey == z23) {
                                                                                            hashMap.put(str, Integer.valueOf(h9.getInteger(str)));
                                                                                        } else if (valueTypeForKey == i9) {
                                                                                            hashMap.put(str, Long.valueOf(h9.getLong(str)));
                                                                                        } else if (valueTypeForKey == 3) {
                                                                                            hashMap.put(str, Float.valueOf(h9.getFloat(str)));
                                                                                        } else if (valueTypeForKey == i13) {
                                                                                            hashMap.put(str, h9.getString(str));
                                                                                        } else if (valueTypeForKey == 5) {
                                                                                            ByteBuffer byteBuffer2 = h9.getByteBuffer(str);
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
                                                                                C4127wN c4127wN2 = new C4127wN(hashMap);
                                                                                if (!c4127wN2.equals(this.f28247c1)) {
                                                                                    this.f28247c1 = c4127wN2;
                                                                                    c0(c4127wN2);
                                                                                }
                                                                            }
                                                                        }
                                                                        this.f28256p0 = h9;
                                                                        this.f28257q0 = z23;
                                                                    }
                                                                    j10 = j11;
                                                                    th3 = th5;
                                                                    lVar3 = lVar7;
                                                                    c4019uN = c4019uN4;
                                                                    i6 = -1;
                                                                    th2 = th3;
                                                                    if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                                                                        this.f28271z.getClass();
                                                                        if (SystemClock.elapsedRealtime() - r9 >= j10) {
                                                                            z19 = false;
                                                                            if (z19) {
                                                                                break;
                                                                            }
                                                                            th5 = th2;
                                                                            j11 = j10;
                                                                            c4019uN4 = c4019uN;
                                                                            lVar7 = lVar3;
                                                                            i9 = 2;
                                                                            z23 = true;
                                                                            z24 = false;
                                                                        }
                                                                    }
                                                                    z19 = true;
                                                                    if (z19) {
                                                                    }
                                                                } else {
                                                                    if (this.f28272z0 && (this.f28229R0 || this.f28215K0 == i9)) {
                                                                        l0();
                                                                    }
                                                                    long j14 = this.f28197A0;
                                                                    if (j14 != com.anythink.basead.exoplayer.b.f7168b) {
                                                                        long j15 = j14 + 100;
                                                                        this.f28271z.getClass();
                                                                        if (j15 < System.currentTimeMillis()) {
                                                                            l0();
                                                                        }
                                                                    }
                                                                    j10 = j11;
                                                                    th2 = th5;
                                                                    lVar3 = lVar7;
                                                                    c4019uN = c4019uN4;
                                                                }
                                                            } else {
                                                                th = th5;
                                                            }
                                                            ByteBuffer byteBuffer3 = this.f28204E0;
                                                            S0.l lVar8 = lVar7;
                                                            int i15 = this.f28202D0;
                                                            int i16 = bufferInfo.flags;
                                                            C4019uN c4019uN5 = c4019uN4;
                                                            long j16 = bufferInfo.presentationTimeUs;
                                                            DP dp6 = this.Y;
                                                            if (dp6 == null) {
                                                                throw th;
                                                            }
                                                            boolean z26 = z16;
                                                            j10 = j11;
                                                            c4019uN = c4019uN5;
                                                            lVar3 = lVar8;
                                                            if (!b0(j6, j9, mp, byteBuffer3, i15, i16, 1, j16, z15, z26, dp6)) {
                                                                i6 = -1;
                                                                th2 = 0;
                                                                i13 = 4;
                                                                break;
                                                            }
                                                            h0(bufferInfo.presentationTimeUs);
                                                            i13 = 4;
                                                            boolean z27 = (bufferInfo.flags & 4) != 0;
                                                            if (!z27 && this.f28221N0 && z26) {
                                                                this.f28271z.getClass();
                                                                this.f28197A0 = System.currentTimeMillis();
                                                            }
                                                            i6 = -1;
                                                            this.f28202D0 = -1;
                                                            th2 = 0;
                                                            th2 = 0;
                                                            this.f28204E0 = null;
                                                            if (z27) {
                                                                l0();
                                                                break;
                                                            }
                                                            if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                                                            }
                                                            z19 = true;
                                                            if (z19) {
                                                            }
                                                        } catch (IllegalStateException e13) {
                                                            e = e13;
                                                            z14 = false;
                                                            z9 = true;
                                                            r14 = z14;
                                                            z10 = e instanceof MediaCodec.CodecException;
                                                            if (!z10) {
                                                            }
                                                            X(e);
                                                            if (z10) {
                                                            }
                                                            z11 = r14;
                                                            if (z11) {
                                                            }
                                                            C8 = C(e, this.f28262u0);
                                                            if (C8.f27386n != 1101) {
                                                            }
                                                            throw n(C8, this.f28240X, z11, i);
                                                        }
                                                        z15 = (this.f28244Z0 || bufferInfo.presentationTimeUs < this.f28203E) ? z23 : z24;
                                                        long j17 = this.f28237V0.f27967f;
                                                        z16 = j17 != com.anythink.basead.exoplayer.b.f7168b && j17 <= bufferInfo.presentationTimeUs;
                                                    }
                                                } catch (IllegalStateException e14) {
                                                    e = e14;
                                                    z14 = z24;
                                                }
                                            } else {
                                                C4181xN c4181xN = this.f28235U0;
                                                int i17 = c4181xN.f35777d;
                                                LQ lq = this.f28198B;
                                                lq.getClass();
                                                c4181xN.f35777d = i17 + lq.a(j6 - this.f28201D);
                                                u(1);
                                            }
                                        } catch (IllegalStateException e15) {
                                            e = e15;
                                        }
                                    }
                                    this.f28235U0.a();
                                    return;
                                } catch (IllegalStateException e16) {
                                    e = e16;
                                }
                            } catch (IllegalStateException e17) {
                                e = e17;
                            }
                        } catch (MediaCodec.CryptoException e18) {
                            e = e18;
                            throw n(e, this.f28240X, z6, AbstractC3182eu.g(e.getErrorCode()));
                        }
                    } catch (IllegalStateException e19) {
                        e = e19;
                        z9 = true;
                    }
                } catch (MediaCodec.CryptoException e20) {
                    e = e20;
                }
                if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                    this.f28271z.getClass();
                    if (SystemClock.elapsedRealtime() - r9 >= j10) {
                        z18 = z17;
                        if (z18) {
                            Trace.endSection();
                            this.f28235U0.a();
                            return;
                        } else {
                            c4019uN = c4019uN2;
                            lVar3 = lVar4;
                            th2 = 0;
                        }
                    }
                }
                z18 = true;
                if (z18) {
                }
            } catch (IllegalStateException e21) {
                e = e21;
                z9 = true;
            }
        } catch (MediaCodec.CryptoException e22) {
            e = e22;
            z6 = false;
        }
    }

    public abstract boolean I();

    public abstract boolean J();

    public final int L(DP dp) {
        try {
            return M(this.f28222O, dp);
        } catch (UP e9) {
            throw n(e9, dp, false, 4002);
        }
    }

    public abstract int M(C3107dP c3107dP, DP dp);

    public final void N(long j6, boolean z6, boolean z9) {
        this.f28207G = false;
        this.f28203E = j6;
        this.f28205F = j6;
        if (!z9) {
            LQ lq = this.f28198B;
            lq.getClass();
            z9 = lq.a(j6 - this.f28201D) != 0;
        }
        c(j6, z6, z9);
    }

    public abstract ArrayList O(C3107dP c3107dP, DP dp);

    public final void P() {
        C3860rQ c3860rQ;
        int e9;
        if (this.f28211I.g() || (c3860rQ = this.J) == null || (e9 = this.f28211I.e(c3860rQ.f34406a)) == -1) {
            this.f28214K = com.anythink.basead.exoplayer.b.f7168b;
            return;
        }
        K7 d9 = this.f28211I.d(e9, new K7(), false);
        this.f28214K = d9.f26620d;
        int i = c3860rQ.f34407b;
        if (i != -1) {
            this.f28214K = d9.f26622f.a(i).f29757e[c3860rQ.f34408c];
            return;
        }
        int i4 = c3860rQ.f34410e;
        if (i4 != -1) {
            d9.f26622f.a(i4).getClass();
            this.f28214K = 0L;
        }
    }

    public boolean Q(DP dp) {
        return false;
    }

    public abstract C3887s R(PP pp, DP dp, float f2);

    public abstract C4235yN S(PP pp, DP dp, DP dp2, boolean z6);

    public long T(long j6) {
        if (this.f28196A == 1) {
            return (I() || J()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract float U(float f2, DP dp, DP[] dpArr);

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
    public C4235yN Y(S0.l lVar) {
        int i;
        Pair c9;
        String str;
        boolean z6 = true;
        this.f28233T0 = true;
        DP dp = (DP) lVar.f2927v;
        dp.getClass();
        String str2 = dp.f25176o;
        if (str2 == null) {
            throw n(new IllegalArgumentException("Sample MIME type is null."), dp, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals(com.anythink.basead.exoplayer.k.o.f9239k)) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = AbstractC4305zm.f36216a;
                if (str2.equals("video/dolby-vision") && (c9 = AbstractC4305zm.c(dp)) != null) {
                    int intValue = ((Integer) c9.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = com.anythink.basead.exoplayer.k.o.i;
                    } else if (intValue == 512) {
                        str = com.anythink.basead.exoplayer.k.o.f9237h;
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = null;
            }
            DP dp2 = dp;
            this.f28249i0 = (C3128du) lVar.f2926u;
            this.f28240X = dp2;
            if (!this.f28206F0) {
                this.f28210H0 = true;
                return null;
            }
            MP mp = this.f28254n0;
            if (mp == null) {
                this.f28259s0 = null;
                v();
                return null;
            }
            PP pp = this.f28262u0;
            pp.getClass();
            DP dp3 = this.f28255o0;
            dp3.getClass();
            C3128du c3128du = this.f28243Z;
            C3128du c3128du2 = this.f28249i0;
            if (c3128du != c3128du2) {
                if (this.f28219M0) {
                    this.f28215K0 = 1;
                    this.f28217L0 = 3;
                } else {
                    x();
                    v();
                }
                return new C4235yN(pp.f27597a, dp3, dp2, 0, 128);
            }
            C4235yN S8 = S(pp, dp3, dp2, n0().f27966e);
            int i4 = S8.f35941d;
            if (i4 != 0) {
                if (i4 == 1) {
                    j0(dp2);
                    this.f28255o0 = dp2;
                    if (c3128du2 == c3128du) {
                        if (this.f28219M0) {
                            this.f28215K0 = 1;
                            if (y()) {
                                this.f28217L0 = 3;
                                i = 2;
                            } else {
                                this.f28217L0 = 1;
                            }
                        }
                    }
                } else if (i4 != 2) {
                    j0(dp2);
                    this.f28255o0 = dp2;
                    if (c3128du2 != c3128du) {
                    }
                } else {
                    j0(dp2);
                    this.f28212I0 = true;
                    this.f28213J0 = 1;
                    int i6 = this.f28264v0;
                    if (i6 != 2 && (i6 != 1 || dp2.f25183v != dp3.f25183v || dp2.f25184w != dp3.f25184w)) {
                        z6 = false;
                    }
                    this.f28268x0 = z6;
                    this.f28255o0 = dp2;
                    if (c3128du2 != c3128du) {
                    }
                }
                return (i4 != 0 || (this.f28254n0 == mp && this.f28217L0 != 3)) ? S8 : new C4235yN(pp.f27597a, dp3, dp2, 0, i);
            }
            if (this.f28219M0) {
                this.f28215K0 = 1;
                this.f28217L0 = 3;
            } else {
                x();
                v();
            }
            i = 0;
            if (i4 != 0) {
            }
        }
        if (!dp.f25179r.isEmpty()) {
            C3322hP c3322hP = new C3322hP(dp);
            c3322hP.f31561q = null;
            dp = new DP(c3322hP);
        }
        DP dp22 = dp;
        this.f28249i0 = (C3128du) lVar.f2926u;
        this.f28240X = dp22;
        if (!this.f28206F0) {
        }
    }

    public abstract void Z(DP dp, MediaFormat mediaFormat);

    public abstract void a0();

    public abstract boolean b0(long j6, long j9, MP mp, ByteBuffer byteBuffer, int i, int i4, int i6, long j10, boolean z6, boolean z9, DP dp);

    public void c(long j6, boolean z6, boolean z9) {
        ArrayDeque arrayDeque = this.f28234U;
        if (!arrayDeque.isEmpty()) {
            this.f28237V0 = (RP) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z9) {
            this.f28229R0 = false;
            this.f28231S0 = false;
            if (this.f28206F0) {
                g0();
            } else if (this.f28254n0 != null) {
                if (y()) {
                    x();
                    v();
                } else if (z()) {
                    t();
                } else {
                    this.f28244Z0 = true;
                }
            }
            if (this.f28237V0.f27965d.d() > 0) {
                this.f28233T0 = true;
            }
            J3.q qVar = this.f28237V0.f27965d;
            synchronized (qVar) {
                qVar.f1502a = 0;
                qVar.f1503b = 0;
                Arrays.fill((Object[]) qVar.f1505d, (Object) null);
            }
            this.f28237V0.f27966e = false;
        }
    }

    public abstract void c0(C4127wN c4127wN);

    public abstract void d();

    public abstract void d0();

    public abstract void e();

    public void e0(long j6) {
    }

    public void f() {
        this.f28240X = null;
        m0(RP.f27961g);
        this.f28234U.clear();
        if (this.f28206F0) {
            this.f28206F0 = false;
            g0();
        } else {
            if (this.f28254n0 == null) {
                return;
            }
            if (y()) {
                x();
            } else if (z()) {
                t();
            } else {
                this.f28244Z0 = true;
            }
        }
    }

    public abstract void f0(C4019uN c4019uN);

    public final void g0() {
        this.f28225P0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28227Q0 = com.anythink.basead.exoplayer.b.f7168b;
        n0().f27967f = com.anythink.basead.exoplayer.b.f7168b;
        this.f28239W0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28210H0 = false;
        this.f28230S.i();
        this.f28228R.i();
        this.f28208G0 = false;
        C3944t2 c3944t2 = this.f28236V;
        c3944t2.getClass();
        c3944t2.f34979v = InterfaceC3170ei.f30756a;
        c3944t2.f34978u = 0;
        c3944t2.f34977n = 2;
    }

    public void h0(long j6) {
        this.f28239W0 = Math.max(j6, this.f28239W0);
        while (true) {
            ArrayDeque arrayDeque = this.f28234U;
            if (arrayDeque.isEmpty() || j6 < ((RP) arrayDeque.peek()).f27962a) {
                return;
            }
            RP rp = (RP) arrayDeque.poll();
            rp.getClass();
            m0(rp);
            a0();
        }
    }

    public abstract void i();

    public final void i0(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.f28246b1.f35600a.entrySet()) {
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
        if (this.f28254n0 == null || this.f28217L0 == 3 || this.f28196A == 0) {
            return;
        }
        float f2 = this.m0;
        dp.getClass();
        DP[] dpArr = this.f28200C;
        dpArr.getClass();
        float U8 = U(f2, dp, dpArr);
        float f9 = this.f28258r0;
        if (f9 == U8 || U8 == -1.0f) {
            return;
        }
        if (f9 != -1.0f || U8 > 0.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", U8);
            MP mp = this.f28254n0;
            mp.getClass();
            mp.m(bundle);
            this.f28258r0 = U8;
        }
    }

    public abstract void k();

    public final boolean k0() {
        if (this.f28219M0) {
            this.f28215K0 = 1;
            if (y()) {
                this.f28217L0 = 3;
                return false;
            }
            this.f28217L0 = 2;
            return true;
        }
        C3128du c3128du = this.f28249i0;
        c3128du.getClass();
        this.f28243Z = c3128du;
        this.f28215K0 = 0;
        this.f28217L0 = 0;
        return true;
    }

    public final void l() {
        this.f28265w.getClass();
    }

    public final void l0() {
        int i = this.f28217L0;
        if (i == 1) {
            t();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.f28231S0 = true;
                d0();
                return;
            } else {
                x();
                v();
                return;
            }
        }
        t();
        C3128du c3128du = this.f28249i0;
        c3128du.getClass();
        this.f28243Z = c3128du;
        this.f28215K0 = 0;
        this.f28217L0 = 0;
    }

    public final long m() {
        return this.f28214K;
    }

    public final void m0(RP rp) {
        this.f28237V0 = rp;
        long j6 = rp.f27964c;
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            this.f28241X0 = true;
            e0(j6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DN n(Exception exc, DP dp, boolean z6, int i) {
        int i4;
        if (dp != null && !this.f28209H) {
            this.f28209H = true;
            try {
                i4 = L(dp) & 7;
            } catch (DN unused) {
            } finally {
                this.f28209H = false;
            }
            return new DN(1, exc, i, p(), this.f28267x, dp, dp != null ? 4 : i4, this.J, z6);
        }
        i4 = 4;
        return new DN(1, exc, i, p(), this.f28267x, dp, dp != null ? 4 : i4, this.J, z6);
    }

    public final RP n0() {
        ArrayDeque arrayDeque = this.f28234U;
        return !arrayDeque.isEmpty() ? (RP) arrayDeque.getLast() : this.f28237V0;
    }

    public final int o(S0.l lVar, C4019uN c4019uN, int i) {
        LQ lq = this.f28198B;
        lq.getClass();
        int b9 = lq.b(lVar, c4019uN, i);
        if (b9 == -4) {
            int i4 = i & 1;
            if (c4019uN.h(4)) {
                if (i4 == 0) {
                    this.f28205F = Long.MIN_VALUE;
                }
                return this.f28207G ? -4 : -3;
            }
            long j6 = c4019uN.f35303f + this.f28201D;
            c4019uN.f35303f = j6;
            if (i4 == 0) {
                this.f28205F = Math.max(this.f28205F, j6);
                return -4;
            }
        } else if (b9 == -5) {
            DP dp = (DP) lVar.f2927v;
            dp.getClass();
            long j9 = dp.f25181t;
            if (j9 != Long.MAX_VALUE) {
                C3322hP c3322hP = new C3322hP(dp);
                c3322hP.f31563s = j9 + this.f28201D;
                lVar.f2927v = new DP(c3322hP);
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
        return dp == null || !Objects.equals(dp.f25176o, com.anythink.basead.exoplayer.k.o.f9213H) || j6 - j9 > 80000;
    }

    public abstract String p();

    public final void p0(DP[] dpArr, LQ lq, long j6, long j9, C3860rQ c3860rQ) {
        AbstractC2792Sd.H(!this.f28207G);
        this.f28198B = lq;
        this.J = c3860rQ;
        P();
        if (this.f28205F == Long.MIN_VALUE) {
            this.f28205F = j6;
        }
        this.f28200C = dpArr;
        this.f28201D = j9;
        v0(dpArr, j6, j9, c3860rQ);
    }

    public boolean q(long j6) {
        return false;
    }

    public final LQ q0() {
        return this.f28198B;
    }

    public void r(float f2, float f9) {
        this.f28252l0 = f2;
        this.m0 = f9;
        j0(this.f28255o0);
    }

    public final boolean r0() {
        return this.f28205F == Long.MIN_VALUE;
    }

    public InterfaceC2999bO s0() {
        return null;
    }

    public final void t() {
        try {
            MP mp = this.f28254n0;
            if (mp == null) {
                throw null;
            }
            mp.k();
        } finally {
            A();
        }
    }

    public final void t0() {
        synchronized (this.f28253n) {
            this.f28216L = null;
        }
    }

    public final boolean u(int i) {
        S0.l lVar = this.f28263v;
        lVar.f2926u = null;
        lVar.f2927v = null;
        C4019uN c4019uN = this.f28224P;
        c4019uN.i();
        int o4 = o(lVar, c4019uN, i | 4);
        if (o4 == -5) {
            Y(lVar);
            return true;
        }
        if (o4 != -4 || !c4019uN.h(4)) {
            return false;
        }
        this.f28229R0 = true;
        l0();
        return false;
    }

    public abstract void u0(boolean z6, boolean z9);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c5 A[Catch: QP -> 0x02e0, TryCatch #5 {QP -> 0x02e0, blocks: (B:145:0x0297, B:147:0x02c5, B:148:0x02d0, B:150:0x02dd, B:151:0x02f7, B:156:0x02ff, B:157:0x0301, B:158:0x02e2, B:202:0x0305, B:204:0x0306, B:207:0x0313, B:208:0x0314, B:209:0x0321, B:221:0x0327), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02dd A[Catch: QP -> 0x02e0, TryCatch #5 {QP -> 0x02e0, blocks: (B:145:0x0297, B:147:0x02c5, B:148:0x02d0, B:150:0x02dd, B:151:0x02f7, B:156:0x02ff, B:157:0x0301, B:158:0x02e2, B:202:0x0305, B:204:0x0306, B:207:0x0313, B:208:0x0314, B:209:0x0321, B:221:0x0327), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e2 A[Catch: QP -> 0x02e0, TryCatch #5 {QP -> 0x02e0, blocks: (B:145:0x0297, B:147:0x02c5, B:148:0x02d0, B:150:0x02dd, B:151:0x02f7, B:156:0x02ff, B:157:0x0301, B:158:0x02e2, B:202:0x0305, B:204:0x0306, B:207:0x0313, B:208:0x0314, B:209:0x0321, B:221:0x0327), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb A[Catch: Exception -> 0x010f, TRY_ENTER, TryCatch #0 {Exception -> 0x010f, blocks: (B:168:0x00e7, B:169:0x00ec, B:175:0x00f7, B:176:0x00f8, B:178:0x0101, B:68:0x0156, B:72:0x0188, B:74:0x0190, B:76:0x019a, B:78:0x01a2, B:80:0x01aa, B:86:0x01bb, B:91:0x01cb, B:99:0x022d, B:104:0x024c, B:106:0x0252, B:108:0x0256, B:110:0x0264, B:120:0x01d9, B:122:0x01e1, B:124:0x01e9, B:126:0x01f1, B:128:0x01f9, B:130:0x0201, B:134:0x0213, B:136:0x021d, B:184:0x0117, B:172:0x00ef, B:174:0x00f3, B:179:0x0114), top: B:167:0x00e7, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0229 A[Catch: Exception -> 0x0275, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0275, blocks: (B:65:0x0145, B:97:0x0229), top: B:64:0x0145 }] */
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
        boolean z6;
        SP sp;
        Exception exc;
        QP qp;
        boolean z9;
        SP sp2;
        DP dp2;
        int i;
        long j6;
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        long elapsedRealtime;
        int i4;
        boolean z10;
        LogSessionId unused;
        SP sp3 = this;
        SP sp4 = null;
        if (sp3.f28254n0 == null && !sp3.f28206F0 && (dp = sp3.f28240X) != null) {
            boolean z11 = true;
            if (sp3.f28249i0 == null && sp3.Q(dp)) {
                sp3.f28206F0 = false;
                sp3.g0();
                String str = dp.f25176o;
                boolean equals2 = com.anythink.basead.exoplayer.k.o.f9246r.equals(str);
                JP jp = sp3.f28230S;
                if (equals2 || com.anythink.basead.exoplayer.k.o.f9248t.equals(str) || com.anythink.basead.exoplayer.k.o.f9213H.equals(str)) {
                    jp.f26437k = 32;
                } else {
                    jp.f26437k = 1;
                }
                sp3.f28206F0 = true;
                return;
            }
            sp3.f28243Z = sp3.f28249i0;
            try {
                DP dp3 = sp3.f28240X;
                try {
                    if (dp3 == null) {
                        throw null;
                    }
                    if (sp3.f28259s0 == null) {
                        try {
                            ArrayList O8 = sp3.O(sp3.f28222O, dp3);
                            O8.isEmpty();
                            sp3.f28259s0 = new ArrayDeque();
                            if (!O8.isEmpty()) {
                                sp3.f28259s0.add((PP) O8.get(0));
                            }
                            sp3.f28260t0 = null;
                        } catch (UP e9) {
                            throw new QP(dp3, e9, -49998);
                        }
                    }
                    if (sp3.f28259s0.isEmpty()) {
                        throw new QP(dp3, null, -49999);
                    }
                    ArrayDeque arrayDeque = sp3.f28259s0;
                    if (arrayDeque == null) {
                        throw null;
                    }
                    while (sp3.f28254n0 == null) {
                        PP pp = (PP) arrayDeque.peekFirst();
                        if (pp == null) {
                            throw sp4;
                        }
                        String str2 = pp.f27597a;
                        sp3.D(dp3);
                        if (sp3.w(pp)) {
                            try {
                                sp3.f28262u0 = pp;
                                dp2 = sp3.f28240X;
                            } catch (Exception e10) {
                                e = e10;
                                r17 = sp4;
                                z6 = z11;
                            }
                            if (dp2 == null) {
                                throw sp4;
                            }
                            float f2 = sp3.m0;
                            try {
                                DP[] dpArr = sp3.f28200C;
                                dpArr.getClass();
                                float U8 = sp3.U(f2, dp2, dpArr);
                                if (U8 <= 0.0f) {
                                    U8 = -1.0f;
                                }
                                sp3.f28271z.getClass();
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                z6 = z11;
                                try {
                                    C3887s R8 = sp3.R(pp, dp2, U8);
                                    i = Build.VERSION.SDK_INT;
                                    r17 = sp4;
                                    ?? r72 = 31;
                                    if (i >= 31) {
                                        try {
                                            IO io = sp3.f28269y;
                                            io.getClass();
                                            synchronized (io) {
                                                j6 = elapsedRealtime2;
                                                C3557lt c3557lt = io.f26243b;
                                                if (c3557lt == null) {
                                                    throw r17;
                                                }
                                                logSessionId = (LogSessionId) c3557lt.f32643u;
                                            }
                                            unused = LogSessionId.LOG_SESSION_ID_NONE;
                                            equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                            r72 = io;
                                            if (!equals) {
                                                MediaFormat mediaFormat = (MediaFormat) R8.f34555v;
                                                stringId = logSessionId.getStringId();
                                                mediaFormat.setString("log-session-id", stringId);
                                                r72 = "log-session-id";
                                            }
                                        } catch (Exception e11) {
                                            exc = e11;
                                            sp = sp3;
                                            r17 = r17;
                                            AbstractC2991bG.C("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                            arrayDeque.removeFirst();
                                            String str3 = pp.f27597a;
                                            int length = str3.length();
                                            String dp4 = dp3.toString();
                                            QP qp2 = new QP(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(length + 23 + dp4.length()), "Decoder init failed: ", str3, ", ", dp4), exc, dp3.f25176o, pp, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                            sp.X(qp2);
                                            qp = sp.f28260t0;
                                            if (qp == null) {
                                                sp.f28260t0 = qp2;
                                            } else {
                                                sp.f28260t0 = new QP(qp.getMessage(), qp.getCause(), qp.f27811n, qp.f27812u, qp.f27813v);
                                            }
                                            if (arrayDeque.isEmpty()) {
                                                throw sp.f28260t0;
                                            }
                                            sp3 = sp;
                                            z11 = z6;
                                            sp4 = r17;
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
                                            MP b9 = sp3.f28220N.b(R8);
                                            sp3.f28254n0 = b9;
                                            b9.p(new C4042ut(sp3));
                                            try {
                                                Trace.endSection();
                                                try {
                                                    sp3.f28271z.getClass();
                                                    elapsedRealtime = SystemClock.elapsedRealtime();
                                                    if (!pp.b(sp3.f28218M, dp2)) {
                                                        String c9 = DP.c(dp2);
                                                        String str4 = AbstractC3182eu.f30782a;
                                                        Locale locale = Locale.US;
                                                        AbstractC2991bG.y("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + c9 + ", " + str2 + "]");
                                                    }
                                                    sp3.f28258r0 = U8;
                                                    sp3.f28255o0 = dp2;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    sp2 = sp3;
                                                    z9 = r17;
                                                    exc = e;
                                                    sp = sp2;
                                                    r17 = z9;
                                                    AbstractC2991bG.C("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                                    arrayDeque.removeFirst();
                                                    String str32 = pp.f27597a;
                                                    int length2 = str32.length();
                                                    String dp42 = dp3.toString();
                                                    QP qp22 = new QP(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(length2 + 23 + dp42.length()), "Decoder init failed: ", str32, ", ", dp42), exc, dp3.f25176o, pp, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                                    sp.X(qp22);
                                                    qp = sp.f28260t0;
                                                    if (qp == null) {
                                                    }
                                                    if (arrayDeque.isEmpty()) {
                                                    }
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            sp2 = r72;
                                            z9 = r17;
                                            exc = e;
                                            sp = sp2;
                                            r17 = z9;
                                            AbstractC2991bG.C("MediaCodecRenderer", "Failed to initialize decoder: ".concat(str2), exc);
                                            arrayDeque.removeFirst();
                                            String str322 = pp.f27597a;
                                            int length22 = str322.length();
                                            String dp422 = dp3.toString();
                                            QP qp222 = new QP(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(length22 + 23 + dp422.length()), "Decoder init failed: ", str322, ", ", dp422), exc, dp3.f25176o, pp, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : r17);
                                            sp.X(qp222);
                                            qp = sp.f28260t0;
                                            if (qp == null) {
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
                                    r17 = sp4;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                r17 = sp4;
                                z6 = z11;
                            }
                            if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                                String str5 = Build.MODEL;
                                if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                                    i4 = 2;
                                    sp3.f28264v0 = i4;
                                    sp3.f28266w0 = (i == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z6;
                                    if (i <= 25) {
                                        if ("OMX.rk.video_decoder.avc".equals(str2)) {
                                        }
                                        z10 = z6;
                                        sp3.f28272z0 = z10;
                                        if (sp3.f28254n0 != null) {
                                            throw r17;
                                        }
                                        if (sp3.f28196A == 2) {
                                            sp3.f28271z.getClass();
                                            sp3.f28199B0 = SystemClock.elapsedRealtime() + 1000;
                                        }
                                        sp3.f28235U0.f35774a++;
                                        long j9 = elapsedRealtime - j6;
                                        if (i >= 31) {
                                            C3846rC c3846rC = sp3.f28248d1;
                                            if (!c3846rC.isEmpty()) {
                                                MP mp = sp3.f28254n0;
                                                if (mp == null) {
                                                    throw r17;
                                                }
                                                mp.g(new ArrayList(c3846rC));
                                            }
                                        }
                                        sp3.V(str2, elapsedRealtime, j9);
                                        sp = sp3;
                                        sp3 = sp;
                                        z11 = z6;
                                        sp4 = r17;
                                    }
                                    if ((i <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str2) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str2) && !"OMX.bcm.vdec.avc.tunnel".equals(str2) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str2) && !"OMX.bcm.vdec.hevc.tunnel".equals(str2) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !pp.f27602f)) {
                                        z10 = false;
                                        sp3.f28272z0 = z10;
                                        if (sp3.f28254n0 != null) {
                                        }
                                    }
                                    z10 = z6;
                                    sp3.f28272z0 = z10;
                                    if (sp3.f28254n0 != null) {
                                    }
                                }
                            }
                            i4 = 0;
                            sp3.f28264v0 = i4;
                            sp3.f28266w0 = (i == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z6;
                            if (i <= 25) {
                            }
                            if (i <= 29) {
                            }
                            z10 = false;
                            sp3.f28272z0 = z10;
                            if (sp3.f28254n0 != null) {
                            }
                        }
                    }
                    sp3.f28259s0 = sp4;
                } catch (QP e17) {
                    e = e17;
                    throw sp4.n(e, dp, false, 4001);
                }
            } catch (QP e18) {
                e = e18;
                sp4 = sp3;
                throw sp4.n(e, dp, false, 4001);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r4 >= r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v0(DP[] dpArr, long j6, long j9, C3860rQ c3860rQ) {
        this.f28198B.getClass();
        if (this.f28237V0.f27964c == com.anythink.basead.exoplayer.b.f7168b) {
            m0(new RP(com.anythink.basead.exoplayer.b.f7168b, j6, j9));
            if (this.f28242Y0) {
                a0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.f28234U;
        if (arrayDeque.isEmpty()) {
            long j10 = this.f28225P0;
            if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                long j11 = this.f28239W0;
                if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                }
            }
            m0(new RP(com.anythink.basead.exoplayer.b.f7168b, j6, j9));
            if (this.f28237V0.f27964c != com.anythink.basead.exoplayer.b.f7168b) {
                a0();
                return;
            }
            return;
        }
        arrayDeque.add(new RP(this.f28225P0, j6, j9));
    }

    public boolean w(PP pp) {
        return true;
    }

    public final void x() {
        try {
            MP mp = this.f28254n0;
            if (mp != null) {
                mp.l();
                this.f28235U0.f35775b++;
                PP pp = this.f28262u0;
                if (pp == null) {
                    throw null;
                }
                W(pp.f27597a);
            }
            this.f28254n0 = null;
            this.f28243Z = null;
            B();
        } catch (Throwable th) {
            this.f28254n0 = null;
            this.f28243Z = null;
            B();
            throw th;
        }
    }

    public boolean y() {
        int i = this.f28217L0;
        if (i == 3 || (this.f28266w0 && !this.f28223O0)) {
            return true;
        }
        if (i == 2) {
            try {
                C3128du c3128du = this.f28249i0;
                c3128du.getClass();
                this.f28243Z = c3128du;
                this.f28215K0 = 0;
                this.f28217L0 = 0;
            } catch (DN e9) {
                AbstractC2991bG.C("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e9);
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
