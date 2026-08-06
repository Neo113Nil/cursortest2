package D1;

import f1.AbstractC0162M;
import f1.C0161L;
import f1.C0185s;
import h1.C0239i;
import m1.EnumC0985a;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f273b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f274c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f275d;

    public l(e eVar, I.d dVar, C0161L c0161l) {
        this.f274c = eVar;
        this.f273b = dVar;
        this.f275d = c0161l;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // D1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, l1.d dVar) {
        k kVar;
        int i2;
        l lVar;
        C0185s c0185s;
        int i3;
        switch (this.f272a) {
            case 0:
                if (dVar instanceof k) {
                    kVar = (k) dVar;
                    int i4 = kVar.f271h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kVar.f271h = i4 - Integer.MIN_VALUE;
                        Object obj2 = kVar.f269f;
                        EnumC0985a enumC0985a = EnumC0985a.f8194a;
                        i2 = kVar.f271h;
                        C0239i c0239i = C0239i.f3393a;
                        if (i2 != 0) {
                            R1.l.F(obj2);
                            if (((kotlin.jvm.internal.n) this.f273b).f8074a) {
                                kVar.f271h = 1;
                                if (((e) this.f274c).a(obj, kVar) == enumC0985a) {
                                    return enumC0985a;
                                }
                                return c0239i;
                            }
                            kVar.f267d = this;
                            kVar.f268e = obj;
                            kVar.f271h = 2;
                            obj2 = ((F.r) this.f275d).invoke(obj, kVar);
                            if (obj2 == enumC0985a) {
                                return enumC0985a;
                            }
                            lVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return c0239i;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                obj = kVar.f268e;
                                lVar = kVar.f267d;
                                R1.l.F(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.n) lVar.f273b).f8074a = true;
                                    kVar.f267d = null;
                                    kVar.f268e = null;
                                    kVar.f271h = 3;
                                    if (((e) lVar.f274c).a(obj, kVar) == enumC0985a) {
                                        return enumC0985a;
                                    }
                                }
                                return c0239i;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        R1.l.F(obj2);
                        return c0239i;
                    }
                }
                kVar = new k(this, dVar);
                Object obj22 = kVar.f269f;
                EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
                i2 = kVar.f271h;
                C0239i c0239i2 = C0239i.f3393a;
                if (i2 != 0) {
                }
            case 1:
                Object b2 = E1.l.b((l1.i) this.f273b, obj, this.f274c, (E1.t) this.f275d, dVar);
                return b2 == EnumC0985a.f8194a ? b2 : C0239i.f3393a;
            default:
                if (dVar instanceof C0185s) {
                    c0185s = (C0185s) dVar;
                    int i5 = c0185s.f2964e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0185s.f2964e = i5 - Integer.MIN_VALUE;
                        Object obj3 = c0185s.f2963d;
                        EnumC0985a enumC0985a3 = EnumC0985a.f8194a;
                        i3 = c0185s.f2964e;
                        if (i3 != 0) {
                            R1.l.F(obj3);
                            Double d2 = (Double) AbstractC0162M.c(((I.b) obj).c((I.d) this.f273b), ((C0161L) this.f275d).f2911c);
                            c0185s.f2964e = 1;
                            if (((e) this.f274c).a(d2, c0185s) == enumC0985a3) {
                                return enumC0985a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.l.F(obj3);
                        }
                        return C0239i.f3393a;
                    }
                }
                c0185s = new C0185s(this, dVar);
                Object obj32 = c0185s.f2963d;
                EnumC0985a enumC0985a32 = EnumC0985a.f8194a;
                i3 = c0185s.f2964e;
                if (i3 != 0) {
                }
                return C0239i.f3393a;
        }
    }

    public l(kotlin.jvm.internal.n nVar, e eVar, F.r rVar) {
        this.f273b = nVar;
        this.f274c = eVar;
        this.f275d = rVar;
    }

    public l(e eVar, l1.i iVar) {
        this.f273b = iVar;
        this.f274c = F1.a.l(iVar);
        this.f275d = new E1.t(eVar, null);
    }
}
