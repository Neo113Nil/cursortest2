package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class stm0 implements ttm0 {
    public final String a;

    public /* synthetic */ stm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof stm0) {
            return jl40.l(this.a, ((stm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Unfreeze(activePassId=", this.a, Extension.C_BRAKE);
    }
}
