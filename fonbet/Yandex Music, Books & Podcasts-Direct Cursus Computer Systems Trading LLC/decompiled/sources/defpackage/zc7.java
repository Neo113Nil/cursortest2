package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class zc7 implements qve, cve {
    public final char a;

    public zc7(char c) {
        this.a = c;
    }

    @Override // defpackage.cve
    public final int a() {
        return 1;
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        if (i >= charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.a;
        return (charAt == c || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        sb.append(this.a);
    }

    @Override // defpackage.qve
    public final int d() {
        return 1;
    }
}
