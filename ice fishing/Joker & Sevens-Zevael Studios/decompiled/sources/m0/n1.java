package m0;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n1 implements a1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4684g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4685h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4686i;

    public n1(Choreographer choreographer, y1.j0 j0Var) {
        this.f4684g = 1;
        this.f4685h = choreographer;
        this.f4686i = j0Var;
    }

    @Override // fc.i
    public final fc.i d(fc.i iVar) {
        switch (this.f4684g) {
        }
        return v6.a.K(this, iVar);
    }

    @Override // fc.i
    public final fc.i g(fc.h hVar) {
        switch (this.f4684g) {
        }
        return v6.a.J(this, hVar);
    }

    @Override // fc.i
    public final Object i(Object obj, oc.e eVar) {
        switch (this.f4684g) {
        }
        return eVar.invoke(obj, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        if (r8 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    @Override // m0.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(oc.c cVar, hc.c cVar2) {
        m1 m1Var;
        gc.a aVar;
        int i10;
        boolean z10;
        Object p8;
        Object l10;
        switch (this.f4684g) {
            case 0:
                if (cVar2 instanceof m1) {
                    m1Var = (m1) cVar2;
                    int i11 = m1Var.f4657j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        m1Var.f4657j = i11 - Integer.MIN_VALUE;
                        Object obj = m1Var.f4655h;
                        aVar = gc.a.f2559g;
                        i10 = m1Var.f4657j;
                        if (i10 != 0) {
                            v6.a.W(obj);
                            b4.e eVar = (b4.e) this.f4686i;
                            m1Var.f4654g = cVar;
                            m1Var.f4657j = 1;
                            synchronized (eVar.f961b) {
                                z10 = eVar.f960a;
                            }
                            if (!z10) {
                                yc.g gVar = new yc.g(1, bc.a0.w(m1Var));
                                gVar.q();
                                synchronized (eVar.f961b) {
                                    ((ArrayList) eVar.f962c).add(gVar);
                                }
                                gVar.s(new w0(0, eVar, gVar));
                                p8 = gVar.p();
                                if (p8 != aVar) {
                                    p8 = ac.o.f277a;
                                    break;
                                }
                            } else {
                                p8 = ac.o.f277a;
                                break;
                            }
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                v6.a.W(obj);
                                return obj;
                            }
                            cVar = m1Var.f4654g;
                            v6.a.W(obj);
                        }
                        a1 a1Var = (a1) this.f4685h;
                        m1Var.f4654g = null;
                        m1Var.f4657j = 2;
                        l10 = a1Var.l(cVar, m1Var);
                        if (l10 != aVar) {
                            return l10;
                        }
                        return aVar;
                    }
                }
                m1Var = new m1(this, cVar2);
                Object obj2 = m1Var.f4655h;
                aVar = gc.a.f2559g;
                i10 = m1Var.f4657j;
                if (i10 != 0) {
                }
                a1 a1Var2 = (a1) this.f4685h;
                m1Var.f4654g = null;
                m1Var.f4657j = 2;
                l10 = a1Var2.l(cVar, m1Var);
                if (l10 != aVar) {
                }
                return aVar;
            default:
                y1.j0 j0Var = (y1.j0) this.f4686i;
                yc.g gVar2 = new yc.g(1, bc.a0.w(cVar2));
                gVar2.q();
                y1.k0 k0Var = new y1.k0(gVar2, this, cVar);
                if (pc.j.a(j0Var.f8560i, (Choreographer) this.f4685h)) {
                    synchronized (j0Var.f8562k) {
                        j0Var.f8564m.add(k0Var);
                        if (!j0Var.f8567p) {
                            j0Var.f8567p = true;
                            j0Var.f8560i.postFrameCallback(j0Var.f8568q);
                        }
                    }
                    gVar2.s(new b0.l0(22, j0Var, k0Var));
                } else {
                    ((Choreographer) this.f4685h).postFrameCallback(k0Var);
                    gVar2.s(new b0.l0(23, this, k0Var));
                }
                return gVar2.p();
        }
    }

    @Override // fc.i
    public final fc.g v(fc.h hVar) {
        switch (this.f4684g) {
        }
        return v6.a.D(this, hVar);
    }

    public n1(a1 a1Var) {
        this.f4684g = 0;
        this.f4685h = a1Var;
        this.f4686i = new b4.e();
    }
}
