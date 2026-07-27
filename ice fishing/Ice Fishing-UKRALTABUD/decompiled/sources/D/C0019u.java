package D;

import K0.C0040p;
import java.util.Set;
import r0.C0228B;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019u implements N0.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N0.e f265g;

    public /* synthetic */ C0019u(N0.e eVar, int i2) {
        this.f264f = i2;
        this.f265g = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // N0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, v0.d dVar) {
        C0018t c0018t;
        int i2;
        C0228B c0228b;
        int i3;
        switch (this.f264f) {
            case 0:
                if (dVar instanceof C0018t) {
                    c0018t = (C0018t) dVar;
                    int i4 = c0018t.f262j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0018t.f262j = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0018t.f261i;
                        w0.a aVar = w0.a.f3071f;
                        i2 = c0018t.f262j;
                        if (i2 != 0) {
                            o.g.C(obj2);
                            m0 m0Var = (m0) obj;
                            if (m0Var instanceof f0) {
                                throw ((f0) m0Var).f188b;
                            }
                            if (!(m0Var instanceof C0003d)) {
                                if (m0Var instanceof d0 ? true : m0Var instanceof n0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new C0040p();
                            }
                            Object obj3 = ((C0003d) m0Var).f174b;
                            c0018t.f262j = 1;
                            if (this.f265g.b(obj3, c0018t) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.C(obj2);
                        }
                        return t0.g.f2989a;
                    }
                }
                c0018t = new C0018t(this, dVar);
                Object obj22 = c0018t.f261i;
                w0.a aVar2 = w0.a.f3071f;
                i2 = c0018t.f262j;
                if (i2 != 0) {
                }
                return t0.g.f2989a;
            default:
                if (dVar instanceof C0228B) {
                    c0228b = (C0228B) dVar;
                    int i5 = c0228b.f2826j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0228b.f2826j = i5 - Integer.MIN_VALUE;
                        Object obj4 = c0228b.f2825i;
                        w0.a aVar3 = w0.a.f3071f;
                        i3 = c0228b.f2826j;
                        if (i3 != 0) {
                            o.g.C(obj4);
                            Set keySet = ((G.b) obj).a().keySet();
                            c0228b.f2826j = 1;
                            if (this.f265g.b(keySet, c0228b) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.C(obj4);
                        }
                        return t0.g.f2989a;
                    }
                }
                c0228b = new C0228B(this, dVar);
                Object obj42 = c0228b.f2825i;
                w0.a aVar32 = w0.a.f3071f;
                i3 = c0228b.f2826j;
                if (i3 != 0) {
                }
                return t0.g.f2989a;
        }
    }
}
