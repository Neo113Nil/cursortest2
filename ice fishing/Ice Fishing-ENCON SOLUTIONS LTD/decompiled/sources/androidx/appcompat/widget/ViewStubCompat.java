package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c.AbstractC0131a;
import h.s0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f2244a;

    /* renamed from: b, reason: collision with root package name */
    public int f2245b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2246c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f2247d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2244a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0131a.f2638v, 0, 0);
        this.f2245b = obtainStyledAttributes.getResourceId(2, -1);
        this.f2244a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2245b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2247d;
    }

    public int getLayoutResource() {
        return this.f2244a;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f2245b = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2247d = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f2244a = i2;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference weakReference = this.f2246c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f2244a == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f2247d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2244a, viewGroup, false);
            int i3 = this.f2245b;
            if (i3 != -1) {
                inflate.setId(i3);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2246c = new WeakReference(inflate);
        }
    }

    public void setOnInflateListener(s0 s0Var) {
    }
}
