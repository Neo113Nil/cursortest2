package kotlin.text;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishLayoutMockk {
    public final CatchingFishPayPalService CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishLayoutMockk(CatchingFishPayPalService catchingFishPayPalService) {
        this.CatchingFishParcelableFAB = catchingFishPayPalService;
    }

    public static final Object CatchingFishParcelableFAB(CatchingFishPayPalService catchingFishPayPalService) {
        Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(null);
        if (CatchingFishViewModelScope == null) {
            return null;
        }
        if (!(CatchingFishViewModelScope instanceof CatchingFishBundleGradle)) {
            catchingFishPayPalService.CatchingFishCloudMessaging(null);
            return CatchingFishViewModelScope;
        }
        CatchingFishBundleGradle catchingFishBundleGradle = (CatchingFishBundleGradle) CatchingFishViewModelScope;
        if (catchingFishBundleGradle.CatchingFishViewModelScope()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = catchingFishBundleGradle.CatchingFishSnackbar - 1;
        Object CatchingFishDaggerWebsocket = catchingFishBundleGradle.CatchingFishDaggerWebsocket(i);
        catchingFishBundleGradle.CatchingFishFragmentHandler(i);
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishDaggerWebsocket, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (catchingFishBundleGradle.CatchingFishViewModelScope()) {
            catchingFishPayPalService.CatchingFishCloudMessaging(null);
        }
        if (catchingFishBundleGradle.CatchingFishSnackbar == 1) {
            catchingFishPayPalService.CatchingFishOkHttp(null, catchingFishBundleGradle.CatchingFishReduxKtor());
        }
        return CatchingFishDaggerWebsocket;
    }

    public static final CatchingFishBundleGradle CatchingFishSnackbar(CatchingFishPayPalService catchingFishPayPalService) {
        if (catchingFishPayPalService.CatchingFishLayout()) {
            CatchingFishBundleGradle catchingFishBundleGradle = CatchingFishHandlerLayout.CatchingFishSnackbar;
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishBundleGradle, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return catchingFishBundleGradle;
        }
        CatchingFishBundleGradle catchingFishBundleGradle2 = new CatchingFishBundleGradle();
        Object[] objArr = catchingFishPayPalService.CatchingFishCoroutine;
        long[] jArr = catchingFishPayPalService.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof CatchingFishBundleGradle) {
                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                CatchingFishBundleGradle catchingFishBundleGradle3 = (CatchingFishBundleGradle) obj;
                                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishBundleGradle3, "elements");
                                if (!catchingFishBundleGradle3.CatchingFishViewModelScope()) {
                                    int i4 = catchingFishBundleGradle2.CatchingFishSnackbar + catchingFishBundleGradle3.CatchingFishSnackbar;
                                    Object[] objArr2 = catchingFishBundleGradle2.CatchingFishParcelableFAB;
                                    if (objArr2.length < i4) {
                                        catchingFishBundleGradle2.CatchingFishEspressoTesting(i4, objArr2);
                                    }
                                    CatchingFishMVVMHilt.CatchingFishAppCompat(catchingFishBundleGradle3.CatchingFishParcelableFAB, catchingFishBundleGradle2.CatchingFishParcelableFAB, catchingFishBundleGradle2.CatchingFishSnackbar, 0, catchingFishBundleGradle3.CatchingFishSnackbar);
                                    catchingFishBundleGradle2.CatchingFishSnackbar += catchingFishBundleGradle3.CatchingFishSnackbar;
                                }
                            } else {
                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                catchingFishBundleGradle2.CatchingFishParcelableFAB(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return catchingFishBundleGradle2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishLayoutMockk) {
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, ((CatchingFishLayoutMockk) obj).CatchingFishParcelableFAB);
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.CatchingFishParcelableFAB + ')';
    }
}
