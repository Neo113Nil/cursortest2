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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes2.dex */
public final class X extends AbstractC3149eQ {

    /* renamed from: a2, reason: collision with root package name */
    public static final int[] f28541a2 = {1920, 1600, com.onesignal.core.internal.config.e.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1280, 960, 854, 640, 540, 480};

    /* renamed from: b2, reason: collision with root package name */
    public static boolean f28542b2;

    /* renamed from: c2, reason: collision with root package name */
    public static boolean f28543c2;

    /* renamed from: A1, reason: collision with root package name */
    public int f28544A1;

    /* renamed from: B1, reason: collision with root package name */
    public List f28545B1;

    /* renamed from: C1, reason: collision with root package name */
    public Surface f28546C1;

    /* renamed from: D1, reason: collision with root package name */
    public Z f28547D1;
    public Xr E1;

    /* renamed from: F1, reason: collision with root package name */
    public boolean f28548F1;

    /* renamed from: G1, reason: collision with root package name */
    public int f28549G1;
    public int H1;

    /* renamed from: I1, reason: collision with root package name */
    public long f28550I1;

    /* renamed from: J1, reason: collision with root package name */
    public int f28551J1;

    /* renamed from: K1, reason: collision with root package name */
    public int f28552K1;

    /* renamed from: L1, reason: collision with root package name */
    public int f28553L1;

    /* renamed from: M1, reason: collision with root package name */
    public GO f28554M1;

    /* renamed from: N1, reason: collision with root package name */
    public long f28555N1;

    /* renamed from: O1, reason: collision with root package name */
    public boolean f28556O1;
    public long P1;

    /* renamed from: Q1, reason: collision with root package name */
    public int f28557Q1;

    /* renamed from: R1, reason: collision with root package name */
    public long f28558R1;

    /* renamed from: S1, reason: collision with root package name */
    public C3100dd f28559S1;

    /* renamed from: T1, reason: collision with root package name */
    public C3100dd f28560T1;

    /* renamed from: U1, reason: collision with root package name */
    public int f28561U1;

    /* renamed from: V1, reason: collision with root package name */
    public int f28562V1;

    /* renamed from: W1, reason: collision with root package name */
    public InterfaceC3233g0 f28563W1;

    /* renamed from: X1, reason: collision with root package name */
    public long f28564X1;

    /* renamed from: Y1, reason: collision with root package name */
    public boolean f28565Y1;

    /* renamed from: Z1, reason: collision with root package name */
    public int f28566Z1;

    /* renamed from: l1, reason: collision with root package name */
    public final Context f28567l1;

    /* renamed from: m1, reason: collision with root package name */
    public final boolean f28568m1;
    public final C3932t0 n1;

    /* renamed from: o1, reason: collision with root package name */
    public final boolean f28569o1;
    public final C3341i0 p1;

    /* renamed from: q1, reason: collision with root package name */
    public final C3287h0 f28570q1;

    /* renamed from: r1, reason: collision with root package name */
    public final C2881Yl f28571r1;

    /* renamed from: s1, reason: collision with root package name */
    public final long f28572s1;

    /* renamed from: t1, reason: collision with root package name */
    public final C3393j0 f28573t1;

    /* renamed from: u1, reason: collision with root package name */
    public final PriorityQueue f28574u1;

    /* renamed from: v1, reason: collision with root package name */
    public W2.b f28575v1;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f28576w1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f28577x1;

    /* renamed from: y1, reason: collision with root package name */
    public InterfaceC4148x0 f28578y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f28579z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X(W w9) {
        super(r0.getApplicationContext(), 2, (C3042ca) w9.f28335d, r5, 30.0f);
        C3796qP c3796qP = (C3796qP) w9.f28334c;
        Context context = (Context) w9.f28333b;
        Context applicationContext = context.getApplicationContext();
        this.f28567l1 = applicationContext;
        this.f28578y1 = null;
        this.n1 = new C3932t0((Handler) w9.f28336e, (VN) w9.f28337f, 0);
        this.f28568m1 = this.f28578y1 == null;
        this.p1 = new C3341i0(applicationContext, this);
        this.f28570q1 = new C3287h0();
        this.f28569o1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.E1 = Xr.f28710c;
        this.f28549G1 = 1;
        this.H1 = 0;
        this.f28559S1 = C3100dd.f30070d;
        this.f28562V1 = 0;
        this.f28560T1 = null;
        this.f28561U1 = -1000;
        this.f28564X1 = com.anythink.basead.exoplayer.b.f6539b;
        this.f28571r1 = new C2881Yl(1);
        this.f28574u1 = new PriorityQueue();
        this.f28572s1 = -15000L;
        this.f28573t1 = new C3393j0();
        this.f28554M1 = null;
    }

