package kotlin.text;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishGlideKtor extends CatchingFishAndroidX {
    public CatchingFishWidgetFragment CatchingFishFragmentHandler;
    public final Chip CatchingFishLayout;
    public final /* synthetic */ Chip CatchingFishUnitTesting;
    public final AccessibilityManager CatchingFishViewModelFAB;
    public static final Rect CatchingFishAnimationMockk = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final CatchingFishGradleMVVM CatchingFishStateLiveData = new CatchingFishGradleMVVM(19);
    public static final CatchingFishMoshiFluxMoshi CatchingFishRoomDatabase = new CatchingFishMoshiFluxMoshi(19);
    public final Rect CatchingFishReduxKtor = new Rect();
    public final Rect CatchingFishDaggerWebsocket = new Rect();
    public final Rect CatchingFishWorkManager = new Rect();
    public final int[] CatchingFishViewModelScope = new int[2];
    public int CatchingFishCloudMessaging = Integer.MIN_VALUE;
    public int CatchingFishEspressoTesting = Integer.MIN_VALUE;
    public int CatchingFishOkHttp = Integer.MIN_VALUE;

    public CatchingFishGlideKtor(Chip chip, Chip chip2) {
        this.CatchingFishUnitTesting = chip;
        this.CatchingFishLayout = chip2;
        this.CatchingFishViewModelFAB = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    public final void CatchingFishAnimationMockk(int i, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.CatchingFishCardViewRealm);
            return;
        }
        Chip chip = this.CatchingFishUnitTesting;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        catchingFishViewJUnitJUnit.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishDaggerWebsocket);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        catchingFishViewJUnitJUnit.CatchingFishLayout(Button.class.getName());
    }

    public final CatchingFishViewJUnitJUnit CatchingFishCloudMessaging(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit = new CatchingFishViewJUnitJUnit(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        catchingFishViewJUnitJUnit.CatchingFishLayout("android.view.View");
        Rect rect = CatchingFishAnimationMockk;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        catchingFishViewJUnitJUnit.CatchingFishSnackbar = -1;
        Chip chip = this.CatchingFishLayout;
        obtain.setParent(chip);
        CatchingFishAnimationMockk(i, catchingFishViewJUnitJUnit);
        if (catchingFishViewJUnitJUnit.CatchingFishViewModelScope() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.CatchingFishDaggerWebsocket;
        catchingFishViewJUnitJUnit.CatchingFishWorkManager(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        catchingFishViewJUnitJUnit.CatchingFishCoroutine = i;
        obtain.setSource(chip, i);
        if (this.CatchingFishCloudMessaging == i) {
            obtain.setAccessibilityFocused(true);
            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(128);
        } else {
            obtain.setAccessibilityFocused(false);
            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(64);
        }
        boolean z = this.CatchingFishEspressoTesting == i;
        if (z) {
            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(2);
        } else if (obtain.isFocusable()) {
            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.CatchingFishViewModelScope;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.CatchingFishReduxKtor;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            catchingFishViewJUnitJUnit.CatchingFishWorkManager(rect3);
            if (catchingFishViewJUnitJUnit.CatchingFishSnackbar != -1) {
                CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit2 = new CatchingFishViewJUnitJUnit(AccessibilityNodeInfo.obtain());
                for (int i2 = catchingFishViewJUnitJUnit.CatchingFishSnackbar; i2 != -1; i2 = catchingFishViewJUnitJUnit2.CatchingFishSnackbar) {
                    catchingFishViewJUnitJUnit2.CatchingFishSnackbar = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit2.CatchingFishParcelableFAB;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    CatchingFishAnimationMockk(i2, catchingFishViewJUnitJUnit2);
                    catchingFishViewJUnitJUnit2.CatchingFishWorkManager(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.CatchingFishWorkManager;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return catchingFishViewJUnitJUnit;
    }

    public final void CatchingFishEspressoTesting(ArrayList arrayList) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso;
        arrayList.add(0);
        Rect rect = Chip.CatchingFishCardViewRealm;
        Chip chip = this.CatchingFishUnitTesting;
        if (!chip.CatchingFishCoroutine() || (catchingFishLayoutEspresso = chip.CatchingFishViewModelFAB) == null || !catchingFishLayoutEspresso.CatchingFishJUnitRealm || chip.CatchingFishCloudMessaging == null) {
            return;
        }
        arrayList.add(1);
    }

    public final boolean CatchingFishFragmentHandler(int i) {
        if (this.CatchingFishEspressoTesting != i) {
            return false;
        }
        this.CatchingFishEspressoTesting = Integer.MIN_VALUE;
        CatchingFishStateLiveData(i, false);
        CatchingFishNavigation(i, 8);
        return true;
    }

    public final void CatchingFishNavigation(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.CatchingFishViewModelFAB.isEnabled() || (parent = (view = this.CatchingFishLayout).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            CatchingFishViewJUnitJUnit CatchingFishUnitTesting = CatchingFishUnitTesting(i);
            obtain.getText().add(CatchingFishUnitTesting.CatchingFishViewModelScope());
            AccessibilityNodeInfo accessibilityNodeInfo = CatchingFishUnitTesting.CatchingFishParcelableFAB;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishOkHttp(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        CatchingFishEspressoTesting(arrayList);
        CatchingFishGsonAsyncTask catchingFishGsonAsyncTask = new CatchingFishGsonAsyncTask(0);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            catchingFishGsonAsyncTask.CatchingFishReduxKtor(((Integer) arrayList.get(i9)).intValue(), CatchingFishCloudMessaging(((Integer) arrayList.get(i9)).intValue()));
        }
        int i10 = this.CatchingFishEspressoTesting;
        CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit2 = i10 == Integer.MIN_VALUE ? null : (CatchingFishViewJUnitJUnit) catchingFishGsonAsyncTask.CatchingFishCoroutine(i10);
        CatchingFishGradleMVVM catchingFishGradleMVVM = CatchingFishStateLiveData;
        CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = CatchingFishRoomDatabase;
        Chip chip = this.CatchingFishLayout;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            boolean z = chip.getLayoutDirection() == 1;
            catchingFishMoshiFluxMoshi.getClass();
            int i11 = catchingFishGsonAsyncTask.CatchingFishWorkManager;
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList2.add((CatchingFishViewJUnitJUnit) catchingFishGsonAsyncTask.CatchingFishDaggerWebsocket(i12));
            }
            Collections.sort(arrayList2, new CatchingFishRealmToastToast(z, catchingFishGradleMVVM));
            if (i == 1) {
                int size = arrayList2.size();
                if (catchingFishViewJUnitJUnit2 != null) {
                    size = arrayList2.indexOf(catchingFishViewJUnitJUnit2);
                }
                int i13 = size - 1;
                if (i13 >= 0) {
                    obj = arrayList2.get(i13);
                    catchingFishViewJUnitJUnit = (CatchingFishViewJUnitJUnit) obj;
                }
                obj = null;
                catchingFishViewJUnitJUnit = (CatchingFishViewJUnitJUnit) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (catchingFishViewJUnitJUnit2 == null ? -1 : arrayList2.lastIndexOf(catchingFishViewJUnitJUnit2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    catchingFishViewJUnitJUnit = (CatchingFishViewJUnitJUnit) obj;
                }
                obj = null;
                catchingFishViewJUnitJUnit = (CatchingFishViewJUnitJUnit) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i14 = this.CatchingFishEspressoTesting;
            if (i14 != Integer.MIN_VALUE) {
                CatchingFishUnitTesting(i14).CatchingFishWorkManager(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i6 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i6 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    i6 = -1;
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i6 = -1;
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i2 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i2 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i2 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                catchingFishMoshiFluxMoshi.getClass();
                i7 = catchingFishGsonAsyncTask.CatchingFishWorkManager;
                Rect rect4 = new Rect();
                catchingFishViewJUnitJUnit = null;
                for (i8 = i2; i8 < i7; i8++) {
                    CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit3 = (CatchingFishViewJUnitJUnit) catchingFishGsonAsyncTask.CatchingFishDaggerWebsocket(i8);
                    if (catchingFishViewJUnitJUnit3 != catchingFishViewJUnitJUnit2) {
                        catchingFishGradleMVVM.getClass();
                        catchingFishViewJUnitJUnit3.CatchingFishWorkManager(rect4);
                        if (CatchingFishXMLLayoutGlide.CatchingFishSpannableWidget(i, rect2, rect4)) {
                            if (CatchingFishXMLLayoutGlide.CatchingFishSpannableWidget(i, rect2, rect3) && !CatchingFishXMLLayoutGlide.CatchingFishOkHttp(i, rect2, rect4, rect3)) {
                                if (!CatchingFishXMLLayoutGlide.CatchingFishOkHttp(i, rect2, rect3, rect4)) {
                                    int CatchingFishCardViewView = CatchingFishXMLLayoutGlide.CatchingFishCardViewView(i, rect2, rect4);
                                    int CatchingFishMVPRobolectric = CatchingFishXMLLayoutGlide.CatchingFishMVPRobolectric(i, rect2, rect4);
                                    int i15 = (CatchingFishMVPRobolectric * CatchingFishMVPRobolectric) + (CatchingFishCardViewView * 13 * CatchingFishCardViewView);
                                    int CatchingFishCardViewView2 = CatchingFishXMLLayoutGlide.CatchingFishCardViewView(i, rect2, rect3);
                                    int CatchingFishMVPRobolectric2 = CatchingFishXMLLayoutGlide.CatchingFishMVPRobolectric(i, rect2, rect3);
                                    if (i15 >= (CatchingFishMVPRobolectric2 * CatchingFishMVPRobolectric2) + (CatchingFishCardViewView2 * 13 * CatchingFishCardViewView2)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            catchingFishViewJUnitJUnit = catchingFishViewJUnitJUnit3;
                        }
                    }
                }
                i3 = i6;
            }
            i6 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            catchingFishMoshiFluxMoshi.getClass();
            i7 = catchingFishGsonAsyncTask.CatchingFishWorkManager;
            Rect rect42 = new Rect();
            catchingFishViewJUnitJUnit = null;
            while (i8 < i7) {
            }
            i3 = i6;
        }
        CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit4 = catchingFishViewJUnitJUnit;
        if (catchingFishViewJUnitJUnit4 == null) {
            i5 = Integer.MIN_VALUE;
        } else {
            int i16 = catchingFishGsonAsyncTask.CatchingFishWorkManager;
            int i17 = i2;
            while (true) {
                if (i17 >= i16) {
                    i4 = i3;
                    break;
                }
                if (catchingFishGsonAsyncTask.CatchingFishDaggerWebsocket[i17] == catchingFishViewJUnitJUnit4) {
                    i4 = i17;
                    break;
                }
                i17++;
            }
            i5 = catchingFishGsonAsyncTask.CatchingFishReduxKtor[i4];
        }
        return CatchingFishRoomDatabase(i5);
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.CatchingFishUnitTesting;
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = chip.CatchingFishViewModelFAB;
        accessibilityNodeInfo.setCheckable(catchingFishLayoutEspresso != null && catchingFishLayoutEspresso.CatchingFishNavigationGson);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        catchingFishViewJUnitJUnit.CatchingFishLayout(chip.getAccessibilityClassName());
        catchingFishViewJUnitJUnit.CatchingFishCloudMessaging(chip.getText());
    }

    public final boolean CatchingFishRoomDatabase(int i) {
        int i2;
        Chip chip = this.CatchingFishLayout;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.CatchingFishEspressoTesting) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            CatchingFishFragmentHandler(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.CatchingFishEspressoTesting = i;
        CatchingFishStateLiveData(i, true);
        CatchingFishNavigation(i, 8);
        return true;
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final CatchingFishServiceHilt CatchingFishSnackbar(View view) {
        if (this.CatchingFishFragmentHandler == null) {
            this.CatchingFishFragmentHandler = new CatchingFishWidgetFragment(this, 1);
        }
        return this.CatchingFishFragmentHandler;
    }

    public final void CatchingFishStateLiveData(int i, boolean z) {
        Chip chip = this.CatchingFishUnitTesting;
        if (i == 1) {
            chip.CatchingFishStateLiveData = z;
        }
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = chip.CatchingFishViewModelFAB;
        boolean z2 = chip.CatchingFishStateLiveData;
        boolean z3 = false;
        if (catchingFishLayoutEspresso.CatchingFishAnimation != null) {
            z3 = catchingFishLayoutEspresso.CatchingFishParcelable(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : CatchingFishLayoutEspresso.CatchingFishJUnitIntent);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }

    public final CatchingFishViewJUnitJUnit CatchingFishUnitTesting(int i) {
        if (i != -1) {
            return CatchingFishCloudMessaging(i);
        }
        Chip chip = this.CatchingFishLayout;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit = new CatchingFishViewJUnitJUnit(obtain);
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        CatchingFishEspressoTesting(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return catchingFishViewJUnitJUnit;
    }
}
