package defpackage;

import java.util.Collections;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class xir implements zir {
    public final d2t a;
    public final q6r b;

    public xir(d2t d2tVar, q6r q6rVar) {
        this.a = d2tVar;
        this.b = q6rVar;
    }

    @Override // defpackage.zir
    public final zzs a() {
        return this.b.b;
    }

    @Override // defpackage.zir
    public final boolean b() {
        return jl40.B(this.b.e);
    }

    @Override // defpackage.zir
    public final Set c() {
        return Collections.singleton(this.a.b.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xir)) {
            return false;
        }
        xir xirVar = (xir) obj;
        return jl40.l(this.a, xirVar.a) && this.b.equals(xirVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Raw(geoSuggestParams=" + this.a + ", finalSuggestParams=" + this.b + Extension.C_BRAKE;
    }
}
