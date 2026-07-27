package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerMVVM {
    public final int CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar;

    public CatchingFishExoPlayerMVVM(String str, long j, int i) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = j;
        this.CatchingFishCoroutine = i;
    }

    public static CatchingFishGsonWebSocket CatchingFishParcelableFAB() {
        CatchingFishGsonWebSocket catchingFishGsonWebSocket = new CatchingFishGsonWebSocket(1);
        catchingFishGsonWebSocket.CatchingFishReduxKtor = 0L;
        return catchingFishGsonWebSocket;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishExoPlayerMVVM)) {
            return false;
        }
        CatchingFishExoPlayerMVVM catchingFishExoPlayerMVVM = (CatchingFishExoPlayerMVVM) obj;
        String str = this.CatchingFishParcelableFAB;
        if (str == null) {
            if (catchingFishExoPlayerMVVM.CatchingFishParcelableFAB != null) {
                return false;
            }
        } else if (!str.equals(catchingFishExoPlayerMVVM.CatchingFishParcelableFAB)) {
            return false;
        }
        long j = catchingFishExoPlayerMVVM.CatchingFishSnackbar;
        int i = catchingFishExoPlayerMVVM.CatchingFishCoroutine;
        if (this.CatchingFishSnackbar != j) {
            return false;
        }
        int i2 = this.CatchingFishCoroutine;
        return i2 == 0 ? i == 0 : CatchingFishMVPLiveData.CatchingFishReduxKtor(i2, i);
    }

    public final int hashCode() {
        String str = this.CatchingFishParcelableFAB;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.CatchingFishSnackbar;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.CatchingFishCoroutine;
        return (i2 != 0 ? CatchingFishMVPLiveData.CatchingFishParcelableFlux(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", responseCode=");
        int i = this.CatchingFishCoroutine;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
