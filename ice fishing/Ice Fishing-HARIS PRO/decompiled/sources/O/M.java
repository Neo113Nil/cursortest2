package O;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class M extends x1.g implements C1.p, D1.f {

    /* renamed from: b, reason: collision with root package name */
    public final int f753b;

    /* renamed from: c, reason: collision with root package name */
    public int f754c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f755d;
    public final /* synthetic */ View e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(View view, v1.d dVar) {
        super(dVar);
        this.e = view;
        this.f753b = 2;
    }

    @Override // C1.p
    public final Object d(Object obj, Object obj2) {
        return ((M) i((J1.g) obj, (v1.d) obj2)).k(t1.i.f4388c);
    }

    @Override // D1.f
    public final int f() {
        return this.f753b;
    }

    @Override // x1.a
    public final v1.d i(Object obj, v1.d dVar) {
        M m2 = new M(this.e, dVar);
        m2.f755d = obj;
        return m2;
    }

    @Override // x1.a
    public final Object k(Object obj) {
        Object obj2;
        Object obj3 = w1.a.f4662a;
        int i = this.f754c;
        View view = this.e;
        if (i == 0) {
            h0.f.D(obj);
            J1.g gVar = (J1.g) this.f755d;
            this.f755d = gVar;
            this.f754c = 1;
            gVar.f366b = view;
            gVar.f365a = 3;
            gVar.f368d = this;
            return obj3;
        }
        Object obj4 = t1.i.f4388c;
        if (i == 1) {
            J1.g gVar2 = (J1.g) this.f755d;
            h0.f.D(obj);
            if (view instanceof ViewGroup) {
                this.f755d = null;
                this.f754c = 2;
                gVar2.getClass();
                J1.m mVar = new J1.m(new D1.a(1, (ViewGroup) view));
                if (mVar.f376b.hasNext()) {
                    gVar2.f367c = mVar;
                    gVar2.f365a = 2;
                    gVar2.f368d = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0.f.D(obj);
        }
        return obj4;
    }

    @Override // x1.a
    public final String toString() {
        if (this.f4758a != null) {
            return super.toString();
        }
        D1.o.f171a.getClass();
        String a2 = D1.p.a(this);
        D1.i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
