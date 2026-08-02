package ru.yandex.taxi.widget.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.c4i0;
import defpackage.k4o;
import defpackage.lh;
import defpackage.lhc;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.sph0;
import defpackage.t37;
import defpackage.tje;
import defpackage.u37;
import defpackage.w0d;
import defpackage.w511;
import defpackage.xng0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b(\u0010 J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/yandex/taxi/widget/buttons/ButtonTrailView;", "Landroid/widget/LinearLayout;", "Llh;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateButtonStyle", "()V", "", "text", "", "contentDescription", "setButtonText", "(Ljava/lang/CharSequence;Ljava/lang/String;)V", "Lru/yandex/taxi/widget/buttons/ButtonTrailView$ButtonStyle;", "buttonStyle", "setButtonStyle", "(Lru/yandex/taxi/widget/buttons/ButtonTrailView$ButtonStyle;)V", "Ljava/lang/Runnable;", "onClickAction", "setButtonOnClickAction", "(Ljava/lang/Runnable;)V", "", "isVisible", "setCheckBoxVisible", "(Z)V", "setButtonVisibility", "selected", "Landroid/graphics/drawable/Drawable;", "drawable", "setCheckMark", "(ZLandroid/graphics/drawable/Drawable;)V", BackendConfig.Restrictions.ENABLED, "setEnabled", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lu37;", "externalAccessibilityDelegate", "Lu37;", "Lru/yandex/taxi/widget/buttons/ButtonTrailView$ButtonStyle;", "Landroid/widget/TextView;", "button", "Landroid/widget/TextView;", "Lru/yandex/taxi/design/CheckBoxComponent;", "checkBox", "Lru/yandex/taxi/design/CheckBoxComponent;", "ButtonStyle", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ButtonTrailView extends LinearLayout implements lh, nwy0 {
    private final TextView button;
    private ButtonStyle buttonStyle;
    private final CheckBoxComponent checkBox;
    private final u37 externalAccessibilityDelegate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/widget/buttons/ButtonTrailView$ButtonStyle;", "", "Companion", "ru/yandex/taxi/widget/buttons/a", "OUTLINE", "CONTROL", "CONTROL_SECONDARY", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ButtonStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final ButtonStyle CONTROL;
        public static final ButtonStyle CONTROL_SECONDARY;
        public static final a Companion;
        public static final ButtonStyle OUTLINE;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("OUTLINE", 0);
            OUTLINE = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("CONTROL", 1);
            CONTROL = buttonStyle2;
            ButtonStyle buttonStyle3 = new ButtonStyle("CONTROL_SECONDARY", 2);
            CONTROL_SECONDARY = buttonStyle3;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3};
            $VALUES = buttonStyleArr;
            $ENTRIES = kotlin.enums.a.a(buttonStyleArr);
            Companion = new a();
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    public ButtonTrailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.externalAccessibilityDelegate = new u37();
        ButtonStyle buttonStyle = ButtonStyle.OUTLINE;
        this.buttonStyle = buttonStyle;
        View.inflate(context, sph0.button_trail_view, this);
        int i2 = ndh0.button_trail_button_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.button = (TextView) ((View) rp31.d(this, i2));
        this.checkBox = (CheckBoxComponent) ((View) rp31.d(this, ndh0.button_trail_check_box));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.ButtonTrailView, i, 0);
        try {
            ButtonStyle.Companion.getClass();
            int i3 = obtainStyledAttributes.getInt(c4i0.ButtonTrailView_button_style, 0);
            if (i3 != 0) {
                if (i3 == 1) {
                    buttonStyle = ButtonStyle.CONTROL;
                } else if (i3 == 2) {
                    buttonStyle = ButtonStyle.CONTROL_SECONDARY;
                }
            }
            this.buttonStyle = buttonStyle;
            obtainStyledAttributes.recycle();
            updateButtonStyle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static /* synthetic */ void setButtonText$default(ButtonTrailView buttonTrailView, CharSequence charSequence, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        buttonTrailView.setButtonText(charSequence, str);
    }

    private final void updateButtonStyle() {
        int t;
        int t2;
        int u;
        Integer valueOf;
        ButtonStyle buttonStyle = this.buttonStyle;
        int[] iArr = b.a;
        int i = iArr[buttonStyle.ordinal()];
        if (i == 1) {
            t = qje.t(xng0.textMain, getContext());
        } else if (i == 2) {
            t = qje.t(xng0.textOnControl, getContext());
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            t = qje.t(xng0.textOnControl, getContext());
        }
        this.button.setTextColor(t);
        int i2 = iArr[this.buttonStyle.ordinal()];
        if (i2 == 1) {
            t2 = qje.t(xng0.bgMain, getContext());
        } else if (i2 == 2) {
            t2 = qje.t(xng0.controlMain, getContext());
        } else if (i2 != 3) {
            w511.b();
            return;
        } else {
            t2 = getContext().getColor(mqg0.white);
        }
        int i3 = iArr[this.buttonStyle.ordinal()];
        if (i3 != 1) {
            u = 0;
            if (i3 != 2 && i3 != 3) {
                w511.b();
                return;
            }
        } else {
            u = tje.u(1, getContext());
        }
        int i4 = iArr[this.buttonStyle.ordinal()];
        if (i4 != 1) {
            valueOf = null;
            if (i4 != 2 && i4 != 3) {
                w511.b();
                return;
            }
        } else {
            valueOf = Integer.valueOf(lhc.f(~t2, 26));
        }
        TextView textView = this.button;
        w0d w0dVar = new w0d();
        w0dVar.g = true;
        w0dVar.a = t2;
        w0dVar.h = tje.x(getContext(), tje.r(mrg0.button_component_default_rounded_corners_radius, getContext()));
        w0dVar.b = qje.t(xng0.line, getContext());
        w0dVar.e = valueOf;
        w0dVar.i = u;
        textView.setBackground(w0dVar.a());
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateButtonStyle();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        return this.externalAccessibilityDelegate;
    }

    public final void setButtonOnClickAction(Runnable onClickAction) {
        this.button.setOnClickListener(new t37(0, onClickAction));
    }

    public final void setButtonStyle(ButtonStyle buttonStyle) {
        if (this.buttonStyle == buttonStyle) {
            return;
        }
        this.buttonStyle = buttonStyle;
        updateButtonStyle();
    }

    public final void setButtonText(CharSequence text, String contentDescription) {
        this.button.setText(text);
        TextView textView = this.button;
        if (contentDescription != null) {
            text = contentDescription;
        }
        textView.setContentDescription(text);
    }

    public final void setButtonVisibility(boolean isVisible) {
        this.button.setVisibility(isVisible ? 0 : 8);
    }

    public final void setCheckBoxVisible(boolean isVisible) {
        this.checkBox.setVisibility(isVisible ? 0 : 8);
        this.externalAccessibilityDelegate.b = isVisible;
        ViewGroup.LayoutParams layoutParams = this.button.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(isVisible ? 0 : tje.u(12, getContext()));
        }
    }

    public final void setCheckMark(boolean selected, Drawable drawable) {
        this.checkBox.setImageDrawable(drawable);
        this.externalAccessibilityDelegate.a = selected;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.externalAccessibilityDelegate.c = enabled;
    }

    public ButtonTrailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ButtonTrailView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ButtonTrailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
