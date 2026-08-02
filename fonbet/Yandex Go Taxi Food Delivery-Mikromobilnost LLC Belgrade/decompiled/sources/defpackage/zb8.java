package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zb8 extends cc8 {
    public final String a;
    public final List b;

    public zb8(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb8)) {
            return false;
        }
        zb8 zb8Var = (zb8) obj;
        return jl40.l(this.a, zb8Var.a) && jl40.l(this.b, zb8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("CHALLENGE_3DS(url=", this.a, ", trustedUrls=", Extension.C_BRAKE, this.b);
    }

    public /* synthetic */ zb8(String str) {
        this(str, EmptyList.a);
    }
}
