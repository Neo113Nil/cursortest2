package ru.yandex.taxi.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import defpackage.bfh0;
import defpackage.bgq0;
import defpackage.cma1;
import defpackage.d82;
import defpackage.dbq0;
import defpackage.drh0;
import defpackage.epo0;
import defpackage.fbq0;
import defpackage.fce;
import defpackage.j0h0;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pce;
import defpackage.uq1;
import defpackage.w511;
import defpackage.xm2;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.contacts.SelectContactMvpView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.dialog.BaseDialog;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

/* loaded from: classes5.dex */
public final class f implements SelectContactMvpView {
    public final /* synthetic */ SelectContactView a;

    public f(SelectContactView selectContactView) {
        this.a = selectContactView;
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void A(int i) {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        SelectContactView selectContactView = this.a;
        animatedListItemInputComponent = selectContactView.phoneInput;
        ru.yandex.taxi.design.utils.c.e(animatedListItemInputComponent, new xm2(selectContactView, i, 18));
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void D4() {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        AnimatedListItemInputComponent animatedListItemInputComponent2;
        SelectContactView selectContactView = this.a;
        animatedListItemInputComponent = selectContactView.phoneInput;
        animatedListItemInputComponent.clearInputFocus();
        animatedListItemInputComponent2 = selectContactView.nameInput;
        ru.yandex.taxi.design.utils.c.e(animatedListItemInputComponent2, new dbq0(selectContactView, 9));
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void Ga() {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        View view;
        SelectContactView selectContactView = this.a;
        animatedListItemInputComponent = selectContactView.nameInput;
        animatedListItemInputComponent.setVisibility(0);
        view = selectContactView.phoneNameDivider;
        view.setVisibility(0);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void H7(boolean z) {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        animatedListItemInputComponent = this.a.phoneInput;
        animatedListItemInputComponent.setDividerVisibility(z);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void J(String str) {
        FrameLayout frameLayout;
        SelectContactView selectContactView = this.a;
        LayoutInflater from = LayoutInflater.from(selectContactView.getContext());
        frameLayout = selectContactView.permissionErrorContainer;
        View inflate = from.inflate(drh0.permission_error_view, (ViewGroup) frameLayout, false);
        frameLayout.addView(inflate);
        int i = bfh0.avatar_placeholder;
        if (cma1.O(i, inflate) != null) {
            i = bfh0.avatar_placeholder_2;
            if (cma1.O(i, inflate) != null) {
                i = bfh0.contact_avatar_placeholder;
                if (((ImageView) cma1.O(i, inflate)) != null) {
                    i = bfh0.go_to_settings_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        i = bfh0.permission_error_description;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = bfh0.phone_inner_image;
                            if (((ImageView) cma1.O(i, inflate)) != null) {
                                i = bfh0.phone_outer_image;
                                if (((ImageView) cma1.O(i, inflate)) != null) {
                                    i = bfh0.settings_placeholder_linear_layout;
                                    if (((LinearLayout) cma1.O(i, inflate)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                        constraintLayout.setAlpha(0.0f);
                                        constraintLayout.animate().alpha(1.0f);
                                        buttonComponent.setDebounceClickListener(new dbq0(selectContactView, 10));
                                        robotoTextView.setText(str);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void R5(String str) {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        animatedListItemInputComponent = this.a.phoneInput;
        animatedListItemInputComponent.setValue(str);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void Ya(List list, SelectContactMvpView.UiState uiState) {
        LinearLayout linearLayout;
        linearLayout = this.a.lastContactsGroup;
        linearLayout.setVisibility(0);
        h(list, uiState);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void ac() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        SelectContactView selectContactView = this.a;
        linearLayout = selectContactView.lastContactsGroup;
        linearLayout.setVisibility(4);
        linearLayout2 = selectContactView.lastContactsContainer;
        linearLayout2.removeAllViews();
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void c0() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        SelectContactView selectContactView = this.a;
        linearLayout = selectContactView.defaultContactsContainer;
        linearLayout.setVisibility(8);
        linearLayout2 = selectContactView.defaultContactsContainer;
        linearLayout2.removeAllViews();
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void d0(String str) {
        uq1 uq1Var;
        Runnable runnable;
        int length = str.length();
        SelectContactView selectContactView = this.a;
        if (length == 0) {
            str = selectContactView.permissionErrorText;
        }
        uq1Var = selectContactView.alertDialogFactory;
        AlertDialog message = uq1Var.a().setMessage(str);
        int i = kyh0.dialog_common_ok;
        runnable = selectContactView.manuallyInputClick;
        selectContactView.alertDialog = message.setPositiveButton(i, runnable).setCancelable(false).show();
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void f0() {
        this.a.confirm.setVisibility(0);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void g0() {
        FrameLayout frameLayout;
        frameLayout = this.a.permissionErrorContainer;
        frameLayout.removeAllViews();
    }

    public final void h(List list, SelectContactMvpView.UiState uiState) {
        LinearLayout linearLayout;
        c cVar;
        LinearLayout linearLayout2;
        SelectContactView selectContactView = this.a;
        linearLayout = selectContactView.lastContactsContainer;
        linearLayout.removeAllViews();
        int size = list.size();
        int i = 0;
        while (i < size) {
            bgq0 bgq0Var = (bgq0) list.get(i);
            cVar = selectContactView.contactItemViewFactory;
            ListItemComponent a = cVar.a(bgq0Var, uiState, i == list.size() - 1, new epo0(12, selectContactView, bgq0Var));
            if (uiState == SelectContactMvpView.UiState.NORMAL) {
                ru.yandex.taxi.design.utils.c.z(new fbq0(selectContactView, bgq0Var, 1), a);
            }
            linearLayout2 = selectContactView.lastContactsContainer;
            linearLayout2.addView(a);
            i++;
        }
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void i0() {
        this.a.confirm.setVisibility(8);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void m4() {
        NestedScrollViewAdvanced nestedScrollViewAdvanced;
        RecyclerView recyclerView;
        AnimatedListItemInputComponent animatedListItemInputComponent;
        AnimatedListItemInputComponent animatedListItemInputComponent2;
        AnimatedListItemInputComponent animatedListItemInputComponent3;
        ShadowScrollIndicator shadowScrollIndicator;
        ImageView imageView;
        SelectContactView selectContactView = this.a;
        nestedScrollViewAdvanced = selectContactView.contactsScrollContainer;
        nestedScrollViewAdvanced.setVisibility(8);
        recyclerView = selectContactView.contactsRecyclerView;
        recyclerView.setVisibility(0);
        animatedListItemInputComponent = selectContactView.nameInput;
        animatedListItemInputComponent.setVisibility(8);
        animatedListItemInputComponent2 = selectContactView.phoneInput;
        animatedListItemInputComponent2.setTrailView(null);
        animatedListItemInputComponent3 = selectContactView.phoneInput;
        animatedListItemInputComponent3.setValue("", true);
        shadowScrollIndicator = selectContactView.lastOrdersShadow;
        shadowScrollIndicator.setVisibility(8);
        imageView = selectContactView.contactsShadow;
        imageView.setVisibility(0);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void nd() {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        View view;
        AnimatedListItemInputComponent animatedListItemInputComponent2;
        SelectContactView selectContactView = this.a;
        animatedListItemInputComponent = selectContactView.nameInput;
        animatedListItemInputComponent.setVisibility(8);
        view = selectContactView.phoneNameDivider;
        view.setVisibility(8);
        animatedListItemInputComponent2 = selectContactView.nameInput;
        animatedListItemInputComponent2.clearInputFocus();
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void o2(String str, String str2, boolean z) {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        AnimatedListItemInputComponent animatedListItemInputComponent2;
        AnimatedListItemInputComponent animatedListItemInputComponent3;
        SelectContactView selectContactView = this.a;
        animatedListItemInputComponent = selectContactView.phoneInput;
        animatedListItemInputComponent.setValue(str);
        if (z) {
            animatedListItemInputComponent3 = selectContactView.nameInput;
            animatedListItemInputComponent3.setValue(str2);
        } else {
            animatedListItemInputComponent2 = selectContactView.phoneInput;
            animatedListItemInputComponent2.setInputTitle(str2);
        }
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void r(ArrayList arrayList) {
        fce fceVar;
        fceVar = this.a.contactsAdapter;
        i f = kp50.f(new pce(fceVar.b, arrayList, 0), true);
        fceVar.b = arrayList;
        f.b(fceVar);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void t() {
        uq1 uq1Var;
        Runnable runnable;
        Runnable runnable2;
        SelectContactView selectContactView = this.a;
        uq1Var = selectContactView.alertDialogFactory;
        AlertDialog message = uq1Var.a().setMessage(kyh0.order_for_other_invalid_number_error_message);
        int i = kyh0.order_for_other_invalid_number_error_enter_manually;
        runnable = selectContactView.manuallyInputClick;
        AlertDialog positiveButton = message.setPositiveButton(i, runnable);
        int i2 = kyh0.order_for_other_invalid_number_error_select_from_contact;
        runnable2 = selectContactView.pickFromContactClicked;
        selectContactView.alertDialog = positiveButton.setNegativeButton(i2, runnable2).setButtonsOrientation(BaseDialog.ButtonsOrientation.VERTICAL).setCancelable(false).show();
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void u(List list) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        c cVar;
        LinearLayout linearLayout3;
        SelectContactView selectContactView = this.a;
        linearLayout = selectContactView.defaultContactsContainer;
        linearLayout.setVisibility(0);
        linearLayout2 = selectContactView.defaultContactsContainer;
        linearLayout2.removeAllViews();
        int size = list.size();
        int i = 0;
        while (i < size) {
            bgq0 bgq0Var = (bgq0) list.get(i);
            cVar = selectContactView.contactItemViewFactory;
            ListItemComponent a = cVar.a(bgq0Var, SelectContactMvpView.UiState.NORMAL, i == list.size() - 1, new d82(1));
            ru.yandex.taxi.design.utils.c.z(new fbq0(selectContactView, bgq0Var, 0), a);
            linearLayout3 = selectContactView.defaultContactsContainer;
            linearLayout3.addView(a);
            i++;
        }
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void updateInputType(int i) {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        animatedListItemInputComponent = this.a.phoneInput;
        animatedListItemInputComponent.updateInputType(i);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void v0(String str) {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        animatedListItemInputComponent = this.a.phoneInput;
        animatedListItemInputComponent.setInputTitle(str);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void v8(String str) {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        animatedListItemInputComponent = this.a.nameInput;
        animatedListItemInputComponent.setValue(str);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void x1() {
        NestedScrollViewAdvanced nestedScrollViewAdvanced;
        RecyclerView recyclerView;
        ShadowScrollIndicator shadowScrollIndicator;
        ImageView imageView;
        SelectContactView selectContactView = this.a;
        nestedScrollViewAdvanced = selectContactView.contactsScrollContainer;
        nestedScrollViewAdvanced.setVisibility(0);
        recyclerView = selectContactView.contactsRecyclerView;
        recyclerView.setVisibility(8);
        selectContactView.setupContactsButton();
        shadowScrollIndicator = selectContactView.lastOrdersShadow;
        shadowScrollIndicator.setVisibility(0);
        imageView = selectContactView.contactsShadow;
        imageView.setVisibility(8);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void xf(List list, SelectContactMvpView.UiState uiState) {
        int i = e.a[uiState.ordinal()];
        SelectContactView selectContactView = this.a;
        if (i == 1) {
            selectContactView.screenTitle.clearTrailText();
            selectContactView.screenTitle.setTrailImage(j0h0.ic_edit_contacts);
            selectContactView.screenTitle.setTrailContainerClickListener(new dbq0(selectContactView, 7));
            selectContactView.screenTitle.setTrailContentDescription(selectContactView.getContext().getString(kyh0.common_edit));
            selectContactView.screenTitle.sendTrailAccessibilityEvent(32768);
            h(list, SelectContactMvpView.UiState.NORMAL);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                w511.b();
                return;
            }
            selectContactView.screenTitle.clearTrailView();
            selectContactView.screenTitle.clearTrailText();
            selectContactView.screenTitle.setTrailContainerClickListener(null);
            selectContactView.screenTitle.setTrailContentDescription(null);
            h(list, SelectContactMvpView.UiState.EMPTY);
            return;
        }
        selectContactView.screenTitle.clearTrailView();
        selectContactView.screenTitle.setTrailCompanionText(selectContactView.getContext().getString(kyh0.common_done));
        selectContactView.screenTitle.setTrailContainerClickListener(new dbq0(selectContactView, 8));
        selectContactView.screenTitle.setTrailContentDescription(selectContactView.getContext().getString(kyh0.common_done));
        selectContactView.screenTitle.sendTrailAccessibilityEvent(32768);
        h(list, SelectContactMvpView.UiState.EDIT);
    }

    @Override // ru.yandex.taxi.contacts.SelectContactMvpView
    public final void z() {
        AnimatedListItemInputComponent animatedListItemInputComponent;
        SelectContactView selectContactView = this.a;
        animatedListItemInputComponent = selectContactView.phoneInput;
        ru.yandex.taxi.design.utils.c.e(animatedListItemInputComponent, new dbq0(selectContactView, 6));
    }
}
