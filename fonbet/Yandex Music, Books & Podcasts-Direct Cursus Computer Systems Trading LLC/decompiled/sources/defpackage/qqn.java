package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qqn {
    public static final String c;
    public static final List d;
    public final yks a;
    public final AtomicReference b = new AtomicReference(null);

    static {
        String str = xhw.w;
        c = "YnisonCore:".concat("RedirectorServiceProvider");
        d = u75.h(r76.b, r76.c, r76.e);
    }

    public qqn(yks yksVar) {
        this.a = yksVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(qqn qqnVar, cg6 cg6Var) {
        nqn nqnVar;
        int i;
        sqd sqdVar;
        if (cg6Var instanceof nqn) {
            nqnVar = (nqn) cg6Var;
            int i2 = nqnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nqnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = nqnVar.k;
                nm6 nm6Var = nm6.a;
                i = nqnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    yks yksVar = qqnVar.a;
                    nqnVar.j = qqnVar;
                    nqnVar.l = 1;
                    obj = x97.V(ca8.a, new fzb(new ftr(21, (dd4) yksVar.b, (uiq) yksVar.c, (dgw) yksVar.d), (Continuation) null, 29), nqnVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qqnVar = nqnVar.j;
                    qgg.h0(obj);
                }
                sqdVar = (sqd) obj;
                oqn oqnVar = oqn.a;
                sqdVar.getClass();
                oqnVar.getClass();
                if (!sqdVar.b.get()) {
                    ssg.a(5, sqd.c, "outdated channel usage detected", null);
                }
                Object invoke = oqnVar.invoke(sqdVar.a);
                dow dowVar = (dow) invoke;
                ssg.a(4, c, "create service ".concat(dow.class.getSimpleName() + "(" + System.identityHashCode(dowVar) + ")"), null);
                qqnVar.b.set(dowVar);
                return invoke;
            }
        }
        nqnVar = new nqn(cg6Var);
        Object obj2 = nqnVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nqnVar.l;
        if (i != 0) {
        }
        sqdVar = (sqd) obj2;
        oqn oqnVar2 = oqn.a;
        sqdVar.getClass();
        oqnVar2.getClass();
        if (!sqdVar.b.get()) {
        }
        Object invoke2 = oqnVar2.invoke(sqdVar.a);
        dow dowVar2 = (dow) invoke2;
        ssg.a(4, c, "create service ".concat(dow.class.getSimpleName() + "(" + System.identityHashCode(dowVar2) + ")"), null);
        qqnVar.b.set(dowVar2);
        return invoke2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, cg6 cg6Var) {
        mqn mqnVar;
        int i;
        dow dowVar;
        if (cg6Var instanceof mqn) {
            mqnVar = (mqn) cg6Var;
            int i2 = mqnVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mqnVar.m = i2 - Integer.MIN_VALUE;
                Object obj = mqnVar.k;
                Object obj2 = nm6.a;
                i = mqnVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    mqnVar.j = z;
                    mqnVar.m = 1;
                    obj = b(mqnVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = mqnVar.j;
                    qgg.h0(obj);
                }
                dow dowVar2 = (dow) obj;
                mqnVar.j = z;
                mqnVar.m = 2;
                zt3 zt3Var = new zt3(1, qxe.b(mqnVar));
                zt3Var.s();
                mc4 mc4Var = (mc4) dowVar2.b;
                mc4Var.getClass();
                r76 i3 = ((t7h) mc4Var).i(false);
                if (z && (dowVar = (dow) this.b.get()) != null) {
                    mc4 mc4Var2 = (mc4) dowVar.b;
                    mc4Var2.getClass();
                    t7h t7hVar = (t7h) mc4Var2;
                    t7hVar.m();
                    t7hVar.i(true);
                }
                mc4 mc4Var3 = (mc4) dowVar2.b;
                mc4Var3.getClass();
                ((t7h) mc4Var3).l(i3, new e8h(zt3Var, this, dowVar2));
                Object q = zt3Var.q();
                return q != obj2 ? obj2 : q;
            }
        }
        mqnVar = new mqn(this, cg6Var);
        Object obj3 = mqnVar.k;
        Object obj22 = nm6.a;
        i = mqnVar.m;
        if (i != 0) {
        }
        dow dowVar22 = (dow) obj3;
        mqnVar.j = z;
        mqnVar.m = 2;
        zt3 zt3Var2 = new zt3(1, qxe.b(mqnVar));
        zt3Var2.s();
        mc4 mc4Var4 = (mc4) dowVar22.b;
        mc4Var4.getClass();
        r76 i32 = ((t7h) mc4Var4).i(false);
        if (z) {
            mc4 mc4Var22 = (mc4) dowVar.b;
            mc4Var22.getClass();
            t7h t7hVar2 = (t7h) mc4Var22;
            t7hVar2.m();
            t7hVar2.i(true);
        }
        mc4 mc4Var32 = (mc4) dowVar22.b;
        mc4Var32.getClass();
        ((t7h) mc4Var32).l(i32, new e8h(zt3Var2, this, dowVar22));
        Object q2 = zt3Var2.q();
        if (q2 != obj22) {
        }
    }

    public final Object b(cg6 cg6Var) {
        dow dowVar = (dow) this.b.get();
        if (dowVar == null) {
            return c(this, cg6Var);
        }
        mc4 mc4Var = (mc4) dowVar.b;
        mc4Var.getClass();
        t7h t7hVar = (t7h) mc4Var;
        return t7hVar.k() ? c(this, cg6Var) : t7hVar.j() ? c(this, cg6Var) : dowVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0046 -> B:10:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(boolean r5, defpackage.cg6 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pqn
            if (r0 == 0) goto L13
            r0 = r6
            pqn r0 = (defpackage.pqn) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            pqn r0 = new pqn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.l
            nm6 r1 = defpackage.nm6.a
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            boolean r5 = r0.j
            java.util.List r2 = r0.k
            java.util.List r2 = (java.util.List) r2
            defpackage.qgg.h0(r6)
            goto L49
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.xq0.q(r5)
            r5 = 0
            return r5
        L34:
            defpackage.qgg.h0(r6)
        L37:
            java.util.List r2 = defpackage.qqn.d
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r0.k = r6
            r0.j = r5
            r0.n = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L37
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqn.d(boolean, cg6):java.lang.Object");
    }
}
