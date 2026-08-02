package ru.yandex.taxi.stories.presentation.preview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.b;
import defpackage.el40;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.kdh0;
import defpackage.koc;
import defpackage.lqg0;
import defpackage.pzt0;
import defpackage.r400;
import defpackage.rp31;
import defpackage.rpu0;
import defpackage.upu0;
import defpackage.vpu0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.animation.BaseAnimatorListener;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersFrameLayout;
import ru.yandex.taxi.widget.c;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 A2\u00020\u0001:\u0003B2CB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0017\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010$\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010\u0010J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lru/yandex/taxi/stories/presentation/preview/StoryPreviewView;", "Lru/yandex/taxi/widget/RoundedCornersFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljava/lang/Runnable;", "endListener", "Lzy11;", "animateDown", "(Ljava/lang/Runnable;)V", "finishClickAnimation", "()V", "animateUp", "Lrpu0;", "previousStory", "story", "Lkoc;", "commonImageLoaderDelegate", "loadImage", "(Lrpu0;Lrpu0;Lkoc;)V", "startPulseAnimation", "stopPulseAnimation", "onFinishInflate", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "opened", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "setData", "(Lrpu0;ZLkoc;Lru/yandex/taxi/widget/c;)V", "animateFromClosedStory", "Lel40;", "multiClickHandler", "setMultiClickHandler", "(Lel40;)V", "Landroid/widget/ImageView;", "previewView", "Landroid/widget/ImageView;", "Landroid/view/View;", "placeholder", "Landroid/view/View;", "repeatView", "Lru/yandex/taxi/stories/presentation/preview/a;", "previewTextHolder", "Lru/yandex/taxi/stories/presentation/preview/a;", "Lel40;", "Landroid/animation/Animator;", "pulseAnimator", "Landroid/animation/Animator;", "currentStory", "Lrpu0;", "wasOpened", "Z", "downAnimationRunning", "performClickAfterDownAnimation", "defaultPlaceHolderColor", CA20Status.STATUS_USER_I, "Companion", "RepeatAnimationListener", "vpu0", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoryPreviewView extends RoundedCornersFrameLayout {
    private static final long ALPHA_ANIMATION_DURATION = 100;
    private static final long ANIMATION_DURATION = 150;
    private static final float DOWN_SCALE = 0.95f;
    private static final long IMAGE_FADE_IN_ANIMATION_DURATION = 300;
    private static final float PULSE_ANIMATION_ALPHA = 0.5f;
    private static final long PULSE_ANIMATION_DURATION = 1000;
    private static final float VIEWED_STORY_ALPHA = 0.2f;
    private rpu0 currentStory;
    private final int defaultPlaceHolderColor;
    private boolean downAnimationRunning;
    private el40 multiClickHandler;
    private boolean performClickAfterDownAnimation;
    private View placeholder;
    private a previewTextHolder;
    private ImageView previewView;
    private Animator pulseAnimator;
    private ImageView repeatView;
    private boolean wasOpened;
    public static final vpu0 Companion = new vpu0();
    private static final el40 EMPTY_MULTI_CLICK_HANDLER = new r400(13);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/stories/presentation/preview/StoryPreviewView$RepeatAnimationListener;", "Lru/yandex/taxi/animation/BaseAnimatorListener;", "<init>", "()V", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationCancel", "onAnimationEnd", "", "canceled", "Z", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class RepeatAnimationListener extends BaseAnimatorListener {
        private boolean canceled;

        @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.canceled = true;
        }

        @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (this.canceled) {
                return;
            }
            animation.start();
        }

        @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.canceled = false;
        }
    }

    public StoryPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.multiClickHandler = EMPTY_MULTI_CLICK_HANDLER;
        setLayerType(2, null);
        this.defaultPlaceHolderColor = getContext().getColor(lqg0.taxi_communications_story_placeholder);
    }

    private final void animateDown(Runnable endListener) {
        animate().cancel();
        animate().scaleX(0.95f).scaleY(0.95f).setDuration(150L).setListener(new AnimUtils$AnimationEndListener(endListener));
    }

    private final void animateUp() {
        animate().cancel();
        animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L);
    }

    private final void finishClickAnimation() {
        rpu0 rpu0Var = this.currentStory;
        if (rpu0Var == null || !rpu0Var.f) {
            performClick();
            this.multiClickHandler.updateLastClickOnItemTimestamp();
            return;
        }
        ImageView imageView = this.previewView;
        if (imageView == null) {
            imageView = null;
        }
        imageView.animate().alpha(1.0f).setDuration(100L).setListener(new AnimUtils$AnimationEndListener(new upu0(this, 0)));
        ImageView imageView2 = this.repeatView;
        (imageView2 != null ? imageView2 : null).animate().alpha(0.0f).setDuration(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishClickAnimation$lambda$0(StoryPreviewView storyPreviewView) {
        ImageView imageView = storyPreviewView.previewView;
        if (imageView == null) {
            imageView = null;
        }
        imageView.animate().setListener(null);
        storyPreviewView.performClick();
        storyPreviewView.multiClickHandler.updateLastClickOnItemTimestamp();
    }

    private final void loadImage(rpu0 previousStory, rpu0 story, koc commonImageLoaderDelegate) {
        String str = story.d;
        if (str == null || evu0.J(str)) {
            return;
        }
        if (previousStory == null || !jl40.l(previousStory.d, str)) {
            stopPulseAnimation();
            startPulseAnimation();
            View view = this.placeholder;
            if (view == null) {
                view = null;
            }
            view.animate().cancel();
            View view2 = this.placeholder;
            if (view2 == null) {
                view2 = null;
            }
            view2.setAlpha(1.0f);
            ImageView imageView = this.previewView;
            (imageView != null ? imageView : null).addOnAttachStateChangeListener(new StoryPreviewView$loadImage$1(commonImageLoaderDelegate, this, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTouchEvent$lambda$0(StoryPreviewView storyPreviewView) {
        storyPreviewView.downAnimationRunning = false;
        if (storyPreviewView.performClickAfterDownAnimation) {
            storyPreviewView.performClickAfterDownAnimation = false;
            storyPreviewView.finishClickAnimation();
        }
    }

    private final void startPulseAnimation() {
        Property property = FrameLayout.ALPHA;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, (Property<StoryPreviewView, Float>) property, 1.0f, 0.5f).setDuration(1000L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, (Property<StoryPreviewView, Float>) property, 0.5f, 1.0f).setDuration(1000L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.addListener(new RepeatAnimationListener());
        animatorSet.start();
        this.pulseAnimator = animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPulseAnimation() {
        Animator animator = this.pulseAnimator;
        if (animator != null) {
            animator.cancel();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<StoryPreviewView, Float>) FrameLayout.ALPHA, 1.0f);
            ofFloat.start();
            this.pulseAnimator = ofFloat;
        }
    }

    public final void animateFromClosedStory() {
        rpu0 rpu0Var = this.currentStory;
        if (rpu0Var != null && rpu0Var.f) {
            ImageView imageView = this.previewView;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setAlpha(1.0f);
            ImageView imageView2 = this.previewView;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.animate().alpha(0.2f).setDuration(100L);
            ImageView imageView3 = this.repeatView;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setAlpha(0.0f);
            ImageView imageView4 = this.repeatView;
            (imageView4 != null ? imageView4 : null).animate().alpha(1.0f).setDuration(100L);
        }
        animateUp();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = kdh0.story_preview_image;
        WeakHashMap weakHashMap = b.a;
        this.previewView = (ImageView) ((View) rp31.d(this, i));
        this.placeholder = (View) rp31.d(this, kdh0.story_preview_placeholder);
        this.repeatView = (ImageView) ((View) rp31.d(this, kdh0.story_preview_repeat));
        this.previewTextHolder = new a(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                this.multiClickHandler.updateLastClickOnItemTimestamp();
                if (this.downAnimationRunning) {
                    this.performClickAfterDownAnimation = true;
                    return true;
                }
                finishClickAnimation();
                return true;
            }
            if (action == 3) {
                animateUp();
                return true;
            }
        } else if (this.multiClickHandler.satisfiesClickDelay()) {
            this.multiClickHandler.updateLastClickOnItemTimestamp();
            this.performClickAfterDownAnimation = false;
            this.downAnimationRunning = true;
            animateDown(new upu0(this, 1));
            return true;
        }
        return false;
    }

    public final void setData(rpu0 story, boolean opened, koc commonImageLoaderDelegate, c formattedTextConverter) {
        rpu0 rpu0Var = this.currentStory;
        this.currentStory = story;
        if (rpu0Var == null || story.f != rpu0Var.f || this.wasOpened != opened) {
            ImageView imageView = this.repeatView;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setVisibility(story.f ? 0 : 8);
            ImageView imageView2 = this.repeatView;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setAlpha(opened ? 0.0f : 1.0f);
            ImageView imageView3 = this.previewView;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setAlpha((!story.f || opened) ? 1.0f : 0.2f);
        }
        loadImage(rpu0Var, story, commonImageLoaderDelegate);
        Integer num = story.e;
        int intValue = num != null ? num.intValue() : this.defaultPlaceHolderColor;
        View view = this.placeholder;
        if (view == null) {
            view = null;
        }
        view.setBackgroundColor(intValue);
        a aVar = this.previewTextHolder;
        if (aVar == null) {
            aVar = null;
        }
        FormattedText formattedText = story.b;
        pzt0 pzt0Var = aVar.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (!formattedText.a.isEmpty() || aVar.b.isInitialized()) {
            aVar.e = a.a((RobotoTextView) aVar.c.getValue(), formattedText, formattedTextConverter);
        }
        a aVar2 = this.previewTextHolder;
        if (aVar2 == null) {
            aVar2 = null;
        }
        FormattedText formattedText2 = story.c;
        pzt0 pzt0Var2 = aVar2.f;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        if (!formattedText2.a.isEmpty() || aVar2.b.isInitialized()) {
            aVar2.f = a.a((RobotoTextView) aVar2.d.getValue(), formattedText2, formattedTextConverter);
        }
        float f = opened ? 0.95f : 1.0f;
        setScaleX(f);
        setScaleY(f);
        this.wasOpened = opened;
    }

    public final void setMultiClickHandler(el40 multiClickHandler) {
        this.multiClickHandler = multiClickHandler;
    }

    public StoryPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StoryPreviewView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ StoryPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
