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
    private final int f10670a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10671b;

    /* renamed from: c, reason: collision with root package name */
    private RedPacketView f10672c;

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f10673d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f10674e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10675f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10676g;

    /* renamed from: h, reason: collision with root package name */
    private int f10677h;
    private Handler i;

    public RedPacketAnimatorView(Context context) {
        this(context, null);
    }

    private void b() {
        RedPacketView redPacketView = this.f10672c;
        if (redPacketView == null) {
            return;
        }
        redPacketView.setTranslationY(-this.f10677h);
        if (this.f10673d == null) {
            this.f10672c.setVisibility(0);
            this.f10672c.initRedPacketList(this.f10674e);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10672c, "translationY", -r3, this.f10677h);
            this.f10673d = ofFloat;
            ofFloat.addListener(new com.anythink.basead.ui.animplayerview.a() { // from class: com.anythink.basead.ui.animplayerview.redpacket.RedPacketAnimatorView.1
                @Override // com.anythink.basead.ui.animplayerview.a, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (RedPacketAnimatorView.this.i != null) {
                        RedPacketAnimatorView.this.i.removeMessages(100);
                        RedPacketAnimatorView.this.i.sendEmptyMessageDelayed(100, 500L);
                    }
                }
            });
            this.f10673d.setRepeatCount(0);
            this.f10673d.setDuration(4000L);
            this.f10673d.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator = this.f10673d;
        if (objectAnimator != null && !objectAnimator.isStarted()) {
            this.f10673d.start();
        }
        this.f10675f = true;
        this.f10676g = false;
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
        this.f10677h = getMeasuredHeight();
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void pause() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.f10673d;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    public void release() {
        if (this.f10676g) {
            return;
        }
        stop();
        RedPacketView redPacketView = this.f10672c;
        if (redPacketView != null) {
            redPacketView.release();
        }
        this.f10676g = true;
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void resume() {
        ObjectAnimator objectAnimator = this.f10673d;
        if (objectAnimator != null) {
            if (objectAnimator.isPaused()) {
                this.f10673d.resume();
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
        this.f10674e = list.get(0);
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.f10675f) {
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
        RedPacketView redPacketView = this.f10672c;
        if (redPacketView != null) {
            redPacketView.setTranslationY(-this.f10677h);
        }
        ObjectAnimator objectAnimator = this.f10673d;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f10673d.cancel();
            this.f10673d = null;
        }
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f10675f = false;
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static ViewGroup.LayoutParams a() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10670a = 4000;
        this.f10671b = 100;
        this.f10675f = false;
        this.f10676g = false;
        this.i = new Handler(Looper.getMainLooper(), this);
        setClipChildren(false);
        RedPacketView redPacketView = new RedPacketView(getContext());
        this.f10672c = redPacketView;
        addView(redPacketView, new ViewGroup.LayoutParams(-1, -1));
        this.f10672c.setVisibility(4);
    }
}
