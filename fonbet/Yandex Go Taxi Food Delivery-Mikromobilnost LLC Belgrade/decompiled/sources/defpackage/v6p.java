package defpackage;

import com.yandex.payment.sdk.flex.api.dtotransport.FTTransportKind;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = w6p.class)
/* loaded from: classes2.dex */
public final class v6p {
    public static final u6p Companion = new u6p();
    public final FTTransportKind a;
    public final z6p b;
    public final c6p c;
    public final y5p d;

    public v6p(FTTransportKind fTTransportKind, z6p z6pVar, c6p c6pVar, y5p y5pVar, int i) {
        z6pVar = (i & 2) != 0 ? null : z6pVar;
        c6pVar = (i & 4) != 0 ? null : c6pVar;
        y5pVar = (i & 8) != 0 ? null : y5pVar;
        this.a = fTTransportKind;
        this.b = z6pVar;
        this.c = c6pVar;
        this.d = y5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6p)) {
            return false;
        }
        v6p v6pVar = (v6p) obj;
        return this.a == v6pVar.a && jl40.l(this.b, v6pVar.b) && jl40.l(this.c, v6pVar.c) && jl40.l(this.d, v6pVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z6p z6pVar = this.b;
        int hashCode2 = (hashCode + (z6pVar == null ? 0 : z6pVar.hashCode())) * 31;
        c6p c6pVar = this.c;
        int hashCode3 = (hashCode2 + (c6pVar == null ? 0 : c6pVar.hashCode())) * 31;
        y5p y5pVar = this.d;
        return hashCode3 + (y5pVar != null ? y5pVar.hashCode() : 0);
    }

    public final String toString() {
        return "FTValueTransportNode(type=" + this.a + ", variable=" + this.b + ", oauthToken=" + this.c + ", genUUID=" + this.d + Extension.C_BRAKE;
    }
}
