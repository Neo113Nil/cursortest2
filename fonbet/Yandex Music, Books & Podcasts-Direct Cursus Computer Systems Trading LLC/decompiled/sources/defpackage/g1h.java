package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g1h {
    public final g3h a;
    public final int b;
    public final String c;
    public final r7h d;
    public final List e;
    public final r2h f;
    public final String g;
    public final List h;

    public g1h(g3h g3hVar, int i, String str, r7h r7hVar, List list, r2h r2hVar, String str2, List list2) {
        r2hVar.getClass();
        str2.getClass();
        list2.getClass();
        this.a = g3hVar;
        this.b = i;
        this.c = str;
        this.d = r7hVar;
        this.e = list;
        this.f = r2hVar;
        this.g = str2;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1h)) {
            return false;
        }
        g1h g1hVar = (g1h) obj;
        return this.a.equals(g1hVar.a) && this.b == g1hVar.b && this.c.equals(g1hVar.c) && this.d.equals(g1hVar.d) && Intrinsics.d(this.e, g1hVar.e) && this.f == g1hVar.f && Intrinsics.d(this.g, g1hVar.g) && Intrinsics.d(this.h, g1hVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + k5r.c(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31;
        List list = this.e;
        return this.h.hashCode() + k5r.c((this.f.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        return "Lyrics(trackInfo=" + this.a + ", lyricId=" + this.b + ", externalLyricsId=" + this.c + ", major=" + this.d + ", writers=" + this.e + ", format=" + this.f + ", rawFile=" + this.g + ", syncLyrics=" + this.h + ")";
    }
}
