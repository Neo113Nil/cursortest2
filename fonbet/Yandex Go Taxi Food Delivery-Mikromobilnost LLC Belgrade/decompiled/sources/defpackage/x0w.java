package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x0w implements z0w {
    public final BigDecimal a;
    public final BigDecimal b;
    public final FormattedText c;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public x0w(BigDecimal bigDecimal, BigDecimal bigDecimal2, FormattedText formattedText) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0w)) {
            return false;
        }
        x0w x0wVar = (x0w) obj;
        return jl40.l(this.a, x0wVar.a) && jl40.l(this.b, x0wVar.b) && jl40.l(this.c, x0wVar.c);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.a;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.b;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        FormattedText formattedText = this.c;
        return hashCode2 + (formattedText != null ? formattedText.a.hashCode() : 0);
    }

    public final String toString() {
        return "NumberInputType(minValue=" + this.a + ", maxValue=" + this.b + ", invalidInputMessage=" + this.c + Extension.C_BRAKE;
    }
}
