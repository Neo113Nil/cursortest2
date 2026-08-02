package com.miteksystems.misnap.workflow.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.customview.view.AbsSavedState;
import coil3.size.DimensionKt;
import com.miteksystems.misnap.workflow.R$styleable;
import com.squareup.cash.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ProgressTrackerView extends LinearLayout {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Drawable g;
    public Drawable h;
    public Drawable i;

    public final class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new AbsSavedState.AnonymousClass2(18);
        public int a;
        public boolean b;

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = Boolean.parseBoolean(parcel.readString());
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeString(String.valueOf(this.b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressTrackerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        setOrientation(0);
        setGravity(17);
        setHapticFeedbackEnabled(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ProgressTrackerView, i, i2);
        try {
            setNumberOfProgressChecks(obtainStyledAttributes.getInt(1, 0));
            setProgressTrackerViewSuccessDrawableId(obtainStyledAttributes.getResourceId(2, 0));
            setProgressTrackerViewFailureDrawableId(obtainStyledAttributes.getResourceId(0, 0));
            setProgressTrackerViewUnprocessedDrawableId(obtainStyledAttributes.getResourceId(3, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(Drawable drawable, int i) {
        if (drawable == null || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(i);
        childAt.getClass();
        ((AppCompatImageView) childAt).setImageDrawable(drawable);
    }

    public final void b() {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            a(this.g, i2);
        }
        a(this.a ? this.h : this.i, this.b);
        int i3 = this.c;
        for (int i4 = this.b + 1; i4 < i3; i4++) {
            a(this.i, i4);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setProgressCount(aVar.a);
        setHasError$workflow_release(aVar.b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return onSaveInstanceState;
        }
        a aVar = new a(onSaveInstanceState);
        aVar.a = this.b;
        aVar.b = this.a;
        return aVar;
    }

    public final void setError() {
        if (this.b < this.c) {
            setHasError$workflow_release(true);
            a(this.h, this.b);
        }
    }

    public final /* synthetic */ void setHasError$workflow_release(boolean z) {
        if (this.a != z) {
            this.a = z;
        }
    }

    public final void setNumberOfProgressChecks(int i) {
        if (this.c != i) {
            this.c = i;
        }
        int i2 = this.c;
        int dimension = (int) getResources().getDimension(R.dimen.misnapWorkflowLayoutHorizontalMarginHalf);
        int dimension2 = (int) getResources().getDimension(R.dimen.misnapWorkflowProgressTrackerViewDrawableSize);
        for (int i3 = 0; i3 < i2; i3++) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension2, dimension2);
            layoutParams.setMargins(dimension, 0, dimension, 0);
            appCompatImageView.setLayoutParams(layoutParams);
            appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            appCompatImageView.setImageDrawable(this.i);
            addView(appCompatImageView);
        }
    }

    public final void setProgressCount(int i) {
        if (this.b != i) {
            this.b = i;
        }
    }

    public final void setProgressTrackerViewFailureDrawable(Drawable drawable) {
        this.h = drawable;
        b();
    }

    public final void setProgressTrackerViewFailureDrawableId(int i) {
        this.e = i;
        setProgressTrackerViewFailureDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), this.e) : null);
    }

    public final void setProgressTrackerViewSuccessDrawable(Drawable drawable) {
        this.g = drawable;
        b();
    }

    public final void setProgressTrackerViewSuccessDrawableId(int i) {
        this.d = i;
        setProgressTrackerViewSuccessDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), this.d) : null);
    }

    public final void setProgressTrackerViewUnprocessedDrawable(Drawable drawable) {
        this.i = drawable;
        b();
    }

    public final void setProgressTrackerViewUnprocessedDrawableId(int i) {
        this.f = i;
        setProgressTrackerViewUnprocessedDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), this.f) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressTrackerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressTrackerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressTrackerView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ ProgressTrackerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
