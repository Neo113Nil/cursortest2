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
    ImageView f11715d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f11716e;

    /* renamed from: f, reason: collision with root package name */
    TextView f11717f;

    /* renamed from: g, reason: collision with root package name */
    AnimatorSet f11718g;

    /* renamed from: h, reason: collision with root package name */
    int f11719h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    ViewGroup f11720j;

    /* renamed from: k, reason: collision with root package name */
    c f11721k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11722l;

    /* renamed from: m, reason: collision with root package name */
    private float f11723m;

    /* renamed from: n, reason: collision with root package name */
    private float f11724n;

    /* renamed from: o, reason: collision with root package name */
    private int f11725o;

    /* renamed from: p, reason: collision with root package name */
    private final int f11726p;

    /* renamed from: q, reason: collision with root package name */
    private final int f11727q;

    /* renamed from: r, reason: collision with root package name */
    private final int f11728r;

    /* renamed from: s, reason: collision with root package name */
    private final int f11729s;

    /* renamed from: t, reason: collision with root package name */
    private final int f11730t;

    /* renamed from: u, reason: collision with root package name */
    private final int f11731u;

    /* renamed from: v, reason: collision with root package name */
    private int f11732v;

    public GestureNewG2CV2View(Context context) {
        super(context);
        this.f11722l = false;
        this.f11726p = 80;
        this.f11727q = 110;
        this.f11728r = -1;
        this.f11729s = 10;
        this.f11730t = 11;
        this.f11731u = 12;
        this.f11732v = -1;
    }

    private void d() {
        if (this.f11718g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11715d, "translationX", this.f11719h, -r5);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11715d, "translationY", 0.0f, (-this.i) / 2, 0.0f);
            ofFloat2.setDuration(1000L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f11718g = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.f11718g.start();
        }
    }

    private void e() {
        AnimatorSet animatorSet = this.f11718g;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f11718g = null;
        }
        if (this.f11718g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11715d, "translationX", this.f11719h, -r5);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11715d, "translationY", 0.0f, (-this.i) / 2, 0.0f);
            ofFloat2.setDuration(1000L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f11718g = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2);
            this.f11718g.start();
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
        this.f11721k = cVar;
        if (cVar != null) {
            cVar.setCallback(new d() { // from class: com.anythink.basead.ui.guidetoclickv2.GestureNewG2CV2View.1
                @Override // com.anythink.basead.ui.guidetoclickv2.d
                public final boolean a(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        GestureNewG2CV2View.this.f11723m = motionEvent.getX();
                        return true;
                    }
                    if (action == 1) {
                        if (GestureNewG2CV2View.this.f11724n <= GestureNewG2CV2View.this.f11725o) {
                            return false;
                        }
                        c.a aVar = GestureNewG2CV2View.this.f11620c;
                        if (aVar != null) {
                            aVar.a(11, 46);
                        }
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                    GestureNewG2CV2View.b(GestureNewG2CV2View.this, Math.abs(motionEvent.getX() - GestureNewG2CV2View.this.f11723m));
                    GestureNewG2CV2View.this.f11723m = motionEvent.getX();
                    return false;
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f11721k;
        if (cVar != null) {
            cVar.setCallback(null);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        if (getMeasuredWidth() < q.a(getContext(), a.C0060a.f11803b)) {
            c();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < q.a(getContext(), a.C0060a.f11803b)) {
            c();
            return;
        }
        if (measuredHeight >= q.a(getContext(), a.C0060a.f11803b) && measuredHeight < q.a(getContext(), 80.0f)) {
            if (this.f11732v == 12) {
                return;
            }
            this.f11732v = 12;
            this.f11719h = q.a(getContext(), 18.0f);
            this.i = q.a(getContext(), 6.0f);
            ImageView imageView = this.f11716e;
            if (imageView != null) {
                am.a(imageView, q.a(getContext(), 118.0f), q.a(getContext(), 21.0f));
            }
            ImageView imageView2 = this.f11715d;
            if (imageView2 != null) {
                am.a(imageView2, q.a(getContext(), 18.0f), q.a(getContext(), 19.0f));
            }
            TextView textView = this.f11717f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            e();
            return;
        }
        if (measuredHeight < q.a(getContext(), 80.0f) || measuredHeight > q.a(getContext(), 110.0f)) {
            if (this.f11732v == 10) {
                return;
            }
            this.f11732v = 10;
            TextView textView2 = this.f11717f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            e();
            return;
        }
        if (this.f11732v == 11) {
            return;
        }
        this.f11732v = 11;
        this.f11719h = q.a(getContext(), 22.0f);
        this.i = q.a(getContext(), 6.0f);
        ImageView imageView3 = this.f11716e;
        if (imageView3 != null) {
            am.a(imageView3, q.a(getContext(), 142.0f), q.a(getContext(), 24.0f));
        }
        ImageView imageView4 = this.f11715d;
        if (imageView4 != null) {
            am.a(imageView4, q.a(getContext(), 22.0f), q.a(getContext(), 24.0f));
        }
        TextView textView3 = this.f11717f;
        if (textView3 != null) {
            textView3.setVisibility(0);
            if (this.f11717f.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11717f.getLayoutParams();
                layoutParams.topMargin = q.a(getContext(), 2.0f);
                this.f11717f.setLayoutParams(layoutParams);
            }
        }
        e();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        AnimatorSet animatorSet = this.f11718g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public static /* synthetic */ float b(GestureNewG2CV2View gestureNewG2CV2View, float f2) {
        float f9 = gestureNewG2CV2View.f11724n + f2;
        gestureNewG2CV2View.f11724n = f9;
        return f9;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_gesture_v2", "layout"), this);
        this.f11725o = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f11715d = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_slide_finger", "id"));
        this.f11716e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_white_line", "id"));
        this.f11717f = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_slide_hint", "id"));
        this.f11720j = (ViewGroup) findViewById(q.a(getContext(), "myoffer_g2c_item_container", "id"));
        this.f11719h = q.a(getContext(), 32.0f);
        this.i = q.a(getContext(), 10.0f);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        AnimatorSet animatorSet = this.f11718g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        AnimatorSet animatorSet = this.f11718g;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
