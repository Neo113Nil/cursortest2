package U;

import D0.p;
import android.app.Activity;
import t0.C0252g;

/* loaded from: classes.dex */
public final class j extends x0.f implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f1038i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1039j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f1040k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f1041l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Activity activity, v0.d dVar) {
        super(2, dVar);
        this.f1040k = bVar;
        this.f1041l = activity;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((j) l((N0.p) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        j jVar = new j(this.f1040k, this.f1041l, dVar);
        jVar.f1039j = obj;
        return jVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f1038i;
        if (i2 == 0) {
            o.g.z(obj);
            N0.p pVar = (N0.p) this.f1039j;
            i iVar = new i(0, pVar);
            b bVar = this.f1040k;
            ((V.a) bVar.f1022f).b(this.f1041l, new J.d(), iVar);
            F.b bVar2 = new F.b(1, bVar, iVar);
            this.f1038i = 1;
            if (N0.i.b(pVar, bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return C0252g.f2994a;
    }
}
