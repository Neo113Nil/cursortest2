package defpackage;

import android.content.Context;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ColoredTextEntity;
import com.ybsdk.feature.credit.deposit.internal.network.dto.AftInfo;
import com.ybsdk.feature.credit.deposit.internal.network.dto.PaymentMethodSheetItemDto;
import com.ybsdk.feature.credit.deposit.internal.network.dto.WalletInfo;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.mg2;
import defpackage.oz40;
import defpackage.sz40;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportCardStatus;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardStatus;

/* loaded from: classes6.dex */
public abstract class ttb1 {
    /* JADX WARN: Removed duplicated region for block: B:104:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final Object obj, f530 f530Var, v2o v2oVar, ymo ymoVar, String str, final bms bmsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        int i5;
        ymo ymoVar2;
        int i6;
        String str2;
        v2o v2oVar2;
        f530 f530Var3;
        ymo ymoVar3;
        aii0 v;
        int i7;
        f530 f530Var4;
        ymo ymoVar4;
        v2o v2oVar3;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1062043652);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(obj) : btsVar.e(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= btsVar.k(v2oVar) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    ymoVar2 = ymoVar;
                    i3 |= btsVar.k(ymoVar2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        str2 = str;
                        i3 |= btsVar.k(str2) ? 16384 : 8192;
                        if ((i & ImageMetadata.EDGE_MODE) == 0) {
                            i3 |= btsVar.e(bmsVar) ? 131072 : 65536;
                        }
                        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                            if (i8 != 0) {
                                f530Var4 = c530.a;
                                i7 = i5;
                            } else {
                                i7 = i5;
                                f530Var4 = f530Var2;
                            }
                            v2o e = i4 != 0 ? k.e(null, 3) : v2oVar;
                            ymo f = i7 != 0 ? k.f(null, 3) : ymoVar2;
                            String str3 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (tje.L((Context) btsVar.m(AndroidCompositionLocals_androidKt.b))) {
                                btsVar.e0(1681988441);
                                if (obj == null) {
                                    btsVar.e0(1681988440);
                                    btsVar.t(false);
                                    z = false;
                                } else {
                                    btsVar.e0(1681988441);
                                    z = false;
                                    g.e(true, f530Var4, v2o.a, ymo.a, null, wwg.S(-1346447490, true, new wkb0(bmsVar, obj, i3, 4), btsVar), btsVar, (i3 & 112) | 196614, 16);
                                    btsVar.t(false);
                                }
                                btsVar.t(z);
                                v2oVar3 = e;
                                ymoVar4 = f;
                                str2 = str3;
                            } else {
                                btsVar.e0(1682217066);
                                Object Q = btsVar.Q();
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    Q = f.j(obj);
                                    btsVar.o0(Q);
                                }
                                final oz40 oz40Var = (oz40) Q;
                                Object Q2 = btsVar.Q();
                                if (Q2 == o430Var) {
                                    Q2 = new sz40(Boolean.valueOf(obj != null));
                                    btsVar.o0(Q2);
                                }
                                final sz40 sz40Var = (sz40) Q2;
                                boolean e2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar.e(obj))) | btsVar.e(sz40Var);
                                Object Q3 = btsVar.Q();
                                if (e2 || Q3 == o430Var) {
                                    Q3 = new b700(11, obj, oz40Var, sz40Var);
                                    btsVar.o0(Q3);
                                }
                                zpn.i((sls) Q3, btsVar);
                                final int i9 = i3;
                                ymoVar4 = f;
                                str2 = str3;
                                v2oVar3 = e;
                                g.c(sz40Var, f530Var4, v2oVar3, ymoVar4, str2, wwg.S(1282247544, true, new zls() { // from class: com.yandex.go.summary.ui.compose.common.animation.d
                                    @Override // defpackage.zls
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        mg2 mg2Var = (mg2) obj2;
                                        fid fidVar2 = (fid) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        if ((intValue & 6) == 0) {
                                            intValue |= (intValue & 8) == 0 ? ((bts) fidVar2).k(mg2Var) : fidVar2.e(mg2Var) ? 4 : 2;
                                        }
                                        bts btsVar2 = (bts) fidVar2;
                                        if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                            oz40 oz40Var2 = oz40.this;
                                            Object value = oz40Var2.getValue();
                                            if (value == null) {
                                                btsVar2.e0(-2513746);
                                                btsVar2.t(false);
                                            } else {
                                                btsVar2.e0(-2513745);
                                                bmsVar.invoke(mg2Var, value, btsVar2, Integer.valueOf((intValue & 14) | ((i9 & 8) << 3)));
                                                btsVar2.t(false);
                                            }
                                            sz40 sz40Var2 = sz40Var;
                                            Boolean valueOf = Boolean.valueOf(sz40Var2.a());
                                            Object obj5 = obj;
                                            boolean e3 = btsVar2.e(obj5) | btsVar2.e(sz40Var2);
                                            Object Q4 = btsVar2.Q();
                                            if (e3 || Q4 == did.a) {
                                                Q4 = new NullableAnimatedVisibilityKt$NullableAnimatedVisibility$3$2$1(obj5, sz40Var2, oz40Var2, null);
                                                btsVar2.o0(Q4);
                                            }
                                            zpn.f(obj5, valueOf, (wls) Q4, btsVar2);
                                        } else {
                                            btsVar2.Y();
                                        }
                                        return zy11.a;
                                    }
                                }, btsVar), btsVar, 196608 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9), 0);
                                btsVar.t(false);
                            }
                            f530Var3 = f530Var4;
                            v2oVar2 = v2oVar3;
                            ymoVar3 = ymoVar4;
                        } else {
                            btsVar.Y();
                            v2oVar2 = v2oVar;
                            f530Var3 = f530Var2;
                            ymoVar3 = ymoVar2;
                        }
                        String str4 = str2;
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new tq0(obj, f530Var3, v2oVar2, ymoVar3, str4, bmsVar, i, i2);
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((i & ImageMetadata.EDGE_MODE) == 0) {
                    }
                    if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    String str42 = str2;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                ymoVar2 = ymoVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i & ImageMetadata.EDGE_MODE) == 0) {
                }
                if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                }
                String str422 = str2;
                v = btsVar.v();
                if (v != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            ymoVar2 = ymoVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i & ImageMetadata.EDGE_MODE) == 0) {
            }
            if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            }
            String str4222 = str2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        ymoVar2 = ymoVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
        }
        String str42222 = str2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final ArrayList b(p011 p011Var) {
        List<w011> list = p011Var.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (w011 w011Var : list) {
            String str = w011Var.a;
            TransportVerticalAnalytics$TransportCardStatus d = d(p011Var);
            r011 r011Var = w011Var.c;
            arrayList.add(new lb11(str, d, r011Var != null ? new kb11(r011Var.a, r011Var.b, r011Var.c) : null));
        }
        return arrayList;
    }

    public static final kb11 c(p011 p011Var) {
        r011 r011Var = p011Var.c;
        if (r011Var != null) {
            return new kb11(r011Var.a, r011Var.b, r011Var.c);
        }
        return null;
    }

    public static final TransportVerticalAnalytics$TransportCardStatus d(p011 p011Var) {
        TransportCardStatus transportCardStatus = p011Var.b;
        int i = transportCardStatus == null ? -1 : q011.a[transportCardStatus.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return TransportVerticalAnalytics$TransportCardStatus.Active;
        }
        if (i == 2) {
            return TransportVerticalAnalytics$TransportCardStatus.Blocked;
        }
        if (i == 3) {
            return TransportVerticalAnalytics$TransportCardStatus.Advertisement;
        }
        w511.b();
        return null;
    }

    public static final saf e(PaymentMethodSheetItemDto paymentMethodSheetItemDto, boolean z) {
        String paymentMethodId = paymentMethodSheetItemDto.getPaymentMethodId();
        String clientSelectionId = paymentMethodSheetItemDto.getClientSelectionId();
        String paymentMethodType = paymentMethodSheetItemDto.getPaymentMethodType();
        ColoredTextEntity a = aic.a(paymentMethodSheetItemDto.getTitle(), ung0.ybColor_textIcon_primary);
        ColoredTextDto description = paymentMethodSheetItemDto.getDescription();
        ColoredTextEntity a2 = description != null ? aic.a(description, ung0.ybColor_textIcon_secondary) : null;
        ColoredTextDto headerDescription = paymentMethodSheetItemDto.getHeaderDescription();
        ColoredTextEntity a3 = headerDescription != null ? aic.a(headerDescription, ung0.ybColor_textIcon_primary) : null;
        Themes<String> image = paymentMethodSheetItemDto.getImage();
        rbv c = fob1.c(image != null ? image.getLight() : null, image != null ? image.getDark() : null, new yce(z, 1));
        AftInfo aftInfo = paymentMethodSheetItemDto.getAftInfo();
        qaf qafVar = aftInfo != null ? new qaf(aftInfo.getTrustId()) : null;
        WalletInfo walletInfo = paymentMethodSheetItemDto.getWalletInfo();
        return new saf(paymentMethodId, clientSelectionId, paymentMethodType, a, a2, a3, c, qafVar, walletInfo != null ? new raf(walletInfo.getWalletCardType()) : null);
    }
}
