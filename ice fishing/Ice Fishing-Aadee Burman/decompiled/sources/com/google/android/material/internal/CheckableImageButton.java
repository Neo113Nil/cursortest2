package com.google.android.material.internal;

import G0.g;
import O.X;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.icefishing.icefishinglive2.C5275R;
import m.C4718w;
import y3.C5233a;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C4718w implements Checkable {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f36021z = {R.attr.state_checked};

    /* renamed from: w, reason: collision with root package name */
    public boolean f36022w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f36023x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f36024y;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.imageButtonStyle);
        this.f36023x = true;
        this.f36024y = true;
        X.o(this, new g(3, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36022w;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f36022w ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f36021z) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5233a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5233a c5233a = (C5233a) parcelable;
        super.onRestoreInstanceState(c5233a.f3267n);
        setChecked(c5233a.f41843v);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C5233a c5233a = new C5233a(super.onSaveInstanceState());
        c5233a.f41843v = this.f36022w;
        return c5233a;
    }

    public void setCheckable(boolean z3) {
        if (this.f36023x != z3) {
            this.f36023x = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.f36023x || this.f36022w == z3) {
            return;
        }
        this.f36022w = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z3) {
        this.f36024y = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.f36024y) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f36022w);
    }
}
