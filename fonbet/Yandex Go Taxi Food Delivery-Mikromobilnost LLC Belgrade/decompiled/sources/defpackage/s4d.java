package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.design.compose.loading.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.text.a;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes12.dex */
public final /* synthetic */ class s4d implements bms {
    public final /* synthetic */ int a;

    public /* synthetic */ s4d(int i) {
        this.a = i;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        bzd bzdVar = (bzd) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        b6d b6dVar = b6d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(bzdVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            upb1.a(bzdVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        ste steVar = (ste) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        g6d g6dVar = g6d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(steVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            hsb1.c(steVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        yte yteVar = (yte) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        i6d i6dVar = i6d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(yteVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            jsb1.a(yteVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        urh urhVar = (urh) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        n6d n6dVar = n6d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(urhVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            r891.b(urhVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        mej mejVar = (mej) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        q6d q6dVar = q6d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(mejVar) : fidVar.e(mejVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            wf91.a(mejVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        ylj yljVar = (ylj) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        s6d s6dVar = s6d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(yljVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            qh91.a(yljVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        z6d z6dVar = z6d.a;
        if (str != null) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(1359326671);
            a.a((intValue & 112) | 390, btsVar, an91.l(c530.a, 12.0f, 8.0f), str);
            btsVar.t(false);
        } else {
            bts btsVar2 = (bts) fidVar;
            btsVar2.e0(1359540974);
            btsVar2.t(false);
        }
        return zy11.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        ohx0 ohx0Var = (ohx0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        n7d n7dVar = n7d.a;
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(ohx0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            oeb1.c(btsVar, bzk0.c(ljs0.m(c530.a, 16.0f), ohx0Var.a, cyk0.a));
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        piu piuVar = (piu) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        r7d r7dVar = r7d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(piuVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            h1b1.i(piuVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        vuv vuvVar = (vuv) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        w7d w7dVar = w7d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(vuvVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            com.yandex.go.information.presentation.a.c(vuvVar, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        b8d b8dVar = b8d.a;
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & HProv.PP_SECURITY_LEVEL) != 128)) {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        b8d b8dVar = b8d.a;
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & HProv.PP_SECURITY_LEVEL) != 128)) {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        abz abzVar = (abz) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        f8d f8dVar = f8d.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(abzVar) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            raz.d((i >> 3) & 14, btsVar, ((bgd) xfdVar).a, abzVar, null);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zy11 zy11Var;
        int i2;
        zy11 zy11Var2;
        int i3;
        zy11 zy11Var3;
        int i4;
        int i5;
        int i6;
        zy11 zy11Var4;
        int i7;
        zy11 zy11Var5;
        int i8;
        zy11 zy11Var6;
        int i9;
        zy11 zy11Var7;
        int i10;
        int i11;
        int i12;
        zy11 zy11Var8;
        int i13;
        int i14;
        zy11 zy11Var9;
        int i15;
        int i16 = this.a;
        int i17 = 14;
        o430 o430Var = did.a;
        zy11 zy11Var10 = zy11.a;
        switch (i16) {
            case 0:
                xfd xfdVar = (xfd) obj;
                t0a t0aVar = (t0a) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                t4d t4dVar = t4d.a;
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((bts) fidVar).k(t0aVar) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    String key = ChargersPerfEvent.FEEDBACK.getKey();
                    fva0 a = f4z.a();
                    View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
                    boolean k = btsVar.k(view);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
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
                    if (Q2 == o430Var) {
                        fva0.f(a, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var = xva0Var.a;
                        if (yuf0Var != null) {
                            yuf0Var.I(key);
                            zy11Var = zy11Var10;
                        } else {
                            zy11Var = null;
                        }
                        btsVar.o0(zy11Var);
                        Q2 = zy11Var;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(5, t0aVar, xfdVar), btsVar), btsVar, 3456, 3);
                } else {
                    btsVar.Y();
                }
                return zy11Var10;
            case 1:
                xfd xfdVar2 = (xfd) obj;
                gea geaVar = (gea) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                v4d v4dVar = v4d.a;
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? ((bts) fidVar2).k(xfdVar2) : fidVar2.e(xfdVar2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= ((bts) fidVar2).k(geaVar) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    String key2 = ChargersPerfEvent.PARTNER_DETAILS.getKey();
                    fva0 a2 = f4z.a();
                    View view2 = (View) btsVar2.m(AndroidCompositionLocals_androidKt.f);
                    boolean k2 = btsVar2.k(view2);
                    Object Q3 = btsVar2.Q();
                    if (k2 || Q3 == o430Var) {
                        View rootView2 = view2.getRootView();
                        Object tag2 = rootView2.getTag(t9h0.metricsStateHolder);
                        if (tag2 == null) {
                            tag2 = new xva0();
                            rootView2.setTag(t9h0.metricsStateHolder, tag2);
                        }
                        Q3 = (xva0) tag2;
                        btsVar2.o0(Q3);
                    }
                    xva0 xva0Var2 = (xva0) Q3;
                    Object Q4 = btsVar2.Q();
                    if (Q4 == o430Var) {
                        fva0.f(a2, key2, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var2 = xva0Var2.a;
                        if (yuf0Var2 != null) {
                            yuf0Var2.I(key2);
                            zy11Var2 = zy11Var10;
                        } else {
                            zy11Var2 = null;
                        }
                        btsVar2.o0(zy11Var2);
                        Q4 = zy11Var2;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(6, geaVar, xfdVar2), btsVar2), btsVar2, 3456, 3);
                } else {
                    btsVar2.Y();
                }
                return zy11Var10;
            case 2:
                xfd xfdVar3 = (xfd) obj;
                wea weaVar = (wea) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                x4d x4dVar = x4d.a;
                if ((intValue3 & 6) == 0) {
                    i3 = intValue3 | ((intValue3 & 8) == 0 ? ((bts) fidVar3).k(xfdVar3) : fidVar3.e(xfdVar3) ? 4 : 2);
                } else {
                    i3 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i3 |= (intValue3 & 64) == 0 ? ((bts) fidVar3).k(weaVar) : fidVar3.e(weaVar) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(i3 & 1, (i3 & 147) != 146)) {
                    String key3 = ChargersPerfEvent.PARTNER_SUBSCRIPTION.getKey();
                    fva0 a3 = f4z.a();
                    View view3 = (View) btsVar3.m(AndroidCompositionLocals_androidKt.f);
                    boolean k3 = btsVar3.k(view3);
                    Object Q5 = btsVar3.Q();
                    if (k3 || Q5 == o430Var) {
                        View rootView3 = view3.getRootView();
                        Object tag3 = rootView3.getTag(t9h0.metricsStateHolder);
                        if (tag3 == null) {
                            tag3 = new xva0();
                            rootView3.setTag(t9h0.metricsStateHolder, tag3);
                        }
                        Q5 = (xva0) tag3;
                        btsVar3.o0(Q5);
                    }
                    xva0 xva0Var3 = (xva0) Q5;
                    Object Q6 = btsVar3.Q();
                    if (Q6 == o430Var) {
                        fva0.f(a3, key3, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var3 = xva0Var3.a;
                        if (yuf0Var3 != null) {
                            yuf0Var3.I(key3);
                            zy11Var3 = zy11Var10;
                        } else {
                            zy11Var3 = null;
                        }
                        btsVar3.o0(zy11Var3);
                        Q6 = zy11Var3;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(7, weaVar, xfdVar3), btsVar3), btsVar3, 3456, 3);
                } else {
                    btsVar3.Y();
                }
                return zy11Var10;
            case 3:
                xfd xfdVar4 = (xfd) obj;
                iga igaVar = (iga) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                y4d y4dVar = y4d.a;
                if ((intValue4 & 6) == 0) {
                    i4 = intValue4 | ((intValue4 & 8) == 0 ? ((bts) fidVar4).k(xfdVar4) : fidVar4.e(xfdVar4) ? 4 : 2);
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i4 |= (intValue4 & 64) == 0 ? ((bts) fidVar4).k(igaVar) : fidVar4.e(igaVar) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(i4 & 1, (i4 & 147) != 146)) {
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(8, igaVar, xfdVar4), btsVar4), btsVar4, 3456, 3);
                } else {
                    btsVar4.Y();
                }
                return zy11Var10;
            case 4:
                xfd xfdVar5 = (xfd) obj;
                yha yhaVar = (yha) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                c5d c5dVar = c5d.a;
                if ((intValue5 & 6) == 0) {
                    i5 = intValue5 | ((intValue5 & 8) == 0 ? ((bts) fidVar5).k(xfdVar5) : fidVar5.e(xfdVar5) ? 4 : 2);
                } else {
                    i5 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i5 |= (intValue5 & 64) == 0 ? ((bts) fidVar5).k(yhaVar) : fidVar5.e(yhaVar) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(i5 & 1, (i5 & 147) != 146)) {
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(9, yhaVar, xfdVar5), btsVar5), btsVar5, 3456, 3);
                } else {
                    btsVar5.Y();
                }
                return zy11Var10;
            case 5:
                xfd xfdVar6 = (xfd) obj;
                bja bjaVar = (bja) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                e5d e5dVar = e5d.a;
                if ((intValue6 & 6) == 0) {
                    i6 = intValue6 | ((intValue6 & 8) == 0 ? ((bts) fidVar6).k(xfdVar6) : fidVar6.e(xfdVar6) ? 4 : 2);
                } else {
                    i6 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i6 |= ((bts) fidVar6).k(bjaVar) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(i6 & 1, (i6 & 147) != 146)) {
                    String key4 = ChargersPerfEvent.ACTIVE_PASSES.getKey();
                    fva0 a4 = f4z.a();
                    View view4 = (View) btsVar6.m(AndroidCompositionLocals_androidKt.f);
                    boolean k4 = btsVar6.k(view4);
                    Object Q7 = btsVar6.Q();
                    if (k4 || Q7 == o430Var) {
                        View rootView4 = view4.getRootView();
                        Object tag4 = rootView4.getTag(t9h0.metricsStateHolder);
                        if (tag4 == null) {
                            tag4 = new xva0();
                            rootView4.setTag(t9h0.metricsStateHolder, tag4);
                        }
                        Q7 = (xva0) tag4;
                        btsVar6.o0(Q7);
                    }
                    xva0 xva0Var4 = (xva0) Q7;
                    Object Q8 = btsVar6.Q();
                    if (Q8 == o430Var) {
                        fva0.f(a4, key4, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var4 = xva0Var4.a;
                        if (yuf0Var4 != null) {
                            yuf0Var4.I(key4);
                            zy11Var4 = zy11Var10;
                        } else {
                            zy11Var4 = null;
                        }
                        btsVar6.o0(zy11Var4);
                        Q8 = zy11Var4;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(10, bjaVar, xfdVar6), btsVar6), btsVar6, 3456, 3);
                } else {
                    btsVar6.Y();
                }
                return zy11Var10;
            case 6:
                xfd xfdVar7 = (xfd) obj;
                qja qjaVar = (qja) obj2;
                fid fidVar7 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                g5d g5dVar = g5d.a;
                if ((intValue7 & 6) == 0) {
                    i7 = intValue7 | ((intValue7 & 8) == 0 ? ((bts) fidVar7).k(xfdVar7) : fidVar7.e(xfdVar7) ? 4 : 2);
                } else {
                    i7 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i7 |= ((bts) fidVar7).k(qjaVar) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(i7 & 1, (i7 & 147) != 146)) {
                    String key5 = ChargersPerfEvent.PASSES_PURCHASING.getKey();
                    fva0 a5 = f4z.a();
                    View view5 = (View) btsVar7.m(AndroidCompositionLocals_androidKt.f);
                    boolean k5 = btsVar7.k(view5);
                    Object Q9 = btsVar7.Q();
                    if (k5 || Q9 == o430Var) {
                        View rootView5 = view5.getRootView();
                        Object tag5 = rootView5.getTag(t9h0.metricsStateHolder);
                        if (tag5 == null) {
                            tag5 = new xva0();
                            rootView5.setTag(t9h0.metricsStateHolder, tag5);
                        }
                        Q9 = (xva0) tag5;
                        btsVar7.o0(Q9);
                    }
                    xva0 xva0Var5 = (xva0) Q9;
                    Object Q10 = btsVar7.Q();
                    if (Q10 == o430Var) {
                        fva0.f(a5, key5, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var5 = xva0Var5.a;
                        if (yuf0Var5 != null) {
                            yuf0Var5.I(key5);
                            zy11Var5 = zy11Var10;
                        } else {
                            zy11Var5 = null;
                        }
                        btsVar7.o0(zy11Var5);
                        Q10 = zy11Var5;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(11, qjaVar, xfdVar7), btsVar7), btsVar7, 3456, 3);
                } else {
                    btsVar7.Y();
                }
                return zy11Var10;
            case 7:
                xfd xfdVar8 = (xfd) obj;
                yta ytaVar = (yta) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                i5d i5dVar = i5d.a;
                if ((intValue8 & 6) == 0) {
                    i8 = intValue8 | ((intValue8 & 8) == 0 ? ((bts) fidVar8).k(xfdVar8) : fidVar8.e(xfdVar8) ? 4 : 2);
                } else {
                    i8 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i8 |= ((bts) fidVar8).k(ytaVar) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(i8 & 1, (i8 & 147) != 146)) {
                    String key6 = ChargersPerfEvent.SUBSCRIPTION_LANDING.getKey();
                    fva0 a6 = f4z.a();
                    View view6 = (View) btsVar8.m(AndroidCompositionLocals_androidKt.f);
                    boolean k6 = btsVar8.k(view6);
                    Object Q11 = btsVar8.Q();
                    if (k6 || Q11 == o430Var) {
                        View rootView6 = view6.getRootView();
                        Object tag6 = rootView6.getTag(t9h0.metricsStateHolder);
                        if (tag6 == null) {
                            tag6 = new xva0();
                            rootView6.setTag(t9h0.metricsStateHolder, tag6);
                        }
                        Q11 = (xva0) tag6;
                        btsVar8.o0(Q11);
                    }
                    xva0 xva0Var6 = (xva0) Q11;
                    Object Q12 = btsVar8.Q();
                    if (Q12 == o430Var) {
                        fva0.f(a6, key6, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var6 = xva0Var6.a;
                        if (yuf0Var6 != null) {
                            yuf0Var6.I(key6);
                            zy11Var6 = zy11Var10;
                        } else {
                            zy11Var6 = null;
                        }
                        btsVar8.o0(zy11Var6);
                        Q12 = zy11Var6;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(12, ytaVar, xfdVar8), btsVar8), btsVar8, 3456, 3);
                } else {
                    btsVar8.Y();
                }
                return zy11Var10;
            case 8:
                xfd xfdVar9 = (xfd) obj;
                wua wuaVar = (wua) obj2;
                fid fidVar9 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                k5d k5dVar = k5d.a;
                if ((intValue9 & 6) == 0) {
                    i9 = intValue9 | ((intValue9 & 8) == 0 ? ((bts) fidVar9).k(xfdVar9) : fidVar9.e(xfdVar9) ? 4 : 2);
                } else {
                    i9 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i9 |= ((bts) fidVar9).k(wuaVar) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(i9 & 1, (i9 & 147) != 146)) {
                    String key7 = ChargersPerfEvent.SUBSCRIPTION_LOADING.getKey();
                    fva0 a7 = f4z.a();
                    View view7 = (View) btsVar9.m(AndroidCompositionLocals_androidKt.f);
                    boolean k7 = btsVar9.k(view7);
                    Object Q13 = btsVar9.Q();
                    if (k7 || Q13 == o430Var) {
                        View rootView7 = view7.getRootView();
                        Object tag7 = rootView7.getTag(t9h0.metricsStateHolder);
                        if (tag7 == null) {
                            tag7 = new xva0();
                            rootView7.setTag(t9h0.metricsStateHolder, tag7);
                        }
                        Q13 = (xva0) tag7;
                        btsVar9.o0(Q13);
                    }
                    xva0 xva0Var7 = (xva0) Q13;
                    Object Q14 = btsVar9.Q();
                    if (Q14 == o430Var) {
                        fva0.f(a7, key7, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var7 = xva0Var7.a;
                        if (yuf0Var7 != null) {
                            yuf0Var7.I(key7);
                            zy11Var7 = zy11Var10;
                        } else {
                            zy11Var7 = null;
                        }
                        btsVar9.o0(zy11Var7);
                        Q14 = zy11Var7;
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(13, wuaVar, xfdVar9), btsVar9), btsVar9, 3456, 3);
                } else {
                    btsVar9.Y();
                }
                return zy11Var10;
            case 9:
                xfd xfdVar10 = (xfd) obj;
                gwa gwaVar = (gwa) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                l5d l5dVar = l5d.a;
                if ((intValue10 & 6) == 0) {
                    i10 = intValue10 | ((intValue10 & 8) == 0 ? ((bts) fidVar10).k(xfdVar10) : fidVar10.e(xfdVar10) ? 4 : 2);
                } else {
                    i10 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i10 |= (intValue10 & 64) == 0 ? ((bts) fidVar10).k(gwaVar) : fidVar10.e(gwaVar) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(i10 & 1, (i10 & 147) != 146)) {
                    String key8 = ChargersPerfEvent.SURGE_INFO.getKey();
                    fva0 a8 = f4z.a();
                    View view8 = (View) btsVar10.m(AndroidCompositionLocals_androidKt.f);
                    boolean k8 = btsVar10.k(view8);
                    Object Q15 = btsVar10.Q();
                    if (k8 || Q15 == o430Var) {
                        View rootView8 = view8.getRootView();
                        Object tag8 = rootView8.getTag(t9h0.metricsStateHolder);
                        if (tag8 == null) {
                            tag8 = new xva0();
                            rootView8.setTag(t9h0.metricsStateHolder, tag8);
                        }
                        Q15 = (xva0) tag8;
                        btsVar10.o0(Q15);
                    }
                    xva0 xva0Var8 = (xva0) Q15;
                    Object Q16 = btsVar10.Q();
                    if (Q16 == o430Var) {
                        fva0.f(a8, key8, PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var8 = xva0Var8.a;
                        if (yuf0Var8 != null) {
                            yuf0Var8.I(key8);
                            Q16 = zy11Var10;
                        } else {
                            Q16 = null;
                        }
                        btsVar10.o0(Q16);
                    }
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(i17, gwaVar, xfdVar10), btsVar10), btsVar10, 3456, 3);
                } else {
                    btsVar10.Y();
                }
                return zy11Var10;
            case 10:
                xfd xfdVar11 = (xfd) obj;
                qxa qxaVar = (qxa) obj2;
                fid fidVar11 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                n5d n5dVar = n5d.a;
                if ((intValue11 & 6) == 0) {
                    i11 = intValue11 | ((intValue11 & 8) == 0 ? ((bts) fidVar11).k(xfdVar11) : fidVar11.e(xfdVar11) ? 4 : 2);
                } else {
                    i11 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i11 |= (intValue11 & 64) == 0 ? ((bts) fidVar11).k(qxaVar) : fidVar11.e(qxaVar) ? 32 : 16;
                }
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(i11 & 1, (i11 & 147) != 146)) {
                    rzo.b(null, "default", wwg.S(-1843402779, true, new ut9(15, qxaVar, xfdVar11), btsVar11), btsVar11, 3456, 3);
                } else {
                    btsVar11.Y();
                }
                return zy11Var10;
            case 11:
                fid fidVar12 = (fid) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                p5d p5dVar = p5d.a;
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    qy20.a(null, null, null, false, p5d.b, btsVar12, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
                } else {
                    btsVar12.Y();
                }
                return zy11Var10;
            case 12:
                xfd xfdVar12 = (xfd) obj;
                apb apbVar = (apb) obj2;
                fid fidVar13 = (fid) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                q5d q5dVar = q5d.a;
                if ((intValue13 & 6) == 0) {
                    i12 = ((intValue13 & 8) == 0 ? ((bts) fidVar13).k(xfdVar12) : fidVar13.e(xfdVar12) ? 4 : 2) | intValue13;
                } else {
                    i12 = intValue13;
                }
                if ((intValue13 & 48) == 0) {
                    i12 |= ((bts) fidVar13).k(apbVar) ? 32 : 16;
                }
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(i12 & 1, (i12 & 147) != 146)) {
                    fva0 a9 = f4z.a();
                    View view9 = (View) btsVar13.m(AndroidCompositionLocals_androidKt.f);
                    boolean k9 = btsVar13.k(view9);
                    Object Q17 = btsVar13.Q();
                    if (k9 || Q17 == o430Var) {
                        View rootView9 = view9.getRootView();
                        Object tag9 = rootView9.getTag(t9h0.metricsStateHolder);
                        if (tag9 == null) {
                            tag9 = new xva0();
                            rootView9.setTag(t9h0.metricsStateHolder, tag9);
                        }
                        Q17 = (xva0) tag9;
                        btsVar13.o0(Q17);
                    }
                    xva0 xva0Var9 = (xva0) Q17;
                    Object Q18 = btsVar13.Q();
                    if (Q18 == o430Var) {
                        fva0.f(a9, "ChildCompoundOptionSelect", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var9 = xva0Var9.a;
                        if (yuf0Var9 != null) {
                            yuf0Var9.I("ChildCompoundOptionSelect");
                            zy11Var8 = zy11Var10;
                        } else {
                            zy11Var8 = null;
                        }
                        btsVar13.o0(zy11Var8);
                        Q18 = zy11Var8;
                    }
                    m791.b(apbVar, ((bgd) xfdVar12).a, btsVar13, 14 & (i12 >> 3));
                } else {
                    btsVar13.Y();
                }
                return zy11Var10;
            case 13:
                xfd xfdVar13 = (xfd) obj;
                hxb hxbVar = (hxb) obj2;
                fid fidVar14 = (fid) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                t5d t5dVar = t5d.a;
                if ((intValue14 & 6) == 0) {
                    i13 = intValue14 | ((intValue14 & 8) == 0 ? ((bts) fidVar14).k(xfdVar13) : fidVar14.e(xfdVar13) ? 4 : 2);
                } else {
                    i13 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i13 |= ((bts) fidVar14).k(hxbVar) ? 32 : 16;
                }
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(i13 & 1, (i13 & 147) != 146)) {
                    fmb1.b(hxbVar, ((bgd) xfdVar13).a, btsVar14, 14 & (i13 >> 3));
                } else {
                    btsVar14.Y();
                }
                return zy11Var10;
            case 14:
                ((Integer) obj2).getClass();
                fid fidVar15 = (fid) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                u5d u5dVar = u5d.a;
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    b.a(ljs0.b(ljs0.c(c530.a, 1.0f), 0.0f, 180.0f, 1), cyk0.c(16.0f), false, null, null, null, false, btsVar15, 6, 252);
                } else {
                    btsVar15.Y();
                }
                return zy11Var10;
            case 15:
                xfd xfdVar14 = (xfd) obj;
                fvd fvdVar = (fvd) obj2;
                fid fidVar16 = (fid) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                a6d a6dVar = a6d.a;
                if ((intValue16 & 6) == 0) {
                    i14 = ((intValue16 & 8) == 0 ? ((bts) fidVar16).k(xfdVar14) : fidVar16.e(xfdVar14) ? 4 : 2) | intValue16;
                } else {
                    i14 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i14 |= ((bts) fidVar16).k(fvdVar) ? 32 : 16;
                }
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(i14 & 1, (i14 & 147) != 146)) {
                    fva0 a10 = f4z.a();
                    View view10 = (View) btsVar16.m(AndroidCompositionLocals_androidKt.f);
                    boolean k10 = btsVar16.k(view10);
                    Object Q19 = btsVar16.Q();
                    if (k10 || Q19 == o430Var) {
                        View rootView10 = view10.getRootView();
                        Object tag10 = rootView10.getTag(t9h0.metricsStateHolder);
                        if (tag10 == null) {
                            tag10 = new xva0();
                            rootView10.setTag(t9h0.metricsStateHolder, tag10);
                        }
                        Q19 = (xva0) tag10;
                        btsVar16.o0(Q19);
                    }
                    xva0 xva0Var10 = (xva0) Q19;
                    Object Q20 = btsVar16.Q();
                    if (Q20 == o430Var) {
                        fva0.f(a10, "CompoundOptionSelect", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var10 = xva0Var10.a;
                        if (yuf0Var10 != null) {
                            yuf0Var10.I("CompoundOptionSelect");
                            zy11Var9 = zy11Var10;
                        } else {
                            zy11Var9 = null;
                        }
                        btsVar16.o0(zy11Var9);
                        Q20 = zy11Var9;
                    }
                    ppb1.b(fvdVar, ((bgd) xfdVar14).a, btsVar16, 14 & (i14 >> 3));
                } else {
                    btsVar16.Y();
                }
                return zy11Var10;
            case 16:
                return b(obj, obj2, obj3, obj4);
            case 17:
                return d(obj, obj2, obj3, obj4);
            case 18:
                return e(obj, obj2, obj3, obj4);
            case 19:
                return f(obj, obj2, obj3, obj4);
            case 20:
                return g(obj, obj2, obj3, obj4);
            case 21:
                return i(obj, obj2, obj3, obj4);
            case 22:
                return j(obj, obj2, obj3, obj4);
            case 23:
                return k(obj, obj2, obj3, obj4);
            case 24:
                return l(obj, obj2, obj3, obj4);
            case 25:
                return m(obj, obj2, obj3, obj4);
            case 26:
                return n(obj, obj2, obj3, obj4);
            case 27:
                return o(obj, obj2, obj3, obj4);
            case 28:
                return p(obj, obj2, obj3, obj4);
            default:
                xfd xfdVar15 = (xfd) obj;
                kxz kxzVar = (kxz) obj2;
                fid fidVar17 = (fid) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                g8d g8dVar = g8d.a;
                if ((intValue17 & 6) == 0) {
                    i15 = intValue17 | ((intValue17 & 8) == 0 ? ((bts) fidVar17).k(xfdVar15) : fidVar17.e(xfdVar15) ? 4 : 2);
                } else {
                    i15 = intValue17;
                }
                if ((intValue17 & 48) == 0) {
                    i15 |= ((bts) fidVar17).k(kxzVar) ? 32 : 16;
                }
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(i15 & 1, (i15 & 147) != 146)) {
                    com.yandex.go.loyalty.impl.selector.ui.a.g(kxzVar, ((bgd) xfdVar15).a, btsVar17, 14 & (i15 >> 3));
                } else {
                    btsVar17.Y();
                }
                return zy11Var10;
        }
    }
}
