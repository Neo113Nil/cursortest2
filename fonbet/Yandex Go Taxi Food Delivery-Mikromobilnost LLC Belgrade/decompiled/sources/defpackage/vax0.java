package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@gsq0
/* loaded from: classes6.dex */
public final class vax0 {
    public static final tax0 Companion = new tax0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(25))};
    public final String a;
    public final Map b;

    public /* synthetic */ vax0(int i, String str, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, rax0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vax0)) {
            return false;
        }
        vax0 vax0Var = (vax0) obj;
        return jl40.l(this.a, vax0Var.a) && jl40.l(this.b, vax0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return xvz.j("Tariff(tariffClass=", this.a, ", requirements=", Extension.C_BRAKE, this.b);
    }

    public vax0(String str, RequirementsParam requirementsParam) {
        this.a = str;
        this.b = requirementsParam;
    }
}
