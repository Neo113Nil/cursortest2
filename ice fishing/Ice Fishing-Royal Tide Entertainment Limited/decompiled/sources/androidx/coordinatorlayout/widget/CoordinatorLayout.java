package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishAppCompatOkHttp;
import kotlin.text.CatchingFishAppCompatToast;
import kotlin.text.CatchingFishBundleAsyncTask;
import kotlin.text.CatchingFishCustomViewMVP;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFluxFluxBundle;
import kotlin.text.CatchingFishFluxHandler;
import kotlin.text.CatchingFishGlideFlux;
import kotlin.text.CatchingFishGraphQLRealmFAB;
import kotlin.text.CatchingFishJUnitToastKtor;
import kotlin.text.CatchingFishKtorPicassoMVVM;
import kotlin.text.CatchingFishMVPView;
import kotlin.text.CatchingFishMVVMCoroutine;
import kotlin.text.CatchingFishOkHttpAnimation;
import kotlin.text.CatchingFishPayPalRetrofit;
import kotlin.text.CatchingFishRecyclerViewMVP;
import kotlin.text.CatchingFishServiceHilt;
import kotlin.text.CatchingFishToastCoroutine;
import kotlin.text.CatchingFishToastDagger;
import kotlin.text.CatchingFishViewGson;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements CatchingFishViewGson, CatchingFishOkHttpAnimation {
    public static final CatchingFishMVVMCoroutine CatchingFishCardViewRealm;
    public static final ThreadLocal CatchingFishGsonAppCompat;
    public static final Class[] CatchingFishParcelableFlux;
    public static final CatchingFishToastDagger CatchingFishPayPal;
    public static final String CatchingFishSpannableWidget;
    public Drawable CatchingFish;
    public CatchingFishCustomViewMVP CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public CatchingFishServiceHilt CatchingFishCoroutineFlow;
    public final CatchingFishToastCoroutine CatchingFishDaggerHiltFAB;
    public final CatchingFishFluxFluxBundle CatchingFishDaggerWebsocket;
    public final int[] CatchingFishEspressoTesting;
    public boolean CatchingFishFragmentHandler;
    public ViewGroup.OnHierarchyChangeListener CatchingFishJetpackCompose;
    public final int[] CatchingFishLayout;
    public boolean CatchingFishNavigation;
    public View CatchingFishOkHttp;
    public final ArrayList CatchingFishReduxKtor;
    public CatchingFishKtorPicassoMVVM CatchingFishRoomDatabase;
    public boolean CatchingFishStateLiveData;
    public View CatchingFishUnitTesting;
    public final int[] CatchingFishViewModelFAB;
    public final ArrayList CatchingFishViewModelScope;
    public final ArrayList CatchingFishWorkManager;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        CatchingFishSpannableWidget = r0 != null ? r0.getName() : null;
        CatchingFishCardViewRealm = new CatchingFishMVVMCoroutine(6);
        CatchingFishParcelableFlux = new Class[]{Context.class, AttributeSet.class};
        CatchingFishGsonAppCompat = new ThreadLocal();
        CatchingFishPayPal = new CatchingFishToastDagger();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.CatchingFishReduxKtor = new ArrayList();
        this.CatchingFishDaggerWebsocket = new CatchingFishFluxFluxBundle(6);
        this.CatchingFishWorkManager = new ArrayList();
        this.CatchingFishViewModelScope = new ArrayList();
        this.CatchingFishViewModelFAB = new int[2];
        this.CatchingFishLayout = new int[2];
        this.CatchingFishDaggerHiltFAB = new CatchingFishToastCoroutine();
        int[] iArr = CatchingFishRecyclerViewMVP.CatchingFishParcelableFAB;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.CatchingFishEspressoTesting = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.CatchingFishEspressoTesting[i] = (int) (r1[i] * f);
            }
        }
        this.CatchingFish = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        CatchingFishDaggerHiltFAB();
        super.setOnHierarchyChangeListener(new CatchingFishAppCompatOkHttp(this));
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static void CatchingFishCoroutineFlow(View view, int i) {
        CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) view.getLayoutParams();
        int i2 = catchingFishMVPView.CatchingFishFragmentHandler;
        if (i2 != i) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            view.offsetTopAndBottom(i - i2);
            catchingFishMVPView.CatchingFishFragmentHandler = i;
        }
    }

    public static void CatchingFishEspressoTesting(int i, Rect rect, Rect rect2, CatchingFishMVPView catchingFishMVPView, int i2, int i3) {
        int i4 = catchingFishMVPView.CatchingFishCoroutine;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = catchingFishMVPView.CatchingFishReduxKtor;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static void CatchingFishJetpackCompose(View view, int i) {
        CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) view.getLayoutParams();
        int i2 = catchingFishMVPView.CatchingFishLayout;
        if (i2 != i) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            view.offsetLeftAndRight(i - i2);
            catchingFishMVPView.CatchingFishLayout = i;
        }
    }

    public static CatchingFishMVPView CatchingFishOkHttp(View view) {
        CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) view.getLayoutParams();
        if (!catchingFishMVPView.CatchingFishSnackbar) {
            CatchingFishAppCompatToast catchingFishAppCompatToast = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                catchingFishAppCompatToast = (CatchingFishAppCompatToast) cls.getAnnotation(CatchingFishAppCompatToast.class);
                if (catchingFishAppCompatToast != null) {
                    break;
                }
            }
            if (catchingFishAppCompatToast != null) {
                try {
                    CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = (CatchingFishJUnitToastKtor) catchingFishAppCompatToast.value().getDeclaredConstructor(null).newInstance(null);
                    CatchingFishJUnitToastKtor catchingFishJUnitToastKtor2 = catchingFishMVPView.CatchingFishParcelableFAB;
                    if (catchingFishJUnitToastKtor2 != catchingFishJUnitToastKtor) {
                        if (catchingFishJUnitToastKtor2 != null) {
                            catchingFishJUnitToastKtor2.CatchingFishDaggerWebsocket();
                        }
                        catchingFishMVPView.CatchingFishParcelableFAB = catchingFishJUnitToastKtor;
                        catchingFishMVPView.CatchingFishSnackbar = true;
                        if (catchingFishJUnitToastKtor != null) {
                            catchingFishJUnitToastKtor.CatchingFishCoroutine(catchingFishMVPView);
                        }
                    }
                } catch (Exception unused) {
                    catchingFishAppCompatToast.value().getClass();
                }
            }
            catchingFishMVPView.CatchingFishSnackbar = true;
        }
        return catchingFishMVPView;
    }

    public static Rect CatchingFishReduxKtor() {
        Rect rect = (Rect) CatchingFishPayPal.CatchingFishParcelableFAB();
        return rect == null ? new Rect() : rect;
    }

    public final void CatchingFish(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = ((CatchingFishMVPView) childAt.getLayoutParams()).CatchingFishParcelableFAB;
            if (catchingFishJUnitToastKtor != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    catchingFishJUnitToastKtor.CatchingFishWorkManager(this, childAt, obtain);
                } else {
                    catchingFishJUnitToastKtor.CatchingFishRoomDatabase(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((CatchingFishMVPView) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.CatchingFishOkHttp = null;
        this.CatchingFishFragmentHandler = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishAnimationMockk(int i) {
        int i2;
        Rect rect;
        int i3;
        int i4;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList2;
        CatchingFishMVPView catchingFishMVPView;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        View view;
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.CatchingFishReduxKtor;
        int size = arrayList3.size();
        Rect CatchingFishReduxKtor = CatchingFishReduxKtor();
        Rect CatchingFishReduxKtor2 = CatchingFishReduxKtor();
        Rect CatchingFishReduxKtor3 = CatchingFishReduxKtor();
        int i14 = 0;
        while (true) {
            CatchingFishToastDagger catchingFishToastDagger = CatchingFishPayPal;
            if (i14 >= size) {
                Rect rect3 = CatchingFishReduxKtor3;
                CatchingFishReduxKtor.setEmpty();
                catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor);
                CatchingFishReduxKtor2.setEmpty();
                catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor2);
                rect3.setEmpty();
                catchingFishToastDagger.CatchingFishCoroutine(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i14);
            CatchingFishMVPView catchingFishMVPView2 = (CatchingFishMVPView) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size;
                rect = CatchingFishReduxKtor3;
                i2 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (catchingFishMVPView2.CatchingFishEspressoTesting == ((View) arrayList3.get(i15))) {
                        CatchingFishMVPView catchingFishMVPView3 = (CatchingFishMVPView) view2.getLayoutParams();
                        if (catchingFishMVPView3.CatchingFishCloudMessaging != null) {
                            Rect CatchingFishReduxKtor4 = CatchingFishReduxKtor();
                            Rect CatchingFishReduxKtor5 = CatchingFishReduxKtor();
                            CatchingFishMVPView catchingFishMVPView4 = catchingFishMVPView2;
                            Rect CatchingFishReduxKtor6 = CatchingFishReduxKtor();
                            CatchingFishCloudMessaging(catchingFishMVPView3.CatchingFishCloudMessaging, CatchingFishReduxKtor4);
                            CatchingFishLayout(view2, CatchingFishReduxKtor5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            catchingFishMVPView = catchingFishMVPView4;
                            i11 = i15;
                            layoutDirection = layoutDirection;
                            i13 = i14;
                            view = view3;
                            CatchingFishEspressoTesting(layoutDirection, CatchingFishReduxKtor4, CatchingFishReduxKtor6, catchingFishMVPView3, measuredWidth, measuredHeight);
                            i12 = size;
                            rect2 = CatchingFishReduxKtor3;
                            boolean z3 = (CatchingFishReduxKtor6.left == CatchingFishReduxKtor5.left && CatchingFishReduxKtor6.top == CatchingFishReduxKtor5.top) ? false : true;
                            CatchingFishDaggerWebsocket(catchingFishMVPView3, CatchingFishReduxKtor6, measuredWidth, measuredHeight);
                            int i16 = CatchingFishReduxKtor6.left - CatchingFishReduxKtor5.left;
                            int i17 = CatchingFishReduxKtor6.top - CatchingFishReduxKtor5.top;
                            if (i16 != 0) {
                                WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                                view.offsetLeftAndRight(i16);
                            }
                            if (i17 != 0) {
                                WeakHashMap weakHashMap3 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                                view.offsetTopAndBottom(i17);
                            }
                            if (z3 && (catchingFishJUnitToastKtor = catchingFishMVPView3.CatchingFishParcelableFAB) != null) {
                                catchingFishJUnitToastKtor.CatchingFishReduxKtor(this, view, catchingFishMVPView3.CatchingFishCloudMessaging);
                            }
                            CatchingFishReduxKtor4.setEmpty();
                            catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor4);
                            CatchingFishReduxKtor5.setEmpty();
                            catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor5);
                            CatchingFishReduxKtor6.setEmpty();
                            catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor6);
                            i15 = i11 + 1;
                            catchingFishMVPView2 = catchingFishMVPView;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i12;
                            i14 = i13;
                            CatchingFishReduxKtor3 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    catchingFishMVPView = catchingFishMVPView2;
                    i11 = i15;
                    i12 = size;
                    rect2 = CatchingFishReduxKtor3;
                    i13 = i14;
                    view = view2;
                    i15 = i11 + 1;
                    catchingFishMVPView2 = catchingFishMVPView;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i12;
                    i14 = i13;
                    CatchingFishReduxKtor3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                CatchingFishMVPView catchingFishMVPView5 = catchingFishMVPView2;
                int i18 = size;
                Rect rect4 = CatchingFishReduxKtor3;
                i2 = i14;
                View view4 = view2;
                CatchingFishLayout(view4, CatchingFishReduxKtor2, true);
                if (catchingFishMVPView5.CatchingFishViewModelScope != 0 && !CatchingFishReduxKtor2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(catchingFishMVPView5.CatchingFishViewModelScope, layoutDirection);
                    int i19 = absoluteGravity & 112;
                    if (i19 == 48) {
                        CatchingFishReduxKtor.top = Math.max(CatchingFishReduxKtor.top, CatchingFishReduxKtor2.bottom);
                    } else if (i19 == 80) {
                        CatchingFishReduxKtor.bottom = Math.max(CatchingFishReduxKtor.bottom, getHeight() - CatchingFishReduxKtor2.top);
                    }
                    int i20 = absoluteGravity & 7;
                    if (i20 == 3) {
                        CatchingFishReduxKtor.left = Math.max(CatchingFishReduxKtor.left, CatchingFishReduxKtor2.right);
                    } else if (i20 == 5) {
                        CatchingFishReduxKtor.right = Math.max(CatchingFishReduxKtor.right, getWidth() - CatchingFishReduxKtor2.left);
                    }
                }
                if (catchingFishMVPView5.CatchingFishViewModelFAB != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        CatchingFishMVPView catchingFishMVPView6 = (CatchingFishMVPView) view4.getLayoutParams();
                        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor2 = catchingFishMVPView6.CatchingFishParcelableFAB;
                        Rect CatchingFishReduxKtor7 = CatchingFishReduxKtor();
                        Rect CatchingFishReduxKtor8 = CatchingFishReduxKtor();
                        CatchingFishReduxKtor8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (catchingFishJUnitToastKtor2 == null || !catchingFishJUnitToastKtor2.CatchingFishParcelableFAB(view4)) {
                            CatchingFishReduxKtor7.set(CatchingFishReduxKtor8);
                        } else if (!CatchingFishReduxKtor8.contains(CatchingFishReduxKtor7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + CatchingFishReduxKtor7.toShortString() + " | Bounds:" + CatchingFishReduxKtor8.toShortString());
                        }
                        CatchingFishReduxKtor8.setEmpty();
                        catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor8);
                        if (CatchingFishReduxKtor7.isEmpty()) {
                            CatchingFishReduxKtor7.setEmpty();
                            catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(catchingFishMVPView6.CatchingFishViewModelFAB, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (CatchingFishReduxKtor7.top - ((ViewGroup.MarginLayoutParams) catchingFishMVPView6).topMargin) - catchingFishMVPView6.CatchingFishFragmentHandler) >= (i10 = CatchingFishReduxKtor.top)) {
                                z = false;
                            } else {
                                CatchingFishCoroutineFlow(view4, i10 - i9);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - CatchingFishReduxKtor7.bottom) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView6).bottomMargin) + catchingFishMVPView6.CatchingFishFragmentHandler) < (i8 = CatchingFishReduxKtor.bottom)) {
                                CatchingFishCoroutineFlow(view4, height - i8);
                                z = true;
                            }
                            if (!z) {
                                CatchingFishCoroutineFlow(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (CatchingFishReduxKtor7.left - ((ViewGroup.MarginLayoutParams) catchingFishMVPView6).leftMargin) - catchingFishMVPView6.CatchingFishLayout) >= (i7 = CatchingFishReduxKtor.left)) {
                                z2 = false;
                            } else {
                                CatchingFishJetpackCompose(view4, i7 - i6);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - CatchingFishReduxKtor7.right) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView6).rightMargin) + catchingFishMVPView6.CatchingFishLayout) < (i5 = CatchingFishReduxKtor.right)) {
                                CatchingFishJetpackCompose(view4, width - i5);
                                z2 = true;
                            }
                            if (!z2) {
                                CatchingFishJetpackCompose(view4, 0);
                            }
                            CatchingFishReduxKtor7.setEmpty();
                            catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor7);
                            if (i == 2) {
                                rect = rect4;
                                rect.set(((CatchingFishMVPView) view4.getLayoutParams()).CatchingFishAnimationMockk);
                                if (rect.equals(CatchingFishReduxKtor2)) {
                                    arrayList = arrayList4;
                                    i4 = i18;
                                } else {
                                    ((CatchingFishMVPView) view4.getLayoutParams()).CatchingFishAnimationMockk.set(CatchingFishReduxKtor2);
                                }
                            } else {
                                rect = rect4;
                            }
                            i3 = i2 + 1;
                            i4 = i18;
                            while (true) {
                                arrayList = arrayList4;
                                if (i3 >= i4) {
                                    View view5 = (View) arrayList.get(i3);
                                    CatchingFishJUnitToastKtor catchingFishJUnitToastKtor3 = ((CatchingFishMVPView) view5.getLayoutParams()).CatchingFishParcelableFAB;
                                    if (catchingFishJUnitToastKtor3 != null) {
                                        catchingFishJUnitToastKtor3.CatchingFishSnackbar(view5);
                                    }
                                    i3++;
                                    arrayList4 = arrayList;
                                }
                            }
                        }
                    }
                }
                if (i == 2) {
                }
                i3 = i2 + 1;
                i4 = i18;
                while (true) {
                    arrayList = arrayList4;
                    if (i3 >= i4) {
                        break;
                    }
                    i3++;
                    arrayList4 = arrayList;
                }
            }
            i14 = i2 + 1;
            size = i4;
            CatchingFishReduxKtor3 = rect;
            arrayList3 = arrayList;
        }
    }

    public final void CatchingFishCloudMessaging(View view, Rect rect) {
        ThreadLocal threadLocal = CatchingFishFluxHandler.CatchingFishParcelableFAB;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = CatchingFishFluxHandler.CatchingFishParcelableFAB;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        CatchingFishFluxHandler.CatchingFishParcelableFAB(this, view, matrix);
        ThreadLocal threadLocal3 = CatchingFishFluxHandler.CatchingFishSnackbar;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishCoroutine(View view, int i, int i2, int[] iArr, int i3) {
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) childAt.getLayoutParams();
                if (catchingFishMVPView.CatchingFishParcelableFAB(i3) && (catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB) != null) {
                    int[] iArr2 = this.CatchingFishViewModelFAB;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    catchingFishJUnitToastKtor.CatchingFishFragmentHandler(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            CatchingFishAnimationMockk(1);
        }
    }

    public final void CatchingFishDaggerHiltFAB() {
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        if (!getFitsSystemWindows()) {
            CatchingFishGlideFlux.CatchingFishCoroutine(this, null);
            return;
        }
        if (this.CatchingFishCoroutineFlow == null) {
            this.CatchingFishCoroutineFlow = new CatchingFishServiceHilt(27, this);
        }
        CatchingFishGlideFlux.CatchingFishCoroutine(this, this.CatchingFishCoroutineFlow);
        setSystemUiVisibility(1280);
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishMVPView catchingFishMVPView, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final ArrayList CatchingFishFragmentHandler(View view) {
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
        int i = catchingFishGraphQLRealmFAB.CatchingFishWorkManager;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) catchingFishGraphQLRealmFAB.CatchingFishLayout(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(catchingFishGraphQLRealmFAB.CatchingFishWorkManager(i2));
            }
        }
        ArrayList arrayList3 = this.CatchingFishViewModelScope;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void CatchingFishLayout(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            CatchingFishCloudMessaging(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void CatchingFishNavigation() {
        ArrayList arrayList = this.CatchingFishReduxKtor;
        arrayList.clear();
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishDaggerWebsocket;
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        CatchingFishBundleAsyncTask catchingFishBundleAsyncTask = (CatchingFishBundleAsyncTask) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB2 = (CatchingFishGraphQLRealmFAB) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        int i = catchingFishGraphQLRealmFAB.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) catchingFishGraphQLRealmFAB.CatchingFishLayout(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                catchingFishBundleAsyncTask.CatchingFishCoroutine(arrayList2);
            }
        }
        catchingFishGraphQLRealmFAB.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            CatchingFishMVPView CatchingFishOkHttp = CatchingFishOkHttp(childAt);
            int i4 = CatchingFishOkHttp.CatchingFishWorkManager;
            if (i4 == -1) {
                CatchingFishOkHttp.CatchingFishEspressoTesting = null;
                CatchingFishOkHttp.CatchingFishCloudMessaging = null;
            } else {
                View view = CatchingFishOkHttp.CatchingFishCloudMessaging;
                if (view != null && view.getId() == i4) {
                    View view2 = CatchingFishOkHttp.CatchingFishCloudMessaging;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            CatchingFishOkHttp.CatchingFishEspressoTesting = null;
                            CatchingFishOkHttp.CatchingFishCloudMessaging = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    CatchingFishOkHttp.CatchingFishEspressoTesting = view2;
                }
                View findViewById = findViewById(i4);
                CatchingFishOkHttp.CatchingFishCloudMessaging = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i4) + " to anchor view " + childAt);
                    }
                    CatchingFishOkHttp.CatchingFishEspressoTesting = null;
                    CatchingFishOkHttp.CatchingFishCloudMessaging = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            CatchingFishOkHttp.CatchingFishEspressoTesting = null;
                            CatchingFishOkHttp.CatchingFishCloudMessaging = null;
                        }
                    }
                    CatchingFishOkHttp.CatchingFishEspressoTesting = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    CatchingFishOkHttp.CatchingFishEspressoTesting = null;
                    CatchingFishOkHttp.CatchingFishCloudMessaging = null;
                }
            }
            if (!catchingFishGraphQLRealmFAB2.containsKey(childAt)) {
                catchingFishGraphQLRealmFAB2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != CatchingFishOkHttp.CatchingFishEspressoTesting) {
                        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((CatchingFishMVPView) childAt2.getLayoutParams()).CatchingFishViewModelScope, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(CatchingFishOkHttp.CatchingFishViewModelFAB, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = CatchingFishOkHttp.CatchingFishParcelableFAB;
                            if (catchingFishJUnitToastKtor != null) {
                                catchingFishJUnitToastKtor.CatchingFishSnackbar(childAt);
                            }
                        }
                    }
                    if (!catchingFishGraphQLRealmFAB2.containsKey(childAt2) && !catchingFishGraphQLRealmFAB2.containsKey(childAt2)) {
                        catchingFishGraphQLRealmFAB2.put(childAt2, null);
                    }
                    if (!catchingFishGraphQLRealmFAB2.containsKey(childAt2) || !catchingFishGraphQLRealmFAB2.containsKey(childAt)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList3 = (ArrayList) catchingFishGraphQLRealmFAB2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) catchingFishBundleAsyncTask.CatchingFishParcelableFAB();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        catchingFishGraphQLRealmFAB2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) catchingFishFluxFluxBundle.CatchingFishWorkManager;
        arrayList4.clear();
        HashSet hashSet = (HashSet) catchingFishFluxFluxBundle.CatchingFishViewModelScope;
        hashSet.clear();
        int i6 = catchingFishGraphQLRealmFAB2.CatchingFishWorkManager;
        for (int i7 = 0; i7 < i6; i7++) {
            catchingFishFluxFluxBundle.CatchingFishWorkManager(catchingFishGraphQLRealmFAB2.CatchingFishWorkManager(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishParcelableFAB(View view, View view2, int i, int i2) {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishDaggerHiltFAB;
        if (i2 == 1) {
            catchingFishToastCoroutine.CatchingFishSnackbar = i;
        } else {
            catchingFishToastCoroutine.CatchingFishParcelableFAB = i;
        }
        this.CatchingFishUnitTesting = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((CatchingFishMVPView) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    public final boolean CatchingFishRoomDatabase(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.CatchingFishWorkManager;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        CatchingFishMVVMCoroutine catchingFishMVVMCoroutine = CatchingFishCardViewRealm;
        if (catchingFishMVVMCoroutine != null) {
            Collections.sort(arrayList, catchingFishMVVMCoroutine);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = ((CatchingFishMVPView) view.getLayoutParams()).CatchingFishParcelableFAB;
            if (z && actionMasked != 0) {
                if (catchingFishJUnitToastKtor != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        catchingFishJUnitToastKtor.CatchingFishWorkManager(this, view, motionEvent2);
                    } else if (i == 1) {
                        catchingFishJUnitToastKtor.CatchingFishRoomDatabase(view, motionEvent2);
                    }
                }
            } else if (!z && catchingFishJUnitToastKtor != null) {
                if (i == 0) {
                    z = catchingFishJUnitToastKtor.CatchingFishWorkManager(this, view, motionEvent);
                } else if (i == 1) {
                    z = catchingFishJUnitToastKtor.CatchingFishRoomDatabase(view, motionEvent);
                }
                if (z) {
                    this.CatchingFishOkHttp = view;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishSnackbar(View view, int i) {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishDaggerHiltFAB;
        if (i == 1) {
            catchingFishToastCoroutine.CatchingFishSnackbar = 0;
        } else {
            catchingFishToastCoroutine.CatchingFishParcelableFAB = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) childAt.getLayoutParams();
            if (catchingFishMVPView.CatchingFishParcelableFAB(i)) {
                CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB;
                if (catchingFishJUnitToastKtor != null) {
                    catchingFishJUnitToastKtor.CatchingFishStateLiveData(childAt, view, i);
                }
                if (i == 0) {
                    catchingFishMVPView.CatchingFishOkHttp = false;
                } else if (i == 1) {
                    catchingFishMVPView.CatchingFishUnitTesting = false;
                }
            }
        }
        this.CatchingFishUnitTesting = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishStateLiveData(View view, int i) {
        Rect CatchingFishReduxKtor;
        Rect CatchingFishReduxKtor2;
        int i2;
        CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) view.getLayoutParams();
        View view2 = catchingFishMVPView.CatchingFishCloudMessaging;
        if (view2 == null && catchingFishMVPView.CatchingFishWorkManager != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        CatchingFishToastDagger catchingFishToastDagger = CatchingFishPayPal;
        if (view2 != null) {
            CatchingFishReduxKtor = CatchingFishReduxKtor();
            CatchingFishReduxKtor2 = CatchingFishReduxKtor();
            try {
                CatchingFishCloudMessaging(view2, CatchingFishReduxKtor);
                CatchingFishMVPView catchingFishMVPView2 = (CatchingFishMVPView) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                CatchingFishEspressoTesting(i, CatchingFishReduxKtor, CatchingFishReduxKtor2, catchingFishMVPView2, measuredWidth, measuredHeight);
                CatchingFishDaggerWebsocket(catchingFishMVPView2, CatchingFishReduxKtor2, measuredWidth, measuredHeight);
                view.layout(CatchingFishReduxKtor2.left, CatchingFishReduxKtor2.top, CatchingFishReduxKtor2.right, CatchingFishReduxKtor2.bottom);
                return;
            } finally {
                CatchingFishReduxKtor.setEmpty();
                catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor);
                CatchingFishReduxKtor2.setEmpty();
                catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor2);
            }
        }
        int i3 = catchingFishMVPView.CatchingFishDaggerWebsocket;
        if (i3 < 0) {
            CatchingFishMVPView catchingFishMVPView3 = (CatchingFishMVPView) view.getLayoutParams();
            CatchingFishReduxKtor = CatchingFishReduxKtor();
            CatchingFishReduxKtor.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) catchingFishMVPView3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) catchingFishMVPView3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView3).bottomMargin);
            if (this.CatchingFishRoomDatabase != null) {
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    CatchingFishReduxKtor.left = this.CatchingFishRoomDatabase.CatchingFishSnackbar() + CatchingFishReduxKtor.left;
                    CatchingFishReduxKtor.top = this.CatchingFishRoomDatabase.CatchingFishReduxKtor() + CatchingFishReduxKtor.top;
                    CatchingFishReduxKtor.right -= this.CatchingFishRoomDatabase.CatchingFishCoroutine();
                    CatchingFishReduxKtor.bottom -= this.CatchingFishRoomDatabase.CatchingFishParcelableFAB();
                }
            }
            CatchingFishReduxKtor2 = CatchingFishReduxKtor();
            int i4 = catchingFishMVPView3.CatchingFishCoroutine;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), CatchingFishReduxKtor, CatchingFishReduxKtor2, i);
            view.layout(CatchingFishReduxKtor2.left, CatchingFishReduxKtor2.top, CatchingFishReduxKtor2.right, CatchingFishReduxKtor2.bottom);
            return;
        }
        CatchingFishMVPView catchingFishMVPView4 = (CatchingFishMVPView) view.getLayoutParams();
        int i5 = catchingFishMVPView4.CatchingFishCoroutine;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int i8 = 0;
        int[] iArr = this.CatchingFishEspressoTesting;
        if (iArr == null) {
            toString();
        } else {
            if (i3 >= 0 && i3 < iArr.length) {
                i2 = iArr[i3];
                int i9 = i2 - measuredWidth2;
                if (i6 != 1) {
                    i9 += measuredWidth2 / 2;
                } else if (i6 == 5) {
                    i9 += measuredWidth2;
                }
                if (i7 != 16) {
                    i8 = measuredHeight2 / 2;
                } else if (i7 == 80) {
                    i8 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) catchingFishMVPView4).leftMargin, Math.min(i9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView4).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) catchingFishMVPView4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView4).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            }
            toString();
        }
        i2 = 0;
        int i92 = i2 - measuredWidth2;
        if (i6 != 1) {
        }
        if (i7 != 16) {
        }
        int max3 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) catchingFishMVPView4).leftMargin, Math.min(i92, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView4).rightMargin));
        int max22 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) catchingFishMVPView4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) catchingFishMVPView4).bottomMargin));
        view.layout(max3, max22, measuredWidth2 + max3, measuredHeight2 + max22);
    }

    public final boolean CatchingFishUnitTesting(View view, int i, int i2) {
        CatchingFishToastDagger catchingFishToastDagger = CatchingFishPayPal;
        Rect CatchingFishReduxKtor = CatchingFishReduxKtor();
        CatchingFishCloudMessaging(view, CatchingFishReduxKtor);
        try {
            return CatchingFishReduxKtor.contains(i, i2);
        } finally {
            CatchingFishReduxKtor.setEmpty();
            catchingFishToastDagger.CatchingFishCoroutine(CatchingFishReduxKtor);
        }
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final boolean CatchingFishViewModelFAB(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) childAt.getLayoutParams();
                CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB;
                if (catchingFishJUnitToastKtor != null) {
                    boolean CatchingFishAnimationMockk = catchingFishJUnitToastKtor.CatchingFishAnimationMockk(childAt, i, i2);
                    z |= CatchingFishAnimationMockk;
                    if (i2 == 0) {
                        catchingFishMVPView.CatchingFishOkHttp = CatchingFishAnimationMockk;
                    } else if (i2 == 1) {
                        catchingFishMVPView.CatchingFishUnitTesting = CatchingFishAnimationMockk;
                    }
                } else if (i2 == 0) {
                    catchingFishMVPView.CatchingFishOkHttp = false;
                } else if (i2 == 1) {
                    catchingFishMVPView.CatchingFishUnitTesting = false;
                }
            }
        }
        return z;
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishViewModelScope(View view, int i, int i2, int i3, int i4, int i5) {
        CatchingFishWorkManager(view, i, i2, i3, i4, 0, this.CatchingFishLayout);
    }

    @Override // kotlin.text.CatchingFishOkHttpAnimation
    public final void CatchingFishWorkManager(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) childAt.getLayoutParams();
                if (catchingFishMVPView.CatchingFishParcelableFAB(i5) && (catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB) != null) {
                    int[] iArr2 = this.CatchingFishViewModelFAB;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    catchingFishJUnitToastKtor.CatchingFishCloudMessaging(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            CatchingFishAnimationMockk(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof CatchingFishMVPView) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = ((CatchingFishMVPView) view.getLayoutParams()).CatchingFishParcelableFAB;
        if (catchingFishJUnitToastKtor != null) {
            catchingFishJUnitToastKtor.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.CatchingFish;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new CatchingFishMVPView();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new CatchingFishMVPView(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        CatchingFishNavigation();
        return Collections.unmodifiableList(this.CatchingFishReduxKtor);
    }

    public final CatchingFishKtorPicassoMVVM getLastWindowInsets() {
        return this.CatchingFishRoomDatabase;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishDaggerHiltFAB;
        return catchingFishToastCoroutine.CatchingFishSnackbar | catchingFishToastCoroutine.CatchingFishParcelableFAB;
    }

    public Drawable getStatusBarBackground() {
        return this.CatchingFish;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CatchingFish(false);
        if (this.CatchingFishStateLiveData) {
            if (this.CatchingFishAnimationMockk == null) {
                this.CatchingFishAnimationMockk = new CatchingFishCustomViewMVP(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.CatchingFishAnimationMockk);
        }
        if (this.CatchingFishRoomDatabase == null) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.CatchingFishCloudMessaging = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CatchingFish(false);
        if (this.CatchingFishStateLiveData && this.CatchingFishAnimationMockk != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.CatchingFishAnimationMockk);
        }
        View view = this.CatchingFishUnitTesting;
        if (view != null) {
            CatchingFishSnackbar(view, 0);
        }
        this.CatchingFishCloudMessaging = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.CatchingFishNavigation || this.CatchingFish == null) {
            return;
        }
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = this.CatchingFishRoomDatabase;
        int CatchingFishReduxKtor = catchingFishKtorPicassoMVVM != null ? catchingFishKtorPicassoMVVM.CatchingFishReduxKtor() : 0;
        if (CatchingFishReduxKtor > 0) {
            this.CatchingFish.setBounds(0, 0, getWidth(), CatchingFishReduxKtor);
            this.CatchingFish.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            CatchingFish(true);
        }
        boolean CatchingFishRoomDatabase = CatchingFishRoomDatabase(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return CatchingFishRoomDatabase;
        }
        CatchingFish(true);
        return CatchingFishRoomDatabase;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.CatchingFishReduxKtor;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((catchingFishJUnitToastKtor = ((CatchingFishMVPView) view.getLayoutParams()).CatchingFishParcelableFAB) == null || !catchingFishJUnitToastKtor.CatchingFishViewModelScope(this, view, layoutDirection))) {
                CatchingFishStateLiveData(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor;
        int i7;
        View view;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int absoluteGravity;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.CatchingFishNavigation();
        int childCount = coordinatorLayout.getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i16);
            CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) coordinatorLayout.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
            int i17 = catchingFishGraphQLRealmFAB.CatchingFishWorkManager;
            for (int i18 = 0; i18 < i17; i18++) {
                ArrayList arrayList2 = (ArrayList) catchingFishGraphQLRealmFAB.CatchingFishLayout(i18);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i16++;
        }
        if (z != coordinatorLayout.CatchingFishStateLiveData) {
            if (z) {
                if (coordinatorLayout.CatchingFishCloudMessaging) {
                    if (coordinatorLayout.CatchingFishAnimationMockk == null) {
                        coordinatorLayout.CatchingFishAnimationMockk = new CatchingFishCustomViewMVP(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.CatchingFishAnimationMockk);
                }
                coordinatorLayout.CatchingFishStateLiveData = true;
            } else {
                if (coordinatorLayout.CatchingFishCloudMessaging && coordinatorLayout.CatchingFishAnimationMockk != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.CatchingFishAnimationMockk);
                }
                coordinatorLayout.CatchingFishStateLiveData = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.CatchingFishRoomDatabase != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.CatchingFishReduxKtor;
        int size3 = arrayList3.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size3) {
            View view2 = (View) arrayList3.get(i21);
            int i23 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i8 = size3;
                i13 = i21;
                i11 = paddingRight;
                suggestedMinimumWidth = i23;
                z2 = false;
                i9 = paddingLeft;
            } else {
                CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) view2.getLayoutParams();
                int i24 = catchingFishMVPView.CatchingFishDaggerWebsocket;
                if (i24 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                    arrayList = arrayList3;
                } else {
                    i3 = suggestedMinimumHeight;
                    int[] iArr = coordinatorLayout.CatchingFishEspressoTesting;
                    if (iArr == null) {
                        coordinatorLayout.toString();
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (i24 < 0 || i24 >= iArr.length) {
                            coordinatorLayout.toString();
                        } else {
                            i14 = iArr[i24];
                            i15 = catchingFishMVPView.CatchingFishCoroutine;
                            if (i15 == 0) {
                                i15 = 8388661;
                            }
                            absoluteGravity = Gravity.getAbsoluteGravity(i15, layoutDirection) & 7;
                            if (!(absoluteGravity == 3 || z3) || (absoluteGravity == 5 && z3)) {
                                i4 = Math.max(0, (size - paddingRight) - i14);
                            } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                                i4 = Math.max(0, i14 - paddingLeft);
                            }
                            if (z4 || view2.getFitsSystemWindows()) {
                                i5 = i;
                                i6 = i2;
                            } else {
                                int CatchingFishCoroutine = coordinatorLayout.CatchingFishRoomDatabase.CatchingFishCoroutine() + coordinatorLayout.CatchingFishRoomDatabase.CatchingFishSnackbar();
                                int CatchingFishParcelableFAB = coordinatorLayout.CatchingFishRoomDatabase.CatchingFishParcelableFAB() + coordinatorLayout.CatchingFishRoomDatabase.CatchingFishReduxKtor();
                                i5 = View.MeasureSpec.makeMeasureSpec(size - CatchingFishCoroutine, mode);
                                i6 = View.MeasureSpec.makeMeasureSpec(size2 - CatchingFishParcelableFAB, mode2);
                            }
                            catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB;
                            if (catchingFishJUnitToastKtor == null) {
                                int i25 = i4;
                                int i26 = i5;
                                i8 = size3;
                                i9 = paddingLeft;
                                i10 = i23;
                                int i27 = i3;
                                i11 = paddingRight;
                                i12 = i27;
                                z2 = false;
                                i13 = i21;
                                int i28 = i6;
                                boolean CatchingFishViewModelFAB = catchingFishJUnitToastKtor.CatchingFishViewModelFAB(this, view2, i26, i25, i28);
                                view = view2;
                                i5 = i26;
                                i4 = i25;
                                i7 = i28;
                                if (CatchingFishViewModelFAB) {
                                    coordinatorLayout = this;
                                    int max = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).rightMargin);
                                    int max2 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).bottomMargin);
                                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                                    suggestedMinimumWidth = max;
                                    suggestedMinimumHeight = max2;
                                }
                            } else {
                                int i29 = size3;
                                i7 = i6;
                                view = view2;
                                i8 = i29;
                                i9 = paddingLeft;
                                i10 = i23;
                                int i30 = i3;
                                i11 = paddingRight;
                                i12 = i30;
                                i13 = i21;
                                z2 = false;
                            }
                            coordinatorLayout = this;
                            coordinatorLayout.measureChildWithMargins(view, i5, i4, i7, 0);
                            int max3 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).rightMargin);
                            int max22 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).bottomMargin);
                            i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                            suggestedMinimumWidth = max3;
                            suggestedMinimumHeight = max22;
                        }
                    }
                    i14 = 0;
                    i15 = catchingFishMVPView.CatchingFishCoroutine;
                    if (i15 == 0) {
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i15, layoutDirection) & 7;
                    if (absoluteGravity == 3) {
                    }
                    if (absoluteGravity == 5) {
                        i4 = Math.max(0, i14 - paddingLeft);
                        if (z4) {
                        }
                        i5 = i;
                        i6 = i2;
                        catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB;
                        if (catchingFishJUnitToastKtor == null) {
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, i5, i4, i7, 0);
                        int max32 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).rightMargin);
                        int max222 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).bottomMargin);
                        i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                        suggestedMinimumWidth = max32;
                        suggestedMinimumHeight = max222;
                    }
                    i4 = Math.max(0, i14 - paddingLeft);
                    if (z4) {
                    }
                    i5 = i;
                    i6 = i2;
                    catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB;
                    if (catchingFishJUnitToastKtor == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i5, i4, i7, 0);
                    int max322 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).rightMargin);
                    int max2222 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).bottomMargin);
                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    suggestedMinimumWidth = max322;
                    suggestedMinimumHeight = max2222;
                }
                i4 = 0;
                if (z4) {
                }
                i5 = i;
                i6 = i2;
                catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB;
                if (catchingFishJUnitToastKtor == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i5, i4, i7, 0);
                int max3222 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).rightMargin);
                int max22222 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVPView).bottomMargin);
                i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                suggestedMinimumWidth = max3222;
                suggestedMinimumHeight = max22222;
            }
            i21 = i13 + 1;
            size3 = i8;
            paddingLeft = i9;
            paddingRight = i11;
            arrayList3 = arrayList;
        }
        int i31 = i22;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i31), View.resolveSizeAndState(suggestedMinimumHeight, i2, i31 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) childAt.getLayoutParams();
                if (catchingFishMVPView.CatchingFishParcelableFAB(0)) {
                    CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                CatchingFishMVPView catchingFishMVPView = (CatchingFishMVPView) childAt.getLayoutParams();
                if (catchingFishMVPView.CatchingFishParcelableFAB(0) && (catchingFishJUnitToastKtor = catchingFishMVPView.CatchingFishParcelableFAB) != null) {
                    z |= catchingFishJUnitToastKtor.CatchingFishLayout(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        CatchingFishCoroutine(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        CatchingFishViewModelScope(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        CatchingFishParcelableFAB(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof CatchingFishPayPalRetrofit)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CatchingFishPayPalRetrofit catchingFishPayPalRetrofit = (CatchingFishPayPalRetrofit) parcelable;
        super.onRestoreInstanceState(catchingFishPayPalRetrofit.CatchingFishReduxKtor);
        SparseArray sparseArray = catchingFishPayPalRetrofit.CatchingFishWorkManager;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = CatchingFishOkHttp(childAt).CatchingFishParcelableFAB;
            if (id != -1 && catchingFishJUnitToastKtor != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                catchingFishJUnitToastKtor.CatchingFishOkHttp(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable CatchingFishUnitTesting;
        CatchingFishPayPalRetrofit catchingFishPayPalRetrofit = new CatchingFishPayPalRetrofit(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = ((CatchingFishMVPView) childAt.getLayoutParams()).CatchingFishParcelableFAB;
            if (id != -1 && catchingFishJUnitToastKtor != null && (CatchingFishUnitTesting = catchingFishJUnitToastKtor.CatchingFishUnitTesting(childAt)) != null) {
                sparseArray.append(id, CatchingFishUnitTesting);
            }
        }
        catchingFishPayPalRetrofit.CatchingFishWorkManager = sparseArray;
        return catchingFishPayPalRetrofit;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return CatchingFishViewModelFAB(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        CatchingFishSnackbar(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean CatchingFishRoomDatabase;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.CatchingFishOkHttp == null) {
            z = CatchingFishRoomDatabase(motionEvent, 1);
        } else {
            z = false;
        }
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = ((CatchingFishMVPView) this.CatchingFishOkHttp.getLayoutParams()).CatchingFishParcelableFAB;
        if (catchingFishJUnitToastKtor != null) {
            CatchingFishRoomDatabase = catchingFishJUnitToastKtor.CatchingFishRoomDatabase(this.CatchingFishOkHttp, motionEvent);
            motionEvent2 = null;
            if (this.CatchingFishOkHttp != null) {
                CatchingFishRoomDatabase |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return CatchingFishRoomDatabase;
            }
            CatchingFish(false);
            return CatchingFishRoomDatabase;
        }
        CatchingFishRoomDatabase = false;
        motionEvent2 = null;
        if (this.CatchingFishOkHttp != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        CatchingFish(false);
        return CatchingFishRoomDatabase;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = ((CatchingFishMVPView) view.getLayoutParams()).CatchingFishParcelableFAB;
        if (catchingFishJUnitToastKtor != null) {
            catchingFishJUnitToastKtor.CatchingFishEspressoTesting(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.CatchingFishFragmentHandler) {
            return;
        }
        CatchingFish(false);
        this.CatchingFishFragmentHandler = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        CatchingFishDaggerHiltFAB();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.CatchingFishJetpackCompose = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.CatchingFish;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.CatchingFish = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.CatchingFish.setState(getDrawableState());
                }
                Drawable drawable3 = this.CatchingFish;
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.CatchingFish.setVisible(getVisibility() == 0, false);
                this.CatchingFish.setCallback(this);
            }
            WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.CatchingFish;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.CatchingFish.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.CatchingFish;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CatchingFishMVPView ? new CatchingFishMVPView((CatchingFishMVPView) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new CatchingFishMVPView((ViewGroup.MarginLayoutParams) layoutParams) : new CatchingFishMVPView(layoutParams);
    }
}
