package androidx.appcompat.widget;

import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import g.AbstractC4528a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public boolean f4539n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4540u;

    /* renamed from: v, reason: collision with root package name */
    public int f4541v;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4541v = -1;
        int[] iArr = AbstractC4528a.f37559k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        X.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f4539n = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f4539n);
        }
    }

    private void setStacked(boolean z6) {
        if (this.f4540u != z6) {
            if (!z6 || this.f4539n) {
                this.f4540u = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View findViewById = findViewById(C5248R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i6;
        boolean z6;
        int i9;
        int size = View.MeasureSpec.getSize(i);
        int i10 = 0;
        if (this.f4539n) {
            if (size > this.f4541v && this.f4540u) {
                setStacked(false);
            }
            this.f4541v = size;
        }
        if (this.f4540u || View.MeasureSpec.getMode(i) != 1073741824) {
            i6 = i;
            z6 = false;
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(i6, i4);
        if (this.f4539n && !this.f4540u && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i, i4);
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            i9 = -1;
            if (i11 >= childCount) {
                i11 = -1;
                break;
            } else if (getChildAt(i11).getVisibility() == 0) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            View childAt = getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f4540u) {
                int i12 = i11 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i12 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i12).getVisibility() == 0) {
                        i9 = i12;
                        break;
                    }
                    i12++;
                }
                i10 = i9 >= 0 ? getChildAt(i9).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i10 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = X.f2142a;
        if (getMinimumHeight() != i10) {
            setMinimumHeight(i10);
            if (i4 == 0) {
                super.onMeasure(i, i4);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f4539n != z6) {
            this.f4539n = z6;
            if (!z6 && this.f4540u) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
