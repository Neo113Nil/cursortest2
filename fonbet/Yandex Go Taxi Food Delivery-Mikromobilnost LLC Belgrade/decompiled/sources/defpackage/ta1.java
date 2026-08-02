package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lta1;", "", "Companion", "pa1", "ra1", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ta1 {
    public static final ra1 Companion = new ra1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ta1(int i, String str, String str2, String str3, String str4) {
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
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta1)) {
            return false;
        }
        ta1 ta1Var = (ta1) obj;
        return jl40.l(this.a, ta1Var.a) && jl40.l(this.b, ta1Var.b) && jl40.l(this.c, ta1Var.c) && jl40.l(this.d, ta1Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("AdjustEvent(eventId=", this.a, ", eventName=", this.b, ", token="), this.c, ", firebaseName=", this.d, Extension.C_BRAKE);
    }

    public ta1() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
    }
}
