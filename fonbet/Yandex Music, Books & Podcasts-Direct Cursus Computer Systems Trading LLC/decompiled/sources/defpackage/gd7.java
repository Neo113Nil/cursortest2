package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class gd7 implements qve, cve {
    public final String a;

    public gd7(String str) {
        this.a = str;
    }

    @Override // defpackage.cve
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        String str = this.a;
        return md7.o(str, charSequence, i) ? str.length() + i : ~i;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        sb.append((CharSequence) this.a);
    }

    @Override // defpackage.qve
    public final int d() {
        return this.a.length();
    }
}
