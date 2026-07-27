package com.anythink.basead.ui.animplayerview.scale;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.basead.ui.WrapRoundImageView;
import com.anythink.basead.ui.animplayerview.a;
import com.anythink.basead.ui.animplayerview.b;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.h;
import java.util.List;

/* loaded from: classes.dex */
public class AlbumScaleMainView extends FrameLayout implements Handler.Callback, b {
    public static final int MAIN_VIEW_INIT_HEIGHT = 42;
    public static final int MAIN_VIEW_INIT_WIDTH = 90;

    /* renamed from: a, reason: collision with root package name */
    private final int f10563a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10564b;

    /* renamed from: c, reason: collision with root package name */
    private RoundImageView f10565c;

    /* renamed from: d, reason: collision with root package name */
    private WrapRoundImageView f10566d;

    /* renamed from: e, reason: collision with root package name */
    private AlbumScaleMainView f10567e;

    /* renamed from: f, reason: collision with root package name */
    private AnimatorSet f10568f;

    /* renamed from: g, reason: collision with root package name */
    private AnimatorSet f10569g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f10570h;
    private long i;

    /* renamed from: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView$3, reason: invalid class name */
    public class AnonymousClass3 extends a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.basead.ui.animplayerview.a, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AlbumScaleMainView.this.f10570h.sendEmptyMessageDelayed(100, 500L);
        }
    }

    /* renamed from: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView$4, reason: invalid class name */
    public class AnonymousClass4 extends a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.basead.ui.animplayerview.a, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (AlbumScaleMainView.this.f10570h != null) {
                AlbumScaleMainView.this.f10570h.sendEmptyMessageDelayed(100, 500L);
            }
        }
    }

    public AlbumScaleMainView(Context context) {
        this(context, null);
    }

    public float getMainViewScale() {
        if (getLayoutParams() == null) {
            return 1.0f;
        }
        return Math.min(getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels) / Math.min(r0.width, r0.height);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AlbumScaleMainView albumScaleMainView;
        if (message.what == 100 && (albumScaleMainView = this.f10567e) != null) {
            if (albumScaleMainView.getVisibility() != 0) {
                this.f10567e.setVisibility(0);
            }
            if (this.f10569g == null) {
                this.f10569g = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10567e, "scaleX", 1.0f, 1.3f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f10567e, "scaleY", 1.0f, 1.3f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f10567e, "alpha", 0.4f, 0.0f);
                this.f10569g.setDuration(500L);
                this.f10569g.setInterpolator(new LinearInterpolator());
                this.f10569g.playTogether(ofFloat, ofFloat2, ofFloat3);
                this.f10569g.addListener(new AnonymousClass4());
            }
            AnimatorSet animatorSet = this.f10569g;
            if (animatorSet != null && !animatorSet.isStarted()) {
                this.f10569g.start();
            }
        }
        return false;
    }

    public void initView(final Bitmap bitmap, boolean z3) {
        h.a(getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView.1
            @Override // com.anythink.core.common.v.h.a
            public final void a() {
            }

            @Override // com.anythink.core.common.v.h.a
            public final void a(Bitmap bitmap2) {
                AlbumScaleMainView.this.f10565c.setImageBitmap(bitmap2);
            }
        });
        this.f10566d.post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView.2
            @Override // java.lang.Runnable
            public final void run() {
                AlbumScaleMainView.this.f10566d.setBitmapAndResize(bitmap, AlbumScaleMainView.this.getWidth(), AlbumScaleMainView.this.getHeight());
            }
        });
        if (z3) {
            AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
            this.f10567e = albumScaleMainView;
            albumScaleMainView.initView(bitmap, false);
            this.f10567e.setVisibility(4);
            addView(this.f10567e, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void pause() {
        AnimatorSet animatorSet = this.f10568f;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    public void release() {
        stop();
        removeAllViews();
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void resume() {
        AnimatorSet animatorSet = this.f10568f;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
    }

    public void setStartDelay(long j6) {
        this.i = j6;
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void start() {
        float mainViewScale = getMainViewScale();
        if (mainViewScale != 1.0f) {
            if (this.f10568f == null) {
                this.f10568f = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, mainViewScale);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, mainViewScale);
                long j6 = this.i;
                if (j6 > 0) {
                    this.f10568f.setStartDelay(j6);
                }
                this.f10568f.playTogether(ofFloat, ofFloat2);
                this.f10568f.setDuration(4000L);
                this.f10568f.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f10568f.addListener(new AnonymousClass3());
            }
            this.f10568f.start();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void stop() {
        AnimatorSet animatorSet = this.f10568f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f10568f.cancel();
            this.f10568f = null;
        }
        AnimatorSet animatorSet2 = this.f10569g;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
            this.f10569g.cancel();
            this.f10569g = null;
        }
        Handler handler = this.f10570h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public AlbumScaleMainView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        float mainViewScale = getMainViewScale();
        if (mainViewScale == 1.0f) {
            return;
        }
        if (this.f10568f == null) {
            this.f10568f = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, mainViewScale);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, mainViewScale);
            long j6 = this.i;
            if (j6 > 0) {
                this.f10568f.setStartDelay(j6);
            }
            this.f10568f.playTogether(ofFloat, ofFloat2);
            this.f10568f.setDuration(4000L);
            this.f10568f.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f10568f.addListener(new AnonymousClass3());
        }
        this.f10568f.start();
    }

    private void b() {
        AlbumScaleMainView albumScaleMainView = this.f10567e;
        if (albumScaleMainView == null) {
            return;
        }
        if (albumScaleMainView.getVisibility() != 0) {
            this.f10567e.setVisibility(0);
        }
        if (this.f10569g == null) {
            this.f10569g = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10567e, "scaleX", 1.0f, 1.3f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f10567e, "scaleY", 1.0f, 1.3f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f10567e, "alpha", 0.4f, 0.0f);
            this.f10569g.setDuration(500L);
            this.f10569g.setInterpolator(new LinearInterpolator());
            this.f10569g.playTogether(ofFloat, ofFloat2, ofFloat3);
            this.f10569g.addListener(new AnonymousClass4());
        }
        AnimatorSet animatorSet = this.f10569g;
        if (animatorSet == null || animatorSet.isStarted()) {
            return;
        }
        this.f10569g.start();
    }

    public AlbumScaleMainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10563a = 100;
        this.f10564b = 500;
        this.f10565c = new RoundImageView(context);
        this.f10566d = new WrapRoundImageView(context);
        RoundImageView roundImageView = this.f10565c;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        roundImageView.setScaleType(scaleType);
        this.f10566d.setScaleType(scaleType);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(this.f10565c, layoutParams);
        addView(this.f10566d, layoutParams2);
        this.f10570h = new Handler(Looper.getMainLooper(), this);
    }
}
