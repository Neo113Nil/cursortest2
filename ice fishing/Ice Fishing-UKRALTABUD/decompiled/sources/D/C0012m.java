package D;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m extends x0.f implements D0.l {

    /* renamed from: j, reason: collision with root package name */
    public Object f233j;

    /* renamed from: k, reason: collision with root package name */
    public Serializable f234k;

    /* renamed from: l, reason: collision with root package name */
    public Object f235l;

    /* renamed from: m, reason: collision with root package name */
    public Object f236m;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f237n;

    /* renamed from: o, reason: collision with root package name */
    public int f238o;

    /* renamed from: p, reason: collision with root package name */
    public int f239p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ S f240q;
    public final /* synthetic */ C0013n r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012m(S s2, C0013n c0013n, v0.d dVar) {
        super(1, dVar);
        this.f240q = s2;
        this.r = c0013n;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        return new C0012m(this.f240q, this.r, (v0.d) obj).n(t0.g.f2989a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // x0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        S0.a a2;
        E0.n nVar;
        E0.p pVar;
        E0.p pVar2;
        Iterator it;
        S0.a aVar;
        E0.n nVar2;
        E0.p pVar3;
        C0011l c0011l;
        S0.d dVar;
        E0.p pVar4;
        E0.n nVar3;
        Object obj2;
        Object obj3;
        Integer a3;
        int i2;
        w0.a aVar2 = w0.a.f3071f;
        int i3 = this.f239p;
        C0013n c0013n = this.r;
        S s2 = this.f240q;
        if (i3 == 0) {
            o.g.C(obj);
            a2 = S0.e.a();
            nVar = new E0.n();
            pVar = new E0.p();
            this.f233j = a2;
            this.f234k = nVar;
            this.f235l = pVar;
            this.f236m = pVar;
            this.f239p = 1;
            obj = S.e(s2, true, this);
            if (obj == aVar2) {
                return aVar2;
            }
            pVar2 = pVar;
        } else if (i3 == 1) {
            pVar = (E0.p) this.f236m;
            pVar2 = (E0.p) this.f235l;
            nVar = (E0.n) this.f234k;
            a2 = (S0.a) this.f233j;
            o.g.C(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f238o;
                    obj3 = this.f233j;
                    o.g.C(obj);
                    return new C0003d(obj3, i2, ((Number) obj).intValue());
                }
                Object obj4 = (S0.a) this.f235l;
                pVar4 = (E0.p) this.f234k;
                nVar3 = (E0.n) this.f233j;
                o.g.C(obj);
                obj2 = obj4;
                try {
                    nVar3.f310f = true;
                    ((S0.d) obj2).e(null);
                    obj3 = pVar4.f312f;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    l0 f2 = s2.f();
                    this.f233j = obj3;
                    this.f234k = null;
                    this.f235l = null;
                    this.f238o = hashCode;
                    this.f239p = 4;
                    a3 = f2.a();
                    if (a3 != aVar2) {
                        return aVar2;
                    }
                    i2 = hashCode;
                    obj = a3;
                    return new C0003d(obj3, i2, ((Number) obj).intValue());
                } catch (Throwable th) {
                    ((S0.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f237n;
            c0011l = (C0011l) this.f236m;
            pVar3 = (E0.p) this.f235l;
            nVar2 = (E0.n) this.f234k;
            aVar = (S0.a) this.f233j;
            o.g.C(obj);
            while (it.hasNext()) {
                D0.p pVar5 = (D0.p) it.next();
                this.f233j = aVar;
                this.f234k = nVar2;
                this.f235l = pVar3;
                this.f236m = c0011l;
                this.f237n = it;
                this.f239p = 2;
                if (pVar5.f(c0011l, this) == aVar2) {
                    return aVar2;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
            c0013n.f244c = null;
            this.f233j = nVar;
            this.f234k = pVar2;
            this.f235l = a2;
            this.f236m = null;
            this.f237n = null;
            this.f239p = 3;
            dVar = (S0.d) a2;
            if (dVar.c(this) != aVar2) {
                return aVar2;
            }
            pVar4 = pVar2;
            nVar3 = nVar;
            obj2 = dVar;
            nVar3.f310f = true;
            ((S0.d) obj2).e(null);
            obj3 = pVar4.f312f;
            if (obj3 == null) {
            }
            l0 f22 = s2.f();
            this.f233j = obj3;
            this.f234k = null;
            this.f235l = null;
            this.f238o = hashCode;
            this.f239p = 4;
            a3 = f22.a();
            if (a3 != aVar2) {
            }
        }
        pVar.f312f = ((C0003d) obj).f174b;
        C0011l c0011l2 = new C0011l(a2, nVar, pVar2, s2);
        List list = (List) c0013n.f244c;
        if (list != null) {
            it = list.iterator();
            aVar = a2;
            nVar2 = nVar;
            pVar3 = pVar2;
            c0011l = c0011l2;
            while (it.hasNext()) {
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
        }
        c0013n.f244c = null;
        this.f233j = nVar;
        this.f234k = pVar2;
        this.f235l = a2;
        this.f236m = null;
        this.f237n = null;
        this.f239p = 3;
        dVar = (S0.d) a2;
        if (dVar.c(this) != aVar2) {
        }
    }
}
