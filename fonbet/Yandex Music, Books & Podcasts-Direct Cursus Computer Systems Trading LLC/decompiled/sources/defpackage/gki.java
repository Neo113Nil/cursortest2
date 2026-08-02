package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gki implements jki {
    public final w48 a;
    public final w70 b;
    public final String c;

    public gki(w48 w48Var, w70 w70Var, String str) {
        w70Var.getClass();
        str.getClass();
        this.a = w48Var;
        this.b = w70Var;
        this.c = str;
    }

    @Override // defpackage.jki
    public final w70 a() {
        return this.b;
    }

    @Override // defpackage.jki
    public final w48 c() {
        return this.a;
    }

    @Override // defpackage.jki
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gki)) {
            return false;
        }
        gki gkiVar = (gki) obj;
        return this.a.equals(gkiVar.a) && Intrinsics.d(this.b, gkiVar.b) && Intrinsics.d(this.c, gkiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Album(uiData=");
        sb.append(this.a);
        sb.append(", analyticsEntityPosition=");
        sb.append(this.b);
        sb.append(", analyticsEntityId=");
        return su4.o(sb, this.c, ")");
    }
}
