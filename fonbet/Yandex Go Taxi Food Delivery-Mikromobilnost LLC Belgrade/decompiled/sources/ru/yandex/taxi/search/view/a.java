package ru.yandex.taxi.search.view;

import android.graphics.drawable.Drawable;
import defpackage.ax4;
import defpackage.cx4;
import defpackage.dx4;
import defpackage.hc;
import defpackage.hks;
import defpackage.j61;
import defpackage.nw0;
import defpackage.o5v0;
import defpackage.pv0;
import defpackage.s2h;
import defpackage.t030;
import defpackage.yw0;
import defpackage.yw4;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.experiment.e;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.b;
import ru.yandex.taxi.search.view.AddressSearchView;

/* loaded from: classes6.dex */
public final class a extends yw4 implements j61 {
    public final /* synthetic */ AddressSearchView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AddressSearchView addressSearchView) {
        super(addressSearchView);
        this.b = addressSearchView;
    }

    @Override // defpackage.j61
    public final void C(o5v0 o5v0Var) {
        this.b.suggestsViewField().updateSuggestItemContextMenuConfig(o5v0Var);
    }

    @Override // defpackage.j61
    public final s2h D() {
        s2h s2hVar;
        s2hVar = this.b.deeplinkNavigator;
        return s2hVar;
    }

    @Override // defpackage.i51
    public final void M5(Drawable drawable) {
        this.b.updateInputBackground(drawable);
    }

    @Override // defpackage.j61
    public final void O() {
    }

    @Override // defpackage.j61
    public final void P6(pv0 pv0Var) {
        ax4 ax4Var;
        hideKeyboard();
        ax4Var = this.b.onAddressPickedListener;
        if (ax4Var != null) {
            h(new hc(10, ax4Var, pv0Var));
        } else {
            h(null);
        }
    }

    @Override // defpackage.j61
    public final void Rb(String str) {
        AddressSearchView addressSearchView = this.b;
        addressSearchView.addressInputHolder.c(str);
        addressSearchView.setFilter(addressSearchView.addressInput, str);
    }

    @Override // defpackage.j61
    public final void Ta(String str) {
        AddressSearchView addressSearchView = this.b;
        addressSearchView.addressInputHolder.d(str);
        addressSearchView.addressInput.setHint(str);
    }

    @Override // defpackage.j61
    public final void U9(String str) {
        this.b.onSubtitleChanged(str);
    }

    @Override // defpackage.j61
    public final void Y5() {
        h(null);
    }

    @Override // defpackage.j61
    public final void c8(hks hksVar) {
        this.b.updateNextButtonState(hksVar);
    }

    @Override // defpackage.j61
    public final void fg() {
        boolean z;
        AddressSearchView.InputType inputType;
        AddressSearchView addressSearchView = this.b;
        z = addressSearchView.isFirstInputShow;
        boolean z2 = z || addressSearchView.addressInputHolder.a.hasFocus();
        addressSearchView.isFirstInputShow = false;
        addressSearchView.inputType = AddressSearchView.InputType.OLD;
        inputType = addressSearchView.inputType;
        addressSearchView.changeTopViewAttachment(inputType);
        addressSearchView.addressInputHolder.b();
        addressSearchView.addressInput.setVisibility(0);
        addressSearchView.getAddressInputShadow().setVisibility(0);
        if (z2) {
            addressSearchView.addressInput.requestFocus();
        }
    }

    @Override // defpackage.j61
    public final boolean g() {
        cx4 cx4Var;
        cx4Var = this.b.onPickupFromPhotoClickListener;
        if (cx4Var == null) {
            return false;
        }
        cx4Var.g();
        return true;
    }

    @Override // defpackage.j61
    public final String getFilter() {
        AddressSearchView.InputType inputType;
        AddressSearchView addressSearchView = this.b;
        inputType = addressSearchView.inputType;
        return inputType == AddressSearchView.InputType.NEWBIES ? ((ru.yandex.taxi.address.experiment.a) addressSearchView.addressInputHolder.d.getValue()).b.toString() : addressSearchView.getFilter(addressSearchView.addressInput);
    }

    @Override // defpackage.j61
    public final void hideKeyboard() {
        this.b.closeKeyboard();
    }

    @Override // defpackage.j61
    public final boolean isCollapsed() {
        t030 modalViewCompatibleDelegate = this.b.getModalViewCompatibleDelegate();
        if (modalViewCompatibleDelegate == null) {
            return false;
        }
        return modalViewCompatibleDelegate.isCollapsed();
    }

    @Override // defpackage.j61
    public final void na(e eVar) {
        boolean z;
        AddressSearchView.InputType inputType;
        PointType pointType;
        PointType pointType2;
        String str;
        Object value;
        AddressSearchView addressSearchView = this.b;
        z = addressSearchView.isFirstInputShow;
        boolean z2 = z || addressSearchView.addressInput.hasFocus();
        addressSearchView.isFirstInputShow = false;
        addressSearchView.inputType = AddressSearchView.InputType.NEWBIES;
        inputType = addressSearchView.inputType;
        addressSearchView.changeTopViewAttachment(inputType);
        addressSearchView.addressInput.setVisibility(8);
        addressSearchView.getAddressInputShadow().setVisibility(8);
        pointType = addressSearchView.pointType;
        if (pointType == PointType.DESTINATION && eVar.w) {
            addressSearchView.addressInputHolder.b();
            return;
        }
        b bVar = addressSearchView.addressInputHolder;
        pointType2 = addressSearchView.pointType;
        boolean z3 = eVar.p;
        String str2 = eVar.m;
        r0 r0Var = bVar.d;
        ru.yandex.taxi.address.experiment.a aVar = (ru.yandex.taxi.address.experiment.a) r0Var.getValue();
        int i = pointType2 == null ? -1 : nw0.a[pointType2.ordinal()];
        yw0 yw0Var = i != 1 ? i != 2 ? eVar.c : eVar.e : eVar.d;
        if (z3) {
            str2 = "";
        } else {
            int i2 = pointType2 != null ? nw0.a[pointType2.ordinal()] : -1;
            if (i2 == 1 ? (str = eVar.n) != null : i2 == 2 && (str = eVar.o) != null) {
                str2 = str;
            }
        }
        r0Var.m(null, ru.yandex.taxi.address.experiment.a.a(aVar, str2, null, null, null, yw0Var, null, null, null, false, z3, false, false, 516062));
        r0 r0Var2 = addressSearchView.addressInputHolder.d;
        do {
            value = r0Var2.getValue();
        } while (!r0Var2.k(value, ru.yandex.taxi.address.experiment.a.a((ru.yandex.taxi.address.experiment.a) value, null, null, null, null, null, null, null, null, true, false, false, false, 520191)));
        if (z2) {
            addressSearchView.addressInputHolder.a.requestFocus();
        }
        if (eVar.p) {
            addressSearchView.setRedesignedInputHolder();
        } else {
            addressSearchView.addressInputHolder.e();
        }
    }

    @Override // defpackage.j61
    public final void sb(int i) {
        AddressSearchView addressSearchView = this.b;
        addressSearchView.addressInputHolder.d(addressSearchView.getContext().getString(i));
        addressSearchView.addressInput.setHint(addressSearchView.getContext().getString(i));
    }

    @Override // defpackage.j61
    public final void setTitle(String str) {
        this.b.setTitle(str);
    }

    @Override // defpackage.j61
    public final void w7() {
        h(null);
    }

    @Override // defpackage.j61
    public final void zd(pv0 pv0Var, boolean z) {
        dx4 dx4Var;
        dx4Var = this.b.onPointOnMapListener;
        if (dx4Var != null) {
            dx4Var.o(this, pv0Var);
        }
    }
}
