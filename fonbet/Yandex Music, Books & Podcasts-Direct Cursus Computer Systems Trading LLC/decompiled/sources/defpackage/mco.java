package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mco extends nco {
    public final long a;
    public final jbo b;
    public final nco c;
    public final z66 d;
    public final pjc e;
    public final ArrayList f;

    public mco(long j, jbo jboVar, nco ncoVar, z66 z66Var, x0q x0qVar) {
        jboVar.getClass();
        ncoVar.getClass();
        this.a = j;
        this.b = jboVar;
        this.c = ncoVar;
        this.d = z66Var;
        this.e = x0qVar;
        if (jboVar == jbo.b && x0qVar == null) {
            su4.s(2, null, "Player state must be nonnull if SincePoint.Buffering is selected.", null);
        }
        this.f = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008b, code lost:
    
        if (r14 == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Exception exc, cg6 cg6Var) {
        jco jcoVar;
        int i;
        boolean z2;
        boolean z3;
        ?? r12;
        Exception exc2;
        int i2;
        x66 x66Var;
        if (cg6Var instanceof jco) {
            jcoVar = (jco) cg6Var;
            int i3 = jcoVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jcoVar.o = i3 - Integer.MIN_VALUE;
                Object obj = jcoVar.m;
                nm6 nm6Var = nm6.a;
                i = jcoVar.o;
                nco ncoVar = this.c;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    this.f.add(exc);
                    if (z) {
                        jcoVar.k = null;
                        jcoVar.j = z;
                        jcoVar.o = 1;
                        Object a = ncoVar.a(z, exc, jcoVar);
                        if (a != nm6Var) {
                            return a;
                        }
                    } else if (this.b != jbo.b || this.e == null) {
                        z2 = false;
                        Exception exc3 = exc;
                        z3 = z;
                        r12 = z2;
                        if (r12 != 0) {
                            jcoVar.k = null;
                            jcoVar.j = z3;
                            jcoVar.l = r12;
                            jcoVar.o = 3;
                            Object a2 = ncoVar.a(z3, exc3, jcoVar);
                            if (a2 != nm6Var) {
                                return a2;
                            }
                        } else {
                            kco kcoVar = new kco(this, continuation, 2);
                            jcoVar.k = exc3;
                            jcoVar.j = z3;
                            jcoVar.l = r12;
                            jcoVar.o = 4;
                            Object L = tyf.L(this.a, kcoVar, jcoVar);
                            if (L != nm6Var) {
                                exc2 = exc3;
                                obj = L;
                                i2 = r12;
                                x66Var = (x66) obj;
                                if (x66Var != null) {
                                }
                            }
                        }
                    } else {
                        lco lcoVar = new lco(this, continuation, 0);
                        jcoVar.k = exc;
                        jcoVar.j = z;
                        jcoVar.o = 2;
                        obj = gld.Q(lcoVar, jcoVar);
                    }
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        qgg.h0(obj);
                        return obj;
                    }
                    if (i != 4) {
                        if (i == 5) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = jcoVar.l;
                    z3 = jcoVar.j;
                    exc2 = jcoVar.k;
                    qgg.h0(obj);
                    i2 = i4;
                    x66Var = (x66) obj;
                    if (x66Var != null) {
                        return Boolean.FALSE;
                    }
                    if (x66Var.b == u0j.a) {
                        return Boolean.FALSE;
                    }
                    jcoVar.k = null;
                    jcoVar.j = z3;
                    jcoVar.l = i2;
                    jcoVar.o = 5;
                    Object a3 = ncoVar.a(z3, exc2, jcoVar);
                    return a3 == nm6Var ? nm6Var : a3;
                }
                z = jcoVar.j;
                exc = jcoVar.k;
                qgg.h0(obj);
                z2 = ((Boolean) obj).booleanValue();
                Exception exc32 = exc;
                z3 = z;
                r12 = z2;
                if (r12 != 0) {
                }
            }
        }
        jcoVar = new jco(this, cg6Var);
        Object obj2 = jcoVar.m;
        nm6 nm6Var2 = nm6.a;
        i = jcoVar.o;
        nco ncoVar2 = this.c;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        z2 = ((Boolean) obj2).booleanValue();
        Exception exc322 = exc;
        z3 = z;
        r12 = z2;
        if (r12 != 0) {
        }
    }
}
