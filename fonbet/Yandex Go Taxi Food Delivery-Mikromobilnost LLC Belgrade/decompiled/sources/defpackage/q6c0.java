package defpackage;

import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.Size;
import androidx.camera.video.g;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.h;
import androidx.camera.video.internal.encoder.j;
import androidx.fragment.app.FragmentActivity;
import com.adjust.sdk.Constants;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.zxing.ResultMetadataType;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarView;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$OfferItem;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$Section;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import com.yandex.go.shortcuts.dto.response.VerticalStack;
import com.yandex.go.shortcuts.dto.response.d1;
import com.yandex.go.shortcuts.dto.response.m1;
import com.yandex.go.shortcuts.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.r1;
import com.yandex.go.shortcuts.dto.response.t1;
import com.yandex.go.shortcuts.impl.interactors.FallbackShortcutModelFactory$FallbackType;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.RadioButtonView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group.RadioGroupView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechPollerResultResult;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechPollerResultStrategy;
import com.ybsdk.core.utils.poller.PollerAnalyticsReporter$PollerResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final class q6c0 implements uub0, t65, ajy, iqs, jg5, izn, xyn {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;

    public q6c0(zuj0 zuj0Var, z6k0 z6k0Var) {
        this.a = 29;
        this.b = zuj0Var;
        this.c = z6k0Var;
        this.w = a.b(LazyThreadSafetyMode.NONE, new vyf0(24, this));
    }

    public static ListBuilder H(p3j0 p3j0Var) {
        ListBuilder a = rcc.a();
        a.add(SharedPaymentAnalytics$Button.DONE);
        a.add(SharedPaymentAnalytics$Button.BACK);
        a.add(SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
        if (!p3j0Var.f.isEmpty()) {
            a.add(SharedPaymentAnalytics$Button.FREQUENCY_SELECTED);
        }
        return a.j();
    }

    public static ListBuilder I(oor0 oor0Var) {
        ListBuilder a = rcc.a();
        a.add(SharedPaymentAnalytics$Button.BACK);
        a.add(SharedPaymentAnalytics$Button.ACCOUNT_NAME);
        if (oor0Var.k) {
            a.add(SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
        }
        if (oor0Var.j) {
            a.add(SharedPaymentAnalytics$Button.LIMIT);
        }
        a.add(SharedPaymentAnalytics$Button.DELETE_ACCOUNT);
        if (oor0Var.h) {
            a.add(SharedPaymentAnalytics$Button.DONE);
        }
        return a.j();
    }

    @Override // defpackage.uub0
    public i2c0 A(Object obj) {
        return ((i5c0) this.c).p(obj);
    }

    @Override // defpackage.uub0
    public f2c0 B(r7c r7cVar) {
        com.yandex.go.places.map.ui.configs.cluster.a aVar = (com.yandex.go.places.map.ui.configs.cluster.a) this.w;
        aVar.getClass();
        ArrayList arrayList = r7cVar.c;
        return new lb51(new p6c0(aVar, r7cVar.b, r7cVar.a, r7cVar.e, arrayList));
    }

    @Override // defpackage.xyn
    public void C(pyn pynVar) {
        boolean z;
        b84 b84Var = (b84) this.c;
        g gVar = (g) this.w;
        if (gVar.D != null) {
            try {
                gVar.M(pynVar, b84Var);
                pynVar.close();
                return;
            } catch (Throwable th) {
                if (pynVar != null) {
                    try {
                        pynVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (gVar.s) {
            sgb1.g(3, "Recorder");
            pynVar.close();
            return;
        }
        oyn oynVar = gVar.X;
        if (oynVar != null) {
            oynVar.close();
            gVar.X = null;
            z = true;
        } else {
            z = false;
        }
        if (!pynVar.O()) {
            if (z) {
                sgb1.g(3, "Recorder");
            }
            sgb1.g(3, "Recorder");
            j jVar = gVar.G;
            jVar.i.execute(new bzn(jVar, 4));
            pynVar.close();
            return;
        }
        gVar.X = pynVar;
        if (!gVar.n() || !gVar.Y.f()) {
            sgb1.g(3, "Recorder");
            gVar.E(b84Var);
        } else if (z) {
            sgb1.g(3, "Recorder");
        } else {
            sgb1.g(3, "Recorder");
        }
    }

    @Override // defpackage.t65
    public PointF D(Object obj, c3c0 c3c0Var) {
        return ((nw70) this.b).D(obj, c3c0Var);
    }

    @Override // defpackage.t65
    public f2c0 E(Object obj, boolean z) {
        return ((nw70) this.b).E(obj, z);
    }

    public void F(int i, RadioButtonView radioButtonView, a6i0 a6i0Var, el11 el11Var) {
        if (jl40.l(radioButtonView, (RadioButtonView) this.w)) {
            return;
        }
        radioButtonView.getCheckableContainer().setActivated(true);
        radioButtonView.getIndicatorImageView().setActivated(true);
        RadioButtonView radioButtonView2 = (RadioButtonView) this.w;
        if (radioButtonView2 != null) {
            radioButtonView2.getCheckableContainer().setActivated(false);
            radioButtonView2.getIndicatorImageView().setActivated(false);
        }
        this.w = radioButtonView;
        k8f0 productExpandTexts = ((RadioGroupView) this.b).getProductExpandTexts();
        j8f0 j8f0Var = a6i0Var.b;
        q6a1.d(productExpandTexts.getProductTexts(), j8f0Var.a);
        productExpandTexts.getExpandTextView().setText(productExpandTexts.getView().getContext().getString(j8f0Var.b.a(zyh0.PlusAcquisition_ButtonSection_Radio_TextForExpand)));
        bb1.L(productExpandTexts.getExpandTextView(), j8f0Var.c);
        com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a aVar = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a) el11Var.b;
        pzc0 pzc0Var = (pzc0) aVar.l.get(Integer.valueOf(i));
        if (pzc0Var != null) {
            aVar.a(pzc0Var);
            aVar.g = pzc0Var;
        }
    }

    public void G(p3j0 p3j0Var, SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button) {
        ListBuilder H = H(p3j0Var);
        pj pjVar = (pj) this.w;
        ArrayList arrayList = new ArrayList(tcc.n(H, 10));
        ListIterator listIterator = H.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        pjVar.a.a("ExpenditureReportCard.Tapped", hashMap, 1, new HashMap());
    }

    public List J() {
        return (List) this.b;
    }

    public List K() {
        return (List) this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mzn L(int i) {
        Size size;
        izn iznVar = (izn) this.b;
        HashMap hashMap = (HashMap) this.w;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (mzn) hashMap.get(Integer.valueOf(i));
        }
        mzn mznVar = null;
        if (iznVar.s(i)) {
            mzn o = iznVar.o(i);
            Objects.requireNonNull(o);
            Iterator it = ((a73) this.c).c(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                    if (i == 4) {
                        size = new Size(640, 480);
                    } else if (i == 5) {
                        size = new Size(960, 720);
                    } else if (i == 6) {
                        size = new Size(1440, 1080);
                    }
                }
            }
            if (size == null) {
                mznVar = o;
            } else {
                ArrayList arrayList = new ArrayList();
                for (lzn lznVar : o.d()) {
                    arrayList.add(new f64(lznVar.d(), lznVar.h(), lznVar.b(), lznVar.e(), size.getWidth(), size.getHeight(), lznVar.i(), lznVar.a(), lznVar.c(), lznVar.f()));
                }
                if (!arrayList.isEmpty()) {
                    mznVar = kzn.e(o.c(), o.a(), o.b(), arrayList);
                }
            }
        }
        hashMap.put(Integer.valueOf(i), mznVar);
        return mznVar;
    }

    public void M(String str, oor0 oor0Var, SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button) {
        ListBuilder I = I(oor0Var);
        b1 b1Var = (b1) this.c;
        ArrayList arrayList = new ArrayList(tcc.n(I, 10));
        ListIterator listIterator = I.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            } else {
                arrayList.add(((SharedPaymentAnalytics$Button) qqyVar.next()).getAnalyticsName());
            }
        }
        String analyticsName = sharedPaymentAnalytics$Button.getAnalyticsName();
        SharedAccount o = ((fga0) this.b).o(str);
        String str2 = o != null ? o.b : null;
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", arrayList);
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        if (str2 != null) {
            hashMap.put(ClidProvider.STATE, str2);
        }
        b1Var.a.a("GroupAccountSettingsCard.Tapped", hashMap, 1, new HashMap());
    }

    public d4s0 N(ezs ezsVar, yaf0 yaf0Var) {
        ProductMode$Taxi productMode$Taxi;
        ArrayList arrayList;
        ArrayList arrayList2;
        ProductMode$Taxi productMode$Taxi2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List list;
        nc6 nc6Var;
        Iterator it;
        e6v e6vVar;
        List singletonList;
        unr0.C(new Object[]{ezsVar.e}, 1, "SC: mapToModel mapToModelsResponse - models: %s", jst.e);
        ProductsResponse productsResponse = ezsVar.b;
        ProductMode$Taxi productMode$Taxi3 = (ProductMode$Taxi) ((t1) kotlin.collections.a.R(adc.D(productsResponse.b, ProductMode$Taxi.class)));
        if (productMode$Taxi3 == null) {
            if (yaf0Var == yaf0.b) {
                return new d4s0(null, ezsVar.e, null, null, null, null, null, null, null, false, 4093);
            }
            u1n u1nVar = (u1n) this.c;
            u9p u9pVar = (u9p) u1nVar.b;
            zuj0 zuj0Var = u9pVar.b;
            ArrayList a = ((gzs) u1nVar.c).a(ezsVar);
            FallbackShortcutModelFactory$FallbackType fallbackShortcutModelFactory$FallbackType = FallbackShortcutModelFactory$FallbackType.ROUTE_ONLY;
            s9p s9pVar = u9pVar.a;
            Layout layout = Layout.e;
            f1z f1zVar = ezsVar.e;
            int i = t9p.a[fallbackShortcutModelFactory$FallbackType.ordinal()];
            if (i == 1) {
                singletonList = Collections.singletonList(s9pVar.a(layout));
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                avj0 avj0Var = (avj0) zuj0Var;
                avj0 avj0Var2 = (avj0) zuj0Var;
                singletonList = scc.g(s9pVar.a(layout), u9pVar.a(3, 2), u9pVar.a(3, 2), new t3s0(tje.u(36, avj0Var.a), avj0Var.a(mqg0.component_ever_back), 4, true), u9pVar.a(3, 1), u9pVar.a(3, 1), new t3s0(tje.u(36, avj0Var2.a), avj0Var2.a(mqg0.component_ever_back), 4, true), u9pVar.a(4, 5), u9pVar.a(2, 5));
            }
            List list2 = singletonList;
            zzs zzsVar = ezsVar.d;
            yaf0 yaf0Var2 = ezsVar.c;
            EmptyList emptyList = EmptyList.a;
            return new d4s0(layout, f1zVar, a, list2, zzsVar, yaf0Var2, null, emptyList, emptyList, true, 3136);
        }
        ProductsCommon$OfferItem productsCommon$OfferItem = productMode$Taxi3.b;
        Layout layout2 = productMode$Taxi3.a;
        sue0 sue0Var = (sue0) this.b;
        ProductMode$Taxi productMode$Taxi4 = (ProductMode$Taxi) ((t1) kotlin.collections.a.R(adc.D(productsResponse.b, ProductMode$Taxi.class)));
        if (productMode$Taxi4 != null) {
            List list3 = productMode$Taxi4.b.a;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : list3) {
                if (((ur60) obj).n == OfferType.TAXI_EXPECTED_DESTINATION) {
                    arrayList5.add(obj);
                }
            }
            r0 r0Var = ((ta4) sue0Var.b).a;
            r0Var.getClass();
            r0Var.m(null, arrayList5);
        }
        gzs gzsVar = (gzs) this.w;
        com.yandex.go.shortcuts.impl.view.adapter.model.a aVar = gzsVar.a;
        Layout layout3 = layout2 == null ? Layout.e : layout2;
        ArrayList a2 = gzsVar.a(ezsVar);
        Map k = aVar.k(productMode$Taxi3, productsResponse, BaseShortcutModel$Source.HEADER);
        Map k2 = aVar.k(productMode$Taxi3, productsResponse, BaseShortcutModel$Source.ITEMS);
        List<VerticalStack> list4 = productsCommon$OfferItem.d;
        int d = gw00.d(tcc.n(list4, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (VerticalStack verticalStack : list4) {
            Pair pair = new Pair(verticalStack.a, aVar.s(verticalStack, layout3));
            linkedHashMap.put(pair.c(), pair.f());
        }
        ArrayList arrayList6 = new ArrayList();
        List list5 = productMode$Taxi3.c;
        List list6 = productMode$Taxi3.d;
        ArrayList arrayList7 = new ArrayList(tcc.n(list6, 10));
        for (Iterator it2 = list6.iterator(); it2.hasNext(); it2 = it) {
            m1 m1Var = (m1) it2.next();
            if (m1Var instanceof ProductMode$Taxi.TopScreenRoundButton) {
                ProductMode$Taxi.TopScreenRoundButton topScreenRoundButton = (ProductMode$Taxi.TopScreenRoundButton) m1Var;
                it = it2;
                e6vVar = new rwz0(topScreenRoundButton.d, topScreenRoundButton.a, topScreenRoundButton.b, layout2.c, topScreenRoundButton.c);
            } else {
                it = it2;
                if (m1Var instanceof ProductMode$Taxi.TopScreenIconButton) {
                    ProductMode$Taxi.TopScreenIconButton topScreenIconButton = (ProductMode$Taxi.TopScreenIconButton) m1Var;
                    e6vVar = new fwz0(topScreenIconButton.d, topScreenIconButton.a, topScreenIconButton.b, layout2.c, topScreenIconButton.c);
                } else {
                    if (!(m1Var instanceof r1)) {
                        w511.b();
                        return null;
                    }
                    e6vVar = d221.f;
                }
            }
            arrayList7.add(e6vVar);
        }
        String str = layout2.c;
        List list7 = productMode$Taxi3.e;
        String str2 = str;
        ArrayList arrayList8 = new ArrayList(tcc.n(list7, 10));
        Iterator it3 = list7.iterator();
        while (it3.hasNext()) {
            d1 d1Var = (d1) it3.next();
            Iterator it4 = it3;
            if (d1Var instanceof ProductMode$Taxi.BottomScreenRoundButton) {
                ProductMode$Taxi.BottomScreenRoundButton bottomScreenRoundButton = (ProductMode$Taxi.BottomScreenRoundButton) d1Var;
                list = list5;
                nc6Var = new ge6(bottomScreenRoundButton.e, bottomScreenRoundButton.d, bottomScreenRoundButton.a, bottomScreenRoundButton.b, str2, bottomScreenRoundButton.c == ProductMode$Taxi.BottomItemAlign.LEFT ? 8388611 : 8388613);
            } else {
                list = list5;
                if (d1Var instanceof ProductMode$Taxi.BottomScreenIconButton) {
                    ProductMode$Taxi.BottomScreenIconButton bottomScreenIconButton = (ProductMode$Taxi.BottomScreenIconButton) d1Var;
                    String str3 = str2;
                    nc6Var = new mc6(bottomScreenIconButton.c == ProductMode$Taxi.BottomItemAlign.LEFT ? 8388611 : 8388613, bottomScreenIconButton.b, bottomScreenIconButton.e, bottomScreenIconButton.d, bottomScreenIconButton.a, str3);
                    str2 = str3;
                } else {
                    if (!(d1Var instanceof q1)) {
                        w511.b();
                        return null;
                    }
                    nc6Var = q121.h;
                }
            }
            arrayList8.add(nc6Var);
            it3 = it4;
            list5 = list;
        }
        List list8 = list5;
        if (list8.isEmpty()) {
            List values = k.values();
            Collection<e6v> collection = values;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                for (e6v e6vVar2 : collection) {
                    if ((e6vVar2 instanceof ebu) && (((ebu) e6vVar2).b.k instanceof Action$RouteInput)) {
                        int i2 = layout3.b;
                        ga5 ga5Var = (ga5) e6vVar2;
                        if (ga5Var.getBase().a > 0 && ga5Var.getBase().b > 0 && ga5Var.getBase().a <= i2) {
                            break;
                        }
                    }
                }
            }
            values = Collections.singletonList(gzsVar.b.a(layout3));
            arrayList6.addAll(values);
            arrayList6.add(rbu.a);
            arrayList6.addAll(k2.values());
            productMode$Taxi = productMode$Taxi3;
            arrayList = arrayList8;
            arrayList2 = arrayList7;
        } else {
            Iterator it5 = list8.iterator();
            ProductsCommon$Section productsCommon$Section = null;
            while (it5.hasNext()) {
                ProductsCommon$Section productsCommon$Section2 = (ProductsCommon$Section) it5.next();
                if (productsCommon$Section != null) {
                    arrayList6.add(aVar.q(productsCommon$Section, productsCommon$Section2));
                }
                ProductMode$Taxi.SectionHeader sectionHeader = productsCommon$Section2.e;
                List list9 = productsCommon$Section2.b;
                Iterator it6 = it5;
                ProductMode$Taxi.SectionType sectionType = productsCommon$Section2.a;
                if (sectionHeader != null) {
                    arrayList6.add(aVar.p(sectionHeader, productsCommon$Section2.b()));
                }
                SectionTypedHeader sectionTypedHeader = productsCommon$Section2.f;
                if (sectionTypedHeader != null) {
                    arrayList6.add(com.yandex.go.shortcuts.impl.view.adapter.model.a.r(sectionTypedHeader, productsCommon$Section2.b()));
                }
                switch (fzs.a[sectionType.ordinal()]) {
                    case 1:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        jst.e.q("Unsupported section type found");
                        break;
                    case 2:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        arrayList6.addAll(com.yandex.go.shortcuts.impl.view.adapter.model.a.i(k, productsCommon$Section2));
                        break;
                    case 3:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        arrayList6.addAll(com.yandex.go.shortcuts.impl.view.adapter.model.a.i(k2, productsCommon$Section2));
                        break;
                    case 4:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        arrayList6.add(com.yandex.go.shortcuts.impl.view.adapter.model.a.o(k2, productsCommon$Section2));
                        break;
                    case 5:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        arrayList6.add(aVar.j(linkedHashMap, productsCommon$Section2));
                        break;
                    case 6:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        arrayList6.addAll(com.yandex.go.shortcuts.impl.view.adapter.model.a.h(linkedHashMap, productsCommon$Section2));
                        break;
                    case 7:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        arrayList6.add(aVar.u(layout3, productsCommon$OfferItem.c, productsCommon$Section2.c));
                        break;
                    case 8:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        arrayList6.addAll(com.yandex.go.shortcuts.impl.view.adapter.model.a.i(k2, productsCommon$Section2));
                        break;
                    case 9:
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList7;
                        arrayList6.addAll(com.yandex.go.shortcuts.impl.view.adapter.model.a.i(k2, productsCommon$Section2));
                        break;
                    case 10:
                        jsq0 jsq0Var = productsCommon$Section2.g;
                        List list10 = list9;
                        ArrayList arrayList9 = new ArrayList();
                        arrayList3 = arrayList8;
                        int i3 = 0;
                        for (Object obj2 : list10) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                scc.m();
                                throw null;
                            }
                            ArrayList arrayList10 = arrayList7;
                            Object obj3 = (e6v) k2.get((String) obj2);
                            ProductMode$Taxi productMode$Taxi5 = productMode$Taxi3;
                            if (obj3 instanceof lsy) {
                                obj3 = lsy.v((lsy) obj3, null, null, scc.f(list9) == i3, jsq0Var.contains(ProductMode$Taxi.SectionTag.NAV_SECTION_WIDTH), productsCommon$Section2.a, 63);
                            } else if (obj3 instanceof ga5) {
                                obj3 = ((ga5) obj3).r(jsq0Var.contains(ProductMode$Taxi.SectionTag.NAV_SECTION_WIDTH), sectionType);
                            }
                            if (obj3 != null) {
                                arrayList9.add(obj3);
                            }
                            productMode$Taxi3 = productMode$Taxi5;
                            i3 = i4;
                            arrayList7 = arrayList10;
                        }
                        productMode$Taxi2 = productMode$Taxi3;
                        arrayList4 = arrayList7;
                        arrayList6.addAll(arrayList9);
                        break;
                    default:
                        w511.b();
                        return null;
                }
                it5 = it6;
                productsCommon$Section = productsCommon$Section2;
                productMode$Taxi3 = productMode$Taxi2;
                arrayList7 = arrayList4;
                arrayList8 = arrayList3;
            }
            productMode$Taxi = productMode$Taxi3;
            arrayList = arrayList8;
            arrayList2 = arrayList7;
            if (productsCommon$Section != null) {
                arrayList6.add(aVar.q(productsCommon$Section, productsCommon$Section));
            }
        }
        int i5 = layout2.b;
        ArrayList arrayList11 = new ArrayList();
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            Object next = it7.next();
            e6v e6vVar3 = (e6v) next;
            if (e6vVar3 instanceof ga5) {
                ga5 ga5Var2 = (ga5) e6vVar3;
                if (ga5Var2.getBase().a > 0 && ga5Var2.getBase().b > 0 && ga5Var2.getBase().a <= i5) {
                }
            }
            arrayList11.add(next);
        }
        return new d4s0(layout3, ezsVar.e, a2, arrayList11, ezsVar.d, ezsVar.c, productMode$Taxi.g, arrayList2, arrayList, false, HProv.ALG_TYPE_GR3410);
    }

    public void O(ResultMetadataType resultMetadataType, Object obj) {
        if (((EnumMap) this.w) == null) {
            this.w = new EnumMap(ResultMetadataType.class);
        }
        ((EnumMap) this.w).put((EnumMap) resultMetadataType, (ResultMetadataType) obj);
    }

    public void P() {
        f580 f580Var = (f580) this.b;
        String b = ((roj0) this.w).b();
        xcv0 xcv0Var = f580Var.c;
        String str = f580Var.a.a.V;
        String g = f580Var.g();
        HashMap m = nnm.m(xcv0Var, "vertical_id", str);
        if (b != null) {
            m.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, b);
        }
        xcv0Var.a.a("Summary.Requirements.ExtraPhone", m, 1, tse0.r("summary_state", m, g));
    }

    public void Q(long j) {
        fcy0 fcy0Var = ((AppAnalyticsReporter) this.c).m0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("interval_ms", Integer.valueOf((int) j));
        fcy0Var.a.a("tech.poller.interval", linkedHashMap);
    }

    public void R(PollerAnalyticsReporter$PollerResult pollerAnalyticsReporter$PollerResult, double d, int i) {
        TechEvents$TechPollerResultResult techEvents$TechPollerResultResult;
        lyd0 lyd0Var = (lyd0) this.w;
        fcy0 fcy0Var = ((AppAnalyticsReporter) this.c).m0;
        int i2 = kyd0.a[pollerAnalyticsReporter$PollerResult.ordinal()];
        if (i2 == 1) {
            techEvents$TechPollerResultResult = TechEvents$TechPollerResultResult.FINISHED;
        } else if (i2 == 2) {
            techEvents$TechPollerResultResult = TechEvents$TechPollerResultResult.CANCELLED;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            techEvents$TechPollerResultResult = TechEvents$TechPollerResultResult.TIMEOUT;
        }
        String str = (String) this.b;
        double d2 = lyd0Var.b;
        double e = e3n.e(lyd0Var.a);
        double e2 = e3n.e(lyd0Var.c);
        Double valueOf = lyd0Var.d != null ? Double.valueOf(e3n.e(r8.a)) : null;
        TechEvents$TechPollerResultStrategy techEvents$TechPollerResultStrategy = lyd0Var.e;
        Double valueOf2 = Double.valueOf(e);
        Double valueOf3 = Double.valueOf(e2);
        Double valueOf4 = Double.valueOf(d2);
        Integer valueOf5 = Integer.valueOf(i);
        LinkedHashMap w = g8e.w(9, "endpoint", str);
        w.put(TarifficatorScenarioActivity.RESULT_KEY, techEvents$TechPollerResultResult.getOriginalValue());
        w.put("duration_ms", Double.valueOf(d));
        if (valueOf != null) {
            w.put("initital_delay_ms", valueOf);
        }
        w.put("base_ms", valueOf2);
        w.put("cap_ms", valueOf3);
        w.put("factor", valueOf4);
        w.put("strategy", techEvents$TechPollerResultStrategy.getOriginalValue());
        w.put("attempt", valueOf5);
        fcy0Var.a.a("tech.poller.result", w);
    }

    public void S(String str) {
        gri griVar;
        Object value = ((e) this.c).e.a.getValue();
        t701 t701Var = value instanceof t701 ? (t701) value : null;
        Object obj = (t701Var == null || (griVar = t701Var.a) == null) ? null : griVar.i;
        LinkedHashMap l = b.l(new Pair("order_key", ((ufe0) this.w).a));
        if (obj != null) {
            l.put(Constants.REFERRER_API_META, obj);
        }
        jwh jwhVar = (jwh) this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("DeliveryMetrics", l);
        jwhVar.a.o(str, null, linkedHashMap);
    }

    public void T(i9s0 i9s0Var) {
        mjv mjvVar = ((njv) this.w).b;
        mjvVar.getClass();
        mjvVar.a.a("InAppCalls.CollapsedCallStatusBar.Show", new HashMap(), 1, new HashMap());
        t270 t270Var = (t270) this.c;
        t270Var.a.l(new s270((String) this.b, i9s0Var.a, i9s0Var.b));
    }

    @Override // defpackage.ajy
    public void a(float f, float f2, float f3, float f4) {
        ((ges0) this.b).a(f, f2, f3, f4);
        ((ges0) this.c).a(f, f2, f3, f4);
    }

    @Override // defpackage.ajy
    public Shader b() {
        return (Shader) ((i3y) this.w).getValue();
    }

    @Override // defpackage.ajy
    public void c(float f) {
        ((ges0) this.b).c(f);
        ((ges0) this.c).c(f);
    }

    @Override // defpackage.t65
    public i2c0 d(Object obj) {
        return ((nw70) this.b).d(obj);
    }

    @Override // defpackage.xyn
    public void e(EncodeException encodeException) {
        ((androidx.concurrent.futures.b) this.b).d(encodeException);
    }

    @Override // defpackage.t65
    public PointF f(Object obj, c3c0 c3c0Var) {
        return ((nw70) this.b).f(obj, c3c0Var);
    }

    @Override // defpackage.uub0
    public f2c0 g(ArrayList arrayList) {
        com.yandex.go.places.map.ui.configs.cluster.a aVar = (com.yandex.go.places.map.ui.configs.cluster.a) this.w;
        aVar.getClass();
        r7c c = com.yandex.go.places.map.ui.configs.cluster.a.c(arrayList);
        ArrayList arrayList2 = c.c;
        return new lb51(new p6c0(aVar, "supercluster", c.a, c.e, arrayList2));
    }

    @Override // defpackage.t65
    public i2c0 h(Object obj, c3c0 c3c0Var) {
        return ((nw70) this.b).h(obj, c3c0Var);
    }

    @Override // defpackage.ajy
    public void i(float f) {
        ((ges0) this.b).i(f);
        ((ges0) this.c).i(f);
    }

    @Override // defpackage.t65
    public f2c0 j(Object obj, c3c0 c3c0Var) {
        return ((nw70) this.b).j(obj, c3c0Var);
    }

    @Override // defpackage.t65
    public f2c0 k(Object obj, boolean z) {
        return ((nw70) this.b).k(obj, z);
    }

    @Override // defpackage.xyn
    public void l() {
        ((androidx.concurrent.futures.b) this.b).b(null);
    }

    @Override // defpackage.t65
    public List m(Object obj) {
        return ((nw70) this.b).m(obj);
    }

    @Override // defpackage.t65
    public i2c0 n(Object obj, c3c0 c3c0Var) {
        return ((nw70) this.b).n(obj, c3c0Var);
    }

    @Override // defpackage.izn
    public mzn o(int i) {
        return L(i);
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        ((androidx.camera.view.a) this.w).e = null;
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ar7) this.c).f((uo7) it.next());
        }
        arrayList.clear();
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        ((androidx.camera.view.a) this.w).e = null;
    }

    @Override // defpackage.t65
    public PointF p(Object obj) {
        return ((i5c0) ((nw70) this.b).b).b(obj);
    }

    @Override // defpackage.uub0
    public i2c0 q(Object obj) {
        return ((i5c0) this.c).r(obj);
    }

    @Override // defpackage.t65
    public f2c0 r(Object obj) {
        return ((nw70) this.b).r(obj);
    }

    @Override // defpackage.izn
    public boolean s(int i) {
        return ((izn) this.b).s(i) && L(i) != null;
    }

    @Override // defpackage.t65
    public PointF t(Object obj) {
        return ((nw70) this.b).t(obj);
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.t65
    public f2c0 u(Object obj, c3c0 c3c0Var) {
        return ((nw70) this.b).u(obj, c3c0Var);
    }

    @Override // defpackage.uub0
    public i2c0 v(r7c r7cVar) {
        return ((com.yandex.go.places.map.ui.configs.cluster.a) this.w).d(r7cVar);
    }

    @Override // defpackage.xyn
    public void w(h hVar) {
        ((g) this.w).H = hVar;
    }

    @Override // defpackage.uub0
    public i2c0 x(ArrayList arrayList) {
        com.yandex.go.places.map.ui.configs.cluster.a aVar = (com.yandex.go.places.map.ui.configs.cluster.a) this.w;
        aVar.getClass();
        return aVar.d(com.yandex.go.places.map.ui.configs.cluster.a.c(arrayList));
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        FragmentActivity fragmentActivity;
        if ((ig5Var instanceof ztf0) && (fragmentActivity = (FragmentActivity) ((rbs) this.b).a()) != null) {
            fragmentActivity.runOnUiThread(new ud30(22, fragmentActivity, ig5Var, this));
        }
    }

    @Override // defpackage.t65
    public PointF z(Object obj) {
        return ((nw70) this.b).z(obj);
    }

    public /* synthetic */ q6c0(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public q6c0(RadioGroupView radioGroupView, c6i0 c6i0Var) {
        this.a = 20;
        this.b = radioGroupView;
        this.c = c6i0Var;
    }

    public q6c0(fva0 fva0Var) {
        this.a = 1;
        this.b = fva0Var;
        this.w = PerformanceAnalytics$Type.Time;
    }

    public /* synthetic */ q6c0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj2;
        this.w = obj3;
        this.b = obj;
    }

    public q6c0(ges0 ges0Var, ges0 ges0Var2) {
        this.a = 7;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        this.b = ges0Var;
        this.c = ges0Var2;
        this.w = a.a(new r0d0(16, this));
    }

    public q6c0(o2y0 o2y0Var, c cVar, ngg0 ngg0Var, tt2 tt2Var) {
        this.a = 18;
        this.b = o2y0Var;
        this.c = cVar;
        this.w = tt2Var;
    }

    public q6c0(rbs rbsVar) {
        this.a = 15;
        this.b = rbsVar;
    }

    public q6c0(PlacesSearchbarView placesSearchbarView, dfc0 dfc0Var) {
        this.a = 3;
        this.b = placesSearchbarView;
        this.c = dfc0Var;
        this.w = ArgbEvaluatorCompat.getInstance();
    }

    public q6c0(rte0 rte0Var, sls slsVar, sls slsVar2, tls tlsVar) {
        this.a = 11;
        this.b = slsVar;
        this.c = slsVar2;
        this.w = tlsVar;
    }

    public q6c0(izn iznVar, a73 a73Var) {
        this.a = 19;
        this.w = new HashMap();
        this.b = iznVar;
        this.c = a73Var;
    }

    public q6c0(String str, wzj0[] wzj0VarArr) {
        this.a = 28;
        this.b = str;
        this.c = wzj0VarArr;
        this.w = null;
    }
}
