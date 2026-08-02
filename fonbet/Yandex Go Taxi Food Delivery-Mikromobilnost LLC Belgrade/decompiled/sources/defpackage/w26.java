package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class w26 extends v26 {
    public final String a;
    public final int b;

    public w26(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w26)) {
            return false;
        }
        return this.a.equals(((w26) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.i(this.b, "BleScannedEddystone(eid=", this.a, ", batteryLevel=", Extension.C_BRAKE);
    }
}
