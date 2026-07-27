package D;

import L0.C0058p;
import java.util.Set;
import t0.C0252g;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019u implements O0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O0.e f266f;

    public /* synthetic */ C0019u(O0.e eVar, int i2) {
        this.f265e = i2;
        this.f266f = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // O0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, v0.d dVar) {
        C0018t c0018t;
        int i2;
        r0.z zVar;
        int i3;
        switch (this.f265e) {
            case 0:
                if (dVar instanceof C0018t) {
                    c0018t = (C0018t) dVar;
                    int i4 = c0018t.f263i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0018t.f263i = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0018t.f262h;
                        w0.a aVar = w0.a.f3076e;
                        i2 = c0018t.f263i;
                        if (i2 != 0) {
                            o.g.z(obj2);
                            m0 m0Var = (m0) obj;
                            if (m0Var instanceof f0) {
                                throw ((f0) m0Var).f188b;
                            }
                            if (!(m0Var instanceof C0003d)) {
                                if (m0Var instanceof d0 ? true : m0Var instanceof n0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new C0058p();
                            }
                            Object obj3 = ((C0003d) m0Var).f174b;
                            c0018t.f263i = 1;
                            if (this.f266f.b(obj3, c0018t) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj2);
                        }
                        return C0252g.f2994a;
                    }
                }
                c0018t = new C0018t(this, dVar);
                Object obj22 = c0018t.f262h;
                w0.a aVar2 = w0.a.f3076e;
                i2 = c0018t.f263i;
                if (i2 != 0) {
                }
                return C0252g.f2994a;
            default:
                if (dVar instanceof r0.z) {
                    zVar = (r0.z) dVar;
                    int i5 = zVar.f2953i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zVar.f2953i = i5 - Integer.MIN_VALUE;
                        Object obj4 = zVar.f2952h;
                        w0.a aVar3 = w0.a.f3076e;
                        i3 = zVar.f2953i;
                        if (i3 != 0) {
                            o.g.z(obj4);
                            Set keySet = ((G.b) obj).a().keySet();
                            zVar.f2953i = 1;
                            if (this.f266f.b(keySet, zVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj4);
                        }
                        return C0252g.f2994a;
                    }
                }
                zVar = new r0.z(this, dVar);
                Object obj42 = zVar.f2952h;
                w0.a aVar32 = w0.a.f3076e;
                i3 = zVar.f2953i;
                if (i3 != 0) {
                }
                return C0252g.f2994a;
        }
    }
}
