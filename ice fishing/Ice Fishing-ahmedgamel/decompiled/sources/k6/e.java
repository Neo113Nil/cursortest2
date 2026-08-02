package k6;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f6.b f38612a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38613b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38614c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f38615d;

    public e(f6.b bVar, String str) {
        this.f38612a = bVar;
        this.f38613b = str;
        this.f38614c = ((bVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static e a(f6.b bVar, String str) {
        if (str == null) {
            str = "";
        }
        return new e(bVar, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f38612a.equals(eVar.f38612a) && this.f38613b.equals(eVar.f38613b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38614c;
    }

    public final String toString() {
        return this.f38613b;
    }
}
