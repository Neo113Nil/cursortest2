package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.camera.video.Recorder;
import androidx.core.graphics.Insets;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class ColorProtection {
    public final Protection$Attributes mAttributes;
    public int mColor;
    public ProtectionGroup mController;
    public final ColorDrawable mDrawable;
    public final boolean mHasColor;
    public Insets mInsets;
    public Insets mInsetsIgnoringVisibility;
    public final int mSide;

    static {
        new PathInterpolator(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        new PathInterpolator(0.6f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        new PathInterpolator(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.2f, 1.0f);
        new PathInterpolator(0.4f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
    }

    public ColorProtection(int i, int i2) {
        Protection$Attributes protection$Attributes = new Protection$Attributes();
        protection$Attributes.mWidth = -1;
        protection$Attributes.mHeight = -1;
        Insets insets = Insets.NONE;
        protection$Attributes.mMargin = insets;
        protection$Attributes.mVisible = false;
        protection$Attributes.mDrawable = null;
        protection$Attributes.mTranslationX = RecyclerView.DECELERATION_RATE;
        protection$Attributes.mTranslationY = RecyclerView.DECELERATION_RATE;
        protection$Attributes.mAlpha = 1.0f;
        this.mAttributes = protection$Attributes;
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets;
        this.mController = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unexpected side: "));
            throw null;
        }
        this.mSide = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.mDrawable = colorDrawable;
        this.mColor = 0;
        this.mHasColor = true;
        if (i2 != 0) {
            this.mColor = i2;
            colorDrawable.setColor(i2);
            protection$Attributes.mDrawable = colorDrawable;
            Recorder.AnonymousClass1 anonymousClass1 = protection$Attributes.mCallback;
            if (anonymousClass1 != null) {
                ((View) anonymousClass1.this$0).setBackground(colorDrawable);
            }
        }
    }

    public final void setSystemAlpha(float f) {
        float f2 = f * 1.0f;
        Protection$Attributes protection$Attributes = this.mAttributes;
        if (protection$Attributes.mAlpha != f2) {
            protection$Attributes.mAlpha = f2;
            Recorder.AnonymousClass1 anonymousClass1 = protection$Attributes.mCallback;
            if (anonymousClass1 != null) {
                ((View) anonymousClass1.this$0).setAlpha(f2);
            }
        }
    }

    public final void setSystemInsetAmount(float f) {
        float f2 = f * 1.0f;
        Protection$Attributes protection$Attributes = this.mAttributes;
        int i = this.mSide;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * protection$Attributes.mWidth;
            if (protection$Attributes.mTranslationX != f3) {
                protection$Attributes.mTranslationX = f3;
                Recorder.AnonymousClass1 anonymousClass1 = protection$Attributes.mCallback;
                if (anonymousClass1 != null) {
                    ((View) anonymousClass1.this$0).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * protection$Attributes.mHeight;
            if (protection$Attributes.mTranslationY != f4) {
                protection$Attributes.mTranslationY = f4;
                Recorder.AnonymousClass1 anonymousClass12 = protection$Attributes.mCallback;
                if (anonymousClass12 != null) {
                    ((View) anonymousClass12.this$0).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * protection$Attributes.mWidth;
            if (protection$Attributes.mTranslationX != f5) {
                protection$Attributes.mTranslationX = f5;
                Recorder.AnonymousClass1 anonymousClass13 = protection$Attributes.mCallback;
                if (anonymousClass13 != null) {
                    ((View) anonymousClass13.this$0).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * protection$Attributes.mHeight;
        if (protection$Attributes.mTranslationY != f6) {
            protection$Attributes.mTranslationY = f6;
            Recorder.AnonymousClass1 anonymousClass14 = protection$Attributes.mCallback;
            if (anonymousClass14 != null) {
                ((View) anonymousClass14.this$0).setTranslationY(f6);
            }
        }
    }
}
