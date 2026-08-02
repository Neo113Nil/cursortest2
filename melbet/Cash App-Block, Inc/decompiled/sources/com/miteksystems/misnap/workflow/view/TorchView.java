package com.miteksystems.misnap.workflow.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda5;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import coil3.size.DimensionKt;
import com.miteksystems.misnap.workflow.R$styleable;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class TorchView extends AppCompatImageView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lifecycle$$ExternalSyntheticLambda0 a;
    public final MutableLiveData b;
    public LiveData c;
    public LiveDataObservable$$ExternalSyntheticLambda5 d;
    public LifecycleOwner e;
    public int f;
    public int g;
    public boolean h;
    public Drawable i;
    public Drawable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TorchView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new Lifecycle$$ExternalSyntheticLambda0(this, 4);
        this.b = new MutableLiveData();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TorchView, i, i2);
        setTorchOnDrawableId(obtainStyledAttributes.getResourceId(1, 0));
        setTorchOffDrawableId(obtainStyledAttributes.getResourceId(0, 0));
        obtainStyledAttributes.recycle();
        setClickable(true);
        setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 18));
    }

    public final void b() {
        setImageDrawable(this.h ? this.i : this.j);
        postInvalidate();
    }

    public final void observe(LifecycleOwner lifecycleOwner, MutableLiveData mutableLiveData) {
        lifecycleOwner.getClass();
        mutableLiveData.getClass();
        this.e = lifecycleOwner;
        this.c = mutableLiveData;
        LiveDataObservable$$ExternalSyntheticLambda5 liveDataObservable$$ExternalSyntheticLambda5 = new LiveDataObservable$$ExternalSyntheticLambda5(this, 14);
        this.d = liveDataObservable$$ExternalSyntheticLambda5;
        mutableLiveData.observe(lifecycleOwner, liveDataObservable$$ExternalSyntheticLambda5);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle$$ExternalSyntheticLambda0 lifecycle$$ExternalSyntheticLambda0 = this.a;
        lifecycle.removeObserver(lifecycle$$ExternalSyntheticLambda0);
        lifecycleOwner.getLifecycle().addObserver(lifecycle$$ExternalSyntheticLambda0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        LiveData liveData;
        LiveDataObservable$$ExternalSyntheticLambda5 liveDataObservable$$ExternalSyntheticLambda5;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = this.e;
        if (lifecycleOwner == null || (liveData = this.c) == null || (liveDataObservable$$ExternalSyntheticLambda5 = this.d) == null) {
            return;
        }
        liveDataObservable$$ExternalSyntheticLambda5.getClass();
        liveData.observe(lifecycleOwner, liveDataObservable$$ExternalSyntheticLambda5);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        LiveData liveData;
        super.onDetachedFromWindow();
        LiveDataObservable$$ExternalSyntheticLambda5 liveDataObservable$$ExternalSyntheticLambda5 = this.d;
        if (liveDataObservable$$ExternalSyntheticLambda5 == null || (liveData = this.c) == null) {
            return;
        }
        liveData.removeObserver(liveDataObservable$$ExternalSyntheticLambda5);
    }

    public final void removeObserver() {
        Lifecycle lifecycle;
        LiveData liveData;
        LiveDataObservable$$ExternalSyntheticLambda5 liveDataObservable$$ExternalSyntheticLambda5 = this.d;
        if (liveDataObservable$$ExternalSyntheticLambda5 != null && (liveData = this.c) != null) {
            liveData.removeObserver(liveDataObservable$$ExternalSyntheticLambda5);
        }
        this.c = null;
        LifecycleOwner lifecycleOwner = this.e;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.a);
        }
        this.e = null;
    }

    public final void setTorchOffDrawable(Drawable drawable) {
        this.j = drawable;
        b();
    }

    public final void setTorchOffDrawableId(int i) {
        this.g = i;
        setTorchOffDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), this.g) : null);
    }

    public final void setTorchOn(boolean z) {
        if (this.h != z) {
            this.h = z;
            String string2 = getResources().getString(z ? R.string.misnapWorkflowTorchViewAccessibilityTorchOn : R.string.misnapWorkflowTorchViewAccessibilityTorchOff);
            string2.getClass();
            WindowCompat$Api35Impl.announceStateOnScreenReader$workflow_release(this, string2);
            b();
        }
    }

    public final void setTorchOnDrawable(Drawable drawable) {
        this.i = drawable;
        b();
    }

    public final void setTorchOnDrawableId(int i) {
        this.f = i;
        setTorchOnDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), this.f) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TorchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TorchView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TorchView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ TorchView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
