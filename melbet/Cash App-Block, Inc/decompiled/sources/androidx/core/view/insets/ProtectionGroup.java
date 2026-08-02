package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder;
import androidx.core.graphics.Insets;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ProtectionGroup {
    public int mAnimationCount;
    public boolean mDisposed;
    public Insets mInsets;
    public Insets mInsetsIgnoringVisibility;
    public final SystemBarStateMonitor mMonitor;
    public final ArrayList mProtections = new ArrayList();

    public ProtectionGroup(SystemBarStateMonitor systemBarStateMonitor, ArrayList arrayList) {
        Insets insets = Insets.NONE;
        this.mInsets = insets;
        this.mInsetsIgnoringVisibility = insets;
        addProtections(arrayList, false);
        addProtections(arrayList, true);
        ArrayList arrayList2 = systemBarStateMonitor.mCallbacks;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            Insets insets2 = systemBarStateMonitor.mInsets;
            Insets insets3 = systemBarStateMonitor.mInsetsIgnoringVisibility;
            this.mInsets = insets2;
            this.mInsetsIgnoringVisibility = insets3;
            updateInsets();
            onColorHintChanged(systemBarStateMonitor.mColorHint);
        }
        this.mMonitor = systemBarStateMonitor;
    }

    public final void addProtections(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ColorProtection colorProtection = (ColorProtection) list.get(i);
            colorProtection.getClass();
            if (true == z) {
                ProtectionGroup protectionGroup = colorProtection.mController;
                if (protectionGroup != null) {
                    throw new IllegalStateException(colorProtection + " (" + (i + 1) + "/" + size + ") is already controlled by " + protectionGroup + " but is still added to " + this);
                }
                colorProtection.mController = this;
                this.mProtections.add(colorProtection);
            }
        }
    }

    public final void onColorHintChanged(int i) {
        ArrayList arrayList = this.mProtections;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ColorProtection colorProtection = (ColorProtection) arrayList.get(size);
            if (!colorProtection.mHasColor) {
                ColorDrawable colorDrawable = colorProtection.mDrawable;
                if (colorProtection.mColor != i) {
                    colorProtection.mColor = i;
                    colorDrawable.setColor(i);
                    Protection$Attributes protection$Attributes = colorProtection.mAttributes;
                    protection$Attributes.mDrawable = colorDrawable;
                    Recorder.AnonymousClass1 anonymousClass1 = protection$Attributes.mCallback;
                    if (anonymousClass1 != null) {
                        ((View) anonymousClass1.this$0).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void updateInsets() {
        int i;
        Insets of;
        ArrayList arrayList = this.mProtections;
        Insets insets = Insets.NONE;
        Insets insets2 = insets;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ColorProtection colorProtection = (ColorProtection) arrayList.get(size);
            Insets insets3 = this.mInsets;
            Insets insets4 = this.mInsetsIgnoringVisibility;
            colorProtection.mInsets = insets3;
            Protection$Attributes protection$Attributes = colorProtection.mAttributes;
            colorProtection.mInsetsIgnoringVisibility = insets4;
            if (!protection$Attributes.mMargin.equals(insets2)) {
                protection$Attributes.mMargin = insets2;
                Recorder.AnonymousClass1 anonymousClass1 = protection$Attributes.mCallback;
                if (anonymousClass1 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass1.val$videoEncoderSession;
                    layoutParams.leftMargin = insets2.left;
                    layoutParams.topMargin = insets2.top;
                    layoutParams.rightMargin = insets2.right;
                    layoutParams.bottomMargin = insets2.bottom;
                    ((View) anonymousClass1.this$0).setLayoutParams(layoutParams);
                }
            }
            int i2 = colorProtection.mSide;
            if (i2 == 1) {
                i = colorProtection.mInsets.left;
                int i3 = colorProtection.mInsetsIgnoringVisibility.left;
                if (protection$Attributes.mWidth != i3) {
                    protection$Attributes.mWidth = i3;
                    Recorder.AnonymousClass1 anonymousClass12 = protection$Attributes.mCallback;
                    if (anonymousClass12 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anonymousClass12.val$videoEncoderSession;
                        layoutParams2.width = i3;
                        ((View) anonymousClass12.this$0).setLayoutParams(layoutParams2);
                    }
                }
                of = Insets.of(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = colorProtection.mInsets.top;
                int i4 = colorProtection.mInsetsIgnoringVisibility.top;
                if (protection$Attributes.mHeight != i4) {
                    protection$Attributes.mHeight = i4;
                    Recorder.AnonymousClass1 anonymousClass13 = protection$Attributes.mCallback;
                    if (anonymousClass13 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) anonymousClass13.val$videoEncoderSession;
                        layoutParams3.height = i4;
                        ((View) anonymousClass13.this$0).setLayoutParams(layoutParams3);
                    }
                }
                of = Insets.of(0, i, 0, 0);
            } else if (i2 == 4) {
                i = colorProtection.mInsets.right;
                int i5 = colorProtection.mInsetsIgnoringVisibility.right;
                if (protection$Attributes.mWidth != i5) {
                    protection$Attributes.mWidth = i5;
                    Recorder.AnonymousClass1 anonymousClass14 = protection$Attributes.mCallback;
                    if (anonymousClass14 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) anonymousClass14.val$videoEncoderSession;
                        layoutParams4.width = i5;
                        ((View) anonymousClass14.this$0).setLayoutParams(layoutParams4);
                    }
                }
                of = Insets.of(0, 0, i, 0);
            } else if (i2 != 8) {
                of = insets;
                i = 0;
            } else {
                i = colorProtection.mInsets.bottom;
                int i6 = colorProtection.mInsetsIgnoringVisibility.bottom;
                if (protection$Attributes.mHeight != i6) {
                    protection$Attributes.mHeight = i6;
                    Recorder.AnonymousClass1 anonymousClass15 = protection$Attributes.mCallback;
                    if (anonymousClass15 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) anonymousClass15.val$videoEncoderSession;
                        layoutParams5.height = i6;
                        ((View) anonymousClass15.this$0).setLayoutParams(layoutParams5);
                    }
                }
                of = Insets.of(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (protection$Attributes.mVisible != z) {
                protection$Attributes.mVisible = z;
                Recorder.AnonymousClass1 anonymousClass16 = protection$Attributes.mCallback;
                if (anonymousClass16 != null) {
                    ((View) anonymousClass16.this$0).setVisibility(z ? 0 : 8);
                }
            }
            float f = RecyclerView.DECELERATION_RATE;
            colorProtection.setSystemAlpha(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            colorProtection.setSystemInsetAmount(f);
            insets2 = Insets.max(insets2, of);
        }
    }
}
