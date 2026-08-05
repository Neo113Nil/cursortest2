package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.ah0;
import defpackage.m1;
import defpackage.z00;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int MdtA4re8;
    public int NCTxEWno;
    public LayoutInflater VgvYg0wo;
    public WeakReference wxUZMvaN;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.NCTxEWno = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.DK9slbsy, 0, 0);
        this.MdtA4re8 = obtainStyledAttributes.getResourceId(2, -1);
        this.NCTxEWno = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.MdtA4re8;
    }

    public LayoutInflater getLayoutInflater() {
        return this.VgvYg0wo;
    }

    public int getLayoutResource() {
        return this.NCTxEWno;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final View qoPGr6Ce() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            m1.Ey6iv0m0("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.NCTxEWno == 0) {
            m1.sjUBp5pO("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.VgvYg0wo;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.NCTxEWno, viewGroup, false);
        int i = this.MdtA4re8;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.wxUZMvaN = new WeakReference(inflate);
        return inflate;
    }

    public void setInflatedId(int i) {
        this.MdtA4re8 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.VgvYg0wo = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.NCTxEWno = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.wxUZMvaN;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                m1.Ey6iv0m0("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            qoPGr6Ce();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(ah0 ah0Var) {
    }
}
