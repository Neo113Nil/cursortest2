package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class q4u0 {
    public final String a;

    static {
        new LinkedHashMap();
    }

    public q4u0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return q4u0.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((q4u0) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 184180370;
    }

    public final String toString() {
        return oyr.t(new StringBuilder(), this.a, ": afterRender");
    }
}
