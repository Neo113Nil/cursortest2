package ru.yandex.taxi.search.address.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import com.yandex.go.address.models.Address;
import defpackage.bdc;
import defpackage.bjd;
import defpackage.cvw;
import defpackage.dw1;
import defpackage.ejd;
import defpackage.ex4;
import defpackage.gdc;
import defpackage.grg0;
import defpackage.hg;
import defpackage.hjd;
import defpackage.i61;
import defpackage.io9;
import defpackage.jjd;
import defpackage.kyh0;
import defpackage.lq0;
import defpackage.mq0;
import defpackage.mqg0;
import defpackage.nv0;
import defpackage.ny61;
import defpackage.o5v0;
import defpackage.pv0;
import defpackage.q91;
import defpackage.s2h;
import defpackage.t030;
import defpackage.tje;
import defpackage.u0c0;
import defpackage.w511;
import defpackage.xng0;
import defpackage.yw0;
import defpackage.yw4;
import defpackage.yy4;
import defpackage.zzs;
import java.util.ArrayList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.address.experiment.AddressItemMode;
import ru.yandex.taxi.address.experiment.r;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;

/* loaded from: classes6.dex */
public final class d extends yw4 implements bjd {
    public final /* synthetic */ CompositeAddressSearchView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CompositeAddressSearchView compositeAddressSearchView) {
        super(compositeAddressSearchView);
        this.b = compositeAddressSearchView;
    }

    @Override // defpackage.bjd
    public final void C(o5v0 o5v0Var) {
        SuggestsView suggestsViewField;
        suggestsViewField = this.b.suggestsViewField();
        suggestsViewField.updateSuggestItemContextMenuConfig(o5v0Var);
    }

    @Override // defpackage.bjd
    public final s2h D() {
        s2h s2hVar;
        s2hVar = this.b.deeplinkNavigator;
        return s2hVar;
    }

    @Override // defpackage.bjd
    public final void D3(String str) {
        ru.yandex.taxi.search.g gVar;
        AddressInputComponent addressInputComponent;
        AddressInputComponent addressInputComponent2;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        r0Var.m(null, r.a(rVar, null, ru.yandex.taxi.address.experiment.a.a(rVar.b, null, str == null ? "" : str, null, null, null, null, null, null, false, false, false, false, 524285), 1));
        addressInputComponent = compositeAddressSearchView.destinationInput;
        addressInputComponent.setAddress(str);
        addressInputComponent2 = compositeAddressSearchView.destinationInput;
        EditText addressEditText = addressInputComponent2.getAddressEditText();
        addressEditText.setSelection(addressEditText.getText().length());
    }

    @Override // defpackage.bjd
    public final boolean H() {
        t030 modalViewCompatibleDelegate = this.b.getModalViewCompatibleDelegate();
        return modalViewCompatibleDelegate != null && modalViewCompatibleDelegate.H();
    }

    @Override // defpackage.bjd
    public final void Jc(PointType pointType) {
        ru.yandex.taxi.search.g gVar;
        AddressInputComponent addressInputComponent;
        AddressInputComponent addressInputComponent2;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        gVar.f(pointType, new gdc(mqg0.component_orange_toxic));
        int i = hjd.a[pointType.ordinal()];
        if (i == 1) {
            addressInputComponent = compositeAddressSearchView.sourceInput;
            addressInputComponent.setAddressTextColorInt(compositeAddressSearchView.getContext().getColor(mqg0.component_orange_toxic));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            addressInputComponent2 = compositeAddressSearchView.destinationInput;
            addressInputComponent2.setAddressTextColorInt(compositeAddressSearchView.getContext().getColor(mqg0.component_orange_toxic));
        }
    }

    @Override // defpackage.bjd
    public final void M3(PointType pointType, Address address, pv0 pv0Var, boolean z) {
        i61 i61Var;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        if (address == null || address.X1()) {
            compositeAddressSearchView.doCollapse();
        }
        i61Var = compositeAddressSearchView.listener;
        i61Var.la(pointType, address, pv0Var, z);
    }

    @Override // defpackage.i51
    public final void M5(Drawable drawable) {
        this.b.updateInputBackground(drawable);
    }

    @Override // defpackage.bjd
    public final void O() {
        this.b.initInputs();
    }

    @Override // defpackage.bjd
    public final void Oc(u0c0 u0c0Var) {
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        compositeAddressSearchView.pinStyles = u0c0Var;
        compositeAddressSearchView.initInputs();
    }

    @Override // defpackage.bjd
    public final void R4(int i, String str) {
        ru.yandex.taxi.search.g gVar;
        ru.yandex.taxi.search.g gVar2;
        jjd jjdVar;
        AddressInputComponent addressInputComponent;
        yy4 yy4Var;
        AddressInputComponent addressInputComponent2;
        AddressInputComponent addressInputComponent3;
        View view;
        View view2;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        r0Var.m(null, r.a(rVar, null, ru.yandex.taxi.address.experiment.a.a(rVar.b, null, i > 0 ? str : "", null, null, null, null, null, AddressItemMode.READ_ONLY, false, false, false, false, 522237), 1));
        gVar2 = compositeAddressSearchView.sourceDestinationHolder;
        gVar2.a.setOnDestinationClickListener(new ejd(compositeAddressSearchView, 1));
        if (compositeAddressSearchView.isAttachedToWindow()) {
            addressInputComponent3 = compositeAddressSearchView.destinationInput;
            addressInputComponent3.setMode(AddressInputComponent.Mode.VIEW);
            view = compositeAddressSearchView.destinationFocusCatcher;
            view.setOnClickListener(null);
            view2 = compositeAddressSearchView.destinationFocusCatcher;
            view2.setClickable(false);
        }
        jjdVar = compositeAddressSearchView.destinationAddressAutofitOwner;
        CompositeAddressSearchView compositeAddressSearchView2 = jjdVar.b;
        if (jjdVar.a == null) {
            addressInputComponent2 = compositeAddressSearchView2.destinationInput;
            mq0 createAutofitHelper = addressInputComponent2.createAutofitHelper();
            createAutofitHelper.a.d(14.0f, 1);
            createAutofitHelper.a.c(true);
            createAutofitHelper.g = ru.yandex.taxi.design.utils.c.H(compositeAddressSearchView2, kyh0.summory_route_point_description, compositeAddressSearchView2.getContext().getString(kyh0.pin_b_name));
            jjdVar.a = createAutofitHelper;
        }
        mq0 mq0Var = jjdVar.a;
        if (mq0Var == null) {
            ny61.g("Required value was null.");
            return;
        }
        mq0Var.j = str;
        mq0Var.l = str;
        mq0Var.h = str;
        mq0Var.i = i;
        mq0Var.b();
        addressInputComponent = compositeAddressSearchView.destinationInput;
        yy4Var = compositeAddressSearchView.presenter;
        ru.yandex.taxi.design.utils.c.z(new CompositeAddressSearchView$InnerMvpView$setReadOnlyDestinations$2(0, yy4Var, yy4.class, "onEditRouteStopsClick", "onEditRouteStopsClick()V", 0), addressInputComponent);
    }

    @Override // defpackage.bjd
    public final void Rd(String str) {
        ru.yandex.taxi.search.g gVar;
        AddressInputComponent addressInputComponent;
        AddressInputComponent addressInputComponent2;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        r0Var.m(null, r.a(rVar, ru.yandex.taxi.address.experiment.a.a(rVar.a, null, str == null ? "" : str, null, null, null, null, null, null, false, false, false, false, 524285), null, 2));
        addressInputComponent = compositeAddressSearchView.sourceInput;
        addressInputComponent.setAddress(str);
        addressInputComponent2 = compositeAddressSearchView.sourceInput;
        EditText addressEditText = addressInputComponent2.getAddressEditText();
        addressEditText.setSelection(addressEditText.getText().length());
    }

    @Override // defpackage.bjd
    public final PointType S6() {
        PointType pointType;
        pointType = this.b.activePoint;
        return pointType;
    }

    @Override // defpackage.bjd
    public final void T2(boolean z, dw1 dw1Var) {
        i61 i61Var;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        compositeAddressSearchView.activeInput().clearFocus();
        i61Var = compositeAddressSearchView.listener;
        i61Var.n6(z, dw1Var);
    }

    @Override // defpackage.bjd
    public final void U4(CharSequence charSequence) {
        ru.yandex.taxi.search.g gVar;
        AddressInputComponent addressInputComponent;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        r0Var.m(null, r.a(rVar, ru.yandex.taxi.address.experiment.a.a(rVar.a, null, null, null, charSequence, null, null, null, null, false, false, false, false, 524271), null, 2));
        addressInputComponent = compositeAddressSearchView.sourceInput;
        addressInputComponent.setHint(charSequence);
    }

    @Override // defpackage.bjd
    public final void Vc(boolean z) {
        ru.yandex.taxi.search.g gVar;
        gVar = this.b.sourceDestinationHolder;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        r0Var.m(null, r.a(rVar, ru.yandex.taxi.address.experiment.a.a(rVar.a, null, null, null, null, null, null, null, null, false, false, false, z, 262143), null, 2));
    }

    @Override // defpackage.bjd
    public final void W8(int i) {
        ex4 ex4Var;
        ex4Var = this.b.suggestsListener;
        if (ex4Var != null) {
            ((CompositeAddressSearchModalView) ((io9) ex4Var).a).updatePeekHeight(i);
        }
    }

    @Override // defpackage.bjd
    public final void Yc(zzs zzsVar) {
        i61 i61Var;
        i61Var = this.b.listener;
        i61Var.setMapToPoint(zzsVar);
    }

    @Override // defpackage.bjd
    public final void Z8() {
        i61 i61Var;
        i61Var = this.b.listener;
        i61Var.K1();
        h(null);
    }

    @Override // defpackage.yw4, defpackage.i51
    public final void a9() {
        q91 q91Var;
        q91 q91Var2;
        ex4 ex4Var;
        super.a9();
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        q91Var = compositeAddressSearchView.addressesListPerfCallback;
        if (q91Var != null) {
            ((com.yandex.go.address.search.perf.b) q91Var).c();
        }
        q91Var2 = compositeAddressSearchView.addressesListPerfCallback;
        if (q91Var2 != null) {
            ((com.yandex.go.address.search.perf.b) q91Var2).a();
        }
        ex4Var = compositeAddressSearchView.suggestsListener;
        if (ex4Var != null) {
            ((CompositeAddressSearchModalView) ((io9) ex4Var).a).reportModalViewLcpIfNeeded();
        }
    }

    @Override // defpackage.bjd
    public final void b2(PointType pointType) {
        ru.yandex.taxi.search.g gVar;
        AddressInputComponent addressInputComponent;
        AddressInputComponent addressInputComponent2;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        gVar.f(pointType, new bdc(xng0.textMain));
        int i = hjd.a[pointType.ordinal()];
        if (i == 1) {
            addressInputComponent = compositeAddressSearchView.sourceInput;
            addressInputComponent.setAddressTextColorAttr(xng0.textMain);
        } else if (i != 2) {
            w511.b();
        } else {
            addressInputComponent2 = compositeAddressSearchView.destinationInput;
            addressInputComponent2.setAddressTextColorAttr(xng0.textMain);
        }
    }

    @Override // defpackage.yw4, defpackage.i51
    public final void cg() {
        q91 q91Var;
        q91 q91Var2;
        ex4 ex4Var;
        super.cg();
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        q91Var = compositeAddressSearchView.addressesListPerfCallback;
        if (q91Var != null) {
            ((com.yandex.go.address.search.perf.b) q91Var).c();
        }
        q91Var2 = compositeAddressSearchView.addressesListPerfCallback;
        if (q91Var2 != null) {
            ((com.yandex.go.address.search.perf.b) q91Var2).a();
        }
        ex4Var = compositeAddressSearchView.suggestsListener;
        if (ex4Var != null) {
            ((CompositeAddressSearchModalView) ((io9) ex4Var).a).reportModalViewLcpIfNeeded();
        }
    }

    @Override // defpackage.bjd
    public final void collapse() {
        this.b.doCollapse();
    }

    @Override // defpackage.bjd
    public final void d9() {
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        boolean inputHasFocus = compositeAddressSearchView.inputHasFocus();
        compositeAddressSearchView.sourceDestinationType = CompositeAddressSearchView.SourceDestinationType.WITH_CIRCLES;
        compositeAddressSearchView.checkSourceDestinationType(inputHasFocus);
    }

    @Override // defpackage.bjd
    public final void de(PointType pointType, String str) {
        ru.yandex.taxi.search.g gVar;
        AddressInputComponent addressInputComponent;
        AddressInputComponent addressInputComponent2;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        gVar.e(pointType, str);
        int i = hjd.a[pointType.ordinal()];
        if (i == 1) {
            addressInputComponent = compositeAddressSearchView.sourceInput;
            compositeAddressSearchView.setFilter(addressInputComponent, str);
        } else if (i != 2) {
            w511.b();
        } else {
            addressInputComponent2 = compositeAddressSearchView.destinationInput;
            compositeAddressSearchView.setFilter(addressInputComponent2, str);
        }
    }

    @Override // defpackage.bjd
    public final void hideKeyboard() {
        this.b.closeKeyboard();
    }

    @Override // defpackage.bjd
    public final boolean isCollapsed() {
        t030 modalViewCompatibleDelegate = this.b.getModalViewCompatibleDelegate();
        return modalViewCompatibleDelegate != null && modalViewCompatibleDelegate.isCollapsed();
    }

    @Override // defpackage.bjd
    public final void j1(CharSequence charSequence) {
        ru.yandex.taxi.search.g gVar;
        AddressInputComponent addressInputComponent;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        r0Var.m(null, r.a(rVar, null, ru.yandex.taxi.address.experiment.a.a(rVar.b, null, null, null, charSequence, null, null, null, null, false, false, false, false, 524271), 1));
        addressInputComponent = compositeAddressSearchView.destinationInput;
        addressInputComponent.setHint(charSequence);
    }

    @Override // defpackage.bjd
    public final void od() {
        ru.yandex.taxi.search.g gVar;
        jjd jjdVar;
        AddressInputComponent addressInputComponent;
        AddressInputComponent addressInputComponent2;
        View view;
        AddressInputComponent addressInputComponent3;
        jjd jjdVar2;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        r0Var.m(null, r.a(rVar, null, ru.yandex.taxi.address.experiment.a.a(rVar.b, null, null, null, null, null, null, null, AddressItemMode.EDITABLE, false, false, false, false, 522239), 1));
        jjdVar = compositeAddressSearchView.destinationAddressAutofitOwner;
        if (jjdVar.a != null) {
            jjdVar2 = compositeAddressSearchView.destinationAddressAutofitOwner;
            mq0 mq0Var = jjdVar2.a;
            if (mq0Var != null) {
                ru.yandex.taxi.widget.b bVar = mq0Var.a;
                lq0 lq0Var = mq0Var.c;
                ArrayList arrayList = bVar.k;
                if (arrayList != null) {
                    arrayList.remove(lq0Var);
                }
            }
            jjdVar2.a = null;
        }
        addressInputComponent = compositeAddressSearchView.destinationInput;
        addressInputComponent.setMode(AddressInputComponent.Mode.INPUT);
        addressInputComponent2 = compositeAddressSearchView.destinationInput;
        androidx.core.view.b.p(addressInputComponent2, null);
        if (compositeAddressSearchView.isAttachedToWindow()) {
            view = compositeAddressSearchView.destinationFocusCatcher;
            addressInputComponent3 = compositeAddressSearchView.destinationInput;
            ru.yandex.taxi.design.utils.c.z(new CompositeAddressSearchView$InnerMvpView$setDestinationReadWrite$1(0, addressInputComponent3, AddressInputComponent.class, "requestFocus", "requestFocus()Z", 8), view);
        }
    }

    @Override // defpackage.bjd
    public final void p4(ru.yandex.taxi.address.experiment.e eVar) {
        ru.yandex.taxi.search.g gVar;
        PointType pointType;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        pointType = compositeAddressSearchView.activePoint;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        boolean z = gVar.e;
        AddressItemMode addressItemMode = z ? rVar.a.l : AddressItemMode.EDITABLE;
        AddressItemMode addressItemMode2 = z ? rVar.b.l : AddressItemMode.EDITABLE;
        gVar.e = true;
        yw0 yw0Var = eVar.a;
        yw0 yw0Var2 = eVar.d;
        ru.yandex.taxi.address.experiment.a a = ru.yandex.taxi.address.experiment.a.a(rVar.a, eVar.f, null, null, null, pointType == PointType.SOURCE ? yw0Var2 : yw0Var, new nv0(yw0Var, yw0Var2), null, addressItemMode, false, false, false, false, 522142);
        yw0 yw0Var3 = eVar.b;
        yw0 yw0Var4 = eVar.e;
        r0Var.m(null, new r(a, ru.yandex.taxi.address.experiment.a.a(rVar.b, eVar.g, null, null, null, pointType == PointType.DESTINATION ? yw0Var4 : yw0Var3, new nv0(yw0Var3, yw0Var4), null, addressItemMode2, false, false, false, false, 522142)));
        boolean inputHasFocus = compositeAddressSearchView.inputHasFocus();
        compositeAddressSearchView.sourceDestinationType = CompositeAddressSearchView.SourceDestinationType.NEWBIES;
        compositeAddressSearchView.checkSourceDestinationType(inputHasFocus);
    }

    @Override // defpackage.bjd
    public final String q8(PointType pointType) {
        CompositeAddressSearchView.SourceDestinationType sourceDestinationType;
        AddressInputComponent addressInputComponent;
        String filter;
        AddressInputComponent addressInputComponent2;
        String filter2;
        ru.yandex.taxi.search.g gVar;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        sourceDestinationType = compositeAddressSearchView.sourceDestinationType;
        if (sourceDestinationType == CompositeAddressSearchView.SourceDestinationType.NEWBIES) {
            gVar = compositeAddressSearchView.sourceDestinationHolder;
            return gVar.a(pointType).getText().toString();
        }
        int i = hjd.a[pointType.ordinal()];
        if (i == 1) {
            addressInputComponent = compositeAddressSearchView.sourceInput;
            filter = compositeAddressSearchView.getFilter(addressInputComponent);
            return filter;
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        addressInputComponent2 = compositeAddressSearchView.destinationInput;
        filter2 = compositeAddressSearchView.getFilter(addressInputComponent2);
        return filter2;
    }

    @Override // defpackage.bjd
    public final void setActivePoint(PointType pointType) {
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        t030 modalViewCompatibleDelegate = compositeAddressSearchView.getModalViewCompatibleDelegate();
        compositeAddressSearchView.setActivePoint(pointType, modalViewCompatibleDelegate == null || modalViewCompatibleDelegate.isExpanded());
        compositeAddressSearchView.changePointType(pointType);
    }

    @Override // defpackage.bjd
    public final void yc(Drawable drawable) {
        ru.yandex.taxi.search.g gVar;
        gVar = this.b.sourceDestinationHolder;
        SourceDestinationComponentV2 sourceDestinationComponentV2 = gVar.a;
        cvw.e0(sourceDestinationComponentV2, drawable, Integer.valueOf(tje.u(10, sourceDestinationComponentV2.getContext())), Integer.valueOf(tje.r(grg0.composite_address_source_destination_shadow_additional_padding, gVar.a.getContext())), 8);
    }

    @Override // defpackage.bjd
    public final void ye() {
        ru.yandex.taxi.search.g gVar;
        jjd jjdVar;
        View view;
        View view2;
        AddressInputComponent addressInputComponent;
        AddressInputComponent addressInputComponent2;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        gVar = compositeAddressSearchView.sourceDestinationHolder;
        r0 r0Var = gVar.c;
        r rVar = (r) r0Var.getValue();
        r0Var.m(null, r.a(rVar, null, ru.yandex.taxi.address.experiment.a.a(rVar.b, null, null, null, null, null, null, null, AddressItemMode.READ_ONLY, false, false, false, false, 522239), 1));
        jjdVar = compositeAddressSearchView.destinationAddressAutofitOwner;
        if (jjdVar.a == null) {
            addressInputComponent = compositeAddressSearchView.destinationInput;
            addressInputComponent.setMode(AddressInputComponent.Mode.VIEW);
            addressInputComponent2 = compositeAddressSearchView.destinationInput;
            hg.a(addressInputComponent2);
        }
        if (compositeAddressSearchView.isAttachedToWindow()) {
            view = compositeAddressSearchView.destinationFocusCatcher;
            view.setOnClickListener(null);
            view2 = compositeAddressSearchView.destinationFocusCatcher;
            view2.setClickable(false);
        }
    }
}
