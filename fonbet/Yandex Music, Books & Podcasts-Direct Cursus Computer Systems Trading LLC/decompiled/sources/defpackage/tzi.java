package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class tzi implements t4a, tqg {
    public final g6a a;
    public final List b;
    public final g06 c = new g06(fsg.b(tzi.class.getSimpleName()));

    public tzi(g6a g6aVar, c5b c5bVar) {
        this.a = g6aVar;
        this.b = c5bVar;
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.c;
    }

    @Override // defpackage.t4a
    public final Object c(t5a t5aVar, q2a q2aVar, boolean z, boolean z2, boolean z3, apo apoVar, cg6 cg6Var) {
        return d(t5aVar, q2aVar, z, z2, z3, apoVar, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(t5a t5aVar, q2a q2aVar, boolean z, boolean z2, boolean z3, apo apoVar, cg6 cg6Var) {
        szi sziVar;
        int i;
        t5a t5aVar2;
        boolean z4;
        boolean z5;
        apo apoVar2;
        boolean z6;
        q2a q2aVar2;
        l4a l4aVar;
        g6a g6aVar;
        boolean z7;
        apo apoVar3;
        q2a q2aVar3;
        t5a t5aVar3;
        if (cg6Var instanceof szi) {
            sziVar = (szi) cg6Var;
            int i2 = sziVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sziVar.u = i2 - Integer.MIN_VALUE;
                Object obj = sziVar.s;
                nm6 nm6Var = nm6.a;
                i = sziVar.u;
                if (i != 0) {
                    qgg.h0(obj);
                    ConcurrentHashMap concurrentHashMap = vmm.a;
                    sziVar.j = t5aVar;
                    sziVar.k = q2aVar;
                    sziVar.l = apoVar;
                    sziVar.p = z;
                    sziVar.q = z2;
                    sziVar.r = z3;
                    sziVar.u = 1;
                    t5aVar2 = t5aVar;
                    z4 = z3;
                    z5 = z;
                    apoVar2 = apoVar;
                    z6 = z2;
                    q2aVar2 = q2aVar;
                    obj = null;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj);
                                return obj;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z4 = sziVar.r;
                        z6 = sziVar.q;
                        z7 = sziVar.p;
                        q2a q2aVar4 = sziVar.o;
                        t5a t5aVar4 = sziVar.n;
                        g6a g6aVar2 = sziVar.m;
                        apo apoVar4 = sziVar.l;
                        qgg.h0(obj);
                        q2aVar3 = q2aVar4;
                        t5aVar3 = t5aVar4;
                        g6aVar = g6aVar2;
                        apoVar3 = apoVar4;
                        sziVar.j = null;
                        sziVar.k = null;
                        sziVar.l = null;
                        sziVar.m = null;
                        sziVar.n = null;
                        sziVar.o = null;
                        sziVar.p = z7;
                        sziVar.q = z6;
                        sziVar.r = z4;
                        sziVar.u = 3;
                        Object V = x97.V(g6aVar.c, new p87(g6aVar, t5aVar3, q2aVar3, (Map) obj, apoVar3, z7, z6, z4, (Continuation) null), sziVar);
                        return V != nm6Var ? nm6Var : V;
                    }
                    z4 = sziVar.r;
                    z6 = sziVar.q;
                    z5 = sziVar.p;
                    apoVar2 = sziVar.l;
                    q2aVar2 = sziVar.k;
                    t5aVar2 = sziVar.j;
                    qgg.h0(obj);
                }
                l4aVar = (l4a) obj;
                if (l4aVar == null) {
                    return l4aVar;
                }
                g6a g6aVar3 = this.a;
                ywf.E(this, g6aVar3);
                x2i x2iVar = new x2i(21);
                sziVar.j = null;
                sziVar.k = null;
                sziVar.l = apoVar2;
                sziVar.m = g6aVar3;
                sziVar.n = t5aVar2;
                sziVar.o = q2aVar2;
                sziVar.p = z5;
                sziVar.q = z6;
                sziVar.r = z4;
                sziVar.u = 2;
                Object t = p6g.t(this.b, q2aVar2, x2iVar, sziVar);
                if (t != nm6Var) {
                    g6aVar = g6aVar3;
                    obj = t;
                    z7 = z5;
                    apoVar3 = apoVar2;
                    q2aVar3 = q2aVar2;
                    t5aVar3 = t5aVar2;
                    sziVar.j = null;
                    sziVar.k = null;
                    sziVar.l = null;
                    sziVar.m = null;
                    sziVar.n = null;
                    sziVar.o = null;
                    sziVar.p = z7;
                    sziVar.q = z6;
                    sziVar.r = z4;
                    sziVar.u = 3;
                    Object V2 = x97.V(g6aVar.c, new p87(g6aVar, t5aVar3, q2aVar3, (Map) obj, apoVar3, z7, z6, z4, (Continuation) null), sziVar);
                    if (V2 != nm6Var) {
                    }
                }
            }
        }
        sziVar = new szi(this, cg6Var);
        Object obj2 = sziVar.s;
        nm6 nm6Var2 = nm6.a;
        i = sziVar.u;
        if (i != 0) {
        }
        l4aVar = (l4a) obj2;
        if (l4aVar == null) {
        }
    }
}
