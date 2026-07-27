package g7;

import java.util.StringJoiner;
import o7.C4804c;
import o7.C4808g;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f37660a;

    /* renamed from: b, reason: collision with root package name */
    public final C4808g f37661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37662c;

    public d(b bVar, C4808g c4808g, int i) {
        if (bVar == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.f37660a = bVar;
        if (c4808g == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.f37661b = c4808g;
        this.f37662c = i;
    }

    public static F.d a() {
        F.d dVar = new F.d((byte) 0, 5);
        dVar.f855c = C4804c.f39639a;
        dVar.f856d = C4808g.f39645a;
        dVar.f854b = 2000;
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
        return this.f37660a.equals(dVar.f37660a) && this.f37661b.equals(dVar.f37661b) && this.f37662c == dVar.f37662c;
    }

    public final int hashCode() {
        return this.f37662c ^ ((((((1000003 * 1000003) * 1000003) ^ this.f37660a.hashCode()) * 1000003) ^ this.f37661b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        stringJoiner.add("aggregation=" + this.f37660a);
        stringJoiner.add("attributesProcessor=" + this.f37661b);
        stringJoiner.add("cardinalityLimit=" + this.f37662c);
        return stringJoiner.toString();
    }
}
