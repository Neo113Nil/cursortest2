package D;

import K0.AbstractC0046w;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class I extends x0.f implements D0.l {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f93j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f94k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f95l;

    /* renamed from: m, reason: collision with root package name */
    public Object f96m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f97n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Serializable f98o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(S s2, v0.i iVar, D0.p pVar, v0.d dVar) {
        super(1, dVar);
        this.f95l = s2;
        this.f97n = iVar;
        this.f98o = (x0.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [D0.p, x0.f] */
    @Override // D0.l
    public final Object i(Object obj) {
        v0.d dVar = (v0.d) obj;
        switch (this.f93j) {
            case 0:
                return new I((E0.p) this.f97n, this.f95l, (E0.o) this.f98o, dVar).n(t0.g.f2989a);
            default:
                return new I(this.f95l, (v0.i) this.f97n, (D0.p) this.f98o, dVar).n(t0.g.f2989a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r6v2, types: [D0.p, x0.f] */
    @Override // x0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        E0.p pVar;
        E0.o oVar;
        C0003d c0003d;
        Object obj2;
        switch (this.f93j) {
            case 0:
                w0.a aVar = w0.a.f3071f;
                int i2 = this.f94k;
                E0.o oVar2 = (E0.o) this.f98o;
                E0.p pVar2 = (E0.p) this.f97n;
                S s2 = this.f95l;
                try {
                } catch (C0002c unused) {
                    Object obj3 = pVar2.f312f;
                    this.f96m = oVar2;
                    this.f94k = 3;
                    obj = s2.i(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i2 == 0) {
                    o.g.C(obj);
                    this.f96m = pVar2;
                    this.f94k = 1;
                    obj = s2.h(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oVar = (E0.o) ((Serializable) this.f96m);
                            o.g.C(obj);
                            oVar.f311f = ((Number) obj).intValue();
                            return t0.g.f2989a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oVar2 = (E0.o) ((Serializable) this.f96m);
                        o.g.C(obj);
                        oVar2.f311f = ((Number) obj).intValue();
                        return t0.g.f2989a;
                    }
                    pVar = (E0.p) ((Serializable) this.f96m);
                    o.g.C(obj);
                }
                pVar.f312f = obj;
                l0 f2 = s2.f();
                this.f96m = oVar2;
                this.f94k = 2;
                obj = f2.a();
                if (obj == aVar) {
                    return aVar;
                }
                oVar = oVar2;
                oVar.f311f = ((Number) obj).intValue();
                return t0.g.f2989a;
            default:
                w0.a aVar2 = w0.a.f3071f;
                int i3 = this.f94k;
                S s3 = this.f95l;
                if (i3 == 0) {
                    o.g.C(obj);
                    this.f94k = 1;
                    obj = S.e(s3, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f96m;
                            o.g.C(obj);
                            return obj4;
                        }
                        c0003d = (C0003d) this.f96m;
                        o.g.C(obj);
                        obj2 = c0003d.f174b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0003d.f175c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!E0.i.a(c0003d.f174b, obj)) {
                            this.f96m = obj;
                            this.f94k = 3;
                            if (s3.i(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    o.g.C(obj);
                }
                c0003d = (C0003d) obj;
                K k2 = new K((x0.f) this.f98o, c0003d, null);
                this.f96m = c0003d;
                this.f94k = 2;
                obj = AbstractC0046w.n((v0.i) this.f97n, k2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0003d.f174b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0003d.f175c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(E0.p pVar, S s2, E0.o oVar, v0.d dVar) {
        super(1, dVar);
        this.f97n = pVar;
        this.f95l = s2;
        this.f98o = oVar;
    }
}
