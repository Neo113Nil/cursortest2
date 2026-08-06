package F;

import A1.C0015p;
import f1.C0151B;
import h1.C0239i;
import java.util.Set;
import m1.EnumC0985a;

/* renamed from: F.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044u implements D1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1.e f553b;

    public /* synthetic */ C0044u(D1.e eVar, int i2) {
        this.f552a = i2;
        this.f553b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // D1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, l1.d dVar) {
        C0043t c0043t;
        int i2;
        C0151B c0151b;
        int i3;
        switch (this.f552a) {
            case 0:
                if (dVar instanceof C0043t) {
                    c0043t = (C0043t) dVar;
                    int i4 = c0043t.f550e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0043t.f550e = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0043t.f549d;
                        EnumC0985a enumC0985a = EnumC0985a.f8194a;
                        i2 = c0043t.f550e;
                        if (i2 != 0) {
                            R1.l.F(obj2);
                            k0 k0Var = (k0) obj;
                            if (k0Var instanceof d0) {
                                throw ((d0) k0Var).f468b;
                            }
                            if (!(k0Var instanceof C0028d)) {
                                if (k0Var instanceof b0 ? true : k0Var instanceof l0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new C0015p();
                            }
                            Object obj3 = ((C0028d) k0Var).f466b;
                            c0043t.f550e = 1;
                            if (this.f553b.a(obj3, c0043t) == enumC0985a) {
                                return enumC0985a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.l.F(obj2);
                        }
                        return C0239i.f3393a;
                    }
                }
                c0043t = new C0043t(this, dVar);
                Object obj22 = c0043t.f549d;
                EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
                i2 = c0043t.f550e;
                if (i2 != 0) {
                }
                return C0239i.f3393a;
            default:
                if (dVar instanceof C0151B) {
                    c0151b = (C0151B) dVar;
                    int i5 = c0151b.f2874e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0151b.f2874e = i5 - Integer.MIN_VALUE;
                        Object obj4 = c0151b.f2873d;
                        EnumC0985a enumC0985a3 = EnumC0985a.f8194a;
                        i3 = c0151b.f2874e;
                        if (i3 != 0) {
                            R1.l.F(obj4);
                            Set keySet = ((I.b) obj).a().keySet();
                            c0151b.f2874e = 1;
                            if (this.f553b.a(keySet, c0151b) == enumC0985a3) {
                                return enumC0985a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.l.F(obj4);
                        }
                        return C0239i.f3393a;
                    }
                }
                c0151b = new C0151B(this, dVar);
                Object obj42 = c0151b.f2873d;
                EnumC0985a enumC0985a32 = EnumC0985a.f8194a;
                i3 = c0151b.f2874e;
                if (i3 != 0) {
                }
                return C0239i.f3393a;
        }
    }
}
