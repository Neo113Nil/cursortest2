package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishLayoutAppCompat {
    public final int CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar;

    public CatchingFishLayoutAppCompat(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishLayoutAppCompat)) {
            return false;
        }
        CatchingFishLayoutAppCompat catchingFishLayoutAppCompat = (CatchingFishLayoutAppCompat) obj;
        return CatchingFishMVPLiveData.CatchingFishReduxKtor(this.CatchingFishParcelableFAB, catchingFishLayoutAppCompat.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishLayoutAppCompat.CatchingFishSnackbar;
    }

    public final int hashCode() {
        int CatchingFishParcelableFlux = (CatchingFishMVPLiveData.CatchingFishParcelableFlux(this.CatchingFishParcelableFAB) ^ 1000003) * 1000003;
        long j = this.CatchingFishSnackbar;
        return CatchingFishParcelableFlux ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.CatchingFishParcelableFAB;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.CatchingFishSnackbar);
        sb.append("}");
        return sb.toString();
    }
}
