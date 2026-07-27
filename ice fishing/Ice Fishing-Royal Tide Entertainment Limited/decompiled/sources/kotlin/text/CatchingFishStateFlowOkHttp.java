package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishStateFlowOkHttp extends CatchingFishLiveDataGson {
    public final Throwable CatchingFishParcelableFAB;

    public CatchingFishStateFlowOkHttp(Throwable th) {
        this.CatchingFishParcelableFAB = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishStateFlowOkHttp) {
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, ((CatchingFishStateFlowOkHttp) obj).CatchingFishParcelableFAB);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.CatchingFishParcelableFAB;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // kotlin.text.CatchingFishLiveDataGson
    public final String toString() {
        return "Closed(" + this.CatchingFishParcelableFAB + ')';
    }
}
