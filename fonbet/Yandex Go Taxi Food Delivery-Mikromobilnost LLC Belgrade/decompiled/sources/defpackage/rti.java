package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class rti {
    public final sti a;
    public final tti b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rti() {
        this(new sti(r1), new tti(r1));
        int i = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rti)) {
            return false;
        }
        rti rtiVar = (rti) obj;
        return jl40.l(this.a, rtiVar.a) && jl40.l(this.b, rtiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryTimeIntervals(listScreen=" + this.a + ", summaryItem=" + this.b + Extension.C_BRAKE;
    }

    public rti(sti stiVar, tti ttiVar) {
        this.a = stiVar;
        this.b = ttiVar;
    }
}
