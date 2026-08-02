package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class phq implements qhq {
    public final ArrayList a;
    public final mwk b;

    public phq(ArrayList arrayList, mwk mwkVar) {
        mwkVar.getClass();
        this.a = arrayList;
        this.b = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phq)) {
            return false;
        }
        phq phqVar = (phq) obj;
        return this.a.equals(phqVar.a) && Intrinsics.d(this.b, phqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Tracks(tracks=" + this.a + ", playable=" + this.b + ")";
    }
}
