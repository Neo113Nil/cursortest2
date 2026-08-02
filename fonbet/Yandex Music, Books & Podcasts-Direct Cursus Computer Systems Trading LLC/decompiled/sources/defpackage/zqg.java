package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zqg {
    public final z77 a;
    public final String b;
    public final Map c;

    public zqg(z77 z77Var, String str, Map map) {
        z77Var.getClass();
        this.a = z77Var;
        this.b = str;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqg)) {
            return false;
        }
        zqg zqgVar = (zqg) obj;
        return Intrinsics.d(this.a, zqgVar.a) && this.b.equals(zqgVar.b) && this.c.equals(zqgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventImpl(environment=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", params=");
        return k5r.p(sb, this.c, ')');
    }
}
