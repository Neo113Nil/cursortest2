package F;

import A1.AbstractC0022x;
import h1.C0239i;
import java.io.Serializable;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class H extends AbstractC0995f implements t1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f382e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f384g;

    /* renamed from: h, reason: collision with root package name */
    public Object f385h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f386i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Serializable f387j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(P p2, l1.i iVar, t1.p pVar, l1.d dVar) {
        super(1, dVar);
        this.f384g = p2;
        this.f386i = iVar;
        this.f387j = (AbstractC0995f) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r6v2, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.o oVar;
        C0028d c0028d;
        Object obj2;
        switch (this.f382e) {
            case 0:
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                int i2 = this.f383f;
                kotlin.jvm.internal.o oVar2 = (kotlin.jvm.internal.o) this.f387j;
                kotlin.jvm.internal.p pVar2 = (kotlin.jvm.internal.p) this.f386i;
                P p2 = this.f384g;
                try {
                } catch (C0027c unused) {
                    Object obj3 = pVar2.f8076a;
                    this.f385h = oVar2;
                    this.f383f = 3;
                    obj = p2.i(obj3, true, this);
                    if (obj == enumC0985a) {
                        return enumC0985a;
                    }
                }
                if (i2 == 0) {
                    R1.l.F(obj);
                    this.f385h = pVar2;
                    this.f383f = 1;
                    obj = p2.h(this);
                    if (obj == enumC0985a) {
                        return enumC0985a;
                    }
                    pVar = pVar2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oVar = (kotlin.jvm.internal.o) ((Serializable) this.f385h);
                            R1.l.F(obj);
                            oVar.f8075a = ((Number) obj).intValue();
                            return C0239i.f3393a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oVar2 = (kotlin.jvm.internal.o) ((Serializable) this.f385h);
                        R1.l.F(obj);
                        oVar2.f8075a = ((Number) obj).intValue();
                        return C0239i.f3393a;
                    }
                    pVar = (kotlin.jvm.internal.p) ((Serializable) this.f385h);
                    R1.l.F(obj);
                }
                pVar.f8076a = obj;
                j0 f2 = p2.f();
                this.f385h = oVar2;
                this.f383f = 2;
                obj = f2.a();
                if (obj == enumC0985a) {
                    return enumC0985a;
                }
                oVar = oVar2;
                oVar.f8075a = ((Number) obj).intValue();
                return C0239i.f3393a;
            default:
                EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
                int i3 = this.f383f;
                P p3 = this.f384g;
                if (i3 == 0) {
                    R1.l.F(obj);
                    this.f383f = 1;
                    obj = P.e(p3, true, this);
                    if (obj == enumC0985a2) {
                        return enumC0985a2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f385h;
                            R1.l.F(obj);
                            return obj4;
                        }
                        c0028d = (C0028d) this.f385h;
                        R1.l.F(obj);
                        obj2 = c0028d.f466b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0028d.f467c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!kotlin.jvm.internal.i.a(c0028d.f466b, obj)) {
                            this.f385h = obj;
                            this.f383f = 3;
                            if (p3.i(obj, true, this) == enumC0985a2) {
                                return enumC0985a2;
                            }
                        }
                        return obj;
                    }
                    R1.l.F(obj);
                }
                c0028d = (C0028d) obj;
                J j2 = new J((AbstractC0995f) this.f387j, c0028d, null);
                this.f385h = c0028d;
                this.f383f = 2;
                obj = AbstractC0022x.n((l1.i) this.f386i, j2, this);
                if (obj == enumC0985a2) {
                    return enumC0985a2;
                }
                obj2 = c0028d.f466b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0028d.f467c) {
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [n1.f, t1.p] */
    @Override // t1.l
    public final Object invoke(Object obj) {
        l1.d dVar = (l1.d) obj;
        switch (this.f382e) {
            case 0:
                return new H((kotlin.jvm.internal.p) this.f386i, this.f384g, (kotlin.jvm.internal.o) this.f387j, dVar).g(C0239i.f3393a);
            default:
                return new H(this.f384g, (l1.i) this.f386i, (t1.p) this.f387j, dVar).g(C0239i.f3393a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(kotlin.jvm.internal.p pVar, P p2, kotlin.jvm.internal.o oVar, l1.d dVar) {
        super(1, dVar);
        this.f386i = pVar;
        this.f384g = p2;
        this.f387j = oVar;
    }
}
