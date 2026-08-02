package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tdb0 implements qas0 {
    public final Calendar a;

    public tdb0(Calendar calendar) {
        this.a = calendar;
    }

    public final Calendar a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdb0) && jl40.l(this.a, ((tdb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScrollToStartCalendarDate(startDate=" + this.a + Extension.C_BRAKE;
    }
}
