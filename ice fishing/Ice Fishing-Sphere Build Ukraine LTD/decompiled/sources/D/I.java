package D;

import L0.AbstractC0064w;
import java.io.Serializable;
import t0.C0252g;

/* loaded from: classes.dex */
public final class I extends x0.f implements D0.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f94j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f95k;

    /* renamed from: l, reason: collision with root package name */
    public Object f96l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f97m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Serializable f98n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(S s2, v0.i iVar, D0.p pVar, v0.d dVar) {
        super(1, dVar);
        this.f95k = s2;
        this.f97m = iVar;
        this.f98n = (x0.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [D0.p, x0.f] */
    @Override // D0.l
    public final Object i(Object obj) {
        v0.d dVar = (v0.d) obj;
        switch (this.f93i) {
            case 0:
                return new I((E0.p) this.f97m, this.f95k, (E0.o) this.f98n, dVar).n(C0252g.f2994a);
            default:
                return new I(this.f95k, (v0.i) this.f97m, (D0.p) this.f98n, dVar).n(C0252g.f2994a);
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
        switch (this.f93i) {
            case 0:
                w0.a aVar = w0.a.f3076e;
                int i2 = this.f94j;
                E0.o oVar2 = (E0.o) this.f98n;
                E0.p pVar2 = (E0.p) this.f97m;
                S s2 = this.f95k;
                try {
                } catch (C0002c unused) {
                    Object obj3 = pVar2.f313e;
                    this.f96l = oVar2;
                    this.f94j = 3;
                    obj = s2.i(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i2 == 0) {
                    o.g.z(obj);
                    this.f96l = pVar2;
                    this.f94j = 1;
                    obj = s2.h(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oVar = (E0.o) ((Serializable) this.f96l);
                            o.g.z(obj);
                            oVar.f312e = ((Number) obj).intValue();
                            return C0252g.f2994a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oVar2 = (E0.o) ((Serializable) this.f96l);
                        o.g.z(obj);
                        oVar2.f312e = ((Number) obj).intValue();
                        return C0252g.f2994a;
                    }
                    pVar = (E0.p) ((Serializable) this.f96l);
                    o.g.z(obj);
                }
                pVar.f313e = obj;
                l0 f2 = s2.f();
                this.f96l = oVar2;
                this.f94j = 2;
                obj = f2.a();
                if (obj == aVar) {
                    return aVar;
                }
                oVar = oVar2;
                oVar.f312e = ((Number) obj).intValue();
                return C0252g.f2994a;
            default:
                w0.a aVar2 = w0.a.f3076e;
                int i3 = this.f94j;
                S s3 = this.f95k;
                if (i3 == 0) {
                    o.g.z(obj);
                    this.f94j = 1;
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
                            Object obj4 = this.f96l;
                            o.g.z(obj);
                            return obj4;
                        }
                        c0003d = (C0003d) this.f96l;
                        o.g.z(obj);
                        obj2 = c0003d.f174b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0003d.f175c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!E0.i.a(c0003d.f174b, obj)) {
                            this.f96l = obj;
                            this.f94j = 3;
                            if (s3.i(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    o.g.z(obj);
                }
                c0003d = (C0003d) obj;
                K k2 = new K((x0.f) this.f98n, c0003d, null);
                this.f96l = c0003d;
                this.f94j = 2;
                obj = AbstractC0064w.n((v0.i) this.f97m, k2, this);
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
        this.f97m = pVar;
        this.f95k = s2;
        this.f98n = oVar;
    }
}
