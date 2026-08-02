package q2;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4869a {

    /* renamed from: a, reason: collision with root package name */
    public final String f40039a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40040b;

    public C4869a(String str, boolean z6) {
        this.f40039a = str;
        this.f40040b = z6;
    }

    public static String a() {
        throw null;
    }

    public final String toString() {
        String str = this.f40039a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.f40040b);
        return sb.toString();
    }
}
