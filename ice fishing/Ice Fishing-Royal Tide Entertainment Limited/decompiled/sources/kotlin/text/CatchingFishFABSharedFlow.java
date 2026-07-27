package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFABSharedFlow {
    public final Integer CatchingFishParcelableFAB;

    public CatchingFishFABSharedFlow(Integer num) {
        this.CatchingFishParcelableFAB = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishFABSharedFlow)) {
            return false;
        }
        CatchingFishFABSharedFlow catchingFishFABSharedFlow = (CatchingFishFABSharedFlow) obj;
        Integer num = this.CatchingFishParcelableFAB;
        return num == null ? catchingFishFABSharedFlow.CatchingFishParcelableFAB == null : num.equals(catchingFishFABSharedFlow.CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        Integer num = this.CatchingFishParcelableFAB;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.CatchingFishParcelableFAB + "}";
    }
}
