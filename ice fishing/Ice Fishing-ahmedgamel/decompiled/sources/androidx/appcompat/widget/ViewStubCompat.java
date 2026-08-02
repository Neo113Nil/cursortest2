package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.AbstractC4528a;
import java.lang.ref.WeakReference;
import m.e1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: n, reason: collision with root package name */
    public int f4597n;

    /* renamed from: u, reason: collision with root package name */
    public int f4598u;

    /* renamed from: v, reason: collision with root package name */
    public WeakReference f4599v;

    /* renamed from: w, reason: collision with root package name */
    public LayoutInflater f4600w;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4597n = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37549A, 0, 0);
        this.f4598u = obtainStyledAttributes.getResourceId(2, -1);
        this.f4597n = obtainStyledAttributes.getResourceId(1, 0);
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
        if (this.f4597n == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f4600w;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f4597n, viewGroup, false);
        int i = this.f4598u;
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
        this.f4599v = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4598u;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4600w;
    }

    public int getLayoutResource() {
        return this.f4597n;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f4598u = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4600w = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f4597n = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f4599v;
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

    public void setOnInflateListener(e1 e1Var) {
    }
}
