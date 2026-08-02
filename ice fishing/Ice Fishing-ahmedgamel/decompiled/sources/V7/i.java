package V7;

import X.C0412a;
import X.E;
import X.F;
import kotlin.jvm.internal.r;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class i implements c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3472n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3473u;

    public /* synthetic */ i(int i, Object obj) {
        this.f3472n = i;
        this.f3473u = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // V7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC5240d interfaceC5240d) {
        X.p pVar;
        int i;
        switch (this.f3472n) {
            case 0:
                ((r) this.f3473u).f38644n = obj;
                throw new W7.a(this);
            default:
                if (interfaceC5240d instanceof X.p) {
                    pVar = (X.p) interfaceC5240d;
                    int i4 = pVar.f3685u;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pVar.f3685u = i4 - Integer.MIN_VALUE;
                        Object obj2 = pVar.f3684n;
                        A7.a aVar = A7.a.f215n;
                        i = pVar.f3685u;
                        if (i != 0) {
                            Q3.b.s(obj2);
                            E e9 = (E) obj;
                            if (e9 instanceof X.h) {
                                throw ((X.h) e9).f3668a;
                            }
                            if (e9 instanceof X.g) {
                                throw ((X.g) e9).f3667a;
                            }
                            if (!(e9 instanceof C0412a)) {
                                if (e9 instanceof F) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new B0.c();
                            }
                            Object obj3 = ((C0412a) e9).f3651a;
                            pVar.f3685u = 1;
                            if (((c) this.f3473u).a(obj3, pVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Q3.b.s(obj2);
                        }
                        return v.f41073a;
                    }
                }
                pVar = new X.p(this, interfaceC5240d);
                Object obj22 = pVar.f3684n;
                A7.a aVar2 = A7.a.f215n;
                i = pVar.f3685u;
                if (i != 0) {
                }
                return v.f41073a;
        }
    }
}
