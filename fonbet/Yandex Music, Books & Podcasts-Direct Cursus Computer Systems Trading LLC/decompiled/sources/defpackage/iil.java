package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iil implements jil {
    public final kml a;
    public final h5l b;
    public final l9n c;

    public iil(kml kmlVar, h5l h5lVar, l9n l9nVar) {
        h5lVar.getClass();
        l9nVar.getClass();
        this.a = kmlVar;
        this.b = h5lVar;
        this.c = l9nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iil)) {
            return false;
        }
        iil iilVar = (iil) obj;
        return this.a.equals(iilVar.a) && Intrinsics.d(this.b, iilVar.b) && Intrinsics.d(this.c, iilVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Ready(queuePlayablesUiState=" + this.a + ", playbackSkippingControlsUiData=" + this.b + ", queueInfoUiData=" + this.c + ")";
    }
}
