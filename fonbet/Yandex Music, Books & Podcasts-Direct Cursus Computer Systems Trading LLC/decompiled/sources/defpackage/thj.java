package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class thj {
    public final pkb a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;

    public thj(pkb pkbVar, String str, int i, int i2, String str2) {
        pkbVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = pkbVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thj)) {
            return false;
        }
        thj thjVar = (thj) obj;
        return this.a == thjVar.a && Intrinsics.d(this.b, thjVar.b) && this.c == thjVar.c && this.d == thjVar.d && Intrinsics.d(this.e, thjVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1d.a(this.d, f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectInfo(objectType=");
        sb.append(this.a);
        sb.append(", objectId=");
        sb.append(this.b);
        sb.append(", positionX=");
        hrg.w(this.c, this.d, ", positionY=", ", objectUrl=", sb);
        return su4.o(sb, this.e, ")");
    }
}
