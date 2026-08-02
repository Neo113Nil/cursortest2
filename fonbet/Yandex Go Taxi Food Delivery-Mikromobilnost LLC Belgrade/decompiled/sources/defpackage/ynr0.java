package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ynr0 {
    public final k3j0 a;
    public final nbr0 b;
    public final nm51 c;
    public final rf0 d;
    public final lef e;
    public final c800 f;
    public final qh10 g;
    public final qfy h;
    public final kh10 i;

    public ynr0(k3j0 k3j0Var, nbr0 nbr0Var, nm51 nm51Var, rf0 rf0Var, lef lefVar, c800 c800Var, qh10 qh10Var, qfy qfyVar, kh10 kh10Var) {
        this.a = k3j0Var;
        this.b = nbr0Var;
        this.c = nm51Var;
        this.d = rf0Var;
        this.e = lefVar;
        this.f = c800Var;
        this.g = qh10Var;
        this.h = qfyVar;
        this.i = kh10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ynr0) {
            ynr0 ynr0Var = (ynr0) obj;
            if (this.a.equals(ynr0Var.a) && this.b.equals(ynr0Var.b) && this.c.equals(ynr0Var.c) && this.d.equals(ynr0Var.d) && this.e.equals(ynr0Var.e) && this.f == ynr0Var.f && this.g.equals(ynr0Var.g) && this.h.equals(ynr0Var.h) && this.i.equals(ynr0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SharedPaymentPageTexts(reportSettingsPageTexts=" + this.a + ", settingsPageTexts=" + this.b + ", yandexProtectionPageTexts=" + this.c + ", addMemberPageTexts=" + this.d + ", currencySettingsPageTexts=" + this.e + ", mainPageTexts=" + this.f + ", memberListPageTexts=" + this.g + ", limitPageTexts=" + this.h + ", memberDetailsPageTexts=" + this.i + Extension.C_BRAKE;
    }
}
