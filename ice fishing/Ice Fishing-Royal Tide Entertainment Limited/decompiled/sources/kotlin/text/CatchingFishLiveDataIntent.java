package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataIntent {
    public final String CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final CatchingFishExoPlayerMVVM CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;

    public CatchingFishLiveDataIntent(String str, String str2, String str3, CatchingFishExoPlayerMVVM catchingFishExoPlayerMVVM, int i) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = str2;
        this.CatchingFishCoroutine = str3;
        this.CatchingFishReduxKtor = catchingFishExoPlayerMVVM;
        this.CatchingFishDaggerWebsocket = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishLiveDataIntent)) {
            return false;
        }
        CatchingFishLiveDataIntent catchingFishLiveDataIntent = (CatchingFishLiveDataIntent) obj;
        String str = this.CatchingFishParcelableFAB;
        if (str == null) {
            if (catchingFishLiveDataIntent.CatchingFishParcelableFAB != null) {
                return false;
            }
        } else if (!str.equals(catchingFishLiveDataIntent.CatchingFishParcelableFAB)) {
            return false;
        }
        String str2 = this.CatchingFishSnackbar;
        if (str2 == null) {
            if (catchingFishLiveDataIntent.CatchingFishSnackbar != null) {
                return false;
            }
        } else if (!str2.equals(catchingFishLiveDataIntent.CatchingFishSnackbar)) {
            return false;
        }
        String str3 = this.CatchingFishCoroutine;
        if (str3 == null) {
            if (catchingFishLiveDataIntent.CatchingFishCoroutine != null) {
                return false;
            }
        } else if (!str3.equals(catchingFishLiveDataIntent.CatchingFishCoroutine)) {
            return false;
        }
        CatchingFishExoPlayerMVVM catchingFishExoPlayerMVVM = this.CatchingFishReduxKtor;
        if (catchingFishExoPlayerMVVM == null) {
            if (catchingFishLiveDataIntent.CatchingFishReduxKtor != null) {
                return false;
            }
        } else if (!catchingFishExoPlayerMVVM.equals(catchingFishLiveDataIntent.CatchingFishReduxKtor)) {
            return false;
        }
        int i = this.CatchingFishDaggerWebsocket;
        return i == 0 ? catchingFishLiveDataIntent.CatchingFishDaggerWebsocket == 0 : CatchingFishMVPLiveData.CatchingFishReduxKtor(i, catchingFishLiveDataIntent.CatchingFishDaggerWebsocket);
    }

    public final int hashCode() {
        String str = this.CatchingFishParcelableFAB;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.CatchingFishSnackbar;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.CatchingFishCoroutine;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        CatchingFishExoPlayerMVVM catchingFishExoPlayerMVVM = this.CatchingFishReduxKtor;
        int hashCode4 = (hashCode3 ^ (catchingFishExoPlayerMVVM == null ? 0 : catchingFishExoPlayerMVVM.hashCode())) * 1000003;
        int i = this.CatchingFishDaggerWebsocket;
        return (i != 0 ? CatchingFishMVPLiveData.CatchingFishParcelableFlux(i) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", fid=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", refreshToken=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", authToken=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", responseCode=");
        int i = this.CatchingFishDaggerWebsocket;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
