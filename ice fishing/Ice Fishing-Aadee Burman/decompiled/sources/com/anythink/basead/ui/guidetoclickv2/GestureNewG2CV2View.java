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
    ImageView f10929d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f10930e;

    /* renamed from: f, reason: collision with root package name */
    TextView f10931f;

    /* renamed from: g, reason: collision with root package name */
    AnimatorSet f10932g;

    /* renamed from: h, reason: collision with root package name */
    int f10933h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    ViewGroup f10934j;

    /* renamed from: k, reason: collision with root package name */
    c f10935k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10936l;

    /* renamed from: m, reason: collision with root package name */
    private float f10937m;

    /* renamed from: n, reason: collision with root package name */
    private float f10938n;

    /* renamed from: o, reason: collision with root package name */
    private int f10939o;

    /* renamed from: p, reason: collision with root package name */
    private final int f10940p;

    /* renamed from: q, reason: collision with root package name */
    private final int f10941q;

    /* renamed from: r, reason: collision with root package name */
    private final int f10942r;

    /* renamed from: s, reason: collision with root package name */
    private final int f10943s;

    /* renamed from: t, reason: collision with root package name */
    private final int f10944t;

    /* renamed from: u, reason: collision with root package name */
    private final int f10945u;

    /* renamed from: v, reason: collision with root package name */
    private int f10946v;

    public GestureNewG2CV2View(Context context) {
        super(context);
        this.f10936l = false;
        this.f10940p = 80;
        this.f10941q = 110;
        this.f10942r = -1;
        this.f10943s = 10;
        this.f10944t = 11;
        this.f10945u = 12;
        this.f10946v = -1;
    }

    private void d() {
        if (this.f10932g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10929d, "translationX", this.f10933h, -r5);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f10929d, "translationY", 0.0f, (-this.i) / 2, 0.0f);
            ofFloat2.setDuration(1000L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10932g = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.f10932g.start();
        }
    }

    private void e() {
        AnimatorSet animatorSet = this.f10932g;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f10932g = null;
        }
        if (this.f10932g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10929d, "translationX", this.f10933h, -r5);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f10929d, "translationY", 0.0f, (-this.i) / 2, 0.0f);
            ofFloat2.setDuration(1000L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f10932g = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2);
            this.f10932g.start();
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
        this.f10935k = cVar;
        if (cVar != null) {
            cVar.setCallback(new d() { // from class: com.anythink.basead.ui.guidetoclickv2.GestureNewG2CV2View.1
                @Override // com.anythink.basead.ui.guidetoclickv2.d
                public final boolean a(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        GestureNewG2CV2View.this.f10937m = motionEvent.getX();
                        return true;
                    }
                    if (action == 1) {
                        if (GestureNewG2CV2View.this.f10938n <= GestureNewG2CV2View.this.f10939o) {
                            return false;
                        }
                        c.a aVar = GestureNewG2CV2View.this.f10834c;
                        if (aVar != null) {
                            aVar.a(11, 46);
                        }
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                    GestureNewG2CV2View.b(GestureNewG2CV2View.this, Math.abs(motionEvent.getX() - GestureNewG2CV2View.this.f10937m));
                    GestureNewG2CV2View.this.f10937m = motionEvent.getX();
                    return false;
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f10935k;
        if (cVar != null) {
            cVar.setCallback(null);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        if (getMeasuredWidth() < q.a(getContext(), a.C0060a.f11017b)) {
            c();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < q.a(getContext(), a.C0060a.f11017b)) {
            c();
            return;
        }
        if (measuredHeight >= q.a(getContext(), a.C0060a.f11017b) && measuredHeight < q.a(getContext(), 80.0f)) {
            if (this.f10946v == 12) {
                return;
            }
            this.f10946v = 12;
            this.f10933h = q.a(getContext(), 18.0f);
            this.i = q.a(getContext(), 6.0f);
            ImageView imageView = this.f10930e;
            if (imageView != null) {
                am.a(imageView, q.a(getContext(), 118.0f), q.a(getContext(), 21.0f));
            }
            ImageView imageView2 = this.f10929d;
            if (imageView2 != null) {
                am.a(imageView2, q.a(getContext(), 18.0f), q.a(getContext(), 19.0f));
            }
            TextView textView = this.f10931f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            e();
            return;
        }
        if (measuredHeight < q.a(getContext(), 80.0f) || measuredHeight > q.a(getContext(), 110.0f)) {
            if (this.f10946v == 10) {
                return;
            }
            this.f10946v = 10;
            TextView textView2 = this.f10931f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            e();
            return;
        }
        if (this.f10946v == 11) {
            return;
        }
        this.f10946v = 11;
        this.f10933h = q.a(getContext(), 22.0f);
        this.i = q.a(getContext(), 6.0f);
        ImageView imageView3 = this.f10930e;
        if (imageView3 != null) {
            am.a(imageView3, q.a(getContext(), 142.0f), q.a(getContext(), 24.0f));
        }
        ImageView imageView4 = this.f10929d;
        if (imageView4 != null) {
            am.a(imageView4, q.a(getContext(), 22.0f), q.a(getContext(), 24.0f));
        }
        TextView textView3 = this.f10931f;
        if (textView3 != null) {
            textView3.setVisibility(0);
            if (this.f10931f.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10931f.getLayoutParams();
                layoutParams.topMargin = q.a(getContext(), 2.0f);
                this.f10931f.setLayoutParams(layoutParams);
            }
        }
        e();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        AnimatorSet animatorSet = this.f10932g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public static /* synthetic */ float b(GestureNewG2CV2View gestureNewG2CV2View, float f3) {
        float f9 = gestureNewG2CV2View.f10938n + f3;
        gestureNewG2CV2View.f10938n = f9;
        return f9;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i6) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_gesture_v2", "layout"), this);
        this.f10939o = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f10929d = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_slide_finger", "id"));
        this.f10930e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_white_line", "id"));
        this.f10931f = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_slide_hint", "id"));
        this.f10934j = (ViewGroup) findViewById(q.a(getContext(), "myoffer_g2c_item_container", "id"));
        this.f10933h = q.a(getContext(), 32.0f);
        this.i = q.a(getContext(), 10.0f);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        AnimatorSet animatorSet = this.f10932g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        AnimatorSet animatorSet = this.f10932g;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
