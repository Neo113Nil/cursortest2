package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sis extends cva1 {
    public final vrc a;

    public sis(vrc vrcVar) {
        this.a = vrcVar;
    }

    public final vrc e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sis) && this.a.equals(((sis) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreatePin(state=" + this.a + Extension.C_BRAKE;
    }
}
