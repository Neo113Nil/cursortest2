package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1t implements ybb {
    public final String a;
    public final h0r b;
    public final List c;

    public u1t(String str, h0r h0rVar) {
        this.a = str;
        this.b = h0rVar;
        this.c = t75.c(h0rVar);
    }

    @Override // defpackage.ybb
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1t)) {
            return false;
        }
        u1t u1tVar = (u1t) obj;
        return Intrinsics.d(this.a, u1tVar.a) && this.b.equals(u1tVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "TrackTrailer(averageColor=" + this.a + ", smartPreview=" + this.b + ")";
    }
}
