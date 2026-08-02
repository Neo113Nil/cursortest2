package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class br4 {
    public static final br4 a = new br4();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final qqi c = rqi.a();

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[Catch: all -> 0x009b, LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END, TryCatch #0 {all -> 0x009b, blocks: (B:12:0x0042, B:13:0x0059, B:15:0x005f, B:17:0x009d), top: B:11:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        yq4 yq4Var;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof yq4) {
                yq4Var = (yq4) cg6Var;
                int i2 = yq4Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yq4Var.m = i2 - Integer.MIN_VALUE;
                    Object obj = yq4Var.k;
                    nm6 nm6Var = nm6.a;
                    i = yq4Var.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = c;
                        yq4Var.j = qqiVar;
                        yq4Var.m = 1;
                        if (qqiVar.a(yq4Var) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = yq4Var.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                    }
                    Map o = uah.o(b);
                    ArrayList arrayList = new ArrayList(o.size());
                    for (Map.Entry entry : o.entrySet()) {
                        arrayList.add(((String) entry.getKey()) + ", currentCount=" + ((xq4) entry.getValue()).a + ", totalAllocations=" + ((xq4) entry.getValue()).b);
                    }
                    String X = CollectionsKt.X(arrayList, StringUtil.LF, null, null, null, 62);
                    qqiVar.b(null);
                    return X;
                }
            }
            Map o2 = uah.o(b);
            ArrayList arrayList2 = new ArrayList(o2.size());
            while (r0.hasNext()) {
            }
            String X2 = CollectionsKt.X(arrayList2, StringUtil.LF, null, null, null, 62);
            qqiVar.b(null);
            return X2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        yq4Var = new yq4(this, cg6Var);
        Object obj2 = yq4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = yq4Var.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0047, B:14:0x0051, B:15:0x006a, B:20:0x005c), top: B:11:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0047, B:14:0x0051, B:15:0x006a, B:20:0x005c), top: B:11:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        zq4 zq4Var;
        int i;
        qqi qqiVar;
        xq4 xq4Var;
        try {
            if (cg6Var instanceof zq4) {
                zq4Var = (zq4) cg6Var;
                int i2 = zq4Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zq4Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = zq4Var.l;
                    nm6 nm6Var = nm6.a;
                    i = zq4Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        zq4Var.j = str;
                        qqiVar = c;
                        zq4Var.k = qqiVar;
                        zq4Var.n = 1;
                        if (qqiVar.a(zq4Var) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = zq4Var.k;
                        String str2 = zq4Var.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        str = str2;
                    }
                    LinkedHashMap linkedHashMap = b;
                    xq4Var = (xq4) linkedHashMap.get(str);
                    if (xq4Var != null) {
                        linkedHashMap.put(str, new xq4(1, 1));
                    } else {
                        linkedHashMap.put(str, new xq4(xq4Var.a + 1, xq4Var.b + 1));
                    }
                    Unit unit = Unit.a;
                    qqiVar.b(null);
                    return unit;
                }
            }
            LinkedHashMap linkedHashMap2 = b;
            xq4Var = (xq4) linkedHashMap2.get(str);
            if (xq4Var != null) {
            }
            Unit unit2 = Unit.a;
            qqiVar.b(null);
            return unit2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        zq4Var = new zq4(this, cg6Var);
        Object obj2 = zq4Var.l;
        nm6 nm6Var2 = nm6.a;
        i = zq4Var.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:12:0x0047, B:14:0x0051, B:15:0x0061), top: B:11:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        ar4 ar4Var;
        int i;
        qqi qqiVar;
        xq4 xq4Var;
        try {
            if (cg6Var instanceof ar4) {
                ar4Var = (ar4) cg6Var;
                int i2 = ar4Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ar4Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = ar4Var.l;
                    nm6 nm6Var = nm6.a;
                    i = ar4Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        ar4Var.j = str;
                        qqiVar = c;
                        ar4Var.k = qqiVar;
                        ar4Var.n = 1;
                        if (qqiVar.a(ar4Var) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = ar4Var.k;
                        String str2 = ar4Var.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        str = str2;
                    }
                    LinkedHashMap linkedHashMap = b;
                    xq4Var = (xq4) linkedHashMap.get(str);
                    if (xq4Var != null) {
                        linkedHashMap.put(str, new xq4(xq4Var.a - 1, xq4Var.b));
                    }
                    Unit unit = Unit.a;
                    qqiVar.b(null);
                    return unit;
                }
            }
            LinkedHashMap linkedHashMap2 = b;
            xq4Var = (xq4) linkedHashMap2.get(str);
            if (xq4Var != null) {
            }
            Unit unit2 = Unit.a;
            qqiVar.b(null);
            return unit2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        ar4Var = new ar4(this, cg6Var);
        Object obj2 = ar4Var.l;
        nm6 nm6Var2 = nm6.a;
        i = ar4Var.n;
        if (i != 0) {
        }
    }
}
