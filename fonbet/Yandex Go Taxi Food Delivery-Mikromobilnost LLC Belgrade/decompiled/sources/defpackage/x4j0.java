package defpackage;

import com.yandex.go.flex.common.data.bdui.c;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class x4j0 {
    public final kwu a;
    public final meu b;
    public final s76 c;

    public x4j0(kwu kwuVar, meu meuVar, s76 s76Var) {
        this.a = kwuVar;
        this.b = meuVar;
        this.c = s76Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [s76] */
    public static x4j0 a(x4j0 x4j0Var, meu meuVar, c cVar, int i) {
        kwu kwuVar = x4j0Var.a;
        if ((i & 2) != 0) {
            meuVar = x4j0Var.b;
        }
        c cVar2 = cVar;
        if ((i & 4) != 0) {
            cVar2 = x4j0Var.c;
        }
        return new x4j0(kwuVar, meuVar, cVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4j0)) {
            return false;
        }
        x4j0 x4j0Var = (x4j0) obj;
        return jl40.l(this.a, x4j0Var.a) && jl40.l(this.b, x4j0Var.b) && jl40.l(this.c, x4j0Var.c);
    }

    public final int hashCode() {
        int hashCode = ((this.a.i.hashCode() * 31) + Arrays.hashCode(this.b.a)) * 31;
        s76 s76Var = this.c;
        return hashCode + (s76Var == null ? 0 : s76Var.hashCode());
    }

    public final String toString() {
        return "Request(url=" + this.a + ", headers=" + this.b + ", body=" + this.c + Extension.C_BRAKE;
    }
}
