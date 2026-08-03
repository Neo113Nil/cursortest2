package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final x4.s f6790a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6791b;

    /* renamed from: c, reason: collision with root package name */
    public final i f6792c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.l1 f6793d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.l1 f6794e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f6795f;

    /* renamed from: g, reason: collision with root package name */
    public final n f6796g;

    /* renamed from: h, reason: collision with root package name */
    public final n f6797h;

    /* renamed from: i, reason: collision with root package name */
    public final n f6798i;

    /* renamed from: j, reason: collision with root package name */
    public final n f6799j;

    public c(Object obj, x4.s sVar, Float f10, int i10) {
        f10 = (i10 & 4) != 0 ? null : f10;
        this.f6790a = sVar;
        this.f6791b = f10;
        i iVar = new i(sVar, obj, null, 60);
        this.f6792c = iVar;
        this.f6793d = m0.z.s(Boolean.FALSE);
        this.f6794e = m0.z.s(obj);
        this.f6795f = new l0();
        new o0(1.0f, 1500.0f, f10);
        n nVar = iVar.f6858i;
        boolean z10 = nVar instanceof j;
        n nVar2 = z10 ? d.f6814e : nVar instanceof k ? d.f6815f : nVar instanceof l ? d.f6816g : d.f6817h;
        this.f6796g = nVar2;
        n nVar3 = z10 ? d.f6810a : nVar instanceof k ? d.f6811b : nVar instanceof l ? d.f6812c : d.f6813d;
        this.f6797h = nVar3;
        this.f6798i = nVar2;
        this.f6799j = nVar3;
    }

    public static final Object a(c cVar, Object obj) {
        x4.s sVar = cVar.f6790a;
        n nVar = cVar.f6799j;
        n nVar2 = cVar.f6798i;
        if (!pc.j.a(nVar2, cVar.f6796g) || !pc.j.a(nVar, cVar.f6797h)) {
            n nVar3 = (n) ((oc.c) sVar.f8356h).invoke(obj);
            int b2 = nVar3.b();
            boolean z10 = false;
            for (int i10 = 0; i10 < b2; i10++) {
                if (nVar3.a(i10) < nVar2.a(i10) || nVar3.a(i10) > nVar.a(i10)) {
                    nVar3.e(i10, uc.e.g(nVar3.a(i10), nVar2.a(i10), nVar.a(i10)));
                    z10 = true;
                }
            }
            if (z10) {
                return ((oc.c) sVar.f8357i).invoke(nVar3);
            }
        }
        return obj;
    }

    public static final void b(c cVar) {
        i iVar = cVar.f6792c;
        iVar.f6858i.d();
        iVar.f6859j = Long.MIN_VALUE;
        cVar.f6793d.setValue(Boolean.FALSE);
    }

    public static Object c(c cVar, Object obj, h hVar, oc.c cVar2, fc.d dVar, int i10) {
        Object invoke = ((oc.c) cVar.f6790a.f8357i).invoke(cVar.f6792c.f6858i);
        oc.c cVar3 = (i10 & 8) != 0 ? null : cVar2;
        Object d10 = cVar.d();
        x4.s sVar = cVar.f6790a;
        return l0.a(cVar.f6795f, new a(cVar, invoke, new w0(hVar, sVar, d10, obj, (n) ((oc.c) sVar.f8356h).invoke(invoke)), cVar.f6792c.f6859j, cVar3, null), dVar);
    }

    public final Object d() {
        return this.f6792c.f6857h.getValue();
    }

    public final Object e(Object obj, hc.j jVar) {
        Object a6 = l0.a(this.f6795f, new b(this, obj, null), jVar);
        return a6 == gc.a.f2559g ? a6 : ac.o.f277a;
    }
}
