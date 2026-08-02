package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class wbe0 {
    public final Map a;
    public final Map b;

    public /* synthetic */ wbe0(int i, Map map, Map map2) {
        this((i & 1) != 0 ? b.f() : map, (i & 2) != 0 ? b.f() : map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wbe0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        wbe0 wbe0Var = (wbe0) obj;
        return jl40.l(this.a, wbe0Var.a) && jl40.l(this.b, wbe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PortionParams(query=" + this.a + ", body=" + this.b + Extension.C_BRAKE;
    }

    public wbe0(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wbe0() {
        this(3, r0, r0);
        Map map = null;
    }
}
