package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.TimePickerView;
import com.google.android.material.timepicker.TimePickerView$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    public static final /* synthetic */ int $r8$clinit = 0;
    public HashSet checkedIds;
    public final int defaultCheckId;
    public final LinkedHashSet onButtonCheckedListeners;
    public boolean selectionRequired;
    public boolean singleSelection;
    public boolean skipCheckedStateTracker;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i);
        this.onButtonCheckedListeners = new LinkedHashSet();
        this.skipCheckedStateTracker = false;
        this.checkedIds = new HashSet();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(getContext(), attributeSet, R$styleable.MaterialButtonToggleGroup, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(obtainStyledAttributes.getBoolean(7, false));
        this.defaultCheckId = obtainStyledAttributes.getResourceId(2, -1);
        this.selectionRequired = obtainStyledAttributes.getBoolean(4, false);
        if (this.innerCornerSize == null) {
            this.innerCornerSize = StateListCornerSize.create(new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE));
        }
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        setImportantForAccessibility(1);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName((this.singleSelection ? RadioButton.class : ToggleButton.class).getName());
        checkInternal(materialButton.getId(), materialButton.checked);
        ViewCompat.setAccessibilityDelegate(materialButton, new ClockFaceView.AnonymousClass2(this, 2));
    }

    public final void checkInternal(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.checkedIds);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.singleSelection && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.selectionRequired || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        updateCheckedIds(hashSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.defaultCheckId;
        if (i != -1) {
            updateCheckedIds(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) Toolbar.AnonymousClass1.obtain(1, i, this.singleSelection ? 1 : 2).this$0);
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            updateCheckedIds(new HashSet());
        }
        String name = (this.singleSelection ? RadioButton.class : ToggleButton.class).getName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(name);
        }
    }

    public final void updateCheckedIds(Set set) {
        HashSet hashSet = this.checkedIds;
        this.checkedIds = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.skipCheckedStateTracker = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.skipCheckedStateTracker = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.onButtonCheckedListeners.iterator();
                while (it.hasNext()) {
                    TimePickerView timePickerView = ((TimePickerView$$ExternalSyntheticLambda0) it.next()).f$0;
                }
            }
        }
        invalidate();
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }
}
