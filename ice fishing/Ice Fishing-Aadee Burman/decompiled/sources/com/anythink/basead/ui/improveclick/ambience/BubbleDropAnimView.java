package com.anythink.basead.ui.improveclick.ambience;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.ambience.BubbleDropChildView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class BubbleDropAnimView extends BaseAmbienceView {

    /* renamed from: b, reason: collision with root package name */
    boolean f11110b;

    /* renamed from: c, reason: collision with root package name */
    boolean f11111c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11112d;

    /* renamed from: e, reason: collision with root package name */
    private BubbleDropChildView f11113e;

    /* renamed from: f, reason: collision with root package name */
    private ObjectAnimator f11114f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f11115g;

    /* renamed from: h, reason: collision with root package name */
    private int f11116h;
    private boolean i;

    public BubbleDropAnimView(Context context) {
        super(context);
        this.f11112d = 4000;
        this.f11110b = false;
        this.f11111c = false;
        this.i = false;
    }

    @Override // com.anythink.basead.ui.improveclick.ambience.BaseAmbienceView
    public void initSetting(x xVar, c.a aVar) {
        this.f11109a = aVar;
    }

    @Override // com.anythink.basead.ui.improveclick.ambience.BaseAmbienceView
    public void initView() {
        RelativeLayout.LayoutParams layoutParams;
        BubbleDropChildView bubbleDropChildView = new BubbleDropChildView(getContext());
        this.f11113e = bubbleDropChildView;
        bubbleDropChildView.initSetting(new BubbleDropChildView.a() { // from class: com.anythink.basead.ui.improveclick.ambience.BubbleDropAnimView.1
            @Override // com.anythink.basead.ui.improveclick.ambience.BubbleDropChildView.a
            public final void a() {
                c.a aVar = BubbleDropAnimView.this.f11109a;
                if (aVar != null) {
                    aVar.a(17, 49);
                }
            }
        });
        Bitmap c9 = g.a().c(b.d.f12117b);
        this.f11115g = c9;
        if (c9 == null || c9.isRecycled()) {
            release();
            return;
        }
        if (q.c(getContext())) {
            layoutParams = new RelativeLayout.LayoutParams(getContext().getResources().getDisplayMetrics().heightPixels, -1);
            layoutParams.addRule(13);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        addView(this.f11113e, layoutParams);
        this.f11113e.post(new Runnable() { // from class: com.anythink.basead.ui.improveclick.ambience.BubbleDropAnimView.2
            @Override // java.lang.Runnable
            public final void run() {
                BubbleDropAnimView bubbleDropAnimView = BubbleDropAnimView.this;
                bubbleDropAnimView.f11116h = bubbleDropAnimView.f11113e.getMeasuredHeight();
                BubbleDropAnimView.this.b();
            }
        });
    }

    @Override // com.anythink.basead.ui.improveclick.ambience.BaseAmbienceView
    public void onPause() {
        ObjectAnimator objectAnimator = this.f11114f;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    @Override // com.anythink.basead.ui.improveclick.ambience.BaseAmbienceView
    public void onResume() {
        ObjectAnimator objectAnimator = this.f11114f;
        if (objectAnimator != null) {
            if (objectAnimator.isPaused()) {
                this.f11114f.resume();
            } else {
                b();
            }
        }
    }

    @Override // com.anythink.basead.ui.improveclick.ambience.BaseAmbienceView
    public void release() {
        if (this.i) {
            return;
        }
        BubbleDropChildView bubbleDropChildView = this.f11113e;
        if (bubbleDropChildView != null) {
            bubbleDropChildView.release();
        }
        a();
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BubbleDropChildView bubbleDropChildView = this.f11113e;
        if (bubbleDropChildView == null) {
            return;
        }
        if (this.f11114f == null && !this.f11111c) {
            bubbleDropChildView.setVisibility(0);
            this.f11113e.initRedPacketList(this.f11115g);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11113e, "translationY", -r3, this.f11116h);
            this.f11114f = ofFloat;
            ofFloat.setRepeatCount(0);
            this.f11114f.setDuration(4000L);
            this.f11114f.setInterpolator(new LinearInterpolator());
            this.f11114f.addListener(new Animator.AnimatorListener() { // from class: com.anythink.basead.ui.improveclick.ambience.BubbleDropAnimView.3
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    BubbleDropAnimView.this.f11111c = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
        ObjectAnimator objectAnimator = this.f11114f;
        if (objectAnimator != null && !objectAnimator.isStarted() && !this.f11111c) {
            this.f11113e.setTranslationY(-this.f11116h);
            this.f11114f.start();
        }
        this.f11110b = true;
        this.i = false;
    }

    private void a() {
        BubbleDropChildView bubbleDropChildView = this.f11113e;
        if (bubbleDropChildView != null) {
            bubbleDropChildView.setTranslationY(-this.f11116h);
        }
        ObjectAnimator objectAnimator = this.f11114f;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f11114f.cancel();
            this.f11114f = null;
        }
        this.f11110b = false;
    }

    public BubbleDropAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11112d = 4000;
        this.f11110b = false;
        this.f11111c = false;
        this.i = false;
    }

    public BubbleDropAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11112d = 4000;
        this.f11110b = false;
        this.f11111c = false;
        this.i = false;
    }
}
