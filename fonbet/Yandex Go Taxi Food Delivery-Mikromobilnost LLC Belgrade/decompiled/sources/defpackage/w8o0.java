package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class w8o0 implements x8o0 {
    public final FormattedText a;

    public final boolean equals(Object obj) {
        if (obj instanceof w8o0) {
            return this.a.equals(((w8o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return ly3.p("Text(text=", Extension.C_BRAKE, this.a);
    }
}
