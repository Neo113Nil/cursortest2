package kotlin.text;

/* loaded from: classes.dex */
public enum CatchingFishDatabindingMVVM implements CatchingFishBundleAdMob {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int CatchingFishReduxKtor;

    CatchingFishDatabindingMVVM(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // kotlin.text.CatchingFishBundleAdMob
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor;
    }
}
