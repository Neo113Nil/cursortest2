package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishKtorLayoutRealm {
    public static final Object[] CatchingFishCoroutine;
    public static final float[] CatchingFishParcelableFAB = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile CatchingFishGsonAsyncTask CatchingFishSnackbar = new CatchingFishGsonAsyncTask(0);

    static {
        Object[] objArr = new Object[0];
        CatchingFishCoroutine = objArr;
        synchronized (objArr) {
            CatchingFishSnackbar.CatchingFishReduxKtor((int) 115.0f, new CatchingFishGsonIntentFAB(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            CatchingFishSnackbar.CatchingFishReduxKtor((int) 130.0f, new CatchingFishGsonIntentFAB(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            CatchingFishSnackbar.CatchingFishReduxKtor((int) 150.0f, new CatchingFishGsonIntentFAB(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            CatchingFishSnackbar.CatchingFishReduxKtor((int) 180.0f, new CatchingFishGsonIntentFAB(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            CatchingFishSnackbar.CatchingFishReduxKtor((int) 200.0f, new CatchingFishGsonIntentFAB(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((CatchingFishSnackbar.CatchingFishReduxKtor[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        CatchingFishDaggerService.CatchingFishSnackbar("You should only apply non-linear scaling to font scales > 1");
    }

    public static CatchingFishToolbarOkHttp CatchingFishParcelableFAB(float f) {
        float f2;
        CatchingFishToolbarOkHttp catchingFishToolbarOkHttp;
        float[] fArr = CatchingFishParcelableFAB;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        CatchingFishToolbarOkHttp catchingFishToolbarOkHttp2 = (CatchingFishToolbarOkHttp) CatchingFishSnackbar.CatchingFishCoroutine(i);
        if (catchingFishToolbarOkHttp2 != null) {
            return catchingFishToolbarOkHttp2;
        }
        CatchingFishGsonAsyncTask catchingFishGsonAsyncTask = CatchingFishSnackbar;
        int CatchingFishLayout = CatchingFishAdMobFAB.CatchingFishLayout(catchingFishGsonAsyncTask.CatchingFishWorkManager, i, catchingFishGsonAsyncTask.CatchingFishReduxKtor);
        if (CatchingFishLayout >= 0) {
            return (CatchingFishToolbarOkHttp) CatchingFishSnackbar.CatchingFishDaggerWebsocket(CatchingFishLayout);
        }
        int i2 = -(CatchingFishLayout + 1);
        int i3 = i2 - 1;
        if (i2 >= CatchingFishSnackbar.CatchingFishWorkManager) {
            CatchingFishGsonIntentFAB catchingFishGsonIntentFAB = new CatchingFishGsonIntentFAB(new float[]{1.0f}, new float[]{f});
            CatchingFishSnackbar(f, catchingFishGsonIntentFAB);
            return catchingFishGsonIntentFAB;
        }
        if (i3 < 0) {
            catchingFishToolbarOkHttp = new CatchingFishGsonIntentFAB(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = CatchingFishSnackbar.CatchingFishReduxKtor[i3] / 100.0f;
            catchingFishToolbarOkHttp = (CatchingFishToolbarOkHttp) CatchingFishSnackbar.CatchingFishDaggerWebsocket(i3);
        }
        float f3 = CatchingFishSnackbar.CatchingFishReduxKtor[i2] / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        CatchingFishToolbarOkHttp catchingFishToolbarOkHttp3 = (CatchingFishToolbarOkHttp) CatchingFishSnackbar.CatchingFishDaggerWebsocket(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float CatchingFishParcelableFAB2 = catchingFishToolbarOkHttp.CatchingFishParcelableFAB(f4);
            fArr2[i4] = ((catchingFishToolbarOkHttp3.CatchingFishParcelableFAB(f4) - CatchingFishParcelableFAB2) * max) + CatchingFishParcelableFAB2;
        }
        CatchingFishGsonIntentFAB catchingFishGsonIntentFAB2 = new CatchingFishGsonIntentFAB(fArr, fArr2);
        CatchingFishSnackbar(f, catchingFishGsonIntentFAB2);
        return catchingFishGsonIntentFAB2;
    }

    public static void CatchingFishSnackbar(float f, CatchingFishGsonIntentFAB catchingFishGsonIntentFAB) {
        synchronized (CatchingFishCoroutine) {
            CatchingFishGsonAsyncTask clone = CatchingFishSnackbar.clone();
            clone.CatchingFishReduxKtor((int) (f * 100.0f), catchingFishGsonIntentFAB);
            CatchingFishSnackbar = clone;
        }
    }
}
