package g7;

import java.util.StringJoiner;
import o7.C4808c;
import o7.C4812g;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f37685a;

    /* renamed from: b, reason: collision with root package name */
    public final C4812g f37686b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37687c;

    public d(b bVar, C4812g c4812g, int i) {
        if (bVar == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.f37685a = bVar;
        if (c4812g == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.f37686b = c4812g;
        this.f37687c = i;
    }

    public static F.d a() {
        F.d dVar = new F.d((byte) 0, 4);
        dVar.f918c = C4808c.f39750a;
        dVar.f919d = C4812g.f39756a;
        dVar.f917b = 2000;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        dVar.getClass();
        return this.f37685a.equals(dVar.f37685a) && this.f37686b.equals(dVar.f37686b) && this.f37687c == dVar.f37687c;
    }

    public final int hashCode() {
        return this.f37687c ^ ((((((1000003 * 1000003) * 1000003) ^ this.f37685a.hashCode()) * 1000003) ^ this.f37686b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        stringJoiner.add("aggregation=" + this.f37685a);
        stringJoiner.add("attributesProcessor=" + this.f37686b);
        stringJoiner.add("cardinalityLimit=" + this.f37687c);
        return stringJoiner.toString();
    }
}