    public static int C0(C2986bQ c2986bQ, TP tp) {
        int i = tp.f27777p;
        if (i == -1) {
            return z0(c2986bQ, tp);
        }
        List list = tp.f27779r;
        int size = list.size();
        int i4 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i4 += ((byte[]) list.get(i9)).length;
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
    public static final boolean D0(String str) {
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (X.class) {
            if (!f28542b2) {
                int i = Build.VERSION.SDK_INT;
                char c4 = 28;
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
                    f28543c2 = z10;
                    f28542b2 = true;
                }
                if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z8 = 6;
                                break;
                            }
                            z8 = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z8 = 7;
                                break;
                            }
                            z8 = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z8 = false;
                                break;
                            }
                            z8 = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z8 = true;
                                break;
                            }
                            z8 = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z8 = 2;
                                break;
                            }
                            z8 = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z8 = 3;
                                break;
                            }
                            z8 = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z8 = 4;
                                break;
                            }
                            z8 = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z8 = 8;
                                break;
                            }
                            z8 = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z8 = 5;
                                break;
                            }
                            z8 = -1;
                            break;
                        default:
                            z8 = -1;
                            break;
                    }
                    switch (z8) {
                        default:
                            if (i <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c4 = '6';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c4 = '7';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c4 = '8';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c4 = 'J';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c4 = 22;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c4 = 'Y';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c4 = 'Z';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c4 = 'e';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c4 = 'f';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c4 = 'g';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c4 = '\r';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c4 = 't';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c4 = 137;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c4 = 21;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c4 = 'h';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c4 = '_';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c4 = 130;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c4 = 'a';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c4 = 'b';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c4 = 'c';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c4 = '4';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c4 = 18;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c4 = 'F';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c4 = 'v';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c4 = 'W';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c4 = 5;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c4 = 6;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c4 = 'x';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c4 = '\"';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c4 = '~';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c4 = 'X';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c4 = '\t';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c4 = 'w';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c4 = 131;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c4 = 132;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c4 = '[';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c4 = '3';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c4 = '5';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c4 = 'i';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c4 = 'y';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c4 = 17;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c4 = 138;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c4 = 31;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c4 = 134;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c4 = 20;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c4 = 'q';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c4 = 127;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c4 = 129;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c4 = 16;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c4 = 'T';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c4 = 'I';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c4 = 'O';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c4 = 'P';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c4 = 'V';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c4 = '^';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c4 = 'k';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c4 = 's';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c4 = 139;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c4 = 26;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c4 = 27;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c4 = '1';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c4 = 0;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c4 = 1;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c4 = 2;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c4 = '$';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c4 = '%';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c4 = '&';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c4 = '\'';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c4 = '(';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c4 = ')';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c4 = ']';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c4 = 'm';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c4 = 'o';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c4 = 136;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c4 = '2';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c4 = 'K';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c4 = 'U';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c4 = '\\';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c4 = 'S';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c4 = 3;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c4 = 4;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c4 = 15;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c4 = 7;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c4 = 30;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c4 = '*';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c4 = '+';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c4 = ',';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c4 = '-';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c4 = '.';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c4 = '/';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c4 = '0';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c4 = 'l';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c4 = 'n';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c4 = 'p';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c4 = 128;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c4 = 135;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c4 = 'C';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c4 = 'L';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c4 = 'M';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c4 = '\b';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c4 = 25;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c4 = 'R';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c4 = '<';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c4 = 11;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c4 = '\f';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c4 = 'z';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c4 = '{';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c4 = '|';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c4 = '}';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c4 = 'j';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c4 = 'r';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c4 = '9';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c4 = ':';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c4 = ';';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c4 = 'Q';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c4 = '\n';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c4 = 'H';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c4 = '`';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c4 = 'N';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c4 = 'G';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c4 = '>';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c4 = '#';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c4 = '=';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c4 = 133;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c4 = 23;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c4 = 24;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c4 = 'D';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c4 = 'u';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c4 = 'd';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c4 = 'E';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c4 = 19;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c4 = 29;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c4 = '?';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c4 = '@';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c4 = 14;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c4 = ' ';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c4 = '!';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c4 = 'A';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c4 = 'B';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    default:
                                        c4 = 65535;
                                        break;
                                }
                                switch (c4) {
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
                                    case com.anythink.basead.b.b.j.f5963M /* 38 */:
                                    case '\'':
                                    case com.anythink.basead.b.b.j.f5965O /* 40 */:
                                    case ')':
                                    case '*':
                                    case com.anythink.basead.b.b.j.f5968R /* 43 */:
                                    case com.anythink.basead.b.b.j.f5969S /* 44 */:
                                    case com.anythink.basead.b.b.j.f5970T /* 45 */:
                                    case '.':
                                    case '/':
                                    case com.anythink.basead.b.b.j.f5973W /* 48 */:
                                    case com.anythink.basead.b.b.j.f5974X /* 49 */:
                                    case '2':
                                    case '3':
                                    case '4':
                                    case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                                    case '6':
                                    case '7':
                                    case p.a.f19837e /* 56 */:
                                    case '9':
                                    case ':':
                                    case j.v.f12748n /* 59 */:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case j.v.f12733G /* 65 */:
                                    case 'B':
                                    case j.v.f12739d /* 67 */:
                                    case 'D':
                                    case j.v.f12730D /* 69 */:
                                    case com.anythink.expressad.videocommon.e.b.aB /* 70 */:
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case j.v.f12755u /* 74 */:
                                    case j.v.f12756v /* 75 */:
                                    case j.v.f12760z /* 76 */:
                                    case j.v.f12728B /* 77 */:
                                    case 'N':
                                    case j.v.f12727A /* 79 */:
                                    case j.v.f12729C /* 80 */:
                                    case j.v.f12731E /* 81 */:
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
                                    case j.v.f12734H /* 92 */:
                                    case j.v.f12735I /* 93 */:
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
                                    case com.anythink.expressad.video.module.a.a.f21914z /* 109 */:
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
                                    case com.anythink.expressad.video.module.a.a.f21885Q /* 126 */:
                                    case com.anythink.expressad.video.module.a.a.f21886R /* 127 */:
                                    case 128:
                                    case com.anythink.expressad.video.module.a.a.f21888T /* 129 */:
                                    case com.anythink.expressad.video.module.a.a.f21889U /* 130 */:
                                    case com.anythink.expressad.video.module.a.a.f21890V /* 131 */:
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
                    f28543c2 = z10;
                    f28542b2 = true;
                }
                z10 = true;
                f28543c2 = z10;
                f28542b2 = true;
            }
        }
        return f28543c2;
    }

    public static List E0(Context context, C3796qP c3796qP, TP tp, boolean z8, boolean z9) {
        List a9;
        String str = tp.f27776o;
        if (str == null) {
            return C3675oC.f33115x;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC3194fG.i(context)) {
            String d2 = AbstractC3419jQ.d(tp);
            if (d2 == null) {
                a9 = C3675oC.f33115x;
            } else {
                c3796qP.getClass();
                a9 = AbstractC3419jQ.a(d2, z8, z9);
            }
            if (!a9.isEmpty()) {
                return a9;
            }
        }
        return AbstractC3419jQ.b(c3796qP, tp, z8, z9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007c, code lost:
    
        if (r3.equals("video/av01") != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int z0(C2986bQ c2986bQ, TP tp) {
        int i;
        int i4 = tp.f27783v;
        if (i4 != -1 && (i = tp.f27784w) != -1) {
            String str = tp.f27776o;
            str.getClass();
            char c4 = 2;
            if ("video/dolby-vision".equals(str)) {
                Pair b9 = AbstractC4295zm.b(tp);
                if (b9 != null) {
                    int intValue = ((Integer) b9.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = com.anythink.basead.exoplayer.k.o.f8608h;
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = com.anythink.basead.exoplayer.k.o.i;
            }
            int i9 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8607g)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.i)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1187890754:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8611l)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1331836730:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8608h)) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1599127256:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8609j)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1599127257:
                    if (str.equals(com.anythink.basead.exoplayer.k.o.f8610k)) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i4 * i) * 3) / i9;
                case 4:
                    return Math.max(2097152, ((i4 * i) * 3) / 4);
                case 5:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c2986bQ.f29495f)))) {
                        String str3 = AbstractC3548lu.f32613a;
                        return ((((i + 15) / 16) * ((i4 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i9 = 8;
                    return ((i4 * i) * 3) / i9;
            }
        }
        return -1;
    }

    public final void A0(YP yp, int i) {
        Trace.beginSection("skipVideoBuffer");
        yp.D(i);
        Trace.endSection();
        this.f30404a1.f26152f++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final C2931aQ B(IllegalStateException illegalStateException, C2986bQ c2986bQ) {
        Surface surface = this.f28546C1;
        T t9 = new T(illegalStateException, c2986bQ);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return t9;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface B0(C2986bQ c2986bQ) {
        boolean z8;
        Y y6;
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            return interfaceC4148x0.j();
        }
        Surface surface = this.f28546C1;
        if (surface != null) {
            return surface;
        }
        boolean z9 = false;
        if (Build.VERSION.SDK_INT >= 35 && c2986bQ.f29497h) {
            return null;
        }
        PA.T(!D0(c2986bQ.f29490a) && (!c2986bQ.f29495f || Z.a(this.f28567l1)));
        Z z10 = this.f28547D1;
        if (z10 != null) {
            if (z10.f28936n != c2986bQ.f29495f && z10 != null) {
                z10.release();
                this.f28547D1 = null;
            }
        }
        if (this.f28547D1 == null) {
            Context context = this.f28567l1;
            boolean z11 = c2986bQ.f29495f;
            if (!z11) {
                int i = Z.f28934w;
            } else if (!Z.a(context)) {
                z8 = false;
                PA.T(z8);
                y6 = new Y("ExoPlayer:PlaceholderSurface");
                int i4 = !z11 ? Z.f28934w : 0;
                y6.start();
                Handler handler = new Handler(y6.getLooper(), y6);
                y6.f28753u = handler;
                y6.f28752n = new RunnableC2526Dn(handler);
                synchronized (y6) {
                    y6.f28753u.obtainMessage(1, i4, 0).sendToTarget();
                    while (y6.f28756x == null && y6.f28755w == null && y6.f28754v == null) {
                        try {
                            y6.wait();
                        } catch (InterruptedException unused) {
                            z9 = true;
                        }
                    }
                }
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = y6.f28755w;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = y6.f28754v;
                if (error != null) {
                    throw error;
                }
                Z z12 = y6.f28756x;
                z12.getClass();
                this.f28547D1 = z12;
            }
            z8 = true;
            PA.T(z8);
            y6 = new Y("ExoPlayer:PlaceholderSurface");
            if (!z11) {
            }
            y6.start();
            Handler handler2 = new Handler(y6.getLooper(), y6);
            y6.f28753u = handler2;
            y6.f28752n = new RunnableC2526Dn(handler2);
            synchronized (y6) {
            }
        }
        return this.f28547D1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void C(TP tp) {
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 == null || interfaceC4148x0.c()) {
            return;
        }
        try {
            interfaceC4148x0.A0(tp);
        } catch (C4094w0 e6) {
            throw m(e6, tp, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void D(IN in) {
        ByteBuffer byteBuffer;
        C2881Yl c2881Yl = this.f28571r1;
        if (c2881Yl != null) {
            C2986bQ c2986bQ = this.f30356A0;
            c2986bQ.getClass();
            if (c2986bQ.f29491b.equals("video/av01") && in.h(1) && (byteBuffer = in.f25552e) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) c2881Yl.f28862u;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.f28566Z1 = 0;
        int E8 = E(in);
        if (Build.VERSION.SDK_INT < 34 || (E8 & 32) == 0) {
            this.f28553L1++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final int E(IN in) {
        return (Build.VERSION.SDK_INT < 34 || this.f28554M1 == null || in.f25553f >= this.f30362E || G0(in)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(IN in) {
        boolean z8;
        ByteBuffer byteBuffer;
        C3997uB c3997uB;
        O2 o22;
        boolean z9 = false;
        if (!G0(in)) {
            boolean z10 = in.f25553f < this.f30362E;
            C3393j0 c3393j0 = this.f28573t1;
            if (c3393j0 != null) {
                long j9 = c3393j0.f32052a == com.anythink.basead.exoplayer.b.f6539b ? -9223372036854775807L : (long) (((r2 - r6) * c3393j0.f32054c) + c3393j0.f32053b);
                if (j9 != com.anythink.basead.exoplayer.b.f6539b && j9 < this.f28572s1) {
                    z8 = true;
                    if ((!z10 || z8) && !in.h(268435456)) {
                        if (in.h(67108864)) {
                            C2881Yl c2881Yl = this.f28571r1;
                            if (c2881Yl != null) {
                                C2986bQ c2986bQ = this.f30356A0;
                                c2986bQ.getClass();
                                if (c2986bQ.f29491b.equals("video/av01") && (byteBuffer = in.f25552e) != null) {
                                    boolean z11 = z10 || this.f28566Z1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    ByteBuffer byteBuffer2 = (ByteBuffer) c2881Yl.f28862u;
                                    if (byteBuffer2.hasRemaining()) {
                                        c2881Yl.p(AbstractC2655Lg.h(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList h9 = AbstractC2655Lg.h(asReadOnlyBuffer);
                                    c2881Yl.p(h9);
                                    int size = h9.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        C3244gB c3244gB = (C3244gB) h9.get(size);
                                        int i4 = c3244gB.f30961a;
                                        if (i4 != 2 && i4 != 15) {
                                            if (i4 == 3) {
                                                if (!z11) {
                                                    break;
                                                }
                                                i4 = 3;
                                            }
                                            if ((i4 != 6 && i4 != 3) || (c3997uB = (C3997uB) c2881Yl.f28863v) == null) {
                                                break;
                                            }
                                            try {
                                                o22 = new O2(c3997uB, c3244gB);
                                            } catch (RA unused) {
                                                o22 = null;
                                            }
                                            if (o22 != null) {
                                                if (o22.f26640u) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((C3244gB) h9.get(size)).f30961a == 6 || ((C3244gB) h9.get(size)).f30961a == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = (i > 1 || size + 1 >= 8) ? asReadOnlyBuffer.limit() : size >= 0 ? ((C3244gB) h9.get(size)).f30962b.limit() : asReadOnlyBuffer.position();
                                    if (limit == 0) {
                                        in.i();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        W2.b bVar = this.f28575v1;
                                        bVar.getClass();
                                        if (bVar.f3425c + limit < asReadOnlyBuffer.capacity() && !in.h(1073741824)) {
                                            ByteBuffer byteBuffer3 = in.f25552e;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z9) {
                                if (z10) {
                                    this.f30404a1.f26150d++;
                                } else {
                                    this.f28574u1.add(Long.valueOf(in.f25553f));
                                    this.f28566Z1++;
                                }
                            }
                            return z9;
                        }
                        in.i();
                        z9 = true;
                        if (z9) {
                        }
                        return z9;
                    }
                }
            }
            z8 = false;
            if (!z10) {
            }
            if (in.h(67108864)) {
            }
            z9 = true;
            if (z9) {
            }
            return z9;
        }
        return false;
    }

    public final void F0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f28546C1;
        C3932t0 c3932t0 = this.n1;
        if (surface2 == surface) {
            if (surface != null) {
                C3100dd c3100dd = this.f28560T1;
                if (c3100dd != null) {
                    c3932t0.a(c3100dd);
                }
                Surface surface3 = this.f28546C1;
                if (surface3 == null || !this.f28548F1 || (handler = c3932t0.f34332a) == null) {
                    return;
                }
                handler.post(new RunnableC3878s0(c3932t0, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f28546C1 = surface;
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        C3341i0 c3341i0 = this.p1;
        if (interfaceC4148x0 == null) {
            c3341i0.c(surface);
        }
        this.f28548F1 = false;
        int i = this.f30355A;
        YP yp = this.f30421t0;
        if (yp != null && this.f28578y1 == null) {
            C2986bQ c2986bQ = this.f30356A0;
            c2986bQ.getClass();
            if (!H0(c2986bQ) || this.f28576w1) {
                w();
                u();
            } else {
                Surface B02 = B0(c2986bQ);
                if (B02 != null) {
                    yp.l(B02);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    yp.q();
                }
            }
        }
        if (surface != null) {
            C3100dd c3100dd2 = this.f28560T1;
            if (c3100dd2 != null) {
                c3932t0.a(c3100dd2);
            }
        } else {
            this.f28560T1 = null;
            InterfaceC4148x0 interfaceC4148x02 = this.f28578y1;
            if (interfaceC4148x02 != null) {
                interfaceC4148x02.n();
            }
        }
        if (i == 2) {
            InterfaceC4148x0 interfaceC4148x03 = this.f28578y1;
            if (interfaceC4148x03 != null) {
                interfaceC4148x03.x0(true);
            } else {
                c3341i0.i = true;
                c3341i0.f31301h = com.anythink.basead.exoplayer.b.f6539b;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void G(long j9, long j10) {
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            try {
                interfaceC4148x0.u0(j9, j10);
            } catch (C4094w0 e6) {
                throw m(e6, e6.f34913n, false, 7001);
            }
        }
        super.G(j9, j10);
    }

    public final boolean G0(IN in) {
        if (q0() || in.h(536870912)) {
            return true;
        }
        long j9 = this.f30373K;
        return j9 == com.anythink.basead.exoplayer.b.f6539b || j9 - (in.f25553f - this.f30405b1.f30056c) <= 100000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r7.f30369H0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H() {
        boolean a9;
        boolean z8 = false;
        if (this.Y != null) {
            if (q0()) {
                a9 = this.f30366G;
            } else {
                VQ vq = this.f30357B;
                vq.getClass();
                a9 = vq.a();
            }
            if (!a9) {
                if (!(this.f30372J0 >= 0)) {
                    if (this.f30369H0 != com.anythink.basead.exoplayer.b.f6539b) {
                        this.f30432z.getClass();
                    }
                }
            }
            z8 = true;
        }
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            return interfaceC4148x0.d0(z8);
        }
        if (z8 && this.f30421t0 == null) {
            return true;
        }
        return this.p1.e(z8);
    }

    public final boolean H0(C2986bQ c2986bQ) {
        if (this.f28578y1 != null) {
            return true;
        }
        Surface surface = this.f28546C1;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && c2986bQ.f29497h) {
            return true;
        }
        if (D0(c2986bQ.f29490a)) {
            return false;
        }
        return !c2986bQ.f29495f || Z.a(this.f28567l1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean I() {
        if (!this.f30401Y0) {
            return false;
        }
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        return interfaceC4148x0 == null || interfaceC4148x0.h();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final int L(C3796qP c3796qP, TP tp) {
        boolean z8;
        int i = 16;
        String str = tp.f27776o;
        if (!K4.b(str)) {
            return 128;
        }
        int i4 = 0;
        boolean z9 = tp.f27780s != null;
        Context context = this.f28567l1;
        List E02 = E0(context, c3796qP, tp, z9, false);
        if (z9 && E02.isEmpty()) {
            E02 = E0(context, c3796qP, tp, false, false);
        }
        if (E02.isEmpty()) {
            return com.anythink.expressad.video.module.a.a.f21888T;
        }
        if (tp.f27761O != 0) {
            return com.anythink.expressad.video.module.a.a.f21889U;
        }
        C2986bQ c2986bQ = (C2986bQ) E02.get(0);
        boolean b9 = c2986bQ.b(context, tp);
        if (!b9) {
            for (int i9 = 1; i9 < E02.size(); i9++) {
                C2986bQ c2986bQ2 = (C2986bQ) E02.get(i9);
                if (c2986bQ2.b(context, tp)) {
                    b9 = true;
                    z8 = false;
                    c2986bQ = c2986bQ2;
                    break;
                }
            }
        }
        z8 = true;
        int i10 = true != b9 ? 3 : 4;
        int i11 = true != c2986bQ.c(tp) ? 8 : 16;
        int i12 = true != c2986bQ.f29496g ? 0 : 64;
        int i13 = true != z8 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC3194fG.i(context)) {
            i13 = 256;
        }
        if (b9) {
            List E03 = E0(context, c3796qP, tp, z9, true);
            if (!E03.isEmpty()) {
                HashMap hashMap = AbstractC3419jQ.f32115a;
                ArrayList arrayList = new ArrayList(E03);
                Collections.sort(arrayList, new C3313hQ(new C4164xG(i, context, tp)));
                C2986bQ c2986bQ3 = (C2986bQ) arrayList.get(0);
                if (c2986bQ3.b(context, tp) && c2986bQ3.c(tp)) {
                    i4 = 32;
                }
            }
        }
        return i10 | i11 | i4 | i12 | i13;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final ArrayList N(C3796qP c3796qP, TP tp) {
        Context context = this.f28567l1;
        List E02 = E0(context, c3796qP, tp, false, false);
        HashMap hashMap = AbstractC3419jQ.f32115a;
        ArrayList arrayList = new ArrayList(E02);
        Collections.sort(arrayList, new C3313hQ(new C4164xG(16, context, tp)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final r Q(C2986bQ c2986bQ, TP tp, float f6) {
        C2980bK c2980bK;
        int i;
        W2.b bVar;
        Point point;
        int i4;
        int i9;
        int i10;
        boolean z8;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        TP[] tpArr;
        int i11;
        char c4;
        int i12;
        Pair b9;
        int z02;
        TP[] tpArr2 = this.f30359C;
        tpArr2.getClass();
        int length = tpArr2.length;
        int C0 = C0(c2986bQ, tp);
        float f9 = tp.f27787z;
        C2980bK c2980bK2 = tp.f27752E;
        int i13 = tp.f27784w;
        int i14 = tp.f27783v;
        if (length == 1) {
            if (C0 != -1 && (z02 = z0(c2986bQ, tp)) != -1) {
                C0 = Math.min((int) (C0 * 1.5f), z02);
            }
            bVar = new W2.b(i14, i13, C0, false);
            c2980bK = c2980bK2;
            i = i13;
        } else {
            int i15 = i13;
            int i16 = i14;
            int i17 = 0;
            boolean z9 = false;
            while (i17 < length) {
                TP tp2 = tpArr2[i17];
                if (c2980bK2 != null && tp2.f27752E == null) {
                    C4065vP c4065vP = new C4065vP(tp2);
                    c4065vP.f34763D = c2980bK2;
                    tp2 = new TP(c4065vP);
                }
                if (c2986bQ.d(tp, tp2).f26334d != 0) {
                    int i18 = tp2.f27784w;
                    tpArr = tpArr2;
                    int i19 = tp2.f27783v;
                    i11 = length;
                    c4 = 65535;
                    z9 |= i19 == -1 || i18 == -1;
                    i16 = Math.max(i16, i19);
                    i15 = Math.max(i15, i18);
                    C0 = Math.max(C0, C0(c2986bQ, tp2));
                } else {
                    tpArr = tpArr2;
                    i11 = length;
                    c4 = 65535;
                }
                i17++;
                tpArr2 = tpArr;
                length = i11;
            }
            if (z9) {
                AbstractC3217fl.I("MediaCodecVideoRenderer", D.y.n(new StringBuilder(String.valueOf(i16).length() + 44 + String.valueOf(i15).length()), "Resolutions unknown. Codec max resolution: ", i16, "x", i15));
                boolean z10 = i13 > i14;
                int i20 = z10 ? i13 : i14;
                int i21 = true != z10 ? i13 : i14;
                int[] iArr = f28541a2;
                c2980bK = c2980bK2;
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
                    if (i24 <= i20 || (i4 = (int) (f12 * (f10 / f11))) <= i21) {
                        break;
                    }
                    if (true != z10) {
                        i9 = i21;
                        i10 = i24;
                    } else {
                        i9 = i21;
                        i10 = i4;
                    }
                    int i25 = true == z10 ? i24 : i4;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = c2986bQ.f29493d;
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                        point2 = C2986bQ.j(videoCapabilities, i10, i25);
                    }
                    point = point2;
                    if (point != null) {
                        z8 = z10;
                        i = i13;
                        if (c2986bQ.e(point.x, point.y, f9)) {
                            break;
                        }
                    } else {
                        z8 = z10;
                        i = i13;
                    }
                    i22 = i23 + 1;
                    z10 = z8;
                    i21 = i9;
                    i13 = i;
                }
                i = i13;
                point = null;
                if (point != null) {
                    i16 = Math.max(i16, point.x);
                    i15 = Math.max(i15, point.y);
                    C4065vP c4065vP2 = new C4065vP(tp);
                    c4065vP2.f34792u = i16;
                    c4065vP2.f34793v = i15;
                    C0 = Math.max(C0, z0(c2986bQ, new TP(c4065vP2)));
                    AbstractC3217fl.I("MediaCodecVideoRenderer", D.y.n(new StringBuilder(CL.b(i16, 35) + String.valueOf(i15).length()), "Codec max resolution adjusted to: ", i16, "x", i15));
                }
            } else {
                c2980bK = c2980bK2;
                i = i13;
            }
            bVar = new W2.b(i16, i15, C0, false);
        }
        String str = c2986bQ.f29492c;
        this.f28575v1 = bVar;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i14);
        mediaFormat.setInteger("height", i);
        AbstractC3217fl.m(mediaFormat, tp.f27779r);
        if (f9 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f9);
        }
        AbstractC3217fl.x(mediaFormat, "rotation-degrees", tp.f27748A);
        if (c2980bK != null) {
            C2980bK c2980bK3 = c2980bK;
            AbstractC3217fl.x(mediaFormat, "color-transfer", c2980bK3.f29472c);
            AbstractC3217fl.x(mediaFormat, "color-standard", c2980bK3.f29470a);
            AbstractC3217fl.x(mediaFormat, "color-range", c2980bK3.f29471b);
            byte[] bArr = c2980bK3.f29473d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(tp.f27776o) && (b9 = AbstractC4295zm.b(tp)) != null) {
            AbstractC3217fl.x(mediaFormat, "profile", ((Integer) b9.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f3423a);
        mediaFormat.setInteger("max-height", bVar.f3424b);
        AbstractC3217fl.x(mediaFormat, "max-input-size", bVar.f3425c);
        mediaFormat.setInteger("priority", 0);
        if (f6 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f6);
        }
        if (this.f28569o1) {
            mediaFormat.setInteger("no-post-process", 1);
            i12 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i12 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(i12, -this.f28561U1));
        }
        h0(mediaFormat);
        Surface B02 = B0(c2986bQ);
        if (this.f28578y1 != null && !AbstractC3548lu.l(this.f28567l1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new r(c2986bQ, mediaFormat, tp, B02, null, 12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final MN R(C2986bQ c2986bQ, TP tp, TP tp2, boolean z8) {
        int i;
        int i4;
        int i9;
        MN d2 = c2986bQ.d(tp, tp2);
        W2.b bVar = this.f28575v1;
        bVar.getClass();
        int i10 = tp2.f27783v;
        int i11 = bVar.f3423a;
        int i12 = d2.f26335e;
        if (i10 > i11 || tp2.f27784w > bVar.f3424b) {
            i12 |= 256;
        }
        if (C0(c2986bQ, tp2) > bVar.f3425c) {
            i12 |= 64;
        }
        if (this.H1 != Integer.MIN_VALUE && (i9 = Build.VERSION.SDK_INT) < 31 && (i9 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f6 = tp.f27787z;
            if (f6 != -1.0f) {
                float f9 = tp2.f27787z;
                if (f9 != -1.0f && (!c2986bQ.f29495f || !z8)) {
                    if (Math.abs((Math.max(f9, f6) / Math.min(f9, f6)) - Math.round(r15)) > 0.01f) {
                        i12 |= com.anythink.basead.exoplayer.b.aX;
                    }
                }
            }
        }
        if (i12 != 0) {
            i4 = 0;
            i = i12;
        } else {
            i = 0;
            i4 = d2.f26334d;
        }
        return new MN(c2986bQ.f29490a, tp, tp2, i4, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final float T(float f6, TP tp, TP[] tpArr) {
        C2986bQ c2986bQ;
        float f9 = -1.0f;
        for (TP tp2 : tpArr) {
            float f10 = tp2.f27787z;
            if (f10 != -1.0f) {
                f9 = Math.max(f9, f10);
            }
        }
        float f11 = f9 == -1.0f ? -1.0f : f9 * f6;
        if (this.f28554M1 == null || (c2986bQ = this.f30356A0) == null) {
            return f11;
        }
        int i = tp.f27783v;
        float f12 = -3.4028235E38f;
        if (c2986bQ.i) {
            float f13 = c2986bQ.f29500l;
            int i4 = tp.f27784w;
            if (f13 != -3.4028235E38f && c2986bQ.f29498j == i && c2986bQ.f29499k == i4) {
                f12 = f13;
            } else {
                f12 = 1024.0f;
                if (!c2986bQ.e(i, i4, 1024.0d)) {
                    float f14 = 0.0f;
                    while (true) {
                        float f15 = f12 - f14;
                        if (Math.abs(f15) <= 5.0f) {
                            break;
                        }
                        float f16 = (f15 / 2.0f) + f14;
                        boolean e6 = c2986bQ.e(i, i4, f16);
                        if (true == e6) {
                            f14 = f16;
                        }
                        if (true != e6) {
                            f12 = f16;
                        }
                    }
                    f12 = f14;
                }
                c2986bQ.f29500l = f12;
                c2986bQ.f29498j = i;
                c2986bQ.f29499k = i4;
            }
        }
        return f11 != -1.0f ? Math.max(f11, f12) : f12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void U(String str, long j9, long j10) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C3932t0 c3932t0 = this.n1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC3717p0(c3932t0, str2, j9, j10));
        } else {
            str2 = str;
        }
        this.f28576w1 = D0(str2);
        C2986bQ c2986bQ = this.f30356A0;
        c2986bQ.getClass();
        boolean z8 = false;
        if (Build.VERSION.SDK_INT >= 29 && com.anythink.basead.exoplayer.k.o.f8610k.equals(c2986bQ.f29491b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c2986bQ.f29493d;
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
                    z8 = true;
                    break;
                }
                i++;
            }
        }
        this.f28577x1 = z8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void V(String str) {
        C3932t0 c3932t0 = this.n1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3717p0(c3932t0, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void W(Exception exc) {
        AbstractC3217fl.X("MediaCodecVideoRenderer", "Video codec error", exc);
        C3932t0 c3932t0 = this.n1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3717p0(c3932t0, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final MN X(C4164xG c4164xG) {
        MN X8 = super.X(c4164xG);
        TP tp = (TP) c4164xG.f35133v;
        tp.getClass();
        C3932t0 c3932t0 = this.n1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3771q0(c3932t0, tp, X8, 0));
        }
        C3393j0 c3393j0 = this.f28573t1;
        if (c3393j0 != null) {
            c3393j0.c();
        }
        return X8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void Y(TP tp, MediaFormat mediaFormat) {
        YP yp = this.f30421t0;
        if (yp != null) {
            yp.w(this.f28549G1);
        }
        mediaFormat.getClass();
        boolean z8 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z8 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z8 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f6 = tp.f27749B;
        int i = tp.f27748A;
        if (i == 90 || i == 270) {
            f6 = 1.0f / f6;
            int i4 = integer2;
            integer2 = integer;
            integer = i4;
        }
        this.f28559S1 = new C3100dd(integer, integer2, f6);
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 == null || !this.f28565Y1) {
            this.p1.d(tp.f27787z);
        } else {
            C4065vP c4065vP = new C4065vP(tp);
            c4065vP.f34792u = integer;
            c4065vP.f34793v = integer2;
            c4065vP.f34760A = f6;
            TP tp2 = new TP(c4065vP);
            int i9 = this.f28544A1;
            List list = this.f28545B1;
            if (list == null) {
                list = C3675oC.f33115x;
            }
            interfaceC4148x0.z0(tp2, this.f30405b1.f30055b, i9, list);
            this.f28544A1 = 2;
        }
        this.f28565Y1 = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void Z() {
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            interfaceC4148x0.l();
            long j9 = this.f28564X1;
            if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                j9 = this.f30405b1.f30055b;
                this.f28564X1 = j9;
            }
            this.f28578y1.y0(-j9);
        } else {
            this.p1.a(2);
        }
        this.f28565Y1 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void a(long j9, boolean z8, boolean z9) {
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null && !z8) {
            interfaceC4148x0.o0(true);
        }
        if (z9) {
            this.f28555N1 = j9;
        }
        super.a(j9, z8, z9);
        InterfaceC4148x0 interfaceC4148x02 = this.f28578y1;
        C3341i0 c3341i0 = this.p1;
        if (interfaceC4148x02 == null) {
            c3341i0.f31295b.a();
            c3341i0.f31300g = com.anythink.basead.exoplayer.b.f6539b;
            c3341i0.f31298e = com.anythink.basead.exoplayer.b.f6539b;
            c3341i0.f31297d = Math.min(c3341i0.f31297d, 1);
            c3341i0.f31301h = com.anythink.basead.exoplayer.b.f6539b;
            c3341i0.f31305m = false;
        }
        C3393j0 c3393j0 = this.f28573t1;
        if (c3393j0 != null) {
            c3393j0.c();
        }
        if (z8) {
            InterfaceC4148x0 interfaceC4148x03 = this.f28578y1;
            if (interfaceC4148x03 != null) {
                interfaceC4148x03.x0(false);
            } else {
                c3341i0.i = false;
                c3341i0.f31301h = com.anythink.basead.exoplayer.b.f6539b;
            }
        }
        this.f28552K1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean a0(long j9, long j10, YP yp, ByteBuffer byteBuffer, int i, int i4, int i9, long j11, boolean z8, boolean z9, TP tp) {
        int i10;
        yp.getClass();
        long j12 = j11 - this.f30405b1.f30056c;
        int i11 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f28574u1;
            Long l9 = (Long) priorityQueue.peek();
            if (l9 == null || l9.longValue() >= j11) {
                break;
            }
            priorityQueue.poll();
            i11++;
        }
        v0(i11, 0);
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            if (!z8 || z9) {
                return interfaceC4148x0.t0(j11, new V(this, yp, i, j12));
            }
            A0(yp, i);
            return true;
        }
        long j13 = this.f30405b1.f30055b;
        C3341i0 c3341i0 = this.p1;
        C3287h0 c3287h0 = this.f28570q1;
        int f6 = c3341i0.f(j11, j9, j10, j13, z8, z9, c3287h0);
        C3393j0 c3393j0 = this.f28573t1;
        if (c3393j0 != null) {
            if (f6 != 5 && f6 != 4) {
                c3393j0.a(j11, c3287h0.f31130a);
            }
            return false;
        }
        if (f6 == 0) {
            this.f30432z.getClass();
            long nanoTime = System.nanoTime();
            InterfaceC3233g0 interfaceC3233g0 = this.f28563W1;
            if (interfaceC3233g0 != null) {
                interfaceC3233g0.a(j12, nanoTime, tp, this.f30425v0);
            }
            x0(yp, i, nanoTime);
            w0(c3287h0.f31130a);
            return true;
        }
        if (f6 != 1) {
            if (f6 != 2) {
                if (f6 == 3) {
                    A0(yp, i);
                    w0(c3287h0.f31130a);
                    return true;
                }
                return false;
            }
            Trace.beginSection("dropVideoBuffer");
            yp.D(i);
            Trace.endSection();
            v0(0, 1);
            w0(c3287h0.f31130a);
            return true;
        }
        long j14 = c3287h0.f31131b;
        long j15 = c3287h0.f31130a;
        if (j14 == this.f28558R1) {
            A0(yp, i);
        } else {
            InterfaceC3233g0 interfaceC3233g02 = this.f28563W1;
            if (interfaceC3233g02 != null) {
                i10 = i;
                interfaceC3233g02.a(j12, j14, tp, this.f30425v0);
            } else {
                i10 = i;
            }
            x0(yp, i10, j14);
        }
        w0(j15);
        this.f28558R1 = j14;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void b0(KN kn) {
        C3932t0 c3932t0 = this.n1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new MD(3, c3932t0, kn));
        }
    }

    @Override // com.google.android.gms.internal.ads.BO
    public final void c(int i, Object obj) {
        if (i == 1) {
            F0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC3233g0 interfaceC3233g0 = (InterfaceC3233g0) obj;
            this.f28563W1 = interfaceC3233g0;
            InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
            if (interfaceC4148x0 != null) {
                interfaceC4148x0.p0(interfaceC3233g0);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f28562V1 != intValue) {
                this.f28562V1 = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f28549G1 = intValue2;
            YP yp = this.f30421t0;
            if (yp != null) {
                yp.w(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.H1 = intValue3;
            InterfaceC4148x0 interfaceC4148x02 = this.f28578y1;
            if (interfaceC4148x02 != null) {
                interfaceC4148x02.v0(intValue3);
                return;
            }
            C3609n0 c3609n0 = this.p1.f31295b;
            if (c3609n0.f32793j == intValue3) {
                return;
            }
            c3609n0.f32793j = intValue3;
            c3609n0.c(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC3638nc.f32868a)) {
                InterfaceC4148x0 interfaceC4148x03 = this.f28578y1;
                if (interfaceC4148x03 == null || !interfaceC4148x03.c()) {
                    return;
                }
                interfaceC4148x03.f();
                return;
            }
            this.f28545B1 = list;
            InterfaceC4148x0 interfaceC4148x04 = this.f28578y1;
            if (interfaceC4148x04 != null) {
                interfaceC4148x04.w0(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            Xr xr = (Xr) obj;
            if (xr.f28711a == 0 || xr.f28712b == 0) {
                return;
            }
            this.E1 = xr;
            InterfaceC4148x0 interfaceC4148x05 = this.f28578y1;
            if (interfaceC4148x05 != null) {
                Surface surface = this.f28546C1;
                surface.getClass();
                interfaceC4148x05.s0(surface, xr);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f28561U1 = ((Integer) obj).intValue();
                YP yp2 = this.f30421t0;
                if (yp2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f28561U1));
                    yp2.g(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f28546C1;
                F0(null);
                obj.getClass();
                ((X) obj).c(1, surface2);
                break;
            case 18:
                boolean z8 = this.f28554M1 != null;
                GO go = (GO) obj;
                this.f28554M1 = go;
                if (z8 != (go != null)) {
                    i0(this.f30423u0);
                    break;
                }
                break;
            default:
                if (i == 11) {
                    C3147eO c3147eO = (C3147eO) obj;
                    c3147eO.getClass();
                    this.f30417p0 = c3147eO;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void c0() {
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            interfaceC4148x0.l();
        } else {
            long j9 = this.f30405b1.f30059f;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void d() {
        this.f28551J1 = 0;
        this.f30432z.getClass();
        this.f28550I1 = SystemClock.elapsedRealtime();
        this.P1 = 0L;
        this.f28557Q1 = 0;
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            interfaceC4148x0.a();
        } else {
            this.p1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void e0(IN in) {
        if (this.f28577x1) {
            ByteBuffer byteBuffer = in.f25554g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b9 = byteBuffer.get();
                short s3 = byteBuffer.getShort();
                short s6 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b9 == -75 && s3 == 60 && s6 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        YP yp = this.f30421t0;
                        yp.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        yp.g(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void f() {
        int i = this.f28551J1;
        final C3932t0 c3932t0 = this.n1;
        if (i > 0) {
            this.f30432z.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j9 = elapsedRealtime - this.f28550I1;
            final int i4 = this.f28551J1;
            Handler handler = c3932t0.f34332a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3932t0 c3932t02 = c3932t0;
                        c3932t02.getClass();
                        String str = AbstractC3548lu.f32613a;
                        OO oo = c3932t02.f34333b.f28243n.f30021L;
                        KO y6 = oo.y((BQ) oo.f26694d.f27123x);
                        oo.s(y6, 1018, new J6.i(y6, i4, j9));
                    }
                });
            }
            this.f28551J1 = 0;
            this.f28550I1 = elapsedRealtime;
        }
        int i9 = this.f28557Q1;
        if (i9 != 0) {
            long j10 = this.P1;
            Handler handler2 = c3932t0.f34332a;
            if (handler2 != null) {
                handler2.post(new RunnableC3717p0(i9, j10, c3932t0));
            }
            this.P1 = 0L;
            this.f28557Q1 = 0;
        }
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            interfaceC4148x0.d();
        } else {
            C3341i0 c3341i0 = this.p1;
            c3341i0.f31296c = false;
            c3341i0.f31301h = com.anythink.basead.exoplayer.b.f6539b;
            C3609n0 c3609n0 = c3341i0.f31295b;
            c3609n0.f32788d = false;
            AbstractC3447k0 abstractC3447k0 = c3609n0.f32787c;
            if (abstractC3447k0 != null) {
                abstractC3447k0.b();
            }
            c3609n0.d();
        }
        C3393j0 c3393j0 = this.f28573t1;
        if (c3393j0 != null) {
            c3393j0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void g0(long j9) {
        super.g0(j9);
        this.f28553L1--;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void i() {
        C3932t0 c3932t0 = this.n1;
        this.f28560T1 = null;
        this.f28548F1 = false;
        this.f28556O1 = true;
        try {
            super.i();
            LN ln = this.f30404a1;
            c3932t0.getClass();
            synchronized (ln) {
            }
            Handler handler = c3932t0.f34332a;
            if (handler != null) {
                handler.post(new MD(2, c3932t0, ln));
            }
            c3932t0.a(C3100dd.f30070d);
        } catch (Throwable th) {
            LN ln2 = this.f30404a1;
            c3932t0.getClass();
            synchronized (ln2) {
                Handler handler2 = c3932t0.f34332a;
                if (handler2 != null) {
                    handler2.post(new MD(2, c3932t0, ln2));
                }
                c3932t0.a(C3100dd.f30070d);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void j() {
        try {
            try {
                this.f30376L0 = false;
                f0();
                w();
            } finally {
                this.f30416o0 = null;
            }
        } finally {
            this.f28579z1 = false;
            this.f28564X1 = com.anythink.basead.exoplayer.b.f6539b;
            Z z8 = this.f28547D1;
            if (z8 != null) {
                z8.release();
                this.f28547D1 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void k() {
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 == null || !this.f28568m1) {
            return;
        }
        interfaceC4148x0.G();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final String o() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean p(long j9) {
        if (this.f30396V0 == com.anythink.basead.exoplayer.b.f6539b || j9 < this.f28555N1) {
            return false;
        }
        long j10 = this.f30406c1;
        return j10 == com.anythink.basead.exoplayer.b.f6539b || j9 > j10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void q(float f6, float f9) {
        super.q(f6, f9);
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 != null) {
            interfaceC4148x0.q0(f6);
        } else {
            this.p1.g(f6);
        }
        C3393j0 c3393j0 = this.f28573t1;
        if (c3393j0 != null) {
            c3393j0.b(f6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void r() {
        InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
        if (interfaceC4148x0 == null) {
            C3341i0 c3341i0 = this.p1;
            if (c3341i0.f31297d == 0) {
                c3341i0.f31297d = 1;
                return;
            }
            return;
        }
        int i = this.f28544A1;
        if (i == 0 || i == 1) {
            this.f28544A1 = 0;
        } else {
            interfaceC4148x0.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void t0(boolean z8, boolean z9) {
        InterfaceC4148x0 interfaceC4148x0;
        this.f30404a1 = new LN();
        l();
        LN ln = this.f30404a1;
        C3932t0 c3932t0 = this.n1;
        Handler handler = c3932t0.f34332a;
        if (handler != null) {
            handler.post(new RunnableC3717p0(c3932t0, ln, 4));
        }
        boolean z10 = this.f28579z1;
        C3341i0 c3341i0 = this.p1;
        if (!z10) {
            if (this.f28545B1 != null && this.f28578y1 == null) {
                C2905a0 c2905a0 = new C2905a0(this.f28567l1, c3341i0);
                c2905a0.f29148d = true;
                c2905a0.f29151g = -this.f28572s1;
                T2 t22 = this.f30432z;
                t22.getClass();
                c2905a0.f29149e = t22;
                PA.T(!c2905a0.f29150f);
                if (c2905a0.f29147c == null) {
                    c2905a0.f29147c = new C3069d0();
                }
                C3178f0 c3178f0 = new C3178f0(c2905a0);
                c2905a0.f29150f = true;
                c3178f0.f30577p = 1;
                SparseArray sparseArray = c3178f0.f30565c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    interfaceC4148x0 = (InterfaceC4148x0) sparseArray.get(0);
                } else {
                    C2960b0 c2960b0 = new C2960b0(c3178f0, c3178f0.f30563a);
                    c3178f0.f30569g.add(c2960b0);
                    sparseArray.put(0, c2960b0);
                    interfaceC4148x0 = c2960b0;
                }
                this.f28578y1 = interfaceC4148x0;
            }
            this.f28579z1 = true;
        }
        int i = !z9 ? 1 : 0;
        InterfaceC4148x0 interfaceC4148x02 = this.f28578y1;
        if (interfaceC4148x02 == null) {
            T2 t23 = this.f30432z;
            t23.getClass();
            c3341i0.f31303k = t23;
            c3341i0.a(i);
            return;
        }
        interfaceC4148x02.r0(new U(this));
        InterfaceC3233g0 interfaceC3233g0 = this.f28563W1;
        if (interfaceC3233g0 != null) {
            this.f28578y1.p0(interfaceC3233g0);
        }
        if (this.f28546C1 != null && !this.E1.equals(Xr.f28710c)) {
            this.f28578y1.s0(this.f28546C1, this.E1);
        }
        this.f28578y1.v0(this.H1);
        this.f28578y1.q0(this.f30419r0);
        List list = this.f28545B1;
        if (list != null) {
            this.f28578y1.w0(list);
        }
        this.f28544A1 = i;
        this.f30408e1 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void u0(TP[] tpArr, long j9, long j10, BQ bq) {
        super.u0(tpArr, j9, j10, bq);
        C3393j0 c3393j0 = this.f28573t1;
        if (c3393j0 != null) {
            c3393j0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean v(C2986bQ c2986bQ) {
        return H0(c2986bQ);
    }

    public final void v0(int i, int i4) {
        LN ln = this.f30404a1;
        ln.f26154h += i;
        int i9 = i + i4;
        ln.f26153g += i9;
        this.f28551J1 += i9;
        int i10 = this.f28552K1 + i9;
        this.f28552K1 = i10;
        ln.i = Math.max(i10, ln.i);
    }

    public final void w0(long j9) {
        LN ln = this.f30404a1;
        ln.f26156k += j9;
        ln.f26157l++;
        this.P1 += j9;
        this.f28557Q1++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean x() {
        C2986bQ c2986bQ = this.f30356A0;
        if (this.f28578y1 != null && c2986bQ != null) {
            String str = c2986bQ.f29490a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x();
    }

    public final void x0(YP yp, int i, long j9) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        yp.H(i, j9);
        Trace.endSection();
        this.f30404a1.f26151e++;
        this.f28552K1 = 0;
        if (this.f28578y1 == null) {
            C3100dd c3100dd = this.f28559S1;
            boolean equals = c3100dd.equals(C3100dd.f30070d);
            C3932t0 c3932t0 = this.n1;
            if (!equals && !c3100dd.equals(this.f28560T1)) {
                this.f28560T1 = c3100dd;
                c3932t0.a(c3100dd);
            }
            C3341i0 c3341i0 = this.p1;
            int i4 = c3341i0.f31297d;
            c3341i0.f31297d = 3;
            c3341i0.f31303k.getClass();
            c3341i0.f31299f = AbstractC3548lu.u(SystemClock.elapsedRealtime());
            if (i4 == 3 || (surface = this.f28546C1) == null) {
                return;
            }
            Handler handler = c3932t0.f34332a;
            if (handler != null) {
                handler.post(new RunnableC3878s0(c3932t0, surface, SystemClock.elapsedRealtime()));
            }
            this.f28548F1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final boolean y() {
        boolean z8;
        TP tp = this.f30423u0;
        long j9 = this.f30373K;
        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
            if (this.f30410g1 + 1 + j9 <= Long.MAX_VALUE - (this.f30405b1.f30056c + j9)) {
                z8 = false;
                return this.f28554M1 == null || this.f28556O1 || (tp != null && tp.f27778q > 0) || z8 || this.f30405b1.f30059f != com.anythink.basead.exoplayer.b.f6539b;
            }
        }
        z8 = true;
        if (this.f28554M1 == null) {
        }
    }

    public final boolean y0(long j9, long j10, boolean z8, boolean z9) {
        if (this.f28578y1 != null && this.f28568m1) {
            j10 -= -this.f28564X1;
        }
        if (j9 < -500000 && !z8) {
            VQ vq = this.f30357B;
            vq.getClass();
            int b9 = vq.b(j10 - this.f30360D);
            if (b9 != 0) {
                this.f28555N1 = j10;
                PriorityQueue priorityQueue = this.f28574u1;
                if (z9) {
                    LN ln = this.f30404a1;
                    int i = ln.f26150d + b9;
                    ln.f26150d = i;
                    ln.f26152f += this.f28553L1;
                    ln.f26150d = priorityQueue.size() + i;
                } else {
                    this.f30404a1.f26155j++;
                    v0(priorityQueue.size() + b9, this.f28553L1);
                }
                if (this.f30421t0 != null) {
                    if (x()) {
                        w();
                        u();
                    } else if (y()) {
                        s();
                    } else {
                        this.f30409f1 = true;
                    }
                }
                InterfaceC4148x0 interfaceC4148x0 = this.f28578y1;
                if (interfaceC4148x0 != null) {
                    interfaceC4148x0.o0(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3149eQ
    public final void z() {
        super.z();
        this.f28574u1.clear();
        this.f28553L1 = 0;
        this.f28566Z1 = 0;
        this.f28556O1 = false;
        C2881Yl c2881Yl = this.f28571r1;
        if (c2881Yl != null) {
            c2881Yl.f28863v = null;
            ByteBuffer byteBuffer = (ByteBuffer) c2881Yl.f28862u;
            byteBuffer.position(byteBuffer.limit());
        }
    }
}
