package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class ld7 extends ed7 {
    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        try {
            int b = this.a.b(rk4Var).b(j);
            int i2 = isc.b;
            if (b < 0) {
                sb.append('-');
                if (b == Integer.MIN_VALUE) {
                    sb.append("2147483648");
                    return;
                }
                b = -b;
            }
            if (b < 10) {
                sb.append((char) (b + 48));
            } else {
                if (b >= 100) {
                    sb.append((CharSequence) Integer.toString(b));
                    return;
                }
                int i3 = ((b + 1) * 13421772) >> 27;
                sb.append((char) (i3 + 48));
                sb.append((char) (((b - (i3 << 3)) - (i3 << 1)) + 48));
            }
        } catch (RuntimeException unused) {
            sb.append((char) 65533);
        }
    }

    @Override // defpackage.qve
    public final int d() {
        return this.b;
    }
}
