package kotlin.text;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishSnackbarCameraX {
    public final ArrayList CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public final ArrayList CatchingFishParcelableFAB;
    public final List CatchingFishReduxKtor;
    public ArrayList CatchingFishSnackbar;
    public final /* synthetic */ RecyclerView CatchingFishViewModelFAB;
    public CatchingFishSpannableMVP CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishSnackbarCameraX(RecyclerView recyclerView) {
        this.CatchingFishViewModelFAB = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.CatchingFishParcelableFAB = arrayList;
        this.CatchingFishSnackbar = null;
        this.CatchingFishCoroutine = new ArrayList();
        this.CatchingFishReduxKtor = Collections.unmodifiableList(arrayList);
        this.CatchingFishDaggerWebsocket = 2;
        this.CatchingFishWorkManager = 2;
    }

    public final void CatchingFishCloudMessaging(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        if (catchingFishPayPalCardView.CatchingFishAnimationMockk) {
            this.CatchingFishSnackbar.remove(catchingFishPayPalCardView);
        } else {
            this.CatchingFishParcelableFAB.remove(catchingFishPayPalCardView);
        }
        catchingFishPayPalCardView.CatchingFishUnitTesting = null;
        catchingFishPayPalCardView.CatchingFishAnimationMockk = false;
        catchingFishPayPalCardView.CatchingFishFragmentHandler &= -33;
    }

    public final CatchingFishSpannableMVP CatchingFishCoroutine() {
        if (this.CatchingFishViewModelScope == null) {
            CatchingFishSpannableMVP catchingFishSpannableMVP = new CatchingFishSpannableMVP();
            catchingFishSpannableMVP.CatchingFishParcelableFAB = new SparseArray();
            catchingFishSpannableMVP.CatchingFishSnackbar = 0;
            this.CatchingFishViewModelScope = catchingFishSpannableMVP;
        }
        return this.CatchingFishViewModelScope;
    }

    public final void CatchingFishDaggerWebsocket() {
        ArrayList arrayList = this.CatchingFishCoroutine;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            CatchingFishWorkManager(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.CatchingFishMVPReduxContext;
        CatchingFishWidgetFAB catchingFishWidgetFAB = this.CatchingFishViewModelFAB.CatchingFishNavigationGson;
        int[] iArr2 = (int[]) catchingFishWidgetFAB.CatchingFishReduxKtor;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        catchingFishWidgetFAB.CatchingFishCoroutine = 0;
    }

    public final void CatchingFishEspressoTesting() {
        CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishViewModelFAB.CatchingFishAnimationMockk;
        this.CatchingFishWorkManager = this.CatchingFishDaggerWebsocket + (catchingFishKtorDataStore != null ? catchingFishKtorDataStore.CatchingFishFragmentHandler : 0);
        ArrayList arrayList = this.CatchingFishCoroutine;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.CatchingFishWorkManager; size--) {
            CatchingFishWorkManager(size);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0435, code lost:
    
        if (r10.CatchingFishWorkManager() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0461, code lost:
    
        if ((r13 + r11) >= r28) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d3, code lost:
    
        if (r10.CatchingFishWorkManager != 0) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0080  */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.text.CatchingFishAndroidX] */
    /* JADX WARN: Type inference failed for: r9v10, types: [kotlin.text.CatchingFishAndroidX] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishPayPalCardView CatchingFishFragmentHandler(int i, long j) {
        boolean z;
        CatchingFishPayPalCardView catchingFishPayPalCardView;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        CatchingFishGradleDagger catchingFishGradleDagger;
        CatchingFishPayPalCardView catchingFishPayPalCardView2;
        int i2;
        View view;
        boolean z5;
        int size;
        int CatchingFishWorkManager;
        RecyclerView recyclerView = this.CatchingFishViewModelFAB;
        CatchingFishReduxGlide catchingFishReduxGlide = recyclerView.CatchingFishRedux;
        if (i < 0 || i >= catchingFishReduxGlide.CatchingFishSnackbar()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + catchingFishReduxGlide.CatchingFishSnackbar() + recyclerView.CatchingFishGsonAppCompat());
        }
        if (catchingFishReduxGlide.CatchingFishViewModelScope) {
            ArrayList arrayList = this.CatchingFishSnackbar;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        catchingFishPayPalCardView = (CatchingFishPayPalCardView) this.CatchingFishSnackbar.get(i3);
                        if (!catchingFishPayPalCardView.CatchingFishStateLiveData() && catchingFishPayPalCardView.CatchingFishSnackbar() == i) {
                            catchingFishPayPalCardView.CatchingFishParcelableFAB(32);
                            break;
                        }
                        i3++;
                    } else if (recyclerView.CatchingFishUnitTesting.CatchingFishSnackbar && (CatchingFishWorkManager = recyclerView.CatchingFishViewModelScope.CatchingFishWorkManager(i, 0)) > 0 && CatchingFishWorkManager < recyclerView.CatchingFishUnitTesting.CatchingFishParcelableFAB()) {
                        long CatchingFishSnackbar = recyclerView.CatchingFishUnitTesting.CatchingFishSnackbar(CatchingFishWorkManager);
                        for (int i4 = 0; i4 < size; i4++) {
                            CatchingFishPayPalCardView catchingFishPayPalCardView3 = (CatchingFishPayPalCardView) this.CatchingFishSnackbar.get(i4);
                            if (!catchingFishPayPalCardView3.CatchingFishStateLiveData() && catchingFishPayPalCardView3.CatchingFishDaggerWebsocket == CatchingFishSnackbar) {
                                catchingFishPayPalCardView3.CatchingFishParcelableFAB(32);
                                catchingFishPayPalCardView = catchingFishPayPalCardView3;
                                break;
                            }
                        }
                    }
                }
                z = catchingFishPayPalCardView == null;
            }
            catchingFishPayPalCardView = null;
            if (catchingFishPayPalCardView == null) {
            }
        } else {
            z = false;
            catchingFishPayPalCardView = null;
        }
        ArrayList arrayList2 = this.CatchingFishParcelableFAB;
        ArrayList arrayList3 = this.CatchingFishCoroutine;
        if (catchingFishPayPalCardView == null) {
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                CatchingFishPayPalCardView catchingFishPayPalCardView4 = (CatchingFishPayPalCardView) arrayList2.get(i5);
                if (!catchingFishPayPalCardView4.CatchingFishStateLiveData() && catchingFishPayPalCardView4.CatchingFishSnackbar() == i && !catchingFishPayPalCardView4.CatchingFishWorkManager() && (catchingFishReduxGlide.CatchingFishViewModelScope || !catchingFishPayPalCardView4.CatchingFishViewModelFAB())) {
                    catchingFishPayPalCardView4.CatchingFishParcelableFAB(32);
                    catchingFishPayPalCardView = catchingFishPayPalCardView4;
                    z2 = true;
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.CatchingFishViewModelFAB.CatchingFishViewModelScope;
            int size3 = arrayList4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    z2 = true;
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i6);
                CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
                z2 = true;
                if (CatchingFishSensorManager.CatchingFishSnackbar() == i && !CatchingFishSensorManager.CatchingFishWorkManager() && !CatchingFishSensorManager.CatchingFishViewModelFAB()) {
                    break;
                }
                i6++;
            }
            if (view == null) {
                int size4 = arrayList3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        catchingFishPayPalCardView = null;
                        break;
                    }
                    CatchingFishPayPalCardView catchingFishPayPalCardView5 = (CatchingFishPayPalCardView) arrayList3.get(i7);
                    if (!catchingFishPayPalCardView5.CatchingFishWorkManager() && catchingFishPayPalCardView5.CatchingFishSnackbar() == i && !catchingFishPayPalCardView5.CatchingFishReduxKtor()) {
                        arrayList3.remove(i7);
                        catchingFishPayPalCardView = catchingFishPayPalCardView5;
                        break;
                    }
                    i7++;
                }
            } else {
                CatchingFishPayPalCardView CatchingFishSensorManager2 = RecyclerView.CatchingFishSensorManager(view);
                CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = recyclerView.CatchingFishViewModelFAB;
                CatchingFishGradleMockk catchingFishGradleMockk = (CatchingFishGradleMockk) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
                int indexOfChild = ((CatchingFishKtorPayPal) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!catchingFishGradleMockk.CatchingFishReduxKtor(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                catchingFishGradleMockk.CatchingFishParcelableFAB(indexOfChild);
                catchingFishAsyncTaskDagger.CatchingFishMockkOkHttp(view);
                CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger2 = recyclerView.CatchingFishViewModelFAB;
                CatchingFishGradleMockk catchingFishGradleMockk2 = (CatchingFishGradleMockk) catchingFishAsyncTaskDagger2.CatchingFishWorkManager;
                int indexOfChild2 = ((CatchingFishKtorPayPal) catchingFishAsyncTaskDagger2.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.indexOfChild(view);
                int CatchingFishSnackbar2 = (indexOfChild2 == -1 || catchingFishGradleMockk2.CatchingFishReduxKtor(indexOfChild2)) ? -1 : indexOfChild2 - catchingFishGradleMockk2.CatchingFishSnackbar(indexOfChild2);
                if (CatchingFishSnackbar2 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + CatchingFishSensorManager2 + recyclerView.CatchingFishGsonAppCompat());
                }
                recyclerView.CatchingFishViewModelFAB.CatchingFishParcelableFlux(CatchingFishSnackbar2);
                CatchingFishLayout(view);
                CatchingFishSensorManager2.CatchingFishParcelableFAB(8224);
                catchingFishPayPalCardView = CatchingFishSensorManager2;
            }
            if (catchingFishPayPalCardView != null) {
                if (catchingFishPayPalCardView.CatchingFishViewModelFAB()) {
                    z5 = catchingFishReduxGlide.CatchingFishViewModelScope;
                } else {
                    int i8 = catchingFishPayPalCardView.CatchingFishCoroutine;
                    if (i8 < 0 || i8 >= recyclerView.CatchingFishUnitTesting.CatchingFishParcelableFAB()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + catchingFishPayPalCardView + recyclerView.CatchingFishGsonAppCompat());
                    }
                    if (!catchingFishReduxGlide.CatchingFishViewModelScope) {
                        recyclerView.CatchingFishUnitTesting.getClass();
                    }
                    CatchingFishToolbarBundle catchingFishToolbarBundle = recyclerView.CatchingFishUnitTesting;
                    if (!catchingFishToolbarBundle.CatchingFishSnackbar || catchingFishPayPalCardView.CatchingFishDaggerWebsocket == catchingFishToolbarBundle.CatchingFishSnackbar(catchingFishPayPalCardView.CatchingFishCoroutine)) {
                        z5 = z2;
                    }
                    z5 = false;
                }
                if (z5) {
                    z = z2;
                } else {
                    catchingFishPayPalCardView.CatchingFishParcelableFAB(4);
                    if (catchingFishPayPalCardView.CatchingFishLayout()) {
                        recyclerView.removeDetachedView(catchingFishPayPalCardView.CatchingFishParcelableFAB, false);
                        catchingFishPayPalCardView.CatchingFishUnitTesting.CatchingFishCloudMessaging(catchingFishPayPalCardView);
                    } else if (catchingFishPayPalCardView.CatchingFishStateLiveData()) {
                        catchingFishPayPalCardView.CatchingFishFragmentHandler &= -33;
                    }
                    CatchingFishViewModelFAB(catchingFishPayPalCardView);
                    catchingFishPayPalCardView = null;
                }
            }
        } else {
            z2 = true;
        }
        if (catchingFishPayPalCardView == null) {
            int CatchingFishWorkManager2 = recyclerView.CatchingFishViewModelScope.CatchingFishWorkManager(i, 0);
            if (CatchingFishWorkManager2 >= 0) {
                j2 = 3;
                if (CatchingFishWorkManager2 < recyclerView.CatchingFishUnitTesting.CatchingFishParcelableFAB()) {
                    recyclerView.CatchingFishUnitTesting.getClass();
                    CatchingFishToolbarBundle catchingFishToolbarBundle2 = recyclerView.CatchingFishUnitTesting;
                    if (catchingFishToolbarBundle2.CatchingFishSnackbar) {
                        long CatchingFishSnackbar3 = catchingFishToolbarBundle2.CatchingFishSnackbar(CatchingFishWorkManager2);
                        int size5 = arrayList2.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                j3 = 4;
                                CatchingFishPayPalCardView catchingFishPayPalCardView6 = (CatchingFishPayPalCardView) arrayList2.get(size5);
                                i2 = CatchingFishWorkManager2;
                                long j4 = catchingFishPayPalCardView6.CatchingFishDaggerWebsocket;
                                View view2 = catchingFishPayPalCardView6.CatchingFishParcelableFAB;
                                if (j4 == CatchingFishSnackbar3 && !catchingFishPayPalCardView6.CatchingFishStateLiveData()) {
                                    if (catchingFishPayPalCardView6.CatchingFishWorkManager == 0) {
                                        catchingFishPayPalCardView6.CatchingFishParcelableFAB(32);
                                        if (catchingFishPayPalCardView6.CatchingFishViewModelFAB() && !catchingFishReduxGlide.CatchingFishViewModelScope) {
                                            catchingFishPayPalCardView6.CatchingFishFragmentHandler = (catchingFishPayPalCardView6.CatchingFishFragmentHandler & (-15)) | 2;
                                        }
                                        catchingFishPayPalCardView = catchingFishPayPalCardView6;
                                    } else {
                                        arrayList2.remove(size5);
                                        recyclerView.removeDetachedView(view2, false);
                                        CatchingFishPayPalCardView CatchingFishSensorManager3 = RecyclerView.CatchingFishSensorManager(view2);
                                        CatchingFishSensorManager3.CatchingFishUnitTesting = null;
                                        CatchingFishSensorManager3.CatchingFishAnimationMockk = false;
                                        CatchingFishSensorManager3.CatchingFishFragmentHandler &= -33;
                                        CatchingFishViewModelFAB(CatchingFishSensorManager3);
                                    }
                                }
                                size5--;
                                CatchingFishWorkManager2 = i2;
                            } else {
                                i2 = CatchingFishWorkManager2;
                                j3 = 4;
                                int size6 = arrayList3.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    CatchingFishPayPalCardView catchingFishPayPalCardView7 = (CatchingFishPayPalCardView) arrayList3.get(size6);
                                    if (catchingFishPayPalCardView7.CatchingFishDaggerWebsocket != CatchingFishSnackbar3 || catchingFishPayPalCardView7.CatchingFishReduxKtor()) {
                                        size6--;
                                    } else if (catchingFishPayPalCardView7.CatchingFishWorkManager == 0) {
                                        arrayList3.remove(size6);
                                        catchingFishPayPalCardView = catchingFishPayPalCardView7;
                                    } else {
                                        CatchingFishWorkManager(size6);
                                    }
                                }
                                catchingFishPayPalCardView = null;
                            }
                        }
                        if (catchingFishPayPalCardView != null) {
                            catchingFishPayPalCardView.CatchingFishCoroutine = i2;
                            z = z2;
                        }
                    } else {
                        j3 = 4;
                    }
                    if (catchingFishPayPalCardView == null) {
                        CatchingFishContextHandler catchingFishContextHandler = (CatchingFishContextHandler) CatchingFishCoroutine().CatchingFishParcelableFAB.get(0);
                        if (catchingFishContextHandler != null) {
                            ArrayList arrayList5 = catchingFishContextHandler.CatchingFishParcelableFAB;
                            if (!arrayList5.isEmpty()) {
                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                    if (!((CatchingFishPayPalCardView) arrayList5.get(size7)).CatchingFishReduxKtor()) {
                                        catchingFishPayPalCardView2 = (CatchingFishPayPalCardView) arrayList5.remove(size7);
                                        break;
                                    }
                                }
                            }
                        }
                        catchingFishPayPalCardView2 = null;
                        if (catchingFishPayPalCardView2 != null) {
                            catchingFishPayPalCardView2.CatchingFishOkHttp();
                            int[] iArr = RecyclerView.CatchingFishMVPReduxContext;
                        }
                        catchingFishPayPalCardView = catchingFishPayPalCardView2;
                    }
                    if (catchingFishPayPalCardView == null) {
                        long nanoTime = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j5 = this.CatchingFishViewModelScope.CatchingFishParcelableFAB(0).CatchingFishCoroutine;
                            if (!((j5 == 0 || j5 + nanoTime < j) ? z2 : false)) {
                                return null;
                            }
                        }
                        CatchingFishToolbarBundle catchingFishToolbarBundle3 = recyclerView.CatchingFishUnitTesting;
                        catchingFishToolbarBundle3.getClass();
                        try {
                            int i9 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                            Trace.beginSection("RV CreateView");
                            catchingFishPayPalCardView = catchingFishToolbarBundle3.CatchingFishReduxKtor(recyclerView);
                            View view3 = catchingFishPayPalCardView.CatchingFishParcelableFAB;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            catchingFishPayPalCardView.CatchingFishWorkManager = 0;
                            Trace.endSection();
                            int[] iArr2 = RecyclerView.CatchingFishMVPReduxContext;
                            RecyclerView CatchingFishCustomView = RecyclerView.CatchingFishCustomView(view3);
                            if (CatchingFishCustomView != null) {
                                catchingFishPayPalCardView.CatchingFishSnackbar = new WeakReference(CatchingFishCustomView);
                            }
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            CatchingFishContextHandler CatchingFishParcelableFAB = this.CatchingFishViewModelScope.CatchingFishParcelableFAB(0);
                            long j6 = CatchingFishParcelableFAB.CatchingFishCoroutine;
                            if (j6 != 0) {
                                nanoTime2 = (nanoTime2 / j3) + ((j6 / j3) * 3);
                            }
                            CatchingFishParcelableFAB.CatchingFishCoroutine = nanoTime2;
                        } finally {
                            int i10 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                            Trace.endSection();
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + CatchingFishWorkManager2 + ").state:" + catchingFishReduxGlide.CatchingFishSnackbar() + recyclerView.CatchingFishGsonAppCompat());
        }
        j2 = 3;
        j3 = 4;
        View view4 = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        if (z && !catchingFishReduxGlide.CatchingFishViewModelScope) {
            int i11 = catchingFishPayPalCardView.CatchingFishFragmentHandler;
            if ((i11 & 8192) != 0 ? z2 : false) {
                catchingFishPayPalCardView.CatchingFishFragmentHandler = i11 & (-8193);
                if (catchingFishReduxGlide.CatchingFishFragmentHandler) {
                    CatchingFishFluxAppCompat.CatchingFishSnackbar(catchingFishPayPalCardView);
                    CatchingFishFluxAppCompat catchingFishFluxAppCompat = recyclerView.CatchingFishCameraXIntent;
                    catchingFishPayPalCardView.CatchingFishCoroutine();
                    catchingFishFluxAppCompat.getClass();
                    CatchingFishToastCoroutine catchingFishToastCoroutine = new CatchingFishToastCoroutine();
                    catchingFishToastCoroutine.CatchingFishParcelableFAB(catchingFishPayPalCardView);
                    recyclerView.CatchingFishAppCompat(catchingFishPayPalCardView, catchingFishToastCoroutine);
                }
            }
        }
        if (!catchingFishReduxGlide.CatchingFishViewModelScope || !catchingFishPayPalCardView.CatchingFishDaggerWebsocket()) {
            if (catchingFishPayPalCardView.CatchingFishDaggerWebsocket()) {
                if (!((catchingFishPayPalCardView.CatchingFishFragmentHandler & 2) != 0 ? z2 : false)) {
                }
            }
            int CatchingFishWorkManager3 = recyclerView.CatchingFishViewModelScope.CatchingFishWorkManager(i, 0);
            catchingFishPayPalCardView.CatchingFish = null;
            catchingFishPayPalCardView.CatchingFishNavigation = recyclerView;
            int i12 = catchingFishPayPalCardView.CatchingFishWorkManager;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j7 = this.CatchingFishViewModelScope.CatchingFishParcelableFAB(i12).CatchingFishReduxKtor;
                if (j7 != 0) {
                }
            }
            CatchingFishToolbarBundle catchingFishToolbarBundle4 = recyclerView.CatchingFishUnitTesting;
            catchingFishToolbarBundle4.getClass();
            boolean z6 = catchingFishPayPalCardView.CatchingFish == null ? z2 : false;
            if (z6) {
                catchingFishPayPalCardView.CatchingFishCoroutine = CatchingFishWorkManager3;
                if (catchingFishToolbarBundle4.CatchingFishSnackbar) {
                    catchingFishPayPalCardView.CatchingFishDaggerWebsocket = catchingFishToolbarBundle4.CatchingFishSnackbar(CatchingFishWorkManager3);
                }
                catchingFishPayPalCardView.CatchingFishFragmentHandler = (catchingFishPayPalCardView.CatchingFishFragmentHandler & (-520)) | 1;
                int i13 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                Trace.beginSection("RV OnBindView");
            }
            catchingFishPayPalCardView.CatchingFish = catchingFishToolbarBundle4;
            catchingFishPayPalCardView.CatchingFishCoroutine();
            catchingFishToolbarBundle4.CatchingFishCoroutine(catchingFishPayPalCardView, CatchingFishWorkManager3);
            if (z6) {
                ArrayList arrayList6 = catchingFishPayPalCardView.CatchingFishCloudMessaging;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                catchingFishPayPalCardView.CatchingFishFragmentHandler &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof CatchingFishGradleDagger) {
                    ((CatchingFishGradleDagger) layoutParams2).CatchingFishCoroutine = z2;
                }
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            CatchingFishContextHandler CatchingFishParcelableFAB2 = this.CatchingFishViewModelScope.CatchingFishParcelableFAB(catchingFishPayPalCardView.CatchingFishWorkManager);
            long j8 = CatchingFishParcelableFAB2.CatchingFishReduxKtor;
            if (j8 != 0) {
                nanoTime4 = (nanoTime4 / j3) + ((j8 / j3) * j2);
            }
            CatchingFishParcelableFAB2.CatchingFishReduxKtor = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.CatchingFishCardViewView;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                z3 = true;
                if (view4.getImportantForAccessibility() == 0) {
                    view4.setImportantForAccessibility(1);
                }
                CatchingFishFluxEspresso catchingFishFluxEspresso = recyclerView.CatchingFishRetrofitMVI;
                if (catchingFishFluxEspresso != null) {
                    CatchingFishBiometricRealm catchingFishBiometricRealm = catchingFishFluxEspresso.CatchingFishDaggerWebsocket;
                    if (catchingFishBiometricRealm != null) {
                        View.AccessibilityDelegate CatchingFishReduxKtor = CatchingFishFABCameraX.CatchingFishReduxKtor(view4);
                        CatchingFishBiometricRealm catchingFishAndroidX = CatchingFishReduxKtor != null ? CatchingFishReduxKtor instanceof CatchingFishAppCompat ? ((CatchingFishAppCompat) CatchingFishReduxKtor).CatchingFishParcelableFAB : new CatchingFishAndroidX(CatchingFishReduxKtor) : null;
                        if (catchingFishAndroidX != null && catchingFishAndroidX != catchingFishBiometricRealm) {
                            catchingFishBiometricRealm.CatchingFishDaggerWebsocket.put(view4, catchingFishAndroidX);
                        }
                    }
                    CatchingFishFABCameraX.CatchingFishOkHttp(view4, catchingFishBiometricRealm);
                }
            } else {
                z3 = true;
            }
            if (catchingFishReduxGlide.CatchingFishViewModelScope) {
                catchingFishPayPalCardView.CatchingFishViewModelScope = i;
            }
            z4 = z3;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                catchingFishGradleDagger = (CatchingFishGradleDagger) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(catchingFishGradleDagger);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                catchingFishGradleDagger = (CatchingFishGradleDagger) layoutParams;
            } else {
                catchingFishGradleDagger = (CatchingFishGradleDagger) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(catchingFishGradleDagger);
            }
            catchingFishGradleDagger.CatchingFishParcelableFAB = catchingFishPayPalCardView;
            if (z || !z4) {
                z3 = false;
            }
            catchingFishGradleDagger.CatchingFishReduxKtor = z3;
            return catchingFishPayPalCardView;
        }
        catchingFishPayPalCardView.CatchingFishViewModelScope = i;
        z4 = false;
        z3 = z2;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        catchingFishGradleDagger.CatchingFishParcelableFAB = catchingFishPayPalCardView;
        if (z) {
        }
        z3 = false;
        catchingFishGradleDagger.CatchingFishReduxKtor = z3;
        return catchingFishPayPalCardView;
    }

    public final void CatchingFishLayout(View view) {
        CatchingFishFluxAppCompat catchingFishFluxAppCompat;
        CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
        int i = CatchingFishSensorManager.CatchingFishFragmentHandler & 12;
        RecyclerView recyclerView = this.CatchingFishViewModelFAB;
        if (i == 0 && CatchingFishSensorManager.CatchingFishCloudMessaging() && (catchingFishFluxAppCompat = recyclerView.CatchingFishCameraXIntent) != null) {
            CatchingFishGsonUnitTesting catchingFishGsonUnitTesting = (CatchingFishGsonUnitTesting) catchingFishFluxAppCompat;
            if (CatchingFishSensorManager.CatchingFishCoroutine().isEmpty() && catchingFishGsonUnitTesting.CatchingFishViewModelScope && !CatchingFishSensorManager.CatchingFishWorkManager()) {
                if (this.CatchingFishSnackbar == null) {
                    this.CatchingFishSnackbar = new ArrayList();
                }
                CatchingFishSensorManager.CatchingFishUnitTesting = this;
                CatchingFishSensorManager.CatchingFishAnimationMockk = true;
                this.CatchingFishSnackbar.add(CatchingFishSensorManager);
                return;
            }
        }
        if (CatchingFishSensorManager.CatchingFishWorkManager() && !CatchingFishSensorManager.CatchingFishViewModelFAB() && !recyclerView.CatchingFishUnitTesting.CatchingFishSnackbar) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.CatchingFishGsonAppCompat());
        }
        CatchingFishSensorManager.CatchingFishUnitTesting = this;
        CatchingFishSensorManager.CatchingFishAnimationMockk = false;
        this.CatchingFishParcelableFAB.add(CatchingFishSensorManager);
    }

    public final void CatchingFishParcelableFAB(CatchingFishPayPalCardView catchingFishPayPalCardView, boolean z) {
        RecyclerView.CatchingFishFragmentHandler(catchingFishPayPalCardView);
        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        RecyclerView recyclerView = this.CatchingFishViewModelFAB;
        CatchingFishFluxEspresso catchingFishFluxEspresso = recyclerView.CatchingFishRetrofitMVI;
        if (catchingFishFluxEspresso != null) {
            CatchingFishBiometricRealm catchingFishBiometricRealm = catchingFishFluxEspresso.CatchingFishDaggerWebsocket;
            CatchingFishFABCameraX.CatchingFishOkHttp(view, catchingFishBiometricRealm != null ? (CatchingFishAndroidX) catchingFishBiometricRealm.CatchingFishDaggerWebsocket.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.CatchingFishStateLiveData;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.CatchingFishRedux != null) {
                recyclerView.CatchingFishLayout.CatchingFishCardViewView(catchingFishPayPalCardView);
            }
        }
        catchingFishPayPalCardView.CatchingFish = null;
        catchingFishPayPalCardView.CatchingFishNavigation = null;
        CatchingFishSpannableMVP CatchingFishCoroutine = CatchingFishCoroutine();
        CatchingFishCoroutine.getClass();
        int i = catchingFishPayPalCardView.CatchingFishWorkManager;
        ArrayList arrayList2 = CatchingFishCoroutine.CatchingFishParcelableFAB(i).CatchingFishParcelableFAB;
        if (((CatchingFishContextHandler) CatchingFishCoroutine.CatchingFishParcelableFAB.get(i)).CatchingFishSnackbar <= arrayList2.size()) {
            return;
        }
        catchingFishPayPalCardView.CatchingFishOkHttp();
        arrayList2.add(catchingFishPayPalCardView);
    }

    public final View CatchingFishReduxKtor(int i) {
        return CatchingFishFragmentHandler(i, Long.MAX_VALUE).CatchingFishParcelableFAB;
    }

    public final int CatchingFishSnackbar(int i) {
        RecyclerView recyclerView = this.CatchingFishViewModelFAB;
        if (i >= 0 && i < recyclerView.CatchingFishRedux.CatchingFishSnackbar()) {
            return !recyclerView.CatchingFishRedux.CatchingFishViewModelScope ? i : recyclerView.CatchingFishViewModelScope.CatchingFishWorkManager(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.CatchingFishRedux.CatchingFishSnackbar() + recyclerView.CatchingFishGsonAppCompat());
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishViewModelFAB(CatchingFishPayPalCardView catchingFishPayPalCardView) {
        boolean z;
        boolean z2;
        boolean CatchingFishLayout = catchingFishPayPalCardView.CatchingFishLayout();
        View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
        boolean z3 = true;
        RecyclerView recyclerView = this.CatchingFishViewModelFAB;
        if (CatchingFishLayout || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(catchingFishPayPalCardView.CatchingFishLayout());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.CatchingFishGsonAppCompat());
            throw new IllegalArgumentException(sb.toString());
        }
        if (catchingFishPayPalCardView.CatchingFishFragmentHandler()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + catchingFishPayPalCardView + recyclerView.CatchingFishGsonAppCompat());
        }
        if (catchingFishPayPalCardView.CatchingFishAnimationMockk()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.CatchingFishGsonAppCompat());
        }
        if ((catchingFishPayPalCardView.CatchingFishFragmentHandler & 16) == 0) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            if (view.hasTransientState()) {
                z = true;
                if (catchingFishPayPalCardView.CatchingFishViewModelScope()) {
                    z3 = false;
                } else {
                    if (this.CatchingFishWorkManager <= 0 || (catchingFishPayPalCardView.CatchingFishFragmentHandler & 526) != 0) {
                        z2 = false;
                    } else {
                        ArrayList arrayList = this.CatchingFishCoroutine;
                        int size = arrayList.size();
                        if (size >= this.CatchingFishWorkManager && size > 0) {
                            CatchingFishWorkManager(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.CatchingFishMVPReduxContext;
                        if (size > 0) {
                            CatchingFishWidgetFAB catchingFishWidgetFAB = recyclerView.CatchingFishNavigationGson;
                            int i = catchingFishPayPalCardView.CatchingFishCoroutine;
                            if (((int[]) catchingFishWidgetFAB.CatchingFishReduxKtor) != null) {
                                int i2 = catchingFishWidgetFAB.CatchingFishCoroutine * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (((int[]) catchingFishWidgetFAB.CatchingFishReduxKtor)[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((CatchingFishPayPalCardView) arrayList.get(i4)).CatchingFishCoroutine;
                                CatchingFishWidgetFAB catchingFishWidgetFAB2 = recyclerView.CatchingFishNavigationGson;
                                if (((int[]) catchingFishWidgetFAB2.CatchingFishReduxKtor) == null) {
                                    break;
                                }
                                int i6 = catchingFishWidgetFAB2.CatchingFishCoroutine * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (((int[]) catchingFishWidgetFAB2.CatchingFishReduxKtor)[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, catchingFishPayPalCardView);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        CatchingFishParcelableFAB(catchingFishPayPalCardView, true);
                    }
                    r2 = z2;
                }
                recyclerView.CatchingFishLayout.CatchingFishCardViewView(catchingFishPayPalCardView);
                if (r2 && !z3 && z) {
                    catchingFishPayPalCardView.CatchingFish = null;
                    catchingFishPayPalCardView.CatchingFishNavigation = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (catchingFishPayPalCardView.CatchingFishViewModelScope()) {
        }
        recyclerView.CatchingFishLayout.CatchingFishCardViewView(catchingFishPayPalCardView);
        if (r2) {
        }
    }

    public final void CatchingFishViewModelScope(View view) {
        CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
        boolean CatchingFishFragmentHandler = CatchingFishSensorManager.CatchingFishFragmentHandler();
        RecyclerView recyclerView = this.CatchingFishViewModelFAB;
        if (CatchingFishFragmentHandler) {
            recyclerView.removeDetachedView(view, false);
        }
        if (CatchingFishSensorManager.CatchingFishLayout()) {
            CatchingFishSensorManager.CatchingFishUnitTesting.CatchingFishCloudMessaging(CatchingFishSensorManager);
        } else if (CatchingFishSensorManager.CatchingFishStateLiveData()) {
            CatchingFishSensorManager.CatchingFishFragmentHandler &= -33;
        }
        CatchingFishViewModelFAB(CatchingFishSensorManager);
        if (recyclerView.CatchingFishCameraXIntent == null || CatchingFishSensorManager.CatchingFishViewModelScope()) {
            return;
        }
        recyclerView.CatchingFishCameraXIntent.CatchingFishReduxKtor(CatchingFishSensorManager);
    }

    public final void CatchingFishWorkManager(int i) {
        ArrayList arrayList = this.CatchingFishCoroutine;
        CatchingFishParcelableFAB((CatchingFishPayPalCardView) arrayList.get(i), true);
        arrayList.remove(i);
    }
}
