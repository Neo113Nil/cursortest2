package C1;

import A1.C0005f;
import A1.C0019u;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f185a = new i();

    public static c a(int i2, int i3, int i4) {
        c nVar;
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new n(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? i3 == 1 ? new c(i2, null) : new n(i2, i3, null) : new c(Integer.MAX_VALUE, null);
            }
            nVar = i3 == 1 ? new c(0, null) : new n(1, i3, null);
        } else if (i3 == 1) {
            g.f183N.getClass();
            nVar = new c(f.f182b, null);
        } else {
            nVar = new n(1, i3, null);
        }
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [t1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(r rVar, H.b bVar, AbstractC0991b abstractC0991b) {
        o oVar;
        int i2;
        try {
            if (abstractC0991b instanceof o) {
                oVar = (o) abstractC0991b;
                int i3 = oVar.f192f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f192f = i3 - Integer.MIN_VALUE;
                    Object obj = oVar.f191e;
                    EnumC0985a enumC0985a = EnumC0985a.f8194a;
                    i2 = oVar.f192f;
                    if (i2 != 0) {
                        R1.l.F(obj);
                        l1.i iVar = oVar.f8213b;
                        kotlin.jvm.internal.i.b(iVar);
                        if (iVar.m(C0019u.f73b) != rVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        oVar.f190d = bVar;
                        oVar.f192f = 1;
                        C0005f c0005f = new C0005f(1, R1.d.t(oVar));
                        c0005f.u();
                        ((q) rVar).W(new p(0, c0005f));
                        bVar = bVar;
                        if (c0005f.t() == enumC0985a) {
                            return enumC0985a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = oVar.f190d;
                        R1.l.F(obj);
                        bVar = r5;
                    }
                    bVar.invoke();
                    return C0239i.f3393a;
                }
            }
            if (i2 != 0) {
            }
            bVar.invoke();
            return C0239i.f3393a;
        } catch (Throwable th) {
            bVar.invoke();
            throw th;
        }
        oVar = new o(abstractC0991b);
        Object obj2 = oVar.f191e;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = oVar.f192f;
    }
}
