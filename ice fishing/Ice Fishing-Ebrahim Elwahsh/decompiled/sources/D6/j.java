package D6;

import Y5.n;

/* loaded from: classes2.dex */
public final class j extends Y5.f {

    /* renamed from: x, reason: collision with root package name */
    public static final i f725x;

    /* renamed from: v, reason: collision with root package name */
    public final String f726v;

    /* renamed from: w, reason: collision with root package name */
    public final b f727w;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f725x = new i(j.class);
    }

    public j(String str, b bVar, u8.h hVar) {
        super(f725x, hVar);
        if (str == null) {
            throw new IllegalArgumentException("key == null");
        }
        this.f726v = str;
        this.f727w = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return a().equals(jVar.a()) && com.bumptech.glide.f.f(this.f726v, jVar.f726v) && com.bumptech.glide.f.f(this.f727w, jVar.f727w);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f726v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        b bVar = this.f727w;
        int hashCode3 = hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        this.f3992u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f726v;
        if (str != null) {
            sb.append(", key=");
            sb.append(com.bumptech.glide.f.n(str));
        }
        b bVar = this.f727w;
        if (bVar != null) {
            sb.append(", value=");
            sb.append(bVar);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValue{");
        replace.append('}');
        return replace.toString();
    }
}
