package w5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements p7.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7671a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final p7.c f7672b = new p7.c("logSource", a4.d.n(a4.d.m(s7.e.class, new s7.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final p7.c f7673c = new p7.c("logEventDropped", a4.d.n(a4.d.m(s7.e.class, new s7.a(2))));

    @Override // p7.a
    public final void a(Object obj, Object obj2) {
        z5.e eVar = (z5.e) obj;
        p7.e eVar2 = (p7.e) obj2;
        eVar2.a(f7672b, eVar.f9152a);
        eVar2.a(f7673c, eVar.f9153b);
    }
}
