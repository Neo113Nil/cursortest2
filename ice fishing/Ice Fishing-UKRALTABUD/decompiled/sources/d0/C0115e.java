package d0;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1805a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1806b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1807c;

    public C0115e(int i2, String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public C0115e(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public C0115e(String str, String str2, String str3, boolean z2) {
        this.f1805a = str;
        this.f1806b = str3.concat(str2);
        this.f1807c = z2;
    }
}
