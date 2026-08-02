package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u5a {
    public final ArrayList a;
    public final String b;

    public u5a(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5a)) {
            return false;
        }
        u5a u5aVar = (u5a) obj;
        return this.a.equals(u5aVar.a) && this.b.equals(u5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MultiOrderTabsConfig(modes=" + this.a + ", selectedModeId=" + this.b + Extension.C_BRAKE;
    }
}
