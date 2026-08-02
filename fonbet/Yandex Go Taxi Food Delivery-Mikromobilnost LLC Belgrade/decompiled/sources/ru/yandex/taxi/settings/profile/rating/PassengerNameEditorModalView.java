package ru.yandex.taxi.settings.profile.rating;

import android.content.Context;
import android.view.View;
import defpackage.a9h0;
import defpackage.bl90;
import defpackage.c230;
import defpackage.cdf0;
import defpackage.ddf0;
import defpackage.dl90;
import defpackage.g18;
import defpackage.jj10;
import defpackage.klh0;
import defpackage.l8x;
import defpackage.pw0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tse;
import defpackage.xw31;
import defpackage.zk90;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.settings.profile.ProfileAnalyticsReporter$PreviousScreenIdentifier;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\u0010H\u0014¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\"\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010%\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/yandex/taxi/settings/profile/rating/PassengerNameEditorModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lbl90;", "Landroid/content/Context;", "context", "Ldl90;", "presenter", "Ltse;", "mainScope", "<init>", "(Landroid/content/Context;Ldl90;Ltse;)V", "Lc230;", "insetsType", "()Lc230;", "", "error", "Lzy11;", "showError", "(Ljava/lang/String;)V", "showLoading", "()V", "hideLoading", "onDismissManually", "", ClidProvider.APP_ACTIVE, "makeButtonActive", "(Z)V", "name", "preSetText", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onSuccessfulUpdate", "onAttachedToWindow", "onDetachedFromWindow", "Ldl90;", "Ltse;", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/ButtonComponent;", "saveNameButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/design/ListItemInputComponent;", "nameInput", "Lru/yandex/taxi/design/ListItemInputComponent;", "Ll8x;", "inputChangedJob", "Ll8x;", "focusChangedJob", "Lg18;", "onPreDrawCancellable", "Lg18;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PassengerNameEditorModalView extends ModalView implements bl90 {
    public static final int $stable = 8;
    private final View content;
    private l8x focusChangedJob;
    private l8x inputChangedJob;
    private final tse mainScope;
    private final ListItemInputComponent nameInput;
    private g18 onPreDrawCancellable;
    private final dl90 presenter;
    private final ButtonComponent saveNameButton;

    public PassengerNameEditorModalView(Context context, dl90 dl90Var, tse tseVar) {
        super(context);
        this.presenter = dl90Var;
        this.mainScope = tseVar;
        ru.yandex.taxi.design.utils.c.q(this, klh0.passenger_name_edit_modal_view, true);
        int i = a9h0.content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.content = (View) rp31.d(this, i);
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, a9h0.passenger_name_save));
        this.saveNameButton = buttonComponent;
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(this, a9h0.passenger_name_input));
        this.nameInput = listItemInputComponent;
        this.onPreDrawCancellable = g18.u1;
        xw31.y(tje.u(12, getContext()), listItemInputComponent.getInput());
        listItemInputComponent.getInput().setOnCloseListener(new pw0(5, this));
        listItemInputComponent.setOnClear(new zk90(this, 1));
        listItemInputComponent.setMaxLines(1);
        buttonComponent.setOnClickListener(new zk90(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PassengerNameEditorModalView passengerNameEditorModalView) {
        dl90 dl90Var = passengerNameEditorModalView.presenter;
        ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier = dl90Var.D;
        if (profileAnalyticsReporter$PreviousScreenIdentifier != null) {
            ddf0 ddf0Var = dl90Var.A;
            cdf0 a = ddf0Var.a();
            jj10 jj10Var = ddf0Var.d;
            String str = a.a;
            Boolean valueOf = Boolean.valueOf(a.b);
            Boolean valueOf2 = Boolean.valueOf(a.c);
            String context = profileAnalyticsReporter$PreviousScreenIdentifier.getContext();
            jj10Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("rating", str);
            hashMap.put("photo_flg", valueOf);
            hashMap.put("user_name_flg", valueOf2);
            if (context != null) {
                hashMap.put("context", context);
            }
            jj10Var.a.a("Menu.UserName.Cancelled", hashMap, 1, new HashMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(PassengerNameEditorModalView passengerNameEditorModalView) {
        dl90 dl90Var = passengerNameEditorModalView.presenter;
        tje.N(dl90Var.Jg(), null, null, new PassengerNamePresenter$clickSendName$1(dl90Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(PassengerNameEditorModalView passengerNameEditorModalView) {
        passengerNameEditorModalView.nameInput.getInput().requestFocus();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // defpackage.bl90
    public void hideLoading() {
        this.saveNameButton.finishProgress();
        setDismissOnBackPressed(true);
        setDismissOnTouchOutside(true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // defpackage.bl90
    public void makeButtonActive(boolean active) {
        this.saveNameButton.setEnabled(active);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.inputChangedJob = tje.N(this.mainScope, null, null, new PassengerNameEditorModalView$onAttachedToWindow$$inlined$safeCollectIn$1(this.nameInput.textValueFlow(), null, this), 3);
        this.focusChangedJob = tje.N(this.mainScope, null, null, new PassengerNameEditorModalView$onAttachedToWindow$$inlined$safeCollectIn$2(this.nameInput.textFocusFlow(), null, this), 3);
        this.presenter.Kg(this);
        this.onPreDrawCancellable = ru.yandex.taxi.design.utils.c.f(this, new zk90(this, 0));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.inputChangedJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        l8x l8xVar2 = this.focusChangedJob;
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        this.onPreDrawCancellable.cancel();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        this.presenter.Mg();
    }

    @Override // defpackage.bl90
    public void onSuccessfulUpdate() {
        setDismissOnBackPressed(true);
        onBackPressed();
    }

    @Override // defpackage.bl90
    public void preSetText(String name) {
        this.nameInput.setText(name);
        this.nameInput.placeCursorAtEnd();
    }

    @Override // defpackage.bl90
    public void showError(String error) {
        this.nameInput.setAlertText(error);
    }

    @Override // defpackage.bl90
    public void showLoading() {
        this.saveNameButton.startProgress();
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
    }
}
