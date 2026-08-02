package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class ryn {
    public final tf6 a;
    public final int b;
    public final long c;
    public rar d;

    public ryn(tf6 tf6Var, int i, long j) {
        this.a = tf6Var;
        this.b = i;
        this.c = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (r13.invoke(r4, r2) == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0180, code lost:
    
        if (r11.invoke(r0, r12) == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0156 -> B:20:0x015e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ryn rynVar, Function1 function1, Function1 function12, Function2 function2, Function2 function22, Function2 function23, cg6 cg6Var) {
        qyn qynVar;
        int i;
        Function2 function24;
        Function2 function25;
        Function2 function26;
        vqn vqnVar;
        qyn qynVar2;
        Object obj;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        Function2 function27;
        Function2 function28;
        vqn vqnVar2;
        Object obj2;
        Function2 function29;
        long j;
        char c;
        vqn vqnVar3;
        int i2;
        if (cg6Var instanceof qyn) {
            qynVar = (qyn) cg6Var;
            int i3 = qynVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qynVar.t = i3 - Integer.MIN_VALUE;
                Object obj3 = qynVar.r;
                nm6 nm6Var = nm6.a;
                i = qynVar.t;
                int i4 = 3;
                if (i != 0) {
                    qgg.h0(obj3);
                    function24 = function2;
                    function25 = function22;
                    function26 = function23;
                    vqnVar = new vqn();
                    qynVar2 = qynVar;
                    obj = null;
                    function13 = function1;
                    function14 = function12;
                    i2 = vqnVar.a;
                    if (i2 < rynVar.b) {
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    vqnVar3 = qynVar.o;
                    Function2 function210 = qynVar.n;
                    Function2 function211 = qynVar.m;
                    Function2 function212 = qynVar.l;
                    Function1 function17 = qynVar.k;
                    Function1 function18 = qynVar.j;
                    qgg.h0(obj3);
                    function15 = function18;
                    function16 = function17;
                    function27 = function212;
                    function28 = function211;
                    function26 = function210;
                    if (((Boolean) function16.invoke(obj3)).booleanValue()) {
                    }
                    return nm6Var;
                }
                if (i == 2) {
                    qgg.h0(obj3);
                    return Unit.a;
                }
                if (i == 3) {
                    obj2 = qynVar.p;
                    vqn vqnVar4 = qynVar.o;
                    Function2 function213 = qynVar.n;
                    function28 = qynVar.m;
                    function27 = qynVar.l;
                    function16 = qynVar.k;
                    function15 = qynVar.j;
                    qgg.h0(obj3);
                    function29 = function213;
                    vqnVar2 = vqnVar4;
                    vqnVar2.a++;
                    j = rynVar.c;
                    qynVar.j = function15;
                    qynVar.k = function16;
                    qynVar.l = function27;
                    qynVar.m = function28;
                    qynVar.n = function29;
                    qynVar.o = vqnVar2;
                    qynVar.p = obj2;
                    c = 4;
                    qynVar.t = 4;
                    if (y2x.o(j, qynVar) != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i != 4) {
                    if (i == 5) {
                        qgg.h0(obj3);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj4 = qynVar.p;
                vqn vqnVar5 = qynVar.o;
                Function2 function214 = qynVar.n;
                Function2 function215 = qynVar.m;
                Function2 function216 = qynVar.l;
                Function1 function19 = qynVar.k;
                Function1 function110 = qynVar.j;
                qgg.h0(obj3);
                obj = obj4;
                function24 = function216;
                function13 = function110;
                c = 4;
                function25 = function215;
                vqnVar = vqnVar5;
                function26 = function214;
                qynVar2 = qynVar;
                function14 = function19;
                i4 = 3;
                i2 = vqnVar.a;
                if (i2 < rynVar.b) {
                    qynVar2.j = function13;
                    qynVar2.k = function14;
                    qynVar2.l = function24;
                    qynVar2.m = function25;
                    qynVar2.n = function26;
                    qynVar2.o = vqnVar;
                    qynVar2.p = null;
                    qynVar2.t = 1;
                    Object invoke = function13.invoke(qynVar2);
                    if (invoke != nm6Var) {
                        vqn vqnVar6 = vqnVar;
                        function27 = function24;
                        vqnVar3 = vqnVar6;
                        function15 = function13;
                        function16 = function14;
                        obj3 = invoke;
                        qynVar = qynVar2;
                        function28 = function25;
                        if (((Boolean) function16.invoke(obj3)).booleanValue()) {
                            syn synVar = new syn(vqnVar3.a, obj3);
                            qynVar.j = function15;
                            qynVar.k = function16;
                            qynVar.l = function27;
                            qynVar.m = function28;
                            qynVar.n = function26;
                            qynVar.o = vqnVar3;
                            qynVar.p = obj3;
                            qynVar.t = i4;
                            if (function28.invoke(synVar, qynVar) != nm6Var) {
                                vqn vqnVar7 = vqnVar3;
                                obj2 = obj3;
                                function29 = function26;
                                vqnVar2 = vqnVar7;
                                vqnVar2.a++;
                                j = rynVar.c;
                                qynVar.j = function15;
                                qynVar.k = function16;
                                qynVar.l = function27;
                                qynVar.m = function28;
                                qynVar.n = function29;
                                qynVar.o = vqnVar2;
                                qynVar.p = obj2;
                                c = 4;
                                qynVar.t = 4;
                                if (y2x.o(j, qynVar) != nm6Var) {
                                    function25 = function28;
                                    qynVar2 = qynVar;
                                    function14 = function16;
                                    obj = obj2;
                                    function24 = function27;
                                    vqnVar = vqnVar2;
                                    function26 = function29;
                                    function13 = function15;
                                    i4 = 3;
                                    i2 = vqnVar.a;
                                    if (i2 < rynVar.b) {
                                        if (obj != null) {
                                            syn synVar2 = new syn(i2, obj);
                                            qynVar2.j = null;
                                            qynVar2.k = null;
                                            qynVar2.l = null;
                                            qynVar2.m = null;
                                            qynVar2.n = null;
                                            qynVar2.o = null;
                                            qynVar2.p = null;
                                            qynVar2.q = obj;
                                            qynVar2.t = 5;
                                        }
                                        return Unit.a;
                                    }
                                }
                            }
                        } else {
                            syn synVar3 = new syn(vqnVar3.a, obj3);
                            qynVar.j = null;
                            qynVar.k = null;
                            qynVar.l = null;
                            qynVar.m = null;
                            qynVar.n = null;
                            qynVar.o = null;
                            qynVar.p = null;
                            qynVar.t = 2;
                        }
                    }
                }
                return nm6Var;
            }
        }
        qynVar = new qyn(rynVar, cg6Var);
        Object obj32 = qynVar.r;
        nm6 nm6Var2 = nm6.a;
        i = qynVar.t;
        int i42 = 3;
        if (i != 0) {
        }
    }
}
