package ru.yandex.taxi.order.view.walking_info;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a741;
import defpackage.agh0;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.f1h0;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.my6;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tje;
import defpackage.u601;
import defpackage.vng;
import defpackage.x641;
import defpackage.xng0;
import defpackage.zrh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/order/view/walking_info/WalkingInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "La741;", ClidProvider.STATE, "setState", "(La741;)V", "Lkotlin/Function0;", "onClick", "setOnCancelButtonClickListener", "(Lsls;)V", "Lx641;", "binding", "Lx641;", "padding", CA20Status.STATUS_USER_I, "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WalkingInfoView extends ConstraintLayout implements nwy0 {
    public static final int $stable = 8;
    private final x641 binding;
    private final int padding;

    public WalkingInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(zrh0.walking_info_block, this);
        int i2 = agh0.cancel_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, this);
        if (buttonComponent != null) {
            i2 = agh0.subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView != null) {
                i2 = agh0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView2 != null) {
                    this.binding = new x641(this, buttonComponent, robotoTextView, robotoTextView2);
                    int r = tje.r(mrg0.go_design_m_space, getContext());
                    this.padding = r;
                    robotoTextView2.setTextTypeface(3);
                    buttonComponent.setTextTypeface(3);
                    buttonComponent.setRippleColor(new bdc(xng0.controlPressed));
                    setPadding(r, r, r, r);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.d.setTextColorAttr(xng0.textMain);
        this.binding.c.setTextColorAttr(xng0.textMain);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void setOnCancelButtonClickListener(sls onClick) {
        this.binding.b.setDebounceClickListener(new u601(8, onClick));
    }

    public final void setState(a741 state) {
        setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        x641 x641Var = this.binding;
        x641Var.d.setText(state.a);
        x641Var.c.setText(state.b);
        my6 my6Var = state.c;
        ButtonComponent buttonComponent = this.binding.b;
        buttonComponent.setText(my6Var.a);
        kdc kdcVar = my6Var.c;
        int m = kdcVar != null ? s8o.m(kdcVar, buttonComponent.getContext()) : qje.t(xng0.controlMinor, buttonComponent.getContext());
        kdc kdcVar2 = my6Var.b;
        if (kdcVar2 == null) {
            kdcVar2 = new bdc(xng0.textOnControlMinor);
        }
        buttonComponent.setButtonTitleColor(kdcVar2);
        buttonComponent.setButtonBackground(m);
        Drawable drawable = state.e;
        if (drawable != null) {
            cvw.d0(this, drawable, Integer.valueOf(tje.u(8, getContext())), Integer.valueOf(tje.u(16, getContext())), Integer.valueOf(tje.u(8, getContext())));
        } else {
            setBackground(vng.t(f1h0.bg_walking_info, getContext()));
        }
    }

    public WalkingInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public WalkingInfoView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ WalkingInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
