package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zrs0 implements css0 {
    public final bss0 a;

    public zrs0(bss0 bss0Var) {
        this.a = bss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrs0) && this.a.equals(((zrs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SingleColumn(textColumn=" + this.a + Extension.C_BRAKE;
    }
}
