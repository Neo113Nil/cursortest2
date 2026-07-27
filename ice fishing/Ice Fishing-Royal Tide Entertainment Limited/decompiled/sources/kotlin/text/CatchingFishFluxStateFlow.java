package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxStateFlow extends CatchingFishCameraXRealm {
    public final int CatchingFishLayout;
    public final int CatchingFishViewModelFAB;

    public CatchingFishFluxStateFlow(byte[] bArr, int i, int i2) {
        super(bArr);
        CatchingFishCameraXRealm.CatchingFishSnackbar(i, i + i2, bArr.length);
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = i2;
    }

    @Override // kotlin.text.CatchingFishCameraXRealm
    public final void CatchingFishDaggerWebsocket(byte[] bArr, int i) {
        System.arraycopy(this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelFAB, bArr, 0, i);
    }

    @Override // kotlin.text.CatchingFishCameraXRealm
    public final byte CatchingFishParcelableFAB(int i) {
        int i2 = this.CatchingFishLayout;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.CatchingFishDaggerWebsocket[this.CatchingFishViewModelFAB + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "Index > length: ", ", "));
    }

    @Override // kotlin.text.CatchingFishCameraXRealm
    public final byte CatchingFishViewModelScope(int i) {
        return this.CatchingFishDaggerWebsocket[this.CatchingFishViewModelFAB + i];
    }

    @Override // kotlin.text.CatchingFishCameraXRealm
    public final int CatchingFishWorkManager() {
        return this.CatchingFishViewModelFAB;
    }

    @Override // kotlin.text.CatchingFishCameraXRealm
    public final int size() {
        return this.CatchingFishLayout;
    }
}
