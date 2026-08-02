package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ldt {
    public final qpc a;
    public final tqc b;
    public final int c;
    public final int d;
    public final Object e;

    public ldt(qpc qpcVar, tqc tqcVar, int i, int i2, Object obj) {
        this.a = qpcVar;
        this.b = tqcVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldt)) {
            return false;
        }
        ldt ldtVar = (ldt) obj;
        return Intrinsics.d(this.a, ldtVar.a) && Intrinsics.d(this.b, ldtVar.b) && this.c == ldtVar.c && this.d == ldtVar.d && Intrinsics.d(this.e, ldtVar.e);
    }

    public final int hashCode() {
        qpc qpcVar = this.a;
        int a = f1d.a(this.d, f1d.a(this.c, (((qpcVar == null ? 0 : qpcVar.hashCode()) * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        return a + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        return f1d.j(sb, this.e, ')');
    }
}
