package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.c4i0;
import defpackage.dl40;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.fl40;
import defpackage.hg;
import defpackage.itb;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.ngd0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.tje;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xw31;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.CircleButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.DebounceClickListener;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0002\u0082\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0019\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0019H\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H%¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0007H\u0014¢\u0006\u0004\b!\u0010\u0013J\u0017\u0010#\u001a\u00020\u000e2\b\b\u0001\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u0013J\u0019\u0010#\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b#\u0010&J\u0019\u0010(\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010$¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010'¢\u0006\u0004\b,\u0010)J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0013J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u0013J\u0015\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u00106J7\u0010<\u001a\u00020\u000e2\u0006\u00107\u001a\u00020/2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0014¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u000e¢\u0006\u0004\b>\u0010\u001fJ\u0019\u0010A\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000eH\u0016¢\u0006\u0004\bC\u0010\u001fJ\u0017\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ/\u0010L\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\fH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010S\u001a\u00020\u000e2\u0006\u0010R\u001a\u00020Q2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u000eH\u0002¢\u0006\u0004\bU\u0010\u001fJ\u0017\u0010W\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u0007H\u0002¢\u0006\u0004\bW\u0010\u0013J\u000f\u0010X\u001a\u00020\u000eH\u0002¢\u0006\u0004\bX\u0010\u001fJ\u000f\u0010Y\u001a\u00020\u000eH\u0002¢\u0006\u0004\bY\u0010\u001fJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\b[\u0010\\J\u001f\u0010^\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u00192\u0006\u0010]\u001a\u00020\u0007H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\b`\u0010\\J\u001f\u0010a\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\ba\u00106J\u000f\u0010b\u001a\u00020\u0019H\u0002¢\u0006\u0004\bb\u0010\u001bJ\u001f\u0010c\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\bc\u00106J/\u0010d\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\bd\u0010eJ'\u0010f\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bk\u0010lR\u001a\u0010n\u001a\u00020m8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R#\u0010\u001e\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b\u001e\u0010}\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u00102¨\u0006\u0083\u0001"}, d2 = {"Lru/yandex/taxi/design/CircleButtonComponent;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/content/res/TypedArray;", "attributes", "Lzy11;", "resolveThemeAttrs", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "attr", "setTitleColorAttr", "(I)V", "setBadgeTextColorAttr", "mode", "setImportantForAccessibility", "color", "setTitleColor", "", "getShadowCropFactor", "()F", "getLayoutResource", "()I", "enableShadow", "()V", "lines", "setTitleMaxLines", "resId", "setTitle", "", "text", "(Ljava/lang/CharSequence;)V", "", "setBadgeText", "(Ljava/lang/String;)V", "getBadgeText", "()Ljava/lang/CharSequence;", "setBadgeContentDescription", "setBadgeBackgroundColor", "setBadgeTextColor", "", BackendConfig.Restrictions.ENABLED, "setTitleAutofitEnabled", "(Z)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "hideBadgeText", "Ljava/lang/Runnable;", "listener", "setDebounceClickListener", "(Ljava/lang/Runnable;)V", "hide", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "a", "applyAttrs", "(Landroid/content/res/TypedArray;)V", "Landroid/view/ViewGroup;", "viewGroup", "setImportantForAccessibilityWithChildren", "(Landroid/view/ViewGroup;I)V", "updateDrawableForEmptyBadge", "widthSpec", "measureTitle", "resetView", "setShadowBackground", "scaleFactor", "measureFrame", "(F)V", "frameWidth", "measureContainer", "(FI)V", "measureBadge", "layoutContainer", "getContainerScaleFactor", "layoutBadge", "layoutFrame", "(IIIF)V", "layoutText", "(III)V", "Landroid/view/View;", "view", "Landroid/widget/FrameLayout$LayoutParams;", "getLayoutParams", "(Landroid/view/View;)Landroid/widget/FrameLayout$LayoutParams;", "Lru/yandex/taxi/design/AutoLetterSpacingTextView;", "titleView", "Lru/yandex/taxi/design/AutoLetterSpacingTextView;", "getTitleView", "()Lru/yandex/taxi/design/AutoLetterSpacingTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "textBadge", "Lru/yandex/taxi/widget/RobotoTextView;", "frame", "Landroid/widget/FrameLayout;", "container", "Landroid/view/View;", "Lru/yandex/taxi/widget/b;", "autofitHelper", "Lru/yandex/taxi/widget/b;", "titleAutofitEnabled", "Z", "getEnableShadow", "()Z", "setEnableShadow", "Companion", "itb", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CircleButtonComponent extends FrameLayout implements nwy0 {
    public static final int MAX_BADGE_TEXT_CHARACTERS_COUNT = 5;
    private final ru.yandex.taxi.widget.b autofitHelper;
    private final View container;
    private boolean enableShadow;
    private final FrameLayout frame;
    private final RobotoTextView textBadge;
    private boolean titleAutofitEnabled;
    private final AutoLetterSpacingTextView titleView;
    public static final itb Companion = new itb();
    private static final int ACTION_TITLE_ATTR_TAG_ID = ndh0.action_title_text_id;
    private static final int ACTION_BADGE_TEXT_ATTR_TAG_ID = ndh0.action_badge_text_id;

    public CircleButtonComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AutoLetterSpacingTextView autoLetterSpacingTextView = new AutoLetterSpacingTextView(context, null, 0, i3, defaultConstructorMarker);
        autoLetterSpacingTextView.setId(ndh0.circle_button_title);
        autoLetterSpacingTextView.setTextColor(context.getColor(mqg0.circle_button_shape));
        autoLetterSpacingTextView.setTextSize(0, tje.r(mrg0.order_screens_circle_button_text_size, autoLetterSpacingTextView.getContext()));
        autoLetterSpacingTextView.setMaxLines(3);
        autoLetterSpacingTextView.setEllipsize(TextUtils.TruncateAt.END);
        autoLetterSpacingTextView.setGravity(49);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams.topMargin = tje.u(72, autoLetterSpacingTextView.getContext());
        layoutParams.bottomMargin = tje.r(mrg0.go_design_s_space, autoLetterSpacingTextView.getContext());
        autoLetterSpacingTextView.setLayoutParams(layoutParams);
        int u = tje.u(2, autoLetterSpacingTextView.getContext());
        autoLetterSpacingTextView.setPadding(u, autoLetterSpacingTextView.getPaddingTop(), u, autoLetterSpacingTextView.getPaddingBottom());
        this.titleView = autoLetterSpacingTextView;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, i3, defaultConstructorMarker);
        robotoTextView.setId(ndh0.circle_button_badge);
        robotoTextView.setBackgroundResource(dzg0.bg_notification_badge);
        robotoTextView.setElevation(tje.w(8, robotoTextView.getContext()));
        robotoTextView.setGravity(17);
        robotoTextView.setMaxLines(1);
        robotoTextView.setMinWidth(tje.u(18, robotoTextView.getContext()));
        robotoTextView.setTextSize(tje.u(13, robotoTextView.getContext()));
        robotoTextView.setVisibility(4);
        robotoTextView.setTextTypeface(3);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, tje.u(18, context), 1));
        this.textBadge = robotoTextView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(ndh0.frame_to_scale);
        int r = tje.r(mrg0.circle_buttons_frame_size, frameLayout.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(r, r, 1));
        this.frame = frameLayout;
        addView(frameLayout);
        addView(autoLetterSpacingTextView);
        addView(robotoTextView);
        setClipToPadding(false);
        View inflate = LayoutInflater.from(context).inflate(getLayoutResource(), (ViewGroup) frameLayout, false);
        this.container = inflate;
        frameLayout.addView(inflate);
        this.autofitHelper = ngd0.n(autoLetterSpacingTextView, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.CircleButtonComponent, i, 0);
        try {
            applyAttrs(obtainStyledAttributes);
            resolveThemeAttrs(attributeSet, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            hg.a(this);
            setImportantForAccessibility(getImportantForAccessibility());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void applyAttrs(TypedArray a) {
        setTitleAutofitEnabled(a.getBoolean(c4i0.CircleButtonComponent_component_circle_title_autofit, false));
        setTitle(a.getString(c4i0.CircleButtonComponent_component_circle_title));
        int dimension = (int) a.getDimension(c4i0.CircleButtonComponent_component_frame_width, -1.0f);
        if (dimension != -1) {
            getLayoutParams(this.frame).width = dimension;
        }
        this.enableShadow = a.getBoolean(c4i0.CircleButtonComponent_component_shadow_enable, false);
        int dimension2 = (int) a.getDimension(c4i0.CircleButtonComponent_component_frame_height, -1.0f);
        if (dimension2 != -1) {
            getLayoutParams(this.frame).height = dimension2;
        }
        setBadgeText(a.getString(c4i0.CircleButtonComponent_component_circle_button_badge_text));
        ColorStateList colorStateList = a.getColorStateList(c4i0.CircleButtonComponent_component_circle_button_badge_color);
        if (colorStateList != null) {
            this.textBadge.setBackgroundTintList(colorStateList);
        }
        setShadowBackground();
    }

    private final float getContainerScaleFactor() {
        return this.container.getMeasuredWidth() / getLayoutParams(this.container).width;
    }

    private final FrameLayout.LayoutParams getLayoutParams(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    private final void layoutBadge(int left, int right) {
        int measuredWidth = this.textBadge.getMeasuredWidth();
        int measuredHeight = this.textBadge.getMeasuredHeight();
        int measuredWidth2 = ((this.container.getMeasuredWidth() / 2) + ((right - left) / 2)) - measuredWidth;
        int top = this.container.getTop();
        this.textBadge.layout(measuredWidth2, top, measuredWidth + measuredWidth2, measuredHeight + top);
    }

    private final void layoutContainer(int left, int right) {
        int measuredWidth = this.container.getMeasuredWidth();
        int i = ((right - left) - measuredWidth) / 2;
        int containerScaleFactor = i - ((int) (getLayoutParams(this.container).bottomMargin * getContainerScaleFactor()));
        this.container.layout(i, containerScaleFactor, i + measuredWidth, measuredWidth + containerScaleFactor);
    }

    private final void layoutFrame(int left, int top, int right, float scaleFactor) {
        int measuredWidth = this.frame.getMeasuredWidth();
        int i = ((right - left) - measuredWidth) / 2;
        int i2 = top + ((int) (getLayoutParams(this.frame).topMargin * scaleFactor));
        this.frame.layout(i, i2, i + measuredWidth, measuredWidth + i2);
    }

    private final void layoutText(int left, int top, int right) {
        int measuredWidth = ((right - left) - this.titleView.getMeasuredWidth()) / 2;
        int r = top + ((int) (tje.r(mrg0.circle_button_internal_padding, getContext()) * getContainerScaleFactor()));
        AutoLetterSpacingTextView autoLetterSpacingTextView = this.titleView;
        autoLetterSpacingTextView.layout(measuredWidth, r, autoLetterSpacingTextView.getMeasuredWidth() + measuredWidth, this.titleView.getMeasuredHeight() + r);
    }

    private final void measureBadge(float scaleFactor) {
        int i = (int) (this.textBadge.getLayoutParams().height * scaleFactor);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int makeMeasureSpec2 = (this.textBadge.getText() == null || this.textBadge.getText().length() != 1) ? View.MeasureSpec.makeMeasureSpec(this.container.getMeasuredWidth(), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.textBadge.setTextSize(0, tje.u(12, getContext()) * scaleFactor);
        this.textBadge.measure(makeMeasureSpec2, makeMeasureSpec);
    }

    private final void measureContainer(float scaleFactor, int frameWidth) {
        int i = getLayoutParams(this.container).width;
        if (scaleFactor < 1.0f) {
            i = Math.min(frameWidth - tje.r(mrg0.go_design_m_space, getContext()), i);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.container.measure(makeMeasureSpec, makeMeasureSpec);
    }

    private final void measureFrame(float scaleFactor) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (getLayoutParams(this.frame).width * scaleFactor), 1073741824);
        this.frame.measure(makeMeasureSpec, makeMeasureSpec);
    }

    private final void measureTitle(int widthSpec) {
        this.titleView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthSpec), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private final void resetView() {
        this.textBadge.setTextSize(0, tje.u(12, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$0(CircleButtonComponent circleButtonComponent, Integer num) {
        circleButtonComponent.setTitleColor(ru.yandex.taxi.design.utils.c.a(num.intValue(), circleButtonComponent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$1(CircleButtonComponent circleButtonComponent, Integer num) {
        circleButtonComponent.textBadge.setTextColor(circleButtonComponent.getContext().getColor(num.intValue()));
    }

    private final void setImportantForAccessibilityWithChildren(ViewGroup viewGroup, int mode) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setImportantForAccessibility(mode);
            if (childAt instanceof ViewGroup) {
                setImportantForAccessibilityWithChildren((ViewGroup) childAt, mode);
            }
        }
    }

    private final void setShadowBackground() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(xng0.component_circle_button_shadow, typedValue, true);
        Drawable drawable = getContext().getDrawable(typedValue.resourceId);
        if (drawable == null) {
            return;
        }
        Drawable mutate = drawable.mutate();
        GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
        if (gradientDrawable == null) {
            return;
        }
        boolean z = this.enableShadow;
        FrameLayout frameLayout = this.frame;
        if (!z) {
            frameLayout.setBackground(null);
        } else {
            gradientDrawable.setGradientRadius(frameLayout.getMeasuredWidth() / getShadowCropFactor());
            this.frame.setBackground(gradientDrawable);
        }
    }

    private final void updateDrawableForEmptyBadge() {
        Drawable mutate = tje.y(dzg0.bg_notification_badge, getContext()).mutate();
        mutate.setColorFilter(getContext().getColor(mqg0.component_red_normal), PorterDuff.Mode.SRC_ATOP);
        this.textBadge.setBackground(mutate);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        Object tag = getTag(ACTION_TITLE_ATTR_TAG_ID);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setTitleColor(qje.t(num.intValue(), getContext()));
        }
        Object tag2 = getTag(ACTION_BADGE_TEXT_ATTR_TAG_ID);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            this.textBadge.setTextColor(qje.t(num2.intValue(), getContext()));
        }
        CharSequence text = this.textBadge.getText();
        boolean z = text == null || text.toString().length() == 0;
        if (!z && evu0.k0(text.toString()).toString().length() == 0) {
            Drawable mutate = tje.y(dzg0.bg_notification_badge, getContext()).mutate();
            mutate.setColorFilter(getContext().getColor(mqg0.component_red_normal), PorterDuff.Mode.SRC_ATOP);
            this.textBadge.setBackground(mutate);
        } else if (!z) {
            this.textBadge.setBackground(vng.t(dzg0.bg_notification_badge, getContext()));
        }
        setShadowBackground();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public void enableShadow() {
        this.enableShadow = true;
        this.frame.setBackground(null);
    }

    public final CharSequence getBadgeText() {
        return this.textBadge.getText();
    }

    public final boolean getEnableShadow() {
        return this.enableShadow;
    }

    public abstract int getLayoutResource();

    public float getShadowCropFactor() {
        return 2.0f;
    }

    public final AutoLetterSpacingTextView getTitleView() {
        return this.titleView;
    }

    public void hide() {
        setVisibility(8);
    }

    public final void hideBadgeText() {
        this.textBadge.setVisibility(8);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        float f = (right - left) / getLayoutParams(this.frame).width;
        if (f >= 1.0f) {
            super.onLayout(changed, left, top, right, bottom);
            layoutBadge(left, right);
        } else {
            layoutFrame(left, top, right, f);
            layoutContainer(left, right);
            layoutText(left, this.container.getBottom(), right);
            layoutBadge(left, right);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        resetView();
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        float size = View.MeasureSpec.getSize(widthMeasureSpec) / getLayoutParams(this.frame).width;
        if (size >= 1.0f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        measureFrame(size);
        measureContainer(size, this.frame.getMeasuredWidth());
        measureTitle(widthMeasureSpec);
        measureBadge(size);
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((((int) (tje.r(mrg0.circle_button_internal_padding, getContext()) * getContainerScaleFactor())) * 2) + this.container.getMeasuredHeight() + this.titleView.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        setShadowBackground();
    }

    public void resolveThemeAttrs(AttributeSet attrs, TypedArray attributes) {
        if (attrs == null) {
            setTitleColorAttr(xng0.textMinor);
            setBadgeTextColorAttr(xng0.textMain);
            return;
        }
        int i = c4i0.CircleButtonComponent_component_circle_title_color;
        int i2 = xng0.textMinor;
        final int i3 = 0;
        Consumer consumer = new Consumer(this) { // from class: htb
            public final /* synthetic */ CircleButtonComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i4 = i3;
                CircleButtonComponent circleButtonComponent = this.b;
                Integer num = (Integer) obj;
                switch (i4) {
                    case 0:
                        circleButtonComponent.setTitleColorAttr(num.intValue());
                        break;
                    case 1:
                        CircleButtonComponent.resolveThemeAttrs$lambda$0(circleButtonComponent, num);
                        break;
                    case 2:
                        circleButtonComponent.setBadgeTextColorAttr(num.intValue());
                        break;
                    default:
                        CircleButtonComponent.resolveThemeAttrs$lambda$1(circleButtonComponent, num);
                        break;
                }
            }
        };
        final int i4 = 1;
        qje.S(attrs, attributes, "component_circle_title_color", i, i2, consumer, new Consumer(this) { // from class: htb
            public final /* synthetic */ CircleButtonComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i4;
                CircleButtonComponent circleButtonComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        circleButtonComponent.setTitleColorAttr(num.intValue());
                        break;
                    case 1:
                        CircleButtonComponent.resolveThemeAttrs$lambda$0(circleButtonComponent, num);
                        break;
                    case 2:
                        circleButtonComponent.setBadgeTextColorAttr(num.intValue());
                        break;
                    default:
                        CircleButtonComponent.resolveThemeAttrs$lambda$1(circleButtonComponent, num);
                        break;
                }
            }
        });
        int i5 = c4i0.CircleButtonComponent_component_circle_button_badge_text_color;
        int i6 = xng0.textMain;
        final int i7 = 2;
        Consumer consumer2 = new Consumer(this) { // from class: htb
            public final /* synthetic */ CircleButtonComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i7;
                CircleButtonComponent circleButtonComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        circleButtonComponent.setTitleColorAttr(num.intValue());
                        break;
                    case 1:
                        CircleButtonComponent.resolveThemeAttrs$lambda$0(circleButtonComponent, num);
                        break;
                    case 2:
                        circleButtonComponent.setBadgeTextColorAttr(num.intValue());
                        break;
                    default:
                        CircleButtonComponent.resolveThemeAttrs$lambda$1(circleButtonComponent, num);
                        break;
                }
            }
        };
        final int i8 = 3;
        qje.S(attrs, attributes, "component_circle_button_badge_text_color", i5, i6, consumer2, new Consumer(this) { // from class: htb
            public final /* synthetic */ CircleButtonComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i8;
                CircleButtonComponent circleButtonComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        circleButtonComponent.setTitleColorAttr(num.intValue());
                        break;
                    case 1:
                        CircleButtonComponent.resolveThemeAttrs$lambda$0(circleButtonComponent, num);
                        break;
                    case 2:
                        circleButtonComponent.setBadgeTextColorAttr(num.intValue());
                        break;
                    default:
                        CircleButtonComponent.resolveThemeAttrs$lambda$1(circleButtonComponent, num);
                        break;
                }
            }
        });
    }

    public final void setBadgeBackgroundColor(int color) {
        this.textBadge.setBackgroundTintList(ColorStateList.valueOf(color));
    }

    public final void setBadgeContentDescription(String text) {
        this.textBadge.setContentDescription(text);
    }

    public void setBadgeText(String text) {
        boolean isEmpty = TextUtils.isEmpty(text);
        RobotoTextView robotoTextView = this.textBadge;
        if (isEmpty) {
            robotoTextView.setVisibility(8);
            return;
        }
        robotoTextView.setVisibility(0);
        if (text == null) {
            text = "";
        }
        if (text.length() > 5) {
            text = text.substring(0, 5);
        }
        this.textBadge.setText(text);
        if (text.length() > 1) {
            int u = tje.u(4, getContext());
            xw31.I(this.textBadge, Integer.valueOf(u), null, Integer.valueOf(u), null);
        } else {
            xw31.G(0, this.textBadge);
        }
        if (evu0.k0(text).toString().length() == 0) {
            updateDrawableForEmptyBadge();
        }
    }

    public final void setBadgeTextColor(int color) {
        this.textBadge.setTextColor(color);
    }

    public final void setBadgeTextColorAttr(int attr) {
        setTag(ACTION_BADGE_TEXT_ATTR_TAG_ID, Integer.valueOf(attr));
        this.textBadge.setTextColor(qje.t(attr, getContext()));
    }

    public void setDebounceClickListener(Runnable listener) {
        if (listener == null) {
            setOnClickListener(null);
            setClickable(false);
        } else {
            Object context = getContext();
            setOnClickListener(new DebounceClickListener(context instanceof fl40 ? ((fl40) context).sharedMultiClickHandler() : new dl40(0), listener));
        }
    }

    public final void setEnableShadow(boolean z) {
        this.enableShadow = z;
    }

    @Override // android.view.View
    public void setImportantForAccessibility(int mode) {
        super.setImportantForAccessibility(mode);
        setImportantForAccessibilityWithChildren(this, mode);
    }

    public void setTitle(CharSequence text) {
        if (TextUtils.isEmpty(text)) {
            this.titleView.setVisibility(8);
            return;
        }
        if (this.titleAutofitEnabled) {
            int max = Math.max(1, Math.min(this.titleView.getMaxLines(), TextUtils.split(evu0.k0(String.valueOf(text)).toString(), " ").length));
            ru.yandex.taxi.widget.b bVar = this.autofitHelper;
            if (bVar.d != max) {
                bVar.d = max;
                bVar.a();
            }
        }
        this.titleView.setText(text);
        this.titleView.setVisibility(0);
    }

    public final void setTitleAutofitEnabled(boolean enabled) {
        this.titleAutofitEnabled = enabled;
        this.autofitHelper.b(enabled);
    }

    public void setTitleColor(int color) {
        this.titleView.setTextColor(color);
    }

    public final void setTitleColorAttr(int attr) {
        setTag(ACTION_TITLE_ATTR_TAG_ID, Integer.valueOf(attr));
        setTitleColor(qje.t(attr, getContext()));
    }

    public void setTitleMaxLines(int lines) {
        this.titleView.setMaxLines(lines);
    }

    public final void setTitle(int resId) {
        setTitle(getResources().getString(resId));
    }

    public CircleButtonComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CircleButtonComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public CircleButtonComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ CircleButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? xng0.circleButtonComponentStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
