package defpackage;

import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.tariffcard.ui.SectionSeparator$AnimationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r3q0 implements uhx0, e6v {
    public final CardDivider.Type a;
    public final int b;
    public final kdc c;
    public final p3q0 d;
    public final SectionSeparator$AnimationType e;
    public final String f;

    public r3q0(CardDivider.Type type, int i, kdc kdcVar, p3q0 p3q0Var, SectionSeparator$AnimationType sectionSeparator$AnimationType, int i2) {
        sectionSeparator$AnimationType = (i2 & 16) != 0 ? SectionSeparator$AnimationType.DEFAULT : sectionSeparator$AnimationType;
        this.a = type;
        this.b = i;
        this.c = kdcVar;
        this.d = p3q0Var;
        this.e = sectionSeparator$AnimationType;
        this.f = "SectionSeparator " + sectionSeparator$AnimationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3q0)) {
            return false;
        }
        r3q0 r3q0Var = (r3q0) obj;
        return this.a == r3q0Var.a && this.b == r3q0Var.b && jl40.l(this.c, r3q0Var.c) && jl40.l(this.d, r3q0Var.d) && this.e == r3q0Var.e && jl40.l(this.f, r3q0Var.f);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + smw0.d(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SectionSeparator(type=" + this.a + ", dividerHeight=" + this.b + ", color=" + this.c + ", margins=" + this.d + ", animationType=" + this.e + ", id=" + this.f + Extension.C_BRAKE;
    }
}
