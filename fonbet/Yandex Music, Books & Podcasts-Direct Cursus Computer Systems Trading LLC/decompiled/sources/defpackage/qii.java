package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class qii implements zii {
    public final lt a;
    public final ArrayList b;
    public final boolean c;

    public qii(lt ltVar, ArrayList arrayList, boolean z) {
        this.a = ltVar;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qii)) {
            return false;
        }
        qii qiiVar = (qii) obj;
        return this.a.equals(qiiVar.a) && this.b.equals(qiiVar.b) && this.c == qiiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dfi.b(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.zii
    public final boolean r() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Album(domainModel=");
        sb.append(this.a);
        sb.append(", artists=");
        sb.append(this.b);
        sb.append(", available=");
        return ouj.r(sb, this.c, ")");
    }
}
