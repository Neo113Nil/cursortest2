package o6;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f5231a;

    public a0(d dVar) {
        this.f5231a = dVar;
    }

    @Override // o6.b
    public final void a(boolean z10) {
        a7.c cVar = this.f5231a.f5267m;
        cVar.sendMessage(cVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
