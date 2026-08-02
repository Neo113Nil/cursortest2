package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class azk implements czk {
    public final u51 a;
    public final List b;
    public final Function1 c;
    public final k3q d;

    public azk(u51 u51Var, List list, w90 w90Var, k3q k3qVar) {
        u51Var.getClass();
        this.a = u51Var;
        this.b = list;
        this.c = w90Var;
        this.d = k3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azk)) {
            return false;
        }
        azk azkVar = (azk) obj;
        return Intrinsics.d(this.a, azkVar.a) && Intrinsics.d(this.b, azkVar.b) && Intrinsics.d(this.c, azkVar.c) && this.d == azkVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Function1 function1 = this.c;
        return this.d.hashCode() + ((hashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Artist(artist=" + this.a + ", tracks=" + this.b + ", tracksProvider=" + this.c + ", subtype=" + this.d + ")";
    }
}
