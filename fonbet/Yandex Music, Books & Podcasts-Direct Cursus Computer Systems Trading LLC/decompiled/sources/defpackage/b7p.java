package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b7p extends j7p {
    public final bz2 a;
    public final eul b;
    public final e4p c;
    public final String d;

    public b7p(bz2 bz2Var, eul eulVar, e4p e4pVar, String str) {
        eulVar.getClass();
        str.getClass();
        this.a = bz2Var;
        this.b = eulVar;
        this.c = e4pVar;
        this.d = str;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    @Override // defpackage.j7p
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7p)) {
            return false;
        }
        b7p b7pVar = (b7p) obj;
        return this.a.equals(b7pVar.a) && Intrinsics.d(this.b, b7pVar.b) && this.c == b7pVar.c && Intrinsics.d(this.d, b7pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Playlist(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
