package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder;
import androidx.core.graphics.Insets;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object PROTECTION_VIEW = new Object();
    public ProtectionGroup mGroup;
    public final ArrayList mProtections;

    public ProtectionLayout(Context context, List list) {
        super(context);
        this.mProtections = new ArrayList();
        setProtections(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[LOOP:0: B:10:0x0040->B:24:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addProtectionViews() {
        SystemBarStateMonitor systemBarStateMonitor;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.mProtections;
        if (arrayList.isEmpty()) {
            removeProtectionViews();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof SystemBarStateMonitor) {
            systemBarStateMonitor = (SystemBarStateMonitor) tag;
        } else {
            systemBarStateMonitor = new SystemBarStateMonitor(viewGroup);
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, systemBarStateMonitor);
        }
        removeProtectionViews();
        this.mGroup = new ProtectionGroup(systemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.mGroup.mProtections.size();
        for (int i4 = 0; i4 < size; i4++) {
            ColorProtection colorProtection = (ColorProtection) this.mGroup.mProtections.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            Protection$Attributes protection$Attributes = colorProtection.mAttributes;
            int i6 = colorProtection.mSide;
            int i7 = -1;
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = protection$Attributes.mHeight;
                    i2 = 48;
                } else if (i6 == 4) {
                    i = protection$Attributes.mWidth;
                    i2 = 5;
                } else if (i6 != 8) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i6, "Unexpected side: "));
                    return;
                } else {
                    i3 = protection$Attributes.mHeight;
                    i2 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
                Insets insets = protection$Attributes.mMargin;
                layoutParams.leftMargin = insets.left;
                layoutParams.topMargin = insets.top;
                layoutParams.rightMargin = insets.right;
                layoutParams.bottomMargin = insets.bottom;
                View view = new View(context);
                view.setTag(PROTECTION_VIEW);
                view.setTranslationX(protection$Attributes.mTranslationX);
                view.setTranslationY(protection$Attributes.mTranslationY);
                view.setAlpha(protection$Attributes.mAlpha);
                view.setVisibility(protection$Attributes.mVisible ? 0 : 8);
                view.setBackground(protection$Attributes.mDrawable);
                Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(25, layoutParams, view);
                if (protection$Attributes.mCallback == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    protection$Attributes.mCallback = anonymousClass1;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = protection$Attributes.mWidth;
                i2 = 3;
            }
            i7 = i;
            i3 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i3, i2);
            Insets insets2 = protection$Attributes.mMargin;
            layoutParams2.leftMargin = insets2.left;
            layoutParams2.topMargin = insets2.top;
            layoutParams2.rightMargin = insets2.right;
            layoutParams2.bottomMargin = insets2.bottom;
            View view2 = new View(context);
            view2.setTag(PROTECTION_VIEW);
            view2.setTranslationX(protection$Attributes.mTranslationX);
            view2.setTranslationY(protection$Attributes.mTranslationY);
            view2.setAlpha(protection$Attributes.mAlpha);
            view2.setVisibility(protection$Attributes.mVisible ? 0 : 8);
            view2.setBackground(protection$Attributes.mDrawable);
            Recorder.AnonymousClass1 anonymousClass12 = new Recorder.AnonymousClass1(25, layoutParams2, view2);
            if (protection$Attributes.mCallback == null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != PROTECTION_VIEW) {
            ProtectionGroup protectionGroup = this.mGroup;
            int childCount = getChildCount() - (protectionGroup != null ? protectionGroup.mProtections.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addProtectionViews();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeProtectionViews();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof SystemBarStateMonitor) {
            SystemBarStateMonitor systemBarStateMonitor = (SystemBarStateMonitor) tag;
            if (systemBarStateMonitor.mCallbacks.isEmpty()) {
                systemBarStateMonitor.mDetector.post(new AFd1lSDK$$ExternalSyntheticLambda0(systemBarStateMonitor, 1));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public final void removeProtectionViews() {
        ProtectionGroup protectionGroup;
        if (this.mGroup != null) {
            removeViews(getChildCount() - this.mGroup.mProtections.size(), this.mGroup.mProtections.size());
            int size = this.mGroup.mProtections.size();
            int i = 0;
            while (true) {
                protectionGroup = this.mGroup;
                if (i >= size) {
                    break;
                }
                ((ColorProtection) protectionGroup.mProtections.get(i)).mAttributes.mCallback = null;
                i++;
            }
            ArrayList arrayList = protectionGroup.mProtections;
            if (!protectionGroup.mDisposed) {
                protectionGroup.mDisposed = true;
                protectionGroup.mMonitor.mCallbacks.remove(protectionGroup);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((ColorProtection) arrayList.get(size2)).mController = null;
                }
                arrayList.clear();
            }
            this.mGroup = null;
        }
    }

    public void setProtections(List<ColorProtection> list) {
        ArrayList arrayList = this.mProtections;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            addProtectionViews();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.mProtections = new ArrayList();
    }
}
