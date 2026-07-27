package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAnimationDagger implements CatchingFishPayPalView {
    public final CatchingFishAsyncTaskIntent CatchingFishParcelableFAB;

    public CatchingFishAnimationDagger(CatchingFishAsyncTaskIntent catchingFishAsyncTaskIntent) {
        this.CatchingFishParcelableFAB = catchingFishAsyncTaskIntent;
    }

    @Override // kotlin.text.CatchingFishPayPalView
    public final Object CatchingFishParcelableFAB(CatchingFishKtorNavigation catchingFishKtorNavigation) {
        return this.CatchingFishParcelableFAB.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishAnimationDagger) && this.CatchingFishParcelableFAB.equals(((CatchingFishAnimationDagger) obj).CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.CatchingFishParcelableFAB + ')';
    }
}
