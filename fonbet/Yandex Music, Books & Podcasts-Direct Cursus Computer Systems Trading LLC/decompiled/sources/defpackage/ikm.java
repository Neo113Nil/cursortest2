package defpackage;

import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ikm {
    public final ArrayList a;
    public final lt b;
    public final Date c;

    public ikm(ArrayList arrayList, lt ltVar, Date date) {
        date.getClass();
        this.a = arrayList;
        this.b = ltVar;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikm)) {
            return false;
        }
        ikm ikmVar = (ikm) obj;
        return this.a.equals(ikmVar.a) && this.b.equals(ikmVar.b) && Intrinsics.d(this.c, ikmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreSaveDomainItem(artists=" + this.a + ", album=" + this.b + ", releaseDate=" + this.c + ")";
    }
}
