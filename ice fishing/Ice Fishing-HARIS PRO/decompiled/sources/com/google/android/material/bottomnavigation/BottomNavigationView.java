package com.google.android.material.bottomnavigation;

import A0.b;
import A0.c;
import A0.d;
import L0.m;
import M0.h;
import N0.l;
import S0.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.lumenpath.harispro.hrnavigator.R;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public class BottomNavigationView extends l {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h h2 = m.h(getContext(), attributeSet, AbstractC0358a.f4440b, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) h2.f617c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        h2.l();
        m.d(this, new e(1));
    }

    @Override // N0.l
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        b bVar = (b) getMenuView();
        if (bVar.f5L != z2) {
            bVar.setItemHorizontalTranslationEnabled(z2);
            getPresenter().m(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
