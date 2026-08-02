package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t2o {
    public final int a;
    public final tqc b;
    public final int c;
    public final rqc d;

    public t2o(int i, tqc tqcVar, int i2, rqc rqcVar) {
        this.a = i;
        this.b = tqcVar;
        this.c = i2;
        this.d = rqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2o)) {
            return false;
        }
        t2o t2oVar = (t2o) obj;
        return this.a == t2oVar.a && Intrinsics.d(this.b, t2oVar.b) && this.c == t2oVar.c && this.d.equals(t2oVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + f1d.a(0, f1d.a(this.c, ((this.a * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", style=");
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", loadingStrategy=Blocking)");
        return sb.toString();
    }
}
