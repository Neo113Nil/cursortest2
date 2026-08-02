package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class wgp0 extends kr {
    public static final vgp0 Companion = new vgp0();
    public static final i3y[] c;
    public final x5x a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new c6p0(15)), a.b(lazyThreadSafetyMode, new c6p0(16))};
    }

    public /* synthetic */ wgp0(int i, x5x x5xVar, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ugp0.a.getDescriptor());
            throw null;
        }
        this.a = x5xVar;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgp0) || !wgp0.class.equals(obj.getClass())) {
            return false;
        }
        wgp0 wgp0Var = (wgp0) obj;
        return jl40.l(this.a, wgp0Var.a) && jl40.l(this.b, wgp0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ScriptAction(script=" + this.a + ", effects=" + this.b + Extension.C_BRAKE;
    }
}
