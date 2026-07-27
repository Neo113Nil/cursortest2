package com.anythink.basead.ui.guidetoclickv2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.guidetoclickv2.a;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class GestureNewG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    ImageView f11086d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f11087e;

    /* renamed from: f, reason: collision with root package name */
    TextView f11088f;

    /* renamed from: g, reason: collision with root package name */
    AnimatorSet f11089g;

    /* renamed from: h, reason: collision with root package name */
    int f11090h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    ViewGroup f11091j;

    /* renamed from: k, reason: collision with root package name */
    c f11092k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11093l;

    /* renamed from: m, reason: collision with root package name */
    private float f11094m;

    /* renamed from: n, reason: collision with root package name */
    private float f11095n;

    /* renamed from: o, reason: collision with root package name */
    private int f11096o;

    /* renamed from: p, reason: collision with root package name */
    private final int f11097p;

    /* renamed from: q, reason: collision with root package name */
    private final int f11098q;

    /* renamed from: r, reason: collision with root package name */
    private final int f11099r;

    /* renamed from: s, reason: collision with root package name */
    private final int f11100s;

    /* renamed from: t, reason: collision with root package name */
    private final int f11101t;

    /* renamed from: u, reason: collision with root package name */
    private final int f11102u;

    /* renamed from: v, reason: collision with root package name */
    private int f11103v;

    public GestureNewG2CV2View(Context context) {
        super(context);
        this.f11093l = false;
        this.f11097p = 80;
        this.f11098q = 110;
        this.f11099r = -1;
        this.f11100s = 10;
        this.f11101t = 11;
        this.f11102u = 12;
        this.f11103v = -1;
    }

    private void d() {
        if (this.f11089g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11086d, "translationX", this.f11090h, -r5);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11086d, "translationY", 0.0f, (-this.i) / 2, 0.0f);
            ofFloat2.setDuration(1000L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f11089g = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.f11089g.start();
        }
    }

    private void e() {
        AnimatorSet animatorSet = this.f11089g;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f11089g = null;
        }
        if (this.f11089g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11086d, "translationX", this.f11090h, -r5);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11086d, "translationY", 0.0f, (-this.i) / 2, 0.0f);
            ofFloat2.setDuration(1000L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f11089g = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2);
            this.f11089g.start();
        }
    }

    private c f() {
        for (ViewParent parent = getParent(); parent.getParent() != null; parent = parent.getParent()) {
            if (parent instanceof c) {
                return (c) parent;
            }
        }
        return null;
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
        this.f11092k = cVar;
        if (cVar != null) {
            cVar.setCallback(new d() { // from class: com.anythink.basead.ui.guidetoclickv2.GestureNewG2CV2View.1
                @Override // com.anythink.basead.ui.guidetoclickv2.d
                public final boolean a(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        GestureNewG2CV2View.this.f11094m = motionEvent.getX();
                        return true;
                    }
                    if (action == 1) {
                        if (GestureNewG2CV2View.this.f11095n <= GestureNewG2CV2View.this.f11096o) {
                            return false;
                        }
                        c.a aVar = GestureNewG2CV2View.this.f10991c;
                        if (aVar != null) {
                            aVar.a(11, 46);
                        }
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                    GestureNewG2CV2View.b(GestureNewG2CV2View.this, Math.abs(motionEvent.getX() - GestureNewG2CV2View.this.f11094m));
                    GestureNewG2CV2View.this.f11094m = motionEvent.getX();
                    return false;
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f11092k;
        if (cVar != null) {
            cVar.setCallback(null);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        if (getMeasuredWidth() < q.a(getContext(), a.C0059a.f11174b)) {
            c();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < q.a(getContext(), a.C0059a.f11174b)) {
            c();
            return;
        }
        if (measuredHeight >= q.a(getContext(), a.C0059a.f11174b) && measuredHeight < q.a(getContext(), 80.0f)) {
            if (this.f11103v == 12) {
                return;
            }
            this.f11103v = 12;
            this.f11090h = q.a(getContext(), 18.0f);
            this.i = q.a(getContext(), 6.0f);
            ImageView imageView = this.f11087e;
            if (imageView != null) {
                am.a(imageView, q.a(getContext(), 118.0f), q.a(getContext(), 21.0f));
            }
            ImageView imageView2 = this.f11086d;
            if (imageView2 != null) {
                am.a(imageView2, q.a(getContext(), 18.0f), q.a(getContext(), 19.0f));
            }
            TextView textView = this.f11088f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            e();
            return;
        }
        if (measuredHeight < q.a(getContext(), 80.0f) || measuredHeight > q.a(getContext(), 110.0f)) {
            if (this.f11103v == 10) {
                return;
            }
            this.f11103v = 10;
            TextView textView2 = this.f11088f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            e();
            return;
        }
        if (this.f11103v == 11) {
            return;
        }
        this.f11103v = 11;
        this.f11090h = q.a(getContext(), 22.0f);
        this.i = q.a(getContext(), 6.0f);
        ImageView imageView3 = this.f11087e;
        if (imageView3 != null) {
            am.a(imageView3, q.a(getContext(), 142.0f), q.a(getContext(), 24.0f));
        }
        ImageView imageView4 = this.f11086d;
        if (imageView4 != null) {
            am.a(imageView4, q.a(getContext(), 22.0f), q.a(getContext(), 24.0f));
        }
        TextView textView3 = this.f11088f;
        if (textView3 != null) {
            textView3.setVisibility(0);
            if (this.f11088f.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11088f.getLayoutParams();
                layoutParams.topMargin = q.a(getContext(), 2.0f);
                this.f11088f.setLayoutParams(layoutParams);
            }
        }
        e();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        AnimatorSet animatorSet = this.f11089g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public static /* synthetic */ float b(GestureNewG2CV2View gestureNewG2CV2View, float f6) {
        float f9 = gestureNewG2CV2View.f11095n + f6;
        gestureNewG2CV2View.f11095n = f9;
        return f9;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_gesture_v2", "layout"), this);
        this.f11096o = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f11086d = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_slide_finger", "id"));
        this.f11087e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_white_line", "id"));
        this.f11088f = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_slide_hint", "id"));
        this.f11091j = (ViewGroup) findViewById(q.a(getContext(), "myoffer_g2c_item_container", "id"));
        this.f11090h = q.a(getContext(), 32.0f);
        this.i = q.a(getContext(), 10.0f);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        AnimatorSet animatorSet = this.f11089g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        AnimatorSet animatorSet = this.f11089g;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
