package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public class fd7 extends ed7 {
    public final int d;

    public fd7(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
        super(dateTimeFieldType, i, z);
        this.d = i2;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        int i2 = this.d;
        try {
            isc.a(sb, this.a.b(rk4Var).b(j), i2);
        } catch (RuntimeException unused) {
            while (true) {
                i2--;
                if (i2 < 0) {
                    return;
                } else {
                    sb.append((char) 65533);
                }
            }
        }
    }

    @Override // defpackage.qve
    public final int d() {
        return this.b;
    }
}
