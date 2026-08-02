package ru.yandex.taxi.order;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewStub;
import defpackage.f1h0;
import defpackage.gtq0;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.p8h0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.wl70;
import defpackage.xb6;
import defpackage.xng0;
import defpackage.yb6;
import java.util.WeakHashMap;
import ru.yandex.taxi.widget.buttons.IconCircleButton;
import ru.yandex.taxi.widget.buttons.LoadingIconCircleButton;

/* loaded from: classes6.dex */
public final class a implements xb6 {
    public final /* synthetic */ BottomCircleButtonsView a;

    public a(BottomCircleButtonsView bottomCircleButtonsView) {
        this.a = bottomCircleButtonsView;
    }

    @Override // defpackage.xb6
    public final void Ec(wl70 wl70Var) {
        LoadingIconCircleButton orCreateCandidate;
        orCreateCandidate = this.a.getOrCreateCandidate();
        h(orCreateCandidate, wl70Var);
    }

    @Override // defpackage.xb6
    public final void Ne() {
        LoadingIconCircleButton loadingIconCircleButton;
        loadingIconCircleButton = this.a.driver;
        loadingIconCircleButton.setVisibility(8);
    }

    @Override // defpackage.xb6
    public final void Sc(boolean z) {
        IconCircleButton iconCircleButton;
        iconCircleButton = this.a.share;
        iconCircleButton.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.xb6
    public final void W3() {
        LoadingIconCircleButton loadingIconCircleButton;
        BottomCircleButtonsView bottomCircleButtonsView = this.a;
        loadingIconCircleButton = bottomCircleButtonsView.candidate;
        if (loadingIconCircleButton != null) {
            bottomCircleButtonsView.removeView(loadingIconCircleButton);
        }
        bottomCircleButtonsView.candidate = null;
    }

    @Override // defpackage.xb6
    public final void fa(wl70 wl70Var) {
        LoadingIconCircleButton loadingIconCircleButton;
        LoadingIconCircleButton loadingIconCircleButton2;
        BottomCircleButtonsView bottomCircleButtonsView = this.a;
        loadingIconCircleButton = bottomCircleButtonsView.driver;
        loadingIconCircleButton.setVisibility(0);
        loadingIconCircleButton2 = bottomCircleButtonsView.driver;
        h(loadingIconCircleButton2, wl70Var);
    }

    public final void h(LoadingIconCircleButton loadingIconCircleButton, wl70 wl70Var) {
        kdc kdcVar;
        int i;
        loadingIconCircleButton.setTitle(wl70Var.a);
        String str = wl70Var.b;
        loadingIconCircleButton.setBadgeText(str);
        loadingIconCircleButton.setTitleAutofitEnabled(false);
        int i2 = xng0.bgMain;
        BottomCircleButtonsView bottomCircleButtonsView = this.a;
        loadingIconCircleButton.setBadgeBackgroundColor(qje.t(i2, bottomCircleButtonsView.getContext()));
        loadingIconCircleButton.setBadgeTextColor(qje.t(xng0.textMain, bottomCircleButtonsView.getContext()));
        loadingIconCircleButton.setBadgeContentDescription(str + " " + bottomCircleButtonsView.getContext().getString(kyh0.driver_rating));
        Bitmap bitmap = wl70Var.d;
        if (bitmap != null) {
            RippleDrawable rippleDrawable = new RippleDrawable(gtq0.e(qje.t(xng0.controlMinor, bottomCircleButtonsView.getContext())), new BitmapDrawable(bottomCircleButtonsView.getResources(), bitmap), null);
            loadingIconCircleButton.setIconTintEnable(false);
            loadingIconCircleButton.disableImageLoading();
            loadingIconCircleButton.setIconPadding(0);
            loadingIconCircleButton.setIcon(rippleDrawable);
            return;
        }
        if (wl70Var.c) {
            loadingIconCircleButton.enableImageLoading();
            return;
        }
        loadingIconCircleButton.setIconTintEnable(true);
        kdcVar = bottomCircleButtonsView.iconColor;
        loadingIconCircleButton.setIconTintColor(s8o.m(kdcVar, bottomCircleButtonsView.getContext()));
        i = bottomCircleButtonsView.circleBtnIconPadding;
        loadingIconCircleButton.setIconPadding(i);
        loadingIconCircleButton.setIcon(f1h0.ic_person);
    }

    @Override // defpackage.xb6
    public final void m6(boolean z) {
        IconCircleButton iconCircleButton;
        IconCircleButton iconCircleButton2;
        ViewStub viewStub;
        kdc kdcVar;
        BottomCircleButtonsView bottomCircleButtonsView = this.a;
        if (!z) {
            iconCircleButton = bottomCircleButtonsView.transportInfoButton;
            if (iconCircleButton != null) {
                iconCircleButton.setVisibility(8);
                return;
            }
            return;
        }
        iconCircleButton2 = bottomCircleButtonsView.transportInfoButton;
        if (iconCircleButton2 == null) {
            viewStub = bottomCircleButtonsView.transportInfoButtonStub;
            viewStub.inflate();
            int i = p8h0.transport_info_button;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            iconCircleButton2 = (IconCircleButton) ((View) rp31.d(bottomCircleButtonsView, i));
            kdcVar = bottomCircleButtonsView.iconBackgroundColor;
            iconCircleButton2.setBackgroundColor(kdcVar);
            iconCircleButton2.setDebounceClickListener(new yb6(bottomCircleButtonsView, 6));
            bottomCircleButtonsView.transportInfoButton = iconCircleButton2;
        }
        iconCircleButton2.setVisibility(0);
    }

    @Override // defpackage.xb6
    public final void q7(String str) {
        LoadingIconCircleButton loadingIconCircleButton;
        BottomCircleButtonsView bottomCircleButtonsView = this.a;
        bottomCircleButtonsView.candidateDescription = str;
        loadingIconCircleButton = bottomCircleButtonsView.candidate;
        if (loadingIconCircleButton != null) {
            loadingIconCircleButton.setContentDescription(str);
        }
    }
}
