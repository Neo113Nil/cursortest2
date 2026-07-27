package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastCameraX {
    public final int CatchingFishCoroutine;
    public final Object CatchingFishDaggerWebsocket;
    public final CatchingFishWebsocketMoshi CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final CatchingFishFragmentToolbar CatchingFishSnackbar;

    public CatchingFishToastCameraX(CatchingFishWebsocketMoshi catchingFishWebsocketMoshi, CatchingFishFragmentToolbar catchingFishFragmentToolbar, int i, int i2, Object obj) {
        this.CatchingFishParcelableFAB = catchingFishWebsocketMoshi;
        this.CatchingFishSnackbar = catchingFishFragmentToolbar;
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishDaggerWebsocket = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishToastCameraX)) {
            return false;
        }
        CatchingFishToastCameraX catchingFishToastCameraX = (CatchingFishToastCameraX) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishToastCameraX.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishToastCameraX.CatchingFishSnackbar) && this.CatchingFishCoroutine == catchingFishToastCameraX.CatchingFishCoroutine && this.CatchingFishReduxKtor == catchingFishToastCameraX.CatchingFishReduxKtor && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishToastCameraX.CatchingFishDaggerWebsocket);
    }

    public final int hashCode() {
        CatchingFishWebsocketMoshi catchingFishWebsocketMoshi = this.CatchingFishParcelableFAB;
        int CatchingFishViewModelScope = CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishReduxKtor, CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishCoroutine, (((catchingFishWebsocketMoshi == null ? 0 : catchingFishWebsocketMoshi.hashCode()) * 31) + this.CatchingFishSnackbar.CatchingFishReduxKtor) * 31, 31), 31);
        Object obj = this.CatchingFishDaggerWebsocket;
        return CatchingFishViewModelScope + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", fontWeight=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.CatchingFishCoroutine;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.CatchingFishReduxKtor;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append(')');
        return sb.toString();
    }
}
