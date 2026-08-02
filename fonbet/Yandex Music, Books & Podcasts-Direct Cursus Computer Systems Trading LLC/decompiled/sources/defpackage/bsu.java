package defpackage;

/* loaded from: classes4.dex */
public final class bsu {
    public final boolean a;

    public bsu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsu) && this.a == ((bsu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("WaveForTwoSharingBottomSheetUiState(isLinkLoading=", ")", this.a);
    }
}
