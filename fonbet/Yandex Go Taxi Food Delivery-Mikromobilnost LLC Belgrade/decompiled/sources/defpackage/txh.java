package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class txh {
    public final String a;
    public final Map b;
    public final kwh c;

    public txh(String str, kwh kwhVar) {
        Map f = b.f();
        this.a = str;
        this.b = f;
        this.c = kwhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txh)) {
            return false;
        }
        txh txhVar = (txh) obj;
        return jl40.l(this.a, txhVar.a) && jl40.l(this.b, txhVar.b) && jl40.l(this.c, txhVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        this.b.getClass();
        return this.c.a.hashCode() + (hashCode * 961);
    }

    public final String toString() {
        return "DeliveryCarePayload(careUrlPath=" + this.a + ", queryParams=" + this.b + ", appEnvironment=" + this.c + Extension.C_BRAKE;
    }
}
