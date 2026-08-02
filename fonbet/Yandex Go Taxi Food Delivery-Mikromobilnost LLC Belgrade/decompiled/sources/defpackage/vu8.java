package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.logistics.cargo_flow.form.address.c;
import com.yandex.go.logistics.cargo_flow.route_selector.a;
import com.yandex.go.plus.api.model.CashbackScreenSource;
import com.yandex.go.requirements.modal.CompoundOptionSelectModalView;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalCloseReason;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalType;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.cxq0;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.delivery.ui.requirement.DeliverySelectRequirementDialog;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;

/* loaded from: classes5.dex */
public final class vu8 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public Object I;
    public Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu8(a aVar, yvf0 yvf0Var, f4l0 f4l0Var, yvf0 yvf0Var2, c cVar) {
        super(null);
        this.D = 0;
        this.E = aVar;
        this.F = yvf0Var;
        this.H = f4l0Var;
        this.G = yvf0Var2;
        this.I = cVar;
        this.J = new su8(this, 0);
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 0:
                ((a) this.E).b(qoi0.a(vu8.class));
                break;
            case 3:
                cxq0 cxq0Var = (cxq0) this.J;
                if (cxq0Var != null) {
                    cxq0Var.z();
                }
                this.J = null;
                GoFrameLayout goFrameLayout = (GoFrameLayout) this.I;
                if (goFrameLayout != null) {
                    ((xzm0) this.H).a.detach(goFrameLayout);
                    this.I = null;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.plushome.ScootersPlusHomeRouter$provideView$$inlined$wrapJankStats$1] */
    @Override // defpackage.h55
    public final void J(Object obj) {
        Object obj2;
        String str;
        Object obj3;
        Object obj4;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        final int i = 1;
        switch (this.D) {
            case 0:
                wu8 wu8Var = (wu8) obj;
                w5l0 w5l0Var = new w5l0(wu8Var.a, wu8Var.b, o());
                y8g u = bvf0.u();
                gjz gjzVar = u.a;
                Application application = (Application) gjzVar.b.c;
                q5z.h(application);
                qcp0 qcp0Var = new qcp0();
                hwy0 c = gjzVar.c();
                yuj0 yuj0Var = (yuj0) u.l0.get();
                jwh a = gjzVar.a();
                q5z.h(a);
                fcj0 fcj0Var = new fcj0(application, qcp0Var, c, yuj0Var, a);
                su8 su8Var = (su8) this.J;
                f4l0 f4l0Var = (f4l0) this.H;
                cx7 cx7Var = new cx7(19, this);
                czh czhVar = (czh) su8Var.invoke();
                s6k0 s6k0Var = new s6k0(w5l0Var, new u5l0(czhVar, cx7Var), f4l0Var);
                y6g y6gVar = new y6g(fcj0Var, 3);
                y6g y6gVar2 = new y6g(fcj0Var, i);
                y6g y6gVar3 = new y6g(fcj0Var, 4);
                z6g z6gVar = new z6g(s6k0Var, objArr2 == true ? 1 : 0);
                z6g z6gVar2 = new z6g(s6k0Var, i);
                int i2 = 2;
                y5l0 y5l0Var = (y5l0) i5m.b(new vfg0(y6gVar, new jpj0(y6gVar2, y6gVar3, new ph70(z6gVar, z6gVar2, new z6g(s6k0Var, i2), vcl0.a, new y6g(fcj0Var, i2), new jzi0(12, new y6g(fcj0Var, objArr == true ? 1 : 0))), 15), z6gVar, z6gVar2, 19)).get();
                qcp0 qcp0Var2 = y5l0Var.a;
                x5l0 x5l0Var = y5l0Var.b;
                w5l0 w5l0Var2 = y5l0Var.c;
                u5l0 u5l0Var = y5l0Var.d;
                qcp0Var2.getClass();
                czh.a(czhVar, new izh(new cxm(new aoi(x5l0Var, w5l0Var2, u5l0Var)), ButtonType.BACK, ScreenMode.FIXED, new ts11(false, false, null, null, null, 507), null, null, 5714));
                ((a) this.E).a(qoi0.a(vu8.class), null, true);
                break;
            case 1:
                final wud wudVar = (wud) obj;
                sud b = ((gvd) this.H).b(wudVar.b, wudVar.c, wudVar.d);
                if (b == null) {
                    r(new qu(9));
                    break;
                } else {
                    final Object[] objArr4 = objArr3 == true ? 1 : 0;
                    tls tlsVar = new tls(this) { // from class: c9h
                        public final /* synthetic */ vu8 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i3 = objArr4;
                            zy11 zy11Var = zy11.a;
                            wud wudVar2 = wudVar;
                            vu8 vu8Var = this.b;
                            switch (i3) {
                                case 0:
                                    efh efhVar = (efh) obj5;
                                    sue0 sue0Var = (sue0) vu8Var.I;
                                    SummaryAnalytics$ModalType summaryAnalytics$ModalType = SummaryAnalytics$ModalType.Default;
                                    String str2 = wudVar2.b.c;
                                    String str3 = efhVar.a;
                                    boolean z = efhVar.b;
                                    mi31 mi31Var = wudVar2.a;
                                    sue0Var.k(summaryAnalytics$ModalType, str2, str3, !z, 0, mi31Var.f, mi31Var.b, mi31Var.g);
                                    SummaryAnalytics$ModalCloseReason summaryAnalytics$ModalCloseReason = SummaryAnalytics$ModalCloseReason.OptionSelection;
                                    sue0 sue0Var2 = (sue0) vu8Var.I;
                                    gmw0 gmw0Var = wudVar2.b;
                                    sue0Var2.h(summaryAnalytics$ModalType, gmw0Var.c, summaryAnalytics$ModalCloseReason);
                                    sk7 sk7Var = (sk7) vu8Var.G;
                                    int i4 = wudVar2.d;
                                    String str4 = efhVar.a;
                                    if (!z) {
                                        str4 = null;
                                    }
                                    sk7Var.a(gmw0Var, i4, str4);
                                    break;
                                default:
                                    ((sue0) vu8Var.I).h(SummaryAnalytics$ModalType.Default, wudVar2.b.c, (SummaryAnalytics$ModalCloseReason) obj5);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    w030 w030Var = (w030) this.F;
                    CompoundOptionSelectModalView compoundOptionSelectModalView = new CompoundOptionSelectModalView((Context) this.E, (pav) this.J, b, tlsVar, new tls(this) { // from class: c9h
                        public final /* synthetic */ vu8 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i3 = i;
                            zy11 zy11Var = zy11.a;
                            wud wudVar2 = wudVar;
                            vu8 vu8Var = this.b;
                            switch (i3) {
                                case 0:
                                    efh efhVar = (efh) obj5;
                                    sue0 sue0Var = (sue0) vu8Var.I;
                                    SummaryAnalytics$ModalType summaryAnalytics$ModalType = SummaryAnalytics$ModalType.Default;
                                    String str2 = wudVar2.b.c;
                                    String str3 = efhVar.a;
                                    boolean z = efhVar.b;
                                    mi31 mi31Var = wudVar2.a;
                                    sue0Var.k(summaryAnalytics$ModalType, str2, str3, !z, 0, mi31Var.f, mi31Var.b, mi31Var.g);
                                    SummaryAnalytics$ModalCloseReason summaryAnalytics$ModalCloseReason = SummaryAnalytics$ModalCloseReason.OptionSelection;
                                    sue0 sue0Var2 = (sue0) vu8Var.I;
                                    gmw0 gmw0Var = wudVar2.b;
                                    sue0Var2.h(summaryAnalytics$ModalType, gmw0Var.c, summaryAnalytics$ModalCloseReason);
                                    sk7 sk7Var = (sk7) vu8Var.G;
                                    int i4 = wudVar2.d;
                                    String str4 = efhVar.a;
                                    if (!z) {
                                        str4 = null;
                                    }
                                    sk7Var.a(gmw0Var, i4, str4);
                                    break;
                                default:
                                    ((sue0) vu8Var.I).h(SummaryAnalytics$ModalType.Default, wudVar2.b.c, (SummaryAnalytics$ModalCloseReason) obj5);
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    compoundOptionSelectModalView.setOnDismissListener(new oxe(18, this));
                    w030Var.s(compoundOptionSelectModalView, true);
                    sue0 sue0Var = (sue0) this.I;
                    SummaryAnalytics$ModalType summaryAnalytics$ModalType = SummaryAnalytics$ModalType.Default;
                    String str2 = wudVar.b.c;
                    ArrayList arrayList = b.c;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((tud) it.next()).a);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (!((tud) obj5).g) {
                            arrayList3.add(obj5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((tud) it2.next()).a);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (((tud) obj2).f) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    tud tudVar = (tud) obj2;
                    List singletonList = Collections.singletonList(new vcv0(tudVar != null ? tudVar.a : null, arrayList2, arrayList4));
                    mi31 mi31Var = wudVar.a;
                    sue0Var.j(summaryAnalytics$ModalType, str2, singletonList, mi31Var.f, mi31Var.b, mi31Var.g);
                    break;
                }
            case 2:
                bpi bpiVar = (bpi) obj;
                g580 g580Var = (g580) this.H;
                k kVar = (k) ((wiq0) this.F);
                pex0 m = kVar.m();
                if (m == null || (str = m.b) == null) {
                    str = "";
                }
                pex0 m2 = kVar.m();
                if (m2 != null) {
                    String str3 = bpiVar.c;
                    Iterator it4 = m2.f().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj3 = it4.next();
                            lmw0 lmw0Var = (lmw0) obj3;
                            if (!jl40.l(lmw0Var.getName(), str3) || !(lmw0Var instanceof jmw0)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    if (!(obj3 instanceof jmw0)) {
                        obj3 = null;
                    }
                    jmw0 jmw0Var = (jmw0) obj3;
                    if (jmw0Var != null) {
                        x8 x8Var = (x8) g580Var;
                        api apiVar = new api(x8Var.d, (ynj0) this.G);
                        w3i w3iVar = (w3i) this.I;
                        w3iVar.getClass();
                        zgf zgfVar = new zgf(5, w3iVar, apiVar);
                        Context context = (Context) w3iVar.c;
                        q5z.h(context);
                        tt2 tt2Var = (tt2) w3iVar.b;
                        q5z.h(tt2Var);
                        ijj0 h = zgfVar.h();
                        x xVar = new x(apiVar, zgfVar.h());
                        pwy0 pwy0Var = (pwy0) w3iVar.w;
                        q5z.h(pwy0Var);
                        iev0 iev0Var = (iev0) w3iVar.z;
                        q5z.h(iev0Var);
                        wiq0 wiq0Var = (wiq0) w3iVar.A;
                        q5z.h(wiq0Var);
                        UsualOptionSelectorView usualOptionSelectorView = new UsualOptionSelectorView(context, new qv21(tt2Var, h, xVar, pwy0Var, iev0Var, wiq0Var));
                        usualOptionSelectorView.updateRequirement(jmw0Var);
                        Activity activity = (Activity) this.E;
                        Iterator it5 = x8Var.d.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                Object next = it5.next();
                                if (jl40.l(((b580) next).a, jmw0Var.getName())) {
                                    obj4 = next;
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        DeliverySelectRequirementDialog deliverySelectRequirementDialog = new DeliverySelectRequirementDialog(activity, new bpi(bpiVar.a, bpiVar.b, bpiVar.c, obj4 != null), usualOptionSelectorView);
                        usualOptionSelectorView.setListener(new wwf(this, str, deliverySelectRequirementDialog));
                        deliverySelectRequirementDialog.show();
                        pj pjVar = (pj) ((yzh) this.J).a;
                        pjVar.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                        pjVar.a.a("DeliverySelectorDialog.Shown", hashMap, 1, new HashMap());
                        String str4 = bpiVar.c;
                        ArrayList arrayList5 = jmw0Var.s().c;
                        String str5 = str;
                        deliverySelectRequirementDialog.setBackButtonClickListener(new gn(apiVar, this, str5, arrayList5, x8Var.d, deliverySelectRequirementDialog, str4, 2));
                        deliverySelectRequirementDialog.setNextButtonClickListener(new zoi(apiVar, this, str4, str5, arrayList5, deliverySelectRequirementDialog, 0));
                        break;
                    }
                }
                break;
            default:
                final String str6 = "ScootersPlusWidget";
                fva0.f((fva0) this.F, "ScootersPlusWidget", PerformanceAnalytics$Type.Inflate, 0L, 4);
                View inflate = LayoutInflater.from((Context) this.E).inflate(srh0.scooters_plus_home_modal_view, (ViewGroup) null, false);
                if (inflate != null) {
                    final GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
                    final cxq0 a2 = ((z49) ((fko0) this.G).b.get()).a(goFrameLayout, CashbackScreenSource.SCOOTERS, "scooters");
                    WeakHashMap weakHashMap = b.a;
                    if (goFrameLayout.isAttachedToWindow()) {
                        a2.D();
                    } else {
                        goFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.plushome.ScootersPlusHomeRouter$provideView$lambda$0$0$0$$inlined$doOnAttach$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view) {
                                goFrameLayout.removeOnAttachStateChangeListener(this);
                                ((cxq0) a2).D();
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view) {
                            }
                        });
                    }
                    this.J = a2;
                    ((xzm0) this.H).a.attach(goFrameLayout);
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ?? r3 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.plushome.ScootersPlusHomeRouter$provideView$$inlined$wrapJankStats$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v) {
                            View rootView = goFrameLayout.getRootView();
                            Object tag = rootView.getTag(t9h0.metricsStateHolder);
                            if (tag == null) {
                                tag = new xva0();
                                rootView.setTag(t9h0.metricsStateHolder, tag);
                            }
                            yuf0 yuf0Var = ((xva0) tag).a;
                            if (yuf0Var != null) {
                                yuf0Var.I(str6);
                            }
                            View view = goFrameLayout;
                            T t = ref$ObjectRef.element;
                            view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v) {
                        }
                    };
                    ref$ObjectRef.element = r3;
                    goFrameLayout.addOnAttachStateChangeListener(r3);
                    this.I = goFrameLayout;
                    break;
                } else {
                    ny61.t("rootView");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu8(Context context, fva0 fva0Var, fko0 fko0Var, xzm0 xzm0Var) {
        super(null);
        this.D = 3;
        this.E = context;
        this.F = fva0Var;
        this.G = fko0Var;
        this.H = xzm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu8(Context context, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(null);
        this.D = i;
        this.E = context;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }
}
