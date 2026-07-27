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
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.j;
import z.n;

/* loaded from: classes2.dex */
class ClockFaceView extends e implements d {

    /* renamed from: M, reason: collision with root package name */
    public final ClockHandView f36308M;

    /* renamed from: N, reason: collision with root package name */
    public final Rect f36309N;

    /* renamed from: O, reason: collision with root package name */
    public final RectF f36310O;

    /* renamed from: P, reason: collision with root package name */
    public final Rect f36311P;

    /* renamed from: Q, reason: collision with root package name */
    public final SparseArray f36312Q;

    /* renamed from: R, reason: collision with root package name */
    public final c f36313R;

    /* renamed from: S, reason: collision with root package name */
    public final int[] f36314S;

    /* renamed from: T, reason: collision with root package name */
    public final float[] f36315T;

    /* renamed from: U, reason: collision with root package name */
    public final int f36316U;

    /* renamed from: V, reason: collision with root package name */
    public final int f36317V;

    /* renamed from: W, reason: collision with root package name */
    public final int f36318W;

    /* renamed from: n0, reason: collision with root package name */
    public final int f36319n0;

    /* renamed from: o0, reason: collision with root package name */
    public final String[] f36320o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f36321p0;

    /* renamed from: q0, reason: collision with root package name */
    public final ColorStateList f36322q0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36309N = new Rect();
        this.f36310O = new RectF();
        this.f36311P = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f36312Q = sparseArray;
        this.f36315T = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4576a.f38295d, C5284R.attr.materialClockStyle, C5284R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList o9 = com.bumptech.glide.d.o(context, obtainStyledAttributes, 1);
        this.f36322q0 = o9;
        LayoutInflater.from(context).inflate(C5284R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C5284R.id.material_clock_hand);
        this.f36308M = clockHandView;
        this.f36316U = resources.getDimensionPixelSize(C5284R.dimen.material_clock_hand_padding);
        int colorForState = o9.getColorForState(new int[]{R.attr.state_selected}, o9.getDefaultColor());
        this.f36314S = new int[]{colorForState, colorForState, o9.getDefaultColor()};
        clockHandView.f36331v.add(this);
        int defaultColor = E.e.c(context, C5284R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList o10 = com.bumptech.glide.d.o(context, obtainStyledAttributes, 0);
        setBackgroundColor(o10 != null ? o10.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f36313R = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f36320o0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z8 = false;
        for (int i = 0; i < Math.max(this.f36320o0.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f36320o0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C5284R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f36320o0[i]);
                textView.setTag(C5284R.id.material_value_index, Integer.valueOf(i));
                int i4 = (i / 12) + 1;
                textView.setTag(C5284R.id.material_clock_level, Integer.valueOf(i4));
                z8 = i4 > 1 ? true : z8;
                X.o(textView, this.f36313R);
                textView.setTextColor(this.f36322q0);
            }
        }
        ClockHandView clockHandView2 = this.f36308M;
        if (clockHandView2.f36330u && !z8) {
            clockHandView2.f36328F = 1;
        }
        clockHandView2.f36330u = z8;
        clockHandView2.invalidate();
        this.f36317V = resources.getDimensionPixelSize(C5284R.dimen.material_time_picker_minimum_screen_height);
        this.f36318W = resources.getDimensionPixelSize(C5284R.dimen.material_time_picker_minimum_screen_width);
        this.f36319n0 = resources.getDimensionPixelSize(C5284R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C5284R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(C5284R.id.material_clock_level);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!hashMap.containsKey(i4)) {
                    hashMap.put(i4, new ArrayList());
                }
                ((List) hashMap.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f36340K * 0.66f) : this.f36340K;
            Iterator it = list.iterator();
            float f6 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f42092c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new z.i());
                }
                j jVar = ((z.i) hashMap2.get(Integer.valueOf(id))).f41994d;
                jVar.f42060z = C5284R.id.circle_center;
                jVar.f41998A = round;
                jVar.f41999B = f6;
                f6 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f36312Q;
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
        RectF rectF2 = this.f36308M.f36335z;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f36312Q;
            int size = sparseArray.size();
            rectF = this.f36310O;
            rect = this.f36309N;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f6) {
                    textView = textView2;
                    f6 = height;
                }
            }
            i++;
        }
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            TextView textView3 = (TextView) sparseArray.get(i4);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f36311P);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f36314S, this.f36315T, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f36320o0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f36319n0 / Math.max(Math.max(this.f36317V / displayMetrics.heightPixels, this.f36318W / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
