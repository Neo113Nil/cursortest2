package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a2i0;
import defpackage.agh0;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.k4o;
import defpackage.ma50;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.vng;
import defpackage.w511;
import defpackage.zrh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.plus.design.view.GradientGlyphValueView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\"#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/yandex/taxi/design/NavigationWithTextTrailView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/design/NavigationWithTextTrailView$NavigationType;", "type", "Lzy11;", "setNavigationType", "(Lru/yandex/taxi/design/NavigationWithTextTrailView$NavigationType;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "Lru/yandex/taxi/design/NavigationWithTextTrailView$TextType;", "setTextType", "(Lru/yandex/taxi/design/NavigationWithTextTrailView$TextType;)V", "Lma50;", "binding", "Lma50;", "Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/yandex/taxi/widget/RobotoTextView;", "normalText", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/plus/design/view/GradientGlyphValueView;", "cashBackText", "Lru/yandex/taxi/plus/design/view/GradientGlyphValueView;", "NavigationType", "TextType", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NavigationWithTextTrailView extends ConstraintLayout {
    public static final int $stable = 8;
    private final ma50 binding;
    private final GradientGlyphValueView cashBackText;
    private final AppCompatImageView icon;
    private final RobotoTextView normalText;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/design/NavigationWithTextTrailView$NavigationType;", "", JCP.RAW_PREFIX, "INVISIBLE", "USUAL", "ROUND", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class NavigationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ NavigationType[] $VALUES;
        public static final NavigationType INVISIBLE;
        public static final NavigationType NONE;
        public static final NavigationType ROUND;
        public static final NavigationType USUAL;

        static {
            NavigationType navigationType = new NavigationType(JCP.RAW_PREFIX, 0);
            NONE = navigationType;
            NavigationType navigationType2 = new NavigationType("INVISIBLE", 1);
            INVISIBLE = navigationType2;
            NavigationType navigationType3 = new NavigationType("USUAL", 2);
            USUAL = navigationType3;
            NavigationType navigationType4 = new NavigationType("ROUND", 3);
            ROUND = navigationType4;
            NavigationType[] navigationTypeArr = {navigationType, navigationType2, navigationType3, navigationType4};
            $VALUES = navigationTypeArr;
            $ENTRIES = kotlin.enums.a.a(navigationTypeArr);
        }

        public static NavigationType valueOf(String str) {
            return (NavigationType) Enum.valueOf(NavigationType.class, str);
        }

        public static NavigationType[] values() {
            return (NavigationType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/design/NavigationWithTextTrailView$TextType;", "", "NORMAL", "CASHBACK_AMOUNT", "NORMAL_END", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class TextType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextType[] $VALUES;
        public static final TextType CASHBACK_AMOUNT;
        public static final TextType NORMAL;
        public static final TextType NORMAL_END;

        static {
            TextType textType = new TextType("NORMAL", 0);
            NORMAL = textType;
            TextType textType2 = new TextType("CASHBACK_AMOUNT", 1);
            CASHBACK_AMOUNT = textType2;
            TextType textType3 = new TextType("NORMAL_END", 2);
            NORMAL_END = textType3;
            TextType[] textTypeArr = {textType, textType2, textType3};
            $VALUES = textTypeArr;
            $ENTRIES = kotlin.enums.a.a(textTypeArr);
        }

        public static TextType valueOf(String str) {
            return (TextType) Enum.valueOf(TextType.class, str);
        }

        public static TextType[] values() {
            return (TextType[]) $VALUES.clone();
        }
    }

    public NavigationWithTextTrailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(zrh0.navigation_with_text_trail_content, this);
        int i2 = agh0.navigation_trail_cashback_amount;
        GradientGlyphValueView gradientGlyphValueView = (GradientGlyphValueView) cma1.O(i2, this);
        if (gradientGlyphValueView != null) {
            i2 = agh0.navigation_trail_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = agh0.navigation_trail_text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView != null) {
                    i2 = agh0.navigation_trail_text_container;
                    if (((LinearLayout) cma1.O(i2, this)) != null) {
                        this.binding = new ma50(this, gradientGlyphValueView, appCompatImageView, robotoTextView);
                        this.icon = appCompatImageView;
                        this.normalText = robotoTextView;
                        this.cashBackText = gradientGlyphValueView;
                        setNavigationType(NavigationType.NONE);
                        setTextType(TextType.NORMAL);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setNavigationType(NavigationType type) {
        int i = l.a[type.ordinal()];
        if (i == 1) {
            this.icon.setVisibility(8);
            return;
        }
        if (i == 2) {
            this.icon.setVisibility(4);
            return;
        }
        if (i == 3) {
            this.icon.setVisibility(0);
            AppCompatImageView appCompatImageView = this.icon;
            int i2 = f1h0.ic_arrow_24;
            Drawable t = vng.t(i2, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
            if (t != null) {
                appCompatImageView.setImageDrawable(t);
                return;
            } else {
                w511.f(oyr.j(i2, "Drawable resource ", " not found"));
                return;
            }
        }
        if (i != 4) {
            w511.b();
            return;
        }
        this.icon.setVisibility(0);
        AppCompatImageView appCompatImageView2 = this.icon;
        int i3 = f1h0.ic_arrow_in_round_24;
        Drawable t2 = vng.t(i3, new ContextThemeWrapper(getContext(), a2i0.IconWhiteBold));
        if (t2 != null) {
            appCompatImageView2.setImageDrawable(t2);
        } else {
            w511.f(oyr.j(i3, "Drawable resource ", " not found"));
        }
    }

    public final void setText(CharSequence text) {
        this.normalText.setText(text);
        this.cashBackText.setValue(text);
    }

    public final void setTextType(TextType type) {
        int i = l.b[type.ordinal()];
        if (i == 1) {
            this.normalText.setVisibility(0);
            this.normalText.setTextAlignment(2);
            this.cashBackText.setVisibility(8);
        } else if (i == 2) {
            this.normalText.setVisibility(8);
            this.cashBackText.setVisibility(0);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            this.normalText.setVisibility(0);
            this.normalText.setTextAlignment(3);
            this.cashBackText.setVisibility(8);
        }
    }

    public NavigationWithTextTrailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NavigationWithTextTrailView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ NavigationWithTextTrailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
