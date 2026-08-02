package defpackage;

import com.yandex.plus.core.network.header.NetworkHeader$Name$Loggable;
import kotlin.a;

/* loaded from: classes11.dex */
public final class tu50 implements Comparable {
    public final String a;
    public final NetworkHeader$Name$Loggable b;
    public final i3y c = a.a(new d240(23, this));

    public tu50(String str, NetworkHeader$Name$Loggable networkHeader$Name$Loggable) {
        this.a = str;
        this.b = networkHeader$Name$Loggable;
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tu50 tu50Var = (tu50) obj;
        if (a().compareTo(tu50Var.a()) < 0) {
            return -1;
        }
        return a().compareTo(tu50Var.a()) > 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        tu50 tu50Var = obj instanceof tu50 ? (tu50) obj : null;
        return jl40.l(tu50Var != null ? tu50Var.a() : null, a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
