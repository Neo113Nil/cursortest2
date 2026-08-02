package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rsg {
    public final Calendar a;
    public final boolean b;
    public final xy40 c;
    public final String d;
    public final String e;

    public rsg(Calendar calendar, boolean z, xy40 xy40Var, String str) {
        this.a = calendar;
        this.b = z;
        this.c = xy40Var;
        this.d = str;
        this.e = calendar.get(2) + Extension.DOT_CHAR + calendar.get(5);
    }

    public static rsg a(rsg rsgVar, xy40 xy40Var) {
        return new rsg(rsgVar.a, rsgVar.b, xy40Var, rsgVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsg)) {
            return false;
        }
        rsg rsgVar = (rsg) obj;
        return this.a.equals(rsgVar.a) && this.b == rsgVar.b && this.c.equals(rsgVar.c) && this.d.equals(rsgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
