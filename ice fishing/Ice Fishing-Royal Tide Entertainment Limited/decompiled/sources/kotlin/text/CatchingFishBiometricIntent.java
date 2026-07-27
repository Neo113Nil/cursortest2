package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishBiometricIntent {
    public final String CatchingFishParcelableFAB;

    public CatchingFishBiometricIntent(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.CatchingFishParcelableFAB = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishBiometricIntent)) {
            return false;
        }
        return this.CatchingFishParcelableFAB.equals(((CatchingFishBiometricIntent) obj).CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() ^ 1000003;
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder("Encoding{name=\""), this.CatchingFishParcelableFAB, "\"}");
    }
}
