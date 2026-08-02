package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.util.WakeLockManager;
import coil3.request.OneShotDisposable;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ChipGroup extends FlowLayout {
    public final WakeLockManager checkableGroup;
    public int chipSpacingHorizontal;
    public int chipSpacingVertical;
    public final int defaultCheckedId;
    public OnCheckedStateChangeListener onCheckedStateChangeListener;
    public final PassThroughHierarchyChangeListener passThroughListener;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface OnCheckedChangeListener {
    }

    public interface OnCheckedStateChangeListener {
    }

    public final class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        public PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                WakeLockManager wakeLockManager = chipGroup.checkableGroup;
                Chip chip = (Chip) view2;
                ((HashMap) wakeLockManager.wakeLockManagerInternal).put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    wakeLockManager.checkInternal(chip);
                }
                chip.setInternalOnCheckedChangeListener(new OneShotDisposable(wakeLockManager, 29));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                WakeLockManager wakeLockManager = chipGroup.checkableGroup;
                Chip chip = (Chip) view2;
                wakeLockManager.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                ((HashMap) wakeLockManager.wakeLockManagerInternal).remove(Integer.valueOf(chip.getId()));
                ((HashSet) wakeLockManager.wakeLockHandler).remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i);
        WakeLockManager wakeLockManager = new WakeLockManager();
        wakeLockManager.wakeLockManagerInternal = new HashMap();
        wakeLockManager.wakeLockHandler = new HashSet();
        this.checkableGroup = wakeLockManager;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.passThroughListener = passThroughHierarchyChangeListener;
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(getContext(), attributeSet, R$styleable.ChipGroup, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(obtainStyledAttributes.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(obtainStyledAttributes.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(obtainStyledAttributes.getBoolean(5, false));
        setSingleSelection(obtainStyledAttributes.getBoolean(6, false));
        setSelectionRequired(obtainStyledAttributes.getBoolean(4, false));
        this.defaultCheckedId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        wakeLockManager.mainHandler = new OneShotDisposable(this, 27);
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.defaultCheckedId;
        if (i != -1) {
            WakeLockManager wakeLockManager = this.checkableGroup;
            Chip chip = (Chip) ((HashMap) wakeLockManager.wakeLockManagerInternal).get(Integer.valueOf(i));
            if (chip != null && wakeLockManager.checkInternal(chip)) {
                wakeLockManager.onCheckedStateChanged();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.singleLine) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) Toolbar.AnonymousClass1.obtain(this.rowCount, i, this.checkableGroup.enabled ? 1 : 2).this$0);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.chipSpacingHorizontal != i) {
            this.chipSpacingHorizontal = i;
            this.itemSpacing = i;
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.chipSpacingVertical != i) {
            this.chipSpacingVertical = i;
            this.lineSpacing = i;
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new zzb(this));
        }
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.checkableGroup.stayAwake = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        WakeLockManager wakeLockManager = this.checkableGroup;
        if (wakeLockManager.enabled != z) {
            wakeLockManager.enabled = z;
            boolean isEmpty = ((HashSet) wakeLockManager.wakeLockHandler).isEmpty();
            Iterator it = ((HashMap) wakeLockManager.wakeLockManagerInternal).values().iterator();
            while (it.hasNext()) {
                wakeLockManager.uncheckInternal((Chip) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            wakeLockManager.onCheckedStateChanged();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context) {
        this(context, null);
    }
}
