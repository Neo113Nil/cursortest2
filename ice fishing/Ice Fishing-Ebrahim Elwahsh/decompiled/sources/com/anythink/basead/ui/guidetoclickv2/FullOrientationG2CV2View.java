package com.anythink.basead.ui.guidetoclickv2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class FullOrientationG2CV2View extends BaseG2CV2View {
    public static final int DEFAULT_SIZE = 120;

    /* renamed from: d, reason: collision with root package name */
    ValueAnimator f11037d;

    /* renamed from: e, reason: collision with root package name */
    ViewGroup f11038e;

    /* renamed from: f, reason: collision with root package name */
    ImageView f11039f;

    /* renamed from: g, reason: collision with root package name */
    c f11040g;

    /* renamed from: h, reason: collision with root package name */
    RelativeLayout.LayoutParams f11041h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private float f11042j;

    /* renamed from: k, reason: collision with root package name */
    private float f11043k;

    /* renamed from: l, reason: collision with root package name */
    private float f11044l;

    /* renamed from: m, reason: collision with root package name */
    private float f11045m;

    /* renamed from: n, reason: collision with root package name */
    private int f11046n;

    /* renamed from: o, reason: collision with root package name */
    private int f11047o;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.FullOrientationG2CV2View$1, reason: invalid class name */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass1() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (FullOrientationG2CV2View.this.f11039f != null) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = FullOrientationG2CV2View.this.i % 4;
                if (i == 1) {
                    FullOrientationG2CV2View.this.f11039f.setTranslationY(floatValue);
                    return;
                }
                if (i == 2) {
                    FullOrientationG2CV2View.this.f11039f.setTranslationX(-floatValue);
                } else if (i != 3) {
                    FullOrientationG2CV2View.this.f11039f.setTranslationY(-floatValue);
                } else {
                    FullOrientationG2CV2View.this.f11039f.setTranslationX(floatValue);
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.FullOrientationG2CV2View$2, reason: invalid class name */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            FullOrientationG2CV2View.b(FullOrientationG2CV2View.this);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f11051a = 501;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11052b = 502;

        /* renamed from: c, reason: collision with root package name */
        public static final int f11053c = 504;

        /* renamed from: d, reason: collision with root package name */
        public static final int f11054d = 505;

        /* renamed from: e, reason: collision with root package name */
        public static final int f11055e = 507;
    }

    public FullOrientationG2CV2View(Context context) {
        super(context);
        this.i = 0;
        this.f11047o = q.a(getContext(), 120.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        c cVar;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent.getParent() == null) {
                cVar = null;
                break;
            } else {
                if (parent instanceof c) {
                    cVar = (c) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        this.f11040g = cVar;
        if (cVar != null) {
            cVar.setCallback(new d() { // from class: com.anythink.basead.ui.guidetoclickv2.FullOrientationG2CV2View.3
                @Override // com.anythink.basead.ui.guidetoclickv2.d
                public final boolean a(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        FullOrientationG2CV2View.this.f11042j = motionEvent.getX();
                        FullOrientationG2CV2View.this.f11043k = motionEvent.getY();
                        return true;
                    }
                    if (action != 1) {
                        if (action == 2) {
                            float x3 = motionEvent.getX() - FullOrientationG2CV2View.this.f11042j;
                            float y6 = motionEvent.getY() - FullOrientationG2CV2View.this.f11043k;
                            FullOrientationG2CV2View.c(FullOrientationG2CV2View.this, Math.abs(x3));
                            FullOrientationG2CV2View.d(FullOrientationG2CV2View.this, Math.abs(y6));
                            FullOrientationG2CV2View.this.f11042j = motionEvent.getX();
                            FullOrientationG2CV2View.this.f11043k = motionEvent.getY();
                            return false;
                        }
                        if (action != 3) {
                            return false;
                        }
                    }
                    if (FullOrientationG2CV2View.this.f11045m + FullOrientationG2CV2View.this.f11044l <= FullOrientationG2CV2View.this.f11046n) {
                        return false;
                    }
                    c.a aVar = FullOrientationG2CV2View.this.f10991c;
                    if (aVar != null) {
                        aVar.a(11, 21);
                    }
                    return true;
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f11040g;
        if (cVar != null) {
            cVar.setCallback(null);
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ValueAnimator valueAnimator = this.f11037d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setViewMode(int i) {
        int i4 = this.f11047o;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, i4);
        this.f11041h = layoutParams;
        if (i == 502 || i == 504 || i == 505) {
            layoutParams.addRule(13);
            return;
        }
        layoutParams.addRule(12);
        this.f11041h.addRule(14);
        this.f11041h.addRule(14);
        this.f11041h.setMargins(0, 0, 0, q.a(getContext(), 140.0f));
    }

    public void updateSize(int i) {
        int i4 = (int) (i * 0.72f);
        RelativeLayout.LayoutParams layoutParams = this.f11041h;
        layoutParams.width = -2;
        layoutParams.height = i4;
        this.f11038e.setBackgroundColor(0);
        View findViewById = findViewById(q.a(getContext(), "myoffer_g2c_fullori_bg", "id"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, i4);
        layoutParams2.width = i4;
        layoutParams2.height = i4;
        layoutParams2.topMargin = 0;
        layoutParams2.addRule(15);
        findViewById.setLayoutParams(layoutParams2);
        this.f11039f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_fullori_finger", "id"));
        float f6 = i4;
        float f9 = f6 * 0.5f;
        int i9 = (int) f9;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i9, i9);
        layoutParams3.topMargin = 0;
        layoutParams3.leftMargin = (int) ((f6 - f9) * 0.5f);
        layoutParams3.addRule(15);
        this.f11039f.setLayoutParams(layoutParams3);
        TextView textView = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_fullori_text", "id"));
        textView.setTextSize(2, 10.0f);
        textView.setText(q.a(getContext(), "myoffer_g2c_fuu_ori_hint_small", k.f19794g));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.width = -2;
        layoutParams4.topMargin = 0;
        layoutParams4.leftMargin = q.a(getContext(), 10.0f);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, findViewById.getId());
        textView.setLayoutParams(layoutParams4);
        this.f11038e.setLayoutParams(this.f11041h);
    }

    public static /* synthetic */ int b(FullOrientationG2CV2View fullOrientationG2CV2View) {
        int i = fullOrientationG2CV2View.i;
        fullOrientationG2CV2View.i = i + 1;
        return i;
    }

    public static /* synthetic */ float c(FullOrientationG2CV2View fullOrientationG2CV2View, float f6) {
        float f9 = fullOrientationG2CV2View.f11044l + f6;
        fullOrientationG2CV2View.f11044l = f9;
        return f9;
    }

    public static /* synthetic */ float d(FullOrientationG2CV2View fullOrientationG2CV2View, float f6) {
        float f9 = fullOrientationG2CV2View.f11045m + f6;
        fullOrientationG2CV2View.f11045m = f9;
        return f9;
    }

    private c e() {
        for (ViewParent parent = getParent(); parent.getParent() != null; parent = parent.getParent()) {
            if (parent instanceof c) {
                return (c) parent;
            }
        }
        return null;
    }

    private void d() {
        if (this.f11037d == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, q.a(getContext(), 12.0f), 0.0f);
            this.f11037d = ofFloat;
            ofFloat.setDuration(500L);
            this.f11037d.setRepeatCount(-1);
            this.f11037d.addUpdateListener(new AnonymousClass1());
            this.f11037d.addListener(new AnonymousClass2());
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_full_orientation", "layout"), this);
        this.f11046n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ViewGroup viewGroup = (ViewGroup) findViewById(q.a(getContext(), "myoffer_g2c_fullori_container", "id"));
        this.f11038e = viewGroup;
        RelativeLayout.LayoutParams layoutParams = this.f11041h;
        if (layoutParams != null) {
            viewGroup.setLayoutParams(layoutParams);
        }
        this.f11039f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_fullori_finger", "id"));
        if (this.f11037d == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, q.a(getContext(), 12.0f), 0.0f);
            this.f11037d = ofFloat;
            ofFloat.setDuration(500L);
            this.f11037d.setRepeatCount(-1);
            this.f11037d.addUpdateListener(new AnonymousClass1());
            this.f11037d.addListener(new AnonymousClass2());
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        ValueAnimator valueAnimator = this.f11037d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        ValueAnimator valueAnimator = this.f11037d;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
