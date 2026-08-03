package androidx.compose.foundation.gestures;

import e1.b;
import hc.c;
import pc.p;
import w.p0;
import w.w0;
import x.e0;
import x.k;
import x.k0;
import x.l0;
import x.m0;
import x.n0;
import x.t0;
import x.z0;
import y.i;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f520a = new l0();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f521b = new k0();

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f522c = new m0();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z0 z0Var, long j3, c cVar) {
        n0 n0Var;
        int i10;
        p pVar;
        z0 z0Var2;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i11 = n0Var.f7853j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n0Var.f7853j = i11 - Integer.MIN_VALUE;
                Object obj = n0Var.f7852i;
                i10 = n0Var.f7853j;
                if (i10 != 0) {
                    v6.a.W(obj);
                    pVar = new p();
                    w.a aVar = new w.a(z0Var, j3, pVar, null, 1);
                    n0Var.f7850g = z0Var;
                    n0Var.f7851h = pVar;
                    n0Var.f7853j = 1;
                    Object e10 = z0Var.e(p0.f7480g, aVar, n0Var);
                    gc.a aVar2 = gc.a.f2559g;
                    if (e10 == aVar2) {
                        return aVar2;
                    }
                    z0Var2 = z0Var;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p pVar2 = n0Var.f7851h;
                    z0 z0Var3 = n0Var.f7850g;
                    v6.a.W(obj);
                    pVar = pVar2;
                    z0Var2 = z0Var3;
                }
                return new b(z0Var2.g(pVar.f5680g));
            }
        }
        n0Var = new n0(cVar);
        Object obj2 = n0Var.f7852i;
        i10 = n0Var.f7853j;
        if (i10 != 0) {
        }
        return new b(z0Var2.g(pVar.f5680g));
    }

    public static final n b(n nVar, t0 t0Var, e0 e0Var, w0 w0Var, boolean z10, boolean z11, k kVar, i iVar) {
        return nVar.d(new ScrollableElement(w0Var, kVar, e0Var, t0Var, iVar, z10, z11));
    }
}
