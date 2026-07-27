package com.anythink.basead.ui.guidetoclickv2;

import D.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class ChopOnceG2CV2View extends BaseLifecycleG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    ImageView f10855d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f10856e;

    /* renamed from: f, reason: collision with root package name */
    Animation f10857f;

    /* renamed from: g, reason: collision with root package name */
    Animation f10858g;

    /* renamed from: h, reason: collision with root package name */
    ImageView f10859h;

    public ChopOnceG2CV2View(Context context) {
        super(context);
    }

    private void f() {
        if (this.f10857f == null && this.f10855d != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.f10857f = rotateAnimation;
            rotateAnimation.setDuration(com.anythink.basead.exoplayer.i.a.f7883f);
            this.f10857f.setInterpolator(new LinearInterpolator());
            this.f10857f.setRepeatCount(-1);
            this.f10855d.startAnimation(this.f10857f);
        }
        if (this.f10858g != null || this.f10856e == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, q.a(getContext(), 10.0f));
        this.f10858g = translateAnimation;
        translateAnimation.setDuration(500L);
        this.f10858g.setRepeatCount(-1);
        this.f10858g.setRepeatMode(2);
        this.f10856e.startAnimation(this.f10858g);
    }

    private void g() {
        Animation animation = this.f10857f;
        if (animation != null) {
            animation.cancel();
            this.f10857f = null;
        }
        Animation animation2 = this.f10858g;
        if (animation2 != null) {
            animation2.cancel();
            this.f10858g = null;
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i6) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_chop_once", "layout"), this);
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f10855d = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_gift_group", "id"));
        this.f10856e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_gift_chop", "id"));
        this.f10859h = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        String a9 = g.a().a(b.d.f12121f);
        if (!TextUtils.isEmpty(a9)) {
            y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.ChopOnceG2CV2View.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    ImageView imageView = ChopOnceG2CV2View.this.f10855d;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            });
        }
        ImageView imageView = this.f10855d;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.ChopOnceG2CV2View.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChopOnceG2CV2View.this.removeAllViews();
                    ChopOnceG2CV2View.this.d();
                }
            });
        }
        ImageView imageView2 = this.f10856e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.ChopOnceG2CV2View.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChopOnceG2CV2View.this.removeAllViews();
                    ChopOnceG2CV2View.this.d();
                }
            });
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.ChopOnceG2CV2View.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        ImageView imageView3 = this.f10859h;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.ChopOnceG2CV2View.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChopOnceG2CV2View.this.c();
                }
            });
        }
        setClipChildren(false);
        if (this.f10857f == null && this.f10855d != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.f10857f = rotateAnimation;
            rotateAnimation.setDuration(com.anythink.basead.exoplayer.i.a.f7883f);
            this.f10857f.setInterpolator(new LinearInterpolator());
            this.f10857f.setRepeatCount(-1);
            this.f10855d.startAnimation(this.f10857f);
        }
        if (this.f10858g != null || this.f10856e == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, q.a(getContext(), 10.0f));
        this.f10858g = translateAnimation;
        translateAnimation.setDuration(500L);
        this.f10858g.setRepeatCount(-1);
        this.f10858g.setRepeatMode(2);
        this.f10856e.startAnimation(this.f10858g);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        Animation animation = this.f10857f;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f10858g;
        if (animation2 != null) {
            animation2.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View
    public final int e() {
        return 44;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        Animation animation = this.f10857f;
        if (animation != null) {
            animation.cancel();
            this.f10857f = null;
        }
        Animation animation2 = this.f10858g;
        if (animation2 != null) {
            animation2.cancel();
            this.f10858g = null;
        }
    }

    public ChopOnceG2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChopOnceG2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        Animation animation = this.f10857f;
        if (animation != null) {
            animation.start();
        }
        Animation animation2 = this.f10858g;
        if (animation2 != null) {
            animation2.start();
        }
    }
}
