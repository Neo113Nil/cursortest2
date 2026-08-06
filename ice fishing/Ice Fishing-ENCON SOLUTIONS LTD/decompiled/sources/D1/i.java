package D1;

import F.C0042s;
import h1.C0239i;
import m1.EnumC0985a;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C.j f259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0042s f260b;

    public i(C.j jVar, C0042s c0042s) {
        this.f259a = jVar;
        this.f260b = c0042s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // D1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(e eVar, l1.d dVar) {
        h hVar;
        EnumC0985a enumC0985a;
        int i2;
        i iVar;
        u uVar;
        C0042s c0042s;
        E1.n nVar;
        Throwable th;
        E1.n nVar2;
        C0042s c0042s2;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i3 = hVar.f255e;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.f255e = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.f254d;
                    enumC0985a = EnumC0985a.f8194a;
                    i2 = hVar.f255e;
                    if (i2 != 0) {
                        R1.l.F(obj);
                        try {
                            C.j jVar = this.f259a;
                            hVar.f257g = this;
                            hVar.f258h = eVar;
                            hVar.f255e = 1;
                            if (jVar.r(eVar, hVar) == enumC0985a) {
                                return enumC0985a;
                            }
                            iVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            uVar = new u(th);
                            c0042s = iVar.f260b;
                            hVar.f257g = th;
                            hVar.f258h = null;
                            hVar.f255e = 2;
                            if (s.a(uVar, c0042s, th, hVar) != enumC0985a) {
                                return enumC0985a;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                Throwable th3 = (Throwable) hVar.f257g;
                                R1.l.F(obj);
                                throw th3;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar2 = (E1.n) hVar.f257g;
                            try {
                                R1.l.F(obj);
                                nVar2.h();
                                return C0239i.f3393a;
                            } catch (Throwable th4) {
                                th = th4;
                                nVar2.h();
                                throw th;
                            }
                        }
                        eVar = hVar.f258h;
                        iVar = (i) hVar.f257g;
                        try {
                            R1.l.F(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            uVar = new u(th);
                            c0042s = iVar.f260b;
                            hVar.f257g = th;
                            hVar.f258h = null;
                            hVar.f255e = 2;
                            if (s.a(uVar, c0042s, th, hVar) != enumC0985a) {
                            }
                        }
                    }
                    l1.i iVar2 = hVar.f8213b;
                    kotlin.jvm.internal.i.b(iVar2);
                    nVar = new E1.n(eVar, iVar2);
                    c0042s2 = iVar.f260b;
                    hVar.f257g = nVar;
                    hVar.f258h = null;
                    hVar.f255e = 3;
                    if (c0042s2.j(nVar, null, hVar) != enumC0985a) {
                        return enumC0985a;
                    }
                    nVar2 = nVar;
                    nVar2.h();
                    return C0239i.f3393a;
                }
            }
            c0042s2 = iVar.f260b;
            hVar.f257g = nVar;
            hVar.f258h = null;
            hVar.f255e = 3;
            if (c0042s2.j(nVar, null, hVar) != enumC0985a) {
            }
        } catch (Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.h();
            throw th;
        }
        hVar = new h(this, dVar);
        Object obj2 = hVar.f254d;
        enumC0985a = EnumC0985a.f8194a;
        i2 = hVar.f255e;
        if (i2 != 0) {
        }
        l1.i iVar22 = hVar.f8213b;
        kotlin.jvm.internal.i.b(iVar22);
        nVar = new E1.n(eVar, iVar22);
    }
}
