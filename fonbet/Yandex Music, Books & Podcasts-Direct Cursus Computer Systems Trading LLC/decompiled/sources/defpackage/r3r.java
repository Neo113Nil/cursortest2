package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r3r extends h8c {
    public final tce a;
    public final String b;
    public final bb7 c;

    public r3r(tce tceVar, String str, bb7 bb7Var) {
        this.a = tceVar;
        this.b = str;
        this.c = bb7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3r)) {
            return false;
        }
        r3r r3rVar = (r3r) obj;
        return this.a.equals(r3rVar.a) && Intrinsics.d(this.b, r3rVar.b) && this.c == r3rVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
