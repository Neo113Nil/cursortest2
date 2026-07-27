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
    float f11027d;

    /* renamed from: e, reason: collision with root package name */
    float f11028e;

    /* renamed from: f, reason: collision with root package name */
    int f11029f;

    /* renamed from: g, reason: collision with root package name */
    float f11030g;

    /* renamed from: h, reason: collision with root package name */
    private int f11031h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f11032j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f11033k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f11034l;

    /* renamed from: m, reason: collision with root package name */
    private ObjectAnimator f11035m;

    /* renamed from: n, reason: collision with root package name */
    private ObjectAnimator f11036n;

    public FingerSlideUpG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        this.f11031h = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (i == 2) {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_finger_slide_up_s", "layout"), this);
            this.i = q.a(getContext(), 44.0f);
            int i9 = this.f11029f;
            if (i9 > 0) {
                setPadding(0, 0, 0, i9);
            }
        } else {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_finger_slide_up", "layout"), this);
            this.i = q.a(getContext(), 178.0f);
            int a9 = q.a(getContext(), 192.0f);
            this.f11029f = a9;
            setPadding(0, 0, 0, a9);
        }
        this.f11033k = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_finger", "id"));
        this.f11032j = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_point", "id"));
        startAnim();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        AnimatorSet animatorSet = this.f11034l;
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
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (getMeasuredHeight() > 0) {
            this.f11030g = r1 - this.f11029f;
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
        ObjectAnimator objectAnimator = this.f11035m;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f11035m.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f11036n;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f11036n.cancel();
        }
        AnimatorSet animatorSet = this.f11034l;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f11034l.cancel();
            this.f11034l = null;
        }
    }

    public void startAnim() {
        if (this.f11034l == null) {
            ImageView imageView = this.f11033k;
            int i = this.i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, -i, -i);
            this.f11035m = ofFloat;
            ofFloat.setDuration(com.anythink.expressad.f.a.b.aC);
            this.f11035m.setRepeatCount(-1);
            ImageView imageView2 = this.f11032j;
            int i4 = this.i;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "translationY", 0.0f, -i4, -i4);
            this.f11036n = ofFloat2;
            ofFloat2.setDuration(com.anythink.expressad.f.a.b.aC);
            this.f11036n.setRepeatCount(-1);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f11034l = animatorSet;
            animatorSet.playTogether(this.f11035m, this.f11036n);
            this.f11034l.start();
        }
    }

    public void updateIsEmptyHalfInterLayout() {
        this.f11029f = q.a(getContext(), 80.0f);
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
        AnimatorSet animatorSet = this.f11034l;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (motionEvent.getY() > this.f11030g) {
                return false;
            }
            this.f11027d = motionEvent.getY();
            return true;
        }
        if (action == 1) {
            if (this.f11028e <= this.f11031h) {
                return false;
            }
            c.a aVar = this.f10991c;
            if (aVar != null) {
                aVar.a(11, 48);
            }
            return true;
        }
        if (action != 2) {
            return false;
        }
        this.f11028e = Math.abs(motionEvent.getY() - this.f11027d) + this.f11028e;
        this.f11027d = motionEvent.getY();
        return false;
    }
}
