package O0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class c extends P0.f {

    /* renamed from: h, reason: collision with root package name */
    public final U.j f758h;

    /* renamed from: i, reason: collision with root package name */
    public final U.j f759i;

    public c(U.j jVar, v0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f758h = jVar;
        this.f759i = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // P0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N0.p pVar, v0.d dVar) {
        b bVar;
        int i2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i3 = bVar.f757k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f757k = i3 - Integer.MIN_VALUE;
                Object obj = bVar.f755i;
                w0.a aVar = w0.a.f3076e;
                i2 = bVar.f757k;
                C0252g c0252g = C0252g.f2994a;
                if (i2 != 0) {
                    o.g.z(obj);
                    bVar.f754h = pVar;
                    bVar.f757k = 1;
                    Object f2 = this.f758h.f(pVar, bVar);
                    if (f2 != aVar) {
                        f2 = c0252g;
                    }
                    if (f2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = bVar.f754h;
                    o.g.z(obj);
                }
                if (((N0.o) pVar).f748h.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return c0252g;
            }
        }
        bVar = new b(this, (x0.b) dVar);
        Object obj2 = bVar.f755i;
        w0.a aVar2 = w0.a.f3076e;
        i2 = bVar.f757k;
        C0252g c0252g2 = C0252g.f2994a;
        if (i2 != 0) {
        }
        if (((N0.o) pVar).f748h.s()) {
        }
    }

    @Override // P0.f
    public final P0.f b(v0.i iVar, int i2, int i3) {
        return new c(this.f759i, iVar, i2, i3);
    }

    @Override // P0.f
    public final String toString() {
        return "block[" + this.f758h + "] -> " + super.toString();
    }
}
