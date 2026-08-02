package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w6p extends j7p {
    public final nnk a;
    public final List b;
    public final e4p c;
    public final String d;

    public w6p(nnk nnkVar, List list, e4p e4pVar, String str) {
        list.getClass();
        str.getClass();
        this.a = nnkVar;
        this.b = list;
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
        if (!(obj instanceof w6p)) {
            return false;
        }
        w6p w6pVar = (w6p) obj;
        return this.a.equals(w6pVar.a) && Intrinsics.d(this.b, w6pVar.b) && this.c == w6pVar.c && Intrinsics.d(this.d, w6pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ArtistsRelated(uiData=" + this.a + ", artists=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
