package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yeu0 {
    public final afu0 a;

    public yeu0(afu0 afu0Var) {
        this.a = afu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yeu0) && this.a.equals(((yeu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StickyWidgetDomainModel(widget=" + this.a + Extension.C_BRAKE;
    }
}
