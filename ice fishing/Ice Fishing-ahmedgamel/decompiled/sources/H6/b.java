package H6;

import c6.n;

/* loaded from: classes2.dex */
public final class b extends c6.f {

    /* renamed from: C, reason: collision with root package name */
    public static final a f1251C;

    /* renamed from: A, reason: collision with root package name */
    public final l f1252A;

    /* renamed from: B, reason: collision with root package name */
    public final y8.h f1253B;

    /* renamed from: v, reason: collision with root package name */
    public final String f1254v;

    /* renamed from: w, reason: collision with root package name */
    public final Boolean f1255w;

    /* renamed from: x, reason: collision with root package name */
    public final Long f1256x;

    /* renamed from: y, reason: collision with root package name */
    public final Double f1257y;

    /* renamed from: z, reason: collision with root package name */
    public final d f1258z;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1251C = new a(b.class);
        y8.h hVar = y8.h.f41925w;
    }

    public b(String str, Boolean bool, Long l9, Double d9, d dVar, l lVar, y8.h hVar, y8.h hVar2) {
        super(f1251C, hVar2);
        Object[] objArr = {dVar, lVar, hVar};
        int i = str != null ? 1 : 0;
        i = bool != null ? i + 1 : i;
        i = l9 != null ? i + 1 : i;
        i = d9 != null ? i + 1 : i;
        for (int i4 = 0; i4 < 3; i4++) {
            if (objArr[i4] != null) {
                i++;
            }
        }
        if (i > 1) {
            throw new IllegalArgumentException("at most one of string_value, bool_value, int_value, double_value, array_value, kvlist_value, bytes_value may be non-null");
        }
        this.f1254v = str;
        this.f1255w = bool;
        this.f1256x = l9;
        this.f1257y = d9;
        this.f1258z = dVar;
        this.f1252A = lVar;
        this.f1253B = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && A8.b.i(this.f1254v, bVar.f1254v) && A8.b.i(this.f1255w, bVar.f1255w) && A8.b.i(this.f1256x, bVar.f1256x) && A8.b.i(this.f1257y, bVar.f1257y) && A8.b.i(this.f1258z, bVar.f1258z) && A8.b.i(this.f1252A, bVar.f1252A) && A8.b.i(this.f1253B, bVar.f1253B);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f1254v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.f1255w;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l9 = this.f1256x;
        int hashCode4 = (hashCode3 + (l9 != null ? l9.hashCode() : 0)) * 37;
        Double d9 = this.f1257y;
        int hashCode5 = (hashCode4 + (d9 != null ? d9.hashCode() : 0)) * 37;
        d dVar = this.f1258z;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        l lVar = this.f1252A;
        int hashCode7 = (hashCode6 + (lVar != null ? lVar.hashCode() : 0)) * 37;
        y8.h hVar = this.f1253B;
        int hashCode8 = hashCode7 + (hVar != null ? hVar.hashCode() : 0);
        this.f5763u = hashCode8;
        return hashCode8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1254v;
        if (str != null) {
            sb.append(", string_value=");
            sb.append(A8.b.u(str));
        }
        Boolean bool = this.f1255w;
        if (bool != null) {
            sb.append(", bool_value=");
            sb.append(bool);
        }
        Long l9 = this.f1256x;
        if (l9 != null) {
            sb.append(", int_value=");
            sb.append(l9);
        }
        Double d9 = this.f1257y;
        if (d9 != null) {
            sb.append(", double_value=");
            sb.append(d9);
        }
        d dVar = this.f1258z;
        if (dVar != null) {
            sb.append(", array_value=");
            sb.append(dVar);
        }
        l lVar = this.f1252A;
        if (lVar != null) {
            sb.append(", kvlist_value=");
            sb.append(lVar);
        }
        y8.h hVar = this.f1253B;
        if (hVar != null) {
            sb.append(", bytes_value=");
            sb.append(hVar);
        }
        StringBuilder replace = sb.replace(0, 2, "AnyValue{");
        replace.append('}');
        return replace.toString();
    }
}
