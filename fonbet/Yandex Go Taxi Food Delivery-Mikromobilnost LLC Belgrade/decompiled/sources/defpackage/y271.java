package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.f5;

/* loaded from: classes7.dex */
public final class y271 {
    public final f5 a;
    public final Map b;

    public y271(f5 f5Var, Map map) {
        this.a = f5Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y271)) {
            return false;
        }
        y271 y271Var = (y271) obj;
        return this.a == y271Var.a && jl40.l(this.b, y271Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.a + ", reportParameters=" + this.b + Extension.C_BRAKE;
    }
}
