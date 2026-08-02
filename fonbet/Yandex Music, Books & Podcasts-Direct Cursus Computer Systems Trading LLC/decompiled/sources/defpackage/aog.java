package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class aog {
    public final jyr a = btf.b(new hjg(27));

    public static final Object C(aog aogVar, jpg jpgVar, xdh xdhVar, xng xngVar) {
        return aogVar.a().c(jpgVar.d, jpgVar.a, xdhVar, xngVar);
    }

    public static e4p F(jpg jpgVar) {
        return jpgVar.e ? e4p.c : e4p.d;
    }

    public static boolean b(mqs mqsVar) {
        return mqsVar.I() == lqs.e;
    }

    public static boolean c(mqs mqsVar) {
        return mqsVar.I() == lqs.d;
    }

    public static final Serializable n(aog aogVar, jpg jpgVar, xdh xdhVar, kng kngVar) {
        fog a = aogVar.a();
        String str = jpgVar.a;
        a.getClass();
        return StringsKt.U(str) ? c5b.a : a.c.O(fog.d(str), xdhVar, kngVar);
    }

    public static final Serializable u(aog aogVar, jpg jpgVar, boolean z, xdh xdhVar, qng qngVar) {
        return aogVar.a().a(jpgVar.d, jpgVar.a, z, xdhVar, qngVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[LOOP:0: B:12:0x0076->B:14:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable A(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        wng wngVar;
        int i;
        Iterable iterable;
        Iterator it;
        if (cg6Var instanceof wng) {
            wngVar = (wng) cg6Var;
            int i2 = wngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wngVar.k;
                nm6 nm6Var = nm6.a;
                i = wngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    int i3 = t1pVar == null ? -1 : ang.a[t1pVar.ordinal()];
                    if (i3 != -1 && i3 != 1 && i3 != 6 && i3 != 7) {
                        iterable = c5b.a;
                        Iterable iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(v75.o(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(xv.X((mqs) it.next(), F(jpgVar)));
                        }
                        return arrayList;
                    }
                    fog a = a();
                    String str = jpgVar.d;
                    String str2 = jpgVar.a;
                    wngVar.j = jpgVar;
                    wngVar.m = 1;
                    obj = a.b(str, str2, xdhVar, wngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = wngVar.j;
                    qgg.h0(obj);
                }
                iterable = (List) obj;
                Iterable iterable22 = iterable;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable22, 10));
                it = iterable22.iterator();
                while (it.hasNext()) {
                }
                return arrayList2;
            }
        }
        wngVar = new wng(this, cg6Var);
        Object obj2 = wngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wngVar.m;
        if (i != 0) {
        }
        iterable = (List) obj2;
        Iterable iterable222 = iterable;
        ArrayList arrayList22 = new ArrayList(v75.o(iterable222, 10));
        it = iterable222.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00a6, code lost:
    
        if (r7 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d9, code lost:
    
        if (r7 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x010c, code lost:
    
        if (r7 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x013a, code lost:
    
        if (r7 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0168, code lost:
    
        if (r7 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0071, code lost:
    
        if (r7 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016a, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185 A[LOOP:0: B:14:0x017f->B:16:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0050  */
    /* JADX WARN: Type inference failed for: r6v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable B(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        xng xngVar;
        ?? r6;
        Iterator it;
        if (cg6Var instanceof xng) {
            xngVar = (xng) cg6Var;
            int i = xngVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xngVar.m = i - Integer.MIN_VALUE;
                Object obj = xngVar.k;
                nm6 nm6Var = nm6.a;
                switch (xngVar.m) {
                    case 0:
                        qgg.h0(obj);
                        t1p t1pVar = jpgVar.f;
                        switch (t1pVar == null ? -1 : ang.a[t1pVar.ordinal()]) {
                            case -1:
                            case 1:
                                xngVar.j = jpgVar;
                                xngVar.m = 6;
                                obj = C(this, jpgVar, xdhVar, xngVar);
                                break;
                            case 0:
                            default:
                                r6 = c5b.a;
                                Iterable iterable = (Iterable) r6;
                                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(xv.X((mqs) it.next(), F(jpgVar)));
                                }
                                return arrayList;
                            case 2:
                                xngVar.j = jpgVar;
                                xngVar.m = 3;
                                obj = C(this, jpgVar, xdhVar, xngVar);
                                break;
                            case 3:
                                xngVar.j = jpgVar;
                                xngVar.m = 4;
                                obj = C(this, jpgVar, xdhVar, xngVar);
                                break;
                            case 4:
                                xngVar.j = jpgVar;
                                xngVar.m = 1;
                                obj = C(this, jpgVar, xdhVar, xngVar);
                                break;
                            case 5:
                                xngVar.j = jpgVar;
                                xngVar.m = 2;
                                obj = C(this, jpgVar, xdhVar, xngVar);
                                break;
                            case 6:
                                xngVar.j = jpgVar;
                                xngVar.m = 5;
                                obj = C(this, jpgVar, xdhVar, xngVar);
                                break;
                        }
                    case 1:
                        jpgVar = xngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj2 : (Iterable) obj) {
                            mqs mqsVar = (mqs) obj2;
                            if (mqsVar.A && c(mqsVar)) {
                                r6.add(obj2);
                            }
                        }
                        Iterable iterable2 = (Iterable) r6;
                        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList2;
                    case 2:
                        jpgVar = xngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj3 : (Iterable) obj) {
                            mqs mqsVar2 = (mqs) obj3;
                            if (mqsVar2.A && b(mqsVar2)) {
                                r6.add(obj3);
                            }
                        }
                        Iterable iterable22 = (Iterable) r6;
                        ArrayList arrayList22 = new ArrayList(v75.o(iterable22, 10));
                        it = iterable22.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList22;
                    case 3:
                        jpgVar = xngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj4 : (Iterable) obj) {
                            if (c((mqs) obj4)) {
                                r6.add(obj4);
                            }
                        }
                        Iterable iterable222 = (Iterable) r6;
                        ArrayList arrayList222 = new ArrayList(v75.o(iterable222, 10));
                        it = iterable222.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList222;
                    case 4:
                        jpgVar = xngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj5 : (Iterable) obj) {
                            if (b((mqs) obj5)) {
                                r6.add(obj5);
                            }
                        }
                        Iterable iterable2222 = (Iterable) r6;
                        ArrayList arrayList2222 = new ArrayList(v75.o(iterable2222, 10));
                        it = iterable2222.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList2222;
                    case 5:
                        jpgVar = xngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj6 : (Iterable) obj) {
                            mqs mqsVar3 = (mqs) obj6;
                            if (!c(mqsVar3) && !b(mqsVar3)) {
                                r6.add(obj6);
                            }
                        }
                        Iterable iterable22222 = (Iterable) r6;
                        ArrayList arrayList22222 = new ArrayList(v75.o(iterable22222, 10));
                        it = iterable22222.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList22222;
                    case 6:
                        jpgVar = xngVar.j;
                        qgg.h0(obj);
                        r6 = (List) obj;
                        Iterable iterable222222 = (Iterable) r6;
                        ArrayList arrayList222222 = new ArrayList(v75.o(iterable222222, 10));
                        it = iterable222222.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList222222;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        xngVar = new xng(this, cg6Var);
        Object obj7 = xngVar.k;
        nm6 nm6Var2 = nm6.a;
        switch (xngVar.m) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0074, code lost:
    
        if (r13 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        if (r13 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010f, code lost:
    
        if (r13 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable D(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        yng yngVar;
        int i;
        if (cg6Var instanceof yng) {
            yngVar = (yng) cg6Var;
            int i2 = yngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = yngVar.k;
                nm6 nm6Var = nm6.a;
                i = yngVar.m;
                if (i == 0) {
                    if (i == 1) {
                        jpgVar = yngVar.j;
                        qgg.h0(obj);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : (Iterable) obj) {
                            mqs mqsVar = (mqs) obj2;
                            if (mqsVar.A && c(mqsVar)) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            mqs mqsVar2 = (mqs) it.next();
                            e4p F = F(jpgVar);
                            mqsVar2.getClass();
                            arrayList2.add(new c4p(mqsVar2, F));
                        }
                        return arrayList2;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jpgVar = yngVar.j;
                        qgg.h0(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList3 = new ArrayList(v75.o(iterable, 10));
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(xv.X((mqs) it2.next(), F(jpgVar)));
                        }
                        return arrayList3;
                    }
                    jpgVar = yngVar.j;
                    qgg.h0(obj);
                    Iterable<mqs> iterable2 = (Iterable) obj;
                    ArrayList arrayList4 = new ArrayList(v75.o(iterable2, 10));
                    for (mqs mqsVar3 : iterable2) {
                        e4p F2 = F(jpgVar);
                        mqsVar3.getClass();
                        arrayList4.add(new c4p(mqsVar3, F2));
                    }
                    return arrayList4;
                }
                qgg.h0(obj);
                t1p t1pVar = jpgVar.f;
                String str = jpgVar.a;
                String str2 = jpgVar.d;
                int i3 = t1pVar == null ? -1 : ang.a[t1pVar.ordinal()];
                if (i3 != -1) {
                    if (i3 == 4) {
                        yngVar.j = jpgVar;
                        yngVar.m = 1;
                        obj = a().b(str2, str, xdhVar, yngVar);
                    } else if (i3 != 1) {
                        if (i3 != 2) {
                            return c5b.a;
                        }
                        yngVar.j = jpgVar;
                        yngVar.m = 2;
                        obj = a().b(str2, str, xdhVar, yngVar);
                    }
                    return nm6Var;
                }
                yngVar.j = jpgVar;
                yngVar.m = 3;
                obj = a().b(str2, str, xdhVar, yngVar);
            }
        }
        yngVar = new yng(this, cg6Var);
        Object obj3 = yngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = yngVar.m;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable E(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        zng zngVar;
        int i;
        if (cg6Var instanceof zng) {
            zngVar = (zng) cg6Var;
            int i2 = zngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zngVar.k;
                nm6 nm6Var = nm6.a;
                i = zngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.q) {
                        return c5b.a;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    zngVar.j = jpgVar;
                    zngVar.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.U(fog.d(str), xdhVar, zngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = zngVar.j;
                    qgg.h0(obj);
                }
                Iterable<x1u> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (x1u x1uVar : iterable) {
                    e4p F = F(jpgVar);
                    x1uVar.getClass();
                    arrayList.add(new h4p(x1uVar, F));
                }
                return arrayList;
            }
        }
        zngVar = new zng(this, cg6Var);
        Object obj2 = zngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zngVar.m;
        if (i != 0) {
        }
        Iterable<x1u> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }

    public final fog a() {
        return (fog) this.a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e0, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ee, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0209, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0216, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c9, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d8, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f7, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0117, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0127, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0147, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0157, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0167, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0177, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0185, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a5, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b5, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c4, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d2, code lost:
    
        if (r9 == r1) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(jpg jpgVar, cg6 cg6Var) {
        bng bngVar;
        List list;
        if (cg6Var instanceof bng) {
            bngVar = (bng) cg6Var;
            int i = bngVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bngVar.l = i - Integer.MIN_VALUE;
                Object obj = bngVar.j;
                Object obj2 = nm6.a;
                switch (bngVar.l) {
                    case 0:
                        qgg.h0(obj);
                        String str = jpgVar.d;
                        p0p V = xv.V(jpgVar.b);
                        xdh xdhVar = new xdh(jpgVar.a, new apo(str, V), jpgVar.c, jpgVar.f);
                        switch (V.ordinal()) {
                            case 0:
                            case 26:
                                list = c5b.a;
                                break;
                            case 1:
                                bngVar.l = 5;
                                obj = t(jpgVar, true, xdhVar, bngVar);
                                break;
                            case 2:
                            case 4:
                            case 5:
                                bngVar.l = 7;
                                obj = B(jpgVar, xdhVar, bngVar);
                                break;
                            case 3:
                                bngVar.l = 6;
                                obj = t(jpgVar, false, xdhVar, bngVar);
                                break;
                            case 6:
                                bngVar.l = 10;
                                obj = y(jpgVar, xdhVar, bngVar);
                                break;
                            case 7:
                                bngVar.l = 8;
                                obj = D(jpgVar, xdhVar, bngVar);
                                break;
                            case 8:
                                bngVar.l = 9;
                                obj = z(jpgVar, xdhVar, bngVar);
                                break;
                            case 9:
                                bngVar.l = 4;
                                obj = k(jpgVar, xdhVar, bngVar);
                                break;
                            case 10:
                                bngVar.l = 11;
                                obj = e(jpgVar, xdhVar, bngVar);
                                break;
                            case 11:
                                bngVar.l = 12;
                                obj = f(jpgVar, xdhVar, bngVar);
                                break;
                            case 12:
                                bngVar.l = 13;
                                obj = v(jpgVar, xdhVar, bngVar);
                                break;
                            case 13:
                                bngVar.l = 1;
                                obj = j(jpgVar, xdhVar, bngVar);
                                break;
                            case 14:
                                bngVar.l = 14;
                                obj = l(jpgVar, xdhVar, bngVar);
                                break;
                            case 15:
                                bngVar.l = 15;
                                obj = m(jpgVar, xdhVar, bngVar);
                                break;
                            case 16:
                                bngVar.l = 18;
                                obj = o(jpgVar, xdhVar, bngVar);
                                break;
                            case 17:
                                bngVar.l = 16;
                                obj = w(jpgVar, xdhVar, bngVar);
                                break;
                            case 18:
                                bngVar.l = 17;
                                obj = g(jpgVar, xdhVar, bngVar);
                                break;
                            case 19:
                                bngVar.l = 19;
                                obj = p(jpgVar, xdhVar, bngVar);
                                break;
                            case 20:
                                bngVar.l = 22;
                                obj = s(jpgVar, xdhVar, bngVar);
                                break;
                            case 21:
                                bngVar.l = 21;
                                obj = q(jpgVar, xdhVar, bngVar);
                                break;
                            case 22:
                                bngVar.l = 20;
                                obj = r(jpgVar, xdhVar, bngVar);
                                break;
                            case 23:
                                bngVar.l = 2;
                                obj = x(jpgVar, xdhVar, bngVar);
                                break;
                            case 24:
                                bngVar.l = 3;
                                obj = h(jpgVar, xdhVar, bngVar);
                                break;
                            case 25:
                                bngVar.l = 23;
                                obj = E(jpgVar, xdhVar, bngVar);
                                break;
                            default:
                                b6e.s();
                                break;
                        }
                    case 1:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 2:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 3:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 4:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 5:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 6:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 7:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 8:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 9:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 10:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 11:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 12:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 13:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 14:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 15:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 16:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 17:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 18:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 19:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 20:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 21:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 22:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    case 23:
                        qgg.h0(obj);
                        list = (List) obj;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        bngVar = new bng(this, cg6Var);
        Object obj3 = bngVar.j;
        Object obj22 = nm6.a;
        switch (bngVar.l) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        cng cngVar;
        int i;
        Iterator it;
        if (cg6Var instanceof cng) {
            cngVar = (cng) cg6Var;
            int i2 = cngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cngVar.k;
                nm6 nm6Var = nm6.a;
                i = cngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.e) {
                        return c5b.a;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    cngVar.j = jpgVar;
                    cngVar.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.L(fog.d(str), xdhVar, cngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = cngVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.U((oq) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        cngVar = new cng(this, cg6Var);
        Object obj2 = cngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cngVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        dng dngVar;
        int i;
        if (cg6Var instanceof dng) {
            dngVar = (dng) cg6Var;
            int i2 = dngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dngVar.k;
                nm6 nm6Var = nm6.a;
                i = dngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.f) {
                        return c5b.a;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    dngVar.j = jpgVar;
                    dngVar.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.M(fog.d(str), xdhVar, dngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = dngVar.j;
                    qgg.h0(obj);
                }
                Iterable<c01> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (c01 c01Var : iterable) {
                    e4p F = F(jpgVar);
                    c01Var.getClass();
                    arrayList.add(new g3p(c01Var, F));
                }
                return arrayList;
            }
        }
        dngVar = new dng(this, cg6Var);
        Object obj2 = dngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dngVar.m;
        if (i != 0) {
        }
        Iterable<c01> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[LOOP:0: B:13:0x0088->B:15:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        eng engVar;
        int i;
        Iterable iterable;
        Iterator it;
        if (cg6Var instanceof eng) {
            engVar = (eng) cg6Var;
            int i2 = engVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                engVar.m = i2 - Integer.MIN_VALUE;
                eng engVar2 = engVar;
                Object obj = engVar2.k;
                nm6 nm6Var = nm6.a;
                i = engVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    int i3 = t1pVar == null ? -1 : ang.a[t1pVar.ordinal()];
                    if (i3 != -1 && i3 != 1 && i3 != 3) {
                        iterable = c5b.a;
                        Iterable iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(v75.o(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(xv.X((mqs) it.next(), F(jpgVar)));
                        }
                        return arrayList;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    engVar2.j = jpgVar;
                    engVar2.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.S(str, xdhVar, zdj.c, true, engVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = engVar2.j;
                    qgg.h0(obj);
                }
                iterable = (List) obj;
                Iterable iterable22 = iterable;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable22, 10));
                it = iterable22.iterator();
                while (it.hasNext()) {
                }
                return arrayList2;
            }
        }
        engVar = new eng(this, cg6Var);
        eng engVar22 = engVar;
        Object obj2 = engVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = engVar22.m;
        if (i != 0) {
        }
        iterable = (List) obj2;
        Iterable iterable222 = iterable;
        ArrayList arrayList22 = new ArrayList(v75.o(iterable222, 10));
        it = iterable222.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[LOOP:0: B:12:0x0090->B:14:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        fng fngVar;
        int i;
        Object Q;
        Iterable iterable;
        Iterator it;
        if (cg6Var instanceof fng) {
            fngVar = (fng) cg6Var;
            int i2 = fngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fngVar.k;
                nm6 nm6Var = nm6.a;
                i = fngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    int i3 = t1pVar == null ? -1 : ang.a[t1pVar.ordinal()];
                    if (i3 != -1 && i3 != 1 && i3 != 3) {
                        iterable = c5b.a;
                        Iterable iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(v75.o(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(xv.W((ipg) it.next(), F(jpgVar)));
                        }
                        return arrayList;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    fngVar.j = jpgVar;
                    fngVar.m = 1;
                    a.getClass();
                    if (StringsKt.U(str)) {
                        Q = c5b.a;
                    } else {
                        ime imeVar = a.c;
                        String d = fog.d(str);
                        imeVar.getClass();
                        Q = gld.Q(new nog(d, imeVar, xdhVar, null, 0), fngVar);
                    }
                    obj = Q;
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = fngVar.j;
                    qgg.h0(obj);
                }
                iterable = (List) obj;
                Iterable iterable22 = iterable;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable22, 10));
                it = iterable22.iterator();
                while (it.hasNext()) {
                }
                return arrayList2;
            }
        }
        fngVar = new fng(this, cg6Var);
        Object obj2 = fngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fngVar.m;
        if (i != 0) {
        }
        iterable = (List) obj2;
        Iterable iterable222 = iterable;
        ArrayList arrayList22 = new ArrayList(v75.o(iterable222, 10));
        it = iterable222.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[LOOP:0: B:11:0x0079->B:13:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(yqi yqiVar, cg6 cg6Var) {
        gng gngVar;
        int i;
        Object Q;
        Iterator it;
        if (cg6Var instanceof gng) {
            gngVar = (gng) cg6Var;
            int i2 = gngVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gngVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gngVar.j;
                nm6 nm6Var = nm6.a;
                i = gngVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    fog a = a();
                    String str = yqiVar.a;
                    apo apoVar = yqiVar.b;
                    t1p t1pVar = yqiVar.d;
                    xdh xdhVar = new xdh(str, apoVar, yqiVar.c, t1pVar);
                    gngVar.l = 1;
                    a.getClass();
                    if (StringsKt.U(str)) {
                        Q = c5b.a;
                    } else {
                        ime imeVar = a.c;
                        String d = fog.d(str);
                        imeVar.getClass();
                        Q = gld.Q(new jog(d, imeVar, t1pVar, apoVar, xdhVar, null), gngVar);
                    }
                    obj = Q;
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.W((ipg) it.next(), e4p.c));
                }
                return new kpg(arrayList);
            }
        }
        gngVar = new gng(this, cg6Var);
        Object obj2 = gngVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gngVar.l;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return new kpg(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[LOOP:0: B:11:0x0075->B:13:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable j(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        hng hngVar;
        int i;
        Object Q;
        Iterator it;
        if (cg6Var instanceof hng) {
            hngVar = (hng) cg6Var;
            int i2 = hngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hngVar.k;
                nm6 nm6Var = nm6.a;
                i = hngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fog a = a();
                    String str = jpgVar.a;
                    t1p t1pVar = jpgVar.f;
                    hngVar.j = jpgVar;
                    hngVar.m = 1;
                    a.getClass();
                    if (StringsKt.U(str)) {
                        Q = c5b.a;
                    } else {
                        ime imeVar = a.c;
                        String d = fog.d(str);
                        imeVar.getClass();
                        Q = gld.Q(new tog(d, imeVar, t1pVar, xdhVar, null), hngVar);
                    }
                    obj = Q;
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = hngVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.W((ipg) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        hngVar = new hng(this, cg6Var);
        Object obj2 = hngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hngVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[LOOP:0: B:11:0x0077->B:13:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        ing ingVar;
        int i;
        Object Q;
        Iterator it;
        if (cg6Var instanceof ing) {
            ingVar = (ing) cg6Var;
            int i2 = ingVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ingVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ingVar.k;
                nm6 nm6Var = nm6.a;
                i = ingVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fog a = a();
                    String str = jpgVar.a;
                    String str2 = jpgVar.d;
                    t1p t1pVar = jpgVar.f;
                    ingVar.j = jpgVar;
                    ingVar.m = 1;
                    a.getClass();
                    if (StringsKt.U(str)) {
                        Q = c5b.a;
                    } else {
                        ime imeVar = a.c;
                        String d = fog.d(str);
                        imeVar.getClass();
                        Q = gld.Q(new qog(d, imeVar, t1pVar, str2, xdhVar, null), ingVar);
                    }
                    obj = Q;
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = ingVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.W((ipg) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        ingVar = new ing(this, cg6Var);
        Object obj2 = ingVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ingVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[LOOP:0: B:11:0x007c->B:13:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable l(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        jng jngVar;
        int i;
        if (cg6Var instanceof jng) {
            jngVar = (jng) cg6Var;
            int i2 = jngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jngVar.k;
                nm6 nm6Var = nm6.a;
                i = jngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.l && t1pVar != t1p.g) {
                        return c5b.a;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    jngVar.j = jpgVar;
                    jngVar.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.N(fog.d(str), xdhVar, jngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = jngVar.j;
                    qgg.h0(obj);
                }
                Iterable<cvl> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (cvl cvlVar : iterable) {
                    e4p F = F(jpgVar);
                    cvlVar.getClass();
                    arrayList.add(new b4p(cvlVar, F));
                }
                return arrayList;
            }
        }
        jngVar = new jng(this, cg6Var);
        Object obj2 = jngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jngVar.m;
        if (i != 0) {
        }
        Iterable<cvl> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        if (r10 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a1, code lost:
    
        if (r10 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        if (r10 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fb, code lost:
    
        if (r10 == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0118 A[LOOP:0: B:15:0x0112->B:17:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        kng kngVar;
        int i;
        ?? r9;
        Iterator it;
        if (cg6Var instanceof kng) {
            kngVar = (kng) cg6Var;
            int i2 = kngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = kngVar.k;
                nm6 nm6Var = nm6.a;
                i = kngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    switch (t1pVar == null ? -1 : ang.a[t1pVar.ordinal()]) {
                        case -1:
                        case 1:
                            kngVar.j = jpgVar;
                            kngVar.m = 4;
                            obj = n(this, jpgVar, xdhVar, kngVar);
                            break;
                        case 0:
                        default:
                            r9 = c5b.a;
                            break;
                        case 2:
                        case 4:
                            kngVar.j = jpgVar;
                            kngVar.m = 1;
                            obj = n(this, jpgVar, xdhVar, kngVar);
                            break;
                        case 3:
                        case 5:
                            kngVar.j = jpgVar;
                            kngVar.m = 2;
                            obj = n(this, jpgVar, xdhVar, kngVar);
                            break;
                        case 6:
                            kngVar.j = jpgVar;
                            kngVar.m = 3;
                            obj = n(this, jpgVar, xdhVar, kngVar);
                            break;
                    }
                } else if (i == 1) {
                    jpgVar = kngVar.j;
                    qgg.h0(obj);
                    r9 = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (c((mqs) obj2)) {
                            r9.add(obj2);
                        }
                    }
                } else if (i == 2) {
                    jpgVar = kngVar.j;
                    qgg.h0(obj);
                    r9 = new ArrayList();
                    for (Object obj3 : (Iterable) obj) {
                        if (b((mqs) obj3)) {
                            r9.add(obj3);
                        }
                    }
                } else if (i == 3) {
                    jpgVar = kngVar.j;
                    qgg.h0(obj);
                    r9 = new ArrayList();
                    for (Object obj4 : (Iterable) obj) {
                        mqs mqsVar = (mqs) obj4;
                        if (!c(mqsVar) && !b(mqsVar)) {
                            r9.add(obj4);
                        }
                    }
                } else {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = kngVar.j;
                    qgg.h0(obj);
                    r9 = (List) obj;
                }
                Iterable iterable = (Iterable) r9;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.X((mqs) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        kngVar = new kng(this, cg6Var);
        Object obj5 = kngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = kngVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) r9;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable o(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        lng lngVar;
        int i;
        Iterator it;
        if (cg6Var instanceof lng) {
            lngVar = (lng) cg6Var;
            int i2 = lngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = lngVar.k;
                nm6 nm6Var = nm6.a;
                i = lngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.d) {
                        return c5b.a;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    lngVar.j = jpgVar;
                    lngVar.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.Q(fog.d(str), xdhVar, lngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = lngVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.X((mqs) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        lngVar = new lng(this, cg6Var);
        Object obj2 = lngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = lngVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[LOOP:0: B:11:0x0091->B:13:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable p(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        mng mngVar;
        int i;
        paj pajVar;
        Serializable R;
        Iterator it;
        if (cg6Var instanceof mng) {
            mngVar = (mng) cg6Var;
            int i2 = mngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = mngVar.k;
                nm6 nm6Var = nm6.a;
                i = mngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fog a = a();
                    String str = jpgVar.a;
                    t1p t1pVar = jpgVar.f;
                    mngVar.j = jpgVar;
                    mngVar.m = 1;
                    a.getClass();
                    if (!StringsKt.U(str)) {
                        switch (t1pVar == null ? -1 : bog.a[t1pVar.ordinal()]) {
                            case -1:
                            case 7:
                            case 8:
                                pajVar = paj.a;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, mngVar);
                                break;
                            case 0:
                            default:
                                R = c5b.a;
                                break;
                            case 1:
                                pajVar = paj.e;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, mngVar);
                                break;
                            case 2:
                                pajVar = paj.g;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, mngVar);
                                break;
                            case 3:
                                pajVar = paj.h;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, mngVar);
                                break;
                            case 4:
                                pajVar = paj.d;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, mngVar);
                                break;
                            case 5:
                                pajVar = paj.b;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, mngVar);
                                break;
                            case 6:
                                pajVar = paj.c;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, mngVar);
                                break;
                        }
                    } else {
                        R = c5b.a;
                    }
                    obj = R;
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = mngVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.U((oq) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        mngVar = new mng(this, cg6Var);
        Object obj2 = mngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = mngVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[LOOP:0: B:11:0x007a->B:13:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable q(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        nng nngVar;
        int i;
        Iterator it;
        if (cg6Var instanceof nng) {
            nngVar = (nng) cg6Var;
            int i2 = nngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nngVar.k;
                nm6 nm6Var = nm6.a;
                i = nngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.i) {
                        return c5b.a;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    nngVar.j = jpgVar;
                    nngVar.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.R(fog.d(str), paj.c, xdhVar, nngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = nngVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.U((oq) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        nngVar = new nng(this, cg6Var);
        Object obj2 = nngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nngVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0091 A[LOOP:0: B:11:0x008b->B:13:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable r(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        ong ongVar;
        int i;
        paj pajVar;
        Serializable R;
        Iterator it;
        if (cg6Var instanceof ong) {
            ongVar = (ong) cg6Var;
            int i2 = ongVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ongVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ongVar.k;
                nm6 nm6Var = nm6.a;
                i = ongVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fog a = a();
                    String str = jpgVar.a;
                    t1p t1pVar = jpgVar.f;
                    ongVar.j = jpgVar;
                    ongVar.m = 1;
                    a.getClass();
                    if (!StringsKt.U(str)) {
                        switch (t1pVar == null ? -1 : bog.a[t1pVar.ordinal()]) {
                            case -1:
                            case 4:
                            case 8:
                                pajVar = paj.d;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, ongVar);
                                break;
                            case 0:
                            default:
                                R = c5b.a;
                                break;
                            case 1:
                            case 5:
                                pajVar = paj.e;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, ongVar);
                                break;
                            case 2:
                            case 6:
                                pajVar = paj.g;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, ongVar);
                                break;
                            case 3:
                                pajVar = paj.h;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, ongVar);
                                break;
                            case 7:
                                pajVar = paj.f;
                                R = a.c.R(fog.d(str), pajVar, xdhVar, ongVar);
                                break;
                        }
                    } else {
                        R = c5b.a;
                    }
                    obj = R;
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = ongVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.U((oq) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        ongVar = new ong(this, cg6Var);
        Object obj2 = ongVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ongVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[LOOP:0: B:11:0x007a->B:13:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable s(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        png pngVar;
        int i;
        Iterator it;
        if (cg6Var instanceof png) {
            pngVar = (png) cg6Var;
            int i2 = pngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pngVar.k;
                nm6 nm6Var = nm6.a;
                i = pngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.h) {
                        return c5b.a;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    pngVar.j = jpgVar;
                    pngVar.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.R(fog.d(str), paj.b, xdhVar, pngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = pngVar.j;
                    qgg.h0(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.U((oq) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        pngVar = new png(this, cg6Var);
        Object obj2 = pngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pngVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00a6, code lost:
    
        if (r8 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d9, code lost:
    
        if (r8 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x010c, code lost:
    
        if (r8 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x013a, code lost:
    
        if (r8 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0168, code lost:
    
        if (r8 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0071, code lost:
    
        if (r8 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016a, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185 A[LOOP:0: B:14:0x017f->B:16:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0050  */
    /* JADX WARN: Type inference failed for: r6v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable t(jpg jpgVar, boolean z, xdh xdhVar, cg6 cg6Var) {
        qng qngVar;
        ?? r6;
        Iterator it;
        if (cg6Var instanceof qng) {
            qngVar = (qng) cg6Var;
            int i = qngVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qngVar.m = i - Integer.MIN_VALUE;
                Object obj = qngVar.k;
                nm6 nm6Var = nm6.a;
                switch (qngVar.m) {
                    case 0:
                        qgg.h0(obj);
                        t1p t1pVar = jpgVar.f;
                        switch (t1pVar == null ? -1 : ang.a[t1pVar.ordinal()]) {
                            case -1:
                            case 1:
                                qngVar.j = jpgVar;
                                qngVar.m = 6;
                                obj = u(this, jpgVar, z, xdhVar, qngVar);
                                break;
                            case 0:
                            default:
                                r6 = c5b.a;
                                Iterable iterable = (Iterable) r6;
                                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(xv.X((mqs) it.next(), F(jpgVar)));
                                }
                                return arrayList;
                            case 2:
                                qngVar.j = jpgVar;
                                qngVar.m = 3;
                                obj = u(this, jpgVar, z, xdhVar, qngVar);
                                break;
                            case 3:
                                qngVar.j = jpgVar;
                                qngVar.m = 4;
                                obj = u(this, jpgVar, z, xdhVar, qngVar);
                                break;
                            case 4:
                                qngVar.j = jpgVar;
                                qngVar.m = 1;
                                obj = u(this, jpgVar, z, xdhVar, qngVar);
                                break;
                            case 5:
                                qngVar.j = jpgVar;
                                qngVar.m = 2;
                                obj = u(this, jpgVar, z, xdhVar, qngVar);
                                break;
                            case 6:
                                qngVar.j = jpgVar;
                                qngVar.m = 5;
                                obj = u(this, jpgVar, z, xdhVar, qngVar);
                                break;
                        }
                    case 1:
                        jpgVar = qngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj2 : (Iterable) obj) {
                            mqs mqsVar = (mqs) obj2;
                            if (mqsVar.A && c(mqsVar)) {
                                r6.add(obj2);
                            }
                        }
                        Iterable iterable2 = (Iterable) r6;
                        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList2;
                    case 2:
                        jpgVar = qngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj3 : (Iterable) obj) {
                            mqs mqsVar2 = (mqs) obj3;
                            if (mqsVar2.A && b(mqsVar2)) {
                                r6.add(obj3);
                            }
                        }
                        Iterable iterable22 = (Iterable) r6;
                        ArrayList arrayList22 = new ArrayList(v75.o(iterable22, 10));
                        it = iterable22.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList22;
                    case 3:
                        jpgVar = qngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj4 : (Iterable) obj) {
                            if (c((mqs) obj4)) {
                                r6.add(obj4);
                            }
                        }
                        Iterable iterable222 = (Iterable) r6;
                        ArrayList arrayList222 = new ArrayList(v75.o(iterable222, 10));
                        it = iterable222.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList222;
                    case 4:
                        jpgVar = qngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj5 : (Iterable) obj) {
                            if (b((mqs) obj5)) {
                                r6.add(obj5);
                            }
                        }
                        Iterable iterable2222 = (Iterable) r6;
                        ArrayList arrayList2222 = new ArrayList(v75.o(iterable2222, 10));
                        it = iterable2222.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList2222;
                    case 5:
                        jpgVar = qngVar.j;
                        qgg.h0(obj);
                        r6 = new ArrayList();
                        for (Object obj6 : (Iterable) obj) {
                            mqs mqsVar3 = (mqs) obj6;
                            if (!c(mqsVar3) && !b(mqsVar3)) {
                                r6.add(obj6);
                            }
                        }
                        Iterable iterable22222 = (Iterable) r6;
                        ArrayList arrayList22222 = new ArrayList(v75.o(iterable22222, 10));
                        it = iterable22222.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList22222;
                    case 6:
                        jpgVar = qngVar.j;
                        qgg.h0(obj);
                        r6 = (List) obj;
                        Iterable iterable222222 = (Iterable) r6;
                        ArrayList arrayList222222 = new ArrayList(v75.o(iterable222222, 10));
                        it = iterable222222.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList222222;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        qngVar = new qng(this, cg6Var);
        Object obj7 = qngVar.k;
        nm6 nm6Var2 = nm6.a;
        switch (qngVar.m) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable v(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        rng rngVar;
        int i;
        if (cg6Var instanceof rng) {
            rngVar = (rng) cg6Var;
            int i2 = rngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = rngVar.k;
                nm6 nm6Var = nm6.a;
                i = rngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.g) {
                        return c5b.a;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    rngVar.j = jpgVar;
                    rngVar.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.T(fog.d(str), xdhVar, rngVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = rngVar.j;
                    qgg.h0(obj);
                }
                Iterable<cvl> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (cvl cvlVar : iterable) {
                    e4p F = F(jpgVar);
                    cvlVar.getClass();
                    arrayList.add(new b4p(cvlVar, F));
                }
                return arrayList;
            }
        }
        rngVar = new rng(this, cg6Var);
        Object obj2 = rngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = rngVar.m;
        if (i != 0) {
        }
        Iterable<cvl> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[LOOP:0: B:13:0x0088->B:15:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable w(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        sng sngVar;
        int i;
        Iterable iterable;
        if (cg6Var instanceof sng) {
            sngVar = (sng) cg6Var;
            int i2 = sngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sngVar.m = i2 - Integer.MIN_VALUE;
                sng sngVar2 = sngVar;
                Object obj = sngVar2.k;
                nm6 nm6Var = nm6.a;
                i = sngVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    int i3 = t1pVar == null ? -1 : ang.a[t1pVar.ordinal()];
                    if (i3 != -1 && i3 != 1 && i3 != 2) {
                        iterable = c5b.a;
                        Iterable<mqs> iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(v75.o(iterable2, 10));
                        for (mqs mqsVar : iterable2) {
                            e4p F = F(jpgVar);
                            mqsVar.getClass();
                            arrayList.add(new c4p(mqsVar, F));
                        }
                        return arrayList;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    sngVar2.j = jpgVar;
                    sngVar2.m = 1;
                    a.getClass();
                    obj = StringsKt.U(str) ? c5b.a : a.c.S(str, xdhVar, zdj.b, true, sngVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = sngVar2.j;
                    qgg.h0(obj);
                }
                iterable = (List) obj;
                Iterable<mqs> iterable22 = iterable;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable22, 10));
                while (r9.hasNext()) {
                }
                return arrayList2;
            }
        }
        sngVar = new sng(this, cg6Var);
        sng sngVar22 = sngVar;
        Object obj2 = sngVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = sngVar22.m;
        if (i != 0) {
        }
        iterable = (List) obj2;
        Iterable<mqs> iterable222 = iterable;
        ArrayList arrayList22 = new ArrayList(v75.o(iterable222, 10));
        while (r9.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[LOOP:0: B:12:0x0090->B:14:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        tng tngVar;
        int i;
        Object Q;
        Iterable iterable;
        Iterator it;
        if (cg6Var instanceof tng) {
            tngVar = (tng) cg6Var;
            int i2 = tngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = tngVar.k;
                nm6 nm6Var = nm6.a;
                i = tngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    int i3 = t1pVar == null ? -1 : ang.a[t1pVar.ordinal()];
                    if (i3 != -1 && i3 != 1 && i3 != 2) {
                        iterable = c5b.a;
                        Iterable iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(v75.o(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(xv.W((ipg) it.next(), F(jpgVar)));
                        }
                        return arrayList;
                    }
                    fog a = a();
                    String str = jpgVar.a;
                    tngVar.j = jpgVar;
                    tngVar.m = 1;
                    a.getClass();
                    if (StringsKt.U(str)) {
                        Q = c5b.a;
                    } else {
                        ime imeVar = a.c;
                        String d = fog.d(str);
                        imeVar.getClass();
                        Q = gld.Q(new nog(d, imeVar, xdhVar, null, 1), tngVar);
                    }
                    obj = Q;
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = tngVar.j;
                    qgg.h0(obj);
                }
                iterable = (List) obj;
                Iterable iterable22 = iterable;
                ArrayList arrayList2 = new ArrayList(v75.o(iterable22, 10));
                it = iterable22.iterator();
                while (it.hasNext()) {
                }
                return arrayList2;
            }
        }
        tngVar = new tng(this, cg6Var);
        Object obj2 = tngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = tngVar.m;
        if (i != 0) {
        }
        iterable = (List) obj2;
        Iterable iterable222 = iterable;
        ArrayList arrayList22 = new ArrayList(v75.o(iterable222, 10));
        it = iterable222.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[LOOP:0: B:12:0x0084->B:14:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        ung ungVar;
        int i;
        Iterator it;
        if (cg6Var instanceof ung) {
            ungVar = (ung) cg6Var;
            int i2 = ungVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ungVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ungVar.k;
                Object obj2 = nm6.a;
                i = ungVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (((j5p) jpgVar.b).b.r) {
                        ungVar.j = null;
                        ungVar.m = 1;
                        Object A = A(jpgVar, xdhVar, ungVar);
                        if (A != obj2) {
                            return A;
                        }
                    } else {
                        t1p t1pVar = jpgVar.f;
                        if (t1pVar != null && t1pVar != t1p.a && t1pVar != t1p.d) {
                            return c5b.a;
                        }
                        fog a = a();
                        String str = jpgVar.d;
                        String str2 = jpgVar.a;
                        ungVar.j = jpgVar;
                        ungVar.m = 2;
                        obj = a.b(str, str2, xdhVar, ungVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jpgVar = ungVar.j;
                qgg.h0(obj);
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.X((mqs) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        ungVar = new ung(this, cg6Var);
        Object obj3 = ungVar.k;
        Object obj22 = nm6.a;
        i = ungVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj3;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0073, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a8, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6 A[LOOP:0: B:14:0x00f0->B:16:0x00f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable z(jpg jpgVar, xdh xdhVar, cg6 cg6Var) {
        vng vngVar;
        int i;
        ?? r11;
        Iterator it;
        if (cg6Var instanceof vng) {
            vngVar = (vng) cg6Var;
            int i2 = vngVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vngVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vngVar.k;
                nm6 nm6Var = nm6.a;
                i = vngVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t1p t1pVar = jpgVar.f;
                    String str = jpgVar.a;
                    String str2 = jpgVar.d;
                    int i3 = t1pVar == null ? -1 : ang.a[t1pVar.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        vngVar.j = jpgVar;
                        vngVar.m = 3;
                        obj = a().b(str2, str, xdhVar, vngVar);
                    } else if (i3 == 3) {
                        vngVar.j = jpgVar;
                        vngVar.m = 2;
                        obj = a().b(str2, str, xdhVar, vngVar);
                    } else if (i3 != 5) {
                        r11 = c5b.a;
                    } else {
                        vngVar.j = jpgVar;
                        vngVar.m = 1;
                        obj = a().b(str2, str, xdhVar, vngVar);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    jpgVar = vngVar.j;
                    qgg.h0(obj);
                    r11 = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        mqs mqsVar = (mqs) obj2;
                        if (mqsVar.A && b(mqsVar)) {
                            r11.add(obj2);
                        }
                    }
                } else if (i == 2) {
                    jpgVar = vngVar.j;
                    qgg.h0(obj);
                    r11 = new ArrayList();
                    for (Object obj3 : (Iterable) obj) {
                        if (b((mqs) obj3)) {
                            r11.add(obj3);
                        }
                    }
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jpgVar = vngVar.j;
                    qgg.h0(obj);
                    r11 = (List) obj;
                }
                Iterable iterable = (Iterable) r11;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(xv.X((mqs) it.next(), F(jpgVar)));
                }
                return arrayList;
            }
        }
        vngVar = new vng(this, cg6Var);
        Object obj4 = vngVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vngVar.m;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) r11;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }
}
