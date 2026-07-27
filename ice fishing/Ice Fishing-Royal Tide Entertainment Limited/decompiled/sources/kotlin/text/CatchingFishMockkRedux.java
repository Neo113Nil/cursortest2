package kotlin.text;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishMockkRedux implements Cloneable {
    public ArrayList CatchingFishAnimationMockk;
    public CatchingFishRetrofitView[] CatchingFishStateLiveData;
    public ArrayList CatchingFishUnitTesting;
    public static final Animator[] CatchingFishCardViewRealm = new Animator[0];
    public static final int[] CatchingFishPayPal = {2, 1, 3, 4};
    public static final CatchingFishMoshiGson CatchingFishCardViewView = new CatchingFishMoshiGson();
    public static final ThreadLocal CatchingFishMVPRobolectric = new ThreadLocal();
    public final String CatchingFishReduxKtor = getClass().getName();
    public long CatchingFishDaggerWebsocket = -1;
    public long CatchingFishWorkManager = -1;
    public TimeInterpolator CatchingFishViewModelScope = null;
    public final ArrayList CatchingFishViewModelFAB = new ArrayList();
    public final ArrayList CatchingFishLayout = new ArrayList();
    public CatchingFishFluxFluxBundle CatchingFishFragmentHandler = new CatchingFishFluxFluxBundle(19);
    public CatchingFishFluxFluxBundle CatchingFishCloudMessaging = new CatchingFishFluxFluxBundle(19);
    public CatchingFishWebSocketView CatchingFishEspressoTesting = null;
    public final int[] CatchingFishOkHttp = CatchingFishPayPal;
    public final ArrayList CatchingFishRoomDatabase = new ArrayList();
    public Animator[] CatchingFishNavigation = CatchingFishCardViewRealm;
    public int CatchingFish = 0;
    public boolean CatchingFishJetpackCompose = false;
    public boolean CatchingFishCoroutineFlow = false;
    public CatchingFishMockkRedux CatchingFishDaggerHiltFAB = null;
    public ArrayList CatchingFishSpannableWidget = null;
    public ArrayList CatchingFishParcelableFlux = new ArrayList();
    public CatchingFishMoshiGson CatchingFishGsonAppCompat = CatchingFishCardViewView;

    public static boolean CatchingFishCoroutineFlow(CatchingFishDaggerJUnit catchingFishDaggerJUnit, CatchingFishDaggerJUnit catchingFishDaggerJUnit2, String str) {
        Object obj = catchingFishDaggerJUnit.CatchingFishParcelableFAB.get(str);
        Object obj2 = catchingFishDaggerJUnit2.CatchingFishParcelableFAB.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void CatchingFishSnackbar(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, View view, CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = (CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit2 = (CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle.CatchingFishViewModelScope;
        SparseArray sparseArray = (SparseArray) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) catchingFishFluxFluxBundle.CatchingFishWorkManager;
        catchingFishCameraXRetrofit.put(view, catchingFishDaggerJUnit);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (catchingFishCameraXRetrofit2.containsKey(transitionName)) {
                catchingFishCameraXRetrofit2.put(transitionName, null);
            } else {
                catchingFishCameraXRetrofit2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (catchingFishLayoutMVVMFlux.CatchingFishCoroutine(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    catchingFishLayoutMVVMFlux.CatchingFishDaggerWebsocket(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) catchingFishLayoutMVVMFlux.CatchingFishSnackbar(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    catchingFishLayoutMVVMFlux.CatchingFishDaggerWebsocket(itemIdAtPosition, null);
                }
            }
        }
    }

    public static CatchingFishCameraXRetrofit CatchingFishStateLiveData() {
        ThreadLocal threadLocal = CatchingFishMVPRobolectric;
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = (CatchingFishCameraXRetrofit) threadLocal.get();
        if (catchingFishCameraXRetrofit != null) {
            return catchingFishCameraXRetrofit;
        }
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit2 = new CatchingFishCameraXRetrofit(0);
        threadLocal.set(catchingFishCameraXRetrofit2);
        return catchingFishCameraXRetrofit2;
    }

    public boolean CatchingFish(CatchingFishDaggerJUnit catchingFishDaggerJUnit, CatchingFishDaggerJUnit catchingFishDaggerJUnit2) {
        if (catchingFishDaggerJUnit != null && catchingFishDaggerJUnit2 != null) {
            String[] CatchingFishRoomDatabase = CatchingFishRoomDatabase();
            if (CatchingFishRoomDatabase != null) {
                for (String str : CatchingFishRoomDatabase) {
                    if (CatchingFishCoroutineFlow(catchingFishDaggerJUnit, catchingFishDaggerJUnit2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = catchingFishDaggerJUnit.CatchingFishParcelableFAB.keySet().iterator();
                while (it.hasNext()) {
                    if (CatchingFishCoroutineFlow(catchingFishDaggerJUnit, catchingFishDaggerJUnit2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final CatchingFishMockkRedux CatchingFishAnimationMockk() {
        CatchingFishWebSocketView catchingFishWebSocketView = this.CatchingFishEspressoTesting;
        return catchingFishWebSocketView != null ? catchingFishWebSocketView.CatchingFishAnimationMockk() : this;
    }

    public void CatchingFishCardViewRealm() {
        CatchingFishJobScheduler();
        CatchingFishCameraXRetrofit CatchingFishStateLiveData = CatchingFishStateLiveData();
        ArrayList arrayList = this.CatchingFishParcelableFlux;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (CatchingFishStateLiveData.containsKey(animator)) {
                CatchingFishJobScheduler();
                if (animator != null) {
                    animator.addListener(new CatchingFishExoPlayerPayPal(this, CatchingFishStateLiveData));
                    long j = this.CatchingFishWorkManager;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.CatchingFishDaggerWebsocket;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.CatchingFishViewModelScope;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new CatchingFishStateLiveData(5, this));
                    animator.start();
                }
            }
        }
        this.CatchingFishParcelableFlux.clear();
        CatchingFishOkHttp();
    }

    public Animator CatchingFishCloudMessaging(ViewGroup viewGroup, CatchingFishDaggerJUnit catchingFishDaggerJUnit, CatchingFishDaggerJUnit catchingFishDaggerJUnit2) {
        return null;
    }

    public void CatchingFishCoroutine() {
        ArrayList arrayList = this.CatchingFishRoomDatabase;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.CatchingFishNavigation);
        this.CatchingFishNavigation = CatchingFishCardViewRealm;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.CatchingFishNavigation = animatorArr;
        CatchingFishDaggerHiltFAB(this, CatchingFishAsyncTaskWidget.CatchingFishViewModelScope);
    }

    public void CatchingFishCustomView(CatchingFishMoshiGson catchingFishMoshiGson) {
        if (catchingFishMoshiGson == null) {
            this.CatchingFishGsonAppCompat = CatchingFishCardViewView;
        } else {
            this.CatchingFishGsonAppCompat = catchingFishMoshiGson;
        }
    }

    public final void CatchingFishDaggerHiltFAB(CatchingFishMockkRedux catchingFishMockkRedux, CatchingFishAsyncTaskWidget catchingFishAsyncTaskWidget) {
        CatchingFishMockkRedux catchingFishMockkRedux2 = this.CatchingFishDaggerHiltFAB;
        if (catchingFishMockkRedux2 != null) {
            catchingFishMockkRedux2.CatchingFishDaggerHiltFAB(catchingFishMockkRedux, catchingFishAsyncTaskWidget);
        }
        ArrayList arrayList = this.CatchingFishSpannableWidget;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.CatchingFishSpannableWidget.size();
        CatchingFishRetrofitView[] catchingFishRetrofitViewArr = this.CatchingFishStateLiveData;
        if (catchingFishRetrofitViewArr == null) {
            catchingFishRetrofitViewArr = new CatchingFishRetrofitView[size];
        }
        this.CatchingFishStateLiveData = null;
        CatchingFishRetrofitView[] catchingFishRetrofitViewArr2 = (CatchingFishRetrofitView[]) this.CatchingFishSpannableWidget.toArray(catchingFishRetrofitViewArr);
        for (int i = 0; i < size; i++) {
            CatchingFishRetrofitView catchingFishRetrofitView = catchingFishRetrofitViewArr2[i];
            switch (catchingFishAsyncTaskWidget.CatchingFishReduxKtor) {
                case 4:
                    catchingFishRetrofitView.CatchingFishWorkManager(catchingFishMockkRedux);
                    break;
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    catchingFishRetrofitView.CatchingFishCoroutine(catchingFishMockkRedux);
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    catchingFishRetrofitView.CatchingFishParcelableFAB(catchingFishMockkRedux);
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    catchingFishRetrofitView.CatchingFishSnackbar();
                    break;
                default:
                    catchingFishRetrofitView.CatchingFishReduxKtor();
                    break;
            }
            catchingFishRetrofitViewArr2[i] = null;
        }
        this.CatchingFishStateLiveData = catchingFishRetrofitViewArr2;
    }

    public final void CatchingFishDaggerWebsocket(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            CatchingFishDaggerJUnit catchingFishDaggerJUnit = new CatchingFishDaggerJUnit(view);
            if (z) {
                CatchingFishViewModelScope(catchingFishDaggerJUnit);
            } else {
                CatchingFishReduxKtor(catchingFishDaggerJUnit);
            }
            catchingFishDaggerJUnit.CatchingFishCoroutine.add(this);
            CatchingFishWorkManager(catchingFishDaggerJUnit);
            if (z) {
                CatchingFishSnackbar(this.CatchingFishFragmentHandler, view, catchingFishDaggerJUnit);
            } else {
                CatchingFishSnackbar(this.CatchingFishCloudMessaging, view, catchingFishDaggerJUnit);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                CatchingFishDaggerWebsocket(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void CatchingFishEspressoTesting(ViewGroup viewGroup, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        CatchingFishDaggerJUnit catchingFishDaggerJUnit;
        Animator animator;
        CatchingFishDaggerJUnit catchingFishDaggerJUnit2;
        CatchingFishCameraXRetrofit CatchingFishStateLiveData = CatchingFishStateLiveData();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        CatchingFishAnimationMockk().getClass();
        int i3 = 0;
        while (i3 < size) {
            CatchingFishDaggerJUnit catchingFishDaggerJUnit3 = (CatchingFishDaggerJUnit) arrayList.get(i3);
            CatchingFishDaggerJUnit catchingFishDaggerJUnit4 = (CatchingFishDaggerJUnit) arrayList2.get(i3);
            if (catchingFishDaggerJUnit3 != null && !catchingFishDaggerJUnit3.CatchingFishCoroutine.contains(this)) {
                catchingFishDaggerJUnit3 = null;
            }
            if (catchingFishDaggerJUnit4 != null && !catchingFishDaggerJUnit4.CatchingFishCoroutine.contains(this)) {
                catchingFishDaggerJUnit4 = null;
            }
            if ((catchingFishDaggerJUnit3 != null || catchingFishDaggerJUnit4 != null) && (catchingFishDaggerJUnit3 == null || catchingFishDaggerJUnit4 == null || CatchingFish(catchingFishDaggerJUnit3, catchingFishDaggerJUnit4))) {
                Animator CatchingFishCloudMessaging = CatchingFishCloudMessaging(viewGroup, catchingFishDaggerJUnit3, catchingFishDaggerJUnit4);
                if (CatchingFishCloudMessaging != null) {
                    String str = this.CatchingFishReduxKtor;
                    if (catchingFishDaggerJUnit4 != null) {
                        view = catchingFishDaggerJUnit4.CatchingFishSnackbar;
                        String[] CatchingFishRoomDatabase = CatchingFishRoomDatabase();
                        if (CatchingFishRoomDatabase != null && CatchingFishRoomDatabase.length > 0) {
                            catchingFishDaggerJUnit2 = new CatchingFishDaggerJUnit(view);
                            CatchingFishDaggerJUnit catchingFishDaggerJUnit5 = (CatchingFishDaggerJUnit) ((CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle2.CatchingFishReduxKtor).get(view);
                            i = size;
                            if (catchingFishDaggerJUnit5 != null) {
                                int i4 = 0;
                                while (i4 < CatchingFishRoomDatabase.length) {
                                    String str2 = CatchingFishRoomDatabase[i4];
                                    catchingFishDaggerJUnit2.CatchingFishParcelableFAB.put(str2, catchingFishDaggerJUnit5.CatchingFishParcelableFAB.get(str2));
                                    i4++;
                                    i3 = i3;
                                    catchingFishDaggerJUnit5 = catchingFishDaggerJUnit5;
                                }
                            }
                            i2 = i3;
                            int i5 = CatchingFishStateLiveData.CatchingFishWorkManager;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = CatchingFishCloudMessaging;
                                    break;
                                }
                                CatchingFishMoshiLayout catchingFishMoshiLayout = (CatchingFishMoshiLayout) CatchingFishStateLiveData.get((Animator) CatchingFishStateLiveData.CatchingFishWorkManager(i6));
                                if (catchingFishMoshiLayout.CatchingFishCoroutine != null && catchingFishMoshiLayout.CatchingFishParcelableFAB == view && catchingFishMoshiLayout.CatchingFishSnackbar.equals(str) && catchingFishMoshiLayout.CatchingFishCoroutine.equals(catchingFishDaggerJUnit2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = CatchingFishCloudMessaging;
                            catchingFishDaggerJUnit2 = null;
                        }
                        CatchingFishCloudMessaging = animator;
                        catchingFishDaggerJUnit = catchingFishDaggerJUnit2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = catchingFishDaggerJUnit3.CatchingFishSnackbar;
                        catchingFishDaggerJUnit = null;
                    }
                    if (CatchingFishCloudMessaging != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        CatchingFishMoshiLayout catchingFishMoshiLayout2 = new CatchingFishMoshiLayout();
                        catchingFishMoshiLayout2.CatchingFishParcelableFAB = view;
                        catchingFishMoshiLayout2.CatchingFishSnackbar = str;
                        catchingFishMoshiLayout2.CatchingFishCoroutine = catchingFishDaggerJUnit;
                        catchingFishMoshiLayout2.CatchingFishReduxKtor = windowId;
                        catchingFishMoshiLayout2.CatchingFishDaggerWebsocket = this;
                        catchingFishMoshiLayout2.CatchingFishWorkManager = CatchingFishCloudMessaging;
                        CatchingFishStateLiveData.put(CatchingFishCloudMessaging, catchingFishMoshiLayout2);
                        this.CatchingFishParcelableFlux.add(CatchingFishCloudMessaging);
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                CatchingFishMoshiLayout catchingFishMoshiLayout3 = (CatchingFishMoshiLayout) CatchingFishStateLiveData.get((Animator) this.CatchingFishParcelableFlux.get(sparseIntArray.keyAt(i7)));
                catchingFishMoshiLayout3.CatchingFishWorkManager.setStartDelay(catchingFishMoshiLayout3.CatchingFishWorkManager.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    @Override // 
    /* renamed from: CatchingFishFragmentHandler */
    public CatchingFishMockkRedux clone() {
        try {
            CatchingFishMockkRedux catchingFishMockkRedux = (CatchingFishMockkRedux) super.clone();
            catchingFishMockkRedux.CatchingFishParcelableFlux = new ArrayList();
            catchingFishMockkRedux.CatchingFishFragmentHandler = new CatchingFishFluxFluxBundle(19);
            catchingFishMockkRedux.CatchingFishCloudMessaging = new CatchingFishFluxFluxBundle(19);
            catchingFishMockkRedux.CatchingFishUnitTesting = null;
            catchingFishMockkRedux.CatchingFishAnimationMockk = null;
            catchingFishMockkRedux.CatchingFishDaggerHiltFAB = this;
            catchingFishMockkRedux.CatchingFishSpannableWidget = null;
            return catchingFishMockkRedux;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void CatchingFishGsonAppCompat(View view) {
        if (this.CatchingFishJetpackCompose) {
            if (!this.CatchingFishCoroutineFlow) {
                ArrayList arrayList = this.CatchingFishRoomDatabase;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.CatchingFishNavigation);
                this.CatchingFishNavigation = CatchingFishCardViewRealm;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.CatchingFishNavigation = animatorArr;
                CatchingFishDaggerHiltFAB(this, CatchingFishAsyncTaskWidget.CatchingFishLayout);
            }
            this.CatchingFishJetpackCompose = false;
        }
    }

    public final boolean CatchingFishJetpackCompose(View view) {
        int id = view.getId();
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        int size = arrayList.size();
        ArrayList arrayList2 = this.CatchingFishLayout;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void CatchingFishJobScheduler() {
        if (this.CatchingFish == 0) {
            CatchingFishDaggerHiltFAB(this, CatchingFishAsyncTaskWidget.CatchingFishDaggerWebsocket);
            this.CatchingFishCoroutineFlow = false;
        }
        this.CatchingFish++;
    }

    public final void CatchingFishLayout(boolean z) {
        if (z) {
            ((CatchingFishCameraXRetrofit) this.CatchingFishFragmentHandler.CatchingFishReduxKtor).clear();
            ((SparseArray) this.CatchingFishFragmentHandler.CatchingFishDaggerWebsocket).clear();
            ((CatchingFishLayoutMVVMFlux) this.CatchingFishFragmentHandler.CatchingFishWorkManager).CatchingFishParcelableFAB();
        } else {
            ((CatchingFishCameraXRetrofit) this.CatchingFishCloudMessaging.CatchingFishReduxKtor).clear();
            ((SparseArray) this.CatchingFishCloudMessaging.CatchingFishDaggerWebsocket).clear();
            ((CatchingFishLayoutMVVMFlux) this.CatchingFishCloudMessaging.CatchingFishWorkManager).CatchingFishParcelableFAB();
        }
    }

    public void CatchingFishMVPRobolectric(TimeInterpolator timeInterpolator) {
        this.CatchingFishViewModelScope = timeInterpolator;
    }

    public void CatchingFishMutableLiveData(long j) {
        this.CatchingFishDaggerWebsocket = j;
    }

    public final CatchingFishDaggerJUnit CatchingFishNavigation(View view, boolean z) {
        CatchingFishWebSocketView catchingFishWebSocketView = this.CatchingFishEspressoTesting;
        if (catchingFishWebSocketView != null) {
            return catchingFishWebSocketView.CatchingFishNavigation(view, z);
        }
        return (CatchingFishDaggerJUnit) ((CatchingFishCameraXRetrofit) (z ? this.CatchingFishFragmentHandler : this.CatchingFishCloudMessaging).CatchingFishReduxKtor).get(view);
    }

    public final void CatchingFishOkHttp() {
        int i = this.CatchingFish - 1;
        this.CatchingFish = i;
        if (i == 0) {
            CatchingFishDaggerHiltFAB(this, CatchingFishAsyncTaskWidget.CatchingFishWorkManager);
            for (int i2 = 0; i2 < ((CatchingFishLayoutMVVMFlux) this.CatchingFishFragmentHandler.CatchingFishWorkManager).CatchingFishViewModelScope(); i2++) {
                View view = (View) ((CatchingFishLayoutMVVMFlux) this.CatchingFishFragmentHandler.CatchingFishWorkManager).CatchingFishViewModelFAB(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((CatchingFishLayoutMVVMFlux) this.CatchingFishCloudMessaging.CatchingFishWorkManager).CatchingFishViewModelScope(); i3++) {
                View view2 = (View) ((CatchingFishLayoutMVVMFlux) this.CatchingFishCloudMessaging.CatchingFishWorkManager).CatchingFishViewModelFAB(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.CatchingFishCoroutineFlow = true;
        }
    }

    public void CatchingFishParcelableFAB(CatchingFishRetrofitView catchingFishRetrofitView) {
        if (this.CatchingFishSpannableWidget == null) {
            this.CatchingFishSpannableWidget = new ArrayList();
        }
        this.CatchingFishSpannableWidget.add(catchingFishRetrofitView);
    }

    public CatchingFishMockkRedux CatchingFishParcelableFlux(CatchingFishRetrofitView catchingFishRetrofitView) {
        CatchingFishMockkRedux catchingFishMockkRedux;
        ArrayList arrayList = this.CatchingFishSpannableWidget;
        if (arrayList != null) {
            if (!arrayList.remove(catchingFishRetrofitView) && (catchingFishMockkRedux = this.CatchingFishDaggerHiltFAB) != null) {
                catchingFishMockkRedux.CatchingFishParcelableFlux(catchingFishRetrofitView);
            }
            if (this.CatchingFishSpannableWidget.size() == 0) {
                this.CatchingFishSpannableWidget = null;
            }
        }
        return this;
    }

    public void CatchingFishPayPal(long j) {
        this.CatchingFishWorkManager = j;
    }

    public String CatchingFishPayPalService(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.CatchingFishWorkManager != -1) {
            sb.append("dur(");
            sb.append(this.CatchingFishWorkManager);
            sb.append(") ");
        }
        if (this.CatchingFishDaggerWebsocket != -1) {
            sb.append("dly(");
            sb.append(this.CatchingFishDaggerWebsocket);
            sb.append(") ");
        }
        if (this.CatchingFishViewModelScope != null) {
            sb.append("interp(");
            sb.append(this.CatchingFishViewModelScope);
            sb.append(") ");
        }
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        int size = arrayList.size();
        ArrayList arrayList2 = this.CatchingFishLayout;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public abstract void CatchingFishReduxKtor(CatchingFishDaggerJUnit catchingFishDaggerJUnit);

    public String[] CatchingFishRoomDatabase() {
        return null;
    }

    public void CatchingFishSpannableWidget(View view) {
        if (this.CatchingFishCoroutineFlow) {
            return;
        }
        ArrayList arrayList = this.CatchingFishRoomDatabase;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.CatchingFishNavigation);
        this.CatchingFishNavigation = CatchingFishCardViewRealm;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.CatchingFishNavigation = animatorArr;
        CatchingFishDaggerHiltFAB(this, CatchingFishAsyncTaskWidget.CatchingFishViewModelFAB);
        this.CatchingFishJetpackCompose = true;
    }

    public final CatchingFishDaggerJUnit CatchingFishUnitTesting(View view, boolean z) {
        CatchingFishWebSocketView catchingFishWebSocketView = this.CatchingFishEspressoTesting;
        if (catchingFishWebSocketView != null) {
            return catchingFishWebSocketView.CatchingFishUnitTesting(view, z);
        }
        ArrayList arrayList = z ? this.CatchingFishUnitTesting : this.CatchingFishAnimationMockk;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            CatchingFishDaggerJUnit catchingFishDaggerJUnit = (CatchingFishDaggerJUnit) arrayList.get(i);
            if (catchingFishDaggerJUnit == null) {
                return null;
            }
            if (catchingFishDaggerJUnit.CatchingFishSnackbar == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (CatchingFishDaggerJUnit) (z ? this.CatchingFishAnimationMockk : this.CatchingFishUnitTesting).get(i);
        }
        return null;
    }

    public final void CatchingFishViewModelFAB(ViewGroup viewGroup, boolean z) {
        CatchingFishLayout(z);
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        int size = arrayList.size();
        ArrayList arrayList2 = this.CatchingFishLayout;
        if (size <= 0 && arrayList2.size() <= 0) {
            CatchingFishDaggerWebsocket(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                CatchingFishDaggerJUnit catchingFishDaggerJUnit = new CatchingFishDaggerJUnit(findViewById);
                if (z) {
                    CatchingFishViewModelScope(catchingFishDaggerJUnit);
                } else {
                    CatchingFishReduxKtor(catchingFishDaggerJUnit);
                }
                catchingFishDaggerJUnit.CatchingFishCoroutine.add(this);
                CatchingFishWorkManager(catchingFishDaggerJUnit);
                if (z) {
                    CatchingFishSnackbar(this.CatchingFishFragmentHandler, findViewById, catchingFishDaggerJUnit);
                } else {
                    CatchingFishSnackbar(this.CatchingFishCloudMessaging, findViewById, catchingFishDaggerJUnit);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            CatchingFishDaggerJUnit catchingFishDaggerJUnit2 = new CatchingFishDaggerJUnit(view);
            if (z) {
                CatchingFishViewModelScope(catchingFishDaggerJUnit2);
            } else {
                CatchingFishReduxKtor(catchingFishDaggerJUnit2);
            }
            catchingFishDaggerJUnit2.CatchingFishCoroutine.add(this);
            CatchingFishWorkManager(catchingFishDaggerJUnit2);
            if (z) {
                CatchingFishSnackbar(this.CatchingFishFragmentHandler, view, catchingFishDaggerJUnit2);
            } else {
                CatchingFishSnackbar(this.CatchingFishCloudMessaging, view, catchingFishDaggerJUnit2);
            }
        }
    }

    public abstract void CatchingFishViewModelScope(CatchingFishDaggerJUnit catchingFishDaggerJUnit);

    public final String toString() {
        return CatchingFishPayPalService("");
    }

    public void CatchingFishFragmentFactory() {
    }

    public void CatchingFishCardViewView(CatchingFishKtorViewModel catchingFishKtorViewModel) {
    }

    public void CatchingFishWorkManager(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
    }
}
