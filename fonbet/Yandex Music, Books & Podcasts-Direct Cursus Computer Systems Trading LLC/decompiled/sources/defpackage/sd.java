package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class sd implements drf {
    public final String a;
    public final ArrayList b;
    public final nrf c;

    public sd(String str, ArrayList arrayList, nrf nrfVar) {
        this.a = str;
        this.b = arrayList;
        this.c = nrfVar;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj;
        return this.a.equals(sdVar.a) && this.b.equals(sdVar.b) && this.c.equals(sdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dfi.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ActionBarBlock(id=" + this.a + ", buttons=" + this.b + ", meta=" + this.c + ")";
    }
}
