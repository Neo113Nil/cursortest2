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
public final class Z extends SP {

    /* renamed from: V1, reason: collision with root package name */
    public static final int[] f29555V1 = {1920, 1600, com.onesignal.core.internal.config.e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1280, 960, 854, 640, 540, 480};

    /* renamed from: W1, reason: collision with root package name */
    public static boolean f29556W1;

    /* renamed from: X1, reason: collision with root package name */
    public static boolean f29557X1;

    /* renamed from: A1, reason: collision with root package name */
    public boolean f29558A1;

    /* renamed from: B1, reason: collision with root package name */
    public int f29559B1;

    /* renamed from: C1, reason: collision with root package name */
    public int f29560C1;

    /* renamed from: D1, reason: collision with root package name */
    public long f29561D1;

    /* renamed from: E1, reason: collision with root package name */
    public int f29562E1;

    /* renamed from: F1, reason: collision with root package name */
    public int f29563F1;
    public int G1;

    /* renamed from: H1, reason: collision with root package name */
    public C3966tO f29564H1;

    /* renamed from: I1, reason: collision with root package name */
    public long f29565I1;
    public boolean J1;

    /* renamed from: K1, reason: collision with root package name */
    public long f29566K1;

    /* renamed from: L1, reason: collision with root package name */
    public int f29567L1;

    /* renamed from: M1, reason: collision with root package name */
    public long f29568M1;

    /* renamed from: N1, reason: collision with root package name */
    public C3058cd f29569N1;

    /* renamed from: O1, reason: collision with root package name */
    public C3058cd f29570O1;

    /* renamed from: P1, reason: collision with root package name */
    public int f29571P1;

    /* renamed from: Q1, reason: collision with root package name */
    public int f29572Q1;
    public InterfaceC3351i0 R1;

    /* renamed from: S1, reason: collision with root package name */
    public long f29573S1;

    /* renamed from: T1, reason: collision with root package name */
    public boolean f29574T1;

    /* renamed from: U1, reason: collision with root package name */
    public int f29575U1;

    /* renamed from: f1, reason: collision with root package name */
    public final Context f29576f1;

    /* renamed from: g1, reason: collision with root package name */
    public final boolean f29577g1;

    /* renamed from: h1, reason: collision with root package name */
    public final S0.e f29578h1;

    /* renamed from: i1, reason: collision with root package name */
    public final boolean f29579i1;

    /* renamed from: j1, reason: collision with root package name */
    public final C3457k0 f29580j1;

    /* renamed from: k1, reason: collision with root package name */
    public final C3403j0 f29581k1;

    /* renamed from: l1, reason: collision with root package name */
    public final U f29582l1;

    /* renamed from: m1, reason: collision with root package name */
    public final C3067cm f29583m1;

    /* renamed from: n1, reason: collision with root package name */
    public final long f29584n1;

    /* renamed from: o1, reason: collision with root package name */
    public final C3511l0 f29585o1;
    public final PriorityQueue p1;

    /* renamed from: q1, reason: collision with root package name */
    public A3.r f29586q1;
    public boolean r1;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f29587s1;

    /* renamed from: t1, reason: collision with root package name */
    public A0 f29588t1;

    /* renamed from: u1, reason: collision with root package name */
    public boolean f29589u1;

    /* renamed from: v1, reason: collision with root package name */
    public int f29590v1;

    /* renamed from: w1, reason: collision with root package name */
    public List f29591w1;

    /* renamed from: x1, reason: collision with root package name */
    public Surface f29592x1;

    /* renamed from: y1, reason: collision with root package name */
    public C2975b0 f29593y1;

