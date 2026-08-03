package androidx.lifecycle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final w f712g;

    /* renamed from: h, reason: collision with root package name */
    public final o f713h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f714i;

    public s0(w wVar, o oVar) {
        pc.j.e(wVar, "registry");
        pc.j.e(oVar, "event");
        this.f712g = wVar;
        this.f713h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f714i) {
            return;
        }
        this.f712g.d(this.f713h);
        this.f714i = true;
    }
}
