package com.anythink.basead.ui.animplayerview.scale;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.ui.WrapRoundImageView;
import com.anythink.basead.ui.animplayerview.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseAlbumScaleItemView extends FrameLayout implements b {

    /* renamed from: a, reason: collision with root package name */
    protected List<Bitmap> f11362a;

    /* renamed from: b, reason: collision with root package name */
    protected AnimatorSet f11363b;

    /* renamed from: c, reason: collision with root package name */
    protected float f11364c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f11365d;

    /* renamed from: e, reason: collision with root package name */
    protected long f11366e;

    public BaseAlbumScaleItemView(Context context) {
        this(context, null);
    }

    public final int a() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    public abstract int a(Context context);

    public final int b() {
        return getContext().getResources().getDisplayMetrics().heightPixels;
    }

    public float dip2px(float f2) {
        return (f2 * getContext().getResources().getDisplayMetrics().density) + 0.5f;
    }

    public List<Animator> getAnimatorList(View view, float f2, float f9, int i) {
        ArrayList arrayList = new ArrayList();
        if (f2 > 0.0f || f9 > 0.0f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, f9);
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
        }
        if (i > 0) {
            float f10 = i;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f10);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f10);
            arrayList.add(ofFloat3);
            arrayList.add(ofFloat4);
        }
        return arrayList;
    }

    public void initView(View view) {
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void pause() {
        AnimatorSet animatorSet = this.f11363b;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    public void release() {
        stop();
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void resume() {
        AnimatorSet animatorSet = this.f11363b;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    public void setBitmapResources(List<Bitmap> list) {
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            Log.d("AlbumScaleItemView03", "view: ".concat(String.valueOf(childAt)));
            if (childAt instanceof WrapRoundImageView) {
                ((WrapRoundImageView) childAt).setImageBitmap(list.get(i % 4));
            }
        }
    }

    public void setMainViewScale(float f2) {
        this.f11364c = f2;
    }

    public void setOrientation(boolean z6) {
        this.f11365d = z6;
    }

    public void setStartDelay(long j6) {
        this.f11366e = j6;
    }

    public void start() {
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void stop() {
        AnimatorSet animatorSet = this.f11363b;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f11363b = null;
        }
    }

    public BaseAlbumScaleItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseAlbumScaleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(a(context), (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(inflate, layoutParams);
        initView(inflate);
    }
}
