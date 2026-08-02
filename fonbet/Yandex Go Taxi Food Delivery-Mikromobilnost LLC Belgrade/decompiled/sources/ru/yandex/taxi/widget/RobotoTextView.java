package ru.yandex.taxi.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.gdc;
import defpackage.hdc;
import defpackage.hg;
import defpackage.kdc;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xz20;
import defpackage.ynb1;
import defpackage.yt3;
import defpackage.yvk0;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001_B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0012\u0010\u0014J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0019\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0019\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001e\u001a\u00020\u000b2\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\rJ\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u0010J#\u0010.\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\rJ\u0017\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u0010\u0010J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b:\u0010\u0014J\u0019\u0010;\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b;\u0010\u0014J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010\u0010J\u000f\u0010=\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010\rJ\u0017\u0010>\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010\rJ\u000f\u0010A\u001a\u00020\u000bH\u0002¢\u0006\u0004\bA\u0010\rJ\u000f\u0010B\u001a\u000207H\u0002¢\u0006\u0004\bB\u00109J!\u0010E\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010O\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010N\u001a\u0004\bP\u00109\"\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010NR\u0016\u0010T\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010XR\u0014\u0010[\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010&R\u0014\u0010]\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010&¨\u0006`"}, d2 = {"Lru/yandex/taxi/widget/RobotoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "enableFigmaLook", "()V", "attrId", "setTextColorAttr", "(I)V", "color", "setTextColor", "Lkdc;", "(Lkdc;)V", "Landroid/content/res/ColorStateList;", "colors", "(Landroid/content/res/ColorStateList;)V", "setTextLinkColorAttr", "setTextLinkColor", "", "minTextSize", "maxTextSize", "maxLines", "enableAutoSize", "(FFI)V", "disableAutoSize", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "getExtendedPaddingTop", "()I", "getExtendedPaddingBottom", "typeface", "setTextTypeface", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "invalidateAutosize", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "resId", "setBackgroundResource", "", "applyThemeForChildrenByDefault", "()Z", "setTextColorInternal", "setTextLinkColorInternal", "measurePixelPerfectHeight", "measureTextOffsetY", "calcMinWidth", "(I)I", "removeAutoSizeListener", "addAutoSizeListener", "autoSize", "Landroid/content/res/TypedArray;", "attributes", "resolveThemebleAttrs", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "Lyt3;", "autoSizeTextCalculator", "Lyt3;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "autoSizeEllipsizeListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "needAutoSize", "Z", "useMinimumWidth", "getUseMinimumWidth", "setUseMinimumWidth", "(Z)V", "isFigmaLookEnabled", "offsetY", CA20Status.STATUS_USER_I, "backgroundRes", "textColor", "Lkdc;", "linkTextColor", "getFallbackTextColor", "fallbackTextColor", "getFallbackLinkTextColor", "fallbackLinkTextColor", "Companion", "yvk0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class RobotoTextView extends AppCompatTextView implements nwy0 {
    private static final String ANDROID_TEXT_COLOR_ATTR = "android:textColor";
    private static final String ANDROID_TEXT_COLOR_LINK_ATTR = "android:textColorLink";
    private ViewTreeObserver.OnPreDrawListener autoSizeEllipsizeListener;
    private yt3 autoSizeTextCalculator;
    private int backgroundRes;
    private boolean isFigmaLookEnabled;
    private kdc linkTextColor;
    private boolean needAutoSize;
    private int offsetY;
    private kdc textColor;
    private boolean useMinimumWidth;
    public static final yvk0 Companion = new yvk0();
    private static final int ANDROID_TEXT_COLOR_STYLE = c4i0.RobotoTextView_android_textColor;
    private static final int ANDROID_TEXT_COLOR_LINK_STYLE = c4i0.RobotoTextView_android_textColorLink;

    public RobotoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = xng0.textMain;
        this.textColor = new bdc(i2);
        this.linkTextColor = new bdc(i2);
        Companion.getClass();
        yvk0.b(this, context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.RobotoTextView, i, 0);
        try {
            this.useMinimumWidth = obtainStyledAttributes.getBoolean(c4i0.RobotoTextView_useMinimumWidth, false);
            this.backgroundRes = attributeSet != null ? attributeSet.getAttributeResourceValue(R.attr.background, 0) : 0;
            resolveThemebleAttrs(attributeSet, obtainStyledAttributes);
            if (obtainStyledAttributes.getBoolean(c4i0.RobotoTextView_figmaLook, false)) {
                enableFigmaLook();
            }
            obtainStyledAttributes.recycle();
            setTextDirection(xw31.n(context) ? 4 : 3);
            hg.a(this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void addAutoSizeListener() {
        if (this.autoSizeEllipsizeListener != null) {
            getViewTreeObserver().addOnPreDrawListener(this.autoSizeEllipsizeListener);
        }
    }

    private final boolean autoSize() {
        yt3 yt3Var = this.autoSizeTextCalculator;
        if (yt3Var != null) {
            float a = yt3Var.a();
            if (a != 0.0f && getTextSize() != a) {
                setTextSize(0, a);
                return true;
            }
        }
        return false;
    }

    private final int calcMinWidth(int widthMeasureSpec) {
        if (!this.useMinimumWidth) {
            return Integer.MAX_VALUE;
        }
        Layout layout = getLayout();
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 || layout.getLineCount() <= 1) {
            return Integer.MAX_VALUE;
        }
        float minWidth = getMinWidth();
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            float lineMax = layout.getLineMax(i);
            if (lineMax > minWidth) {
                minWidth = lineMax;
            }
        }
        return getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(minWidth));
    }

    private final int getFallbackLinkTextColor() {
        return s8o.m(new bdc(xng0.textMain), getContext());
    }

    private final int getFallbackTextColor() {
        return s8o.m(new bdc(xng0.textMain), getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invalidateAutosize$lambda$0(RobotoTextView robotoTextView) {
        robotoTextView.removeAutoSizeListener();
        return !robotoTextView.autoSize();
    }

    private final void measurePixelPerfectHeight(int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == 1073741824) {
            return;
        }
        int paddingBottom = getPaddingBottom() + (getLineCount() * getLineHeight()) + getPaddingTop();
        if (mode == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, getMeasuredHeight());
        }
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    private final void measureTextOffsetY() {
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        int lineBottom = ((layout.getLineBottom(layout.getLineCount() - 1) - layout.getLineTop(0)) - getMeasuredHeight()) / 2;
        this.offsetY = lineBottom >= 0 ? lineBottom : 0;
    }

    private final void removeAutoSizeListener() {
        if (this.autoSizeEllipsizeListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.autoSizeEllipsizeListener);
        }
    }

    private final void resolveThemebleAttrs(AttributeSet attrs, TypedArray attributes) {
        if (attrs == null) {
            setTextColorAttr(xng0.textMain);
            setTextLinkColorAttr(xng0.textMain);
            return;
        }
        int i = ANDROID_TEXT_COLOR_STYLE;
        int i2 = xng0.textMain;
        final int i3 = 0;
        Consumer consumer = new Consumer() { // from class: wvk0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i4 = i3;
                RobotoTextView robotoTextView = this;
                Integer num = (Integer) obj;
                switch (i4) {
                    case 0:
                        RobotoTextView.resolveThemebleAttrs$lambda$0(robotoTextView, num);
                        break;
                    case 1:
                        RobotoTextView.resolveThemebleAttrs$lambda$1(robotoTextView, num);
                        break;
                    case 2:
                        RobotoTextView.resolveThemebleAttrs$lambda$2(robotoTextView, num);
                        break;
                    default:
                        RobotoTextView.resolveThemebleAttrs$lambda$3(robotoTextView, num);
                        break;
                }
            }
        };
        final int i4 = 1;
        qje.S(attrs, attributes, ANDROID_TEXT_COLOR_ATTR, i, i2, consumer, new Consumer() { // from class: wvk0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i4;
                RobotoTextView robotoTextView = this;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        RobotoTextView.resolveThemebleAttrs$lambda$0(robotoTextView, num);
                        break;
                    case 1:
                        RobotoTextView.resolveThemebleAttrs$lambda$1(robotoTextView, num);
                        break;
                    case 2:
                        RobotoTextView.resolveThemebleAttrs$lambda$2(robotoTextView, num);
                        break;
                    default:
                        RobotoTextView.resolveThemebleAttrs$lambda$3(robotoTextView, num);
                        break;
                }
            }
        });
        int i5 = ANDROID_TEXT_COLOR_LINK_STYLE;
        int i6 = xng0.textMain;
        final int i7 = 2;
        Consumer consumer2 = new Consumer() { // from class: wvk0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i7;
                RobotoTextView robotoTextView = this;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        RobotoTextView.resolveThemebleAttrs$lambda$0(robotoTextView, num);
                        break;
                    case 1:
                        RobotoTextView.resolveThemebleAttrs$lambda$1(robotoTextView, num);
                        break;
                    case 2:
                        RobotoTextView.resolveThemebleAttrs$lambda$2(robotoTextView, num);
                        break;
                    default:
                        RobotoTextView.resolveThemebleAttrs$lambda$3(robotoTextView, num);
                        break;
                }
            }
        };
        final int i8 = 3;
        qje.S(attrs, attributes, ANDROID_TEXT_COLOR_LINK_ATTR, i5, i6, consumer2, new Consumer() { // from class: wvk0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i8;
                RobotoTextView robotoTextView = this;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        RobotoTextView.resolveThemebleAttrs$lambda$0(robotoTextView, num);
                        break;
                    case 1:
                        RobotoTextView.resolveThemebleAttrs$lambda$1(robotoTextView, num);
                        break;
                    case 2:
                        RobotoTextView.resolveThemebleAttrs$lambda$2(robotoTextView, num);
                        break;
                    default:
                        RobotoTextView.resolveThemebleAttrs$lambda$3(robotoTextView, num);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemebleAttrs$lambda$0(RobotoTextView robotoTextView, Integer num) {
        robotoTextView.setTextColorAttr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemebleAttrs$lambda$1(RobotoTextView robotoTextView, Integer num) {
        robotoTextView.setTextColor(new gdc(num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemebleAttrs$lambda$2(RobotoTextView robotoTextView, Integer num) {
        robotoTextView.setTextLinkColorAttr(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemebleAttrs$lambda$3(RobotoTextView robotoTextView, Integer num) {
        robotoTextView.setTextLinkColor(new gdc(num.intValue()));
    }

    public static final void setRobotoViewAttributes(TextView textView, Context context, AttributeSet attributeSet, int i) {
        Companion.getClass();
        yvk0.b(textView, context, attributeSet, i);
    }

    private final void setTextColorInternal(kdc color) {
        this.textColor = color;
        if (color instanceof hdc) {
            super.setTextColor(((hdc) color).a);
        } else {
            super.setTextColor(color != null ? s8o.m(color, getContext()) : getFallbackTextColor());
        }
    }

    private final void setTextLinkColorInternal(kdc color) {
        this.linkTextColor = color;
        if (color instanceof hdc) {
            super.setLinkTextColor(((hdc) color).a);
        } else {
            super.setLinkTextColor(color != null ? s8o.m(color, getContext()) : getFallbackLinkTextColor());
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    public void applyTheme(ThemeType themeType) {
        setTextColorInternal(this.textColor);
        setTextLinkColorInternal(this.linkTextColor);
        int i = this.backgroundRes;
        if (i != 0) {
            setBackground(vng.t(i, getContext()));
        }
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void disableAutoSize() {
        ynb1.d(this);
        this.autoSizeTextCalculator = null;
        this.needAutoSize = false;
        invalidateAutosize();
    }

    public final void enableAutoSize(float minTextSize, float maxTextSize, int maxLines) {
        yt3 yt3Var = new yt3(minTextSize, maxTextSize, maxLines, this);
        yt3Var.g = maxLines;
        this.autoSizeTextCalculator = yt3Var;
        this.needAutoSize = true;
        invalidateAutosize();
    }

    public final void enableFigmaLook() {
        this.isFigmaLookEnabled = true;
        setIncludeFontPadding(false);
        setFallbackLineSpacing(false);
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingBottom() {
        return super.getExtendedPaddingBottom() - this.offsetY;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingTop() {
        return super.getExtendedPaddingTop() - this.offsetY;
    }

    public final boolean getUseMinimumWidth() {
        return this.useMinimumWidth;
    }

    public final void invalidateAutosize() {
        removeAutoSizeListener();
        this.autoSizeEllipsizeListener = null;
        if (this.needAutoSize) {
            this.autoSizeEllipsizeListener = new xz20(2, this);
            addAutoSizeListener();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int calcMinWidth = calcMinWidth(widthMeasureSpec);
        if (calcMinWidth < getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(calcMinWidth, 1073741824), heightMeasureSpec);
        }
        if (!this.isFigmaLookEnabled) {
            this.offsetY = 0;
        } else {
            measurePixelPerfectHeight(heightMeasureSpec);
            measureTextOffsetY();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundResource(int resId) {
        if (resId != 0) {
            this.backgroundRes = resId;
            setBackground(vng.t(resId, getContext()));
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        super.setText(text, type);
        invalidateAutosize();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colors) {
        setTextColorInternal(colors != null ? new hdc(colors) : null);
    }

    public void setTextColorAttr(int attrId) {
        setTextColorInternal(new bdc(attrId));
    }

    public void setTextLinkColor(ColorStateList colors) {
        setTextLinkColorInternal(colors != null ? new hdc(colors) : null);
    }

    public void setTextLinkColorAttr(int attrId) {
        setTextLinkColorInternal(new bdc(attrId));
    }

    public final void setTextTypeface(int typeface) {
        Companion.getClass();
        yvk0.a(this, typeface);
    }

    public final void setUseMinimumWidth(boolean z) {
        this.useMinimumWidth = z;
    }

    public void setTextColor(kdc color) {
        setTextColorInternal(color);
    }

    public void setTextLinkColor(kdc color) {
        setTextLinkColorInternal(color);
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        setTextColorInternal(new cdc(color));
    }

    public void setTextLinkColor(int color) {
        setTextLinkColorInternal(new cdc(color));
    }

    public RobotoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RobotoTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RobotoTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.robotoTextViewStyle : i);
    }
}
