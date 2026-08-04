package com.gamericefishpro.space.pa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.ka.j;
import com.gamericefishpro.space.ka.k;
import com.gamericefishpro.space.ka.m;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ConstraintLayout {
    public final com.appsflyer.a L;
    public int M;
    public final j N;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        j jVar = new j();
        this.N = jVar;
        k kVar = new k(0.5f);
        m mVarF = jVar.e.a.f();
        mVarF.e = kVar;
        mVarF.f = kVar;
        mVarF.g = kVar;
        mVarF.h = kVar;
        jVar.setShapeAppearanceModel(mVarF.a());
        this.N.n(ColorStateList.valueOf(-1));
        setBackground(this.N);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.gamericefishpro.space.s9.a.q, R.attr.materialClockStyle, 0);
        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.L = new com.appsflyer.a(16, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            com.appsflyer.a aVar = this.L;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            com.appsflyer.a aVar = this.L;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.N.n(ColorStateList.valueOf(i));
    }
}
