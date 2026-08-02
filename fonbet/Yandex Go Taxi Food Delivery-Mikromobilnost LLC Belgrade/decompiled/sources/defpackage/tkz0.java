package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltkz0;", "", "Companion", "rkz0", "skz0", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class tkz0 {
    public static final skz0 Companion = new skz0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ tkz0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
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
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkz0)) {
            return false;
        }
        tkz0 tkz0Var = (tkz0) obj;
        return jl40.l(this.a, tkz0Var.a) && jl40.l(this.b, tkz0Var.b) && jl40.l(this.c, tkz0Var.c) && jl40.l(this.d, tkz0Var.d) && jl40.l(this.e, tkz0Var.e) && jl40.l(this.f, tkz0Var.f) && jl40.l(this.g, tkz0Var.g) && jl40.l(this.h, tkz0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b(unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ToggleDto(titleKey=", this.a, ", summarySubtitleKey=", this.b, ", disabledSubtitleKey=");
        g8e.D(v, this.c, ", prohibitedPaymentMethodSubtitleKey=", this.d, ", prohibitedAlternativeSubtitleKey=");
        g8e.D(v, this.e, ", leadImageTag=", this.f, ", contactsTrailImageTag=");
        return g8e.r(v, this.g, ", summaryTrailImageTag=", this.h, Extension.C_BRAKE);
    }

    public tkz0(int i) {
        this.a = "";
        this.b = null;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public tkz0() {
        this(0);
    }
}
