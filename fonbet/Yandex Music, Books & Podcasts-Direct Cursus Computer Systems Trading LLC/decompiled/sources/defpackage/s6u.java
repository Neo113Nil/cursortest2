package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s6u implements t6u {
    public final List a;
    public final wmn b;

    public s6u(List list, wmn wmnVar) {
        list.getClass();
        wmnVar.getClass();
        this.a = list;
        this.b = wmnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6u)) {
            return false;
        }
        s6u s6uVar = (s6u) obj;
        return Intrinsics.d(this.a, s6uVar.a) && this.b == s6uVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithIds(ids=" + this.a + ", recommendationType=" + this.b + ")";
    }
}
