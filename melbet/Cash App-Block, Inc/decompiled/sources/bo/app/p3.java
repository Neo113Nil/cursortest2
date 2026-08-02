package bo.app;

/* loaded from: classes3.dex */
public final class p3 {
    public p3() {
        j2.DUST_INITIATED.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        j2 j2Var = j2.SESSION_START;
        return true;
    }

    public final int hashCode() {
        return j2.DUST_INITIATED.hashCode();
    }

    public final String toString() {
        return "ContentCardRefreshRequestedEvent(requestInitiatedBy=" + j2.DUST_INITIATED + ")";
    }
}
