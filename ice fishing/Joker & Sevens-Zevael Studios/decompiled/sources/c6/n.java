package c6;

import d8.s;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n implements y5.b {

    /* renamed from: a, reason: collision with root package name */
    public final zb.a f1284a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.a f1285b;

    /* renamed from: c, reason: collision with root package name */
    public final b6.g f1286c;

    /* renamed from: d, reason: collision with root package name */
    public final zb.a f1287d;

    public n(zb.a aVar, zb.a aVar2, b6.g gVar, zb.a aVar3) {
        this.f1284a = aVar;
        this.f1285b = aVar2;
        this.f1286c = gVar;
        this.f1287d = aVar3;
    }

    @Override // zb.a
    public final Object get() {
        Executor executor = (Executor) this.f1284a.get();
        d6.d dVar = (d6.d) this.f1285b.get();
        a5.c cVar = (a5.c) this.f1286c.get();
        e6.c cVar2 = (e6.c) this.f1287d.get();
        s sVar = new s();
        sVar.f1812g = executor;
        sVar.f1813h = dVar;
        sVar.f1814i = cVar;
        sVar.f1815j = cVar2;
        return sVar;
    }
}
