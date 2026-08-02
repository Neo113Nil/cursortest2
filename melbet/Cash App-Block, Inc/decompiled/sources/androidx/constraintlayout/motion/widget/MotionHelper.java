package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;

/* loaded from: classes3.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.TransitionListener {
    public boolean mUseOnHide;
    public boolean mUseOnShow;
    public View[] views;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.mUseOnShow = obtainStyledAttributes.getBoolean(index, this.mUseOnShow);
                } else if (index == 0) {
                    this.mUseOnHide = obtainStyledAttributes.getBoolean(index, this.mUseOnHide);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        int i = 0;
        if (this.mCount <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof MotionHelper)) {
                    setProgress(childAt, f);
                }
                i++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
        }
        for (int i2 = 0; i2 < this.mCount; i2++) {
            this.mViews[i2] = constraintLayout.getViewById(this.mIds[i2]);
        }
        this.views = this.mViews;
        while (i < this.mCount) {
            setProgress(this.views[i], f);
            i++;
        }
    }

    public MotionHelper(Context context) {
        super(context);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attributeSet);
    }

    public void setProgress(View view, float f) {
    }
}
