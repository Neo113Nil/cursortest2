package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes2.dex */
public final class Z extends RP {

    /* renamed from: a2, reason: collision with root package name */
    public static final int[] f28775a2 = {1920, 1600, com.onesignal.core.internal.config.e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1280, 960, 854, 640, 540, 480};

    /* renamed from: b2, reason: collision with root package name */
    public static boolean f28776b2;

    /* renamed from: c2, reason: collision with root package name */
    public static boolean f28777c2;

    /* renamed from: A1, reason: collision with root package name */
    public int f28778A1;

    /* renamed from: B1, reason: collision with root package name */
    public List f28779B1;

    /* renamed from: C1, reason: collision with root package name */
    public Surface f28780C1;

    /* renamed from: D1, reason: collision with root package name */
    public C2952b0 f28781D1;
    public Nr E1;

    /* renamed from: F1, reason: collision with root package name */
    public boolean f28782F1;

    /* renamed from: G1, reason: collision with root package name */
    public int f28783G1;
    public int H1;

    /* renamed from: I1, reason: collision with root package name */
    public long f28784I1;

    /* renamed from: J1, reason: collision with root package name */
    public int f28785J1;

    /* renamed from: K1, reason: collision with root package name */
    public int f28786K1;

    /* renamed from: L1, reason: collision with root package name */
    public int f28787L1;

    /* renamed from: M1, reason: collision with root package name */
    public C3943tO f28788M1;

    /* renamed from: N1, reason: collision with root package name */
    public long f28789N1;

    /* renamed from: O1, reason: collision with root package name */
    public boolean f28790O1;
    public long P1;

    /* renamed from: Q1, reason: collision with root package name */
    public int f28791Q1;

    /* renamed from: R1, reason: collision with root package name */
    public long f28792R1;

    /* renamed from: S1, reason: collision with root package name */
    public C3035cd f28793S1;

    /* renamed from: T1, reason: collision with root package name */
    public C3035cd f28794T1;

    /* renamed from: U1, reason: collision with root package name */
    public int f28795U1;

    /* renamed from: V1, reason: collision with root package name */
    public int f28796V1;

    /* renamed from: W1, reason: collision with root package name */
    public InterfaceC3328i0 f28797W1;

    /* renamed from: X1, reason: collision with root package name */
    public long f28798X1;

    /* renamed from: Y1, reason: collision with root package name */
    public boolean f28799Y1;

    /* renamed from: Z1, reason: collision with root package name */
    public int f28800Z1;

    /* renamed from: k1, reason: collision with root package name */
    public final Context f28801k1;

    /* renamed from: l1, reason: collision with root package name */
    public final boolean f28802l1;

    /* renamed from: m1, reason: collision with root package name */
    public final S0.e f28803m1;
    public final boolean n1;

    /* renamed from: o1, reason: collision with root package name */
    public final C3434k0 f28804o1;
    public final C3380j0 p1;

    /* renamed from: q1, reason: collision with root package name */
    public final U f28805q1;

    /* renamed from: r1, reason: collision with root package name */
    public final C2991bm f28806r1;

    /* renamed from: s1, reason: collision with root package name */
    public final long f28807s1;

    /* renamed from: t1, reason: collision with root package name */
    public final C3488l0 f28808t1;

    /* renamed from: u1, reason: collision with root package name */
    public final PriorityQueue f28809u1;

    /* renamed from: v1, reason: collision with root package name */
    public X2.b f28810v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f28811w1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f28812x1;

