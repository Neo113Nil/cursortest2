package ru.yandex.taxi.summary.requirements.list.carousel.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bdc;
import defpackage.cdc;
import defpackage.cma1;
import defpackage.gdc;
import defpackage.gtq0;
import defpackage.hdc;
import defpackage.kdc;
import defpackage.lfh0;
import defpackage.mrg0;
import defpackage.mrh0;
import defpackage.ny61;
import defpackage.qa0;
import defpackage.qke;
import defpackage.s8o;
import defpackage.sw8;
import defpackage.tje;
import defpackage.w0d;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u000b2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/yandex/taxi/summary/requirements/list/carousel/view/CarouselButton;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "init", "()V", "color", "changeBackgroundColor", "(I)V", "invalidateComponent", "invalidateBackground", "invalidateIcon", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "text", "setText", "(Ljava/lang/String;)V", "Lkdc;", "", "animated", "setBackgroundColor", "(Lkdc;Z)V", "iconRes", "setIconRes", "(Ljava/lang/Integer;)V", "Lcdc;", "setIconTint", "(Lcdc;)V", "Lsw8;", "binding", "Lsw8;", "textColor", "Lkdc;", "disabledTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Ljava/lang/Integer;", "roundedCornersRadius", CA20Status.STATUS_USER_I, "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CarouselButton extends GoLinearLayout {
    public static final int $stable = 8;
    private kdc backgroundColor;
    private final sw8 binding;
    private final kdc disabledTextColor;
    private Integer iconRes;
    private final int roundedCornersRadius;
    private final kdc textColor;

    public CarouselButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(mrh0.carousel_button_view, this);
        int i3 = lfh0.icon;
        GoImageView goImageView = (GoImageView) cma1.O(i3, this);
        if (goImageView != null) {
            i3 = lfh0.text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
            if (robotoTextView != null) {
                this.binding = new sw8(this, goImageView, robotoTextView);
                this.textColor = new bdc(xng0.textMain);
                this.disabledTextColor = new bdc(xng0.textOnControlMinor);
                this.backgroundColor = new bdc(xng0.controlMain);
                this.roundedCornersRadius = tje.r(mrg0.button_component_small_rounded_corners_radius, getContext());
                init();
                invalidateComponent();
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeBackgroundColor(int color) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
    }

    private final void init() {
        int u = tje.u(8, getContext());
        setPadding(u, getPaddingTop(), u, getPaddingBottom());
        setGravity(17);
        setMinimumHeight(tje.r(mrg0.button_component_size_XS, getContext()));
    }

    private final void invalidateBackground() {
        if (isInEditMode()) {
            return;
        }
        w0d w0dVar = new w0d();
        w0dVar.h = this.roundedCornersRadius;
        w0dVar.a = s8o.m(this.backgroundColor, getContext());
        setBackground(w0dVar.a());
    }

    private final void invalidateComponent() {
        invalidateBackground();
        kdc kdcVar = this.textColor;
        this.binding.c.setTextColor(kdcVar instanceof hdc ? ((hdc) kdcVar).a : kdcVar instanceof gdc ? qke.m(((gdc) kdcVar).a, getContext()) : gtq0.f(s8o.m(kdcVar, getContext()), s8o.m(this.disabledTextColor, getContext())));
        invalidateIcon();
        RobotoTextView robotoTextView = this.binding.c;
        CharSequence text = robotoTextView.getText();
        robotoTextView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
    }

    private final void invalidateIcon() {
        Integer num = this.iconRes;
        sw8 sw8Var = this.binding;
        if (num == null) {
            sw8Var.b.setVisibility(8);
            return;
        }
        sw8Var.b.setVisibility(0);
        this.binding.b.setImageDrawable(tje.c0(num.intValue(), this.binding.b.getContext()));
    }

    public static /* synthetic */ void setBackgroundColor$default(CarouselButton carouselButton, kdc kdcVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        carouselButton.setBackgroundColor(kdcVar, z);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        invalidateComponent();
    }

    public final void setBackgroundColor(kdc color, boolean animated) {
        if (animated) {
            cma1.e(s8o.m(this.backgroundColor, getContext()), s8o.m(color, getContext()), 200L, 0L, new qa0(4, this), null);
            this.backgroundColor = color;
        } else {
            this.backgroundColor = color;
            invalidateBackground();
        }
    }

    public final void setIconRes(Integer iconRes) {
        this.iconRes = iconRes;
        invalidateIcon();
    }

    public final void setIconTint(cdc color) {
        this.binding.b.getDrawable().setTint(s8o.m(color, getContext()));
    }

    public final void setText(String text) {
        this.binding.c.setText(text);
        this.binding.c.setVisibility((text == null || text.length() == 0) ? 8 : 0);
    }

    public CarouselButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CarouselButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public CarouselButton(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ CarouselButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
