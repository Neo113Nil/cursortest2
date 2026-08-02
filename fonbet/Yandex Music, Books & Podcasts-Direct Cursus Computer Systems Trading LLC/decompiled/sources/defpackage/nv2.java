package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class nv2 {
    static {
        float f = 40;
        xv.m(f, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ybs ybsVar, Function1 function1, yci yciVar, boolean z, ges gesVar, rbf rbfVar, pbf pbfVar, boolean z2, int i, int i2, tiu tiuVar, Function1 function12, uoi uoiVar, f3r f3rVar, pyc pycVar, hq5 hq5Var, int i3, int i4, int i5) {
        rbf rbfVar2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        uoi uoiVar2;
        f3r f3rVar2;
        int i14;
        int i15;
        pbf pbfVar2;
        int i16;
        tiu tiuVar2;
        int i17;
        boolean z4;
        rbf rbfVar3;
        oq5 oq5Var;
        Function1 function13;
        pyc pycVar2;
        uoi uoiVar3;
        boolean z5;
        xmn r;
        pyc pycVar3;
        int i18;
        int i19;
        Function1 function14;
        uoi uoiVar4;
        tiu tiuVar3;
        int i20;
        boolean z6;
        pbf pbfVar3;
        rbf rbfVar4;
        boolean z7;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1804514146);
        int i21 = i3 | (oq5Var2.f(ybsVar) ? 4 : 2) | (oq5Var2.h(function1) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128) | 27648 | (oq5Var2.f(gesVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        int i22 = i5 & 64;
        if (i22 != 0) {
            i21 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            rbfVar2 = rbfVar;
            i21 |= oq5Var2.f(rbfVar2) ? 1048576 : 524288;
            i6 = i5 & 128;
            if (i6 == 0) {
                i7 = i21 | 12582912;
            } else {
                i7 = i21 | (oq5Var2.f(pbfVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
            }
            i8 = i5 & 256;
            if (i8 == 0) {
                i7 |= 100663296;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i3 & 100663296) == 0) {
                    i7 |= oq5Var2.g(z3) ? 67108864 : 33554432;
                }
            }
            int i23 = i7 | 268435456;
            i9 = i5 & 1024;
            if (i9 == 0) {
                i10 = i2;
                i11 = i23;
                i12 = i4 | 6;
            } else {
                i10 = i2;
                if ((i4 & 6) == 0) {
                    i11 = i23;
                    i12 = i4 | (oq5Var2.d(i10) ? 4 : 2);
                } else {
                    i11 = i23;
                    i12 = i4;
                }
            }
            int i24 = i12 | 432;
            i13 = i5 & RemoteCameraConfig.Notification.ID;
            if (i13 == 0) {
                f3rVar2 = f3rVar;
                i24 = i12 | 3504;
                uoiVar2 = uoiVar;
            } else {
                if ((i4 & 3072) == 0) {
                    uoiVar2 = uoiVar;
                    i24 |= oq5Var2.f(uoiVar2) ? 2048 : 1024;
                } else {
                    uoiVar2 = uoiVar;
                }
                f3rVar2 = f3rVar;
            }
            i14 = i24 | (!oq5Var2.f(f3rVar2) ? 16384 : RemoteCameraConfig.Notification.ID);
            i15 = i5 & SQLiteDatabase.OPEN_NOMUTEX;
            if (i15 == 0) {
                i14 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i14 |= oq5Var2.h(pycVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if (oq5Var2.P(i11 & 1, (i11 & 306783379) == 306783378 || (i14 & 74899) != 74898)) {
                oq5Var2.S();
                pbfVar2 = pbfVar;
                i16 = i;
                tiuVar2 = tiuVar;
                i17 = i10;
                z4 = z3;
                rbfVar3 = rbfVar2;
                oq5Var = oq5Var2;
                function13 = function12;
                pycVar2 = pycVar;
                uoiVar3 = uoiVar2;
                z5 = z;
            } else {
                oq5Var2.U();
                if ((i3 & 1) == 0 || oq5Var2.y()) {
                    if (i22 != 0) {
                        rbfVar2 = rbf.f;
                    }
                    pbf pbfVar4 = i6 != 0 ? pbf.b : pbfVar;
                    if (i8 != 0) {
                        z3 = false;
                    }
                    int i25 = z3 ? 1 : Integer.MAX_VALUE;
                    int i26 = i11 & (-1879048193);
                    if (i9 != 0) {
                        i10 = 1;
                    }
                    tiu tiuVar4 = i9w.h;
                    rq1 rq1Var = rq1.A;
                    if (i13 != 0) {
                        uoiVar2 = null;
                    }
                    pycVar3 = i15 != 0 ? eo5.a : pycVar;
                    i18 = i10;
                    i19 = i25;
                    function14 = rq1Var;
                    uoiVar4 = uoiVar2;
                    tiuVar3 = tiuVar4;
                    i20 = i26;
                    z6 = z3;
                    pbfVar3 = pbfVar4;
                    rbfVar4 = rbfVar2;
                    z7 = true;
                } else {
                    oq5Var2.S();
                    i19 = i;
                    function14 = function12;
                    pycVar3 = pycVar;
                    i20 = i11 & (-1879048193);
                    i18 = i10;
                    z6 = z3;
                    rbfVar4 = rbfVar2;
                    z7 = z;
                    pbfVar3 = pbfVar;
                    uoiVar4 = uoiVar2;
                    tiuVar3 = tiuVar;
                }
                oq5Var2.q();
                ide a = rbfVar4.a(z6);
                boolean z8 = !z6;
                int i27 = z6 ? 1 : i18;
                int i28 = z6 ? 1 : i19;
                rbf rbfVar5 = rbfVar4;
                boolean z9 = z6;
                boolean z10 = ((i20 & 14) == 4) | ((i20 & 112) == 32);
                Object K = oq5Var2.K();
                if (z10 || K == gq5.a) {
                    K = new al(17, ybsVar, function1);
                    oq5Var2.k0(K);
                }
                int i29 = i14 << 9;
                j66.j(ybsVar, (Function1) K, yciVar, gesVar, tiuVar3, function14, uoiVar4, f3rVar2, z8, i28, i27, a, pbfVar3, z7, pycVar3, oq5Var2, ((i20 >> 6) & 7168) | (i20 & 910) | 221184 | (i29 & 3670016) | (i29 & 29360128), ((i20 >> 15) & 896) | 27648 | (i14 & 458752));
                tiuVar2 = tiuVar3;
                pbfVar2 = pbfVar3;
                z5 = z7;
                oq5Var = oq5Var2;
                z4 = z9;
                i16 = i19;
                i17 = i18;
                function13 = function14;
                uoiVar3 = uoiVar4;
                pycVar2 = pycVar3;
                rbfVar3 = rbfVar5;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new mv2(ybsVar, function1, yciVar, z5, gesVar, rbfVar3, pbfVar2, z4, i16, i17, tiuVar2, function13, uoiVar3, f3rVar, pycVar2, i3, i4, i5, 0);
                return;
            }
            return;
        }
        rbfVar2 = rbfVar;
        i6 = i5 & 128;
        if (i6 == 0) {
        }
        i8 = i5 & 256;
        if (i8 == 0) {
        }
        int i232 = i7 | 268435456;
        i9 = i5 & 1024;
        if (i9 == 0) {
        }
        int i242 = i12 | 432;
        i13 = i5 & RemoteCameraConfig.Notification.ID;
        if (i13 == 0) {
        }
        i14 = i242 | (!oq5Var2.f(f3rVar2) ? 16384 : RemoteCameraConfig.Notification.ID);
        i15 = i5 & SQLiteDatabase.OPEN_NOMUTEX;
        if (i15 == 0) {
        }
        if (oq5Var2.P(i11 & 1, (i11 & 306783379) == 306783378 || (i14 & 74899) != 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, Function1 function1, yci yciVar, boolean z, ges gesVar, rbf rbfVar, pbf pbfVar, boolean z2, int i, int i2, tiu tiuVar, Function1 function12, uoi uoiVar, f3r f3rVar, wn5 wn5Var, hq5 hq5Var, int i3, int i4, int i5) {
        int i6;
        yci yciVar2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        rbf rbfVar2;
        int i12;
        pbf pbfVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        oq5 oq5Var;
        int i22;
        int i23;
        uoi uoiVar2;
        boolean z4;
        pbf pbfVar3;
        yci yciVar3;
        rbf rbfVar3;
        boolean z5;
        tiu tiuVar2;
        Function1 function13;
        xmn r;
        int i24;
        int i25;
        boolean z6;
        int i26;
        int i27;
        Function1 function14;
        uoi uoiVar3;
        pbf pbfVar4;
        tiu tiuVar3;
        int i28;
        boolean z7;
        yci yciVar4;
        rbf rbfVar4;
        int i29;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(945255183);
        if ((i3 & 6) == 0) {
            i6 = (oq5Var2.f(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= oq5Var2.h(function1) ? 32 : 16;
        }
        int i30 = i5 & 4;
        if (i30 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var2.f(yciVar2) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z3 = z;
                i6 |= oq5Var2.g(z3) ? 2048 : 1024;
                i8 = i5 & 16;
                int i31 = RemoteCameraConfig.Notification.ID;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i6 |= oq5Var2.g(false) ? 16384 : 8192;
                }
                i9 = i3 & 196608;
                int i32 = SQLiteDatabase.OPEN_FULLMUTEX;
                if (i9 == 0) {
                    i6 |= oq5Var2.f(gesVar) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                } else if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                    i11 = 196608;
                    rbfVar2 = rbfVar;
                    i6 |= oq5Var2.f(rbfVar2) ? 1048576 : 524288;
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i6 |= 12582912;
                        pbfVar2 = pbfVar;
                    } else {
                        pbfVar2 = pbfVar;
                        if ((i3 & 12582912) == 0) {
                            i6 |= oq5Var2.f(pbfVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                        }
                    }
                    i13 = i5 & 256;
                    if (i13 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= oq5Var2.g(z2) ? 67108864 : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        if ((i5 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 && oq5Var2.d(i)) {
                            i29 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                            i6 |= i29;
                        }
                        i29 = 268435456;
                        i6 |= i29;
                    }
                    i14 = i5 & 1024;
                    if (i14 == 0) {
                        i16 = i4 | 6;
                        i15 = i14;
                    } else if ((i4 & 6) == 0) {
                        i15 = i14;
                        i16 = i4 | (oq5Var2.d(i2) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i4;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                        i18 = i17;
                    } else if ((i4 & 48) == 0) {
                        i18 = i17;
                        i16 |= oq5Var2.f(tiuVar) ? 32 : 16;
                    } else {
                        i18 = i17;
                    }
                    int i33 = i16;
                    i19 = i6;
                    int i34 = i33 | 384;
                    i20 = i5 & RemoteCameraConfig.Notification.ID;
                    if (i20 == 0) {
                        i21 = i33 | 3456;
                    } else if ((i4 & 3072) == 0) {
                        i21 = i34 | (oq5Var2.f(uoiVar) ? 2048 : 1024);
                    } else {
                        i21 = i34;
                    }
                    if ((i4 & 24576) == 0) {
                        if (oq5Var2.f(f3rVar)) {
                            i31 = 16384;
                        }
                        i21 |= i31;
                    }
                    if ((i4 & i11) == 0) {
                        if (oq5Var2.h(wn5Var)) {
                            i32 = 131072;
                        }
                        i21 |= i32;
                    }
                    if (oq5Var2.P(i19 & 1, (i19 & 306783379) == 306783378 || (i21 & 74899) != 74898)) {
                        oq5Var = oq5Var2;
                        oq5Var.S();
                        i22 = i;
                        i23 = i2;
                        uoiVar2 = uoiVar;
                        z4 = z3;
                        pbfVar3 = pbfVar2;
                        yciVar3 = yciVar2;
                        rbfVar3 = rbfVar2;
                        z5 = z2;
                        tiuVar2 = tiuVar;
                        function13 = function12;
                    } else {
                        oq5Var2.U();
                        if ((i3 & 1) == 0 || oq5Var2.y()) {
                            yci yciVar5 = i30 != 0 ? vci.a : yciVar2;
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if (i10 != 0) {
                                rbfVar2 = rbf.f;
                            }
                            pbf pbfVar5 = i12 != 0 ? pbf.b : pbfVar2;
                            boolean z8 = i13 != 0 ? false : z2;
                            if ((i5 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                                i24 = z8 ? 1 : Integer.MAX_VALUE;
                                i25 = i19 & (-1879048193);
                            } else {
                                i24 = i;
                                i25 = i19;
                            }
                            int i35 = i15 != 0 ? 1 : i2;
                            tiu tiuVar4 = i18 != 0 ? i9w.h : tiuVar;
                            z6 = z3;
                            i26 = i24;
                            i27 = i35;
                            function14 = rq1.B;
                            uoiVar3 = i20 != 0 ? null : uoiVar;
                            pbfVar4 = pbfVar5;
                            tiuVar3 = tiuVar4;
                            i28 = i25;
                            z7 = z8;
                            yciVar4 = yciVar5;
                            rbfVar4 = rbfVar2;
                        } else {
                            oq5Var2.S();
                            if ((i5 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                                i28 = i19 & (-1879048193);
                                z7 = z2;
                                i26 = i;
                                i27 = i2;
                                tiuVar3 = tiuVar;
                                function14 = function12;
                            } else {
                                z7 = z2;
                                i26 = i;
                                i27 = i2;
                                tiuVar3 = tiuVar;
                                function14 = function12;
                                i28 = i19;
                            }
                            z6 = z3;
                            yciVar4 = yciVar2;
                            rbfVar4 = rbfVar2;
                            pbfVar4 = pbfVar2;
                            uoiVar3 = uoiVar;
                        }
                        oq5Var2.q();
                        Object K = oq5Var2.K();
                        kjn kjnVar = gq5.a;
                        if (K == kjnVar) {
                            K = szf.g0(new ybs(str, 0L, 6));
                            oq5Var2.k0(K);
                        }
                        aqi aqiVar = (aqi) K;
                        ybs b = ybs.b((ybs) aqiVar.getValue(), str, 0L, 6);
                        boolean f = oq5Var2.f(b);
                        Object K2 = oq5Var2.K();
                        if (f || K2 == kjnVar) {
                            K2 = new ha0(12, b, aqiVar);
                            oq5Var2.k0(K2);
                        }
                        gld.D((Function0) K2, oq5Var2);
                        boolean z9 = (i28 & 14) == 4;
                        Object K3 = oq5Var2.K();
                        if (z9 || K3 == kjnVar) {
                            K3 = szf.g0(str);
                            oq5Var2.k0(K3);
                        }
                        aqi aqiVar2 = (aqi) K3;
                        int i36 = i21;
                        ide a = rbfVar4.a(z7);
                        boolean z10 = !z7;
                        int i37 = z7 ? 1 : i27;
                        int i38 = z7 ? 1 : i26;
                        rbf rbfVar5 = rbfVar4;
                        boolean f2 = oq5Var2.f(aqiVar2) | ((i28 & 112) == 32);
                        Object K4 = oq5Var2.K();
                        if (f2 || K4 == kjnVar) {
                            K4 = new lj0(3, function1, aqiVar, aqiVar2);
                            oq5Var2.k0(K4);
                        }
                        int i39 = i36 << 9;
                        oq5Var = oq5Var2;
                        j66.j(b, (Function1) K4, yciVar4, gesVar, tiuVar3, function14, uoiVar3, f3rVar, z10, i38, i37, a, pbfVar4, z6, wn5Var, oq5Var, (i28 & 896) | ((i28 >> 6) & 7168) | (i39 & 57344) | (i39 & 458752) | (i39 & 3670016) | (i39 & 29360128), (i28 & 57344) | ((i28 >> 15) & 896) | (i28 & 7168) | (i36 & 458752));
                        z5 = z7;
                        yciVar3 = yciVar4;
                        function13 = function14;
                        uoiVar2 = uoiVar3;
                        pbfVar3 = pbfVar4;
                        z4 = z6;
                        i23 = i27;
                        rbfVar3 = rbfVar5;
                        tiuVar2 = tiuVar3;
                        i22 = i26;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new mv2(str, function1, yciVar3, z4, gesVar, rbfVar3, pbfVar3, z5, i22, i23, tiuVar2, function13, uoiVar2, f3rVar, wn5Var, i3, i4, i5, 1);
                        return;
                    }
                    return;
                }
                i11 = 196608;
                rbfVar2 = rbfVar;
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i5 & 256;
                if (i13 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i14 = i5 & 1024;
                if (i14 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                int i332 = i16;
                i19 = i6;
                int i342 = i332 | 384;
                i20 = i5 & RemoteCameraConfig.Notification.ID;
                if (i20 == 0) {
                }
                if ((i4 & 24576) == 0) {
                }
                if ((i4 & i11) == 0) {
                }
                if (oq5Var2.P(i19 & 1, (i19 & 306783379) == 306783378 || (i21 & 74899) != 74898)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            z3 = z;
            i8 = i5 & 16;
            int i312 = RemoteCameraConfig.Notification.ID;
            if (i8 != 0) {
            }
            i9 = i3 & 196608;
            int i322 = SQLiteDatabase.OPEN_FULLMUTEX;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = 196608;
            rbfVar2 = rbfVar;
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i5 & 256;
            if (i13 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i14 = i5 & 1024;
            if (i14 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            int i3322 = i16;
            i19 = i6;
            int i3422 = i3322 | 384;
            i20 = i5 & RemoteCameraConfig.Notification.ID;
            if (i20 == 0) {
            }
            if ((i4 & 24576) == 0) {
            }
            if ((i4 & i11) == 0) {
            }
            if (oq5Var2.P(i19 & 1, (i19 & 306783379) == 306783378 || (i21 & 74899) != 74898)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z3 = z;
        i8 = i5 & 16;
        int i3122 = RemoteCameraConfig.Notification.ID;
        if (i8 != 0) {
        }
        i9 = i3 & 196608;
        int i3222 = SQLiteDatabase.OPEN_FULLMUTEX;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = 196608;
        rbfVar2 = rbfVar;
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i14 = i5 & 1024;
        if (i14 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i33222 = i16;
        i19 = i6;
        int i34222 = i33222 | 384;
        i20 = i5 & RemoteCameraConfig.Notification.ID;
        if (i20 == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        if ((i4 & i11) == 0) {
        }
        if (oq5Var2.P(i19 & 1, (i19 & 306783379) == 306783378 || (i21 & 74899) != 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
