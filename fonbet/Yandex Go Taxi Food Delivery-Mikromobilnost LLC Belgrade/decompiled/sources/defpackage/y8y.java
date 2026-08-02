package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y8y {
    public final String a;
    public final ArrayList b;

    public y8y(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8y)) {
            return false;
        }
        y8y y8yVar = (y8y) obj;
        return jl40.l(this.a, y8yVar.a) && this.b.equals(y8yVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return n.k("ActiveCardModes(defaultModeId=", this.a, ", modes=", Extension.C_BRAKE, this.b);
    }
}
