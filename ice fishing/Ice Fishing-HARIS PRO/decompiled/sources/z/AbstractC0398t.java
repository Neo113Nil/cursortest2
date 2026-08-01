package z;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: z.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0398t extends AbstractC0381c {

    /* renamed from: h, reason: collision with root package name */
    public boolean f4972h;
    public boolean i;

    @Override // z.AbstractC0381c
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // z.AbstractC0381c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0396r.f4966b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f4972h = true;
                } else if (index == 22) {
                    this.i = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(w.g gVar, int i, int i2);

    @Override // z.AbstractC0381c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4972h || this.i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f4778b; i++) {
                    View view = (View) constraintLayout.f1890a.get(this.f4777a[i]);
                    if (view != null) {
                        if (this.f4972h) {
                            view.setVisibility(visibility);
                        }
                        if (this.i && elevation > RecyclerView.f2111C0) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }
}
