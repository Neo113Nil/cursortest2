package defpackage;

import android.view.View;
import androidx.compose.animation.m;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.yandex.go.compose.ComposeContentKt$ContentImpl$scope$1$1$action$1;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.plus.text.PlusNewSize;
import com.yandex.go.design.compose.plus.text.PlusNewType;
import com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.trains.schedule.h;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.tollroad.compose.ui.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class q8d implements bms {
    public final /* synthetic */ int a;

    public /* synthetic */ q8d(int i) {
        this.a = i;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        kbe0 kbe0Var = (kbe0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        lad ladVar = lad.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(kbe0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(i & 1, (i & 147) != 146);
        Object obj5 = zy11.a;
        if (!V) {
            btsVar.Y();
            return obj5;
        }
        fva0 a = f4z.a();
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        boolean k = btsVar.k(view);
        Object Q = btsVar.Q();
        Object obj6 = did.a;
        if (k || Q == obj6) {
            View rootView = view.getRootView();
            Object tag = rootView.getTag(t9h0.metricsStateHolder);
            if (tag == null) {
                tag = new xva0();
                rootView.setTag(t9h0.metricsStateHolder, tag);
            }
            Q = (xva0) tag;
            btsVar.o0(Q);
        }
        xva0 xva0Var = (xva0) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj6) {
            fva0.f(a, "PorchNumberInputPaneV2Compose", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("PorchNumberInputPaneV2Compose");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        g1a1.d(kbe0Var, null, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        yeg0 yeg0Var = (yeg0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        qad qadVar = qad.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(yeg0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            a.e(yeg0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        tdj0 tdj0Var = (tdj0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        uad uadVar = uad.a;
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(tdj0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            f530 m = ljs0.m(c530.a, 24.0f);
            boolean k = btsVar.k(tdj0Var.c);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new hfv(tdj0Var.c);
                btsVar.o0(Q);
            }
            v0b1.a(tdj0Var.a, m, null, null, wwg.S(992344074, true, new i9a(22, tdj0Var, m), btsVar), (hfv) Q, null, null, 0.0f, 0, btsVar, 24624, 972);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        ahj0 ahj0Var = (ahj0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        wad wadVar = wad.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(ahj0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(i & 1, (i & 147) != 146);
        Object obj5 = zy11.a;
        if (!V) {
            btsVar.Y();
            return obj5;
        }
        fva0 a = f4z.a();
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        boolean k = btsVar.k(view);
        Object Q = btsVar.Q();
        Object obj6 = did.a;
        if (k || Q == obj6) {
            View rootView = view.getRootView();
            Object tag = rootView.getTag(t9h0.metricsStateHolder);
            if (tag == null) {
                tag = new xva0();
                rootView.setTag(t9h0.metricsStateHolder, tag);
            }
            Q = (xva0) tag;
            btsVar.o0(Q);
        }
        xva0 xva0Var = (xva0) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj6) {
            fva0.f(a, "SpecialNeedsScreenCommentCompose", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("SpecialNeedsScreenCommentCompose");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        com.yandex.go.summary.requirements.list.requirementgroup.commentmodal.a.a(ahj0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        z7k0 z7k0Var = (z7k0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        yad yadVar = yad.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(z7k0Var) : fidVar.e(z7k0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            epa1.b(z7k0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        luk0 luk0Var = (luk0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        abd abdVar = abd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(luk0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(i & 1, (i & 147) != 146);
        Object obj5 = zy11.a;
        if (!V) {
            btsVar.Y();
            return obj5;
        }
        fva0 a = f4z.a();
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        boolean k = btsVar.k(view);
        Object Q = btsVar.Q();
        Object obj6 = did.a;
        if (k || Q == obj6) {
            View rootView = view.getRootView();
            Object tag = rootView.getTag(t9h0.metricsStateHolder);
            if (tag == null) {
                tag = new xva0();
                rootView.setTag(t9h0.metricsStateHolder, tag);
            }
            Q = (xva0) tag;
            btsVar.o0(Q);
        }
        xva0 xva0Var = (xva0) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj6) {
            fva0.f(a, "RoadsScreenCompose", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("RoadsScreenCompose");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        c.a(luk0Var, null, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        zdl0 zdl0Var = (zdl0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        dbd dbdVar = dbd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(zdl0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(i & 1, (i & 147) != 146);
        Object obj5 = zy11.a;
        if (!V) {
            btsVar.Y();
            return obj5;
        }
        fva0 a = f4z.a();
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        boolean k = btsVar.k(view);
        Object Q = btsVar.Q();
        Object obj6 = did.a;
        if (k || Q == obj6) {
            View rootView = view.getRootView();
            Object tag = rootView.getTag(t9h0.metricsStateHolder);
            if (tag == null) {
                tag = new xva0();
                rootView.setTag(t9h0.metricsStateHolder, tag);
            }
            Q = (xva0) tag;
            btsVar.o0(Q);
        }
        xva0 xva0Var = (xva0) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj6) {
            fva0.f(a, "RouteStopsV2Router", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("RouteStopsV2Router");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        com.yandex.go.routestops.v2.ui.c.d(zdl0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        boolean z = (i & 14) == 4 || ((i & 8) != 0 && btsVar.e(xfdVar));
        Object Q3 = btsVar.Q();
        if (z || Q3 == obj6) {
            Q3 = new zq5(xfdVar, 3);
            btsVar.o0(Q3);
        }
        gya1.d(false, (sls) Q3, btsVar, 0, 1);
        return obj5;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        iwl0 iwl0Var = (iwl0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        fbd fbdVar = fbd.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(iwl0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            nwa1.f(iwl0Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zy11 zy11Var;
        int i12;
        int i13;
        int i14;
        int i15 = this.a;
        int i16 = 7;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        int i17 = 2;
        zy11 zy11Var2 = zy11.a;
        boolean z = true;
        boolean z2 = true;
        switch (i15) {
            case 0:
                xfd xfdVar = (xfd) obj;
                xxo xxoVar = (xxo) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                r8d r8dVar = r8d.a;
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((bts) fidVar).k(xxoVar) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    iha1.e(xxoVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                xfd xfdVar2 = (xfd) obj;
                ea30 ea30Var = (ea30) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                v8d v8dVar = v8d.a;
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? ((bts) fidVar2).k(xfdVar2) : fidVar2.e(xfdVar2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= ((bts) fidVar2).k(ea30Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    eob1.a(ea30Var, ((bgd) xfdVar2).a, btsVar2, (i2 >> 3) & 14);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 2:
                int intValue3 = ((Integer) obj4).intValue();
                z8d z8dVar = z8d.a;
                pob1.c((nl30) obj2, ((bgd) ((xfd) obj)).a, (fid) obj3, (intValue3 >> 3) & 14);
                return zy11Var2;
            case 3:
                int intValue4 = ((Integer) obj4).intValue();
                a9d a9dVar = a9d.a;
                rob1.a((nl30) obj, (tls) obj2, (fid) obj3, intValue4 & HProv.PP_DELETE_SAVED_PASSWD);
                return zy11Var2;
            case 4:
                xfd xfdVar3 = (xfd) obj;
                fid fidVar3 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                c9d c9dVar = c9d.a;
                if ((intValue5 & 6) == 0) {
                    intValue5 |= (intValue5 & 8) == 0 ? ((bts) fidVar3).k(xfdVar3) : fidVar3.e(xfdVar3) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue5 & 1, (intValue5 & HProv.PP_FAST_CODE) != 130)) {
                    tob1.a(((bgd) xfdVar3).a, btsVar3, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 5:
                xfd xfdVar4 = (xfd) obj;
                xp30 xp30Var = (xp30) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                d9d d9dVar = d9d.a;
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | ((intValue6 & 8) == 0 ? ((bts) fidVar4).k(xfdVar4) : fidVar4.e(xfdVar4) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((bts) fidVar4).k(xp30Var) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(i3 & 1, (i3 & 147) != 146)) {
                    uob1.b(xp30Var, ((bgd) xfdVar4).a, btsVar4, (i3 >> 3) & 14);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 6:
                xfd xfdVar5 = (xfd) obj;
                w2l0 w2l0Var = (w2l0) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                g9d g9dVar = g9d.a;
                if ((intValue7 & 6) == 0) {
                    i4 = intValue7 | ((intValue7 & 8) == 0 ? ((bts) fidVar5).k(xfdVar5) : fidVar5.e(xfdVar5) ? 4 : 2);
                } else {
                    i4 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i4 |= ((bts) fidVar5).k(w2l0Var) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(i4 & 1, (i4 & 147) != 146)) {
                    ut91.h(w2l0Var, ((bgd) xfdVar5).a, btsVar5, (i4 >> 3) & 14);
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 7:
                xfd xfdVar6 = (xfd) obj;
                f440 f440Var = (f440) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                j9d j9dVar = j9d.a;
                if ((intValue8 & 6) == 0) {
                    i5 = ((intValue8 & 8) == 0 ? ((bts) fidVar6).k(xfdVar6) : fidVar6.e(xfdVar6) ? 4 : 2) | intValue8;
                } else {
                    i5 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i5 |= (intValue8 & 64) == 0 ? ((bts) fidVar6).k(f440Var) : fidVar6.e(f440Var) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(i5 & 1, (i5 & 147) != 146)) {
                    int i18 = i5 & 14;
                    boolean z3 = i18 == 4 || ((i5 & 8) != 0 && btsVar6.e(xfdVar6));
                    Object Q = btsVar6.Q();
                    if (z3 || Q == o430Var) {
                        Q = new zq5(xfdVar6, z ? 1 : 0);
                        btsVar6.o0(Q);
                    }
                    sls slsVar = (sls) Q;
                    boolean z4 = i18 == 4 || ((i5 & 8) != 0 && btsVar6.e(xfdVar6));
                    Object Q2 = btsVar6.Q();
                    if (z4 || Q2 == o430Var) {
                        Q2 = new zq5(xfdVar6, i17);
                        btsVar6.o0(Q2);
                    }
                    wg6 a = b.a(false, 0.0f, null, false, slsVar, (sls) Q2, null, null, btsVar6, 48, 0, 6653);
                    Object Q3 = btsVar6.Q();
                    if (Q3 == o430Var) {
                        Q3 = f.f(0.0f);
                        btsVar6.o0(Q3);
                    }
                    tx40 tx40Var = (tx40) Q3;
                    f530 a2 = d.a(tra1.b(c530Var, 1.0f - tx40Var.getFloatValue()), new of6(a, r15 ? 1 : 0));
                    boolean z5 = i18 == 4 || ((i5 & 8) != 0 && btsVar6.e(xfdVar6));
                    Object Q4 = btsVar6.Q();
                    if (z5 || Q4 == o430Var) {
                        Q4 = new x1d(xfdVar6, z2 ? 1 : 0);
                        btsVar6.o0(Q4);
                    }
                    qe61.a(a2, (tls) Q4, btsVar6, 0, 0);
                    ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar6).a;
                    Object Q5 = btsVar6.Q();
                    if (Q5 == o430Var) {
                        Q5 = new aq5(tx40Var, 3);
                        btsVar6.o0(Q5);
                    }
                    ru.yandex.taxi.masstransit.stop.ui.modal.a.a(null, a, f440Var, (tls) Q5, composeContentKt$ContentImpl$scope$1$1$action$1, btsVar6, 3072 | ((i5 << 3) & 896));
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 8:
                xfd xfdVar7 = (xfd) obj;
                x840 x840Var = (x840) obj2;
                fid fidVar7 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                p9d p9dVar = p9d.a;
                if ((intValue9 & 6) == 0) {
                    i6 = intValue9 | ((intValue9 & 8) == 0 ? ((bts) fidVar7).k(xfdVar7) : fidVar7.e(xfdVar7) ? 4 : 2);
                } else {
                    i6 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i6 |= ((bts) fidVar7).k(x840Var) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(i6 & 1, (i6 & 147) != 146)) {
                    ppb1.c(x840Var, ((bgd) xfdVar7).a, btsVar7, (i6 >> 3) & 14);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 9:
                xfd xfdVar8 = (xfd) obj;
                x940 x940Var = (x940) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                q9d q9dVar = q9d.a;
                if ((intValue10 & 6) == 0) {
                    i7 = intValue10 | ((intValue10 & 8) == 0 ? ((bts) fidVar8).k(xfdVar8) : fidVar8.e(xfdVar8) ? 4 : 2);
                } else {
                    i7 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i7 |= ((bts) fidVar8).k(x940Var) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(i7 & 1, (i7 & 147) != 146)) {
                    rpb1.b(x940Var, ((bgd) xfdVar8).a, btsVar8, (i7 >> 3) & 14);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
            case 10:
                xfd xfdVar9 = (xfd) obj;
                he40 he40Var = (he40) obj2;
                fid fidVar9 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                r9d r9dVar = r9d.a;
                if ((intValue11 & 6) == 0) {
                    i8 = intValue11 | ((intValue11 & 8) == 0 ? ((bts) fidVar9).k(xfdVar9) : fidVar9.e(xfdVar9) ? 4 : 2);
                } else {
                    i8 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i8 |= ((bts) fidVar9).k(he40Var) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(i8 & 1, (i8 & 147) != 146)) {
                    spb1.e(he40Var, ((bgd) xfdVar9).a, btsVar9, (i8 >> 3) & 14);
                } else {
                    btsVar9.Y();
                }
                return zy11Var2;
            case 11:
                xfd xfdVar10 = (xfd) obj;
                tb01 tb01Var = (tb01) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                s9d s9dVar = s9d.a;
                if ((intValue12 & 6) == 0) {
                    i9 = intValue12 | ((intValue12 & 8) == 0 ? ((bts) fidVar10).k(xfdVar10) : fidVar10.e(xfdVar10) ? 4 : 2);
                } else {
                    i9 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i9 |= ((bts) fidVar10).k(tb01Var) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(i9 & 1, (i9 & 147) != 146)) {
                    h.c(tb01Var, ((bgd) xfdVar10).a, btsVar10, (i9 >> 3) & 14);
                } else {
                    btsVar10.Y();
                }
                return zy11Var2;
            case 12:
                xfd xfdVar11 = (xfd) obj;
                ci40 ci40Var = (ci40) obj2;
                fid fidVar11 = (fid) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                t9d t9dVar = t9d.a;
                if ((intValue13 & 6) == 0) {
                    i10 = intValue13 | ((intValue13 & 8) == 0 ? ((bts) fidVar11).k(xfdVar11) : fidVar11.e(xfdVar11) ? 4 : 2);
                } else {
                    i10 = intValue13;
                }
                if ((intValue13 & 48) == 0) {
                    i10 |= ((bts) fidVar11).k(ci40Var) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(i10 & 1, (i10 & 147) != 146)) {
                    vpb1.b(ci40Var, ((bgd) xfdVar11).a, btsVar11, (i10 >> 3) & 14);
                } else {
                    btsVar11.Y();
                }
                return zy11Var2;
            case 13:
                xfd xfdVar12 = (xfd) obj;
                si40 si40Var = (si40) obj2;
                fid fidVar12 = (fid) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                u9d u9dVar = u9d.a;
                if ((intValue14 & 6) == 0) {
                    i11 = intValue14 | ((intValue14 & 8) == 0 ? ((bts) fidVar12).k(xfdVar12) : fidVar12.e(xfdVar12) ? 4 : 2);
                } else {
                    i11 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i11 |= ((bts) fidVar12).k(si40Var) ? 32 : 16;
                }
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(i11 & 1, (i11 & 147) != 146)) {
                    wpb1.c(si40Var, ((bgd) xfdVar12).a, btsVar12, (i11 >> 3) & 14);
                } else {
                    btsVar12.Y();
                }
                return zy11Var2;
            case 14:
                mco mcoVar = (mco) obj2;
                fid fidVar13 = (fid) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                x9d x9dVar = x9d.a;
                if ((intValue15 & 48) == 0) {
                    intValue15 |= ((bts) fidVar13).k(mcoVar) ? 32 : 16;
                }
                bts btsVar13 = (bts) fidVar13;
                if (!btsVar13.V(intValue15 & 1, (intValue15 & 145) != 144)) {
                    btsVar13.Y();
                    return zy11Var2;
                }
                fwi fwiVar = (fwi) btsVar13.m(j.h);
                Object Q6 = btsVar13.Q();
                Object obj5 = Q6;
                if (Q6 == o430Var) {
                    byk0 c = cyk0.c(4.0f);
                    btsVar13.o0(c);
                    obj5 = c;
                }
                byk0 byk0Var = (byk0) obj5;
                boolean k = btsVar13.k(fwiVar);
                Object Q7 = btsVar13.Q();
                if (k || Q7 == o430Var) {
                    float w0 = fwiVar.w0(4.0f);
                    zy11Var = zy11Var2;
                    vre vreVar = new vre((Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    btsVar13.o0(vreVar);
                    Q7 = vreVar;
                } else {
                    zy11Var = zy11Var2;
                }
                long j = ((vre) Q7).a;
                m3u0 a3 = m.a(tje.n(mcoVar.b, btsVar13), null, null, btsVar13, 0, 14);
                m3u0 a4 = m.a(tje.n(mcoVar.c, btsVar13), null, null, btsVar13, 0, 14);
                f530 b = hbb1.b(an91.o(c530.a, 0.0f, 0.0f, 0.0f, mcoVar.d, 7), dbb1.b(btsVar13), byk0Var, false, 12);
                boolean k2 = btsVar13.k(a4) | btsVar13.d(j);
                Object Q8 = btsVar13.Q();
                Object obj6 = Q8;
                if (k2 || Q8 == o430Var) {
                    v9d v9dVar = new v9d(a4, j, r15 ? 1 : 0);
                    btsVar13.o0(v9dVar);
                    obj6 = v9dVar;
                }
                f530 l = an91.l(bb1.g(b, (tls) obj6), 4.0f, 1.0f);
                CharSequence charSequence = mcoVar.a;
                ety0 ety0Var = xya1.e(btsVar13).i.b;
                boolean k3 = btsVar13.k(a3);
                Object Q9 = btsVar13.Q();
                Object obj7 = Q9;
                if (k3 || Q9 == o430Var) {
                    w9d w9dVar = new w9d(a3, 1);
                    btsVar13.o0(w9dVar);
                    obj7 = w9dVar;
                }
                qgy.a(charSequence, (xfc) obj7, null, l, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, ety0Var, btsVar13, 0, 0, 12148);
                return zy11Var;
            case 15:
                w2v0 w2v0Var = (w2v0) obj2;
                fid fidVar14 = (fid) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                x9d x9dVar2 = x9d.a;
                if ((intValue16 & 48) == 0) {
                    intValue16 |= ((bts) fidVar14).k(w2v0Var) ? 32 : 16;
                }
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue16 & 1, (intValue16 & 145) != 144)) {
                    m3u0 a5 = m.a(tje.n(w2v0Var.b, btsVar14), null, null, btsVar14, 0, 14);
                    f530 d = ooc.d(c530Var, null, 3);
                    String str = w2v0Var.a;
                    ety0 ety0Var2 = xya1.e(btsVar14).h.a;
                    boolean k4 = btsVar14.k(a5);
                    Object Q10 = btsVar14.Q();
                    Object obj8 = Q10;
                    if (k4 || Q10 == o430Var) {
                        w9d w9dVar2 = new w9d(a5, 2);
                        btsVar14.o0(w9dVar2);
                        obj8 = w9dVar2;
                    }
                    jeb1.e(str, (xfc) obj8, d, 0L, 0L, null, 0L, 0, false, 0, 0, ety0Var2, btsVar14, 0, 16376);
                } else {
                    btsVar14.Y();
                }
                return zy11Var2;
            case 16:
                v49 v49Var = (v49) obj2;
                fid fidVar15 = (fid) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                x9d x9dVar3 = x9d.a;
                if ((intValue17 & 48) == 0) {
                    intValue17 |= ((bts) fidVar15).k(v49Var) ? 32 : 16;
                }
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue17 & 1, (intValue17 & 145) != 144)) {
                    m3u0 b2 = androidx.compose.animation.core.b.b(v49Var.b, null, null, null, btsVar15, 0, 30);
                    boolean k5 = btsVar15.k(b2);
                    Object Q11 = btsVar15.Q();
                    Object obj9 = Q11;
                    if (k5 || Q11 == o430Var) {
                        xo1 xo1Var = new xo1(b2, i16);
                        btsVar15.o0(xo1Var);
                        obj9 = xo1Var;
                    }
                    mq91.a(v49Var.a, ooc.c(d.a(c530Var, (tls) obj9)), PlusNewSize.Caption1, PlusNewType.Gradient, false, btsVar15, 3456, 16);
                } else {
                    btsVar15.Y();
                }
                return zy11Var2;
            case 17:
                xq80 xq80Var = (xq80) obj2;
                fid fidVar16 = (fid) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                x9d x9dVar4 = x9d.a;
                if ((intValue18 & 48) == 0) {
                    intValue18 |= ((bts) fidVar16).k(xq80Var) ? 32 : 16;
                }
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue18 & 1, (intValue18 & 145) != 144)) {
                    m3u0 b3 = androidx.compose.animation.core.b.b(xq80Var.c, null, null, null, btsVar16, 0, 30);
                    m3u0 a6 = m.a(tje.n(xq80Var.b, btsVar16), null, null, btsVar16, 0, 14);
                    boolean k6 = btsVar16.k(b3);
                    Object Q12 = btsVar16.Q();
                    int i19 = 6;
                    Object obj10 = Q12;
                    if (k6 || Q12 == o430Var) {
                        xo1 xo1Var2 = new xo1(b3, i19);
                        btsVar16.o0(xo1Var2);
                        obj10 = xo1Var2;
                    }
                    f530 c2 = ooc.c(d.a(c530Var, (tls) obj10));
                    CharSequence charSequence2 = xq80Var.a;
                    ety0 ety0Var3 = xya1.e(btsVar16).h.a;
                    boolean k7 = btsVar16.k(a6);
                    Object Q13 = btsVar16.Q();
                    Object obj11 = Q13;
                    if (k7 || Q13 == o430Var) {
                        w9d w9dVar3 = new w9d(a6, 0);
                        btsVar16.o0(w9dVar3);
                        obj11 = w9dVar3;
                    }
                    qgy.a(charSequence2, (xfc) obj11, null, c2, 0L, 0L, new sjy0(6), 0L, 0, 0, 0, ety0Var3, btsVar16, 0, 0, 12148);
                } else {
                    btsVar16.Y();
                }
                return zy11Var2;
            case 18:
                fid fidVar17 = (fid) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                ead eadVar = ead.a;
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue19 & 1, (intValue19 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    cg91.a(com.yandex.go.design.compose.modal.utils.a.a(false, null, btsVar17, 0, 7), btsVar17, 0);
                } else {
                    btsVar17.Y();
                }
                return zy11Var2;
            case 19:
                xfd xfdVar13 = (xfd) obj;
                uja0 uja0Var = (uja0) obj2;
                fid fidVar18 = (fid) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                fad fadVar = fad.a;
                if ((intValue20 & 6) == 0) {
                    i12 = intValue20 | ((intValue20 & 8) == 0 ? ((bts) fidVar18).k(xfdVar13) : fidVar18.e(xfdVar13) ? 4 : 2);
                } else {
                    i12 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i12 |= (intValue20 & 64) == 0 ? ((bts) fidVar18).k(uja0Var) : fidVar18.e(uja0Var) ? 32 : 16;
                }
                bts btsVar18 = (bts) fidVar18;
                if (!btsVar18.V(i12 & 1, (i12 & 147) != 146)) {
                    btsVar18.Y();
                } else if (uja0Var instanceof sja0) {
                    btsVar18.e0(-1424751811);
                    lg91.a((sja0) uja0Var, ((bgd) xfdVar13).a, btsVar18, (i12 >> 3) & 14);
                    btsVar18.t(false);
                } else {
                    btsVar18.e0(-1424690307);
                    btsVar18.t(false);
                }
                return zy11Var2;
            case 20:
                xfd xfdVar14 = (xfd) obj;
                v4b0 v4b0Var = (v4b0) obj2;
                fid fidVar19 = (fid) obj3;
                int intValue21 = ((Integer) obj4).intValue();
                had hadVar = had.a;
                if ((intValue21 & 6) == 0) {
                    i13 = intValue21 | ((intValue21 & 8) == 0 ? ((bts) fidVar19).k(xfdVar14) : fidVar19.e(xfdVar14) ? 4 : 2);
                } else {
                    i13 = intValue21;
                }
                if ((intValue21 & 48) == 0) {
                    i13 |= ((bts) fidVar19).k(v4b0Var) ? 32 : 16;
                }
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(i13 & 1, (i13 & 147) != 146)) {
                    com.yandex.go.personal_goals_v2.ui.a.c(v4b0Var, ((bgd) xfdVar14).a, btsVar19, (i13 >> 3) & 14);
                } else {
                    btsVar19.Y();
                }
                return zy11Var2;
            case 21:
                return b(obj, obj2, obj3, obj4);
            case 22:
                return d(obj, obj2, obj3, obj4);
            case 23:
                return e(obj, obj2, obj3, obj4);
            case 24:
                return f(obj, obj2, obj3, obj4);
            case 25:
                return g(obj, obj2, obj3, obj4);
            case 26:
                return i(obj, obj2, obj3, obj4);
            case 27:
                return j(obj, obj2, obj3, obj4);
            case 28:
                return k(obj, obj2, obj3, obj4);
            default:
                xfd xfdVar15 = (xfd) obj;
                eyl0 eyl0Var = (eyl0) obj2;
                fid fidVar20 = (fid) obj3;
                int intValue22 = ((Integer) obj4).intValue();
                gbd gbdVar = gbd.a;
                if ((intValue22 & 6) == 0) {
                    i14 = intValue22 | ((intValue22 & 8) == 0 ? ((bts) fidVar20).k(xfdVar15) : fidVar20.e(xfdVar15) ? 4 : 2);
                } else {
                    i14 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i14 |= ((bts) fidVar20).k(eyl0Var) ? 32 : 16;
                }
                bts btsVar20 = (bts) fidVar20;
                if (btsVar20.V(i14 & 1, (i14 & 147) != 146)) {
                    fu91.c(eyl0Var, ((bgd) xfdVar15).a, btsVar20, (i14 >> 3) & 14);
                } else {
                    btsVar20.Y();
                }
                return zy11Var2;
        }
    }
}
