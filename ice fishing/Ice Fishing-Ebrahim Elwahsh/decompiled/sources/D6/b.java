package D6;

import Y5.n;

/* loaded from: classes2.dex */
public final class b extends Y5.f {

    /* renamed from: C, reason: collision with root package name */
    public static final a f705C;

    /* renamed from: A, reason: collision with root package name */
    public final l f706A;

    /* renamed from: B, reason: collision with root package name */
    public final u8.h f707B;

    /* renamed from: v, reason: collision with root package name */
    public final String f708v;

    /* renamed from: w, reason: collision with root package name */
    public final Boolean f709w;

    /* renamed from: x, reason: collision with root package name */
    public final Long f710x;

    /* renamed from: y, reason: collision with root package name */
    public final Double f711y;

    /* renamed from: z, reason: collision with root package name */
    public final d f712z;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f705C = new a(b.class);
        u8.h hVar = u8.h.f41278w;
    }

    public b(String str, Boolean bool, Long l9, Double d2, d dVar, l lVar, u8.h hVar, u8.h hVar2) {
        super(f705C, hVar2);
        Object[] objArr = {dVar, lVar, hVar};
        int i = str != null ? 1 : 0;
        i = bool != null ? i + 1 : i;
        i = l9 != null ? i + 1 : i;
        i = d2 != null ? i + 1 : i;
        for (int i4 = 0; i4 < 3; i4++) {
            if (objArr[i4] != null) {
                i++;
            }
        }
        if (i > 1) {
            throw new IllegalArgumentException("at most one of string_value, bool_value, int_value, double_value, array_value, kvlist_value, bytes_value may be non-null");
        }
        this.f708v = str;
        this.f709w = bool;
        this.f710x = l9;
        this.f711y = d2;
        this.f712z = dVar;
        this.f706A = lVar;
        this.f707B = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && com.bumptech.glide.f.f(this.f708v, bVar.f708v) && com.bumptech.glide.f.f(this.f709w, bVar.f709w) && com.bumptech.glide.f.f(this.f710x, bVar.f710x) && com.bumptech.glide.f.f(this.f711y, bVar.f711y) && com.bumptech.glide.f.f(this.f712z, bVar.f712z) && com.bumptech.glide.f.f(this.f706A, bVar.f706A) && com.bumptech.glide.f.f(this.f707B, bVar.f707B);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f708v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.f709w;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l9 = this.f710x;
        int hashCode4 = (hashCode3 + (l9 != null ? l9.hashCode() : 0)) * 37;
        Double d2 = this.f711y;
        int hashCode5 = (hashCode4 + (d2 != null ? d2.hashCode() : 0)) * 37;
        d dVar = this.f712z;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        l lVar = this.f706A;
        int hashCode7 = (hashCode6 + (lVar != null ? lVar.hashCode() : 0)) * 37;
        u8.h hVar = this.f707B;
        int hashCode8 = hashCode7 + (hVar != null ? hVar.hashCode() : 0);
        this.f3992u = hashCode8;
        return hashCode8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f708v;
        if (str != null) {
            sb.append(", string_value=");
            sb.append(com.bumptech.glide.f.n(str));
        }
        Boolean bool = this.f709w;
        if (bool != null) {
            sb.append(", bool_value=");
            sb.append(bool);
        }
        Long l9 = this.f710x;
        if (l9 != null) {
            sb.append(", int_value=");
            sb.append(l9);
        }
        Double d2 = this.f711y;
        if (d2 != null) {
            sb.append(", double_value=");
            sb.append(d2);
        }
        d dVar = this.f712z;
        if (dVar != null) {
            sb.append(", array_value=");
            sb.append(dVar);
        }
        l lVar = this.f706A;
        if (lVar != null) {
            sb.append(", kvlist_value=");
            sb.append(lVar);
        }
        u8.h hVar = this.f707B;
        if (hVar != null) {
            sb.append(", bytes_value=");
            sb.append(hVar);
        }
        StringBuilder replace = sb.replace(0, 2, "AnyValue{");
        replace.append('}');
        return replace.toString();
    }
}
