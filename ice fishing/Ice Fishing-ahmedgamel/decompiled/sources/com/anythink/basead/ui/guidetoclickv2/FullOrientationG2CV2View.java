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
    ValueAnimator f11666d;

    /* renamed from: e, reason: collision with root package name */
    ViewGroup f11667e;

    /* renamed from: f, reason: collision with root package name */
    ImageView f11668f;

    /* renamed from: g, reason: collision with root package name */
    c f11669g;

    /* renamed from: h, reason: collision with root package name */
    RelativeLayout.LayoutParams f11670h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private float f11671j;

    /* renamed from: k, reason: collision with root package name */
    private float f11672k;

    /* renamed from: l, reason: collision with root package name */
    private float f11673l;

    /* renamed from: m, reason: collision with root package name */
    private float f11674m;

    /* renamed from: n, reason: collision with root package name */
    private int f11675n;

    /* renamed from: o, reason: collision with root package name */
    private int f11676o;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.FullOrientationG2CV2View$1, reason: invalid class name */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass1() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (FullOrientationG2CV2View.this.f11668f != null) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = FullOrientationG2CV2View.this.i % 4;
                if (i == 1) {
                    FullOrientationG2CV2View.this.f11668f.setTranslationY(floatValue);
                    return;
                }
                if (i == 2) {
                    FullOrientationG2CV2View.this.f11668f.setTranslationX(-floatValue);
                } else if (i != 3) {
                    FullOrientationG2CV2View.this.f11668f.setTranslationY(-floatValue);
                } else {
                    FullOrientationG2CV2View.this.f11668f.setTranslationX(floatValue);
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
        public static final int f11680a = 501;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11681b = 502;

        /* renamed from: c, reason: collision with root package name */
        public static final int f11682c = 504;

        /* renamed from: d, reason: collision with root package name */
        public static final int f11683d = 505;

        /* renamed from: e, reason: collision with root package name */
        public static final int f11684e = 507;
    }

    public FullOrientationG2CV2View(Context context) {
        super(context);
        this.i = 0;
        this.f11676o = q.a(getContext(), 120.0f);
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
        this.f11669g = cVar;
        if (cVar != null) {
            cVar.setCallback(new d() { // from class: com.anythink.basead.ui.guidetoclickv2.FullOrientationG2CV2View.3
                @Override // com.anythink.basead.ui.guidetoclickv2.d
                public final boolean a(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        FullOrientationG2CV2View.this.f11671j = motionEvent.getX();
                        FullOrientationG2CV2View.this.f11672k = motionEvent.getY();
                        return true;
                    }
                    if (action != 1) {
                        if (action == 2) {
                            float x9 = motionEvent.getX() - FullOrientationG2CV2View.this.f11671j;
                            float y7 = motionEvent.getY() - FullOrientationG2CV2View.this.f11672k;
                            FullOrientationG2CV2View.c(FullOrientationG2CV2View.this, Math.abs(x9));
                            FullOrientationG2CV2View.d(FullOrientationG2CV2View.this, Math.abs(y7));
                            FullOrientationG2CV2View.this.f11671j = motionEvent.getX();
                            FullOrientationG2CV2View.this.f11672k = motionEvent.getY();
                            return false;
                        }
                        if (action != 3) {
                            return false;
                        }
                    }
                    if (FullOrientationG2CV2View.this.f11674m + FullOrientationG2CV2View.this.f11673l <= FullOrientationG2CV2View.this.f11675n) {
                        return false;
                    }
                    c.a aVar = FullOrientationG2CV2View.this.f11620c;
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
        c cVar = this.f11669g;
        if (cVar != null) {
            cVar.setCallback(null);
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ValueAnimator valueAnimator = this.f11666d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setViewMode(int i) {
        int i4 = this.f11676o;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, i4);
        this.f11670h = layoutParams;
        if (i == 502 || i == 504 || i == 505) {
            layoutParams.addRule(13);
            return;
        }
        layoutParams.addRule(12);
        this.f11670h.addRule(14);
        this.f11670h.addRule(14);
        this.f11670h.setMargins(0, 0, 0, q.a(getContext(), 140.0f));
    }

    public void updateSize(int i) {
        int i4 = (int) (i * 0.72f);
        RelativeLayout.LayoutParams layoutParams = this.f11670h;
        layoutParams.width = -2;
        layoutParams.height = i4;
        this.f11667e.setBackgroundColor(0);
        View findViewById = findViewById(q.a(getContext(), "myoffer_g2c_fullori_bg", "id"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, i4);
        layoutParams2.width = i4;
        layoutParams2.height = i4;
        layoutParams2.topMargin = 0;
        layoutParams2.addRule(15);
        findViewById.setLayoutParams(layoutParams2);
        this.f11668f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_fullori_finger", "id"));
        float f2 = i4;
        float f9 = f2 * 0.5f;
        int i6 = (int) f9;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i6, i6);
        layoutParams3.topMargin = 0;
        layoutParams3.leftMargin = (int) ((f2 - f9) * 0.5f);
        layoutParams3.addRule(15);
        this.f11668f.setLayoutParams(layoutParams3);
        TextView textView = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_fullori_text", "id"));
        textView.setTextSize(2, 10.0f);
        textView.setText(q.a(getContext(), "myoffer_g2c_fuu_ori_hint_small", k.f20423g));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.width = -2;
        layoutParams4.topMargin = 0;
        layoutParams4.leftMargin = q.a(getContext(), 10.0f);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, findViewById.getId());
        textView.setLayoutParams(layoutParams4);
        this.f11667e.setLayoutParams(this.f11670h);
    }

    public static /* synthetic */ int b(FullOrientationG2CV2View fullOrientationG2CV2View) {
        int i = fullOrientationG2CV2View.i;
        fullOrientationG2CV2View.i = i + 1;
        return i;
    }

    public static /* synthetic */ float c(FullOrientationG2CV2View fullOrientationG2CV2View, float f2) {
        float f9 = fullOrientationG2CV2View.f11673l + f2;
        fullOrientationG2CV2View.f11673l = f9;
        return f9;
    }

    public static /* synthetic */ float d(FullOrientationG2CV2View fullOrientationG2CV2View, float f2) {
        float f9 = fullOrientationG2CV2View.f11674m + f2;
        fullOrientationG2CV2View.f11674m = f9;
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
        if (this.f11666d == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, q.a(getContext(), 12.0f), 0.0f);
            this.f11666d = ofFloat;
            ofFloat.setDuration(500L);
            this.f11666d.setRepeatCount(-1);
            this.f11666d.addUpdateListener(new AnonymousClass1());
            this.f11666d.addListener(new AnonymousClass2());
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_full_orientation", "layout"), this);
        this.f11675n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ViewGroup viewGroup = (ViewGroup) findViewById(q.a(getContext(), "myoffer_g2c_fullori_container", "id"));
        this.f11667e = viewGroup;
        RelativeLayout.LayoutParams layoutParams = this.f11670h;
        if (layoutParams != null) {
            viewGroup.setLayoutParams(layoutParams);
        }
        this.f11668f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_fullori_finger", "id"));
        if (this.f11666d == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, q.a(getContext(), 12.0f), 0.0f);
            this.f11666d = ofFloat;
            ofFloat.setDuration(500L);
            this.f11666d.setRepeatCount(-1);
            this.f11666d.addUpdateListener(new AnonymousClass1());
            this.f11666d.addListener(new AnonymousClass2());
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        ValueAnimator valueAnimator = this.f11666d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        ValueAnimator valueAnimator = this.f11666d;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
