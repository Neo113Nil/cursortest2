package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class wel implements xel {
    public final vdl a;
    public final List b;

    public wel(vdl vdlVar, List list) {
        this.a = vdlVar;
        this.b = list;
    }

    @Override // defpackage.xel
    public final vdl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wel)) {
            return false;
        }
        wel welVar = (wel) obj;
        return this.a.equals(welVar.a) && this.b.equals(welVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Known(reference=" + this.a + ", informers=" + this.b + ")";
    }
}
