package c2;

import l1.f;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f1217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1218b;

    public a(f fVar, int i10) {
        this.f1217a = fVar;
        this.f1218b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f1217a, aVar.f1217a) && this.f1218b == aVar.f1218b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1218b) + (this.f1217a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f1217a);
        sb.append(", configFlags=");
        return a4.d.l(sb, this.f1218b, ')');
    }
}
