package com.anythink.basead.ui.guidetoclickv2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class FingerSlideUpG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    float f10870d;

    /* renamed from: e, reason: collision with root package name */
    float f10871e;

    /* renamed from: f, reason: collision with root package name */
    int f10872f;

    /* renamed from: g, reason: collision with root package name */
    float f10873g;

    /* renamed from: h, reason: collision with root package name */
    private int f10874h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f10875j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f10876k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f10877l;

    /* renamed from: m, reason: collision with root package name */
    private ObjectAnimator f10878m;

    /* renamed from: n, reason: collision with root package name */
    private ObjectAnimator f10879n;

    public FingerSlideUpG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i6) {
        this.f10874h = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (i == 2) {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_finger_slide_up_s", "layout"), this);
            this.i = q.a(getContext(), 44.0f);
            int i9 = this.f10872f;
            if (i9 > 0) {
                setPadding(0, 0, 0, i9);
            }
        } else {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_finger_slide_up", "layout"), this);
            this.i = q.a(getContext(), 178.0f);
            int a9 = q.a(getContext(), 192.0f);
            this.f10872f = a9;
            setPadding(0, 0, 0, a9);
        }
        this.f10876k = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_finger", "id"));
        this.f10875j = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_point", "id"));
        startAnim();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        AnimatorSet animatorSet = this.f10877l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        if (getMeasuredHeight() > 0) {
            this.f10873g = r1 - this.f10872f;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ObjectAnimator objectAnimator = this.f10878m;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f10878m.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f10879n;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f10879n.cancel();
        }
        AnimatorSet animatorSet = this.f10877l;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f10877l.cancel();
            this.f10877l = null;
        }
    }

    public void startAnim() {
        if (this.f10877l == null) {
            ImageView imageView = this.f10876k;
            int i = this.i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, -i, -i);
            this.f10878m = ofFloat;
            ofFloat.setDuration(com.anythink.expressad.f.a.b.aC);
            this.f10878m.setRepeatCount(-1);
            ImageView imageView2 = this.f10875j;
            int i6 = this.i;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "translationY", 0.0f, -i6, -i6);
            this.f10879n = ofFloat2;
            ofFloat2.setDuration(com.anythink.expressad.f.a.b.aC);
            this.f10879n.setRepeatCount(-1);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10877l = animatorSet;
            animatorSet.playTogether(this.f10878m, this.f10879n);
            this.f10877l.start();
        }
    }

    public void updateIsEmptyHalfInterLayout() {
        this.f10872f = q.a(getContext(), 80.0f);
    }

    public FingerSlideUpG2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public FingerSlideUpG2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        AnimatorSet animatorSet = this.f10877l;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (motionEvent.getY() > this.f10873g) {
                return false;
            }
            this.f10870d = motionEvent.getY();
            return true;
        }
        if (action == 1) {
            if (this.f10871e <= this.f10874h) {
                return false;
            }
            c.a aVar = this.f10834c;
            if (aVar != null) {
                aVar.a(11, 48);
            }
            return true;
        }
        if (action != 2) {
            return false;
        }
        this.f10871e = Math.abs(motionEvent.getY() - this.f10870d) + this.f10871e;
        this.f10870d = motionEvent.getY();
        return false;
    }
}
