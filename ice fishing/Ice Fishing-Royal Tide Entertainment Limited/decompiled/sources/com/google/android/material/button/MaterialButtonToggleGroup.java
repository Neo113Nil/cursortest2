package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.timepicker.CatchingFishViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.text.CatchingFishEspressoTesting;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishIntentFragment;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishMVPLayoutBundle;
import kotlin.text.CatchingFishRealmSharedFlow;
import kotlin.text.CatchingFishSnackbarPicasso;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends CatchingFishRealmSharedFlow {
    public static final /* synthetic */ int CatchingFishJetpackCompose = 0;
    public HashSet CatchingFish;
    public boolean CatchingFishAnimationMockk;
    public final int CatchingFishNavigation;
    public boolean CatchingFishRoomDatabase;
    public boolean CatchingFishStateLiveData;
    public final LinkedHashSet CatchingFishUnitTesting;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.CatchingFishUnitTesting = new LinkedHashSet();
        this.CatchingFishAnimationMockk = false;
        this.CatchingFish = new HashSet();
        TypedArray CatchingFishCameraXIntent = CatchingFishLayoutRoomFAB.CatchingFishCameraXIntent(getContext(), attributeSet, CatchingFishSnackbarPicasso.CatchingFishEspressoTesting, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(CatchingFishCameraXIntent.getBoolean(7, false));
        this.CatchingFishNavigation = CatchingFishCameraXIntent.getResourceId(2, -1);
        this.CatchingFishRoomDatabase = CatchingFishCameraXIntent.getBoolean(4, false);
        if (this.CatchingFishLayout == null) {
            this.CatchingFishLayout = CatchingFishMVPLayoutBundle.CatchingFishSnackbar(new CatchingFishEspressoTesting(0.0f));
        }
        setEnabled(CatchingFishCameraXIntent.getBoolean(0, true));
        CatchingFishCameraXIntent.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.CatchingFishStateLiveData ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    public final void CatchingFishViewModelScope(Set set) {
        HashSet hashSet = this.CatchingFish;
        this.CatchingFish = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.CatchingFishAnimationMockk = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.CatchingFishAnimationMockk = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.CatchingFishUnitTesting.iterator();
                while (it.hasNext()) {
                    ((CatchingFishViewModel) it.next()).CatchingFishParcelableFAB();
                }
            }
        }
        invalidate();
    }

    public final void CatchingFishWorkManager(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.CatchingFish);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.CatchingFishStateLiveData && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.CatchingFishRoomDatabase || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        CatchingFishViewModelScope(hashSet);
    }

    @Override // kotlin.text.CatchingFishRealmSharedFlow, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setupButtonChild(materialButton);
            CatchingFishWorkManager(materialButton.getId(), materialButton.CatchingFishNavigation);
            CatchingFishFABCameraX.CatchingFishOkHttp(materialButton, new CatchingFishIntentFragment(1, this));
        }
    }

    public int getCheckedButtonId() {
        if (!this.CatchingFishStateLiveData || this.CatchingFish.isEmpty()) {
            return -1;
        }
        return ((Integer) this.CatchingFish.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.CatchingFish.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.CatchingFishNavigation;
        if (i != -1) {
            CatchingFishViewModelScope(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.CatchingFishStateLiveData ? 1 : 2));
    }

    public void setSelectionRequired(boolean z) {
        this.CatchingFishRoomDatabase = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.CatchingFishStateLiveData != z) {
            this.CatchingFishStateLiveData = z;
            CatchingFishViewModelScope(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
