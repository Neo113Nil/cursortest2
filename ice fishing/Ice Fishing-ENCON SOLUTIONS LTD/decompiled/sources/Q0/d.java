package Q0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1525b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1526c;

    public d(String str, String str2, int i2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public d(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public d(String str, String str2, String str3, boolean z2) {
        this.f1524a = str;
        this.f1525b = str3.concat(str2);
        this.f1526c = z2;
    }
}
