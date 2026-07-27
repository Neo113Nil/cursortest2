package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVIServiceFlux {
    public final float CatchingFishCoroutine;
    public final long CatchingFishDaggerWebsocket;
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishSnackbar;
    public final long CatchingFishViewModelFAB;
    public final long CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;

    static {
        CatchingFishToastHiltBundle.CatchingFishDaggerWebsocket(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public CatchingFishMVIServiceFlux(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = f2;
        this.CatchingFishCoroutine = f3;
        this.CatchingFishReduxKtor = f4;
        this.CatchingFishDaggerWebsocket = j;
        this.CatchingFishWorkManager = j2;
        this.CatchingFishViewModelScope = j3;
        this.CatchingFishViewModelFAB = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishMVIServiceFlux)) {
            return false;
        }
        CatchingFishMVIServiceFlux catchingFishMVIServiceFlux = (CatchingFishMVIServiceFlux) obj;
        return Float.compare(this.CatchingFishParcelableFAB, catchingFishMVIServiceFlux.CatchingFishParcelableFAB) == 0 && Float.compare(this.CatchingFishSnackbar, catchingFishMVIServiceFlux.CatchingFishSnackbar) == 0 && Float.compare(this.CatchingFishCoroutine, catchingFishMVIServiceFlux.CatchingFishCoroutine) == 0 && Float.compare(this.CatchingFishReduxKtor, catchingFishMVIServiceFlux.CatchingFishReduxKtor) == 0 && CatchingFishGsonCardView.CatchingFishRoomDatabase(this.CatchingFishDaggerWebsocket, catchingFishMVIServiceFlux.CatchingFishDaggerWebsocket) && CatchingFishGsonCardView.CatchingFishRoomDatabase(this.CatchingFishWorkManager, catchingFishMVIServiceFlux.CatchingFishWorkManager) && CatchingFishGsonCardView.CatchingFishRoomDatabase(this.CatchingFishViewModelScope, catchingFishMVIServiceFlux.CatchingFishViewModelScope) && CatchingFishGsonCardView.CatchingFishRoomDatabase(this.CatchingFishViewModelFAB, catchingFishMVIServiceFlux.CatchingFishViewModelFAB);
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishViewModelFAB) + CatchingFishMVPLiveData.CatchingFishViewModelFAB(CatchingFishMVPLiveData.CatchingFishViewModelFAB(CatchingFishMVPLiveData.CatchingFishViewModelFAB(CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishReduxKtor, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishCoroutine, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishSnackbar, Float.hashCode(this.CatchingFishParcelableFAB) * 31, 31), 31), 31), 31, this.CatchingFishDaggerWebsocket), 31, this.CatchingFishWorkManager), 31, this.CatchingFishViewModelScope);
    }

    public final String toString() {
        String str = CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishParcelableFAB) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishSnackbar) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishCoroutine) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(this.CatchingFishReduxKtor);
        long j = this.CatchingFishDaggerWebsocket;
        long j2 = this.CatchingFishWorkManager;
        boolean CatchingFishRoomDatabase = CatchingFishGsonCardView.CatchingFishRoomDatabase(j, j2);
        long j3 = this.CatchingFishViewModelScope;
        long j4 = this.CatchingFishViewModelFAB;
        if (!CatchingFishRoomDatabase || !CatchingFishGsonCardView.CatchingFishRoomDatabase(j2, j3) || !CatchingFishGsonCardView.CatchingFishRoomDatabase(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CatchingFishGsonCardView.CatchingFishDagger(j)) + ", topRight=" + ((Object) CatchingFishGsonCardView.CatchingFishDagger(j2)) + ", bottomRight=" + ((Object) CatchingFishGsonCardView.CatchingFishDagger(j3)) + ", bottomLeft=" + ((Object) CatchingFishGsonCardView.CatchingFishDagger(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat(i)) + ", y=" + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat(i2)) + ')';
    }
}
