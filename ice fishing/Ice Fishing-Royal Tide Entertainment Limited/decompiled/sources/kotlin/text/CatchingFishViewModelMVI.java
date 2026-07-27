package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewModelMVI {
    public final long CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar;

    public CatchingFishViewModelMVI(String str, long j, long j2) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = j;
        this.CatchingFishCoroutine = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishViewModelMVI) {
            CatchingFishViewModelMVI catchingFishViewModelMVI = (CatchingFishViewModelMVI) obj;
            if (this.CatchingFishParcelableFAB.equals(catchingFishViewModelMVI.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishViewModelMVI.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishViewModelMVI.CatchingFishCoroutine) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003;
        long j = this.CatchingFishSnackbar;
        long j2 = this.CatchingFishCoroutine;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.CatchingFishParcelableFAB + ", tokenExpirationTimestamp=" + this.CatchingFishSnackbar + ", tokenCreationTimestamp=" + this.CatchingFishCoroutine + "}";
    }
}
