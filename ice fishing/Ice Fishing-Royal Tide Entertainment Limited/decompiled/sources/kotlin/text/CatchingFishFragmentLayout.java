package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishFragmentLayout extends CatchingFishGsonGoogleMaps {
    public int CatchingFishCoroutine;
    public CatchingFishPayPalFragment[] CatchingFishParcelableFAB;
    public String CatchingFishSnackbar;

    public CatchingFishFragmentLayout() {
        this.CatchingFishParcelableFAB = null;
        this.CatchingFishCoroutine = 0;
    }

    public CatchingFishPayPalFragment[] getPathData() {
        return this.CatchingFishParcelableFAB;
    }

    public String getPathName() {
        return this.CatchingFishSnackbar;
    }

    public void setPathData(CatchingFishPayPalFragment[] catchingFishPayPalFragmentArr) {
        CatchingFishPayPalFragment[] catchingFishPayPalFragmentArr2 = this.CatchingFishParcelableFAB;
        boolean z = false;
        if (catchingFishPayPalFragmentArr2 != null && catchingFishPayPalFragmentArr != null && catchingFishPayPalFragmentArr2.length == catchingFishPayPalFragmentArr.length) {
            int i = 0;
            while (true) {
                if (i >= catchingFishPayPalFragmentArr2.length) {
                    z = true;
                    break;
                }
                CatchingFishPayPalFragment catchingFishPayPalFragment = catchingFishPayPalFragmentArr2[i];
                char c = catchingFishPayPalFragment.CatchingFishParcelableFAB;
                CatchingFishPayPalFragment catchingFishPayPalFragment2 = catchingFishPayPalFragmentArr[i];
                if (c != catchingFishPayPalFragment2.CatchingFishParcelableFAB || catchingFishPayPalFragment.CatchingFishSnackbar.length != catchingFishPayPalFragment2.CatchingFishSnackbar.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            this.CatchingFishParcelableFAB = CatchingFishKtorViewModel.CatchingFishFragmentHandler(catchingFishPayPalFragmentArr);
            return;
        }
        CatchingFishPayPalFragment[] catchingFishPayPalFragmentArr3 = this.CatchingFishParcelableFAB;
        for (int i2 = 0; i2 < catchingFishPayPalFragmentArr.length; i2++) {
            catchingFishPayPalFragmentArr3[i2].CatchingFishParcelableFAB = catchingFishPayPalFragmentArr[i2].CatchingFishParcelableFAB;
            int i3 = 0;
            while (true) {
                float[] fArr = catchingFishPayPalFragmentArr[i2].CatchingFishSnackbar;
                if (i3 < fArr.length) {
                    catchingFishPayPalFragmentArr3[i2].CatchingFishSnackbar[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public CatchingFishFragmentLayout(CatchingFishFragmentLayout catchingFishFragmentLayout) {
        this.CatchingFishParcelableFAB = null;
        this.CatchingFishCoroutine = 0;
        this.CatchingFishSnackbar = catchingFishFragmentLayout.CatchingFishSnackbar;
        this.CatchingFishParcelableFAB = CatchingFishKtorViewModel.CatchingFishFragmentHandler(catchingFishFragmentLayout.CatchingFishParcelableFAB);
    }
}
