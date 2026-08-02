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
    float f11656d;

    /* renamed from: e, reason: collision with root package name */
    float f11657e;

    /* renamed from: f, reason: collision with root package name */
    int f11658f;

    /* renamed from: g, reason: collision with root package name */
    float f11659g;

    /* renamed from: h, reason: collision with root package name */
    private int f11660h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f11661j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f11662k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f11663l;

    /* renamed from: m, reason: collision with root package name */
    private ObjectAnimator f11664m;

    /* renamed from: n, reason: collision with root package name */
    private ObjectAnimator f11665n;

    public FingerSlideUpG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        this.f11660h = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (i == 2) {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_finger_slide_up_s", "layout"), this);
            this.i = q.a(getContext(), 44.0f);
            int i6 = this.f11658f;
            if (i6 > 0) {
                setPadding(0, 0, 0, i6);
            }
        } else {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_finger_slide_up", "layout"), this);
            this.i = q.a(getContext(), 178.0f);
            int a9 = q.a(getContext(), 192.0f);
            this.f11658f = a9;
            setPadding(0, 0, 0, a9);
        }
        this.f11662k = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_finger", "id"));
        this.f11661j = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_point", "id"));
        startAnim();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        AnimatorSet animatorSet = this.f11663l;
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
            this.f11659g = r1 - this.f11658f;
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
        ObjectAnimator objectAnimator = this.f11664m;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f11664m.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f11665n;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f11665n.cancel();
        }
        AnimatorSet animatorSet = this.f11663l;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f11663l.cancel();
            this.f11663l = null;
        }
    }

    public void startAnim() {
        if (this.f11663l == null) {
            ImageView imageView = this.f11662k;
            int i = this.i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, -i, -i);
            this.f11664m = ofFloat;
            ofFloat.setDuration(com.anythink.expressad.f.a.b.aC);
            this.f11664m.setRepeatCount(-1);
            ImageView imageView2 = this.f11661j;
            int i4 = this.i;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "translationY", 0.0f, -i4, -i4);
            this.f11665n = ofFloat2;
            ofFloat2.setDuration(com.anythink.expressad.f.a.b.aC);
            this.f11665n.setRepeatCount(-1);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f11663l = animatorSet;
            animatorSet.playTogether(this.f11664m, this.f11665n);
            this.f11663l.start();
        }
    }

    public void updateIsEmptyHalfInterLayout() {
        this.f11658f = q.a(getContext(), 80.0f);
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
        AnimatorSet animatorSet = this.f11663l;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (motionEvent.getY() > this.f11659g) {
                return false;
            }
            this.f11656d = motionEvent.getY();
            return true;
        }
        if (action == 1) {
            if (this.f11657e <= this.f11660h) {
                return false;
            }
            c.a aVar = this.f11620c;
            if (aVar != null) {
                aVar.a(11, 48);
            }
            return true;
        }
        if (action != 2) {
            return false;
        }
        this.f11657e = Math.abs(motionEvent.getY() - this.f11656d) + this.f11657e;
        this.f11656d = motionEvent.getY();
        return false;
    }
}
