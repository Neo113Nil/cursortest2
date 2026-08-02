package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class q401 {
    public final FormattedText a;
    public final boolean b;

    public q401(FormattedText formattedText, boolean z) {
        this.a = formattedText;
        this.b = z;
    }

    public final FormattedText a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q401)) {
            return false;
        }
        q401 q401Var = (q401) obj;
        return this.a.equals(q401Var.a) && this.b == q401Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Text(text=" + this.a + ", isShimmering=" + this.b + Extension.C_BRAKE;
    }
}
