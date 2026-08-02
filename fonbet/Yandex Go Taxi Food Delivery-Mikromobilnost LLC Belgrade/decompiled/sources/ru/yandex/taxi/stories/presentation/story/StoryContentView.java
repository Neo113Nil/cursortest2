package ru.yandex.taxi.stories.presentation.story;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.LineHeightSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.arx;
import defpackage.bmu0;
import defpackage.chb1;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.gqu0;
import defpackage.ht4;
import defpackage.kdh0;
import defpackage.kou0;
import defpackage.kyk0;
import defpackage.lou0;
import defpackage.lrg0;
import defpackage.m810;
import defpackage.mou0;
import defpackage.mqg0;
import defpackage.mw0;
import defpackage.mxp0;
import defpackage.myk0;
import defpackage.noh;
import defpackage.nou0;
import defpackage.nph0;
import defpackage.nsz;
import defpackage.oou0;
import defpackage.owd0;
import defpackage.p9t0;
import defpackage.pav;
import defpackage.pdc;
import defpackage.pou0;
import defpackage.pph0;
import defpackage.ptc;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.qbv;
import defpackage.qje;
import defpackage.rp31;
import defpackage.scc;
import defpackage.tje;
import defpackage.tpt0;
import defpackage.uh6;
import defpackage.w1i0;
import defpackage.w511;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xou0;
import defpackage.xw31;
import defpackage.ykn0;
import defpackage.zxs0;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.communications.api.dto.q0;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u008d\u00012\u00020\u0001:\u0007\u008e\u0001\u001e\u008f\u0001\u0090\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020*2\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u00102J\r\u00105\u001a\u00020\u0012¢\u0006\u0004\b5\u0010\u0016J\r\u00106\u001a\u00020\u0012¢\u0006\u0004\b6\u0010\u0016J\u001d\u00109\u001a\u00020\u00122\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\"¢\u0006\u0004\b9\u0010:J/\u0010?\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0014¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00122\u0006\u0010B\u001a\u00020AH\u0014¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00122\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bL\u0010\u001bJ\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00122\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ'\u0010W\u001a\u00020\u00122\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020*H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020*2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020*2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b[\u0010ZJ\u0019\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b]\u0010^J\u0019\u0010_\u001a\u0004\u0018\u00010H2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010c\u001a\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010xR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0091\u0001"}, d2 = {"Lru/yandex/taxi/stories/presentation/story/StoryContentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpav;", "imageLoader", "Lru/yandex/taxi/widget/d;", "animationLoader", "Lpdc;", "colorConverter", "Lptc;", "communicationsFontPropertiesProvider", "Lzy11;", "initDependencies", "(Lpav;Lru/yandex/taxi/widget/d;Lpdc;Lptc;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lxou0;", "storyMediaInfo", "setData", "(Lxou0;)V", "setDataWithoutButtons$stories", "setDataWithoutButtons", "Loou0;", "listener", "setListener", "(Loou0;)V", "", "translationY", "", "duration", "translateContent", "(FJ)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "canInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "direction", "canScrollContent", "(I)Z", "dist", "scrollContent", "(I)V", "velocity", "flingContent", "pause", "resume", "radiusX", "radiusY", "setCornerRadius", "(FF)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "view", "copyMedia", "(Lru/yandex/taxi/stories/presentation/story/StoryContentView;)V", "", "contentDescription", "updateContentAccessibility", "(Ljava/lang/String;)V", "setupLayout", "mediaContentAvailableHeight", "()I", "Lru/yandex/taxi/communications/api/dto/StoryWidgets$c;", "link", "setupLink", "(Lru/yandex/taxi/communications/api/dto/StoryWidgets$c;)V", "Lgqu0;", "actionButtonInfo", "removeTopMargin", "isLast", "addActionButton", "(Lgqu0;ZZ)V", "buttonHasCopyAction", "(Lgqu0;)Z", "buttonHasSaveBenefitAction", "", "createTextForSaveBenefitActionButton", "(Lgqu0;)Ljava/lang/CharSequence;", "createTextForCopyActionButton", "(Lgqu0;)Ljava/lang/String;", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "buttonsContainer", "getButtonsContainer$stories", "()Landroid/view/ViewGroup;", "Landroid/widget/LinearLayout;", "textMediaContainer", "Landroid/widget/LinearLayout;", "Landroid/widget/ScrollView;", "textMediaScroll", "Landroid/widget/ScrollView;", "Lru/yandex/taxi/design/BadgeView;", "label", "Lru/yandex/taxi/design/BadgeView;", "Lru/yandex/taxi/design/ListHeaderComponent;", "titleView", "Lru/yandex/taxi/design/ListHeaderComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "descriptionView", "Lru/yandex/taxi/design/ListTextComponent;", "Landroid/view/View;", "mediaContainer", "Landroid/view/View;", "spaceView", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "Larx;", "labelUtils", "Larx;", "Lptc;", "Llou0;", "presenter", "Llou0;", "Loou0;", "resumed", "Z", "Lkyk0;", "roundedCornersViewHelper", "Lkyk0;", "Companion", "ru/yandex/taxi/stories/presentation/story/a", "nou0", "DescentSpan", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoryContentView extends FrameLayout {
    public static final nou0 Companion = new nou0();
    private static final oou0 EMPTY_LISTENER = new mou0();
    private static final float MIN_MEDIA_ZOOM = 0.5f;
    private final LottieAnimationView animationView;
    private final ViewGroup buttonsContainer;
    private ptc communicationsFontPropertiesProvider;
    private final ViewGroup content;
    private final ListTextComponent descriptionView;
    private final ImageView imageView;
    private final BadgeView label;
    private arx labelUtils;
    private oou0 listener;
    private final View mediaContainer;
    private lou0 presenter;
    private boolean resumed;
    private final kyk0 roundedCornersViewHelper;
    private final View spaceView;
    private final LinearLayout textMediaContainer;
    private final ScrollView textMediaScroll;
    private final ListHeaderComponent titleView;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/stories/presentation/story/StoryContentView$DescentSpan;", "Landroid/text/style/LineHeightSpan;", "", "descent", "<init>", "(I)V", "", "text", "start", "end", "spanstartv", "v", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "Lzy11;", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", CA20Status.STATUS_USER_I, "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DescentSpan implements LineHeightSpan {
        private final int descent;

        public DescentSpan(int i) {
            this.descent = i;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int v, Paint.FontMetricsInt fm) {
            if (fm != null) {
                int i = this.descent;
                fm.descent = i;
                fm.bottom = i;
            }
        }
    }

    public StoryContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, pph0.taxi_communications_story_content_view, true);
        int i2 = kdh0.story_content_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.content = (ViewGroup) ((View) rp31.d(this, i2));
        this.buttonsContainer = (ViewGroup) ((View) rp31.d(this, kdh0.story_buttons_container));
        this.textMediaContainer = (LinearLayout) ((View) rp31.d(this, kdh0.story_text_media_container));
        this.textMediaScroll = (ScrollView) ((View) rp31.d(this, kdh0.story_text_media_scroll));
        this.label = (BadgeView) ((View) rp31.d(this, kdh0.story_label));
        this.titleView = (ListHeaderComponent) ((View) rp31.d(this, kdh0.story_title));
        this.descriptionView = (ListTextComponent) ((View) rp31.d(this, kdh0.story_text));
        this.mediaContainer = (View) rp31.d(this, kdh0.story_media_view_container);
        this.spaceView = (View) rp31.d(this, kdh0.story_space);
        this.imageView = (ImageView) ((View) rp31.d(this, kdh0.story_content_image));
        this.animationView = (LottieAnimationView) ((View) rp31.d(this, kdh0.story_content_animation_view));
        this.listener = EMPTY_LISTENER;
        this.roundedCornersViewHelper = new myk0(this);
    }

    private final void addActionButton(gqu0 actionButtonInfo, boolean removeTopMargin, boolean isLast) {
        ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(getContext()).inflate(nph0.banner_action_button, this.buttonsContainer, false);
        if (removeTopMargin) {
            xw31.E(buttonComponent, null, 0, null, null);
        }
        buttonComponent.setText(buttonHasCopyAction(actionButtonInfo) ? createTextForCopyActionButton(actionButtonInfo) : buttonHasSaveBenefitAction(actionButtonInfo) ? createTextForSaveBenefitActionButton(actionButtonInfo) : actionButtonInfo.a);
        String str = actionButtonInfo.c;
        String str2 = actionButtonInfo.b;
        buttonComponent.setButtonTitleColor(q5z.Q(isLast ? qje.t(xng0.textOnControl, getContext()) : getContext().getColor(mqg0.component_gray_600), str));
        buttonComponent.setButtonBackground(q5z.Q(isLast ? qje.t(xng0.controlMain, getContext()) : getContext().getColor(mqg0.component_gray_50), str2));
        buttonComponent.setProgressing(actionButtonInfo.h);
        if (actionButtonInfo.g) {
            ru.yandex.taxi.design.utils.c.A(buttonComponent, 800L, new tpt0(10, this, actionButtonInfo));
        } else {
            buttonComponent.setClickable(false);
            if (str2 == null) {
                buttonComponent.setButtonBackground(getContext().getColor(mqg0.component_gray_175));
            } else {
                buttonComponent.setAlpha(0.5f);
            }
        }
        this.buttonsContainer.addView(buttonComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addActionButton$lambda$0(StoryContentView storyContentView, gqu0 gqu0Var) {
        storyContentView.listener.b(gqu0Var);
    }

    private final boolean buttonHasCopyAction(gqu0 actionButtonInfo) {
        q0 q0Var = actionButtonInfo.d;
        return q0Var != null && q0Var.a == StoryWidgets.ActionType.CLIPBOARD_COPY;
    }

    private final boolean buttonHasSaveBenefitAction(gqu0 actionButtonInfo) {
        q0 q0Var = actionButtonInfo.d;
        return q0Var != null && q0Var.a == StoryWidgets.ActionType.SAVE_BENEFIT;
    }

    private final String createTextForCopyActionButton(gqu0 actionButtonInfo) {
        StoryWidgets.a aVar;
        q0 q0Var = actionButtonInfo.d;
        if (q0Var == null || (aVar = q0Var.b) == null) {
            return null;
        }
        return actionButtonInfo.g ? new SpannableStringBuilder().append(aVar.d, new TextAppearanceSpan(getContext(), w1i0.PromoCodeButtonTitleTextAppearance), 33).append((CharSequence) "\n").append(aVar.e, new TextAppearanceSpan(getContext(), w1i0.PromoCodeButtonSubtitleTextAppearance), 33).toString() : aVar.g;
    }

    private final CharSequence createTextForSaveBenefitActionButton(gqu0 actionButtonInfo) {
        StoryWidgets.a aVar;
        String str = actionButtonInfo.a;
        if (str != null) {
            return str;
        }
        q0 q0Var = actionButtonInfo.d;
        SpannableStringBuilder spannableStringBuilder = null;
        if (q0Var != null && (aVar = q0Var.b) != null) {
            String str2 = aVar.e;
            String str3 = aVar.d;
            if ((str3 != null && !evu0.J(str3)) || (str2 != null && !evu0.J(str2))) {
                spannableStringBuilder = new SpannableStringBuilder();
                if (str3 != null && !evu0.J(str3)) {
                    spannableStringBuilder.append(str3, new TextAppearanceSpan(getContext(), w1i0.PromoCodeButtonTitleTextAppearance), 33);
                }
                if (str3 != null && !evu0.J(str3) && str2 != null && !evu0.J(str2)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                if (str2 != null && !evu0.J(str2)) {
                    spannableStringBuilder.append(str2, new TextAppearanceSpan(getContext(), w1i0.PromoCodeButtonSubtitleTextAppearance), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int mediaContentAvailableHeight() {
        return this.spaceView.getHeight() + this.mediaContainer.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDataWithoutButtons$lambda$0(StoryContentView storyContentView, List list) {
        storyContentView.listener.a(list);
    }

    private final void setupLayout(xou0 storyMediaInfo) {
        int i = pou0.a[storyMediaInfo.n.a.ordinal()];
        if (i == 1) {
            xw31.M(0, this.textMediaContainer);
            this.textMediaContainer.setGravity(48);
            this.spaceView.setVisibility(0);
            this.titleView.setMinimumHeight(0);
            return;
        }
        if (i == 2) {
            xw31.M(tje.u(96, getContext()), this.textMediaContainer);
            this.textMediaContainer.setGravity(48);
            this.spaceView.setVisibility(0);
            this.titleView.setMinimumHeight(tje.u(112, getContext()));
            return;
        }
        if (i == 3) {
            xw31.M(tje.u(96, getContext()), this.textMediaContainer);
            this.textMediaContainer.setGravity(80);
            this.spaceView.setVisibility(8);
            this.titleView.setMinimumHeight(tje.u(112, getContext()));
            return;
        }
        if (i != 4) {
            w511.b();
            return;
        }
        this.textMediaContainer.setGravity(17);
        this.spaceView.setVisibility(8);
        xw31.M(0, this.textMediaContainer);
        this.titleView.setMinimumHeight(0);
        this.titleView.setTitlesGravity(2);
        this.titleView.setTitleAlignment(1);
        this.titleView.setTitleTextSizePx(m810.b(tje.b0(getContext(), 140.0f)));
        this.titleView.setTitleMinTextSizePx(m810.b(tje.b0(getContext(), 18.0f)));
        this.titleView.setTitleSingleLine(true);
        this.titleView.autofitTitle(tje.b0(getContext(), 18.0f));
        this.descriptionView.setTextSizePx(m810.b(tje.b0(getContext(), 18.0f)));
        this.descriptionView.setTextAlignment(1);
    }

    private final void setupLink(StoryWidgets.c link) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitle(link.a);
        Context context = getContext();
        String str = link.b;
        int color = context.getColor(mqg0.component_black);
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    color = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                color = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        listItemComponent.setTitleTextColor(color);
        listItemComponent.setTrailMode(2);
        listItemComponent.setDividers(DividerPosition.TOP, DividerType.NORMAL);
        listItemComponent.setDebounceClickListener(new tpt0(8, this, link));
        this.buttonsContainer.addView(listItemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupLink$lambda$0(StoryContentView storyContentView, StoryWidgets.c cVar) {
        storyContentView.listener.c(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void translateContent$lambda$0(StoryContentView storyContentView, ValueAnimator valueAnimator) {
        xw31.I(storyContentView.content, null, (Integer) valueAnimator.getAnimatedValue(), null, null);
    }

    public final boolean canInterceptTouchEvent(MotionEvent event) {
        if (xw31.m(this.buttonsContainer, event) || xw31.m(this.label, event)) {
            return false;
        }
        return !xw31.m(this.descriptionView, event) || this.descriptionView.getMovementMethod() == null;
    }

    public final boolean canScrollContent(int direction) {
        return this.textMediaScroll.canScrollVertically(direction);
    }

    public final void copyMedia(StoryContentView view) {
        this.imageView.setImageDrawable(view.imageView.getDrawable());
        this.imageView.setVisibility(view.imageView.getVisibility());
        nsz composition = view.animationView.getComposition();
        if (composition != null) {
            this.animationView.setComposition(composition);
        }
        this.animationView.setVisibility(view.animationView.getVisibility());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        kyk0 kyk0Var = this.roundedCornersViewHelper;
        tpt0 tpt0Var = new tpt0(9, this, canvas);
        kyk0Var.getClass();
        kyk0Var.a(canvas, new mw0(4, tpt0Var));
    }

    public final void flingContent(int velocity) {
        this.textMediaScroll.fling(velocity);
    }

    /* renamed from: getButtonsContainer$stories, reason: from getter */
    public final ViewGroup getButtonsContainer() {
        return this.buttonsContainer;
    }

    public final void initDependencies(pav imageLoader, ru.yandex.taxi.widget.d animationLoader, pdc colorConverter, ptc communicationsFontPropertiesProvider) {
        this.labelUtils = new arx(colorConverter);
        this.communicationsFontPropertiesProvider = communicationsFontPropertiesProvider;
        this.presenter = new lou0(imageLoader, animationLoader);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lou0 lou0Var = this.presenter;
        if (lou0Var != null) {
            lou0Var.c(new a(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lou0 lou0Var = this.presenter;
        if (lou0Var != null) {
            lou0Var.d();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.roundedCornersViewHelper.d(w, h);
    }

    public final void pause() {
        this.resumed = false;
        this.animationView.pauseAnimation();
    }

    public final void resume() {
        this.resumed = true;
        chb1.g(this.animationView);
    }

    public final void scrollContent(int dist) {
        this.textMediaScroll.scrollBy(0, dist);
    }

    public final void setCornerRadius(float radiusX, float radiusY) {
        this.roundedCornersViewHelper.b(radiusX, radiusY);
    }

    public final void setData(xou0 storyMediaInfo) {
        boolean z;
        StoryWidgets storyWidgets = storyMediaInfo.c;
        setDataWithoutButtons$stories(storyMediaInfo);
        owd0 owd0Var = storyMediaInfo.q;
        if (owd0Var != null) {
            ViewGroup viewGroup = this.buttonsContainer;
            int b = m810.b(uh6.o(8.0f));
            ListTextComponent listTextComponent = new ListTextComponent(viewGroup.getContext(), null, 0, 6, null);
            listTextComponent.setTextSizePx(viewGroup.getResources().getDimensionPixelOffset(lrg0.legal_font_size));
            ht4.b(listTextComponent, owd0Var.a, owd0Var.b);
            listTextComponent.setTextPaddings(b, m810.b(tje.x(listTextComponent.getContext(), 12.0f)), b, m810.b(tje.x(listTextComponent.getContext(), 20.0f)));
            listTextComponent.setBackgroundColor(0);
            viewGroup.addView(listTextComponent);
        }
        StoryWidgets.c cVar = storyWidgets.d;
        if (cVar != null) {
            setupLink(cVar);
            z = false;
        } else {
            z = true;
        }
        List list = storyWidgets.a;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            addActionButton((gqu0) obj, z, i == scc.f(list));
            z = false;
            i = i2;
        }
        int childCount = this.buttonsContainer.getChildCount();
        ViewGroup viewGroup2 = this.buttonsContainer;
        if (childCount == 0) {
            viewGroup2.setVisibility(8);
        } else {
            viewGroup2.setVisibility(0);
        }
    }

    public final void setDataWithoutButtons$stories(xou0 storyMediaInfo) {
        noh nohVar;
        noh nohVar2;
        this.buttonsContainer.removeAllViews();
        arx arxVar = this.labelUtils;
        if (arxVar != null) {
            arxVar.a(this.label, storyMediaInfo.c.c, new ykn0(26, this));
        }
        lou0 lou0Var = this.presenter;
        if (lou0Var != null) {
            Story.g gVar = storyMediaInfo.n;
            zxs0 zxs0Var = storyMediaInfo.b;
            boolean z = gVar.a == Story.StoryLayoutType.NEW_YEAR_LAYOUT;
            zxs0 zxs0Var2 = storyMediaInfo.a;
            boolean J = evu0.J((CharSequence) zxs0Var.a);
            CharSequence charSequence = (CharSequence) zxs0Var2.a;
            ((kou0) lou0Var.a).b(charSequence, J, z);
            if (!evu0.J(charSequence) && (nohVar2 = (noh) zxs0Var2.b) != null) {
                tje.N(lou0Var.e(), null, null, new StoryContentPresenter$setupTitle$1(lou0Var, nohVar2, J, z, null), 3);
            }
            CharSequence charSequence2 = (CharSequence) zxs0Var.a;
            ((kou0) lou0Var.a).e(charSequence2);
            if (!evu0.J(charSequence2) && (nohVar = (noh) zxs0Var.b) != null) {
                tje.N(lou0Var.e(), null, null, new StoryContentPresenter$setupDescription$1(lou0Var, nohVar, null), 3);
            }
            pzt0 pzt0Var = lou0Var.g;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            pzt0 pzt0Var2 = lou0Var.h;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            Story.c cVar = storyMediaInfo.j;
            boolean z2 = storyMediaInfo.l;
            Object obj = lou0Var.a;
            if (cVar == null) {
                ((kou0) obj).d(true);
            } else {
                String str = cVar.b;
                Story.PageMediaType pageMediaType = cVar.a;
                ((kou0) obj).d(!z2);
                if (pageMediaType == Story.PageMediaType.IMAGE) {
                    if (!z2) {
                        ((kou0) lou0Var.a).a(null);
                    }
                    lou0Var.g = ru.yandex.taxi.utils.a.c(lou0Var.e.b().i(new qbv(str)), new p9t0(15, lou0Var), new bmu0(7), lou0Var.e());
                }
                if (pageMediaType == Story.PageMediaType.ANIMATION) {
                    ((kou0) lou0Var.a).c(str, cVar.c);
                    lou0Var.h = tje.N(lou0Var.e(), null, null, new StoryContentPresenter$setupMedia$3(lou0Var, cVar, null), 3);
                }
            }
        }
        setupLayout(storyMediaInfo);
    }

    public final void setListener(oou0 listener) {
        this.listener = listener;
    }

    public final void translateContent(float translationY, long duration) {
        cma1.f(this.content.getPaddingTop(), (int) translationY, new mxp0(17, this)).setDuration(duration).start();
    }

    public final void updateContentAccessibility(String contentDescription) {
        if (contentDescription == null || evu0.J(contentDescription)) {
            this.content.setImportantForAccessibility(2);
        } else {
            this.content.setImportantForAccessibility(1);
        }
        this.content.setContentDescription(contentDescription);
    }

    public StoryContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StoryContentView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ StoryContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
