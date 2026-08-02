package ru.yandex.taxi.widget.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.dzg0;
import defpackage.e5b1;
import defpackage.kdc;
import defpackage.ndh0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.sph0;
import defpackage.vng;
import defpackage.xng0;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.CircleButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\r2\b\b\u0001\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\u001aJ\u0017\u0010&\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010'¢\u0006\u0004\b&\u0010(J\u0017\u0010*\u001a\u00020\r2\b\b\u0001\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u001aJ\u0017\u0010*\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b*\u0010-J\u0017\u0010.\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u0010-J\u0017\u00100\u001a\u00020\r2\b\b\u0001\u0010/\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\u001aJ\u0017\u00101\u001a\u00020\r2\b\b\u0001\u0010%\u001a\u00020\u0006¢\u0006\u0004\b1\u0010\u001aJ\u0015\u00100\u001a\u00020\r2\u0006\u0010%\u001a\u000202¢\u0006\u0004\b0\u00103J\u0015\u00106\u001a\u00020\r2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\b9\u0010\u001aJ\r\u0010:\u001a\u00020\r¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\r¢\u0006\u0004\b<\u0010;R\u001a\u0010>\u001a\u00020=8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/yandex/taxi/widget/buttons/IconCircleButton;", "Lru/yandex/taxi/design/CircleButtonComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/content/res/TypedArray;", "a", "Lzy11;", "applyAttributes", "(Landroid/content/res/TypedArray;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "getIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "getLayoutResource", "()I", "attributes", "resolveThemeAttrs", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "attrId", "setIconTintAttr", "(I)V", "", "applyThemeForChildrenByDefault", "()Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "enable", "setIconTintEnable", "(Z)V", "color", "setBackgroundColor", "Lkdc;", "(Lkdc;)V", "resId", "setIcon", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)V", "setIconBackground", "colorId", "setIconTint", "setIconTintColor", "", "(Ljava/lang/String;)V", "Landroid/widget/ImageView$ScaleType;", "centerCrop", "setIconScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "padding", "setIconPadding", "startTitleAnimation", "()V", "stopTitleAnimation", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "imageIcon", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "getImageIcon", "()Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "iconTintEnable", "Z", "iconBackground", "Lkdc;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class IconCircleButton extends CircleButtonComponent {
    private kdc iconBackground;
    private boolean iconTintEnable;
    private final CircleButtonImageView imageIcon;

    public IconCircleButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3 = ndh0.icon_circle_button_image;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.imageIcon = (CircleButtonImageView) ((View) rp31.d(this, i3));
        this.iconTintEnable = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, c4i0.CircleButtonComponent, i, 0);
            try {
                applyAttributes(obtainStyledAttributes);
                resolveThemeAttrs(attributeSet, obtainStyledAttributes);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private final void applyAttributes(TypedArray a) {
        int resourceId = a.getResourceId(c4i0.CircleButtonComponent_component_circle_image, 0);
        if (resourceId != 0) {
            this.imageIcon.setImageResource(resourceId);
        }
        this.iconTintEnable = a.getBoolean(c4i0.CircleButtonComponent_component_circle_image_tint_enable, true);
        if (a.hasValue(c4i0.CircleButtonComponent_component_circle_icon_padding)) {
            setIconPadding(a.getDimensionPixelSize(c4i0.CircleButtonComponent_component_circle_icon_padding, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$0(IconCircleButton iconCircleButton, Integer num) {
        iconCircleButton.setIconTintAttr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$1(IconCircleButton iconCircleButton, Integer num) {
        iconCircleButton.setIconTint(num.intValue());
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        Object tag = getTag(ndh0.circle_btn_icon);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setIconTintColor(qje.t(num.intValue(), getContext()));
        }
        kdc kdcVar = this.iconBackground;
        if (kdcVar != null) {
            setBackgroundColor(kdcVar);
        } else {
            this.imageIcon.setBackground(vng.t(dzg0.fab_component, getContext()));
        }
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final AppCompatImageView getIcon() {
        return this.imageIcon;
    }

    public final CircleButtonImageView getImageIcon() {
        return this.imageIcon;
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent
    public int getLayoutResource() {
        return sph0.button_circle_icon;
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent
    public void resolveThemeAttrs(AttributeSet attrs, TypedArray attributes) {
        super.resolveThemeAttrs(attrs, attributes);
        if (attrs == null) {
            setIconTintAttr(xng0.textMain);
            return;
        }
        if (this.iconTintEnable) {
            int i = c4i0.CircleButtonComponent_component_circle_image_tint;
            int i2 = xng0.textMain;
            final int i3 = 0;
            Consumer consumer = new Consumer(this) { // from class: k4v
                public final /* synthetic */ IconCircleButton b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i4 = i3;
                    IconCircleButton iconCircleButton = this.b;
                    Integer num = (Integer) obj;
                    switch (i4) {
                        case 0:
                            IconCircleButton.resolveThemeAttrs$lambda$0(iconCircleButton, num);
                            break;
                        default:
                            IconCircleButton.resolveThemeAttrs$lambda$1(iconCircleButton, num);
                            break;
                    }
                }
            };
            final int i4 = 1;
            qje.S(attrs, attributes, "component_circle_image_tint", i, i2, consumer, new Consumer(this) { // from class: k4v
                public final /* synthetic */ IconCircleButton b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i42 = i4;
                    IconCircleButton iconCircleButton = this.b;
                    Integer num = (Integer) obj;
                    switch (i42) {
                        case 0:
                            IconCircleButton.resolveThemeAttrs$lambda$0(iconCircleButton, num);
                            break;
                        default:
                            IconCircleButton.resolveThemeAttrs$lambda$1(iconCircleButton, num);
                            break;
                    }
                }
            });
        }
    }

    public final void setBackgroundColor(kdc color) {
        this.iconBackground = color;
        this.imageIcon.getBackground().setTintList(color != null ? ColorStateList.valueOf(s8o.m(color, getContext())) : null);
    }

    public final void setIcon(int resId) {
        this.imageIcon.setImageResource(resId);
    }

    public final void setIconBackground(Drawable drawable) {
        this.iconBackground = null;
        this.imageIcon.setBackgroundDrawable(drawable);
    }

    public final void setIconPadding(int padding) {
        this.imageIcon.setPadding(padding);
    }

    public final void setIconScaleType(ImageView.ScaleType centerCrop) {
        this.imageIcon.setScaleType(centerCrop);
    }

    public final void setIconTint(String color) {
        Integer S = q5z.S(color);
        if (S != null) {
            setIconTintColor(S.intValue());
        }
    }

    public final void setIconTintAttr(int attrId) {
        setTag(ndh0.circle_btn_icon, Integer.valueOf(attrId));
        setIconTintColor(qje.t(attrId, getContext()));
    }

    public final void setIconTintColor(int color) {
        if (this.iconTintEnable) {
            CircleButtonImageView circleButtonImageView = this.imageIcon;
            ColorStateList valueOf = ColorStateList.valueOf(color);
            if (circleButtonImageView == null) {
                return;
            }
            e5b1.c(circleButtonImageView, valueOf);
        }
    }

    public final void setIconTintEnable(boolean enable) {
        CircleButtonImageView circleButtonImageView;
        this.iconTintEnable = enable;
        if (enable || (circleButtonImageView = this.imageIcon) == null) {
            return;
        }
        e5b1.c(circleButtonImageView, null);
    }

    public final void startTitleAnimation() {
        getTitleView().startAnimation();
    }

    public final void stopTitleAnimation() {
        getTitleView().stopAnimation();
    }

    public final void setIcon(Drawable drawable) {
        this.imageIcon.setImageDrawable(drawable);
    }

    public final void setIconTint(int colorId) {
        setIconTintColor(getContext().getColor(colorId));
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        setBackgroundColor(new cdc(color));
    }

    public IconCircleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public IconCircleButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public IconCircleButton(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ IconCircleButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? xng0.circleButtonComponentStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
