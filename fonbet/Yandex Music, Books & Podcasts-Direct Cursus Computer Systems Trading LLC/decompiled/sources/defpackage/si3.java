package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class si3 implements hku {
    public Object a = bj3.p;
    public zt3 b;
    public final /* synthetic */ zi3 c;

    public si3(zi3 zi3Var) {
        this.c = zi3Var;
    }

    public static final void b(si3 si3Var) {
        zt3 zt3Var = si3Var.b;
        zt3Var.getClass();
        si3Var.b = null;
        si3Var.a = bj3.l;
        Throwable t = si3Var.c.t();
        if (t == null) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(Boolean.FALSE);
        } else {
            if (ve7.b()) {
                t = dar.a(t, zt3Var);
            }
            r7o r7oVar2 = z7o.b;
            zt3Var.resumeWith(new t7o(t));
        }
    }

    @Override // defpackage.hku
    public final void a(yap yapVar, int i) {
        zt3 zt3Var = this.b;
        if (zt3Var != null) {
            zt3Var.a(yapVar, i);
        }
    }

    public final Object c(Continuation continuation) {
        hd4 hd4Var;
        Object obj = this.a;
        boolean z = true;
        if (obj == bj3.p || obj == bj3.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zi3.g;
            zi3 zi3Var = this.c;
            hd4 hd4Var2 = (hd4) atomicReferenceFieldUpdater.get(zi3Var);
            while (true) {
                if (zi3Var.A()) {
                    this.a = bj3.l;
                    Throwable t = zi3Var.t();
                    if (t != null) {
                        throw dar.b(t);
                    }
                    z = false;
                } else {
                    long andIncrement = zi3.c.getAndIncrement(zi3Var);
                    long j = bj3.b;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (hd4Var2.c != j2) {
                        hd4Var = zi3Var.s(j2, hd4Var2);
                        if (hd4Var == null) {
                            continue;
                        }
                    } else {
                        hd4Var = hd4Var2;
                    }
                    Object L = zi3Var.L(hd4Var, i, andIncrement, null);
                    js3 js3Var = bj3.m;
                    if (L == js3Var) {
                        xq0.q("unreachable");
                        return null;
                    }
                    js3 js3Var2 = bj3.o;
                    if (L == js3Var2) {
                        if (andIncrement < zi3Var.w()) {
                            hd4Var.a();
                        }
                        hd4Var2 = hd4Var;
                    } else {
                        if (L == bj3.n) {
                            zi3 zi3Var2 = this.c;
                            zt3 J = i4w.J(qxe.b(continuation));
                            try {
                                this.b = J;
                                Object L2 = zi3Var2.L(hd4Var, i, andIncrement, this);
                                if (L2 == js3Var) {
                                    a(hd4Var, i);
                                } else {
                                    if (L2 == js3Var2) {
                                        if (andIncrement < zi3Var2.w()) {
                                            hd4Var.a();
                                        }
                                        hd4 hd4Var3 = (hd4) zi3.g.get(zi3Var2);
                                        while (true) {
                                            if (zi3Var2.A()) {
                                                b(this);
                                                break;
                                            }
                                            long andIncrement2 = zi3.c.getAndIncrement(zi3Var2);
                                            long j3 = bj3.b;
                                            long j4 = andIncrement2 / j3;
                                            int i2 = (int) (andIncrement2 % j3);
                                            if (hd4Var3.c != j4) {
                                                hd4 s = zi3Var2.s(j4, hd4Var3);
                                                if (s != null) {
                                                    hd4Var3 = s;
                                                }
                                            }
                                            Object L3 = zi3Var2.L(hd4Var3, i2, andIncrement2, this);
                                            if (L3 == bj3.m) {
                                                a(hd4Var3, i2);
                                                break;
                                            }
                                            if (L3 == bj3.o) {
                                                if (andIncrement2 < zi3Var2.w()) {
                                                    hd4Var3.a();
                                                }
                                            } else {
                                                if (L3 == bj3.n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                hd4Var3.a();
                                                this.a = L3;
                                                this.b = null;
                                            }
                                        }
                                    } else {
                                        hd4Var.a();
                                        this.a = L2;
                                        this.b = null;
                                    }
                                    J.j(Boolean.TRUE, null);
                                }
                                Object q = J.q();
                                nm6 nm6Var = nm6.a;
                                return q;
                            } catch (Throwable th) {
                                J.C();
                                throw th;
                            }
                        }
                        hd4Var.a();
                        this.a = L;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object d() {
        Object obj = this.a;
        js3 js3Var = bj3.p;
        if (obj == js3Var) {
            xq0.q("`hasNext()` has not been invoked");
            return null;
        }
        this.a = js3Var;
        if (obj != bj3.l) {
            return obj;
        }
        throw dar.b(this.c.u());
    }
}
