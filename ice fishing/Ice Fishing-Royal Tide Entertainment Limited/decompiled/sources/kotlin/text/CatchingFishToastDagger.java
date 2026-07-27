package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastDagger extends CatchingFishBundleAsyncTask {
    public final Object CatchingFishCoroutine;

    public CatchingFishToastDagger() {
        super(12);
        this.CatchingFishCoroutine = new Object();
    }

    @Override // kotlin.text.CatchingFishBundleAsyncTask
    public final boolean CatchingFishCoroutine(Object obj) {
        boolean CatchingFishCoroutine;
        synchronized (this.CatchingFishCoroutine) {
            CatchingFishCoroutine = super.CatchingFishCoroutine(obj);
        }
        return CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishBundleAsyncTask
    public final Object CatchingFishParcelableFAB() {
        Object CatchingFishParcelableFAB;
        synchronized (this.CatchingFishCoroutine) {
            CatchingFishParcelableFAB = super.CatchingFishParcelableFAB();
        }
        return CatchingFishParcelableFAB;
    }
}
