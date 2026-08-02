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
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AlbumScaleItemView03 extends BaseAlbumScaleItemView {

    /* renamed from: f, reason: collision with root package name */
    private ImageView f11343f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f11344g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f11345h;
    private ImageView i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f11346j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f11347k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f11348l;

    public AlbumScaleItemView03(Context context) {
        this(context, null);
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public final int a(Context context) {
        return q.a(context, "myoffer_scale_third", "layout");
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.f11343f = (ImageView) view.findViewById(q.a(context, "iv_left_01", "id"));
        this.f11344g = (ImageView) view.findViewById(q.a(context, "iv_left_02", "id"));
        this.f11345h = (ImageView) view.findViewById(q.a(context, "iv_left_03", "id"));
        this.i = (ImageView) view.findViewById(q.a(context, "iv_left_04", "id"));
        this.f11346j = (ImageView) view.findViewById(q.a(context, "iv_right_01", "id"));
        this.f11347k = (ImageView) view.findViewById(q.a(context, "iv_right_02", "id"));
        this.f11348l = (ImageView) view.findViewById(q.a(context, "iv_right_03", "id"));
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.f11343f;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(2));
        }
        ImageView imageView2 = this.f11344g;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(0));
        }
        ImageView imageView3 = this.f11345h;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(3));
        }
        ImageView imageView4 = this.i;
        if (imageView4 != null) {
            imageView4.setImageBitmap(list.get(0));
        }
        ImageView imageView5 = this.f11346j;
        if (imageView5 != null) {
            imageView5.setImageBitmap(list.get(1));
        }
        ImageView imageView6 = this.f11347k;
        if (imageView6 != null) {
            imageView6.setImageBitmap(list.get(2));
        }
        ImageView imageView7 = this.f11348l;
        if (imageView7 != null) {
            imageView7.setImageBitmap(list.get(3));
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void start() {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        if (this.f11363b == null) {
            this.f11363b = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (this.f11365d) {
                ofFloat = ObjectAnimator.ofFloat(this.f11345h, "translationX", 0.0f, -dip2px(20.0f));
                ofFloat2 = ObjectAnimator.ofFloat(this.f11345h, "translationY", 0.0f, dip2px(15.0f));
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.f11346j, "translationX", 0.0f, dip2px(15.0f));
                ofFloat2 = ObjectAnimator.ofFloat(this.f11346j, "translationY", 0.0f, dip2px(15.0f));
            }
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, this.f11364c);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, this.f11364c);
            arrayList.add(ofFloat3);
            arrayList.add(ofFloat4);
            this.f11363b.setDuration(4000L);
            this.f11363b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f11363b.playTogether(arrayList);
            long j6 = this.f11366e;
            if (j6 > 0) {
                this.f11363b.setStartDelay(j6);
            }
        }
        this.f11363b.start();
    }

    public AlbumScaleItemView03(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView03(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
