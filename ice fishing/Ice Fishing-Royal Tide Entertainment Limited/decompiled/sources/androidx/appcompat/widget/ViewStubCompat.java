package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlin.text.CatchingFishRobolectricGson;
import kotlin.text.CatchingFishWidgetGlide;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public LayoutInflater CatchingFishViewModelScope;
    public WeakReference CatchingFishWorkManager;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.CatchingFishReduxKtor = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishCardViewRealm, 0, 0);
        this.CatchingFishDaggerWebsocket = obtainStyledAttributes.getResourceId(2, -1);
        this.CatchingFishReduxKtor = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View CatchingFishParcelableFAB() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.CatchingFishReduxKtor == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.CatchingFishViewModelScope;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.CatchingFishReduxKtor, viewGroup, false);
        int i = this.CatchingFishDaggerWebsocket;
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
        this.CatchingFishWorkManager = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.CatchingFishDaggerWebsocket;
    }

    public LayoutInflater getLayoutInflater() {
        return this.CatchingFishViewModelScope;
    }

    public int getLayoutResource() {
        return this.CatchingFishReduxKtor;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.CatchingFishDaggerWebsocket = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.CatchingFishViewModelScope = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.CatchingFishWorkManager;
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
            CatchingFishParcelableFAB();
        }
    }

    public void setOnInflateListener(CatchingFishRobolectricGson catchingFishRobolectricGson) {
    }
}
