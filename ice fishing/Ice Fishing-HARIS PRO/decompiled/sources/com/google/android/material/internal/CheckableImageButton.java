package com.google.android.material.internal;

import B0.m;
import L0.a;
import O.K;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import m.C0289y;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0289y implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2548g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f2549d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2550f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.imageButtonStyle);
        this.e = true;
        this.f2550f = true;
        K.l(this, new m(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2549d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f2549d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f2548g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f1147a);
        setChecked(aVar.f440c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f440c = this.f2549d;
        return aVar;
    }

    public void setCheckable(boolean z2) {
        if (this.e != z2) {
            this.e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.e || this.f2549d == z2) {
            return;
        }
        this.f2549d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f2550f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f2550f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2549d);
    }
}
