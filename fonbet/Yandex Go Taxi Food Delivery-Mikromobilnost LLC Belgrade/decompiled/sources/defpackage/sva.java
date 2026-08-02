package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sva {
    public final rva a;

    public /* synthetic */ sva(rva rvaVar) {
        this.a = rvaVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sva) {
            return jl40.l(this.a, ((sva) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        rva rvaVar = this.a;
        if (rvaVar == null) {
            return 0;
        }
        return rvaVar.hashCode();
    }

    public final String toString() {
        return "ChargersSupportPayload(orderInfo=" + this.a + Extension.C_BRAKE;
    }
}
