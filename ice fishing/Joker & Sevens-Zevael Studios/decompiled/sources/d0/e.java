package d0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1563a;

    static {
        c cVar = new c(50);
        f1563a = new d(cVar, cVar, cVar, cVar);
    }

    public static final d a(float f10) {
        b bVar = new b(f10);
        return new d(bVar, bVar, bVar, bVar);
    }

    public static d b(float f10, float f11) {
        return new d(new b(0), new b(0), new b(f10), new b(f11));
    }
}
