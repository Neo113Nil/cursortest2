package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.beginners.safety.name.domain.model.SafetyNameInputScreenState$Type;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.navigator.events.f;
import com.yandex.go.scooters.packages.upsale_on_book.ScootersPackagesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.scooters.passes.active.v3.renew.menu.c;
import com.yandex.go.scooters.passes.active.v3.renew.menu.d;
import com.yandex.go.scooters.passes.data.model.ScootersPackagesLegalTermsExperiment;
import com.yandex.go.scooters.passes.purchase.packages.h;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineView;
import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.c8o0;
import defpackage.iun0;
import defpackage.n12;
import defpackage.tje;
import defpackage.wao0;
import defpackage.xsm0;
import defpackage.ygi0;
import defpackage.zy11;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;
import ru.yandex.taxi.widget.SlideableBindingModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class zdk0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ zdk0(SlideableBindingModalView slideableBindingModalView, View view, View view2, vkn0 vkn0Var) {
        this.a = 23;
        this.b = slideableBindingModalView;
        this.c = view;
        this.w = view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 updateDriverSubtitle$lambda$0$2;
        Object value;
        zy11 themeSelectionDelegate$lambda$9$lambda$8;
        tpr d;
        tpr d2;
        int i = this.a;
        int i2 = 23;
        int i3 = 8;
        int i4 = 5;
        int i5 = 3;
        int i6 = 2;
        String str = null;
        final int i7 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i8 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                hpf0 hpf0Var = (hpf0) obj3;
                g gVar = (g) obj2;
                fpf0 fpf0Var = (fpf0) obj;
                wrs0 wrs0Var = (wrs0) ((Ref$ObjectRef) obj4).element;
                if (wrs0Var != null) {
                    String str2 = (String) a.R(fpf0Var.a().e);
                    if (str2 == null) {
                        str2 = "none";
                    }
                    gVar.b(str2, wrs0Var);
                }
                hpf0Var.a(fpf0Var);
                break;
            case 1:
                updateDriverSubtitle$lambda$0$2 = RideCardDriverSectionView.updateDriverSubtitle$lambda$0$2((yzx) obj4, (RideCardDriverSectionView) obj3, (CharSequence) obj2, (Animator) obj);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                RideCardTimelineView rideCardTimelineView = new RideCardTimelineView(((ViewGroup) obj).getContext(), (bts0) obj4, (pav) obj3, (ytz) obj2);
                rideCardTimelineView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                break;
            case 5:
                f fVar = (f) obj3;
                tls tlsVar = (tls) obj2;
                RoadEventsLayer createRoadEventsLayer = ((MapKit) obj4).createRoadEventsLayer(fVar.d.getValue().getMapWindow(), fVar.e, (RoadEventsManager) obj);
                for (EventTag eventTag : EventTag.values()) {
                    createRoadEventsLayer.setRoadEventVisible(eventTag, false);
                }
                tlsVar.invoke(createRoadEventsLayer);
                break;
            case 6:
                ((k1l0) obj4).F.a((o2y0) obj3, (RouteChangeType) obj2);
                ((sy60) obj).a();
                break;
            case 7:
                sy60 sy60Var = (sy60) obj;
                ci70 ci70Var = ((k1l0) obj4).H;
                String str3 = ((o2y0) obj3).b().a;
                ci70Var.getClass();
                int i9 = bi70.e[((RouteChangeWarning) obj2).ordinal()];
                ci70Var.b.a(ci70Var.b(str3), i9 != 1 ? i9 != 2 ? "changeDestination" : "changeMidPoint" : "addMidPoint", "declined");
                sy60Var.a();
                break;
            case 8:
                String str4 = (String) obj;
                ((oz40) obj2).setValue(str4);
                ((wls) obj4).invoke(str4, ((txq) obj3).a);
                break;
            case 9:
                break;
            case 10:
                oy7 oy7Var = (oy7) obj4;
                aye0 aye0Var = (aye0) obj3;
                vvl0 vvl0Var = (vvl0) obj2;
                awl0 awl0Var = (awl0) obj;
                com.yandex.go.beginners.safety.name.ui.a aVar = (com.yandex.go.beginners.safety.name.ui.a) oy7Var.J;
                tse o = oy7Var.o();
                if (awl0Var instanceof zvl0) {
                    String str5 = ((zvl0) awl0Var).a;
                    pzt0 pzt0Var = aVar.d;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    aVar.d = null;
                    aVar.c.getClass();
                    boolean a = pwl0.a(str5);
                    r0 r0Var = vvl0Var.a;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new uvl0(a ? SafetyNameInputScreenState$Type.INPUT_STATE : SafetyNameInputScreenState$Type.VALIDATION_ERROR_STATE, str5)));
                } else if (awl0Var instanceof wvl0) {
                    aVar.a(o, aye0Var, vvl0Var);
                } else if (awl0Var instanceof yvl0) {
                    epl0 epl0Var = aVar.b;
                    epl0Var.getClass();
                    epl0Var.a.a("SafeNewbies.NameInput.Skipped", new HashMap(), 1, new HashMap());
                    ((oy7) aye0Var.b).r(new z0l0(i2));
                } else if (!(awl0Var instanceof xvl0)) {
                    aVar.getClass();
                    w511.b();
                    break;
                } else {
                    aVar.a(o, aye0Var, vvl0Var);
                }
                break;
            case 11:
                j1m0 j1m0Var = (j1m0) obj4;
                o1m0 o1m0Var = (o1m0) obj2;
                hz40 hz40Var = j1m0Var.b;
                if (hz40Var.a(obj3)) {
                    w511.f(qv10.p("Key ", " was used multiple times ", obj3));
                    break;
                } else {
                    j1m0Var.a.remove(obj3);
                    hz40Var.o(obj3, o1m0Var);
                    break;
                }
            case 12:
                x4c.g("Can't change theme of savings account", (Throwable) obj, scc.g((String) obj4, (String) obj3), null, 8);
                ((com.ybsdk.feature.savings.internal.helpers.a) obj2).d.c(unr0.h(Text.Companion, dzh0.ybsdk_savings_theme_change_failed_title), new Text.Resource(dzh0.ybsdk_common_error_try_again));
                break;
            case 13:
                n70 n70Var = (n70) obj;
                qa3 qa3Var = new qa3(l5m0.a, new lum(new t1m0(objArr == true ? 1 : 0, 15), g5m0.a, new i1m0(9), h5m0.a));
                w561 w561Var = (w561) n70Var.N;
                w561Var.b.setHasFixedSize(true);
                RecyclerView recyclerView = w561Var.b;
                recyclerView.setAdapter(qa3Var);
                recyclerView.addOnScrollListener(new k5m0((sls) obj4));
                recyclerView.addItemDecoration(new jw00(0, rje.d(iwg0.ybsdk_savings_account_interest_month_spacing, n70Var.P), 0, new i1m0(i3), 5));
                w561Var.a.setOnClickListener(new f5m0(n70Var, (wls) obj3, 0));
                n70Var.W(new vxj0(i2, n70Var, qa3Var));
                n70Var.a0(new h4m0(1, n70Var, (tls) obj2));
                break;
            case 14:
                n70 n70Var2 = (n70) obj;
                ((s561) n70Var2.N).b.setOnClickListener(new os3(i4, n70Var2, (tls) obj4));
                n70Var2.W(new p70(n70Var2, (wls) obj3, i8));
                n70Var2.a0(new h4m0(i6, n70Var2, (tls) obj2));
                break;
            case 15:
                p6m0 p6m0Var = (p6m0) obj4;
                Date date = (Date) obj3;
                String str6 = (String) obj2;
                i6m0 i6m0Var = (i6m0) obj;
                if (p6m0Var.B.getDate() == null || !jl40.l(p6m0Var.B.getDate(), date)) {
                    break;
                } else {
                    break;
                }
            case 16:
                themeSelectionDelegate$lambda$9$lambda$8 = SavingsAccountThemeSelectorView.themeSelectionDelegate$lambda$9$lambda$8((n70) obj4, (Context) obj3, (SavingsAccountThemeSelectorView) obj2, (List) obj);
                break;
            case 17:
                n70 n70Var3 = (n70) obj4;
                ((f561) n70Var3.N).b.setClickListener((zls) obj3);
                ocm0 c = ((scm0) n70Var3.Z()).c();
                f561 f561Var = (f561) n70Var3.N;
                f561Var.b.setBackgroundFetcher((z2m0) ((tls) obj2).invoke(((scm0) n70Var3.Z()).b()));
                f561Var.b.render(c);
                break;
            case 18:
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) obj4;
                n70 n70Var4 = (n70) obj3;
                tja1.b(shimmerFrameLayout);
                exa1.e(shimmerFrameLayout, new tai0(12, n70Var4, (lbb0) obj2));
                a361 a361Var = (a361) n70Var4.N;
                if (((phm0) n70Var4.Z()).g) {
                    xty0.f(a361Var.e, ung0.ybColor_textIcon_primary);
                } else {
                    xty0.f(a361Var.e, ung0.ybColor_textIcon_secondary);
                }
                TextView textView = a361Var.e;
                TextView textView2 = a361Var.d;
                textView.setText(((phm0) n70Var4.Z()).d);
                textView2.setText(((phm0) n70Var4.Z()).e);
                String str7 = ((phm0) n70Var4.Z()).e;
                if (str7 != null && str7.length() != 0) {
                    i3 = 0;
                }
                textView2.setVisibility(i3);
                v4b1.k(((phm0) n70Var4.Z()).f, a361Var.c, null, null, 6);
                b.y(shimmerFrameLayout, ((phm0) n70Var4.Z()).g && ((phm0) n70Var4.Z()).l);
                if (((phm0) n70Var4.Z()).k) {
                    shimmerFrameLayout.startShimmer();
                    break;
                } else {
                    shimmerFrameLayout.stopShimmer();
                    break;
                }
                break;
            case 19:
                final ygi0 ygi0Var = (ygi0) obj4;
                dtm0 dtm0Var = (dtm0) obj3;
                final c cVar = (c) obj2;
                final yfd yfdVar = (yfd) obj;
                final usm0 usm0Var = new usm0();
                final msm0 msm0Var = new msm0(ygi0Var);
                avm0 avm0Var = ((ksm0) ((agd) yfdVar).a).a;
                tpr a2 = dtm0Var.b.a();
                g92 g92Var = new g92(i6, avm0Var);
                d = dtm0Var.c.d(null, true);
                tpr t = e.t(new d(new tpr[]{a2, g92Var, d, usm0Var.b, usm0Var.a, e.d(((com.yandex.go.scooters.passes.data.b) dtm0Var.d).b)}, dtm0Var));
                dtm0Var.a.getClass();
                agd agdVar = (agd) yfdVar;
                agdVar.c = e.F(t, uyj.a);
                agdVar.e = new tls() { // from class: com.yandex.go.scooters.passes.active.v3.renew.menu.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        tje.N(ygi0.this.o(), null, null, new ScootersActivePassesV3RenewMenuRouter$content$1$1$1(cVar, (xsm0) obj5, yfdVar, usm0Var, msm0Var, null), 3);
                        return zy11.a;
                    }
                };
                pbd.a.getClass();
                agdVar.g = pbd.b;
                break;
            case 20:
                ru.yandex.taxi.scooters.presentation.ontheway.completion.a.Q((ru.yandex.taxi.scooters.presentation.ontheway.completion.a) obj2, true, new y5o0((zuo0) obj4), ((n6o) obj3).a.getNearestParkingGeo(), null, false, (ScootersErrorCode) obj, 24);
                break;
            case 21:
                nan0 nan0Var = (nan0) obj4;
                cma1.M(nan0Var.j().k);
                cma1.I((View) obj);
                ru.yandex.taxi.design.utils.c.z(new tmm0(14, nan0Var, (rbo0) obj2), (GoFrameLayout) obj3);
                break;
            case 22:
                ru.yandex.taxi.scooters.presentation.finish_info.e eVar = (ru.yandex.taxi.scooters.presentation.finish_info.e) obj4;
                eVar.A((m950) eVar.M.get(), new zbn0(((ymn0) obj2).b, ((imn0) obj3).f == FeedbackSettingsParams$Screen.FINISH_CARD), new dnn0((sls) obj));
                break;
            case 23:
                SlideableBindingModalView slideableBindingModalView = (SlideableBindingModalView) obj4;
                View view = (View) obj3;
                View view2 = (View) obj2;
                t1w t1wVar = (t1w) obj;
                if (!t1wVar.f) {
                    slideableBindingModalView.setTopSystemWindowInset(t1wVar.b);
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), t1wVar.g);
                    if (view.getHeight() > 0) {
                        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), view.getHeight());
                        break;
                    } else {
                        OneShotPreDrawListener.add(view, new do91(13, view, view2));
                        break;
                    }
                }
                break;
            case 24:
                ((klo0) obj).B0((String) obj4, (String) obj3, (ScootersQrNumberResultSource) obj2);
                break;
            case 25:
                final iun0 iun0Var = (iun0) obj4;
                q8o0 q8o0Var = (q8o0) obj3;
                final com.yandex.go.scooters.passes.purchase.packages.g gVar2 = (com.yandex.go.scooters.passes.purchase.packages.g) obj2;
                final yfd yfdVar2 = (yfd) obj;
                final x7o0 x7o0Var = new x7o0();
                String str8 = ((p7o0) ((agd) yfdVar2).a).b;
                if (str8 == null) {
                    z8o0 z8o0Var = (z8o0) a.R(((p7o0) ((agd) yfdVar2).a).a.f);
                    if (z8o0Var != null) {
                        str = z8o0Var.a;
                    }
                } else {
                    str = str8;
                }
                r0 r0Var2 = x7o0Var.a;
                r0Var2.l(str);
                final q7o0 q7o0Var = new q7o0(iun0Var);
                agd agdVar2 = (agd) yfdVar2;
                b9o0 b9o0Var = ((p7o0) agdVar2.a).a;
                tpr a3 = q8o0Var.b.a();
                g92 g92Var2 = new g92(i6, b9o0Var);
                d2 = q8o0Var.d.d(null, true);
                d3a d3aVar = q8o0Var.f;
                ScootersPackagesLegalTermsExperiment.Companion.getClass();
                tpr t2 = e.t(new h(new tpr[]{a3, g92Var2, r0Var2, x7o0Var.b, d2, com.yandex.go.scooters.utils.a.a(d3aVar, ScootersPackagesLegalTermsExperiment.g), e.d(((com.yandex.go.scooters.passes.data.b) q8o0Var.e).b)}, q8o0Var));
                q8o0Var.a.getClass();
                agdVar2.c = e.F(t2, uyj.a);
                agdVar2.e = new tls() { // from class: com.yandex.go.scooters.passes.purchase.packages.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        tje.N(iun0.this.o(), null, null, new ScootersPackagesPurchaseRouter$content$1$1$1(gVar2, (c8o0) obj5, yfdVar2, q7o0Var, x7o0Var, null), 3);
                        return zy11.a;
                    }
                };
                icd.a.getClass();
                agdVar2.g = icd.b;
                break;
            case 26:
                final n12 n12Var = (n12) obj4;
                zao0 zao0Var = (zao0) obj3;
                final xao0 xao0Var = (xao0) obj2;
                yfd yfdVar3 = (yfd) obj;
                final jao0 jao0Var = new jao0(n12Var);
                final dbo0 dbo0Var = ((iao0) ((agd) yfdVar3).a).a;
                agd agdVar3 = (agd) yfdVar3;
                agdVar3.c = e.F(e.t(e.X(zao0Var.a.a(), new ScootersPackagesUpsaleOnBookUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, dbo0Var, zao0Var))), uyj.a);
                agdVar3.e = new tls() { // from class: com.yandex.go.scooters.packages.upsale_on_book.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        tje.N(n12.this.o(), null, null, new ScootersPackagesUpsaleOnBookRouter$content$1$1$1(xao0Var, (wao0) obj5, jao0Var, dbo0Var, null), 3);
                        return zy11.a;
                    }
                };
                kcd.a.getClass();
                agdVar3.g = kcd.b;
                break;
            case 27:
                final xho0 xho0Var = (xho0) obj4;
                Set set = (Set) obj3;
                final iio0 iio0Var = (iio0) obj2;
                ru.yandex.taxi.scooters.presentation.common.ui.camera.a aVar2 = (ru.yandex.taxi.scooters.presentation.common.ui.camera.a) obj;
                f2b f2bVar = xho0Var.c;
                kdd0 kdd0Var = xho0Var.e;
                aVar2.a((CameraLayer) f2bVar.get(), null);
                ScootersExamType scootersExamType = ScootersExamType.SELFIE;
                if (set.contains(scootersExamType)) {
                    xho0Var.a(aVar2, wfz.G, new wls() { // from class: who0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj5, Object obj6) {
                            int i10 = i7;
                            zy11 zy11Var2 = zy11.a;
                            iio0 iio0Var2 = iio0Var;
                            xho0 xho0Var2 = xho0Var;
                            ru.yandex.taxi.scooters.presentation.common.ui.camera.a aVar3 = (ru.yandex.taxi.scooters.presentation.common.ui.camera.a) obj5;
                            ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar4 = (ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a) obj6;
                            switch (i10) {
                                case 0:
                                    aVar3.a(xho0Var2.d.l(ScootersExamType.SELFIE, aVar4, iio0Var2), null);
                                    break;
                                default:
                                    aVar3.a(xho0Var2.d.l(ScootersExamType.PASSPORT, aVar4, iio0Var2), null);
                                    break;
                            }
                            return zy11Var2;
                        }
                    });
                    aVar2.a(kdd0Var.c(scootersExamType, set, iio0Var), null);
                }
                ScootersExamType scootersExamType2 = ScootersExamType.PASSPORT;
                if (set.contains(scootersExamType2)) {
                    xho0Var.a(aVar2, new cfv(objArr2 == true ? 1 : 0), new wls() { // from class: who0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj5, Object obj6) {
                            int i10 = i8;
                            zy11 zy11Var2 = zy11.a;
                            iio0 iio0Var2 = iio0Var;
                            xho0 xho0Var2 = xho0Var;
                            ru.yandex.taxi.scooters.presentation.common.ui.camera.a aVar3 = (ru.yandex.taxi.scooters.presentation.common.ui.camera.a) obj5;
                            ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar4 = (ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a) obj6;
                            switch (i10) {
                                case 0:
                                    aVar3.a(xho0Var2.d.l(ScootersExamType.SELFIE, aVar4, iio0Var2), null);
                                    break;
                                default:
                                    aVar3.a(xho0Var2.d.l(ScootersExamType.PASSPORT, aVar4, iio0Var2), null);
                                    break;
                            }
                            return zy11Var2;
                        }
                    });
                    aVar2.a(kdd0Var.c(scootersExamType2, set, iio0Var), null);
                    break;
                }
                break;
            case 28:
                ((muo0) obj).n1(new s6k0((List) obj4, (pxm0) ((fcj0) obj3).d, new p2n0((zzs) obj2)));
                break;
            default:
                yto0 yto0Var = (yto0) obj4;
                j311 j311Var = yto0Var.y;
                MapWindow mapWindow = ((TaxiMapView) obj3).getMapWindow();
                j311Var.a.getClass();
                new i311(mapWindow, (x0o0) obj, (Navigation) obj2, null).b(new iin0(28, yto0Var), true);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ zdk0(p9y0 p9y0Var, g gVar, Object obj, int i) {
        this.a = i;
        this.b = p9y0Var;
        this.w = gVar;
        this.c = obj;
    }

    public /* synthetic */ zdk0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
