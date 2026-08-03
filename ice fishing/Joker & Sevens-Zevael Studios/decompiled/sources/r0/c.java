package r0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class c extends bc.f {

    /* renamed from: i, reason: collision with root package name */
    public static final c f5901i = new c(k.f5916e, 0);

    /* renamed from: g, reason: collision with root package name */
    public final k f5902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5903h;

    public c(k kVar, int i10) {
        this.f5902g = kVar;
        this.f5903h = i10;
    }

    public final c a(Object obj, s0.a aVar) {
        e3.j u10 = this.f5902g.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u10 == null ? this : new c((k) u10.f2092c, this.f5903h + u10.f2091b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5902g.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f5902g.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
