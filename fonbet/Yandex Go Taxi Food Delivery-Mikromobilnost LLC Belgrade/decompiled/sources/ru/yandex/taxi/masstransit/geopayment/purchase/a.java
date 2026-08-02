package ru.yandex.taxi.masstransit.geopayment.purchase;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.bts;
import defpackage.c530;
import defpackage.dhj0;
import defpackage.did;
import defpackage.fid;
import defpackage.fu30;
import defpackage.fzv;
import defpackage.gya1;
import defpackage.hu30;
import defpackage.iu30;
import defpackage.jk30;
import defpackage.kdc;
import defpackage.ku30;
import defpackage.l690;
import defpackage.ljs0;
import defpackage.na01;
import defpackage.q07;
import defpackage.q791;
import defpackage.qab1;
import defpackage.rr30;
import defpackage.ry2;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tls;
import defpackage.uy2;
import defpackage.wg30;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xob1;
import defpackage.ydb1;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.geopayment.purchase.a;

/* loaded from: classes6.dex */
public abstract class a {
    public static final l690 a = an91.d(0.0f, 4.0f, 0.0f, 4.0f, 5);
    public static final float b = 40.0f;
    public static final float c = 24.0f;
    public static final float d = 14.0f;
    public static final float e = 16.0f;

    public static final void a(final ku30 ku30Var, final tls tlsVar, final sls slsVar, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        aii0 v;
        wls wlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-107473938);
        int i3 = i & 6;
        c530 c530Var = c530.a;
        if (i3 == 0) {
            i2 = (btsVar2.k(c530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(ku30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(slsVar) ? 2048 : 1024;
        }
        int i4 = i2;
        if (!btsVar2.V(i4 & 1, (i4 & 1171) != 1170)) {
            btsVar = btsVar2;
            btsVar.Y();
        } else {
            if (ku30Var.b.isEmpty()) {
                v = btsVar2.v();
                if (v != null) {
                    final int i5 = 0;
                    wlsVar = new wls() { // from class: gu30
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            zy11 zy11Var = zy11.a;
                            int i7 = i;
                            sls slsVar2 = slsVar;
                            tls tlsVar2 = tlsVar;
                            ku30 ku30Var2 = ku30Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    a.a(ku30Var2, tlsVar2, slsVar2, fidVar2, vng.O(i7 | 1));
                                    break;
                                default:
                                    a.a(ku30Var2, tlsVar2, slsVar2, fidVar2, vng.O(i7 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            boolean z = ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new MtPurchaseOptionsBottomSheetKt$MtPurchaseOptionsBottomSheet$2$1(tlsVar, ku30Var, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            gya1.d(false, slsVar, btsVar2, (i4 >> 6) & 112, 1);
            wg6 a2 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 48, 48, 6141);
            c.a(c530Var, a2, qab1.c(a2, null, slsVar, btsVar2, (i4 >> 3) & 896, 2), false, false, null, null, null, wwg.S(-171291359, true, new hu30(tlsVar, slsVar, 0), btsVar2), null, null, wwg.S(787091598, true, new dhj0(9, ku30Var, tlsVar, slsVar), btsVar2), btsVar2, (i4 & 14) | 100663296, 48, 1784);
            btsVar = btsVar2;
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            wlsVar = new wls() { // from class: gu30
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    zy11 zy11Var = zy11.a;
                    int i7 = i;
                    sls slsVar2 = slsVar;
                    tls tlsVar2 = tlsVar;
                    ku30 ku30Var2 = ku30Var;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            a.a(ku30Var2, tlsVar2, slsVar2, fidVar2, vng.O(i7 | 1));
                            break;
                        default:
                            a.a(ku30Var2, tlsVar2, slsVar2, fidVar2, vng.O(i7 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(fu30 fu30Var, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        int i2;
        long d2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(899850998);
        int i3 = (btsVar2.k(fu30Var) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        if (btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            boolean z = ((ry2) btsVar2.m(uy2.a)).b;
            rr30 rr30Var = fu30Var.e;
            if (rr30Var != null) {
                d2 = rzo.d(z ? rr30Var.a : rr30Var.b);
            } else {
                kdc kdcVar = fu30Var.d;
                if (kdcVar == null) {
                    kdcVar = xob1.a(fu30Var.c);
                }
                d2 = rzo.d(s8o.m(kdcVar, context));
            }
            long j = d2;
            btsVar = btsVar2;
            i2 = 0;
            ydb1.a(q791.b(ljs0.c(c530.a, 1.0f), null, null, false, null, new awk0(0), slsVar, 12), wwg.S(286901132, true, new q07(j, fu30Var, 3), btsVar2), wwg.S(-1528193593, true, new wg30(4, fu30Var), btsVar2), null, na01.a, null, SlotSize.L, false, btsVar, 1573296, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar = btsVar2;
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(fu30Var, slsVar, i, i2);
        }
    }

    public static final void c(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1020771744);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ydb1.a(an91.j(c530.a, a), null, wwg.S(2068275249, true, new jk30(str, 3), btsVar), null, null, null, SlotSize.L, false, btsVar, 1573254, 186);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 8);
        }
    }
}
