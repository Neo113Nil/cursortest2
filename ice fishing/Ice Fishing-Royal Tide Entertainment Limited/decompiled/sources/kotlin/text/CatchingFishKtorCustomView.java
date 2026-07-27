package kotlin.text;

/* loaded from: classes.dex */
public class CatchingFishKtorCustomView {
    public final CatchingFishFABToast CatchingFishParcelableFAB = new CatchingFishFABToast(new CatchingFishGradleBundle[16]);
    public final CatchingFishBundleGradle CatchingFishSnackbar = new CatchingFishBundleGradle(10);

    public boolean CatchingFishParcelableFAB(CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux, CatchingFishMockkCoroutine catchingFishMockkCoroutine, CatchingFishGlideFAB catchingFishGlideFAB, boolean z) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishParcelableFAB;
        Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
        int i = catchingFishFABToast.CatchingFishWorkManager;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((CatchingFishGradleBundle) objArr[i2]).CatchingFishParcelableFAB(catchingFishLayoutMVVMFlux, catchingFishMockkCoroutine, catchingFishGlideFAB, z) || z2;
        }
        return z2;
    }

    public void CatchingFishSnackbar(CatchingFishGlideFAB catchingFishGlideFAB) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishParcelableFAB;
        int i = catchingFishFABToast.CatchingFishWorkManager;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((CatchingFishGradleBundle) catchingFishFABToast.CatchingFishReduxKtor[i]).CatchingFishReduxKtor.CatchingFishReduxKtor == 0) {
                catchingFishFABToast.CatchingFishFragmentHandler(i);
            }
        }
    }
}
