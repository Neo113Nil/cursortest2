package H6;

import c6.n;

/* loaded from: classes2.dex */
public final class b extends c6.f {

    /* renamed from: C, reason: collision with root package name */
    public static final a f1226C;

    /* renamed from: A, reason: collision with root package name */
    public final l f1227A;

    /* renamed from: B, reason: collision with root package name */
    public final y8.h f1228B;

    /* renamed from: v, reason: collision with root package name */
    public final String f1229v;

    /* renamed from: w, reason: collision with root package name */
    public final Boolean f1230w;

    /* renamed from: x, reason: collision with root package name */
    public final Long f1231x;

    /* renamed from: y, reason: collision with root package name */
    public final Double f1232y;

    /* renamed from: z, reason: collision with root package name */
    public final d f1233z;

    static {
        c6.d dVar = c6.d.f5578u;
        n nVar = n.f5618u;
        f1226C = new a(b.class);
        y8.h hVar = y8.h.f41951w;
    }

    public b(String str, Boolean bool, Long l9, Double d2, d dVar, l lVar, y8.h hVar, y8.h hVar2) {
        super(f1226C, hVar2);
        Object[] objArr = {dVar, lVar, hVar};
        int i = str != null ? 1 : 0;
        i = bool != null ? i + 1 : i;
        i = l9 != null ? i + 1 : i;
        i = d2 != null ? i + 1 : i;
        for (int i6 = 0; i6 < 3; i6++) {
            if (objArr[i6] != null) {
                i++;
            }
        }
        if (i > 1) {
            throw new IllegalArgumentException("at most one of string_value, bool_value, int_value, double_value, array_value, kvlist_value, bytes_value may be non-null");
        }
        this.f1229v = str;
        this.f1230w = bool;
        this.f1231x = l9;
        this.f1232y = d2;
        this.f1233z = dVar;
        this.f1227A = lVar;
        this.f1228B = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && V2.a.i(this.f1229v, bVar.f1229v) && V2.a.i(this.f1230w, bVar.f1230w) && V2.a.i(this.f1231x, bVar.f1231x) && V2.a.i(this.f1232y, bVar.f1232y) && V2.a.i(this.f1233z, bVar.f1233z) && V2.a.i(this.f1227A, bVar.f1227A) && V2.a.i(this.f1228B, bVar.f1228B);
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f1229v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.f1230w;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l9 = this.f1231x;
        int hashCode4 = (hashCode3 + (l9 != null ? l9.hashCode() : 0)) * 37;
        Double d2 = this.f1232y;
        int hashCode5 = (hashCode4 + (d2 != null ? d2.hashCode() : 0)) * 37;
        d dVar = this.f1233z;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        l lVar = this.f1227A;
        int hashCode7 = (hashCode6 + (lVar != null ? lVar.hashCode() : 0)) * 37;
        y8.h hVar = this.f1228B;
        int hashCode8 = hashCode7 + (hVar != null ? hVar.hashCode() : 0);
        this.f5587u = hashCode8;
        return hashCode8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1229v;
        if (str != null) {
            sb.append(", string_value=");
            sb.append(V2.a.t(str));
        }
        Boolean bool = this.f1230w;
        if (bool != null) {
            sb.append(", bool_value=");
            sb.append(bool);
        }
        Long l9 = this.f1231x;
        if (l9 != null) {
            sb.append(", int_value=");
            sb.append(l9);
        }
        Double d2 = this.f1232y;
        if (d2 != null) {
            sb.append(", double_value=");
            sb.append(d2);
        }
        d dVar = this.f1233z;
        if (dVar != null) {
            sb.append(", array_value=");
            sb.append(dVar);
        }
        l lVar = this.f1227A;
        if (lVar != null) {
            sb.append(", kvlist_value=");
            sb.append(lVar);
        }
        y8.h hVar = this.f1228B;
        if (hVar != null) {
            sb.append(", bytes_value=");
            sb.append(hVar);
        }
        StringBuilder replace = sb.replace(0, 2, "AnyValue{");
        replace.append('}');
        return replace.toString();
    }
}
