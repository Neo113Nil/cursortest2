package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class spx {
    public final qpx a;
    public final rpx b;
    public final tnx c;

    public spx(qpx qpxVar, rpx rpxVar, tnx tnxVar) {
        this.a = qpxVar;
        this.b = rpxVar;
        this.c = tnxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spx)) {
            return false;
        }
        spx spxVar = (spx) obj;
        return this.a.equals(spxVar.a) && this.b.equals(spxVar.b) && this.c.equals(spxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "KycStepEntity(caption=" + this.a + ", preview=" + this.b + ", photoType=" + this.c + Extension.C_BRAKE;
    }
}
