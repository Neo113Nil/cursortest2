package i5;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4584a {
    private final String bodyTextColor;
    private final String image;
    private final String titleTextColor;

    public C4584a() {
        this(null, null, null, 7, null);
    }

    public final String getBodyTextColor() {
        return this.bodyTextColor;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getTitleTextColor() {
        return this.titleTextColor;
    }

    public C4584a(String str, String str2, String str3) {
        this.image = str;
        this.titleTextColor = str2;
        this.bodyTextColor = str3;
    }

    public /* synthetic */ C4584a(String str, String str2, String str3, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
