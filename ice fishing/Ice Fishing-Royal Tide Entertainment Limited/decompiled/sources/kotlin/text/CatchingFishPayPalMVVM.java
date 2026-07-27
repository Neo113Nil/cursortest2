package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishPayPalMVVM extends CatchingFishCameraXContext {
    public final long CatchingFishDaggerWebsocket;
    public final CatchingFishWidgetWebSocket CatchingFishReduxKtor;
    public float CatchingFishViewModelFAB;
    public final long CatchingFishViewModelScope;
    public final int CatchingFishWorkManager = 1;

    public CatchingFishPayPalMVVM(CatchingFishWidgetWebSocket catchingFishWidgetWebSocket) {
        int i;
        int i2;
        long width = (catchingFishWidgetWebSocket.CatchingFishParcelableFAB.getWidth() << 32) | (catchingFishWidgetWebSocket.CatchingFishParcelableFAB.getHeight() & 4294967295L);
        this.CatchingFishReduxKtor = catchingFishWidgetWebSocket;
        this.CatchingFishDaggerWebsocket = width;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (width >> 32)) < 0 || (i2 = (int) (width & 4294967295L)) < 0 || i > catchingFishWidgetWebSocket.CatchingFishParcelableFAB.getWidth() || i2 > catchingFishWidgetWebSocket.CatchingFishParcelableFAB.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.CatchingFishViewModelScope = width;
        this.CatchingFishViewModelFAB = 1.0f;
    }

    @Override // kotlin.text.CatchingFishCameraXContext
    public final long CatchingFishCoroutine() {
        return CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(this.CatchingFishViewModelScope);
    }

    @Override // kotlin.text.CatchingFishCameraXContext
    public final void CatchingFishParcelableFAB(float f) {
        this.CatchingFishViewModelFAB = f;
    }

    @Override // kotlin.text.CatchingFishCameraXContext
    public final void CatchingFishReduxKtor(CatchingFishDaggerHiltJUnit catchingFishDaggerHiltJUnit) {
        CatchingFishPicassoManifest.CatchingFish(catchingFishDaggerHiltJUnit, this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, (Math.round(Float.intBitsToFloat((int) (r1.CatchingFishNavigation() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (catchingFishDaggerHiltJUnit.CatchingFishReduxKtor.CatchingFishNavigation() >> 32))) << 32), this.CatchingFishViewModelFAB, null, this.CatchingFishWorkManager, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishPayPalMVVM)) {
            return false;
        }
        CatchingFishPayPalMVVM catchingFishPayPalMVVM = (CatchingFishPayPalMVVM) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishPayPalMVVM.CatchingFishReduxKtor) && CatchingFishFirebaseDagger.CatchingFishCardViewView(0L, 0L) && CatchingFishRobolectricHilt.CatchingFish(this.CatchingFishDaggerWebsocket, catchingFishPayPalMVVM.CatchingFishDaggerWebsocket) && this.CatchingFishWorkManager == catchingFishPayPalMVVM.CatchingFishWorkManager;
    }

    public final int hashCode() {
        return Integer.hashCode(this.CatchingFishWorkManager) + CatchingFishMVPLiveData.CatchingFishViewModelFAB(CatchingFishMVPLiveData.CatchingFishViewModelFAB(this.CatchingFishReduxKtor.hashCode() * 31, 31, 0L), 31, this.CatchingFishDaggerWebsocket);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", srcOffset=");
        sb.append((Object) CatchingFishFirebaseDagger.CatchingFishJUnitRealm(0L));
        sb.append(", srcSize=");
        sb.append((Object) CatchingFishRobolectricHilt.CatchingFishStateFlow(this.CatchingFishDaggerWebsocket));
        sb.append(", filterQuality=");
        int i = this.CatchingFishWorkManager;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