    /* renamed from: y1, reason: collision with root package name */
    public A0 f28813y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f28814z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Z(Y y7) {
        super(r1.getApplicationContext(), 2, (C3193fa) y7.f28624d, r0);
        C3084dP c3084dP = (C3084dP) y7.f28623c;
        Context context = (Context) y7.f28622b;
        Context applicationContext = context.getApplicationContext();
        this.f28801k1 = applicationContext;
        this.f28813y1 = null;
        this.f28803m1 = new S0.e((Handler) y7.f28625e, (HN) y7.f28626f);
        this.f28802l1 = this.f28813y1 == null;
        this.f28804o1 = new C3434k0(applicationContext, this);
        this.p1 = new C3380j0();
        this.f28805q1 = new U(new C3657o7(2, this));
        this.n1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.E1 = Nr.f26557c;
        this.f28783G1 = 1;
        this.H1 = 0;
        this.f28793S1 = C3035cd.f29500d;
        this.f28796V1 = 0;
        this.f28794T1 = null;
        this.f28795U1 = -1000;
        this.f28798X1 = com.anythink.basead.exoplayer.b.f6382b;
        this.f28806r1 = new C2991bm(7);
        this.f28809u1 = new PriorityQueue();
        this.f28807s1 = -15000L;
        this.f28808t1 = new C3488l0();
        this.f28788M1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007c, code lost:
    
        if (r3.equals("video/av01") != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0(OP op, DP dp) {
        int i;
        int i6 = dp.f24438v;
        if (i6 != -1 && (i = dp.f24439w) != -1) {
            String str = dp.f24431o;
            str.getClass();
            char c9 = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair c10 = AbstractC4228ym.c(dp);
                if (c10 != null) {
                    int intValue = ((Integer) c10.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = com.anythink.basead.exoplayer.k.o.f8451h;
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = com.anythink.basead.exoplayer.k.o.i;
            }
            int i9 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8450g)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.i)) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1187890754:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8454l)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1331836730:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8451h)) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1599127256:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8452j)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1599127257:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8453k)) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i6 * i) * 3) / i9;
                case 4:
                    return Math.max(2097152, ((i6 * i) * 3) / 4);
                case 5:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !op.f26609f)))) {
                        String str3 = AbstractC3159eu.f29993a;
                        return ((((i + 15) / 16) * ((i6 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i9 = 8;
                    return ((i6 * i) * 3) / i9;
            }
        }
        return -1;
    }

    public static int E0(OP op, DP dp) {
        int i = dp.f24432p;
        if (i == -1) {
            return A0(op, dp);
        }
        List list = dp.f24434r;
        int size = list.size();
        int i6 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i6 += ((byte[]) list.get(i9)).length;
        }
        return i + i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x04c4, code lost:
    
        if (r0.equals("deb") != false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x079f, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L517;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean F0(String str) {
        boolean z3;
        boolean z6;
        boolean z9 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (Z.class) {
            if (!f28776b2) {
                int i = Build.VERSION.SDK_INT;
                char c9 = 28;
                if (i <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z6 = true;
                                break;
                            }
                            z6 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z6 = 3;
                                break;
                            }
                            z6 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z6 = 2;
                                break;
                            }
                            z6 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z6 = 7;
                                break;
                            }
                            z6 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z6 = false;
                                break;
                            }
                            z6 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z6 = 4;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z6 = 6;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z6 = 5;
                                break;
                            }
                            z6 = -1;
                            break;
                        default:
                            z6 = -1;
                            break;
                    }
                    switch (z6) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z9 = true;
                            break;
                    }
                    f28777c2 = z9;
                    f28776b2 = true;
                }
                if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z3 = 6;
                                break;
                            }
                            z3 = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z3 = 7;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z3 = false;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z3 = true;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z3 = 2;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z3 = 3;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z3 = 4;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z3 = 8;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z3 = 5;
                                break;
                            }
                            z3 = -1;
                            break;
                        default:
                            z3 = -1;
                            break;
                    }
                    switch (z3) {
                        default:
                            if (i <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c9 = '6';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c9 = '7';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c9 = '8';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c9 = 'J';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c9 = 22;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c9 = 'Y';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c9 = 'Z';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c9 = 'e';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c9 = 'f';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c9 = 'g';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c9 = '\r';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c9 = 't';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c9 = 137;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c9 = 21;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c9 = 'h';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c9 = '_';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c9 = 130;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c9 = 'a';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c9 = 'b';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c9 = 'c';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c9 = '4';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c9 = 18;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c9 = 'F';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c9 = 'v';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c9 = 'W';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c9 = 5;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c9 = 6;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c9 = 'x';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c9 = '\"';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c9 = '~';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c9 = 'X';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c9 = '\t';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c9 = 'w';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c9 = 131;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c9 = 132;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c9 = '[';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c9 = '3';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c9 = '5';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c9 = 'i';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c9 = 'y';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c9 = 17;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c9 = 138;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c9 = 31;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c9 = 134;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c9 = 20;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c9 = 'q';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c9 = 127;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c9 = 129;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c9 = 16;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c9 = 'T';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c9 = 'I';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c9 = 'O';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c9 = 'P';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c9 = 'V';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c9 = '^';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c9 = 'k';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c9 = 's';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c9 = 139;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c9 = 26;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c9 = 27;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c9 = '1';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c9 = 0;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c9 = 1;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c9 = 2;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c9 = '$';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c9 = '%';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c9 = '&';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c9 = '\'';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c9 = '(';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c9 = ')';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c9 = ']';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c9 = 'm';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c9 = 'o';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c9 = 136;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c9 = '2';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c9 = 'K';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c9 = 'U';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c9 = '\\';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c9 = 'S';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c9 = 3;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c9 = 4;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c9 = 15;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c9 = 7;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c9 = 30;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c9 = '*';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c9 = '+';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c9 = ',';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c9 = '-';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c9 = '.';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c9 = '/';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c9 = '0';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c9 = 'l';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c9 = 'n';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c9 = 'p';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c9 = 128;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c9 = 135;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c9 = 'C';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c9 = 'L';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c9 = 'M';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c9 = '\b';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c9 = 25;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c9 = 'R';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c9 = '<';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c9 = 11;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c9 = '\f';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c9 = 'z';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c9 = '{';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c9 = '|';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c9 = '}';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c9 = 'j';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c9 = 'r';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c9 = '9';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c9 = ':';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c9 = ';';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c9 = 'Q';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c9 = '\n';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c9 = 'H';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c9 = '`';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c9 = 'N';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c9 = 'G';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c9 = '>';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c9 = '#';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c9 = '=';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c9 = 133;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c9 = 23;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c9 = 24;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c9 = 'D';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c9 = 'u';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c9 = 'd';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c9 = 'E';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c9 = 19;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c9 = 29;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c9 = '?';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c9 = '@';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c9 = 14;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c9 = ' ';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c9 = '!';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c9 = 'A';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c9 = 'B';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    default:
                                        c9 = 65535;
                                        break;
                                }
                                switch (c9) {
                                    default:
                                        if (str3.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case ' ':
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case com.anythink.basead.b.b.j.f5806M /* 38 */:
                                    case '\'':
                                    case com.anythink.basead.b.b.j.f5808O /* 40 */:
                                    case ')':
                                    case '*':
                                    case com.anythink.basead.b.b.j.f5811R /* 43 */:
                                    case com.anythink.basead.b.b.j.f5812S /* 44 */:
                                    case com.anythink.basead.b.b.j.f5813T /* 45 */:
                                    case '.':
                                    case '/':
                                    case com.anythink.basead.b.b.j.f5816W /* 48 */:
                                    case com.anythink.basead.b.b.j.f5817X /* 49 */:
                                    case '2':
                                    case '3':
                                    case '4':
                                    case com.anythink.core.common.n.a.i.f14823d /* 53 */:
                                    case '6':
                                    case '7':
                                    case p.a.f19679e /* 56 */:
                                    case '9':
                                    case ':':
                                    case j.v.f12591n /* 59 */:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case j.v.f12576G /* 65 */:
                                    case 'B':
                                    case j.v.f12582d /* 67 */:
                                    case 'D':
                                    case j.v.f12573D /* 69 */:
                                    case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case j.v.f12598u /* 74 */:
                                    case j.v.f12599v /* 75 */:
                                    case j.v.f12603z /* 76 */:
                                    case j.v.f12571B /* 77 */:
                                    case 'N':
                                    case j.v.f12570A /* 79 */:
                                    case j.v.f12572C /* 80 */:
                                    case j.v.f12574E /* 81 */:
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                    case '[':
                                    case j.v.f12577H /* 92 */:
                                    case j.v.f12578I /* 93 */:
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case com.anythink.expressad.video.module.a.a.f21756z /* 109 */:
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                    case '{':
                                    case '|':
                                    case '}':
                                    case com.anythink.expressad.video.module.a.a.f21727Q /* 126 */:
                                    case com.anythink.expressad.video.module.a.a.f21728R /* 127 */:
                                    case 128:
                                    case com.anythink.expressad.video.module.a.a.f21730T /* 129 */:
                                    case com.anythink.expressad.video.module.a.a.f21731U /* 130 */:
                                    case com.anythink.expressad.video.module.a.a.f21732V /* 131 */:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        break;
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    f28777c2 = z9;
                    f28776b2 = true;
                }
                z9 = true;
                f28777c2 = z9;
                f28776b2 = true;
            }
        }
        return f28777c2;
    }

    public static List G0(Context context, C3084dP c3084dP, DP dp, boolean z3, boolean z6) {
        List a9;
        String str = dp.f24431o;
        if (str == null) {
            return C3500lC.f31745x;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC2639Kg.k(context)) {
            String d2 = WP.d(dp);
            if (d2 == null) {
                a9 = C3500lC.f31745x;
            } else {
                c3084dP.getClass();
                a9 = WP.a(d2, z3, z6);
            }
            if (!a9.isEmpty()) {
                return a9;
            }
        }
        return WP.b(c3084dP, dp, z3, z6);
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void A() {
        super.A();
        this.f28809u1.clear();
        this.f28787L1 = 0;
        this.f28800Z1 = 0;
        this.f28790O1 = false;
        C2991bm c2991bm = this.f28806r1;
        if (c2991bm != null) {
            c2991bm.f29324v = null;
            ByteBuffer byteBuffer = (ByteBuffer) c2991bm.f29323u;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    public final void B0(LP lp, int i) {
        Trace.beginSection("skipVideoBuffer");
        lp.q(i);
        Trace.endSection();
        this.f27254Z0.f34998f++;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final NP C(IllegalStateException illegalStateException, OP op) {
        Surface surface = this.f28780C1;
        V v9 = new V(illegalStateException, op);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return v9;
    }

    public final boolean C0(OP op) {
        if (this.f28813y1 != null) {
            return true;
        }
        Surface surface = this.f28780C1;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && op.f26611h) {
            return true;
        }
        if (F0(op.f26604a)) {
            return false;
        }
        return !op.f26609f || C2952b0.a(this.f28801k1);
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void D(DP dp) {
        A0 a02 = this.f28813y1;
        if (a02 == null || a02.d()) {
            return;
        }
        try {
            a02.x0(dp);
        } catch (C4243z0 e9) {
            throw n(e9, dp, false, 7000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface D0(OP op) {
        boolean z3;
        HandlerThreadC2898a0 handlerThreadC2898a0;
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            return a02.k();
        }
        Surface surface = this.f28780C1;
        if (surface != null) {
            return surface;
        }
        boolean z6 = false;
        if (Build.VERSION.SDK_INT >= 35 && op.f26611h) {
            return null;
        }
        AbstractC2772Sd.H(!F0(op.f26604a) && (!op.f26609f || C2952b0.a(this.f28801k1)));
        C2952b0 c2952b0 = this.f28781D1;
        if (c2952b0 != null) {
            if (c2952b0.f29178n != op.f26609f && c2952b0 != null) {
                c2952b0.release();
                this.f28781D1 = null;
            }
        }
        if (this.f28781D1 == null) {
            Context context = this.f28801k1;
            boolean z9 = op.f26609f;
            if (!z9) {
                int i = C2952b0.f29176w;
            } else if (!C2952b0.a(context)) {
                z3 = false;
                AbstractC2772Sd.H(z3);
                handlerThreadC2898a0 = new HandlerThreadC2898a0("ExoPlayer:PlaceholderSurface");
                int i6 = !z9 ? C2952b0.f29176w : 0;
                handlerThreadC2898a0.start();
                Handler handler = new Handler(handlerThreadC2898a0.getLooper(), handlerThreadC2898a0);
                handlerThreadC2898a0.f28991u = handler;
                handlerThreadC2898a0.f28990n = new RunnableC4067vn(handler);
                synchronized (handlerThreadC2898a0) {
                    handlerThreadC2898a0.f28991u.obtainMessage(1, i6, 0).sendToTarget();
                    while (handlerThreadC2898a0.f28994x == null && handlerThreadC2898a0.f28993w == null && handlerThreadC2898a0.f28992v == null) {
                        try {
                            handlerThreadC2898a0.wait();
                        } catch (InterruptedException unused) {
                            z6 = true;
                        }
                    }
                }
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = handlerThreadC2898a0.f28993w;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = handlerThreadC2898a0.f28992v;
                if (error != null) {
                    throw error;
                }
                C2952b0 c2952b02 = handlerThreadC2898a0.f28994x;
                c2952b02.getClass();
                this.f28781D1 = c2952b02;
            }
            z3 = true;
            AbstractC2772Sd.H(z3);
            handlerThreadC2898a0 = new HandlerThreadC2898a0("ExoPlayer:PlaceholderSurface");
            if (!z9) {
            }
            handlerThreadC2898a0.start();
            Handler handler2 = new Handler(handlerThreadC2898a0.getLooper(), handlerThreadC2898a0);
            handlerThreadC2898a0.f28991u = handler2;
            handlerThreadC2898a0.f28990n = new RunnableC4067vn(handler2);
            synchronized (handlerThreadC2898a0) {
            }
        }
        return this.f28781D1;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void E(C3996uN c3996uN) {
        ByteBuffer byteBuffer;
        KJ kj;
        OP op = this.f27283z0;
        op.getClass();
        if (op.f26605b.equals("video/av01") && (byteBuffer = c3996uN.f34528e) != null) {
            DP dp = this.f27271t0;
            if (dp != null && (kj = dp.f24407F) != null && kj.f25901e > 8 && Build.VERSION.SDK_INT < 37) {
                Iterator it = SK.j(byteBuffer.asReadOnlyBuffer()).iterator();
                while (it.hasNext()) {
                    C3177fB c3177fB = (C3177fB) it.next();
                    int i = c3177fB.f30234a;
                    ByteBuffer byteBuffer2 = c3177fB.f30235b;
                    if (i == 5) {
                        try {
                            AbstractC2772Sd.i(i == 5);
                            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                            if (SK.C(asReadOnlyBuffer) == 4) {
                                if (asReadOnlyBuffer.remaining() >= 6) {
                                    byte[] bArr = new byte[6];
                                    asReadOnlyBuffer.asReadOnlyBuffer().get(bArr);
                                    if (!Arrays.equals(bArr, AbstractC2772Sd.f27503u)) {
                                    }
                                }
                                byteBuffer.put(byteBuffer2.position(), (byte) 31);
                            }
                        } catch (BufferUnderflowException unused) {
                        }
                    }
                }
            }
            C2991bm c2991bm = this.f28806r1;
            if (c2991bm != null && c3996uN.h(1)) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) c2991bm.f29323u;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer);
                byteBuffer3.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.f28800Z1 = 0;
        int F8 = F(c3996uN);
        if (Build.VERSION.SDK_INT < 34 || (F8 & 32) == 0) {
            this.f28787L1++;
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final int F(C3996uN c3996uN) {
        return (Build.VERSION.SDK_INT < 34 || this.f28788M1 == null || c3996uN.f34529f >= this.f27213E || I0(c3996uN)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // com.google.android.gms.internal.ads.RP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(C3996uN c3996uN) {
        boolean z3;
        ByteBuffer byteBuffer;
        C4092wB c4092wB;
        R2 r22;
        boolean z6 = false;
        if (!I0(c3996uN)) {
            boolean z9 = c3996uN.f34529f < this.f27213E;
            C3488l0 c3488l0 = this.f28808t1;
            if (c3488l0 != null) {
                long j6 = c3488l0.f31676a == com.anythink.basead.exoplayer.b.f6382b ? -9223372036854775807L : (long) (((r2 - r6) * c3488l0.f31678c) + c3488l0.f31677b);
                if (j6 != com.anythink.basead.exoplayer.b.f6382b && j6 < this.f28807s1) {
                    z3 = true;
                    if ((!z9 || z3) && !c3996uN.h(268435456)) {
                        if (c3996uN.h(67108864)) {
                            C2991bm c2991bm = this.f28806r1;
                            if (c2991bm != null) {
                                OP op = this.f27283z0;
                                op.getClass();
                                if (op.f26605b.equals("video/av01") && (byteBuffer = c3996uN.f34528e) != null) {
                                    boolean z10 = z9 || this.f28800Z1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    ByteBuffer byteBuffer2 = (ByteBuffer) c2991bm.f29323u;
                                    if (byteBuffer2.hasRemaining()) {
                                        c2991bm.V(SK.j(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList j9 = SK.j(asReadOnlyBuffer);
                                    c2991bm.V(j9);
                                    int size = j9.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        C3177fB c3177fB = (C3177fB) j9.get(size);
                                        int i6 = c3177fB.f30234a;
                                        if (i6 != 2 && i6 != 15) {
                                            if (i6 == 3) {
                                                if (!z10) {
                                                    break;
                                                }
                                                i6 = 3;
                                            }
                                            if ((i6 != 6 && i6 != 3) || (c4092wB = (C4092wB) c2991bm.f29324v) == null) {
                                                break;
                                            }
                                            try {
                                                r22 = new R2(c4092wB, c3177fB);
                                            } catch (TA unused) {
                                                r22 = null;
                                            }
                                            if (r22 != null) {
                                                if (r22.f27159u) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((C3177fB) j9.get(size)).f30234a == 6 || ((C3177fB) j9.get(size)).f30234a == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = (i > 1 || size + 1 >= 8) ? asReadOnlyBuffer.limit() : size >= 0 ? ((C3177fB) j9.get(size)).f30235b.limit() : asReadOnlyBuffer.position();
                                    if (limit == 0) {
                                        c3996uN.i();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        X2.b bVar = this.f28810v1;
                                        bVar.getClass();
                                        if (bVar.f3773c + limit < asReadOnlyBuffer.capacity() && !c3996uN.h(1073741824)) {
                                            ByteBuffer byteBuffer3 = c3996uN.f34528e;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z6) {
                                if (z9) {
                                    this.f27254Z0.f34996d++;
                                } else {
                                    this.f28800Z1++;
                                }
                                this.f28809u1.add(Long.valueOf(c3996uN.f34529f));
                            }
                            return z6;
                        }
                        c3996uN.i();
                        z6 = true;
                        if (z6) {
                        }
                        return z6;
                    }
                }
            }
            z3 = false;
            if (!z9) {
            }
            if (c3996uN.h(67108864)) {
            }
            z6 = true;
            if (z6) {
            }
            return z6;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void H(long j6, long j9) {
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            try {
                a02.p0(j6, j9);
            } catch (C4243z0 e9) {
                throw n(e9, e9.f35261n, false, 7001);
            }
        }
        super.H(j6, j9);
    }

    public final void H0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f28780C1;
        S0.e eVar = this.f28803m1;
        if (surface2 == surface) {
            if (surface != null) {
                C3035cd c3035cd = this.f28794T1;
                if (c3035cd != null) {
                    eVar.C(c3035cd);
                }
                Surface surface3 = this.f28780C1;
                if (surface3 == null || !this.f28782F1 || (handler = (Handler) eVar.f2781u) == null) {
                    return;
                }
                handler.post(new RunnableC4027v0(eVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f28780C1 = surface;
        A0 a02 = this.f28813y1;
        C3434k0 c3434k0 = this.f28804o1;
        if (a02 == null) {
            c3434k0.c(surface);
        }
        this.f28782F1 = false;
        int i = this.f27206A;
        LP lp = this.f27270s0;
        if (lp != null && this.f28813y1 == null) {
            OP op = this.f27283z0;
            op.getClass();
            if (!C0(op) || this.f28811w1) {
                x();
                v();
            } else {
                Surface D02 = D0(op);
                if (D02 != null) {
                    lp.m(D02);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    lp.s();
                }
            }
        }
        if (surface != null) {
            C3035cd c3035cd2 = this.f28794T1;
            if (c3035cd2 != null) {
                eVar.C(c3035cd2);
            }
        } else {
            this.f28794T1 = null;
            A0 a03 = this.f28813y1;
            if (a03 != null) {
                a03.m();
            }
        }
        if (i == 2) {
            A0 a04 = this.f28813y1;
            if (a04 != null) {
                a04.u0(true);
            } else {
                c3434k0.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r7.f27218G0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.RP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I() {
        boolean c9;
        boolean z3 = false;
        if (this.f27250X != null) {
            if (r0()) {
                c9 = this.f27217G;
            } else {
                IQ iq = this.f27208B;
                iq.getClass();
                c9 = iq.c();
            }
            if (!c9) {
                if (!(this.f27222I0 >= 0)) {
                    if (this.f27218G0 != com.anythink.basead.exoplayer.b.f6382b) {
                        this.f27282z.getClass();
                    }
                }
            }
            z3 = true;
        }
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            return a02.Z(z3);
        }
        if (z3 && this.f27270s0 == null) {
            return true;
        }
        return this.f28804o1.d(z3);
    }

    public final boolean I0(C3996uN c3996uN) {
        if (r0() || c3996uN.h(536870912)) {
            return true;
        }
        long j6 = this.f27224K;
        return j6 == com.anythink.basead.exoplayer.b.f6382b || j6 - (c3996uN.f34529f - this.f27255a1.f27027c) <= 100000;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean J() {
        if (!this.f27251X0) {
            return false;
        }
        A0 a02 = this.f28813y1;
        return a02 == null || a02.j();
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final int M(C3084dP c3084dP, DP dp) {
        boolean z3;
        int i = 26;
        String str = dp.f24431o;
        if (!H4.b(str)) {
            return 128;
        }
        int i6 = 0;
        boolean z6 = dp.f24435s != null;
        Context context = this.f28801k1;
        List G02 = G0(context, c3084dP, dp, z6, false);
        if (z6 && G02.isEmpty()) {
            G02 = G0(context, c3084dP, dp, false, false);
        }
        if (G02.isEmpty()) {
            return com.anythink.expressad.video.module.a.a.f21730T;
        }
        if (dp.f24416P != 0) {
            return com.anythink.expressad.video.module.a.a.f21731U;
        }
        OP op = (OP) G02.get(0);
        boolean b9 = op.b(context, dp);
        if (!b9) {
            for (int i9 = 1; i9 < G02.size(); i9++) {
                OP op2 = (OP) G02.get(i9);
                if (op2.b(context, dp)) {
                    b9 = true;
                    z3 = false;
                    op = op2;
                    break;
                }
            }
        }
        z3 = true;
        int i10 = true != b9 ? 3 : 4;
        int i11 = true != op.c(dp) ? 8 : 16;
        int i12 = true != op.f26610g ? 0 : 64;
        int i13 = true != z3 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC2639Kg.k(context)) {
            i13 = 256;
        }
        if (b9) {
            List G03 = G0(context, c3084dP, dp, z6, true);
            if (!G03.isEmpty()) {
                HashMap hashMap = WP.f28354a;
                ArrayList arrayList = new ArrayList(G03);
                Collections.sort(arrayList, new UP(new S0.e(i, context, dp)));
                OP op3 = (OP) arrayList.get(0);
                if (op3.b(context, dp) && op3.c(dp)) {
                    i6 = 32;
                }
            }
        }
        return i10 | i11 | i6 | i12 | i13;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final ArrayList O(C3084dP c3084dP, DP dp) {
        Context context = this.f28801k1;
        List G02 = G0(context, c3084dP, dp, false, false);
        HashMap hashMap = WP.f28354a;
        ArrayList arrayList = new ArrayList(G02);
        Collections.sort(arrayList, new UP(new S0.e(26, context, dp)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final C3864s R(OP op, DP dp, float f3) {
        KJ kj;
        int i;
        X2.b bVar;
        Point point;
        int i6;
        int i9;
        int i10;
        boolean z3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        DP[] dpArr;
        int i11;
        char c9;
        int i12;
        Pair c10;
        int A02;
        DP[] dpArr2 = this.f27210C;
        dpArr2.getClass();
        int length = dpArr2.length;
        int E02 = E0(op, dp);
        float f9 = dp.f24442z;
        KJ kj2 = dp.f24407F;
        int i13 = dp.f24439w;
        int i14 = dp.f24438v;
        if (length == 1) {
            if (E02 != -1 && (A02 = A0(op, dp)) != -1) {
                E02 = Math.min((int) (E02 * 1.5f), A02);
            }
            bVar = new X2.b(i14, i13, E02, false);
            kj = kj2;
            i = i13;
        } else {
            int i15 = i13;
            int i16 = i14;
            int i17 = 0;
            boolean z6 = false;
            while (i17 < length) {
                DP dp2 = dpArr2[i17];
                if (kj2 != null && dp2.f24407F == null) {
                    C3299hP c3299hP = new C3299hP(dp2);
                    c3299hP.f30770E = kj2;
                    dp2 = new DP(c3299hP);
                }
                if (op.d(dp, dp2).f35155d != 0) {
                    int i18 = dp2.f24439w;
                    dpArr = dpArr2;
                    int i19 = dp2.f24438v;
                    i11 = length;
                    c9 = 65535;
                    z6 |= i19 == -1 || i18 == -1;
                    i16 = Math.max(i16, i19);
                    i15 = Math.max(i15, i18);
                    E02 = Math.max(E02, E0(op, dp2));
                } else {
                    dpArr = dpArr2;
                    i11 = length;
                    c9 = 65535;
                }
                i17++;
                dpArr2 = dpArr;
                length = i11;
            }
            if (z6) {
                AbstractC2968bG.y("MediaCodecVideoRenderer", D.y.r(new StringBuilder(String.valueOf(i16).length() + 44 + String.valueOf(i15).length()), "Resolutions unknown. Codec max resolution: ", i16, "x", i15));
                boolean z9 = i13 > i14;
                int i20 = z9 ? i13 : i14;
                int i21 = true != z9 ? i13 : i14;
                int[] iArr = f28775a2;
                kj = kj2;
                int i22 = 0;
                while (true) {
                    Point point2 = null;
                    if (i22 >= 9) {
                        break;
                    }
                    float f10 = i21;
                    int i23 = i22;
                    float f11 = i20;
                    int i24 = iArr[i23];
                    float f12 = i24;
                    if (i24 <= i20 || (i6 = (int) (f12 * (f10 / f11))) <= i21) {
                        break;
                    }
                    if (true != z9) {
                        i9 = i21;
                        i10 = i24;
                    } else {
                        i9 = i21;
                        i10 = i6;
                    }
                    int i25 = true == z9 ? i24 : i6;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = op.f26607d;
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                        point2 = OP.j(videoCapabilities, i10, i25);
                    }
                    point = point2;
                    if (point != null) {
                        z3 = z9;
                        i = i13;
                        if (op.e(point.x, point.y, f9)) {
                            break;
                        }
                    } else {
                        z3 = z9;
                        i = i13;
                    }
                    i22 = i23 + 1;
                    z9 = z3;
                    i21 = i9;
                    i13 = i;
                }
                i = i13;
                point = null;
                if (point != null) {
                    i16 = Math.max(i16, point.x);
                    i15 = Math.max(i15, point.y);
                    C3299hP c3299hP2 = new C3299hP(dp);
                    c3299hP2.f30799u = i16;
                    c3299hP2.f30800v = i15;
                    E02 = Math.max(E02, A0(op, new DP(c3299hP2)));
                    AbstractC2968bG.y("MediaCodecVideoRenderer", D.y.r(new StringBuilder(AbstractC4404f.b(i16, 35) + String.valueOf(i15).length()), "Codec max resolution adjusted to: ", i16, "x", i15));
                }
            } else {
                kj = kj2;
                i = i13;
            }
            bVar = new X2.b(i16, i15, E02, false);
        }
        String str = op.f26606c;
        this.f28810v1 = bVar;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i14);
        mediaFormat.setInteger("height", i);
        AbstractC2968bG.i(mediaFormat, dp.f24434r);
        if (f9 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f9);
        }
        AbstractC2968bG.s(mediaFormat, "rotation-degrees", dp.f24402A);
        if (kj != null) {
            KJ kj3 = kj;
            AbstractC2968bG.s(mediaFormat, "color-transfer", kj3.f25899c);
            AbstractC2968bG.s(mediaFormat, "color-standard", kj3.f25897a);
            AbstractC2968bG.s(mediaFormat, "color-range", kj3.f25898b);
            byte[] bArr = kj3.f25900d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(dp.f24431o) && (c10 = AbstractC4228ym.c(dp)) != null) {
            AbstractC2968bG.s(mediaFormat, "profile", ((Integer) c10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f3771a);
        mediaFormat.setInteger("max-height", bVar.f3772b);
        AbstractC2968bG.s(mediaFormat, "max-input-size", bVar.f3773c);
        mediaFormat.setInteger("priority", 0);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f3);
        }
        if (this.n1) {
            mediaFormat.setInteger("no-post-process", 1);
            i12 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i12 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(i12, -this.f28795U1));
        }
        i0(mediaFormat);
        Surface D02 = D0(op);
        if (this.f28813y1 != null && !AbstractC3159eu.l(this.f28801k1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C3864s(op, mediaFormat, dp, D02, null, 12);
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final C4212yN S(OP op, DP dp, DP dp2, boolean z3) {
        int i;
        int i6;
        int i9;
        C4212yN d2 = op.d(dp, dp2);
        X2.b bVar = this.f28810v1;
        bVar.getClass();
        int i10 = dp2.f24438v;
        int i11 = bVar.f3771a;
        int i12 = d2.f35156e;
        if (i10 > i11 || dp2.f24439w > bVar.f3772b) {
            i12 |= 256;
        }
        if (E0(op, dp2) > bVar.f3773c) {
            i12 |= 64;
        }
        if (this.H1 != Integer.MIN_VALUE && (i9 = Build.VERSION.SDK_INT) < 31 && (i9 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f3 = dp.f24442z;
            if (f3 != -1.0f) {
                float f9 = dp2.f24442z;
                if (f9 != -1.0f && (!op.f26609f || !z3)) {
                    if (Math.abs((Math.max(f9, f3) / Math.min(f9, f3)) - Math.round(r15)) > 0.01f) {
                        i12 |= com.anythink.basead.exoplayer.b.aX;
                    }
                }
            }
        }
        if (i12 != 0) {
            i6 = 0;
            i = i12;
        } else {
            i = 0;
            i6 = d2.f35155d;
        }
        return new C4212yN(op.f26604a, dp, dp2, i6, i);
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final float U(float f3, DP dp, DP[] dpArr) {
        OP op;
        float f9 = -1.0f;
        for (DP dp2 : dpArr) {
            float f10 = dp2.f24442z;
            if (f10 != -1.0f) {
                f9 = Math.max(f9, f10);
            }
        }
        if (f9 == -1.0f && this.f27270s0 != null) {
            if (this.f28805q1.b() != com.anythink.basead.exoplayer.b.f6382b) {
                f9 = 1.0E9f / r10.b();
            }
        }
        float f11 = f9 == -1.0f ? -1.0f : f9 * f3;
        if (this.f28788M1 == null || (op = this.f27283z0) == null) {
            return f11;
        }
        int i = dp.f24438v;
        float f12 = -3.4028235E38f;
        if (op.i) {
            float f13 = op.f26614l;
            int i6 = dp.f24439w;
            if (f13 != -3.4028235E38f && op.f26612j == i && op.f26613k == i6) {
                f12 = f13;
            } else {
                f12 = 1024.0f;
                if (!op.e(i, i6, 1024.0d)) {
                    float f14 = 0.0f;
                    while (true) {
                        float f15 = f12 - f14;
                        if (Math.abs(f15) <= 5.0f) {
                            break;
                        }
                        float f16 = (f15 / 2.0f) + f14;
                        boolean e9 = op.e(i, i6, f16);
                        if (true == e9) {
                            f14 = f16;
                        }
                        if (true != e9) {
                            f12 = f16;
                        }
                    }
                    f12 = f14;
                }
                op.f26614l = f12;
                op.f26612j = i;
                op.f26613k = i6;
            }
        }
        return f11 != -1.0f ? Math.max(f11, f12) : f12;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void V(String str, long j6, long j9) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        S0.e eVar = this.f28803m1;
        Handler handler = (Handler) eVar.f2781u;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC3811r0(eVar, str2, j6, j9));
        } else {
            str2 = str;
        }
        this.f28811w1 = F0(str2);
        OP op = this.f27283z0;
        op.getClass();
        boolean z3 = false;
        if (Build.VERSION.SDK_INT >= 29 && com.anythink.basead.exoplayer.k.o.f8453k.equals(op.f26605b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = op.f26607d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z3 = true;
                    break;
                }
                i++;
            }
        }
        this.f28812x1 = z3;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void W(String str) {
        S0.e eVar = this.f28803m1;
        Handler handler = (Handler) eVar.f2781u;
        if (handler != null) {
            handler.post(new RunnableC3811r0(eVar, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void X(Exception exc) {
        AbstractC2968bG.J("MediaCodecVideoRenderer", "Video codec error", exc);
        S0.e eVar = this.f28803m1;
        Handler handler = (Handler) eVar.f2781u;
        if (handler != null) {
            handler.post(new RunnableC3811r0(eVar, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final C4212yN Y(S0.l lVar) {
        C4212yN Y = super.Y(lVar);
        DP dp = (DP) lVar.f2798v;
        dp.getClass();
        S0.e eVar = this.f28803m1;
        Handler handler = (Handler) eVar.f2781u;
        if (handler != null) {
            handler.post(new RunnableC3865s0(0, eVar, dp, Y));
        }
        C3488l0 c3488l0 = this.f28808t1;
        if (c3488l0 != null) {
            c3488l0.c();
        }
        return Y;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void Z(DP dp, MediaFormat mediaFormat) {
        LP lp = this.f27270s0;
        if (lp != null) {
            lp.u(this.f28783G1);
        }
        mediaFormat.getClass();
        boolean z3 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z3 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z3 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f3 = dp.f24404C;
        int i = dp.f24402A;
        if (i == 90 || i == 270) {
            f3 = 1.0f / f3;
            int i6 = integer2;
            integer2 = integer;
            integer = i6;
        }
        this.f28793S1 = new C3035cd(integer, integer2, f3);
        A0 a02 = this.f28813y1;
        if (a02 == null || !this.f28799Y1) {
            U u3 = this.f28805q1;
            u3.f27841f = dp.f24442z;
            u3.f27836a.a();
            u3.f27837b.a();
            u3.f27838c = false;
            u3.f27839d = com.anythink.basead.exoplayer.b.f6382b;
            u3.f27840e = 0;
            u3.c();
        } else {
            C3299hP c3299hP = new C3299hP(dp);
            c3299hP.f30799u = integer;
            c3299hP.f30800v = integer2;
            c3299hP.f30767B = f3;
            DP dp2 = new DP(c3299hP);
            int i9 = this.f28778A1;
            List list = this.f28779B1;
            if (list == null) {
                list = C3500lC.f31745x;
            }
            a02.w0(dp2, this.f27255a1.f27026b, i9, list);
            this.f28778A1 = 2;
        }
        this.f28799Y1 = false;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void a0() {
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            a02.n();
            long j6 = this.f28798X1;
            if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                j6 = this.f27255a1.f27026b;
                this.f28798X1 = j6;
            }
            this.f28813y1.v0(-j6);
        } else {
            this.f28804o1.a(2);
        }
        this.f28799Y1 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3674oO
    public final void b(int i, Object obj) {
        if (i == 1) {
            H0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC3328i0 interfaceC3328i0 = (InterfaceC3328i0) obj;
            this.f28797W1 = interfaceC3328i0;
            A0 a02 = this.f28813y1;
            if (a02 != null) {
                a02.r0(interfaceC3328i0);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f28796V1 != intValue) {
                this.f28796V1 = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f28783G1 = intValue2;
            LP lp = this.f27270s0;
            if (lp != null) {
                lp.u(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.H1 = intValue3;
            A0 a03 = this.f28813y1;
            if (a03 != null) {
                a03.q0(intValue3);
                return;
            }
            C3704p0 c3704p0 = this.f28804o1.f31360b;
            if (c3704p0.f32994h == intValue3) {
                return;
            }
            c3704p0.f32994h = intValue3;
            c3704p0.b(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC3787qc.f33246a)) {
                A0 a04 = this.f28813y1;
                if (a04 == null || !a04.d()) {
                    return;
                }
                a04.e();
                return;
            }
            this.f28779B1 = list;
            A0 a05 = this.f28813y1;
            if (a05 != null) {
                a05.s0(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            Nr nr = (Nr) obj;
            if (nr.f26558a == 0 || nr.f26559b == 0) {
                return;
            }
            this.E1 = nr;
            A0 a06 = this.f28813y1;
            if (a06 != null) {
                Surface surface = this.f28780C1;
                surface.getClass();
                a06.n0(surface, nr);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f28795U1 = ((Integer) obj).intValue();
                LP lp2 = this.f27270s0;
                if (lp2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f28795U1));
                    lp2.j(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f28780C1;
                H0(null);
                obj.getClass();
                ((Z) obj).b(1, surface2);
                break;
            case 18:
                boolean z3 = this.f28788M1 != null;
                C3943tO c3943tO = (C3943tO) obj;
                this.f28788M1 = c3943tO;
                if (z3 != (c3943tO != null)) {
                    j0(this.f27271t0);
                    break;
                }
                break;
            default:
                if (i == 11) {
                    QN qn = (QN) obj;
                    qn.getClass();
                    this.f27266o0 = qn;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean b0(long j6, long j9, LP lp, ByteBuffer byteBuffer, int i, int i6, int i9, long j10, boolean z3, boolean z6, DP dp) {
        U u3;
        lp.getClass();
        long j11 = j10 - this.f27255a1.f27027c;
        int i10 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f28809u1;
            Long l9 = (Long) priorityQueue.peek();
            u3 = this.f28805q1;
            if (l9 == null || l9.longValue() >= j10) {
                break;
            }
            priorityQueue.poll();
            u3.a(l9.longValue() * 1000);
            if (l9.longValue() >= this.f27213E) {
                i10++;
            }
        }
        w0(i10, 0);
        u3.a(j10 * 1000);
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            if (!z3 || z6) {
                return a02.t0(j10, new X(this, lp, i, j11));
            }
            B0(lp, i);
            return true;
        }
        long j12 = this.f27255a1.f27026b;
        long b9 = u3.b();
        long j13 = u3.f27843h;
        C3434k0 c3434k0 = this.f28804o1;
        C3380j0 c3380j0 = this.p1;
        int e9 = c3434k0.e(j10, j6, j9, j12, z3, z6, b9, j13, c3380j0);
        C3488l0 c3488l0 = this.f28808t1;
        if (c3488l0 != null) {
            if (e9 != 5 && e9 != 4) {
                c3488l0.a(j10, c3380j0.f31153a);
            }
            return false;
        }
        if (e9 == 0) {
            this.f27282z.getClass();
            long nanoTime = System.nanoTime();
            InterfaceC3328i0 interfaceC3328i0 = this.f28797W1;
            if (interfaceC3328i0 != null) {
                interfaceC3328i0.a(j11, nanoTime, dp, this.f27273u0);
            }
            y0(lp, i, nanoTime);
            x0(c3380j0.f31153a);
            return true;
        }
        if (e9 == 1) {
            long j14 = c3380j0.f31154b;
            long j15 = c3380j0.f31153a;
            if (j14 == this.f28792R1) {
                B0(lp, i);
            } else {
                InterfaceC3328i0 interfaceC3328i02 = this.f28797W1;
                if (interfaceC3328i02 != null) {
                    interfaceC3328i02.a(j11, j14, dp, this.f27273u0);
                }
                y0(lp, i, j14);
            }
            x0(j15);
            this.f28792R1 = j14;
            return true;
        }
        if (e9 != 2) {
            if (e9 == 3) {
                B0(lp, i);
                x0(c3380j0.f31153a);
                return true;
            }
            return false;
        }
        Trace.beginSection("dropVideoBuffer");
        lp.q(i);
        Trace.endSection();
        w0(0, 1);
        x0(c3380j0.f31153a);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void c(long j6, boolean z3, boolean z6) {
        A0 a02 = this.f28813y1;
        if (a02 != null && !z3) {
            a02.l0(true);
        }
        if (z6) {
            this.f28789N1 = j6;
        }
        super.c(j6, z3, z6);
        A0 a03 = this.f28813y1;
        C3434k0 c3434k0 = this.f28804o1;
        if (a03 == null) {
            c3434k0.f31360b.a();
            c3434k0.f31363e = com.anythink.basead.exoplayer.b.f6382b;
            c3434k0.f31362d = Math.min(c3434k0.f31362d, 1);
            c3434k0.f31367j = false;
        }
        C3488l0 c3488l0 = this.f28808t1;
        if (c3488l0 != null) {
            c3488l0.c();
        }
        if (z3) {
            A0 a04 = this.f28813y1;
            if (a04 != null) {
                a04.u0(false);
            } else {
                c3434k0.getClass();
            }
        }
        this.f28786K1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void c0(C4104wN c4104wN) {
        S0.e eVar = this.f28803m1;
        Handler handler = (Handler) eVar.f2781u;
        if (handler != null) {
            handler.post(new RunnableC3973u0(2, eVar, c4104wN));
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void d() {
        this.f28785J1 = 0;
        this.f27282z.getClass();
        this.f28784I1 = SystemClock.elapsedRealtime();
        this.P1 = 0L;
        this.f28791Q1 = 0;
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            a02.c();
        } else {
            this.f28804o1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void d0() {
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            a02.n();
        } else {
            long j6 = this.f27255a1.f27030f;
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void e() {
        int i = this.f28785J1;
        final S0.e eVar = this.f28803m1;
        if (i > 0) {
            this.f27282z.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j6 = elapsedRealtime - this.f28784I1;
            final int i6 = this.f28785J1;
            Handler handler = (Handler) eVar.f2781u;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        S0.e eVar2 = eVar;
                        eVar2.getClass();
                        String str = AbstractC3159eu.f29993a;
                        BO bo = ((HN) eVar2.f2782v).f25264n.f26780K;
                        C4159xO v9 = bo.v((C3676oQ) bo.f23898d.f27699x);
                        bo.s(v9, 1018, new N6.i(v9, i6, j6));
                    }
                });
            }
            this.f28785J1 = 0;
            this.f28784I1 = elapsedRealtime;
        }
        int i9 = this.f28791Q1;
        if (i9 != 0) {
            long j9 = this.P1;
            Handler handler2 = (Handler) eVar.f2781u;
            if (handler2 != null) {
                handler2.post(new RunnableC3811r0(i9, j9, eVar));
            }
            this.P1 = 0L;
            this.f28791Q1 = 0;
        }
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            a02.f();
        } else {
            C3434k0 c3434k0 = this.f28804o1;
            c3434k0.f31361c = false;
            C3704p0 c3704p0 = c3434k0.f31360b;
            c3704p0.f32989c = false;
            AbstractC3542m0 abstractC3542m0 = c3704p0.f32988b;
            if (abstractC3542m0 != null) {
                abstractC3542m0.b();
            }
            c3704p0.c();
        }
        C3488l0 c3488l0 = this.f28808t1;
        if (c3488l0 != null) {
            c3488l0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void f() {
        S0.e eVar = this.f28803m1;
        this.f28794T1 = null;
        this.f28782F1 = false;
        this.f28790O1 = true;
        try {
            super.f();
            C4158xN c4158xN = this.f27254Z0;
            eVar.getClass();
            synchronized (c4158xN) {
            }
            Handler handler = (Handler) eVar.f2781u;
            if (handler != null) {
                handler.post(new RunnableC3973u0(1, eVar, c4158xN));
            }
            eVar.C(C3035cd.f29500d);
        } catch (Throwable th) {
            C4158xN c4158xN2 = this.f27254Z0;
            eVar.getClass();
            synchronized (c4158xN2) {
                Handler handler2 = (Handler) eVar.f2781u;
                if (handler2 != null) {
                    handler2.post(new RunnableC3973u0(1, eVar, c4158xN2));
                }
                eVar.C(C3035cd.f29500d);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void f0(C3996uN c3996uN) {
        if (this.f28812x1) {
            ByteBuffer byteBuffer = c3996uN.f34530g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b9 = byteBuffer.get();
                short s9 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b9 == -75 && s9 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        LP lp = this.f27270s0;
                        lp.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lp.j(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void h0(long j6) {
        super.h0(j6);
        this.f28787L1--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.RP
    public final void i() {
        try {
            try {
                this.f27225K0 = false;
                g0();
                x();
            } finally {
                this.f27265n0 = null;
            }
        } finally {
            this.f28814z1 = false;
            this.f28798X1 = com.anythink.basead.exoplayer.b.f6382b;
            C2952b0 c2952b0 = this.f28781D1;
            if (c2952b0 != null) {
                c2952b0.release();
                this.f28781D1 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void k() {
        A0 a02 = this.f28813y1;
        if (a02 == null || !this.f28802l1) {
            return;
        }
        a02.I();
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final String p() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean q(long j6) {
        if (this.f27245U0 == com.anythink.basead.exoplayer.b.f6382b || j6 < this.f28789N1) {
            return false;
        }
        long j9 = this.f27256b1;
        return j9 == com.anythink.basead.exoplayer.b.f6382b || j6 > j9;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void r(float f3, float f9) {
        super.r(f3, f9);
        A0 a02 = this.f28813y1;
        if (a02 != null) {
            a02.m0(f3);
        } else {
            this.f28804o1.f(f3);
        }
        C3488l0 c3488l0 = this.f28808t1;
        if (c3488l0 != null) {
            c3488l0.b(f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void s() {
        A0 a02 = this.f28813y1;
        if (a02 == null) {
            C3434k0 c3434k0 = this.f28804o1;
            if (c3434k0.f31362d == 0) {
                c3434k0.f31362d = 1;
                return;
            }
            return;
        }
        int i = this.f28778A1;
        if (i == 0 || i == 1) {
            this.f28778A1 = 0;
        } else {
            a02.N();
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void u0(boolean z3, boolean z6) {
        A0 a02;
        this.f27254Z0 = new C4158xN();
        l();
        C4158xN c4158xN = this.f27254Z0;
        S0.e eVar = this.f28803m1;
        Handler handler = (Handler) eVar.f2781u;
        if (handler != null) {
            handler.post(new RunnableC3811r0(eVar, c4158xN, 4));
        }
        boolean z9 = this.f28814z1;
        C3434k0 c3434k0 = this.f28804o1;
        if (!z9) {
            if (this.f28779B1 != null && this.f28813y1 == null) {
                C3005c0 c3005c0 = new C3005c0(this.f28801k1, c3434k0);
                c3005c0.f29403d = true;
                c3005c0.f29406g = -this.f28807s1;
                V2 v22 = this.f27282z;
                v22.getClass();
                c3005c0.f29404e = v22;
                AbstractC2772Sd.H(!c3005c0.f29405f);
                if (c3005c0.f29402c == null) {
                    c3005c0.f29402c = new C3166f0();
                }
                C3274h0 c3274h0 = new C3274h0(c3005c0);
                c3005c0.f29405f = true;
                c3274h0.f30713p = 1;
                SparseArray sparseArray = c3274h0.f30701c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    a02 = (A0) sparseArray.get(0);
                } else {
                    C3059d0 c3059d0 = new C3059d0(c3274h0, c3274h0.f30699a);
                    c3274h0.f30705g.add(c3059d0);
                    sparseArray.put(0, c3059d0);
                    a02 = c3059d0;
                }
                this.f28813y1 = a02;
            }
            this.f28814z1 = true;
        }
        int i = !z6 ? 1 : 0;
        A0 a03 = this.f28813y1;
        if (a03 == null) {
            V2 v23 = this.f27282z;
            v23.getClass();
            c3434k0.f31366h = v23;
            c3434k0.a(i);
            return;
        }
        a03.o0(new W(this));
        InterfaceC3328i0 interfaceC3328i0 = this.f28797W1;
        if (interfaceC3328i0 != null) {
            this.f28813y1.r0(interfaceC3328i0);
        }
        if (this.f28780C1 != null && !this.E1.equals(Nr.f26557c)) {
            this.f28813y1.n0(this.f28780C1, this.E1);
        }
        this.f28813y1.q0(this.H1);
        this.f28813y1.m0(this.f27268q0);
        List list = this.f28779B1;
        if (list != null) {
            this.f28813y1.s0(list);
        }
        this.f28778A1 = i;
        this.f27258d1 = true;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final void v0(DP[] dpArr, long j6, long j9, C3676oQ c3676oQ) {
        super.v0(dpArr, j6, j9, c3676oQ);
        C3488l0 c3488l0 = this.f28808t1;
        if (c3488l0 != null) {
            c3488l0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean w(OP op) {
        return C0(op);
    }

    public final void w0(int i, int i6) {
        C4158xN c4158xN = this.f27254Z0;
        c4158xN.f35000h += i;
        int i9 = i + i6;
        c4158xN.f34999g += i9;
        this.f28785J1 += i9;
        int i10 = this.f28786K1 + i9;
        this.f28786K1 = i10;
        c4158xN.i = Math.max(i10, c4158xN.i);
    }

    public final void x0(long j6) {
        C4158xN c4158xN = this.f27254Z0;
        c4158xN.f35002k += j6;
        c4158xN.f35003l++;
        this.P1 += j6;
        this.f28791Q1++;
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean y() {
        OP op = this.f27283z0;
        if (this.f28813y1 != null && op != null) {
            String str = op.f26604a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.y();
    }

    public final void y0(LP lp, int i, long j6) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lp.y(i, j6);
        Trace.endSection();
        this.f27254Z0.f34997e++;
        this.f28786K1 = 0;
        if (this.f28813y1 == null) {
            C3035cd c3035cd = this.f28793S1;
            boolean equals = c3035cd.equals(C3035cd.f29500d);
            S0.e eVar = this.f28803m1;
            if (!equals && !c3035cd.equals(this.f28794T1)) {
                this.f28794T1 = c3035cd;
                eVar.C(c3035cd);
            }
            C3434k0 c3434k0 = this.f28804o1;
            int i6 = c3434k0.f31362d;
            c3434k0.f31362d = 3;
            c3434k0.f31366h.getClass();
            c3434k0.f31364f = AbstractC3159eu.u(SystemClock.elapsedRealtime());
            if (i6 == 3 || (surface = this.f28780C1) == null) {
                return;
            }
            Handler handler = (Handler) eVar.f2781u;
            if (handler != null) {
                handler.post(new RunnableC4027v0(eVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f28782F1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.RP
    public final boolean z() {
        boolean z3;
        DP dp = this.f27271t0;
        long j6 = this.f27224K;
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            if (this.f27260f1 + 1 + j6 <= Long.MAX_VALUE - (this.f27255a1.f27027c + j6)) {
                z3 = false;
                return this.f28788M1 == null || this.f28790O1 || (dp != null && dp.f24433q > 0) || z3 || this.f27255a1.f27030f != com.anythink.basead.exoplayer.b.f6382b;
            }
        }
        z3 = true;
        if (this.f28788M1 == null) {
        }
    }

    public final boolean z0(long j6, long j9, boolean z3, boolean z6) {
        if (this.f28813y1 != null && this.f28802l1) {
            j9 -= -this.f28798X1;
        }
        if (j6 < -500000 && !z3) {
            IQ iq = this.f27208B;
            iq.getClass();
            int a9 = iq.a(j9 - this.f27211D);
            if (a9 != 0) {
                this.f28789N1 = j9;
                Iterator it = this.f28809u1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((Long) it.next()).longValue() >= this.f27213E) {
                        i++;
                    }
                }
                if (z6) {
                    C4158xN c4158xN = this.f27254Z0;
                    int i6 = c4158xN.f34996d + a9;
                    c4158xN.f34998f += this.f28787L1;
                    c4158xN.f34996d = i6 + i;
                } else {
                    this.f27254Z0.f35001j++;
                    w0(a9 + i, this.f28787L1);
                }
                if (this.f27270s0 != null) {
                    if (y()) {
                        x();
                        v();
                    } else if (z()) {
                        t();
                    } else {
                        this.f27259e1 = true;
                    }
                }
                A0 a02 = this.f28813y1;
                if (a02 != null) {
                    a02.l0(false);
                }
                return true;
            }
        }
        return false;
    }
}
