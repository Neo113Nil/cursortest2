package c7;

import java.util.StringJoiner;
import k7.C4662c;
import k7.C4666g;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f5715a;

    /* renamed from: b, reason: collision with root package name */
    public final C4666g f5716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5717c;

    public d(b bVar, C4666g c4666g, int i) {
        if (bVar == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.f5715a = bVar;
        if (c4666g == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.f5716b = c4666g;
        this.f5717c = i;
    }

    public static F.d a() {
        F.d dVar = new F.d((byte) 0, 4);
        dVar.f909c = C4662c.f38818a;
        dVar.f910d = C4666g.f38824a;
        dVar.f908b = 2000;
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
        return this.f5715a.equals(dVar.f5715a) && this.f5716b.equals(dVar.f5716b) && this.f5717c == dVar.f5717c;
    }

    public final int hashCode() {
        return this.f5717c ^ ((((((1000003 * 1000003) * 1000003) ^ this.f5715a.hashCode()) * 1000003) ^ this.f5716b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        stringJoiner.add("aggregation=" + this.f5715a);
        stringJoiner.add("attributesProcessor=" + this.f5716b);
        stringJoiner.add("cardinalityLimit=" + this.f5717c);
        return stringJoiner.toString();
    }
}
