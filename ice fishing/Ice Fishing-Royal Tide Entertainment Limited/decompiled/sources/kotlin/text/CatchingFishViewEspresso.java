package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewEspresso {
    public static final CatchingFishViewEspresso CatchingFishWorkManager = new CatchingFishViewEspresso(10485760, 200, 10000, 604800000, 81920);
    public final int CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public final long CatchingFishParcelableFAB;
    public final long CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    public CatchingFishViewEspresso(long j, int i, int i2, long j2, int i3) {
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishReduxKtor = j2;
        this.CatchingFishDaggerWebsocket = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishViewEspresso) {
            CatchingFishViewEspresso catchingFishViewEspresso = (CatchingFishViewEspresso) obj;
            if (this.CatchingFishParcelableFAB == catchingFishViewEspresso.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishViewEspresso.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishViewEspresso.CatchingFishCoroutine && this.CatchingFishReduxKtor == catchingFishViewEspresso.CatchingFishReduxKtor && this.CatchingFishDaggerWebsocket == catchingFishViewEspresso.CatchingFishDaggerWebsocket) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.CatchingFishParcelableFAB;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.CatchingFishSnackbar) * 1000003) ^ this.CatchingFishCoroutine) * 1000003;
        long j2 = this.CatchingFishReduxKtor;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.CatchingFishDaggerWebsocket;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.CatchingFishParcelableFAB + ", loadBatchSize=" + this.CatchingFishSnackbar + ", criticalSectionEnterTimeoutMs=" + this.CatchingFishCoroutine + ", eventCleanUpAge=" + this.CatchingFishReduxKtor + ", maxBlobByteSizePerRow=" + this.CatchingFishDaggerWebsocket + "}";
    }
}
