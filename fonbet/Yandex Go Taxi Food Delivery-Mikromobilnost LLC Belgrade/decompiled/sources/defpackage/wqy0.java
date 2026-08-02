package defpackage;

import androidx.compose.runtime.internal.a;
import com.google.ar.core.ImageMetadata;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class wqy0 {
    public static final qwd a = new qwd(new y6y0(23));

    public static final void a(ety0 ety0Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-13499697);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ety0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qwd qwdVar = a;
            sb2.b(qwdVar.a(((ety0) btsVar.m(qwdVar)).d(ety0Var)), aVar, btsVar, (i2 & 112) | 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(ety0Var, aVar, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, f530 f530Var, long j, long j2, hzr hzrVar, lzr lzrVar, eyr eyrVar, long j3, rly0 rly0Var, sjy0 sjy0Var, long j4, int i, boolean z, int i2, int i3, tls tlsVar, ety0 ety0Var, fid fidVar, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        hzr hzrVar2;
        int i11;
        lzr lzrVar2;
        int i12;
        eyr eyrVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        int i22;
        int i23;
        int i24;
        int i25;
        bts btsVar;
        final f530 f530Var2;
        final long j6;
        final rly0 rly0Var2;
        final int i26;
        final int i27;
        final int i28;
        final tls tlsVar2;
        final ety0 ety0Var2;
        final boolean z3;
        final hzr hzrVar3;
        final long j7;
        final lzr lzrVar3;
        final eyr eyrVar3;
        final long j8;
        final sjy0 sjy0Var2;
        final long j9;
        aii0 v;
        f530 f530Var3;
        long j10;
        long j11;
        rly0 rly0Var3;
        sjy0 sjy0Var3;
        long j12;
        int i29;
        int i30;
        tls tlsVar3;
        ety0 ety0Var3;
        int i31;
        int i32;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1028090691);
        if ((i4 & 6) == 0) {
            i7 = (btsVar2.k(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i33 = i6 & 2;
        if (i33 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= btsVar2.k(f530Var) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= btsVar2.d(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= HProv.ALG_TYPE_SECURECHANNEL;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i7 |= btsVar2.d(j5) ? 2048 : 1024;
                }
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                hzrVar2 = hzrVar;
                i7 |= btsVar2.k(hzrVar2) ? 16384 : 8192;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ImageMetadata.EDGE_MODE;
                    lzrVar2 = lzrVar;
                } else {
                    lzrVar2 = lzrVar;
                    if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                        i7 |= btsVar2.k(lzrVar2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                int i34 = 524288;
                if (i12 != 0) {
                    i7 |= 1572864;
                    eyrVar2 = eyrVar;
                } else {
                    eyrVar2 = eyrVar;
                    if ((i4 & 1572864) == 0) {
                        i7 |= btsVar2.k(eyrVar2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= btsVar2.d(j3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i7 |= btsVar2.k(rly0Var) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i16 = i15;
                    i7 |= btsVar2.k(sjy0Var) ? 536870912 : SelfTester_JCP.IMITA;
                    i17 = i6 & 1024;
                    if (i17 == 0) {
                        i18 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i18 = i5 | (btsVar2.d(j4) ? 4 : 2);
                    } else {
                        i18 = i5;
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                        i20 = i19;
                    } else if ((i5 & 48) == 0) {
                        i20 = i19;
                        i18 |= btsVar2.c(i) ? 32 : 16;
                    } else {
                        i20 = i19;
                    }
                    int i35 = i18;
                    i21 = i6 & 4096;
                    if (i21 == 0) {
                        i35 |= 384;
                    } else if ((i5 & 384) == 0) {
                        z2 = z;
                        i35 |= btsVar2.a(z2) ? 256 : 128;
                        i22 = i6 & 8192;
                        if (i22 != 0) {
                            i23 = i35 | HProv.ALG_TYPE_SECURECHANNEL;
                        } else {
                            int i36 = i35;
                            if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                                i23 = i36 | (btsVar2.c(i2) ? 2048 : 1024);
                            } else {
                                i23 = i36;
                            }
                        }
                        int i37 = i23 | HProv.ALG_CLASS_DATA_ENCRYPT;
                        i24 = i6 & 32768;
                        if (i24 != 0) {
                            i37 = 221184 | i23;
                        } else if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
                            i37 |= btsVar2.e(tlsVar) ? 131072 : 65536;
                            if ((i5 & 1572864) == 0) {
                                if ((i6 & 65536) == 0 && btsVar2.k(ety0Var)) {
                                    i34 = 1048576;
                                }
                                i37 |= i34;
                            }
                            i25 = i37;
                            if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i25 & 599187) != 599186)) {
                                btsVar = btsVar2;
                                btsVar.Y();
                                f530Var2 = f530Var;
                                j6 = j;
                                rly0Var2 = rly0Var;
                                i26 = i;
                                i27 = i2;
                                i28 = i3;
                                tlsVar2 = tlsVar;
                                ety0Var2 = ety0Var;
                                z3 = z2;
                                hzrVar3 = hzrVar2;
                                j7 = j5;
                                lzrVar3 = lzrVar2;
                                eyrVar3 = eyrVar2;
                                j8 = j3;
                                sjy0Var2 = sjy0Var;
                                j9 = j4;
                            } else {
                                btsVar2.a0();
                                if ((i4 & 1) == 0 || btsVar2.C()) {
                                    f530Var3 = i33 != 0 ? c530.a : f530Var;
                                    j10 = i8 != 0 ? ldc.m : j;
                                    if (i9 != 0) {
                                        j5 = sty0.c;
                                    }
                                    if (i10 != 0) {
                                        hzrVar2 = null;
                                    }
                                    if (i11 != 0) {
                                        lzrVar2 = null;
                                    }
                                    if (i12 != 0) {
                                        eyrVar2 = null;
                                    }
                                    j11 = i13 != 0 ? sty0.c : j3;
                                    rly0Var3 = i14 != 0 ? null : rly0Var;
                                    sjy0Var3 = i16 != 0 ? null : sjy0Var;
                                    j12 = i17 != 0 ? sty0.c : j4;
                                    i29 = i20 != 0 ? 1 : i;
                                    if (i21 != 0) {
                                        z2 = true;
                                    }
                                    i30 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                    tlsVar3 = i24 == 0 ? tlsVar : null;
                                    if ((i6 & 65536) != 0) {
                                        i31 = i25 & (-3670017);
                                        ety0Var3 = (ety0) btsVar2.m(a);
                                    } else {
                                        ety0Var3 = ety0Var;
                                        i31 = i25;
                                    }
                                    i32 = 1;
                                } else {
                                    btsVar2.Y();
                                    if ((i6 & 65536) != 0) {
                                        f530Var3 = f530Var;
                                        j10 = j;
                                        j11 = j3;
                                        rly0Var3 = rly0Var;
                                        sjy0Var3 = sjy0Var;
                                        j12 = j4;
                                        i29 = i;
                                        i30 = i2;
                                        tlsVar3 = tlsVar;
                                        ety0Var3 = ety0Var;
                                        i31 = i25 & (-3670017);
                                        i32 = i3;
                                    } else {
                                        f530Var3 = f530Var;
                                        j10 = j;
                                        j11 = j3;
                                        rly0Var3 = rly0Var;
                                        sjy0Var3 = sjy0Var;
                                        j12 = j4;
                                        i29 = i;
                                        i30 = i2;
                                        i32 = i3;
                                        tlsVar3 = tlsVar;
                                        ety0Var3 = ety0Var;
                                        i31 = i25;
                                    }
                                }
                                btsVar2.u();
                                f530 f530Var4 = f530Var3;
                                int i38 = i32;
                                long b = j10 != 16 ? j10 : ety0Var3.b() != 16 ? ety0Var3.b() : ldc.b(((ldc) btsVar2.m(cfe.a)).a, ((Number) btsVar2.m(vee.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                                rly0 rly0Var4 = rly0Var3;
                                ety0 ety0Var4 = ety0Var3;
                                ety0 e = ety0.e(ety0Var4, 0L, j5, lzrVar2, hzrVar2, eyrVar2, j11, rly0Var4, sjy0Var3 != null ? sjy0Var3.a : 0, j12, 16609105);
                                boolean d = btsVar2.d(b);
                                Object Q = btsVar2.Q();
                                int i39 = i30;
                                if (d || Q == did.a) {
                                    Q = new fhp0(b, 1);
                                    btsVar2.o0(Q);
                                }
                                int i40 = i31 << 9;
                                m5b1.b(str, f530Var4, e, tlsVar3, i29, z2, i39, i38, (xfc) Q, null, btsVar2, (i7 & HProv.PP_DELETE_SAVED_PASSWD) | ((i31 >> 6) & 7168) | (57344 & i40) | (458752 & i40) | (3670016 & i40) | (i40 & 29360128), 512);
                                btsVar = btsVar2;
                                i28 = i38;
                                i27 = i39;
                                hzrVar3 = hzrVar2;
                                eyrVar3 = eyrVar2;
                                j6 = j10;
                                f530Var2 = f530Var4;
                                z3 = z2;
                                long j13 = j12;
                                ety0Var2 = ety0Var4;
                                tlsVar2 = tlsVar3;
                                j7 = j5;
                                lzrVar3 = lzrVar2;
                                j8 = j11;
                                j9 = j13;
                                i26 = i29;
                                sjy0Var2 = sjy0Var3;
                                rly0Var2 = rly0Var4;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new wls() { // from class: lqy0
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int O = vng.O(i4 | 1);
                                        int O2 = vng.O(i5);
                                        wqy0.b(str, f530Var2, j6, j7, hzrVar3, lzrVar3, eyrVar3, j8, rly0Var2, sjy0Var2, j9, i26, z3, i27, i28, tlsVar2, ety0Var2, (fid) obj, O, O2, i6);
                                        return zy11.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        i25 = i37;
                        if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i25 & 599187) != 599186)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    z2 = z;
                    i22 = i6 & 8192;
                    if (i22 != 0) {
                    }
                    int i372 = i23 | HProv.ALG_CLASS_DATA_ENCRYPT;
                    i24 = i6 & 32768;
                    if (i24 != 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    i25 = i372;
                    if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i25 & 599187) != 599186)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                i16 = i15;
                i17 = i6 & 1024;
                if (i17 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i352 = i18;
                i21 = i6 & 4096;
                if (i21 == 0) {
                }
                z2 = z;
                i22 = i6 & 8192;
                if (i22 != 0) {
                }
                int i3722 = i23 | HProv.ALG_CLASS_DATA_ENCRYPT;
                i24 = i6 & 32768;
                if (i24 != 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                i25 = i3722;
                if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i25 & 599187) != 599186)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            hzrVar2 = hzrVar;
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            int i342 = 524288;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & 1024;
            if (i17 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i3522 = i18;
            i21 = i6 & 4096;
            if (i21 == 0) {
            }
            z2 = z;
            i22 = i6 & 8192;
            if (i22 != 0) {
            }
            int i37222 = i23 | HProv.ALG_CLASS_DATA_ENCRYPT;
            i24 = i6 & 32768;
            if (i24 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            i25 = i37222;
            if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i25 & 599187) != 599186)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        hzrVar2 = hzrVar;
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        int i3422 = 524288;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & 1024;
        if (i17 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i35222 = i18;
        i21 = i6 & 4096;
        if (i21 == 0) {
        }
        z2 = z;
        i22 = i6 & 8192;
        if (i22 != 0) {
        }
        int i372222 = i23 | HProv.ALG_CLASS_DATA_ENCRYPT;
        i24 = i6 & 32768;
        if (i24 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        i25 = i372222;
        if (btsVar2.V(i7 & 1, (i7 & 306783379) == 306783378 || (i25 & 599187) != 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x042a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(kk2 kk2Var, f530 f530Var, long j, long j2, lzr lzrVar, long j3, long j4, int i, boolean z, int i2, int i3, Map map, tls tlsVar, ety0 ety0Var, fid fidVar, int i4, int i5, int i6) {
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        lzr lzrVar2;
        int i11;
        long j7;
        int i12;
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
        bts btsVar;
        int i23;
        Map map2;
        tls tlsVar2;
        ety0 ety0Var2;
        long j8;
        lzr lzrVar3;
        long j9;
        int i24;
        int i25;
        boolean z3;
        long j10;
        long j11;
        aii0 v;
        long j12;
        int i26;
        int i27;
        Map f;
        tls tlsVar3;
        tls tlsVar4;
        int i28;
        int i29;
        ety0 ety0Var3;
        long b;
        boolean d;
        Object Q;
        boolean k;
        Object Q2;
        boolean d2;
        Object Q3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(744129681);
        if ((i4 & 6) == 0) {
            i7 = (btsVar2.k(kk2Var) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        int i30 = i6 & 4;
        if (i30 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            j5 = j;
            i7 |= btsVar2.d(j5) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= HProv.ALG_TYPE_SECURECHANNEL;
                i9 = i30;
                j6 = j2;
            } else {
                i9 = i30;
                j6 = j2;
                if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i7 |= btsVar2.d(j6) ? 2048 : 1024;
                }
            }
            if ((i6 & 16) == 0) {
                i7 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i7 |= btsVar2.k(null) ? 16384 : 8192;
            }
            i10 = i6 & 32;
            if (i10 == 0) {
                i7 |= ImageMetadata.EDGE_MODE;
                lzrVar2 = lzrVar;
            } else {
                lzrVar2 = lzrVar;
                if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                    i7 |= btsVar2.k(lzrVar2) ? 131072 : 65536;
                }
            }
            if ((i6 & 64) == 0) {
                i7 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i7 |= btsVar2.k(null) ? 1048576 : 524288;
            }
            i11 = i6 & 128;
            int i31 = SelfTester_JCP.ENCRYPT_CBC;
            if (i11 == 0) {
                i7 |= 12582912;
                j7 = j3;
            } else {
                j7 = j3;
                if ((i4 & 12582912) == 0) {
                    i7 |= btsVar2.d(j7) ? 8388608 : 4194304;
                }
            }
            if ((i6 & 256) == 0) {
                i7 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                i7 |= btsVar2.k(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
            }
            if ((i6 & 512) == 0) {
                i7 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i7 |= btsVar2.k(null) ? 536870912 : SelfTester_JCP.IMITA;
                i12 = i6 & 1024;
                if (i12 != 0) {
                    i13 = i7;
                    i15 = i5 | 6;
                    i14 = i11;
                } else {
                    i13 = i7;
                    if ((i5 & 6) == 0) {
                        i14 = i11;
                        i15 = i5 | (btsVar2.d(j4) ? 4 : 2);
                    } else {
                        i14 = i11;
                        i15 = i5;
                    }
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                    i17 = i16;
                } else if ((i5 & 48) == 0) {
                    i17 = i16;
                    i15 |= btsVar2.c(i) ? 32 : 16;
                } else {
                    i17 = i16;
                }
                int i32 = i15;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i32 |= 384;
                } else if ((i5 & 384) == 0) {
                    z2 = z;
                    i32 |= btsVar2.a(z2) ? 256 : 128;
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                        i20 = i32 | HProv.ALG_TYPE_SECURECHANNEL;
                    } else {
                        int i33 = i32;
                        if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                            i20 = i33 | (btsVar2.c(i2) ? 2048 : 1024);
                        } else {
                            i20 = i33;
                        }
                    }
                    i21 = i20 | 221184;
                    i22 = i6 & 65536;
                    if (i22 == 0) {
                        i21 = i20 | 1794048;
                    } else if ((i5 & 1572864) == 0) {
                        i21 |= btsVar2.e(tlsVar) ? 1048576 : 524288;
                    }
                    if ((i5 & 12582912) == 0) {
                        if ((i6 & 131072) == 0 && btsVar2.k(ety0Var)) {
                            i31 = 8388608;
                        }
                        i21 |= i31;
                    }
                    if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        i23 = i;
                        map2 = map;
                        tlsVar2 = tlsVar;
                        ety0Var2 = ety0Var;
                        j8 = j7;
                        lzrVar3 = lzrVar2;
                        j9 = j5;
                        i24 = i2;
                        i25 = i3;
                        z3 = z2;
                        j10 = j6;
                        j11 = j4;
                    } else {
                        btsVar2.a0();
                        int i34 = i4 & 1;
                        Object obj = did.a;
                        if (i34 == 0 || btsVar2.C()) {
                            if (i9 != 0) {
                                j5 = ldc.m;
                            }
                            if (i8 != 0) {
                                j6 = sty0.c;
                            }
                            if (i10 != 0) {
                                lzrVar2 = null;
                            }
                            if (i14 != 0) {
                                j7 = sty0.c;
                            }
                            j12 = i12 != 0 ? sty0.c : j4;
                            i26 = i17 != 0 ? 1 : i;
                            if (i18 != 0) {
                                z2 = true;
                            }
                            i27 = i19 != 0 ? Integer.MAX_VALUE : i2;
                            f = b.f();
                            if (i22 != 0) {
                                Object Q4 = btsVar2.Q();
                                if (Q4 == obj) {
                                    Q4 = new uiy0(13);
                                    btsVar2.o0(Q4);
                                }
                                tlsVar3 = (tls) Q4;
                            } else {
                                tlsVar3 = tlsVar;
                            }
                            if ((i6 & 131072) != 0) {
                                i29 = i21 & (-29360129);
                                ety0Var3 = (ety0) btsVar2.m(a);
                                tlsVar4 = tlsVar3;
                                i28 = 1;
                                btsVar2.u();
                                int i35 = i26;
                                int i36 = i27;
                                boolean z4 = z2;
                                b = j5 == 16 ? j5 : ety0Var3.b() != 16 ? ety0Var3.b() : ldc.b(((ldc) btsVar2.m(cfe.a)).a, ((Number) btsVar2.m(vee.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                                long j13 = j7;
                                long c = ((lic) btsVar2.m(mic.a)).c();
                                d = btsVar2.d(c);
                                Q = btsVar2.Q();
                                if (!d || Q == obj) {
                                    Q = new hry0(new bmt0(c, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, rly0.c, (bgr0) null, 61438), 14);
                                    btsVar2.o0(Q);
                                }
                                hry0 hry0Var = (hry0) Q;
                                k = ((i13 & 14) == 4) | btsVar2.k(hry0Var);
                                Q2 = btsVar2.Q();
                                if (!k || Q2 == obj) {
                                    rqy0 rqy0Var = new rqy0(hry0Var, 0);
                                    kk2Var.getClass();
                                    hk2 hk2Var = new hk2(kk2Var);
                                    hk2Var.e(rqy0Var);
                                    Q2 = hk2Var.i();
                                    btsVar2.o0(Q2);
                                }
                                kk2 kk2Var2 = (kk2) Q2;
                                ety0 ety0Var4 = ety0Var3;
                                ety0 e = ety0.e(ety0Var4, 0L, j6, lzrVar2, null, null, j13, null, 0, j12, 16609105);
                                d2 = btsVar2.d(b);
                                Q3 = btsVar2.Q();
                                if (!d2 || Q3 == obj) {
                                    Q3 = new fhp0(b, 2);
                                    btsVar2.o0(Q3);
                                }
                                int i37 = i29 << 9;
                                int i38 = i28;
                                tls tlsVar5 = tlsVar4;
                                m5b1.a(kk2Var2, f530Var, e, tlsVar5, i35, z4, i36, i38, f, (xfc) Q3, btsVar2, (i13 & 112) | ((i29 >> 9) & 7168) | (57344 & i37) | (458752 & i37) | (3670016 & i37) | (29360128 & i37) | (i37 & 234881024), 0, 1024);
                                btsVar = btsVar2;
                                map2 = f;
                                j8 = j13;
                                i23 = i35;
                                tlsVar2 = tlsVar5;
                                ety0Var2 = ety0Var4;
                                lzrVar3 = lzrVar2;
                                z3 = z4;
                                j10 = j6;
                                j11 = j12;
                                i25 = i38;
                                j9 = j5;
                                i24 = i36;
                            } else {
                                tlsVar4 = tlsVar3;
                                i28 = 1;
                            }
                        } else {
                            btsVar2.Y();
                            if ((i6 & 131072) != 0) {
                                i21 &= -29360129;
                            }
                            j12 = j4;
                            i26 = i;
                            i27 = i2;
                            i28 = i3;
                            f = map;
                            tlsVar4 = tlsVar;
                        }
                        i29 = i21;
                        ety0Var3 = ety0Var;
                        btsVar2.u();
                        int i352 = i26;
                        int i362 = i27;
                        boolean z42 = z2;
                        if (j5 == 16) {
                        }
                        long j132 = j7;
                        long c2 = ((lic) btsVar2.m(mic.a)).c();
                        d = btsVar2.d(c2);
                        Q = btsVar2.Q();
                        if (!d) {
                        }
                        Q = new hry0(new bmt0(c2, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, rly0.c, (bgr0) null, 61438), 14);
                        btsVar2.o0(Q);
                        hry0 hry0Var2 = (hry0) Q;
                        k = ((i13 & 14) == 4) | btsVar2.k(hry0Var2);
                        Q2 = btsVar2.Q();
                        if (!k) {
                        }
                        rqy0 rqy0Var2 = new rqy0(hry0Var2, 0);
                        kk2Var.getClass();
                        hk2 hk2Var2 = new hk2(kk2Var);
                        hk2Var2.e(rqy0Var2);
                        Q2 = hk2Var2.i();
                        btsVar2.o0(Q2);
                        kk2 kk2Var22 = (kk2) Q2;
                        ety0 ety0Var42 = ety0Var3;
                        ety0 e2 = ety0.e(ety0Var42, 0L, j6, lzrVar2, null, null, j132, null, 0, j12, 16609105);
                        d2 = btsVar2.d(b);
                        Q3 = btsVar2.Q();
                        if (!d2) {
                        }
                        Q3 = new fhp0(b, 2);
                        btsVar2.o0(Q3);
                        int i372 = i29 << 9;
                        int i382 = i28;
                        tls tlsVar52 = tlsVar4;
                        m5b1.a(kk2Var22, f530Var, e2, tlsVar52, i352, z42, i362, i382, f, (xfc) Q3, btsVar2, (i13 & 112) | ((i29 >> 9) & 7168) | (57344 & i372) | (458752 & i372) | (3670016 & i372) | (29360128 & i372) | (i372 & 234881024), 0, 1024);
                        btsVar = btsVar2;
                        map2 = f;
                        j8 = j132;
                        i23 = i352;
                        tlsVar2 = tlsVar52;
                        ety0Var2 = ety0Var42;
                        lzrVar3 = lzrVar2;
                        z3 = z42;
                        j10 = j6;
                        j11 = j12;
                        i25 = i382;
                        j9 = j5;
                        i24 = i362;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new pqy0(kk2Var, f530Var, j9, j10, lzrVar3, j8, j11, i23, z3, i24, i25, map2, tlsVar2, ety0Var2, i4, i5, i6);
                        return;
                    }
                    return;
                }
                z2 = z;
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i21 = i20 | 221184;
                i22 = i6 & 65536;
                if (i22 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            i12 = i6 & 1024;
            if (i12 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            int i322 = i15;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            z2 = z;
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i21 = i20 | 221184;
            i22 = i6 & 65536;
            if (i22 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        j5 = j;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        if ((i6 & 16) == 0) {
        }
        i10 = i6 & 32;
        if (i10 == 0) {
        }
        if ((i6 & 64) == 0) {
        }
        i11 = i6 & 128;
        int i312 = SelfTester_JCP.ENCRYPT_CBC;
        if (i11 == 0) {
        }
        if ((i6 & 256) == 0) {
        }
        if ((i6 & 512) == 0) {
        }
        i12 = i6 & 1024;
        if (i12 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        int i3222 = i15;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        z2 = z;
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i21 = i20 | 221184;
        i22 = i6 & 65536;
        if (i22 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
