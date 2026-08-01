package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.AbstractC4518a;
import java.lang.ref.WeakReference;
import m.d1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: n, reason: collision with root package name */
    public int f4629n;

    /* renamed from: u, reason: collision with root package name */
    public int f4630u;

    /* renamed from: v, reason: collision with root package name */
    public WeakReference f4631v;

    /* renamed from: w, reason: collision with root package name */
    public LayoutInflater f4632w;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4629n = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37587A, 0, 0);
        this.f4630u = obtainStyledAttributes.getResourceId(2, -1);
        this.f4629n = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f4629n == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f4632w;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f4629n, viewGroup, false);
        int i = this.f4630u;
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
        this.f4631v = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4630u;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4632w;
    }

    public int getLayoutResource() {
        return this.f4629n;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f4630u = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4632w = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f4629n = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f4631v;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    public void setOnInflateListener(d1 d1Var) {
    }
}
