package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o2w {
    public final List a;
    public final Set b;
    public final b0w c;
    public final boolean d;

    public o2w(List list, Set set, b0w b0wVar, boolean z) {
        list.getClass();
        set.getClass();
        this.a = list;
        this.b = set;
        this.c = b0wVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2w)) {
            return false;
        }
        o2w o2wVar = (o2w) obj;
        return Intrinsics.d(this.a, o2wVar.a) && Intrinsics.d(this.b, o2wVar.b) && this.c.equals(o2wVar.c) && this.d == o2wVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + su4.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "WizardSimilarArtistsByTap(artists=" + this.a + ", likedArtistIds=" + this.b + ", progress=" + this.c + ", isPumpkin=" + this.d + ")";
    }
}
