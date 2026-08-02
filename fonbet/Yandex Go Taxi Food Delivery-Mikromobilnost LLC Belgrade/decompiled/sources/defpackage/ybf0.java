package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ybf0 implements qas0 {
    public final qis a;

    public ybf0(qis qisVar) {
        this.a = qisVar;
    }

    public final qis a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybf0) && this.a.equals(((ybf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowFullscreen(entity=" + this.a + Extension.C_BRAKE;
    }
}
