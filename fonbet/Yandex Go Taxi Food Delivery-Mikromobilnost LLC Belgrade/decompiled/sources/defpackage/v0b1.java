package defpackage;

import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class v0b1 {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final nvi0 nvi0Var, f530 f530Var, String str, wls wlsVar, wls wlsVar2, kfv kfvVar, jt1 jt1Var, nhe nheVar, float f, int i, fid fidVar, final int i2, final int i3) {
        int i4;
        f530 f530Var2;
        int i5;
        String str2;
        int i6;
        wls wlsVar3;
        int i7;
        wls wlsVar4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        bts btsVar;
        final kfv kfvVar2;
        final nhe nheVar2;
        final int i13;
        final f530 f530Var3;
        final String str3;
        final wls wlsVar5;
        final wls wlsVar6;
        final jt1 jt1Var2;
        final float f2;
        aii0 v;
        int i14;
        wls wlsVar7;
        wls wlsVar8;
        kfv kfvVar3;
        int i15;
        jt1 jt1Var3;
        float f3;
        int i16;
        nhe nheVar3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-751643680);
        if ((i2 & 6) == 0) {
            i4 = (btsVar2.k(nvi0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar2.k(f530Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                str2 = str;
                i4 |= btsVar2.k(str2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    wlsVar3 = wlsVar;
                    i4 |= btsVar2.e(wlsVar3) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        wlsVar4 = wlsVar2;
                        i4 |= btsVar2.e(wlsVar4) ? 16384 : 8192;
                        i8 = i3 & 32;
                        int i18 = ImageMetadata.EDGE_MODE;
                        if (i8 == 0) {
                            if ((196608 & i2) == 0) {
                                i18 = (262144 & i2) == 0 ? btsVar2.k(kfvVar) : btsVar2.e(kfvVar) ? 131072 : 65536;
                            }
                            i9 = i3 & 64;
                            if (i9 == 0) {
                                i4 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i4 |= btsVar2.k(jt1Var) ? 1048576 : 524288;
                            }
                            i10 = i3 & 128;
                            if (i10 == 0) {
                                i4 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i11 = i10;
                                i4 |= btsVar2.k(nheVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                                i12 = i4 | 100663296;
                                if ((i2 & 805306368) == 0) {
                                    i12 = i4 | 369098752;
                                }
                                if (btsVar2.V(i12 & 1, (i12 & 306783379) != 306783378)) {
                                    btsVar2.a0();
                                    if ((i2 & 1) == 0 || btsVar2.C()) {
                                        if (i17 != 0) {
                                            f530Var2 = c530.a;
                                        }
                                        if (i5 != 0) {
                                            str2 = null;
                                        }
                                        if (i6 != 0) {
                                            wlsVar7 = wwg.S(-1017378139, true, new os(f530Var2, 3), btsVar2);
                                            i14 = 1;
                                        } else {
                                            i14 = 1;
                                            wlsVar7 = wlsVar3;
                                        }
                                        if (i7 != 0) {
                                            u2d.a.getClass();
                                            wlsVar8 = u2d.b;
                                        } else {
                                            wlsVar8 = wlsVar4;
                                        }
                                        kfv kfvVar4 = i8 == 0 ? kfvVar : null;
                                        jt1 jt1Var4 = i9 != 0 ? x4c.y : jt1Var;
                                        nhe nheVar4 = i11 != 0 ? mhe.b : nheVar;
                                        kfvVar3 = kfvVar4;
                                        i15 = i12 & (-1879048193);
                                        jt1Var3 = jt1Var4;
                                        f3 = 1.0f;
                                        i16 = i14;
                                        nheVar3 = nheVar4;
                                    } else {
                                        btsVar2.Y();
                                        i15 = i12 & (-1879048193);
                                        kfvVar3 = kfvVar;
                                        jt1Var3 = jt1Var;
                                        nheVar3 = nheVar;
                                        f3 = f;
                                        i16 = i;
                                        wlsVar7 = wlsVar3;
                                        wlsVar8 = wlsVar4;
                                    }
                                    f530 f530Var4 = f530Var2;
                                    btsVar2.u();
                                    int i19 = i15 >> 3;
                                    int i20 = (i15 & 14) | (i19 & 896) | (i19 & 7168);
                                    ywy ywyVar = (ywy) ffb1.f(nvi0Var, btsVar2, i20 & 14).getValue();
                                    if (jl40.l(ywyVar, wwy.a)) {
                                        btsVar2.e0(-576192361);
                                        xvz.u((i20 >> 6) & 14, wlsVar7, btsVar2, false);
                                        btsVar = btsVar2;
                                    } else if (ywyVar instanceof xwy) {
                                        btsVar2.e0(-576123541);
                                        int i21 = (0 & 14) | (i15 & 112);
                                        int i22 = i15 >> 6;
                                        j4b1.c(((xwy) ywyVar).a, f530Var4, str2 == null ? nvi0Var.a() : str2, kfvVar3, jt1Var3, nheVar3, f3, i16, btsVar2, i21 | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (i22 & 29360128), 0);
                                        btsVar = btsVar2;
                                        btsVar.t(false);
                                    } else {
                                        btsVar = btsVar2;
                                        if (!jl40.l(ywyVar, vwy.a)) {
                                            throw unr0.y(1505431128, btsVar, false);
                                        }
                                        btsVar.e0(-576049575);
                                        xvz.u((i20 >> 9) & 14, wlsVar8, btsVar, false);
                                    }
                                    wlsVar5 = wlsVar7;
                                    str3 = str2;
                                    wlsVar6 = wlsVar8;
                                    f530Var3 = f530Var4;
                                    kfvVar2 = kfvVar3;
                                    jt1Var2 = jt1Var3;
                                    nheVar2 = nheVar3;
                                    f2 = f3;
                                    i13 = i16;
                                } else {
                                    btsVar = btsVar2;
                                    btsVar.Y();
                                    kfvVar2 = kfvVar;
                                    nheVar2 = nheVar;
                                    i13 = i;
                                    f530Var3 = f530Var2;
                                    str3 = str2;
                                    wlsVar5 = wlsVar3;
                                    wlsVar6 = wlsVar4;
                                    jt1Var2 = jt1Var;
                                    f2 = f;
                                }
                                v = btsVar.v();
                                if (v != null) {
                                    v.d = new wls() { // from class: ca3
                                        @Override // defpackage.wls
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            v0b1.a(nvi0.this, f530Var3, str3, wlsVar5, wlsVar6, kfvVar2, jt1Var2, nheVar2, f2, i13, (fid) obj, vng.O(i2 | 1), i3);
                                            return zy11.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            i11 = i10;
                            i12 = i4 | 100663296;
                            if ((i2 & 805306368) == 0) {
                            }
                            if (btsVar2.V(i12 & 1, (i12 & 306783379) != 306783378)) {
                            }
                            v = btsVar.v();
                            if (v != null) {
                            }
                        }
                        i4 |= i18;
                        i9 = i3 & 64;
                        if (i9 == 0) {
                        }
                        i10 = i3 & 128;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        i12 = i4 | 100663296;
                        if ((i2 & 805306368) == 0) {
                        }
                        if (btsVar2.V(i12 & 1, (i12 & 306783379) != 306783378)) {
                        }
                        v = btsVar.v();
                        if (v != null) {
                        }
                    }
                    wlsVar4 = wlsVar2;
                    i8 = i3 & 32;
                    int i182 = ImageMetadata.EDGE_MODE;
                    if (i8 == 0) {
                    }
                    i4 |= i182;
                    i9 = i3 & 64;
                    if (i9 == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    i12 = i4 | 100663296;
                    if ((i2 & 805306368) == 0) {
                    }
                    if (btsVar2.V(i12 & 1, (i12 & 306783379) != 306783378)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                wlsVar3 = wlsVar;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                wlsVar4 = wlsVar2;
                i8 = i3 & 32;
                int i1822 = ImageMetadata.EDGE_MODE;
                if (i8 == 0) {
                }
                i4 |= i1822;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i4 | 100663296;
                if ((i2 & 805306368) == 0) {
                }
                if (btsVar2.V(i12 & 1, (i12 & 306783379) != 306783378)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            str2 = str;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            wlsVar3 = wlsVar;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            wlsVar4 = wlsVar2;
            i8 = i3 & 32;
            int i18222 = ImageMetadata.EDGE_MODE;
            if (i8 == 0) {
            }
            i4 |= i18222;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i4 | 100663296;
            if ((i2 & 805306368) == 0) {
            }
            if (btsVar2.V(i12 & 1, (i12 & 306783379) != 306783378)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        wlsVar3 = wlsVar;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        wlsVar4 = wlsVar2;
        i8 = i3 & 32;
        int i182222 = ImageMetadata.EDGE_MODE;
        if (i8 == 0) {
        }
        i4 |= i182222;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i4 | 100663296;
        if ((i2 & 805306368) == 0) {
        }
        if (btsVar2.V(i12 & 1, (i12 & 306783379) != 306783378)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static pxm0 b() {
        return new pxm0("live_activity", "detailed_order");
    }

    public static final void c(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            lxv.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        lxv.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
