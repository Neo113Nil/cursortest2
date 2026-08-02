package defpackage;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class vyc0 {
    public static final vyc0 d = new vyc0("");
    public final String a;
    public final uyc0 b;
    public final Object c;

    public vyc0(String str) {
        this.a = str;
        this.b = tw21.a >= 31 ? new uyc0() : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        uyc0 uyc0Var;
        uyc0Var = this.b;
        uyc0Var.getClass();
        return uyc0Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyc0)) {
            return false;
        }
        vyc0 vyc0Var = (vyc0) obj;
        return Objects.equals(this.a, vyc0Var.a) && this.b == vyc0Var.b && this.c == vyc0Var.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
