package defpackage;

import android.text.TextUtils;
import androidx.compose.runtime.internal.a;
import com.google.ar.core.ImageMetadata;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class xdb1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, final cqs0 cqs0Var, final tls tlsVar, final tls tlsVar2, boolean z, y7m y7mVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        y7m y7mVar2;
        bts btsVar;
        f530 f530Var2;
        boolean z3;
        aii0 v;
        float f;
        float f2;
        boolean z4;
        Object Q;
        hus0 hus0Var;
        final ?? r11;
        a aVar;
        a aVar2;
        a aVar3;
        final jvs0 jvs0Var;
        boolean z5;
        boolean z6;
        a aVar4;
        final jvs0 jvs0Var2;
        a S;
        float f3 = cqs0Var.k;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2063558072);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(cqs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(tlsVar2) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
                y7mVar2 = y7mVar;
            } else {
                y7mVar2 = y7mVar;
                if ((i & ImageMetadata.EDGE_MODE) == 0) {
                    i3 |= btsVar2.k(y7mVar2) ? 131072 : 65536;
                }
            }
            final int i7 = 1;
            if (btsVar2.V(i3 & 1, (i3 & 74899) == 74898)) {
                btsVar = btsVar2;
                btsVar.Y();
                f530Var2 = f530Var;
                z3 = z2;
            } else {
                f530 f530Var3 = i5 != 0 ? c530.a : f530Var;
                boolean z7 = i6 != 0 ? true : z2;
                y7m y7mVar3 = i4 != 0 ? null : y7mVar2;
                Object Q2 = btsVar2.Q();
                Object obj = did.a;
                if (Q2 == obj) {
                    Q2 = ly3.i(btsVar2);
                }
                zx40 zx40Var = (zx40) Q2;
                if (y7mVar3 != null) {
                    f2 = y7mVar3.a;
                } else if (y7m.b(f3, 32.0f)) {
                    f2 = 0.0f;
                } else if (y7m.b(f3, 40.0f)) {
                    f2 = 4.0f;
                } else if (y7m.b(f3, 48.0f)) {
                    f2 = 8.0f;
                } else {
                    f = 12.0f;
                    if (!y7m.b(f3, 56.0f)) {
                        y7m.b(f3, 64.0f);
                    }
                    boolean z8 = cqs0Var.g == null && cqs0Var.m;
                    z4 = ((i3 & 112) != 32) | ((i3 & 7168) != 2048);
                    Q = btsVar2.Q();
                    if (!z4 || Q == obj) {
                        Q = new lxo0(16, zx40Var, tlsVar2, cqs0Var);
                        btsVar2.o0(Q);
                    }
                    f530 c = rx21.c(f530Var3, z8, (tls) Q);
                    hus0Var = cqs0Var.l;
                    if (hus0Var instanceof gus0) {
                        r11 = 0;
                        if (!jl40.l(hus0Var, fus0.a)) {
                            w511.b();
                            return;
                        }
                    } else {
                        r11 = 0;
                        c = fnq0.b(c, false, new quq0(18, hus0Var));
                    }
                    f530 f530Var4 = c;
                    float f4 = cqs0Var.k;
                    if (cqs0Var.a != null) {
                        btsVar2.e0(-1590389315);
                        btsVar2.t(r11);
                        aVar = null;
                    } else {
                        btsVar2.e0(-1590389314);
                        a S2 = wwg.S(2063668855, true, new wls() { // from class: dts0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj2, Object obj3) {
                                int i8 = r11;
                                zy11 zy11Var = zy11.a;
                                cqs0 cqs0Var2 = cqs0Var;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                switch (i8) {
                                    case 0:
                                        bts btsVar3 = (bts) fidVar2;
                                        if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar3.Y();
                                            break;
                                        } else {
                                            beb1.d(cqs0Var2.a, btsVar3, 0);
                                            break;
                                        }
                                    case 1:
                                        bts btsVar4 = (bts) fidVar2;
                                        if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar4.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.c, null, null, btsVar4, 0, 6);
                                            break;
                                        }
                                    case 2:
                                        bts btsVar5 = (bts) fidVar2;
                                        if (!btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar5.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.d, null, null, btsVar5, 0, 6);
                                            break;
                                        }
                                    default:
                                        bts btsVar6 = (bts) fidVar2;
                                        if (!btsVar6.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar6.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.b, null, cqs0Var2.i, btsVar6, 0, 2);
                                            break;
                                        }
                                }
                                return zy11Var;
                            }
                        }, btsVar2);
                        btsVar2.t(r11);
                        aVar = S2;
                    }
                    if (cqs0Var.c != null) {
                        btsVar2.e0(-1590183940);
                        btsVar2.t(r11);
                        aVar2 = null;
                    } else {
                        btsVar2.e0(-1590183939);
                        a S3 = wwg.S(-1350684114, true, new wls() { // from class: dts0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj2, Object obj3) {
                                int i8 = i7;
                                zy11 zy11Var = zy11.a;
                                cqs0 cqs0Var2 = cqs0Var;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                switch (i8) {
                                    case 0:
                                        bts btsVar3 = (bts) fidVar2;
                                        if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar3.Y();
                                            break;
                                        } else {
                                            beb1.d(cqs0Var2.a, btsVar3, 0);
                                            break;
                                        }
                                    case 1:
                                        bts btsVar4 = (bts) fidVar2;
                                        if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar4.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.c, null, null, btsVar4, 0, 6);
                                            break;
                                        }
                                    case 2:
                                        bts btsVar5 = (bts) fidVar2;
                                        if (!btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar5.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.d, null, null, btsVar5, 0, 6);
                                            break;
                                        }
                                    default:
                                        bts btsVar6 = (bts) fidVar2;
                                        if (!btsVar6.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar6.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.b, null, cqs0Var2.i, btsVar6, 0, 2);
                                            break;
                                        }
                                }
                                return zy11Var;
                            }
                        }, btsVar2);
                        btsVar2.t(r11);
                        aVar2 = S3;
                    }
                    if (cqs0Var.d != null) {
                        btsVar2.e0(-1590092676);
                        btsVar2.t(r11);
                        aVar3 = null;
                    } else {
                        btsVar2.e0(-1590092675);
                        final int i8 = 2;
                        a S4 = wwg.S(761279984, true, new wls() { // from class: dts0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj2, Object obj3) {
                                int i82 = i8;
                                zy11 zy11Var = zy11.a;
                                cqs0 cqs0Var2 = cqs0Var;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                switch (i82) {
                                    case 0:
                                        bts btsVar3 = (bts) fidVar2;
                                        if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar3.Y();
                                            break;
                                        } else {
                                            beb1.d(cqs0Var2.a, btsVar3, 0);
                                            break;
                                        }
                                    case 1:
                                        bts btsVar4 = (bts) fidVar2;
                                        if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar4.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.c, null, null, btsVar4, 0, 6);
                                            break;
                                        }
                                    case 2:
                                        bts btsVar5 = (bts) fidVar2;
                                        if (!btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar5.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.d, null, null, btsVar5, 0, 6);
                                            break;
                                        }
                                    default:
                                        bts btsVar6 = (bts) fidVar2;
                                        if (!btsVar6.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar6.Y();
                                            break;
                                        } else {
                                            rdb1.b(cqs0Var2.b, null, cqs0Var2.i, btsVar6, 0, 2);
                                            break;
                                        }
                                }
                                return zy11Var;
                            }
                        }, btsVar2);
                        btsVar2.t(r11);
                        aVar3 = S4;
                    }
                    jvs0Var = cqs0Var.e;
                    if (jvs0Var != null) {
                        btsVar2.e0(-1589991461);
                        btsVar2.t(r11);
                        z6 = r11;
                        aVar4 = null;
                        z5 = true;
                    } else {
                        btsVar2.e0(-1589991460);
                        final int i9 = 0;
                        z5 = true;
                        a S5 = wwg.S(452499048, true, new wls() { // from class: ets0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj2, Object obj3) {
                                int i10 = i9;
                                zy11 zy11Var = zy11.a;
                                cqs0 cqs0Var2 = cqs0Var;
                                switch (i10) {
                                    case 0:
                                        fid fidVar2 = (fid) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        bts btsVar3 = (bts) fidVar2;
                                        if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar3.Y();
                                            break;
                                        } else {
                                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a(jvs0Var, true, cqs0Var2.f == null, tlsVar, tlsVar2, btsVar3, 48, 0);
                                            break;
                                        }
                                    default:
                                        fid fidVar3 = (fid) obj2;
                                        int intValue2 = ((Integer) obj3).intValue();
                                        bts btsVar4 = (bts) fidVar3;
                                        if (!btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            btsVar4.Y();
                                            break;
                                        } else {
                                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a(jvs0Var, cqs0Var2.e == null, true, tlsVar, tlsVar2, btsVar4, 384, 0);
                                            break;
                                        }
                                }
                                return zy11Var;
                            }
                        }, btsVar2);
                        z6 = false;
                        btsVar2.t(false);
                        aVar4 = S5;
                    }
                    jvs0Var2 = cqs0Var.f;
                    if (jvs0Var2 != null) {
                        btsVar2.e0(-1589643269);
                        btsVar2.t(z6);
                        S = null;
                    } else {
                        btsVar2.e0(-1589643268);
                        final int i10 = 1;
                        S = wwg.S(-573473976, z5, new wls() { // from class: ets0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj2, Object obj3) {
                                int i102 = i10;
                                zy11 zy11Var = zy11.a;
                                cqs0 cqs0Var2 = cqs0Var;
                                switch (i102) {
                                    case 0:
                                        fid fidVar2 = (fid) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        bts btsVar3 = (bts) fidVar2;
                                        if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                            btsVar3.Y();
                                            break;
                                        } else {
                                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a(jvs0Var2, true, cqs0Var2.f == null, tlsVar, tlsVar2, btsVar3, 48, 0);
                                            break;
                                        }
                                    default:
                                        fid fidVar3 = (fid) obj2;
                                        int intValue2 = ((Integer) obj3).intValue();
                                        bts btsVar4 = (bts) fidVar3;
                                        if (!btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            btsVar4.Y();
                                            break;
                                        } else {
                                            ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a(jvs0Var2, cqs0Var2.e == null, true, tlsVar, tlsVar2, btsVar4, 384, 0);
                                            break;
                                        }
                                }
                                return zy11Var;
                            }
                        }, btsVar2);
                        btsVar2.t(false);
                    }
                    final int i11 = 3;
                    btsVar = btsVar2;
                    y7mVar2 = y7mVar3;
                    web1.c(f530Var4, f4, false, f, null, aVar, wwg.S(376053036, z5, new wls() { // from class: dts0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i82 = i11;
                            zy11 zy11Var = zy11.a;
                            cqs0 cqs0Var2 = cqs0Var;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            switch (i82) {
                                case 0:
                                    bts btsVar3 = (bts) fidVar2;
                                    if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        beb1.d(cqs0Var2.a, btsVar3, 0);
                                        break;
                                    }
                                case 1:
                                    bts btsVar4 = (bts) fidVar2;
                                    if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        rdb1.b(cqs0Var2.c, null, null, btsVar4, 0, 6);
                                        break;
                                    }
                                case 2:
                                    bts btsVar5 = (bts) fidVar2;
                                    if (!btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                        btsVar5.Y();
                                        break;
                                    } else {
                                        rdb1.b(cqs0Var2.d, null, null, btsVar5, 0, 6);
                                        break;
                                    }
                                default:
                                    bts btsVar6 = (bts) fidVar2;
                                    if (!btsVar6.V(intValue & 1, (intValue & 3) != 2)) {
                                        btsVar6.Y();
                                        break;
                                    } else {
                                        rdb1.b(cqs0Var2.b, null, cqs0Var2.i, btsVar6, 0, 2);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar2), aVar2, aVar3, aVar4, S, oa01.d, z7, btsVar, 1573248, (i3 >> 6) & 896, 16);
                    f530Var2 = f530Var3;
                    z3 = z7;
                }
                f = f2;
                if (cqs0Var.g == null) {
                }
                if ((i3 & 7168) != 2048) {
                }
                z4 = ((i3 & 112) != 32) | ((i3 & 7168) != 2048);
                Q = btsVar2.Q();
                if (!z4) {
                }
                Q = new lxo0(16, zx40Var, tlsVar2, cqs0Var);
                btsVar2.o0(Q);
                f530 c2 = rx21.c(f530Var3, z8, (tls) Q);
                hus0Var = cqs0Var.l;
                if (hus0Var instanceof gus0) {
                }
                f530 f530Var42 = c2;
                float f42 = cqs0Var.k;
                if (cqs0Var.a != null) {
                }
                if (cqs0Var.c != null) {
                }
                if (cqs0Var.d != null) {
                }
                jvs0Var = cqs0Var.e;
                if (jvs0Var != null) {
                }
                jvs0Var2 = cqs0Var.f;
                if (jvs0Var2 != null) {
                }
                final int i112 = 3;
                btsVar = btsVar2;
                y7mVar2 = y7mVar3;
                web1.c(f530Var42, f42, false, f, null, aVar, wwg.S(376053036, z5, new wls() { // from class: dts0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj2, Object obj3) {
                        int i82 = i112;
                        zy11 zy11Var = zy11.a;
                        cqs0 cqs0Var2 = cqs0Var;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i82) {
                            case 0:
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    beb1.d(cqs0Var2.a, btsVar3, 0);
                                    break;
                                }
                            case 1:
                                bts btsVar4 = (bts) fidVar2;
                                if (!btsVar4.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    rdb1.b(cqs0Var2.c, null, null, btsVar4, 0, 6);
                                    break;
                                }
                            case 2:
                                bts btsVar5 = (bts) fidVar2;
                                if (!btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    rdb1.b(cqs0Var2.d, null, null, btsVar5, 0, 6);
                                    break;
                                }
                            default:
                                bts btsVar6 = (bts) fidVar2;
                                if (!btsVar6.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    rdb1.b(cqs0Var2.b, null, cqs0Var2.i, btsVar6, 0, 2);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar2), aVar2, aVar3, aVar4, S, oa01.d, z7, btsVar, 1573248, (i3 >> 6) & 896, 16);
                f530Var2 = f530Var3;
                z3 = z7;
            }
            y7m y7mVar4 = y7mVar2;
            v = btsVar.v();
            if (v == null) {
                v.d = new rpm(f530Var2, cqs0Var, tlsVar, tlsVar2, z3, y7mVar4, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        final int i72 = 1;
        if (btsVar2.V(i3 & 1, (i3 & 74899) == 74898)) {
        }
        y7m y7mVar42 = y7mVar2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static int b(pmk pmkVar) {
        if (pmkVar.b.isEmpty()) {
            return -1;
        }
        return ((nmk) pmkVar.b.get(0)).c;
    }

    public static int c(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (sgb1.g(2, "CameraOrientationUtil")) {
            StringBuilder s = b64.s(i, i2, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            s.append(z);
            s.append(", result=");
            s.append(i3);
            sgb1.g(3, "CameraOrientationUtil");
        }
        return i3;
    }

    public static boolean d(ctk ctkVar) {
        return (ctkVar == null || TextUtils.isEmpty(ctkVar.a.toString())) ? false : true;
    }

    public static boolean e(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence);
    }

    public static boolean f(CharSequence charSequence, ctk ctkVar) {
        return e(charSequence) && !d(ctkVar);
    }

    public static int g(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return SubsamplingScaleImageView.ORIENTATION_180;
        }
        if (i == 3) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        ny61.g(oyr.i(i, "Unsupported surface rotation: "));
        return 0;
    }
}
