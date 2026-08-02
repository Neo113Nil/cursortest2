package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cxv {
    public final Set a;
    public final b0w b;

    public cxv(Set set, b0w b0wVar) {
        set.getClass();
        this.a = set;
        this.b = b0wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxv)) {
            return false;
        }
        cxv cxvVar = (cxv) obj;
        return Intrinsics.d(this.a, cxvVar.a) && this.b.equals(cxvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WizardLikedArtists(likedArtistIds=" + this.a + ", progress=" + this.b + ")";
    }
}
