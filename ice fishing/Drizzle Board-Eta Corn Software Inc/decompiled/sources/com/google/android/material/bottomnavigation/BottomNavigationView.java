package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.kolosta.rejin.jilosa.R;
import defpackage.bh0;
import defpackage.dh0;
import defpackage.fn;
import defpackage.hg0;
import defpackage.r2;
import defpackage.re;
import defpackage.s2;
import defpackage.t2;
import defpackage.tv;
import defpackage.y00;
import defpackage.ya0;
import defpackage.zf0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class BottomNavigationView extends tv {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        fn.NCTxEWno(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        int[] iArr = y00.MdtA4re8;
        fn.wxUZMvaN(context2, attributeSet, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        setItemHorizontalTranslationEnabled(obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(0)) {
            setMinimumHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
        }
        obtainStyledAttributes.recycle();
        re reVar = new re(9);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        dh0 dh0Var = new dh0();
        dh0Var.qoPGr6Ce = paddingStart;
        dh0Var.NCTxEWno = paddingTop;
        dh0Var.MdtA4re8 = paddingEnd;
        dh0Var.wxUZMvaN = paddingBottom;
        ya0 ya0Var = new ya0(reVar, dh0Var);
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        zf0.MdtA4re8(this, ya0Var);
        if (isAttachedToWindow()) {
            requestApplyInsets();
        } else {
            addOnAttachStateChangeListener(new bh0());
        }
    }

    @Override // defpackage.tv
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            i3 = i2;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i3);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        r2 r2Var = (r2) getMenuView();
        if (r2Var.tef3qNMP != z) {
            r2Var.setItemHorizontalTranslationEnabled(z);
            getPresenter().eVhOlqcC(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(s2 s2Var) {
        setOnItemReselectedListener(s2Var);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(t2 t2Var) {
        setOnItemSelectedListener(t2Var);
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }
}
