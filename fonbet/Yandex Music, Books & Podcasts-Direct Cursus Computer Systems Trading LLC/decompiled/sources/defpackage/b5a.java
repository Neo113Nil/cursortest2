package defpackage;

import com.yandex.plus.core.locale.b;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class b5a implements ttr, tqg {
    public final r7b a;
    public final t4a b;
    public final apo c;
    public final a d;
    public final List e;
    public long f;
    public final ConcurrentHashMap g;
    public final g06 h;

    public b5a(r7b r7bVar, t4a t4aVar, apo apoVar, tf6 tf6Var, a aVar, List list, j0j j0jVar, b bVar) {
        this.a = r7bVar;
        this.b = t4aVar;
        this.c = apoVar;
        this.d = aVar;
        this.e = list;
        dq7 dq7Var = ca8.a;
        tf6 X = gld.X(tf6Var, (a) sm6.a.b);
        this.g = new ConcurrentHashMap();
        zsd.r0(X, new ub7(12, y0q.b(0, 0, null, 7), new f98(this, null, 3)));
        this.h = new g06(fsg.b(b5a.class.getSimpleName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00de, code lost:
    
        if (defpackage.x97.V(r1, r16, r10) != r11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
    
        if (defpackage.x97.V(r0, r1, r10) == r11) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b5a b5aVar, syn synVar, cir cirVar, cg6 cg6Var) {
        z4a z4aVar;
        int i;
        q2a q2aVar;
        cir cirVar2;
        l4a l4aVar;
        int i2;
        if (cg6Var instanceof z4a) {
            z4aVar = (z4a) cg6Var;
            int i3 = z4aVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z4aVar.p = i3 - Integer.MIN_VALUE;
                z4a z4aVar2 = z4aVar;
                Object obj = z4aVar2.n;
                nm6 nm6Var = nm6.a;
                i = z4aVar2.p;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    m4a a = ((m6a) cirVar.a).a();
                    b5aVar.g(null, synVar, false);
                    l4a l4aVar2 = (l4a) synVar.a;
                    if (l4aVar2 instanceof m4a) {
                        if (a != null && (q2aVar = a.a) != null) {
                            m4a m4aVar = (m4a) l4aVar2;
                            q2a q2aVar2 = m4aVar.a;
                            List list = b5aVar.e;
                            List c = t75.c(null);
                            a aVar = b5aVar.d;
                            g3a g3aVar = b5aVar.a.b;
                            z4aVar2.j = cirVar;
                            z4aVar2.k = m4aVar;
                            z4aVar2.l = q2aVar;
                            z4aVar2.m = 0;
                            z4aVar2.p = 1;
                            obj = (list.isEmpty() || c.isEmpty()) ? q2aVar : x97.V(aVar, new pi(c, q2aVar, list, b5aVar, g3aVar, q2aVar, q2aVar2, null), z4aVar2);
                            if (obj != nm6Var) {
                                cirVar2 = cirVar;
                                l4aVar = l4aVar2;
                                i2 = 0;
                                q2a q2aVar3 = (q2a) obj;
                                dq7 dq7Var = ca8.a;
                                y4h y4hVar = (y4h) sm6.a.a;
                                oh3 oh3Var = new oh3(cirVar2, null, null, l4aVar, q2aVar3, null, 1);
                                z4aVar2.j = null;
                                z4aVar2.k = null;
                                z4aVar2.l = q2aVar;
                                z4aVar2.m = i2;
                                z4aVar2.p = 2;
                            }
                            return nm6Var;
                        }
                        return Unit.a;
                    }
                    if (!(l4aVar2 instanceof j4a)) {
                        if (!(l4aVar2 instanceof k4a)) {
                            b6e.s();
                            return null;
                        }
                        return Unit.a;
                    }
                    dq7 dq7Var2 = ca8.a;
                    y4h y4hVar2 = (y4h) sm6.a.a;
                    nz5 nz5Var = new nz5(cirVar, l4aVar2, continuation, 10);
                    z4aVar2.j = null;
                    z4aVar2.k = null;
                    z4aVar2.p = 3;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = z4aVar2.m;
                    q2aVar = z4aVar2.l;
                    m4a m4aVar2 = z4aVar2.k;
                    cir cirVar3 = z4aVar2.j;
                    qgg.h0(obj);
                    l4aVar = m4aVar2;
                    cirVar2 = cirVar3;
                    q2a q2aVar32 = (q2a) obj;
                    dq7 dq7Var3 = ca8.a;
                    y4h y4hVar3 = (y4h) sm6.a.a;
                    oh3 oh3Var2 = new oh3(cirVar2, null, null, l4aVar, q2aVar32, null, 1);
                    z4aVar2.j = null;
                    z4aVar2.k = null;
                    z4aVar2.l = q2aVar;
                    z4aVar2.m = i2;
                    z4aVar2.p = 2;
                }
            }
        }
        z4aVar = new z4a(b5aVar, cg6Var);
        z4a z4aVar22 = z4aVar;
        Object obj2 = z4aVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = z4aVar22.p;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    public static jyr e(t5a t5aVar, q2a q2aVar, Boolean bool) {
        return fsg.a(fsg.d(t5aVar != null ? t5aVar.a : null, "targetQueryPath"), fsg.d(t5aVar != null ? t5aVar.b : null, "targetQueryParams"), fsg.d(bool, "isLoadingRequired"), new Pair("hasPreviewDocument", Boolean.valueOf(q2aVar != null)));
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(((defpackage.k6a) r3).c, ((defpackage.p6n) r2).a) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(((defpackage.j6a) r3).c, ((defpackage.p6n) r2).a) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    @Override // defpackage.ttr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cir cirVar, ohb ohbVar, lco lcoVar) {
        boolean z;
        Object d;
        StackTraceElement stackTraceElement;
        String str;
        Integer num;
        String num2;
        StackTraceElement stackTraceElement2;
        String num3;
        if (!(ohbVar instanceof r5a)) {
            if (ohbVar instanceof z5a) {
                Object h = h(cirVar, (z5a) ohbVar, lcoVar);
                return h == nm6.a ? h : Unit.a;
            }
            if (ohbVar instanceof s4a) {
                throw null;
            }
            if (ohbVar instanceof s5a) {
                throw null;
            }
            return Unit.a;
        }
        q5a q5aVar = ((r5a) ohbVar).a;
        boolean z2 = q5aVar instanceof fxn;
        String str2 = "No line info";
        g06 g06Var = this.h;
        vhc vhcVar = vhc.d;
        if (z2) {
            fxn fxnVar = (fxn) q5aVar;
            jyr e = e(fxnVar.b, fxnVar.a.a, null);
            c5b c5bVar = c5b.a;
            htb htbVar = ((thc) g06Var.c).a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) hrg.k(0)) != null) {
                String fileName = stackTraceElement2.getFileName();
                str = fileName != null ? fileName : "No file info";
                String methodName = stackTraceElement2.getMethodName();
                Integer num4 = new Integer(stackTraceElement2.getLineNumber());
                num = num4.intValue() > 0 ? num4 : null;
                if (num != null && (num3 = num.toString()) != null) {
                    str2 = num3;
                }
                vhcVar = new vhc(str, methodName, str2);
            }
            g06Var.N(yhc.DEBUG, "Handled Rendered origin changed event", e, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
            d = Unit.a;
        } else {
            if (!(q5aVar instanceof p6n)) {
                b6e.s();
                return null;
            }
            m6a m6aVar = (m6a) cirVar.a;
            if (!(m6aVar instanceof i6a) && !(m6aVar instanceof h6a)) {
                if (!(m6aVar instanceof k6a)) {
                    if (!(m6aVar instanceof j6a)) {
                        if (!(m6aVar instanceof l6a)) {
                            b6e.s();
                            return null;
                        }
                    }
                }
                p6n p6nVar = (p6n) q5aVar;
                q2a q2aVar = p6nVar.b;
                jyr e2 = e(p6nVar.a, q2aVar, Boolean.valueOf(z));
                c5b c5bVar2 = c5b.a;
                htb htbVar2 = ((thc) g06Var.c).a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                    String fileName2 = stackTraceElement.getFileName();
                    str = fileName2 != null ? fileName2 : "No file info";
                    String methodName2 = stackTraceElement.getMethodName();
                    Integer num5 = new Integer(stackTraceElement.getLineNumber());
                    num = num5.intValue() > 0 ? num5 : null;
                    if (num != null && (num2 = num.toString()) != null) {
                        str2 = num2;
                    }
                    vhcVar = new vhc(str, methodName2, str2);
                }
                g06Var.N(yhc.DEBUG, "Handled Queried origin changed event", e2, c5bVar2, vhcVar.a, vhcVar.b, vhcVar.c);
                if (z) {
                    d = Unit.a;
                } else {
                    t5a t5aVar = p6nVar.a;
                    cirVar.b(new n5a(q2aVar, t5aVar));
                    d = d(cirVar, t5aVar, p6nVar.c, false, false, false, lcoVar);
                    if (d != nm6.a) {
                        d = Unit.a;
                    }
                }
            }
            z = true;
            p6n p6nVar2 = (p6n) q5aVar;
            q2a q2aVar2 = p6nVar2.b;
            jyr e22 = e(p6nVar2.a, q2aVar2, Boolean.valueOf(z));
            c5b c5bVar22 = c5b.a;
            htb htbVar22 = ((thc) g06Var.c).a;
            if (Boolean.FALSE.booleanValue()) {
                String fileName22 = stackTraceElement.getFileName();
                if (fileName22 != null) {
                }
                String methodName22 = stackTraceElement.getMethodName();
                Integer num52 = new Integer(stackTraceElement.getLineNumber());
                if (num52.intValue() > 0) {
                }
                if (num != null) {
                    str2 = num2;
                }
                vhcVar = new vhc(str, methodName22, str2);
            }
            g06Var.N(yhc.DEBUG, "Handled Queried origin changed event", e22, c5bVar22, vhcVar.a, vhcVar.b, vhcVar.c);
            if (z) {
            }
        }
        return d == nm6.a ? d : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x012a, code lost:
    
        if (kotlin.Unit.a != r9) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cir cirVar, t5a t5aVar, List list, boolean z, boolean z2, boolean z3, cg6 cg6Var) {
        v4a v4aVar;
        int i;
        boolean z4;
        boolean z5;
        x4a x4aVar;
        t5a t5aVar2;
        boolean z6;
        q2a q2aVar;
        ny2 ny2Var;
        rar rarVar;
        b5a b5aVar = this;
        if (cg6Var instanceof v4a) {
            v4aVar = (v4a) cg6Var;
            int i2 = v4aVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v4aVar.s = i2 - Integer.MIN_VALUE;
                v4a v4aVar2 = v4aVar;
                Object obj = v4aVar2.q;
                nm6 nm6Var = nm6.a;
                i = v4aVar2.s;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    m4a a = ((m6a) cirVar.a).a();
                    q2a q2aVar2 = a != null ? a.a : null;
                    if (q2aVar2 != null) {
                        q2a q2aVar3 = !z3 ? q2aVar2 : null;
                        if (q2aVar3 != null) {
                            q2aVar2 = q2a.a(q2aVar3, null, null, null, 47);
                        }
                    }
                    q2a q2aVar4 = q2aVar2;
                    ov ovVar = new ov(q2aVar4, this, t5aVar, list, (Continuation) null);
                    ny2 ny2Var2 = new ny2(17, cirVar, t5aVar);
                    b5aVar = this;
                    z4 = z;
                    x4a x4aVar2 = new x4a(b5aVar, t5aVar, z4, cirVar, ovVar, null);
                    v4aVar2.j = t5aVar;
                    v4aVar2.k = q2aVar4;
                    v4aVar2.l = ny2Var2;
                    v4aVar2.m = x4aVar2;
                    v4aVar2.n = z4;
                    z5 = z2;
                    v4aVar2.o = z5;
                    v4aVar2.p = z3;
                    v4aVar2.s = 1;
                    Object f = b5aVar.f(t5aVar, new vhm(), v4aVar2);
                    if (f != nm6Var) {
                        x4aVar = x4aVar2;
                        t5aVar2 = t5aVar;
                        obj = f;
                        z6 = z3;
                        q2aVar = q2aVar4;
                        ny2Var = ny2Var2;
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
                z6 = v4aVar2.p;
                boolean z7 = v4aVar2.o;
                boolean z8 = v4aVar2.n;
                x4a x4aVar3 = v4aVar2.m;
                ny2 ny2Var3 = v4aVar2.l;
                q2aVar = v4aVar2.k;
                t5aVar2 = v4aVar2.j;
                qgg.h0(obj);
                z5 = z7;
                z4 = z8;
                x4aVar = x4aVar3;
                ny2Var = ny2Var3;
                ryn rynVar = (ryn) obj;
                w4a w4aVar = new w4a(b5aVar, t5aVar2, q2aVar, z4, z5, null);
                c68 c68Var = new c68(10);
                n71 n71Var = new n71(b5aVar, t5aVar2, continuation, 8);
                le0 le0Var = new le0(2, ny2Var, lxe.class, "suspendConversion0", "fetchDocument$suspendConversion0(Lkotlin/jvm/functions/Function1;Lflex/utils/kotlin/RepeatableTaskResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14);
                v4aVar2.j = null;
                v4aVar2.k = null;
                v4aVar2.l = null;
                v4aVar2.m = null;
                v4aVar2.n = z4;
                v4aVar2.o = z5;
                v4aVar2.p = z6;
                v4aVar2.s = 2;
                rarVar = rynVar.d;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                rynVar.d = x97.y(rynVar.a, null, null, new xg(rynVar, w4aVar, c68Var, x4aVar, n71Var, le0Var, (Continuation) null), 3);
            }
        }
        v4aVar = new v4a(b5aVar, cg6Var);
        v4a v4aVar22 = v4aVar;
        Object obj2 = v4aVar22.q;
        nm6 nm6Var2 = nm6.a;
        i = v4aVar22.s;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ryn rynVar2 = (ryn) obj2;
        w4a w4aVar2 = new w4a(b5aVar, t5aVar2, q2aVar, z4, z5, null);
        c68 c68Var2 = new c68(10);
        n71 n71Var2 = new n71(b5aVar, t5aVar2, continuation2, 8);
        le0 le0Var2 = new le0(2, ny2Var, lxe.class, "suspendConversion0", "fetchDocument$suspendConversion0(Lkotlin/jvm/functions/Function1;Lflex/utils/kotlin/RepeatableTaskResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14);
        v4aVar22.j = null;
        v4aVar22.k = null;
        v4aVar22.l = null;
        v4aVar22.m = null;
        v4aVar22.n = z4;
        v4aVar22.o = z5;
        v4aVar22.p = z6;
        v4aVar22.s = 2;
        rarVar = rynVar2.d;
        if (rarVar != null) {
        }
        rynVar2.d = x97.y(rynVar2.a, null, null, new xg(rynVar2, w4aVar2, c68Var2, x4aVar, n71Var2, le0Var2, (Continuation) null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(t5a t5aVar, vhm vhmVar, cg6 cg6Var) {
        y4a y4aVar;
        int i;
        r4a r4aVar;
        b5a b5aVar;
        if (cg6Var instanceof y4a) {
            y4aVar = (y4a) cg6Var;
            int i2 = y4aVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y4aVar.n = i2 - Integer.MIN_VALUE;
                Object obj = y4aVar.l;
                nm6 nm6Var = nm6.a;
                i = y4aVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    r4a r4aVar2 = new r4a(t5aVar, vhmVar);
                    ryn rynVar = (ryn) this.g.get(r4aVar2);
                    if (rynVar != null) {
                        return rynVar;
                    }
                    y4aVar.j = r4aVar2;
                    y4aVar.k = this;
                    y4aVar.n = 1;
                    Integer num = new Integer(1);
                    Long l = new Long(0L);
                    ryn rynVar2 = new ryn(gld.e(y4aVar.getContext().plus(a4g.n())), num.intValue(), l.longValue());
                    if (rynVar2 == nm6Var) {
                        return nm6Var;
                    }
                    obj = rynVar2;
                    r4aVar = r4aVar2;
                    b5aVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b5aVar = y4aVar.k;
                    r4aVar = y4aVar.j;
                    qgg.h0(obj);
                }
                ryn rynVar3 = (ryn) obj;
                b5aVar.g.put(r4aVar, rynVar3);
                return rynVar3;
            }
        }
        y4aVar = new y4a(this, cg6Var);
        Object obj2 = y4aVar.l;
        nm6 nm6Var2 = nm6.a;
        i = y4aVar.n;
        if (i != 0) {
        }
        ryn rynVar32 = (ryn) obj2;
        b5aVar.g.put(r4aVar, rynVar32);
        return rynVar32;
    }

    public final void g(t5a t5aVar, syn synVar, boolean z) {
        StackTraceElement stackTraceElement;
        String str;
        Integer valueOf;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        boolean z2 = synVar.c;
        int i = synVar.b;
        if (!z2 || z) {
            l4a l4aVar = (l4a) synVar.a;
            boolean z3 = l4aVar instanceof m4a;
            String str2 = "No line info";
            g06 g06Var = this.h;
            vhc vhcVar = vhc.d;
            if (z3) {
                jyr a = fsg.a(new Pair("query", t5aVar), new Pair("retryIteration", Integer.valueOf(i)));
                c5b c5bVar = c5b.a;
                htb htbVar = ((thc) g06Var.c).a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    str = fileName != null ? fileName : "No file info";
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf != null && (num = valueOf.toString()) != null) {
                        str2 = num;
                    }
                    vhcVar = new vhc(str, methodName, str2);
                }
                g06Var.N(yhc.INFO, "Request retry succeeded", a, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
                return;
            }
            boolean z4 = l4aVar instanceof k4a;
            if (!z4 && !(l4aVar instanceof j4a)) {
                b6e.s();
                return;
            }
            jyr a2 = fsg.a(new Pair("query", t5aVar), new Pair("cause", z4 ? ((k4a) l4aVar).a : l4aVar instanceof j4a ? null : new Throwable()), new Pair("retryIteration", Integer.valueOf(i)));
            c5b c5bVar2 = c5b.a;
            htb htbVar2 = ((thc) g06Var.c).a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) hrg.k(0)) != null) {
                String fileName2 = stackTraceElement2.getFileName();
                str = fileName2 != null ? fileName2 : "No file info";
                String methodName2 = stackTraceElement2.getMethodName();
                int lineNumber2 = stackTraceElement2.getLineNumber();
                valueOf = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                if (valueOf != null && (num2 = valueOf.toString()) != null) {
                    str2 = num2;
                }
                vhcVar = new vhc(str, methodName2, str2);
            }
            g06Var.N(yhc.INFO, "Request retry failed", a2, c5bVar2, vhcVar.a, vhcVar.b, vhcVar.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r1.d(r12, r14, r4, r5, true, true, r8) != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cir cirVar, z5a z5aVar, cg6 cg6Var) {
        a5a a5aVar;
        int i;
        t5a i0;
        b5a b5aVar;
        if (cg6Var instanceof a5a) {
            a5aVar = (a5a) cg6Var;
            int i2 = a5aVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a5aVar.o = i2 - Integer.MIN_VALUE;
                a5a a5aVar2 = a5aVar;
                Object obj = a5aVar2.m;
                nm6 nm6Var = nm6.a;
                i = a5aVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    i0 = y5g.i0((m6a) cirVar.a);
                    if (i0 != null) {
                        cirVar.b(new n5a(null, i0));
                        if (z5aVar.a) {
                            long currentTimeMillis = (this.f + 2000) - System.currentTimeMillis();
                            a5aVar2.j = cirVar;
                            a5aVar2.k = z5aVar;
                            a5aVar2.l = i0;
                            a5aVar2.o = 1;
                            if (y2x.o(currentTimeMillis, a5aVar2) == nm6Var) {
                                return nm6Var;
                            }
                        }
                        List list = z5aVar.b;
                        boolean z = z5aVar.a;
                        a5aVar2.j = null;
                        a5aVar2.k = null;
                        a5aVar2.l = null;
                        a5aVar2.o = 2;
                        b5aVar = this;
                    }
                    b5aVar = this;
                    b5aVar.f = System.currentTimeMillis();
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b5aVar = this;
                    b5aVar.f = System.currentTimeMillis();
                    return Unit.a;
                }
                t5a t5aVar = a5aVar2.l;
                z5aVar = a5aVar2.k;
                cir cirVar2 = a5aVar2.j;
                qgg.h0(obj);
                i0 = t5aVar;
                cirVar = cirVar2;
                List list2 = z5aVar.b;
                boolean z2 = z5aVar.a;
                a5aVar2.j = null;
                a5aVar2.k = null;
                a5aVar2.l = null;
                a5aVar2.o = 2;
                b5aVar = this;
            }
        }
        a5aVar = new a5a(this, cg6Var);
        a5a a5aVar22 = a5aVar;
        Object obj2 = a5aVar22.m;
        nm6 nm6Var2 = nm6.a;
        i = a5aVar22.o;
        if (i != 0) {
        }
    }
}
