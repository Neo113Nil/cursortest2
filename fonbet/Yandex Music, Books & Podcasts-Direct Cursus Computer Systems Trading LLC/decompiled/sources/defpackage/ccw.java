package defpackage;

import com.yandex.media.ynison.service.a;
import com.yandex.media.ynison.service.b;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.e0;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ccw {
    public static final String l;
    public final hgp a;
    public final z6u b;
    public final rn5 c;
    public final jyr d;
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final AtomicReference f = new AtomicReference(null);
    public final x0q g = y0q.b(1, 0, null, 6);
    public final ConcurrentSkipListSet h = new ConcurrentSkipListSet();
    public final xdr i = ydr.a(Boolean.FALSE);
    public final xdr j = ydr.a(null);
    public final jyr k = btf.b(new dxv(14, this));

    static {
        String str = xhw.w;
        l = "YnisonCore:".concat("Ynison");
    }

    public ccw(hgp hgpVar, z6u z6uVar, rn5 rn5Var, jyr jyrVar) {
        this.a = hgpVar;
        this.b = z6uVar;
        this.c = rn5Var;
        this.d = jyrVar;
    }

    public static final z4n a(ccw ccwVar, c0 c0Var) {
        ccwVar.getClass();
        return (!c0Var.m() && Intrinsics.d(c0Var.p().j(), ((dgw) ccwVar.c.e).b())) ? z4n.INTERCEPT_IF_NO_ONE_ACTIVE : z4n.DO_NOT_INTERCEPT_BY_DEFAULT;
    }

    public static final njs b(ccw ccwVar) {
        anw anwVar = (anw) ccwVar.c.f;
        return anwVar.f.a(cyk.d) ? njs.c : anwVar.c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ccw ccwVar, String str, z4n z4nVar, cg6 cg6Var) {
        bcw bcwVar;
        int i;
        a m;
        String str2;
        b j;
        ccwVar.getClass();
        rn5 rn5Var = ccwVar.c;
        if (cg6Var instanceof bcw) {
            bcwVar = (bcw) cg6Var;
            int i2 = bcwVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bcwVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bcwVar.l;
                nm6 nm6Var = nm6.a;
                i = bcwVar.n;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(ccwVar.j, 18);
                    bcwVar.j = str;
                    bcwVar.k = z4nVar;
                    bcwVar.n = 1;
                    obj = zsd.g0(bcaVar, bcwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z4nVar = bcwVar.k;
                    str = bcwVar.j;
                    qgg.h0(obj);
                }
                e0 e0Var = (e0) obj;
                m = uwf.m(e0Var, ((dgw) rn5Var.e).b());
                str2 = l;
                if (m != null || (j = m.j()) == null) {
                    ssg.a(5, str2, hrg.q("skip command(", str, "): no current device found in state"), null);
                    return Boolean.FALSE;
                }
                boolean d = Intrinsics.d(uwf.p(e0Var), ((dgw) rn5Var.e).b());
                boolean j2 = j.j();
                boolean z2 = z4nVar == z4n.INTERCEPT_EAGER;
                if (!d && !j2 && !z2) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (!z) {
                    StringBuilder h = v3w.h("skip command(", str, "): canBePassive=", " activeNow=", j2);
                    h.append(d);
                    h.append(" intercepting=");
                    h.append(z2);
                    ssg.a(5, str2, h.toString(), null);
                }
                return valueOf;
            }
        }
        bcwVar = new bcw(ccwVar, cg6Var);
        Object obj2 = bcwVar.l;
        nm6 nm6Var2 = nm6.a;
        i = bcwVar.n;
        boolean z3 = true;
        if (i != 0) {
        }
        e0 e0Var2 = (e0) obj2;
        m = uwf.m(e0Var2, ((dgw) rn5Var.e).b());
        str2 = l;
        if (m != null) {
        }
        ssg.a(5, str2, hrg.q("skip command(", str, "): no current device found in state"), null);
        return Boolean.FALSE;
    }

    public final mdw d() {
        return (mdw) this.d.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        ybw ybwVar;
        Object obj;
        int i;
        Object V;
        if (cg6Var instanceof ybw) {
            ybwVar = (ybw) cg6Var;
            int i2 = ybwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybwVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = ybwVar.j;
                obj = nm6.a;
                i = ybwVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    ybwVar.l = 1;
                    obj2 = Boolean.FALSE;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ybwVar.l = 2;
                V = x97.V(dm6.b, new zbw(this, booleanValue, null), ybwVar);
                if (V != obj) {
                    V = Unit.a;
                }
            }
        }
        ybwVar = new ybw(this, cg6Var);
        Object obj22 = ybwVar.j;
        obj = nm6.a;
        i = ybwVar.l;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj22).booleanValue();
        ybwVar.l = 2;
        V = x97.V(dm6.b, new zbw(this, booleanValue2, null), ybwVar);
        if (V != obj) {
        }
    }

    public final void f() {
        if (this.e.compareAndSet(true, false)) {
            mdw d = d();
            d.getClass();
            d.e(new nsw("YNISON_CLIENT_DISCONNECTED", d.b(null)));
            Boolean bool = Boolean.FALSE;
            xdr xdrVar = this.i;
            xdrVar.getClass();
            xdrVar.m(null, bool);
            sqd sqdVar = (sqd) this.f.getAndSet(null);
            if (sqdVar == null || !sqdVar.b.getAndSet(false)) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
            sqdVar.a.n();
        }
    }
}
