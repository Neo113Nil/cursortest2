package defpackage;

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
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class uch extends LinearLayout {
    public static final /* synthetic */ int k = 0;
    public final ArrayList a;
    public final ArrayList b;
    public final n7b c;
    public final ze0 d;
    public Integer[] e;
    public eer f;
    public her g;
    public int h;
    public ier i;
    public boolean j;

    public uch(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, i);
        eer b;
        XmlResourceParser xml;
        int next;
        ier ierVar;
        AttributeSet asAttributeSet;
        int next2;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new n7b(this);
        this.d = new ze0(2, this);
        this.j = true;
        Context context2 = getContext();
        TypedArray B = bcx.B(context2, attributeSet, vdn.x, i, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (B.hasValue(2)) {
            int resourceId = B.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        ierVar = new ier();
                        ierVar.c = new int[10][];
                        ierVar.d = new hjp[10];
                        asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    ierVar.a(context2, xml, asAttributeSet, context2.getTheme());
                }
                xml.close();
                this.i = ierVar;
            }
            ierVar = null;
            this.i = ierVar;
        }
        if (B.hasValue(4)) {
            her b2 = her.b(context2, B, 4);
            this.g = b2;
            if (b2 == null) {
                gn7 gn7Var = new gn7(eup.a(context2, B.getResourceId(4, 0), B.getResourceId(5, 0)).e());
                this.g = gn7Var.a != 0 ? new her(gn7Var) : null;
            }
        }
        if (B.hasValue(3)) {
            h5 h5Var = new h5(0.0f);
            int resourceId2 = B.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b = eer.b(eup.e(B, 3, h5Var));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        eer eerVar = new eer();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            eerVar.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                        b = eerVar;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b = eer.b(h5Var);
                }
            } else {
                b = eer.b(eup.e(B, 3, h5Var));
            }
            this.f = b;
        }
        this.h = B.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(B.getBoolean(0, true));
        B.recycle();
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

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i2 - 1);
            if (this.h <= 0) {
                i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.h - i);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.h - i;
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
        this.j = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        this.a.add(materialButton.getShapeAppearanceModel());
        this.b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float max;
        if (this.i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i = Integer.MAX_VALUE;
        for (int i2 = firstVisibleChildIndex; i2 <= lastVisibleChildIndex; i2++) {
            if (c(i2)) {
                if (c(i2) && this.i != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i2);
                    ier ierVar = this.i;
                    int width = materialButton3.getWidth();
                    int i3 = -width;
                    for (int i4 = 0; i4 < ierVar.a; i4++) {
                        kwf kwfVar = (kwf) ierVar.d[i4].b;
                        int i5 = kwfVar.b;
                        float f = kwfVar.c;
                        if (i5 == 2) {
                            max = Math.max(i3, f);
                        } else if (i5 == 1) {
                            max = Math.max(i3, width * f);
                        }
                        i3 = (int) max;
                    }
                    int max2 = Math.max(0, i3);
                    int i6 = i2 - 1;
                    while (true) {
                        materialButton = null;
                        if (i6 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i6)) {
                                materialButton2 = (MaterialButton) getChildAt(i6);
                                break;
                            }
                            i6--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i7 = i2 + 1;
                    while (true) {
                        if (i7 >= childCount) {
                            break;
                        }
                        if (c(i7)) {
                            materialButton = (MaterialButton) getChildAt(i7);
                            break;
                        }
                        i7++;
                    }
                    r5 = Math.min(max2, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i2 != firstVisibleChildIndex && i2 != lastVisibleChildIndex) {
                    r5 /= 2;
                }
                i = Math.min(i, r5);
            }
        }
        int i8 = firstVisibleChildIndex;
        while (i8 <= lastVisibleChildIndex) {
            if (c(i8)) {
                ((MaterialButton) getChildAt(i8)).setSizeChange(this.i);
                ((MaterialButton) getChildAt(i8)).setWidthChangeMax((i8 == firstVisibleChildIndex || i8 == lastVisibleChildIndex) ? i : i * 2);
            }
            i8++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.v;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.v = null;
                materialButton.s = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        gn7 gn7Var;
        int i;
        if (!(this.f == null && this.g == null) && this.j) {
            this.j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    her herVar = this.g;
                    if (herVar == null || (!z && !z2)) {
                        herVar = (her) this.b.get(i2);
                    }
                    if (herVar == null) {
                        gn7Var = new gn7((eup) this.a.get(i2));
                    } else {
                        gn7 gn7Var2 = new gn7();
                        int i3 = herVar.a;
                        gn7Var2.a = i3;
                        gn7Var2.c = herVar.b;
                        int[][] iArr = herVar.c;
                        int[][] iArr2 = new int[iArr.length][];
                        gn7Var2.d = iArr2;
                        eup[] eupVarArr = herVar.d;
                        gn7Var2.b = new eup[eupVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i3);
                        System.arraycopy(eupVarArr, 0, (eup[]) gn7Var2.b, 0, gn7Var2.a);
                        gn7Var2.e = herVar.e;
                        gn7Var2.f = herVar.f;
                        gn7Var2.g = herVar.g;
                        gn7Var2.h = herVar.h;
                        gn7Var = gn7Var2;
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
                    eer eerVar = this.f;
                    if ((i4 | 1) == i4) {
                        gn7Var.e = eerVar;
                    }
                    if ((i4 | 2) == i4) {
                        gn7Var.f = eerVar;
                    }
                    if ((i4 | 4) == i4) {
                        gn7Var.g = eerVar;
                    }
                    if ((i4 | 8) == i4) {
                        gn7Var.h = eerVar;
                    }
                    her herVar2 = gn7Var.a == 0 ? null : new her(gn7Var);
                    if (herVar2.d()) {
                        materialButton.setStateListShapeAppearanceModel(herVar2);
                    } else {
                        materialButton.setShapeAppearanceModel(herVar2.c());
                    }
                }
                i2++;
            }
        }
    }

    public ier getButtonSizeChange() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    @NonNull
    public zl6 getInnerCornerSize() {
        return this.f.b;
    }

    @NonNull
    public eer getInnerCornerSizeStateList() {
        return this.f;
    }

    public eup getShapeAppearance() {
        her herVar = this.g;
        if (herVar == null) {
            return null;
        }
        return herVar.c();
    }

    public int getSpacing() {
        return this.h;
    }

    public her getStateListShapeAppearance() {
        return this.g;
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
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.a.remove(indexOfChild);
            this.b.remove(indexOfChild);
        }
        this.j = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(@NonNull ier ierVar) {
        if (this.i != ierVar) {
            this.i = ierVar;
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

    public void setInnerCornerSize(@NonNull zl6 zl6Var) {
        this.f = eer.b(zl6Var);
        this.j = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(@NonNull eer eerVar) {
        this.f = eerVar;
        this.j = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.j = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(eup eupVar) {
        gn7 gn7Var = new gn7(eupVar);
        this.g = gn7Var.a == 0 ? null : new her(gn7Var);
        this.j = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.h = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(her herVar) {
        this.g = herVar;
        this.j = true;
        e();
        invalidate();
    }

    public uch(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    public uch(@NonNull Context context) {
        this(context, null);
    }
}
