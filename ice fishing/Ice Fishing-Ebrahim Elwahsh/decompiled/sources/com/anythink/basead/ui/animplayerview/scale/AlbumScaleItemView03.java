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
    private ImageView f10714f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f10715g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f10716h;
    private ImageView i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f10717j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f10718k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f10719l;

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
        this.f10714f = (ImageView) view.findViewById(q.a(context, "iv_left_01", "id"));
        this.f10715g = (ImageView) view.findViewById(q.a(context, "iv_left_02", "id"));
        this.f10716h = (ImageView) view.findViewById(q.a(context, "iv_left_03", "id"));
        this.i = (ImageView) view.findViewById(q.a(context, "iv_left_04", "id"));
        this.f10717j = (ImageView) view.findViewById(q.a(context, "iv_right_01", "id"));
        this.f10718k = (ImageView) view.findViewById(q.a(context, "iv_right_02", "id"));
        this.f10719l = (ImageView) view.findViewById(q.a(context, "iv_right_03", "id"));
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.f10714f;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(2));
        }
        ImageView imageView2 = this.f10715g;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(0));
        }
        ImageView imageView3 = this.f10716h;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(3));
        }
        ImageView imageView4 = this.i;
        if (imageView4 != null) {
            imageView4.setImageBitmap(list.get(0));
        }
        ImageView imageView5 = this.f10717j;
        if (imageView5 != null) {
            imageView5.setImageBitmap(list.get(1));
        }
        ImageView imageView6 = this.f10718k;
        if (imageView6 != null) {
            imageView6.setImageBitmap(list.get(2));
        }
        ImageView imageView7 = this.f10719l;
        if (imageView7 != null) {
            imageView7.setImageBitmap(list.get(3));
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void start() {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        if (this.f10734b == null) {
            this.f10734b = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (this.f10736d) {
                ofFloat = ObjectAnimator.ofFloat(this.f10716h, "translationX", 0.0f, -dip2px(20.0f));
                ofFloat2 = ObjectAnimator.ofFloat(this.f10716h, "translationY", 0.0f, dip2px(15.0f));
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.f10717j, "translationX", 0.0f, dip2px(15.0f));
                ofFloat2 = ObjectAnimator.ofFloat(this.f10717j, "translationY", 0.0f, dip2px(15.0f));
            }
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, this.f10735c);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, this.f10735c);
            arrayList.add(ofFloat3);
            arrayList.add(ofFloat4);
            this.f10734b.setDuration(4000L);
            this.f10734b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f10734b.playTogether(arrayList);
            long j9 = this.f10737e;
            if (j9 > 0) {
                this.f10734b.setStartDelay(j9);
            }
        }
        this.f10734b.start();
    }

    public AlbumScaleItemView03(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView03(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
