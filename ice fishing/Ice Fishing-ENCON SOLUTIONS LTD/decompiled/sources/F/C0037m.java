package F;

import h1.C0239i;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: F.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037m extends AbstractC0995f implements t1.l {

    /* renamed from: e, reason: collision with root package name */
    public Object f522e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f523f;

    /* renamed from: g, reason: collision with root package name */
    public Object f524g;

    /* renamed from: h, reason: collision with root package name */
    public Object f525h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f526i;

    /* renamed from: j, reason: collision with root package name */
    public int f527j;

    /* renamed from: k, reason: collision with root package name */
    public int f528k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0038n f530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037m(P p2, C0038n c0038n, l1.d dVar) {
        super(1, dVar);
        this.f529l = p2;
        this.f530m = c0038n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // n1.AbstractC0991b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        I1.a a2;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.p pVar2;
        Iterator it;
        I1.a aVar;
        kotlin.jvm.internal.n nVar2;
        kotlin.jvm.internal.p pVar3;
        C0036l c0036l;
        I1.d dVar;
        kotlin.jvm.internal.p pVar4;
        kotlin.jvm.internal.n nVar3;
        Object obj2;
        Object obj3;
        Integer a3;
        int i2;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i3 = this.f528k;
        C0038n c0038n = this.f530m;
        P p2 = this.f529l;
        if (i3 == 0) {
            R1.l.F(obj);
            a2 = I1.e.a();
            nVar = new kotlin.jvm.internal.n();
            pVar = new kotlin.jvm.internal.p();
            this.f522e = a2;
            this.f523f = nVar;
            this.f524g = pVar;
            this.f525h = pVar;
            this.f528k = 1;
            obj = P.e(p2, true, this);
            if (obj == enumC0985a) {
                return enumC0985a;
            }
            pVar2 = pVar;
        } else if (i3 == 1) {
            pVar = (kotlin.jvm.internal.p) this.f525h;
            pVar2 = (kotlin.jvm.internal.p) this.f524g;
            nVar = (kotlin.jvm.internal.n) this.f523f;
            a2 = (I1.a) this.f522e;
            R1.l.F(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f527j;
                    obj3 = this.f522e;
                    R1.l.F(obj);
                    return new C0028d(i2, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (I1.a) this.f524g;
                pVar4 = (kotlin.jvm.internal.p) this.f523f;
                nVar3 = (kotlin.jvm.internal.n) this.f522e;
                R1.l.F(obj);
                obj2 = obj4;
                try {
                    nVar3.f8074a = true;
                    ((I1.d) obj2).e(null);
                    obj3 = pVar4.f8076a;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    j0 f2 = p2.f();
                    this.f522e = obj3;
                    this.f523f = null;
                    this.f524g = null;
                    this.f527j = hashCode;
                    this.f528k = 4;
                    a3 = f2.a();
                    if (a3 != enumC0985a) {
                        return enumC0985a;
                    }
                    i2 = hashCode;
                    obj = a3;
                    return new C0028d(i2, ((Number) obj).intValue(), obj3);
                } catch (Throwable th) {
                    ((I1.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f526i;
            c0036l = (C0036l) this.f525h;
            pVar3 = (kotlin.jvm.internal.p) this.f524g;
            nVar2 = (kotlin.jvm.internal.n) this.f523f;
            aVar = (I1.a) this.f522e;
            R1.l.F(obj);
            while (it.hasNext()) {
                t1.p pVar5 = (t1.p) it.next();
                this.f522e = aVar;
                this.f523f = nVar2;
                this.f524g = pVar3;
                this.f525h = c0036l;
                this.f526i = it;
                this.f528k = 2;
                if (pVar5.invoke(c0036l, this) == enumC0985a) {
                    return enumC0985a;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
            c0038n.f534c = null;
            this.f522e = nVar;
            this.f523f = pVar2;
            this.f524g = a2;
            this.f525h = null;
            this.f526i = null;
            this.f528k = 3;
            dVar = (I1.d) a2;
            if (dVar.c(this) != enumC0985a) {
                return enumC0985a;
            }
            pVar4 = pVar2;
            nVar3 = nVar;
            obj2 = dVar;
            nVar3.f8074a = true;
            ((I1.d) obj2).e(null);
            obj3 = pVar4.f8076a;
            if (obj3 == null) {
            }
            j0 f22 = p2.f();
            this.f522e = obj3;
            this.f523f = null;
            this.f524g = null;
            this.f527j = hashCode;
            this.f528k = 4;
            a3 = f22.a();
            if (a3 != enumC0985a) {
            }
        }
        pVar.f8076a = ((C0028d) obj).f466b;
        C0036l c0036l2 = new C0036l(a2, nVar, pVar2, p2);
        List list = (List) c0038n.f534c;
        if (list != null) {
            it = list.iterator();
            aVar = a2;
            nVar2 = nVar;
            pVar3 = pVar2;
            c0036l = c0036l2;
            while (it.hasNext()) {
            }
            pVar2 = pVar3;
            nVar = nVar2;
            a2 = aVar;
        }
        c0038n.f534c = null;
        this.f522e = nVar;
        this.f523f = pVar2;
        this.f524g = a2;
        this.f525h = null;
        this.f526i = null;
        this.f528k = 3;
        dVar = (I1.d) a2;
        if (dVar.c(this) != enumC0985a) {
        }
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        return new C0037m(this.f529l, this.f530m, (l1.d) obj).g(C0239i.f3393a);
    }
}
