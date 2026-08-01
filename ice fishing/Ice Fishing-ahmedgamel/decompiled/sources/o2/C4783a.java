package o2;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4783a {

    /* renamed from: a, reason: collision with root package name */
    public final String f39556a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39557b;

    public C4783a(String str, boolean z3) {
        this.f39556a = str;
        this.f39557b = z3;
    }

    public static String a() {
        throw null;
    }

    public final String toString() {
        String str = this.f39556a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.f39557b);
        return sb.toString();
    }
}
