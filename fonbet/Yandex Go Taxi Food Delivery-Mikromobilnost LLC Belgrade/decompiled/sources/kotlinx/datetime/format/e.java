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
public final class e {
    public static final e b;
    public final List a;

    static {
        new e(scc.g("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        b = new e(scc.g("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public e(List list) {
        this.a = list;
        if (list.size() != 12) {
            ny61.g("Month names must contain exactly 12 elements");
            throw null;
        }
        c6w it = scc.e(list).iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (((CharSequence) this.a.get(nextInt)).length() <= 0) {
                ny61.g("A month name can not be empty");
                throw null;
            }
            for (int i = 0; i < nextInt; i++) {
                if (jl40.l(this.a.get(nextInt), this.a.get(i))) {
                    w511.f(oyr.t(new StringBuilder("Month names must be unique, but '"), (String) this.a.get(nextInt), "' was repeated"));
                    throw null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return kotlin.collections.a.X(this.a, Extension.FIX_SPACE, "MonthNames(", Extension.C_BRAKE, MonthNames$toString$1.b, 24);
    }
}
