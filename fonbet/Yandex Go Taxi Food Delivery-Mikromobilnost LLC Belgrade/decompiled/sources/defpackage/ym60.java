package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public final class ym60 extends zm60 {
    public static final ym60 b = new ym60(HexString.CHAR_COMMA);
    public final char a;

    public ym60(char c) {
        this.a = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym60) && this.a == ((ym60) obj).a;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }

    public final String toString() {
        return "Text(char=" + this.a + Extension.C_BRAKE;
    }
}
