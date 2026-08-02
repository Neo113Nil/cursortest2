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
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m3.AbstractC4742a;
import z.j;
import z.n;

/* loaded from: classes2.dex */
class ClockFaceView extends e implements d {

    /* renamed from: M, reason: collision with root package name */
    public final ClockHandView f36910M;

    /* renamed from: N, reason: collision with root package name */
    public final Rect f36911N;

    /* renamed from: O, reason: collision with root package name */
    public final RectF f36912O;

    /* renamed from: P, reason: collision with root package name */
    public final Rect f36913P;

    /* renamed from: Q, reason: collision with root package name */
    public final SparseArray f36914Q;

    /* renamed from: R, reason: collision with root package name */
    public final c f36915R;

    /* renamed from: S, reason: collision with root package name */
    public final int[] f36916S;

    /* renamed from: T, reason: collision with root package name */
    public final float[] f36917T;

    /* renamed from: U, reason: collision with root package name */
    public final int f36918U;

    /* renamed from: V, reason: collision with root package name */
    public final int f36919V;

    /* renamed from: W, reason: collision with root package name */
    public final int f36920W;

    /* renamed from: i0, reason: collision with root package name */
    public final int f36921i0;

    /* renamed from: j0, reason: collision with root package name */
    public final String[] f36922j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f36923k0;

    /* renamed from: l0, reason: collision with root package name */
    public final ColorStateList f36924l0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36911N = new Rect();
        this.f36912O = new RectF();
        this.f36913P = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f36914Q = sparseArray;
        this.f36917T = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39421d, C5248R.attr.materialClockStyle, C5248R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList j6 = com.bumptech.glide.f.j(context, obtainStyledAttributes, 1);
        this.f36924l0 = j6;
        LayoutInflater.from(context).inflate(C5248R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C5248R.id.material_clock_hand);
        this.f36910M = clockHandView;
        this.f36918U = resources.getDimensionPixelSize(C5248R.dimen.material_clock_hand_padding);
        int colorForState = j6.getColorForState(new int[]{R.attr.state_selected}, j6.getDefaultColor());
        this.f36916S = new int[]{colorForState, colorForState, j6.getDefaultColor()};
        clockHandView.f36933v.add(this);
        int defaultColor = E.e.c(context, C5248R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList j9 = com.bumptech.glide.f.j(context, obtainStyledAttributes, 0);
        setBackgroundColor(j9 != null ? j9.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f36915R = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f36922j0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z6 = false;
        for (int i = 0; i < Math.max(this.f36922j0.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f36922j0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C5248R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f36922j0[i]);
                textView.setTag(C5248R.id.material_value_index, Integer.valueOf(i));
                int i4 = (i / 12) + 1;
                textView.setTag(C5248R.id.material_clock_level, Integer.valueOf(i4));
                z6 = i4 > 1 ? true : z6;
                X.o(textView, this.f36915R);
                textView.setTextColor(this.f36924l0);
            }
        }
        ClockHandView clockHandView2 = this.f36910M;
        if (clockHandView2.f36932u && !z6) {
            clockHandView2.f36930F = 1;
        }
        clockHandView2.f36932u = z6;
        clockHandView2.invalidate();
        this.f36919V = resources.getDimensionPixelSize(C5248R.dimen.material_time_picker_minimum_screen_height);
        this.f36920W = resources.getDimensionPixelSize(C5248R.dimen.material_time_picker_minimum_screen_width);
        this.f36921i0 = resources.getDimensionPixelSize(C5248R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C5248R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(C5248R.id.material_clock_level);
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
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f36942K * 0.66f) : this.f36942K;
            Iterator it = list.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f42181c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new z.i());
                }
                j jVar = ((z.i) hashMap2.get(Integer.valueOf(id))).f42083d;
                jVar.f42149z = C5248R.id.circle_center;
                jVar.f42087A = round;
                jVar.f42088B = f2;
                f2 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.f36914Q;
            if (i6 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i6)).setVisibility(0);
            i6++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f36910M.f36937z;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f36914Q;
            int size = sparseArray.size();
            rectF = this.f36912O;
            rect = this.f36911N;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f2) {
                    textView = textView2;
                    f2 = height;
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
                textView3.getLineBounds(0, this.f36913P);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f36916S, this.f36917T, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f36922j0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f36921i0 / Math.max(Math.max(this.f36919V / displayMetrics.heightPixels, this.f36920W / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
