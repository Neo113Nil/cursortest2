package defpackage;

import androidx.compose.material.TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class tlb1 {
    public static au2 a;

    /* JADX WARN: Removed duplicated region for block: B:140:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, int i3, int i4, fid fidVar, tls tlsVar, wls wlsVar, wls wlsVar2, wls wlsVar3, xjx xjxVar, lkx lkxVar, f530 f530Var, zx40 zx40Var, ehr0 ehr0Var, jmy0 jmy0Var, hoy0 hoy0Var, ety0 ety0Var, gy31 gy31Var, boolean z, boolean z2, boolean z3) {
        int i5;
        ety0 ety0Var2;
        wls wlsVar4;
        wls wlsVar5;
        wls wlsVar6;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        lkx lkxVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ehr0 ehr0Var2;
        jmy0 jmy0Var2;
        gy31 gy31Var2;
        wls wlsVar7;
        wls wlsVar8;
        ety0 ety0Var3;
        boolean z5;
        lkx lkxVar3;
        bts btsVar;
        int i15;
        xjx xjxVar2;
        zx40 zx40Var2;
        boolean z6;
        wls wlsVar9;
        boolean z7;
        aii0 v;
        ety0 ety0Var4;
        int i16;
        xjx xjxVar3;
        zx40 zx40Var3;
        ehr0 ehr0Var3;
        int i17;
        bts btsVar2;
        int i18;
        boolean z8;
        wls wlsVar10;
        lkx lkxVar4;
        wls wlsVar11;
        wls wlsVar12;
        boolean z9;
        ety0 ety0Var5;
        boolean z10;
        gy31 gy31Var3;
        int i19;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(719771755);
        if ((i2 & 6) == 0) {
            i5 = (btsVar3.k(hoy0Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= btsVar3.e(tlsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= btsVar3.k(f530Var) ? 256 : 128;
        }
        int i20 = i5 | 27648;
        if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
            if ((i4 & 32) == 0) {
                ety0Var2 = ety0Var;
                if (btsVar3.k(ety0Var2)) {
                    i19 = 131072;
                    i20 |= i19;
                }
            } else {
                ety0Var2 = ety0Var;
            }
            i19 = 65536;
            i20 |= i19;
        } else {
            ety0Var2 = ety0Var;
        }
        int i21 = i4 & 64;
        if (i21 != 0) {
            i20 |= 1572864;
            wlsVar4 = wlsVar;
        } else {
            wlsVar4 = wlsVar;
            if ((i2 & 1572864) == 0) {
                i20 |= btsVar3.e(wlsVar4) ? 1048576 : 524288;
            }
        }
        int i22 = i4 & 128;
        int i23 = SelfTester_JCP.ENCRYPT_CBC;
        if (i22 != 0) {
            i20 |= 12582912;
            wlsVar5 = wlsVar2;
        } else {
            wlsVar5 = wlsVar2;
            if ((i2 & 12582912) == 0) {
                i20 |= btsVar3.e(wlsVar5) ? 8388608 : 4194304;
            }
        }
        int i24 = i20 | 100663296;
        int i25 = i4 & 512;
        if (i25 != 0) {
            i24 = i20 | 905969664;
        } else if ((805306368 & i2) == 0) {
            wlsVar6 = wlsVar3;
            i24 |= btsVar3.e(wlsVar6) ? 536870912 : SelfTester_JCP.IMITA;
            i6 = i4 & 1024;
            if (i6 == 0) {
                i8 = i3 | 6;
                z4 = z2;
                i7 = 65536;
            } else {
                z4 = z2;
                i7 = 65536;
                i8 = i3 | (btsVar3.a(z4) ? 4 : 2);
            }
            int i26 = i8;
            int i27 = i26 | 48;
            i9 = i4 & 4096;
            if (i9 == 0) {
                i27 = i26 | 432;
            } else if ((i3 & 384) == 0) {
                lkxVar2 = lkxVar;
                i27 |= btsVar3.k(lkxVar2) ? 256 : 128;
                if ((i4 & 8192) != 0 && btsVar3.k(xjxVar)) {
                    i10 = 2048;
                    int i28 = i27 | i10;
                    i11 = i4 & 16384;
                    if (i11 != 0) {
                        i12 = i28 | HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else {
                        i12 = i28;
                        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                            i12 |= btsVar3.a(z3) ? 16384 : 8192;
                            int i29 = i12 | ImageMetadata.EDGE_MODE;
                            i13 = i4 & i7;
                            if (i13 == 0) {
                                i29 = i12 | 1769472;
                            } else if ((i3 & 1572864) == 0) {
                                i29 |= btsVar3.k(zx40Var) ? 1048576 : 524288;
                            }
                            if ((i4 & 131072) == 0 && btsVar3.k(ehr0Var)) {
                                i23 = 8388608;
                            }
                            i14 = i29 | i23 | (((i4 & 262144) == 0 || !btsVar3.k(jmy0Var)) ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
                            if (btsVar3.V(i24 & 1, (i24 & 306783379) == 306783378 || (38347923 & i14) != 38347922)) {
                                btsVar3.Y();
                                ehr0Var2 = ehr0Var;
                                jmy0Var2 = jmy0Var;
                                gy31Var2 = gy31Var;
                                wlsVar7 = wlsVar6;
                                wlsVar8 = wlsVar5;
                                ety0Var3 = ety0Var2;
                                z5 = z4;
                                lkxVar3 = lkxVar2;
                                btsVar = btsVar3;
                                i15 = i;
                                xjxVar2 = xjxVar;
                                zx40Var2 = zx40Var;
                                z6 = z3;
                                wlsVar9 = wlsVar4;
                                z7 = z;
                            } else {
                                btsVar3.a0();
                                if ((i2 & 1) == 0 || btsVar3.C()) {
                                    if ((i4 & 32) != 0) {
                                        ety0Var4 = ((zm51) btsVar3.m(an51.a)).f;
                                        i24 &= -458753;
                                    } else {
                                        ety0Var4 = ety0Var2;
                                    }
                                    wls wlsVar13 = i21 != 0 ? null : wlsVar4;
                                    wls wlsVar14 = i22 != 0 ? null : wlsVar5;
                                    wls wlsVar15 = i25 != 0 ? null : wlsVar6;
                                    boolean z11 = i6 != 0 ? false : z4;
                                    dy31 dy31Var = zoy0.w;
                                    lkx lkxVar5 = i9 != 0 ? lkx.f : lkxVar2;
                                    if ((i4 & 8192) != 0) {
                                        i16 = i14 & (-7169);
                                        xjxVar3 = new xjx(63, null);
                                    } else {
                                        i16 = i14;
                                        xjxVar3 = xjxVar;
                                    }
                                    boolean z12 = i11 == 0 ? z3 : false;
                                    if (i13 != 0) {
                                        Object Q = btsVar3.Q();
                                        if (Q == did.a) {
                                            Q = ly3.i(btsVar3);
                                        }
                                        zx40Var3 = (zx40) Q;
                                    } else {
                                        zx40Var3 = zx40Var;
                                    }
                                    if ((i4 & 131072) != 0) {
                                        byk0 byk0Var = ((xir0) btsVar3.m(ajr0.a)).a;
                                        ngd0 ngd0Var = ffx.a;
                                        i17 = (-29360129) & i16;
                                        ehr0Var3 = byk0.b(byk0Var, null, null, ngd0Var, ngd0Var, 3);
                                    } else {
                                        ehr0Var3 = ehr0Var;
                                        i17 = i16;
                                    }
                                    if ((i4 & 262144) != 0) {
                                        xjxVar2 = xjxVar3;
                                        jmy0Var2 = d(0L, 0L, 0L, 0L, 0L, 0L, btsVar3, 6, 2097151);
                                        i14 = i17 & (-234881025);
                                        btsVar2 = btsVar3;
                                        i18 = Integer.MAX_VALUE;
                                        z8 = true;
                                        wlsVar10 = wlsVar13;
                                        lkxVar4 = lkxVar5;
                                        wlsVar11 = wlsVar14;
                                        zx40Var2 = zx40Var3;
                                        wlsVar12 = wlsVar15;
                                        z9 = z11;
                                        ehr0Var2 = ehr0Var3;
                                    } else {
                                        jmy0Var2 = jmy0Var;
                                        xjxVar2 = xjxVar3;
                                        btsVar2 = btsVar3;
                                        i18 = Integer.MAX_VALUE;
                                        z8 = true;
                                        wlsVar10 = wlsVar13;
                                        lkxVar4 = lkxVar5;
                                        wlsVar11 = wlsVar14;
                                        zx40Var2 = zx40Var3;
                                        wlsVar12 = wlsVar15;
                                        z9 = z11;
                                        ehr0Var2 = ehr0Var3;
                                        i14 = i17;
                                    }
                                    ety0Var5 = ety0Var4;
                                    z10 = z12;
                                    gy31Var3 = dy31Var;
                                } else {
                                    btsVar3.Y();
                                    if ((i4 & 32) != 0) {
                                        i24 &= -458753;
                                    }
                                    if ((i4 & 8192) != 0) {
                                        i14 &= -7169;
                                    }
                                    if ((i4 & 131072) != 0) {
                                        i14 &= -29360129;
                                    }
                                    if ((i4 & 262144) != 0) {
                                        i14 &= -234881025;
                                    }
                                    i18 = i;
                                    ehr0Var2 = ehr0Var;
                                    jmy0Var2 = jmy0Var;
                                    gy31Var3 = gy31Var;
                                    z8 = z;
                                    z10 = z3;
                                    wlsVar12 = wlsVar6;
                                    wlsVar11 = wlsVar5;
                                    ety0Var5 = ety0Var2;
                                    z9 = z4;
                                    lkxVar4 = lkxVar2;
                                    btsVar2 = btsVar3;
                                    xjxVar2 = xjxVar;
                                    zx40Var2 = zx40Var;
                                    wlsVar10 = wlsVar4;
                                }
                                btsVar2.u();
                                int i30 = 524286 & i14;
                                int i31 = i14 << 3;
                                lny0.a(i18, 0, i24 & 2147483646, i30 | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), btsVar2, tlsVar, wlsVar10, wlsVar11, wlsVar12, xjxVar2, lkxVar4, f530Var, zx40Var2, ehr0Var2, jmy0Var2, hoy0Var, ety0Var5, gy31Var3, z8, z9, z10);
                                i15 = i18;
                                btsVar = btsVar2;
                                wlsVar9 = wlsVar10;
                                wlsVar8 = wlsVar11;
                                wlsVar7 = wlsVar12;
                                lkxVar3 = lkxVar4;
                                ety0Var3 = ety0Var5;
                                gy31Var2 = gy31Var3;
                                z7 = z8;
                                z5 = z9;
                                z6 = z10;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new eny0(hoy0Var, tlsVar, f530Var, z7, ety0Var3, wlsVar9, wlsVar8, wlsVar7, z5, gy31Var2, lkxVar3, xjxVar2, z6, i15, zx40Var2, ehr0Var2, jmy0Var2, i2, i3, i4);
                                return;
                            }
                            return;
                        }
                    }
                    int i292 = i12 | ImageMetadata.EDGE_MODE;
                    i13 = i4 & i7;
                    if (i13 == 0) {
                    }
                    if ((i4 & 131072) == 0) {
                        i23 = 8388608;
                    }
                    i14 = i292 | i23 | (((i4 & 262144) == 0 || !btsVar3.k(jmy0Var)) ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
                    if (btsVar3.V(i24 & 1, (i24 & 306783379) == 306783378 || (38347923 & i14) != 38347922)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                i10 = 1024;
                int i282 = i27 | i10;
                i11 = i4 & 16384;
                if (i11 != 0) {
                }
                int i2922 = i12 | ImageMetadata.EDGE_MODE;
                i13 = i4 & i7;
                if (i13 == 0) {
                }
                if ((i4 & 131072) == 0) {
                }
                i14 = i2922 | i23 | (((i4 & 262144) == 0 || !btsVar3.k(jmy0Var)) ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
                if (btsVar3.V(i24 & 1, (i24 & 306783379) == 306783378 || (38347923 & i14) != 38347922)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            lkxVar2 = lkxVar;
            if ((i4 & 8192) != 0) {
                i10 = 2048;
                int i2822 = i27 | i10;
                i11 = i4 & 16384;
                if (i11 != 0) {
                }
                int i29222 = i12 | ImageMetadata.EDGE_MODE;
                i13 = i4 & i7;
                if (i13 == 0) {
                }
                if ((i4 & 131072) == 0) {
                }
                i14 = i29222 | i23 | (((i4 & 262144) == 0 || !btsVar3.k(jmy0Var)) ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
                if (btsVar3.V(i24 & 1, (i24 & 306783379) == 306783378 || (38347923 & i14) != 38347922)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            i10 = 1024;
            int i28222 = i27 | i10;
            i11 = i4 & 16384;
            if (i11 != 0) {
            }
            int i292222 = i12 | ImageMetadata.EDGE_MODE;
            i13 = i4 & i7;
            if (i13 == 0) {
            }
            if ((i4 & 131072) == 0) {
            }
            i14 = i292222 | i23 | (((i4 & 262144) == 0 || !btsVar3.k(jmy0Var)) ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
            if (btsVar3.V(i24 & 1, (i24 & 306783379) == 306783378 || (38347923 & i14) != 38347922)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        wlsVar6 = wlsVar3;
        i6 = i4 & 1024;
        if (i6 == 0) {
        }
        int i262 = i8;
        int i272 = i262 | 48;
        i9 = i4 & 4096;
        if (i9 == 0) {
        }
        lkxVar2 = lkxVar;
        if ((i4 & 8192) != 0) {
        }
        i10 = 1024;
        int i282222 = i272 | i10;
        i11 = i4 & 16384;
        if (i11 != 0) {
        }
        int i2922222 = i12 | ImageMetadata.EDGE_MODE;
        i13 = i4 & i7;
        if (i13 == 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        i14 = i2922222 | i23 | (((i4 & 262144) == 0 || !btsVar3.k(jmy0Var)) ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
        if (btsVar3.V(i24 & 1, (i24 & 306783379) == 306783378 || (38347923 & i14) != 38347922)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final tls tlsVar, final f530 f530Var, boolean z, boolean z2, ety0 ety0Var, wls wlsVar, final wls wlsVar2, boolean z3, gy31 gy31Var, lkx lkxVar, xjx xjxVar, boolean z4, int i, zx40 zx40Var, ehr0 ehr0Var, final dmh dmhVar, j690 j690Var, fid fidVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z5;
        int i7;
        final wls wlsVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final boolean z6;
        final boolean z7;
        final gy31 gy31Var2;
        final lkx lkxVar2;
        final boolean z8;
        final int i21;
        final zx40 zx40Var2;
        final ehr0 ehr0Var2;
        final j690 j690Var2;
        final boolean z9;
        bts btsVar;
        final ety0 ety0Var2;
        final xjx xjxVar2;
        aii0 v;
        boolean z10;
        xjx xjxVar3;
        int i22;
        zx40 zx40Var3;
        ehr0 ehr0Var3;
        wls wlsVar4;
        boolean z11;
        int i23;
        int i24;
        int i25;
        ety0 ety0Var3;
        gy31 gy31Var3;
        lkx lkxVar3;
        boolean z12;
        j690 j690Var3;
        ehr0 ehr0Var4;
        boolean z13;
        ehr0 ehr0Var5;
        boolean z14;
        wls wlsVar5;
        boolean z15;
        boolean z16;
        ety0 ety0Var4;
        lkx lkxVar4;
        bts btsVar2;
        int i26;
        gy31 gy31Var4;
        xjx xjxVar4;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-1848871067);
        if ((i2 & 6) == 0) {
            i5 = (btsVar3.k(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= btsVar3.e(tlsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= btsVar3.k(f530Var) ? 256 : 128;
        }
        int i27 = i4 & 8;
        if (i27 != 0) {
            i5 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar3.a(z) ? 2048 : 1024;
            i6 = i4 & 16;
            if (i6 == 0) {
                i5 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z5 = z2;
                i5 |= btsVar3.a(z5) ? 16384 : 8192;
                if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
                    i5 |= 65536;
                }
                i7 = i4 & 64;
                if (i7 != 0) {
                    i5 |= 1572864;
                    wlsVar3 = wlsVar;
                } else {
                    wlsVar3 = wlsVar;
                    if ((i2 & 1572864) == 0) {
                        i5 |= btsVar3.e(wlsVar3) ? 1048576 : 524288;
                    }
                }
                i8 = i2 & 12582912;
                i9 = SelfTester_JCP.ENCRYPT_CBC;
                if (i8 == 0) {
                    i5 |= btsVar3.e(wlsVar2) ? 8388608 : 4194304;
                }
                i10 = i5 | 905969664;
                i11 = i4 & 1024;
                if (i11 != 0) {
                    i12 = i3 | 6;
                } else {
                    i12 = i3 | (btsVar3.a(z3) ? 4 : 2);
                }
                int i28 = i12;
                int i29 = i28 | 48;
                i13 = i4 & 4096;
                if (i13 != 0) {
                    i14 = i28 | 432;
                } else {
                    if ((i3 & 384) == 0) {
                        i29 |= btsVar3.k(lkxVar) ? 256 : 128;
                    }
                    i14 = i29;
                }
                int i30 = i14 | 1024;
                i15 = i4 & 16384;
                if (i15 != 0) {
                    i16 = i14 | 25600;
                } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i16 = i30 | (btsVar3.a(z4) ? 16384 : 8192);
                } else {
                    i16 = i30;
                }
                i17 = i4 & 32768;
                if (i17 != 0) {
                    i18 = i16 | ImageMetadata.EDGE_MODE;
                } else {
                    i18 = i16 | (btsVar3.c(i) ? 131072 : 65536);
                }
                i19 = i4 & 65536;
                if (i19 != 0) {
                    i18 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i18 |= btsVar3.k(zx40Var) ? 1048576 : 524288;
                }
                if ((i4 & 131072) == 0 && btsVar3.k(ehr0Var)) {
                    i9 = 8388608;
                }
                int i31 = i4 & 524288;
                i20 = i18 | i9 | (btsVar3.k(dmhVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (i31 != 0 ? 805306368 : btsVar3.k(j690Var) ? 536870912 : SelfTester_JCP.IMITA);
                if (btsVar3.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 306783379) != 306783378)) {
                    btsVar3.a0();
                    if ((i2 & 1) == 0 || btsVar3.C()) {
                        z10 = i27 != 0 ? true : z;
                        if (i6 != 0) {
                            z5 = false;
                        }
                        ety0 ety0Var5 = ((zm51) btsVar3.m(an51.a)).f;
                        int i32 = i10 & (-458753);
                        if (i7 != 0) {
                            wlsVar3 = null;
                        }
                        boolean z17 = i11 != 0 ? false : z3;
                        dy31 dy31Var = zoy0.w;
                        lkx lkxVar5 = i13 != 0 ? lkx.f : lkxVar;
                        xjxVar3 = new xjx(63, null);
                        int i33 = i20 & (-7169);
                        boolean z18 = i15 != 0 ? false : z4;
                        int i34 = i17 != 0 ? Integer.MAX_VALUE : i;
                        if (i19 != 0) {
                            Object Q = btsVar3.Q();
                            i22 = i20;
                            if (Q == did.a) {
                                Q = ly3.i(btsVar3);
                            }
                            zx40Var3 = (zx40) Q;
                        } else {
                            i22 = i20;
                            zx40Var3 = zx40Var;
                        }
                        if ((i4 & 131072) != 0) {
                            byk0 byk0Var = ((xir0) btsVar3.m(ajr0.a)).a;
                            ngd0 ngd0Var = ffx.a;
                            ehr0Var3 = byk0.b(byk0Var, null, null, ngd0Var, ngd0Var, 3);
                            i33 = i22 & (-29367297);
                        } else {
                            ehr0Var3 = ehr0Var;
                        }
                        wlsVar4 = wlsVar3;
                        z11 = z17;
                        i23 = i34;
                        i24 = i32;
                        i25 = i33;
                        ety0Var3 = ety0Var5;
                        gy31Var3 = dy31Var;
                        lkxVar3 = lkxVar5;
                        z12 = z18;
                        j690Var3 = i31 != 0 ? null : j690Var;
                        zx40Var2 = zx40Var3;
                        ehr0Var4 = ehr0Var3;
                    } else {
                        btsVar3.Y();
                        int i35 = i10 & (-458753);
                        int i36 = i20 & (-7169);
                        if ((i4 & 131072) != 0) {
                            i36 = i20 & (-29367297);
                        }
                        ety0Var3 = ety0Var;
                        gy31Var3 = gy31Var;
                        lkxVar3 = lkxVar;
                        xjxVar3 = xjxVar;
                        z12 = z4;
                        i23 = i;
                        zx40Var2 = zx40Var;
                        ehr0Var4 = ehr0Var;
                        j690Var3 = j690Var;
                        i24 = i35;
                        i25 = i36;
                        z10 = z;
                        wlsVar4 = wlsVar3;
                        z11 = z3;
                    }
                    btsVar3.u();
                    if (j690Var3 == null) {
                        btsVar3.e0(-1056263689);
                        int i37 = i24 & 2147483646;
                        int i38 = i25 << 3;
                        gy31Var4 = gy31Var3;
                        xjx xjxVar5 = xjxVar3;
                        z13 = z10;
                        boolean z19 = z5;
                        wls wlsVar6 = wlsVar4;
                        boolean z20 = z11;
                        lny0.b(str, tlsVar, f530Var, z13, z19, ety0Var3, wlsVar6, wlsVar2, z20, gy31Var4, lkxVar3, xjxVar5, z12, i23, 0, zx40Var2, ehr0Var4, dmhVar, btsVar3, i37, (i25 & 524286) | (i38 & 29360128) | (i38 & 234881024) | (i38 & 1879048192));
                        boolean z21 = z12;
                        btsVar2 = btsVar3;
                        btsVar2.t(false);
                        z15 = z21;
                        wlsVar5 = wlsVar6;
                        z14 = z20;
                        ety0Var4 = ety0Var3;
                        ehr0Var5 = ehr0Var4;
                        z16 = z19;
                        lkxVar4 = lkxVar3;
                        xjxVar4 = xjxVar5;
                        i26 = i23;
                    } else {
                        boolean z22 = z12;
                        z13 = z10;
                        lkx lkxVar6 = lkxVar3;
                        gy31 gy31Var5 = gy31Var3;
                        int i39 = i23;
                        xjx xjxVar6 = xjxVar3;
                        ehr0 ehr0Var6 = ehr0Var4;
                        ety0 ety0Var6 = ety0Var3;
                        boolean z23 = z5;
                        wls wlsVar7 = wlsVar4;
                        btsVar3.e0(-1055489898);
                        ety0 d = ety0Var6.d(new ety0(((ldc) dmhVar.b(z13, btsVar3).getValue()).a, 0L, null, null, null, null, 0L, 0, 0L, null, null, 16777214));
                        btsVar3.e0(-1423938813);
                        oz40 n = f.n(new ldc(dmhVar.o), btsVar3);
                        btsVar3.t(false);
                        ehr0Var5 = ehr0Var6;
                        z14 = z11;
                        wlsVar5 = wlsVar7;
                        int i40 = i25 << 12;
                        z15 = z22;
                        z16 = z23;
                        ety0Var4 = ety0Var6;
                        zx40 zx40Var4 = zx40Var2;
                        ne5.b(str, tlsVar, ljs0.a(b.a(m4m0.b(f530Var, ((ldc) n.getValue()).a, ehr0Var6), m.b ? new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z13, z11, zx40Var2, dmhVar, 2.0f, 1.0f) : m.a(), new lmy0(z13, z11, zx40Var2, dmhVar, 2.0f, 1.0f)), 280.0f, 56.0f), z13, z16, d, lkxVar6, xjxVar6, z15, i39, 0, gy31Var5, null, zx40Var4, new a6t0(((ldc) dmhVar.a(z11, btsVar3).getValue()).a), wwg.S(-931471994, true, new gny0(j690Var3, str, z13, z22, gy31Var5, zx40Var2, z11, wlsVar7, wlsVar2, dmhVar), btsVar3), btsVar3, (i24 & 64638) | (3670016 & i40) | (i40 & 234881024) | (i40 & 1879048192), 196656 | ((i25 >> 9) & 7168), 5120);
                        lkxVar4 = lkxVar6;
                        zx40Var2 = zx40Var4;
                        btsVar2 = btsVar3;
                        i26 = i39;
                        gy31Var4 = gy31Var5;
                        xjxVar4 = xjxVar6;
                        btsVar2.t(false);
                    }
                    z9 = z16;
                    btsVar = btsVar2;
                    i21 = i26;
                    ety0Var2 = ety0Var4;
                    j690Var2 = j690Var3;
                    ehr0Var2 = ehr0Var5;
                    wlsVar3 = wlsVar5;
                    z6 = z13;
                    z8 = z15;
                    xjxVar2 = xjxVar4;
                    lkxVar2 = lkxVar4;
                    gy31Var2 = gy31Var4;
                    z7 = z14;
                } else {
                    btsVar3.Y();
                    z6 = z;
                    z7 = z3;
                    gy31Var2 = gy31Var;
                    lkxVar2 = lkxVar;
                    z8 = z4;
                    i21 = i;
                    zx40Var2 = zx40Var;
                    ehr0Var2 = ehr0Var;
                    j690Var2 = j690Var;
                    z9 = z5;
                    btsVar = btsVar3;
                    ety0Var2 = ety0Var;
                    xjxVar2 = xjxVar;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: hny0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int O = vng.O(i2 | 1);
                            int O2 = vng.O(i3);
                            tlb1.b(str, tlsVar, f530Var, z6, z9, ety0Var2, wlsVar3, wlsVar2, z7, gy31Var2, lkxVar2, xjxVar2, z8, i21, zx40Var2, ehr0Var2, dmhVar, j690Var2, (fid) obj, O, O2, i4);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            z5 = z2;
            if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
            }
            i7 = i4 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 12582912;
            i9 = SelfTester_JCP.ENCRYPT_CBC;
            if (i8 == 0) {
            }
            i10 = i5 | 905969664;
            i11 = i4 & 1024;
            if (i11 != 0) {
            }
            int i282 = i12;
            int i292 = i282 | 48;
            i13 = i4 & 4096;
            if (i13 != 0) {
            }
            int i302 = i14 | 1024;
            i15 = i4 & 16384;
            if (i15 != 0) {
            }
            i17 = i4 & 32768;
            if (i17 != 0) {
            }
            i19 = i4 & 65536;
            if (i19 != 0) {
            }
            if ((i4 & 131072) == 0) {
                i9 = 8388608;
            }
            int i312 = i4 & 524288;
            i20 = i18 | i9 | (btsVar3.k(dmhVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (i312 != 0 ? 805306368 : btsVar3.k(j690Var) ? 536870912 : SelfTester_JCP.IMITA);
            if (btsVar3.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 306783379) != 306783378)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        z5 = z2;
        if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
        }
        i7 = i4 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 12582912;
        i9 = SelfTester_JCP.ENCRYPT_CBC;
        if (i8 == 0) {
        }
        i10 = i5 | 905969664;
        i11 = i4 & 1024;
        if (i11 != 0) {
        }
        int i2822 = i12;
        int i2922 = i2822 | 48;
        i13 = i4 & 4096;
        if (i13 != 0) {
        }
        int i3022 = i14 | 1024;
        i15 = i4 & 16384;
        if (i15 != 0) {
        }
        i17 = i4 & 32768;
        if (i17 != 0) {
        }
        i19 = i4 & 65536;
        if (i19 != 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        int i3122 = i4 & 524288;
        i20 = i18 | i9 | (btsVar3.k(dmhVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (i3122 != 0 ? 805306368 : btsVar3.k(j690Var) ? 536870912 : SelfTester_JCP.IMITA);
        if (btsVar3.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 306783379) != 306783378)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static gh20 c(gh20 gh20Var, LayoutDirection layoutDirection, ety0 ety0Var, fwi fwiVar, dyr dyrVar) {
        if (gh20Var != null && layoutDirection == gh20Var.a && bb1.I(ety0Var, layoutDirection).equals(gh20Var.b) && fwiVar.getDensity() == gh20Var.c.a && dyrVar == gh20Var.d) {
            return gh20Var;
        }
        gh20 gh20Var2 = gh20.h;
        if (gh20Var2 != null && layoutDirection == gh20Var2.a && bb1.I(ety0Var, layoutDirection).equals(gh20Var2.b) && fwiVar.getDensity() == gh20Var2.c.a && dyrVar == gh20Var2.d) {
            return gh20Var2;
        }
        gh20 gh20Var3 = new gh20(layoutDirection, bb1.I(ety0Var, layoutDirection), new iwi(fwiVar.getDensity(), fwiVar.u0()), dyrVar);
        gh20.h = gh20Var3;
        return gh20Var3;
    }

    public static final dmh d(long j, long j2, long j3, long j4, long j5, long j6, fid fidVar, int i, int i2) {
        a7u0 a7u0Var = gl51.a;
        long n = ((el51) ((bts) fidVar).m(a7u0Var)).n();
        qwd qwdVar = cfe.a;
        bts btsVar = (bts) fidVar;
        long j7 = ((ldc) btsVar.m(qwdVar)).a;
        a7u0 a7u0Var2 = mic.a;
        if (((lic) btsVar.m(a7u0Var2)).e()) {
            rzo.M(j7);
        } else {
            rzo.M(j7);
        }
        long b = ldc.b(n, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        long c = (i2 & 4) != 0 ? ((el51) ((bts) fidVar).m(a7u0Var)).c() : j;
        long f = (i2 & 8) != 0 ? ((el51) ((bts) fidVar).m(a7u0Var)).f() : j2;
        long h = ((el51) ((bts) fidVar).m(a7u0Var)).h();
        long f2 = (i2 & 32) != 0 ? ((el51) ((bts) fidVar).m(a7u0Var)).f() : j3;
        long g = (i2 & 64) != 0 ? ((el51) ((bts) fidVar).m(a7u0Var)).g() : j4;
        bts btsVar2 = (bts) fidVar;
        long j8 = ((ldc) btsVar2.m(qwdVar)).a;
        if (((lic) btsVar2.m(a7u0Var2)).e()) {
            rzo.M(j8);
        } else {
            rzo.M(j8);
        }
        long j9 = g;
        long b2 = ldc.b(j9, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        long h2 = ((el51) ((bts) fidVar).m(a7u0Var)).h();
        long b3 = ldc.b(((el51) ((bts) fidVar).m(a7u0Var)).b(), 0.54f, 0.0f, 0.0f, 0.0f, 14);
        bts btsVar3 = (bts) fidVar;
        long j10 = ((ldc) btsVar3.m(qwdVar)).a;
        if (((lic) btsVar3.m(a7u0Var2)).e()) {
            rzo.M(j10);
        } else {
            rzo.M(j10);
        }
        long b4 = ldc.b(b3, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        long b5 = ldc.b(((el51) ((bts) fidVar).m(a7u0Var)).b(), 0.54f, 0.0f, 0.0f, 0.0f, 14);
        bts btsVar4 = (bts) fidVar;
        long j11 = ((ldc) btsVar4.m(qwdVar)).a;
        if (((lic) btsVar4.m(a7u0Var2)).e()) {
            rzo.M(j11);
        } else {
            rzo.M(j11);
        }
        long b6 = ldc.b(b5, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        long h3 = ((el51) ((bts) fidVar).m(a7u0Var)).h();
        long f3 = (i2 & 32768) != 0 ? ((el51) ((bts) fidVar).m(a7u0Var)).f() : j5;
        long g2 = ((el51) ((bts) fidVar).m(a7u0Var)).g();
        bts btsVar5 = (bts) fidVar;
        long j12 = ((ldc) btsVar5.m(qwdVar)).a;
        if (((lic) btsVar5.m(a7u0Var2)).e()) {
            rzo.M(j12);
        } else {
            rzo.M(j12);
        }
        long b7 = ldc.b(g2, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        long h4 = ((el51) ((bts) fidVar).m(a7u0Var)).h();
        long o = (i2 & 524288) != 0 ? ((el51) ((bts) fidVar).m(a7u0Var)).o() : j6;
        bts btsVar6 = (bts) fidVar;
        long j13 = ((ldc) btsVar6.m(qwdVar)).a;
        if (((lic) btsVar6.m(a7u0Var2)).e()) {
            rzo.M(j13);
        } else {
            rzo.M(j13);
        }
        long j14 = o;
        return omy0.u(n, b, c, f, h, f2, j9, b2, h2, b3, b4, b3, b5, b6, h3, f3, g2, b7, h4, j14, ldc.b(j14, 0.38f, 0.0f, 0.0f, 0.0f, 14), fidVar, 0);
    }
}
