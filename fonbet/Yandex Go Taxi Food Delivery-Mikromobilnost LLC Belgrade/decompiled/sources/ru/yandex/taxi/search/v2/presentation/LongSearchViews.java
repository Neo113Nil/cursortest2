package ru.yandex.taxi.search.v2.presentation;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.pin.api.v1.PinV1Component;
import defpackage.bdc;
import defpackage.fbz;
import defpackage.g7h;
import defpackage.mrg0;
import defpackage.qje;
import defpackage.vg3;
import defpackage.wtg0;
import defpackage.wug0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yvb0;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b%\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u001c¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b(\u0010)J%\u0010+\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010*\u001a\u00020\f¢\u0006\u0004\b+\u0010\u0010J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u000e¢\u0006\u0004\b3\u0010\u001bJ\u0015\u00104\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/yandex/taxi/search/v2/presentation/LongSearchViews;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lyvb0;", "pinFactory", "<init>", "(Landroid/content/Context;Lyvb0;)V", "", "text", "", "yOffset", "", "disappearDelayMillis", "Lzy11;", "replaceHintMessageAnimated", "(Ljava/lang/CharSequence;FJ)V", "getHeightHintPadding", "()F", "durationMillis", "Landroid/view/ViewPropertyAnimator;", "getHideHintAnimation", "(J)Landroid/view/ViewPropertyAnimator;", RemoteBioParameters.Y, "getShowHintAnimation", "(F)Landroid/view/ViewPropertyAnimator;", "showClientPin", "()V", "Landroid/graphics/PointF;", "offsetPointF", "getPinTranslationAnimator", "(Landroid/graphics/PointF;)Landroid/view/ViewPropertyAnimator;", "addEtaPin", "(Landroid/content/Context;)V", "addBubbleView", "translatePinAnimated", "(Landroid/graphics/PointF;)V", "translatePin", "offsetPoint", "removePin", "setEta", "(Ljava/lang/CharSequence;)V", "timeoutMillis", "showHintAndAnimateDisappearByTimeout", "", "animated", "startDelayMillis", "hideHint", "(ZLjava/lang/Long;)V", "showHint", "(Ljava/lang/CharSequence;F)V", "cancelHintAnimationsIfNeeded", "hideClientPin", "(Z)V", "Lcom/yandex/go/pin/api/v1/PinV1Component;", "locationPin", "Lcom/yandex/go/pin/api/v1/PinV1Component;", "Lru/yandex/taxi/widget/RobotoTextView;", "hintMessage", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "bubble", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongSearchViews extends FrameLayout {
    public static final int $stable = 8;
    private final BubbleComponent bubble;
    private final RobotoTextView hintMessage;
    private final PinV1Component locationPin;

    public LongSearchViews(Context context, yvb0 yvb0Var) {
        super(context);
        PinV1Component pinV1Component = new PinV1Component(context, yvb0Var);
        pinV1Component.setVisibility(8);
        this.locationPin = pinV1Component;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setGravity(17);
        robotoTextView.setTextColor(qje.t(xng0.textMain, robotoTextView.getContext()));
        robotoTextView.setTextSize(0, xw31.b(mrg0.component_text_size_body, context));
        xw31.G(context.getResources().getDimensionPixelSize(mrg0.go_design_s_space), robotoTextView);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.hintMessage = robotoTextView;
        BubbleComponent bubbleComponent = new BubbleComponent(context, null, 0, 6, null);
        g7h g7hVar = new g7h(context);
        g7hVar.b(new bdc(xng0.bgMain));
        g7hVar.o(DefaultBubbleDecorator$Direction.DOWN);
        bubbleComponent.setDecorator(g7hVar);
        bubbleComponent.addView(robotoTextView);
        bubbleComponent.setVisibility(8);
        this.bubble = bubbleComponent;
        addEtaPin(context);
        addBubbleView(context);
    }

    private final void addBubbleView(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.setMargins(0, 0, 0, xw31.b(wug0.long_search_v2_bubble_bottom_margin, context));
        addView(this.bubble, layoutParams);
    }

    private final void addEtaPin(Context context) {
        addView(this.locationPin, new FrameLayout.LayoutParams(xw31.b(wtg0.pin_width, context), context.getResources().getDimensionPixelSize(wtg0.pin_height), 17));
        showClientPin();
        this.locationPin.setAnchored(true, true);
        this.locationPin.setState(Pin$State.IN_PROGRESS, true);
    }

    private final float getHeightHintPadding() {
        this.hintMessage.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.hintMessage.getMeasuredHeight() / 4.0f;
    }

    private final ViewPropertyAnimator getHideHintAnimation(long durationMillis) {
        ViewPropertyAnimator animate = this.bubble.animate();
        animate.setDuration(durationMillis).translationY(this.hintMessage.getHeight() - this.locationPin.getHeight()).scaleY(0.0f).alpha(0.0f);
        return animate;
    }

    private final ViewPropertyAnimator getPinTranslationAnimator(PointF offsetPointF) {
        return this.locationPin.animate().translationX(offsetPointF.x).translationY(offsetPointF.y - xw31.b(wug0.source_pin_caused_padding, getContext()));
    }

    private final ViewPropertyAnimator getShowHintAnimation(float y) {
        return this.bubble.animate().translationY(y - xw31.b(wug0.bubble_margin_bottom, getContext())).scaleY(1.0f).alpha(1.0f).setStartDelay(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideClientPin$lambda$0(LongSearchViews longSearchViews) {
        longSearchViews.locationPin.setVisibility(8);
    }

    private final void replaceHintMessageAnimated(CharSequence text, float yOffset, long disappearDelayMillis) {
        this.hintMessage.setText(text);
        this.bubble.setVisibility(0);
        this.bubble.bringToFront();
        getShowHintAnimation(yOffset - getHeightHintPadding()).alpha(0.8f).setListener(new AnimUtils$AnimationEndListener(new vg3(this, disappearDelayMillis, 3))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replaceHintMessageAnimated$lambda$0(LongSearchViews longSearchViews, long j) {
        longSearchViews.hideHint(true, Long.valueOf(j));
    }

    private final void showClientPin() {
        this.locationPin.setAlpha(0.0f);
        this.locationPin.setScaleX(0.0f);
        this.locationPin.setScaleY(0.0f);
        this.locationPin.setVisibility(0);
    }

    public final void cancelHintAnimationsIfNeeded() {
        this.bubble.animate().cancel();
    }

    public final void hideClientPin(boolean animated) {
        PinV1Component pinV1Component = this.locationPin;
        if (animated) {
            pinV1Component.animate().translationY(0.0f).alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setListener(new AnimUtils$AnimationEndListener(new fbz(1, this))).start();
        } else {
            pinV1Component.setVisibility(8);
        }
    }

    public final void hideHint(boolean animated, Long startDelayMillis) {
        cancelHintAnimationsIfNeeded();
        if (!animated) {
            this.bubble.setVisibility(8);
            this.hintMessage.setVisibility(8);
        } else {
            ViewPropertyAnimator hideHintAnimation = getHideHintAnimation(500L);
            if (startDelayMillis != null) {
                hideHintAnimation.setStartDelay(startDelayMillis.longValue());
            }
            hideHintAnimation.setListener(null).start();
        }
    }

    public final void removePin(PointF offsetPoint) {
        getPinTranslationAnimator(offsetPoint).alpha(0.0f).start();
    }

    public final void setEta(CharSequence text) {
        if (text == null && this.locationPin.getState() == Pin$State.TEXT) {
            this.locationPin.setState(Pin$State.IN_PROGRESS, true);
        } else {
            this.locationPin.setState(Pin$State.TEXT, true);
            this.locationPin.setPinText(text);
        }
    }

    public final void showHint(CharSequence text, float yOffset) {
        cancelHintAnimationsIfNeeded();
        this.hintMessage.setText(text);
        this.bubble.setVisibility(0);
        this.bubble.setAlpha(0.8f);
        this.bubble.bringToFront();
        getShowHintAnimation(yOffset - getHeightHintPadding()).setListener(null).start();
    }

    public final void showHintAndAnimateDisappearByTimeout(CharSequence text, float yOffset, long timeoutMillis) {
        cancelHintAnimationsIfNeeded();
        replaceHintMessageAnimated(text, yOffset, timeoutMillis);
    }

    public final void translatePin(PointF offsetPointF) {
        float b = xw31.b(wug0.source_pin_caused_padding, getContext());
        this.locationPin.setTranslationY(offsetPointF.y - b);
        this.locationPin.setTranslationX(offsetPointF.x);
        this.locationPin.setAlpha(1.0f);
        this.locationPin.setScaleX(1.0f);
        this.locationPin.setScaleY(1.0f);
        this.bubble.setTranslationY(offsetPointF.y - b);
        this.bubble.setTranslationX(offsetPointF.x);
    }

    public final void translatePinAnimated(PointF offsetPointF) {
        getPinTranslationAnimator(offsetPointF).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setListener(null).start();
    }
}
