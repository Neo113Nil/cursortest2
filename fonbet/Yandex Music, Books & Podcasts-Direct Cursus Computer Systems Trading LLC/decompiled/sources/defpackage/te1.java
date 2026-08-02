package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class te1 {
    public final List a;
    public final eul b;
    public final p43 c;

    public te1(List list, eul eulVar, p43 p43Var) {
        list.getClass();
        this.a = list;
        this.b = eulVar;
        this.c = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te1)) {
            return false;
        }
        te1 te1Var = (te1) obj;
        return Intrinsics.d(this.a, te1Var.a) && this.b.equals(te1Var.b) && Intrinsics.d(this.c, te1Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        p43 p43Var = this.c;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "ArtistPickBlockData(artists=" + this.a + ", playlist=" + this.b + ", analytics=" + this.c + ")";
    }
}
