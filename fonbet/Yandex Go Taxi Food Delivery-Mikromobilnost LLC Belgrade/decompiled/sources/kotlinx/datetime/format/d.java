package kotlinx.datetime.format;

import defpackage.c6w;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.scc;
import defpackage.w511;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class d {
    public static final d b;
    public final List a;

    static {
        new d(scc.g("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        b = new d(scc.g("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    }

    public d(List list) {
        this.a = list;
        if (list.size() != 7) {
            ny61.g("Day of week names must contain exactly 7 elements");
            throw null;
        }
        c6w it = scc.e(list).iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (((CharSequence) this.a.get(nextInt)).length() <= 0) {
                ny61.g("A day-of-week name can not be empty");
                throw null;
            }
            for (int i = 0; i < nextInt; i++) {
                if (jl40.l(this.a.get(nextInt), this.a.get(i))) {
                    w511.f(oyr.t(new StringBuilder("Day-of-week names must be unique, but '"), (String) this.a.get(nextInt), "' was repeated"));
                    throw null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.a.equals(((d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return kotlin.collections.a.X(this.a, Extension.FIX_SPACE, "DayOfWeekNames(", Extension.C_BRAKE, DayOfWeekNames$toString$1.b, 24);
    }
}
