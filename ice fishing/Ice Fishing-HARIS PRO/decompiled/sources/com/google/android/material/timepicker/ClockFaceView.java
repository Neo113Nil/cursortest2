package com.google.android.material.timepicker;

import O.K;
import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u0.AbstractC0358a;
import z.C0387i;
import z.C0388j;
import z.C0392n;

/* loaded from: classes.dex */
class ClockFaceView extends j implements f {

    /* renamed from: A, reason: collision with root package name */
    public final float[] f2666A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2667B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2668C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2669D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2670E;

    /* renamed from: F, reason: collision with root package name */
    public String[] f2671F;

    /* renamed from: G, reason: collision with root package name */
    public float f2672G;

    /* renamed from: H, reason: collision with root package name */
    public final ColorStateList f2673H;

    /* renamed from: t, reason: collision with root package name */
    public final ClockHandView f2674t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f2675u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f2676v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2677w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f2678x;

    /* renamed from: y, reason: collision with root package name */
    public final c f2679y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f2680z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2675u = new Rect();
        this.f2676v = new RectF();
        this.f2677w = new Rect();
        this.f2678x = new SparseArray();
        this.f2666A = new float[]{RecyclerView.f2111C0, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.f4444g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList B2 = AbstractC0078a.B(context, obtainStyledAttributes, 1);
        this.f2673H = B2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2674t = clockHandView;
        this.f2667B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = B2.getColorForState(new int[]{android.R.attr.state_selected}, B2.getDefaultColor());
        this.f2680z = new int[]{colorForState, colorForState, B2.getDefaultColor()};
        clockHandView.j.add(this);
        int defaultColor = AbstractC0078a.z(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList B3 = AbstractC0078a.B(context, obtainStyledAttributes, 0);
        setBackgroundColor(B3 != null ? B3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2679y = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        p(strArr, 0);
        this.f2668C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f2669D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2670E = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.f
    public final void d(float f2, boolean z2) {
        if (Math.abs(this.f2672G - f2) > 0.001f) {
            this.f2672G = f2;
            o();
        }
    }

    @Override // com.google.android.material.timepicker.j
    public final void n() {
        C0392n c0392n = new C0392n();
        c0392n.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2738r * 0.66f) : this.f2738r;
            Iterator it = list.iterator();
            float f2 = RecyclerView.f2111C0;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = c0392n.f4963c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C0387i());
                }
                C0388j c0388j = ((C0387i) hashMap2.get(Integer.valueOf(id))).f4871d;
                c0388j.f4936z = R.id.circle_center;
                c0388j.f4874A = round;
                c0388j.f4875B = f2;
                f2 += 360.0f / list.size();
            }
        }
        c0392n.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f2678x;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void o() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2674t.f2692n;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f2678x;
            int size = sparseArray.size();
            rectF = this.f2676v;
            rect = this.f2675u;
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
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2677w);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2680z, this.f2666A, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2671F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f2670E / Math.max(Math.max(this.f2668C / displayMetrics.heightPixels, this.f2669D / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void p(String[] strArr, int i) {
        this.f2671F = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.f2678x;
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < Math.max(this.f2671F.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f2671F.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f2671F[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z2 = true;
                }
                K.l(textView, this.f2679y);
                textView.setTextColor(this.f2673H);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f2671F[i2]));
                }
            }
        }
        ClockHandView clockHandView = this.f2674t;
        if (clockHandView.i && !z2) {
            clockHandView.f2699u = 1;
        }
        clockHandView.i = z2;
        clockHandView.invalidate();
    }
}
