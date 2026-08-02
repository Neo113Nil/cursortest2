package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qrg {
    public final ArrayList a;
    public final ArrayList b;

    public qrg(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrg)) {
            return false;
        }
        qrg qrgVar = (qrg) obj;
        return this.a.equals(qrgVar.a) && this.b.equals(qrgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateTimeSelectorState(dateValues=" + this.a + ", timeValues=" + this.b + Extension.C_BRAKE;
    }
}
