package b6;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements y5.b {

    /* renamed from: a, reason: collision with root package name */
    public final zb.a f1031a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.a f1032b;

    /* renamed from: c, reason: collision with root package name */
    public final g f1033c;

    /* renamed from: d, reason: collision with root package name */
    public final zb.a f1034d;

    /* renamed from: e, reason: collision with root package name */
    public final zb.a f1035e;

    public d(zb.a aVar, zb.a aVar2, g gVar, zb.a aVar3, zb.a aVar4) {
        this.f1031a = aVar;
        this.f1032b = aVar2;
        this.f1033c = gVar;
        this.f1034d = aVar3;
        this.f1035e = aVar4;
    }

    @Override // zb.a
    public final Object get() {
        return new c((Executor) this.f1031a.get(), (x5.e) this.f1032b.get(), (a5.c) this.f1033c.get(), (d6.d) this.f1034d.get(), (e6.c) this.f1035e.get());
    }
}
