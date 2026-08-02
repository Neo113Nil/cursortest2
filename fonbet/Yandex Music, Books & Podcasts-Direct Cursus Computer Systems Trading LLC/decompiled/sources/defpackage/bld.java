package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class bld {
    public static final bld a = new bld();
    public static final qqi b = rqi.a();
    public static final LinkedHashMap c = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x004f, B:13:0x0056, B:14:0x0059, B:15:0x0062, B:20:0x005e), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x004f, B:13:0x0056, B:14:0x0059, B:15:0x0062, B:20:0x005e), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, uqf uqfVar, String str, cg6 cg6Var) {
        xkd xkdVar;
        int i;
        qqi qqiVar;
        File a2;
        try {
            if (cg6Var instanceof xkd) {
                xkdVar = (xkd) cg6Var;
                int i2 = xkdVar.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xkdVar.p = i2 - Integer.MIN_VALUE;
                    Object obj = xkdVar.n;
                    nm6 nm6Var = nm6.a;
                    i = xkdVar.p;
                    if (i != 0) {
                        qgg.h0(obj);
                        xkdVar.j = context;
                        xkdVar.k = uqfVar;
                        xkdVar.l = str;
                        qqiVar = b;
                        xkdVar.m = qqiVar;
                        xkdVar.p = 1;
                        if (qqiVar.a(xkdVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = xkdVar.m;
                        str = xkdVar.l;
                        uqfVar = xkdVar.k;
                        Context context2 = xkdVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        context = context2;
                    }
                    c.remove(str);
                    switch (uqfVar.a) {
                        case 0:
                            a2 = datastore_release.a(context, str);
                            break;
                        default:
                            a2 = emm.a(context, str);
                            break;
                    }
                    a2.delete();
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            c.remove(str);
            switch (uqfVar.a) {
            }
            a2.delete();
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        xkdVar = new xkd(this, cg6Var);
        Object obj2 = xkdVar.n;
        nm6 nm6Var2 = nm6.a;
        i = xkdVar.p;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r10.a(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:26:0x006d, B:28:0x0075, B:29:0x0081, B:30:0x0084, B:34:0x0091), top: B:25:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, uqf uqfVar, String str, cg6 cg6Var) {
        ykd ykdVar;
        int i;
        qqi qqiVar;
        oqi oqiVar;
        Object obj;
        Object b2;
        Map map;
        try {
            if (cg6Var instanceof ykd) {
                ykdVar = (ykd) cg6Var;
                int i2 = ykdVar.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ykdVar.p = i2 - Integer.MIN_VALUE;
                    Object obj2 = ykdVar.n;
                    nm6 nm6Var = nm6.a;
                    i = ykdVar.p;
                    if (i != 0) {
                        qgg.h0(obj2);
                        ykdVar.j = context;
                        ykdVar.k = uqfVar;
                        ykdVar.l = str;
                        qqiVar = b;
                        ykdVar.m = qqiVar;
                        ykdVar.p = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map = (Map) ykdVar.l;
                            oqiVar = (oqi) ykdVar.k;
                            str = (String) ykdVar.j;
                            try {
                                qgg.h0(obj2);
                                obj = (wb7) obj2;
                                map.put(str, obj);
                                obj.getClass();
                                wb7 wb7Var = (wb7) obj;
                                oqiVar.b(null);
                                return wb7Var;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        qqi qqiVar2 = ykdVar.m;
                        str = (String) ykdVar.l;
                        uqfVar = (uqf) ykdVar.k;
                        Context context2 = (Context) ykdVar.j;
                        qgg.h0(obj2);
                        qqiVar = qqiVar2;
                        context = context2;
                    }
                    LinkedHashMap linkedHashMap = c;
                    obj = linkedHashMap.get(str);
                    if (obj == null) {
                        oqiVar = qqiVar;
                        obj.getClass();
                        wb7 wb7Var2 = (wb7) obj;
                        oqiVar.b(null);
                        return wb7Var2;
                    }
                    ykdVar.j = str;
                    ykdVar.k = qqiVar;
                    ykdVar.l = linkedHashMap;
                    ykdVar.m = null;
                    ykdVar.p = 2;
                    switch (uqfVar.a) {
                        case 0:
                            b2 = ac7.b(pqf.a, null, new tqf(context, str, 0), 14);
                            break;
                        default:
                            b2 = dmm.b(null, new tqf(context, str, 1), 7);
                            break;
                    }
                    if (b2 != nm6Var) {
                        oqiVar = qqiVar;
                        obj2 = b2;
                        map = linkedHashMap;
                        obj = (wb7) obj2;
                        map.put(str, obj);
                        obj.getClass();
                        wb7 wb7Var22 = (wb7) obj;
                        oqiVar.b(null);
                        return wb7Var22;
                    }
                    return nm6Var;
                }
            }
            LinkedHashMap linkedHashMap2 = c;
            obj = linkedHashMap2.get(str);
            if (obj == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            oqiVar = qqiVar;
            oqiVar.b(null);
            throw th;
        }
        ykdVar = new ykd(this, cg6Var);
        Object obj22 = ykdVar.n;
        nm6 nm6Var2 = nm6.a;
        i = ykdVar.p;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, uqf uqfVar, String str, cg6 cg6Var) {
        zkd zkdVar;
        int i;
        if (cg6Var instanceof zkd) {
            zkdVar = (zkd) cg6Var;
            int i2 = zkdVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zkdVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zkdVar.j;
                Object obj2 = nm6.a;
                i = zkdVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    zkdVar.l = 1;
                    obj = b(context, uqfVar, str, zkdVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pjc data = ((wb7) obj).getData();
                zkdVar.l = 2;
                Object g0 = zsd.g0(data, zkdVar);
                return g0 != obj2 ? obj2 : g0;
            }
        }
        zkdVar = new zkd(this, cg6Var);
        Object obj3 = zkdVar.j;
        Object obj22 = nm6.a;
        i = zkdVar.l;
        if (i != 0) {
        }
        pjc data2 = ((wb7) obj3).getData();
        zkdVar.l = 2;
        Object g02 = zsd.g0(data2, zkdVar);
        if (g02 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, uqf uqfVar, String str, nz5 nz5Var, cg6 cg6Var) {
        ald aldVar;
        int i;
        if (cg6Var instanceof ald) {
            aldVar = (ald) cg6Var;
            int i2 = aldVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aldVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aldVar.k;
                Object obj2 = nm6.a;
                i = aldVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    aldVar.j = nz5Var;
                    aldVar.m = 1;
                    obj = b(context, uqfVar, str, aldVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nz5Var = aldVar.j;
                    qgg.h0(obj);
                }
                aldVar.j = null;
                aldVar.m = 2;
                Object a2 = ((wb7) obj).a(nz5Var, aldVar);
                return a2 != obj2 ? obj2 : a2;
            }
        }
        aldVar = new ald(this, cg6Var);
        Object obj3 = aldVar.k;
        Object obj22 = nm6.a;
        i = aldVar.m;
        if (i != 0) {
        }
        aldVar.j = null;
        aldVar.m = 2;
        Object a22 = ((wb7) obj3).a(nz5Var, aldVar);
        if (a22 != obj22) {
        }
    }
}
