package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.ce0;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.mzh0;
import defpackage.ndh0;
import defpackage.qje;
import defpackage.ssz0;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 u2\u00020\u0001:\u0001vB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010#\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010$\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\u0019J\u001d\u0010'\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u0015J\u0017\u0010,\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b4\u0010/J\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u0015J\u001f\u00108\u001a\u00020\f2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010:¢\u0006\u0004\b?\u0010=J\u0017\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\bF\u0010\u0019J\u0019\u0010G\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010\u0019J\u0019\u0010H\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010\u0019J\u0019\u0010I\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u0019J\u000f\u0010J\u001a\u00020\fH\u0002¢\u0006\u0004\bJ\u0010\u0015J\u000f\u0010K\u001a\u00020\fH\u0002¢\u0006\u0004\bK\u0010\u0015J\u0017\u0010L\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u0010\u0019J\u0019\u0010Q\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010\u0019J#\u0010T\u001a\u00020\f2\b\u0010S\u001a\u0004\u0018\u00010R2\b\b\u0001\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020RH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u00105\u001a\u00020\f2\u0006\u0010S\u001a\u00020YH\u0002¢\u0006\u0004\b5\u0010ZJ\u0019\u0010\\\u001a\u00020\f2\b\u0010[\u001a\u0004\u0018\u00010YH\u0002¢\u0006\u0004\b\\\u0010ZR\u0014\u0010]\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010^R\u0016\u0010`\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010hR\u0016\u0010j\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bj\u0010^R\u0016\u0010k\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010^R\u0016\u0010l\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010^R\u0018\u0010m\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010aR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010pR\u0016\u0010q\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010aR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010rR\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010s¨\u0006w"}, d2 = {"Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", BackendConfig.Restrictions.ENABLED, "setAccentBackgroundEnabled", "(Z)V", "setClickPassesThroughEnabled", "enableNavigationButton", "()V", "disableNavigationButton", "enableCloseButton", "position", "(I)V", "disableCloseButton", "Ljava/lang/Runnable;", "onNavigationClick", "setOnNavigationClickListener", "(Ljava/lang/Runnable;)V", "onCloseClick", "setOnCloseClickListener", "color", "setIconsColor", "setNavigationIconColor", "setCloseIconColor", RemoteBioParameters.X, RemoteBioParameters.Y, "isPointInsideCloseButton", "(II)Z", "invalidateComponent", "Lru/yandex/taxi/design/DotsIndicatorComponent;", "dotsIndicator", "setDotsIndicatorComponent", "(Lru/yandex/taxi/design/DotsIndicatorComponent;)Lru/yandex/taxi/design/ToolbarComponent;", "setDotsIndicatorEnabled", "(Z)Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/StoryProgressComponent;", "storyProgressComponent", "setStoryProgressComponent", "(Lru/yandex/taxi/design/StoryProgressComponent;)Lru/yandex/taxi/design/ToolbarComponent;", "setStoryProgressEnabled", "requestAccessibilityFocus", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "navigationButtonAnalyticsName", "setNavigationButtonAnalyticsName", "(Ljava/lang/String;)V", "backButtonAnalyticsName", "setCloseButtonAnalyticsName", "Landroid/content/res/TypedArray;", "attributes", "initAttributes", "(Landroid/content/res/TypedArray;)V", "resolveThemeAttrs", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "setToolbarBackgroundColor", "setToolbarBackgroundColorHex", "setToolbarAccentBackgroundColor", "setToolbarAccentBackgroundColorHex", "enableAccentBackground", "disableAccentBackground", "initNavigationButton", "(Landroid/content/Context;)V", "initCloseButton", "(Landroid/content/Context;I)V", "setNavigationIconColorAttr", "setCloseIconColorAttr", "Landroid/widget/ImageView;", "view", "setNavigationIconsColorOnView", "(Landroid/widget/ImageView;I)V", "imageView", "isAccessibilityFocusableImageView", "(Landroid/widget/ImageView;)Z", "Landroid/view/View;", "(Landroid/view/View;)V", "topView", "setTopView", "NAVIGATION_TAG", CA20Status.STATUS_USER_I, "CLOSE_ICON_TAG", "accentBackgroundEnabled", "Z", "Lru/yandex/taxi/design/ClickableImageView;", "navigationButton", "Lru/yandex/taxi/design/ClickableImageView;", "closeButton", "Lkdc;", "toolbarBackgroundColor", "Lkdc;", "toolbarAccentBackgroundColor", "navigationIconColor", "closeIconColor", "navigationIcon", "dotsIndicatorComponent", "Lru/yandex/taxi/design/DotsIndicatorComponent;", "dotsIndicatorEnabled", "Lru/yandex/taxi/design/StoryProgressComponent;", "storyProgressEnabled", "Landroid/view/View;", "Ljava/lang/String;", "closeButtonAnalyticsName", "Companion", "ssz0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ToolbarComponent extends ListItemComponent {
    public static final int POSITION_END = 1;
    public static final int POSITION_START = 0;
    private final int CLOSE_ICON_TAG;
    private final int NAVIGATION_TAG;
    private boolean accentBackgroundEnabled;
    private ClickableImageView closeButton;
    private String closeButtonAnalyticsName;
    private int closeIconColor;
    private DotsIndicatorComponent dotsIndicatorComponent;
    private boolean dotsIndicatorEnabled;
    private ClickableImageView navigationButton;
    private String navigationButtonAnalyticsName;
    private int navigationIcon;
    private int navigationIconColor;
    private StoryProgressComponent storyProgressComponent;
    private boolean storyProgressEnabled;
    private kdc toolbarAccentBackgroundColor;
    private kdc toolbarBackgroundColor;
    private View topView;
    public static final ssz0 Companion = new ssz0();
    private static final int backgroundColorAttr = xng0.component_toolbar_background_color;
    private static final int accentBackgroundColorAttr = xng0.component_toolbar_background_accent_color;

    public ToolbarComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NAVIGATION_TAG = ndh0.toolbar_navigation_id;
        this.CLOSE_ICON_TAG = ndh0.toolbar_close_button_id;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.ToolbarComponent, i, 0);
        try {
            initAttributes(obtainStyledAttributes);
            resolveThemeAttrs(attributeSet, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            setClickPassesThroughEnabled(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void disableAccentBackground() {
        if (this.noBackground) {
            return;
        }
        setBackgroundColor(this.toolbarBackgroundColor);
    }

    private final void enableAccentBackground() {
        if (this.noBackground) {
            return;
        }
        setBackgroundColor(this.toolbarAccentBackgroundColor);
    }

    private final void initAttributes(TypedArray attributes) {
        this.navigationIcon = attributes.getResourceId(c4i0.ToolbarComponent_component_toolbar_navigation_icon, dzg0.ic_arrow_back_24dp);
        if (attributes.getBoolean(c4i0.ToolbarComponent_component_show_navigation_button, true)) {
            initNavigationButton(getContext());
        }
        if (attributes.getBoolean(c4i0.ToolbarComponent_component_show_close_button, false)) {
            initCloseButton(getContext(), attributes.getInteger(c4i0.ToolbarComponent_component_close_button_position, 1));
        }
        this.accentBackgroundEnabled = attributes.getBoolean(c4i0.ToolbarComponent_component_toolbar_background_accent_enabled, false);
    }

    private final void initCloseButton(Context context, int position) {
        if (position == 0) {
            clearLeadView();
            setLeadImage(dzg0.ic_close);
            setLeadImageSize(tje.u(64, getContext()));
            ClickableImageView leadImageView = getLeadImageView();
            this.closeButton = leadImageView;
            if (leadImageView != null) {
                leadImageView.setAnalyticsButtonName(this.closeButtonAnalyticsName);
            }
        } else {
            setTrailImage(dzg0.ic_close);
            setTrailImageSize(tje.u(64, getContext()));
            ClickableImageView trailImageView = getTrailImageView();
            this.closeButton = trailImageView;
            if (trailImageView != null) {
                trailImageView.setAnalyticsButtonName(this.closeButtonAnalyticsName);
            }
        }
        ClickableImageView clickableImageView = this.closeButton;
        if (clickableImageView != null) {
            clickableImageView.setContentDescription(context.getString(mzh0.common_close));
        }
        ClickableImageView clickableImageView2 = this.closeButton;
        if (clickableImageView2 != null) {
            clickableImageView2.setId(ndh0.close);
        }
        setNavigationIconsColorOnView(this.closeButton, this.closeIconColor);
    }

    private final void initNavigationButton(Context context) {
        clearLeadView();
        setLeadImage(this.navigationIcon);
        setLeadImageSize(tje.u(64, getContext()));
        ClickableImageView leadImageView = getLeadImageView();
        this.navigationButton = leadImageView;
        if (leadImageView != null) {
            leadImageView.setContentDescription(context.getString(mzh0.common_back));
        }
        ClickableImageView clickableImageView = this.navigationButton;
        if (clickableImageView != null) {
            clickableImageView.setId(ndh0.back);
        }
        ClickableImageView clickableImageView2 = this.navigationButton;
        if (clickableImageView2 != null) {
            clickableImageView2.setAnalyticsButtonName(this.navigationButtonAnalyticsName);
        }
        setNavigationIconsColorOnView(this.navigationButton, this.navigationIconColor);
    }

    private final boolean isAccessibilityFocusableImageView(ImageView imageView) {
        return (jl40.l(imageView, this.navigationButton) || jl40.l(imageView, this.closeButton)) && imageView.isEnabled() && imageView.getVisibility() == 0;
    }

    private final void resolveThemeAttrs(AttributeSet attrs, TypedArray attributes) {
        if (attrs == null) {
            setNavigationIconColorAttr(xng0.textMain);
            setCloseIconColorAttr(xng0.textMain);
            return;
        }
        int i = c4i0.ToolbarComponent_component_toolbar_navigation_icon_color;
        int i2 = xng0.textMain;
        final int i3 = 0;
        Consumer consumer = new Consumer(this) { // from class: rsz0
            public final /* synthetic */ ToolbarComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i4 = i3;
                ToolbarComponent toolbarComponent = this.b;
                Integer num = (Integer) obj;
                switch (i4) {
                    case 0:
                        toolbarComponent.setNavigationIconColorAttr(num.intValue());
                        break;
                    case 1:
                        ToolbarComponent.resolveThemeAttrs$lambda$0(toolbarComponent, num);
                        break;
                    case 2:
                        toolbarComponent.setCloseIconColorAttr(num.intValue());
                        break;
                    case 3:
                        ToolbarComponent.resolveThemeAttrs$lambda$1(toolbarComponent, num);
                        break;
                    case 4:
                        toolbarComponent.setToolbarBackgroundColor(num.intValue());
                        break;
                    case 5:
                        ToolbarComponent.resolveThemeAttrs$lambda$2(toolbarComponent, num);
                        break;
                    case 6:
                        toolbarComponent.setToolbarAccentBackgroundColor(num.intValue());
                        break;
                    default:
                        ToolbarComponent.resolveThemeAttrs$lambda$3(toolbarComponent, num);
                        break;
                }
            }
        };
        final int i4 = 1;
        qje.S(attrs, attributes, "component_toolbar_navigation_icon_color", i, i2, consumer, new Consumer(this) { // from class: rsz0
            public final /* synthetic */ ToolbarComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i4;
                ToolbarComponent toolbarComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        toolbarComponent.setNavigationIconColorAttr(num.intValue());
                        break;
                    case 1:
                        ToolbarComponent.resolveThemeAttrs$lambda$0(toolbarComponent, num);
                        break;
                    case 2:
                        toolbarComponent.setCloseIconColorAttr(num.intValue());
                        break;
                    case 3:
                        ToolbarComponent.resolveThemeAttrs$lambda$1(toolbarComponent, num);
                        break;
                    case 4:
                        toolbarComponent.setToolbarBackgroundColor(num.intValue());
                        break;
                    case 5:
                        ToolbarComponent.resolveThemeAttrs$lambda$2(toolbarComponent, num);
                        break;
                    case 6:
                        toolbarComponent.setToolbarAccentBackgroundColor(num.intValue());
                        break;
                    default:
                        ToolbarComponent.resolveThemeAttrs$lambda$3(toolbarComponent, num);
                        break;
                }
            }
        });
        int i5 = c4i0.ToolbarComponent_component_toolbar_close_icon_color;
        int i6 = xng0.textMain;
        final int i7 = 2;
        Consumer consumer2 = new Consumer(this) { // from class: rsz0
            public final /* synthetic */ ToolbarComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i7;
                ToolbarComponent toolbarComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        toolbarComponent.setNavigationIconColorAttr(num.intValue());
                        break;
                    case 1:
                        ToolbarComponent.resolveThemeAttrs$lambda$0(toolbarComponent, num);
                        break;
                    case 2:
                        toolbarComponent.setCloseIconColorAttr(num.intValue());
                        break;
                    case 3:
                        ToolbarComponent.resolveThemeAttrs$lambda$1(toolbarComponent, num);
                        break;
                    case 4:
                        toolbarComponent.setToolbarBackgroundColor(num.intValue());
                        break;
                    case 5:
                        ToolbarComponent.resolveThemeAttrs$lambda$2(toolbarComponent, num);
                        break;
                    case 6:
                        toolbarComponent.setToolbarAccentBackgroundColor(num.intValue());
                        break;
                    default:
                        ToolbarComponent.resolveThemeAttrs$lambda$3(toolbarComponent, num);
                        break;
                }
            }
        };
        final int i8 = 3;
        qje.S(attrs, attributes, "component_toolbar_close_icon_color", i5, i6, consumer2, new Consumer(this) { // from class: rsz0
            public final /* synthetic */ ToolbarComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i8;
                ToolbarComponent toolbarComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        toolbarComponent.setNavigationIconColorAttr(num.intValue());
                        break;
                    case 1:
                        ToolbarComponent.resolveThemeAttrs$lambda$0(toolbarComponent, num);
                        break;
                    case 2:
                        toolbarComponent.setCloseIconColorAttr(num.intValue());
                        break;
                    case 3:
                        ToolbarComponent.resolveThemeAttrs$lambda$1(toolbarComponent, num);
                        break;
                    case 4:
                        toolbarComponent.setToolbarBackgroundColor(num.intValue());
                        break;
                    case 5:
                        ToolbarComponent.resolveThemeAttrs$lambda$2(toolbarComponent, num);
                        break;
                    case 6:
                        toolbarComponent.setToolbarAccentBackgroundColor(num.intValue());
                        break;
                    default:
                        ToolbarComponent.resolveThemeAttrs$lambda$3(toolbarComponent, num);
                        break;
                }
            }
        });
        final int i9 = 4;
        final int i10 = 5;
        qje.R(attrs, "component_toolbar_background_color", backgroundColorAttr, new Consumer(this) { // from class: rsz0
            public final /* synthetic */ ToolbarComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i9;
                ToolbarComponent toolbarComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        toolbarComponent.setNavigationIconColorAttr(num.intValue());
                        break;
                    case 1:
                        ToolbarComponent.resolveThemeAttrs$lambda$0(toolbarComponent, num);
                        break;
                    case 2:
                        toolbarComponent.setCloseIconColorAttr(num.intValue());
                        break;
                    case 3:
                        ToolbarComponent.resolveThemeAttrs$lambda$1(toolbarComponent, num);
                        break;
                    case 4:
                        toolbarComponent.setToolbarBackgroundColor(num.intValue());
                        break;
                    case 5:
                        ToolbarComponent.resolveThemeAttrs$lambda$2(toolbarComponent, num);
                        break;
                    case 6:
                        toolbarComponent.setToolbarAccentBackgroundColor(num.intValue());
                        break;
                    default:
                        ToolbarComponent.resolveThemeAttrs$lambda$3(toolbarComponent, num);
                        break;
                }
            }
        }, new Consumer(this) { // from class: rsz0
            public final /* synthetic */ ToolbarComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i10;
                ToolbarComponent toolbarComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        toolbarComponent.setNavigationIconColorAttr(num.intValue());
                        break;
                    case 1:
                        ToolbarComponent.resolveThemeAttrs$lambda$0(toolbarComponent, num);
                        break;
                    case 2:
                        toolbarComponent.setCloseIconColorAttr(num.intValue());
                        break;
                    case 3:
                        ToolbarComponent.resolveThemeAttrs$lambda$1(toolbarComponent, num);
                        break;
                    case 4:
                        toolbarComponent.setToolbarBackgroundColor(num.intValue());
                        break;
                    case 5:
                        ToolbarComponent.resolveThemeAttrs$lambda$2(toolbarComponent, num);
                        break;
                    case 6:
                        toolbarComponent.setToolbarAccentBackgroundColor(num.intValue());
                        break;
                    default:
                        ToolbarComponent.resolveThemeAttrs$lambda$3(toolbarComponent, num);
                        break;
                }
            }
        });
        final int i11 = 6;
        final int i12 = 7;
        qje.R(attrs, "component_toolbar_background_accent_color", accentBackgroundColorAttr, new Consumer(this) { // from class: rsz0
            public final /* synthetic */ ToolbarComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i11;
                ToolbarComponent toolbarComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        toolbarComponent.setNavigationIconColorAttr(num.intValue());
                        break;
                    case 1:
                        ToolbarComponent.resolveThemeAttrs$lambda$0(toolbarComponent, num);
                        break;
                    case 2:
                        toolbarComponent.setCloseIconColorAttr(num.intValue());
                        break;
                    case 3:
                        ToolbarComponent.resolveThemeAttrs$lambda$1(toolbarComponent, num);
                        break;
                    case 4:
                        toolbarComponent.setToolbarBackgroundColor(num.intValue());
                        break;
                    case 5:
                        ToolbarComponent.resolveThemeAttrs$lambda$2(toolbarComponent, num);
                        break;
                    case 6:
                        toolbarComponent.setToolbarAccentBackgroundColor(num.intValue());
                        break;
                    default:
                        ToolbarComponent.resolveThemeAttrs$lambda$3(toolbarComponent, num);
                        break;
                }
            }
        }, new Consumer(this) { // from class: rsz0
            public final /* synthetic */ ToolbarComponent b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i42 = i12;
                ToolbarComponent toolbarComponent = this.b;
                Integer num = (Integer) obj;
                switch (i42) {
                    case 0:
                        toolbarComponent.setNavigationIconColorAttr(num.intValue());
                        break;
                    case 1:
                        ToolbarComponent.resolveThemeAttrs$lambda$0(toolbarComponent, num);
                        break;
                    case 2:
                        toolbarComponent.setCloseIconColorAttr(num.intValue());
                        break;
                    case 3:
                        ToolbarComponent.resolveThemeAttrs$lambda$1(toolbarComponent, num);
                        break;
                    case 4:
                        toolbarComponent.setToolbarBackgroundColor(num.intValue());
                        break;
                    case 5:
                        ToolbarComponent.resolveThemeAttrs$lambda$2(toolbarComponent, num);
                        break;
                    case 6:
                        toolbarComponent.setToolbarAccentBackgroundColor(num.intValue());
                        break;
                    default:
                        ToolbarComponent.resolveThemeAttrs$lambda$3(toolbarComponent, num);
                        break;
                }
            }
        });
        setAccentBackgroundEnabled(this.accentBackgroundEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$0(ToolbarComponent toolbarComponent, Integer num) {
        toolbarComponent.setNavigationIconColor(ru.yandex.taxi.design.utils.c.a(num.intValue(), toolbarComponent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$1(ToolbarComponent toolbarComponent, Integer num) {
        toolbarComponent.setCloseIconColor(ru.yandex.taxi.design.utils.c.a(num.intValue(), toolbarComponent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$2(ToolbarComponent toolbarComponent, Integer num) {
        toolbarComponent.setToolbarBackgroundColorHex(ru.yandex.taxi.design.utils.c.a(num.intValue(), toolbarComponent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemeAttrs$lambda$3(ToolbarComponent toolbarComponent, Integer num) {
        toolbarComponent.setToolbarAccentBackgroundColorHex(ru.yandex.taxi.design.utils.c.a(num.intValue(), toolbarComponent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCloseIconColorAttr(int color) {
        setTag(this.CLOSE_ICON_TAG, Integer.valueOf(color));
        setCloseIconColor(qje.t(color, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNavigationIconColorAttr(int color) {
        setTag(this.NAVIGATION_TAG, Integer.valueOf(color));
        setNavigationIconColor(qje.t(color, getContext()));
    }

    private final void setNavigationIconsColorOnView(ImageView view, int color) {
        if (view != null) {
            view.setImageTintList(ColorStateList.valueOf(color));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToolbarAccentBackgroundColor(int color) {
        this.toolbarAccentBackgroundColor = new bdc(color);
    }

    private final void setToolbarAccentBackgroundColorHex(int color) {
        this.toolbarAccentBackgroundColor = new cdc(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setToolbarBackgroundColor(int color) {
        this.toolbarBackgroundColor = new bdc(color);
    }

    private final void setToolbarBackgroundColorHex(int color) {
        this.toolbarBackgroundColor = new cdc(color);
    }

    private final void setTopView(View topView) {
        if (jl40.l(topView, this.topView)) {
            return;
        }
        View view = this.topView;
        if (view != null) {
            removeView(view);
        }
        this.topView = topView;
        if (topView != null) {
            addView(topView);
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        Object tag = getTag(this.NAVIGATION_TAG);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setNavigationIconColorAttr(num.intValue());
        }
        Object tag2 = getTag(this.CLOSE_ICON_TAG);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            setCloseIconColorAttr(num2.intValue());
        }
    }

    public final void disableCloseButton() {
        ClickableImageView clickableImageView = this.closeButton;
        if (clickableImageView != null) {
            clickableImageView.setVisibility(4);
        }
        ClickableImageView clickableImageView2 = this.closeButton;
        if (clickableImageView2 != null) {
            clickableImageView2.setEnabled(false);
        }
    }

    public final void disableNavigationButton() {
        ClickableImageView clickableImageView = this.navigationButton;
        if (clickableImageView != null) {
            clickableImageView.setVisibility(4);
        }
        ClickableImageView clickableImageView2 = this.navigationButton;
        if (clickableImageView2 != null) {
            clickableImageView2.setEnabled(false);
        }
    }

    public final void enableCloseButton(int position) {
        initCloseButton(getContext(), position);
        ClickableImageView clickableImageView = this.closeButton;
        if (clickableImageView != null) {
            clickableImageView.setVisibility(0);
        }
        ClickableImageView clickableImageView2 = this.closeButton;
        if (clickableImageView2 != null) {
            clickableImageView2.setEnabled(true);
        }
    }

    public final void enableNavigationButton() {
        if (this.navigationButton == null) {
            initNavigationButton(getContext());
        }
        ClickableImageView clickableImageView = this.navigationButton;
        if (clickableImageView != null) {
            clickableImageView.setVisibility(0);
        }
        ClickableImageView clickableImageView2 = this.navigationButton;
        if (clickableImageView2 != null) {
            clickableImageView2.setEnabled(true);
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public void invalidateComponent() {
        StoryProgressComponent storyProgressComponent;
        DotsIndicatorComponent dotsIndicatorComponent;
        if (!this.dotsIndicatorEnabled || (dotsIndicatorComponent = this.dotsIndicatorComponent) == null) {
            setCustomCenterView(null);
        } else {
            setCustomCenterView(dotsIndicatorComponent);
        }
        if (!this.storyProgressEnabled || (storyProgressComponent = this.storyProgressComponent) == null) {
            setTopView(null);
        } else {
            setTopView(storyProgressComponent);
        }
        super.invalidateComponent();
    }

    public final boolean isPointInsideCloseButton(int x, int y) {
        ClickableImageView clickableImageView = this.closeButton;
        return clickableImageView != null && clickableImageView.isEnabled() && xw31.l(x, y, 0, clickableImageView);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View view = this.topView;
        if (view != null) {
            measureChildWithMargins(view, widthMeasureSpec, 0, heightMeasureSpec, 0);
        }
    }

    public final void requestAccessibilityFocus() {
        ClickableImageView leadImageView = getLeadImageView();
        ClickableImageView trailImageView = getTrailImageView();
        if (isAccessibilityFocusableImageView(leadImageView)) {
            requestAccessibilityFocus(leadImageView);
            return;
        }
        CharSequence text = title().getText();
        if (text != null && !evu0.J(text) && title().getVisibility() == 0) {
            requestAccessibilityFocus(title());
        } else if (isAccessibilityFocusableImageView(trailImageView)) {
            requestAccessibilityFocus(trailImageView);
        }
    }

    public final void setAccentBackgroundEnabled(boolean enabled) {
        this.accentBackgroundEnabled = enabled;
        if (enabled) {
            enableAccentBackground();
        } else {
            disableAccentBackground();
        }
    }

    public final void setClickPassesThroughEnabled(boolean enabled) {
        setClickable(!enabled);
    }

    public final void setCloseButtonAnalyticsName(String backButtonAnalyticsName) {
        this.closeButtonAnalyticsName = backButtonAnalyticsName;
        ClickableImageView clickableImageView = this.closeButton;
        if (clickableImageView != null) {
            clickableImageView.setAnalyticsButtonName(backButtonAnalyticsName);
        }
    }

    public final void setCloseIconColor(int color) {
        this.closeIconColor = color;
        setNavigationIconsColorOnView(this.closeButton, color);
    }

    public final ToolbarComponent setDotsIndicatorComponent(DotsIndicatorComponent dotsIndicator) {
        this.dotsIndicatorComponent = dotsIndicator;
        return this;
    }

    public final ToolbarComponent setDotsIndicatorEnabled(boolean enabled) {
        this.dotsIndicatorEnabled = enabled;
        return this;
    }

    public final void setIconsColor(int color) {
        setNavigationIconColor(color);
        setCloseIconColor(color);
    }

    public final void setNavigationButtonAnalyticsName(String navigationButtonAnalyticsName) {
        this.navigationButtonAnalyticsName = navigationButtonAnalyticsName;
        ClickableImageView clickableImageView = this.navigationButton;
        if (clickableImageView != null) {
            clickableImageView.setAnalyticsButtonName(navigationButtonAnalyticsName);
        }
    }

    public final void setNavigationIconColor(int color) {
        this.navigationIconColor = color;
        setNavigationIconsColorOnView(this.navigationButton, color);
    }

    public final void setOnCloseClickListener(Runnable onCloseClick) {
        ClickableImageView clickableImageView = this.closeButton;
        if (clickableImageView != null) {
            clickableImageView.setDebounceClickListener(onCloseClick);
        }
    }

    public final void setOnNavigationClickListener(Runnable onNavigationClick) {
        ClickableImageView clickableImageView = this.navigationButton;
        if (clickableImageView != null) {
            clickableImageView.setDebounceClickListener(onNavigationClick);
        }
    }

    public final ToolbarComponent setStoryProgressComponent(StoryProgressComponent storyProgressComponent) {
        this.storyProgressComponent = storyProgressComponent;
        return this;
    }

    public final ToolbarComponent setStoryProgressEnabled(boolean enabled) {
        this.storyProgressEnabled = enabled;
        return this;
    }

    public final void enableCloseButton() {
        enableCloseButton(1);
    }

    public ToolbarComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ToolbarComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ToolbarComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.toolbarComponentStyle : i);
    }

    private final void requestAccessibilityFocus(View view) {
        view.setFocusable(true);
        post(new ce0(view, 21));
    }
}
