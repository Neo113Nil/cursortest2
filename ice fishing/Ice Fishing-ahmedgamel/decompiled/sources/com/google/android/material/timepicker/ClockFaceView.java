package com.google.android.material.timepicker;

import O.X;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.icefishing.icefishingbigwin.C5275R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k3.AbstractC4632a;
import z.j;
import z.n;

/* loaded from: classes2.dex */
class ClockFaceView extends e implements d {

    /* renamed from: M, reason: collision with root package name */
    public final ClockHandView f36143M;

    /* renamed from: N, reason: collision with root package name */
    public final Rect f36144N;

    /* renamed from: O, reason: collision with root package name */
    public final RectF f36145O;

    /* renamed from: P, reason: collision with root package name */
    public final Rect f36146P;

    /* renamed from: Q, reason: collision with root package name */
    public final SparseArray f36147Q;

    /* renamed from: R, reason: collision with root package name */
    public final c f36148R;

    /* renamed from: S, reason: collision with root package name */
    public final int[] f36149S;

    /* renamed from: T, reason: collision with root package name */
    public final float[] f36150T;

    /* renamed from: U, reason: collision with root package name */
    public final int f36151U;

    /* renamed from: V, reason: collision with root package name */
    public final int f36152V;

    /* renamed from: W, reason: collision with root package name */
    public final int f36153W;

    /* renamed from: n0, reason: collision with root package name */
    public final int f36154n0;

    /* renamed from: o0, reason: collision with root package name */
    public final String[] f36155o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f36156p0;

    /* renamed from: q0, reason: collision with root package name */
    public final ColorStateList f36157q0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36144N = new Rect();
        this.f36145O = new RectF();
        this.f36146P = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f36147Q = sparseArray;
        this.f36150T = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4632a.f38632d, C5275R.attr.materialClockStyle, C5275R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m4 = O3.b.m(context, obtainStyledAttributes, 1);
        this.f36157q0 = m4;
        LayoutInflater.from(context).inflate(C5275R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C5275R.id.material_clock_hand);
        this.f36143M = clockHandView;
        this.f36151U = resources.getDimensionPixelSize(C5275R.dimen.material_clock_hand_padding);
        int colorForState = m4.getColorForState(new int[]{R.attr.state_selected}, m4.getDefaultColor());
        this.f36149S = new int[]{colorForState, colorForState, m4.getDefaultColor()};
        clockHandView.f36166v.add(this);
        int defaultColor = E.e.c(context, C5275R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m9 = O3.b.m(context, obtainStyledAttributes, 0);
        setBackgroundColor(m9 != null ? m9.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f36148R = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f36155o0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z3 = false;
        for (int i = 0; i < Math.max(this.f36155o0.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f36155o0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C5275R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f36155o0[i]);
                textView.setTag(C5275R.id.material_value_index, Integer.valueOf(i));
                int i6 = (i / 12) + 1;
                textView.setTag(C5275R.id.material_clock_level, Integer.valueOf(i6));
                z3 = i6 > 1 ? true : z3;
                X.o(textView, this.f36148R);
                textView.setTextColor(this.f36157q0);
            }
        }
        ClockHandView clockHandView2 = this.f36143M;
        if (clockHandView2.f36165u && !z3) {
            clockHandView2.f36163F = 1;
        }
        clockHandView2.f36165u = z3;
        clockHandView2.invalidate();
        this.f36152V = resources.getDimensionPixelSize(C5275R.dimen.material_time_picker_minimum_screen_height);
        this.f36153W = resources.getDimensionPixelSize(C5275R.dimen.material_time_picker_minimum_screen_width);
        this.f36154n0 = resources.getDimensionPixelSize(C5275R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C5275R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i6 = (Integer) childAt.getTag(C5275R.id.material_clock_level);
                if (i6 == null) {
                    i6 = 1;
                }
                if (!hashMap.containsKey(i6)) {
                    hashMap.put(i6, new ArrayList());
                }
                ((List) hashMap.get(i6)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f36175K * 0.66f) : this.f36175K;
            Iterator it = list.iterator();
            float f3 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f42210c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new z.i());
                }
                j jVar = ((z.i) hashMap2.get(Integer.valueOf(id))).f42112d;
                jVar.f42178z = C5275R.id.circle_center;
                jVar.f42116A = round;
                jVar.f42117B = f3;
                f3 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f36147Q;
            if (i9 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i9)).setVisibility(0);
            i9++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f36143M.f36170z;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f36147Q;
            int size = sparseArray.size();
            rectF = this.f36145O;
            rect = this.f36144N;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f3) {
                    textView = textView2;
                    f3 = height;
                }
            }
            i++;
        }
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            TextView textView3 = (TextView) sparseArray.get(i6);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f36146P);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f36149S, this.f36150T, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f36155o0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f36154n0 / Math.max(Math.max(this.f36152V / displayMetrics.heightPixels, this.f36153W / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
