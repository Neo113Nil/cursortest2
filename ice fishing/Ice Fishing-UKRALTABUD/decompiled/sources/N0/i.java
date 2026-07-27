package N0;

import D.C0017s;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A.j f766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0017s f767g;

    public i(A.j jVar, C0017s c0017s) {
        this.f766f = jVar;
        this.f767g = c0017s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // N0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(e eVar, v0.d dVar) {
        h hVar;
        w0.a aVar;
        int i2;
        i iVar;
        t tVar;
        C0017s c0017s;
        O0.n nVar;
        Throwable th;
        O0.n nVar2;
        C0017s c0017s2;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i3 = hVar.f762j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.f762j = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.f761i;
                    aVar = w0.a.f3071f;
                    i2 = hVar.f762j;
                    if (i2 != 0) {
                        o.g.C(obj);
                        try {
                            A.j jVar = this.f766f;
                            hVar.f764l = this;
                            hVar.f765m = eVar;
                            hVar.f762j = 1;
                            if (jVar.n(eVar, hVar) == aVar) {
                                return aVar;
                            }
                            iVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            tVar = new t(th);
                            c0017s = iVar.f767g;
                            hVar.f764l = th;
                            hVar.f765m = null;
                            hVar.f762j = 2;
                            if (r.a(tVar, c0017s, th, hVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                Throwable th3 = (Throwable) hVar.f764l;
                                o.g.C(obj);
                                throw th3;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar2 = (O0.n) hVar.f764l;
                            try {
                                o.g.C(obj);
                                nVar2.o();
                                return t0.g.f2989a;
                            } catch (Throwable th4) {
                                th = th4;
                                nVar2.o();
                                throw th;
                            }
                        }
                        eVar = hVar.f765m;
                        iVar = (i) hVar.f764l;
                        try {
                            o.g.C(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            tVar = new t(th);
                            c0017s = iVar.f767g;
                            hVar.f764l = th;
                            hVar.f765m = null;
                            hVar.f762j = 2;
                            if (r.a(tVar, c0017s, th, hVar) != aVar) {
                            }
                        }
                    }
                    v0.i iVar2 = hVar.f3086g;
                    E0.i.b(iVar2);
                    nVar = new O0.n(eVar, iVar2);
                    c0017s2 = iVar.f767g;
                    hVar.f764l = nVar;
                    hVar.f765m = null;
                    hVar.f762j = 3;
                    if (c0017s2.p(nVar, null, hVar) != aVar) {
                        return aVar;
                    }
                    nVar2 = nVar;
                    nVar2.o();
                    return t0.g.f2989a;
                }
            }
            c0017s2 = iVar.f767g;
            hVar.f764l = nVar;
            hVar.f765m = null;
            hVar.f762j = 3;
            if (c0017s2.p(nVar, null, hVar) != aVar) {
            }
        } catch (Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.o();
            throw th;
        }
        hVar = new h(this, dVar);
        Object obj2 = hVar.f761i;
        aVar = w0.a.f3071f;
        i2 = hVar.f762j;
        if (i2 != 0) {
        }
        v0.i iVar22 = hVar.f3086g;
        E0.i.b(iVar22);
        nVar = new O0.n(eVar, iVar22);
    }
}
