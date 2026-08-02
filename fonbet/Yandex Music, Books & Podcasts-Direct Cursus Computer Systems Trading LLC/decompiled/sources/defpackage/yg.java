package defpackage;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.bdui.flex.factory.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class yg implements tqg {
    public final h a;
    public final le3 b;
    public final a c;
    public final e d;
    public final g06 e = new g06(fsg.b(yg.class.getSimpleName()));

    public yg(h hVar, le3 le3Var, a aVar, e eVar) {
        this.a = hVar;
        this.b = le3Var;
        this.c = aVar;
        this.d = eVar;
    }

    public static final lah b(yg ygVar, pg pgVar, Map map, q5f q5fVar) {
        String str;
        String str2 = pgVar.a;
        Map map2 = pgVar.b;
        Map n = dfi.n("Compat-Vector", "VQ+y6l");
        Map map3 = pgVar.c;
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
        return new lah(str2, n, map2, str);
    }

    public static final void c(yg ygVar, oun ounVar, pg pgVar, Map map, xgb xgbVar) {
        ygVar.getClass();
        if (ounVar instanceof s3o) {
            ygVar.e(ounVar, pgVar, map, xgbVar, ((s3o) ounVar).a);
            return;
        }
        if (!(ounVar instanceof t7c)) {
            b6e.s();
            return;
        }
        md mdVar = ((t7c) ounVar).a;
        if (mdVar != null && mdVar.getClass() == ke7.class) {
            ygVar.e(ounVar, pgVar, map, xgbVar, null);
            return;
        }
        try {
            r7o r7oVar = z7o.b;
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.e;
    }

    public final void d(mah mahVar) {
        pz0 pz0Var = new pz0(5);
        pz0Var.b(fsg.d(mahVar.c, "responseCode"));
        pz0Var.b(fsg.d(mahVar.d, "responseMessage"));
        pz0Var.b(fsg.d(mahVar.e, "requestId"));
        pz0Var.b(new Pair("path", mahVar.a.a));
        Map map = mahVar.k;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        pz0Var.c(arrayList.toArray(new Pair[0]));
        ArrayList arrayList2 = pz0Var.a;
        Pair[] pairArr = (Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]);
        String str = (String) this.e.d;
        if (str != null) {
            fsg.a.put(new aic(str), fsg.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089 A[LOOP:0: B:14:0x0083->B:16:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[LOOP:1: B:19:0x00bb->B:21:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(oun ounVar, pg pgVar, Map map, xgb xgbVar, Throwable th) {
        String str;
        String str2;
        xgb xgbVar2;
        int ordinal;
        String message;
        String str3;
        Map map2;
        String str4;
        boolean booleanValue;
        vhc vhcVar;
        StackTraceElement stackTraceElement;
        String fileName;
        Integer valueOf;
        int ordinal2 = xgbVar.ordinal();
        String str5 = "Inappropriate error in ActionService";
        if (ordinal2 == 20) {
            str = "Failed to fetch remote action";
        } else {
            if (ordinal2 != 21) {
                xgbVar2 = xgbVar;
                str2 = "Inappropriate error in ActionService";
                String str6 = xgbVar2.a;
                pz0 pz0Var = new pz0(5);
                pz0Var.b(new Pair("locator", "DefaultActionExecutor.performActionRequest"));
                pz0Var.b(fsg.d(th, "cause"));
                ordinal = xgbVar2.ordinal();
                if (ordinal == 20) {
                    if (ordinal == 21) {
                        message = th != null ? th.getMessage() : null;
                        str3 = "Action service error: failed to parse action (";
                    }
                    pz0Var.b(new Pair(DeviceService.KEY_DESC, str5));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ((w4f) entry.getValue()).toString());
                    }
                    pz0Var.c(x97.G(linkedHashMap));
                    Map map3 = pgVar.b;
                    ArrayList arrayList = new ArrayList(map3.size());
                    for (Map.Entry entry2 : map3.entrySet()) {
                        arrayList.add(((String) entry2.getKey()) + ": " + CollectionsKt.X((List) entry2.getValue(), ", ", null, null, null, 62));
                    }
                    Pair pair = new Pair("query", CollectionsKt.X(arrayList, StringUtil.LF, null, null, null, 62));
                    map2 = pgVar.c;
                    if (map2 != null) {
                        ArrayList arrayList2 = new ArrayList(map2.size());
                        for (Map.Entry entry3 : map2.entrySet()) {
                            arrayList2.add(((String) entry3.getKey()) + ": " + entry3.getValue());
                        }
                        str4 = CollectionsKt.X(arrayList2, StringUtil.LF, null, null, null, 62);
                    } else {
                        str4 = "";
                    }
                    pz0Var.c(x97.G(uah.e(pair, new Pair("body", str4), new Pair("URLPath", pgVar.a))));
                    ArrayList arrayList3 = pz0Var.a;
                    jyr a = fsg.a((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                    c5b c5bVar = c5b.a;
                    g06 g06Var = this.e;
                    htb htbVar = ((thc) g06Var.c).a;
                    booleanValue = Boolean.FALSE.booleanValue();
                    vhcVar = vhc.d;
                    if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
                        fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                        if (valueOf != null || (r3 = valueOf.toString()) == null) {
                            String str7 = "No line info";
                        }
                        vhcVar = new vhc(fileName, methodName, str7);
                    }
                    g06Var.N(yhc.ERROR, str2, fsg.c(a, fsg.a(new Pair("errorType", str6))), c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
                }
                message = th != null ? th.getMessage() : null;
                str3 = "Action service error: failed to fetch action (";
                str5 = hrg.q(str3, message, ")");
                pz0Var.b(new Pair(DeviceService.KEY_DESC, str5));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map.size()));
                while (r2.hasNext()) {
                }
                pz0Var.c(x97.G(linkedHashMap2));
                Map map32 = pgVar.b;
                ArrayList arrayList4 = new ArrayList(map32.size());
                while (r1.hasNext()) {
                }
                Pair pair2 = new Pair("query", CollectionsKt.X(arrayList4, StringUtil.LF, null, null, null, 62));
                map2 = pgVar.c;
                if (map2 != null) {
                }
                pz0Var.c(x97.G(uah.e(pair2, new Pair("body", str4), new Pair("URLPath", pgVar.a))));
                ArrayList arrayList32 = pz0Var.a;
                jyr a2 = fsg.a((Pair[]) arrayList32.toArray(new Pair[arrayList32.size()]));
                c5b c5bVar2 = c5b.a;
                g06 g06Var2 = this.e;
                htb htbVar2 = ((thc) g06Var2.c).a;
                booleanValue = Boolean.FALSE.booleanValue();
                vhcVar = vhc.d;
                if (booleanValue) {
                    fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                    }
                    String methodName2 = stackTraceElement.getMethodName();
                    int lineNumber2 = stackTraceElement.getLineNumber();
                    if (lineNumber2 > 0) {
                    }
                    if (valueOf != null) {
                    }
                    String str72 = "No line info";
                    vhcVar = new vhc(fileName, methodName2, str72);
                }
                g06Var2.N(yhc.ERROR, str2, fsg.c(a2, fsg.a(new Pair("errorType", str6))), c5bVar2, vhcVar.a, vhcVar.b, vhcVar.c);
            }
            str = "Failed to parse remote action";
        }
        str2 = str;
        xgbVar2 = xgbVar;
        String str62 = xgbVar2.a;
        pz0 pz0Var2 = new pz0(5);
        pz0Var2.b(new Pair("locator", "DefaultActionExecutor.performActionRequest"));
        pz0Var2.b(fsg.d(th, "cause"));
        ordinal = xgbVar2.ordinal();
        if (ordinal == 20) {
        }
        str5 = hrg.q(str3, message, ")");
        pz0Var2.b(new Pair(DeviceService.KEY_DESC, str5));
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(tah.a(map.size()));
        while (r2.hasNext()) {
        }
        pz0Var2.c(x97.G(linkedHashMap22));
        Map map322 = pgVar.b;
        ArrayList arrayList42 = new ArrayList(map322.size());
        while (r1.hasNext()) {
        }
        Pair pair22 = new Pair("query", CollectionsKt.X(arrayList42, StringUtil.LF, null, null, null, 62));
        map2 = pgVar.c;
        if (map2 != null) {
        }
        pz0Var2.c(x97.G(uah.e(pair22, new Pair("body", str4), new Pair("URLPath", pgVar.a))));
        ArrayList arrayList322 = pz0Var2.a;
        jyr a22 = fsg.a((Pair[]) arrayList322.toArray(new Pair[arrayList322.size()]));
        c5b c5bVar22 = c5b.a;
        g06 g06Var22 = this.e;
        htb htbVar22 = ((thc) g06Var22.c).a;
        booleanValue = Boolean.FALSE.booleanValue();
        vhcVar = vhc.d;
        if (booleanValue) {
        }
        g06Var22.N(yhc.ERROR, str2, fsg.c(a22, fsg.a(new Pair("errorType", str62))), c5bVar22, vhcVar.a, vhcVar.b, vhcVar.c);
    }
}
