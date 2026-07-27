package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishCameraXToast {
    public boolean[] CatchingFishCloudMessaging;
    public int CatchingFishCoroutine;
    public float[] CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public int[] CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int[] CatchingFishParcelableFAB;
    public int[] CatchingFishReduxKtor;
    public int[] CatchingFishSnackbar;
    public String[] CatchingFishViewModelFAB;
    public int[] CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public final void CatchingFishCoroutine(int i, boolean z) {
        int i2 = this.CatchingFishEspressoTesting;
        int[] iArr = this.CatchingFishFragmentHandler;
        if (i2 >= iArr.length) {
            this.CatchingFishFragmentHandler = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.CatchingFishCloudMessaging;
            this.CatchingFishCloudMessaging = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.CatchingFishFragmentHandler;
        int i3 = this.CatchingFishEspressoTesting;
        iArr2[i3] = i;
        boolean[] zArr2 = this.CatchingFishCloudMessaging;
        this.CatchingFishEspressoTesting = i3 + 1;
        zArr2[i3] = z;
    }

    public final void CatchingFishParcelableFAB(int i, float f) {
        int i2 = this.CatchingFishWorkManager;
        int[] iArr = this.CatchingFishReduxKtor;
        if (i2 >= iArr.length) {
            this.CatchingFishReduxKtor = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.CatchingFishDaggerWebsocket;
            this.CatchingFishDaggerWebsocket = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishWorkManager;
        iArr2[i3] = i;
        float[] fArr2 = this.CatchingFishDaggerWebsocket;
        this.CatchingFishWorkManager = i3 + 1;
        fArr2[i3] = f;
    }

    public final void CatchingFishReduxKtor(String str, int i) {
        int i2 = this.CatchingFishLayout;
        int[] iArr = this.CatchingFishViewModelScope;
        if (i2 >= iArr.length) {
            this.CatchingFishViewModelScope = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.CatchingFishViewModelFAB;
            this.CatchingFishViewModelFAB = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.CatchingFishViewModelScope;
        int i3 = this.CatchingFishLayout;
        iArr2[i3] = i;
        String[] strArr2 = this.CatchingFishViewModelFAB;
        this.CatchingFishLayout = i3 + 1;
        strArr2[i3] = str;
    }

    public final void CatchingFishSnackbar(int i, int i2) {
        int i3 = this.CatchingFishCoroutine;
        int[] iArr = this.CatchingFishParcelableFAB;
        if (i3 >= iArr.length) {
            this.CatchingFishParcelableFAB = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.CatchingFishSnackbar;
            this.CatchingFishSnackbar = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.CatchingFishParcelableFAB;
        int i4 = this.CatchingFishCoroutine;
        iArr3[i4] = i;
        int[] iArr4 = this.CatchingFishSnackbar;
        this.CatchingFishCoroutine = i4 + 1;
        iArr4[i4] = i2;
    }
}
