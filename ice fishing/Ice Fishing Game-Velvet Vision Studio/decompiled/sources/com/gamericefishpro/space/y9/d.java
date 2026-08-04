package com.gamericefishpro.space.y9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.fa.l;
import com.gamericefishpro.space.ka.a0;
import com.gamericefishpro.space.ka.b0;
import com.gamericefishpro.space.ka.c0;
import com.gamericefishpro.space.ka.d0;
import com.gamericefishpro.space.ka.n;
import com.gamericefishpro.space.ka.z;
import com.gamericefishpro.space.o2.x;
import com.gamericefishpro.space.tb.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends LinearLayout {
    public int A;
    public d0 B;
    public boolean C;
    public final ArrayList d;
    public final ArrayList e;
    public final u i;
    public final x v;
    public Integer[] w;
    public z y;
    public b0 z;

    public d(Context context, AttributeSet attributeSet) {
        z zVarB;
        int next;
        d0 d0Var;
        int next2;
        super(com.gamericefishpro.space.oa.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.d = new ArrayList();
        this.e = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.i = new u(27, materialButtonToggleGroup);
        this.v = new x(2, materialButtonToggleGroup);
        this.C = true;
        Context context2 = getContext();
        TypedArray typedArrayE = l.e(context2, attributeSet, com.gamericefishpro.space.s9.a.j, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayE.hasValue(2)) {
            int resourceId = typedArrayE.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        d0Var = new d0();
                        d0Var.c = new int[10][];
                        d0Var.d = new com.gamericefishpro.space.vb.c[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            d0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    d0Var = null;
                }
            } else {
                d0Var = null;
            }
            this.B = d0Var;
        }
        if (typedArrayE.hasValue(4)) {
            b0 b0VarB = b0.b(context2, typedArrayE, 4);
            this.z = b0VarB;
            if (b0VarB == null) {
                a0 a0Var = new a0(n.a(context2, typedArrayE.getResourceId(4, 0), typedArrayE.getResourceId(5, 0), new com.gamericefishpro.space.ka.a(0)).a());
                this.z = a0Var.b != 0 ? new b0(a0Var) : null;
            }
        }
        if (typedArrayE.hasValue(3)) {
            com.gamericefishpro.space.ka.a aVar = new com.gamericefishpro.space.ka.a(0.0f);
            int resourceId2 = typedArrayE.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        zVarB = new z();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            zVarB.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } catch (Throwable th3) {
                        if (xml2 == null) {
                            throw th3;
                        }
                        try {
                            xml2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    zVarB = z.b(aVar);
                }
            } else {
                zVarB = z.b(n.c(typedArrayE, 3, aVar));
            }
            this.y = zVarB;
        }
        this.A = typedArrayE.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
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

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.A <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.A - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.A - iMin;
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
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.C = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.i);
        this.d.add(materialButton.getShapeAppearanceModel());
        this.e.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.B == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                int iMin2 = 0;
                if (c(i) && this.B != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    d0 d0Var = this.B;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < d0Var.a; i3++) {
                        c0 c0Var = (c0) d0Var.d[i3].e;
                        int i4 = c0Var.a;
                        float f = c0Var.b;
                        if (i4 == 2) {
                            fMax = Math.max(i2, f);
                        } else {
                            if (i4 == 1) {
                                fMax = Math.max(i2, width * f);
                            }
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i5 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i5)) {
                                materialButton2 = (MaterialButton) getChildAt(i5);
                                break;
                            }
                            i5--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    for (int i6 = i + 1; i6 < childCount; i6++) {
                        if (c(i6)) {
                            materialButton = (MaterialButton) getChildAt(i6);
                            break;
                        }
                    }
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
        }
        int i7 = firstVisibleChildIndex;
        while (i7 <= lastVisibleChildIndex) {
            if (c(i7)) {
                ((MaterialButton) getChildAt(i7)).setSizeChange(this.B);
                ((MaterialButton) getChildAt(i7)).setWidthChangeMax((i7 == firstVisibleChildIndex || i7 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i7++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.O;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.O = null;
                materialButton.L = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.v);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.w = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        a0 a0Var;
        int i;
        if (!(this.y == null && this.z == null) && this.C) {
            this.C = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    b0 b0Var = this.z;
                    if (b0Var == null || (!z && !z2)) {
                        b0Var = (b0) this.e.get(i2);
                    }
                    if (b0Var == null) {
                        a0Var = new a0((n) this.d.get(i2));
                    } else {
                        a0 a0Var2 = new a0(0);
                        int i3 = b0Var.a;
                        a0Var2.b = i3;
                        a0Var2.c = b0Var.b;
                        int[][] iArr = b0Var.c;
                        int[][] iArr2 = new int[iArr.length][];
                        a0Var2.d = iArr2;
                        n[] nVarArr = b0Var.d;
                        a0Var2.e = new n[nVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i3);
                        System.arraycopy(nVarArr, 0, (n[]) a0Var2.e, 0, a0Var2.b);
                        a0Var2.f = b0Var.e;
                        a0Var2.g = b0Var.f;
                        a0Var2.h = b0Var.g;
                        a0Var2.i = b0Var.h;
                        a0Var = a0Var2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    z zVar = this.y;
                    if ((i4 | 1) == i4) {
                        a0Var.f = zVar;
                    }
                    if ((i4 | 2) == i4) {
                        a0Var.g = zVar;
                    }
                    if ((i4 | 4) == i4) {
                        a0Var.h = zVar;
                    }
                    if ((i4 | 8) == i4) {
                        a0Var.i = zVar;
                    }
                    b0 b0Var2 = a0Var.b == 0 ? null : new b0(a0Var);
                    if (b0Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(b0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(b0Var2.c());
                    }
                }
                i2++;
            }
        }
    }

    public d0 getButtonSizeChange() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.w;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public com.gamericefishpro.space.ka.d getInnerCornerSize() {
        return this.y.b;
    }

    public z getInnerCornerSizeStateList() {
        return this.y;
    }

    public n getShapeAppearance() {
        b0 b0Var = this.z;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c();
    }

    public int getSpacing() {
        return this.A;
    }

    public b0 getStateListShapeAppearance() {
        return this.z;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
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
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.d.remove(iIndexOfChild);
            this.e.remove(iIndexOfChild);
        }
        this.C = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(d0 d0Var) {
        if (this.B != d0Var) {
            this.B = d0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(com.gamericefishpro.space.ka.d dVar) {
        this.y = z.b(dVar);
        this.C = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z zVar) {
        this.y = zVar;
        this.C = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.C = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(n nVar) {
        a0 a0Var = new a0(nVar);
        this.z = a0Var.b == 0 ? null : new b0(a0Var);
        this.C = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.A = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(b0 b0Var) {
        this.z = b0Var;
        this.C = true;
        e();
        invalidate();
    }
}
