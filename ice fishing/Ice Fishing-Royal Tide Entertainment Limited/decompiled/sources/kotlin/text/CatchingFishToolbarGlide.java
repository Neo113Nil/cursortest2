package kotlin.text;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishToolbarGlide {
    public static int CatchingFishWorkManager;
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public ArrayList CatchingFishParcelableFAB;
    public ArrayList CatchingFishReduxKtor;
    public int CatchingFishSnackbar;

    public final void CatchingFishCoroutine(int i, CatchingFishToolbarGlide catchingFishToolbarGlide) {
        ArrayList arrayList = this.CatchingFishParcelableFAB;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = (CatchingFishDaggerRetrofit) obj;
            ArrayList arrayList2 = catchingFishToolbarGlide.CatchingFishParcelableFAB;
            if (!arrayList2.contains(catchingFishDaggerRetrofit)) {
                arrayList2.add(catchingFishDaggerRetrofit);
            }
            int i3 = catchingFishToolbarGlide.CatchingFishSnackbar;
            if (i == 0) {
                catchingFishDaggerRetrofit.CatchingFishView = i3;
            } else {
                catchingFishDaggerRetrofit.CatchingFishServiceMVIJUnit = i3;
            }
        }
        this.CatchingFishDaggerWebsocket = catchingFishToolbarGlide.CatchingFishSnackbar;
    }

    public final void CatchingFishParcelableFAB(ArrayList arrayList) {
        int size = this.CatchingFishParcelableFAB.size();
        if (this.CatchingFishDaggerWebsocket != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                CatchingFishToolbarGlide catchingFishToolbarGlide = (CatchingFishToolbarGlide) arrayList.get(i);
                if (this.CatchingFishDaggerWebsocket == catchingFishToolbarGlide.CatchingFishSnackbar) {
                    CatchingFishCoroutine(this.CatchingFishCoroutine, catchingFishToolbarGlide);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int CatchingFishSnackbar(CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, int i) {
        int CatchingFishUnitTesting;
        int CatchingFishUnitTesting2;
        ArrayList arrayList = this.CatchingFishParcelableFAB;
        if (arrayList.size() == 0) {
            return 0;
        }
        CatchingFishGsonAppCompat catchingFishGsonAppCompat = (CatchingFishGsonAppCompat) ((CatchingFishDaggerRetrofit) arrayList.get(0)).CatchingFishAppCompat;
        catchingFishHandlerOkHttp.CatchingFishJetpackCompose();
        catchingFishGsonAppCompat.CatchingFishSnackbar(catchingFishHandlerOkHttp, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((CatchingFishDaggerRetrofit) arrayList.get(i2)).CatchingFishSnackbar(catchingFishHandlerOkHttp, false);
        }
        if (i == 0 && catchingFishGsonAppCompat.CatchingFishPayPalHandler > 0) {
            CatchingFishFirebaseDagger.CatchingFishEspressoTesting(catchingFishGsonAppCompat, catchingFishHandlerOkHttp, arrayList, 0);
        }
        if (i == 1 && catchingFishGsonAppCompat.CatchingFishSharedFlow > 0) {
            CatchingFishFirebaseDagger.CatchingFishEspressoTesting(catchingFishGsonAppCompat, catchingFishHandlerOkHttp, arrayList, 1);
        }
        try {
            catchingFishHandlerOkHttp.CatchingFishStateLiveData();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.CatchingFishReduxKtor = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = (CatchingFishDaggerRetrofit) arrayList.get(i3);
            CatchingFishMockkViewRoom catchingFishMockkViewRoom = new CatchingFishMockkViewRoom();
            new WeakReference(catchingFishDaggerRetrofit);
            CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishDaggerRetrofit.CatchingFishSensorManager);
            CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishDaggerRetrofit.CatchingFishEspressoMockk);
            CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishDaggerRetrofit.CatchingFishDagger);
            CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishDaggerRetrofit.CatchingFishCameraXIntent);
            CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishDaggerRetrofit.CatchingFishHandler);
            this.CatchingFishReduxKtor.add(catchingFishMockkViewRoom);
        }
        if (i == 0) {
            CatchingFishUnitTesting = CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishGsonAppCompat.CatchingFishSensorManager);
            CatchingFishUnitTesting2 = CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishGsonAppCompat.CatchingFishDagger);
            catchingFishHandlerOkHttp.CatchingFishJetpackCompose();
        } else {
            CatchingFishUnitTesting = CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishGsonAppCompat.CatchingFishEspressoMockk);
            CatchingFishUnitTesting2 = CatchingFishHandlerOkHttp.CatchingFishUnitTesting(catchingFishGsonAppCompat.CatchingFishCameraXIntent);
            catchingFishHandlerOkHttp.CatchingFishJetpackCompose();
        }
        return CatchingFishUnitTesting2 - CatchingFishUnitTesting;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.CatchingFishCoroutine;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.CatchingFishSnackbar);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.CatchingFishParcelableFAB;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            sb2 = sb2 + " " + ((CatchingFishDaggerRetrofit) obj).CatchingFishReduxMoshi;
        }
        return CatchingFishMVPLiveData.CatchingFishEspressoTesting(sb2, " >");
    }
}
