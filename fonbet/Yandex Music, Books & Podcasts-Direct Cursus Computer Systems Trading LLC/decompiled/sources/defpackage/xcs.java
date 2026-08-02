package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class xcs {
    public static final qs5 a = new qs5(wjp.B);

    public static final void a(ges gesVar, Function2 function2, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1772272796);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(gesVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function2) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            qs5 qs5Var = a;
            etn.l(qs5Var.a(((ges) oq5Var.j(qs5Var)).e(gesVar)), function2, oq5Var, (i2 & 112) | 8);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(gesVar, function2, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, yci yciVar, long j, long j2, tqc tqcVar, long j3, aas aasVar, o9s o9sVar, long j4, int i, boolean z, int i2, int i3, Function1 function1, ges gesVar, hq5 hq5Var, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        tqc tqcVar2;
        int i12;
        int i13;
        aas aasVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        oq5 oq5Var;
        boolean z3;
        long j6;
        aas aasVar3;
        yci yciVar2;
        long j7;
        long j8;
        o9s o9sVar2;
        long j9;
        int i26;
        int i27;
        Function1 function12;
        ges gesVar2;
        tqc tqcVar3;
        int i28;
        xmn r;
        yci yciVar3;
        long j10;
        o9s o9sVar3;
        int i29;
        int i30;
        int i31;
        Function1 function13;
        ges gesVar3;
        long c;
        boolean e;
        Object K;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1028090691);
        if ((i4 & 6) == 0) {
            i7 = (oq5Var2.f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i32 = i6 & 2;
        if (i32 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= oq5Var2.f(yciVar) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= oq5Var2.e(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= oq5Var2.e(j5) ? 2048 : 1024;
                }
            }
            i10 = i6 & 16;
            int i33 = RemoteCameraConfig.Notification.ID;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i7 |= oq5Var2.f(null) ? 16384 : 8192;
            }
            i11 = i6 & 32;
            int i34 = SQLiteDatabase.OPEN_SHAREDCACHE;
            if (i11 == 0) {
                i7 |= 196608;
                tqcVar2 = tqcVar;
            } else {
                tqcVar2 = tqcVar;
                if ((i4 & 196608) == 0) {
                    i7 |= oq5Var2.f(tqcVar2) ? 131072 : 65536;
                }
            }
            int i35 = 524288;
            if ((i6 & 64) == 0) {
                i7 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i7 |= oq5Var2.f(null) ? 1048576 : 524288;
            }
            i12 = i6 & 128;
            if (i12 == 0) {
                i7 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i7 |= oq5Var2.e(j3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            }
            i13 = i6 & 256;
            if (i13 == 0) {
                i7 |= 100663296;
                aasVar2 = aasVar;
            } else {
                aasVar2 = aasVar;
                if ((i4 & 100663296) == 0) {
                    i7 |= oq5Var2.f(aasVar2) ? 67108864 : 33554432;
                }
            }
            i14 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i14 == 0) {
                i7 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i15 = i14;
                i7 |= oq5Var2.f(o9sVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                i16 = i6 & 1024;
                if (i16 != 0) {
                    i17 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i17 = i5 | (oq5Var2.e(j4) ? 4 : 2);
                } else {
                    i17 = i5;
                }
                i18 = i6 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                    i19 = i18;
                } else if ((i5 & 48) == 0) {
                    i19 = i18;
                    i17 |= oq5Var2.d(i) ? 32 : 16;
                } else {
                    i19 = i18;
                }
                int i36 = i17;
                i20 = i6 & 4096;
                if (i20 != 0) {
                    i36 |= 384;
                } else if ((i5 & 384) == 0) {
                    z2 = z;
                    i36 |= oq5Var2.g(z2) ? 256 : 128;
                    i21 = i6 & RemoteCameraConfig.Notification.ID;
                    if (i21 == 0) {
                        i22 = i36 | 3072;
                    } else {
                        int i37 = i36;
                        if ((i5 & 3072) == 0) {
                            i22 = i37 | (oq5Var2.d(i2) ? 2048 : 1024);
                        } else {
                            i22 = i37;
                        }
                    }
                    i23 = i6 & 16384;
                    if (i23 == 0) {
                        i24 = i22 | 24576;
                    } else {
                        i24 = i22;
                        if ((i5 & 24576) == 0) {
                            if (oq5Var2.d(i3)) {
                                i33 = 16384;
                            }
                            i24 |= i33;
                            i25 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
                            if (i25 != 0) {
                                i24 |= 196608;
                            } else if ((i5 & 196608) == 0) {
                                if (!oq5Var2.h(function1)) {
                                    i34 = 65536;
                                }
                                i24 |= i34;
                            }
                            if ((i5 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                                if ((i6 & SQLiteDatabase.OPEN_FULLMUTEX) == 0 && oq5Var2.f(gesVar)) {
                                    i35 = 1048576;
                                }
                                i24 |= i35;
                            }
                            if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
                                oq5Var2.U();
                                if ((i4 & 1) == 0 || oq5Var2.y()) {
                                    yciVar3 = i32 != 0 ? vci.a : yciVar;
                                    j10 = i8 != 0 ? d85.n : j;
                                    if (i9 != 0) {
                                        j5 = kes.c;
                                    }
                                    if (i11 != 0) {
                                        tqcVar2 = null;
                                    }
                                    j8 = i12 != 0 ? kes.c : j3;
                                    if (i13 != 0) {
                                        aasVar2 = null;
                                    }
                                    o9sVar3 = i15 != 0 ? null : o9sVar;
                                    j9 = i16 != 0 ? kes.c : j4;
                                    i29 = i19 != 0 ? 1 : i;
                                    if (i20 != 0) {
                                        z2 = true;
                                    }
                                    i30 = i21 != 0 ? Integer.MAX_VALUE : i2;
                                    i31 = i23 == 0 ? i3 : 1;
                                    function13 = i25 != 0 ? null : function1;
                                    if ((i6 & SQLiteDatabase.OPEN_FULLMUTEX) != 0) {
                                        gesVar3 = (ges) oq5Var2.j(a);
                                        i24 &= -3670017;
                                        oq5Var2.q();
                                        yci yciVar4 = yciVar3;
                                        c = j10 == 16 ? j10 : gesVar3.c() != 16 ? gesVar3.c() : d85.b(((d85) oq5Var2.j(sb6.a)).a, ((Number) oq5Var2.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                                        ges f = ges.f(gesVar3, 0L, j5, tqcVar2, j8, aasVar2, null, o9sVar3 == null ? o9sVar3.a : Integer.MIN_VALUE, j9, 16609105);
                                        e = oq5Var2.e(c);
                                        K = oq5Var2.K();
                                        ges gesVar4 = gesVar3;
                                        if (!e || K == gq5.a) {
                                            K = new rcs(c, 0);
                                            oq5Var2.k0(K);
                                        }
                                        int i38 = i24 << 9;
                                        j66.h(str, yciVar4, f, function13, i29, z2, i30, i31, (a95) K, oq5Var2, (i7 & 126) | ((i24 >> 6) & 7168) | (57344 & i38) | (458752 & i38) | (3670016 & i38) | (i38 & 29360128), 0);
                                        oq5Var = oq5Var2;
                                        gesVar2 = gesVar4;
                                        yciVar2 = yciVar4;
                                        tqcVar3 = tqcVar2;
                                        i28 = i29;
                                        i26 = i30;
                                        i27 = i31;
                                        j7 = j10;
                                        function12 = function13;
                                        aas aasVar4 = aasVar2;
                                        z3 = z2;
                                        o9sVar2 = o9sVar3;
                                        j6 = j5;
                                        aasVar3 = aasVar4;
                                    }
                                } else {
                                    oq5Var2.S();
                                    if ((i6 & SQLiteDatabase.OPEN_FULLMUTEX) != 0) {
                                        i24 &= -3670017;
                                    }
                                    yciVar3 = yciVar;
                                    j10 = j;
                                    j8 = j3;
                                    o9sVar3 = o9sVar;
                                    j9 = j4;
                                    i29 = i;
                                    i30 = i2;
                                    i31 = i3;
                                    function13 = function1;
                                }
                                gesVar3 = gesVar;
                                oq5Var2.q();
                                yci yciVar42 = yciVar3;
                                if (j10 == 16) {
                                }
                                ges f2 = ges.f(gesVar3, 0L, j5, tqcVar2, j8, aasVar2, null, o9sVar3 == null ? o9sVar3.a : Integer.MIN_VALUE, j9, 16609105);
                                e = oq5Var2.e(c);
                                K = oq5Var2.K();
                                ges gesVar42 = gesVar3;
                                if (!e) {
                                }
                                K = new rcs(c, 0);
                                oq5Var2.k0(K);
                                int i382 = i24 << 9;
                                j66.h(str, yciVar42, f2, function13, i29, z2, i30, i31, (a95) K, oq5Var2, (i7 & 126) | ((i24 >> 6) & 7168) | (57344 & i382) | (458752 & i382) | (3670016 & i382) | (i382 & 29360128), 0);
                                oq5Var = oq5Var2;
                                gesVar2 = gesVar42;
                                yciVar2 = yciVar42;
                                tqcVar3 = tqcVar2;
                                i28 = i29;
                                i26 = i30;
                                i27 = i31;
                                j7 = j10;
                                function12 = function13;
                                aas aasVar42 = aasVar2;
                                z3 = z2;
                                o9sVar2 = o9sVar3;
                                j6 = j5;
                                aasVar3 = aasVar42;
                            } else {
                                oq5Var = oq5Var2;
                                oq5Var.S();
                                aas aasVar5 = aasVar2;
                                z3 = z2;
                                j6 = j5;
                                aasVar3 = aasVar5;
                                yciVar2 = yciVar;
                                j7 = j;
                                j8 = j3;
                                o9sVar2 = o9sVar;
                                j9 = j4;
                                i26 = i2;
                                i27 = i3;
                                function12 = function1;
                                gesVar2 = gesVar;
                                tqcVar3 = tqcVar2;
                                i28 = i;
                            }
                            r = oq5Var.r();
                            if (r != null) {
                                r.d = new vcs(str, yciVar2, j7, j6, tqcVar3, j8, aasVar3, o9sVar2, j9, i28, z3, i26, i27, function12, gesVar2, i4, i5, i6);
                                return;
                            }
                            return;
                        }
                    }
                    i25 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
                    if (i25 != 0) {
                    }
                    if ((i5 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                    }
                    if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
                    }
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                z2 = z;
                i21 = i6 & RemoteCameraConfig.Notification.ID;
                if (i21 == 0) {
                }
                i23 = i6 & 16384;
                if (i23 == 0) {
                }
                i25 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
                if (i25 != 0) {
                }
                if ((i5 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                }
                if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
                }
                r = oq5Var.r();
                if (r != null) {
                }
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 != 0) {
            }
            i18 = i6 & 2048;
            if (i18 != 0) {
            }
            int i362 = i17;
            i20 = i6 & 4096;
            if (i20 != 0) {
            }
            z2 = z;
            i21 = i6 & RemoteCameraConfig.Notification.ID;
            if (i21 == 0) {
            }
            i23 = i6 & 16384;
            if (i23 == 0) {
            }
            i25 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
            if (i25 != 0) {
            }
            if ((i5 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            }
            if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        int i332 = RemoteCameraConfig.Notification.ID;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        int i342 = SQLiteDatabase.OPEN_SHAREDCACHE;
        if (i11 == 0) {
        }
        int i352 = 524288;
        if ((i6 & 64) == 0) {
        }
        i12 = i6 & 128;
        if (i12 == 0) {
        }
        i13 = i6 & 256;
        if (i13 == 0) {
        }
        i14 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 != 0) {
        }
        i18 = i6 & 2048;
        if (i18 != 0) {
        }
        int i3622 = i17;
        i20 = i6 & 4096;
        if (i20 != 0) {
        }
        z2 = z;
        i21 = i6 & RemoteCameraConfig.Notification.ID;
        if (i21 == 0) {
        }
        i23 = i6 & 16384;
        if (i23 == 0) {
        }
        i25 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
        if (i25 != 0) {
        }
        if ((i5 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i24 & 599187) != 599186)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(mn0 mn0Var, yci yciVar, long j, long j2, tqc tqcVar, long j3, o9s o9sVar, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, ges gesVar, hq5 hq5Var, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        tqc tqcVar2;
        int i12;
        long j5;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        oq5 oq5Var;
        yci yciVar2;
        long j6;
        long j7;
        int i25;
        int i26;
        int i27;
        Map map2;
        Function1 function12;
        ges gesVar2;
        long j8;
        tqc tqcVar3;
        o9s o9sVar2;
        boolean z3;
        long j9;
        xmn r;
        yci yciVar3;
        long j10;
        long j11;
        int i28;
        int i29;
        int i30;
        Map map3;
        Function1 function13;
        ges gesVar3;
        o9s o9sVar3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(744129681);
        if ((i4 & 6) == 0) {
            i7 = (oq5Var2.f(mn0Var) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= oq5Var2.f(yciVar) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= oq5Var2.e(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i7 |= oq5Var2.e(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            int i32 = RemoteCameraConfig.Notification.ID;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i7 |= oq5Var2.f(null) ? 16384 : 8192;
            }
            i11 = i6 & 32;
            if (i11 == 0) {
                i7 |= 196608;
                tqcVar2 = tqcVar;
            } else {
                tqcVar2 = tqcVar;
                if ((i4 & 196608) == 0) {
                    i7 |= oq5Var2.f(tqcVar2) ? 131072 : 65536;
                }
            }
            if ((i6 & 64) == 0) {
                i7 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i7 |= oq5Var2.f(null) ? 1048576 : 524288;
            }
            i12 = i6 & 128;
            int i33 = RemoteCameraConfig.Camera.BITRATE;
            if (i12 == 0) {
                i7 |= 12582912;
                j5 = j3;
            } else {
                j5 = j3;
                if ((i4 & 12582912) == 0) {
                    i7 |= oq5Var2.e(j5) ? 8388608 : 4194304;
                }
            }
            if ((i6 & 256) == 0) {
                i7 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                i7 |= oq5Var2.f(null) ? 67108864 : 33554432;
                i13 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i13 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i7 |= oq5Var2.f(o9sVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                    i15 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i15 = i5 | (oq5Var2.e(j4) ? 4 : 2);
                } else {
                    i15 = i5;
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                    i17 = i14;
                } else if ((i5 & 48) == 0) {
                    i17 = i14;
                    i15 |= oq5Var2.d(i) ? 32 : 16;
                } else {
                    i17 = i14;
                }
                int i34 = i15;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i34 |= 384;
                } else if ((i5 & 384) == 0) {
                    z2 = z;
                    i34 |= oq5Var2.g(z2) ? 256 : 128;
                    i19 = i6 & RemoteCameraConfig.Notification.ID;
                    if (i19 == 0) {
                        i20 = i34 | 3072;
                    } else {
                        int i35 = i34;
                        if ((i5 & 3072) == 0) {
                            i20 = i35 | (oq5Var2.d(i2) ? 2048 : 1024);
                        } else {
                            i20 = i35;
                        }
                    }
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                        i22 = i20 | 24576;
                    } else {
                        i22 = i20;
                        if ((i5 & 24576) == 0) {
                            if (oq5Var2.d(i3)) {
                                i32 = 16384;
                            }
                            i22 |= i32;
                            i23 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
                            if (i23 != 0) {
                                i22 |= 196608;
                            } else if ((i5 & 196608) == 0) {
                                i22 |= oq5Var2.h(map) ? 131072 : 65536;
                            }
                            i24 = i6 & SQLiteDatabase.OPEN_FULLMUTEX;
                            if (i24 != 0) {
                                i22 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                            } else if ((i5 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                                i22 |= oq5Var2.h(function1) ? 1048576 : 524288;
                            }
                            if ((i5 & 12582912) == 0) {
                                if ((i6 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0 && oq5Var2.f(gesVar)) {
                                    i33 = 8388608;
                                }
                                i22 |= i33;
                            }
                            if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
                                oq5Var2.U();
                                if ((i4 & 1) == 0 || oq5Var2.y()) {
                                    yciVar3 = i31 != 0 ? vci.a : yciVar;
                                    j10 = i8 != 0 ? d85.n : j;
                                    j11 = i9 != 0 ? kes.c : j2;
                                    if (i11 != 0) {
                                        tqcVar2 = null;
                                    }
                                    if (i12 != 0) {
                                        j5 = kes.c;
                                    }
                                    o9s o9sVar4 = i13 != 0 ? null : o9sVar;
                                    j7 = i17 != 0 ? kes.c : j4;
                                    i28 = i16 != 0 ? 1 : i;
                                    if (i18 != 0) {
                                        z2 = true;
                                    }
                                    i29 = i19 != 0 ? Integer.MAX_VALUE : i2;
                                    i30 = i21 == 0 ? i3 : 1;
                                    if (i23 != 0) {
                                        map3 = e5b.a;
                                        map3.getClass();
                                    } else {
                                        map3 = map;
                                    }
                                    function13 = i24 != 0 ? rvr.J : function1;
                                    if ((i6 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
                                        gesVar3 = (ges) oq5Var2.j(a);
                                        i22 &= -29360129;
                                    } else {
                                        gesVar3 = gesVar;
                                    }
                                    o9sVar3 = o9sVar4;
                                } else {
                                    oq5Var2.S();
                                    if ((i6 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
                                        i22 &= -29360129;
                                    }
                                    yciVar3 = yciVar;
                                    j10 = j;
                                    j11 = j2;
                                    o9sVar3 = o9sVar;
                                    j7 = j4;
                                    i28 = i;
                                    i29 = i2;
                                    i30 = i3;
                                    map3 = map;
                                    function13 = function1;
                                    gesVar3 = gesVar;
                                }
                                oq5Var2.q();
                                yci yciVar4 = yciVar3;
                                Map map4 = map3;
                                boolean z4 = z2;
                                long c = j10 != 16 ? j10 : gesVar3.c() != 16 ? gesVar3.c() : d85.b(((d85) oq5Var2.j(sb6.a)).a, ((Number) oq5Var2.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                                ges f = ges.f(gesVar3, 0L, j11, tqcVar2, j5, null, null, o9sVar3 != null ? o9sVar3.a : Integer.MIN_VALUE, j7, 16609105);
                                boolean e = oq5Var2.e(c);
                                Object K = oq5Var2.K();
                                o9s o9sVar5 = o9sVar3;
                                if (e || K == gq5.a) {
                                    K = new rcs(c, 1);
                                    oq5Var2.k0(K);
                                }
                                int i36 = i22 << 9;
                                j66.f(mn0Var, yciVar4, f, function13, i28, z4, i29, i30, map4, (a95) K, oq5Var2, (i7 & 126) | ((i22 >> 9) & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (i36 & 234881024));
                                yciVar2 = yciVar4;
                                oq5Var = oq5Var2;
                                map2 = map4;
                                function12 = function13;
                                tqcVar3 = tqcVar2;
                                gesVar2 = gesVar3;
                                i27 = i30;
                                j6 = j10;
                                z3 = z4;
                                i25 = i28;
                                i26 = i29;
                                j8 = j5;
                                j9 = j11;
                                o9sVar2 = o9sVar5;
                            } else {
                                oq5Var = oq5Var2;
                                oq5Var.S();
                                yciVar2 = yciVar;
                                j6 = j;
                                j7 = j4;
                                i25 = i;
                                i26 = i2;
                                i27 = i3;
                                map2 = map;
                                function12 = function1;
                                gesVar2 = gesVar;
                                j8 = j5;
                                tqcVar3 = tqcVar2;
                                o9sVar2 = o9sVar;
                                z3 = z2;
                                j9 = j2;
                            }
                            r = oq5Var.r();
                            if (r != null) {
                                r.d = new vcs(mn0Var, yciVar2, j6, j9, tqcVar3, j8, o9sVar2, j7, i25, z3, i26, i27, map2, function12, gesVar2, i4, i5, i6);
                                return;
                            }
                            return;
                        }
                    }
                    i23 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
                    if (i23 != 0) {
                    }
                    i24 = i6 & SQLiteDatabase.OPEN_FULLMUTEX;
                    if (i24 != 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
                    }
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                z2 = z;
                i19 = i6 & RemoteCameraConfig.Notification.ID;
                if (i19 == 0) {
                }
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                i23 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
                if (i23 != 0) {
                }
                i24 = i6 & SQLiteDatabase.OPEN_FULLMUTEX;
                if (i24 != 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
                }
                r = oq5Var.r();
                if (r != null) {
                }
            }
            i13 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i342 = i15;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            z2 = z;
            i19 = i6 & RemoteCameraConfig.Notification.ID;
            if (i19 == 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            i23 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
            if (i23 != 0) {
            }
            i24 = i6 & SQLiteDatabase.OPEN_FULLMUTEX;
            if (i24 != 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        int i322 = RemoteCameraConfig.Notification.ID;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 == 0) {
        }
        if ((i6 & 64) == 0) {
        }
        i12 = i6 & 128;
        int i332 = RemoteCameraConfig.Camera.BITRATE;
        if (i12 == 0) {
        }
        if ((i6 & 256) == 0) {
        }
        i13 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i3422 = i15;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        z2 = z;
        i19 = i6 & RemoteCameraConfig.Notification.ID;
        if (i19 == 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        i23 = i6 & SQLiteDatabase.OPEN_NOMUTEX;
        if (i23 != 0) {
        }
        i24 = i6 & SQLiteDatabase.OPEN_FULLMUTEX;
        if (i24 != 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (oq5Var2.P(i7 & 1, (i7 & 306783379) == 306783378 || (i22 & 4793491) != 4793490)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }
}
