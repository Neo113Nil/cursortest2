package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class v051 implements z051 {
    public final FormattedText a;

    public v051(FormattedText formattedText) {
        this.a = formattedText;
    }

    public final FormattedText a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v051) && jl40.l(this.a, ((v051) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("Text(text=", Extension.C_BRAKE, this.a);
    }
}
