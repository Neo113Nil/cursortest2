package com.google.android.material.internal;

import A3.a;
import A3.c;
import O.X;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.IceFishing.LiveIceFishing.C5248R;
import m.C4731w;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C4731w implements Checkable {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f36789z = {R.attr.state_checked};

    /* renamed from: w, reason: collision with root package name */
    public boolean f36790w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f36791x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f36792y;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.imageButtonStyle);
        this.f36791x = true;
        this.f36792y = true;
        X.o(this, new a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36790w;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f36790w ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f36789z) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f3390n);
        setChecked(cVar.f97v);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f97v = this.f36790w;
        return cVar;
    }

    public void setCheckable(boolean z6) {
        if (this.f36791x != z6) {
            this.f36791x = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f36791x || this.f36790w == z6) {
            return;
        }
        this.f36790w = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z6) {
        this.f36792y = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f36792y) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f36790w);
    }
}
