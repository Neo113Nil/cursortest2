package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.expandable.ExpandableWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior {
    public int currentState = 0;

    public ExpandableBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (ExpandableWidget) view2;
        boolean z = ((FloatingActionButton) obj).expandableWidgetHelper.zzc;
        int i = this.currentState;
        if (z) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        boolean z2 = ((FloatingActionButton) obj).expandableWidgetHelper.zzc;
        this.currentState = z2 ? 1 : 2;
        onExpandedStateChange((View) obj, view, z2, true);
        return true;
    }

    public abstract void onExpandedStateChange(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final ExpandableWidget expandableWidget;
        if (!view.isLaidOut()) {
            List dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    expandableWidget = null;
                    break;
                }
                View view2 = (View) dependencies.get(i2);
                if (layoutDependsOn(view, view2)) {
                    expandableWidget = (ExpandableWidget) view2;
                    break;
                }
                i2++;
            }
            if (expandableWidget != null) {
                boolean z = ((FloatingActionButton) expandableWidget).expandableWidgetHelper.zzc;
                int i3 = this.currentState;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    final int i4 = z ? 1 : 2;
                    this.currentState = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            View view3 = view;
                            view3.getViewTreeObserver().removeOnPreDrawListener(this);
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            if (expandableBehavior.currentState == i4) {
                                Object obj = expandableWidget;
                                expandableBehavior.onExpandedStateChange((View) obj, view3, ((FloatingActionButton) obj).expandableWidgetHelper.zzc, false);
                            }
                            return false;
                        }
                    });
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
