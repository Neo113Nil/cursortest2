package com.anythink.basead.ui.guidetoclickv2;

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
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class ChopOnceG2CV2View extends BaseLifecycleG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    ImageView f11641d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f11642e;

    /* renamed from: f, reason: collision with root package name */
    Animation f11643f;

    /* renamed from: g, reason: collision with root package name */
    Animation f11644g;

    /* renamed from: h, reason: collision with root package name */
    ImageView f11645h;

    public ChopOnceG2CV2View(Context context) {
        super(context);
    }

    private void f() {
        if (this.f11643f == null && this.f11641d != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.f11643f = rotateAnimation;
            rotateAnimation.setDuration(com.anythink.basead.exoplayer.i.a.f8669f);
            this.f11643f.setInterpolator(new LinearInterpolator());
            this.f11643f.setRepeatCount(-1);
            this.f11641d.startAnimation(this.f11643f);
        }
        if (this.f11644g != null || this.f11642e == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, q.a(getContext(), 10.0f));
        this.f11644g = translateAnimation;
        translateAnimation.setDuration(500L);
        this.f11644g.setRepeatCount(-1);
        this.f11644g.setRepeatMode(2);
        this.f11642e.startAnimation(this.f11644g);
    }

    private void g() {
        Animation animation = this.f11643f;
        if (animation != null) {
            animation.cancel();
            this.f11643f = null;
        }
        Animation animation2 = this.f11644g;
        if (animation2 != null) {
            animation2.cancel();
            this.f11644g = null;
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_chop_once", "layout"), this);
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f11641d = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_gift_group", "id"));
        this.f11642e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_gift_chop", "id"));
        this.f11645h = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        String a9 = g.a().a(b.d.f12907f);
        if (!TextUtils.isEmpty(a9)) {
            k.j().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.ChopOnceG2CV2View.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    ImageView imageView = ChopOnceG2CV2View.this.f11641d;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            });
        }
        ImageView imageView = this.f11641d;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.ChopOnceG2CV2View.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChopOnceG2CV2View.this.removeAllViews();
                    ChopOnceG2CV2View.this.d();
                }
            });
        }
        ImageView imageView2 = this.f11642e;
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
        ImageView imageView3 = this.f11645h;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.ChopOnceG2CV2View.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChopOnceG2CV2View.this.c();
                }
            });
        }
        setClipChildren(false);
        if (this.f11643f == null && this.f11641d != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.f11643f = rotateAnimation;
            rotateAnimation.setDuration(com.anythink.basead.exoplayer.i.a.f8669f);
            this.f11643f.setInterpolator(new LinearInterpolator());
            this.f11643f.setRepeatCount(-1);
            this.f11641d.startAnimation(this.f11643f);
        }
        if (this.f11644g != null || this.f11642e == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, q.a(getContext(), 10.0f));
        this.f11644g = translateAnimation;
        translateAnimation.setDuration(500L);
        this.f11644g.setRepeatCount(-1);
        this.f11644g.setRepeatMode(2);
        this.f11642e.startAnimation(this.f11644g);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        Animation animation = this.f11643f;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f11644g;
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
        Animation animation = this.f11643f;
        if (animation != null) {
            animation.cancel();
            this.f11643f = null;
        }
        Animation animation2 = this.f11644g;
        if (animation2 != null) {
            animation2.cancel();
            this.f11644g = null;
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
        Animation animation = this.f11643f;
        if (animation != null) {
            animation.start();
        }
        Animation animation2 = this.f11644g;
        if (animation2 != null) {
            animation2.start();
        }
    }
}
