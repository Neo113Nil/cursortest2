package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.aa;
import defpackage.abu;
import defpackage.acu;
import defpackage.akh;
import defpackage.at2;
import defpackage.bkh;
import defpackage.bsc;
import defpackage.cbu;
import defpackage.ckh;
import defpackage.d18;
import defpackage.dbu;
import defpackage.dsc;
import defpackage.dvt;
import defpackage.dxr;
import defpackage.dzr;
import defpackage.e48;
import defpackage.e7o;
import defpackage.gbu;
import defpackage.gtm;
import defpackage.gxn;
import defpackage.hbu;
import defpackage.ig7;
import defpackage.iih;
import defpackage.kmq;
import defpackage.l5i;
import defpackage.lih;
import defpackage.m78;
import defpackage.mgr;
import defpackage.mih;
import defpackage.ois;
import defpackage.pqb;
import defpackage.q85;
import defpackage.qdc;
import defpackage.qg7;
import defpackage.qih;
import defpackage.qsn;
import defpackage.rcu;
import defpackage.rdk;
import defpackage.rih;
import defpackage.sis;
import defpackage.tcu;
import defpackage.tg7;
import defpackage.tyi;
import defpackage.ude;
import defpackage.usk;
import defpackage.uvh;
import defpackage.vq1;
import defpackage.woe;
import defpackage.xlr;
import defpackage.xq0;
import defpackage.y1g;
import defpackage.y7l;
import defpackage.yde;
import defpackage.yx1;
import defpackage.zbu;
import defpackage.zjh;
import defpackage.zqa;
import defpackage.zrb;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class a extends qih implements cbu {
    public static final int[] X1 = {ScreenMirroringConfig.Video.DEFAULT_WIDTH, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean Y1;
    public static boolean Z1;
    public kmq A1;
    public boolean B1;
    public int C1;
    public int D1;
    public long E1;
    public int F1;
    public int G1;
    public int H1;
    public long I1;
    public int J1;
    public long K1;
    public tcu L1;
    public tcu M1;
    public int N1;
    public boolean O1;
    public int P1;
    public ckh Q1;
    public abu R1;
    public long S1;
    public long T1;
    public boolean U1;
    public boolean V1;
    public int W1;
    public final Context j1;
    public final boolean k1;
    public final dxr l1;
    public final int m1;
    public final boolean n1;
    public final dbu o1;
    public final mgr p1;
    public final long q1;
    public final PriorityQueue r1;
    public aa s1;
    public boolean t1;
    public boolean u1;
    public m78 v1;
    public boolean w1;
    public List x1;
    public Surface y1;
    public usk z1;

    public a(bkh bkhVar) {
        super(2, bkhVar.d, bkhVar.c, bkhVar.f, 30.0f);
        Context applicationContext = bkhVar.a.getApplicationContext();
        this.j1 = applicationContext;
        this.m1 = bkhVar.i;
        this.v1 = null;
        this.l1 = new dxr(bkhVar.g, bkhVar.h);
        this.k1 = this.v1 == null;
        this.o1 = new dbu(applicationContext, this, bkhVar.e);
        this.p1 = new mgr();
        this.n1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.A1 = kmq.c;
        this.C1 = 1;
        this.D1 = 0;
        this.L1 = tcu.d;
        this.P1 = 0;
        this.M1 = null;
        this.N1 = -1000;
        this.S1 = -9223372036854775807L;
        this.T1 = -9223372036854775807L;
        this.r1 = new PriorityQueue();
        this.q1 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int F0(mih mihVar, dsc dscVar) {
        int i = dscVar.u;
        int i2 = dscVar.v;
        if (i != -1 && i2 != -1) {
            String str = dscVar.n;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair d = zjh.d(dscVar);
                if (d != null) {
                    int intValue = ((Integer) d.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i * i2) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mihVar.g)))) {
                        return ((dvt.f(i2, 16) * dvt.f(i, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List G0(Context context, rih rihVar, dsc dscVar, boolean z, boolean z2) {
        String str = dscVar.n;
        if (str == null) {
            return qsn.e;
        }
        if (dvt.a >= 26 && "video/dolby-vision".equals(str) && !woe.k(context)) {
            String b = zjh.b(dscVar);
            List b2 = b == null ? qsn.e : rihVar.b(b, z, z2);
            if (!b2.isEmpty()) {
                return b2;
            }
        }
        return zjh.g(rihVar, dscVar, z, z2);
    }

    public static int H0(mih mihVar, dsc dscVar) {
        int i = dscVar.o;
        List list = dscVar.q;
        if (i == -1) {
            return F0(mihVar, dscVar);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return dscVar.o + i2;
    }

    @Override // defpackage.at2
    public final void A() {
        this.F1 = 0;
        this.g.getClass();
        this.E1 = SystemClock.elapsedRealtime();
        this.I1 = 0L;
        this.J1 = 0;
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.D();
        } else {
            this.o1.f();
        }
    }

    @Override // defpackage.qih
    public final int A0(rih rihVar, dsc dscVar) {
        boolean z;
        int i = 0;
        if (!l5i.o(dscVar.n)) {
            return at2.e(0, 0, 0, 0);
        }
        boolean z2 = dscVar.r != null;
        Context context = this.j1;
        List G0 = G0(context, rihVar, dscVar, z2, false);
        if (z2 && G0.isEmpty()) {
            G0 = G0(context, rihVar, dscVar, false, false);
        }
        if (G0.isEmpty()) {
            return at2.e(1, 0, 0, 0);
        }
        int i2 = dscVar.M;
        if (i2 != 0 && i2 != 2) {
            return at2.e(2, 0, 0, 0);
        }
        mih mihVar = (mih) G0.get(0);
        boolean e = mihVar.e(dscVar);
        if (!e) {
            for (int i3 = 1; i3 < G0.size(); i3++) {
                mih mihVar2 = (mih) G0.get(i3);
                if (mihVar2.e(dscVar)) {
                    z = false;
                    e = true;
                    mihVar = mihVar2;
                    break;
                }
            }
        }
        z = true;
        int i4 = e ? 4 : 3;
        int i5 = mihVar.g(dscVar) ? 16 : 8;
        int i6 = mihVar.h ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (dvt.a >= 26 && "video/dolby-vision".equals(dscVar.n) && !woe.k(context)) {
            i7 = 256;
        }
        int i8 = i7;
        if (e) {
            List G02 = G0(context, rihVar, dscVar, z2, true);
            if (!G02.isEmpty()) {
                mih mihVar3 = (mih) zjh.h(dscVar, G02).get(0);
                if (mihVar3.e(dscVar) && mihVar3.g(dscVar)) {
                    i = 32;
                }
            }
        }
        return at2.f(i4, i5, i, i6, i8, 0);
    }

    @Override // defpackage.at2
    public final void B() {
        K0();
        int i = this.J1;
        if (i != 0) {
            long j = this.I1;
            dxr dxrVar = this.l1;
            Handler handler = (Handler) dxrVar.a;
            if (handler != null) {
                handler.post(new zbu(dxrVar, j, i));
            }
            this.I1 = 0L;
            this.J1 = 0;
        }
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.E();
        } else {
            this.o1.g();
        }
    }

    @Override // defpackage.qih, defpackage.at2
    public final void C(dsc[] dscVarArr, long j, long j2, uvh uvhVar) {
        super.C(dscVarArr, j, j2, uvhVar);
        if (this.S1 == -9223372036854775807L) {
            this.S1 = j;
        }
        sis sisVar = this.p;
        if (sisVar.p()) {
            this.T1 = -9223372036854775807L;
        } else {
            uvhVar.getClass();
            this.T1 = sisVar.g(uvhVar.a, new ois()).d;
        }
    }

    @Override // defpackage.qih, defpackage.at2
    public final void E(long j, long j2) {
        m78 m78Var = this.v1;
        if (m78Var != null) {
            try {
                tyi tyiVar = ((y7l) m78Var.e).f;
                tyiVar.getClass();
                try {
                    ((hbu) tyiVar.d).a(j, j2);
                } catch (pqb e) {
                    throw new rcu(e, (dsc) tyiVar.f);
                }
            } catch (rcu e2) {
                throw h(e2, e2.a, false, 7001);
            }
        }
        super.E(j, j2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0736, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08b7, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (a.class) {
            try {
                if (!Y1) {
                    int i = dvt.a;
                    char c = 28;
                    if (i <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z2 = 5;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z2 = 6;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z2 = 7;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z3 = true;
                                break;
                        }
                        Z1 = z3;
                        Y1 = true;
                    }
                    if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    z = false;
                                    break;
                                }
                                z = -1;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    z = 6;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    z = 7;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    z = 8;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            default:
                                if (i <= 26) {
                                    String str4 = Build.DEVICE;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c = '\t';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c = '\n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c = 11;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c = '\f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c = '\r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c = 14;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c = 15;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c = 16;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c = 17;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c = 18;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c = 19;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c = 20;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c = 21;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c = 22;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c = 23;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c = 24;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c = 25;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c = 26;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c = 27;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c = 29;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c = 30;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c = 31;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c = ' ';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c = '!';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c = '\"';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c = '#';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c = '$';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c = '%';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c = '&';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c = '\'';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c = '(';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c = ')';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c = '*';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c = '+';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c = ',';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c = '-';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c = '.';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c = '/';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c = '0';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c = '1';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c = '2';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c = '3';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c = '4';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c = '5';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c = '6';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c = '7';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c = '8';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c = '9';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c = ':';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c = ';';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c = '<';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c = '=';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c = '>';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c = '?';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c = '@';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c = 'A';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c = 'B';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c = 'C';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c = 'D';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c = 'E';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c = 'F';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c = 'G';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c = 'H';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c = 'I';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c = 'J';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c = 'K';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c = 'L';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c = 'M';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c = 'N';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c = 'O';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c = 'P';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c = 'Q';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c = 'R';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c = 'S';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c = 'T';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c = 'U';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c = 'V';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c = 'W';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c = 'X';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c = 'Y';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c = 'Z';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c = '[';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c = '\\';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c = ']';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c = '^';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c = '_';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c = '`';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c = 'a';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c = 'b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c = 'c';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c = 'd';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c = 'e';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c = 'f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c = 'g';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c = 'h';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c = 'i';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c = 'j';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c = 'k';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c = 'l';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c = 'm';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c = 'n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c = 'o';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c = 'p';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c = 'q';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c = 'r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c = 's';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c = 't';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c = 'u';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c = 'v';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c = 'w';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c = 'x';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c = 'y';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c = 'z';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c = '{';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c = '|';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c = '}';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c = '~';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c = 127;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c = 128;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c = 129;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c = 130;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c = 131;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c = 132;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c = 133;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c = 134;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c = 135;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c = 136;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c = 137;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c = 138;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c = 139;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
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
                        Z1 = z3;
                        Y1 = true;
                    }
                    z3 = true;
                    Z1 = z3;
                    Y1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Z1;
    }

    @Override // defpackage.qih, defpackage.at2
    public final void G(float f, float f2) {
        super.G(f, f2);
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.L(f);
        } else {
            this.o1.k(f);
        }
    }

    public final Surface I0(mih mihVar) {
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.s();
            throw null;
        }
        Surface surface = this.y1;
        if (surface != null) {
            return surface;
        }
        if (dvt.a >= 35 && mihVar.k) {
            return null;
        }
        vq1.A(O0(mihVar));
        usk uskVar = this.z1;
        if (uskVar != null && uskVar.a != mihVar.g && uskVar != null) {
            uskVar.release();
            this.z1 = null;
        }
        if (this.z1 == null) {
            this.z1 = usk.b(this.j1, mihVar.g);
        }
        return this.z1;
    }

    public final boolean J0(mih mihVar) {
        if (this.v1 != null) {
            return true;
        }
        Surface surface = this.y1;
        if (surface == null || !surface.isValid()) {
            return (dvt.a >= 35 && mihVar.k) || O0(mihVar);
        }
        return true;
    }

    public final void K0() {
        if (this.F1 > 0) {
            this.g.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.E1;
            int i = this.F1;
            dxr dxrVar = this.l1;
            Handler handler = (Handler) dxrVar.a;
            if (handler != null) {
                handler.post(new zbu(dxrVar, i, j));
            }
            this.F1 = 0;
            this.E1 = elapsedRealtime;
        }
    }

    @Override // defpackage.qih
    public final tg7 L(mih mihVar, dsc dscVar, dsc dscVar2) {
        tg7 b = mihVar.b(dscVar, dscVar2);
        int i = b.e;
        aa aaVar = this.s1;
        aaVar.getClass();
        if (dscVar2.u > aaVar.a || dscVar2.v > aaVar.b) {
            i |= 256;
        }
        if (H0(mihVar, dscVar2) > aaVar.c) {
            i |= 64;
        }
        int i2 = i;
        return new tg7(mihVar.a, dscVar, dscVar2, i2 != 0 ? 0 : b.d, i2);
    }

    public final void L0() {
        int i;
        iih iihVar;
        if (!this.O1 || (i = dvt.a) < 23 || (iihVar = this.L) == null) {
            return;
        }
        this.Q1 = new ckh(this, iihVar);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            iihVar.b(bundle);
        }
    }

    @Override // defpackage.qih
    public final lih M(IllegalStateException illegalStateException, mih mihVar) {
        return new akh(illegalStateException, mihVar, this.y1);
    }

    public final void M0(iih iihVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        iihVar.l(i, j);
        Trace.endSection();
        this.e1.e++;
        this.G1 = 0;
        if (this.v1 == null) {
            tcu tcuVar = this.L1;
            boolean equals = tcuVar.equals(tcu.d);
            dxr dxrVar = this.l1;
            if (!equals && !tcuVar.equals(this.M1)) {
                this.M1 = tcuVar;
                dxrVar.i(tcuVar);
            }
            if (!this.o1.e() || (surface = this.y1) == null) {
                return;
            }
            dxrVar.g(surface);
            this.B1 = true;
        }
    }

    public final void N0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.y1;
        dxr dxrVar = this.l1;
        if (surface2 == surface) {
            if (surface != null) {
                tcu tcuVar = this.M1;
                if (tcuVar != null) {
                    dxrVar.i(tcuVar);
                }
                Surface surface3 = this.y1;
                if (surface3 == null || !this.B1) {
                    return;
                }
                dxrVar.g(surface3);
                return;
            }
            return;
        }
        this.y1 = surface;
        m78 m78Var = this.v1;
        dbu dbuVar = this.o1;
        if (m78Var == null) {
            dbuVar.j(surface);
        }
        this.B1 = false;
        int i = this.h;
        iih iihVar = this.L;
        if (iihVar != null && this.v1 == null) {
            mih mihVar = this.y0;
            mihVar.getClass();
            boolean J0 = J0(mihVar);
            int i2 = dvt.a;
            if (i2 < 23 || !J0 || this.t1) {
                r0();
                c0();
            } else {
                Surface I0 = I0(mihVar);
                if (i2 >= 23 && I0 != null) {
                    iihVar.j(I0);
                } else {
                    if (i2 < 35) {
                        e7o.n();
                        return;
                    }
                    iihVar.e();
                }
            }
        }
        if (surface != null) {
            tcu tcuVar2 = this.M1;
            if (tcuVar2 != null) {
                dxrVar.i(tcuVar2);
            }
        } else {
            this.M1 = null;
            m78 m78Var2 = this.v1;
            if (m78Var2 != null) {
                m78Var2.o();
            }
        }
        if (i == 2) {
            m78 m78Var3 = this.v1;
            if (m78Var3 != null) {
                m78Var3.u(true);
            } else {
                dbuVar.c(true);
            }
        }
        L0();
    }

    public final boolean O0(mih mihVar) {
        if (dvt.a < 23 || this.O1 || E0(mihVar.a)) {
            return false;
        }
        return !mihVar.g || usk.a(this.j1);
    }

    public final void P0(iih iihVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        iihVar.k(i);
        Trace.endSection();
        this.e1.f++;
    }

    public final void Q0(int i, int i2) {
        ig7 ig7Var = this.e1;
        ig7Var.h += i;
        int i3 = i + i2;
        ig7Var.g += i3;
        this.F1 += i3;
        int i4 = this.G1 + i3;
        this.G1 = i4;
        ig7Var.i = Math.max(i4, ig7Var.i);
        int i5 = this.m1;
        if (i5 <= 0 || this.F1 < i5) {
            return;
        }
        K0();
    }

    public final void R0(long j) {
        ig7 ig7Var = this.e1;
        ig7Var.k += j;
        ig7Var.l++;
        this.I1 += j;
        this.J1++;
    }

    @Override // defpackage.qih
    public final int U(qg7 qg7Var) {
        return (dvt.a < 34 || !this.O1 || qg7Var.k >= this.l) ? 0 : 32;
    }

    @Override // defpackage.qih
    public final boolean V() {
        return this.O1 && dvt.a < 23;
    }

    @Override // defpackage.qih
    public final float W(float f, dsc[] dscVarArr) {
        float f2 = -1.0f;
        for (dsc dscVar : dscVarArr) {
            float f3 = dscVar.w;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.qih
    public final ArrayList X(rih rihVar, dsc dscVar, boolean z) {
        return zjh.h(dscVar, G0(this.j1, rihVar, dscVar, z, this.O1));
    }

    @Override // defpackage.qih
    public final rdk Y(mih mihVar, dsc dscVar, MediaCrypto mediaCrypto, float f) {
        q85 q85Var;
        int i;
        aa aaVar;
        Point point;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i3;
        char c;
        boolean z;
        Pair d;
        int F0;
        String str = mihVar.c;
        dsc[] dscVarArr = this.j;
        dscVarArr.getClass();
        int i4 = dscVar.u;
        float f2 = dscVar.w;
        q85 q85Var2 = dscVar.B;
        int i5 = dscVar.v;
        int H0 = H0(mihVar, dscVar);
        if (dscVarArr.length == 1) {
            if (H0 != -1 && (F0 = F0(mihVar, dscVar)) != -1) {
                H0 = Math.min((int) (H0 * 1.5f), F0);
            }
            aaVar = new aa(i4, i5, H0);
            q85Var = q85Var2;
            i = i5;
        } else {
            int length = dscVarArr.length;
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z2 = false;
            while (i8 < length) {
                dsc dscVar2 = dscVarArr[i8];
                dsc[] dscVarArr2 = dscVarArr;
                if (q85Var2 != null && dscVar2.B == null) {
                    bsc a = dscVar2.a();
                    a.A = q85Var2;
                    dscVar2 = new dsc(a);
                }
                tg7 b = mihVar.b(dscVar, dscVar2);
                int i9 = length;
                int i10 = dscVar2.v;
                if (b.d != 0) {
                    int i11 = dscVar2.u;
                    i3 = i8;
                    c = 65535;
                    z2 |= i11 == -1 || i10 == -1;
                    i6 = Math.max(i6, i11);
                    i7 = Math.max(i7, i10);
                    H0 = Math.max(H0, H0(mihVar, dscVar2));
                } else {
                    i3 = i8;
                    c = 65535;
                }
                length = i9;
                i8 = i3 + 1;
                dscVarArr = dscVarArr2;
            }
            if (z2) {
                vq1.n0("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
                boolean z3 = i5 > i4;
                int i12 = z3 ? i5 : i4;
                boolean z4 = z3;
                int i13 = z3 ? i4 : i5;
                float f3 = i13 / i12;
                int i14 = 0;
                while (true) {
                    q85Var = q85Var2;
                    if (i14 >= 9) {
                        break;
                    }
                    int i15 = X1[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i12 || i17 <= i13) {
                        break;
                    }
                    if (!z4) {
                        i17 = i15;
                    }
                    if (!z4) {
                        i15 = i17;
                    }
                    int i18 = i13;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = mihVar.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i2 = i12;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i2 = i12;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(dvt.f(i17, widthAlignment) * widthAlignment, dvt.f(i15, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i = i5;
                        if (mihVar.h(f2, point.x, point.y)) {
                            break;
                        }
                    } else {
                        i = i5;
                    }
                    i14 = i16 + 1;
                    i5 = i;
                    q85Var2 = q85Var;
                    i13 = i18;
                    i12 = i2;
                }
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    bsc a2 = dscVar.a();
                    a2.t = i6;
                    a2.u = i7;
                    H0 = Math.max(H0, F0(mihVar, new dsc(a2)));
                    vq1.n0("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i6 + "x" + i7);
                }
            } else {
                q85Var = q85Var2;
                i = i5;
            }
            aaVar = new aa(i6, i7, H0);
        }
        this.s1 = aaVar;
        int i19 = this.O1 ? this.P1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(CameraProperty.WIDTH, i4);
        mediaFormat.setInteger(CameraProperty.HEIGHT, i);
        y1g.a0(mediaFormat, dscVar.q);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        y1g.O(mediaFormat, "rotation-degrees", dscVar.x);
        y1g.N(mediaFormat, q85Var);
        if ("video/dolby-vision".equals(dscVar.n) && (d = zjh.d(dscVar)) != null) {
            y1g.O(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", aaVar.a);
        mediaFormat.setInteger("max-height", aaVar.b);
        y1g.O(mediaFormat, "max-input-size", aaVar.c);
        int i20 = dvt.a;
        if (i20 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.n1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (i20 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.N1));
        }
        Surface I0 = I0(mihVar);
        if (this.v1 != null && !dvt.U(this.j1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new rdk(mihVar, mediaFormat, dscVar, I0, mediaCrypto, null, 13);
    }

    @Override // defpackage.qih
    public final void Z(qg7 qg7Var) {
        if (this.u1) {
            ByteBuffer byteBuffer = qg7Var.l;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        iih iihVar = this.L;
                        iihVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        iihVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.at2, defpackage.ogl
    public final void a(int i, Object obj) {
        if (i == 1) {
            N0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            abu abuVar = (abu) obj;
            this.R1 = abuVar;
            m78 m78Var = this.v1;
            if (m78Var != null) {
                m78Var.O(abuVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.P1 != intValue) {
                this.P1 = intValue;
                if (this.O1) {
                    r0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.C1 = intValue2;
            iih iihVar = this.L;
            if (iihVar != null) {
                iihVar.g(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.D1 = intValue3;
            m78 m78Var2 = this.v1;
            if (m78Var2 != null) {
                m78Var2.J(intValue3);
                return;
            }
            gbu gbuVar = this.o1.b;
            if (gbuVar.j == intValue3) {
                return;
            }
            gbuVar.j = intValue3;
            gbuVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.x1 = list;
            m78 m78Var3 = this.v1;
            if (m78Var3 != null) {
                m78Var3.N(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            kmq kmqVar = (kmq) obj;
            if (kmqVar.a == 0 || kmqVar.b == 0) {
                return;
            }
            this.A1 = kmqVar;
            m78 m78Var4 = this.v1;
            if (m78Var4 != null) {
                Surface surface = this.y1;
                vq1.B(surface);
                m78Var4.K(surface, kmqVar);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.N1 = ((Integer) obj).intValue();
            iih iihVar2 = this.L;
            if (iihVar2 != null && dvt.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.N1));
                iihVar2.b(bundle);
                return;
            }
            return;
        }
        if (i == 17) {
            Surface surface2 = this.y1;
            N0(null);
            obj.getClass();
            ((a) obj).a(1, surface2);
            return;
        }
        if (i == 11) {
            zrb zrbVar = (zrb) obj;
            zrbVar.getClass();
            this.G = zrbVar;
        }
    }

    @Override // defpackage.cbu
    public final boolean b(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // defpackage.cbu
    public final boolean c(long j, long j2, boolean z, boolean z2) {
        int H;
        long j3 = this.q1;
        if (j3 != -9223372036854775807L) {
            this.V1 = j2 > this.l + 200000 && j < j3;
        }
        if (j >= -500000 || z || (H = H(j2)) == 0) {
            return false;
        }
        ig7 ig7Var = this.e1;
        PriorityQueue priorityQueue = this.r1;
        if (z2) {
            int i = ig7Var.d + H;
            ig7Var.d = i;
            ig7Var.f += this.H1;
            ig7Var.d = priorityQueue.size() + i;
        } else {
            ig7Var.j++;
            Q0(priorityQueue.size() + H, this.H1);
        }
        if (S()) {
            c0();
        }
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.q(false);
        }
        return true;
    }

    @Override // defpackage.cbu
    public final boolean d(long j, boolean z) {
        return j < -30000 && !z;
    }

    @Override // defpackage.qih
    public final boolean e0(dsc dscVar) {
        m78 m78Var = this.v1;
        if (m78Var == null) {
            return true;
        }
        try {
            m78Var.t(dscVar);
            throw null;
        } catch (rcu e) {
            throw h(e, dscVar, false, 7000);
        }
    }

    @Override // defpackage.qih
    public final void f0(Exception exc) {
        vq1.L("MediaCodecVideoRenderer", "Video codec error", exc);
        dxr dxrVar = this.l1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            handler.post(new xlr(16, dxrVar, exc));
        }
    }

    @Override // defpackage.qih
    public final void g0(String str, rdk rdkVar, long j, long j2) {
        String str2;
        dxr dxrVar = this.l1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new yx1(dxrVar, str2, j, j2, 1));
        } else {
            str2 = str;
        }
        this.t1 = E0(str2);
        mih mihVar = this.y0;
        mihVar.getClass();
        this.u1 = mihVar.f();
        L0();
    }

    @Override // defpackage.qih
    public final void h0(String str) {
        dxr dxrVar = this.l1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            handler.post(new xlr(17, dxrVar, str));
        }
    }

    @Override // defpackage.at2
    public final void i() {
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.p();
            return;
        }
        dbu dbuVar = this.o1;
        if (dbuVar.e == 0) {
            dbuVar.e = 1;
        }
    }

    @Override // defpackage.qih
    public final tg7 i0(qdc qdcVar) {
        tg7 i0 = super.i0(qdcVar);
        dsc dscVar = (dsc) qdcVar.c;
        dscVar.getClass();
        dxr dxrVar = this.l1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            handler.post(new gtm(5, dxrVar, dscVar, i0));
        }
        return i0;
    }

    @Override // defpackage.qih
    public final void j0(dsc dscVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        iih iihVar = this.L;
        if (iihVar != null) {
            iihVar.g(this.C1);
        }
        if (this.O1) {
            i = dscVar.u;
            integer = dscVar.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(CameraProperty.WIDTH);
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(CameraProperty.HEIGHT);
            i = integer2;
        }
        float f = dscVar.y;
        int i2 = dscVar.x;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.L1 = new tcu(i, f, integer);
        m78 m78Var = this.v1;
        if (m78Var == null || !this.U1) {
            this.o1.i(dscVar.w);
            this.U1 = false;
            return;
        }
        bsc a = dscVar.a();
        a.t = i;
        a.u = integer;
        a.x = f;
        dsc dscVar2 = new dsc(a);
        List list = this.x1;
        if (list == null) {
            ude udeVar = yde.b;
            list = qsn.e;
        }
        m78Var.x(dscVar2, list);
        throw null;
    }

    @Override // defpackage.at2
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.qih
    public final void l0(long j) {
        super.l0(j);
        if (this.O1) {
            return;
        }
        this.H1--;
    }

    @Override // defpackage.qih
    public final void m0() {
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.P();
            this.v1.M(this.f1.b, -this.S1);
        } else {
            this.o1.d(2);
        }
        this.U1 = true;
        L0();
    }

    @Override // defpackage.at2
    public final boolean n() {
        return this.a1 && this.v1 == null;
    }

    @Override // defpackage.qih
    public final void n0(qg7 qg7Var) {
        Surface surface;
        this.W1 = 0;
        boolean z = this.O1;
        if (!z) {
            this.H1++;
        }
        if (dvt.a >= 23 || !z) {
            return;
        }
        long j = qg7Var.k;
        D0(j);
        tcu tcuVar = this.L1;
        boolean equals = tcuVar.equals(tcu.d);
        dxr dxrVar = this.l1;
        if (!equals && !tcuVar.equals(this.M1)) {
            this.M1 = tcuVar;
            dxrVar.i(tcuVar);
        }
        this.e1.e++;
        if (this.o1.e() && (surface = this.y1) != null) {
            dxrVar.g(surface);
            this.B1 = true;
        }
        l0(j);
    }

    @Override // defpackage.qih, defpackage.at2
    public final boolean p() {
        boolean p = super.p();
        m78 m78Var = this.v1;
        if (m78Var != null) {
            return ((dbu) ((y7l) m78Var.e).f.b).b(false);
        }
        if (p && (this.L == null || this.O1)) {
            return true;
        }
        return this.o1.b(p);
    }

    @Override // defpackage.qih
    public final boolean p0(long j, long j2, iih iihVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, dsc dscVar) {
        iihVar.getClass();
        long j4 = j3 - this.f1.c;
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.r1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        Q0(i4, 0);
        m78 m78Var = this.v1;
        if (m78Var == null) {
            int a = this.o1.a(j3, j, j2, this.f1.b, z, z2, this.p1);
            mgr mgrVar = this.p1;
            if (a == 0) {
                this.g.getClass();
                long nanoTime = System.nanoTime();
                abu abuVar = this.R1;
                if (abuVar != null) {
                    abuVar.b(j4, nanoTime, dscVar, this.Y);
                }
                M0(iihVar, i, nanoTime);
                R0(mgrVar.a);
                return true;
            }
            if (a == 1) {
                long j5 = mgrVar.b;
                long j6 = mgrVar.a;
                if (j5 == this.K1) {
                    P0(iihVar, i);
                } else {
                    abu abuVar2 = this.R1;
                    if (abuVar2 != null) {
                        abuVar2.b(j4, j5, dscVar, this.Y);
                    }
                    M0(iihVar, i, j5);
                }
                R0(j6);
                this.K1 = j5;
                return true;
            }
            if (a == 2) {
                Trace.beginSection("dropVideoBuffer");
                iihVar.k(i);
                Trace.endSection();
                Q0(0, 1);
                R0(mgrVar.a);
                return true;
            }
            if (a == 3) {
                P0(iihVar, i);
                R0(mgrVar.a);
                return true;
            }
            if (a != 4 && a != 5) {
                xq0.q(String.valueOf(a));
                return false;
            }
        } else {
            if (z && !z2) {
                P0(iihVar, i);
                return true;
            }
            vq1.A(false);
            int i5 = ((y7l) m78Var.e).n;
            if (i5 != -1 && i5 == 0) {
                vq1.B(null);
                throw null;
            }
        }
        return false;
    }

    @Override // defpackage.qih
    public final void s0() {
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.P();
        }
    }

    @Override // defpackage.qih
    public final void t0() {
        super.t0();
        this.r1.clear();
        this.V1 = false;
        this.H1 = 0;
        this.W1 = 0;
    }

    @Override // defpackage.qih, defpackage.at2
    public final void u() {
        dxr dxrVar = this.l1;
        this.M1 = null;
        this.T1 = -9223372036854775807L;
        m78 m78Var = this.v1;
        if (m78Var != null) {
            m78Var.B();
        } else {
            this.o1.d(0);
        }
        L0();
        this.B1 = false;
        this.Q1 = null;
        try {
            super.u();
        } finally {
            dxrVar.a(this.e1);
            dxrVar.i(tcu.d);
        }
    }

    @Override // defpackage.at2
    public final void v(boolean z, boolean z2) {
        this.e1 = new ig7();
        gxn gxnVar = this.d;
        gxnVar.getClass();
        boolean z3 = gxnVar.b;
        vq1.A((z3 && this.P1 == 0) ? false : true);
        if (this.O1 != z3) {
            this.O1 = z3;
            r0();
        }
        ig7 ig7Var = this.e1;
        dxr dxrVar = this.l1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            handler.post(new acu(dxrVar, ig7Var, 0));
        }
        boolean z4 = this.w1;
        dbu dbuVar = this.o1;
        if (!z4) {
            if (this.x1 != null && this.v1 == null) {
                d18 d18Var = new d18(this.j1, dbuVar);
                dzr dzrVar = this.g;
                dzrVar.getClass();
                d18Var.h = dzrVar;
                y7l d = d18Var.d();
                d.n = 1;
                SparseArray sparseArray = d.d;
                vq1.A(!dvt.k(sparseArray, 0));
                m78 m78Var = new m78(d, d.a);
                d.h.add(m78Var);
                sparseArray.put(0, m78Var);
                this.v1 = m78Var;
            }
            this.w1 = true;
        }
        m78 m78Var2 = this.v1;
        if (m78Var2 == null) {
            dzr dzrVar2 = this.g;
            dzrVar2.getClass();
            dbuVar.l = dzrVar2;
            dbuVar.e = z2 ? 1 : 0;
            return;
        }
        m78Var2.d = e48.a;
        abu abuVar = this.R1;
        if (abuVar != null) {
            m78Var2.O(abuVar);
        }
        if (this.y1 != null && !this.A1.equals(kmq.c)) {
            this.v1.K(this.y1, this.A1);
        }
        this.v1.J(this.D1);
        this.v1.L(this.J);
        List list = this.x1;
        if (list != null) {
            this.v1.N(list);
        }
        this.v1.C(z2);
        if (this.G != null) {
            this.v1.getClass();
        }
    }

    @Override // defpackage.qih, defpackage.at2
    public final void w(long j, boolean z) {
        m78 m78Var = this.v1;
        if (m78Var != null) {
            if (!z) {
                m78Var.q(true);
            }
            this.v1.M(this.f1.b, -this.S1);
            this.U1 = true;
        }
        super.w(j, z);
        m78 m78Var2 = this.v1;
        dbu dbuVar = this.o1;
        if (m78Var2 == null) {
            dbuVar.h();
        }
        if (z) {
            m78 m78Var3 = this.v1;
            if (m78Var3 != null) {
                m78Var3.u(false);
            } else {
                dbuVar.c(false);
            }
        }
        L0();
        this.G1 = 0;
    }

    @Override // defpackage.at2
    public final void x() {
        m78 m78Var = this.v1;
        if (m78Var == null || !this.k1) {
            return;
        }
        m78Var.I();
    }

    @Override // defpackage.qih
    public final boolean x0(qg7 qg7Var) {
        if (!l() && !qg7Var.f(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
            long j = this.T1;
            if (j != -9223372036854775807L && j - (qg7Var.k - this.f1.c) > 100000 && !qg7Var.f(1073741824)) {
                boolean z = qg7Var.k < this.l;
                if ((z || this.V1) && !qg7Var.f(268435456) && qg7Var.f(67108864)) {
                    qg7Var.z();
                    if (z) {
                        this.e1.d++;
                        return true;
                    }
                    if (this.V1) {
                        this.r1.add(Long.valueOf(qg7Var.k));
                        this.W1++;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qih
    public final boolean y0(mih mihVar) {
        return J0(mihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at2
    public final void z() {
        try {
            try {
                N();
                r0();
            } finally {
                zqa.w(this.F, null);
                this.F = null;
            }
        } finally {
            this.w1 = false;
            this.S1 = -9223372036854775807L;
            usk uskVar = this.z1;
            if (uskVar != null) {
                uskVar.release();
                this.z1 = null;
            }
        }
    }
}
