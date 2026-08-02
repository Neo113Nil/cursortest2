package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopup;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearance;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.mlkit.vision.text.internal.zzr;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class MaterialButtonGroup extends LinearLayout {
    public static final Object OVERFLOW_BUTTON_TAG = new Object();
    public final boolean buttonOverflowInitialized;
    public StateListSizeChange buttonSizeChange;
    public final HashMap buttonToMenuItemMapping;
    public Integer[] childOrder;
    public final VideoCapture$$ExternalSyntheticLambda6 childOrderComparator;
    public boolean childShapesDirty;
    public StateListShapeAppearanceModel groupStateListShapeAppearance;
    public StateListCornerSize innerCornerSize;
    public final ArrayList originalChildShapeAppearanceModels;
    public final MaterialButton overflowButton;
    public final ArrayList overflowButtonsList;
    public final int overflowMenuItemIconPadding;
    public int overflowMode;
    public final Recorder.AnonymousClass3 popupMenu;
    public final HashMap popupMenuItemToButtonMapping;
    public final zzr pressedStateTracker;
    public final ArrayList rowButtonFirstIndices;
    public int spacing;
    public final ArrayList tempOverflowButtonsList;

    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, i);
        StateListCornerSize create;
        XmlResourceParser xml;
        int next;
        int next2;
        this.overflowMode = 0;
        this.originalChildShapeAppearanceModels = new ArrayList();
        this.pressedStateTracker = new zzr(this, 3);
        this.childOrderComparator = new VideoCapture$$ExternalSyntheticLambda6(this, 6);
        this.childShapesDirty = true;
        this.popupMenuItemToButtonMapping = new HashMap();
        this.buttonToMenuItemMapping = new HashMap();
        this.tempOverflowButtonsList = new ArrayList();
        this.overflowButtonsList = new ArrayList();
        this.rowButtonFirstIndices = new ArrayList();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.MaterialButtonGroup, i, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (obtainStyledAttributes.hasValue(2)) {
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            StateListSizeChange stateListSizeChange = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        StateListSizeChange stateListSizeChange2 = new StateListSizeChange();
                        stateListSizeChange2.stateSpecs = new int[10][];
                        stateListSizeChange2.sizeChanges = new zzr[10];
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
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
                            stateListSizeChange2.loadSizeChangeFromItems(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        stateListSizeChange = stateListSizeChange2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.buttonSizeChange = stateListSizeChange;
        }
        if (obtainStyledAttributes.hasValue(6)) {
            StateListShapeAppearanceModel create2 = StateListShapeAppearanceModel.create(context2, obtainStyledAttributes, 6);
            this.groupStateListShapeAppearance = create2;
            if (create2 == null) {
                int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
                int resourceId3 = obtainStyledAttributes.getResourceId(7, 0);
                AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.groupStateListShapeAppearance = new WriteOperation(ShapeAppearanceModel.builder(contextThemeWrapper.obtainStyledAttributes(R$styleable.ShapeAppearance), absoluteCornerSize).build()).build();
            }
        }
        if (obtainStyledAttributes.hasValue(3)) {
            AbsoluteCornerSize absoluteCornerSize2 = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
            int resourceId4 = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId4 == 0) {
                create = StateListCornerSize.create(ShapeAppearanceModel.getCornerSize(obtainStyledAttributes, 3, absoluteCornerSize2));
            } else if (context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId4);
                    try {
                        StateListCornerSize stateListCornerSize = new StateListCornerSize();
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
                            stateListCornerSize.loadCornerSizesFromItems(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                        create = stateListCornerSize;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    create = StateListCornerSize.create(absoluteCornerSize2);
                }
            } else {
                create = StateListCornerSize.create(ShapeAppearanceModel.getCornerSize(obtainStyledAttributes, 3, absoluteCornerSize2));
            }
            this.innerCornerSize = create;
        }
        this.spacing = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        setOverflowMode(obtainStyledAttributes.getInt(5, 0));
        this.overflowMenuItemIconPadding = getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        if (!(this instanceof MaterialButtonToggleGroup)) {
            Drawable drawable = obtainStyledAttributes.getDrawable(4);
            MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context2).inflate(R.layout.m3_button_group_overflow_button, (ViewGroup) this, false);
            this.overflowButton = materialButton;
            materialButton.setTag(OVERFLOW_BUTTON_TAG);
            setOverflowButtonIcon(drawable);
            if (this.overflowButton.getContentDescription() == null) {
                this.overflowButton.setContentDescription(getResources().getString(R.string.mtrl_button_overflow_icon_content_description));
            }
            this.overflowButton.setVisibility(8);
            Recorder.AnonymousClass3 anonymousClass3 = new Recorder.AnonymousClass3(getContext(), this.overflowButton, MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.materialButtonGroupPopupMenuStyle).data);
            this.popupMenu = anonymousClass3;
            MenuPopupHelper menuPopupHelper = (MenuPopupHelper) anonymousClass3.this$0;
            menuPopupHelper.mForceShowIcon = true;
            MenuPopup menuPopup = menuPopupHelper.mPopup;
            if (menuPopup != null) {
                menuPopup.setForceShowIcon(true);
            }
            this.overflowButton.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 9));
            addView(this.overflowButton);
            this.buttonOverflowInitialized = true;
        }
        obtainStyledAttributes.recycle();
    }

    public static LinearLayout.LayoutParams buildLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LayoutParams(layoutParams.width, layoutParams.height);
    }

    public static LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.overflowIcon = null;
            layoutParams2.overflowText = null;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.overflowIcon = null;
            layoutParams3.overflowText = null;
            return layoutParams3;
        }
        LayoutParams layoutParams4 = new LayoutParams(layoutParams);
        layoutParams4.overflowIcon = null;
        layoutParams4.overflowText = null;
        return layoutParams4;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        recoverAllChildrenLayoutParams();
        this.childShapesDirty = true;
        int indexOfChild = indexOfChild(this.overflowButton);
        if (indexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, indexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
        materialButton.onPressedChangeListenerInternal = this.pressedStateTracker;
        if (!materialButton.isUsingOriginalBackground()) {
            a$$ExternalSyntheticBUOutline0.m$1("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
            return;
        }
        this.originalChildShapeAppearanceModels.add(materialButton.materialButtonHelper.shapeAppearance);
        materialButton.setEnabled(isEnabled());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void adjustChildMarginsAndUpdateLayout() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            View childAt2 = getChildAt(i2 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.spacing <= 0) {
                    i = Math.min(materialButton.isUsingOriginalBackground() ? materialButton.materialButtonHelper.strokeWidth : 0, materialButton2.isUsingOriginalBackground() ? materialButton2.materialButtonHelper.strokeWidth : 0);
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                    LinearLayout.LayoutParams buildLayoutParams = buildLayoutParams(childAt);
                    if (getOrientation() != 0) {
                        buildLayoutParams.setMarginEnd(0);
                        buildLayoutParams.setMarginStart(this.spacing - i);
                        buildLayoutParams.topMargin = 0;
                    } else {
                        buildLayoutParams.bottomMargin = 0;
                        buildLayoutParams.topMargin = this.spacing - i;
                        buildLayoutParams.setMarginStart(0);
                    }
                    childAt.setLayoutParams(buildLayoutParams);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                }
            }
            i = 0;
            LinearLayout.LayoutParams buildLayoutParams2 = buildLayoutParams(childAt);
            if (getOrientation() != 0) {
            }
            childAt.setLayoutParams(buildLayoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams buildLayoutParams3 = buildLayoutParams((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            buildLayoutParams3.topMargin = 0;
            buildLayoutParams3.bottomMargin = 0;
        } else {
            buildLayoutParams3.setMarginEnd(0);
            buildLayoutParams3.setMarginStart(0);
            buildLayoutParams3.leftMargin = 0;
            buildLayoutParams3.rightMargin = 0;
        }
    }

    public final void adjustChildSizeChange() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                childCount = -1;
                break;
            } else if (isChildVisible$1(childCount)) {
                break;
            }
        }
        if (firstVisibleChildIndex == -1 || this.buttonSizeChange == null) {
            return;
        }
        if (this.overflowMode != 2) {
            adjustChildSizeChangeInRange(firstVisibleChildIndex, childCount);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.rowButtonFirstIndices;
            if (i >= arrayList.size()) {
                return;
            }
            adjustChildSizeChangeInRange(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    public final void adjustChildSizeChangeInRange(int i, int i2) {
        float max;
        if (i == i2) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.widthChangeDirection != 1) {
                materialButton.widthChangeDirection = 1;
                materialButton.maybeAnimateSize(true);
                return;
            }
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = i;
        while (i4 <= i2) {
            if (isChildVisible$1(i4)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i4);
                int i5 = i4 == i ? 3 : i4 == i2 ? 2 : 4;
                if (materialButton2.widthChangeDirection != i5) {
                    materialButton2.widthChangeDirection = i5;
                    materialButton2.maybeAnimateSize(true);
                }
                if (isChildVisible$1(i4) && this.buttonSizeChange != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i4);
                    StateListSizeChange stateListSizeChange = this.buttonSizeChange;
                    int width = materialButton3.getWidth();
                    int i6 = -width;
                    for (int i7 = 0; i7 < stateListSizeChange.stateCount; i7++) {
                        StateListSizeChange.SizeChangeAmount sizeChangeAmount = (StateListSizeChange.SizeChangeAmount) stateListSizeChange.sizeChanges[i7].zza;
                        int i8 = sizeChangeAmount.f996type;
                        float f = sizeChangeAmount.amount;
                        if (i8 == 2) {
                            max = Math.max(i6, f);
                        } else if (i8 == 1) {
                            max = Math.max(i6, width * f);
                        }
                        i6 = (int) max;
                    }
                    int max2 = Math.max(0, i6);
                    MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(i4);
                    int i9 = prevVisibleChildButton == null ? 0 : prevVisibleChildButton.allowedWidthDecrease;
                    MaterialButton nextVisibleChildButton = getNextVisibleChildButton(i4);
                    r5 = Math.min(max2, i9 + (nextVisibleChildButton != null ? nextVisibleChildButton.allowedWidthDecrease : 0));
                }
                if (i4 != i && i4 != i2) {
                    r5 /= 2;
                }
                i3 = Math.min(i3, r5);
            }
            i4++;
        }
        while (i <= i2) {
            if (isChildVisible$1(i)) {
                MaterialButton materialButton4 = (MaterialButton) getChildAt(i);
                StateListSizeChange stateListSizeChange2 = this.buttonSizeChange;
                if (materialButton4.sizeChange != stateListSizeChange2) {
                    materialButton4.sizeChange = stateListSizeChange2;
                    materialButton4.maybeAnimateSize(true);
                }
                int i10 = i3 * 2;
                if (materialButton4.widthChangeMax != i10) {
                    materialButton4.widthChangeMax = i10;
                    materialButton4.maybeAnimateSize(true);
                }
            }
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.childOrder;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public final int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (isChildVisible$1(i)) {
                return i;
            }
        }
        return -1;
    }

    public final MaterialButton getNextVisibleChildButton(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (isChildVisible$1(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.rowButtonFirstIndices;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int intValue2 = i3 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i3 + 1)).intValue() - 1;
                if (i >= intValue && i <= intValue2 && (i2 < intValue || i2 > intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    public final MaterialButton getPrevVisibleChildButton(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (isChildVisible$1(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.rowButtonFirstIndices;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int intValue2 = i3 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i3 + 1)).intValue();
                if (i >= intValue && i < intValue2 && (i2 < intValue || i2 >= intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean isChildVisible$1(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final int measureAndGetChildButtonSize(boolean z, Button button, int i, int i2) {
        int i3;
        int i4;
        measureChild(button, i, i2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        int measuredWidth = z ? button.getMeasuredWidth() : button.getMeasuredHeight();
        if (z) {
            i3 = layoutParams.leftMargin;
            i4 = layoutParams.rightMargin;
        } else {
            i3 = layoutParams.topMargin;
            i4 = layoutParams.bottomMargin;
        }
        int i5 = i3 + i4;
        if (measuredWidth == 0) {
            measuredWidth = z ? button.getMinimumWidth() : button.getMinimumHeight();
        }
        return measuredWidth + i5;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            recoverAllChildrenLayoutParams();
            adjustChildSizeChange();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        HashMap hashMap;
        MenuItemImpl menuItemImpl;
        adjustChildMarginsAndUpdateLayout();
        if (this.overflowMode != 2) {
            i3 = 0;
        } else {
            if (getOrientation() == 1) {
                a$$ExternalSyntheticBUOutline0.m$3("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                a$$ExternalSyntheticBUOutline0.m$3("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.rowButtonFirstIndices;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if (isChildVisible$1(i7)) {
                    View view = (MaterialButton) getChildAt(i7);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams buildLayoutParams = buildLayoutParams(view);
                        if (i4 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.spacing) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i4));
                            }
                            i6 += i5 + (arrayList.isEmpty() ? 0 : this.spacing);
                            arrayList.add(Integer.valueOf(i7));
                            buildLayoutParams.setMarginStart(-i4);
                            arrayList2.clear();
                            i4 = 0;
                            i5 = 0;
                        }
                        i4 += measuredWidth + (i4 == 0 ? 0 : this.spacing);
                        i5 = Math.max(i5, measuredHeight);
                        arrayList2.add(Integer.valueOf(i7));
                        buildLayoutParams.topMargin += i6;
                        view.setLayoutParams(buildLayoutParams);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i4));
            int intValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i8 = 0;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                int intValue2 = ((Integer) arrayList.get(i9)).intValue();
                int intValue3 = ((Integer) arrayList3.get(i9)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(intValue2);
                LinearLayout.LayoutParams buildLayoutParams2 = buildLayoutParams(materialButton);
                int i10 = buildLayoutParams2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
                int i11 = intValue - intValue3;
                if (i10 != 8388611) {
                    if (absoluteGravity == 1) {
                        i11 /= 2;
                    }
                    buildLayoutParams2.setMarginStart((buildLayoutParams2.getMarginStart() + i11) - i8);
                    materialButton.setLayoutParams(buildLayoutParams2);
                    i8 = i11;
                }
            }
            i3 = getPaddingTop() + i6 + i5 + getPaddingBottom();
        }
        if (this.buttonOverflowInitialized) {
            int i12 = this.overflowMode;
            Button button = this.overflowButton;
            if (i12 != 1) {
                button.setVisibility(8);
            } else {
                boolean z = getOrientation() == 0;
                ArrayList arrayList4 = this.tempOverflowButtonsList;
                arrayList4.clear();
                int size2 = z ? View.MeasureSpec.getSize(i) : View.MeasureSpec.getSize(i2);
                int measureAndGetChildButtonSize = measureAndGetChildButtonSize(z, button, i, i2);
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i13 >= getChildCount() - 1) {
                        button.setVisibility(8);
                        arrayList4.clear();
                        break;
                    }
                    MaterialButton materialButton2 = (MaterialButton) getChildAt(i13);
                    i14 += measureAndGetChildButtonSize(z, materialButton2, i, i2);
                    if (i14 + measureAndGetChildButtonSize > size2) {
                        arrayList4.add(materialButton2);
                    }
                    if (i14 > size2) {
                        for (int i15 = i13 + 1; i15 < getChildCount() - 1; i15++) {
                            arrayList4.add((MaterialButton) getChildAt(i15));
                        }
                        button.setVisibility(0);
                    } else {
                        i13++;
                    }
                }
                ArrayList arrayList5 = this.overflowButtonsList;
                if (!arrayList4.equals(arrayList5)) {
                    int i16 = 0;
                    while (true) {
                        int childCount = getChildCount() - 1;
                        hashMap = this.buttonToMenuItemMapping;
                        if (i16 >= childCount) {
                            break;
                        }
                        MaterialButton materialButton3 = (MaterialButton) getChildAt(i16);
                        if (hashMap.containsKey(materialButton3)) {
                            materialButton3.setVisibility(0);
                        }
                        i16++;
                    }
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    MenuBuilder menuBuilder = (MenuBuilder) this.popupMenu.val$completer;
                    HashMap hashMap2 = this.popupMenuItemToButtonMapping;
                    hashMap2.clear();
                    hashMap.clear();
                    menuBuilder.clear();
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        Button button2 = (Button) it.next();
                        if (button2.getLayoutParams() instanceof LayoutParams) {
                            LayoutParams layoutParams = (LayoutParams) button2.getLayoutParams();
                            CharSequence charSequence = layoutParams.overflowText;
                            if (TextUtils.isEmpty(charSequence)) {
                                if (button2 instanceof MaterialButton) {
                                    MaterialButton materialButton4 = (MaterialButton) button2;
                                    if (!TextUtils.isEmpty(materialButton4.getText())) {
                                        charSequence = materialButton4.getText();
                                    }
                                }
                                charSequence = button2.getContentDescription();
                            }
                            Drawable drawable = layoutParams.overflowIcon;
                            MenuItemImpl addInternal = menuBuilder.addInternal(0, 0, 0, charSequence);
                            if (drawable != null) {
                                int i17 = this.overflowMenuItemIconPadding;
                                addInternal.setIcon(new InsetDrawable(drawable, i17, 0, i17, 0));
                            }
                            addInternal.mClickListener = new MaterialButtonGroup$$ExternalSyntheticLambda1(button2, 0);
                            menuItemImpl = addInternal;
                        } else {
                            menuItemImpl = null;
                        }
                        if (menuItemImpl != null) {
                            hashMap2.put(Integer.valueOf(menuItemImpl.mId), button2);
                            hashMap.put(button2, menuItemImpl);
                            button2.setVisibility(8);
                        }
                    }
                    updateOverflowMenuItemsState();
                }
            }
        }
        updateChildShapes();
        super.onMeasure(i, i2);
        if (this.overflowMode != 2 || i3 == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).onPressedChangeListenerInternal = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.originalChildShapeAppearanceModels.remove(indexOfChild);
        }
        this.childShapesDirty = true;
        updateChildShapes();
        recoverAllChildrenLayoutParams();
        adjustChildMarginsAndUpdateLayout();
    }

    public final void recoverAllChildrenLayoutParams() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.originalLayoutParams;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.originalLayoutParams = null;
                materialButton.originalWidth = -2.1474836E9f;
            }
        }
    }

    public void setButtonSizeChange(StateListSizeChange stateListSizeChange) {
        if (this.buttonSizeChange != stateListSizeChange) {
            this.buttonSizeChange = stateListSizeChange;
            adjustChildSizeChange();
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

    public void setInnerCornerSize(CornerSize cornerSize) {
        this.innerCornerSize = StateListCornerSize.create(cornerSize);
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setInnerCornerSizeStateList(StateListCornerSize stateListCornerSize) {
        this.innerCornerSize = stateListCornerSize;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.childShapesDirty = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        this.overflowButton.setIcon(drawable);
    }

    public void setOverflowButtonIconResource(int i) {
        this.overflowButton.setIconResource(i);
    }

    public void setOverflowMode(int i) {
        if (this.overflowMode != i) {
            this.overflowMode = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.groupStateListShapeAppearance = new WriteOperation(shapeAppearanceModel).build();
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setSpacing(int i) {
        this.spacing = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.groupStateListShapeAppearance = stateListShapeAppearanceModel;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public final void updateChildShapes() {
        int i;
        if (!(this.innerCornerSize == null && this.groupStateListShapeAppearance == null) && this.childShapesDirty) {
            this.childShapesDirty = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int childCount2 = getChildCount() - 1;
            while (true) {
                if (childCount2 < 0) {
                    childCount2 = -1;
                    break;
                } else if (isChildVisible$1(childCount2)) {
                    break;
                } else {
                    childCount2--;
                }
            }
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == childCount2;
                    Object obj = this.groupStateListShapeAppearance;
                    ArrayList arrayList = this.originalChildShapeAppearanceModels;
                    if (obj == null || (!z && !z2)) {
                        obj = (ShapeAppearance) arrayList.get(i2);
                    }
                    WriteOperation writeOperation = !(obj instanceof StateListShapeAppearanceModel) ? new WriteOperation((ShapeAppearanceModel) arrayList.get(i2)) : ((StateListShapeAppearanceModel) obj).toBuilder();
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
                    int i3 = ~i;
                    StateListCornerSize stateListCornerSize = this.innerCornerSize;
                    if ((i3 | 1) == i3) {
                        writeOperation.onSuccess = stateListCornerSize;
                    }
                    if ((i3 | 2) == i3) {
                        writeOperation.rumDataWriter = stateListCornerSize;
                    }
                    if ((i3 | 4) == i3) {
                        writeOperation.eventSource = stateListCornerSize;
                    }
                    if ((i3 | 8) == i3) {
                        writeOperation.advancedRumMonitor = stateListCornerSize;
                    }
                    StateListShapeAppearanceModel build = writeOperation.build();
                    boolean isStateful = build.isStateful();
                    ShapeAppearanceModel shapeAppearanceModel = build;
                    if (!isStateful) {
                        shapeAppearanceModel = build.getDefaultShape$1();
                    }
                    materialButton.setShapeAppearance(shapeAppearanceModel);
                }
                i2++;
            }
        }
    }

    public final void updateOverflowMenuItemsState() {
        for (Map.Entry entry : this.buttonToMenuItemMapping.entrySet()) {
            Button button = (Button) entry.getKey();
            MenuItem menuItem = (MenuItem) entry.getValue();
            if (entry.getKey() instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) button;
                menuItem.setCheckable(materialButton.isCheckable());
                menuItem.setChecked(materialButton.checked);
            }
            menuItem.setEnabled(button.isEnabled());
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public Drawable overflowIcon;
        public CharSequence overflowText;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.overflowIcon = null;
            this.overflowText = null;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialButtonGroup_Layout);
            this.overflowIcon = obtainStyledAttributes.getDrawable(0);
            this.overflowText = obtainStyledAttributes.getText(1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.overflowIcon = null;
            this.overflowText = null;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public MaterialButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    public MaterialButtonGroup(Context context) {
        this(context, null);
    }
}
