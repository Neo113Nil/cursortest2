package N0;

/* loaded from: classes.dex */
public final class c extends O0.f {

    /* renamed from: i, reason: collision with root package name */
    public final U.j f750i;

    /* renamed from: j, reason: collision with root package name */
    public final U.j f751j;

    public c(U.j jVar, v0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f750i = jVar;
        this.f751j = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // O0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(M0.p pVar, v0.d dVar) {
        b bVar;
        int i2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i3 = bVar.f749l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f749l = i3 - Integer.MIN_VALUE;
                Object obj = bVar.f747j;
                w0.a aVar = w0.a.f3071f;
                i2 = bVar.f749l;
                t0.g gVar = t0.g.f2989a;
                if (i2 != 0) {
                    o.g.C(obj);
                    bVar.f746i = pVar;
                    bVar.f749l = 1;
                    Object f2 = this.f750i.f(pVar, bVar);
                    if (f2 != aVar) {
                        f2 = gVar;
                    }
                    if (f2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = bVar.f746i;
                    o.g.C(obj);
                }
                if (((M0.o) pVar).f740i.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return gVar;
            }
        }
        bVar = new b(this, (x0.b) dVar);
        Object obj2 = bVar.f747j;
        w0.a aVar2 = w0.a.f3071f;
        i2 = bVar.f749l;
        t0.g gVar2 = t0.g.f2989a;
        if (i2 != 0) {
        }
        if (((M0.o) pVar).f740i.s()) {
        }
    }

    @Override // O0.f
    public final O0.f b(v0.i iVar, int i2, int i3) {
        return new c(this.f751j, iVar, i2, i3);
    }

    @Override // O0.f
    public final String toString() {
        return "block[" + this.f750i + "] -> " + super.toString();
    }
}
