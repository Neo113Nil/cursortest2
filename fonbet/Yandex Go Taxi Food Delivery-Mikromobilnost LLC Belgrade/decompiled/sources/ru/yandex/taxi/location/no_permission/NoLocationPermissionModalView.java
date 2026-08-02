package ru.yandex.taxi.location.no_permission;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.b;
import defpackage.a60;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.ej1;
import defpackage.f1h0;
import defpackage.fl10;
import defpackage.ic60;
import defpackage.k0b0;
import defpackage.kc60;
import defpackage.mc60;
import defpackage.n230;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.qth0;
import defpackage.tih0;
import defpackage.vng;
import defpackage.x4e;
import defpackage.y50;
import defpackage.zz2;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\rJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/taxi/location/no_permission/NoLocationPermissionModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ln230;", "Landroid/content/Context;", "context", "Lmc60;", "navigator", "Lic60;", "noLocationPermissionModalAnalytics", "<init>", "(Landroid/content/Context;Lmc60;Lic60;)V", "Lzy11;", "onAppearAnimationComplete", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ln230;", "onAttachedToWindow", "onDetachedFromWindow", "", "text", "setDescriptionText", "(Ljava/lang/String;)V", "Lmc60;", "Lic60;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NoLocationPermissionModalView extends SlideableBindingModalView<n230> {
    private final mc60 navigator;
    private final ic60 noLocationPermissionModalAnalytics;

    public NoLocationPermissionModalView(Context context, mc60 mc60Var, ic60 ic60Var) {
        super(context, 3);
        this.navigator = mc60Var;
        this.noLocationPermissionModalAnalytics = ic60Var;
        qdb1.c(this, new kc60(this, 1));
        b.q(getBinding().c, true);
        getBinding().b.setTextTypeface(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(NoLocationPermissionModalView noLocationPermissionModalView) {
        ic60 ic60Var = noLocationPermissionModalView.noLocationPermissionModalAnalytics;
        zz2 zz2Var = ic60Var.c;
        k0b0 k0b0Var = ic60Var.a;
        boolean z = k0b0Var.g() || k0b0Var.a();
        boolean z2 = !ic60Var.b.c();
        boolean g = k0b0Var.g();
        Boolean valueOf = Boolean.valueOf(z2);
        zz2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("app_geo_permission", Boolean.valueOf(z));
        hashMap.put("system_geo_permission", valueOf);
        zz2Var.a.a("Application.AllowGeoPermissionModalCard.Tapped", hashMap, 1, x4e.r(g, hashMap, "precise_location"));
        ej1 ej1Var = (ej1) ((fl10) noLocationPermissionModalView.navigator).a;
        ((a60) ((y50) ej1Var.H)).d();
        ej1Var.i();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        n230 binding = getBinding();
        binding.e.setBackground(vng.t(f1h0.bg_bottom_notification, getContext()));
        ImageView imageView = binding.d;
        imageView.setBackground(vng.t(dzg0.oval_shape, getContext()));
        imageView.setImageDrawable(vng.t(f1h0.ic_location_fill_24, getContext()));
        binding.c.applyTheme(themeType);
        binding.f.applyTheme(themeType);
        binding.b.applyTheme(themeType);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public n230 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qth0.modal_view_no_location_permission, parent, false);
        int i = tih0.button_settings;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = tih0.geo_heading;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = tih0.icon;
                ImageView imageView = (ImageView) cma1.O(i, inflate);
                if (imageView != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    i = tih0.text;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new n230(linearLayout, buttonComponent, robotoTextView, imageView, linearLayout, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        post(new ce0(this, 15));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().b.setDebounceClickListener(new kc60(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zz2 zz2Var = this.noLocationPermissionModalAnalytics.c;
        zz2Var.getClass();
        zz2Var.a.a("Application.AllowGeoPermissionModalCard.Closed", new HashMap(), 1, new HashMap());
        getBinding().b.setDebounceClickListener(null);
    }

    public final void setDescriptionText(String text) {
        getBinding().f.setText(text);
    }
}
