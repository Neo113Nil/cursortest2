package com.anythink.basead.ui.animplayerview.scale;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.anythink.core.common.v.q;
import java.util.List;

/* loaded from: classes.dex */
public class AlbumScaleItemView01 extends BaseAlbumScaleItemView {

    /* renamed from: f, reason: collision with root package name */
    private ImageView f11337f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f11338g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f11339h;
    private ImageView i;

    public AlbumScaleItemView01(Context context) {
        this(context, null);
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public final int a(Context context) {
        return q.a(context, "myoffer_scale_first", "layout");
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.f11337f = (ImageView) view.findViewById(q.a(context, "iv_left_top", "id"));
        this.f11338g = (ImageView) view.findViewById(q.a(context, "iv_left_bottom", "id"));
        this.f11339h = (ImageView) view.findViewById(q.a(context, "iv_right_top", "id"));
        this.i = (ImageView) view.findViewById(q.a(context, "iv_right_bottom", "id"));
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.f11339h;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(0));
        }
        ImageView imageView2 = this.i;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(1));
        }
        ImageView imageView3 = this.f11338g;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(2));
        }
        ImageView imageView4 = this.f11337f;
        if (imageView4 != null) {
            imageView4.setImageBitmap(list.get(3));
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.f11363b == null) {
            this.f11363b = new AnimatorSet();
            ImageView imageView = this.f11337f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -imageView.getX());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11337f, "translationY", 0.0f, (float) (-Math.cos(r7.getY())));
            ImageView imageView2 = this.f11338g;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, "translationX", 0.0f, -imageView2.getX());
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f11338g, "translationY", 0.0f, (float) Math.cos(r10.getY()));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f11339h, "translationX", 0.0f, a() - this.f11339h.getX());
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f11339h, "translationY", 0.0f, -((float) Math.cos(r12.getY())));
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.i, "translationX", 0.0f, a() - this.i.getX());
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.i, "translationY", 0.0f, (float) Math.cos(b() - this.i.getY()));
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 5.0f);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 5.0f);
            this.f11363b.setDuration(2500L);
            this.f11363b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f11363b.playTogether(ofFloat9, ofFloat10, ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat6, ofFloat5, ofFloat7, ofFloat8);
            long j6 = this.f11366e;
            if (j6 > 0) {
                this.f11363b.setStartDelay(j6);
            }
        }
        this.f11363b.start();
    }

    public AlbumScaleItemView01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
