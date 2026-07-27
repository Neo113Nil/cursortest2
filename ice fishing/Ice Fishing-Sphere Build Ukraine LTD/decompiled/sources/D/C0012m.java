package D;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import t0.C0252g;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m extends x0.f implements D0.l {

    /* renamed from: i, reason: collision with root package name */
    public Object f233i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f234j;

    /* renamed from: k, reason: collision with root package name */
    public Object f235k;

    /* renamed from: l, reason: collision with root package name */
    public Object f236l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f237m;

    /* renamed from: n, reason: collision with root package name */
    public int f238n;

    /* renamed from: o, reason: collision with root package name */
    public int f239o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S f240p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0013n f241q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012m(S s2, C0013n c0013n, v0.d dVar) {
        super(1, dVar);
        this.f240p = s2;
        this.f241q = c0013n;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        return new C0012m(this.f240p, this.f241q, (v0.d) obj).n(C0252g.f2994a);
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
        T0.a a2;
        E0.n nVar;
        E0.p pVar;
        E0.p pVar2;
        Iterator it;
        T0.a aVar;
        E0.n nVar2;
        E0.p pVar3;
        C0011l c0011l;
        T0.d dVar;
        E0.p pVar4;
        E0.n nVar3;
        Object obj2;
        Object obj3;
        Integer a3;
        int i2;
        w0.a aVar2 = w0.a.f3076e;
        int i3 = this.f239o;
        C0013n c0013n = this.f241q;
        S s2 = this.f240p;
        if (i3 == 0) {
            o.g.z(obj);
            a2 = T0.e.a();
            nVar = new E0.n();
            pVar = new E0.p();
            this.f233i = a2;
            this.f234j = nVar;
            this.f235k = pVar;
            this.f236l = pVar;
            this.f239o = 1;
            obj = S.e(s2, true, this);
            if (obj == aVar2) {
                return aVar2;
            }
            pVar2 = pVar;
        } else if (i3 == 1) {
            pVar = (E0.p) this.f236l;
            pVar2 = (E0.p) this.f235k;
            nVar = (E0.n) this.f234j;
            a2 = (T0.a) this.f233i;
            o.g.z(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f238n;
                    obj3 = this.f233i;
                    o.g.z(obj);
                    return new C0003d(obj3, i2, ((Number) obj).intValue());
                }
                Object obj4 = (T0.a) this.f235k;
                pVar4 = (E0.p) this.f234j;
                nVar3 = (E0.n) this.f233i;
                o.g.z(obj);
                obj2 = obj4;
                try {
                    nVar3.f311e = true;
                    ((T0.d) obj2).e(null);
                    obj3 = pVar4.f313e;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    l0 f2 = s2.f();
                    this.f233i = obj3;
                    this.f234j = null;
                    this.f235k = null;
                    this.f238n = hashCode;
                    this.f239o = 4;
                    a3 = f2.a();
                    if (a3 != aVar2) {
                        return aVar2;
                    }
                    i2 = hashCode;
                    obj = a3;
                    return new C0003d(obj3, i2, ((Number) obj).intValue());
                } catch (Throwable th) {
                    ((T0.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f237m;
            c0011l = (C0011l) this.f236l;
            pVar3 = (E0.p) this.f235k;
            nVar2 = (E0.n) this.f234j;
            aVar = (T0.a) this.f233i;
            o.g.z(obj);
            while (it.hasNext()) {
                D0.p pVar5 = (D0.p) it.next();
                this.f233i = aVar;
                this.f234j = nVar2;
                this.f235k = pVar3;
                this.f236l = c0011l;
                this.f237m = it;
                this.f239o = 2;
                if (pVar5.f(c0011l, this) == aVar2) {
                    return aVar2;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
            c0013n.f245c = null;
            this.f233i = nVar;
            this.f234j = pVar2;
            this.f235k = a2;
            this.f236l = null;
            this.f237m = null;
            this.f239o = 3;
            dVar = (T0.d) a2;
            if (dVar.c(this) != aVar2) {
                return aVar2;
            }
            pVar4 = pVar2;
            nVar3 = nVar;
            obj2 = dVar;
            nVar3.f311e = true;
            ((T0.d) obj2).e(null);
            obj3 = pVar4.f313e;
            if (obj3 == null) {
            }
            l0 f22 = s2.f();
            this.f233i = obj3;
            this.f234j = null;
            this.f235k = null;
            this.f238n = hashCode;
            this.f239o = 4;
            a3 = f22.a();
            if (a3 != aVar2) {
            }
        }
        pVar.f313e = ((C0003d) obj).f174b;
        C0011l c0011l2 = new C0011l(a2, nVar, pVar2, s2);
        List list = (List) c0013n.f245c;
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
        c0013n.f245c = null;
        this.f233i = nVar;
        this.f234j = pVar2;
        this.f235k = a2;
        this.f236l = null;
        this.f237m = null;
        this.f239o = 3;
        dVar = (T0.d) a2;
        if (dVar.c(this) != aVar2) {
        }
    }
}
