package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s04 implements qas0 {
    public final qis a;

    public s04(qis qisVar) {
        this.a = qisVar;
    }

    public final qis a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s04) && this.a.equals(((s04) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FullScreen(fullScreen=" + this.a + Extension.C_BRAKE;
    }
}
