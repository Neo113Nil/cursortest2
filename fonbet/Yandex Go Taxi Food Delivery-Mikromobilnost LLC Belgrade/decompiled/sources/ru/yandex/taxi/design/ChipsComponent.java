package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.a2i0;
import defpackage.agh0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.g18;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.n5;
import defpackage.nac;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pav;
import defpackage.qje;
import defpackage.qke;
import defpackage.qlb;
import defpackage.qqb;
import defpackage.rqb;
import defpackage.sls;
import defpackage.sqb;
import defpackage.tje;
import defpackage.tqb;
import defpackage.uqb;
import defpackage.vng;
import defpackage.vqb;
import defpackage.w511;
import defpackage.wqb;
import defpackage.xng0;
import defpackage.xqb;
import defpackage.xqg0;
import defpackage.xw31;
import defpackage.y0d;
import defpackage.yqb;
import defpackage.zqb;
import defpackage.zrh0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0007*\u0001T\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\f\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\rJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010\rJ\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\rJ\u000f\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010\u000fJ\u000f\u0010(\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010\u000fJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\rJ\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010\rJ\u000f\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u0010\u000fJ\u0011\u00100\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010<\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR(\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010X¨\u0006Z"}, d2 = {"Lru/yandex/taxi/design/ChipsComponent;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "Lzqb;", "info", "Lzy11;", "render", "(Lzqb;)V", "recycle", "()V", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "force", "(Lzqb;Z)V", "setAccessibilityDelegate", "", "actionContentDescription", "Landroidx/core/view/AccessibilityDelegateCompat;", "createActionAccessibilityDelegate", "(Ljava/lang/String;)Landroidx/core/view/AccessibilityDelegateCompat;", "setupActionButtonsAppearance", "setupListener", "setupActionViewForCloseAction", "setupActionViewForChevronAction", "Lsqb;", "action", "setupActionViewForPlusMinusAction", "(Lsqb;)V", "applyTextColor", "loadIcon", "hideIcon", "getActionDescription", "()Ljava/lang/String;", "applyItemStyle", "Lpav;", "Ly0d;", "binding", "Ly0d;", "Landroid/graphics/drawable/Drawable;", "warningDrawable$delegate", "Li3y;", "getWarningDrawable", "()Landroid/graphics/drawable/Drawable;", "warningDrawable", "", "defaultTextColor", CA20Status.STATUS_USER_I, "warningTextColor", "currentState", "Lzqb;", "Lg18;", "iconLoadCancelable", "Lg18;", "Landroid/content/res/ColorStateList;", "defaultActionButtonColor", "Landroid/content/res/ColorStateList;", "changeCountActionButtonColor", "Lkotlin/Function0;", "mainClickListener", "Lsls;", "getMainClickListener", "()Lsls;", "setMainClickListener", "(Lsls;)V", "secondaryClickListener", "getSecondaryClickListener", "setSecondaryClickListener", "xqb", "accessibilityDelegate", "Lxqb;", "plusAccessibilityDelegate", "Landroidx/core/view/AccessibilityDelegateCompat;", "minusAccessibilityDelegate", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChipsComponent extends FrameLayout implements nwy0 {
    public static final int $stable = 8;
    private final xqb accessibilityDelegate;
    private final y0d binding;
    private ColorStateList changeCountActionButtonColor;
    private zqb currentState;
    private ColorStateList defaultActionButtonColor;
    private int defaultTextColor;
    private g18 iconLoadCancelable;
    private final pav imageLoader;
    private sls mainClickListener;
    private final AccessibilityDelegateCompat minusAccessibilityDelegate;
    private final AccessibilityDelegateCompat plusAccessibilityDelegate;
    private sls secondaryClickListener;

    /* renamed from: warningDrawable$delegate, reason: from kotlin metadata */
    private final i3y warningDrawable;
    private final int warningTextColor;

    public ChipsComponent(Context context, pav pavVar) {
        super(context);
        this.imageLoader = pavVar;
        LayoutInflater.from(context).inflate(zrh0.component_chips, this);
        int i = agh0.chips_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, this);
        if (constraintLayout != null) {
            i = agh0.chips_end_action;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, this);
            if (appCompatImageView != null) {
                i = agh0.chips_icon;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, this);
                if (appCompatImageView2 != null) {
                    i = agh0.chips_icon_loading;
                    PlaceholderView placeholderView = (PlaceholderView) cma1.O(i, this);
                    if (placeholderView != null) {
                        i = agh0.chips_price;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                        if (robotoTextView != null) {
                            i = agh0.chips_start_action;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i, this);
                            if (appCompatImageView3 != null) {
                                i = agh0.chips_start_barrier;
                                if (((Barrier) cma1.O(i, this)) != null) {
                                    i = agh0.chips_text;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                                    if (robotoTextView2 != null) {
                                        this.binding = new y0d(this, constraintLayout, appCompatImageView, appCompatImageView2, placeholderView, robotoTextView, appCompatImageView3, robotoTextView2);
                                        this.warningDrawable = kotlin.a.b(LazyThreadSafetyMode.NONE, new n5(context, 10));
                                        this.defaultTextColor = qje.t(xng0.textMain, getContext());
                                        this.warningTextColor = getContext().getColor(mqg0.component_red_toxic);
                                        this.currentState = new zqb((ChipsState) null, (String) null, (String) null, (tqb) null, 63);
                                        this.iconLoadCancelable = g18.u1;
                                        this.defaultActionButtonColor = ColorStateList.valueOf(qje.t(xng0.iconMinor, getContext()));
                                        this.changeCountActionButtonColor = context.getColorStateList(xqg0.button_text_color);
                                        this.mainClickListener = new qlb(18);
                                        this.accessibilityDelegate = new xqb(this);
                                        this.plusAccessibilityDelegate = createActionAccessibilityDelegate(context.getString(kyh0.counter_component_plus_content_description));
                                        this.minusAccessibilityDelegate = createActionAccessibilityDelegate(context.getString(kyh0.counter_component_minus_content_description));
                                        applyItemStyle();
                                        setClickable(true);
                                        return;
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

    private final void applyItemStyle() {
        this.defaultTextColor = qje.t(xng0.textMain, getContext());
        this.binding.b.setBackgroundResource(f1h0.bg_chips_background);
        this.defaultActionButtonColor = ColorStateList.valueOf(qje.t(xng0.iconMinor, getContext()));
    }

    private final void applyTextColor(zqb info) {
        int i = wqb.a[info.a.ordinal()];
        if (i == 1) {
            this.binding.h.setTextColor(this.defaultTextColor);
            this.binding.f.setTextColor(this.defaultTextColor);
        } else if (i == 2) {
            this.binding.h.setTextColor(this.warningTextColor);
        } else {
            w511.b();
        }
    }

    private final AccessibilityDelegateCompat createActionAccessibilityDelegate(String actionContentDescription) {
        return new yqb(this, actionContentDescription, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getActionDescription() {
        tqb tqbVar = this.currentState.e;
        if (jl40.l(tqbVar, rqb.a)) {
            return getContext().getString(kyh0.common_remove);
        }
        if (jl40.l(tqbVar, qqb.a) || (tqbVar instanceof sqb)) {
            return null;
        }
        w511.b();
        return null;
    }

    private final Drawable getWarningDrawable() {
        return (Drawable) this.warningDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideIcon() {
        this.binding.d.setVisibility(8);
        this.binding.e.setVisibility(8);
    }

    private final void loadIcon(zqb info) {
        this.iconLoadCancelable.cancel();
        if (isAttachedToWindow()) {
            ChipsState chipsState = info.a;
            String str = info.c;
            int i = wqb.a[chipsState.ordinal()];
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    w511.b();
                    return;
                }
                this.binding.e.setVisibility(8);
                this.binding.d.setVisibility(0);
                this.binding.d.setImageDrawable(getWarningDrawable());
                return;
            }
            if (str == null || evu0.J(str)) {
                hideIcon();
                return;
            }
            this.binding.d.setVisibility(0);
            this.binding.e.setVisibility(0);
            this.binding.d.setImageDrawable(null);
            nac nacVar = (nac) this.imageLoader.a(this.binding.d);
            nacVar.i = new ChipsComponent$loadIcon$1(0, this, ChipsComponent.class, "hideIcon", "hideIcon()V", 0);
            nacVar.h = new vqb(i2, this);
            this.iconLoadCancelable = nacVar.c(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 loadIcon$lambda$0(ChipsComponent chipsComponent, Drawable drawable) {
        chipsComponent.binding.e.setVisibility(8);
        return zy11.a;
    }

    private final void render(zqb info, boolean force) {
        if (!jl40.l(this.currentState, info) || force) {
            this.currentState = info;
            loadIcon(info);
            applyTextColor(info);
            RobotoTextView robotoTextView = this.binding.f;
            info.getClass();
            robotoTextView.setText((CharSequence) null);
            this.binding.f.setVisibility(8);
            this.binding.h.setText(info.b);
            setupActionButtonsAppearance(info);
            setupListener(info);
            setAccessibilityDelegate(info);
        }
    }

    private final void setAccessibilityDelegate(zqb info) {
        boolean z = info.e instanceof sqb;
        y0d y0dVar = this.binding;
        if (!z) {
            androidx.core.view.b.p(y0dVar.a, this.accessibilityDelegate);
            this.binding.b.setImportantForAccessibility(4);
            this.binding.a.setImportantForAccessibility(1);
            return;
        }
        androidx.core.view.b.p(y0dVar.a, null);
        this.binding.c.setImportantForAccessibility(1);
        this.binding.g.setImportantForAccessibility(1);
        androidx.core.view.b.p(this.binding.g, this.minusAccessibilityDelegate);
        androidx.core.view.b.p(this.binding.c, this.plusAccessibilityDelegate);
        this.binding.b.setImportantForAccessibility(2);
        this.binding.a.setImportantForAccessibility(2);
    }

    private final void setupActionButtonsAppearance(zqb info) {
        tqb tqbVar = info.e;
        boolean z = tqbVar instanceof sqb;
        this.binding.g.setVisibility(z ? 0 : 8);
        this.binding.d.setVisibility(!z ? 0 : 8);
        this.binding.e.setVisibility(z ? 8 : 0);
        if (jl40.l(tqbVar, rqb.a)) {
            boolean L = tje.L(getContext());
            y0d y0dVar = this.binding;
            if (L) {
                y0dVar.c.setBackgroundResource(f1h0.bg_chips_action_background_shape);
            } else {
                y0dVar.c.setBackgroundResource(f1h0.bg_chips_action_background);
            }
            AppCompatImageView appCompatImageView = this.binding.c;
            int i = dzg0.ic_close;
            Drawable t = vng.t(i, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
            if (t == null) {
                w511.f(oyr.j(i, "Drawable resource ", " not found"));
                return;
            } else {
                appCompatImageView.setImageDrawable(t);
                this.binding.c.setImageTintList(this.defaultActionButtonColor);
                return;
            }
        }
        if (jl40.l(tqbVar, qqb.a)) {
            this.binding.c.setBackgroundResource(f1h0.bg_chips_action_background_shape);
            AppCompatImageView appCompatImageView2 = this.binding.c;
            int i2 = dzg0.chevron_next;
            Drawable t2 = vng.t(i2, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
            if (t2 == null) {
                w511.f(oyr.j(i2, "Drawable resource ", " not found"));
                return;
            } else {
                appCompatImageView2.setImageDrawable(t2);
                this.binding.c.setImageTintList(this.defaultActionButtonColor);
                return;
            }
        }
        if (!z) {
            w511.b();
            return;
        }
        AppCompatImageView appCompatImageView3 = this.binding.g;
        int i3 = f1h0.ic_chips_minus;
        Drawable t3 = vng.t(i3, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t3 == null) {
            w511.f(oyr.j(i3, "Drawable resource ", " not found"));
            return;
        }
        appCompatImageView3.setImageDrawable(t3);
        AppCompatImageView appCompatImageView4 = this.binding.c;
        int i4 = f1h0.ic_chips_plus;
        Drawable t4 = vng.t(i4, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t4 == null) {
            w511.f(oyr.j(i4, "Drawable resource ", " not found"));
            return;
        }
        appCompatImageView4.setImageDrawable(t4);
        this.binding.g.setImageTintList(this.changeCountActionButtonColor);
        this.binding.c.setImageTintList(this.changeCountActionButtonColor);
    }

    private final void setupActionViewForChevronAction() {
        this.binding.c.setEnabled(true);
        ru.yandex.taxi.design.utils.c.z(new uqb(this, 0), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupActionViewForChevronAction$lambda$0(ChipsComponent chipsComponent) {
        qke.E(chipsComponent.getContext(), HapticController$Effect.CLICK_LIGHT, false, 12);
        chipsComponent.mainClickListener.invoke();
        return zy11.a;
    }

    private final void setupActionViewForCloseAction() {
        this.binding.c.setEnabled(true);
        if (tje.L(getContext())) {
            ru.yandex.taxi.design.utils.c.z(new uqb(this, 3), this);
            return;
        }
        ru.yandex.taxi.design.utils.c.z(new uqb(this, 4), this.binding.c);
        ru.yandex.taxi.design.utils.c.z(new uqb(this, 5), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupActionViewForCloseAction$lambda$0(ChipsComponent chipsComponent) {
        qke.E(chipsComponent.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 12);
        chipsComponent.mainClickListener.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupActionViewForCloseAction$lambda$1(ChipsComponent chipsComponent) {
        qke.E(chipsComponent.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 12);
        chipsComponent.mainClickListener.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupActionViewForCloseAction$lambda$2(ChipsComponent chipsComponent) {
        qke.E(chipsComponent.getContext(), HapticController$Effect.CLICK_LIGHT, false, 12);
        return zy11.a;
    }

    private final void setupActionViewForPlusMinusAction(sqb action) {
        this.binding.g.setEnabled(action.b);
        this.binding.c.setEnabled(action.a);
        ru.yandex.taxi.design.utils.c.z(new qlb(19), this);
        ru.yandex.taxi.design.utils.c.z(new uqb(this, 1), this.binding.c);
        ru.yandex.taxi.design.utils.c.z(new uqb(this, 2), this.binding.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupActionViewForPlusMinusAction$lambda$1(ChipsComponent chipsComponent) {
        qke.E(chipsComponent.getContext(), HapticController$Effect.CLICK_LIGHT, false, 12);
        chipsComponent.mainClickListener.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupActionViewForPlusMinusAction$lambda$2(ChipsComponent chipsComponent) {
        qke.E(chipsComponent.getContext(), HapticController$Effect.CLICK_LIGHT, false, 12);
        sls slsVar = chipsComponent.secondaryClickListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    private final void setupListener(zqb info) {
        tqb tqbVar = info.e;
        if (jl40.l(tqbVar, rqb.a)) {
            setupActionViewForCloseAction();
            return;
        }
        if (jl40.l(tqbVar, qqb.a)) {
            setupActionViewForChevronAction();
        } else if (tqbVar instanceof sqb) {
            setupActionViewForPlusMinusAction((sqb) info.e);
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable warningDrawable_delegate$lambda$0(Context context) {
        return vng.t(f1h0.ic_chips_warning_24, context);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyItemStyle();
        render(this.currentState, true);
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final sls getMainClickListener() {
        return this.mainClickListener;
    }

    public final sls getSecondaryClickListener() {
        return this.secondaryClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        loadIcon(this.currentState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.iconLoadCancelable.cancel();
    }

    public final void recycle() {
        this.currentState = new zqb((ChipsState) null, (String) null, (String) null, (tqb) null, 63);
        this.iconLoadCancelable.cancel();
        this.mainClickListener = new qlb(16);
        this.secondaryClickListener = new qlb(17);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        super.setLayoutParams(params);
        if (params != null) {
            int i = params.width;
            if (i == 0) {
                i = -2;
            }
            ConstraintLayout constraintLayout = this.binding.b;
            Rect rect = xw31.a;
            ru.yandex.taxi.design.utils.c.D(i, constraintLayout.getLayoutParams().height, constraintLayout);
        }
    }

    public final void setMainClickListener(sls slsVar) {
        this.mainClickListener = slsVar;
    }

    public final void setSecondaryClickListener(sls slsVar) {
        this.secondaryClickListener = slsVar;
    }

    public final void render(zqb info) {
        render(info, false);
    }
}
