package com.braze.ui.inappmessage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda13;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import bo.app.jg$$ExternalSyntheticLambda1;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda39;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 z2\u00020\u0001:\u0001zBe\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\u0019J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010\u0019J'\u0010.\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bH\u0010GR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u00109\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010KR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\bQ\u0010;\"\u0004\bR\u0010KR\"\u0010S\u001a\u00020)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bS\u0010U\"\u0004\bV\u0010,R$\u0010X\u001a\u0004\u0018\u00010W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010^\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u00109\u001a\u0004\b_\u0010;\"\u0004\b`\u0010KR>\u0010d\u001a\u001e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020b0aj\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020b`c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010j\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010q\u001a\u0004\u0018\u00010p8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010y¨\u0006{"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Landroid/view/View;", "inAppMessageView", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Landroid/view/animation/Animation;", "openingAnimation", "closingAnimation", "clickableInAppMessageView", "", "buttonViews", "closeButton", "<init>", "(Landroid/view/View;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)V", "Landroid/app/Activity;", "activity", "", "open", "(Landroid/app/Activity;)V", "close", "()V", "Landroid/view/ViewGroup;", "getParentViewGroup", "(Landroid/app/Activity;)Landroid/view/ViewGroup;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "(Lcom/braze/models/inappmessage/IInAppMessage;)Landroid/view/ViewGroup$LayoutParams;", "parentViewGroup", "addInAppMessageViewToViewGroup", "(Landroid/view/ViewGroup;Lcom/braze/models/inappmessage/IInAppMessage;Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;)V", "Landroid/view/View$OnClickListener;", "createClickListener", "()Landroid/view/View$OnClickListener;", "createButtonClickListeners", "createCloseInAppMessageClickListener", "addDismissRunnable", "", "opening", "setAndStartAnimation", "(Z)V", "closeInAppMessageView", "finalizeViewBeforeDisplay", "(Lcom/braze/models/inappmessage/IInAppMessage;Landroid/view/View;Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;)V", "Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "createDismissCallbacks", "()Lcom/braze/ui/inappmessage/listeners/SwipeDismissTouchListener$DismissCallbacks;", "Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "createTouchAwareListener", "()Lcom/braze/ui/inappmessage/listeners/TouchAwareSwipeDismissTouchListener$ITouchListener;", "Landroid/view/animation/Animation$AnimationListener;", "createAnimationListener", "(Z)Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/View;", "getInAppMessageView", "()Landroid/view/View;", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "getInAppMessageViewLifecycleListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "Landroid/view/animation/Animation;", "getOpeningAnimation", "()Landroid/view/animation/Animation;", "getClosingAnimation", "getClickableInAppMessageView", "setClickableInAppMessageView", "(Landroid/view/View;)V", "Ljava/util/List;", "getButtonViews", "()Ljava/util/List;", "setButtonViews", "(Ljava/util/List;)V", "getCloseButton", "setCloseButton", "isAnimatingClose", "Z", "()Z", "setAnimatingClose", "Ljava/lang/Runnable;", "dismissRunnable", "Ljava/lang/Runnable;", "getDismissRunnable", "()Ljava/lang/Runnable;", "setDismissRunnable", "(Ljava/lang/Runnable;)V", "previouslyFocusedView", "getPreviouslyFocusedView", "setPreviouslyFocusedView", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "viewAccessibilityFlagMap", "Ljava/util/HashMap;", "getViewAccessibilityFlagMap", "()Ljava/util/HashMap;", "setViewAccessibilityFlagMap", "(Ljava/util/HashMap;)V", "contentViewGroupParentLayout", "Landroid/view/ViewGroup;", "getContentViewGroupParentLayout", "()Landroid/view/ViewGroup;", "setContentViewGroupParentLayout", "(Landroid/view/ViewGroup;)V", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "getOnBackInvokedCallback", "()Landroid/window/OnBackInvokedCallback;", "setOnBackInvokedCallback", "(Landroid/window/OnBackInvokedCallback;)V", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedDispatcherFallbackCallback", "Landroidx/activity/OnBackPressedCallback;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<? extends View> buttonViews;
    private View clickableInAppMessageView;
    private View closeButton;
    private final Animation closingAnimation;
    private final BrazeConfigurationProvider configurationProvider;
    private ViewGroup contentViewGroupParentLayout;
    private Runnable dismissRunnable;
    private final IInAppMessage inAppMessage;
    private final View inAppMessageView;
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener;
    private boolean isAnimatingClose;
    private OnBackInvokedCallback onBackInvokedCallback;
    private OnBackPressedCallback onBackPressedDispatcherFallbackCallback;
    private final Animation openingAnimation;
    private View previouslyFocusedView;
    private HashMap<Integer, Integer> viewAccessibilityFlagMap;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<? extends View> list, View view3) {
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
        this.inAppMessageView = view;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageViewLifecycleListener = iInAppMessageViewLifecycleListener;
        this.configurationProvider = brazeConfigurationProvider;
        this.openingAnimation = animation;
        this.closingAnimation = animation2;
        this.clickableInAppMessageView = view2;
        this.buttonViews = list;
        this.closeButton = view3;
        this.viewAccessibilityFlagMap = new HashMap<>();
        View clickableInAppMessageView = getClickableInAppMessageView();
        setClickableInAppMessageView(clickableInAppMessageView == null ? getInAppMessageView() : clickableInAppMessageView);
        IInAppMessage inAppMessage = getInAppMessage();
        InAppMessageSlideup inAppMessageSlideup = inAppMessage instanceof InAppMessageSlideup ? (InAppMessageSlideup) inAppMessage : null;
        if (inAppMessageSlideup != null) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(getInAppMessageView(), createDismissCallbacks(), inAppMessageSlideup.getSlideFrom() == SlideFrom.TOP ? SwipeDismissTouchListener.VerticalDismissDirection.UP : SwipeDismissTouchListener.VerticalDismissDirection.DOWN);
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            View clickableInAppMessageView2 = getClickableInAppMessageView();
            if (clickableInAppMessageView2 != null) {
                clickableInAppMessageView2.setOnTouchListener(touchAwareSwipeDismissTouchListener);
            }
        }
        View clickableInAppMessageView3 = getClickableInAppMessageView();
        if (clickableInAppMessageView3 != null) {
            clickableInAppMessageView3.setOnClickListener(createClickListener());
        }
        View closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        createButtonClickListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDismissRunnable$lambda$0() {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$0() {
        return "Adding In-app message view to parent view group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$1(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Adding status bar height of ", " padding to in-app message view.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat addInAppMessageViewToViewGroup$lambda$2(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(16), 7, (Object) null);
        if (windowInsetsCompat == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(17), 7, (Object) null);
            return new WindowInsetsCompat(windowInsetsCompat);
        }
        view.getClass();
        IInAppMessageView iInAppMessageView = (IInAppMessageView) view;
        if (iInAppMessageView.getHasAppliedWindowInsets()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(20), 7, (Object) null);
            return windowInsetsCompat;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(19), 6, (Object) null);
        iInAppMessageView.applyWindowInsets(windowInsetsCompat);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$2$0() {
        return "In-app message view received window insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$2$1() {
        return "Window insets were null, so not applying window insets to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$2$2() {
        return "Calling applyWindowInsets on in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$2$3() {
        return "Not reapplying window insets to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$3() {
        return "Requesting to apply insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$4() {
        return "In-app message view will animate into the visible area.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$5() {
        return "In-app message view will be placed instantly into the visible area.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$0() {
        return "Closing in-app message view wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$1$0() {
        return "Unregistering iam back invoked callback";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$0() {
        return "Closing in-app message view";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$1(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
        return "Returning focus to view after closing message. View: " + defaultInAppMessageViewWrapper.getPreviouslyFocusedView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$2() {
        return "Failed to request focus on previous view";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createButtonClickListeners$lambda$0$0() {
        return "Cannot create button click listener since this in-app message does not have message buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButtonClickListeners$lambda$0$1$0$0(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive, View view) {
        defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onButtonClicked(messageButton, iInAppMessageImmersive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createClickListener$lambda$0(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        List<MessageButton> messageButtons;
        IInAppMessage inAppMessage = defaultInAppMessageViewWrapper.getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if ((iInAppMessageImmersive == null || (messageButtons = iInAppMessageImmersive.getMessageButtons()) == null || !messageButtons.isEmpty()) && (defaultInAppMessageViewWrapper.getInAppMessage() instanceof IInAppMessageImmersive)) {
            return;
        }
        defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onClicked(defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCloseInAppMessageClickListener$lambda$0(View view) {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String open$lambda$0() {
        return "Opening in-app message view wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String open$lambda$1(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Detected root view height of ");
    }

    public void addDismissRunnable() {
        if (getDismissRunnable() == null) {
            setDismissRunnable(new Recorder$$ExternalSyntheticLambda13(4));
            getInAppMessageView().postDelayed(getDismissRunnable(), getInAppMessage().getDurationInMilliseconds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addInAppMessageViewToViewGroup(ViewGroup parentViewGroup, IInAppMessage inAppMessage, View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        parentViewGroup.getClass();
        inAppMessage.getClass();
        inAppMessageView.getClass();
        inAppMessageViewLifecycleListener.getClass();
        inAppMessageViewLifecycleListener.beforeOpened(inAppMessageView, inAppMessage);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(22), 7, (Object) null);
        parentViewGroup.addView(inAppMessageView, getLayoutParams(inAppMessage));
        if (inAppMessageView instanceof IInAppMessageView) {
            int i = 23;
            if (getConfigurationProvider().getShouldAddStatusBarPaddingToInAppMessages()) {
                Context context = inAppMessageView.getContext();
                context.getClass();
                int statusBarHeight = ViewUtils.getStatusBarHeight(context);
                int i2 = Build.VERSION.SDK_INT;
                WindowInsetsCompat.BuilderImpl builderImpl36 = i2 >= 36 ? new WindowInsetsCompat.BuilderImpl36() : i2 >= 35 ? new WindowInsetsCompat.BuilderImpl35() : i2 >= 34 ? new WindowInsetsCompat.BuilderImpl34() : i2 >= 31 ? new WindowInsetsCompat.BuilderImpl31() : i2 >= 30 ? new WindowInsetsCompat.BuilderImpl30() : new WindowInsetsCompat.BuilderImpl29();
                builderImpl36.setInsets(519, Insets.of(0, statusBarHeight, 0, 0));
                WindowInsetsCompat build = builderImpl36.build();
                build.getClass();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(statusBarHeight, i), 7, (Object) null);
                ((IInAppMessageView) inAppMessageView).applyWindowInsets(build);
            } else {
                CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 = new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(20, this, inAppMessageView);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(parentViewGroup, captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(i), 7, (Object) null);
                parentViewGroup.requestApplyInsets();
            }
        }
        if (inAppMessage.getAnimateIn()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(10), 7, (Object) null);
            setAndStartAnimation(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(11), 7, (Object) null);
            if (inAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                addDismissRunnable();
            }
            finalizeViewBeforeDisplay(inAppMessage, inAppMessageView, inAppMessageViewLifecycleListener);
        }
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void close() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(12), 7, (Object) null);
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            INSTANCE.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedCallback = getOnBackInvokedCallback()) != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(13), 7, (Object) null);
            Activity activity = BrazeInAppMessageManager.INSTANCE.getInstance().getActivity();
            if (activity != null && (onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            }
            setOnBackInvokedCallback(null);
        }
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedDispatcherFallbackCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.remove();
        }
        this.onBackPressedDispatcherFallbackCallback = null;
        getInAppMessageView().removeCallbacks(getDismissRunnable());
        getInAppMessageViewLifecycleListener().beforeClosed(getInAppMessageView(), getInAppMessage());
        if (!getInAppMessage().getAnimateOut()) {
            closeInAppMessageView();
        } else {
            setAnimatingClose(true);
            setAndStartAnimation(false);
        }
    }

    public void closeInAppMessageView() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(14), 7, (Object) null);
        ViewUtils.removeViewFromParent(getInAppMessageView());
        View inAppMessageView = getInAppMessageView();
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = inAppMessageView instanceof InAppMessageHtmlBaseView ? (InAppMessageHtmlBaseView) inAppMessageView : null;
        if (inAppMessageHtmlBaseView != null) {
            inAppMessageHtmlBaseView.finishWebViewDisplay();
        }
        if (getPreviouslyFocusedView() != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yf$$ExternalSyntheticLambda2(this, 10), 7, (Object) null);
            try {
                View previouslyFocusedView = getPreviouslyFocusedView();
                if (previouslyFocusedView != null) {
                    previouslyFocusedView.requestFocus();
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(15), 4, (Object) null);
            }
        }
        getInAppMessageViewLifecycleListener().afterClosed(getInAppMessage());
    }

    public Animation.AnimationListener createAnimationListener(boolean opening) {
        return opening ? new DefaultInAppMessageViewWrapper$createAnimationListener$1(this) : new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().clearAnimation();
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
    }

    public void createButtonClickListeners() {
        IInAppMessage inAppMessage = getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if (iInAppMessageImmersive != null) {
            if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(18), 7, (Object) null);
                return;
            }
            List<View> buttonViews = getButtonViews();
            if (buttonViews != null) {
                int i = 0;
                for (Object obj : buttonViews) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    View view = (View) obj;
                    MessageButton messageButton = (MessageButton) CollectionsKt.getOrNull(i, iInAppMessageImmersive.getMessageButtons());
                    if (messageButton != null) {
                        view.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda39(2, this, messageButton, iInAppMessageImmersive));
                    }
                    i = i2;
                }
            }
        }
    }

    public View.OnClickListener createClickListener() {
        return new Q0$$ExternalSyntheticLambda0(this, 6);
    }

    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new ArcadeModal$$ExternalSyntheticLambda0(1);
    }

    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createDismissCallbacks$1
            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public boolean canDismiss(Object token) {
                return true;
            }

            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view, Object token) {
                view.getClass();
                DefaultInAppMessageViewWrapper.this.getInAppMessage().setAnimateOut(false);
                BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createTouchAwareListener$1
            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchEnded() {
            }

            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchStartedOrContinued() {
            }
        };
    }

    public void finalizeViewBeforeDisplay(IInAppMessage inAppMessage, View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        inAppMessage.getClass();
        inAppMessageView.getClass();
        inAppMessageViewLifecycleListener.getClass();
        if (ViewUtils.isDeviceNotInTouchMode(inAppMessageView)) {
            int i = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
        }
        inAppMessageViewLifecycleListener.afterOpened(inAppMessageView, inAppMessage);
    }

    public List<View> getButtonViews() {
        return this.buttonViews;
    }

    public View getClickableInAppMessageView() {
        return this.clickableInAppMessageView;
    }

    public View getCloseButton() {
        return this.closeButton;
    }

    public Animation getClosingAnimation() {
        return this.closingAnimation;
    }

    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public ViewGroup getContentViewGroupParentLayout() {
        return this.contentViewGroupParentLayout;
    }

    public Runnable getDismissRunnable() {
        return this.dismissRunnable;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public View getInAppMessageView() {
        return this.inAppMessageView;
    }

    public IInAppMessageViewLifecycleListener getInAppMessageViewLifecycleListener() {
        return this.inAppMessageViewLifecycleListener;
    }

    public ViewGroup.LayoutParams getLayoutParams(IInAppMessage inAppMessage) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (inAppMessage instanceof InAppMessageSlideup) {
            layoutParams.gravity = ((InAppMessageSlideup) inAppMessage).getSlideFrom() == SlideFrom.TOP ? 48 : 80;
        }
        return layoutParams;
    }

    public OnBackInvokedCallback getOnBackInvokedCallback() {
        return this.onBackInvokedCallback;
    }

    public Animation getOpeningAnimation() {
        return this.openingAnimation;
    }

    public ViewGroup getParentViewGroup(Activity activity) {
        activity.getClass();
        View findViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        findViewById.getClass();
        return (ViewGroup) findViewById;
    }

    public View getPreviouslyFocusedView() {
        return this.previouslyFocusedView;
    }

    public HashMap<Integer, Integer> getViewAccessibilityFlagMap() {
        return this.viewAccessibilityFlagMap;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    /* renamed from: isAnimatingClose, reason: from getter */
    public boolean getIsAnimatingClose() {
        return this.isAnimatingClose;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void open(Activity activity) {
        activity.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(21), 6, (Object) null);
        ViewGroup parentViewGroup = getParentViewGroup(activity);
        int height = parentViewGroup.getHeight();
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            setContentViewGroupParentLayout(parentViewGroup);
            getViewAccessibilityFlagMap().clear();
            INSTANCE.setAllViewGroupChildrenAsNonAccessibilityImportant(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        setPreviouslyFocusedView(activity.getCurrentFocus());
        if (height == 0) {
            parentViewGroup.addOnLayoutChangeListener(new DefaultInAppMessageViewWrapper$open$2(parentViewGroup, this));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(height, 22), 7, (Object) null);
            addInAppMessageViewToViewGroup(parentViewGroup, getInAppMessage(), getInAppMessageView(), getInAppMessageViewLifecycleListener());
        }
        BrazeInAppMessageManager.Companion companion = BrazeInAppMessageManager.INSTANCE;
        if (companion.getInstance().getDoesBackButtonDismissInAppMessageViewField() && Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedCallback onBackInvokedCallback = getOnBackInvokedCallback();
            if (onBackInvokedCallback != null) {
                activity.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
                setOnBackInvokedCallback(null);
            }
            DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 = new DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1();
            activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1);
            setOnBackInvokedCallback(defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1);
        }
        ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity) activity : null;
        if (componentActivity == null || !companion.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            return;
        }
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedDispatcherFallbackCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.remove();
        }
        this.onBackPressedDispatcherFallbackCallback = null;
        DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 = new DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1();
        componentActivity.getOnBackPressedDispatcher().addCallback(defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1);
        this.onBackPressedDispatcherFallbackCallback = defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1;
    }

    public void setAndStartAnimation(boolean opening) {
        Animation openingAnimation = opening ? getOpeningAnimation() : getClosingAnimation();
        if (openingAnimation != null) {
            openingAnimation.setAnimationListener(createAnimationListener(opening));
        }
        getInAppMessageView().clearAnimation();
        getInAppMessageView().setAnimation(openingAnimation);
        if (openingAnimation != null) {
            openingAnimation.startNow();
        }
        getInAppMessageView().invalidate();
    }

    public void setAnimatingClose(boolean z) {
        this.isAnimatingClose = z;
    }

    public void setClickableInAppMessageView(View view) {
        this.clickableInAppMessageView = view;
    }

    public void setContentViewGroupParentLayout(ViewGroup viewGroup) {
        this.contentViewGroupParentLayout = viewGroup;
    }

    public void setDismissRunnable(Runnable runnable) {
        this.dismissRunnable = runnable;
    }

    public void setOnBackInvokedCallback(OnBackInvokedCallback onBackInvokedCallback) {
        this.onBackInvokedCallback = onBackInvokedCallback;
    }

    public void setPreviouslyFocusedView(View view) {
        this.previouslyFocusedView = view;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tJ$\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$Companion;", "", "<init>", "()V", "setAllViewGroupChildrenAsNonAccessibilityImportant", "", "viewGroup", "Landroid/view/ViewGroup;", "viewAccessibilityFlagMap", "", "", "resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto", "", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$0() {
            return "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setAllViewGroupChildrenAsNonAccessibilityImportant$lambda$0() {
            return "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.";
        }

        public final void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(ViewGroup viewGroup, Map<Integer, Integer> viewAccessibilityFlagMap) {
            viewAccessibilityFlagMap.getClass();
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(25), 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    int id = childAt.getId();
                    if (viewAccessibilityFlagMap.containsKey(Integer.valueOf(id))) {
                        Integer num = viewAccessibilityFlagMap.get(Integer.valueOf(id));
                        if (num != null) {
                            childAt.setImportantForAccessibility(num.intValue());
                        }
                    } else {
                        childAt.setImportantForAccessibility(0);
                    }
                }
            }
        }

        public final void setAllViewGroupChildrenAsNonAccessibilityImportant(ViewGroup viewGroup, Map<Integer, Integer> viewAccessibilityFlagMap) {
            viewAccessibilityFlagMap.getClass();
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(24), 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    viewAccessibilityFlagMap.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                }
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : view3);
    }
}
