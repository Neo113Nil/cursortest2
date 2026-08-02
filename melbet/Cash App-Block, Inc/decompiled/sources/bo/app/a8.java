package bo.app;

/* loaded from: classes3.dex */
public final class a8 {
    public a8() {
        j2.DUST_INITIATED.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        j2 j2Var = j2.SESSION_START;
        return true;
    }

    public final int hashCode() {
        return j2.DUST_INITIATED.hashCode();
    }

    public final String toString() {
        return "FeatureFlagRefreshRequestedEvent(requestInitiatedBy=" + j2.DUST_INITIATED + ")";
    }
}
