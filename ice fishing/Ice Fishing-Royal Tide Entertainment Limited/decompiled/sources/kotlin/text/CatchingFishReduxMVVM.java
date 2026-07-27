package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishReduxMVVM {
    public final long CatchingFishCoroutine;
    public final long CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar;

    public CatchingFishReduxMVVM(long j, long j2, long j3) {
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = j2;
        this.CatchingFishCoroutine = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishReduxMVVM) {
            CatchingFishReduxMVVM catchingFishReduxMVVM = (CatchingFishReduxMVVM) obj;
            if (this.CatchingFishParcelableFAB == catchingFishReduxMVVM.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishReduxMVVM.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishReduxMVVM.CatchingFishCoroutine) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.CatchingFishParcelableFAB;
        long j2 = this.CatchingFishSnackbar;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.CatchingFishCoroutine;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.CatchingFishParcelableFAB + ", elapsedRealtime=" + this.CatchingFishSnackbar + ", uptimeMillis=" + this.CatchingFishCoroutine + "}";
    }
}
