package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.FastScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes4.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final MotionTiming collapseTiming;
    public final MotionTiming expandTiming;

    public FabTransformationScrimBehavior() {
        this.expandTiming = new MotionTiming(75L);
        this.collapseTiming = new MotionTiming(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        MotionTiming motionTiming = z ? this.expandTiming : this.collapseTiming;
        if (z) {
            if (!z2) {
                view2.setAlpha(RecyclerView.DECELERATION_RATE);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, RecyclerView.DECELERATION_RATE);
        }
        motionTiming.apply(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new FastScroller.AnimatorListener(view2, z));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.expandTiming = new MotionTiming(75L);
        this.collapseTiming = new MotionTiming(0L);
    }
}
