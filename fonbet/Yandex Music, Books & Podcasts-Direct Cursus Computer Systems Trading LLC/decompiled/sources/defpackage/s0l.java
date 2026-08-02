package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s0l implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0l b;

    public /* synthetic */ s0l(t0l t0lVar, int i) {
        this.a = i;
        this.b = t0lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        e4c e4cVar;
        nsa nsaVar;
        Long l;
        tvk tvkVar;
        nsa nsaVar2;
        long j;
        long longValue;
        ssa ssaVar;
        int i = this.a;
        t0l t0lVar = this.b;
        switch (i) {
            case 0:
                t0lVar.f.set((rcl) obj);
                break;
            default:
                Pair pair = (Pair) obj;
                qvk qvkVar = t0lVar.g;
                u8l u8lVar = (u8l) pair.a;
                nvm nvmVar = (nvm) pair.b;
                if (u8lVar != null) {
                    xdr xdrVar = t0lVar.a.c;
                    xdr xdrVar2 = t0lVar.d.c;
                    n7q a = u8lVar.a();
                    if (!(u8lVar instanceof k8l) && !(u8lVar instanceof t8l)) {
                        if (!(u8lVar instanceof l8l)) {
                            if (!(u8lVar instanceof m8l)) {
                                boolean z = false;
                                if (!(u8lVar instanceof r8l)) {
                                    if (!(u8lVar instanceof n8l)) {
                                        if (!(u8lVar instanceof o8l)) {
                                            if (!(u8lVar instanceof j8l)) {
                                                if (!(u8lVar instanceof s8l)) {
                                                    if (!(u8lVar instanceof p8l) && !(u8lVar instanceof q8l)) {
                                                        b6e.s();
                                                        break;
                                                    }
                                                } else {
                                                    qvkVar.d(a, ((s8l) u8lVar).b);
                                                }
                                            } else {
                                                qvkVar.d(a, ((j8l) u8lVar).b);
                                            }
                                        } else {
                                            qvk qvkVar2 = t0lVar.g;
                                            msa msaVar = nsa.b;
                                            o8l o8lVar = (o8l) u8lVar;
                                            long j2 = o8lVar.b;
                                            ssa ssaVar2 = ssa.MILLISECONDS;
                                            qvkVar2.f(a, yd5.N(j2, ssaVar2), yd5.N(o8lVar.c, ssaVar2));
                                        }
                                    } else {
                                        n8l n8lVar = (n8l) u8lVar;
                                        kdl kdlVar = n8lVar.c;
                                        int ordinal = kdlVar.ordinal();
                                        if (ordinal == 0) {
                                            if (!((Boolean) t0lVar.e.a.e.invoke()).booleanValue()) {
                                                kdlVar = null;
                                            }
                                            if (kdlVar == null) {
                                                kdlVar = kdl.b;
                                            }
                                        } else if (ordinal != 1) {
                                            b6e.s();
                                            break;
                                        }
                                        int ordinal2 = kdlVar.ordinal();
                                        if (ordinal2 == 0) {
                                            qvk qvkVar3 = t0lVar.g;
                                            msa msaVar2 = nsa.b;
                                            long j3 = n8lVar.b;
                                            ssa ssaVar3 = ssa.MILLISECONDS;
                                            qvkVar3.f(a, yd5.N(j3, ssaVar3), yd5.M(0, ssaVar3));
                                        } else if (ordinal2 != 1) {
                                            b6e.s();
                                            break;
                                        } else {
                                            t0lVar.g.h(a, n8lVar.b, false, dpl.a);
                                            qvk qvkVar4 = t0lVar.g;
                                            g4q g4qVar = (g4q) xdrVar2.getValue();
                                            msa msaVar3 = nsa.b;
                                            qvkVar4.e(g4qVar, a, yd5.M(0, ssa.MILLISECONDS), true);
                                            if (p6g.C((e6l) xdrVar.getValue())) {
                                                qvkVar.g(a);
                                            }
                                        }
                                    }
                                } else {
                                    rcl rclVar = (rcl) t0lVar.f.get();
                                    if (rclVar != null && Intrinsics.d(a.b(), rclVar.a)) {
                                        z = rclVar.b;
                                    }
                                    r8l r8lVar = (r8l) u8lVar;
                                    t0lVar.g.h(a, r8lVar.b, z, r8lVar.c);
                                }
                            } else {
                                m8l m8lVar = (m8l) u8lVar;
                                n7q n7qVar = m8lVar.a;
                                qvs qvsVar = m8lVar.c;
                                if (qvsVar != null) {
                                    mqs a2 = n7qVar.b().a();
                                    if (qvsVar.equals(a2 != null ? a2.D : null)) {
                                        e4cVar = e4c.d;
                                        if (qvsVar != null) {
                                            long j4 = qvsVar.c - qvsVar.a;
                                            msa msaVar4 = nsa.b;
                                            nsaVar = new nsa(yd5.N(j4, ssa.MILLISECONDS));
                                        } else {
                                            nsaVar = null;
                                        }
                                        l = m8lVar.b;
                                        qvkVar.getClass();
                                        tvkVar = ((yuk) ((suk) qvkVar.a)).g;
                                        tvkVar.getClass();
                                        if (l != null) {
                                            msa msaVar5 = nsa.b;
                                            nsaVar2 = new nsa(yd5.N(l.longValue(), ssa.MILLISECONDS));
                                        } else {
                                            nsaVar2 = null;
                                        }
                                        tvkVar.f = nsaVar2;
                                        tvkVar.g = nsaVar;
                                        tvkVar.h = e4cVar;
                                        if (l != null && l.longValue() > -1) {
                                            j = tvkVar.i;
                                            msa msaVar6 = nsa.b;
                                            longValue = l.longValue();
                                            ssaVar = ssa.MILLISECONDS;
                                            if (!nsa.e(j, yd5.N(longValue, ssaVar))) {
                                                long b = tvkVar.b(yd5.N(l.longValue(), ssaVar));
                                                ssg.a(4, tvkVar.b, hrg.r("prepared position update from ", nsa.t(tvkVar.i), " to ", nsa.t(yd5.N(l.longValue(), ssaVar))), null);
                                                tvkVar.i = b;
                                                ewk d = tvkVar.d();
                                                if (d != null) {
                                                    long j5 = tvkVar.i;
                                                    dwk dwkVar = d.d;
                                                    if (dwkVar != null) {
                                                        dwkVar.b(j5, b);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (qvsVar != null) {
                                    mqs a3 = n7qVar.b().a();
                                    if (qvsVar.equals(a3 != null ? a3.E : null)) {
                                        e4cVar = e4c.c;
                                        if (qvsVar != null) {
                                        }
                                        l = m8lVar.b;
                                        qvkVar.getClass();
                                        tvkVar = ((yuk) ((suk) qvkVar.a)).g;
                                        tvkVar.getClass();
                                        if (l != null) {
                                        }
                                        tvkVar.f = nsaVar2;
                                        tvkVar.g = nsaVar;
                                        tvkVar.h = e4cVar;
                                        if (l != null) {
                                            j = tvkVar.i;
                                            msa msaVar62 = nsa.b;
                                            longValue = l.longValue();
                                            ssaVar = ssa.MILLISECONDS;
                                            if (!nsa.e(j, yd5.N(longValue, ssaVar))) {
                                            }
                                        }
                                    }
                                }
                                e4cVar = e4c.e;
                                if (qvsVar != null) {
                                }
                                l = m8lVar.b;
                                qvkVar.getClass();
                                tvkVar = ((yuk) ((suk) qvkVar.a)).g;
                                tvkVar.getClass();
                                if (l != null) {
                                }
                                tvkVar.f = nsaVar2;
                                tvkVar.g = nsaVar;
                                tvkVar.h = e4cVar;
                                if (l != null) {
                                }
                            }
                        } else {
                            qvk qvkVar5 = t0lVar.g;
                            g4q g4qVar2 = (g4q) xdrVar2.getValue();
                            msa msaVar7 = nsa.b;
                            qvkVar5.e(g4qVar2, a, yd5.N(a.e(), ssa.MILLISECONDS), false);
                            if (p6g.C((e6l) xdrVar.getValue())) {
                                qvkVar.g(a);
                            }
                        }
                    } else {
                        qvkVar.g(a);
                    }
                }
                if (nvmVar != null) {
                    qvkVar.getClass();
                    if (nvmVar.e) {
                        suk sukVar = (suk) qvkVar.a;
                        msa msaVar8 = nsa.b;
                        ((yuk) sukVar).b(yd5.N(nvmVar.b, ssa.MILLISECONDS), "progress");
                    }
                }
                break;
        }
        return Unit.a;
    }
}
