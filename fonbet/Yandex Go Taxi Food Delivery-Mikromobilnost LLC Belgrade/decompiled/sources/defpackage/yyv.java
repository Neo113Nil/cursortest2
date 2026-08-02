package defpackage;

import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class yyv extends czv {
    public final TextFieldNameForAnalytics a;

    public yyv(TextFieldNameForAnalytics textFieldNameForAnalytics) {
        this.a = textFieldNameForAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yyv) && this.a == ((yyv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Complete(input=" + this.a + Extension.C_BRAKE;
    }
}
