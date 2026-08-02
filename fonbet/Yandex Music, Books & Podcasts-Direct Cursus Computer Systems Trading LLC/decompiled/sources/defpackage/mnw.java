package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class mnw {
    public static final List i = u75.h(0L, 100L, 250L, 500L, 1000L, 2500L, 5000L, 10000L, 30000L);
    public static final List j = u75.h(1000L, 5000L, 30000L);
    public final String a;
    public final um6 b;
    public final sgw c;
    public final ReentrantLock d;
    public rar e;
    public final AtomicReference f;
    public final AtomicBoolean g;
    public final AtomicReference h;

    public mnw(String str, um6 um6Var, sgw sgwVar) {
        str.getClass();
        this.a = str;
        this.b = um6Var;
        this.c = sgwVar;
        this.d = new ReentrantLock();
        this.f = new AtomicReference(i);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicReference(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o5g o5gVar, Function0 function0, cg6 cg6Var) {
        lnw lnwVar;
        int i2;
        inw inwVar;
        if (cg6Var instanceof lnw) {
            lnwVar = (lnw) cg6Var;
            int i3 = lnwVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lnwVar.l = i3 - Integer.MIN_VALUE;
                Object obj = lnwVar.j;
                nm6 nm6Var = nm6.a;
                i2 = lnwVar.l;
                AtomicBoolean atomicBoolean = this.g;
                if (i2 != 0) {
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) this.c.invoke()).booleanValue();
                    List list = booleanValue ? j : i;
                    List B = o5gVar.B();
                    if (B != null) {
                        list = B;
                    }
                    this.f.set(list);
                    String str = this.a;
                    if (booleanValue) {
                        if (o5gVar instanceof igw) {
                            inwVar = new inw(jnw.a, 0L);
                        } else if (o5gVar instanceof jgw) {
                            inwVar = new inw(jnw.b, ((jgw) o5gVar).c);
                        } else if (o5gVar instanceof kgw) {
                            inwVar = new inw(jnw.c, ((kgw) o5gVar).c);
                        } else {
                            if (!(o5gVar instanceof lgw)) {
                                b6e.s();
                                return null;
                            }
                            inwVar = null;
                        }
                        if (inwVar == null) {
                            return Unit.a;
                        }
                        inw inwVar2 = (inw) this.h.getAndSet(inwVar);
                        if (!inwVar.equals(inwVar2)) {
                            ssg.a(4, str, "RetryManager: error key changed " + inwVar2 + " -> " + inwVar + ", resetting iteration", null);
                            atomicBoolean.set(true);
                        }
                    }
                    if (o5gVar instanceof igw) {
                        return Unit.a;
                    }
                    if (o5gVar instanceof jgw) {
                        return Unit.a;
                    }
                    if (o5gVar instanceof lgw) {
                        return Unit.a;
                    }
                    if (!(o5gVar instanceof kgw)) {
                        b6e.s();
                        return null;
                    }
                    function0.invoke();
                    long j2 = ((kgw) o5gVar).e;
                    ssg.a(4, str, dfi.e(j2, "RetryManager: Go-Away received, delay ", "s before next attempt"), null);
                    msa msaVar = nsa.b;
                    long N = yd5.N(j2, ssa.SECONDS);
                    lnwVar.l = 1;
                    if (y2x.p(N, lnwVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                atomicBoolean.set(true);
                return Unit.a;
            }
        }
        lnwVar = new lnw(this, cg6Var);
        Object obj2 = lnwVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = lnwVar.l;
        AtomicBoolean atomicBoolean2 = this.g;
        if (i2 != 0) {
        }
        atomicBoolean2.set(true);
        return Unit.a;
    }
}
