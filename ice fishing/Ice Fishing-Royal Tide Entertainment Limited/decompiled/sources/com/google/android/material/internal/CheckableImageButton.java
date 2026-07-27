package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import kotlin.text.CatchingFishAsyncTaskView;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishGraphQLView;
import kotlin.text.CatchingFishIntentFragment;

/* loaded from: classes.dex */
public class CheckableImageButton extends CatchingFishAsyncTaskView implements Checkable {
    public static final int[] CatchingFishFragmentHandler = {R.attr.state_checked};
    public boolean CatchingFishLayout;
    public boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.imageButtonStyle);
        this.CatchingFishViewModelFAB = true;
        this.CatchingFishLayout = true;
        CatchingFishFABCameraX.CatchingFishOkHttp(this, new CatchingFishIntentFragment(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.CatchingFishViewModelScope;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.CatchingFishViewModelScope ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), CatchingFishFragmentHandler) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CatchingFishGraphQLView)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CatchingFishGraphQLView catchingFishGraphQLView = (CatchingFishGraphQLView) parcelable;
        super.onRestoreInstanceState(catchingFishGraphQLView.CatchingFishReduxKtor);
        setChecked(catchingFishGraphQLView.CatchingFishWorkManager);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CatchingFishGraphQLView catchingFishGraphQLView = new CatchingFishGraphQLView(super.onSaveInstanceState());
        catchingFishGraphQLView.CatchingFishWorkManager = this.CatchingFishViewModelScope;
        return catchingFishGraphQLView;
    }

    public void setCheckable(boolean z) {
        if (this.CatchingFishViewModelFAB != z) {
            this.CatchingFishViewModelFAB = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.CatchingFishViewModelFAB || this.CatchingFishViewModelScope == z) {
            return;
        }
        this.CatchingFishViewModelScope = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.CatchingFishLayout = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.CatchingFishLayout) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.CatchingFishViewModelScope);
    }
}
