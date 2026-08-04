package com.google.android.material.timepicker;

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
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.n3.j;
import com.gamericefishpro.space.n3.k;
import com.gamericefishpro.space.n3.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends com.gamericefishpro.space.pa.c implements com.gamericefishpro.space.pa.b {
    public final ClockHandView O;
    public final Rect P;
    public final RectF Q;
    public final Rect R;
    public final SparseArray S;
    public final c T;
    public final int[] U;
    public final float[] V;
    public final int W;
    public final int a0;
    public final int b0;
    public final int c0;
    public final String[] d0;
    public float e0;
    public final ColorStateList f0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = new Rect();
        this.Q = new RectF();
        this.R = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.S = sparseArray;
        this.V = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.gamericefishpro.space.s9.a.d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListV = com.gamericefishpro.space.hj.c.v(context, typedArrayObtainStyledAttributes, 1);
        this.f0 = colorStateListV;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.O = clockHandView;
        this.W = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListV.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListV.getDefaultColor());
        this.U = new int[]{colorForState, colorForState, colorStateListV.getDefaultColor()};
        clockHandView.i.add(this);
        int defaultColor = com.gamericefishpro.space.s3.a.c(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListV2 = com.gamericefishpro.space.hj.c.v(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListV2 != null ? colorStateListV2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.T = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.d0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.d0.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.d0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.d0[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                l0.l(textView, this.T);
                textView.setTextColor(this.f0);
            }
        }
        ClockHandView clockHandView2 = this.O;
        if (clockHandView2.e && !z) {
            clockHandView2.F = 1;
        }
        clockHandView2.e = z;
        clockHandView2.invalidate();
        this.a0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.b0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.c0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.gamericefishpro.space.pa.c
    public final void m() {
        o oVar = new o();
        oVar.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.M * 0.66f) : this.M;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = oVar.c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new j());
                }
                k kVar = ((j) map2.get(Integer.valueOf(id))).d;
                kVar.y = R.id.circle_center;
                kVar.z = iRound;
                kVar.A = size;
                size += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.S;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.O.z;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.S;
            int size = sparseArray.size();
            rect = this.P;
            rectF = this.Q;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
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
                Rect rect2 = this.R;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.U, this.V, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.d0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.c0 / Math.max(Math.max(this.a0 / displayMetrics.heightPixels, this.b0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
