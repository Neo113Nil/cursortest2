package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c7p extends j7p {
    public final az2 a;
    public final int b;
    public final lt c;
    public final e4p d;
    public final String e;

    public c7p(az2 az2Var, int i, lt ltVar, e4p e4pVar, String str) {
        ltVar.getClass();
        str.getClass();
        this.a = az2Var;
        this.b = i;
        this.c = ltVar;
        this.d = e4pVar;
        this.e = str;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.d;
    }

    @Override // defpackage.j7p
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7p)) {
            return false;
        }
        c7p c7pVar = (c7p) obj;
        return this.a.equals(c7pVar.a) && this.b == c7pVar.b && Intrinsics.d(this.c, c7pVar.c) && this.d == c7pVar.d && Intrinsics.d(this.e, c7pVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Podcast(uiData=");
        sb.append(this.a);
        sb.append(", likesCount=");
        sb.append(this.b);
        sb.append(", model=");
        sb.append(this.c);
        sb.append(", source=");
        sb.append(this.d);
        sb.append(", id=");
        return su4.o(sb, this.e, ")");
    }
}
