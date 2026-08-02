package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class tm20 {
    public static final sm20 Companion = new sm20();
    public static final i3y[] e;
    public final String a;
    public final zk20 b;
    public final List c;
    public final Map d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new g110(28)), a.b(lazyThreadSafetyMode, new g110(29))};
    }

    public /* synthetic */ tm20(int i, String str, zk20 zk20Var, List list, Map map) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, rm20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zk20Var;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm20)) {
            return false;
        }
        tm20 tm20Var = (tm20) obj;
        return jl40.l(this.a, tm20Var.a) && jl40.l(this.b, tm20Var.b) && jl40.l(this.c, tm20Var.c) && jl40.l(this.d, tm20Var.d);
    }

    public final int hashCode() {
        int c = unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        Map map = this.d;
        return c + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "MobConfig(configId=" + this.a + ", algorithmSettings=" + this.b + ", proxyList=" + this.c + ", apis=" + this.d + Extension.C_BRAKE;
    }

    public tm20(String str, zk20 zk20Var, List list, Map map) {
        this.a = str;
        this.b = zk20Var;
        this.c = list;
        this.d = map;
    }
}
