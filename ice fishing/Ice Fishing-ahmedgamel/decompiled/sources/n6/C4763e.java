package n6;

/* renamed from: n6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4763e {

    /* renamed from: c, reason: collision with root package name */
    public static final C4763e[] f39495c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4763e f39496d;

    /* renamed from: a, reason: collision with root package name */
    public final String f39497a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f39498b;

    static {
        C4763e[] c4763eArr = new C4763e[256];
        for (int i = 0; i < 256; i++) {
            c4763eArr[i] = new C4763e((byte) i);
        }
        f39495c = c4763eArr;
        f39496d = c4763eArr[0];
    }

    public C4763e(byte b9) {
        int i = b9 & 255;
        char[] cArr = k6.f.f38689a;
        this.f39497a = new String(new char[]{cArr[i], cArr[i | 256]});
        this.f39498b = b9;
    }

    public final String toString() {
        return this.f39497a;
    }
}
