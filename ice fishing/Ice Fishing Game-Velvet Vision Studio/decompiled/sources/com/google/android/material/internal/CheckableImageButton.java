package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.fa.a;
import com.gamericefishpro.space.fa.b;
import com.gamericefishpro.space.n.u;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends u implements Checkable {
    public static final int[] z = {R.attr.state_checked};
    public boolean v;
    public boolean w;
    public boolean y;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gamericefishpro.space.R.attr.imageButtonStyle);
        this.w = true;
        this.y = true;
        l0.l(this, new a(this, 0));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.v ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), z) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.d);
        setChecked(bVar.i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.i = this.v;
        return bVar;
    }

    public void setCheckable(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.w || this.v == z2) {
            return;
        }
        this.v = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.y = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.y) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.v);
    }
}
