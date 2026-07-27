package g6;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b6.b f37931a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37933c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f37934d;

    public e(b6.b bVar, String str) {
        this.f37931a = bVar;
        this.f37932b = str;
        this.f37933c = ((bVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static e a(b6.b bVar, String str) {
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
            if (this.f37931a.equals(eVar.f37931a) && this.f37932b.equals(eVar.f37932b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37933c;
    }

    public final String toString() {
        return this.f37932b;
    }
}
