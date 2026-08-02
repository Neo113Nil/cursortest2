package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s2w {
    public final Map a;
    public final Map b;
    public final LinkedHashSet c;
    public final List d;
    public final b0w e;
    public final String f;
    public final xwv g;

    public s2w(Map map, Map map2, LinkedHashSet linkedHashSet, List list, b0w b0wVar, String str, xwv xwvVar) {
        map2.getClass();
        linkedHashSet.getClass();
        list.getClass();
        str.getClass();
        xwvVar.getClass();
        this.a = map;
        this.b = map2;
        this.c = linkedHashSet;
        this.d = list;
        this.e = b0wVar;
        this.f = str;
        this.g = xwvVar;
    }

    public final List a() {
        return CollectionsKt.w0(this.a.values());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2w)) {
            return false;
        }
        s2w s2wVar = (s2w) obj;
        return this.a.equals(s2wVar.a) && Intrinsics.d(this.b, s2wVar.b) && Intrinsics.d(this.c, s2wVar.c) && Intrinsics.d(this.d, s2wVar.d) && Intrinsics.d(this.e, s2wVar.e) && Intrinsics.d(this.f, s2wVar.f) && Intrinsics.d(this.g, s2wVar.g);
    }

    public final int hashCode() {
        int d = k5r.d((this.c.hashCode() + f1d.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        b0w b0wVar = this.e;
        return this.g.hashCode() + k5r.c((d + (b0wVar == null ? 0 : b0wVar.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        return "WizardState(artists=" + this.a + ", likedArtists=" + this.b + ", recommendedArtists=" + this.c + ", genres=" + this.d + ", progress=" + this.e + ", currentGenreId=" + this.f + ", recommendationsInfo=" + this.g + ")";
    }
}
