package ru.yandex.taxi.logistics.ndd_route_selector.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ai50;
import defpackage.bi;
import defpackage.bi50;
import defpackage.bj50;
import defpackage.ch50;
import defpackage.cj50;
import defpackage.d43;
import defpackage.ddi;
import defpackage.eh50;
import defpackage.f1h0;
import defpackage.hi50;
import defpackage.ji50;
import defpackage.jl40;
import defpackage.kf60;
import defpackage.kyh0;
import defpackage.kyx;
import defpackage.lx4;
import defpackage.mi50;
import defpackage.mrg0;
import defpackage.nzg0;
import defpackage.pex0;
import defpackage.qje;
import defpackage.rh50;
import defpackage.sh50;
import defpackage.si50;
import defpackage.tje;
import defpackage.wi50;
import defpackage.wiq0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yi50;
import defpackage.zi50;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SegmentedComponent;
import ru.yandex.taxi.logistics.experiments.NddRouteType;
import ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorModalView;
import ru.yandex.taxi.logistics.ndd_route_selector.view.filters.DeliveryFloatFilterButtonComponent;
import ru.yandex.taxi.ui.DeliveryTooltipPopup;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class a implements wi50 {
    public final /* synthetic */ NddRouteSelectorModalView a;

    public a(NddRouteSelectorModalView nddRouteSelectorModalView) {
        this.a = nddRouteSelectorModalView;
    }

    @Override // defpackage.wi50
    public final void H0(zi50 zi50Var) {
        si50 binding;
        si50 binding2;
        si50 binding3;
        si50 binding4;
        int i;
        int i2;
        int i3;
        int i4;
        DeliveryFloatFilterButtonComponent deliveryFloatFilterButtonComponent;
        si50 binding5;
        si50 binding6;
        Object obj;
        bj50 bj50Var;
        SegmentedComponent routeSwitchSegment;
        Object obj2;
        rh50 rh50Var;
        si50 binding7;
        si50 binding8;
        DeliveryTooltipPopup deliveryTooltipPopup;
        si50 binding9;
        boolean isPvzNotFound;
        ai50 ai50Var;
        SegmentedComponent routeSwitchSegment2;
        View customTabView;
        DeliveryTooltipPopup deliveryTooltipPopup2;
        DeliveryTooltipPopup deliveryTooltipPopup3;
        si50 binding10;
        si50 binding11;
        si50 binding12;
        si50 binding13;
        si50 binding14;
        final yi50 yi50Var;
        bj50 bj50Var2;
        List list;
        SegmentedComponent routeSwitchSegment3;
        SegmentedComponent routeSwitchSegment4;
        SegmentedComponent routeSwitchSegment5;
        final yi50 yi50Var2;
        si50 binding15;
        si50 binding16;
        si50 binding17;
        int i5;
        int i6;
        int i7;
        si50 binding18;
        int i8;
        int i9;
        int i10;
        int i11;
        String str = zi50Var.h;
        kyx kyxVar = zi50Var.l;
        boolean z = zi50Var.f;
        boolean z2 = zi50Var.g;
        final NddRouteSelectorModalView nddRouteSelectorModalView = this.a;
        binding = nddRouteSelectorModalView.getBinding();
        binding.j.setTitle(str);
        boolean z3 = zi50Var.b;
        binding2 = nddRouteSelectorModalView.getBinding();
        binding2.i.setRoundedBackground(qje.t(xng0.controlMinor, nddRouteSelectorModalView.getContext()));
        final int i12 = 0;
        if (z3) {
            binding16 = nddRouteSelectorModalView.getBinding();
            binding16.i.setVisibility(0);
            binding17 = nddRouteSelectorModalView.getBinding();
            ListItemComponent listItemComponent = binding17.i;
            i5 = nddRouteSelectorModalView.smallMargin;
            Integer valueOf = Integer.valueOf(i5);
            i6 = nddRouteSelectorModalView.smallMargin;
            Integer valueOf2 = Integer.valueOf(i6);
            i7 = nddRouteSelectorModalView.smallMargin;
            xw31.E(listItemComponent, valueOf, valueOf2, 0, Integer.valueOf(i7));
            binding18 = nddRouteSelectorModalView.getBinding();
            ListItemComponent listItemComponent2 = binding18.d;
            i8 = nddRouteSelectorModalView.buttonSpacing;
            Integer valueOf3 = Integer.valueOf(i8);
            i9 = nddRouteSelectorModalView.smallMargin;
            Integer valueOf4 = Integer.valueOf(i9);
            i10 = nddRouteSelectorModalView.smallMargin;
            Integer valueOf5 = Integer.valueOf(i10);
            i11 = nddRouteSelectorModalView.smallMargin;
            xw31.E(listItemComponent2, valueOf3, valueOf4, valueOf5, Integer.valueOf(i11));
        } else {
            binding3 = nddRouteSelectorModalView.getBinding();
            binding3.i.setVisibility(8);
            binding4 = nddRouteSelectorModalView.getBinding();
            ListItemComponent listItemComponent3 = binding4.d;
            i = nddRouteSelectorModalView.smallMargin;
            Integer valueOf6 = Integer.valueOf(i);
            i2 = nddRouteSelectorModalView.smallMargin;
            Integer valueOf7 = Integer.valueOf(i2);
            i3 = nddRouteSelectorModalView.smallMargin;
            Integer valueOf8 = Integer.valueOf(i3);
            i4 = nddRouteSelectorModalView.smallMargin;
            xw31.E(listItemComponent3, valueOf6, valueOf7, valueOf8, Integer.valueOf(i4));
        }
        deliveryFloatFilterButtonComponent = nddRouteSelectorModalView.floatFilterButtonComponent;
        if (deliveryFloatFilterButtonComponent != null) {
            deliveryFloatFilterButtonComponent.setVisibility(z2 ? 0 : 8);
        }
        if (zi50Var.c) {
            binding15 = nddRouteSelectorModalView.getBinding();
            binding15.b.startProgressAnimation();
        } else {
            binding5 = nddRouteSelectorModalView.getBinding();
            binding5.b.stopProgressAnimation();
        }
        String str2 = zi50Var.a;
        String str3 = zi50Var.i;
        binding6 = nddRouteSelectorModalView.getBinding();
        ListItemComponent listItemComponent4 = binding6.b;
        final int i13 = 3;
        if (str2 == null) {
            listItemComponent4.setLeadImage(f1h0.ic_search_24dp);
            listItemComponent4.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, listItemComponent4.getContext()));
            listItemComponent4.setTitle(kyh0.delivery_ndd_empty_pod_placeholder);
            listItemComponent4.setSubtitle((CharSequence) null);
            listItemComponent4.setContentDescription(null);
            androidx.core.view.b.p(listItemComponent4, new bi(listItemComponent4.getContext().getString(kyh0.delivery_ndd_empty_address_action), 3));
        } else {
            listItemComponent4.setLeadImage(nzg0.ic_ndd_pvz_selection_dialog_icon);
            listItemComponent4.setTitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemComponent4.getContext()));
            listItemComponent4.setTitle(str3);
            listItemComponent4.setSubtitle(str2);
            listItemComponent4.setContentDescription(ru.yandex.taxi.design.utils.c.H(listItemComponent4, kyh0.delivery_ndd_selected_address_content, str2));
            androidx.core.view.b.p(listItemComponent4, new bi(listItemComponent4.getContext().getString(kyh0.delivery_ndd_selected_address_action), 3));
        }
        cj50 cj50Var = zi50Var.d;
        final int i14 = 1;
        if (jl40.l(cj50Var, cj50.c)) {
            bj50Var = null;
        } else {
            Iterator it = cj50Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if ((((bj50) obj).a == NddRouteType.SOURCE) == z) {
                        break;
                    }
                }
            }
            bj50Var = (bj50) obj;
        }
        List list2 = cj50Var.a;
        routeSwitchSegment = nddRouteSelectorModalView.getRouteSwitchSegment();
        routeSwitchSegment.setVisibility(!list2.isEmpty() ? 0 : 8);
        if (!list2.isEmpty()) {
            if (cj50Var.b) {
                Consumer consumer = new Consumer() { // from class: ui50
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        int i15 = i12;
                        NddRouteSelectorModalView nddRouteSelectorModalView2 = nddRouteSelectorModalView;
                        RobotoTextView robotoTextView = (RobotoTextView) obj3;
                        switch (i15) {
                            case 0:
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, nddRouteSelectorModalView2.getContext()), tje.x(nddRouteSelectorModalView2.getContext(), 16.0f)).b);
                                robotoTextView.setTextColor(qje.t(xng0.textMain, nddRouteSelectorModalView2.getContext()));
                                break;
                            case 1:
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, nddRouteSelectorModalView2.getContext()), tje.x(nddRouteSelectorModalView2.getContext(), 16.0f)).b);
                                robotoTextView.setTextColor(qje.t(xng0.textMinor, nddRouteSelectorModalView2.getContext()));
                                break;
                            case 2:
                                robotoTextView.setTextColor(qje.t(xng0.textMain, nddRouteSelectorModalView2.getContext()));
                                break;
                            default:
                                robotoTextView.setTextColor(qje.t(xng0.textMinor, nddRouteSelectorModalView2.getContext()));
                                break;
                        }
                    }
                };
                Consumer consumer2 = new Consumer() { // from class: ui50
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        int i15 = i14;
                        NddRouteSelectorModalView nddRouteSelectorModalView2 = nddRouteSelectorModalView;
                        RobotoTextView robotoTextView = (RobotoTextView) obj3;
                        switch (i15) {
                            case 0:
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, nddRouteSelectorModalView2.getContext()), tje.x(nddRouteSelectorModalView2.getContext(), 16.0f)).b);
                                robotoTextView.setTextColor(qje.t(xng0.textMain, nddRouteSelectorModalView2.getContext()));
                                break;
                            case 1:
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, nddRouteSelectorModalView2.getContext()), tje.x(nddRouteSelectorModalView2.getContext(), 16.0f)).b);
                                robotoTextView.setTextColor(qje.t(xng0.textMinor, nddRouteSelectorModalView2.getContext()));
                                break;
                            case 2:
                                robotoTextView.setTextColor(qje.t(xng0.textMain, nddRouteSelectorModalView2.getContext()));
                                break;
                            default:
                                robotoTextView.setTextColor(qje.t(xng0.textMinor, nddRouteSelectorModalView2.getContext()));
                                break;
                        }
                    }
                };
                bj50Var2 = bj50Var;
                list = list2;
                routeSwitchSegment4 = nddRouteSelectorModalView.getRouteSwitchSegment();
                nddRouteSelectorModalView.renderSegmentTabs(routeSwitchSegment4, list, NddRouteSelectorModalView$MvpViewImpl$setupRouteSwitchSegment$1.b, consumer, consumer2);
                routeSwitchSegment5 = nddRouteSelectorModalView.getRouteSwitchSegment();
                yi50Var2 = nddRouteSelectorModalView.presenter;
                routeSwitchSegment5.setUserSelectionChangeListener(new Consumer() { // from class: vi50
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        Object value;
                        int i15 = i12;
                        yi50 yi50Var3 = yi50Var2;
                        Integer num = (Integer) obj3;
                        switch (i15) {
                            case 0:
                                if (num == null) {
                                    yi50Var3.getClass();
                                    break;
                                } else {
                                    bj50 bj50Var3 = (bj50) a.S(num.intValue(), yi50Var3.S.d.a);
                                    if (bj50Var3 != null) {
                                        li50 li50Var = yi50Var3.G;
                                        boolean z4 = bj50Var3.a == NddRouteType.SOURCE;
                                        r0 r0Var = li50Var.b.a;
                                        do {
                                            value = r0Var.getValue();
                                        } while (!r0Var.k(value, mi50.a.a((mi50.a) value, null, z4, null, 5)));
                                    }
                                }
                                break;
                            default:
                                rh50 rh50Var2 = (rh50) a.S(num.intValue(), yi50Var3.S.e.a);
                                if (rh50Var2 != null) {
                                    oh50 oh50Var = yi50Var3.Q;
                                    nh50 nh50Var = rh50Var2.b;
                                    r0 r0Var2 = oh50Var.a;
                                    r0Var2.getClass();
                                    r0Var2.m(null, nh50Var);
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                bj50Var2 = bj50Var;
                list = list2;
            }
            if (bj50Var2 != null) {
                routeSwitchSegment3 = nddRouteSelectorModalView.getRouteSwitchSegment();
                routeSwitchSegment3.setSelectedTab(list.indexOf(bj50Var2));
            }
        }
        sh50 sh50Var = zi50Var.e;
        if (jl40.l(sh50Var, sh50.c)) {
            rh50Var = null;
        } else {
            Iterator it2 = sh50Var.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (((rh50) obj2).b.b == z2) {
                        break;
                    }
                }
            }
            rh50Var = (rh50) obj2;
        }
        List list3 = sh50Var.a;
        binding7 = nddRouteSelectorModalView.getBinding();
        binding7.c.setVisibility(!list3.isEmpty() ? 0 : 8);
        if (!list3.isEmpty()) {
            if (sh50Var.b) {
                binding11 = nddRouteSelectorModalView.getBinding();
                binding11.c.setDefaultBackgroundRectColor();
                binding12 = nddRouteSelectorModalView.getBinding();
                binding12.c.setSelectedTabIndicatorColor(qje.t(xng0.bgFloating, nddRouteSelectorModalView.getContext()));
                final int i15 = 2;
                Consumer consumer3 = new Consumer() { // from class: ui50
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        int i152 = i15;
                        NddRouteSelectorModalView nddRouteSelectorModalView2 = nddRouteSelectorModalView;
                        RobotoTextView robotoTextView = (RobotoTextView) obj3;
                        switch (i152) {
                            case 0:
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, nddRouteSelectorModalView2.getContext()), tje.x(nddRouteSelectorModalView2.getContext(), 16.0f)).b);
                                robotoTextView.setTextColor(qje.t(xng0.textMain, nddRouteSelectorModalView2.getContext()));
                                break;
                            case 1:
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, nddRouteSelectorModalView2.getContext()), tje.x(nddRouteSelectorModalView2.getContext(), 16.0f)).b);
                                robotoTextView.setTextColor(qje.t(xng0.textMinor, nddRouteSelectorModalView2.getContext()));
                                break;
                            case 2:
                                robotoTextView.setTextColor(qje.t(xng0.textMain, nddRouteSelectorModalView2.getContext()));
                                break;
                            default:
                                robotoTextView.setTextColor(qje.t(xng0.textMinor, nddRouteSelectorModalView2.getContext()));
                                break;
                        }
                    }
                };
                Consumer consumer4 = new Consumer() { // from class: ui50
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        int i152 = i13;
                        NddRouteSelectorModalView nddRouteSelectorModalView2 = nddRouteSelectorModalView;
                        RobotoTextView robotoTextView = (RobotoTextView) obj3;
                        switch (i152) {
                            case 0:
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, nddRouteSelectorModalView2.getContext()), tje.x(nddRouteSelectorModalView2.getContext(), 16.0f)).b);
                                robotoTextView.setTextColor(qje.t(xng0.textMain, nddRouteSelectorModalView2.getContext()));
                                break;
                            case 1:
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, nddRouteSelectorModalView2.getContext()), tje.x(nddRouteSelectorModalView2.getContext(), 16.0f)).b);
                                robotoTextView.setTextColor(qje.t(xng0.textMinor, nddRouteSelectorModalView2.getContext()));
                                break;
                            case 2:
                                robotoTextView.setTextColor(qje.t(xng0.textMain, nddRouteSelectorModalView2.getContext()));
                                break;
                            default:
                                robotoTextView.setTextColor(qje.t(xng0.textMinor, nddRouteSelectorModalView2.getContext()));
                                break;
                        }
                    }
                };
                binding13 = nddRouteSelectorModalView.getBinding();
                nddRouteSelectorModalView.renderSegmentTabs(binding13.c, list3, NddRouteSelectorModalView$MvpViewImpl$setupAddressFlowSwitchSegment$1.b, consumer3, consumer4);
                binding14 = nddRouteSelectorModalView.getBinding();
                SegmentedComponent segmentedComponent = binding14.c;
                yi50Var = nddRouteSelectorModalView.presenter;
                segmentedComponent.setUserSelectionChangeListener(new Consumer() { // from class: vi50
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        Object value;
                        int i152 = i14;
                        yi50 yi50Var3 = yi50Var;
                        Integer num = (Integer) obj3;
                        switch (i152) {
                            case 0:
                                if (num == null) {
                                    yi50Var3.getClass();
                                    break;
                                } else {
                                    bj50 bj50Var3 = (bj50) a.S(num.intValue(), yi50Var3.S.d.a);
                                    if (bj50Var3 != null) {
                                        li50 li50Var = yi50Var3.G;
                                        boolean z4 = bj50Var3.a == NddRouteType.SOURCE;
                                        r0 r0Var = li50Var.b.a;
                                        do {
                                            value = r0Var.getValue();
                                        } while (!r0Var.k(value, mi50.a.a((mi50.a) value, null, z4, null, 5)));
                                    }
                                }
                                break;
                            default:
                                rh50 rh50Var2 = (rh50) a.S(num.intValue(), yi50Var3.S.e.a);
                                if (rh50Var2 != null) {
                                    oh50 oh50Var = yi50Var3.Q;
                                    nh50 nh50Var = rh50Var2.b;
                                    r0 r0Var2 = oh50Var.a;
                                    r0Var2.getClass();
                                    r0Var2.m(null, nh50Var);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            if (rh50Var != null) {
                binding10 = nddRouteSelectorModalView.getBinding();
                binding10.c.setSelectedTab(list3.indexOf(rh50Var));
            }
        }
        bi50 bi50Var = zi50Var.j;
        boolean z4 = bi50Var.a;
        int t = qje.t(z4 ? xng0.controlMain : xng0.controlMinor, nddRouteSelectorModalView.getContext());
        int i16 = z4 ? xng0.textOnControl : xng0.textMinor;
        binding8 = nddRouteSelectorModalView.getBinding();
        ListItemComponent listItemComponent5 = binding8.d;
        listItemComponent5.setEnabled(z4);
        listItemComponent5.setTitle(bi50Var.b);
        listItemComponent5.setRoundedBackground(t);
        listItemComponent5.setTitleColorAttr(i16);
        kf60 kf60Var = zi50Var.k;
        if (kf60Var.a) {
            routeSwitchSegment2 = nddRouteSelectorModalView.getRouteSwitchSegment();
            customTabView = nddRouteSelectorModalView.getCustomTabView(routeSwitchSegment2, 0);
            if (customTabView != null) {
                deliveryTooltipPopup2 = nddRouteSelectorModalView.notAllowedPopup;
                deliveryTooltipPopup2.getTooltip().setText(kf60Var.b);
                deliveryTooltipPopup3 = nddRouteSelectorModalView.notAllowedPopup;
                deliveryTooltipPopup3.showAbove(customTabView);
            }
        } else {
            deliveryTooltipPopup = nddRouteSelectorModalView.notAllowedPopup;
            deliveryTooltipPopup.dismiss();
        }
        boolean z5 = kyxVar.a;
        String str4 = kyxVar.c;
        String str5 = kyxVar.b;
        binding9 = nddRouteSelectorModalView.getBinding();
        binding9.h.setVisibility(!z5 ? 0 : 8);
        binding9.g.setVisibility(z5 ? 0 : 8);
        binding9.f.setTitle(str5);
        binding9.e.setText(str4);
        isPvzNotFound = nddRouteSelectorModalView.isPvzNotFound(zi50Var);
        if (isPvzNotFound) {
            ai50Var = nddRouteSelectorModalView.nddAnalytics;
            d43 d43Var = zi50Var.m;
            ai50Var.getClass();
            wiq0 wiq0Var = ai50Var.a;
            lx4 lx4Var = ai50Var.b;
            if (d43Var == null) {
                return;
            }
            i d = ((j) lx4Var).d("Delivery.NddFlow.RouteCard.UnavailableAddress.Shown");
            LinkedHashMap linkedHashMap = d.a;
            ai50.b(d, d43Var);
            d.d("type", ai50.a(z));
            linkedHashMap.put("title_text", str5);
            pex0 m = ((k) wiq0Var).m();
            linkedHashMap.put(ClidProvider.STATE, m != null ? m.b : null);
            d.m();
            i d2 = ((j) lx4Var).d("Delivery.NddFlow.RouteCard.UnavailableAddressButton.Shown");
            LinkedHashMap linkedHashMap2 = d2.a;
            ai50.b(d2, d43Var);
            d2.d("type", ai50.a(z));
            linkedHashMap2.put("button_text", str4);
            pex0 m2 = ((k) wiq0Var).m();
            linkedHashMap2.put(ClidProvider.STATE, m2 != null ? m2.b : null);
            d2.m();
        }
    }

    @Override // defpackage.wi50
    public final void K() {
        yi50 yi50Var;
        Object value;
        Object value2;
        yi50Var = this.a.presenter;
        ru.yandex.taxi.logistics.ndd_map.router.e eVar = yi50Var.M;
        r0 r0Var = eVar.j.a.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, ddi.a.d));
        ch50 ch50Var = eVar.i;
        ji50 ji50Var = ch50Var.a;
        mi50.a aVar = (mi50.a) ch50Var.c.b.a.getValue();
        boolean z = aVar.b;
        Address address = aVar.a;
        if (address != null) {
            if (ji50Var instanceof hi50) {
                hi50 hi50Var = (hi50) ji50Var;
                if (hi50Var.f) {
                    ch50Var.a(z, address, aVar);
                } else {
                    hi50Var.h.invoke(address);
                }
            } else {
                ch50Var.a(z, address, aVar);
            }
            ch50Var.f.a();
            r0 r0Var2 = ch50Var.b.a;
            do {
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, new eh50(ji50Var)));
        }
        yi50Var.Kg();
    }

    @Override // defpackage.wi50
    public final void setCounter(int i) {
        DeliveryFloatFilterButtonComponent deliveryFloatFilterButtonComponent;
        deliveryFloatFilterButtonComponent = this.a.floatFilterButtonComponent;
        if (deliveryFloatFilterButtonComponent != null) {
            deliveryFloatFilterButtonComponent.setCounter(i);
        }
    }
}
