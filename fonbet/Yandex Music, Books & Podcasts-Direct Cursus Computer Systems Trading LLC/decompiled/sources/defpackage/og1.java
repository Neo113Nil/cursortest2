package defpackage;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class og1 {
    public final List a;
    public final lt b;
    public final Date c;

    public og1(List list, lt ltVar, Date date) {
        list.getClass();
        date.getClass();
        this.a = list;
        this.b = ltVar;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og1)) {
            return false;
        }
        og1 og1Var = (og1) obj;
        return Intrinsics.d(this.a, og1Var.a) && this.b.equals(og1Var.b) && Intrinsics.d(this.c, og1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ArtistRelease(artists=" + this.a + ", album=" + this.b + ", releaseDate=" + this.c + ")";
    }
}
