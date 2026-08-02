package ru.yandex.taxi.delivery.contacts;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.apf;
import defpackage.avj0;
import defpackage.b1;
import defpackage.b1i;
import defpackage.b9h;
import defpackage.bgb0;
import defpackage.bgq0;
import defpackage.bhh;
import defpackage.bmh;
import defpackage.c230;
import defpackage.cde;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dde;
import defpackage.deh0;
import defpackage.dsg0;
import defpackage.e1i;
import defpackage.fce;
import defpackage.hqh0;
import defpackage.i1i;
import defpackage.iwh;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mjf;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pex0;
import defpackage.qa0;
import defpackage.qz10;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tqs;
import defpackage.uq1;
import defpackage.vpa;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.x0i;
import defpackage.xd2;
import defpackage.y0i;
import defpackage.zde;
import defpackage.zvg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.contacts.SelectContactMvpView;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.contacts.c;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.utils.BaseTextWatcher;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.dialog.AlertDialog;

@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001E\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0012H\u0014¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0012H\u0014¢\u0006\u0004\b&\u0010\u0014J\u000f\u0010'\u001a\u00020\u0012H\u0014¢\u0006\u0004\b'\u0010\u0014J\u000f\u0010(\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010\u0014J\u000f\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010\u0014J\u000f\u0010*\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b0\u0010\u0014J\u000f\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b1\u0010\u0014J\u001d\u00105\u001a\u00020\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00120A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/yandex/taxi/delivery/contacts/DeliveryContactsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Li1i;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/delivery/contacts/a;", "presenter", "Lru/yandex/taxi/contacts/c;", "selectContactItemViewFactory", "Luq1;", "alertDialogFactory", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/delivery/contacts/a;Lru/yandex/taxi/contacts/c;Luq1;Lpav;)V", "Lc230;", "insetsType", "()Lc230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "newState", "", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li1i;", "onBackPressed", "onSlideOut", "onTouchOutside", "hideKeyboard", "initViews", "setupContactsButton", "Lru/yandex/taxi/design/AnimatedListItemInputComponent;", "input", "onKeyboardClose", "(Lru/yandex/taxi/design/AnimatedListItemInputComponent;)V", "closeKeyboard", "dismissErrorDialog", "setLayoutParams", "", "Lbgq0;", ContactsFragment.WEBVIEW_NAME, "createDefaultContactsView", "(Ljava/util/List;)V", "Lru/yandex/taxi/delivery/contacts/a;", "Lru/yandex/taxi/contacts/c;", "Luq1;", "Lpav;", "Lfce;", "contactsAdapter", "Lfce;", "Lru/yandex/taxi/widget/dialog/AlertDialog;", "alertDialog", "Lru/yandex/taxi/widget/dialog/AlertDialog;", "Lkotlin/Function0;", "pickFromContactClicked", "Lsls;", "manuallyInputClicked", "ru/yandex/taxi/delivery/contacts/DeliveryContactsModalView$phoneTextWatcher$1", "phoneTextWatcher", "Lru/yandex/taxi/delivery/contacts/DeliveryContactsModalView$phoneTextWatcher$1;", "b1i", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryContactsModalView extends SlideableBindingModalView<i1i> {
    private AlertDialog alertDialog;
    private final uq1 alertDialogFactory;
    private fce contactsAdapter;
    private final pav imageLoader;
    private final sls manuallyInputClicked;
    private final DeliveryContactsModalView$phoneTextWatcher$1 phoneTextWatcher;
    private final sls pickFromContactClicked;
    private final a presenter;
    private final c selectContactItemViewFactory;

    /* JADX WARN: Type inference failed for: r1v3, types: [ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView$phoneTextWatcher$1] */
    public DeliveryContactsModalView(Context context, a aVar, c cVar, uq1 uq1Var, pav pavVar) {
        super(context);
        this.presenter = aVar;
        this.selectContactItemViewFactory = cVar;
        this.alertDialogFactory = uq1Var;
        this.imageLoader = pavVar;
        final int i = 0;
        this.pickFromContactClicked = new sls(this) { // from class: z0i
            public final /* synthetic */ DeliveryContactsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 pickFromContactClicked$lambda$0;
                zy11 manuallyInputClicked$lambda$0;
                int i2 = i;
                DeliveryContactsModalView deliveryContactsModalView = this.b;
                switch (i2) {
                    case 0:
                        pickFromContactClicked$lambda$0 = DeliveryContactsModalView.pickFromContactClicked$lambda$0(deliveryContactsModalView);
                        return pickFromContactClicked$lambda$0;
                    default:
                        manuallyInputClicked$lambda$0 = DeliveryContactsModalView.manuallyInputClicked$lambda$0(deliveryContactsModalView);
                        return manuallyInputClicked$lambda$0;
                }
            }
        };
        final int i2 = 1;
        this.manuallyInputClicked = new sls(this) { // from class: z0i
            public final /* synthetic */ DeliveryContactsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 pickFromContactClicked$lambda$0;
                zy11 manuallyInputClicked$lambda$0;
                int i22 = i2;
                DeliveryContactsModalView deliveryContactsModalView = this.b;
                switch (i22) {
                    case 0:
                        pickFromContactClicked$lambda$0 = DeliveryContactsModalView.pickFromContactClicked$lambda$0(deliveryContactsModalView);
                        return pickFromContactClicked$lambda$0;
                    default:
                        manuallyInputClicked$lambda$0 = DeliveryContactsModalView.manuallyInputClicked$lambda$0(deliveryContactsModalView);
                        return manuallyInputClicked$lambda$0;
                }
            }
        };
        this.phoneTextWatcher = new BaseTextWatcher() { // from class: ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView$phoneTextWatcher$1
            @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                a aVar2;
                aVar2 = DeliveryContactsModalView.this.presenter;
                String obj = s.toString();
                ((e1i) aVar2.Dg()).v0(((avj0) aVar2.y).h(kyh0.contacts_enter_phone_or_name));
                aVar2.M = true ^ (obj == null || obj.length() == 0);
                if (obj != null) {
                    ru.yandex.taxi.contacts.a aVar3 = aVar2.x;
                    List list = aVar2.N;
                    aVar3.getClass();
                    ArrayList b = ru.yandex.taxi.contacts.a.b(obj, list);
                    aVar2.O = b;
                    zde zdeVar = aVar2.z;
                    List list2 = aVar2.M ? EmptyList.a : aVar2.B.c;
                    zdeVar.getClass();
                    ArrayList a = zde.a(null, list2, b);
                    ((e1i) aVar2.Dg()).i0();
                    aVar2.P = null;
                    ((e1i) aVar2.Dg()).r(a);
                    if (bgb0.e(obj).length() > 0) {
                        ((e1i) aVar2.Dg()).f0();
                    } else {
                        ((e1i) aVar2.Dg()).i0();
                    }
                }
            }
        };
        b.q(getBinding().k, true);
        setDismissOnTouchOutside(false);
    }

    public static final /* synthetic */ i1i access$getBinding(DeliveryContactsModalView deliveryContactsModalView) {
        return deliveryContactsModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeKeyboard() {
        if (getBinding().i.getInputFocused()) {
            getBinding().i.clearInputFocus();
            AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().i;
            animatedListItemInputComponent.post(new ce0(animatedListItemInputComponent, 15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createDefaultContactsView(List<bgq0> contacts) {
        getBinding().g.removeAllViews();
        int size = contacts.size();
        int i = 0;
        while (i < size) {
            bgq0 bgq0Var = contacts.get(i);
            ListItemComponent a = this.selectContactItemViewFactory.a(bgq0Var, SelectContactMvpView.UiState.NORMAL, i == scc.f(contacts), new vpa(5));
            a.setDebounceClickListener(new zvg(18, this, bgq0Var));
            getBinding().g.addView(a);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDefaultContactsView$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDefaultContactsView$lambda$1(DeliveryContactsModalView deliveryContactsModalView, bgq0 bgq0Var) {
        a aVar = deliveryContactsModalView.presenter;
        aVar.getClass();
        aVar.Og(new bgq0(bgq0Var.a, bgb0.e(bgq0Var.b), bgq0Var.c, bgq0Var.d));
    }

    private final void dismissErrorDialog() {
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        requestFocus();
    }

    private final void hideKeyboard() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private final void initViews() {
        getBinding().b.setDebounceClickListener(new y0i(this, 0));
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().i;
        animatedListItemInputComponent.addTextChangedListener(this.phoneTextWatcher);
        animatedListItemInputComponent.setOnKeyboardClosed(new bmh(10, this, animatedListItemInputComponent));
        animatedListItemInputComponent.setOnFocusStateChanged(new bhh(11, this));
        animatedListItemInputComponent.overrideOnEditorActionListener(new mjf(9, animatedListItemInputComponent, this));
        getBinding().k.setFocusable(true);
        this.contactsAdapter = new fce(new qa0(6, this.presenter), EmptyList.a);
        RecyclerView recyclerView = getBinding().c;
        fce fceVar = this.contactsAdapter;
        if (fceVar == null) {
            fceVar = null;
        }
        recyclerView.setAdapter(fceVar);
        fce fceVar2 = this.contactsAdapter;
        recyclerView.addItemDecoration(new cde(recyclerView, new DeliveryContactsModalView$initViews$4$1(1, fceVar2 == null ? null : fceVar2, fce.class, "isHeader", "isHeader(I)Z", 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(DeliveryContactsModalView deliveryContactsModalView) {
        deliveryContactsModalView.closeKeyboard();
        a aVar = deliveryContactsModalView.presenter;
        String obj = deliveryContactsModalView.getBinding().i.value().toString();
        dde ddeVar = aVar.P;
        aVar.Og(ddeVar != null ? new bgq0(ddeVar.b, bgb0.e(ddeVar.c), ddeVar.d, ddeVar.a) : new bgq0("", bgb0.e(obj), SelectedFrom.MANUAL, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initViews$lambda$1$0(DeliveryContactsModalView deliveryContactsModalView, AnimatedListItemInputComponent animatedListItemInputComponent) {
        deliveryContactsModalView.onKeyboardClose(animatedListItemInputComponent);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initViews$lambda$1$1(DeliveryContactsModalView deliveryContactsModalView, boolean z) {
        a aVar = deliveryContactsModalView.presenter;
        if (z) {
            ((e1i) aVar.Dg()).g0();
        } else {
            aVar.getClass();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initViews$lambda$1$2(AnimatedListItemInputComponent animatedListItemInputComponent, DeliveryContactsModalView deliveryContactsModalView, int i, KeyEvent keyEvent) {
        if (i != 5 && keyEvent.getKeyCode() != 66) {
            return false;
        }
        String obj = animatedListItemInputComponent.value().toString();
        if (obj.length() == 0 && deliveryContactsModalView.getBinding().b.getVisibility() != 0) {
            deliveryContactsModalView.closeKeyboard();
            return true;
        }
        if (deliveryContactsModalView.getBinding().b.getVisibility() != 0 || obj.length() <= 0) {
            return false;
        }
        deliveryContactsModalView.getBinding().b.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$onContactClick(a aVar, dde ddeVar) {
        dde ddeVar2 = aVar.P;
        if (ddeVar2 == null || !jl40.l(ddeVar2.a, ddeVar.a)) {
            aVar.P = ddeVar;
            ((e1i) aVar.Dg()).f0();
        } else {
            aVar.P = null;
            ((e1i) aVar.Dg()).i0();
        }
        e1i e1iVar = (e1i) aVar.Dg();
        zde zdeVar = aVar.z;
        List list = aVar.M ? EmptyList.a : aVar.B.c;
        List list2 = aVar.O;
        dde ddeVar3 = aVar.P;
        String str = ddeVar3 != null ? ddeVar3.a : null;
        zdeVar.getClass();
        e1iVar.r(zde.a(str, list, list2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 manuallyInputClicked$lambda$0(DeliveryContactsModalView deliveryContactsModalView) {
        deliveryContactsModalView.dismissErrorDialog();
        deliveryContactsModalView.getBinding().i.focusInput();
        AnimatedListItemInputComponent animatedListItemInputComponent = deliveryContactsModalView.getBinding().i;
        animatedListItemInputComponent.post(new xd2(animatedListItemInputComponent, 1));
        return zy11.a;
    }

    private final void onKeyboardClose(AnimatedListItemInputComponent input) {
        input.clearInputFocus();
        a aVar = this.presenter;
        if (aVar.L) {
            tje.N(aVar.Jg(), null, null, new DeliveryContactsPresenter$onKeyboardClosed$1(aVar, null), 3);
        }
        requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 pickFromContactClicked$lambda$0(DeliveryContactsModalView deliveryContactsModalView) {
        deliveryContactsModalView.dismissErrorDialog();
        deliveryContactsModalView.getBinding().i.clearInputFocus();
        a aVar = deliveryContactsModalView.presenter;
        tje.N(aVar.Jg(), null, null, new DeliveryContactsPresenter$onPickFromContact$1(aVar, null), 3);
        return zy11.a;
    }

    private final void setLayoutParams() {
        ConstraintLayout constraintLayout = getBinding().e;
        OneShotPreDrawListener.add(constraintLayout, new tqs(6, constraintLayout, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupContactsButton() {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setText(getContext().getString(kyh0.choose_contacts_select_from_contacts));
        buttonComponent.setAccent(true);
        buttonComponent.setTextSize(2, 13.0f);
        buttonComponent.setOnClickListener(new y0i(this, 1));
        getBinding().i.setTrailView(buttonComponent);
        getBinding().i.setTrailPaddings(tje.r(dsg0.trail_left_padding, getContext()), tje.r(dsg0.trail_top_padding, getContext()), tje.r(dsg0.trail_right_padding, getContext()), tje.r(dsg0.trail_bottom_padding, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupContactsButton$lambda$0(DeliveryContactsModalView deliveryContactsModalView) {
        a aVar = deliveryContactsModalView.presenter;
        tje.N(aVar.Jg(), null, null, new DeliveryContactsPresenter$onPickFromContact$1(aVar, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public i1i bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(hqh0.delivery_contacts_view, parent, false);
        int i = deh0.contacts_confirm_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = deh0.contacts_recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = deh0.contacts_recycler_view_scroll_shadow;
                ImageView imageView = (ImageView) cma1.O(i, inflate);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    i = deh0.contacts_toggle;
                    ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i, inflate);
                    if (listItemSwitchComponent != null) {
                        i = deh0.default_contacts_container;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                        if (linearLayout != null) {
                            i = deh0.permission_error_container;
                            FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                            if (frameLayout != null) {
                                i = deh0.phone_input;
                                AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, inflate);
                                if (animatedListItemInputComponent != null) {
                                    i = deh0.phone_select_description;
                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                    if (robotoTextView != null) {
                                        i = deh0.phone_select_title;
                                        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                                        if (listItemComponent != null) {
                                            return new i1i(constraintLayout, buttonComponent, recyclerView, imageView, constraintLayout, listItemSwitchComponent, linearLayout, frameLayout, animatedListItemInputComponent, robotoTextView, listItemComponent);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayoutParams();
        initViews();
        a aVar = this.presenter;
        b1i b1iVar = new b1i(this);
        aVar.Bg(b1iVar);
        x0i x0iVar = aVar.B;
        access$getBinding(this).k.setTitle(x0iVar.b);
        String str = x0iVar.d;
        if (str == null || str.length() == 0) {
            access$getBinding(this).j.setVisibility(8);
        } else {
            access$getBinding(this).j.setVisibility(0);
            access$getBinding(this).j.setText(str);
        }
        String str2 = x0iVar.i;
        if (str2 != null) {
            access$getBinding(this).b.setText(str2);
        }
        if (x0iVar.h) {
            e.H(aVar.Jg(), e.m(aVar.G.b, aVar.H.a(), aVar.I.a(), aVar.K.j, new DeliveryContactsPresenter$attachView$2(b1iVar, aVar, null)));
        }
        aVar.Qg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.presenter.Ng();
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        if (newState == 6) {
            setLayoutParams();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBinding().i.removeTextChangedListener(this.phoneTextWatcher);
        getBinding().b.setDebounceClickListener(null);
        getBinding().i.setOnKeyboardClosed(new b9h(15));
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        a aVar = this.presenter;
        aVar.E.x(aVar.B.a, new qz10(12));
        this.presenter.Cg();
        hideKeyboard();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        String str;
        super.onModalViewAppear(contentTop);
        a aVar = this.presenter;
        apf apfVar = aVar.E;
        DeliveryFormStepType deliveryFormStepType = aVar.B.a;
        b1 b1Var = (b1) apfVar.w;
        int i = iwh.a[deliveryFormStepType.ordinal()];
        if (i == 1) {
            str = "source";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = "destination";
        }
        pex0 m = ((k) ((wiq0) apfVar.b)).m();
        String str2 = m != null ? m.b : null;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("screen_type", str);
        if (str2 != null) {
            hashMap.put(ClidProvider.STATE, str2);
        }
        b1Var.a.a("DeliveryPhoneList.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        IBinder windowToken;
        View findFocus = findFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (findFocus == null || (windowToken = findFocus.getWindowToken()) == null) {
            windowToken = getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        this.presenter.Ng();
        super.onSlideOut();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        this.presenter.Ng();
        super.onTouchOutside();
    }
}
