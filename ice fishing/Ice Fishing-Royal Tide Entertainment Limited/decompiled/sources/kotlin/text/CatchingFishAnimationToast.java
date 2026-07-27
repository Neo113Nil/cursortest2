package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishAnimationToast {
    public CatchingFishDataStorePayPal CatchingFishParcelableFAB;
    public ArrayList CatchingFishSnackbar;

    public static long CatchingFishParcelableFAB(CatchingFishUnitTestingMVI catchingFishUnitTestingMVI, long j) {
        CatchingFishDataStorePayPal catchingFishDataStorePayPal = catchingFishUnitTestingMVI.CatchingFishReduxKtor;
        ArrayList arrayList = catchingFishUnitTestingMVI.CatchingFishCloudMessaging;
        if (catchingFishDataStorePayPal instanceof CatchingFishFluxGson) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            CatchingFishGlideRedux catchingFishGlideRedux = (CatchingFishGlideRedux) arrayList.get(i);
            if (catchingFishGlideRedux instanceof CatchingFishUnitTestingMVI) {
                CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2 = (CatchingFishUnitTestingMVI) catchingFishGlideRedux;
                if (catchingFishUnitTestingMVI2.CatchingFishReduxKtor != catchingFishDataStorePayPal) {
                    j2 = Math.min(j2, CatchingFishParcelableFAB(catchingFishUnitTestingMVI2, catchingFishUnitTestingMVI2.CatchingFishWorkManager + j));
                }
            }
        }
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI3 = catchingFishDataStorePayPal.CatchingFishLayout;
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI4 = catchingFishDataStorePayPal.CatchingFishViewModelFAB;
        if (catchingFishUnitTestingMVI != catchingFishUnitTestingMVI3) {
            return j2;
        }
        long CatchingFishFragmentHandler = j - catchingFishDataStorePayPal.CatchingFishFragmentHandler();
        return Math.min(Math.min(j2, CatchingFishParcelableFAB(catchingFishUnitTestingMVI4, CatchingFishFragmentHandler)), CatchingFishFragmentHandler - catchingFishUnitTestingMVI4.CatchingFishWorkManager);
    }

    public static long CatchingFishSnackbar(CatchingFishUnitTestingMVI catchingFishUnitTestingMVI, long j) {
        CatchingFishDataStorePayPal catchingFishDataStorePayPal = catchingFishUnitTestingMVI.CatchingFishReduxKtor;
        ArrayList arrayList = catchingFishUnitTestingMVI.CatchingFishCloudMessaging;
        if (catchingFishDataStorePayPal instanceof CatchingFishFluxGson) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            CatchingFishGlideRedux catchingFishGlideRedux = (CatchingFishGlideRedux) arrayList.get(i);
            if (catchingFishGlideRedux instanceof CatchingFishUnitTestingMVI) {
                CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2 = (CatchingFishUnitTestingMVI) catchingFishGlideRedux;
                if (catchingFishUnitTestingMVI2.CatchingFishReduxKtor != catchingFishDataStorePayPal) {
                    j2 = Math.max(j2, CatchingFishSnackbar(catchingFishUnitTestingMVI2, catchingFishUnitTestingMVI2.CatchingFishWorkManager + j));
                }
            }
        }
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI3 = catchingFishDataStorePayPal.CatchingFishViewModelFAB;
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI4 = catchingFishDataStorePayPal.CatchingFishLayout;
        if (catchingFishUnitTestingMVI != catchingFishUnitTestingMVI3) {
            return j2;
        }
        long CatchingFishFragmentHandler = catchingFishDataStorePayPal.CatchingFishFragmentHandler() + j;
        return Math.max(Math.max(j2, CatchingFishSnackbar(catchingFishUnitTestingMVI4, CatchingFishFragmentHandler)), CatchingFishFragmentHandler - catchingFishUnitTestingMVI4.CatchingFishWorkManager);
    }
}
