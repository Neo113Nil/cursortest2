package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class uhc {
    public final ArrayList a;
    public final long b;
    public final vhc c;

    public uhc(ArrayList arrayList, long j, vhc vhcVar) {
        this.a = arrayList;
        this.b = j;
        this.c = vhcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhc)) {
            return false;
        }
        uhc uhcVar = (uhc) obj;
        return this.a.equals(uhcVar.a) && this.b == uhcVar.b && this.c.equals(uhcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Metadata(tags=" + this.a + ", timestamp=" + this.b + ", sourceCodeInfo=" + this.c + ")";
    }
}
