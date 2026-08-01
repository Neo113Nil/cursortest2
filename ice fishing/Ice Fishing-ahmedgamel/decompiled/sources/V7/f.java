package V7;

import W7.w;
import u7.v;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class f implements c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3333n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3334u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f3335v;

    /* renamed from: w, reason: collision with root package name */
    public final B7.h f3336w;

    public f(kotlin.jvm.internal.p pVar, c cVar, X.o oVar) {
        this.f3334u = pVar;
        this.f3335v = cVar;
        this.f3336w = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // V7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5267d interfaceC5267d) {
        e eVar;
        int i;
        f fVar;
        switch (this.f3333n) {
            case 0:
                if (interfaceC5267d instanceof e) {
                    eVar = (e) interfaceC5267d;
                    int i6 = eVar.f3332x;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        eVar.f3332x = i6 - Integer.MIN_VALUE;
                        Object obj2 = eVar.f3330v;
                        A7.a aVar = A7.a.f58n;
                        i = eVar.f3332x;
                        v vVar = v.f41353a;
                        if (i != 0) {
                            com.bumptech.glide.d.k(obj2);
                            if (((kotlin.jvm.internal.p) this.f3334u).f38715n) {
                                eVar.f3332x = 1;
                                if (((c) this.f3335v).a(obj, eVar) == aVar) {
                                    return aVar;
                                }
                                return vVar;
                            }
                            eVar.f3328n = this;
                            eVar.f3329u = obj;
                            eVar.f3332x = 2;
                            obj2 = ((X.o) this.f3336w).invoke(obj, eVar);
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
                                obj = eVar.f3329u;
                                fVar = eVar.f3328n;
                                com.bumptech.glide.d.k(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.p) fVar.f3334u).f38715n = true;
                                    eVar.f3328n = null;
                                    eVar.f3329u = null;
                                    eVar.f3332x = 3;
                                    if (((c) fVar.f3335v).a(obj, eVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return vVar;
                            }
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        com.bumptech.glide.d.k(obj2);
                        return vVar;
                    }
                }
                eVar = new e(this, interfaceC5267d);
                Object obj22 = eVar.f3330v;
                A7.a aVar2 = A7.a.f58n;
                i = eVar.f3332x;
                v vVar2 = v.f41353a;
                if (i != 0) {
                }
            default:
                Object a9 = W7.o.a((InterfaceC5272i) this.f3334u, obj, this.f3335v, (w) this.f3336w, interfaceC5267d);
                return a9 == A7.a.f58n ? a9 : v.f41353a;
        }
    }

    public f(c cVar, InterfaceC5272i interfaceC5272i) {
        this.f3334u = interfaceC5272i;
        this.f3335v = X7.a.l(interfaceC5272i);
        this.f3336w = new w(cVar, null);
    }
}
