package com.google.android.material.timepicker;

import D.RunnableC0282a;
import E3.j;
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
import com.icefishing.icefishinglive2.C5275R;
import java.util.WeakHashMap;
import k3.AbstractC4632a;

/* loaded from: classes2.dex */
public abstract class e extends ConstraintLayout {
    public final RunnableC0282a J;

    /* renamed from: K, reason: collision with root package name */
    public int f36175K;

    /* renamed from: L, reason: collision with root package name */
    public final E3.g f36176L;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(C5275R.layout.material_radial_view_group, this);
        E3.g gVar = new E3.g();
        this.f36176L = gVar;
        E3.h hVar = new E3.h(0.5f);
        j e9 = gVar.f766n.f736a.e();
        e9.f778e = hVar;
        e9.f779f = hVar;
        e9.f780g = hVar;
        e9.f781h = hVar;
        gVar.setShapeAppearanceModel(e9.a());
        this.f36176L.j(ColorStateList.valueOf(-1));
        E3.g gVar2 = this.f36176L;
        WeakHashMap weakHashMap = X.f2054a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4632a.f38647t, C5275R.attr.materialClockStyle, 0);
        this.f36175K = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.J = new RunnableC0282a(16, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = X.f2054a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0282a runnableC0282a = this.J;
            handler.removeCallbacks(runnableC0282a);
            handler.post(runnableC0282a);
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
            RunnableC0282a runnableC0282a = this.J;
            handler.removeCallbacks(runnableC0282a);
            handler.post(runnableC0282a);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f36176L.j(ColorStateList.valueOf(i));
    }
}
