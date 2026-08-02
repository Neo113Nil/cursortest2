package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class g2t {
    public final int a;
    public final String b;
    public final boolean c;
    public final int d;
    public final csc e;

    public g2t(int i, String str, boolean z, int i2, csc cscVar) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = i2;
        this.e = cscVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g2t.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        g2t g2tVar = (g2t) obj;
        return this.a == g2tVar.a && Intrinsics.d(this.b, g2tVar.b) && this.c == g2tVar.c && this.d == g2tVar.d && Intrinsics.d(this.e, g2tVar.e);
    }

    public final int hashCode() {
        int a = f1d.a(this.d, k5r.e(k5r.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        csc cscVar = this.e;
        return a + (cscVar != null ? cscVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrackVariant(trackVariantType=" + this.a + ", title='" + this.b + "', selected=" + this.c + ", trackType=" + this.d + ", format=" + this.e + ')';
    }
}
