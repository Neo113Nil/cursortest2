package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b7;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.dl40;
import defpackage.e32;
import defpackage.evu0;
import defpackage.f32;
import defpackage.fl40;
import defpackage.gdc;
import defpackage.gtq0;
import defpackage.hdc;
import defpackage.iz6;
import defpackage.jxi;
import defpackage.jz6;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.n4i0;
import defpackage.q94;
import defpackage.qje;
import defpackage.qke;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tp11;
import defpackage.udq0;
import defpackage.w0d;
import defpackage.wuj0;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.DebounceClickListener;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0007\n\u0002\b\b\b\u0016\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0004\u0086\u0001\u0087\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ\u0019\u0010 \u001a\u00020\f2\b\b\u0001\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u000eJ\u0019\u0010 \u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b \u0010#J\u000f\u0010$\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0017¢\u0006\u0004\b(\u0010)J\u0019\u0010(\u001a\u00020\f2\b\b\u0001\u0010'\u001a\u00020\u0007H\u0017¢\u0006\u0004\b(\u0010\u000eJ\u0019\u0010(\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*H\u0017¢\u0006\u0004\b(\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0007H\u0017¢\u0006\u0004\b.\u0010\u000eJ\u0017\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0004\b0\u0010,J\u0017\u00102\u001a\u00020\f2\b\b\u0001\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u0010\u000eJ\u0017\u00102\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b2\u0010)J\u0017\u00103\u001a\u00020\f2\b\b\u0001\u0010'\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\u000eJ\u0017\u00103\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b3\u0010)J\u0017\u00105\u001a\u00020\f2\b\b\u0001\u00104\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\u000eJ\u0015\u00105\u001a\u00020\f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b5\u0010)J\u000f\u00106\u001a\u00020\fH\u0015¢\u0006\u0004\b6\u0010%J\u0017\u00108\u001a\u00020\f2\b\b\u0001\u00107\u001a\u00020\u0007¢\u0006\u0004\b8\u0010\u000eJ\u0015\u00108\u001a\u00020\f2\u0006\u0010/\u001a\u00020*¢\u0006\u0004\b8\u0010,J\u0017\u00108\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b8\u0010)J\u0017\u0010:\u001a\u00020\f2\b\b\u0001\u00109\u001a\u00020\u0007¢\u0006\u0004\b:\u0010\u000eJ\u0017\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010&¢\u0006\u0004\b:\u0010)J\u0017\u0010=\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u00020\f2\b\u0010?\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b@\u0010>J\u0019\u0010=\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\b=\u0010CJ\u0015\u0010E\u001a\u00020\f2\u0006\u0010D\u001a\u00020\u0017¢\u0006\u0004\bE\u0010\u001aJ\r\u0010F\u001a\u00020\f¢\u0006\u0004\bF\u0010%J\r\u0010G\u001a\u00020\f¢\u0006\u0004\bG\u0010%J\u0015\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020\u0017¢\u0006\u0004\bI\u0010\u001aJ\u0017\u0010L\u001a\u00020\f2\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MJ\u001f\u0010Q\u001a\u00020\f2\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020\u0007H\u0014¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\f2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u0004\u0018\u00010&¢\u0006\u0004\bY\u0010ZJ\u001f\u0010\\\u001a\u00020\f2\u0006\u0010[\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b\\\u0010]J!\u0010^\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b^\u0010_J!\u0010`\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b`\u0010_J!\u0010a\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\ba\u0010_J\u000f\u0010b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bb\u0010cJ!\u0010e\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\b\u0010d\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u0007H\u0003¢\u0006\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u00109\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010nR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010vR\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010kR\u0016\u0010w\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010xR*\u0010{\u001a\u00020\u00072\u0006\u0010z\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010x\u001a\u0004\b|\u0010c\"\u0004\b}\u0010\u000eR\u0016\u0010~\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010xR\u0014\u0010\u007f\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u007f\u0010kR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0082\u0001R\u0019\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bK\u0010\u0084\u0001¨\u0006\u0088\u0001"}, d2 = {"Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonSizeInt", "Lzy11;", "setButtonSize", "(I)V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "getText", "()Ljava/lang/CharSequence;", "", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "textIconTint", "setTextIconTint", "padding", "setTextIconPadding", "iconId", "setTextIcon", "Landroid/graphics/drawable/Drawable;", "icon", "(Landroid/graphics/drawable/Drawable;)V", "drawableStateChanged", "()V", "Lkdc;", "color", "setTextColor", "(Lkdc;)V", "Landroid/content/res/ColorStateList;", "colors", "(Landroid/content/res/ColorStateList;)V", "attrId", "setTextColorAttr", "colorStateList", "setButtonBackgroundStateList", "baseBackgroundColor", "setButtonBackground", "setDisabledButtonBackground", "rippleColor", "setRippleColor", "invalidateComponent", "baseTextColor", "setButtonTitleColor", "disabledTextColor", "setDisabledButtonTitleColor", "Ljava/lang/Runnable;", "onClickListener", "setOnClickListener", "(Ljava/lang/Runnable;)V", "listener", "setDebounceClickListener", "Landroid/view/View$OnClickListener;", "l", "(Landroid/view/View$OnClickListener;)V", "progressing", "setProgressing", "startProgress", "finishProgress", "accent", "setAccent", "", "analyticsButtonName", "setAnalyticsButtonName", "(Ljava/lang/String;)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "isRoundedCorners", "()Z", "getRippleBackgroundColor", "()Lkdc;", "width", "setOutline", "(ILkdc;)V", "init", "(Landroid/util/AttributeSet;I)V", "applyAttributes", "applyTextAttributes", "getDisabledColor", "()I", "colorState", "updateTextIconTint", "(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V", "attrEnumInt", "getButtonMinHeightResId", "(I)I", "roundedCorners", "Z", "Ljava/lang/Runnable;", "textColor", "Lkdc;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "disabledBackgroundColor", "rippleBackgroundColor", "outlineColor", "Landroid/graphics/drawable/Drawable;", "rawText", "Ljava/lang/CharSequence;", "Landroid/widget/TextView$BufferType;", "textIconPadding", CA20Status.STATUS_USER_I, "textIconPosition", "value", "roundedCornersRadius", "getRoundedCornersRadius", "setRoundedCornersRadius", "outlineWidth", "isSuperClassInitialized", "", "defaultDisabledAlpha", "F", "disabledAlpha", "Ljava/lang/String;", "Companion", "jz6", "CenteredImageSpan", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ButtonComponent extends ShimmeringRobotoTextView {
    public static final int BUTTON_SIZE_L = 3;
    public static final int BUTTON_SIZE_M = 2;
    public static final int BUTTON_SIZE_S = 1;
    public static final int BUTTON_SIZE_XS = 0;
    public static final jz6 Companion = new jz6();
    private String analyticsButtonName;
    private kdc backgroundColor;
    private final float defaultDisabledAlpha;
    private float disabledAlpha;
    private kdc disabledBackgroundColor;
    private kdc disabledTextColor;
    private Drawable icon;
    private final boolean isSuperClassInitialized;
    private Runnable onClickListener;
    private kdc outlineColor;
    private int outlineWidth;
    private CharSequence rawText;
    private kdc rippleBackgroundColor;
    private boolean roundedCorners;
    private int roundedCornersRadius;
    private kdc textColor;
    private int textIconPadding;
    private int textIconPosition;
    private boolean textIconTint;
    private TextView.BufferType type;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/design/ButtonComponent$CenteredImageSpan;", "Lru/yandex/taxi/utils/CustomImageSpan;", "drawable", "Landroid/graphics/drawable/Drawable;", "<init>", "(Lru/yandex/taxi/design/ButtonComponent;Landroid/graphics/drawable/Drawable;)V", "getSize", "", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class CenteredImageSpan extends CustomImageSpan {
        public CenteredImageSpan(Drawable drawable) {
            super(drawable, 2, false, false, null, 28, null);
        }

        @Override // ru.yandex.taxi.utils.CustomImageSpan, android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
            return ButtonComponent.this.textIconPadding + super.getSize(paint, text, start, end, fm);
        }
    }

    public ButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.roundedCorners = true;
        this.textColor = new bdc(xng0.textOnControl);
        this.disabledTextColor = new bdc(xng0.textOnControlMinor);
        this.backgroundColor = new bdc(xng0.controlMain);
        this.disabledBackgroundColor = new bdc(xng0.controlMinor);
        this.rawText = super.getText();
        this.isSuperClassInitialized = true;
        Resources resources = getResources();
        int i2 = mrg0.button_component_default_disabled_alpha;
        Rect rect = xw31.a;
        ThreadLocal threadLocal = wuj0.a;
        this.defaultDisabledAlpha = resources.getFloat(i2);
        init(attributeSet, i);
    }

    private final void applyAttributes(AttributeSet attrs, int defStyleAttr) {
        applyTextAttributes(attrs, defStyleAttr);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ButtonComponent, defStyleAttr, 0);
        try {
            if (getMinHeight() <= 0) {
                setButtonSize(obtainStyledAttributes.getInt(c4i0.ButtonComponent_component_button_size, 3));
            }
            this.textIconPadding = obtainStyledAttributes.getDimensionPixelOffset(c4i0.ButtonComponent_component_button_icon_padding, tje.u(10, getContext()));
            this.textIconPosition = obtainStyledAttributes.getInt(c4i0.ButtonComponent_component_button_icon_position, 0);
            this.textIconTint = obtainStyledAttributes.getBoolean(c4i0.ButtonComponent_component_button_icon_tint, false);
            setRoundedCornersRadius(obtainStyledAttributes.getDimensionPixelOffset(c4i0.ButtonComponent_component_button_rounded_corners_radius, tje.r(mrg0.button_component_default_rounded_corners_radius, getContext())));
            this.roundedCorners = obtainStyledAttributes.getBoolean(c4i0.ButtonComponent_component_button_rounded_corners, true);
            this.outlineWidth = obtainStyledAttributes.getDimensionPixelSize(c4i0.ButtonComponent_component_button_outline_width, tje.r(mrg0.button_component_default_outline_width, getContext()));
            setAccent(obtainStyledAttributes.getBoolean(c4i0.ButtonComponent_component_button_accent, false));
            this.disabledAlpha = obtainStyledAttributes.getFloat(c4i0.ButtonComponent_component_button_disabled_alpha, this.defaultDisabledAlpha);
            setEnabled(isEnabled());
            setTextIcon(obtainStyledAttributes.getResourceId(c4i0.ButtonComponent_component_button_icon, 0));
            if (attrs == null) {
                invalidateComponent();
                obtainStyledAttributes.recycle();
                return;
            }
            this.textColor = qje.T(attrs, obtainStyledAttributes, "component_title_color", c4i0.ButtonComponent_component_title_color, Integer.valueOf(xng0.textOnControl));
            this.disabledTextColor = qje.T(attrs, obtainStyledAttributes, "component_disabled_title_color", c4i0.ButtonComponent_component_disabled_title_color, Integer.valueOf(xng0.textOnControlMinor));
            this.backgroundColor = qje.T(attrs, obtainStyledAttributes, "component_background_color", c4i0.ButtonComponent_component_background_color, Integer.valueOf(xng0.controlMain));
            this.outlineColor = qje.T(attrs, obtainStyledAttributes, "component_button_outline_color", c4i0.ButtonComponent_component_button_outline_color, null);
            this.disabledBackgroundColor = qje.T(attrs, obtainStyledAttributes, "component_disabled_background_color", c4i0.ButtonComponent_component_disabled_background_color, Integer.valueOf(xng0.controlMinor));
            invalidateComponent();
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void applyTextAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, n4i0.TextAppearance, defStyleAttr, 0);
        if (!obtainStyledAttributes.hasValue(n4i0.TextAppearance_android_textSize)) {
            setTextSize(0, tje.r(mrg0.component_text_size_body, getContext()));
        }
        obtainStyledAttributes.recycle();
    }

    private final int getButtonMinHeightResId(int attrEnumInt) {
        if (attrEnumInt == 0) {
            return mrg0.button_component_size_XS;
        }
        if (attrEnumInt == 1) {
            return mrg0.button_component_size_S;
        }
        if (attrEnumInt != 2 && attrEnumInt == 3) {
            return mrg0.button_component_size_L;
        }
        return mrg0.button_component_size_M;
    }

    private final int getDisabledColor() {
        ColorStateList colorStateList;
        kdc kdcVar = this.backgroundColor;
        if (kdcVar instanceof hdc) {
            colorStateList = ((hdc) kdcVar).a;
        } else if (kdcVar instanceof gdc) {
            colorStateList = qke.m(((gdc) kdcVar).a, getContext());
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList.getColorForState(new int[]{-16842910}, qje.t(xng0.controlMinor, getContext()));
        }
        kdc kdcVar2 = this.disabledBackgroundColor;
        if (kdcVar2 == null) {
            kdcVar2 = new bdc(xng0.controlMinor);
        }
        return s8o.m(kdcVar2, getContext());
    }

    private final void init(AttributeSet attrs, int defStyleAttr) {
        setGravity(17);
        setTextTypeface(0);
        setMaxLines(2);
        int r = tje.r(mrg0.go_design_m_space, getContext());
        setPadding(r, 0, r, 0);
        setEllipsize(TextUtils.TruncateAt.END);
        applyAttributes(attrs, defStyleAttr);
        setOnClickListener(new DebounceClickListener(new dl40(0), new b7(14, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(ButtonComponent buttonComponent) {
        Runnable runnable = buttonComponent.onClickListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void updateTextIconTint(Drawable icon, ColorStateList colorState) {
        icon.setTintList(colorState);
        if (icon.isStateful()) {
            icon.setState(getDrawableState());
        }
    }

    @Override // ru.yandex.taxi.widget.ShimmeringRobotoTextView, ru.yandex.taxi.widget.RobotoTextView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        invalidateComponent();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.icon;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void finishProgress() {
        stopAnimation();
    }

    public final kdc getRippleBackgroundColor() {
        return this.rippleBackgroundColor;
    }

    public final int getRoundedCornersRadius() {
        return this.roundedCornersRadius;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        CharSequence charSequence = this.rawText;
        return charSequence == null ? super.getText() : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence] */
    public void invalidateComponent() {
        ColorStateList f;
        TextView.BufferType bufferType;
        CharSequence charSequence;
        kdc kdcVar = this.backgroundColor;
        if (kdcVar == null) {
            kdcVar = new bdc(xng0.controlMain);
        }
        int m = s8o.m(kdcVar, getContext());
        int disabledColor = getDisabledColor();
        kdc kdcVar2 = this.rippleBackgroundColor;
        Integer valueOf = kdcVar2 != null ? Integer.valueOf(s8o.m(kdcVar2, getContext())) : null;
        kdc kdcVar3 = this.outlineColor;
        if (kdcVar3 == null) {
            kdcVar3 = new cdc(0);
        }
        int m2 = s8o.m(kdcVar3, getContext());
        if (!isInEditMode()) {
            w0d w0dVar = new w0d();
            w0dVar.h = this.roundedCorners ? this.roundedCornersRadius : 0.0f;
            w0dVar.a = m;
            w0dVar.c = disabledColor;
            w0dVar.f = true;
            w0dVar.d = disabledColor;
            w0dVar.i = this.outlineWidth;
            w0dVar.b = m2;
            w0dVar.g = true;
            w0dVar.e = valueOf;
            setBackgroundDrawable(w0dVar.a());
        }
        kdc kdcVar4 = this.textColor;
        if (kdcVar4 instanceof hdc) {
            f = ((hdc) kdcVar4).a;
        } else if (kdcVar4 instanceof gdc) {
            f = qke.m(((gdc) kdcVar4).a, getContext());
            if (f == null) {
                f = ColorStateList.valueOf(0);
            }
        } else {
            if (kdcVar4 == null) {
                kdcVar4 = new bdc(xng0.textOnControl);
            }
            int m3 = s8o.m(kdcVar4, getContext());
            kdc kdcVar5 = this.disabledTextColor;
            if (kdcVar5 == null) {
                kdcVar5 = new bdc(xng0.textOnControlMinor);
            }
            f = gtq0.f(m3, s8o.m(kdcVar5, getContext()));
        }
        setTextColor(f);
        Drawable drawable = this.icon;
        if (drawable != null) {
            drawable.mutate();
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            if (this.textIconTint) {
                updateTextIconTint(drawable, f);
            }
        }
        if (drawable != null) {
            if (this.textIconPosition == 0) {
                ?? r3 = this.rawText;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r3 != 0 ? r3 : "");
                spannableStringBuilder.insert(0, (CharSequence) " ");
                spannableStringBuilder.setSpan(new CenteredImageSpan(drawable), 0, 1, 0);
                bufferType = TextView.BufferType.SPANNABLE;
                charSequence = spannableStringBuilder;
            } else {
                ?? r32 = this.rawText;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r32 != 0 ? r32 : "");
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append(" ", new CustomImageSpan(drawable, 2, false, false, null, 28, null), 33);
                bufferType = TextView.BufferType.SPANNABLE;
                charSequence = spannableStringBuilder2;
            }
        } else {
            CharSequence charSequence2 = this.rawText;
            bufferType = this.type;
            charSequence = charSequence2;
        }
        super.setText(charSequence, bufferType);
    }

    /* renamed from: isRoundedCorners, reason: from getter */
    public final boolean getRoundedCorners() {
        return this.roundedCorners;
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        String str;
        f32 f32Var;
        e32 analyticsContext;
        super.onVisibilityChanged(changedView, visibility);
        if (changedView != this || (str = this.analyticsButtonName) == null || evu0.J(str) || (f32Var = (f32) xw31.f(this)) == null || (analyticsContext = f32Var.getAnalyticsContext()) == null) {
            return;
        }
        if (visibility == 0) {
            analyticsContext.d(str);
        } else {
            analyticsContext.e(str);
        }
    }

    public final void setAccent(boolean accent) {
        if (accent) {
            tp11.b(3, this);
        } else {
            tp11.b(0, this);
        }
    }

    public final void setAnalyticsButtonName(String analyticsButtonName) {
        udq0.I(this, this.analyticsButtonName, analyticsButtonName, getVisibility() == 0);
        this.analyticsButtonName = analyticsButtonName;
    }

    public final void setButtonBackground(int baseBackgroundColor) {
        setButtonBackground(new cdc(baseBackgroundColor));
    }

    public final void setButtonBackgroundStateList(ColorStateList colorStateList) {
        this.backgroundColor = colorStateList != null ? new hdc(colorStateList) : null;
        invalidateComponent();
    }

    public final void setButtonSize(int buttonSizeInt) {
        setMinHeight(tje.r(getButtonMinHeightResId(buttonSizeInt), getContext()));
    }

    public final void setButtonTitleColor(int baseTextColor) {
        this.textColor = new cdc(baseTextColor);
        invalidateComponent();
    }

    public void setDebounceClickListener(Runnable listener) {
        int i = 0;
        if (listener == null) {
            super.setOnClickListener((View.OnClickListener) null);
            setClickable(false);
        } else {
            Object context = getContext();
            super.setOnClickListener(new DebounceClickListener(context instanceof fl40 ? ((fl40) context).sharedMultiClickHandler() : new dl40(0), udq0.V(this, listener, new iz6(this, i))));
        }
    }

    public final void setDisabledButtonBackground(int color) {
        setDisabledButtonBackground(new cdc(color));
    }

    public final void setDisabledButtonTitleColor(int disabledTextColor) {
        this.disabledTextColor = new cdc(disabledTextColor);
        invalidateComponent();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setAlpha(enabled ? 1.0f : this.disabledAlpha);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        super.setOnClickListener(l == null ? null : new q94(0, l, new iz6(this, 1), this));
    }

    public final void setOutline(int width, kdc color) {
        this.outlineWidth = width;
        this.outlineColor = color;
        invalidateComponent();
    }

    public final void setProgressing(boolean progressing) {
        if (progressing) {
            startProgress();
        } else {
            finishProgress();
        }
    }

    public final void setRippleColor(int rippleColor) {
        this.rippleBackgroundColor = new cdc(rippleColor);
        invalidateComponent();
    }

    public final void setRoundedCornersRadius(int i) {
        this.roundedCornersRadius = i;
        invalidateComponent();
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        this.rawText = text;
        this.type = type;
        if (this.isSuperClassInitialized) {
            invalidateComponent();
        } else {
            super.setText(text, type);
        }
    }

    @Override // ru.yandex.taxi.widget.ShimmeringRobotoTextView, ru.yandex.taxi.widget.RobotoTextView
    @jxi
    public void setTextColor(kdc color) {
        super.setTextColor(color);
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView
    @jxi
    public void setTextColorAttr(int attrId) {
        super.setTextColorAttr(attrId);
    }

    public void setTextIcon(int iconId) {
        if (iconId != 0) {
            setTextIcon(tje.c0(iconId, getContext()));
        } else {
            setTextIcon((Drawable) null);
        }
    }

    public final void setTextIconPadding(int padding) {
        this.textIconPadding = padding;
        invalidate();
    }

    public final void setTextIconTint(boolean textIconTint) {
        this.textIconTint = textIconTint;
        invalidateComponent();
    }

    public final void startProgress() {
        kdc kdcVar = this.backgroundColor;
        if (kdcVar == null) {
            kdcVar = new bdc(xng0.controlMain);
        }
        updateShimmeringColor(kdcVar);
        startAnimation();
    }

    @Override // ru.yandex.taxi.widget.ShimmeringRobotoTextView, ru.yandex.taxi.widget.RobotoTextView, android.widget.TextView
    @jxi
    public void setTextColor(int color) {
        super.setTextColor(color);
    }

    @Override // ru.yandex.taxi.widget.ShimmeringRobotoTextView, ru.yandex.taxi.widget.RobotoTextView, android.widget.TextView
    @jxi
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
    }

    public final void setButtonBackground(kdc color) {
        this.backgroundColor = color;
        invalidateComponent();
    }

    public final void setDisabledButtonBackground(kdc color) {
        this.disabledBackgroundColor = color;
        invalidateComponent();
    }

    public final void setButtonTitleColor(ColorStateList colorStateList) {
        this.textColor = new hdc(colorStateList);
        invalidateComponent();
    }

    public final void setDisabledButtonTitleColor(kdc disabledTextColor) {
        this.disabledTextColor = disabledTextColor;
        invalidateComponent();
    }

    public final void setRippleColor(kdc color) {
        this.rippleBackgroundColor = color;
        invalidateComponent();
    }

    public final void setButtonTitleColor(kdc color) {
        this.textColor = color;
        invalidateComponent();
    }

    public void setTextIcon(Drawable icon) {
        this.icon = icon;
        invalidateComponent();
    }

    public final void setOnClickListener(Runnable onClickListener) {
        this.onClickListener = onClickListener;
    }

    public ButtonComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ButtonComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.buttonComponentStyle : i);
    }
}
