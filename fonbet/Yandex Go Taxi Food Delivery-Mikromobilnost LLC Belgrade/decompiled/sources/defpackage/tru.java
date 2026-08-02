package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tru {
    public final boolean a;
    public final lvi0 b;

    public tru(boolean z, lvi0 lvi0Var) {
        this.a = z;
        this.b = lvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tru)) {
            return false;
        }
        tru truVar = (tru) obj;
        return this.a == truVar.a && this.b.equals(truVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HorizontalTimelineItemState(isActive=" + this.a + ", icon=" + this.b + Extension.C_BRAKE;
    }
}
