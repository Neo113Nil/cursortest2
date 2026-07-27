package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishRoomServiceRoom extends CatchingFishLayoutExoPlayer {
    public CatchingFishViewModelIntent CatchingFishLayout;
    public int CatchingFishViewModelFAB;
    public CatchingFishHandlerGson[] CatchingFishViewModelScope;
    public CatchingFishHandlerGson[] CatchingFishWorkManager;

    public final void CatchingFishCloudMessaging(CatchingFishHandlerGson catchingFishHandlerGson) {
        int i = 0;
        while (i < this.CatchingFishViewModelFAB) {
            if (this.CatchingFishWorkManager[i] == catchingFishHandlerGson) {
                while (true) {
                    int i2 = this.CatchingFishViewModelFAB;
                    if (i >= i2 - 1) {
                        this.CatchingFishViewModelFAB = i2 - 1;
                        catchingFishHandlerGson.CatchingFishReduxKtor = false;
                        return;
                    } else {
                        CatchingFishHandlerGson[] catchingFishHandlerGsonArr = this.CatchingFishWorkManager;
                        int i3 = i + 1;
                        catchingFishHandlerGsonArr[i] = catchingFishHandlerGsonArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // kotlin.text.CatchingFishLayoutExoPlayer
    public final boolean CatchingFishDaggerWebsocket() {
        return this.CatchingFishViewModelFAB == 0;
    }

    public final void CatchingFishFragmentHandler(CatchingFishHandlerGson catchingFishHandlerGson) {
        int i;
        int i2 = this.CatchingFishViewModelFAB + 1;
        CatchingFishHandlerGson[] catchingFishHandlerGsonArr = this.CatchingFishWorkManager;
        if (i2 > catchingFishHandlerGsonArr.length) {
            CatchingFishHandlerGson[] catchingFishHandlerGsonArr2 = (CatchingFishHandlerGson[]) Arrays.copyOf(catchingFishHandlerGsonArr, catchingFishHandlerGsonArr.length * 2);
            this.CatchingFishWorkManager = catchingFishHandlerGsonArr2;
            this.CatchingFishViewModelScope = (CatchingFishHandlerGson[]) Arrays.copyOf(catchingFishHandlerGsonArr2, catchingFishHandlerGsonArr2.length * 2);
        }
        CatchingFishHandlerGson[] catchingFishHandlerGsonArr3 = this.CatchingFishWorkManager;
        int i3 = this.CatchingFishViewModelFAB;
        catchingFishHandlerGsonArr3[i3] = catchingFishHandlerGson;
        int i4 = i3 + 1;
        this.CatchingFishViewModelFAB = i4;
        if (i4 > 1 && catchingFishHandlerGsonArr3[i3].CatchingFishDaggerWebsocket > catchingFishHandlerGson.CatchingFishDaggerWebsocket) {
            int i5 = 0;
            while (true) {
                i = this.CatchingFishViewModelFAB;
                if (i5 >= i) {
                    break;
                }
                this.CatchingFishViewModelScope[i5] = this.CatchingFishWorkManager[i5];
                i5++;
            }
            Arrays.sort(this.CatchingFishViewModelScope, 0, i, new CatchingFishMVVMCoroutine(9));
            for (int i6 = 0; i6 < this.CatchingFishViewModelFAB; i6++) {
                this.CatchingFishWorkManager[i6] = this.CatchingFishViewModelScope[i6];
            }
        }
        catchingFishHandlerGson.CatchingFishReduxKtor = true;
        catchingFishHandlerGson.CatchingFishParcelableFAB(this);
    }

    @Override // kotlin.text.CatchingFishLayoutExoPlayer
    public final void CatchingFishLayout(CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer, boolean z) {
        CatchingFishHandlerGson catchingFishHandlerGson = catchingFishLayoutExoPlayer.CatchingFishParcelableFAB;
        if (catchingFishHandlerGson == null) {
            return;
        }
        float[] fArr = catchingFishHandlerGson.CatchingFishCloudMessaging;
        CatchingFishRealmManifest catchingFishRealmManifest = catchingFishLayoutExoPlayer.CatchingFishReduxKtor;
        int CatchingFishReduxKtor = catchingFishRealmManifest.CatchingFishReduxKtor();
        for (int i = 0; i < CatchingFishReduxKtor; i++) {
            CatchingFishHandlerGson CatchingFishDaggerWebsocket = catchingFishRealmManifest.CatchingFishDaggerWebsocket(i);
            float CatchingFishWorkManager = catchingFishRealmManifest.CatchingFishWorkManager(i);
            CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishLayout;
            catchingFishViewModelIntent.CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket;
            if (CatchingFishDaggerWebsocket.CatchingFishReduxKtor) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((CatchingFishHandlerGson) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishCloudMessaging;
                    float f = (fArr[i2] * CatchingFishWorkManager) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((CatchingFishHandlerGson) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishCloudMessaging[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((CatchingFishRoomServiceRoom) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishCloudMessaging((CatchingFishHandlerGson) catchingFishViewModelIntent.CatchingFishDaggerWebsocket);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * CatchingFishWorkManager;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((CatchingFishHandlerGson) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishCloudMessaging[i3] = f3;
                    } else {
                        ((CatchingFishHandlerGson) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishCloudMessaging[i3] = 0.0f;
                    }
                }
                CatchingFishFragmentHandler(CatchingFishDaggerWebsocket);
            }
            this.CatchingFishSnackbar = (catchingFishLayoutExoPlayer.CatchingFishSnackbar * CatchingFishWorkManager) + this.CatchingFishSnackbar;
        }
        CatchingFishCloudMessaging(catchingFishHandlerGson);
    }

    @Override // kotlin.text.CatchingFishLayoutExoPlayer
    public final CatchingFishHandlerGson CatchingFishReduxKtor(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.CatchingFishViewModelFAB; i2++) {
            CatchingFishHandlerGson[] catchingFishHandlerGsonArr = this.CatchingFishWorkManager;
            CatchingFishHandlerGson catchingFishHandlerGson = catchingFishHandlerGsonArr[i2];
            if (!zArr[catchingFishHandlerGson.CatchingFishDaggerWebsocket]) {
                CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishLayout;
                catchingFishViewModelIntent.CatchingFishDaggerWebsocket = catchingFishHandlerGson;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((CatchingFishHandlerGson) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishCloudMessaging[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    CatchingFishHandlerGson catchingFishHandlerGson2 = catchingFishHandlerGsonArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = catchingFishHandlerGson2.CatchingFishCloudMessaging[i3];
                            float f3 = ((CatchingFishHandlerGson) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).CatchingFishCloudMessaging[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.CatchingFishWorkManager[i];
    }

    @Override // kotlin.text.CatchingFishLayoutExoPlayer
    public final String toString() {
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishLayout;
        String str = " goal -> (" + this.CatchingFishSnackbar + ") : ";
        for (int i = 0; i < this.CatchingFishViewModelFAB; i++) {
            catchingFishViewModelIntent.CatchingFishDaggerWebsocket = this.CatchingFishWorkManager[i];
            str = str + catchingFishViewModelIntent + " ";
        }
        return str;
    }
}
