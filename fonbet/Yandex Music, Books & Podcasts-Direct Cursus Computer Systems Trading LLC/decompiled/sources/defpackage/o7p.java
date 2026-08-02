package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o7p extends y7p {
    public final lwl a;
    public final cvl b;
    public final e4p c;

    public o7p(lwl lwlVar, cvl cvlVar, e4p e4pVar) {
        cvlVar.getClass();
        this.a = lwlVar;
        this.b = cvlVar;
        this.c = e4pVar;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7p)) {
            return false;
        }
        o7p o7pVar = (o7p) obj;
        return this.a.equals(o7pVar.a) && Intrinsics.d(this.b, o7pVar.b) && this.c == o7pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Playlist(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ")";
    }
}
