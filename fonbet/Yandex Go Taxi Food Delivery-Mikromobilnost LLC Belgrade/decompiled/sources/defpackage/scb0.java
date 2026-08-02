package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class scb0 implements vcb0 {
    public final String a;
    public final Calendar b;
    public final Calendar c;
    public final Calendar d;
    public final String e;

    public scb0(String str, Calendar calendar, Calendar calendar2, Calendar calendar3, String str2) {
        this.a = str;
        this.b = calendar;
        this.c = calendar2;
        this.d = calendar3;
        this.e = str2;
    }

    @Override // defpackage.vcb0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scb0)) {
            return false;
        }
        scb0 scb0Var = (scb0) obj;
        return jl40.l(this.a, scb0Var.a) && jl40.l(this.b, scb0Var.b) && jl40.l(this.c, scb0Var.c) && this.d.equals(scb0Var.d) && this.e.equals(scb0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Calendar calendar = this.b;
        int hashCode2 = (hashCode + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String a = tab0.a(this.a);
        String a2 = rcb0.a(this.e);
        StringBuilder sb = new StringBuilder("Date(filterId=");
        sb.append(a);
        sb.append(", startDate=");
        sb.append(this.b);
        sb.append(", endDate=");
        sb.append(this.c);
        sb.append(", firstAvailableDate=");
        sb.append(this.d);
        sb.append(", fallbackSectionKey=");
        return oyr.t(sb, a2, Extension.C_BRAKE);
    }
}
