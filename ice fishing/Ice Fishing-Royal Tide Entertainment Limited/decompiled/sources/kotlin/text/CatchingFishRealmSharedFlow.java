package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class CatchingFishRealmSharedFlow extends LinearLayout {
    public int CatchingFishCloudMessaging;
    public final ArrayList CatchingFishDaggerWebsocket;
    public CatchingFishRealmAdMob CatchingFishEspressoTesting;
    public CatchingFishMVVMViewMoshi CatchingFishFragmentHandler;
    public CatchingFishMVPLayoutBundle CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public final ArrayList CatchingFishReduxKtor;
    public Integer[] CatchingFishViewModelFAB;
    public final CatchingFishGradleExoPlayer CatchingFishViewModelScope;
    public final CatchingFishViewPagerMockk CatchingFishWorkManager;

    public CatchingFishRealmSharedFlow(Context context, AttributeSet attributeSet) {
        super(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        CatchingFishMVPLayoutBundle CatchingFishSnackbar;
        XmlResourceParser xml;
        int next;
        CatchingFishRealmAdMob catchingFishRealmAdMob;
        AttributeSet asAttributeSet;
        int next2;
        this.CatchingFishReduxKtor = new ArrayList();
        this.CatchingFishDaggerWebsocket = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.CatchingFishWorkManager = new CatchingFishViewPagerMockk(17, materialButtonToggleGroup);
        this.CatchingFishViewModelScope = new CatchingFishGradleExoPlayer(1, materialButtonToggleGroup);
        this.CatchingFishOkHttp = true;
        Context context2 = getContext();
        TypedArray CatchingFishCameraXIntent = CatchingFishLayoutRoomFAB.CatchingFishCameraXIntent(context2, attributeSet, CatchingFishSnackbarPicasso.CatchingFishCloudMessaging, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (CatchingFishCameraXIntent.hasValue(2)) {
            int resourceId = CatchingFishCameraXIntent.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        catchingFishRealmAdMob = new CatchingFishRealmAdMob();
                        catchingFishRealmAdMob.CatchingFishCoroutine = new int[10][];
                        catchingFishRealmAdMob.CatchingFishReduxKtor = new CatchingFishEspressoPayPal[10];
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
                    catchingFishRealmAdMob.CatchingFishParcelableFAB(context2, xml, asAttributeSet, context2.getTheme());
                }
                xml.close();
                this.CatchingFishEspressoTesting = catchingFishRealmAdMob;
            }
            catchingFishRealmAdMob = null;
            this.CatchingFishEspressoTesting = catchingFishRealmAdMob;
        }
        if (CatchingFishCameraXIntent.hasValue(4)) {
            CatchingFishMVVMViewMoshi CatchingFishSnackbar2 = CatchingFishMVVMViewMoshi.CatchingFishSnackbar(context2, CatchingFishCameraXIntent, 4);
            this.CatchingFishFragmentHandler = CatchingFishSnackbar2;
            if (CatchingFishSnackbar2 == null) {
                CatchingFishViewHilt catchingFishViewHilt = new CatchingFishViewHilt(CatchingFishFragmentMVVM.CatchingFishParcelableFAB(context2, CatchingFishCameraXIntent.getResourceId(4, 0), CatchingFishCameraXIntent.getResourceId(5, 0), new CatchingFishEspressoTesting(0)).CatchingFishParcelableFAB());
                this.CatchingFishFragmentHandler = catchingFishViewHilt.CatchingFishSnackbar != 0 ? new CatchingFishMVVMViewMoshi(catchingFishViewHilt) : null;
            }
        }
        if (CatchingFishCameraXIntent.hasValue(3)) {
            CatchingFishEspressoTesting catchingFishEspressoTesting = new CatchingFishEspressoTesting(0.0f);
            int resourceId2 = CatchingFishCameraXIntent.getResourceId(3, 0);
            if (resourceId2 == 0) {
                CatchingFishSnackbar = CatchingFishMVPLayoutBundle.CatchingFishSnackbar(CatchingFishFragmentMVVM.CatchingFishCoroutine(CatchingFishCameraXIntent, 3, catchingFishEspressoTesting));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        CatchingFishSnackbar = new CatchingFishMVPLayoutBundle();
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
                            CatchingFishSnackbar.CatchingFishReduxKtor(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    CatchingFishSnackbar = CatchingFishMVPLayoutBundle.CatchingFishSnackbar(catchingFishEspressoTesting);
                }
            } else {
                CatchingFishSnackbar = CatchingFishMVPLayoutBundle.CatchingFishSnackbar(CatchingFishFragmentMVVM.CatchingFishCoroutine(CatchingFishCameraXIntent, 3, catchingFishEspressoTesting));
            }
            this.CatchingFishLayout = CatchingFishSnackbar;
        }
        this.CatchingFishCloudMessaging = CatchingFishCameraXIntent.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(CatchingFishCameraXIntent.getBoolean(0, true));
        CatchingFishCameraXIntent.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (CatchingFishCoroutine(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (CatchingFishCoroutine(childCount)) {
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

    public final boolean CatchingFishCoroutine(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Serializable, kotlin.text.CatchingFishFragmentMVVM[]] */
    public final void CatchingFishDaggerWebsocket() {
        CatchingFishViewHilt catchingFishViewHilt;
        int i;
        if (!(this.CatchingFishLayout == null && this.CatchingFishFragmentHandler == null) && this.CatchingFishOkHttp) {
            this.CatchingFishOkHttp = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    CatchingFishMVVMViewMoshi catchingFishMVVMViewMoshi = this.CatchingFishFragmentHandler;
                    if (catchingFishMVVMViewMoshi == null || (!z && !z2)) {
                        catchingFishMVVMViewMoshi = (CatchingFishMVVMViewMoshi) this.CatchingFishDaggerWebsocket.get(i2);
                    }
                    if (catchingFishMVVMViewMoshi == null) {
                        catchingFishViewHilt = new CatchingFishViewHilt((CatchingFishFragmentMVVM) this.CatchingFishReduxKtor.get(i2));
                    } else {
                        CatchingFishViewHilt catchingFishViewHilt2 = new CatchingFishViewHilt(1);
                        int i3 = catchingFishMVVMViewMoshi.CatchingFishParcelableFAB;
                        catchingFishViewHilt2.CatchingFishSnackbar = i3;
                        catchingFishViewHilt2.CatchingFishCoroutine = catchingFishMVVMViewMoshi.CatchingFishSnackbar;
                        int[][] iArr = catchingFishMVVMViewMoshi.CatchingFishCoroutine;
                        ?? r14 = new int[iArr.length][];
                        catchingFishViewHilt2.CatchingFishReduxKtor = r14;
                        CatchingFishFragmentMVVM[] catchingFishFragmentMVVMArr = catchingFishMVVMViewMoshi.CatchingFishReduxKtor;
                        catchingFishViewHilt2.CatchingFishDaggerWebsocket = new CatchingFishFragmentMVVM[catchingFishFragmentMVVMArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i3);
                        System.arraycopy(catchingFishFragmentMVVMArr, 0, (CatchingFishFragmentMVVM[]) catchingFishViewHilt2.CatchingFishDaggerWebsocket, 0, catchingFishViewHilt2.CatchingFishSnackbar);
                        catchingFishViewHilt2.CatchingFishWorkManager = catchingFishMVVMViewMoshi.CatchingFishDaggerWebsocket;
                        catchingFishViewHilt2.CatchingFishViewModelScope = catchingFishMVVMViewMoshi.CatchingFishWorkManager;
                        catchingFishViewHilt2.CatchingFishViewModelFAB = catchingFishMVVMViewMoshi.CatchingFishViewModelScope;
                        catchingFishViewHilt2.CatchingFishLayout = catchingFishMVVMViewMoshi.CatchingFishViewModelFAB;
                        catchingFishViewHilt = catchingFishViewHilt2;
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
                    CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle = this.CatchingFishLayout;
                    if ((i4 | 1) == i4) {
                        catchingFishViewHilt.CatchingFishWorkManager = catchingFishMVPLayoutBundle;
                    }
                    if ((i4 | 2) == i4) {
                        catchingFishViewHilt.CatchingFishViewModelScope = catchingFishMVPLayoutBundle;
                    }
                    if ((i4 | 4) == i4) {
                        catchingFishViewHilt.CatchingFishViewModelFAB = catchingFishMVPLayoutBundle;
                    }
                    if ((i4 | 8) == i4) {
                        catchingFishViewHilt.CatchingFishLayout = catchingFishMVPLayoutBundle;
                    }
                    CatchingFishMVVMViewMoshi catchingFishMVVMViewMoshi2 = catchingFishViewHilt.CatchingFishSnackbar == 0 ? null : new CatchingFishMVVMViewMoshi(catchingFishViewHilt);
                    if (catchingFishMVVMViewMoshi2.CatchingFishReduxKtor()) {
                        materialButton.setStateListShapeAppearanceModel(catchingFishMVVMViewMoshi2);
                    } else {
                        materialButton.setShapeAppearanceModel(catchingFishMVVMViewMoshi2.CatchingFishCoroutine());
                    }
                }
                i2++;
            }
        }
    }

    public final void CatchingFishParcelableFAB() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i2 - 1);
            if (this.CatchingFishCloudMessaging <= 0) {
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
                layoutParams2.setMarginStart(this.CatchingFishCloudMessaging - i);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.CatchingFishCloudMessaging - i;
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

    public final void CatchingFishReduxKtor() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.CatchingFishGsonAppCompat;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.CatchingFishGsonAppCompat = null;
                materialButton.CatchingFishDaggerHiltFAB = -1.0f;
            }
        }
    }

    public final void CatchingFishSnackbar() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float max;
        if (this.CatchingFishEspressoTesting == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i = Integer.MAX_VALUE;
        for (int i2 = firstVisibleChildIndex; i2 <= lastVisibleChildIndex; i2++) {
            if (CatchingFishCoroutine(i2)) {
                if (CatchingFishCoroutine(i2) && this.CatchingFishEspressoTesting != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i2);
                    CatchingFishRealmAdMob catchingFishRealmAdMob = this.CatchingFishEspressoTesting;
                    int width = materialButton3.getWidth();
                    int i3 = -width;
                    for (int i4 = 0; i4 < catchingFishRealmAdMob.CatchingFishParcelableFAB; i4++) {
                        CatchingFishContextLiveData catchingFishContextLiveData = (CatchingFishContextLiveData) catchingFishRealmAdMob.CatchingFishReduxKtor[i4].CatchingFishDaggerWebsocket;
                        int i5 = catchingFishContextLiveData.CatchingFishParcelableFAB;
                        float f = catchingFishContextLiveData.CatchingFishSnackbar;
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
                            if (CatchingFishCoroutine(i6)) {
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
                        if (CatchingFishCoroutine(i7)) {
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
            if (CatchingFishCoroutine(i8)) {
                ((MaterialButton) getChildAt(i8)).setSizeChange(this.CatchingFishEspressoTesting);
                ((MaterialButton) getChildAt(i8)).setWidthChangeMax((i8 == firstVisibleChildIndex || i8 == lastVisibleChildIndex) ? i : i * 2);
            }
            i8++;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            CatchingFishReduxKtor();
            this.CatchingFishOkHttp = true;
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            materialButton.setOnPressedChangeListenerInternal(this.CatchingFishWorkManager);
            this.CatchingFishReduxKtor.add(materialButton.getShapeAppearanceModel());
            this.CatchingFishDaggerWebsocket.add(materialButton.getStateListShapeAppearanceModel());
            materialButton.setEnabled(isEnabled());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.CatchingFishViewModelScope);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.CatchingFishViewModelFAB = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public CatchingFishRealmAdMob getButtonSizeChange() {
        return this.CatchingFishEspressoTesting;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.CatchingFishViewModelFAB;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public CatchingFishCameraXGradle getInnerCornerSize() {
        return this.CatchingFishLayout.CatchingFishSnackbar;
    }

    public CatchingFishMVPLayoutBundle getInnerCornerSizeStateList() {
        return this.CatchingFishLayout;
    }

    public CatchingFishFragmentMVVM getShapeAppearance() {
        CatchingFishMVVMViewMoshi catchingFishMVVMViewMoshi = this.CatchingFishFragmentHandler;
        if (catchingFishMVVMViewMoshi == null) {
            return null;
        }
        return catchingFishMVVMViewMoshi.CatchingFishCoroutine();
    }

    public int getSpacing() {
        return this.CatchingFishCloudMessaging;
    }

    public CatchingFishMVVMViewMoshi getStateListShapeAppearance() {
        return this.CatchingFishFragmentHandler;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            CatchingFishReduxKtor();
            CatchingFishSnackbar();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CatchingFishDaggerWebsocket();
        CatchingFishParcelableFAB();
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
            this.CatchingFishReduxKtor.remove(indexOfChild);
            this.CatchingFishDaggerWebsocket.remove(indexOfChild);
        }
        this.CatchingFishOkHttp = true;
        CatchingFishDaggerWebsocket();
        CatchingFishReduxKtor();
        CatchingFishParcelableFAB();
    }

    public void setButtonSizeChange(CatchingFishRealmAdMob catchingFishRealmAdMob) {
        if (this.CatchingFishEspressoTesting != catchingFishRealmAdMob) {
            this.CatchingFishEspressoTesting = catchingFishRealmAdMob;
            CatchingFishSnackbar();
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

    public void setInnerCornerSize(CatchingFishCameraXGradle catchingFishCameraXGradle) {
        this.CatchingFishLayout = CatchingFishMVPLayoutBundle.CatchingFishSnackbar(catchingFishCameraXGradle);
        this.CatchingFishOkHttp = true;
        CatchingFishDaggerWebsocket();
        invalidate();
    }

    public void setInnerCornerSizeStateList(CatchingFishMVPLayoutBundle catchingFishMVPLayoutBundle) {
        this.CatchingFishLayout = catchingFishMVPLayoutBundle;
        this.CatchingFishOkHttp = true;
        CatchingFishDaggerWebsocket();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.CatchingFishOkHttp = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(CatchingFishFragmentMVVM catchingFishFragmentMVVM) {
        CatchingFishViewHilt catchingFishViewHilt = new CatchingFishViewHilt(catchingFishFragmentMVVM);
        this.CatchingFishFragmentHandler = catchingFishViewHilt.CatchingFishSnackbar == 0 ? null : new CatchingFishMVVMViewMoshi(catchingFishViewHilt);
        this.CatchingFishOkHttp = true;
        CatchingFishDaggerWebsocket();
        invalidate();
    }

    public void setSpacing(int i) {
        this.CatchingFishCloudMessaging = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(CatchingFishMVVMViewMoshi catchingFishMVVMViewMoshi) {
        this.CatchingFishFragmentHandler = catchingFishMVVMViewMoshi;
        this.CatchingFishOkHttp = true;
        CatchingFishDaggerWebsocket();
        invalidate();
    }
}
