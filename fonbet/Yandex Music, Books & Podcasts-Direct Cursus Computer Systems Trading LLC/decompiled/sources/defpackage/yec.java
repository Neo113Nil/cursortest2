package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yec {
    public static final yec a = new yec();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static wec a(ymp ympVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(ympVar);
        if (obj != null) {
            return (wec) obj;
        }
        rj7.n(ympVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:12:0x0098, B:23:0x00ab, B:24:0x00c3), top: B:11:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0096 -> B:10:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        xec xecVar;
        int i;
        Iterator it;
        Map map;
        if (cg6Var instanceof xec) {
            xecVar = (xec) cg6Var;
            int i2 = xecVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xecVar.r = i2 - Integer.MIN_VALUE;
                Object obj = xecVar.p;
                nm6 nm6Var = nm6.a;
                i = xecVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    Map map2 = b;
                    map2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map2.size()));
                    it = map2.entrySet().iterator();
                    map = linkedHashMap;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object key = xecVar.o;
                    map = xecVar.n;
                    qqi qqiVar = xecVar.m;
                    ymp ympVar = xecVar.l;
                    it = xecVar.k;
                    Map map3 = xecVar.j;
                    qgg.h0(obj);
                    try {
                        ympVar.getClass();
                        dp6 dp6Var = a(ympVar).b;
                        if (dp6Var == null) {
                            qqiVar.b(null);
                            map.put(key, dp6Var);
                            map = map3;
                            if (it.hasNext()) {
                                return map;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            key = entry.getKey();
                            ympVar = (ymp) entry.getKey();
                            qqiVar = ((wec) entry.getValue()).a;
                            Map map4 = map;
                            xecVar.j = map4;
                            xecVar.k = it;
                            xecVar.l = ympVar;
                            xecVar.m = qqiVar;
                            xecVar.n = map4;
                            xecVar.o = key;
                            xecVar.r = 1;
                            if (qqiVar.a(xecVar) == nm6Var) {
                                return nm6Var;
                            }
                            map3 = map;
                            ympVar.getClass();
                            dp6 dp6Var2 = a(ympVar).b;
                            if (dp6Var2 == null) {
                                throw new IllegalStateException("Subscriber " + ympVar + " has not been registered.");
                            }
                        }
                    } catch (Throwable th) {
                        qqiVar.b(null);
                        throw th;
                    }
                }
            }
        }
        xecVar = new xec(this, cg6Var);
        Object obj2 = xecVar.p;
        nm6 nm6Var2 = nm6.a;
        i = xecVar.r;
        if (i != 0) {
        }
    }
}
