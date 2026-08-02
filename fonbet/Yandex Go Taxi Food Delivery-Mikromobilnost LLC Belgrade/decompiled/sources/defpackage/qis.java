package defpackage;

import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qis extends gc5 {
    public final String c;
    public final FullScreenEntity$Type d;
    public final String e;
    public final String f;
    public final boolean g;
    public final Boolean h;

    public qis(String str, FullScreenEntity$Type fullScreenEntity$Type, String str2, String str3, boolean z, Boolean bool) {
        super(str, 2);
        this.c = str;
        this.d = fullScreenEntity$Type;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qis)) {
            return false;
        }
        qis qisVar = (qis) obj;
        return this.c.equals(qisVar.c) && this.d == qisVar.d && jl40.l(this.e, qisVar.e) && jl40.l(this.f, qisVar.f) && this.g == qisVar.g && jl40.l(this.h, qisVar.h);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        FullScreenEntity$Type fullScreenEntity$Type = this.d;
        int hashCode2 = (hashCode + (fullScreenEntity$Type == null ? 0 : fullScreenEntity$Type.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int e = unr0.e((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        Boolean bool = this.h;
        return e + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String p = oyr.p("EventId(value=", this.c, Extension.C_BRAKE);
        StringBuilder sb = new StringBuilder("FullScreenEntity(id=");
        sb.append(p);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", action=");
        g8e.D(sb, this.e, ", name=", this.f, ", isMarkable=");
        sb.append(this.g);
        sb.append(", dropSessionsWithoutFullscreensOnShow=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
