package defpackage;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zyk implements czk {
    public final oq a;
    public final List b;
    public final i3q c;

    public zyk(oq oqVar, LinkedList linkedList, i3q i3qVar) {
        oqVar.getClass();
        linkedList.getClass();
        this.a = oqVar;
        this.b = linkedList;
        this.c = i3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyk)) {
            return false;
        }
        zyk zykVar = (zyk) obj;
        return Intrinsics.d(this.a, zykVar.a) && Intrinsics.d(this.b, zykVar.b) && this.c == zykVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Album(album=" + this.a + ", tracks=" + this.b + ", subtype=" + this.c + ")";
    }
}
