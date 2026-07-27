package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class GestureG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    ImageView f11074d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f11075e;

    /* renamed from: f, reason: collision with root package name */
    TextView f11076f;

    /* renamed from: g, reason: collision with root package name */
    Animation f11077g;

    /* renamed from: h, reason: collision with root package name */
    int f11078h;
    RelativeLayout i;

    /* renamed from: j, reason: collision with root package name */
    c f11079j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11080k;

    /* renamed from: l, reason: collision with root package name */
    private float f11081l;

    /* renamed from: m, reason: collision with root package name */
    private float f11082m;

    /* renamed from: n, reason: collision with root package name */
    private int f11083n;

    public GestureG2CV2View(Context context) {
        super(context);
        this.f11080k = false;
    }

    private void d() {
        if (this.f11077g == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -this.f11078h, 0.0f, 0.0f);
            this.f11077g = translateAnimation;
            translateAnimation.setDuration(1000L);
            this.f11077g.setRepeatCount(-1);
            this.f11077g.setRepeatMode(2);
            this.f11074d.startAnimation(this.f11077g);
        }
    }

    private c e() {
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
        this.f11079j = cVar;
        if (cVar != null) {
            cVar.setCallback(new d() { // from class: com.anythink.basead.ui.guidetoclickv2.GestureG2CV2View.2
                @Override // com.anythink.basead.ui.guidetoclickv2.d
                public final boolean a(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        GestureG2CV2View.this.f11081l = motionEvent.getX();
                        return true;
                    }
                    if (action == 1) {
                        if (GestureG2CV2View.this.f11082m <= GestureG2CV2View.this.f11083n) {
                            return false;
                        }
                        c.a aVar = GestureG2CV2View.this.f10991c;
                        if (aVar != null) {
                            aVar.a(11, 15);
                        }
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                    GestureG2CV2View.b(GestureG2CV2View.this, Math.abs(motionEvent.getX() - GestureG2CV2View.this.f11081l));
                    GestureG2CV2View.this.f11081l = motionEvent.getX();
                    return false;
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f11079j;
        if (cVar != null) {
            cVar.setCallback(null);
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        Animation animation = this.f11077g;
        if (animation != null) {
            animation.cancel();
        }
    }

    public void setVerticalLandscape(boolean z8) {
        this.f11080k = z8;
    }

    public static /* synthetic */ float b(GestureG2CV2View gestureG2CV2View, float f6) {
        float f9 = gestureG2CV2View.f11082m + f6;
        gestureG2CV2View.f11082m = f9;
        return f9;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_gesture", "layout"), this);
        this.f11083n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f11074d = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_slide_finger", "id"));
        this.f11075e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_white_line", "id"));
        this.f11076f = (TextView) findViewById(q.a(getContext(), "myoffer_g2c_slide_hint", "id"));
        this.i = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_g2c_item_container", "id"));
        this.f11078h = q.a(getContext(), 36.0f);
        if (i == 1 || i == 3) {
            this.i.setBackgroundResource(q.a(getContext(), "myoffer_g2c_gesture_bg", k.f19790c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(q.a(getContext(), 270.0f), q.a(getContext(), 100.0f));
            layoutParams.addRule(13);
            this.i.setLayoutParams(layoutParams);
            this.f11075e.setVisibility(0);
        } else if (i == 2) {
            this.i.setBackgroundColor(Color.parseColor("#80000000"));
            this.f11075e.setVisibility(0);
            if (this.f11080k) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f11075e.getLayoutParams();
                layoutParams2.width = q.a(getContext(), 240.0f);
                this.f11075e.setLayoutParams(layoutParams2);
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.f11074d.getLayoutParams();
            layoutParams3.height = q.a(getContext(), 24.0f);
            layoutParams3.width = q.a(getContext(), 24.0f);
            this.f11078h = q.a(getContext(), 24.0f);
            this.f11074d.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f11075e.getLayoutParams();
            layoutParams4.width = q.a(getContext(), 150.0f);
            layoutParams4.height = q.a(getContext(), 4.0f);
            layoutParams4.setMargins(layoutParams4.leftMargin, layoutParams4.topMargin, layoutParams4.rightMargin, q.a(getContext(), 8.0f));
            this.f11075e.setLayoutParams(layoutParams4);
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f11076f.getLayoutParams();
            layoutParams5.setMargins(q.a(getContext(), 8.0f), layoutParams5.topMargin, layoutParams5.rightMargin, layoutParams5.bottomMargin);
            this.f11076f.setTextSize(1, 10.0f);
            setBackgroundColor(Color.parseColor("#80000000"));
            post(new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.GestureG2CV2View.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (GestureG2CV2View.this.getMeasuredWidth() < q.a(GestureG2CV2View.this.getContext(), 182.0f)) {
                        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) GestureG2CV2View.this.f11075e.getLayoutParams();
                        layoutParams6.width = -1;
                        GestureG2CV2View.this.f11075e.setLayoutParams(layoutParams6);
                    }
                    GestureG2CV2View.this.f11075e.setVisibility(0);
                }
            });
        }
        if (this.f11077g == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -this.f11078h, 0.0f, 0.0f);
            this.f11077g = translateAnimation;
            translateAnimation.setDuration(1000L);
            this.f11077g.setRepeatCount(-1);
            this.f11077g.setRepeatMode(2);
            this.f11074d.startAnimation(this.f11077g);
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        Animation animation = this.f11077g;
        if (animation != null) {
            animation.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        Animation animation = this.f11077g;
        if (animation != null) {
            animation.start();
        }
    }
}
