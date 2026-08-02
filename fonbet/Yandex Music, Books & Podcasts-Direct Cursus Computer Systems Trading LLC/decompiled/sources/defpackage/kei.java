package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class kei extends r86 implements pei {
    public boolean i;
    public boolean j;
    public float k;
    public View[] l;

    public kei(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        this.j = false;
        h(attributeSet);
    }

    public float getProgress() {
        return this.k;
    }

    @Override // defpackage.r86
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cen.n);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.i = obtainStyledAttributes.getBoolean(index, this.i);
                } else if (index == 0) {
                    this.j = obtainStyledAttributes.getBoolean(index, this.j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.k = f;
        int i = 0;
        if (this.b <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                viewGroup.getChildAt(i);
                i++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.g;
        if (viewArr == null || viewArr.length != this.b) {
            this.g = new View[this.b];
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            this.g[i2] = constraintLayout.i(this.a[i2]);
        }
        this.l = this.g;
        while (i < this.b) {
            View view = this.l[i];
            i++;
        }
    }

    public kei(Context context) {
        super(context);
        this.i = false;
        this.j = false;
    }

    public kei(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
        this.j = false;
        h(attributeSet);
    }
}
