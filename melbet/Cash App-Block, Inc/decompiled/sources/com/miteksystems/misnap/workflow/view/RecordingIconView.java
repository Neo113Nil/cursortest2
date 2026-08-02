package com.miteksystems.misnap.workflow.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.WindowCompat$Api35Impl;
import coil3.size.DimensionKt;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.workflow.R$styleable;
import com.miteksystems.misnap.workflow.a.b;
import com.squareup.cash.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.connection.RetryTlsHandshakeKt;

/* loaded from: classes4.dex */
public final class RecordingIconView extends MaterialTextView {
    public Animation a;
    public int b;
    public boolean c;
    public Drawable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        getResources().getDimension(R.dimen.misnapWorkflowRecordingIconViewDrawablePadding);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RecordingIconView, i, i2);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            this.a = resourceId != 0 ? AnimationUtils.loadAnimation(context, resourceId) : null;
            setDrawableId(obtainStyledAttributes.getResourceId(2, 0));
            setDrawablePadding((int) obtainStyledAttributes.getDimension(1, obtainStyledAttributes.getResources().getDimension(R.dimen.misnapWorkflowRecordingIconViewDrawablePadding)));
            int i3 = obtainStyledAttributes.getInt(0, 1);
            int i4 = i3 != 0 ? i3 != 1 ? 8 : 4 : 0;
            this.b = i4;
            setVisibility(i4);
            float f = getContext().getResources().getConfiguration().fontScale;
            if (f > 1.0f) {
                b.a(this, f);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(Drawable drawable) {
        Bitmap drawableToBitmap = drawable != null ? RetryTlsHandshakeKt.drawableToBitmap(drawable, drawable.getIntrinsicHeight(), drawable.getIntrinsicHeight()) : null;
        if (drawableToBitmap != null) {
            int textSize = (int) getTextSize();
            setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(drawableToBitmap, textSize, textSize, true)), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // android.view.View
    public final Animation getAnimation() {
        if (this.c) {
            return this.a;
        }
        return null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(this.e);
    }

    @Override // android.view.View
    public void setAnimation(Animation animation) {
        super.setAnimation(animation);
        this.a = animation;
    }

    public final void setDrawable(Drawable drawable) {
        a(drawable);
        this.e = drawable;
        postInvalidate();
    }

    public final void setDrawableId(int i) {
        setDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), i) : null);
    }

    public final void setDrawablePadding(int i) {
        setCompoundDrawablePadding(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.b = i;
    }

    public final void start() {
        super.setVisibility(0);
        this.c = true;
        Animation animation = this.a;
        if (animation != null) {
            startAnimation(animation);
        }
        String string2 = getResources().getString(R.string.misnapWorkflowRecordingIconViewAccessibilityStartedRecording);
        string2.getClass();
        WindowCompat$Api35Impl.announceStateOnScreenReader$workflow_release(this, string2);
    }

    public final void stop() {
        super.setVisibility(this.b);
        this.c = false;
        Animation animation = this.a;
        if (animation != null) {
            animation.cancel();
            animation.reset();
        }
        String string2 = getResources().getString(R.string.misnapWorkflowRecordingIconViewAccessibilityStoppedRecording);
        string2.getClass();
        WindowCompat$Api35Impl.announceStateOnScreenReader$workflow_release(this, string2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordingIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordingIconView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordingIconView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ RecordingIconView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
