package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yo01 {
    public static final yo01 i;
    public final Calendar a;
    public final xo01 b;
    public final wo01 c;
    public final wo01 d;
    public final int e;
    public final String f;
    public final String g;
    public final j4m h;

    static {
        e4m e4mVar = new e4m(false);
        wo01 wo01Var = wo01.d;
        i = new yo01(null, null, wo01Var, wo01Var, 0, null, null, e4mVar);
    }

    public yo01(Calendar calendar, xo01 xo01Var, wo01 wo01Var, wo01 wo01Var2, int i2, String str, String str2, j4m j4mVar) {
        this.a = calendar;
        this.b = xo01Var;
        this.c = wo01Var;
        this.d = wo01Var2;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = j4mVar;
    }

    public static yo01 a(yo01 yo01Var, Calendar calendar, xo01 xo01Var, wo01 wo01Var, wo01 wo01Var2, int i2, String str, String str2, j4m j4mVar, int i3) {
        if ((i3 & 1) != 0) {
            calendar = yo01Var.a;
        }
        Calendar calendar2 = calendar;
        if ((i3 & 2) != 0) {
            xo01Var = yo01Var.b;
        }
        xo01 xo01Var2 = xo01Var;
        if ((i3 & 4) != 0) {
            wo01Var = yo01Var.c;
        }
        wo01 wo01Var3 = wo01Var;
        if ((i3 & 8) != 0) {
            wo01Var2 = yo01Var.d;
        }
        wo01 wo01Var4 = wo01Var2;
        if ((i3 & 16) != 0) {
            i2 = yo01Var.e;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            str = yo01Var.f;
        }
        String str3 = str;
        String str4 = (i3 & 64) != 0 ? yo01Var.g : str2;
        j4m j4mVar2 = (i3 & 128) != 0 ? yo01Var.h : j4mVar;
        yo01Var.getClass();
        return new yo01(calendar2, xo01Var2, wo01Var3, wo01Var4, i4, str3, str4, j4mVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo01)) {
            return false;
        }
        yo01 yo01Var = (yo01) obj;
        return jl40.l(this.a, yo01Var.a) && jl40.l(this.b, yo01Var.b) && jl40.l(this.c, yo01Var.c) && jl40.l(this.d, yo01Var.d) && this.e == yo01Var.e && jl40.l(this.f, yo01Var.f) && jl40.l(this.g, yo01Var.g) && jl40.l(this.h, yo01Var.h);
    }

    public final int hashCode() {
        Calendar calendar = this.a;
        int hashCode = (calendar == null ? 0 : calendar.hashCode()) * 31;
        xo01 xo01Var = this.b;
        int b = oyr.b(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (xo01Var == null ? 0 : xo01Var.hashCode())) * 31)) * 31)) * 31, 31);
        String str = this.f;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return this.h.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferRequirementCardState(selectedDate=");
        sb.append(this.a);
        sb.append(", selectedTime=");
        sb.append(this.b);
        sb.append(", tripInputState=");
        sb.append(this.c);
        sb.append(", carriageInputState=");
        sb.append(this.d);
        sb.append(", luggageCount=");
        smw0.t(this.e, ", greeting=", this.f, ", selectedPassengerName=", sb);
        sb.append(this.g);
        sb.append(", doneButtonState=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
