package O0;

import D.C0017s;
import t0.C0252g;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A.j f774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0017s f775f;

    public i(A.j jVar, C0017s c0017s) {
        this.f774e = jVar;
        this.f775f = c0017s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // O0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(e eVar, v0.d dVar) {
        h hVar;
        w0.a aVar;
        int i2;
        i iVar;
        t tVar;
        C0017s c0017s;
        P0.n nVar;
        Throwable th;
        P0.n nVar2;
        C0017s c0017s2;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i3 = hVar.f770i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.f770i = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.f769h;
                    aVar = w0.a.f3076e;
                    i2 = hVar.f770i;
                    if (i2 != 0) {
                        o.g.z(obj);
                        try {
                            A.j jVar = this.f774e;
                            hVar.f772k = this;
                            hVar.f773l = eVar;
                            hVar.f770i = 1;
                            if (jVar.c(eVar, hVar) == aVar) {
                                return aVar;
                            }
                            iVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            tVar = new t(th);
                            c0017s = iVar.f775f;
                            hVar.f772k = th;
                            hVar.f773l = null;
                            hVar.f770i = 2;
                            if (r.a(tVar, c0017s, th, hVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                Throwable th3 = (Throwable) hVar.f772k;
                                o.g.z(obj);
                                throw th3;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar2 = (P0.n) hVar.f772k;
                            try {
                                o.g.z(obj);
                                nVar2.o();
                                return C0252g.f2994a;
                            } catch (Throwable th4) {
                                th = th4;
                                nVar2.o();
                                throw th;
                            }
                        }
                        eVar = hVar.f773l;
                        iVar = (i) hVar.f772k;
                        try {
                            o.g.z(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            tVar = new t(th);
                            c0017s = iVar.f775f;
                            hVar.f772k = th;
                            hVar.f773l = null;
                            hVar.f770i = 2;
                            if (r.a(tVar, c0017s, th, hVar) != aVar) {
                            }
                        }
                    }
                    v0.i iVar2 = hVar.f3091f;
                    E0.i.b(iVar2);
                    nVar = new P0.n(eVar, iVar2);
                    c0017s2 = iVar.f775f;
                    hVar.f772k = nVar;
                    hVar.f773l = null;
                    hVar.f770i = 3;
                    if (c0017s2.p(nVar, null, hVar) != aVar) {
                        return aVar;
                    }
                    nVar2 = nVar;
                    nVar2.o();
                    return C0252g.f2994a;
                }
            }
            c0017s2 = iVar.f775f;
            hVar.f772k = nVar;
            hVar.f773l = null;
            hVar.f770i = 3;
            if (c0017s2.p(nVar, null, hVar) != aVar) {
            }
        } catch (Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.o();
            throw th;
        }
        hVar = new h(this, dVar);
        Object obj2 = hVar.f769h;
        aVar = w0.a.f3076e;
        i2 = hVar.f770i;
        if (i2 != 0) {
        }
        v0.i iVar22 = hVar.f3091f;
        E0.i.b(iVar22);
        nVar = new P0.n(eVar, iVar22);
    }
}
