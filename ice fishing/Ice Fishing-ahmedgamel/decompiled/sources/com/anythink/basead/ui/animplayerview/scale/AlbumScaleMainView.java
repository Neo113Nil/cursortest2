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
    private final int f11349a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11350b;

    /* renamed from: c, reason: collision with root package name */
    private RoundImageView f11351c;

    /* renamed from: d, reason: collision with root package name */
    private WrapRoundImageView f11352d;

    /* renamed from: e, reason: collision with root package name */
    private AlbumScaleMainView f11353e;

    /* renamed from: f, reason: collision with root package name */
    private AnimatorSet f11354f;

    /* renamed from: g, reason: collision with root package name */
    private AnimatorSet f11355g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f11356h;
    private long i;

    /* renamed from: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView$3, reason: invalid class name */
    public class AnonymousClass3 extends a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.basead.ui.animplayerview.a, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AlbumScaleMainView.this.f11356h.sendEmptyMessageDelayed(100, 500L);
        }
    }

    /* renamed from: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView$4, reason: invalid class name */
    public class AnonymousClass4 extends a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.basead.ui.animplayerview.a, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (AlbumScaleMainView.this.f11356h != null) {
                AlbumScaleMainView.this.f11356h.sendEmptyMessageDelayed(100, 500L);
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
        if (message.what == 100 && (albumScaleMainView = this.f11353e) != null) {
            if (albumScaleMainView.getVisibility() != 0) {
                this.f11353e.setVisibility(0);
            }
            if (this.f11355g == null) {
                this.f11355g = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11353e, "scaleX", 1.0f, 1.3f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11353e, "scaleY", 1.0f, 1.3f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f11353e, "alpha", 0.4f, 0.0f);
                this.f11355g.setDuration(500L);
                this.f11355g.setInterpolator(new LinearInterpolator());
                this.f11355g.playTogether(ofFloat, ofFloat2, ofFloat3);
                this.f11355g.addListener(new AnonymousClass4());
            }
            AnimatorSet animatorSet = this.f11355g;
            if (animatorSet != null && !animatorSet.isStarted()) {
                this.f11355g.start();
            }
        }
        return false;
    }

    public void initView(final Bitmap bitmap, boolean z6) {
        h.a(getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView.1
            @Override // com.anythink.core.common.v.h.a
            public final void a() {
            }

            @Override // com.anythink.core.common.v.h.a
            public final void a(Bitmap bitmap2) {
                AlbumScaleMainView.this.f11351c.setImageBitmap(bitmap2);
            }
        });
        this.f11352d.post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView.2
            @Override // java.lang.Runnable
            public final void run() {
                AlbumScaleMainView.this.f11352d.setBitmapAndResize(bitmap, AlbumScaleMainView.this.getWidth(), AlbumScaleMainView.this.getHeight());
            }
        });
        if (z6) {
            AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
            this.f11353e = albumScaleMainView;
            albumScaleMainView.initView(bitmap, false);
            this.f11353e.setVisibility(4);
            addView(this.f11353e, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void pause() {
        AnimatorSet animatorSet = this.f11354f;
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
        AnimatorSet animatorSet = this.f11354f;
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
            if (this.f11354f == null) {
                this.f11354f = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, mainViewScale);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, mainViewScale);
                long j6 = this.i;
                if (j6 > 0) {
                    this.f11354f.setStartDelay(j6);
                }
                this.f11354f.playTogether(ofFloat, ofFloat2);
                this.f11354f.setDuration(4000L);
                this.f11354f.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f11354f.addListener(new AnonymousClass3());
            }
            this.f11354f.start();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void stop() {
        AnimatorSet animatorSet = this.f11354f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f11354f.cancel();
            this.f11354f = null;
        }
        AnimatorSet animatorSet2 = this.f11355g;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
            this.f11355g.cancel();
            this.f11355g = null;
        }
        Handler handler = this.f11356h;
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
        if (this.f11354f == null) {
            this.f11354f = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, mainViewScale);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, mainViewScale);
            long j6 = this.i;
            if (j6 > 0) {
                this.f11354f.setStartDelay(j6);
            }
            this.f11354f.playTogether(ofFloat, ofFloat2);
            this.f11354f.setDuration(4000L);
            this.f11354f.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f11354f.addListener(new AnonymousClass3());
        }
        this.f11354f.start();
    }

    private void b() {
        AlbumScaleMainView albumScaleMainView = this.f11353e;
        if (albumScaleMainView == null) {
            return;
        }
        if (albumScaleMainView.getVisibility() != 0) {
            this.f11353e.setVisibility(0);
        }
        if (this.f11355g == null) {
            this.f11355g = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11353e, "scaleX", 1.0f, 1.3f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11353e, "scaleY", 1.0f, 1.3f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f11353e, "alpha", 0.4f, 0.0f);
            this.f11355g.setDuration(500L);
            this.f11355g.setInterpolator(new LinearInterpolator());
            this.f11355g.playTogether(ofFloat, ofFloat2, ofFloat3);
            this.f11355g.addListener(new AnonymousClass4());
        }
        AnimatorSet animatorSet = this.f11355g;
        if (animatorSet == null || animatorSet.isStarted()) {
            return;
        }
        this.f11355g.start();
    }

    public AlbumScaleMainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11349a = 100;
        this.f11350b = 500;
        this.f11351c = new RoundImageView(context);
        this.f11352d = new WrapRoundImageView(context);
        RoundImageView roundImageView = this.f11351c;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        roundImageView.setScaleType(scaleType);
        this.f11352d.setScaleType(scaleType);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(this.f11351c, layoutParams);
        addView(this.f11352d, layoutParams2);
        this.f11356h = new Handler(Looper.getMainLooper(), this);
    }
}
