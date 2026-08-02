package com.google.android.material.timepicker;

import A3.p;
import G3.j;
import O.X;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.WeakHashMap;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public abstract class e extends ConstraintLayout {
    public final p J;

    /* renamed from: K, reason: collision with root package name */
    public int f36942K;

    /* renamed from: L, reason: collision with root package name */
    public final G3.g f36943L;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(C5248R.layout.material_radial_view_group, this);
        G3.g gVar = new G3.g();
        this.f36943L = gVar;
        G3.h hVar = new G3.h(0.5f);
        j e9 = gVar.f1108n.f1078a.e();
        e9.f1120e = hVar;
        e9.f1121f = hVar;
        e9.f1122g = hVar;
        e9.f1123h = hVar;
        gVar.setShapeAppearanceModel(e9.a());
        this.f36943L.j(ColorStateList.valueOf(-1));
        G3.g gVar2 = this.f36943L;
        WeakHashMap weakHashMap = X.f2142a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39436t, C5248R.attr.materialClockStyle, 0);
        this.f36942K = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.J = new p(17, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = X.f2142a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            p pVar = this.J;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
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
            p pVar = this.J;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f36943L.j(ColorStateList.valueOf(i));
    }
}