    /* renamed from: z1, reason: collision with root package name */
    public Nr f29594z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Z(Y y7) {
        super(r1.getApplicationContext(), 2, (C3216fa) y7.f29401d, r0);
        C3107dP c3107dP = (C3107dP) y7.f29400c;
        Context context = (Context) y7.f29399b;
        Context applicationContext = context.getApplicationContext();
        this.f29576f1 = applicationContext;
        this.f29588t1 = null;
        this.f29578h1 = new S0.e((Handler) y7.f29402e, (HN) y7.f29403f);
        this.f29577g1 = this.f29588t1 == null;
        this.f29580j1 = new C3457k0(applicationContext, this);
        this.f29581k1 = new C3403j0();
        this.f29582l1 = new U(new C3680o7(2, this));
        this.f29579i1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f29594z1 = Nr.f27339c;
        this.f29559B1 = 1;
        this.f29560C1 = 0;
        this.f29569N1 = C3058cd.f30285d;
        this.f29572Q1 = 0;
        this.f29570O1 = null;
        this.f29571P1 = -1000;
        this.f29573S1 = com.anythink.basead.exoplayer.b.f7168b;
        this.f29583m1 = new C3067cm(9);
        this.p1 = new PriorityQueue();
        this.f29584n1 = -15000L;
        this.f29585o1 = new C3511l0();
        this.f29564H1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007c, code lost:
    
        if (r3.equals("video/av01") != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0(PP pp, DP dp) {
        int i;
        int i4 = dp.f25183v;
        if (i4 != -1 && (i = dp.f25184w) != -1) {
            String str = dp.f25176o;
            str.getClass();
            char c9 = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair c10 = AbstractC4305zm.c(dp);
                if (c10 != null) {
                    int intValue = ((Integer) c10.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = com.anythink.basead.exoplayer.k.o.f9237h;
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = com.anythink.basead.exoplayer.k.o.i;
            }
            int i6 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f9236g)) {
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
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f9240l)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1331836730:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f9237h)) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1599127256:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f9238j)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1599127257:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f9239k)) {
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
                    return ((i4 * i) * 3) / i6;
                case 4:
                    return Math.max(2097152, ((i4 * i) * 3) / 4);
                case 5:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !pp.f27602f)))) {
                        String str3 = AbstractC3182eu.f30782a;
                        return ((((i + 15) / 16) * ((i4 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i6 = 8;
                    return ((i4 * i) * 3) / i6;
            }
        }
        return -1;
    }

    public static int E0(PP pp, DP dp) {
        int i = dp.f25177p;
        if (i == -1) {
            return A0(pp, dp);
        }
        List list = dp.f25179r;
        int size = list.size();
        int i4 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i4 += ((byte[]) list.get(i6)).length;
        }
        return i + i4;
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
        boolean z6;
        boolean z9;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (Z.class) {
            if (!f29556W1) {
                int i = Build.VERSION.SDK_INT;
                char c9 = 28;
                if (i <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z9 = true;
                                break;
                            }
                            z9 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z9 = 3;
                                break;
                            }
                            z9 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z9 = 2;
                                break;
                            }
                            z9 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z9 = 7;
                                break;
                            }
                            z9 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z9 = false;
                                break;
                            }
                            z9 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z9 = 4;
                                break;
                            }
                            z9 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z9 = 6;
                                break;
                            }
                            z9 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z9 = 5;
                                break;
                            }
                            z9 = -1;
                            break;
                        default:
                            z9 = -1;
                            break;
                    }
                    switch (z9) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z10 = true;
                            break;
                    }
                    f29557X1 = z10;
                    f29556W1 = true;
                }
                if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z6 = 6;
                                break;
                            }
                            z6 = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z6 = 7;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z6 = false;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z6 = true;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z6 = 2;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z6 = 3;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z6 = 4;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z6 = 8;
                                break;
                            }
                            z6 = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
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
                                    case com.anythink.basead.b.b.j.f6592M /* 38 */:
                                    case '\'':
                                    case com.anythink.basead.b.b.j.f6594O /* 40 */:
                                    case ')':
                                    case '*':
                                    case com.anythink.basead.b.b.j.f6597R /* 43 */:
                                    case com.anythink.basead.b.b.j.f6598S /* 44 */:
                                    case com.anythink.basead.b.b.j.f6599T /* 45 */:
                                    case '.':
                                    case '/':
                                    case com.anythink.basead.b.b.j.f6602W /* 48 */:
                                    case com.anythink.basead.b.b.j.f6603X /* 49 */:
                                    case '2':
                                    case '3':
                                    case '4':
                                    case com.anythink.core.common.n.a.i.f15609d /* 53 */:
                                    case '6':
                                    case '7':
                                    case p.a.f20466e /* 56 */:
                                    case '9':
                                    case ':':
                                    case j.v.f13377n /* 59 */:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case j.v.f13362G /* 65 */:
                                    case 'B':
                                    case j.v.f13368d /* 67 */:
                                    case 'D':
                                    case j.v.f13359D /* 69 */:
                                    case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case j.v.f13384u /* 74 */:
                                    case j.v.f13385v /* 75 */:
                                    case j.v.f13389z /* 76 */:
                                    case j.v.f13357B /* 77 */:
                                    case 'N':
                                    case j.v.f13356A /* 79 */:
                                    case j.v.f13358C /* 80 */:
                                    case j.v.f13360E /* 81 */:
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
                                    case j.v.f13363H /* 92 */:
                                    case j.v.f13364I /* 93 */:
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
                                    case com.anythink.expressad.video.module.a.a.f22543z /* 109 */:
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
                                    case com.anythink.expressad.video.module.a.a.f22514Q /* 126 */:
                                    case com.anythink.expressad.video.module.a.a.f22515R /* 127 */:
                                    case 128:
                                    case com.anythink.expressad.video.module.a.a.f22517T /* 129 */:
                                    case com.anythink.expressad.video.module.a.a.f22518U /* 130 */:
                                    case com.anythink.expressad.video.module.a.a.f22519V /* 131 */:
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
                    f29557X1 = z10;
                    f29556W1 = true;
                }
                z10 = true;
                f29557X1 = z10;
                f29556W1 = true;
            }
        }
        return f29557X1;
    }

    public static List G0(Context context, C3107dP c3107dP, DP dp, boolean z6, boolean z9) {
        List a9;
        String str = dp.f25176o;
        if (str == null) {
            return C3523lC.f32525x;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC2659Kg.k(context)) {
            String d9 = ZP.d(dp);
            if (d9 == null) {
                a9 = C3523lC.f32525x;
            } else {
                c3107dP.getClass();
                a9 = ZP.a(d9, z6, z9);
            }
            if (!a9.isEmpty()) {
                return a9;
            }
        }
        return ZP.b(c3107dP, dp, z6, z9);
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void A() {
        super.A();
        this.p1.clear();
        this.G1 = 0;
        this.f29575U1 = 0;
        this.J1 = false;
        C3067cm c3067cm = this.f29583m1;
        if (c3067cm != null) {
            c3067cm.f30366v = null;
            ByteBuffer byteBuffer = (ByteBuffer) c3067cm.f30365u;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    public final void B0(MP mp, int i) {
        Trace.beginSection("skipVideoBuffer");
        mp.t(i);
        Trace.endSection();
        this.f28235U0.f35779f++;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final OP C(IllegalStateException illegalStateException, PP pp) {
        Surface surface = this.f29592x1;
        V v9 = new V(illegalStateException, pp);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return v9;
    }

    public final boolean C0(PP pp) {
        if (this.f29588t1 != null) {
            return true;
        }
        Surface surface = this.f29592x1;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && pp.f27604h) {
            return true;
        }
        if (F0(pp.f27597a)) {
            return false;
        }
        return !pp.f27602f || C2975b0.a(this.f29576f1);
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void D(DP dp) {
        A0 a02 = this.f29588t1;
        if (a02 == null || a02.d()) {
            return;
        }
        try {
            a02.x0(dp);
        } catch (C4266z0 e9) {
            throw n(e9, dp, false, 7000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface D0(PP pp) {
        boolean z6;
        HandlerThreadC2921a0 handlerThreadC2921a0;
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            return a02.k();
        }
        Surface surface = this.f29592x1;
        if (surface != null) {
            return surface;
        }
        boolean z9 = false;
        if (Build.VERSION.SDK_INT >= 35 && pp.f27604h) {
            return null;
        }
        AbstractC2792Sd.H(!F0(pp.f27597a) && (!pp.f27602f || C2975b0.a(this.f29576f1)));
        C2975b0 c2975b0 = this.f29593y1;
        if (c2975b0 != null) {
            if (c2975b0.f29966n != pp.f27602f && c2975b0 != null) {
                c2975b0.release();
                this.f29593y1 = null;
            }
        }
        if (this.f29593y1 == null) {
            Context context = this.f29576f1;
            boolean z10 = pp.f27602f;
            if (!z10) {
                int i = C2975b0.f29964w;
            } else if (!C2975b0.a(context)) {
                z6 = false;
                AbstractC2792Sd.H(z6);
                handlerThreadC2921a0 = new HandlerThreadC2921a0("ExoPlayer:PlaceholderSurface");
                int i4 = !z10 ? C2975b0.f29964w : 0;
                handlerThreadC2921a0.start();
                Handler handler = new Handler(handlerThreadC2921a0.getLooper(), handlerThreadC2921a0);
                handlerThreadC2921a0.f29761u = handler;
                handlerThreadC2921a0.f29760n = new RunnableC4144wn(handler);
                synchronized (handlerThreadC2921a0) {
                    handlerThreadC2921a0.f29761u.obtainMessage(1, i4, 0).sendToTarget();
                    while (handlerThreadC2921a0.f29764x == null && handlerThreadC2921a0.f29763w == null && handlerThreadC2921a0.f29762v == null) {
                        try {
                            handlerThreadC2921a0.wait();
                        } catch (InterruptedException unused) {
                            z9 = true;
                        }
                    }
                }
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = handlerThreadC2921a0.f29763w;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = handlerThreadC2921a0.f29762v;
                if (error != null) {
                    throw error;
                }
                C2975b0 c2975b02 = handlerThreadC2921a0.f29764x;
                c2975b02.getClass();
                this.f29593y1 = c2975b02;
            }
            z6 = true;
            AbstractC2792Sd.H(z6);
            handlerThreadC2921a0 = new HandlerThreadC2921a0("ExoPlayer:PlaceholderSurface");
            if (!z10) {
            }
            handlerThreadC2921a0.start();
            Handler handler2 = new Handler(handlerThreadC2921a0.getLooper(), handlerThreadC2921a0);
            handlerThreadC2921a0.f29761u = handler2;
            handlerThreadC2921a0.f29760n = new RunnableC4144wn(handler2);
            synchronized (handlerThreadC2921a0) {
            }
        }
        return this.f29593y1;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void E(C4019uN c4019uN) {
        ByteBuffer byteBuffer;
        KJ kj;
        PP pp = this.f28262u0;
        pp.getClass();
        if (pp.f27598b.equals("video/av01") && (byteBuffer = c4019uN.f35302e) != null) {
            DP dp = this.f28255o0;
            if (dp != null && (kj = dp.f25152F) != null && kj.f26653e > 8 && Build.VERSION.SDK_INT < 37) {
                Iterator it = SK.j(byteBuffer.asReadOnlyBuffer()).iterator();
                while (it.hasNext()) {
                    C3200fB c3200fB = (C3200fB) it.next();
                    int i = c3200fB.f31021a;
                    ByteBuffer byteBuffer2 = c3200fB.f31022b;
                    if (i == 5) {
                        try {
                            AbstractC2792Sd.i(i == 5);
                            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                            if (SK.C(asReadOnlyBuffer) == 4) {
                                if (asReadOnlyBuffer.remaining() >= 6) {
                                    byte[] bArr = new byte[6];
                                    asReadOnlyBuffer.asReadOnlyBuffer().get(bArr);
                                    if (!Arrays.equals(bArr, AbstractC2792Sd.f28295u)) {
                                    }
                                }
                                byteBuffer.put(byteBuffer2.position(), (byte) 31);
                            }
                        } catch (BufferUnderflowException unused) {
                        }
                    }
                }
            }
            C3067cm c3067cm = this.f29583m1;
            if (c3067cm != null && c4019uN.h(1)) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = (ByteBuffer) c3067cm.f30365u;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer);
                byteBuffer3.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.f29575U1 = 0;
        int F8 = F(c4019uN);
        if (Build.VERSION.SDK_INT < 34 || (F8 & 32) == 0) {
            this.G1++;
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final int F(C4019uN c4019uN) {
        return (Build.VERSION.SDK_INT < 34 || this.f29564H1 == null || c4019uN.f35303f >= this.f28203E || I0(c4019uN)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // com.google.android.gms.internal.ads.SP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(C4019uN c4019uN) {
        boolean z6;
        ByteBuffer byteBuffer;
        C4115wB c4115wB;
        R2 r22;
        boolean z9 = false;
        if (!I0(c4019uN)) {
            boolean z10 = c4019uN.f35303f < this.f28203E;
            C3511l0 c3511l0 = this.f29585o1;
            if (c3511l0 != null) {
                long j6 = c3511l0.f32456a == com.anythink.basead.exoplayer.b.f7168b ? -9223372036854775807L : (long) (((r2 - r6) * c3511l0.f32458c) + c3511l0.f32457b);
                if (j6 != com.anythink.basead.exoplayer.b.f7168b && j6 < this.f29584n1) {
                    z6 = true;
                    if ((!z10 || z6) && !c4019uN.h(268435456)) {
                        if (c4019uN.h(67108864)) {
                            C3067cm c3067cm = this.f29583m1;
                            if (c3067cm != null) {
                                PP pp = this.f28262u0;
                                pp.getClass();
                                if (pp.f27598b.equals("video/av01") && (byteBuffer = c4019uN.f35302e) != null) {
                                    boolean z11 = z10 || this.f29575U1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    ByteBuffer byteBuffer2 = (ByteBuffer) c3067cm.f30365u;
                                    if (byteBuffer2.hasRemaining()) {
                                        c3067cm.K(SK.j(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList j9 = SK.j(asReadOnlyBuffer);
                                    c3067cm.K(j9);
                                    int size = j9.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        C3200fB c3200fB = (C3200fB) j9.get(size);
                                        int i4 = c3200fB.f31021a;
                                        if (i4 != 2 && i4 != 15) {
                                            if (i4 == 3) {
                                                if (!z11) {
                                                    break;
                                                }
                                                i4 = 3;
                                            }
                                            if ((i4 != 6 && i4 != 3) || (c4115wB = (C4115wB) c3067cm.f30366v) == null) {
                                                break;
                                            }
                                            try {
                                                r22 = new R2(c4115wB, c3200fB);
                                            } catch (TA unused) {
                                                r22 = null;
                                            }
                                            if (r22 != null) {
                                                if (r22.f27915u) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((C3200fB) j9.get(size)).f31021a == 6 || ((C3200fB) j9.get(size)).f31021a == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = (i > 1 || size + 1 >= 8) ? asReadOnlyBuffer.limit() : size >= 0 ? ((C3200fB) j9.get(size)).f31022b.limit() : asReadOnlyBuffer.position();
                                    if (limit == 0) {
                                        c4019uN.i();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        A3.r rVar = this.f29586q1;
                                        rVar.getClass();
                                        if (rVar.f186c + limit < asReadOnlyBuffer.capacity() && !c4019uN.h(1073741824)) {
                                            ByteBuffer byteBuffer3 = c4019uN.f35302e;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z9) {
                                if (z10) {
                                    this.f28235U0.f35777d++;
                                } else {
                                    this.f29575U1++;
                                }
                                this.p1.add(Long.valueOf(c4019uN.f35303f));
                            }
                            return z9;
                        }
                        c4019uN.i();
                        z9 = true;
                        if (z9) {
                        }
                        return z9;
                    }
                }
            }
            z6 = false;
            if (!z10) {
            }
            if (c4019uN.h(67108864)) {
            }
            z9 = true;
            if (z9) {
            }
            return z9;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void H(long j6, long j9) {
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            try {
                a02.p0(j6, j9);
            } catch (C4266z0 e9) {
                throw n(e9, e9.f36045n, false, 7001);
            }
        }
        super.H(j6, j9);
    }

    public final void H0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f29592x1;
        S0.e eVar = this.f29578h1;
        if (surface2 == surface) {
            if (surface != null) {
                C3058cd c3058cd = this.f29570O1;
                if (c3058cd != null) {
                    eVar.Q(c3058cd);
                }
                Surface surface3 = this.f29592x1;
                if (surface3 == null || !this.f29558A1 || (handler = (Handler) eVar.f2908u) == null) {
                    return;
                }
                handler.post(new RunnableC4050v0(eVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f29592x1 = surface;
        A0 a02 = this.f29588t1;
        C3457k0 c3457k0 = this.f29580j1;
        if (a02 == null) {
            c3457k0.c(surface);
        }
        this.f29558A1 = false;
        int i = this.f28196A;
        MP mp = this.f28254n0;
        if (mp != null && this.f29588t1 == null) {
            PP pp = this.f28262u0;
            pp.getClass();
            if (!C0(pp) || this.r1) {
                x();
                v();
            } else {
                Surface D02 = D0(pp);
                if (D02 != null) {
                    mp.o(D02);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    mp.s();
                }
            }
        }
        if (surface != null) {
            C3058cd c3058cd2 = this.f29570O1;
            if (c3058cd2 != null) {
                eVar.Q(c3058cd2);
            }
        } else {
            this.f29570O1 = null;
            A0 a03 = this.f29588t1;
            if (a03 != null) {
                a03.m();
            }
        }
        if (i == 2) {
            A0 a04 = this.f29588t1;
            if (a04 != null) {
                a04.u0(true);
            } else {
                c3457k0.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r7.f28199B0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.SP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I() {
        boolean c9;
        boolean z6 = false;
        if (this.f28240X != null) {
            if (r0()) {
                c9 = this.f28207G;
            } else {
                LQ lq = this.f28198B;
                lq.getClass();
                c9 = lq.c();
            }
            if (!c9) {
                if (!(this.f28202D0 >= 0)) {
                    if (this.f28199B0 != com.anythink.basead.exoplayer.b.f7168b) {
                        this.f28271z.getClass();
                    }
                }
            }
            z6 = true;
        }
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            return a02.Z(z6);
        }
        if (z6 && this.f28254n0 == null) {
            return true;
        }
        return this.f29580j1.d(z6);
    }

    public final boolean I0(C4019uN c4019uN) {
        if (r0() || c4019uN.h(536870912)) {
            return true;
        }
        long j6 = this.f28214K;
        return j6 == com.anythink.basead.exoplayer.b.f7168b || j6 - (c4019uN.f35303f - this.f28237V0.f27964c) <= 100000;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean J() {
        if (!this.f28231S0) {
            return false;
        }
        A0 a02 = this.f29588t1;
        return a02 == null || a02.j();
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final int M(C3107dP c3107dP, DP dp) {
        boolean z6;
        String str = dp.f25176o;
        if (!H4.b(str)) {
            return 128;
        }
        int i = 0;
        boolean z9 = dp.f25180s != null;
        Context context = this.f29576f1;
        List G02 = G0(context, c3107dP, dp, z9, false);
        if (z9 && G02.isEmpty()) {
            G02 = G0(context, c3107dP, dp, false, false);
        }
        if (G02.isEmpty()) {
            return com.anythink.expressad.video.module.a.a.f22517T;
        }
        if (dp.f25161P != 0) {
            return com.anythink.expressad.video.module.a.a.f22518U;
        }
        PP pp = (PP) G02.get(0);
        boolean b9 = pp.b(context, dp);
        if (!b9) {
            for (int i4 = 1; i4 < G02.size(); i4++) {
                PP pp2 = (PP) G02.get(i4);
                if (pp2.b(context, dp)) {
                    b9 = true;
                    z6 = false;
                    pp = pp2;
                    break;
                }
            }
        }
        z6 = true;
        int i6 = true != b9 ? 3 : 4;
        int i9 = true != pp.c(dp) ? 8 : 16;
        int i10 = true != pp.f27603g ? 0 : 64;
        int i11 = true != z6 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC2659Kg.k(context)) {
            i11 = 256;
        }
        if (b9) {
            List G03 = G0(context, c3107dP, dp, z9, true);
            if (!G03.isEmpty()) {
                HashMap hashMap = ZP.f29665a;
                ArrayList arrayList = new ArrayList(G03);
                Collections.sort(arrayList, new VP(new WP(context, dp)));
                PP pp3 = (PP) arrayList.get(0);
                if (pp3.b(context, dp) && pp3.c(dp)) {
                    i = 32;
                }
            }
        }
        return i6 | i9 | i | i10 | i11;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final ArrayList O(C3107dP c3107dP, DP dp) {
        Context context = this.f29576f1;
        List G02 = G0(context, c3107dP, dp, false, false);
        HashMap hashMap = ZP.f29665a;
        ArrayList arrayList = new ArrayList(G02);
        Collections.sort(arrayList, new VP(new WP(context, dp)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final C3887s R(PP pp, DP dp, float f2) {
        KJ kj;
        int i;
        A3.r rVar;
        Point point;
        int i4;
        int i6;
        int i9;
        boolean z6;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        DP[] dpArr;
        int i10;
        char c9;
        int i11;
        Pair c10;
        int A02;
        DP[] dpArr2 = this.f28200C;
        dpArr2.getClass();
        int length = dpArr2.length;
        int E02 = E0(pp, dp);
        float f9 = dp.f25187z;
        KJ kj2 = dp.f25152F;
        int i12 = dp.f25184w;
        int i13 = dp.f25183v;
        if (length == 1) {
            if (E02 != -1 && (A02 = A0(pp, dp)) != -1) {
                E02 = Math.min((int) (E02 * 1.5f), A02);
            }
            rVar = new A3.r(i13, i12, E02, false);
            kj = kj2;
            i = i12;
        } else {
            int i14 = i12;
            int i15 = i13;
            int i16 = 0;
            boolean z9 = false;
            while (i16 < length) {
                DP dp2 = dpArr2[i16];
                if (kj2 != null && dp2.f25152F == null) {
                    C3322hP c3322hP = new C3322hP(dp2);
                    c3322hP.f31536E = kj2;
                    dp2 = new DP(c3322hP);
                }
                if (pp.d(dp, dp2).f35941d != 0) {
                    int i17 = dp2.f25184w;
                    dpArr = dpArr2;
                    int i18 = dp2.f25183v;
                    i10 = length;
                    c9 = 65535;
                    z9 |= i18 == -1 || i17 == -1;
                    i15 = Math.max(i15, i18);
                    i14 = Math.max(i14, i17);
                    E02 = Math.max(E02, E0(pp, dp2));
                } else {
                    dpArr = dpArr2;
                    i10 = length;
                    c9 = 65535;
                }
                i16++;
                dpArr2 = dpArr;
                length = i10;
            }
            if (z9) {
                AbstractC2991bG.y("MediaCodecVideoRenderer", D.x.o(new StringBuilder(String.valueOf(i15).length() + 44 + String.valueOf(i14).length()), "Resolutions unknown. Codec max resolution: ", i15, "x", i14));
                boolean z10 = i12 > i13;
                int i19 = z10 ? i12 : i13;
                int i20 = true != z10 ? i12 : i13;
                int[] iArr = f29555V1;
                kj = kj2;
                int i21 = 0;
                while (true) {
                    Point point2 = null;
                    if (i21 >= 9) {
                        break;
                    }
                    float f10 = i20;
                    int i22 = i21;
                    float f11 = i19;
                    int i23 = iArr[i22];
                    float f12 = i23;
                    if (i23 <= i19 || (i4 = (int) (f12 * (f10 / f11))) <= i20) {
                        break;
                    }
                    if (true != z10) {
                        i6 = i20;
                        i9 = i23;
                    } else {
                        i6 = i20;
                        i9 = i4;
                    }
                    int i24 = true == z10 ? i23 : i4;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = pp.f27600d;
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                        point2 = PP.j(videoCapabilities, i9, i24);
                    }
                    point = point2;
                    if (point != null) {
                        z6 = z10;
                        i = i12;
                        if (pp.e(point.x, point.y, f9)) {
                            break;
                        }
                    } else {
                        z6 = z10;
                        i = i12;
                    }
                    i21 = i22 + 1;
                    z10 = z6;
                    i20 = i6;
                    i12 = i;
                }
                i = i12;
                point = null;
                if (point != null) {
                    i15 = Math.max(i15, point.x);
                    i14 = Math.max(i14, point.y);
                    C3322hP c3322hP2 = new C3322hP(dp);
                    c3322hP2.f31565u = i15;
                    c3322hP2.f31566v = i14;
                    E02 = Math.max(E02, A0(pp, new DP(c3322hP2)));
                    AbstractC2991bG.y("MediaCodecVideoRenderer", D.x.o(new StringBuilder(Wv.b(i15, 35) + String.valueOf(i14).length()), "Codec max resolution adjusted to: ", i15, "x", i14));
                }
            } else {
                kj = kj2;
                i = i12;
            }
            rVar = new A3.r(i15, i14, E02, false);
        }
        String str = pp.f27599c;
        this.f29586q1 = rVar;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i);
        AbstractC2991bG.i(mediaFormat, dp.f25179r);
        if (f9 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f9);
        }
        AbstractC2991bG.s(mediaFormat, "rotation-degrees", dp.f25147A);
        if (kj != null) {
            KJ kj3 = kj;
            AbstractC2991bG.s(mediaFormat, "color-transfer", kj3.f26651c);
            AbstractC2991bG.s(mediaFormat, "color-standard", kj3.f26649a);
            AbstractC2991bG.s(mediaFormat, "color-range", kj3.f26650b);
            byte[] bArr = kj3.f26652d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(dp.f25176o) && (c10 = AbstractC4305zm.c(dp)) != null) {
            AbstractC2991bG.s(mediaFormat, "profile", ((Integer) c10.first).intValue());
        }
        mediaFormat.setInteger("max-width", rVar.f184a);
        mediaFormat.setInteger("max-height", rVar.f185b);
        AbstractC2991bG.s(mediaFormat, "max-input-size", rVar.f186c);
        mediaFormat.setInteger("priority", 0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f2);
        }
        if (this.f29579i1) {
            mediaFormat.setInteger("no-post-process", 1);
            i11 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i11 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(i11, -this.f29571P1));
        }
        i0(mediaFormat);
        Surface D02 = D0(pp);
        if (this.f29588t1 != null && !AbstractC3182eu.l(this.f29576f1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C3887s(pp, mediaFormat, dp, D02, null, 12);
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final C4235yN S(PP pp, DP dp, DP dp2, boolean z6) {
        int i;
        int i4;
        int i6;
        C4235yN d9 = pp.d(dp, dp2);
        A3.r rVar = this.f29586q1;
        rVar.getClass();
        int i9 = dp2.f25183v;
        int i10 = rVar.f184a;
        int i11 = d9.f35942e;
        if (i9 > i10 || dp2.f25184w > rVar.f185b) {
            i11 |= 256;
        }
        if (E0(pp, dp2) > rVar.f186c) {
            i11 |= 64;
        }
        if (this.f29560C1 != Integer.MIN_VALUE && (i6 = Build.VERSION.SDK_INT) < 31 && (i6 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f2 = dp.f25187z;
            if (f2 != -1.0f) {
                float f9 = dp2.f25187z;
                if (f9 != -1.0f && (!pp.f27602f || !z6)) {
                    if (Math.abs((Math.max(f9, f2) / Math.min(f9, f2)) - Math.round(r15)) > 0.01f) {
                        i11 |= com.anythink.basead.exoplayer.b.aX;
                    }
                }
            }
        }
        if (i11 != 0) {
            i4 = 0;
            i = i11;
        } else {
            i = 0;
            i4 = d9.f35941d;
        }
        return new C4235yN(pp.f27597a, dp, dp2, i4, i);
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final float U(float f2, DP dp, DP[] dpArr) {
        PP pp;
        float f9 = -1.0f;
        for (DP dp2 : dpArr) {
            float f10 = dp2.f25187z;
            if (f10 != -1.0f) {
                f9 = Math.max(f9, f10);
            }
        }
        if (f9 == -1.0f && this.f28254n0 != null) {
            if (this.f29582l1.b() != com.anythink.basead.exoplayer.b.f7168b) {
                f9 = 1.0E9f / r10.b();
            }
        }
        float f11 = f9 == -1.0f ? -1.0f : f9 * f2;
        if (this.f29564H1 == null || (pp = this.f28262u0) == null) {
            return f11;
        }
        int i = dp.f25183v;
        float f12 = -3.4028235E38f;
        if (pp.i) {
            float f13 = pp.f27607l;
            int i4 = dp.f25184w;
            if (f13 != -3.4028235E38f && pp.f27605j == i && pp.f27606k == i4) {
                f12 = f13;
            } else {
                f12 = 1024.0f;
                if (!pp.e(i, i4, 1024.0d)) {
                    float f14 = 0.0f;
                    while (true) {
                        float f15 = f12 - f14;
                        if (Math.abs(f15) <= 5.0f) {
                            break;
                        }
                        float f16 = (f15 / 2.0f) + f14;
                        boolean e9 = pp.e(i, i4, f16);
                        if (true == e9) {
                            f14 = f16;
                        }
                        if (true != e9) {
                            f12 = f16;
                        }
                    }
                    f12 = f14;
                }
                pp.f27607l = f12;
                pp.f27605j = i;
                pp.f27606k = i4;
            }
        }
        return f11 != -1.0f ? Math.max(f11, f12) : f12;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void V(String str, long j6, long j9) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        S0.e eVar = this.f29578h1;
        Handler handler = (Handler) eVar.f2908u;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC3834r0(eVar, str2, j6, j9));
        } else {
            str2 = str;
        }
        this.r1 = F0(str2);
        PP pp = this.f28262u0;
        pp.getClass();
        boolean z6 = false;
        if (Build.VERSION.SDK_INT >= 29 && com.anythink.basead.exoplayer.k.o.f9239k.equals(pp.f27598b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pp.f27600d;
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
                    z6 = true;
                    break;
                }
                i++;
            }
        }
        this.f29587s1 = z6;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void W(String str) {
        S0.e eVar = this.f29578h1;
        Handler handler = (Handler) eVar.f2908u;
        if (handler != null) {
            handler.post(new RunnableC3834r0(eVar, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void X(Exception exc) {
        AbstractC2991bG.J("MediaCodecVideoRenderer", "Video codec error", exc);
        S0.e eVar = this.f29578h1;
        Handler handler = (Handler) eVar.f2908u;
        if (handler != null) {
            handler.post(new RunnableC3834r0(eVar, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final C4235yN Y(S0.l lVar) {
        C4235yN Y = super.Y(lVar);
        DP dp = (DP) lVar.f2927v;
        dp.getClass();
        S0.e eVar = this.f29578h1;
        Handler handler = (Handler) eVar.f2908u;
        if (handler != null) {
            handler.post(new RunnableC3888s0(0, eVar, dp, Y));
        }
        C3511l0 c3511l0 = this.f29585o1;
        if (c3511l0 != null) {
            c3511l0.c();
        }
        return Y;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void Z(DP dp, MediaFormat mediaFormat) {
        MP mp = this.f28254n0;
        if (mp != null) {
            mp.y(this.f29559B1);
        }
        mediaFormat.getClass();
        boolean z6 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f2 = dp.f25149C;
        int i = dp.f25147A;
        if (i == 90 || i == 270) {
            f2 = 1.0f / f2;
            int i4 = integer2;
            integer2 = integer;
            integer = i4;
        }
        this.f29569N1 = new C3058cd(integer, integer2, f2);
        A0 a02 = this.f29588t1;
        if (a02 == null || !this.f29574T1) {
            U u6 = this.f29582l1;
            u6.f28638f = dp.f25187z;
            u6.f28633a.a();
            u6.f28634b.a();
            u6.f28635c = false;
            u6.f28636d = com.anythink.basead.exoplayer.b.f7168b;
            u6.f28637e = 0;
            u6.c();
        } else {
            C3322hP c3322hP = new C3322hP(dp);
            c3322hP.f31565u = integer;
            c3322hP.f31566v = integer2;
            c3322hP.f31533B = f2;
            DP dp2 = new DP(c3322hP);
            int i6 = this.f29590v1;
            List list = this.f29591w1;
            if (list == null) {
                list = C3523lC.f32525x;
            }
            a02.w0(dp2, this.f28237V0.f27963b, i6, list);
            this.f29590v1 = 2;
        }
        this.f29574T1 = false;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void a0() {
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            a02.n();
            long j6 = this.f29573S1;
            if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                j6 = this.f28237V0.f27963b;
                this.f29573S1 = j6;
            }
            this.f29588t1.v0(-j6);
        } else {
            this.f29580j1.a(2);
        }
        this.f29574T1 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3697oO
    public final void b(int i, Object obj) {
        if (i == 1) {
            H0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC3351i0 interfaceC3351i0 = (InterfaceC3351i0) obj;
            this.R1 = interfaceC3351i0;
            A0 a02 = this.f29588t1;
            if (a02 != null) {
                a02.r0(interfaceC3351i0);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f29572Q1 != intValue) {
                this.f29572Q1 = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f29559B1 = intValue2;
            MP mp = this.f28254n0;
            if (mp != null) {
                mp.y(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.f29560C1 = intValue3;
            A0 a03 = this.f29588t1;
            if (a03 != null) {
                a03.q0(intValue3);
                return;
            }
            C3727p0 c3727p0 = this.f29580j1.f32139b;
            if (c3727p0.f33784h == intValue3) {
                return;
            }
            c3727p0.f33784h = intValue3;
            c3727p0.b(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC3810qc.f34028a)) {
                A0 a04 = this.f29588t1;
                if (a04 == null || !a04.d()) {
                    return;
                }
                a04.e();
                return;
            }
            this.f29591w1 = list;
            A0 a05 = this.f29588t1;
            if (a05 != null) {
                a05.s0(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            Nr nr = (Nr) obj;
            if (nr.f27340a == 0 || nr.f27341b == 0) {
                return;
            }
            this.f29594z1 = nr;
            A0 a06 = this.f29588t1;
            if (a06 != null) {
                Surface surface = this.f29592x1;
                surface.getClass();
                a06.n0(surface, nr);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f29571P1 = ((Integer) obj).intValue();
                MP mp2 = this.f28254n0;
                if (mp2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f29571P1));
                    mp2.m(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f29592x1;
                H0(null);
                obj.getClass();
                ((Z) obj).b(1, surface2);
                break;
            case 18:
                boolean z6 = this.f29564H1 != null;
                C3966tO c3966tO = (C3966tO) obj;
                this.f29564H1 = c3966tO;
                if (z6 != (c3966tO != null)) {
                    j0(this.f28255o0);
                    break;
                }
                break;
            default:
                if (i == 11) {
                    QN qn = (QN) obj;
                    qn.getClass();
                    this.f28250j0 = qn;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean b0(long j6, long j9, MP mp, ByteBuffer byteBuffer, int i, int i4, int i6, long j10, boolean z6, boolean z9, DP dp) {
        U u6;
        mp.getClass();
        long j11 = j10 - this.f28237V0.f27964c;
        int i9 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.p1;
            Long l9 = (Long) priorityQueue.peek();
            u6 = this.f29582l1;
            if (l9 == null || l9.longValue() >= j10) {
                break;
            }
            priorityQueue.poll();
            u6.a(l9.longValue() * 1000);
            if (l9.longValue() >= this.f28203E) {
                i9++;
            }
        }
        w0(i9, 0);
        u6.a(j10 * 1000);
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            if (!z6 || z9) {
                return a02.t0(j10, new X(this, mp, i, j11));
            }
            B0(mp, i);
            return true;
        }
        long j12 = this.f28237V0.f27963b;
        long b9 = u6.b();
        long j13 = u6.f28640h;
        C3457k0 c3457k0 = this.f29580j1;
        C3403j0 c3403j0 = this.f29581k1;
        int e9 = c3457k0.e(j10, j6, j9, j12, z6, z9, b9, j13, c3403j0);
        C3511l0 c3511l0 = this.f29585o1;
        if (c3511l0 != null) {
            if (e9 != 5 && e9 != 4) {
                c3511l0.a(j10, c3403j0.f31940a);
            }
            return false;
        }
        if (e9 == 0) {
            this.f28271z.getClass();
            long nanoTime = System.nanoTime();
            InterfaceC3351i0 interfaceC3351i0 = this.R1;
            if (interfaceC3351i0 != null) {
                interfaceC3351i0.a(j11, nanoTime, dp, this.f28256p0);
            }
            y0(mp, i, nanoTime);
            x0(c3403j0.f31940a);
            return true;
        }
        if (e9 == 1) {
            long j14 = c3403j0.f31941b;
            long j15 = c3403j0.f31940a;
            if (j14 == this.f29568M1) {
                B0(mp, i);
            } else {
                InterfaceC3351i0 interfaceC3351i02 = this.R1;
                if (interfaceC3351i02 != null) {
                    interfaceC3351i02.a(j11, j14, dp, this.f28256p0);
                }
                y0(mp, i, j14);
            }
            x0(j15);
            this.f29568M1 = j14;
            return true;
        }
        if (e9 != 2) {
            if (e9 == 3) {
                B0(mp, i);
                x0(c3403j0.f31940a);
                return true;
            }
            return false;
        }
        Trace.beginSection("dropVideoBuffer");
        mp.t(i);
        Trace.endSection();
        w0(0, 1);
        x0(c3403j0.f31940a);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void c(long j6, boolean z6, boolean z9) {
        A0 a02 = this.f29588t1;
        if (a02 != null && !z6) {
            a02.l0(true);
        }
        if (z9) {
            this.f29565I1 = j6;
        }
        super.c(j6, z6, z9);
        A0 a03 = this.f29588t1;
        C3457k0 c3457k0 = this.f29580j1;
        if (a03 == null) {
            c3457k0.f32139b.a();
            c3457k0.f32142e = com.anythink.basead.exoplayer.b.f7168b;
            c3457k0.f32141d = Math.min(c3457k0.f32141d, 1);
            c3457k0.f32146j = false;
        }
        C3511l0 c3511l0 = this.f29585o1;
        if (c3511l0 != null) {
            c3511l0.c();
        }
        if (z6) {
            A0 a04 = this.f29588t1;
            if (a04 != null) {
                a04.u0(false);
            } else {
                c3457k0.getClass();
            }
        }
        this.f29563F1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void c0(C4127wN c4127wN) {
        S0.e eVar = this.f29578h1;
        Handler handler = (Handler) eVar.f2908u;
        if (handler != null) {
            handler.post(new RunnableC3996u0(2, eVar, c4127wN));
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void d() {
        this.f29562E1 = 0;
        this.f28271z.getClass();
        this.f29561D1 = SystemClock.elapsedRealtime();
        this.f29566K1 = 0L;
        this.f29567L1 = 0;
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            a02.c();
        } else {
            this.f29580j1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void d0() {
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            a02.n();
        } else {
            long j6 = this.f28237V0.f27967f;
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void e() {
        int i = this.f29562E1;
        final S0.e eVar = this.f29578h1;
        if (i > 0) {
            this.f28271z.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j6 = elapsedRealtime - this.f29561D1;
            final int i4 = this.f29562E1;
            Handler handler = (Handler) eVar.f2908u;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        S0.e eVar2 = eVar;
                        eVar2.getClass();
                        String str = AbstractC3182eu.f30782a;
                        BO bo = ((HN) eVar2.f2909v).f26036n.f27558K;
                        C4182xO v9 = bo.v((C3860rQ) bo.f24669d.f28482x);
                        bo.s(v9, 1018, new N6.i(v9, i4, j6));
                    }
                });
            }
            this.f29562E1 = 0;
            this.f29561D1 = elapsedRealtime;
        }
        int i6 = this.f29567L1;
        if (i6 != 0) {
            long j9 = this.f29566K1;
            Handler handler2 = (Handler) eVar.f2908u;
            if (handler2 != null) {
                handler2.post(new RunnableC3834r0(i6, j9, eVar));
            }
            this.f29566K1 = 0L;
            this.f29567L1 = 0;
        }
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            a02.f();
        } else {
            C3457k0 c3457k0 = this.f29580j1;
            c3457k0.f32140c = false;
            C3727p0 c3727p0 = c3457k0.f32139b;
            c3727p0.f33779c = false;
            AbstractC3565m0 abstractC3565m0 = c3727p0.f33778b;
            if (abstractC3565m0 != null) {
                abstractC3565m0.b();
            }
            c3727p0.c();
        }
        C3511l0 c3511l0 = this.f29585o1;
        if (c3511l0 != null) {
            c3511l0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void f() {
        S0.e eVar = this.f29578h1;
        this.f29570O1 = null;
        this.f29558A1 = false;
        this.J1 = true;
        try {
            super.f();
            C4181xN c4181xN = this.f28235U0;
            eVar.getClass();
            synchronized (c4181xN) {
            }
            Handler handler = (Handler) eVar.f2908u;
            if (handler != null) {
                handler.post(new RunnableC3996u0(1, eVar, c4181xN));
            }
            eVar.Q(C3058cd.f30285d);
        } catch (Throwable th) {
            C4181xN c4181xN2 = this.f28235U0;
            eVar.getClass();
            synchronized (c4181xN2) {
                Handler handler2 = (Handler) eVar.f2908u;
                if (handler2 != null) {
                    handler2.post(new RunnableC3996u0(1, eVar, c4181xN2));
                }
                eVar.Q(C3058cd.f30285d);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void f0(C4019uN c4019uN) {
        if (this.f29587s1) {
            ByteBuffer byteBuffer = c4019uN.f35304g;
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
                        MP mp = this.f28254n0;
                        mp.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mp.m(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void h0(long j6) {
        super.h0(j6);
        this.G1--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.SP
    public final void i() {
        try {
            try {
                this.f28206F0 = false;
                g0();
                x();
            } finally {
                this.f28249i0 = null;
            }
        } finally {
            this.f29589u1 = false;
            this.f29573S1 = com.anythink.basead.exoplayer.b.f7168b;
            C2975b0 c2975b0 = this.f29593y1;
            if (c2975b0 != null) {
                c2975b0.release();
                this.f29593y1 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void k() {
        A0 a02 = this.f29588t1;
        if (a02 == null || !this.f29577g1) {
            return;
        }
        a02.H();
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final String p() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean q(long j6) {
        if (this.f28225P0 == com.anythink.basead.exoplayer.b.f7168b || j6 < this.f29565I1) {
            return false;
        }
        long j9 = this.f28239W0;
        return j9 == com.anythink.basead.exoplayer.b.f7168b || j6 > j9;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void r(float f2, float f9) {
        super.r(f2, f9);
        A0 a02 = this.f29588t1;
        if (a02 != null) {
            a02.m0(f2);
        } else {
            this.f29580j1.f(f2);
        }
        C3511l0 c3511l0 = this.f29585o1;
        if (c3511l0 != null) {
            c3511l0.b(f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void s() {
        A0 a02 = this.f29588t1;
        if (a02 == null) {
            C3457k0 c3457k0 = this.f29580j1;
            if (c3457k0.f32141d == 0) {
                c3457k0.f32141d = 1;
                return;
            }
            return;
        }
        int i = this.f29590v1;
        if (i == 0 || i == 1) {
            this.f29590v1 = 0;
        } else {
            a02.N();
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void u0(boolean z6, boolean z9) {
        A0 a02;
        this.f28235U0 = new C4181xN();
        l();
        C4181xN c4181xN = this.f28235U0;
        S0.e eVar = this.f29578h1;
        Handler handler = (Handler) eVar.f2908u;
        if (handler != null) {
            handler.post(new RunnableC3834r0(eVar, c4181xN, 4));
        }
        boolean z10 = this.f29589u1;
        C3457k0 c3457k0 = this.f29580j1;
        if (!z10) {
            if (this.f29591w1 != null && this.f29588t1 == null) {
                C3028c0 c3028c0 = new C3028c0(this.f29576f1, c3457k0);
                c3028c0.f30186d = true;
                c3028c0.f30189g = -this.f29584n1;
                V2 v22 = this.f28271z;
                v22.getClass();
                c3028c0.f30187e = v22;
                AbstractC2792Sd.H(!c3028c0.f30188f);
                if (c3028c0.f30185c == null) {
                    c3028c0.f30185c = new C3189f0();
                }
                C3297h0 c3297h0 = new C3297h0(c3028c0);
                c3028c0.f30188f = true;
                c3297h0.f31479p = 1;
                SparseArray sparseArray = c3297h0.f31467c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    a02 = (A0) sparseArray.get(0);
                } else {
                    C3082d0 c3082d0 = new C3082d0(c3297h0, c3297h0.f31465a);
                    c3297h0.f31471g.add(c3082d0);
                    sparseArray.put(0, c3082d0);
                    a02 = c3082d0;
                }
                this.f29588t1 = a02;
            }
            this.f29589u1 = true;
        }
        int i = !z9 ? 1 : 0;
        A0 a03 = this.f29588t1;
        if (a03 == null) {
            V2 v23 = this.f28271z;
            v23.getClass();
            c3457k0.f32145h = v23;
            c3457k0.a(i);
            return;
        }
        a03.o0(new W(this));
        InterfaceC3351i0 interfaceC3351i0 = this.R1;
        if (interfaceC3351i0 != null) {
            this.f29588t1.r0(interfaceC3351i0);
        }
        if (this.f29592x1 != null && !this.f29594z1.equals(Nr.f27339c)) {
            this.f29588t1.n0(this.f29592x1, this.f29594z1);
        }
        this.f29588t1.q0(this.f29560C1);
        this.f29588t1.m0(this.f28252l0);
        List list = this.f29591w1;
        if (list != null) {
            this.f29588t1.s0(list);
        }
        this.f29590v1 = i;
        this.f28242Y0 = true;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final void v0(DP[] dpArr, long j6, long j9, C3860rQ c3860rQ) {
        super.v0(dpArr, j6, j9, c3860rQ);
        C3511l0 c3511l0 = this.f29585o1;
        if (c3511l0 != null) {
            c3511l0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean w(PP pp) {
        return C0(pp);
    }

    public final void w0(int i, int i4) {
        C4181xN c4181xN = this.f28235U0;
        c4181xN.f35781h += i;
        int i6 = i + i4;
        c4181xN.f35780g += i6;
        this.f29562E1 += i6;
        int i9 = this.f29563F1 + i6;
        this.f29563F1 = i9;
        c4181xN.i = Math.max(i9, c4181xN.i);
    }

    public final void x0(long j6) {
        C4181xN c4181xN = this.f28235U0;
        c4181xN.f35783k += j6;
        c4181xN.f35784l++;
        this.f29566K1 += j6;
        this.f29567L1++;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean y() {
        PP pp = this.f28262u0;
        if (this.f29588t1 != null && pp != null) {
            String str = pp.f27597a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.y();
    }

    public final void y0(MP mp, int i, long j6) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        mp.B(i, j6);
        Trace.endSection();
        this.f28235U0.f35778e++;
        this.f29563F1 = 0;
        if (this.f29588t1 == null) {
            C3058cd c3058cd = this.f29569N1;
            boolean equals = c3058cd.equals(C3058cd.f30285d);
            S0.e eVar = this.f29578h1;
            if (!equals && !c3058cd.equals(this.f29570O1)) {
                this.f29570O1 = c3058cd;
                eVar.Q(c3058cd);
            }
            C3457k0 c3457k0 = this.f29580j1;
            int i4 = c3457k0.f32141d;
            c3457k0.f32141d = 3;
            c3457k0.f32145h.getClass();
            c3457k0.f32143f = AbstractC3182eu.u(SystemClock.elapsedRealtime());
            if (i4 == 3 || (surface = this.f29592x1) == null) {
                return;
            }
            Handler handler = (Handler) eVar.f2908u;
            if (handler != null) {
                handler.post(new RunnableC4050v0(eVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f29558A1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.SP
    public final boolean z() {
        boolean z6;
        DP dp = this.f28255o0;
        long j6 = this.f28214K;
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            if (this.f28245a1 + 1 + j6 <= Long.MAX_VALUE - (this.f28237V0.f27964c + j6)) {
                z6 = false;
                return this.f29564H1 == null || this.J1 || (dp != null && dp.f25178q > 0) || z6 || this.f28237V0.f27967f != com.anythink.basead.exoplayer.b.f7168b;
            }
        }
        z6 = true;
        if (this.f29564H1 == null) {
        }
    }

    public final boolean z0(long j6, long j9, boolean z6, boolean z9) {
        if (this.f29588t1 != null && this.f29577g1) {
            j9 -= -this.f29573S1;
        }
        if (j6 < -500000 && !z6) {
            LQ lq = this.f28198B;
            lq.getClass();
            int a9 = lq.a(j9 - this.f28201D);
            if (a9 != 0) {
                this.f29565I1 = j9;
                Iterator it = this.p1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((Long) it.next()).longValue() >= this.f28203E) {
                        i++;
                    }
                }
                if (z9) {
                    C4181xN c4181xN = this.f28235U0;
                    int i4 = c4181xN.f35777d + a9;
                    c4181xN.f35779f += this.G1;
                    c4181xN.f35777d = i4 + i;
                } else {
                    this.f28235U0.f35782j++;
                    w0(a9 + i, this.G1);
                }
                if (this.f28254n0 != null) {
                    if (y()) {
                        x();
                        v();
                    } else if (z()) {
                        t();
                    } else {
                        this.f28244Z0 = true;
                    }
                }
                A0 a02 = this.f29588t1;
                if (a02 != null) {
                    a02.l0(false);
                }
                return true;
            }
        }
        return false;
    }
}
