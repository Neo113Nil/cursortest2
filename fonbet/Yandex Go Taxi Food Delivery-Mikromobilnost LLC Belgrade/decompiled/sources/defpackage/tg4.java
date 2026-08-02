package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tg4 implements xg4 {
    public final k0u a;

    public tg4(k0u k0uVar) {
        this.a = k0uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg4) && this.a.equals(((tg4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShapeBackground(shape=" + this.a + Extension.C_BRAKE;
    }
}
