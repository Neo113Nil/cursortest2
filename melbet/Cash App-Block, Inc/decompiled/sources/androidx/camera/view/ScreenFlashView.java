package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.Ui;
import coil3.memory.MemoryCacheService;
import com.miteksystems.misnap.workflow.view.VisualizerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.treehouse.ReceiptScaffoldBinding;
import com.squareup.cash.reactions.viewmodels.ReactionViewEvent;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.scannerview.OverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ScreenFlashView extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public AnonymousClass1 mScreenFlash;
    public Window mScreenFlashWindow;

    /* renamed from: androidx.camera.view.ScreenFlashView$2, reason: invalid class name */
    public final class AnonymousClass2 implements Animator.AnimatorListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object val$onAnimationEnd;

        public /* synthetic */ AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.val$onAnimationEnd = obj;
        }

        private final void onAnimationCancel$androidx$camera$view$ScreenFlashView$2(Animator animator) {
        }

        private final void onAnimationCancel$com$squareup$cash$arcade$treehouse$ReceiptScaffoldBinding$showFooter$lambda$0$$inlined$addListener$default$1(Animator animator) {
        }

        private final void onAnimationCancel$com$squareup$cash$reactions$views$ChooseReactionOverlay$setCloseStateAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationCancel$com$squareup$cash$ui$util$SplashScreenAnimationKt$splashScreenAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationCancel$com$squareup$scannerview$OverlayView$special$$inlined$addListener$default$1(Animator animator) {
        }

        private final void onAnimationCancel$com$withpersona$sdk2$inquiry$shared$ui$SpotlightView$setBorderColor$lambda$11$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationRepeat$androidx$camera$view$ScreenFlashView$2(Animator animator) {
        }

        private final void onAnimationRepeat$com$squareup$cash$arcade$treehouse$ReceiptScaffoldBinding$showFooter$lambda$0$$inlined$addListener$default$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$squareup$cash$reactions$views$ChooseReactionOverlay$setCloseStateAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$squareup$cash$ui$util$SplashScreenAnimationKt$splashScreenAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$squareup$scannerview$OverlayView$special$$inlined$addListener$default$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$withpersona$sdk2$inquiry$shared$ui$SpotlightView$setBorderColor$lambda$11$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationStart$androidx$camera$view$ScreenFlashView$2(Animator animator) {
        }

        private final void onAnimationStart$com$squareup$cash$arcade$treehouse$ReceiptScaffoldBinding$showFooter$lambda$0$$inlined$addListener$default$1(Animator animator) {
        }

        private final void onAnimationStart$com$squareup$cash$reactions$views$ChooseReactionOverlay$setCloseStateAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationStart$com$squareup$cash$ui$util$SplashScreenAnimationKt$splashScreenAnimator$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationStart$com$withpersona$sdk2$inquiry$shared$ui$SpotlightView$setBorderColor$lambda$11$$inlined$doOnEnd$1(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    animator.getClass();
                    ((VisualizerView) this.val$onAnimationEnd).i = false;
                    break;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.val$onAnimationEnd;
            switch (i) {
                case 0:
                    StringUtilsKt.d("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
                    ((Preview$$ExternalSyntheticLambda0) obj).run();
                    return;
                case 1:
                    animator.getClass();
                    ((VisualizerView) obj).i = false;
                    return;
                case 2:
                    ((ReceiptScaffoldBinding) obj).animator = null;
                    return;
                case 3:
                    Ui.EventReceiver eventReceiver = ((ChooseReactionOverlay) obj).eventReceiver;
                    if (eventReceiver != null) {
                        eventReceiver.sendEvent(ReactionViewEvent.ViewClosed.INSTANCE);
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                case 4:
                    ((WorkLauncherImpl) ((MemoryCacheService) obj).imageLoader).remove();
                    return;
                case 5:
                    OverlayView overlayView = (OverlayView) obj;
                    overlayView.outlinePaint.setAlpha(255);
                    overlayView.successDimPaint.setAlpha(0);
                    overlayView.invalidate();
                    return;
                default:
                    ((SpotlightView) obj).intensityAnimator = null;
                    return;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    animator.getClass();
                    break;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.val$onAnimationEnd;
            switch (i) {
                case 1:
                    animator.getClass();
                    ((VisualizerView) obj).i = true;
                    break;
                case 5:
                    OverlayView overlayView = (OverlayView) obj;
                    overlayView.outlinePaint.setAlpha(0);
                    overlayView.successDimPaint.setAlpha(EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE);
                    overlayView.invalidate();
                    break;
            }
        }
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        setBackgroundColor(-1);
        setAlpha(RecyclerView.DECELERATION_RATE);
        setElevation(Float.MAX_VALUE);
    }

    public static void access$100(ScreenFlashView screenFlashView, float f) {
        if (screenFlashView.mScreenFlashWindow == null) {
            StringUtilsKt.e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            StringUtilsKt.e("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = screenFlashView.mScreenFlashWindow.getAttributes();
        attributes.screenBrightness = f;
        screenFlashView.mScreenFlashWindow.setAttributes(attributes);
        StringUtilsKt.d("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    public void setController(CameraController cameraController) {
        Threads.checkMainThread();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScreenFlashWindow(Window window) {
        Threads.checkMainThread();
        StringBuilder sb = new StringBuilder("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.mScreenFlashWindow);
        StringUtilsKt.d("ScreenFlashView", sb.toString());
        if (this.mScreenFlashWindow != window) {
            this.mScreenFlash = window == null ? 0 : new ImageCapture.ScreenFlash() { // from class: androidx.camera.view.ScreenFlashView.1
                public ValueAnimator mAnimator;
                public float mPreviousBrightness;

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public final void apply(long j, StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
                    float f;
                    StringUtilsKt.d("ScreenFlashView", "ScreenFlash#apply");
                    ScreenFlashView screenFlashView = ScreenFlashView.this;
                    Window window2 = screenFlashView.mScreenFlashWindow;
                    if (window2 == null) {
                        StringUtilsKt.e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
                        f = Float.NaN;
                    } else {
                        f = window2.getAttributes().screenBrightness;
                    }
                    this.mPreviousBrightness = f;
                    ScreenFlashView.access$100(screenFlashView, 1.0f);
                    ValueAnimator valueAnimator = this.mAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(streamSharing$$ExternalSyntheticLambda1, 26);
                    StringUtilsKt.d("ScreenFlashView", "animateToFullOpacity");
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
                    ofFloat.setDuration(1000L);
                    ofFloat.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(screenFlashView, 1));
                    ofFloat.addListener(new AnonymousClass2(preview$$ExternalSyntheticLambda0, 0));
                    ofFloat.start();
                    this.mAnimator = ofFloat;
                }

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public final void clear() {
                    StringUtilsKt.d("ScreenFlashView", "ScreenFlash#clear");
                    ValueAnimator valueAnimator = this.mAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.mAnimator = null;
                    }
                    ScreenFlashView screenFlashView = ScreenFlashView.this;
                    screenFlashView.setAlpha(RecyclerView.DECELERATION_RATE);
                    ScreenFlashView.access$100(screenFlashView, this.mPreviousBrightness);
                }
            };
        }
        this.mScreenFlashWindow = window;
        StringUtilsKt.d("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenFlashView(Context context) {
        this(context, null);
    }
}
