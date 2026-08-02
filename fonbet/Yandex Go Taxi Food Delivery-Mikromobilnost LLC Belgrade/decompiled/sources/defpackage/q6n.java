package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class q6n extends n351 {
    public final String c;
    public final wts0 d;

    public q6n(String str, wts0 wts0Var) {
        super("dynamic-content-slot-key", false, 14);
        this.c = str;
        this.d = wts0Var;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6n)) {
            return false;
        }
        q6n q6nVar = (q6n) obj;
        return jl40.l(this.c, q6nVar.c) && this.d.equals(q6nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DynamicContentSlotModel(id=" + this.c + ", slotModel=" + this.d + Extension.C_BRAKE;
    }
}
