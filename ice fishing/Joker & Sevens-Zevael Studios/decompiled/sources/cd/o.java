package cd;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f1373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bd.e[] f1374h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1375i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f1376j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ad.e f1377k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bd.e[] eVarArr, int i10, AtomicInteger atomicInteger, ad.e eVar, fc.d dVar) {
        super(2, dVar);
        this.f1374h = eVarArr;
        this.f1375i = i10;
        this.f1376j = atomicInteger;
        this.f1377k = eVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        return new o(this.f1374h, this.f1375i, this.f1376j, this.f1377k, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f1373g;
        AtomicInteger atomicInteger = this.f1376j;
        ad.e eVar = this.f1377k;
        try {
            if (i10 == 0) {
                v6.a.W(obj);
                bd.e[] eVarArr = this.f1374h;
                int i11 = this.f1375i;
                bd.e eVar2 = eVarArr[i11];
                n nVar = new n(eVar, i11);
                this.f1373g = 1;
                Object c3 = eVar2.c(nVar, this);
                gc.a aVar = gc.a.f2559g;
                if (c3 == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                i7.b.q(eVar);
            }
            return ac.o.f277a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                i7.b.q(eVar);
            }
        }
    }
}
