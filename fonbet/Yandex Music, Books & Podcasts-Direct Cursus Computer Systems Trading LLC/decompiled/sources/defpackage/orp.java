package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class orp implements prp {
    public final List a;
    public final mwk b;

    public orp(List list, mwk mwkVar) {
        list.getClass();
        mwkVar.getClass();
        this.a = list;
        this.b = mwkVar;
        list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orp)) {
            return false;
        }
        orp orpVar = (orp) obj;
        return Intrinsics.d(this.a, orpVar.a) && Intrinsics.d(this.b, orpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(buttons=" + this.a + ", playable=" + this.b + ")";
    }
}
