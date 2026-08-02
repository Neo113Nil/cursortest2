package com.anythink.basead.ui.animplayerview.redpacket;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.anythink.basead.ui.animplayerview.b;
import java.util.List;

/* loaded from: classes.dex */
public class RedPacketAnimatorView extends FrameLayout implements Handler.Callback, b {

    /* renamed from: a, reason: collision with root package name */
    private final int f11299a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11300b;

    /* renamed from: c, reason: collision with root package name */
    private RedPacketView f11301c;

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f11302d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f11303e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11304f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11305g;

    /* renamed from: h, reason: collision with root package name */
    private int f11306h;
    private Handler i;

    public RedPacketAnimatorView(Context context) {
        this(context, null);
    }

    private void b() {
        RedPacketView redPacketView = this.f11301c;
        if (redPacketView == null) {
            return;
        }
        redPacketView.setTranslationY(-this.f11306h);
        if (this.f11302d == null) {
            this.f11301c.setVisibility(0);
            this.f11301c.initRedPacketList(this.f11303e);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f11301c, "translationY", -r3, this.f11306h);
            this.f11302d = ofFloat;
            ofFloat.addListener(new com.anythink.basead.ui.animplayerview.a() { // from class: com.anythink.basead.ui.animplayerview.redpacket.RedPacketAnimatorView.1
                @Override // com.anythink.basead.ui.animplayerview.a, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (RedPacketAnimatorView.this.i != null) {
                        RedPacketAnimatorView.this.i.removeMessages(100);
                        RedPacketAnimatorView.this.i.sendEmptyMessageDelayed(100, 500L);
                    }
                }
            });
            this.f11302d.setRepeatCount(0);
            this.f11302d.setDuration(4000L);
            this.f11302d.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator = this.f11302d;
        if (objectAnimator != null && !objectAnimator.isStarted()) {
            this.f11302d.start();
        }
        this.f11304f = true;
        this.f11305g = false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 100) {
            return false;
        }
        b();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        this.f11306h = getMeasuredHeight();
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void pause() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.f11302d;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    public void release() {
        if (this.f11305g) {
            return;
        }
        stop();
        RedPacketView redPacketView = this.f11301c;
        if (redPacketView != null) {
            redPacketView.release();
        }
        this.f11305g = true;
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void resume() {
        ObjectAnimator objectAnimator = this.f11302d;
        if (objectAnimator != null) {
            if (objectAnimator.isPaused()) {
                this.f11302d.resume();
            } else {
                b();
            }
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f11303e = list.get(0);
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.f11304f) {
            resume();
            return;
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(100, 500L);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void stop() {
        RedPacketView redPacketView = this.f11301c;
        if (redPacketView != null) {
            redPacketView.setTranslationY(-this.f11306h);
        }
        ObjectAnimator objectAnimator = this.f11302d;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f11302d.cancel();
            this.f11302d = null;
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f11304f = false;
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static ViewGroup.LayoutParams a() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11299a = 4000;
        this.f11300b = 100;
        this.f11304f = false;
        this.f11305g = false;
        this.i = new Handler(Looper.getMainLooper(), this);
        setClipChildren(false);
        RedPacketView redPacketView = new RedPacketView(getContext());
        this.f11301c = redPacketView;
        addView(redPacketView, new ViewGroup.LayoutParams(-1, -1));
        this.f11301c.setVisibility(4);
    }
}
