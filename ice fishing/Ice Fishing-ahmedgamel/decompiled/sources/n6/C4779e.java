package n6;

/* renamed from: n6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4779e {

    /* renamed from: c, reason: collision with root package name */
    public static final C4779e[] f39662c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4779e f39663d;

    /* renamed from: a, reason: collision with root package name */
    public final String f39664a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f39665b;

    static {
        C4779e[] c4779eArr = new C4779e[256];
        for (int i = 0; i < 256; i++) {
            c4779eArr[i] = new C4779e((byte) i);
        }
        f39662c = c4779eArr;
        f39663d = c4779eArr[0];
    }

    public C4779e(byte b9) {
        int i = b9 & 255;
        char[] cArr = k6.f.f38616a;
        this.f39664a = new String(new char[]{cArr[i], cArr[i | 256]});
        this.f39665b = b9;
    }

    public final String toString() {
        return this.f39664a;
    }
}
