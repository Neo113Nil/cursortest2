package d0;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1814b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1815c;

    public C0115e(int i2, String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public C0115e(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public C0115e(String str, String str2, String str3, boolean z2) {
        this.f1813a = str;
        this.f1814b = str3.concat(str2);
        this.f1815c = z2;
    }
}
