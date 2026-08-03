package z3;

import fc.i;
import pc.j;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, y {

    /* renamed from: g, reason: collision with root package name */
    public final i f9099g;

    public a(i iVar) {
        j.e(iVar, "coroutineContext");
        this.f9099g = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a0.c(this.f9099g, null);
    }

    @Override // yc.y
    public final i f() {
        return this.f9099g;
    }
}
