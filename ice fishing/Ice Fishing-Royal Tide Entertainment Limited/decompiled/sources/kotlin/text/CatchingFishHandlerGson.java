package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishHandlerGson implements Comparable {
    public int CatchingFishAnimationMockk;
    public boolean CatchingFishReduxKtor;
    public float CatchingFishViewModelFAB;
    public int CatchingFishDaggerWebsocket = -1;
    public int CatchingFishWorkManager = -1;
    public int CatchingFishViewModelScope = 0;
    public boolean CatchingFishLayout = false;
    public final float[] CatchingFishFragmentHandler = new float[9];
    public final float[] CatchingFishCloudMessaging = new float[9];
    public CatchingFishLayoutExoPlayer[] CatchingFishEspressoTesting = new CatchingFishLayoutExoPlayer[16];
    public int CatchingFishOkHttp = 0;
    public int CatchingFishUnitTesting = 0;

    public CatchingFishHandlerGson(int i) {
        this.CatchingFishAnimationMockk = i;
    }

    public final void CatchingFishCoroutine() {
        this.CatchingFishAnimationMockk = 5;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = -1;
        this.CatchingFishViewModelFAB = 0.0f;
        this.CatchingFishLayout = false;
        int i = this.CatchingFishOkHttp;
        for (int i2 = 0; i2 < i; i2++) {
            this.CatchingFishEspressoTesting[i2] = null;
        }
        this.CatchingFishOkHttp = 0;
        this.CatchingFishUnitTesting = 0;
        this.CatchingFishReduxKtor = false;
        Arrays.fill(this.CatchingFishCloudMessaging, 0.0f);
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer) {
        int i = this.CatchingFishOkHttp;
        for (int i2 = 0; i2 < i; i2++) {
            this.CatchingFishEspressoTesting[i2].CatchingFishLayout(catchingFishHandlerOkHttp, catchingFishLayoutExoPlayer, false);
        }
        this.CatchingFishOkHttp = 0;
    }

    public final void CatchingFishParcelableFAB(CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer) {
        int i = 0;
        while (true) {
            int i2 = this.CatchingFishOkHttp;
            if (i >= i2) {
                CatchingFishLayoutExoPlayer[] catchingFishLayoutExoPlayerArr = this.CatchingFishEspressoTesting;
                if (i2 >= catchingFishLayoutExoPlayerArr.length) {
                    this.CatchingFishEspressoTesting = (CatchingFishLayoutExoPlayer[]) Arrays.copyOf(catchingFishLayoutExoPlayerArr, catchingFishLayoutExoPlayerArr.length * 2);
                }
                CatchingFishLayoutExoPlayer[] catchingFishLayoutExoPlayerArr2 = this.CatchingFishEspressoTesting;
                int i3 = this.CatchingFishOkHttp;
                catchingFishLayoutExoPlayerArr2[i3] = catchingFishLayoutExoPlayer;
                this.CatchingFishOkHttp = i3 + 1;
                return;
            }
            if (this.CatchingFishEspressoTesting[i] == catchingFishLayoutExoPlayer) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void CatchingFishReduxKtor(CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, float f) {
        this.CatchingFishViewModelFAB = f;
        this.CatchingFishLayout = true;
        int i = this.CatchingFishOkHttp;
        this.CatchingFishWorkManager = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.CatchingFishEspressoTesting[i2].CatchingFishViewModelFAB(catchingFishHandlerOkHttp, this, false);
        }
        this.CatchingFishOkHttp = 0;
    }

    public final void CatchingFishSnackbar(CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer) {
        int i = this.CatchingFishOkHttp;
        int i2 = 0;
        while (i2 < i) {
            if (this.CatchingFishEspressoTesting[i2] == catchingFishLayoutExoPlayer) {
                while (i2 < i - 1) {
                    CatchingFishLayoutExoPlayer[] catchingFishLayoutExoPlayerArr = this.CatchingFishEspressoTesting;
                    int i3 = i2 + 1;
                    catchingFishLayoutExoPlayerArr[i2] = catchingFishLayoutExoPlayerArr[i3];
                    i2 = i3;
                }
                this.CatchingFishOkHttp--;
                return;
            }
            i2++;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.CatchingFishDaggerWebsocket - ((CatchingFishHandlerGson) obj).CatchingFishDaggerWebsocket;
    }

    public final String toString() {
        return "" + this.CatchingFishDaggerWebsocket;
    }
}
