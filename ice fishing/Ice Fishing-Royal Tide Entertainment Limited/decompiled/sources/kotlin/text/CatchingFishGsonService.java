package kotlin.text;

/* loaded from: classes.dex */
public enum CatchingFishGsonService implements CatchingFishBundleAdMob {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int CatchingFishReduxKtor;

    CatchingFishGsonService(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // kotlin.text.CatchingFishBundleAdMob
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor;
    }
}
