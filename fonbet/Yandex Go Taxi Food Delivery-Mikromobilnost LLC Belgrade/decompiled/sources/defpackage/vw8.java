package defpackage;

import android.view.View;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.rida.bids.ui.c;
import com.yandex.go.taxi.order.cancel.v3.ui.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes11.dex */
public final /* synthetic */ class vw8 implements bms {
    public final /* synthetic */ int a;

    public /* synthetic */ vw8(int i) {
        this.a = i;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        fv7 fv7Var = (fv7) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        z3d z3dVar = z3d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(fv7Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            jeb1.c(fv7Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        cz7 cz7Var = (cz7) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        b4d b4dVar = b4d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(cz7Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            a.b(cz7Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        m68 m68Var = (m68) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        f4d f4dVar = f4d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(m68Var) : fidVar.e(m68Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            dfb1.a(m68Var, ((bgd) xfdVar).a, btsVar, ((i >> 3) & 14) | 8);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        e88 e88Var = (e88) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        g4d g4dVar = g4d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(e88Var) : fidVar.e(e88Var) ? 32 : 16;
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
            fva0.f(a, "Payments.VerificationFailed", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("Payments.VerificationFailed");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        efb1.a(e88Var, ((bgd) xfdVar).a, btsVar, ((i >> 3) & 14) | 8);
        return obj5;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        vd9 vd9Var = (vd9) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        i4d i4dVar = i4d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(vd9Var) : fidVar.e(vd9Var) ? 32 : 16;
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
            fva0.f(a, "Payments.ChangePaymentModal", PerformanceAnalytics$Type.Inflate, 0L, 4);
            yuf0 yuf0Var = xva0Var.a;
            if (yuf0Var != null) {
                yuf0Var.I("Payments.ChangePaymentModal");
                Q2 = obj5;
            } else {
                Q2 = null;
            }
            btsVar.o0(Q2);
        }
        ygb1.b(vd9Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        return obj5;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        an9 an9Var = (an9) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        j4d j4dVar = j4d.a;
        int i2 = 2;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(an9Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(i2, an9Var, xfdVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        it9 it9Var = (it9) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        p4d p4dVar = p4d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(it9Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(3, it9Var, xfdVar), btsVar), btsVar, 3456, 3);
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
        int i12;
        int i13;
        int i14;
        int i15 = this.a;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        zy11 zy11Var = null;
        int i16 = 4;
        zy11 zy11Var2 = zy11.a;
        switch (i15) {
            case 0:
                x2v0 x2v0Var = (x2v0) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= ((bts) fidVar).k(x2v0Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
                    jeb1.f(x2v0Var.a, c530.a, x2v0Var.b, 0L, 0L, null, new sjy0(3), 0L, 2, false, 2, 0, null, xya1.e(btsVar).h.a, btsVar, 805306368, 48, 13688);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                xfd xfdVar = (xfd) obj;
                z0 z0Var = (z0) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                t1d t1dVar = t1d.a;
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | ((intValue2 & 8) == 0 ? ((bts) fidVar2).k(xfdVar) : fidVar2.e(xfdVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((bts) fidVar2).k(z0Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i & 1, (i & 147) != 146)) {
                    com.yandex.go.requirements.comment.summary.ui.v3.ui.a.a(z0Var, ((bgd) xfdVar).a, btsVar2, (i >> 3) & 14);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 2:
                xfd xfdVar2 = (xfd) obj;
                e6 e6Var = (e6) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                v1d v1dVar = v1d.a;
                if ((intValue3 & 6) == 0) {
                    i2 = intValue3 | ((intValue3 & 8) == 0 ? ((bts) fidVar3).k(xfdVar2) : fidVar3.e(xfdVar2) ? 4 : 2);
                } else {
                    i2 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i2 |= ((bts) fidVar3).k(e6Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(i2 & 1, (i2 & 147) != 146)) {
                    fva0 a = f4z.a();
                    View view = (View) btsVar3.m(AndroidCompositionLocals_androidKt.f);
                    boolean k = btsVar3.k(view);
                    Object Q = btsVar3.Q();
                    Object obj5 = Q;
                    if (k || Q == o430Var) {
                        View rootView = view.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        xva0 xva0Var = (xva0) tag;
                        btsVar3.o0(xva0Var);
                        obj5 = xva0Var;
                    }
                    xva0 xva0Var2 = (xva0) obj5;
                    Object Q2 = btsVar3.Q();
                    if (Q2 == o430Var) {
                        fva0.f(a, "AboutScreenCompose", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var = xva0Var2.a;
                        if (yuf0Var != null) {
                            yuf0Var.I("AboutScreenCompose");
                            zy11Var = zy11Var2;
                        }
                        btsVar3.o0(zy11Var);
                        Q2 = zy11Var;
                    }
                    iha1.a(e6Var, ((bgd) xfdVar2).a, btsVar3, (i2 >> 3) & 14);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 3:
                xfd xfdVar3 = (xfd) obj;
                ge geVar = (ge) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                y1d y1dVar = y1d.a;
                if ((intValue4 & 6) == 0) {
                    i3 = intValue4 | ((intValue4 & 8) == 0 ? ((bts) fidVar4).k(xfdVar3) : fidVar4.e(xfdVar3) ? 4 : 2);
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i3 |= ((bts) fidVar4).k(geVar) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(i3 & 1, (i3 & 147) != 146)) {
                    fva0 a2 = f4z.a();
                    View view2 = (View) btsVar4.m(AndroidCompositionLocals_androidKt.f);
                    boolean k2 = btsVar4.k(view2);
                    Object Q3 = btsVar4.Q();
                    Object obj6 = Q3;
                    if (k2 || Q3 == o430Var) {
                        View rootView2 = view2.getRootView();
                        Object tag2 = rootView2.getTag(t9h0.metricsStateHolder);
                        if (tag2 == null) {
                            tag2 = new xva0();
                            rootView2.setTag(t9h0.metricsStateHolder, tag2);
                        }
                        xva0 xva0Var3 = (xva0) tag2;
                        btsVar4.o0(xva0Var3);
                        obj6 = xva0Var3;
                    }
                    xva0 xva0Var4 = (xva0) obj6;
                    Object Q4 = btsVar4.Q();
                    if (Q4 == o430Var) {
                        fva0.f(a2, "Payments.AcceptancePaymentFullscreen", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var2 = xva0Var4.a;
                        if (yuf0Var2 != null) {
                            yuf0Var2.I("Payments.AcceptancePaymentFullscreen");
                            zy11Var = zy11Var2;
                        }
                        btsVar4.o0(zy11Var);
                        Q4 = zy11Var;
                    }
                    if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !btsVar4.e(xfdVar3))) {
                        r13 = false;
                    }
                    Object Q5 = btsVar4.Q();
                    Object obj7 = Q5;
                    if (r13 || Q5 == o430Var) {
                        x1d x1dVar = new x1d(xfdVar3, r15 ? 1 : 0);
                        btsVar4.o0(x1dVar);
                        obj7 = x1dVar;
                    }
                    fia1.a(geVar, (tls) obj7, btsVar4, (i3 >> 3) & 14);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 4:
                xfd xfdVar4 = (xfd) obj;
                we weVar = (we) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                z1d z1dVar = z1d.a;
                if ((intValue5 & 6) == 0) {
                    i4 = intValue5 | ((intValue5 & 8) == 0 ? ((bts) fidVar5).k(xfdVar4) : fidVar5.e(xfdVar4) ? 4 : 2);
                } else {
                    i4 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i4 |= ((bts) fidVar5).k(weVar) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(i4 & 1, (i4 & 147) != 146)) {
                    fva0 a3 = f4z.a();
                    View view3 = (View) btsVar5.m(AndroidCompositionLocals_androidKt.f);
                    boolean k3 = btsVar5.k(view3);
                    Object Q6 = btsVar5.Q();
                    Object obj8 = Q6;
                    if (k3 || Q6 == o430Var) {
                        View rootView3 = view3.getRootView();
                        Object tag3 = rootView3.getTag(t9h0.metricsStateHolder);
                        if (tag3 == null) {
                            tag3 = new xva0();
                            rootView3.setTag(t9h0.metricsStateHolder, tag3);
                        }
                        xva0 xva0Var5 = (xva0) tag3;
                        btsVar5.o0(xva0Var5);
                        obj8 = xva0Var5;
                    }
                    xva0 xva0Var6 = (xva0) obj8;
                    Object Q7 = btsVar5.Q();
                    if (Q7 == o430Var) {
                        fva0.f(a3, "Payments.Acceptance.Notification", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var3 = xva0Var6.a;
                        if (yuf0Var3 != null) {
                            yuf0Var3.I("Payments.Acceptance.Notification");
                            zy11Var = zy11Var2;
                        }
                        btsVar5.o0(zy11Var);
                        Q7 = zy11Var;
                    }
                    gia1.a(weVar, ((bgd) xfdVar4).a, btsVar5, (i4 >> 3) & 14);
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 5:
                cj0 cj0Var = (cj0) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                d2d d2dVar = d2d.a;
                if ((intValue6 & 48) == 0) {
                    intValue6 |= ((bts) fidVar6).k(cj0Var) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 145) != 144)) {
                    fva0 a4 = f4z.a();
                    View view4 = (View) btsVar6.m(AndroidCompositionLocals_androidKt.f);
                    boolean k4 = btsVar6.k(view4);
                    Object Q8 = btsVar6.Q();
                    Object obj9 = Q8;
                    if (k4 || Q8 == o430Var) {
                        View rootView4 = view4.getRootView();
                        Object tag4 = rootView4.getTag(t9h0.metricsStateHolder);
                        if (tag4 == null) {
                            tag4 = new xva0();
                            rootView4.setTag(t9h0.metricsStateHolder, tag4);
                        }
                        xva0 xva0Var7 = (xva0) tag4;
                        btsVar6.o0(xva0Var7);
                        obj9 = xva0Var7;
                    }
                    xva0 xva0Var8 = (xva0) obj9;
                    Object Q9 = btsVar6.Q();
                    if (Q9 == o430Var) {
                        fva0.f(a4, "Payments.FeatureAddPaymentSpinner", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var4 = xva0Var8.a;
                        if (yuf0Var4 != null) {
                            yuf0Var4.I("Payments.FeatureAddPaymentSpinner");
                            zy11Var = zy11Var2;
                        }
                        btsVar6.o0(zy11Var);
                        Q9 = zy11Var;
                    }
                    kma1.a(cj0Var, btsVar6, (intValue6 >> 3) & 14);
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 6:
                fid fidVar7 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                h2d h2dVar = h2d.a;
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    joa1.a(btsVar7, 0);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 7:
                xfd xfdVar5 = (xfd) obj;
                i31 i31Var = (i31) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                i2d i2dVar = i2d.a;
                if ((intValue8 & 6) == 0) {
                    i5 = intValue8 | ((intValue8 & 8) == 0 ? ((bts) fidVar8).k(xfdVar5) : fidVar8.e(xfdVar5) ? 4 : 2);
                } else {
                    i5 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i5 |= (intValue8 & 64) == 0 ? ((bts) fidVar8).k(i31Var) : fidVar8.e(i31Var) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(i5 & 1, (i5 & 147) != 146)) {
                    com.yandex.go.address.address_map_picker.ui.a.a(i31Var, ((bgd) xfdVar5).a, btsVar8, (i5 >> 3) & 14);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
            case 8:
                xfd xfdVar6 = (xfd) obj;
                xp1 xp1Var = (xp1) obj2;
                fid fidVar9 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                l2d l2dVar = l2d.a;
                if ((intValue9 & 6) == 0) {
                    i6 = intValue9 | ((intValue9 & 8) == 0 ? ((bts) fidVar9).k(xfdVar6) : fidVar9.e(xfdVar6) ? 4 : 2);
                } else {
                    i6 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i6 |= ((bts) fidVar9).k(xp1Var) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(i6 & 1, (i6 & 147) != 146)) {
                    com.yandex.go.ai_widget.ui.a.b(xp1Var, ((bgd) xfdVar6).a, btsVar9, (i6 >> 3) & 14);
                } else {
                    btsVar9.Y();
                }
                return zy11Var2;
            case 9:
                xfd xfdVar7 = (xfd) obj;
                z12 z12Var = (z12) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                p2d p2dVar = p2d.a;
                if ((intValue10 & 6) == 0) {
                    i7 = intValue10 | ((intValue10 & 8) == 0 ? ((bts) fidVar10).k(xfdVar7) : fidVar10.e(xfdVar7) ? 4 : 2);
                } else {
                    i7 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i7 |= ((bts) fidVar10).k(z12Var) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(i7 & 1, (i7 & 147) != 146)) {
                    msa1.c(z12Var, ((bgd) xfdVar7).a, btsVar10, (i7 >> 3) & 14);
                } else {
                    btsVar10.Y();
                }
                return zy11Var2;
            case 10:
                xfd xfdVar8 = (xfd) obj;
                mx2 mx2Var = (mx2) obj2;
                fid fidVar11 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                r2d r2dVar = r2d.a;
                if ((intValue11 & 6) == 0) {
                    i8 = intValue11 | ((intValue11 & 8) == 0 ? ((bts) fidVar11).k(xfdVar8) : fidVar11.e(xfdVar8) ? 4 : 2);
                } else {
                    i8 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i8 |= ((bts) fidVar11).k(mx2Var) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(i8 & 1, (i8 & 147) != 146)) {
                    com.yandex.go.settings.presentation.a.a(mx2Var, ((bgd) xfdVar8).a, btsVar11, (i8 >> 3) & 14);
                } else {
                    btsVar11.Y();
                }
                return zy11Var2;
            case 11:
                xfd xfdVar9 = (xfd) obj;
                qm5 qm5Var = (qm5) obj2;
                fid fidVar12 = (fid) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                g3d g3dVar = g3d.a;
                if ((intValue12 & 6) == 0) {
                    i9 = intValue12 | ((intValue12 & 8) == 0 ? ((bts) fidVar12).k(xfdVar9) : fidVar12.e(xfdVar9) ? 4 : 2);
                } else {
                    i9 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i9 |= ((bts) fidVar12).k(qm5Var) ? 32 : 16;
                }
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(i9 & 1, (i9 & 147) != 146)) {
                    com.yandex.go.benefits_center.activation.ui.a.c(qm5Var, ((bgd) xfdVar9).a, btsVar12, (i9 >> 3) & 14);
                } else {
                    btsVar12.Y();
                }
                return zy11Var2;
            case 12:
                fid fidVar13 = (fid) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                h3d h3dVar = h3d.a;
                bts btsVar13 = (bts) fidVar13;
                if (!btsVar13.V(intValue13 & 1, (intValue13 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    btsVar13.Y();
                }
                return zy11Var2;
            case 13:
                fid fidVar14 = (fid) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                h3d h3dVar2 = h3d.a;
                bts btsVar14 = (bts) fidVar14;
                if (!btsVar14.V(intValue14 & 1, (intValue14 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    btsVar14.Y();
                }
                return zy11Var2;
            case 14:
                jh00 jh00Var = (jh00) obj2;
                fid fidVar15 = (fid) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                i3d i3dVar = i3d.a;
                if ((intValue15 & 48) == 0) {
                    intValue15 |= ((bts) fidVar15).k(jh00Var) ? 32 : 16;
                }
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 145) != 144)) {
                    ih00 ih00Var = jh00Var.c;
                    gz6 gz6Var = jp5.a;
                    kj2 kj2Var = com.yandex.go.rida.bids.utils.a.c(f.n(new wu60((Float.floatToRawIntBits(ih00Var.a) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(ih00Var.b))), btsVar15), sb2.K(0, 0, ubn.d, 3), btsVar15).d;
                    jp5.e(jh00Var.a, kj2Var, btsVar15, 0);
                    yn91.b(jh00Var.b, kj2Var, null, btsVar15, 0);
                } else {
                    btsVar15.Y();
                }
                return zy11Var2;
            case 15:
                fq5 fq5Var = (fq5) obj2;
                fid fidVar16 = (fid) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                j3d j3dVar = j3d.a;
                if ((intValue16 & 48) == 0) {
                    intValue16 |= ((bts) fidVar16).k(fq5Var) ? 32 : 16;
                }
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 145) != 144)) {
                    yrl.b(0, 7, btsVar16, null);
                    c.l(fq5Var, an91.m(c530Var, 0.0f, 8.0f, 1), btsVar16, ((intValue16 >> 3) & 14) | 48);
                } else {
                    btsVar16.Y();
                }
                return zy11Var2;
            case 16:
                xfd xfdVar10 = (xfd) obj;
                at6 at6Var = (at6) obj2;
                fid fidVar17 = (fid) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                q3d q3dVar = q3d.a;
                if ((intValue17 & 6) == 0) {
                    i10 = intValue17 | ((intValue17 & 8) == 0 ? ((bts) fidVar17).k(xfdVar10) : fidVar17.e(xfdVar10) ? 4 : 2);
                } else {
                    i10 = intValue17;
                }
                if ((intValue17 & 48) == 0) {
                    i10 |= (intValue17 & 64) == 0 ? ((bts) fidVar17).k(at6Var) : fidVar17.e(at6Var) ? 32 : 16;
                }
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(i10 & 1, (i10 & 147) != 146)) {
                    zbb1.a(at6Var, ((bgd) xfdVar10).a, btsVar17, ((i10 >> 3) & 14) | 8);
                } else {
                    btsVar17.Y();
                }
                return zy11Var2;
            case 17:
                xfd xfdVar11 = (xfd) obj;
                yv6 yv6Var = (yv6) obj2;
                fid fidVar18 = (fid) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                r3d r3dVar = r3d.a;
                if ((intValue18 & 6) == 0) {
                    i11 = intValue18 | ((intValue18 & 8) == 0 ? ((bts) fidVar18).k(xfdVar11) : fidVar18.e(xfdVar11) ? 4 : 2);
                } else {
                    i11 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i11 |= ((bts) fidVar18).k(yv6Var) ? 32 : 16;
                }
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(i11 & 1, (i11 & 147) != 146)) {
                    icb1.a(yv6Var, ((bgd) xfdVar11).a, btsVar18, (i11 >> 3) & 14);
                } else {
                    btsVar18.Y();
                }
                return zy11Var2;
            case 18:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar19 = (fid) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                t3d t3dVar = t3d.a;
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((bts) fidVar19).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue19 & 1, (intValue19 & HProv.PP_FAST_CODE) != 130)) {
                    oeb1.c(btsVar19, ljs0.q(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN));
                } else {
                    btsVar19.Y();
                }
                return zy11Var2;
            case 19:
                fid fidVar20 = (fid) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                t3d t3dVar2 = t3d.a;
                bts btsVar20 = (bts) fidVar20;
                if (!btsVar20.V(intValue20 & 1, (intValue20 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    btsVar20.Y();
                }
                return zy11Var2;
            case 20:
                xfd xfdVar12 = (xfd) obj;
                tj7 tj7Var = (tj7) obj2;
                fid fidVar21 = (fid) obj3;
                int intValue21 = ((Integer) obj4).intValue();
                x3d x3dVar = x3d.a;
                if ((intValue21 & 6) == 0) {
                    i12 = intValue21 | ((intValue21 & 8) == 0 ? ((bts) fidVar21).k(xfdVar12) : fidVar21.e(xfdVar12) ? 4 : 2);
                } else {
                    i12 = intValue21;
                }
                if ((intValue21 & 48) == 0) {
                    i12 |= ((bts) fidVar21).k(tj7Var) ? 32 : 16;
                }
                bts btsVar21 = (bts) fidVar21;
                if (btsVar21.V(i12 & 1, (i12 & 147) != 146)) {
                    com.yandex.go.call_order_fallback.ui.a.a(tj7Var, ((bgd) xfdVar12).a, btsVar21, (i12 >> 3) & 14);
                } else {
                    btsVar21.Y();
                }
                return zy11Var2;
            case 21:
                xfd xfdVar13 = (xfd) obj;
                vu7 vu7Var = (vu7) obj2;
                fid fidVar22 = (fid) obj3;
                int intValue22 = ((Integer) obj4).intValue();
                y3d y3dVar = y3d.a;
                if ((intValue22 & 6) == 0) {
                    i13 = intValue22 | ((intValue22 & 8) == 0 ? ((bts) fidVar22).k(xfdVar13) : fidVar22.e(xfdVar13) ? 4 : 2);
                } else {
                    i13 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i13 |= ((bts) fidVar22).k(vu7Var) ? 32 : 16;
                }
                bts btsVar22 = (bts) fidVar22;
                if (btsVar22.V(i13 & 1, (i13 & 147) != 146)) {
                    oeb1.a(vu7Var, ((bgd) xfdVar13).a, btsVar22, (i13 >> 3) & 14);
                } else {
                    btsVar22.Y();
                }
                return zy11Var2;
            case 22:
                return b(obj, obj2, obj3, obj4);
            case 23:
                return d(obj, obj2, obj3, obj4);
            case 24:
                return e(obj, obj2, obj3, obj4);
            case 25:
                return f(obj, obj2, obj3, obj4);
            case 26:
                return g(obj, obj2, obj3, obj4);
            case 27:
                return i(obj, obj2, obj3, obj4);
            case 28:
                return j(obj, obj2, obj3, obj4);
            default:
                xfd xfdVar14 = (xfd) obj;
                dw9 dw9Var = (dw9) obj2;
                fid fidVar23 = (fid) obj3;
                int intValue23 = ((Integer) obj4).intValue();
                q4d q4dVar = q4d.a;
                if ((intValue23 & 6) == 0) {
                    i14 = intValue23 | ((intValue23 & 8) == 0 ? ((bts) fidVar23).k(xfdVar14) : fidVar23.e(xfdVar14) ? 4 : 2);
                } else {
                    i14 = intValue23;
                }
                if ((intValue23 & 48) == 0) {
                    i14 |= (intValue23 & 64) == 0 ? ((bts) fidVar23).k(dw9Var) : fidVar23.e(dw9Var) ? 32 : 16;
                }
                bts btsVar23 = (bts) fidVar23;
                if (btsVar23.V(i14 & 1, (i14 & 147) != 146)) {
                    String key = (dw9Var instanceof zv9 ? ChargersPerfEvent.DISCOUNT_DETAILS : ChargersPerfEvent.DISCOUNTS_LIST).getKey();
                    fva0 a5 = f4z.a();
                    View view5 = (View) btsVar23.m(AndroidCompositionLocals_androidKt.f);
                    boolean k5 = btsVar23.k(view5);
                    Object Q10 = btsVar23.Q();
                    Object obj10 = Q10;
                    if (k5 || Q10 == o430Var) {
                        View rootView5 = view5.getRootView();
                        Object tag5 = rootView5.getTag(t9h0.metricsStateHolder);
                        if (tag5 == null) {
                            tag5 = new xva0();
                            rootView5.setTag(t9h0.metricsStateHolder, tag5);
                        }
                        xva0 xva0Var9 = (xva0) tag5;
                        btsVar23.o0(xva0Var9);
                        obj10 = xva0Var9;
                    }
                    xva0 xva0Var10 = (xva0) obj10;
                    Object Q11 = btsVar23.Q();
                    if (Q11 == o430Var) {
                        fva0.f(a5, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var5 = xva0Var10.a;
                        if (yuf0Var5 != null) {
                            yuf0Var5.I(key);
                            zy11Var = zy11Var2;
                        }
                        btsVar23.o0(zy11Var);
                        Q11 = zy11Var;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(i16, dw9Var, xfdVar14), btsVar23), btsVar23, 3456, 3);
                } else {
                    btsVar23.Y();
                }
                return zy11Var2;
        }
    }
}
