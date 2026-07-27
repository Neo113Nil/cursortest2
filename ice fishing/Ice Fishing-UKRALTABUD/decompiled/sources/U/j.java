package U;

import D0.p;
import android.app.Activity;

/* loaded from: classes.dex */
public final class j extends x0.f implements p {

    /* renamed from: j, reason: collision with root package name */
    public int f1030j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1031k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f1032l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Activity f1033m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Activity activity, v0.d dVar) {
        super(2, dVar);
        this.f1032l = bVar;
        this.f1033m = activity;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((j) l((M0.p) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        j jVar = new j(this.f1032l, this.f1033m, dVar);
        jVar.f1031k = obj;
        return jVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f1030j;
        if (i2 == 0) {
            o.g.C(obj);
            M0.p pVar = (M0.p) this.f1031k;
            i iVar = new i(0, pVar);
            b bVar = this.f1032l;
            ((V.a) bVar.f1014g).b(this.f1033m, new J.d(), iVar);
            F.b bVar2 = new F.b(1, bVar, iVar);
            this.f1030j = 1;
            if (M0.i.b(pVar, bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return t0.g.f2989a;
    }
}
