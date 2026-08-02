package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class RadialViewGroup extends ConstraintLayout {
    public final MaterialShapeDrawable background;
    public int radius;
    public final KnotView$$ExternalSyntheticLambda1 updateLayoutParametersRunnable;

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setShapeAppearanceModel(materialShapeDrawable.drawableState.shapeAppearance.withCornerSize(new RelativeCornerSize(0.5f)));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        setBackground(this.background);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadialViewGroup, i, 0);
        this.radius = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.updateLayoutParametersRunnable = new KnotView$$ExternalSyntheticLambda1(this, 10);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            KnotView$$ExternalSyntheticLambda1 knotView$$ExternalSyntheticLambda1 = this.updateLayoutParametersRunnable;
            handler.removeCallbacks(knotView$$ExternalSyntheticLambda1);
            handler.post(knotView$$ExternalSyntheticLambda1);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            KnotView$$ExternalSyntheticLambda1 knotView$$ExternalSyntheticLambda1 = this.updateLayoutParametersRunnable;
            handler.removeCallbacks(knotView$$ExternalSyntheticLambda1);
            handler.post(knotView$$ExternalSyntheticLambda1);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.background.setFillColor(ColorStateList.valueOf(i));
    }

    public void setRadius(int i) {
        this.radius = i;
        updateLayoutParams();
    }

    public void updateLayoutParams() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
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
            int intValue = ((Integer) entry.getKey()).intValue();
            int i3 = this.radius;
            if (intValue == 2) {
                i3 = Math.round(i3 * 0.66f);
            }
            Iterator it = list.iterator();
            float f = RecyclerView.DECELERATION_RATE;
            while (it.hasNext()) {
                ConstraintSet.Layout layout = constraintSet.get(((View) it.next()).getId()).layout;
                layout.circleConstraint = R.id.circle_center;
                layout.circleRadius = i3;
                layout.circleAngle = f;
                f += 360.0f / list.size();
            }
        }
        constraintSet.applyTo(this);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context) {
        this(context, null);
    }
}
