package ru.yandex.taxi.settings.profile.rating;

import android.content.Context;
import android.view.View;
import defpackage.a9h0;
import defpackage.bl90;
import defpackage.c230;
import defpackage.cdf0;
import defpackage.cl90;
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
import defpackage.xk90;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.settings.profile.ProfileAnalyticsReporter$PreviousScreenIdentifier;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0012H\u0014¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0012H\u0014¢\u0006\u0004\b!\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/yandex/taxi/settings/profile/rating/PassengerNameCreatorModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lbl90;", "Landroid/content/Context;", "context", "Ldl90;", "presenter", "Ltse;", "mainScope", "Lru/yandex/taxi/settings/profile/ProfileAnalyticsReporter$PreviousScreenIdentifier;", "previousScreenIdentifier", "<init>", "(Landroid/content/Context;Ldl90;Ltse;Lru/yandex/taxi/settings/profile/ProfileAnalyticsReporter$PreviousScreenIdentifier;)V", "Lc230;", "insetsType", "()Lc230;", "", "error", "Lzy11;", "showError", "(Ljava/lang/String;)V", "showLoading", "()V", "hideLoading", "onDismissManually", "", ClidProvider.APP_ACTIVE, "makeButtonActive", "(Z)V", "name", "preSetText", "onSuccessfulUpdate", "onAttachedToWindow", "onDetachedFromWindow", "Ldl90;", "Ltse;", "Lru/yandex/taxi/design/ButtonComponent;", "sendNameButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/design/ListItemInputComponent;", "nameInput", "Lru/yandex/taxi/design/ListItemInputComponent;", "Ll8x;", "inputChangedJob", "Ll8x;", "focusChangedJob", "Lg18;", "onPreDrawCancellable", "Lg18;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PassengerNameCreatorModalView extends SlideableModalView implements bl90 {
    public static final int $stable = 8;
    private l8x focusChangedJob;
    private l8x inputChangedJob;
    private final tse mainScope;
    private final ListItemInputComponent nameInput;
    private g18 onPreDrawCancellable;
    private final dl90 presenter;
    private final ButtonComponent sendNameButton;

    public PassengerNameCreatorModalView(Context context, dl90 dl90Var, tse tseVar, ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier) {
        super(context);
        this.presenter = dl90Var;
        this.mainScope = tseVar;
        int i = a9h0.show_rating_button;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, i));
        this.sendNameButton = buttonComponent;
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(this, a9h0.passenger_name_input));
        this.nameInput = listItemInputComponent;
        this.onPreDrawCancellable = g18.u1;
        dl90Var.D = profileAnalyticsReporter$PreviousScreenIdentifier;
        listItemInputComponent.getInput().setOnCloseListener(new pw0(4, this));
        listItemInputComponent.setEllipsizeHint(false);
        buttonComponent.setOnClickListener(new xk90(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PassengerNameCreatorModalView passengerNameCreatorModalView) {
        dl90 dl90Var = passengerNameCreatorModalView.presenter;
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
            jj10Var.a.a("Menu.UserName.RatingShowTapped", hashMap, 1, new HashMap());
        }
        tje.N(dl90Var.Jg(), null, null, new PassengerNamePresenter$clickSendName$1(dl90Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(PassengerNameCreatorModalView passengerNameCreatorModalView) {
        passengerNameCreatorModalView.nameInput.getInput().requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccessfulUpdate$lambda$0(PassengerNameCreatorModalView passengerNameCreatorModalView) {
        cl90 cl90Var = passengerNameCreatorModalView.presenter.E;
        if (cl90Var != null) {
            cl90Var.w();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return klh0.passenger_name_create_modal_view;
    }

    @Override // defpackage.bl90
    public void hideLoading() {
        this.sendNameButton.stopAnimation();
        setDismissOnBackPressed(true);
        setDismissOnTouchOutside(true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // defpackage.bl90
    public void makeButtonActive(boolean active) {
        this.sendNameButton.setEnabled(active);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.inputChangedJob = tje.N(this.mainScope, null, null, new PassengerNameCreatorModalView$onAttachedToWindow$$inlined$safeCollectIn$1(this.nameInput.textValueFlow(), null, this), 3);
        this.focusChangedJob = tje.N(this.mainScope, null, null, new PassengerNameCreatorModalView$onAttachedToWindow$$inlined$safeCollectIn$2(this.nameInput.textFocusFlow(), null, this), 3);
        this.presenter.Kg(this);
        this.onPreDrawCancellable = ru.yandex.taxi.design.utils.c.f(this, new xk90(this, 1));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
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
        dismissWithAction(new xk90(this, 0));
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
        this.sendNameButton.startAnimation();
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
    }
}
