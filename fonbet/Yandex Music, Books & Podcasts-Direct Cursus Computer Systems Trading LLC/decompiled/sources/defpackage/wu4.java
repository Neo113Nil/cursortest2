package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class wu4 implements xu4 {
    public final ArrayList a;
    public final i10 b;

    public wu4(ArrayList arrayList, i10 i10Var) {
        this.a = arrayList;
        this.b = i10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu4)) {
            return false;
        }
        wu4 wu4Var = (wu4) obj;
        return this.a.equals(wu4Var.a) && this.b == wu4Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(entity=" + this.a + ", sortType=" + this.b + ")";
    }
}
