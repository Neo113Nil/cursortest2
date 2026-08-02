package ru.yandex.taxi.settings.profile.rating;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import defpackage.a9h0;
import defpackage.cdf0;
import defpackage.cne0;
import defpackage.d6z;
import defpackage.ddf0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.jj10;
import defpackage.klh0;
import defpackage.mg21;
import defpackage.nl90;
import defpackage.ol90;
import defpackage.op70;
import defpackage.q8i0;
import defpackage.sd30;
import defpackage.tje;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/yandex/taxi/settings/profile/rating/PassengerRatingInfoDialog;", "Landroid/app/Dialog;", "Lnl90;", "Landroid/app/Activity;", "activity", "Lol90;", "presenter", "<init>", "(Landroid/app/Activity;Lol90;)V", "Lzy11;", "bindViewsInFields", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "rating", "updatePassengerRating", "(Ljava/lang/String;)V", "text", "updateDescriptionText", "ratingInfoUrl", "showRatingInfoButton", "hideRatingInfoButton", "onAttachedToWindow", "onDetachedFromWindow", "show", "Lol90;", "Lru/yandex/taxi/design/ButtonComponent;", "ratingInfoButton", "Lru/yandex/taxi/design/ButtonComponent;", "acceptButton", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PassengerRatingInfoDialog extends Dialog implements nl90 {
    public static final int $stable = 8;
    private ButtonComponent acceptButton;
    private final ol90 presenter;
    private ButtonComponent ratingInfoButton;

    public PassengerRatingInfoDialog(Activity activity, ol90 ol90Var) {
        super(activity);
        this.presenter = ol90Var;
    }

    private final void bindViewsInFields() {
        this.ratingInfoButton = (ButtonComponent) requireViewById(a9h0.rating_info_button);
        this.acceptButton = (ButtonComponent) requireViewById(a9h0.accept_button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(PassengerRatingInfoDialog passengerRatingInfoDialog) {
        ol90 ol90Var = passengerRatingInfoDialog.presenter;
        ddf0 ddf0Var = ol90Var.y;
        cdf0 a = ddf0Var.a();
        jj10 jj10Var = ddf0Var.d;
        String str = a.a;
        Boolean valueOf = Boolean.valueOf(a.b);
        Boolean valueOf2 = Boolean.valueOf(a.c);
        jj10Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("rating", str);
        hashMap.put("photo_flg", valueOf);
        jj10Var.a.a("Menu.Rating.DoneButtonTapped", hashMap, 1, g8e.v(hashMap, "user_name_flg", valueOf2));
        ((nl90) ol90Var.Dg()).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRatingInfoButton$lambda$0$0(PassengerRatingInfoDialog passengerRatingInfoDialog, String str) {
        ol90 ol90Var = passengerRatingInfoDialog.presenter;
        ddf0 ddf0Var = ol90Var.y;
        cdf0 a = ddf0Var.a();
        jj10 jj10Var = ddf0Var.d;
        String str2 = a.a;
        Boolean valueOf = Boolean.valueOf(a.b);
        Boolean valueOf2 = Boolean.valueOf(a.c);
        jj10Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("rating", str2);
        hashMap.put("photo_flg", valueOf);
        jj10Var.a.a("Menu.Rating.HowCalculateRatingTapped", hashMap, 1, g8e.v(hashMap, "user_name_flg", valueOf2));
        ((mg21) ol90Var.z).c(str);
    }

    @Override // defpackage.nl90
    public void hideRatingInfoButton() {
        ButtonComponent buttonComponent = this.ratingInfoButton;
        if (buttonComponent != null) {
            buttonComponent.setVisibility(8);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        String Y;
        super.onAttachedToWindow();
        ol90 ol90Var = this.presenter;
        ol90Var.Bg(this);
        ru.yandex.taxi.profile.a aVar = ol90Var.x;
        q8i0 q8i0Var = (q8i0) aVar.c.b();
        if (aVar.b()) {
            String l = ((cne0) aVar.a.b).l("user_first_name", null);
            if (l == null) {
                l = "";
            }
            q8i0Var.getClass();
            int L = evu0.L("%@", d6z.Y(q8i0Var, "rating_info_message"), 6);
            Y = L == -1 ? d6z.Y(q8i0Var, "rating_info_message") : evu0.U(L, L + 2, d6z.Y(q8i0Var, "rating_info_message"), l).toString();
        } else {
            Y = null;
        }
        String str = ((q8i0) aVar.c.b()).d;
        tje.N(ol90Var.Jg(), null, null, new PassengerRatingInfoPresenter$attachView$$inlined$safeCollectIn$1(new f(aVar.d), null, this), 3);
        updateDescriptionText(Y != null ? Y : "");
        if (str == null || evu0.J(str)) {
            ((nl90) ol90Var.Dg()).hideRatingInfoButton();
        } else {
            ((nl90) ol90Var.Dg()).showRatingInfoButton(str);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(klh0.passenger_rating_info_dialog);
        bindViewsInFields();
        ButtonComponent buttonComponent = this.acceptButton;
        if (buttonComponent != null) {
            buttonComponent.setDebounceClickListener(new op70(17, this));
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // defpackage.nl90
    public void showRatingInfoButton(String ratingInfoUrl) {
        ButtonComponent buttonComponent = this.ratingInfoButton;
        if (buttonComponent != null) {
            buttonComponent.setOnClickListener(new sd30(29, this, ratingInfoUrl));
            buttonComponent.setVisibility(0);
        }
    }

    @Override // defpackage.nl90
    public void updateDescriptionText(String text) {
        ((ListItemComponent) requireViewById(a9h0.rating_description_text)).setTitle(text);
    }

    @Override // defpackage.nl90
    public void updatePassengerRating(String rating) {
        ((ListTitleComponent) requireViewById(a9h0.rating_title_text)).setTitle(rating);
    }
}
