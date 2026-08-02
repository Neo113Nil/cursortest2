package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import com.google.ar.core.ImageMetadata;
import defpackage.m2k0;
import defpackage.oz40;
import defpackage.tje;
import defpackage.wg6;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class rab1 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final wg6 wg6Var, f530 f530Var, wls wlsVar, to5 to5Var, wls wlsVar2, to5 to5Var2, wls wlsVar3, to5 to5Var3, fid fidVar, int i, int i2) {
        int i3;
        to5 to5Var4;
        int i4;
        wls wlsVar4;
        int i5;
        int i6;
        wls wlsVar5;
        int i7;
        int i8;
        int i9;
        bts btsVar;
        to5 to5Var5;
        to5 to5Var6;
        to5 to5Var7;
        wls wlsVar6;
        wls wlsVar7;
        aii0 v;
        wls wlsVar8;
        int i10;
        to5 to5Var8;
        to5 to5Var9;
        wls wlsVar9;
        to5 to5Var10 = x4c.F;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2090645589);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(wg6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(wlsVar) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            to5Var4 = to5Var;
            i3 |= btsVar2.k(to5Var4) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                wlsVar4 = wlsVar2;
                i3 |= btsVar2.e(wlsVar4) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i) == 0) {
                    i3 |= btsVar2.k(to5Var2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        wlsVar5 = wlsVar3;
                    } else {
                        wlsVar5 = wlsVar3;
                        if ((i & 1572864) == 0) {
                            i3 |= btsVar2.e(wlsVar5) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i8 = i7;
                        i3 |= btsVar2.k(to5Var3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        i9 = i3;
                        if (btsVar2.V(i9 & 1, (i3 & 4793491) != 4793490)) {
                            to5 to5Var11 = i11 != 0 ? to5Var10 : to5Var4;
                            if (i4 != 0) {
                                n3d.a.getClass();
                                wlsVar8 = n3d.e;
                            } else {
                                wlsVar8 = wlsVar4;
                            }
                            if (i5 != 0) {
                                i10 = i6;
                                to5Var8 = to5Var10;
                            } else {
                                i10 = i6;
                                to5Var8 = to5Var2;
                            }
                            if (i10 != 0) {
                                n3d.a.getClass();
                                wlsVar9 = n3d.f;
                                to5Var9 = to5Var10;
                            } else {
                                to5Var9 = to5Var10;
                                wlsVar9 = wlsVar5;
                            }
                            to5 to5Var12 = i8 != 0 ? to5Var9 : to5Var3;
                            Object Q = btsVar2.Q();
                            o430 o430Var = did.a;
                            if (Q == o430Var) {
                                Q = f.j(Boolean.FALSE);
                                btsVar2.o0(Q);
                            }
                            final oz40 oz40Var = (oz40) Q;
                            Object Q2 = btsVar2.Q();
                            if (Q2 == o430Var) {
                                Q2 = id00.a(0.0f);
                                btsVar2.o0(Q2);
                            }
                            final a aVar = (a) Q2;
                            Object Q3 = btsVar2.Q();
                            if (Q3 == o430Var) {
                                Q3 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                                btsVar2.o0(Q3);
                            }
                            final tse tseVar = (tse) Q3;
                            boolean e = ((i9 & 14) == 4) | btsVar2.e(tseVar) | btsVar2.e(aVar);
                            Object Q4 = btsVar2.Q();
                            if (e || Q4 == o430Var) {
                                Q4 = new tls() { // from class: com.yandex.go.design.compose.modal.bottomsheet.toolbar.a
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        m2k0 m2k0Var = (m2k0) obj;
                                        wg6 wg6Var2 = wg6.this;
                                        boolean z = wg6Var2.h.getFloatValue() + ((float) wg6Var2.B.getIntValue()) < Float.intBitsToFloat((int) (m2k0Var.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                        oz40 oz40Var2 = oz40Var;
                                        boolean booleanValue = ((Boolean) oz40Var2.getValue()).booleanValue();
                                        androidx.compose.animation.core.a aVar2 = aVar;
                                        if (z != booleanValue) {
                                            oz40Var2.setValue(Boolean.valueOf(z));
                                            tje.N(tseVar, null, null, new BottomSheetToolBarKt$BottomSheetFloatingToolBar$1$1$1(aVar2, null, z), 3);
                                        }
                                        m2k0Var.G(Float.intBitsToFloat((int) (m2k0Var.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * ((Number) aVar2.e()).floatValue());
                                        return zy11.a;
                                    }
                                };
                                btsVar2.o0(Q4);
                            }
                            int i12 = (i9 >> 3) & 4194288;
                            btsVar = btsVar2;
                            crb1.a(i9a1.f(d.a(f530Var, (tls) Q4)), wlsVar, to5Var11, wlsVar8, to5Var8, wlsVar9, to5Var12, btsVar, i12, 0);
                            to5Var7 = to5Var11;
                            wlsVar7 = wlsVar8;
                            to5Var5 = to5Var8;
                            wlsVar6 = wlsVar9;
                            to5Var6 = to5Var12;
                        } else {
                            btsVar = btsVar2;
                            btsVar.Y();
                            to5Var5 = to5Var2;
                            to5Var6 = to5Var3;
                            to5Var7 = to5Var4;
                            wlsVar6 = wlsVar5;
                            wlsVar7 = wlsVar4;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new ah6(wg6Var, f530Var, wlsVar, to5Var7, wlsVar7, to5Var5, wlsVar6, to5Var6, i, i2);
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    i9 = i3;
                    if (btsVar2.V(i9 & 1, (i3 & 4793491) != 4793490)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3;
                if (btsVar2.V(i9 & 1, (i3 & 4793491) != 4793490)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            wlsVar4 = wlsVar2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i3;
            if (btsVar2.V(i9 & 1, (i3 & 4793491) != 4793490)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        to5Var4 = to5Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        wlsVar4 = wlsVar2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3;
        if (btsVar2.V(i9 & 1, (i3 & 4793491) != 4793490)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, wls wlsVar, to5 to5Var, wls wlsVar2, to5 to5Var2, wls wlsVar3, to5 to5Var3, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        wls wlsVar4;
        int i4;
        to5 to5Var4;
        int i5;
        int i6;
        to5 to5Var5;
        int i7;
        wls wlsVar5;
        int i8;
        to5 to5Var6;
        bts btsVar;
        wls wlsVar6;
        to5 to5Var7;
        f530 f530Var3;
        wls wlsVar7;
        to5 to5Var8;
        wls wlsVar8;
        aii0 v;
        int i9;
        wls wlsVar9;
        int i10;
        wls wlsVar10;
        wls wlsVar11;
        to5 to5Var9 = x4c.F;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-555413144);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            wlsVar4 = wlsVar;
            i3 |= btsVar2.e(wlsVar4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                to5Var4 = to5Var;
                i3 |= btsVar2.k(to5Var4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i3 |= btsVar2.e(wlsVar2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        to5Var5 = to5Var2;
                        i3 |= btsVar2.k(to5Var5) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ImageMetadata.EDGE_MODE;
                        } else if ((196608 & i) == 0) {
                            wlsVar5 = wlsVar3;
                            i3 |= btsVar2.e(wlsVar5) ? 131072 : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                to5Var6 = to5Var9;
                                i3 |= btsVar2.k(to5Var3) ? 1048576 : 524288;
                                if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
                                    f530 f530Var4 = i11 != 0 ? c530.a : f530Var2;
                                    if (i12 != 0) {
                                        n3d.a.getClass();
                                        wlsVar9 = n3d.b;
                                        i9 = i5;
                                    } else {
                                        i9 = i5;
                                        wlsVar9 = wlsVar4;
                                    }
                                    to5 to5Var10 = i4 != 0 ? to5Var6 : to5Var4;
                                    if (i9 != 0) {
                                        n3d.a.getClass();
                                        wlsVar10 = n3d.c;
                                        i10 = i6;
                                    } else {
                                        i10 = i6;
                                        wlsVar10 = wlsVar2;
                                    }
                                    if (i10 != 0) {
                                        to5Var5 = to5Var6;
                                    }
                                    if (i7 != 0) {
                                        n3d.a.getClass();
                                        wlsVar11 = n3d.d;
                                    } else {
                                        wlsVar11 = wlsVar5;
                                    }
                                    to5 to5Var11 = i8 != 0 ? to5Var6 : to5Var3;
                                    btsVar = btsVar2;
                                    crb1.a(i9a1.f(f530Var4), wlsVar9, to5Var10, wlsVar10, to5Var5, wlsVar11, to5Var11, btsVar, i3 & 4194288, 0);
                                    f530Var3 = f530Var4;
                                    wlsVar7 = wlsVar9;
                                    to5Var8 = to5Var10;
                                    wlsVar6 = wlsVar10;
                                    wlsVar8 = wlsVar11;
                                    to5Var7 = to5Var11;
                                } else {
                                    btsVar = btsVar2;
                                    btsVar.Y();
                                    wlsVar6 = wlsVar2;
                                    to5Var7 = to5Var3;
                                    f530Var3 = f530Var2;
                                    wlsVar7 = wlsVar4;
                                    to5Var8 = to5Var4;
                                    wlsVar8 = wlsVar5;
                                }
                                to5 to5Var12 = to5Var5;
                                v = btsVar.v();
                                if (v != null) {
                                    v.d = new bh6(f530Var3, wlsVar7, to5Var8, wlsVar6, to5Var12, wlsVar8, to5Var7, i, i2, 0);
                                    return;
                                }
                                return;
                            }
                            to5Var6 = to5Var9;
                            if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
                            }
                            to5 to5Var122 = to5Var5;
                            v = btsVar.v();
                            if (v != null) {
                            }
                        }
                        wlsVar5 = wlsVar3;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        to5Var6 = to5Var9;
                        if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
                        }
                        to5 to5Var1222 = to5Var5;
                        v = btsVar.v();
                        if (v != null) {
                        }
                    }
                    to5Var5 = to5Var2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    wlsVar5 = wlsVar3;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    to5Var6 = to5Var9;
                    if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
                    }
                    to5 to5Var12222 = to5Var5;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                to5Var5 = to5Var2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                wlsVar5 = wlsVar3;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                to5Var6 = to5Var9;
                if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
                }
                to5 to5Var122222 = to5Var5;
                v = btsVar.v();
                if (v != null) {
                }
            }
            to5Var4 = to5Var;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            to5Var5 = to5Var2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            wlsVar5 = wlsVar3;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            to5Var6 = to5Var9;
            if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
            }
            to5 to5Var1222222 = to5Var5;
            v = btsVar.v();
            if (v != null) {
            }
        }
        wlsVar4 = wlsVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        to5Var4 = to5Var;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        to5Var5 = to5Var2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        wlsVar5 = wlsVar3;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        to5Var6 = to5Var9;
        if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
        }
        to5 to5Var12222222 = to5Var5;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void c(fax faxVar, List list, hyw hywVar, String[] strArr) {
        if (list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        if (list.size() == 1) {
            faxVar.getChildren().put(str, new cax(str, faxVar.d(), hywVar, strArr));
            return;
        }
        lbx lbxVar = (aax) faxVar.getChildren().get(str);
        if (!(lbxVar instanceof fax)) {
            lbxVar = new eax(str, faxVar.d());
            faxVar.getChildren().put(str, lbxVar);
        }
        c((fax) lbxVar, list.subList(1, list.size()), hywVar, strArr);
    }

    public static final void d(kax kaxVar, String str, hyw hywVar, String... strArr) {
        List W;
        W = evu0.W(str, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        c(kaxVar, W, hywVar, strArr);
    }

    public static final void e(fax faxVar, List list) {
        if (list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        if (list.size() == 1) {
            faxVar.getChildren().put(str, new eax(str, faxVar.d()));
            return;
        }
        lbx lbxVar = (aax) faxVar.getChildren().get(str);
        if (!(lbxVar instanceof fax)) {
            lbxVar = new eax(str, faxVar.d());
            faxVar.getChildren().put(str, lbxVar);
        }
        e((fax) lbxVar, list.subList(1, list.size()));
    }

    public static final wdr0 f(wdr0 wdr0Var, String str, boolean z) {
        return wdr0.a(wdr0Var, zka1.d(wdr0Var.a, new lo1(str, z, 14)), null, null, null, false, null, null, null, null, false, 4094);
    }
}
