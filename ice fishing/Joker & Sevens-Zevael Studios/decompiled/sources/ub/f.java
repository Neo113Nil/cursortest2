package ub;

import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import d.o;
import p6.i;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i f6728d = new i();

    /* renamed from: a, reason: collision with root package name */
    public final yb.b f6729a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f6730b;

    /* renamed from: c, reason: collision with root package name */
    public final c f6731c;

    public f(yb.b bVar, v0 v0Var, s sVar) {
        this.f6729a = bVar;
        this.f6730b = v0Var;
        this.f6731c = new c(0, sVar);
    }

    public static f d(o oVar, v0 v0Var) {
        hd.c cVar = (hd.c) ((d) v6.a.E(oVar, d.class));
        return new f(cVar.a(), v0Var, new s(3, cVar.f2880a, cVar.f2881b));
    }

    @Override // androidx.lifecycle.v0
    public final t0 a(Class cls) {
        if (this.f6729a.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.f6730b.a(cls);
    }

    @Override // androidx.lifecycle.v0
    public final t0 b(Class cls, x3.c cVar) {
        return this.f6729a.containsKey(cls) ? this.f6731c.b(cls, cVar) : this.f6730b.b(cls, cVar);
    }
}
