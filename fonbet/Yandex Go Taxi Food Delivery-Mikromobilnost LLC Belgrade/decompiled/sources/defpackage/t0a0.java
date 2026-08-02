package defpackage;

import java.util.function.Function;

/* loaded from: classes8.dex */
public abstract class t0a0 {
    public final String a;
    public final Function b;

    public t0a0(String str, Function function) {
        this.a = str;
        this.b = function;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass().equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((t0a0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
