package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class w implements v {

    /* renamed from: g, reason: collision with root package name */
    public final u0.a f7619g = new u0.a(0);

    public final boolean e(int i10) {
        return (i10 & this.f7619g.get()) != 0;
    }

    public final void f(int i10) {
        u0.a aVar;
        int i11;
        do {
            aVar = this.f7619g;
            i11 = aVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i11, i11 | i10));
    }
}
