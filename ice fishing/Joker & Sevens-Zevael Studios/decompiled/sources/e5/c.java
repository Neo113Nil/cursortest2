package e5;

import ac.o;
import bd.f;
import fc.i;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f2113h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f2114i;

    public /* synthetic */ c(f fVar, i iVar, int i10) {
        this.f2112g = i10;
        this.f2113h = fVar;
        this.f2114i = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    @Override // bd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, fc.d dVar) {
        b bVar;
        Object obj2;
        int i10;
        gc.a aVar;
        f fVar;
        e eVar;
        Object obj3;
        int i11;
        gc.a aVar2;
        f fVar2;
        switch (this.f2112g) {
            case 0:
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i12 = bVar.f2109h;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        bVar.f2109h = i12 - Integer.MIN_VALUE;
                        obj2 = bVar.f2108g;
                        i10 = bVar.f2109h;
                        fc.d dVar2 = null;
                        aVar = gc.a.f2559g;
                        if (i10 != 0) {
                            v6.a.W(obj2);
                            d dVar3 = new d((c5.b) obj, dVar2, 0);
                            fVar = this.f2113h;
                            bVar.f2110i = fVar;
                            bVar.f2109h = 1;
                            obj2 = a0.A(this.f2114i, dVar3, bVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                v6.a.W(obj2);
                                return o.f277a;
                            }
                            fVar = bVar.f2110i;
                            v6.a.W(obj2);
                        }
                        bVar.f2110i = null;
                        bVar.f2109h = 2;
                        if (fVar.a(obj2, bVar) == aVar) {
                            return aVar;
                        }
                        return o.f277a;
                    }
                }
                bVar = new b(this, dVar);
                obj2 = bVar.f2108g;
                i10 = bVar.f2109h;
                fc.d dVar22 = null;
                aVar = gc.a.f2559g;
                if (i10 != 0) {
                }
                bVar.f2110i = null;
                bVar.f2109h = 2;
                if (fVar.a(obj2, bVar) == aVar) {
                }
                return o.f277a;
            default:
                if (dVar instanceof e) {
                    eVar = (e) dVar;
                    int i13 = eVar.f2119h;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        eVar.f2119h = i13 - Integer.MIN_VALUE;
                        obj3 = eVar.f2118g;
                        i11 = eVar.f2119h;
                        fc.d dVar4 = null;
                        aVar2 = gc.a.f2559g;
                        if (i11 != 0) {
                            v6.a.W(obj3);
                            d dVar5 = new d((c5.b) obj, dVar4, 1);
                            fVar2 = this.f2113h;
                            eVar.f2120i = fVar2;
                            eVar.f2119h = 1;
                            obj3 = a0.A(this.f2114i, dVar5, eVar);
                            if (obj3 == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                v6.a.W(obj3);
                                return o.f277a;
                            }
                            fVar2 = eVar.f2120i;
                            v6.a.W(obj3);
                        }
                        eVar.f2120i = null;
                        eVar.f2119h = 2;
                        if (fVar2.a(obj3, eVar) == aVar2) {
                            return aVar2;
                        }
                        return o.f277a;
                    }
                }
                eVar = new e(this, dVar);
                obj3 = eVar.f2118g;
                i11 = eVar.f2119h;
                fc.d dVar42 = null;
                aVar2 = gc.a.f2559g;
                if (i11 != 0) {
                }
                eVar.f2120i = null;
                eVar.f2119h = 2;
                if (fVar2.a(obj3, eVar) == aVar2) {
                }
                return o.f277a;
        }
    }
}
