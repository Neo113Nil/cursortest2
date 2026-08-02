package defpackage;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.pay.ui.core.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class g6a implements tqg {
    public final h a;
    public final yfx b;
    public final a c;
    public final g06 d = new g06(fsg.b(g6a.class.getSimpleName()));

    public g6a(h hVar, yfx yfxVar, a aVar, b bVar) {
        this.a = hVar;
        this.b = yfxVar;
        this.c = aVar;
    }

    public static jyr d(g6a g6aVar, t5a t5aVar, q2a q2aVar, Map map, Boolean bool, Throwable th, p5a p5aVar, int i) {
        if ((i & 2) != 0) {
            q2aVar = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            th = null;
        }
        p5a p5aVar2 = (i & 32) != 0 ? null : p5aVar;
        g6aVar.getClass();
        return fsg.a(new Pair("queryPath", t5aVar.a), new Pair("queryParams", t5aVar.b), fsg.d(q2aVar != null ? q2aVar.e : null, "currentDocumentContext"), fsg.d(map, "payload"), fsg.d(bool, "retriedAfterError"), fsg.d(th, "error"), fsg.d(p5aVar2, "patchParams"));
    }

    public static Map g(t5a t5aVar, ArrayList arrayList) {
        String str;
        Map map = t5aVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList2.add(((String) entry.getKey()) + ": " + CollectionsKt.X((List) entry.getValue(), ", ", null, null, null, 62));
        }
        Pair pair = new Pair("query", CollectionsKt.X(arrayList2, StringUtil.LF, null, null, null, 62));
        Map map2 = t5aVar.c;
        if (map2 != null) {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList3.add(((String) entry2.getKey()) + ": " + entry2.getValue());
            }
            str = CollectionsKt.X(arrayList3, StringUtil.LF, null, null, null, 62);
        } else {
            str = "";
        }
        return uah.e(pair, new Pair("body", str), new Pair("tags", CollectionsKt.X(arrayList, ", ", null, null, null, 62)));
    }

    public static lah j(t5a t5aVar, q5f q5fVar, Map map, boolean z) {
        String str;
        String str2 = t5aVar.a;
        Map map2 = t5aVar.b;
        LinkedHashMap r = su4.r("Compat-Vector", "VQ+y6l");
        if (z) {
            r.put("Retried-Attempt", "1");
        }
        Map map3 = t5aVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map3 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map3.size()));
            for (Map.Entry entry : map3.entrySet()) {
                linkedHashMap2.put(entry.getKey(), qee.u(entry.getValue()));
            }
            linkedHashMap.put(ServiceCommand.TYPE_REQ, new q5f(linkedHashMap2));
        }
        if (!map.isEmpty()) {
            linkedHashMap.put("payload", new q5f(map));
        }
        if (q5fVar != null) {
            linkedHashMap.put("context", q5fVar);
        }
        if (linkedHashMap.isEmpty()) {
            str = "{}";
        } else {
            w3f w3fVar = x3f.d;
            q5f q5fVar2 = new q5f(linkedHashMap);
            w3fVar.getClass();
            str = w3fVar.c(q5f.Companion.serializer(), q5fVar2);
        }
        return new lah(str2, r, map2, str);
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.d;
    }

    public final void b(mah mahVar, boolean z) {
        pz0 pz0Var = new pz0(6);
        pz0Var.b(fsg.d(mahVar.c, "responseCode"));
        pz0Var.b(fsg.d(mahVar.d, "responseMessage"));
        pz0Var.b(fsg.d(mahVar.e, "requestId"));
        pz0Var.b(new Pair("path", mahVar.a.a));
        pz0Var.b(new Pair("isPreload", Boolean.valueOf(z)));
        Map map = mahVar.k;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        pz0Var.c(arrayList.toArray(new Pair[0]));
        ArrayList arrayList2 = pz0Var.a;
        Pair[] pairArr = (Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]);
        String str = (String) this.d.d;
        if (str != null) {
            fsg.a.put(new aic(str), fsg.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        }
    }

    public final void c(l4a l4aVar, t5a t5aVar, apo apoVar, List list, boolean z, r0o r0oVar) {
        StackTraceElement stackTraceElement;
        String str;
        vhc vhcVar;
        StackTraceElement stackTraceElement2;
        String str2;
        jyr d = d(this, t5aVar, null, null, null, null, null, 62);
        c5b c5bVar = c5b.a;
        g06 g06Var = this.d;
        htb htbVar = ((thc) g06Var.c).a;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = bool.booleanValue();
        vhc vhcVar2 = vhc.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            vhcVar = new vhc(fileName, methodName, str);
        } else {
            vhcVar = vhcVar2;
        }
        yhc yhcVar = yhc.DEBUG;
        g06Var.N(yhcVar, "Fetched document", d, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
        if (l4aVar instanceof k4a) {
            if (z) {
                apoVar.h(list);
            }
            if (r0oVar.b) {
                apoVar.i("isPreload");
            }
            b(new mah((lah) r0oVar.c, null, null, null, null, null, null, null, null, null, (e5b) r0oVar.d), r0oVar.b);
            Throwable th = ((k4a) l4aVar).a;
            h(t5aVar, th, "DocumentService.tryLoadFromNetwork", apoVar);
            jyr d2 = d(this, t5aVar, null, null, null, th, null, 46);
            htb htbVar2 = ((thc) g06Var.c).a;
            if (bool.booleanValue() && (stackTraceElement2 = (StackTraceElement) hrg.k(0)) != null) {
                String fileName2 = stackTraceElement2.getFileName();
                if (fileName2 == null) {
                    fileName2 = "No file info";
                }
                String methodName2 = stackTraceElement2.getMethodName();
                int lineNumber2 = stackTraceElement2.getLineNumber();
                Integer valueOf2 = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                if (valueOf2 == null || (str2 = valueOf2.toString()) == null) {
                    str2 = "No line info";
                }
                vhcVar2 = new vhc(fileName2, methodName2, str2);
            }
            vhc vhcVar3 = vhcVar2;
            g06Var.N(yhcVar, "Failed to parse fetched document", d2, c5bVar, vhcVar3.a, vhcVar3.b, vhcVar3.c);
        } else {
            apoVar.i("fromNetwork");
        }
        if (l4aVar instanceof m4a) {
            if (((m4a) l4aVar).e) {
                apoVar.i("screenIsBroken");
                if (r0oVar.b) {
                    apoVar.i("isPreload");
                }
            }
            try {
                r7o r7oVar = z7o.b;
            } catch (Throwable unused) {
                r7o r7oVar2 = z7o.b;
            }
        }
    }

    public final void e(t5a t5aVar, lah lahVar) {
        StackTraceElement stackTraceElement;
        String str;
        jyr d = d(this, t5aVar, null, null, null, null, null, 62);
        c5b c5bVar = c5b.a;
        g06 g06Var = this.d;
        htb htbVar = ((thc) g06Var.c).a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        vhc vhcVar = vhc.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            vhcVar = new vhc(fileName, methodName, str);
        }
        g06Var.N(yhc.DEBUG, "Failed to load document from network cache", d, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(lah lahVar, oah oahVar, r0o r0oVar, cg6 cg6Var) {
        e6a e6aVar;
        int i;
        if (cg6Var instanceof e6a) {
            e6aVar = (e6a) cg6Var;
            int i2 = e6aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e6aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = e6aVar.k;
                nm6 nm6Var = nm6.a;
                i = e6aVar.m;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    uvg uvgVar = new uvg(1, new ix6(new f1o(lahVar.a, lahVar.c), new uvg(lahVar, oahVar, r0oVar, z), null));
                    e6aVar.j = r0oVar;
                    e6aVar.m = 1;
                    h hVar = this.a;
                    hVar.getClass();
                    obj = hVar.n(lahVar, uvgVar, e6aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r0oVar = e6aVar.j;
                    qgg.h0(obj);
                }
                nah nahVar = (nah) obj;
                b(nahVar.b, r0oVar.b);
                return nahVar.a;
            }
        }
        e6aVar = new e6a(this, cg6Var);
        Object obj2 = e6aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = e6aVar.m;
        boolean z2 = true;
        if (i != 0) {
        }
        nah nahVar2 = (nah) obj2;
        b(nahVar2.b, r0oVar.b);
        return nahVar2.a;
    }

    public final void h(t5a t5aVar, Throwable th, String str, apo apoVar) {
        StackTraceElement stackTraceElement;
        String str2;
        if (!(th instanceof kah)) {
            i(t5aVar, th, str, apoVar);
            return;
        }
        kah kahVar = (kah) th;
        String str3 = kahVar.a.e;
        int ordinal = kahVar.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i(t5aVar, th, str, apoVar);
                return;
            } else {
                b6e.s();
                return;
            }
        }
        xgb xgbVar = xgb.ACTION_SERVICE_REQUEST_ERROR;
        pz0 pz0Var = new pz0(4);
        pz0Var.b(new Pair("locator", str));
        pz0Var.b(new Pair("cause", th));
        pz0Var.b(new Pair(DeviceService.KEY_DESC, hrg.q("Document request error: failed to fetch document (", th.getMessage(), ")")));
        pz0Var.c(x97.G(g(t5aVar, apoVar.m())));
        ArrayList arrayList = pz0Var.a;
        jyr a = fsg.a((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
        c5b c5bVar = c5b.a;
        g06 g06Var = this.d;
        htb htbVar = ((thc) g06Var.c).a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        vhc vhcVar = vhc.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            vhcVar = new vhc(fileName, methodName, str2);
        }
        g06Var.N(yhc.FAULT, "Failed to fetch document", fsg.c(a, fsg.a(new Pair("errorType", "Document.Request.Failed"))), c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
    }

    public final void i(t5a t5aVar, Throwable th, String str, apo apoVar) {
        StackTraceElement stackTraceElement;
        String str2;
        xgb xgbVar = xgb.ACTION_SERVICE_REQUEST_ERROR;
        pz0 pz0Var = new pz0(4);
        pz0Var.b(new Pair("locator", str));
        pz0Var.b(new Pair("cause", th));
        pz0Var.b(new Pair(DeviceService.KEY_DESC, hrg.s("Document parse error: failed to parse document (", th.getClass().getSimpleName(), ": ", th.getMessage(), ")")));
        pz0Var.c(x97.G(g(t5aVar, apoVar.m())));
        ArrayList arrayList = pz0Var.a;
        jyr a = fsg.a((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
        c5b c5bVar = c5b.a;
        g06 g06Var = this.d;
        htb htbVar = ((thc) g06Var.c).a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        vhc vhcVar = vhc.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            vhcVar = new vhc(fileName, methodName, str2);
        }
        g06Var.N(yhc.FAULT, "Failed to parse document", fsg.c(a, fsg.a(new Pair("errorType", "Document.Decoding.Failed"))), c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[Catch: all -> 0x003c, TryCatch #8 {all -> 0x003c, blocks: (B:12:0x0035, B:15:0x0070, B:18:0x007c, B:26:0x009c, B:28:0x00a5, B:29:0x00a8, B:32:0x00da, B:34:0x00ec, B:37:0x00f4, B:41:0x010b, B:43:0x0113, B:46:0x0119, B:72:0x0051, B:75:0x005a, B:78:0x0062), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #8 {all -> 0x003c, blocks: (B:12:0x0035, B:15:0x0070, B:18:0x007c, B:26:0x009c, B:28:0x00a5, B:29:0x00a8, B:32:0x00da, B:34:0x00ec, B:37:0x00f4, B:41:0x010b, B:43:0x0113, B:46:0x0119, B:72:0x0051, B:75:0x005a, B:78:0x0062), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(t5a t5aVar, lah lahVar, vx6 vx6Var, apo apoVar, ArrayList arrayList, boolean z, r0o r0oVar, cg6 cg6Var) {
        f6a f6aVar;
        int i;
        g06 g06Var;
        g06 g06Var2;
        ArrayList arrayList2;
        boolean z2;
        t5a t5aVar2;
        apo apoVar2;
        g6a g6aVar;
        t5a t5aVar3;
        boolean booleanValue;
        vhc vhcVar;
        StackTraceElement stackTraceElement;
        String fileName;
        Integer num;
        r0o r0oVar2;
        t5a t5aVar4;
        apo apoVar3;
        ArrayList arrayList3;
        boolean z3;
        r0o r0oVar3 = r0oVar;
        try {
            try {
                try {
                    if (cg6Var instanceof f6a) {
                        f6aVar = (f6a) cg6Var;
                        int i2 = f6aVar.r;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            f6aVar.r = i2 - Integer.MIN_VALUE;
                            Object obj = f6aVar.p;
                            nm6 nm6Var = nm6.a;
                            i = f6aVar.r;
                            g06Var = this.d;
                            if (i != 0) {
                                qgg.h0(obj);
                                try {
                                    g06Var.s();
                                    f6aVar.j = t5aVar;
                                    f6aVar.k = apoVar;
                                    arrayList2 = arrayList;
                                    try {
                                        f6aVar.l = arrayList2;
                                        f6aVar.m = r0oVar3;
                                        f6aVar.n = this;
                                        z2 = z;
                                        try {
                                            f6aVar.o = z2;
                                            f6aVar.r = 1;
                                            obj = f(lahVar, vx6Var, r0oVar3, f6aVar);
                                            if (obj == nm6Var) {
                                                return nm6Var;
                                            }
                                            g6aVar = this;
                                            t5aVar3 = t5aVar;
                                            apoVar2 = apoVar;
                                        } catch (kah e) {
                                            e = e;
                                            t5aVar2 = t5aVar;
                                            apoVar2 = apoVar;
                                            b(e.a, r0oVar3.b);
                                            if (z2) {
                                                apoVar2.h(arrayList2);
                                            }
                                            h(t5aVar2, e, "DocumentService.tryLoadFromNetwork", apoVar2);
                                            kah kahVar = e;
                                            jyr d = d(this, t5aVar2, null, null, null, kahVar, null, 46);
                                            c5b c5bVar = c5b.a;
                                            htb htbVar = ((thc) g06Var.c).a;
                                            booleanValue = Boolean.FALSE.booleanValue();
                                            vhcVar = vhc.d;
                                            if (booleanValue && (stackTraceElement = (StackTraceElement) xz0.E(0, new Throwable().getStackTrace())) != null) {
                                                fileName = stackTraceElement.getFileName();
                                                if (fileName == null) {
                                                    fileName = "No file info";
                                                }
                                                String methodName = stackTraceElement.getMethodName();
                                                num = new Integer(stackTraceElement.getLineNumber());
                                                if (num.intValue() > 0) {
                                                    num = null;
                                                }
                                                if (num != null || (r4 = num.toString()) == null) {
                                                    String str = "No line info";
                                                }
                                                vhcVar = new vhc(fileName, methodName, str);
                                            }
                                            g06Var.N(yhc.DEBUG, "Failed to fetch document", d, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
                                            g06Var2 = g06Var;
                                            k4a k4aVar = new k4a(kahVar);
                                            g06Var2.r();
                                            return k4aVar;
                                        }
                                    } catch (kah e2) {
                                        e = e2;
                                        z2 = z;
                                        t5aVar2 = t5aVar;
                                        apoVar2 = apoVar;
                                        b(e.a, r0oVar3.b);
                                        if (z2) {
                                        }
                                        h(t5aVar2, e, "DocumentService.tryLoadFromNetwork", apoVar2);
                                        kah kahVar2 = e;
                                        jyr d2 = d(this, t5aVar2, null, null, null, kahVar2, null, 46);
                                        c5b c5bVar2 = c5b.a;
                                        htb htbVar2 = ((thc) g06Var.c).a;
                                        booleanValue = Boolean.FALSE.booleanValue();
                                        vhcVar = vhc.d;
                                        if (booleanValue) {
                                        }
                                        g06Var.N(yhc.DEBUG, "Failed to fetch document", d2, c5bVar2, vhcVar.a, vhcVar.b, vhcVar.c);
                                        g06Var2 = g06Var;
                                        k4a k4aVar2 = new k4a(kahVar2);
                                        g06Var2.r();
                                        return k4aVar2;
                                    }
                                } catch (kah e3) {
                                    e = e3;
                                    arrayList2 = arrayList;
                                }
                            } else {
                                if (i != 1) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                boolean z4 = f6aVar.o;
                                g6aVar = f6aVar.n;
                                r0o r0oVar4 = f6aVar.m;
                                ArrayList arrayList4 = f6aVar.l;
                                apoVar2 = f6aVar.k;
                                t5aVar3 = f6aVar.j;
                                try {
                                    qgg.h0(obj);
                                    z2 = z4;
                                    r0oVar3 = r0oVar4;
                                    arrayList2 = arrayList4;
                                } catch (kah e4) {
                                    e = e4;
                                    z2 = z4;
                                    r0oVar3 = r0oVar4;
                                    arrayList2 = arrayList4;
                                    t5aVar2 = t5aVar3;
                                    b(e.a, r0oVar3.b);
                                    if (z2) {
                                    }
                                    h(t5aVar2, e, "DocumentService.tryLoadFromNetwork", apoVar2);
                                    kah kahVar22 = e;
                                    jyr d22 = d(this, t5aVar2, null, null, null, kahVar22, null, 46);
                                    c5b c5bVar22 = c5b.a;
                                    htb htbVar22 = ((thc) g06Var.c).a;
                                    booleanValue = Boolean.FALSE.booleanValue();
                                    vhcVar = vhc.d;
                                    if (booleanValue) {
                                        fileName = stackTraceElement.getFileName();
                                        if (fileName == null) {
                                        }
                                        String methodName2 = stackTraceElement.getMethodName();
                                        num = new Integer(stackTraceElement.getLineNumber());
                                        if (num.intValue() > 0) {
                                        }
                                        if (num != null) {
                                        }
                                        String str2 = "No line info";
                                        vhcVar = new vhc(fileName, methodName2, str2);
                                    }
                                    try {
                                        g06Var.N(yhc.DEBUG, "Failed to fetch document", d22, c5bVar22, vhcVar.a, vhcVar.b, vhcVar.c);
                                        g06Var2 = g06Var;
                                        try {
                                            k4a k4aVar22 = new k4a(kahVar22);
                                            g06Var2.r();
                                            return k4aVar22;
                                        } catch (Throwable th) {
                                            th = th;
                                            g06Var2.r();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        g06Var2 = g06Var;
                                    }
                                }
                            }
                            l4a l4aVar = (l4a) obj;
                            r0oVar2 = r0oVar3;
                            t5aVar4 = t5aVar3;
                            apoVar3 = apoVar2;
                            arrayList3 = arrayList2;
                            z3 = z2;
                            g6aVar.c(l4aVar, t5aVar4, apoVar3, arrayList3, z3, r0oVar2);
                            g06Var.r();
                            return l4aVar;
                        }
                    }
                    g6aVar.c(l4aVar, t5aVar4, apoVar3, arrayList3, z3, r0oVar2);
                    g06Var.r();
                    return l4aVar;
                } catch (kah e5) {
                    e = e5;
                    t5aVar3 = t5aVar4;
                    apoVar2 = apoVar3;
                    arrayList2 = arrayList3;
                    z2 = z3;
                    r0oVar3 = r0oVar2;
                    t5aVar2 = t5aVar3;
                    b(e.a, r0oVar3.b);
                    if (z2) {
                    }
                    h(t5aVar2, e, "DocumentService.tryLoadFromNetwork", apoVar2);
                    kah kahVar222 = e;
                    jyr d222 = d(this, t5aVar2, null, null, null, kahVar222, null, 46);
                    c5b c5bVar222 = c5b.a;
                    htb htbVar222 = ((thc) g06Var.c).a;
                    booleanValue = Boolean.FALSE.booleanValue();
                    vhcVar = vhc.d;
                    if (booleanValue) {
                    }
                    g06Var.N(yhc.DEBUG, "Failed to fetch document", d222, c5bVar222, vhcVar.a, vhcVar.b, vhcVar.c);
                    g06Var2 = g06Var;
                    k4a k4aVar222 = new k4a(kahVar222);
                    g06Var2.r();
                    return k4aVar222;
                }
                l4a l4aVar2 = (l4a) obj;
                r0oVar2 = r0oVar3;
                t5aVar4 = t5aVar3;
                apoVar3 = apoVar2;
                arrayList3 = arrayList2;
                z3 = z2;
            } catch (kah e6) {
                e = e6;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
            g06Var2 = g06Var;
        }
        f6aVar = new f6a(this, cg6Var);
        Object obj2 = f6aVar.p;
        nm6 nm6Var2 = nm6.a;
        i = f6aVar.r;
        g06Var = this.d;
    }
}
