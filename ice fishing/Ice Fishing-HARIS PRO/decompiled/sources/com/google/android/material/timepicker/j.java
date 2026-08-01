package com.google.android.material.timepicker;

import O.K;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public abstract class j extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public final g f2737q;

    /* renamed from: r, reason: collision with root package name */
    public int f2738r;

    /* renamed from: s, reason: collision with root package name */
    public final S0.g f2739s;

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        S0.g gVar = new S0.g();
        this.f2739s = gVar;
        S0.h hVar = new S0.h(0.5f);
        S0.j e = gVar.f1076a.f1062a.e();
        e.e = hVar;
        e.f1100f = hVar;
        e.f1101g = hVar;
        e.f1102h = hVar;
        gVar.setShapeAppearanceModel(e.a());
        this.f2739s.m(ColorStateList.valueOf(-1));
        S0.g gVar2 = this.f2739s;
        WeakHashMap weakHashMap = K.f747a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.f4430A, R.attr.materialClockStyle, 0);
        this.f2738r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2737q = new g(1, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = K.f747a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f2737q;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void n();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f2737q;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f2739s.m(ColorStateList.valueOf(i));
    }
}
