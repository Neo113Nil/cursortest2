package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s3h implements t3h {
    public final zwr a;
    public final a3h b;
    public final boolean c;

    public s3h(zwr zwrVar, a3h a3hVar, boolean z) {
        zwrVar.getClass();
        this.a = zwrVar;
        this.b = a3hVar;
        this.c = z;
    }

    public static s3h a(s3h s3hVar, a3h a3hVar, boolean z, int i) {
        zwr zwrVar = s3hVar.a;
        if ((i & 2) != 0) {
            a3hVar = s3hVar.b;
        }
        if ((i & 4) != 0) {
            z = s3hVar.c;
        }
        s3hVar.getClass();
        zwrVar.getClass();
        return new s3h(zwrVar, a3hVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3h)) {
            return false;
        }
        s3h s3hVar = (s3h) obj;
        return Intrinsics.d(this.a, s3hVar.a) && this.b == s3hVar.b && this.c == s3hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sync(lyricsData=");
        sb.append(this.a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", isFullscreen=");
        return ouj.r(sb, this.c, ")");
    }
}
