package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bn1 implements cn1 {
    public final List a;
    public final mwk b;

    public bn1(List list, mwk mwkVar) {
        list.getClass();
        this.a = list;
        this.b = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn1)) {
            return false;
        }
        bn1 bn1Var = (bn1) obj;
        return Intrinsics.d(this.a, bn1Var.a) && this.b.equals(bn1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(artists=" + this.a + ", playable=" + this.b + ")";
    }
}
