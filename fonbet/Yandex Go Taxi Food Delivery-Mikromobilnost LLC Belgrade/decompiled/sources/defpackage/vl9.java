package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class vl9 implements yl9 {
    public final FormattedText a;

    public vl9(FormattedText formattedText) {
        this.a = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vl9) && jl40.l(this.a, ((vl9) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("Complete(title=", Extension.C_BRAKE, this.a);
    }
}
