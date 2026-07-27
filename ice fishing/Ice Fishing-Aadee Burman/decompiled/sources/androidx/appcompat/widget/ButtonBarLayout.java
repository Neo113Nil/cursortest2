package androidx.appcompat.widget;

import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.icefishing.icefishinglive2.C5275R;
import g.AbstractC4518a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public boolean f4571n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4572u;

    /* renamed from: v, reason: collision with root package name */
    public int f4573v;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4573v = -1;
        int[] iArr = AbstractC4518a.f37597k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        X.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f4571n = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f4571n);
        }
    }

    private void setStacked(boolean z3) {
        if (this.f4572u != z3) {
            if (!z3 || this.f4571n) {
                this.f4572u = z3;
                setOrientation(z3 ? 1 : 0);
                setGravity(z3 ? 8388613 : 80);
                View findViewById = findViewById(C5275R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z3 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        int i9;
        boolean z3;
        int i10;
        int size = View.MeasureSpec.getSize(i);
        int i11 = 0;
        if (this.f4571n) {
            if (size > this.f4573v && this.f4572u) {
                setStacked(false);
            }
            this.f4573v = size;
        }
        if (this.f4572u || View.MeasureSpec.getMode(i) != 1073741824) {
            i9 = i;
            z3 = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i9, i6);
        if (this.f4571n && !this.f4572u && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i, i6);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f4572u) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i13).getVisibility() == 0) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                i11 = i10 >= 0 ? getChildAt(i10).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i11 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = X.f2054a;
        if (getMinimumHeight() != i11) {
            setMinimumHeight(i11);
            if (i6 == 0) {
                super.onMeasure(i, i6);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f4571n != z3) {
            this.f4571n = z3;
            if (!z3 && this.f4572u) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
