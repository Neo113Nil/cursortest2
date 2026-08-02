package ru.yandex.taxi.multiorder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.an6;
import defpackage.f1h0;
import defpackage.mh3;
import defpackage.o6;
import defpackage.ofp0;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.u90;
import defpackage.vng;
import defpackage.wug0;
import defpackage.xqg0;
import defpackage.zkh0;
import defpackage.zm6;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001JB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\fH\u0014¢\u0006\u0004\b \u0010\u000eJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0014¢\u0006\u0004\b+\u0010,J\u001f\u00100\u001a\u00020\f2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\f2\u0006\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020-H\u0014¢\u0006\u0004\b4\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00105R\u0014\u0010>\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00106R\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00106R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/yandex/taxi/multiorder/BubbleModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "", "text", "Landroid/view/View;", "anchor", "", "dismissAfterDelay", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Z)V", "Lzy11;", "calibrateByYWithRequestLayout", "()V", "setupBubble", "", "anchorX", "modalX", "screenMinMargin", "screenWidth", "Landroid/view/ViewGroup$MarginLayoutParams;", "layoutParams", "setupDefaultBubblePosition", "(IIIILandroid/view/ViewGroup$MarginLayoutParams;)V", "drawableRes", "setCornerBubbleBackground", "(I)V", "", "getAnimationTranslationY", "()F", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "keyCode", "Landroid/view/KeyEvent;", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "contentView", "()Landroid/view/View;", "onPreDrawReadyToAnimate", "()Z", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Landroid/view/View;", "Z", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "Landroid/widget/TextView;", "bubble", "Landroid/widget/TextView;", "arrow", "dismissRunnable", "Ljava/lang/Runnable;", "bubbleSetup", "cornerArrow", "skipNextGlobalLayout", "Landroid/view/View$OnLayoutChangeListener;", "onAnchorLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Companion", "an6", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BubbleModalView extends ModalView {
    public static final int $stable = 8;
    private static final long ANIMATION_DURATION = 250;
    public static final an6 Companion = new an6();
    private static final long LENGTH = 5000;
    private final View anchor;
    private final View arrow;
    private final TextView bubble;
    private boolean bubbleSetup;
    private final ViewGroup content;
    private boolean cornerArrow;
    private final boolean dismissAfterDelay;
    private final Runnable dismissRunnable;
    private final View.OnLayoutChangeListener onAnchorLayoutChangeListener;
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private boolean skipNextGlobalLayout;

    private BubbleModalView(Context context, String str, View view, boolean z) {
        super(context);
        this.anchor = view;
        this.dismissAfterDelay = z;
        ru.yandex.taxi.design.utils.c.q(this, zkh0.bubble_modal_view, true);
        int i = p8h0.content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.content = (ViewGroup) ((View) rp31.d(this, i));
        TextView textView = (TextView) ((View) rp31.d(this, p8h0.bubble));
        this.bubble = textView;
        this.arrow = (View) rp31.d(this, p8h0.arrow);
        this.dismissRunnable = new zm6(this, 0);
        this.onAnchorLayoutChangeListener = new u90(8, this);
        this.onGlobalLayoutListener = new o6(2, this);
        textView.setText(str);
        setClickable(false);
        setFocusableInTouchMode(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShow$lambda$0(Runnable runnable, BubbleModalView bubbleModalView) {
        runnable.run();
        if (bubbleModalView.dismissAfterDelay) {
            bubbleModalView.postDelayed(bubbleModalView.dismissRunnable, 5000L);
        }
    }

    private final void calibrateByYWithRequestLayout() {
        int[] iArr = new int[2];
        this.anchor.getLocationOnScreen(iArr);
        int i = iArr[1];
        getLocationOnScreen(iArr);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.content.getLayoutParams();
        int height = (i - iArr[1]) - this.content.getHeight();
        marginLayoutParams.topMargin = height;
        if (this.cornerArrow) {
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(wug0.bubble_modal_view_corner_arrow_bg_vertical_offset) + height;
        }
        requestLayout();
    }

    public static final BubbleModalView create(Context context, String str, View view, boolean z) {
        Companion.getClass();
        return new BubbleModalView(context, str, view, z, null);
    }

    private final float getAnimationTranslationY() {
        return getResources().getDimension(wug0.bubble_modal_view_animation_translation_y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnchorLayoutChangeListener$lambda$0(BubbleModalView bubbleModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        bubbleModalView.post(new zm6(bubbleModalView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGlobalLayoutListener$lambda$0(BubbleModalView bubbleModalView) {
        if (bubbleModalView.isInLayout() || bubbleModalView.skipNextGlobalLayout) {
            bubbleModalView.skipNextGlobalLayout = false;
        } else {
            bubbleModalView.calibrateByYWithRequestLayout();
            bubbleModalView.skipNextGlobalLayout = true;
        }
    }

    private final void setCornerBubbleBackground(int drawableRes) {
        this.cornerArrow = true;
        this.arrow.setVisibility(8);
        this.bubble.setPadding(0, 0, 0, 0);
        Drawable t = vng.t(drawableRes, getContext());
        if (t == null) {
            return;
        }
        t.setTint(getContext().getColor(xqg0.bubble_modal_view_black));
        this.bubble.setBackground(t);
        this.bubble.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private final void setupBubble() {
        BubbleModalView bubbleModalView;
        int dimensionPixelSize = getResources().getDimensionPixelSize(wug0.bubble_modal_view_min_screen_margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(wug0.bubble_modal_view_arrow_min_offset);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(wug0.bubble_modal_view_corner_arrow_bg_horizontal_offset);
        int[] iArr = new int[2];
        this.anchor.getLocationOnScreen(iArr);
        int width = (this.anchor.getWidth() / 2) + iArr[0];
        int i = ofp0.b;
        getLocationOnScreen(iArr);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.content.getLayoutParams();
        if ((width - dimensionPixelSize2) - (this.arrow.getWidth() / 2) < dimensionPixelSize) {
            setCornerBubbleBackground(f1h0.pickup_label_white_left_bottom_bg);
            marginLayoutParams.leftMargin = (width - iArr[0]) - dimensionPixelSize3;
        } else {
            if ((this.arrow.getWidth() / 2) + dimensionPixelSize2 + width <= i - dimensionPixelSize) {
                bubbleModalView = this;
                bubbleModalView.setupDefaultBubblePosition(width, iArr[0], dimensionPixelSize, i, marginLayoutParams);
                bubbleModalView.requestLayout();
            }
            setCornerBubbleBackground(f1h0.pickup_label_white_right_bottom_bg);
            marginLayoutParams.leftMargin = ((width - iArr[0]) - this.bubble.getMeasuredWidth()) + dimensionPixelSize3;
        }
        bubbleModalView = this;
        bubbleModalView.requestLayout();
    }

    private final void setupDefaultBubblePosition(int anchorX, int modalX, int screenMinMargin, int screenWidth, ViewGroup.MarginLayoutParams layoutParams) {
        int width = (anchorX - modalX) - (this.content.getWidth() / 2);
        layoutParams.height = this.arrow.getHeight() + this.bubble.getHeight();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.arrow.getLayoutParams();
        layoutParams2.gravity = 81;
        if (width < screenMinMargin) {
            int i = screenMinMargin - width;
            layoutParams2.leftMargin = -i;
            layoutParams.leftMargin = width + i;
        } else {
            if (this.content.getWidth() + width + screenMinMargin <= screenWidth) {
                layoutParams.leftMargin = width;
                return;
            }
            int width2 = ((screenWidth - screenMinMargin) - width) - this.content.getWidth();
            layoutParams2.leftMargin = -width2;
            layoutParams.leftMargin = width + width2;
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        this.content.animate().translationY(-getAnimationTranslationY()).alpha(0.0f).setDuration(250L).setListener(new AnimUtils$AnimationStartEndListener(startAction, endAction));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        calibrateByYWithRequestLayout();
        this.anchor.addOnLayoutChangeListener(this.onAnchorLayoutChangeListener);
        this.content.setTranslationY(-getAnimationTranslationY());
        this.content.setAlpha(0.0f);
        this.content.animate().translationY(0.0f).alpha(1.0f).setDuration(250L).withStartAction(new mh3(20, onAnimateShowStartAction, this)).withEndAction(onAnimateShowEndAction);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        this.content.animate().setListener(null);
        this.content.animate().cancel();
        removeCallbacks(this.dismissRunnable);
        this.anchor.removeOnLayoutChangeListener(this.onAnchorLayoutChangeListener);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (4 != keyCode) {
            return super.onKeyUp(keyCode, event);
        }
        onBackPressed();
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public boolean onPreDrawReadyToAnimate() {
        if (this.bubbleSetup) {
            return true;
        }
        setupBubble();
        this.bubbleSetup = true;
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        dismiss();
        return super.onTouchEvent(event);
    }

    public /* synthetic */ BubbleModalView(Context context, String str, View view, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, view, z);
    }

    public /* synthetic */ BubbleModalView(Context context, String str, View view, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, view, (i & 8) != 0 ? true : z);
    }
}
