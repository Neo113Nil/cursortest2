package com.google.android.material.button;

import E3.j;
import G0.g;
import J3.a;
import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.f;
import com.icefishing.icefishingbigwin.C5275R;
import g1.C4523c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import q3.C4924d;
import q3.e;
import y3.k;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f35898D = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f35899A;

    /* renamed from: B, reason: collision with root package name */
    public final int f35900B;

    /* renamed from: C, reason: collision with root package name */
    public HashSet f35901C;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f35902n;

    /* renamed from: u, reason: collision with root package name */
    public final C4523c f35903u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f35904v;

    /* renamed from: w, reason: collision with root package name */
    public final C4924d f35905w;

    /* renamed from: x, reason: collision with root package name */
    public Integer[] f35906x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35907y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f35908z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5275R.attr.materialButtonToggleGroupStyle, C5275R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, C5275R.attr.materialButtonToggleGroupStyle);
        this.f35902n = new ArrayList();
        this.f35903u = new C4523c(28, this);
        this.f35904v = new LinkedHashSet();
        this.f35905w = new C4924d(this);
        this.f35907y = false;
        this.f35901C = new HashSet();
        TypedArray f3 = k.f(getContext(), attributeSet, AbstractC4632a.f38638k, C5275R.attr.materialButtonToggleGroupStyle, C5275R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(f3.getBoolean(3, false));
        this.f35900B = f3.getResourceId(1, -1);
        this.f35899A = f3.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f3.getBoolean(0, true));
        f3.recycle();
        WeakHashMap weakHashMap = X.f2054a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if ((getChildAt(i6) instanceof MaterialButton) && c(i6)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = X.f2054a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f35903u);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f35892H);
        E3.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f35902n.add(new e(shapeAppearanceModel.f789e, shapeAppearanceModel.f792h, shapeAppearanceModel.f790f, shapeAppearanceModel.f791g));
        materialButton.setEnabled(isEnabled());
        X.o(materialButton, new g(2, this));
    }

    public final void b(int i, boolean z3) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f35901C);
        if (z3 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f35908z && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f35899A || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f35901C;
        this.f35901C = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f35907y = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f35907y = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f35904v.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f35905w);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f35906x = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                j e9 = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f35902n.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z3 = getOrientation() == 0;
                    E3.a aVar = e.f40239e;
                    if (i == firstVisibleChildIndex) {
                        eVar = z3 ? k.e(this) ? new e(aVar, aVar, eVar2.f40241b, eVar2.f40242c) : new e(eVar2.f40240a, eVar2.f40243d, aVar, aVar) : new e(eVar2.f40240a, aVar, eVar2.f40241b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        eVar = z3 ? k.e(this) ? new e(eVar2.f40240a, eVar2.f40243d, aVar, aVar) : new e(aVar, aVar, eVar2.f40241b, eVar2.f40242c) : new e(aVar, eVar2.f40243d, aVar, eVar2.f40242c);
                    } else {
                        eVar2 = null;
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e9.f778e = new E3.a(0.0f);
                    e9.f779f = new E3.a(0.0f);
                    e9.f780g = new E3.a(0.0f);
                    e9.f781h = new E3.a(0.0f);
                } else {
                    e9.f778e = eVar2.f40240a;
                    e9.f781h = eVar2.f40243d;
                    e9.f779f = eVar2.f40241b;
                    e9.f780g = eVar2.f40242c;
                }
                materialButton.setShapeAppearanceModel(e9.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f35908z || this.f35901C.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f35901C.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f35901C.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i6) {
        Integer[] numArr = this.f35906x;
        if (numArr != null && i6 < numArr.length) {
            return numArr[i6].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i6;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f35900B;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f35908z ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        e();
        a();
        super.onMeasure(i, i6);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f35902n.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z3);
        }
    }

    public void setSelectionRequired(boolean z3) {
        this.f35899A = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f35908z != z3) {
            this.f35908z = z3;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f35908z ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
