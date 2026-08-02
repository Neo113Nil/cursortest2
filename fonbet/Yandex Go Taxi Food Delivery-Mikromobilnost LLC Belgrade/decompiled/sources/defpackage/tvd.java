package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltvd;", "", "Companion", "rvd", "svd", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class tvd {
    public static final svd Companion = new svd();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final n7v f;
    public final String g;
    public final String h;
    public final kk4 i;

    public /* synthetic */ tvd(int i, String str, String str2, String str3, String str4, String str5, n7v n7vVar, String str6, String str7, kk4 kk4Var) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = n7vVar;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = kk4Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvd)) {
            return false;
        }
        tvd tvdVar = (tvd) obj;
        return jl40.l(this.a, tvdVar.a) && jl40.l(this.b, tvdVar.b) && jl40.l(this.c, tvdVar.c) && jl40.l(this.d, tvdVar.d) && jl40.l(this.e, tvdVar.e) && jl40.l(this.f, tvdVar.f) && jl40.l(this.g, tvdVar.g) && jl40.l(this.h, tvdVar.h) && jl40.l(this.i, tvdVar.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        n7v n7vVar = this.f;
        int b2 = unr0.b(unr0.b((b + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31, 31, this.g), 31, this.h);
        kk4 kk4Var = this.i;
        return b2 + (kk4Var != null ? kk4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CompoundSelectItemDto(title=", this.a, ", titlePopup=", this.b, ", titleOnLabel=");
        g8e.D(v, this.c, ", description=", this.d, ", trailPlaceholder=");
        v.append(this.e);
        v.append(", icon=");
        v.append(this.f);
        v.append(", titleSelected=");
        g8e.D(v, this.g, ", cancelButton=", this.h, ", badge=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public tvd() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = null;
        this.g = "";
        this.h = "";
        this.i = null;
    }
}
