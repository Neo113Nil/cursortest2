package ru.yandex.taxi.contacts;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.abq0;
import defpackage.avj0;
import defpackage.bfh0;
import defpackage.bgb0;
import defpackage.bgq0;
import defpackage.cde;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dbq0;
import defpackage.dde;
import defpackage.drh0;
import defpackage.dsg0;
import defpackage.dzg0;
import defpackage.e3o0;
import defpackage.epo0;
import defpackage.evu0;
import defpackage.fce;
import defpackage.g18;
import defpackage.gbq0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mx60;
import defpackage.ny61;
import defpackage.qa0;
import defpackage.qc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.uq1;
import defpackage.uyo0;
import defpackage.w0q0;
import defpackage.xd2;
import defpackage.zaq0;
import defpackage.zde;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.utils.BaseTextWatcher;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001aB+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010TR\u0016\u0010_\u001a\u0004\u0018\u00010^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lru/yandex/taxi/contacts/SelectContactView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/contacts/d;", "presenter", "Lru/yandex/taxi/contacts/c;", "contactItemViewFactory", "Luq1;", "alertDialogFactory", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/contacts/d;Lru/yandex/taxi/contacts/c;Luq1;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View;", "getScreenTitle", "()Landroid/view/View;", "Ljava/lang/Runnable;", "keyboardClosed", "setKeyboardCloseListener", "(Ljava/lang/Runnable;)V", "setTitleNavigation", "dismiss", "setupContactsButton", "dismissErrorDialog", "Lru/yandex/taxi/design/AnimatedListItemInputComponent;", "input", "onKeyboardClose", "(Lru/yandex/taxi/design/AnimatedListItemInputComponent;)V", "closeKeyboard", "Lru/yandex/taxi/contacts/d;", "Lru/yandex/taxi/contacts/c;", "Luq1;", "Lzaq0;", "binding", "Lzaq0;", "getBinding", "()Lzaq0;", "Lru/yandex/taxi/design/ListItemComponent;", "screenTitle", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/widget/RobotoTextView;", "screenDescription", "Lru/yandex/taxi/widget/RobotoTextView;", "phoneInput", "Lru/yandex/taxi/design/AnimatedListItemInputComponent;", "nameInput", "phoneNameDivider", "Landroid/view/View;", "Landroid/widget/LinearLayout;", "lastContactsGroup", "Landroid/widget/LinearLayout;", "defaultContactsContainer", "lastContactsContainer", "Lru/yandex/taxi/design/ButtonComponent;", "confirm", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "contactsScrollContainer", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "Landroidx/recyclerview/widget/RecyclerView;", "contactsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/widget/scroll/ShadowScrollIndicator;", "lastOrdersShadow", "Lru/yandex/taxi/widget/scroll/ShadowScrollIndicator;", "Landroid/widget/ImageView;", "contactsShadow", "Landroid/widget/ImageView;", "Landroid/widget/FrameLayout;", "permissionErrorContainer", "Landroid/widget/FrameLayout;", "Lru/yandex/taxi/widget/dialog/AlertDialog;", "alertDialog", "Lru/yandex/taxi/widget/dialog/AlertDialog;", "Lfce;", "contactsAdapter", "Lfce;", "", "permissionErrorText", "Ljava/lang/String;", "pickFromContactClicked", "Ljava/lang/Runnable;", "manuallyInputClick", "Lru/yandex/taxi/utils/BaseTextWatcher;", "phoneTextWatcher", "Lru/yandex/taxi/utils/BaseTextWatcher;", "nameTextWatcher", "Lmx60;", "onBackPressedCallback", "Lmx60;", "keyboardClose", "Lg18;", "insetsConsumeCancellable", "Lg18;", "ru/yandex/taxi/contacts/f", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SelectContactView extends ConstraintLayout {
    private AlertDialog alertDialog;
    private final uq1 alertDialogFactory;
    private final zaq0 binding;
    private final ButtonComponent confirm;
    private final c contactItemViewFactory;
    private final fce contactsAdapter;
    private final RecyclerView contactsRecyclerView;
    private final NestedScrollViewAdvanced contactsScrollContainer;
    private final ImageView contactsShadow;
    private final LinearLayout defaultContactsContainer;
    private final g18 insetsConsumeCancellable;
    private Runnable keyboardClose;
    private final LinearLayout lastContactsContainer;
    private final LinearLayout lastContactsGroup;
    private final ShadowScrollIndicator lastOrdersShadow;
    private final Runnable manuallyInputClick;
    private final AnimatedListItemInputComponent nameInput;
    private final BaseTextWatcher nameTextWatcher;
    private final mx60 onBackPressedCallback;
    private final FrameLayout permissionErrorContainer;
    private final String permissionErrorText;
    private final AnimatedListItemInputComponent phoneInput;
    private final View phoneNameDivider;
    private final BaseTextWatcher phoneTextWatcher;
    private final Runnable pickFromContactClicked;
    private final d presenter;
    private final RobotoTextView screenDescription;
    private final ListItemComponent screenTitle;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.contacts.SelectContactView$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(((fce) this.receiver).getItemViewType(((Number) obj).intValue()) == 1);
        }
    }

    public SelectContactView(Context context, d dVar, c cVar, uq1 uq1Var) {
        super(context);
        View O;
        this.presenter = dVar;
        this.contactItemViewFactory = cVar;
        this.alertDialogFactory = uq1Var;
        LayoutInflater.from(context).inflate(drh0.select_contact_input_view, this);
        int i = bfh0.contacts_confirm_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
        if (buttonComponent != null) {
            i = bfh0.contacts_recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, this);
            if (recyclerView != null) {
                i = bfh0.contacts_recycler_view_scroll_shadow;
                ImageView imageView = (ImageView) cma1.O(i, this);
                if (imageView != null) {
                    i = bfh0.contacts_scroll_container;
                    NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, this);
                    if (nestedScrollViewAdvanced != null) {
                        i = bfh0.default_contacts_container;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i, this);
                        if (linearLayout != null) {
                            i = bfh0.last_contacts_group;
                            LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, this);
                            if (linearLayout2 != null) {
                                i = bfh0.last_orders_container;
                                LinearLayout linearLayout3 = (LinearLayout) cma1.O(i, this);
                                if (linearLayout3 != null) {
                                    i = bfh0.last_orders_header;
                                    if (((ListGroupHeaderComponent) cma1.O(i, this)) != null) {
                                        i = bfh0.last_orders_shadow;
                                        ShadowScrollIndicator shadowScrollIndicator = (ShadowScrollIndicator) cma1.O(i, this);
                                        if (shadowScrollIndicator != null) {
                                            i = bfh0.name_input;
                                            AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, this);
                                            if (animatedListItemInputComponent != null) {
                                                i = bfh0.permission_error_container;
                                                FrameLayout frameLayout = (FrameLayout) cma1.O(i, this);
                                                if (frameLayout != null) {
                                                    i = bfh0.phone_input;
                                                    AnimatedListItemInputComponent animatedListItemInputComponent2 = (AnimatedListItemInputComponent) cma1.O(i, this);
                                                    if (animatedListItemInputComponent2 != null && (O = cma1.O((i = bfh0.phone_name_divider), this)) != null) {
                                                        i = bfh0.phone_select_description;
                                                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                                                        if (robotoTextView != null) {
                                                            i = bfh0.phone_select_title;
                                                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
                                                            if (listItemComponent != null) {
                                                                this.binding = new zaq0(this, buttonComponent, recyclerView, imageView, nestedScrollViewAdvanced, linearLayout, linearLayout2, linearLayout3, shadowScrollIndicator, animatedListItemInputComponent, frameLayout, animatedListItemInputComponent2, O, robotoTextView, listItemComponent);
                                                                this.screenTitle = listItemComponent;
                                                                this.screenDescription = robotoTextView;
                                                                this.phoneInput = animatedListItemInputComponent2;
                                                                this.nameInput = animatedListItemInputComponent;
                                                                this.phoneNameDivider = O;
                                                                this.lastContactsGroup = linearLayout2;
                                                                this.defaultContactsContainer = linearLayout;
                                                                this.lastContactsContainer = linearLayout3;
                                                                this.confirm = buttonComponent;
                                                                this.contactsScrollContainer = nestedScrollViewAdvanced;
                                                                this.contactsRecyclerView = recyclerView;
                                                                this.lastOrdersShadow = shadowScrollIndicator;
                                                                this.contactsShadow = imageView;
                                                                this.permissionErrorContainer = frameLayout;
                                                                fce fceVar = new fce(new qa0(27, dVar), new ArrayList());
                                                                this.contactsAdapter = fceVar;
                                                                recyclerView.setAdapter(fceVar);
                                                                recyclerView.addItemDecoration(new cde(recyclerView, new AnonymousClass1(1, fceVar, fce.class, "isHeader", "isHeader(I)Z", 0)));
                                                                animatedListItemInputComponent2.setUseClearTextButton(true);
                                                                animatedListItemInputComponent.setUseClearTextButton(true);
                                                                this.permissionErrorText = getContext().getString(kyh0.order_for_other_contact_pick_permission_error_message);
                                                                this.pickFromContactClicked = new dbq0(this, 2);
                                                                this.manuallyInputClick = new dbq0(this, 3);
                                                                this.phoneTextWatcher = new BaseTextWatcher() { // from class: ru.yandex.taxi.contacts.SelectContactView$phoneTextWatcher$1
                                                                    @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
                                                                    public void afterTextChanged(Editable s) {
                                                                        d dVar2;
                                                                        AnimatedListItemInputComponent animatedListItemInputComponent3;
                                                                        dVar2 = SelectContactView.this.presenter;
                                                                        String obj = s.toString();
                                                                        animatedListItemInputComponent3 = SelectContactView.this.nameInput;
                                                                        dVar2.Pg(obj, animatedListItemInputComponent3.value().toString());
                                                                    }
                                                                };
                                                                this.nameTextWatcher = new BaseTextWatcher() { // from class: ru.yandex.taxi.contacts.SelectContactView$nameTextWatcher$1
                                                                    @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
                                                                    public void afterTextChanged(Editable s) {
                                                                        d dVar2;
                                                                        AnimatedListItemInputComponent animatedListItemInputComponent3;
                                                                        dVar2 = SelectContactView.this.presenter;
                                                                        animatedListItemInputComponent3 = SelectContactView.this.phoneInput;
                                                                        dVar2.Pg(animatedListItemInputComponent3.value().toString(), s.toString());
                                                                    }
                                                                };
                                                                this.onBackPressedCallback = new qc(19, this);
                                                                androidx.core.view.b.q(listItemComponent.title(), true);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void closeKeyboard() {
        if (this.phoneInput.getInputFocused()) {
            this.phoneInput.clearInputFocus();
            AnimatedListItemInputComponent animatedListItemInputComponent = this.phoneInput;
            if (animatedListItemInputComponent == null) {
                return;
            }
            animatedListItemInputComponent.post(new ce0(animatedListItemInputComponent, 15));
            return;
        }
        if (this.nameInput.getInputFocused()) {
            this.nameInput.clearInputFocus();
            AnimatedListItemInputComponent animatedListItemInputComponent2 = this.nameInput;
            if (animatedListItemInputComponent2 == null) {
                return;
            }
            animatedListItemInputComponent2.post(new ce0(animatedListItemInputComponent2, 15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contactsAdapter$onContactClick(d dVar, dde ddeVar) {
        dde ddeVar2 = dVar.K;
        if (ddeVar2 == null || !jl40.l(ddeVar2.a, ddeVar.a)) {
            dVar.K = ddeVar;
            ((SelectContactMvpView) dVar.Dg()).f0();
        } else {
            dVar.K = null;
            ((SelectContactMvpView) dVar.Dg()).i0();
        }
        SelectContactMvpView selectContactMvpView = (SelectContactMvpView) dVar.Dg();
        zde zdeVar = dVar.B;
        List list = dVar.G ? EmptyList.a : dVar.y.d;
        List list2 = dVar.J;
        dde ddeVar3 = dVar.K;
        String str = ddeVar3 != null ? ddeVar3.a : null;
        zdeVar.getClass();
        selectContactMvpView.r(zde.a(str, list, list2));
    }

    private final void dismissErrorDialog() {
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void manuallyInputClick$lambda$0(SelectContactView selectContactView) {
        selectContactView.dismissErrorDialog();
        selectContactView.nameInput.clearInputFocus();
        selectContactView.phoneInput.focusInput();
        AnimatedListItemInputComponent animatedListItemInputComponent = selectContactView.phoneInput;
        if (animatedListItemInputComponent == null) {
            return;
        }
        animatedListItemInputComponent.post(new xd2(animatedListItemInputComponent, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(SelectContactView selectContactView) {
        d dVar = selectContactView.presenter;
        if (dVar.F) {
            tje.N(dVar.Jg(), null, null, new SelectContactPresenter$onKeyboardClosed$1(dVar, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(SelectContactView selectContactView) {
        selectContactView.closeKeyboard();
        d dVar = selectContactView.presenter;
        String obj = selectContactView.phoneInput.value().toString();
        String obj2 = selectContactView.nameInput.value().toString();
        String inputTitle = selectContactView.phoneInput.getInputTitle();
        abq0 abq0Var = dVar.D;
        gbq0 gbq0Var = dVar.y;
        if (gbq0Var.o) {
            dde ddeVar = dVar.K;
            if (ddeVar != null) {
                abq0Var.I(new bgq0(ddeVar.b, dVar.Mg(ddeVar.c), ddeVar.d, ddeVar.a));
                return;
            } else {
                abq0Var.I(new bgq0("", dVar.Mg(obj), SelectedFrom.MANUAL, ""));
                return;
            }
        }
        if (!bgb0.g(obj) && !gbq0Var.j) {
            ((SelectContactMvpView) dVar.Dg()).t();
            return;
        }
        if (!jl40.l(inputTitle, ((avj0) dVar.A).h(kyh0.order_for_other_phone_input_hint))) {
            obj2 = inputTitle;
        }
        abq0Var.I(new bgq0(obj2, obj, dVar.E ? SelectedFrom.CONTACTS : SelectedFrom.MANUAL, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$2(SelectContactView selectContactView) {
        selectContactView.onKeyboardClose(selectContactView.phoneInput);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$3(SelectContactView selectContactView) {
        selectContactView.onKeyboardClose(selectContactView.nameInput);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$4(SelectContactView selectContactView, boolean z) {
        d dVar = selectContactView.presenter;
        if (z) {
            ((SelectContactMvpView) dVar.Dg()).g0();
        } else {
            dVar.getClass();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$5(SelectContactView selectContactView, Integer num, KeyEvent keyEvent) {
        if ((num == null || num.intValue() != 5) && (num == null || num.intValue() != 6)) {
            return false;
        }
        if (selectContactView.nameInput.getVisibility() != 0) {
            return true;
        }
        selectContactView.nameInput.requestFocus();
        return true;
    }

    private final void onKeyboardClose(AnimatedListItemInputComponent input) {
        input.clearInputFocus();
        Runnable runnable = this.keyboardClose;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickFromContactClicked$lambda$0(SelectContactView selectContactView) {
        selectContactView.dismissErrorDialog();
        selectContactView.phoneInput.clearInputFocus();
        selectContactView.nameInput.clearInputFocus();
        d dVar = selectContactView.presenter;
        tje.N(dVar.Jg(), null, null, new SelectContactPresenter$onPickFromContact$1(dVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setKeyboardCloseListener$lambda$0(SelectContactView selectContactView, Runnable runnable) {
        d dVar = selectContactView.presenter;
        if (dVar.F) {
            tje.N(dVar.Jg(), null, null, new SelectContactPresenter$onKeyboardClosed$1(dVar, null), 3);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleNavigation$lambda$0(SelectContactView selectContactView) {
        selectContactView.closeKeyboard();
        d dVar = selectContactView.presenter;
        if (dVar.L) {
            return;
        }
        dVar.D.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupContactsButton() {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setText(getContext().getString(kyh0.choose_contacts_select_from_contacts));
        buttonComponent.setAccent(true);
        buttonComponent.setTextSize(2, 13.0f);
        buttonComponent.setOnClickListener(new dbq0(this, 0));
        this.phoneInput.setTrailView(buttonComponent);
        this.phoneInput.setTrailPaddings(tje.r(dsg0.trail_left_padding, getContext()), tje.r(dsg0.trail_top_padding, getContext()), tje.r(dsg0.trail_right_padding, getContext()), tje.r(dsg0.trail_bottom_padding, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupContactsButton$lambda$0(SelectContactView selectContactView) {
        d dVar = selectContactView.presenter;
        tje.N(dVar.Jg(), null, null, new SelectContactPresenter$onPickFromContact$1(dVar, null), 3);
    }

    public final void dismiss() {
        g18 g18Var = this.insetsConsumeCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        closeKeyboard();
    }

    public final zaq0 getBinding() {
        return this.binding;
    }

    public final View getScreenTitle() {
        return this.screenTitle.title();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.keyboardClose = new dbq0(this, 4);
        this.confirm.setDebounceClickListener(new dbq0(this, 5));
        this.phoneInput.addTextChangedListener(this.phoneTextWatcher);
        this.nameInput.addTextChangedListener(this.nameTextWatcher);
        final int i = 0;
        this.phoneInput.setOnKeyboardClosed(new sls(this) { // from class: ebq0
            public final /* synthetic */ SelectContactView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onAttachedToWindow$lambda$2;
                zy11 onAttachedToWindow$lambda$3;
                int i2 = i;
                SelectContactView selectContactView = this.b;
                switch (i2) {
                    case 0:
                        onAttachedToWindow$lambda$2 = SelectContactView.onAttachedToWindow$lambda$2(selectContactView);
                        return onAttachedToWindow$lambda$2;
                    default:
                        onAttachedToWindow$lambda$3 = SelectContactView.onAttachedToWindow$lambda$3(selectContactView);
                        return onAttachedToWindow$lambda$3;
                }
            }
        });
        final int i2 = 1;
        this.nameInput.setOnKeyboardClosed(new sls(this) { // from class: ebq0
            public final /* synthetic */ SelectContactView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onAttachedToWindow$lambda$2;
                zy11 onAttachedToWindow$lambda$3;
                int i22 = i2;
                SelectContactView selectContactView = this.b;
                switch (i22) {
                    case 0:
                        onAttachedToWindow$lambda$2 = SelectContactView.onAttachedToWindow$lambda$2(selectContactView);
                        return onAttachedToWindow$lambda$2;
                    default:
                        onAttachedToWindow$lambda$3 = SelectContactView.onAttachedToWindow$lambda$3(selectContactView);
                        return onAttachedToWindow$lambda$3;
                }
            }
        });
        this.phoneInput.setOnFocusStateChanged(new uyo0(18, this));
        this.phoneInput.overrideOnEditorActionListener(new e3o0(12, this));
        this.screenTitle.title().setFocusable(true);
        d dVar = this.presenter;
        f fVar = new f(this);
        dVar.Bg(fVar);
        gbq0 gbq0Var = dVar.y;
        String str = gbq0Var.a;
        this.screenTitle.setTitle(str);
        CharSequence text = this.screenDescription.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        this.screenTitle.title().setContentDescription(str + obj);
        Integer num = gbq0Var.b;
        if (num != null) {
            this.screenTitle.setTitleAlignment(num.intValue());
        }
        Integer num2 = gbq0Var.c;
        if (num2 != null) {
            this.screenTitle.setTitleTextSizePx(num2.intValue());
        }
        String str2 = gbq0Var.e;
        String obj2 = this.screenTitle.title().getText() != null ? this.screenTitle.title().getText().toString() : "";
        if (str2 == null || evu0.J(str2)) {
            this.screenDescription.setVisibility(8);
            this.screenTitle.title().setContentDescription(obj2);
        } else {
            this.screenDescription.setVisibility(0);
            this.screenDescription.setText(str2);
            this.screenTitle.title().setContentDescription(obj2 + str2);
        }
        this.confirm.setAccent(gbq0Var.n);
        if (gbq0Var.o) {
            dVar.Rg(fVar);
        } else {
            dVar.Sg(fVar);
        }
        tje.a0(getContext(), this.onBackPressedCallback);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.screenTitle.getLeadImageView().setOnClickListener(null);
        this.confirm.setDebounceClickListener(null);
        this.phoneInput.setTrailClickListener(new w0q0(21));
        this.phoneInput.removeTextChangedListener(this.phoneTextWatcher);
        this.phoneInput.setOnKeyboardClosed(new w0q0(22));
        this.nameInput.removeTextChangedListener(this.nameTextWatcher);
        this.nameInput.setOnKeyboardClosed(new w0q0(23));
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.presenter.Cg();
        this.onBackPressedCallback.g();
    }

    public final void setKeyboardCloseListener(Runnable keyboardClosed) {
        this.keyboardClose = new epo0(11, this, keyboardClosed);
    }

    public final void setTitleNavigation() {
        this.screenTitle.setLeadImage(dzg0.ic_arrow_back_24dp);
        this.screenTitle.getLeadImageView().setDebounceClickListener(new dbq0(this, 1));
        this.screenTitle.getLeadImageView().setContentDescription(getContext().getString(kyh0.common_back));
    }
}
