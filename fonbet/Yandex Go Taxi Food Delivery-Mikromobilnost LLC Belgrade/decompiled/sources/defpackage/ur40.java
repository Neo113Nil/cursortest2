package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class ur40 implements wu1 {
    public final String a;
    public final List b;

    public ur40(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.wu1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur40)) {
            return false;
        }
        ur40 ur40Var = (ur40) obj;
        return jl40.l(this.a, ur40Var.a) && jl40.l(this.b, ur40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("MultimodalOptionGroup(alternativeType=", this.a, ", routeUris=", Extension.C_BRAKE, this.b);
    }

    public /* synthetic */ ur40(String str) {
        this(str, EmptyList.a);
    }
}
