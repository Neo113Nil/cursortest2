package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.design.BatteryChargeViewV2;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalCloseReason;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.OrganizationCardFlexModalView;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarView;
import com.yandex.go.shortcuts.impl.view.adapter.PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout;
import com.yandex.go.shortcuts.impl.view.adapter.n;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.x;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.PlusPanelTextWithIconView;
import com.yandex.xplat.payment.sdk.AvailableMethods;
import com.yandex.xplat.payment.sdk.PaymentDetails;
import com.ybsdk.core.design.spoiler.Spoiler;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.pfm.internal.ui.b;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public final /* synthetic */ class ww90 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ww90(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        Set linkedHashSet;
        Set set;
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        zy11 _init_$lambda$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                CompositePaymentIconsView.update$default((CompositePaymentIconsView) obj, (m1a0) obj3, (z0a0) obj2, true, null, 8, null);
                return zy11Var;
            case 1:
                o9a0 o9a0Var = (o9a0) obj3;
                List list = (List) obj2;
                AvailableMethods availableMethods = (AvailableMethods) obj;
                int size = list.size();
                int size2 = list.size();
                int min = size >= 0 ? Math.min(size, size2) : size + size2;
                return o9a0Var.b(1 < min ? new ArrayList(a.v0(y6i0.n(1, min), list)) : new ArrayList(), availableMethods);
            case 2:
                n891.n(new b700(18, (wga0) obj3, (PaymentDetails) obj, (p370) obj2));
                return zy11Var;
            case 3:
                return Long.valueOf(((nsa0) obj3).h.e((oll0) obj, (wra0) obj2));
            case 4:
                return Long.valueOf(((nsa0) obj3).b.e((oll0) obj, (osa0) obj2));
            case 5:
                return Long.valueOf(((eta0) obj3).b.e((oll0) obj, (dta0) obj2));
            case 6:
                ((k5b0) obj3).b.c((oll0) obj, (ArrayList) obj2);
                return zy11Var;
            case 7:
                ((q5b0) obj3).b.c((oll0) obj, (ArrayList) obj2);
                return zy11Var;
            case 8:
                return Long.valueOf(((t5b0) obj3).b.e((oll0) obj, (u5b0) obj2));
            case 9:
                ((BatteryChargeViewV2) obj3).setChargeLevel(((cl4) obj2).d, (CharSequence) obj);
                return zy11Var;
            case 10:
                return new n((PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout) obj, (sxr0) obj3, (y5b0) ((l2s0) obj2).invoke());
            case 11:
                j7b0 j7b0Var = (j7b0) obj3;
                String str2 = (String) obj2;
                w3j0 w3j0Var = (w3j0) obj;
                np40 np40Var = j7b0Var.g;
                String str3 = j7b0Var.h;
                String str4 = j7b0Var.b;
                r7 = np40Var != null && np40Var.b;
                str = r7 ? "multiclass" : null;
                if (str == null || evu0.J(str)) {
                    str = str4;
                }
                w3j0Var.d(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                LinkedHashMap linkedHashMap = w3j0Var.a;
                r9 = r7 ? np40Var != null ? np40Var.c : null : null;
                if (r9 == null || evu0.J(r9)) {
                    r9 = str3;
                }
                linkedHashMap.put("vertical", r9);
                w3j0Var.d(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str4);
                w3j0Var.d("vertical", str3);
                linkedHashMap.put("save_trigger", str2);
                return w3j0Var;
            case 12:
                iq90 iq90Var = (iq90) obj3;
                String str5 = (String) obj2;
                w3j0 w3j0Var2 = (w3j0) obj;
                np40 np40Var2 = iq90Var.l;
                char c = (np40Var2 == null || !np40Var2.b) ? (char) 0 : (char) 1;
                str = c == 0 ? null : "multiclass";
                if (str == null || evu0.J(str)) {
                    str = iq90Var.h;
                }
                w3j0Var2.d(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                r9 = c != 0 ? np40Var2 != null ? np40Var2.c : null : null;
                if (r9 == null || evu0.J(r9)) {
                    r9 = iq90Var.m;
                }
                w3j0Var2.d("vertical", r9);
                w3j0Var2.a.put("save_trigger", str5);
                return w3j0Var2;
            case 13:
                return Long.valueOf(((y7b0) obj3).b.e((oll0) obj, (z7b0) obj2));
            case 14:
                n70 n70Var = (n70) obj3;
                l261 l261Var = (l261) n70Var.N;
                xty0.d(l261Var.b, ((nab0) n70Var.Z()).d);
                xty0.e(l261Var.b, ((nab0) n70Var.Z()).e);
                SwitchCompat switchCompat = l261Var.c;
                switchCompat.setChecked(((nab0) n70Var.Z()).f);
                switchCompat.setOnCheckedChangeListener(new hab0(r8, (eab0) obj2, n70Var));
                exa1.e(l261Var.a, new d5b0(r7 ? 1 : 0, l261Var));
                return zy11Var;
            case 15:
                final n70 n70Var2 = (n70) obj3;
                final eab0 eab0Var = (eab0) obj2;
                k261 k261Var = (k261) n70Var2.N;
                CheckBoxView checkBoxView = k261Var.b;
                TextView textView = k261Var.g;
                boolean z = ((dab0) n70Var2.Z()).h;
                CheckBoxView checkBoxView2 = k261Var.b;
                checkBoxView.setChecked(z, checkBoxView2.getChecked() != ((dab0) n70Var2.Z()).h);
                exa1.e(k261Var.a, new View.OnClickListener() { // from class: iab0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = r3;
                        n70 n70Var3 = n70Var2;
                        eab0 eab0Var2 = eab0Var;
                        switch (i2) {
                            case 0:
                                eab0Var2.invoke(n70Var3.Z(), Boolean.valueOf(!((dab0) n70Var3.Z()).h));
                                break;
                            default:
                                eab0Var2.invoke(n70Var3.Z(), Boolean.valueOf(!((dab0) n70Var3.Z()).h));
                                break;
                        }
                    }
                });
                final int i2 = r7 ? 1 : 0;
                checkBoxView2.setOnClickListener(new View.OnClickListener() { // from class: iab0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i22 = i2;
                        n70 n70Var3 = n70Var2;
                        eab0 eab0Var2 = eab0Var;
                        switch (i22) {
                            case 0:
                                eab0Var2.invoke(n70Var3.Z(), Boolean.valueOf(!((dab0) n70Var3.Z()).h));
                                break;
                            default:
                                eab0Var2.invoke(n70Var3.Z(), Boolean.valueOf(!((dab0) n70Var3.Z()).h));
                                break;
                        }
                    }
                });
                v4b1.k(((dab0) n70Var2.Z()).d, k261Var.c, null, null, 6);
                xty0.d(textView, ((dab0) n70Var2.Z()).e);
                xty0.e(textView, ((dab0) n70Var2.Z()).f);
                edb0 edb0Var = ((dab0) n70Var2.Z()).g;
                Object[] objArr = (edb0Var instanceof bdb0) && d.c(((bdb0) edb0Var).b);
                char c2 = ((edb0Var instanceof adb0) && d.c(((adb0) edb0Var).c)) ? (char) 1 : (char) 0;
                FrameLayout frameLayout = k261Var.f;
                SpoilerTextView spoilerTextView = k261Var.e;
                TextView textView2 = k261Var.d;
                frameLayout.setVisibility((objArr == true || c2 != 0) ? 0 : 8);
                textView2.setVisibility(objArr != false ? 0 : 8);
                spoilerTextView.setVisibility(c2 != 0 ? 0 : 8);
                if (!(edb0Var instanceof ddb0) && edb0Var != null) {
                    if (edb0Var instanceof bdb0) {
                        bdb0 bdb0Var = (bdb0) edb0Var;
                        xty0.d(textView2, bdb0Var.b);
                        ColorModel colorModel = bdb0Var.a;
                        if (colorModel != null) {
                            xty0.e(textView2, colorModel);
                        }
                    } else {
                        if (!(edb0Var instanceof adb0)) {
                            w511.b();
                            return null;
                        }
                        adb0 adb0Var = (adb0) edb0Var;
                        xty0.d(spoilerTextView, adb0Var.c);
                        ColorModel colorModel2 = adb0Var.d;
                        if (colorModel2 == null) {
                            colorModel2 = Spoiler.e;
                        }
                        SpoilerTextView.updateSpoilerState$default(spoilerTextView, colorModel2, false, 2, null);
                    }
                }
                return zy11Var;
            case 16:
                n70 n70Var3 = (n70) obj;
                n70Var3.W(new th40(r6, n70Var3, (fbb0) obj3, (fbb0) obj2));
                return zy11Var;
            case 17:
                vcb0 vcb0Var = (vcb0) obj3;
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) obj2;
                wcb0 wcb0Var = (wcb0) obj;
                if ((vcb0Var instanceof tcb0) || (vcb0Var instanceof ucb0)) {
                    return wcb0.a(wcb0Var, null, null, null, null, null, linkedHashSet2, null, null, 447);
                }
                if (vcb0Var instanceof scb0) {
                    return wcb0.a(wcb0Var, null, null, null, null, ((scb0) vcb0Var).e, linkedHashSet2, null, null, 415);
                }
                w511.b();
                return null;
            case 18:
                vcb0 vcb0Var2 = (vcb0) obj3;
                b bVar = (b) obj2;
                wcb0 wcb0Var2 = (wcb0) obj;
                Set set2 = wcb0Var2.g;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : set2) {
                    if (!jl40.l(((vcb0) obj4).a(), vcb0Var2.a())) {
                        arrayList3.add(obj4);
                    }
                }
                Set N0 = a.N0(a.o0(arrayList3, vcb0Var2));
                bVar.J.b(N0);
                return wcb0.a(wcb0Var2, null, null, null, null, null, N0, null, null, 447);
            case 19:
                b bVar2 = (b) obj3;
                wcb0 wcb0Var3 = (wcb0) obj;
                Set<vcb0> set3 = wcb0Var3.g;
                Set set4 = ((r9b0) obj2).c;
                if (set3.isEmpty()) {
                    linkedHashSet = set3;
                } else {
                    Set set5 = set4;
                    int d = gw00.d(tcc.n(set5, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(d >= 16 ? d : 16);
                    for (Object obj5 : set5) {
                        linkedHashMap2.put(new tab0(((j4r) obj5).a), obj5);
                    }
                    linkedHashSet = new LinkedHashSet();
                    for (vcb0 vcb0Var3 : set3) {
                        j4r j4rVar = (j4r) linkedHashMap2.get(new tab0(vcb0Var3.a()));
                        if (j4rVar != null) {
                            if (!(vcb0Var3 instanceof scb0) && !(vcb0Var3 instanceof tcb0)) {
                                if (!(vcb0Var3 instanceof ucb0)) {
                                    w511.b();
                                    return null;
                                }
                                s4r s4rVar = j4rVar.e;
                                r4r r4rVar = s4rVar instanceof r4r ? (r4r) s4rVar : null;
                                q4r q4rVar = r4rVar != null ? r4rVar.c : null;
                                ucb0 ucb0Var = (ucb0) vcb0Var3;
                                Set set6 = ucb0Var.b;
                                p4r p4rVar = q4rVar instanceof p4r ? (p4r) q4rVar : null;
                                if (p4rVar != null) {
                                    Set set7 = p4rVar.a;
                                    set = new LinkedHashSet();
                                    Iterator it = set7.iterator();
                                    while (it.hasNext()) {
                                        set.add(new tab0(((o4r) it.next()).b));
                                    }
                                } else {
                                    set = null;
                                }
                                if (set == null) {
                                    set = EmptySet.a;
                                }
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                for (Object obj6 : set6) {
                                    if (set.contains(new tab0(((tab0) obj6).a))) {
                                        linkedHashSet3.add(obj6);
                                    }
                                }
                                vcb0Var3 = new ucb0(ucb0Var.a, linkedHashSet3);
                            }
                            linkedHashSet.add(vcb0Var3);
                        }
                    }
                }
                if (!set3.equals(linkedHashSet)) {
                    bVar2.J.b(linkedHashSet);
                }
                return wcb0.a(wcb0Var3, null, null, null, null, null, linkedHashSet, null, null, 415);
            case 20:
                oy80 oy80Var = (oy80) obj2;
                com.yandex.go.pickup_from_photo.navigation.b bVar3 = (com.yandex.go.pickup_from_photo.navigation.b) oy80Var.c;
                txb txbVar = (txb) obj;
                an8 an8Var = ((com.yandex.go.pickup_from_photo.navigation.b) obj3).I;
                ru.yandex.taxi.address.clarification.impl.repo.a aVar = (ru.yandex.taxi.address.clarification.impl.repo.a) an8Var.w;
                com.yandex.go.pickup_from_photo.data.b bVar4 = (com.yandex.go.pickup_from_photo.data.b) an8Var.c;
                if (jl40.l(txbVar, nxb.a)) {
                    bVar4.a();
                    bVar3.D((m950) bVar3.K.get(), new s71(((avj0) bVar3.J).h(kyh0.search_source_address_hint), PointType.SOURCE, false, false, true), new gnb0(bVar3, r8));
                } else if (jl40.l(txbVar, oxb.a)) {
                    aVar.m = true;
                    aVar.n = false;
                    bVar4.c();
                    bVar3.r(new fnb0(r8));
                } else if (jl40.l(txbVar, pxb.a)) {
                    ((com.yandex.go.clarify_address.a) ((kr0) an8Var.x)).c(true, AddressClarificationReason.Map);
                    aVar.m = true;
                    aVar.n = false;
                    bVar4.a();
                    pv0 pv0Var = (pv0) bVar4.e.i().orElse(null);
                    if (pv0Var != null) {
                        bVar3.r(new t71(pv0Var, 12));
                    } else {
                        bVar3.r(new fnb0(r8));
                    }
                } else if (jl40.l(txbVar, qxb.a)) {
                    aVar.m = true;
                    aVar.n = false;
                    ((dnb0) oy80Var.b).a.invoke();
                } else if (jl40.l(txbVar, sxb.a)) {
                    bVar3.A((m950) bVar3.L.get(), new mbe0(r9, r7), new com.yandex.go.pickup_from_photo.navigation.a(bVar3, r8));
                } else {
                    if (!jl40.l(txbVar, rxb.a)) {
                        w511.b();
                        return null;
                    }
                    ((umb0) an8Var.b).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
                    bVar3.r(new fnb0(r7 ? 1 : 0));
                }
                return zy11Var;
            case 21:
                epb0 epb0Var = (epb0) obj3;
                c cVar = (c) obj2;
                j41 j41Var = (j41) obj;
                if (j41Var instanceof f41) {
                    epb0Var.a(new uob0(((f41) j41Var).a));
                    if (!cVar.R().u()) {
                        cVar.U();
                    }
                    ((com.yandex.go.pickup_from_photo.data.b) cVar.S.getValue()).a();
                } else if (jl40.l(j41Var, h41.a)) {
                    if (!((Boolean) e.d(cVar.H.f).a.getValue()).booleanValue()) {
                        cVar.H.m = true;
                        ((ny0) cVar.Q.b).a = true;
                    }
                    if (cVar.T().u()) {
                        cVar.T().i();
                        cVar.G.d(PhotoPickUpAnalytics$FoundModalCloseReason.Map);
                    }
                    if (cVar.R().u()) {
                        cVar.R().i();
                    }
                } else if (!jl40.l(j41Var, g41.a)) {
                    if (!jl40.l(j41Var, i41.a)) {
                        w511.b();
                        return null;
                    }
                    cVar.U();
                } else if (cVar.R().u()) {
                    cVar.R().i();
                }
                return zy11Var;
            case 22:
                return Long.valueOf(((s2c0) obj3).b.e((oll0) obj, (t2c0) obj2));
            case 23:
                return Long.valueOf(((x2c0) obj3).b.e((oll0) obj, (y2c0) obj2));
            case 24:
                com.yandex.go.places.impl.navigation.discovery.map.a aVar2 = (com.yandex.go.places.impl.navigation.discovery.map.a) obj3;
                xl80 xl80Var = (xl80) obj2;
                r0 r0Var = aVar2.V.a;
                do {
                    value = r0Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj7 : (List) value) {
                        if (!jl40.l(((bcc0) obj7).a, xl80Var)) {
                            arrayList.add(obj7);
                        }
                    }
                } while (!r0Var.k(value, arrayList));
                com.yandex.go.places.impl.navigation.discovery.map.a.i0(aVar2, qoi0.a(OrganizationCardFlexModalView.class));
                return zy11Var;
            case 25:
                com.yandex.go.places.impl.navigation.discovery.map.a aVar3 = (com.yandex.go.places.impl.navigation.discovery.map.a) obj3;
                yl80 yl80Var = (yl80) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                r0 r0Var2 = aVar3.V.a;
                do {
                    value2 = r0Var2.getValue();
                    arrayList2 = new ArrayList();
                    for (Object obj8 : (List) value2) {
                        if (!jl40.l(((bcc0) obj8).a, yl80Var)) {
                            arrayList2.add(obj8);
                        }
                    }
                } while (!r0Var2.k(value2, arrayList2));
                com.yandex.go.places.impl.navigation.discovery.map.a.i0(aVar3, qoi0.a(booleanValue ? OrganizationsListV2ModalView.class : OrganizationsModalView.class));
                return zy11Var;
            case 26:
                gec0 gec0Var = (gec0) obj3;
                uec0 uec0Var = (uec0) obj2;
                float floatValue = ((Float) obj).floatValue();
                q6c0 q6c0Var = gec0Var.c;
                dfc0 dfc0Var = (dfc0) q6c0Var.c;
                PlacesSearchbarView placesSearchbarView = (PlacesSearchbarView) q6c0Var.b;
                tec0 tec0Var = tec0.a;
                boolean l = jl40.l(uec0Var, tec0Var);
                sec0 sec0Var = sec0.a;
                if (l) {
                    float f = (0.100000024f * floatValue) + 0.9f;
                    float f2 = dfc0Var.c.c;
                    ViewParent parent = placesSearchbarView.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            r8 = marginLayoutParams.bottomMargin;
                        }
                    }
                    placesSearchbarView.setTranslationY((1.0f - floatValue) * (f2 + r8));
                    placesSearchbarView.setScaleX(f);
                    placesSearchbarView.setScaleY(f);
                } else {
                    if (!jl40.l(uec0Var, sec0Var)) {
                        w511.b();
                        return null;
                    }
                    placesSearchbarView.setTranslationX((1.0f - floatValue) * (xw31.n(placesSearchbarView.getContext()) ? -1 : 1) * (-(dfc0Var.d.a() + (placesSearchbarView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r13).getMarginStart() : 0))));
                }
                if (jl40.l(uec0Var, tec0Var)) {
                    v66 v66Var = (v66) gec0Var.b.c;
                    if (v66Var != null) {
                        v66Var.d(new zip(floatValue, r7 ? 1 : 0), null);
                    }
                } else {
                    if (!jl40.l(uec0Var, sec0Var)) {
                        w511.b();
                        return null;
                    }
                    gec0Var.d.a(floatValue, uec0Var);
                }
                return zy11Var;
            case 27:
                tyc0 tyc0Var = (tyc0) obj3;
                rh3 rh3Var = (rh3) obj2;
                if (tyc0Var.i) {
                    kg3 kg3Var = tyc0Var.c;
                    kg3Var.getClass();
                    z83.i();
                    Toast.makeText(kg3Var.a, oyh0.messaging_check_alis_error_unknown, 0).show();
                    ((sh3) rh3Var).e = new f22(26);
                }
                return zy11Var;
            case 28:
                z0d0 z0d0Var = (z0d0) obj2;
                AuthorizationUrlProperties.a aVar4 = (AuthorizationUrlProperties.a) ((x) obj);
                aVar4.a = (PassportUidImpl) obj3;
                aVar4.b = z0d0Var.b;
                aVar4.c = z0d0Var.c;
                return zy11Var;
            default:
                _init_$lambda$1 = PlusPanelTextWithIconView._init_$lambda$1((PlusPanelTextWithIconView) obj3, (Context) obj2, (TypedArray) obj);
                return _init_$lambda$1;
        }
    }
}
