package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class wna {
    public static final float a = ((float) 0.125d) / 18;

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008b -> B:10:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hur hurVar, lfm lfmVar, gfm gfmVar, kq2 kq2Var) {
        ena enaVar;
        int i;
        wqn wqnVar;
        yps ypsVar;
        int i2;
        gfm gfmVar2;
        ena enaVar2;
        float f;
        hur hurVar2;
        Object a2;
        ena enaVar3;
        Object obj;
        int size;
        int i3;
        Object obj2;
        lfm lfmVar2;
        int size2;
        int i4;
        if (kq2Var instanceof ena) {
            enaVar = (ena) kq2Var;
            int i5 = enaVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                enaVar.q = i5 - Integer.MIN_VALUE;
                Object obj3 = enaVar.p;
                nm6 nm6Var = nm6.a;
                i = enaVar.q;
                int i6 = 1;
                if (i == 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = enaVar.o;
                    int i7 = enaVar.n;
                    yps ypsVar2 = enaVar.m;
                    wqn wqnVar2 = enaVar.l;
                    gfm gfmVar3 = enaVar.k;
                    hur hurVar3 = enaVar.j;
                    qgg.h0(obj3);
                    ena enaVar4 = enaVar;
                    f = f2;
                    hurVar2 = hurVar3;
                    wqn wqnVar3 = wqnVar2;
                    ypsVar = ypsVar2;
                    ena enaVar5 = enaVar4;
                    List list = ((ffm) obj3).a;
                    int size3 = list.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 < size3) {
                            enaVar3 = enaVar5;
                            obj = null;
                            break;
                        }
                        obj = list.get(i8);
                        enaVar3 = enaVar5;
                        if (ywf.u(((lfm) obj).a, wqnVar3.a)) {
                            break;
                        }
                        i8++;
                        enaVar5 = enaVar3;
                    }
                    lfm lfmVar3 = (lfm) obj;
                    if (lfmVar3 != null || swf.B(lfmVar3)) {
                        size = list.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i3);
                            if (((lfm) obj2).d) {
                                break;
                            }
                            i3++;
                        }
                        lfmVar2 = (lfm) obj2;
                        if (lfmVar2 != null) {
                            return Boolean.valueOf(i7 != 0);
                        }
                        wqnVar3.a = lfmVar2.a;
                    } else if ((ypsVar.a(lfmVar3, f) & 9223372034707292159L) != 9205357640488583168L) {
                        i2 = 1;
                        size2 = list.size();
                        for (i4 = 0; i4 < size2; i4++) {
                            if (((lfm) list.get(i4)).d) {
                                enaVar2 = enaVar3;
                                gfmVar2 = gfmVar3;
                                wqnVar = wqnVar3;
                                i6 = 1;
                                enaVar2.j = hurVar2;
                                enaVar2.k = gfmVar2;
                                enaVar2.l = wqnVar;
                                enaVar2.m = ypsVar;
                                enaVar2.n = i2;
                                enaVar2.o = f;
                                enaVar2.q = i6;
                                a2 = hurVar2.a(gfmVar2, enaVar2);
                                if (a2 != nm6Var) {
                                    return nm6Var;
                                }
                                wqn wqnVar4 = wqnVar;
                                gfmVar3 = gfmVar2;
                                obj3 = a2;
                                wqnVar3 = wqnVar4;
                                int i9 = i2;
                                enaVar5 = enaVar2;
                                i7 = i9;
                                List list2 = ((ffm) obj3).a;
                                int size32 = list2.size();
                                int i82 = 0;
                                while (true) {
                                    if (i82 < size32) {
                                    }
                                    i82++;
                                    enaVar5 = enaVar3;
                                }
                                lfm lfmVar32 = (lfm) obj;
                                if (lfmVar32 != null) {
                                }
                                size = list2.size();
                                i3 = 0;
                                while (true) {
                                    if (i3 < size) {
                                    }
                                    i3++;
                                }
                                lfmVar2 = (lfm) obj2;
                                if (lfmVar2 != null) {
                                }
                            }
                        }
                        return Boolean.valueOf(i2 == 0);
                    }
                    i2 = i7;
                    size2 = list2.size();
                    while (i4 < size2) {
                    }
                    return Boolean.valueOf(i2 == 0);
                }
                qgg.h0(obj3);
                if (xee.s(hurVar)) {
                    return Boolean.FALSE;
                }
                wqn wqnVar5 = new wqn();
                wqnVar5.a = lfmVar.a;
                float l = l(hurVar.c(), lfmVar.i);
                wqnVar = wqnVar5;
                ypsVar = new yps(0L, null);
                i2 = 0;
                gfmVar2 = gfmVar;
                enaVar2 = enaVar;
                f = l;
                hurVar2 = hurVar;
                enaVar2.j = hurVar2;
                enaVar2.k = gfmVar2;
                enaVar2.l = wqnVar;
                enaVar2.m = ypsVar;
                enaVar2.n = i2;
                enaVar2.o = f;
                enaVar2.q = i6;
                a2 = hurVar2.a(gfmVar2, enaVar2);
                if (a2 != nm6Var) {
                }
            }
        }
        enaVar = new ena(kq2Var);
        Object obj32 = enaVar.p;
        nm6 nm6Var2 = nm6.a;
        i = enaVar.q;
        int i62 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        if (defpackage.enj.c(defpackage.swf.f0(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005f -> B:10:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(hur hurVar, long j, cg6 cg6Var) {
        fna fnaVar;
        int i;
        hur hurVar2;
        wqn wqnVar;
        Object a2;
        Object obj;
        Object obj2;
        if (cg6Var instanceof fna) {
            fnaVar = (fna) cg6Var;
            int i2 = fnaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fnaVar.m = i2 - Integer.MIN_VALUE;
                Object obj3 = fnaVar.l;
                nm6 nm6Var = nm6.a;
                i = fnaVar.m;
                if (i != 0) {
                    qgg.h0(obj3);
                    hurVar2 = hurVar;
                    if (!k(hurVar2.f.t, j)) {
                        wqn wqnVar2 = new wqn();
                        wqnVar2.a = j;
                        wqnVar = wqnVar2;
                        fnaVar.j = hurVar2;
                        fnaVar.k = wqnVar;
                        fnaVar.m = 1;
                        a2 = hurVar2.a(gfm.b, fnaVar);
                        if (a2 != nm6Var) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wqnVar = fnaVar.k;
                hur hurVar3 = fnaVar.j;
                qgg.h0(obj3);
                ffm ffmVar = (ffm) obj3;
                List list = ffmVar.a;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i4);
                    if (ywf.u(((lfm) obj).a, wqnVar.a)) {
                        break;
                    }
                    i4++;
                }
                lfm lfmVar = (lfm) obj;
                if (lfmVar == null) {
                    if (swf.B(lfmVar)) {
                        List list2 = ffmVar.a;
                        int size2 = list2.size();
                        while (true) {
                            if (i3 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i3);
                            if (((lfm) obj2).d) {
                                break;
                            }
                            i3++;
                        }
                        lfm lfmVar2 = (lfm) obj2;
                        if (lfmVar2 != null) {
                            wqnVar.a = lfmVar2.a;
                            hurVar2 = hurVar3;
                            fnaVar.j = hurVar2;
                            fnaVar.k = wqnVar;
                            fnaVar.m = 1;
                            a2 = hurVar2.a(gfm.b, fnaVar);
                            if (a2 != nm6Var) {
                                return nm6Var;
                            }
                            hur hurVar4 = hurVar2;
                            obj3 = a2;
                            hurVar3 = hurVar4;
                        }
                    }
                    ffm ffmVar2 = (ffm) obj3;
                    List list3 = ffmVar2.a;
                    int size3 = list3.size();
                    int i32 = 0;
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    lfm lfmVar3 = (lfm) obj;
                    if (lfmVar3 == null) {
                        lfmVar3 = null;
                    }
                }
                if (lfmVar3 == null || lfmVar3.b()) {
                    return null;
                }
                return lfmVar3;
            }
        }
        fnaVar = new fna(cg6Var);
        Object obj32 = fnaVar.l;
        nm6 nm6Var2 = nm6.a;
        i = fnaVar.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0166 -> B:11:0x016a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(hur hurVar, long j, int i, pna pnaVar, kq2 kq2Var) {
        gna gnaVar;
        int i2;
        hur hurVar2;
        float l;
        wqn wqnVar;
        yps ypsVar;
        Function2 function2;
        lfm lfmVar;
        lfm lfmVar2;
        long j2;
        char c;
        wqn wqnVar2;
        hur hurVar3;
        yps ypsVar2;
        lfm lfmVar3;
        Object obj;
        if (kq2Var instanceof gna) {
            gnaVar = (gna) kq2Var;
            int i3 = gnaVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gnaVar.q = i3 - Integer.MIN_VALUE;
                Object obj2 = gnaVar.p;
                nm6 nm6Var = nm6.a;
                i2 = gnaVar.q;
                int i4 = 1;
                lfm lfmVar4 = null;
                if (i2 != 0) {
                    qgg.h0(obj2);
                    bxj bxjVar = bxj.b;
                    hurVar2 = hurVar;
                    if (k(hurVar2.f.t, j)) {
                        return null;
                    }
                    l = l(hurVar2.c(), i);
                    wqnVar = new wqn();
                    wqnVar.a = j;
                    ypsVar = new yps(0L, bxjVar);
                    function2 = pnaVar;
                    gnaVar.j = function2;
                    gnaVar.k = hurVar2;
                    gnaVar.l = wqnVar;
                    gnaVar.m = ypsVar;
                    gnaVar.n = lfmVar4;
                    gnaVar.o = l;
                    gnaVar.q = i4;
                    obj2 = hurVar2.a(gfm.b, gnaVar);
                } else if (i2 == 1) {
                    float f = gnaVar.o;
                    ypsVar = gnaVar.m;
                    wqn wqnVar3 = gnaVar.l;
                    hur hurVar4 = gnaVar.k;
                    Function2 function22 = gnaVar.j;
                    qgg.h0(obj2);
                    l = f;
                    function2 = function22;
                    wqnVar = wqnVar3;
                    hurVar2 = hurVar4;
                    ffm ffmVar = (ffm) obj2;
                    List list = ffmVar.a;
                    int size = list.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            lfmVar = lfmVar4;
                            lfmVar2 = lfmVar;
                            break;
                        }
                        lfmVar2 = list.get(i6);
                        lfmVar = lfmVar4;
                        int i7 = i6;
                        if (ywf.u(((lfm) lfmVar2).a, wqnVar.a)) {
                            break;
                        }
                        i6 = i7 + 1;
                        lfmVar4 = lfmVar;
                    }
                    lfm lfmVar5 = lfmVar2;
                    if (lfmVar5 == null || lfmVar5.b()) {
                        return lfmVar;
                    }
                    if (swf.B(lfmVar5)) {
                        List list2 = ffmVar.a;
                        int size2 = list2.size();
                        while (true) {
                            if (i5 >= size2) {
                                obj = lfmVar;
                                break;
                            }
                            obj = list2.get(i5);
                            if (((lfm) obj).d) {
                                break;
                            }
                            i5++;
                        }
                        lfm lfmVar6 = (lfm) obj;
                        if (lfmVar6 == null) {
                            return lfmVar;
                        }
                        wqnVar.a = lfmVar6.a;
                        lfmVar4 = lfmVar;
                        i4 = 1;
                    } else {
                        long a2 = ypsVar.a(lfmVar5, l);
                        if ((9223372034707292159L & a2) == 9205357640488583168L) {
                            j2 = 0;
                            gfm gfmVar = gfm.c;
                            gnaVar.j = function2;
                            gnaVar.k = hurVar2;
                            gnaVar.l = wqnVar;
                            gnaVar.m = ypsVar;
                            gnaVar.n = lfmVar5;
                            gnaVar.o = l;
                            c = 2;
                            gnaVar.q = 2;
                            if (hurVar2.a(gfmVar, gnaVar) != nm6Var) {
                                wqnVar2 = wqnVar;
                                hurVar3 = hurVar2;
                                ypsVar2 = ypsVar;
                                lfmVar3 = lfmVar5;
                                if (!lfmVar3.b()) {
                                }
                            }
                            return nm6Var;
                        }
                        function2.invoke(lfmVar5, new Float(Float.intBitsToFloat((int) (a2 >> 32))));
                        if (lfmVar5.b()) {
                            return lfmVar5;
                        }
                        ypsVar.b = 0L;
                        lfmVar4 = lfmVar;
                        i4 = 1;
                    }
                    gnaVar.j = function2;
                    gnaVar.k = hurVar2;
                    gnaVar.l = wqnVar;
                    gnaVar.m = ypsVar;
                    gnaVar.n = lfmVar4;
                    gnaVar.o = l;
                    gnaVar.q = i4;
                    obj2 = hurVar2.a(gfm.b, gnaVar);
                } else {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = gnaVar.o;
                    lfmVar3 = gnaVar.n;
                    ypsVar2 = gnaVar.m;
                    wqn wqnVar4 = gnaVar.l;
                    hurVar3 = gnaVar.k;
                    Function2 function23 = gnaVar.j;
                    qgg.h0(obj2);
                    c = 2;
                    lfmVar = null;
                    wqnVar2 = wqnVar4;
                    l = f2;
                    j2 = 0;
                    function2 = function23;
                    if (!lfmVar3.b()) {
                        return lfmVar;
                    }
                    ypsVar = ypsVar2;
                    hurVar2 = hurVar3;
                    lfmVar4 = lfmVar;
                    i4 = 1;
                    wqnVar = wqnVar2;
                    gnaVar.j = function2;
                    gnaVar.k = hurVar2;
                    gnaVar.l = wqnVar;
                    gnaVar.m = ypsVar;
                    gnaVar.n = lfmVar4;
                    gnaVar.o = l;
                    gnaVar.q = i4;
                    obj2 = hurVar2.a(gfm.b, gnaVar);
                }
            }
        }
        gnaVar = new gna(kq2Var);
        Object obj22 = gnaVar.p;
        nm6 nm6Var2 = nm6.a;
        i2 = gnaVar.q;
        int i42 = 1;
        lfm lfmVar42 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0 A[Catch: hfm -> 0x00a9, TRY_LEAVE, TryCatch #0 {hfm -> 0x00a9, blocks: (B:11:0x002a, B:12:0x009c, B:14:0x00a0, B:34:0x0082), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [xqn] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(hur hurVar, long j, kq2 kq2Var) {
        hna hnaVar;
        int i;
        Object obj;
        lfm lfmVar;
        tqn tqnVar;
        try {
            if (kq2Var instanceof hna) {
                hnaVar = (hna) kq2Var;
                int i2 = hnaVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hnaVar.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = hnaVar.m;
                    Object obj3 = nm6.a;
                    i = hnaVar.n;
                    if (i != 0) {
                        qgg.h0(obj2);
                        if (!k(hurVar.f.t, j)) {
                            List list = hurVar.f.t.a;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i3);
                                if (ywf.u(((lfm) obj).a, j)) {
                                    break;
                                }
                                i3++;
                            }
                            lfmVar = (lfm) obj;
                            if (lfmVar != null) {
                                xqn xqnVar = new xqn();
                                xqn xqnVar2 = new xqn();
                                xqnVar2.a = lfmVar;
                                long b = hurVar.c().b();
                                tqn tqnVar2 = new tqn();
                                Function2 inaVar = new ina(tqnVar2, xqnVar2, xqnVar, null);
                                hnaVar.j = lfmVar;
                                hnaVar.k = xqnVar;
                                hnaVar.l = tqnVar2;
                                hnaVar.n = 1;
                                if (hurVar.k(b, inaVar, hnaVar) == obj3) {
                                    return obj3;
                                }
                                tqnVar = tqnVar2;
                                j = xqnVar;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tqnVar = hnaVar.l;
                    xqn xqnVar3 = hnaVar.k;
                    lfmVar = hnaVar.j;
                    qgg.h0(obj2);
                    j = xqnVar3;
                    if (tqnVar.a) {
                        lfm lfmVar2 = (lfm) j.a;
                        return lfmVar2 == null ? lfmVar : lfmVar2;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            if (tqnVar.a) {
            }
            return null;
        } catch (hfm unused) {
            lfm lfmVar3 = (lfm) j.a;
            return lfmVar3 == null ? lfmVar : lfmVar3;
        }
        hnaVar = new hna(kq2Var);
        Object obj22 = hnaVar.m;
        Object obj32 = nm6.a;
        i = hnaVar.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0169 -> B:11:0x016d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(hur hurVar, long j, int i, pna pnaVar, kq2 kq2Var) {
        jna jnaVar;
        int i2;
        hur hurVar2;
        float l;
        wqn wqnVar;
        yps ypsVar;
        Function2 function2;
        lfm lfmVar;
        lfm lfmVar2;
        long j2;
        char c;
        wqn wqnVar2;
        hur hurVar3;
        yps ypsVar2;
        lfm lfmVar3;
        Object obj;
        if (kq2Var instanceof jna) {
            jnaVar = (jna) kq2Var;
            int i3 = jnaVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jnaVar.q = i3 - Integer.MIN_VALUE;
                Object obj2 = jnaVar.p;
                nm6 nm6Var = nm6.a;
                i2 = jnaVar.q;
                int i4 = 1;
                lfm lfmVar4 = null;
                if (i2 != 0) {
                    qgg.h0(obj2);
                    bxj bxjVar = bxj.a;
                    hurVar2 = hurVar;
                    if (k(hurVar2.f.t, j)) {
                        return null;
                    }
                    l = l(hurVar2.c(), i);
                    wqnVar = new wqn();
                    wqnVar.a = j;
                    ypsVar = new yps(0L, bxjVar);
                    function2 = pnaVar;
                    jnaVar.j = function2;
                    jnaVar.k = hurVar2;
                    jnaVar.l = wqnVar;
                    jnaVar.m = ypsVar;
                    jnaVar.n = lfmVar4;
                    jnaVar.o = l;
                    jnaVar.q = i4;
                    obj2 = hurVar2.a(gfm.b, jnaVar);
                } else if (i2 == 1) {
                    float f = jnaVar.o;
                    ypsVar = jnaVar.m;
                    wqn wqnVar3 = jnaVar.l;
                    hur hurVar4 = jnaVar.k;
                    Function2 function22 = jnaVar.j;
                    qgg.h0(obj2);
                    l = f;
                    function2 = function22;
                    wqnVar = wqnVar3;
                    hurVar2 = hurVar4;
                    ffm ffmVar = (ffm) obj2;
                    List list = ffmVar.a;
                    int size = list.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            lfmVar = lfmVar4;
                            lfmVar2 = lfmVar;
                            break;
                        }
                        lfmVar2 = list.get(i6);
                        lfmVar = lfmVar4;
                        int i7 = i6;
                        if (ywf.u(((lfm) lfmVar2).a, wqnVar.a)) {
                            break;
                        }
                        i6 = i7 + 1;
                        lfmVar4 = lfmVar;
                    }
                    lfm lfmVar5 = lfmVar2;
                    if (lfmVar5 == null || lfmVar5.b()) {
                        return lfmVar;
                    }
                    if (swf.B(lfmVar5)) {
                        List list2 = ffmVar.a;
                        int size2 = list2.size();
                        while (true) {
                            if (i5 >= size2) {
                                obj = lfmVar;
                                break;
                            }
                            obj = list2.get(i5);
                            if (((lfm) obj).d) {
                                break;
                            }
                            i5++;
                        }
                        lfm lfmVar6 = (lfm) obj;
                        if (lfmVar6 == null) {
                            return lfmVar;
                        }
                        wqnVar.a = lfmVar6.a;
                        lfmVar4 = lfmVar;
                        i4 = 1;
                    } else {
                        long a2 = ypsVar.a(lfmVar5, l);
                        if ((9223372034707292159L & a2) == 9205357640488583168L) {
                            j2 = 0;
                            gfm gfmVar = gfm.c;
                            jnaVar.j = function2;
                            jnaVar.k = hurVar2;
                            jnaVar.l = wqnVar;
                            jnaVar.m = ypsVar;
                            jnaVar.n = lfmVar5;
                            jnaVar.o = l;
                            c = 2;
                            jnaVar.q = 2;
                            if (hurVar2.a(gfmVar, jnaVar) != nm6Var) {
                                wqnVar2 = wqnVar;
                                hurVar3 = hurVar2;
                                ypsVar2 = ypsVar;
                                lfmVar3 = lfmVar5;
                                if (!lfmVar3.b()) {
                                }
                            }
                            return nm6Var;
                        }
                        function2.invoke(lfmVar5, new Float(Float.intBitsToFloat((int) (a2 & 4294967295L))));
                        if (lfmVar5.b()) {
                            return lfmVar5;
                        }
                        ypsVar.b = 0L;
                        lfmVar4 = lfmVar;
                        i4 = 1;
                    }
                    jnaVar.j = function2;
                    jnaVar.k = hurVar2;
                    jnaVar.l = wqnVar;
                    jnaVar.m = ypsVar;
                    jnaVar.n = lfmVar4;
                    jnaVar.o = l;
                    jnaVar.q = i4;
                    obj2 = hurVar2.a(gfm.b, jnaVar);
                } else {
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = jnaVar.o;
                    lfmVar3 = jnaVar.n;
                    ypsVar2 = jnaVar.m;
                    wqn wqnVar4 = jnaVar.l;
                    hurVar3 = jnaVar.k;
                    Function2 function23 = jnaVar.j;
                    qgg.h0(obj2);
                    c = 2;
                    lfmVar = null;
                    wqnVar2 = wqnVar4;
                    l = f2;
                    j2 = 0;
                    function2 = function23;
                    if (!lfmVar3.b()) {
                        return lfmVar;
                    }
                    ypsVar = ypsVar2;
                    hurVar2 = hurVar3;
                    lfmVar4 = lfmVar;
                    i4 = 1;
                    wqnVar = wqnVar2;
                    jnaVar.j = function2;
                    jnaVar.k = hurVar2;
                    jnaVar.l = wqnVar;
                    jnaVar.m = ypsVar;
                    jnaVar.n = lfmVar4;
                    jnaVar.o = l;
                    jnaVar.q = i4;
                    obj2 = hurVar2.a(gfm.b, jnaVar);
                }
            }
        }
        jnaVar = new jna(kq2Var);
        Object obj22 = jnaVar.p;
        nm6 nm6Var2 = nm6.a;
        i2 = jnaVar.q;
        int i42 = 1;
        lfm lfmVar42 = null;
        if (i2 != 0) {
        }
    }

    public static final Object f(pfm pfmVar, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        Object v = xee.v(pfmVar, new mna(bs5.v0, new wqn(), null, new kna(0, function1), function2, function02, new lna(0, function0), null), continuation);
        nm6 nm6Var = nm6.a;
        if (v != nm6Var) {
            v = Unit.a;
        }
        return v == nm6Var ? v : Unit.a;
    }

    public static Object h(pfm pfmVar, s8u s8uVar, Function2 function2, Continuation continuation, int i) {
        Function0 function0 = s8uVar;
        if ((i & 2) != 0) {
            function0 = bs5.w0;
        }
        Object v = xee.v(pfmVar, new rna(function2, function0, (Continuation) null), continuation);
        return v == nm6.a ? v : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0046 -> B:10:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(hur hurVar, long j, Function1 function1, kq2 kq2Var) {
        sna snaVar;
        int i;
        lfm lfmVar;
        if (kq2Var instanceof sna) {
            snaVar = (sna) kq2Var;
            int i2 = snaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = snaVar.l;
                nm6 nm6Var = nm6.a;
                i = snaVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    snaVar.j = hurVar;
                    snaVar.k = function1;
                    snaVar.m = 1;
                    obj = b(hurVar, j, snaVar);
                    if (obj == nm6Var) {
                    }
                    lfmVar = (lfm) obj;
                    if (lfmVar == null) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function1 function12 = snaVar.k;
                    hur hurVar2 = snaVar.j;
                    qgg.h0(obj);
                    function1 = function12;
                    hurVar = hurVar2;
                    lfmVar = (lfm) obj;
                    if (lfmVar == null) {
                        if (swf.B(lfmVar)) {
                            return Boolean.TRUE;
                        }
                        function1.invoke(lfmVar);
                        j = lfmVar.a;
                        snaVar.j = hurVar;
                        snaVar.k = function1;
                        snaVar.m = 1;
                        obj = b(hurVar, j, snaVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        lfmVar = (lfm) obj;
                        if (lfmVar == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        snaVar = new sna(kq2Var);
        Object obj2 = snaVar.l;
        nm6 nm6Var2 = nm6.a;
        i = snaVar.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
    
        if (r0 == 0.0f) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x007e -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(hur hurVar, long j, kma kmaVar, kq2 kq2Var) {
        tna tnaVar;
        int i;
        hur hurVar2;
        long j2;
        tna tnaVar2;
        bxj bxjVar;
        kma kmaVar2;
        int i2;
        lfm lfmVar;
        wqn wqnVar;
        bxj bxjVar2;
        hur hurVar3;
        Object a2;
        hur hurVar4;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        if (kq2Var instanceof tna) {
            tnaVar = (tna) kq2Var;
            int i3 = tnaVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tnaVar.p = i3 - Integer.MIN_VALUE;
                Object obj3 = tnaVar.o;
                nm6 nm6Var = nm6.a;
                i = tnaVar.p;
                int i4 = 1;
                if (i == 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wqn wqnVar2 = tnaVar.n;
                    hurVar3 = tnaVar.m;
                    bxjVar2 = tnaVar.l;
                    hur hurVar5 = tnaVar.k;
                    Function1 function1 = tnaVar.j;
                    qgg.h0(obj3);
                    wqn wqnVar3 = wqnVar2;
                    hurVar2 = hurVar5;
                    ?? r10 = function1;
                    ffm ffmVar = (ffm) obj3;
                    List list = ffmVar.a;
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            hurVar4 = hurVar3;
                            obj = null;
                            break;
                        }
                        obj = list.get(i5);
                        hurVar4 = hurVar3;
                        if (ywf.u(((lfm) obj).a, wqnVar3.a)) {
                            break;
                        }
                        i5++;
                        hurVar3 = hurVar4;
                    }
                    lfm lfmVar2 = (lfm) obj;
                    if (lfmVar2 == null) {
                        if (swf.B(lfmVar2)) {
                            List list2 = ffmVar.a;
                            int size2 = list2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list2.get(i6);
                                if (((lfm) obj2).d) {
                                    break;
                                }
                                i6++;
                            }
                            lfm lfmVar3 = (lfm) obj2;
                            if (lfmVar3 != null) {
                                wqnVar3.a = lfmVar3.a;
                                i2 = 1;
                            }
                        } else {
                            i2 = 1;
                            long f0 = swf.f0(lfmVar2, true);
                            if (bxjVar2 != null) {
                                intBitsToFloat = Float.intBitsToFloat((int) (bxjVar2 == bxj.a ? f0 & 4294967295L : f0 >> 32));
                            } else {
                                intBitsToFloat = enj.d(f0);
                            }
                        }
                        hurVar3 = hurVar4;
                        kmaVar2 = r10;
                        i4 = i2;
                        wqnVar = wqnVar3;
                        tnaVar.j = kmaVar2;
                        tnaVar.k = hurVar2;
                        tnaVar.l = bxjVar2;
                        tnaVar.m = hurVar3;
                        tnaVar.n = wqnVar;
                        tnaVar.p = i4;
                        a2 = hurVar3.a(gfm.b, tnaVar);
                        if (a2 == nm6Var) {
                            return nm6Var;
                        }
                        wqn wqnVar4 = wqnVar;
                        r10 = kmaVar2;
                        obj3 = a2;
                        wqnVar3 = wqnVar4;
                        ffm ffmVar2 = (ffm) obj3;
                        List list3 = ffmVar2.a;
                        int size3 = list3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52++;
                            hurVar3 = hurVar4;
                        }
                        lfm lfmVar22 = (lfm) obj;
                        if (lfmVar22 == null) {
                            lfmVar22 = null;
                        }
                    }
                    i2 = 1;
                    if (lfmVar22 != null && !lfmVar22.b()) {
                        if (swf.B(lfmVar22)) {
                            lfmVar = lfmVar22;
                            return Boolean.valueOf((boolean) (lfmVar != null ? i2 : 0));
                        }
                        r10.invoke(lfmVar22);
                        tnaVar2 = tnaVar;
                        bxjVar = bxjVar2;
                        kmaVar2 = r10;
                        i4 = i2;
                        j2 = lfmVar22.a;
                        wqnVar = new wqn();
                        wqnVar.a = j2;
                        bxjVar2 = bxjVar;
                        tnaVar = tnaVar2;
                        hurVar3 = hurVar2;
                        tnaVar.j = kmaVar2;
                        tnaVar.k = hurVar2;
                        tnaVar.l = bxjVar2;
                        tnaVar.m = hurVar3;
                        tnaVar.n = wqnVar;
                        tnaVar.p = i4;
                        a2 = hurVar3.a(gfm.b, tnaVar);
                        if (a2 == nm6Var) {
                        }
                    }
                    lfmVar = null;
                    return Boolean.valueOf((boolean) (lfmVar != null ? i2 : 0));
                }
                qgg.h0(obj3);
                bxj bxjVar3 = bxj.b;
                hurVar2 = hurVar;
                j2 = j;
                if (k(hurVar2.f.t, j2)) {
                    i2 = 1;
                    lfmVar = null;
                    return Boolean.valueOf((boolean) (lfmVar != null ? i2 : 0));
                }
                tnaVar2 = tnaVar;
                bxjVar = bxjVar3;
                kmaVar2 = kmaVar;
                wqnVar = new wqn();
                wqnVar.a = j2;
                bxjVar2 = bxjVar;
                tnaVar = tnaVar2;
                hurVar3 = hurVar2;
                tnaVar.j = kmaVar2;
                tnaVar.k = hurVar2;
                tnaVar.l = bxjVar2;
                tnaVar.m = hurVar3;
                tnaVar.n = wqnVar;
                tnaVar.p = i4;
                a2 = hurVar3.a(gfm.b, tnaVar);
                if (a2 == nm6Var) {
                }
            }
        }
        tnaVar = new tna(kq2Var);
        Object obj32 = tnaVar.o;
        nm6 nm6Var2 = nm6.a;
        i = tnaVar.p;
        int i42 = 1;
        if (i == 0) {
        }
    }

    public static final boolean k(ffm ffmVar, long j) {
        Object obj;
        List list = ffmVar.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ywf.u(((lfm) obj).a, j)) {
                break;
            }
            i++;
        }
        lfm lfmVar = (lfm) obj;
        if (lfmVar != null && lfmVar.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float l(aeu aeuVar, int i) {
        return i == 2 ? aeuVar.f() * a : aeuVar.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
    
        if (r0 == 0.0f) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x007e -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(hur hurVar, long j, nna nnaVar, kq2 kq2Var) {
        una unaVar;
        int i;
        hur hurVar2;
        long j2;
        una unaVar2;
        bxj bxjVar;
        nna nnaVar2;
        int i2;
        lfm lfmVar;
        wqn wqnVar;
        bxj bxjVar2;
        hur hurVar3;
        Object a2;
        hur hurVar4;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        if (kq2Var instanceof una) {
            unaVar = (una) kq2Var;
            int i3 = unaVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                unaVar.p = i3 - Integer.MIN_VALUE;
                Object obj3 = unaVar.o;
                nm6 nm6Var = nm6.a;
                i = unaVar.p;
                int i4 = 1;
                if (i == 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wqn wqnVar2 = unaVar.n;
                    hurVar3 = unaVar.m;
                    bxjVar2 = unaVar.l;
                    hur hurVar5 = unaVar.k;
                    Function1 function1 = unaVar.j;
                    qgg.h0(obj3);
                    wqn wqnVar3 = wqnVar2;
                    hurVar2 = hurVar5;
                    ?? r10 = function1;
                    ffm ffmVar = (ffm) obj3;
                    List list = ffmVar.a;
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            hurVar4 = hurVar3;
                            obj = null;
                            break;
                        }
                        obj = list.get(i5);
                        hurVar4 = hurVar3;
                        if (ywf.u(((lfm) obj).a, wqnVar3.a)) {
                            break;
                        }
                        i5++;
                        hurVar3 = hurVar4;
                    }
                    lfm lfmVar2 = (lfm) obj;
                    if (lfmVar2 == null) {
                        if (swf.B(lfmVar2)) {
                            List list2 = ffmVar.a;
                            int size2 = list2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list2.get(i6);
                                if (((lfm) obj2).d) {
                                    break;
                                }
                                i6++;
                            }
                            lfm lfmVar3 = (lfm) obj2;
                            if (lfmVar3 != null) {
                                wqnVar3.a = lfmVar3.a;
                                i2 = 1;
                            }
                        } else {
                            i2 = 1;
                            long f0 = swf.f0(lfmVar2, true);
                            if (bxjVar2 != null) {
                                intBitsToFloat = Float.intBitsToFloat((int) (bxjVar2 == bxj.a ? f0 & 4294967295L : f0 >> 32));
                            } else {
                                intBitsToFloat = enj.d(f0);
                            }
                        }
                        hurVar3 = hurVar4;
                        nnaVar2 = r10;
                        i4 = i2;
                        wqnVar = wqnVar3;
                        unaVar.j = nnaVar2;
                        unaVar.k = hurVar2;
                        unaVar.l = bxjVar2;
                        unaVar.m = hurVar3;
                        unaVar.n = wqnVar;
                        unaVar.p = i4;
                        a2 = hurVar3.a(gfm.b, unaVar);
                        if (a2 == nm6Var) {
                            return nm6Var;
                        }
                        wqn wqnVar4 = wqnVar;
                        r10 = nnaVar2;
                        obj3 = a2;
                        wqnVar3 = wqnVar4;
                        ffm ffmVar2 = (ffm) obj3;
                        List list3 = ffmVar2.a;
                        int size3 = list3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52++;
                            hurVar3 = hurVar4;
                        }
                        lfm lfmVar22 = (lfm) obj;
                        if (lfmVar22 == null) {
                            lfmVar22 = null;
                        }
                    }
                    i2 = 1;
                    if (lfmVar22 != null && !lfmVar22.b()) {
                        if (swf.B(lfmVar22)) {
                            lfmVar = lfmVar22;
                            return Boolean.valueOf((boolean) (lfmVar != null ? i2 : 0));
                        }
                        r10.invoke(lfmVar22);
                        unaVar2 = unaVar;
                        bxjVar = bxjVar2;
                        nnaVar2 = r10;
                        i4 = i2;
                        j2 = lfmVar22.a;
                        wqnVar = new wqn();
                        wqnVar.a = j2;
                        bxjVar2 = bxjVar;
                        unaVar = unaVar2;
                        hurVar3 = hurVar2;
                        unaVar.j = nnaVar2;
                        unaVar.k = hurVar2;
                        unaVar.l = bxjVar2;
                        unaVar.m = hurVar3;
                        unaVar.n = wqnVar;
                        unaVar.p = i4;
                        a2 = hurVar3.a(gfm.b, unaVar);
                        if (a2 == nm6Var) {
                        }
                    }
                    lfmVar = null;
                    return Boolean.valueOf((boolean) (lfmVar != null ? i2 : 0));
                }
                qgg.h0(obj3);
                bxj bxjVar3 = bxj.a;
                hurVar2 = hurVar;
                j2 = j;
                if (k(hurVar2.f.t, j2)) {
                    i2 = 1;
                    lfmVar = null;
                    return Boolean.valueOf((boolean) (lfmVar != null ? i2 : 0));
                }
                unaVar2 = unaVar;
                bxjVar = bxjVar3;
                nnaVar2 = nnaVar;
                wqnVar = new wqn();
                wqnVar.a = j2;
                bxjVar2 = bxjVar;
                unaVar = unaVar2;
                hurVar3 = hurVar2;
                unaVar.j = nnaVar2;
                unaVar.k = hurVar2;
                unaVar.l = bxjVar2;
                unaVar.m = hurVar3;
                unaVar.n = wqnVar;
                unaVar.p = i4;
                a2 = hurVar3.a(gfm.b, unaVar);
                if (a2 == nm6Var) {
                }
            }
        }
        unaVar = new una(kq2Var);
        Object obj32 = unaVar.o;
        nm6 nm6Var2 = nm6.a;
        i = unaVar.p;
        int i42 = 1;
        if (i == 0) {
        }
    }
}
