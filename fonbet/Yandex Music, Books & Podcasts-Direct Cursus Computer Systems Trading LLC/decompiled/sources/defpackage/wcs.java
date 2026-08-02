package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public abstract class wcs {
    public static final qs5 a = new qs5(wjp.A);

    public static final void a(ges gesVar, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-460300127);
        int i2 = (oq5Var.f(gesVar) ? 4 : 2) | i | (oq5Var.h(wn5Var) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            qs5 qs5Var = a;
            etn.l(qs5Var.a(((ges) oq5Var.j(qs5Var)).e(gesVar)), wn5Var, oq5Var, (i2 & 112) | 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qtf(gesVar, wn5Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, yci yciVar, long j, long j2, tqc tqcVar, long j3, o9s o9sVar, long j4, int i, boolean z, int i2, int i3, ges gesVar, hq5 hq5Var, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        tqc tqcVar2;
        int i11;
        int i12;
        o9s o9sVar2;
        int i13;
        long j6;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        yci yciVar2;
        long j7;
        long j8;
        o9s o9sVar3;
        int i21;
        int i22;
        boolean z2;
        int i23;
        long c;
        long j9;
        yci yciVar3;
        oq5 oq5Var;
        int i24;
        int i25;
        o9s o9sVar4;
        long j10;
        int i26;
        boolean z3;
        long j11;
        long j12;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2055108902);
        if ((i4 & 6) == 0) {
            i7 = (oq5Var2.f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i27 = i6 & 2;
        if (i27 != 0) {
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
            int i28 = i7 | 24576;
            i10 = i6 & 32;
            if (i10 == 0) {
                i28 = i7 | 221184;
            } else if ((196608 & i4) == 0) {
                tqcVar2 = tqcVar;
                i28 |= oq5Var2.f(tqcVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                i11 = i28 | 114819072;
                i12 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i12 != 0) {
                    i11 = i28 | 920125440;
                } else if ((805306368 & i4) == 0) {
                    o9sVar2 = o9sVar;
                    i11 |= oq5Var2.f(o9sVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    i13 = i6 & 1024;
                    if (i13 == 0) {
                        i14 = i5 | 6;
                        j6 = j4;
                    } else {
                        j6 = j4;
                        if ((i5 & 6) == 0) {
                            i14 = (oq5Var2.e(j6) ? 4 : 2) | i5;
                        } else {
                            i14 = i5;
                        }
                    }
                    i15 = i6 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i5 & 48) == 0) {
                        i14 |= oq5Var2.d(i) ? 32 : 16;
                    }
                    i16 = i6 & 4096;
                    if (i16 == 0) {
                        i14 |= 384;
                        i17 = i16;
                    } else {
                        i17 = i16;
                        if ((i5 & 384) == 0) {
                            i14 |= oq5Var2.g(z) ? 256 : 128;
                            i18 = i6 & RemoteCameraConfig.Notification.ID;
                            if (i18 != 0) {
                                i14 |= 3072;
                                i19 = i18;
                            } else {
                                i19 = i18;
                                if ((i5 & 3072) == 0) {
                                    i14 |= oq5Var2.d(i2) ? 2048 : 1024;
                                    i20 = i14 | 221184 | (!oq5Var2.f(gesVar) ? 1048576 : 524288);
                                    if ((i11 & 306783379) != 306783378 && (599187 & i20) == 599186 && oq5Var2.z()) {
                                        oq5Var2.S();
                                        j10 = j6;
                                        j11 = j5;
                                        j7 = j;
                                        i26 = i;
                                        z3 = z;
                                        i25 = i2;
                                        i24 = i3;
                                        oq5Var = oq5Var2;
                                        o9sVar4 = o9sVar2;
                                        yciVar3 = yciVar;
                                        j12 = j3;
                                    } else {
                                        oq5Var2.U();
                                        if ((i4 & 1) != 0 || oq5Var2.y()) {
                                            yciVar2 = i27 == 0 ? vci.a : yciVar;
                                            j7 = i8 == 0 ? d85.n : j;
                                            if (i9 != 0) {
                                                j5 = kes.c;
                                            }
                                            if (i10 != 0) {
                                                tqcVar2 = null;
                                            }
                                            j8 = kes.c;
                                            o9sVar3 = i12 == 0 ? o9sVar2 : null;
                                            if (i13 != 0) {
                                                j6 = j8;
                                            }
                                            i21 = 1;
                                            i22 = i15 == 0 ? 1 : i;
                                            z2 = i17 == 0 ? true : z;
                                            i23 = i19 == 0 ? Integer.MAX_VALUE : i2;
                                        } else {
                                            oq5Var2.S();
                                            yciVar2 = yciVar;
                                            j7 = j;
                                            j8 = j3;
                                            i22 = i;
                                            i23 = i2;
                                            i21 = i3;
                                            o9sVar3 = o9sVar2;
                                            z2 = z;
                                        }
                                        oq5Var2.q();
                                        oq5Var2.Z(-1827892941);
                                        if (j7 == 16) {
                                            j9 = j6;
                                            c = j7;
                                        } else {
                                            oq5Var2.Z(-1827892168);
                                            c = gesVar.c();
                                            if (c != 16) {
                                                j9 = j6;
                                            } else {
                                                j9 = j6;
                                                c = ((d85) oq5Var2.j(rb6.a)).a;
                                            }
                                            oq5Var2.p(false);
                                        }
                                        oq5Var2.p(false);
                                        int i29 = i20 << 9;
                                        yci yciVar4 = yciVar2;
                                        j66.h(str, yciVar4, ges.f(gesVar, c, j5, tqcVar2, j8, null, null, o9sVar3 == null ? o9sVar3.a : Integer.MIN_VALUE, j9, 16609104), null, i22, z2, i23, i21, null, oq5Var2, (i11 & 126) | 3072 | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016) | 12582912, 256);
                                        yciVar3 = yciVar4;
                                        oq5Var = oq5Var2;
                                        i24 = i21;
                                        i25 = i23;
                                        long j13 = j5;
                                        o9sVar4 = o9sVar3;
                                        j10 = j9;
                                        i26 = i22;
                                        z3 = z2;
                                        j11 = j13;
                                        j12 = j8;
                                    }
                                    r = oq5Var.r();
                                    if (r == null) {
                                        r.d = new tcs(str, yciVar3, j7, j11, tqcVar2, j12, o9sVar4, j10, i26, z3, i25, i24, gesVar, i4, i5, i6);
                                        return;
                                    }
                                    return;
                                }
                            }
                            i20 = i14 | 221184 | (!oq5Var2.f(gesVar) ? 1048576 : 524288);
                            if ((i11 & 306783379) != 306783378) {
                            }
                            oq5Var2.U();
                            if ((i4 & 1) != 0) {
                            }
                            if (i27 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            j8 = kes.c;
                            if (i12 == 0) {
                            }
                            if (i13 != 0) {
                            }
                            i21 = 1;
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            oq5Var2.q();
                            oq5Var2.Z(-1827892941);
                            if (j7 == 16) {
                            }
                            oq5Var2.p(false);
                            int i292 = i20 << 9;
                            yci yciVar42 = yciVar2;
                            j66.h(str, yciVar42, ges.f(gesVar, c, j5, tqcVar2, j8, null, null, o9sVar3 == null ? o9sVar3.a : Integer.MIN_VALUE, j9, 16609104), null, i22, z2, i23, i21, null, oq5Var2, (i11 & 126) | 3072 | (i292 & 57344) | (i292 & 458752) | (i292 & 3670016) | 12582912, 256);
                            yciVar3 = yciVar42;
                            oq5Var = oq5Var2;
                            i24 = i21;
                            i25 = i23;
                            long j132 = j5;
                            o9sVar4 = o9sVar3;
                            j10 = j9;
                            i26 = i22;
                            z3 = z2;
                            j11 = j132;
                            j12 = j8;
                            r = oq5Var.r();
                            if (r == null) {
                            }
                        }
                    }
                    i18 = i6 & RemoteCameraConfig.Notification.ID;
                    if (i18 != 0) {
                    }
                    i20 = i14 | 221184 | (!oq5Var2.f(gesVar) ? 1048576 : 524288);
                    if ((i11 & 306783379) != 306783378) {
                    }
                    oq5Var2.U();
                    if ((i4 & 1) != 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    j8 = kes.c;
                    if (i12 == 0) {
                    }
                    if (i13 != 0) {
                    }
                    i21 = 1;
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    oq5Var2.q();
                    oq5Var2.Z(-1827892941);
                    if (j7 == 16) {
                    }
                    oq5Var2.p(false);
                    int i2922 = i20 << 9;
                    yci yciVar422 = yciVar2;
                    j66.h(str, yciVar422, ges.f(gesVar, c, j5, tqcVar2, j8, null, null, o9sVar3 == null ? o9sVar3.a : Integer.MIN_VALUE, j9, 16609104), null, i22, z2, i23, i21, null, oq5Var2, (i11 & 126) | 3072 | (i2922 & 57344) | (i2922 & 458752) | (i2922 & 3670016) | 12582912, 256);
                    yciVar3 = yciVar422;
                    oq5Var = oq5Var2;
                    i24 = i21;
                    i25 = i23;
                    long j1322 = j5;
                    o9sVar4 = o9sVar3;
                    j10 = j9;
                    i26 = i22;
                    z3 = z2;
                    j11 = j1322;
                    j12 = j8;
                    r = oq5Var.r();
                    if (r == null) {
                    }
                }
                o9sVar2 = o9sVar;
                i13 = i6 & 1024;
                if (i13 == 0) {
                }
                i15 = i6 & 2048;
                if (i15 == 0) {
                }
                i16 = i6 & 4096;
                if (i16 == 0) {
                }
                i18 = i6 & RemoteCameraConfig.Notification.ID;
                if (i18 != 0) {
                }
                i20 = i14 | 221184 | (!oq5Var2.f(gesVar) ? 1048576 : 524288);
                if ((i11 & 306783379) != 306783378) {
                }
                oq5Var2.U();
                if ((i4 & 1) != 0) {
                }
                if (i27 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                j8 = kes.c;
                if (i12 == 0) {
                }
                if (i13 != 0) {
                }
                i21 = 1;
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                oq5Var2.q();
                oq5Var2.Z(-1827892941);
                if (j7 == 16) {
                }
                oq5Var2.p(false);
                int i29222 = i20 << 9;
                yci yciVar4222 = yciVar2;
                j66.h(str, yciVar4222, ges.f(gesVar, c, j5, tqcVar2, j8, null, null, o9sVar3 == null ? o9sVar3.a : Integer.MIN_VALUE, j9, 16609104), null, i22, z2, i23, i21, null, oq5Var2, (i11 & 126) | 3072 | (i29222 & 57344) | (i29222 & 458752) | (i29222 & 3670016) | 12582912, 256);
                yciVar3 = yciVar4222;
                oq5Var = oq5Var2;
                i24 = i21;
                i25 = i23;
                long j13222 = j5;
                o9sVar4 = o9sVar3;
                j10 = j9;
                i26 = i22;
                z3 = z2;
                j11 = j13222;
                j12 = j8;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            tqcVar2 = tqcVar;
            i11 = i28 | 114819072;
            i12 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i12 != 0) {
            }
            o9sVar2 = o9sVar;
            i13 = i6 & 1024;
            if (i13 == 0) {
            }
            i15 = i6 & 2048;
            if (i15 == 0) {
            }
            i16 = i6 & 4096;
            if (i16 == 0) {
            }
            i18 = i6 & RemoteCameraConfig.Notification.ID;
            if (i18 != 0) {
            }
            i20 = i14 | 221184 | (!oq5Var2.f(gesVar) ? 1048576 : 524288);
            if ((i11 & 306783379) != 306783378) {
            }
            oq5Var2.U();
            if ((i4 & 1) != 0) {
            }
            if (i27 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            j8 = kes.c;
            if (i12 == 0) {
            }
            if (i13 != 0) {
            }
            i21 = 1;
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            oq5Var2.q();
            oq5Var2.Z(-1827892941);
            if (j7 == 16) {
            }
            oq5Var2.p(false);
            int i292222 = i20 << 9;
            yci yciVar42222 = yciVar2;
            j66.h(str, yciVar42222, ges.f(gesVar, c, j5, tqcVar2, j8, null, null, o9sVar3 == null ? o9sVar3.a : Integer.MIN_VALUE, j9, 16609104), null, i22, z2, i23, i21, null, oq5Var2, (i11 & 126) | 3072 | (i292222 & 57344) | (i292222 & 458752) | (i292222 & 3670016) | 12582912, 256);
            yciVar3 = yciVar42222;
            oq5Var = oq5Var2;
            i24 = i21;
            i25 = i23;
            long j132222 = j5;
            o9sVar4 = o9sVar3;
            j10 = j9;
            i26 = i22;
            z3 = z2;
            j11 = j132222;
            j12 = j8;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        int i282 = i7 | 24576;
        i10 = i6 & 32;
        if (i10 == 0) {
        }
        tqcVar2 = tqcVar;
        i11 = i282 | 114819072;
        i12 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i12 != 0) {
        }
        o9sVar2 = o9sVar;
        i13 = i6 & 1024;
        if (i13 == 0) {
        }
        i15 = i6 & 2048;
        if (i15 == 0) {
        }
        i16 = i6 & 4096;
        if (i16 == 0) {
        }
        i18 = i6 & RemoteCameraConfig.Notification.ID;
        if (i18 != 0) {
        }
        i20 = i14 | 221184 | (!oq5Var2.f(gesVar) ? 1048576 : 524288);
        if ((i11 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        if ((i4 & 1) != 0) {
        }
        if (i27 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        j8 = kes.c;
        if (i12 == 0) {
        }
        if (i13 != 0) {
        }
        i21 = 1;
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        oq5Var2.q();
        oq5Var2.Z(-1827892941);
        if (j7 == 16) {
        }
        oq5Var2.p(false);
        int i2922222 = i20 << 9;
        yci yciVar422222 = yciVar2;
        j66.h(str, yciVar422222, ges.f(gesVar, c, j5, tqcVar2, j8, null, null, o9sVar3 == null ? o9sVar3.a : Integer.MIN_VALUE, j9, 16609104), null, i22, z2, i23, i21, null, oq5Var2, (i11 & 126) | 3072 | (i2922222 & 57344) | (i2922222 & 458752) | (i2922222 & 3670016) | 12582912, 256);
        yciVar3 = yciVar422222;
        oq5Var = oq5Var2;
        i24 = i21;
        i25 = i23;
        long j1322222 = j5;
        o9sVar4 = o9sVar3;
        j10 = j9;
        i26 = i22;
        z3 = z2;
        j11 = j1322222;
        j12 = j8;
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
