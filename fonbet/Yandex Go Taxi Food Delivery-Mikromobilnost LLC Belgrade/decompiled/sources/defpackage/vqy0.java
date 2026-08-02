package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class vqy0 {
    public static final qwd a = new qwd(new gjx0(20));

    public static final void a(ety0 ety0Var, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(15327438);
        int i2 = 4;
        int i3 = (btsVar.k(ety0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            qwd qwdVar = a;
            sb2.b(qwdVar.a(((ety0) btsVar.m(qwdVar)).d(ety0Var)), wlsVar, btsVar, (i3 & 112) | 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s1d(ety0Var, wlsVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, f530 f530Var, long j, long j2, lzr lzrVar, long j3, sjy0 sjy0Var, long j4, int i, boolean z, int i2, int i3, ety0 ety0Var, fid fidVar, int i4, int i5, int i6) {
        String str2;
        int i7;
        f530 f530Var2;
        int i8;
        long j5;
        int i9;
        lzr lzrVar2;
        int i10;
        sjy0 sjy0Var2;
        int i11;
        int i12;
        int i13;
        bts btsVar;
        long j6;
        int i14;
        boolean z2;
        int i15;
        int i16;
        ety0 ety0Var2;
        f530 f530Var3;
        sjy0 sjy0Var3;
        long j7;
        lzr lzrVar3;
        long j8;
        aii0 v;
        f530 f530Var4;
        lzr lzrVar4;
        int i17;
        int i18;
        long j9;
        long j10;
        long j11;
        long j12;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2055108902);
        if ((i4 & 6) == 0) {
            str2 = str;
            i7 = (btsVar2.k(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i7 = i4;
        }
        int i19 = i6 & 2;
        if (i19 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            f530Var2 = f530Var;
            i7 |= btsVar2.k(f530Var2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                j5 = j;
                i7 |= btsVar2.d(j5) ? 256 : 128;
                int i20 = i7 | 27648;
                i9 = i6 & 32;
                if (i9 != 0) {
                    i20 = i7 | 224256;
                } else if ((196608 & i4) == 0) {
                    lzrVar2 = lzrVar;
                    i20 |= btsVar2.k(lzrVar2) ? 131072 : 65536;
                    int i21 = i20 | 114819072;
                    i10 = i6 & 512;
                    if (i10 == 0) {
                        i21 = i20 | 920125440;
                    } else if ((805306368 & i4) == 0) {
                        sjy0Var2 = sjy0Var;
                        i21 |= btsVar2.k(sjy0Var2) ? 536870912 : SelfTester_JCP.IMITA;
                        i11 = i21;
                        int i22 = i5 | 54;
                        i12 = i6 & 4096;
                        if (i12 != 0) {
                            i22 = 438;
                        } else if ((i5 & 384) == 0) {
                            i22 |= btsVar2.a(z) ? 256 : 128;
                            i13 = i22 | 224256 | (((i6 & 65536) == 0 || !btsVar2.k(ety0Var)) ? 524288 : 1048576);
                            int i23 = 1;
                            if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i13 & 599187) != 599186)) {
                                btsVar = btsVar2;
                                btsVar.Y();
                                j6 = j3;
                                i14 = i;
                                z2 = z;
                                i15 = i2;
                                i16 = i3;
                                ety0Var2 = ety0Var;
                                f530Var3 = f530Var2;
                                sjy0Var3 = sjy0Var2;
                                j7 = j4;
                                lzrVar3 = lzrVar2;
                                j8 = j2;
                            } else {
                                btsVar2.a0();
                                if ((i4 & 1) == 0 || btsVar2.C()) {
                                    f530Var4 = i19 != 0 ? c530.a : f530Var2;
                                    if (i8 != 0) {
                                        j5 = ldc.m;
                                    }
                                    long j13 = sty0.c;
                                    if (i9 != 0) {
                                        lzrVar2 = null;
                                    }
                                    if (i10 != 0) {
                                        sjy0Var2 = null;
                                    }
                                    boolean z3 = i12 != 0 ? true : z;
                                    if ((i6 & 65536) != 0) {
                                        z2 = z3;
                                        ety0Var2 = (ety0) btsVar2.m(a);
                                        i17 = i13 & (-3670017);
                                        i18 = 1;
                                        lzrVar4 = lzrVar2;
                                    } else {
                                        ety0Var2 = ety0Var;
                                        lzrVar4 = lzrVar2;
                                        z2 = z3;
                                        i17 = i13;
                                        i18 = 1;
                                    }
                                    i15 = Integer.MAX_VALUE;
                                    j9 = j13;
                                    j10 = j9;
                                    j11 = j5;
                                    j12 = j10;
                                } else {
                                    btsVar2.Y();
                                    if ((i6 & 65536) != 0) {
                                        i13 &= -3670017;
                                    }
                                    j9 = j4;
                                    i23 = i;
                                    z2 = z;
                                    i18 = i3;
                                    ety0Var2 = ety0Var;
                                    lzrVar4 = lzrVar2;
                                    f530Var4 = f530Var2;
                                    j11 = j5;
                                    i17 = i13;
                                    j10 = j2;
                                    j12 = j3;
                                    i15 = i2;
                                }
                                btsVar2.u();
                                f530 f530Var5 = f530Var4;
                                int i24 = i11 << 3;
                                int i25 = (i11 & 14) | HProv.ALG_TYPE_SECURECHANNEL | (i11 & 112) | (i11 & 896) | (i24 & HProv.ALG_CLASS_ALL) | (i24 & ImageMetadata.JPEG_GPS_COORDINATES) | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i24 & 1879048192);
                                int i26 = (i11 >> 27) & 14;
                                int i27 = i17 << 3;
                                int i28 = i26 | 432 | (i27 & 7168) | 1794048 | (i27 & 29360128);
                                btsVar = btsVar2;
                                String str3 = str2;
                                long j14 = j12;
                                sjy0 sjy0Var4 = sjy0Var2;
                                j7 = j9;
                                i14 = i23;
                                f530Var3 = f530Var5;
                                i16 = i18;
                                c(str3, f530Var3, j11, j10, lzrVar4, j14, sjy0Var4, j7, i14, z2, i15, i16, ety0Var2, btsVar, i25, i28, 0);
                                long j15 = j10;
                                lzrVar3 = lzrVar4;
                                j6 = j14;
                                sjy0Var3 = sjy0Var4;
                                j5 = j11;
                                j8 = j15;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new kqy0(str, f530Var3, j5, j8, lzrVar3, j6, sjy0Var3, j7, i14, z2, i15, i16, ety0Var2, i4, i5, i6, 0);
                                return;
                            }
                            return;
                        }
                        i13 = i22 | 224256 | (((i6 & 65536) == 0 || !btsVar2.k(ety0Var)) ? 524288 : 1048576);
                        int i232 = 1;
                        if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i13 & 599187) != 599186)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    sjy0Var2 = sjy0Var;
                    i11 = i21;
                    int i222 = i5 | 54;
                    i12 = i6 & 4096;
                    if (i12 != 0) {
                    }
                    i13 = i222 | 224256 | (((i6 & 65536) == 0 || !btsVar2.k(ety0Var)) ? 524288 : 1048576);
                    int i2322 = 1;
                    if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i13 & 599187) != 599186)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                lzrVar2 = lzrVar;
                int i212 = i20 | 114819072;
                i10 = i6 & 512;
                if (i10 == 0) {
                }
                sjy0Var2 = sjy0Var;
                i11 = i212;
                int i2222 = i5 | 54;
                i12 = i6 & 4096;
                if (i12 != 0) {
                }
                i13 = i2222 | 224256 | (((i6 & 65536) == 0 || !btsVar2.k(ety0Var)) ? 524288 : 1048576);
                int i23222 = 1;
                if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i13 & 599187) != 599186)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            j5 = j;
            int i202 = i7 | 27648;
            i9 = i6 & 32;
            if (i9 != 0) {
            }
            lzrVar2 = lzrVar;
            int i2122 = i202 | 114819072;
            i10 = i6 & 512;
            if (i10 == 0) {
            }
            sjy0Var2 = sjy0Var;
            i11 = i2122;
            int i22222 = i5 | 54;
            i12 = i6 & 4096;
            if (i12 != 0) {
            }
            i13 = i22222 | 224256 | (((i6 & 65536) == 0 || !btsVar2.k(ety0Var)) ? 524288 : 1048576);
            int i232222 = 1;
            if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i13 & 599187) != 599186)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        j5 = j;
        int i2022 = i7 | 27648;
        i9 = i6 & 32;
        if (i9 != 0) {
        }
        lzrVar2 = lzrVar;
        int i21222 = i2022 | 114819072;
        i10 = i6 & 512;
        if (i10 == 0) {
        }
        sjy0Var2 = sjy0Var;
        i11 = i21222;
        int i222222 = i5 | 54;
        i12 = i6 & 4096;
        if (i12 != 0) {
        }
        i13 = i222222 | 224256 | (((i6 & 65536) == 0 || !btsVar2.k(ety0Var)) ? 524288 : 1048576);
        int i2322222 = 1;
        if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i13 & 599187) != 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, f530 f530Var, long j, long j2, lzr lzrVar, long j3, sjy0 sjy0Var, long j4, int i, boolean z, int i2, int i3, ety0 ety0Var, fid fidVar, int i4, int i5, int i6) {
        int i7;
        f530 f530Var2;
        int i8;
        int i9;
        long j5;
        int i10;
        lzr lzrVar2;
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
        int i21;
        int i22;
        bts btsVar;
        long j6;
        long j7;
        sjy0 sjy0Var2;
        int i23;
        ety0 ety0Var2;
        f530 f530Var3;
        lzr lzrVar3;
        long j8;
        int i24;
        long j9;
        boolean z2;
        int i25;
        aii0 v;
        long j10;
        long j11;
        int i26;
        int i27;
        ety0 ety0Var3;
        boolean z3;
        sjy0 sjy0Var3;
        long b;
        int i28;
        int i29;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (btsVar2.k(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i30 = i6 & 2;
        if (i30 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            f530Var2 = f530Var;
            i7 |= btsVar2.k(f530Var2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= btsVar2.d(j) ? 256 : 128;
            }
            if ((i6 & 8) == 0) {
                i7 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i7 |= btsVar2.e(null) ? 2048 : 1024;
            }
            i9 = i6 & 16;
            if (i9 == 0) {
                i7 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i7 |= btsVar2.d(j5) ? 16384 : 8192;
                }
            }
            if ((i6 & 32) == 0) {
                i7 |= ImageMetadata.EDGE_MODE;
            } else if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                i7 |= btsVar2.k(null) ? 131072 : 65536;
            }
            i10 = i6 & 64;
            if (i10 == 0) {
                i7 |= 1572864;
                lzrVar2 = lzrVar;
            } else {
                lzrVar2 = lzrVar;
                if ((i4 & 1572864) == 0) {
                    i7 |= btsVar2.k(lzrVar2) ? 1048576 : 524288;
                }
            }
            i11 = i6 & 128;
            int i31 = SelfTester_JCP.ENCRYPT_CBC;
            if (i11 == 0) {
                i7 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i7 |= btsVar2.k(null) ? 8388608 : 4194304;
            }
            i12 = i6 & 256;
            if (i12 == 0) {
                i7 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                i7 |= btsVar2.d(j3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
            }
            if ((i6 & 512) == 0) {
                i7 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i7 |= btsVar2.k(null) ? 536870912 : SelfTester_JCP.IMITA;
            }
            i13 = i6 & 1024;
            if (i13 == 0) {
                i14 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                i14 = i5 | (btsVar2.k(sjy0Var) ? 4 : 2);
            } else {
                i14 = i5;
            }
            i15 = i6 & 2048;
            if (i15 == 0) {
                i14 |= 48;
            } else if ((i5 & 48) == 0) {
                i14 |= btsVar2.d(j4) ? 32 : 16;
            }
            int i32 = i14;
            i16 = i6 & 4096;
            if (i16 == 0) {
                i32 |= 384;
            } else if ((i5 & 384) == 0) {
                i17 = i;
                i32 |= btsVar2.c(i17) ? 256 : 128;
                i18 = i6 & 8192;
                if (i18 != 0) {
                    i19 = i32 | HProv.ALG_TYPE_SECURECHANNEL;
                } else {
                    int i33 = i32;
                    if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                        i19 = i33 | (btsVar2.a(z) ? 2048 : 1024);
                    } else {
                        i19 = i33;
                    }
                }
                i20 = i6 & 16384;
                if (i20 != 0) {
                    i21 = i19 | HProv.ALG_CLASS_DATA_ENCRYPT;
                } else {
                    i21 = i19;
                    if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i21 |= btsVar2.c(i2) ? 16384 : 8192;
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                            i21 |= ImageMetadata.EDGE_MODE;
                        } else if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
                            i21 |= btsVar2.c(i3) ? 131072 : 65536;
                        }
                        if ((i6 & 65536) == 0) {
                            i21 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            i21 |= btsVar2.e(null) ? 1048576 : 524288;
                        }
                        if ((i5 & 12582912) == 0) {
                            if ((i6 & 131072) == 0 && btsVar2.k(ety0Var)) {
                                i31 = 8388608;
                            }
                            i21 |= i31;
                        }
                        if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                            btsVar = btsVar2;
                            btsVar.Y();
                            j6 = j;
                            j7 = j3;
                            sjy0Var2 = sjy0Var;
                            i23 = i3;
                            ety0Var2 = ety0Var;
                            f530Var3 = f530Var2;
                            lzrVar3 = lzrVar2;
                            j8 = j4;
                            i24 = i17;
                            j9 = j5;
                            z2 = z;
                            i25 = i2;
                        } else {
                            btsVar2.a0();
                            if ((i4 & 1) == 0 || btsVar2.C()) {
                                if (i30 != 0) {
                                    f530Var2 = c530.a;
                                }
                                j10 = i8 != 0 ? ldc.m : j;
                                if (i9 != 0) {
                                    j5 = sty0.c;
                                }
                                if (i10 != 0) {
                                    lzrVar2 = null;
                                }
                                j7 = i12 != 0 ? sty0.c : j3;
                                sjy0 sjy0Var4 = i13 != 0 ? null : sjy0Var;
                                j11 = i15 != 0 ? sty0.c : j4;
                                if (i16 != 0) {
                                    i17 = 1;
                                }
                                boolean z4 = i18 != 0 ? true : z;
                                i26 = i20 != 0 ? Integer.MAX_VALUE : i2;
                                i27 = i22 == 0 ? i3 : 1;
                                if ((i6 & 131072) != 0) {
                                    ety0Var3 = (ety0) btsVar2.m(a);
                                    i21 &= -29360129;
                                } else {
                                    ety0Var3 = ety0Var;
                                }
                                z3 = z4;
                                sjy0Var3 = sjy0Var4;
                            } else {
                                btsVar2.Y();
                                if ((i6 & 131072) != 0) {
                                    i21 &= -29360129;
                                }
                                j10 = j;
                                j7 = j3;
                                sjy0Var3 = sjy0Var;
                                j11 = j4;
                                z3 = z;
                                i26 = i2;
                                i27 = i3;
                                ety0Var3 = ety0Var;
                            }
                            btsVar2.u();
                            btsVar2.e0(-565217490);
                            if (j10 != 16) {
                                i28 = i26;
                                i29 = i17;
                                b = j10;
                            } else {
                                btsVar2.e0(-565216717);
                                b = ety0Var3.b();
                                if (b != 16) {
                                    i28 = i26;
                                    i29 = i17;
                                } else {
                                    i28 = i26;
                                    i29 = i17;
                                    b = ((ldc) btsVar2.m(bfe.a())).a;
                                }
                                btsVar2.t(false);
                            }
                            btsVar2.t(false);
                            int i34 = i21 << 6;
                            int i35 = i29;
                            int i36 = i28;
                            boolean z5 = z3;
                            m5b1.b(str, f530Var2, ety0.e(ety0Var3, b, j5, lzrVar2, null, null, j7, null, sjy0Var3 != null ? sjy0Var3.a : 0, j11, 16609104), null, i35, z5, i36, i27, null, null, btsVar2, (i7 & HProv.PP_DELETE_SAVED_PASSWD) | ((i21 >> 9) & 7168) | (57344 & i34) | (458752 & i34) | (3670016 & i34) | (i34 & 29360128) | ((i7 << 18) & 1879048192), 256);
                            btsVar = btsVar2;
                            sjy0Var2 = sjy0Var3;
                            ety0Var2 = ety0Var3;
                            lzrVar3 = lzrVar2;
                            i23 = i27;
                            i24 = i35;
                            j9 = j5;
                            z2 = z5;
                            i25 = i36;
                            f530Var3 = f530Var2;
                            j6 = j10;
                            j8 = j11;
                        }
                        v = btsVar.v();
                        if (v == null) {
                            v.d = new kqy0(str, f530Var3, j6, j9, lzrVar3, j7, sjy0Var2, j8, i24, z2, i25, i23, ety0Var2, i4, i5, i6, 1);
                            return;
                        }
                        return;
                    }
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                if ((i6 & 65536) == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            i17 = i;
            i18 = i6 & 8192;
            if (i18 != 0) {
            }
            i20 = i6 & 16384;
            if (i20 != 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            if ((i6 & 65536) == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        if ((i6 & 8) == 0) {
        }
        i9 = i6 & 16;
        if (i9 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & 128;
        int i312 = SelfTester_JCP.ENCRYPT_CBC;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        if ((i6 & 512) == 0) {
        }
        i13 = i6 & 1024;
        if (i13 == 0) {
        }
        i15 = i6 & 2048;
        if (i15 == 0) {
        }
        int i322 = i14;
        i16 = i6 & 4096;
        if (i16 == 0) {
        }
        i17 = i;
        i18 = i6 & 8192;
        if (i18 != 0) {
        }
        i20 = i6 & 16384;
        if (i20 != 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        if ((i6 & 65536) == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(kk2 kk2Var, f530 f530Var, long j, long j2, long j3, sjy0 sjy0Var, long j4, int i, boolean z, int i2, int i3, Map map, tls tlsVar, ety0 ety0Var, fid fidVar, int i4, int i5, int i6) {
        int i7;
        sjy0 sjy0Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j5;
        long j6;
        boolean z2;
        tls tlsVar2;
        int i13;
        sjy0 sjy0Var3;
        int i14;
        bts btsVar;
        long j7;
        int i15;
        Map map2;
        aii0 v;
        tls tlsVar3;
        Map map3;
        sjy0 sjy0Var4;
        int i16;
        int i17;
        long j8;
        long j9;
        boolean z3;
        int i18;
        int i19;
        int i20;
        long j10;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(292247417);
        if ((i4 & 6) == 0) {
            i7 = (btsVar2.k(kk2Var) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= btsVar2.d(j) ? 256 : 128;
        }
        int i21 = i7 | 920349696;
        int i22 = i6 & 1024;
        if (i22 != 0) {
            i8 = i5 | 6;
            sjy0Var2 = sjy0Var;
        } else if ((i5 & 6) == 0) {
            sjy0Var2 = sjy0Var;
            i8 = (btsVar2.k(sjy0Var2) ? 4 : 2) | i5;
        } else {
            sjy0Var2 = sjy0Var;
            i8 = i5;
        }
        int i23 = i8 | 48;
        int i24 = i6 & 4096;
        if (i24 != 0) {
            i23 = i8 | 432;
        } else if ((i5 & 384) == 0) {
            i9 = i;
            i23 |= btsVar2.c(i9) ? 256 : 128;
            int i25 = i23 | HProv.ALG_TYPE_SECURECHANNEL;
            i10 = i6 & 16384;
            if (i10 == 0) {
                i25 = i23 | 27648;
            } else if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i11 = i2;
                i25 |= btsVar2.c(i11) ? 16384 : 8192;
                i12 = i25 | 14352384;
                if ((i5 & 100663296) == 0) {
                    i12 |= btsVar2.k(ety0Var) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                }
                if (btsVar2.V(i21 & 1, (i21 & 306783379) == 306783378 || (38347923 & i12) != 38347922)) {
                    btsVar2.a0();
                    int i26 = i4 & 1;
                    int i27 = 14;
                    o430 o430Var = did.a;
                    if (i26 == 0 || btsVar2.C()) {
                        long j11 = sty0.c;
                        if (i22 != 0) {
                            sjy0Var2 = null;
                        }
                        if (i24 != 0) {
                            i9 = 1;
                        }
                        if (i10 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        Map f = b.f();
                        Object Q = btsVar2.Q();
                        if (Q == o430Var) {
                            Q = new uiy0(i27);
                            btsVar2.o0(Q);
                        }
                        tlsVar3 = (tls) Q;
                        sjy0 sjy0Var5 = sjy0Var2;
                        map3 = f;
                        sjy0Var4 = sjy0Var5;
                        i16 = i9;
                        i17 = i12;
                        j5 = j11;
                        j8 = j5;
                        j9 = j8;
                        z3 = true;
                        i18 = 1;
                    } else {
                        btsVar2.Y();
                        j5 = j2;
                        j8 = j3;
                        j9 = j4;
                        z3 = z;
                        tlsVar3 = tlsVar;
                        i16 = i9;
                        i17 = i12;
                        sjy0Var4 = sjy0Var2;
                        i18 = i3;
                        map3 = map;
                    }
                    int i28 = i11;
                    btsVar2.u();
                    btsVar2.e0(1676919260);
                    if (j != 16) {
                        j10 = j;
                        i19 = i21;
                        i20 = i17;
                    } else {
                        btsVar2.e0(1676920033);
                        long b = ety0Var.b();
                        if (b != 16) {
                            i19 = i21;
                            i20 = i17;
                        } else {
                            i19 = i21;
                            i20 = i17;
                            b = ((ldc) btsVar2.m(bfe.a())).a;
                        }
                        btsVar2.t(false);
                        j10 = b;
                    }
                    btsVar2.t(false);
                    long j12 = ((agc) btsVar2.m(dgc.a)).a;
                    boolean d = btsVar2.d(j12);
                    Object Q2 = btsVar2.Q();
                    if (d || Q2 == o430Var) {
                        Q2 = new hry0(new bmt0(j12, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, rly0.c, (bgr0) null, 61438), i27);
                        btsVar2.o0(Q2);
                    }
                    hry0 hry0Var = (hry0) Q2;
                    boolean k = ((i19 & 14) == 4) | btsVar2.k(hry0Var);
                    Object Q3 = btsVar2.Q();
                    if (k || Q3 == o430Var) {
                        rqy0 rqy0Var = new rqy0(hry0Var, 1);
                        kk2Var.getClass();
                        hk2 hk2Var = new hk2(kk2Var);
                        hk2Var.e(rqy0Var);
                        Q3 = hk2Var.i();
                        btsVar2.o0(Q3);
                    }
                    int i29 = i20 << 6;
                    m5b1.a((kk2) Q3, f530Var, ety0.e(ety0Var, j10, j5, null, null, null, j8, null, sjy0Var4 != null ? sjy0Var4.a : 0, j9, 16609104), tlsVar3, i16, z3, i28, i18, map3, null, btsVar2, (i19 & 112) | ((i20 >> 12) & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (i29 & 234881024), (i19 >> 9) & 14, 512);
                    tlsVar2 = tlsVar3;
                    i15 = i18;
                    j7 = j8;
                    sjy0Var3 = sjy0Var4;
                    z2 = z3;
                    btsVar = btsVar2;
                    map2 = map3;
                    i14 = i28;
                    i13 = i16;
                    j6 = j9;
                } else {
                    btsVar2.Y();
                    j5 = j2;
                    j6 = j4;
                    z2 = z;
                    tlsVar2 = tlsVar;
                    i13 = i9;
                    sjy0Var3 = sjy0Var2;
                    i14 = i11;
                    btsVar = btsVar2;
                    j7 = j3;
                    i15 = i3;
                    map2 = map;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new pqy0(kk2Var, f530Var, j, j5, j7, sjy0Var3, j6, i13, z2, i14, i15, map2, tlsVar2, ety0Var, i4, i5, i6);
                    return;
                }
                return;
            }
            i11 = i2;
            i12 = i25 | 14352384;
            if ((i5 & 100663296) == 0) {
            }
            if (btsVar2.V(i21 & 1, (i21 & 306783379) == 306783378 || (38347923 & i12) != 38347922)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        i9 = i;
        int i252 = i23 | HProv.ALG_TYPE_SECURECHANNEL;
        i10 = i6 & 16384;
        if (i10 == 0) {
        }
        i11 = i2;
        i12 = i252 | 14352384;
        if ((i5 & 100663296) == 0) {
        }
        if (btsVar2.V(i21 & 1, (i21 & 306783379) == 306783378 || (38347923 & i12) != 38347922)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }
}
