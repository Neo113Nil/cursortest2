package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ea6 extends ViewGroup {
    public f96 a;

    public ea6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new da6();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        da6 da6Var = new da6(context, attributeSet);
        da6Var.r0 = 1.0f;
        da6Var.s0 = false;
        da6Var.t0 = 0.0f;
        da6Var.u0 = 0.0f;
        da6Var.v0 = 0.0f;
        da6Var.w0 = 0.0f;
        da6Var.x0 = 1.0f;
        da6Var.y0 = 1.0f;
        da6Var.z0 = 0.0f;
        da6Var.A0 = 0.0f;
        da6Var.B0 = 0.0f;
        da6Var.C0 = 0.0f;
        da6Var.D0 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cen.e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 15) {
                da6Var.r0 = obtainStyledAttributes.getFloat(index, da6Var.r0);
            } else if (index == 28) {
                da6Var.t0 = obtainStyledAttributes.getFloat(index, da6Var.t0);
                da6Var.s0 = true;
            } else if (index == 23) {
                da6Var.v0 = obtainStyledAttributes.getFloat(index, da6Var.v0);
            } else if (index == 24) {
                da6Var.w0 = obtainStyledAttributes.getFloat(index, da6Var.w0);
            } else if (index == 22) {
                da6Var.u0 = obtainStyledAttributes.getFloat(index, da6Var.u0);
            } else if (index == 20) {
                da6Var.x0 = obtainStyledAttributes.getFloat(index, da6Var.x0);
            } else if (index == 21) {
                da6Var.y0 = obtainStyledAttributes.getFloat(index, da6Var.y0);
            } else if (index == 16) {
                da6Var.z0 = obtainStyledAttributes.getFloat(index, da6Var.z0);
            } else if (index == 17) {
                da6Var.A0 = obtainStyledAttributes.getFloat(index, da6Var.A0);
            } else if (index == 18) {
                da6Var.B0 = obtainStyledAttributes.getFloat(index, da6Var.B0);
            } else if (index == 19) {
                da6Var.C0 = obtainStyledAttributes.getFloat(index, da6Var.C0);
            } else if (index == 27) {
                da6Var.D0 = obtainStyledAttributes.getFloat(index, da6Var.D0);
            }
        }
        obtainStyledAttributes.recycle();
        return da6Var;
    }

    public f96 getConstraintSet() {
        if (this.a == null) {
            this.a = new f96();
        }
        f96 f96Var = this.a;
        f96Var.getClass();
        int childCount = getChildCount();
        HashMap hashMap = f96Var.g;
        hashMap.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            da6 da6Var = (da6) childAt.getLayoutParams();
            int id = childAt.getId();
            if (f96Var.f && id == -1) {
                wvs.p("All children of ConstraintLayout must have ids to use ConstraintSet");
                return null;
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new a96());
            }
            a96 a96Var = (a96) hashMap.get(Integer.valueOf(id));
            if (a96Var != null) {
                if (childAt instanceof r86) {
                    r86 r86Var = (r86) childAt;
                    b96 b96Var = a96Var.e;
                    a96Var.d(id, da6Var);
                    if (r86Var instanceof Barrier) {
                        b96Var.i0 = 1;
                        Barrier barrier = (Barrier) r86Var;
                        b96Var.g0 = barrier.getType();
                        b96Var.j0 = barrier.getReferencedIds();
                        b96Var.h0 = barrier.getMargin();
                    }
                }
                a96Var.d(id, da6Var);
            }
        }
        return this.a;
    }

    public ea6(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public ea6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new t86(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
