package V7;

import W7.w;
import u7.v;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class f implements c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3463n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3464u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f3465v;

    /* renamed from: w, reason: collision with root package name */
    public final B7.h f3466w;

    public f(kotlin.jvm.internal.p pVar, c cVar, X.o oVar) {
        this.f3464u = pVar;
        this.f3465v = cVar;
        this.f3466w = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // V7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5240d interfaceC5240d) {
        e eVar;
        int i;
        f fVar;
        switch (this.f3463n) {
            case 0:
                if (interfaceC5240d instanceof e) {
                    eVar = (e) interfaceC5240d;
                    int i4 = eVar.f3462x;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        eVar.f3462x = i4 - Integer.MIN_VALUE;
                        Object obj2 = eVar.f3460v;
                        A7.a aVar = A7.a.f215n;
                        i = eVar.f3462x;
                        v vVar = v.f41073a;
                        if (i != 0) {
                            Q3.b.s(obj2);
                            if (((kotlin.jvm.internal.p) this.f3464u).f38642n) {
                                eVar.f3462x = 1;
                                if (((c) this.f3465v).a(obj, eVar) == aVar) {
                                    return aVar;
                                }
                                return vVar;
                            }
                            eVar.f3458n = this;
                            eVar.f3459u = obj;
                            eVar.f3462x = 2;
                            obj2 = ((X.o) this.f3466w).invoke(obj, eVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            fVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return vVar;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                obj = eVar.f3459u;
                                fVar = eVar.f3458n;
                                Q3.b.s(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.p) fVar.f3464u).f38642n = true;
                                    eVar.f3458n = null;
                                    eVar.f3459u = null;
                                    eVar.f3462x = 3;
                                    if (((c) fVar.f3465v).a(obj, eVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return vVar;
                            }
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        Q3.b.s(obj2);
                        return vVar;
                    }
                }
                eVar = new e(this, interfaceC5240d);
                Object obj22 = eVar.f3460v;
                A7.a aVar2 = A7.a.f215n;
                i = eVar.f3462x;
                v vVar2 = v.f41073a;
                if (i != 0) {
                }
            default:
                Object a9 = W7.o.a((InterfaceC5245i) this.f3464u, obj, this.f3465v, (w) this.f3466w, interfaceC5240d);
                return a9 == A7.a.f215n ? a9 : v.f41073a;
        }
    }

    public f(c cVar, InterfaceC5245i interfaceC5245i) {
        this.f3464u = interfaceC5245i;
        this.f3465v = X7.a.l(interfaceC5245i);
        this.f3466w = new w(cVar, null);
    }
}
