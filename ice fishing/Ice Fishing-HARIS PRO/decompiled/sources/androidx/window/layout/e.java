package androidx.window.layout;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f2223c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f2224d;
    public static final e e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f2225f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f2226g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f2227h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2229b;

    static {
        int i = 0;
        f2223c = new e("VERTICAL", i);
        f2224d = new e("HORIZONTAL", i);
        int i2 = 1;
        e = new e("FLAT", i2);
        f2225f = new e("HALF_OPENED", i2);
        int i3 = 2;
        f2226g = new e("FOLD", i3);
        f2227h = new e("HINGE", i3);
    }

    public /* synthetic */ e(String str, int i) {
        this.f2228a = i;
        this.f2229b = str;
    }

    public final String toString() {
        switch (this.f2228a) {
        }
        return this.f2229b;
    }
}
