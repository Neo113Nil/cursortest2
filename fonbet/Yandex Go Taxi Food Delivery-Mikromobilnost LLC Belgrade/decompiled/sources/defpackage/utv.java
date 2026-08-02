package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class utv implements ytv {
    public final List a;
    public final ArrayList b;

    public utv(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utv)) {
            return false;
        }
        utv utvVar = (utv) obj;
        return this.a.equals(utvVar.a) && this.b.equals(utvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InformationLoadedEvent(links=" + this.a + ", services=" + this.b + Extension.C_BRAKE;
    }
}
