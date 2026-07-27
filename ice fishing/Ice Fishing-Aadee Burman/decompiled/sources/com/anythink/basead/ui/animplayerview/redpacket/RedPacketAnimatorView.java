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
    private final int f10513a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10514b;

    /* renamed from: c, reason: collision with root package name */
    private RedPacketView f10515c;

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f10516d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f10517e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10518f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10519g;

    /* renamed from: h, reason: collision with root package name */
    private int f10520h;
    private Handler i;

    public RedPacketAnimatorView(Context context) {
        this(context, null);
    }

    private void b() {
        RedPacketView redPacketView = this.f10515c;
        if (redPacketView == null) {
            return;
        }
        redPacketView.setTranslationY(-this.f10520h);
        if (this.f10516d == null) {
            this.f10515c.setVisibility(0);
            this.f10515c.initRedPacketList(this.f10517e);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10515c, "translationY", -r3, this.f10520h);
            this.f10516d = ofFloat;
            ofFloat.addListener(new com.anythink.basead.ui.animplayerview.a() { // from class: com.anythink.basead.ui.animplayerview.redpacket.RedPacketAnimatorView.1
                @Override // com.anythink.basead.ui.animplayerview.a, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (RedPacketAnimatorView.this.i != null) {
                        RedPacketAnimatorView.this.i.removeMessages(100);
                        RedPacketAnimatorView.this.i.sendEmptyMessageDelayed(100, 500L);
                    }
                }
            });
            this.f10516d.setRepeatCount(0);
            this.f10516d.setDuration(4000L);
            this.f10516d.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator = this.f10516d;
        if (objectAnimator != null && !objectAnimator.isStarted()) {
            this.f10516d.start();
        }
        this.f10518f = true;
        this.f10519g = false;
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
    public void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        this.f10520h = getMeasuredHeight();
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void pause() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.f10516d;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    public void release() {
        if (this.f10519g) {
            return;
        }
        stop();
        RedPacketView redPacketView = this.f10515c;
        if (redPacketView != null) {
            redPacketView.release();
        }
        this.f10519g = true;
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void resume() {
        ObjectAnimator objectAnimator = this.f10516d;
        if (objectAnimator != null) {
            if (objectAnimator.isPaused()) {
                this.f10516d.resume();
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
        this.f10517e = list.get(0);
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.f10518f) {
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
        RedPacketView redPacketView = this.f10515c;
        if (redPacketView != null) {
            redPacketView.setTranslationY(-this.f10520h);
        }
        ObjectAnimator objectAnimator = this.f10516d;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f10516d.cancel();
            this.f10516d = null;
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f10518f = false;
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static ViewGroup.LayoutParams a() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10513a = 4000;
        this.f10514b = 100;
        this.f10518f = false;
        this.f10519g = false;
        this.i = new Handler(Looper.getMainLooper(), this);
        setClipChildren(false);
        RedPacketView redPacketView = new RedPacketView(getContext());
        this.f10515c = redPacketView;
        addView(redPacketView, new ViewGroup.LayoutParams(-1, -1));
        this.f10515c.setVisibility(4);
    }
}
