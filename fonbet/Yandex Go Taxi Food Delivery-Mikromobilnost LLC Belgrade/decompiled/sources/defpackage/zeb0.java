package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zeb0 implements cfb0 {
    public final PartnerEntity a;
    public final String b;
    public final String c;
    public final Throwable d;

    public zeb0(PartnerEntity partnerEntity, String str, String str2, Throwable th) {
        this.a = partnerEntity;
        this.b = str;
        this.c = str2;
        this.d = th;
    }

    public final Throwable a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeb0)) {
            return false;
        }
        zeb0 zeb0Var = (zeb0) obj;
        return jl40.l(this.a, zeb0Var.a) && jl40.l(this.b, zeb0Var.b) && jl40.l(this.c, zeb0Var.c) && jl40.l(this.d, zeb0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Throwable th = this.d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "YbCheckFailed(partner=" + this.a + ", message=" + this.b + ", description=" + this.c + ", error=" + this.d + Extension.C_BRAKE;
    }
}
