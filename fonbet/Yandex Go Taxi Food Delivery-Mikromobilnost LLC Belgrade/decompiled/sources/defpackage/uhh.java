package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes8.dex */
public final class uhh {
    public static final thh Companion = new thh();
    public static final i3y[] h;
    public final String a;
    public final y251 b;
    public final Map c;
    public final rh60 d;
    public final Map e;
    public final int f;
    public final hle0 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, a.b(lazyThreadSafetyMode, new n5h(4)), a.b(lazyThreadSafetyMode, new n5h(5)), a.b(lazyThreadSafetyMode, new n5h(6)), a.b(lazyThreadSafetyMode, new n5h(7)), null, a.b(lazyThreadSafetyMode, new n5h(8))};
    }

    public /* synthetic */ uhh(int i, String str, y251 y251Var, Map map, rh60 rh60Var, Map map2, int i2, hle0 hle0Var) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, shh.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = y251Var;
        this.c = map;
        this.d = rh60Var;
        this.e = map2;
        this.f = i2;
        this.g = hle0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhh)) {
            return false;
        }
        uhh uhhVar = (uhh) obj;
        return jl40.l(this.a, uhhVar.a) && jl40.l(this.b, uhhVar.b) && jl40.l(this.c, uhhVar.c) && jl40.l(this.d, uhhVar.d) && jl40.l(this.e, uhhVar.e) && this.f == uhhVar.f && jl40.l(this.g, uhhVar.g);
    }

    public final int hashCode() {
        int d = unr0.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        rh60 rh60Var = this.d;
        int b = oyr.b(this.f, unr0.d((d + (rh60Var == null ? 0 : rh60Var.hashCode())) * 31, 31, this.e), 31);
        hle0 hle0Var = this.g;
        return b + (hle0Var != null ? hle0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultPlaqueDto(id=" + this.a + ", rootWidget=" + this.b + ", metricContext=" + this.c + ", notification=" + this.d + ", serviceMeta=" + this.e + ", priority=" + this.f + ", rootPredicate=" + this.g + ')';
    }

    public uhh(String str, c251 c251Var, Map map, rh60 rh60Var, Map map2, int i, hle0 hle0Var) {
        this.a = str;
        this.b = c251Var;
        this.c = map;
        this.d = rh60Var;
        this.e = map2;
        this.f = i;
        this.g = hle0Var;
    }
}
