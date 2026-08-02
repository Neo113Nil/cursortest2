package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class umb implements cnb {
    public final lkb a;
    public final akb b;

    public umb(lkb lkbVar, akb akbVar) {
        this.a = lkbVar;
        this.b = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umb)) {
            return false;
        }
        umb umbVar = (umb) obj;
        return this.a.equals(umbVar.a) && this.b.equals(umbVar.b);
    }

    @Override // defpackage.cnb
    public final snb getAnalytics() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentMethodsInitError(parameter=" + this.a + ", analytics=" + this.b + Extension.C_BRAKE;
    }
}
