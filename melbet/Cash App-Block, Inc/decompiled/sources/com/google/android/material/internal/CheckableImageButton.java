package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.timepicker.ClockFaceView;

/* loaded from: classes4.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] DRAWABLE_STATE_CHECKED = {R.attr.state_checked};
    public boolean checkable;
    public boolean checked;
    public OnFocusableChangedListener onFocusableChangedListener;
    public boolean pressable;

    public interface OnFocusableChangedListener {
        void onFocusableChanged();
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(12);
        public boolean checked;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.checked = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.checked ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.checkable = true;
        this.pressable = true;
        ViewCompat.setAccessibilityDelegate(this, new ClockFaceView.AnonymousClass2(this, 4));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.checked ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), DRAWABLE_STATE_CHECKED) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.onFocusableChangedListener = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        setChecked(savedState.checked);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.checkable != z) {
            this.checkable = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.checkable || this.checked == z) {
            return;
        }
        this.checked = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        OnFocusableChangedListener onFocusableChangedListener;
        boolean isFocusable = isFocusable();
        super.setFocusable(z);
        if (isFocusable == z || (onFocusableChangedListener = this.onFocusableChangedListener) == null) {
            return;
        }
        onFocusableChangedListener.onFocusableChanged();
    }

    public void setOnFocusableChangedListener(OnFocusableChangedListener onFocusableChangedListener) {
        this.onFocusableChangedListener = onFocusableChangedListener;
    }

    public void setPressable(boolean z) {
        this.pressable = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.pressable) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.checked);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
