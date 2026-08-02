package com.anythink.basead.ui.animplayerview.scale;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.anythink.basead.exoplayer.i.a;
import com.anythink.core.common.v.q;
import java.util.List;

/* loaded from: classes.dex */
public class AlbumScaleItemView02 extends BaseAlbumScaleItemView {

    /* renamed from: f, reason: collision with root package name */
    private ImageView f11340f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f11341g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f11342h;

    public AlbumScaleItemView02(Context context) {
        this(context, null);
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public final int a(Context context) {
        return q.a(context, "myoffer_scale_second", "layout");
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.f11340f = (ImageView) view.findViewById(q.a(context, "iv_left", "id"));
        this.f11341g = (ImageView) view.findViewById(q.a(context, "iv_right_top", "id"));
        this.f11342h = (ImageView) view.findViewById(q.a(context, "iv_right_bottom", "id"));
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.f11341g;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(0));
        }
        ImageView imageView2 = this.f11340f;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(1));
        }
        ImageView imageView3 = this.f11342h;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(3));
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.f11363b == null) {
            this.f11363b = new AnimatorSet();
            ImageView imageView = this.f11340f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -(imageView.getX() + this.f11340f.getWidth()));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f11340f, "translationY", 0.0f, (float) (-Math.cos(r6.getY())));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f11341g, "translationX", 0.0f, a() - this.f11341g.getX());
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f11341g, "translationY", 0.0f, (float) (-Math.cos(r9.getY())));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f11342h, "translationX", 0.0f, a() - this.f11342h.getX());
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f11342h, "translationY", 0.0f, (float) Math.cos(b() - this.f11342h.getY()));
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 5.0f);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 5.0f);
            this.f11363b.setDuration(a.f8669f);
            this.f11363b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f11363b.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat6, ofFloat5, ofFloat7, ofFloat8);
            long j6 = this.f11366e;
            if (j6 > 0) {
                this.f11363b.setStartDelay(j6);
            }
        }
        this.f11363b.start();
    }

    public AlbumScaleItemView02(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
