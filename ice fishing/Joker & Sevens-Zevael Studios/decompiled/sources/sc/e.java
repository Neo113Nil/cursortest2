package sc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: g, reason: collision with root package name */
    public static final d f6475g = new d();

    /* renamed from: h, reason: collision with root package name */
    public static final a f6476h;

    static {
        Integer num = lc.a.f4253a;
        f6476h = (num == null || num.intValue() >= 34) ? new tc.a() : new c();
    }

    public abstract int a();

    public int b() {
        int a6;
        int i10;
        do {
            a6 = a() >>> 1;
            i10 = a6 % 10;
        } while ((a6 - i10) + 9 < 0);
        return i10;
    }
}
