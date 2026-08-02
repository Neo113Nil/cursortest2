package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class q8j0 {
    public static final q8j0 g = new q8j0(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Object f;

    public q8j0(String str, String str2, String str3, String str4, String str5, Object obj) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8j0)) {
            return false;
        }
        q8j0 q8j0Var = (q8j0) obj;
        return jl40.l(this.a, q8j0Var.a) && jl40.l(this.b, q8j0Var.b) && jl40.l(this.c, q8j0Var.c) && jl40.l(this.d, q8j0Var.d) && jl40.l(this.e, q8j0Var.e) && jl40.l(this.f, q8j0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj = this.f;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequestState(vehicleId=", this.a, ", directionId=", this.b, ", qrUrl=");
        g8e.D(v, this.c, ", startingStopId=", this.d, ", destinationStopId=");
        return tse0.l(v, this.e, ", metaCheckoutInfo=", this.f, Extension.C_BRAKE);
    }

    public /* synthetic */ q8j0(int i) {
        this(null, null, null, null, null, null);
    }

    public q8j0() {
        this(0);
    }
}
