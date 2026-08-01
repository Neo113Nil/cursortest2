package com.google.android.material.button;

import B.b;
import C0.d;
import C0.e;
import L0.m;
import O.K;
import S0.j;
import S0.k;
import X0.a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.s;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f2432k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2433a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2434b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2435c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2436d;
    public Integer[] e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2437f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2438g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2439h;
    public final int i;
    public HashSet j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f2433a = new ArrayList();
        this.f2434b = new b(2, this);
        this.f2435c = new LinkedHashSet();
        this.f2436d = new d(this);
        this.f2437f = false;
        this.j = new HashSet();
        TypedArray g2 = m.g(getContext(), attributeSet, AbstractC0358a.f4449n, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(g2.getBoolean(3, false));
        this.i = g2.getResourceId(1, -1);
        this.f2439h = g2.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(g2.getBoolean(0, true));
        g2.recycle();
        WeakHashMap weakHashMap = K.f747a;
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
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = K.f747a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2434b);
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
        b(materialButton.getId(), materialButton.f2429o);
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2433a.add(new e(shapeAppearanceModel.e, shapeAppearanceModel.f1111h, shapeAppearanceModel.f1109f, shapeAppearanceModel.f1110g));
        materialButton.setEnabled(isEnabled());
        K.l(materialButton, new B0.m(1, this));
    }

    public final void b(int i, boolean z2) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z2 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f2438g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f2439h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.j;
        this.j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2437f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2437f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.f2435c.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).a(id, contains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2436d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
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
                j e = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f2433a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    S0.a aVar = e.e;
                    if (i == firstVisibleChildIndex) {
                        eVar = z2 ? m.f(this) ? new e(aVar, aVar, eVar2.f100b, eVar2.f101c) : new e(eVar2.f99a, eVar2.f102d, aVar, aVar) : new e(eVar2.f99a, aVar, eVar2.f100b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        eVar = z2 ? m.f(this) ? new e(eVar2.f99a, eVar2.f102d, aVar, aVar) : new e(aVar, aVar, eVar2.f100b, eVar2.f101c) : new e(aVar, eVar2.f102d, aVar, eVar2.f101c);
                    } else {
                        eVar2 = null;
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e.e = new S0.a(RecyclerView.f2111C0);
                    e.f1100f = new S0.a(RecyclerView.f2111C0);
                    e.f1101g = new S0.a(RecyclerView.f2111C0);
                    e.f1102h = new S0.a(RecyclerView.f2111C0);
                } else {
                    e.e = eVar2.f99a;
                    e.f1102h = eVar2.f102d;
                    e.f1100f = eVar2.f100b;
                    e.f1101g = eVar2.f101c;
                }
                materialButton.setShapeAppearanceModel(e.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2438g || this.j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f2438g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2433a.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f2439h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f2438g != z2) {
            this.f2438g = z2;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f2438g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
