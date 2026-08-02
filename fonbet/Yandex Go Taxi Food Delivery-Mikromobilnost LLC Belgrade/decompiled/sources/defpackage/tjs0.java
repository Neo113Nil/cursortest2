package defpackage;

import com.yandex.messaging.miniapps.size.PredefinedSizeValue;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class tjs0 extends hdb1 {
    public final PredefinedSizeValue a;

    public tjs0(PredefinedSizeValue predefinedSizeValue) {
        this.a = predefinedSizeValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjs0) && this.a == ((tjs0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predefined(value=" + this.a + Extension.C_BRAKE;
    }
}
