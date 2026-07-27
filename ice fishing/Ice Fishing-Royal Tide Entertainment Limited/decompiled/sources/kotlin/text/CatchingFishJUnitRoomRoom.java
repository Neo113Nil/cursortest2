package kotlin.text;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishJUnitRoomRoom implements Runnable {
    public long CatchingFishDaggerWebsocket;
    public ArrayList CatchingFishReduxKtor;
    public ArrayList CatchingFishViewModelScope;
    public long CatchingFishWorkManager;
    public static final ThreadLocal CatchingFishViewModelFAB = new ThreadLocal();
    public static final CatchingFishMVVMCoroutine CatchingFishLayout = new CatchingFishMVVMCoroutine(8);

    public static CatchingFishPayPalCardView CatchingFishCoroutine(RecyclerView recyclerView, int i, long j) {
        int CatchingFishHandler = recyclerView.CatchingFishViewModelFAB.CatchingFishHandler();
        for (int i2 = 0; i2 < CatchingFishHandler; i2++) {
            CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(recyclerView.CatchingFishViewModelFAB.CatchingFishCameraXIntent(i2));
            if (CatchingFishSensorManager.CatchingFishCoroutine == i && !CatchingFishSensorManager.CatchingFishWorkManager()) {
                return null;
            }
        }
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = recyclerView.CatchingFishDaggerWebsocket;
        try {
            recyclerView.CatchingFishMotionLayout();
            CatchingFishPayPalCardView CatchingFishFragmentHandler = catchingFishSnackbarCameraX.CatchingFishFragmentHandler(i, j);
            if (CatchingFishFragmentHandler != null) {
                if (!CatchingFishFragmentHandler.CatchingFishDaggerWebsocket() || CatchingFishFragmentHandler.CatchingFishWorkManager()) {
                    catchingFishSnackbarCameraX.CatchingFishParcelableFAB(CatchingFishFragmentHandler, false);
                } else {
                    catchingFishSnackbarCameraX.CatchingFishViewModelScope(CatchingFishFragmentHandler.CatchingFishParcelableFAB);
                }
            }
            recyclerView.CatchingFishLayoutInflater(false);
            return CatchingFishFragmentHandler;
        } catch (Throwable th) {
            recyclerView.CatchingFishLayoutInflater(false);
            throw th;
        }
    }

    public final void CatchingFishParcelableFAB(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.CatchingFishJetpackCompose && this.CatchingFishDaggerWebsocket == 0) {
            this.CatchingFishDaggerWebsocket = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        CatchingFishWidgetFAB catchingFishWidgetFAB = recyclerView.CatchingFishNavigationGson;
        catchingFishWidgetFAB.CatchingFishParcelableFAB = i;
        catchingFishWidgetFAB.CatchingFishSnackbar = i2;
    }

    public final void CatchingFishSnackbar(long j) {
        CatchingFishIntentHandler catchingFishIntentHandler;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        CatchingFishIntentHandler catchingFishIntentHandler2;
        ArrayList arrayList = this.CatchingFishViewModelScope;
        ArrayList arrayList2 = this.CatchingFishReduxKtor;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            CatchingFishWidgetFAB catchingFishWidgetFAB = recyclerView3.CatchingFishNavigationGson;
            if (windowVisibility == 0) {
                catchingFishWidgetFAB.CatchingFishSnackbar(recyclerView3, false);
                i += catchingFishWidgetFAB.CatchingFishCoroutine;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                CatchingFishWidgetFAB catchingFishWidgetFAB2 = recyclerView4.CatchingFishNavigationGson;
                int abs = Math.abs(catchingFishWidgetFAB2.CatchingFishSnackbar) + Math.abs(catchingFishWidgetFAB2.CatchingFishParcelableFAB);
                for (int i5 = 0; i5 < catchingFishWidgetFAB2.CatchingFishCoroutine * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        catchingFishIntentHandler2 = new CatchingFishIntentHandler();
                        arrayList.add(catchingFishIntentHandler2);
                    } else {
                        catchingFishIntentHandler2 = (CatchingFishIntentHandler) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) catchingFishWidgetFAB2.CatchingFishReduxKtor;
                    int i6 = iArr[i5 + 1];
                    catchingFishIntentHandler2.CatchingFishParcelableFAB = i6 <= abs;
                    catchingFishIntentHandler2.CatchingFishSnackbar = abs;
                    catchingFishIntentHandler2.CatchingFishCoroutine = i6;
                    catchingFishIntentHandler2.CatchingFishReduxKtor = recyclerView4;
                    catchingFishIntentHandler2.CatchingFishDaggerWebsocket = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, CatchingFishLayout);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (catchingFishIntentHandler = (CatchingFishIntentHandler) arrayList.get(i7)).CatchingFishReduxKtor) != null; i7++) {
            CatchingFishPayPalCardView CatchingFishCoroutine = CatchingFishCoroutine(recyclerView, catchingFishIntentHandler.CatchingFishDaggerWebsocket, catchingFishIntentHandler.CatchingFishParcelableFAB ? Long.MAX_VALUE : j);
            if (CatchingFishCoroutine != null && CatchingFishCoroutine.CatchingFishSnackbar != null && CatchingFishCoroutine.CatchingFishDaggerWebsocket() && !CatchingFishCoroutine.CatchingFishWorkManager() && (recyclerView2 = (RecyclerView) CatchingFishCoroutine.CatchingFishSnackbar.get()) != null) {
                if (recyclerView2.CatchingFishMVPRobolectric && recyclerView2.CatchingFishViewModelFAB.CatchingFishHandler() != 0) {
                    CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = recyclerView2.CatchingFishDaggerWebsocket;
                    CatchingFishFluxAppCompat catchingFishFluxAppCompat = recyclerView2.CatchingFishCameraXIntent;
                    if (catchingFishFluxAppCompat != null) {
                        catchingFishFluxAppCompat.CatchingFishDaggerWebsocket();
                    }
                    CatchingFishKtorDataStore catchingFishKtorDataStore = recyclerView2.CatchingFishAnimationMockk;
                    if (catchingFishKtorDataStore != null) {
                        catchingFishKtorDataStore.CatchingFishReduxMoshi(catchingFishSnackbarCameraX);
                        recyclerView2.CatchingFishAnimationMockk.CatchingFishPicasso(catchingFishSnackbarCameraX);
                    }
                    catchingFishSnackbarCameraX.CatchingFishParcelableFAB.clear();
                    catchingFishSnackbarCameraX.CatchingFishDaggerWebsocket();
                }
                CatchingFishWidgetFAB catchingFishWidgetFAB3 = recyclerView2.CatchingFishNavigationGson;
                catchingFishWidgetFAB3.CatchingFishSnackbar(recyclerView2, true);
                if (catchingFishWidgetFAB3.CatchingFishCoroutine != 0) {
                    try {
                        int i8 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                        Trace.beginSection("RV Nested Prefetch");
                        CatchingFishReduxGlide catchingFishReduxGlide = recyclerView2.CatchingFishRedux;
                        CatchingFishToolbarBundle catchingFishToolbarBundle = recyclerView2.CatchingFishUnitTesting;
                        catchingFishReduxGlide.CatchingFishReduxKtor = 1;
                        catchingFishReduxGlide.CatchingFishDaggerWebsocket = catchingFishToolbarBundle.CatchingFishParcelableFAB();
                        catchingFishReduxGlide.CatchingFishViewModelScope = false;
                        catchingFishReduxGlide.CatchingFishViewModelFAB = false;
                        catchingFishReduxGlide.CatchingFishLayout = false;
                        for (int i9 = 0; i9 < catchingFishWidgetFAB3.CatchingFishCoroutine * 2; i9 += 2) {
                            CatchingFishCoroutine(recyclerView2, ((int[]) catchingFishWidgetFAB3.CatchingFishReduxKtor)[i9], j);
                        }
                        Trace.endSection();
                        catchingFishIntentHandler.CatchingFishParcelableFAB = false;
                        catchingFishIntentHandler.CatchingFishSnackbar = 0;
                        catchingFishIntentHandler.CatchingFishCoroutine = 0;
                        catchingFishIntentHandler.CatchingFishReduxKtor = null;
                        catchingFishIntentHandler.CatchingFishDaggerWebsocket = 0;
                    } catch (Throwable th) {
                        int i10 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            catchingFishIntentHandler.CatchingFishParcelableFAB = false;
            catchingFishIntentHandler.CatchingFishSnackbar = 0;
            catchingFishIntentHandler.CatchingFishCoroutine = 0;
            catchingFishIntentHandler.CatchingFishReduxKtor = null;
            catchingFishIntentHandler.CatchingFishDaggerWebsocket = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.CatchingFishReduxKtor;
        try {
            int i = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    CatchingFishSnackbar(TimeUnit.MILLISECONDS.toNanos(j) + this.CatchingFishWorkManager);
                }
            }
            this.CatchingFishDaggerWebsocket = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.CatchingFishDaggerWebsocket = 0L;
            int i3 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
            Trace.endSection();
            throw th;
        }
    }
}
