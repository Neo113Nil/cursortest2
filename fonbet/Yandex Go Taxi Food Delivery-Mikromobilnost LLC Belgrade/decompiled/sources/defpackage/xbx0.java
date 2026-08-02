package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xbx0 implements ccx0 {
    public final String a;

    public xbx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbx0) && this.a.equals(((xbx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("HandleGroupRequirementAction(groupName=", this.a, Extension.C_BRAKE);
    }
}
