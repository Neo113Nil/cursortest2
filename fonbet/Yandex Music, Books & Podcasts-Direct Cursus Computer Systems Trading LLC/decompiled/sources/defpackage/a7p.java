package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a7p extends j7p {
    public final q5i a;
    public final e4p b;
    public final String c;

    public a7p(q5i q5iVar, e4p e4pVar, String str) {
        q5iVar.getClass();
        str.getClass();
        this.a = q5iVar;
        this.b = e4pVar;
        this.c = str;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.b;
    }

    @Override // defpackage.j7p
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7p)) {
            return false;
        }
        a7p a7pVar = (a7p) obj;
        return Intrinsics.d(this.a, a7pVar.a) && this.b == a7pVar.b && Intrinsics.d(this.c, a7pVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Overview(model=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", id=");
        return su4.o(sb, this.c, ")");
    }
}
