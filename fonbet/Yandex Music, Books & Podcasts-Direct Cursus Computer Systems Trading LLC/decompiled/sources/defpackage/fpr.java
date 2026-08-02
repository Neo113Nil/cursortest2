package defpackage;

import com.connectsdk.device.ConnectableDevice;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fpr {
    public final gu7 a;
    public final hjp b;
    public final long c;
    public final Function1 d;
    public final int e;

    public fpr(gu7 gu7Var, hjp hjpVar, long j, Function1 function1, int i) {
        hjpVar.getClass();
        function1.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = gu7Var;
        this.b = hjpVar;
        this.c = j;
        this.d = function1;
        this.e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0044 -> B:12:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(fpr fprVar, cg6 cg6Var) {
        p6w p6wVar;
        int i;
        if (cg6Var instanceof p6w) {
            p6wVar = (p6w) cg6Var;
            int i2 = p6wVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p6wVar.n = i2 - Integer.MIN_VALUE;
                Object obj = p6wVar.l;
                nm6 nm6Var = nm6.a;
                i = p6wVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    p6wVar.j = fprVar;
                    p6wVar.k = fprVar;
                    p6wVar.n = 1;
                    obj = fprVar.c(p6wVar);
                    if (obj == nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fprVar = p6wVar.k;
                    fpr fprVar2 = p6wVar.j;
                    try {
                        try {
                            qgg.h0(obj);
                            try {
                                fprVar.b((Map) obj);
                                p6wVar.j = fprVar;
                                p6wVar.k = fprVar;
                                p6wVar.n = 1;
                                obj = fprVar.c(p6wVar);
                                if (obj == nm6Var) {
                                    return nm6Var;
                                }
                                fprVar2 = fprVar;
                                fprVar.b((Map) obj);
                                fprVar = fprVar2;
                                p6wVar.j = fprVar;
                                p6wVar.k = fprVar;
                                p6wVar.n = 1;
                                obj = fprVar.c(p6wVar);
                                if (obj == nm6Var) {
                                }
                            } catch (Exception e) {
                                fprVar2 = fprVar;
                                e = e;
                                hjp hjpVar = fprVar2.b;
                                hjpVar.getClass();
                                ((zi3) ((tyi) hjpVar.b).f).c(new uzi(e));
                                return Unit.a;
                            }
                            fprVar = fprVar2;
                        } catch (Exception e2) {
                            e = e2;
                            hjp hjpVar2 = fprVar2.b;
                            hjpVar2.getClass();
                            ((zi3) ((tyi) hjpVar2.b).f).c(new uzi(e));
                            return Unit.a;
                        }
                    } catch (CancellationException e3) {
                        throw e3;
                    }
                }
            }
        }
        p6wVar = new p6w(fprVar, cg6Var);
        Object obj2 = p6wVar.l;
        nm6 nm6Var2 = nm6.a;
        i = p6wVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
    
        if (defpackage.tyf.J(r7, r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        epr eprVar;
        int i;
        LinkedHashMap g;
        fpr fprVar;
        Map map;
        int i2;
        if (cg6Var instanceof epr) {
            eprVar = (epr) cg6Var;
            int i3 = eprVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eprVar.n = i3 - Integer.MIN_VALUE;
                Object obj = eprVar.l;
                nm6 nm6Var = nm6.a;
                i = eprVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    g = uah.g(new Pair("type", "connection_init"));
                    eprVar.j = this;
                    eprVar.k = g;
                    eprVar.n = 1;
                    obj = this.d.invoke(eprVar);
                    if (obj != nm6Var) {
                        fprVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g = eprVar.k;
                fprVar = eprVar.j;
                qgg.h0(obj);
                map = (Map) obj;
                if (map != null) {
                    g.put("payload", map);
                }
                i2 = fprVar.e;
                gu7 gu7Var = fprVar.a;
                kd4 kd4Var = gu7Var.a;
                gln glnVar = gu7Var.b;
                g.getClass();
                if (i2 != 0) {
                    throw null;
                }
                int D = ouj.D(i2);
                if (D == 0) {
                    hi3 hi3Var = new hi3();
                    irf.V(new hj3(hi3Var), g);
                    String G0 = hi3Var.G0();
                    glnVar.getClass();
                    pn3 pn3Var = pn3.d;
                    if (!glnVar.g(1, ovn.C(G0))) {
                        kd4Var.a(null);
                    }
                } else if (D == 1) {
                    hi3 hi3Var2 = new hi3();
                    irf.V(new hj3(hi3Var2), g);
                    pn3 g0 = hi3Var2.g0(hi3Var2.b);
                    g0.getClass();
                    if (!glnVar.g(2, g0)) {
                        kd4Var.a(null);
                    }
                }
                long j = fprVar.c;
                glp glpVar = new glp(fprVar, continuation, 18);
                eprVar.j = null;
                eprVar.k = null;
                eprVar.n = 2;
            }
        }
        eprVar = new epr(this, cg6Var);
        Object obj2 = eprVar.l;
        nm6 nm6Var2 = nm6.a;
        i = eprVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        map = (Map) obj2;
        if (map != null) {
        }
        i2 = fprVar.e;
        gu7 gu7Var2 = fprVar.a;
        kd4 kd4Var2 = gu7Var2.a;
        gln glnVar2 = gu7Var2.b;
        g.getClass();
        if (i2 != 0) {
        }
    }

    public final void b(Map map) {
        map.getClass();
        Object obj = map.get("type");
        boolean d = Intrinsics.d(obj, "data");
        hjp hjpVar = this.b;
        if (d) {
            Object obj2 = map.get(ConnectableDevice.KEY_ID);
            obj2.getClass();
            Object obj3 = map.get("payload");
            obj3.getClass();
            hjpVar.getClass();
            ((zi3) ((tyi) hjpVar.b).f).c(new x2d((String) obj2, (Map) obj3));
            return;
        }
        if (!Intrinsics.d(obj, "error")) {
            if (Intrinsics.d(obj, "complete")) {
                Object obj4 = map.get(ConnectableDevice.KEY_ID);
                obj4.getClass();
                hjpVar.getClass();
                ((zi3) ((tyi) hjpVar.b).f).c(new x2d((String) obj4));
                return;
            }
            return;
        }
        Object obj5 = map.get(ConnectableDevice.KEY_ID);
        if (!(obj5 instanceof String)) {
            ((zi3) ((tyi) hjpVar.b).f).c(new x2d((Map) map.get("payload")));
        } else {
            Map map2 = (Map) map.get("payload");
            hjpVar.getClass();
            ((zi3) ((tyi) hjpVar.b).f).c(new x2d((String) obj5, map2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:12:0x0053, B:14:0x006c), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0049 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        o6w o6wVar;
        int i;
        fpr fprVar;
        if (cg6Var instanceof o6w) {
            o6wVar = (o6w) cg6Var;
            int i2 = o6wVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o6wVar.n = i2 - Integer.MIN_VALUE;
                Object obj = o6wVar.l;
                nm6 nm6Var = nm6.a;
                i = o6wVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    fprVar = this;
                    gu7 gu7Var = fprVar.a;
                    o6wVar.j = fprVar;
                    o6wVar.k = fprVar;
                    o6wVar.n = 1;
                    obj = gu7Var.a.a.l(o6wVar);
                    if (obj != nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fprVar = o6wVar.k;
                    fpr fprVar2 = o6wVar.j;
                    qgg.h0(obj);
                    String str = (String) obj;
                    fprVar.getClass();
                    str.getClass();
                    Map map = null;
                    tj tjVar = uj.g;
                    hi3 hi3Var = new hi3();
                    hi3Var.S0(str);
                    Object b = tjVar.b(new jj3(hi3Var), fx6.d);
                    if (b instanceof Map) {
                        map = (Map) b;
                    }
                    if (map == null) {
                        return map;
                    }
                    fprVar = fprVar2;
                    gu7 gu7Var2 = fprVar.a;
                    o6wVar.j = fprVar;
                    o6wVar.k = fprVar;
                    o6wVar.n = 1;
                    obj = gu7Var2.a.a.l(o6wVar);
                    if (obj != nm6Var) {
                        return nm6Var;
                    }
                    fprVar2 = fprVar;
                    String str2 = (String) obj;
                    fprVar.getClass();
                    str2.getClass();
                    Map map2 = null;
                    tj tjVar2 = uj.g;
                    hi3 hi3Var2 = new hi3();
                    hi3Var2.S0(str2);
                    Object b2 = tjVar2.b(new jj3(hi3Var2), fx6.d);
                    if (b2 instanceof Map) {
                    }
                    if (map2 == null) {
                    }
                }
            }
        }
        o6wVar = new o6w(this, cg6Var);
        Object obj2 = o6wVar.l;
        nm6 nm6Var2 = nm6.a;
        i = o6wVar.n;
        if (i != 0) {
        }
    }
}
