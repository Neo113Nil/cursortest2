package defpackage;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ndl {
    public static final ndl d = new ndl("");
    public final String a;
    public final fc6 b;
    public final Object c;

    public ndl(String str) {
        this.a = str;
        this.b = dvt.a >= 31 ? new fc6(2) : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        fc6 fc6Var;
        fc6Var = this.b;
        fc6Var.getClass();
        return (LogSessionId) fc6Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndl)) {
            return false;
        }
        ndl ndlVar = (ndl) obj;
        return Objects.equals(this.a, ndlVar.a) && Objects.equals(this.b, ndlVar.b) && Objects.equals(this.c, ndlVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
