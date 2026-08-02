package flex.actions.templated;

import defpackage.bvf0;
import defpackage.c2r0;
import defpackage.cgy0;
import defpackage.d0m;
import defpackage.dai0;
import defpackage.dez;
import defpackage.dgy0;
import defpackage.dw;
import defpackage.ewl;
import defpackage.gtq0;
import defpackage.gw00;
import defpackage.h5z0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.ly;
import defpackage.my;
import defpackage.n6u;
import defpackage.px;
import defpackage.pxl;
import defpackage.qcx;
import defpackage.qoi0;
import defpackage.qx;
import defpackage.s7s0;
import defpackage.sbx;
import defpackage.seu;
import defpackage.tjr;
import defpackage.u2l;
import defpackage.unr0;
import defpackage.xfz;
import defpackage.xtl;
import defpackage.zjr;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.json.c;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes4.dex */
public final class a implements dw, dez {
    public final qx a;
    public final seu b;
    public final zjr c = new zjr(xfz.b(a.class.getSimpleName()));
    public final ly w = new ly();

    public a(d0m d0mVar, seu seuVar) {
        this.a = new qx(d0mVar);
        this.b = seuVar;
    }

    public static /* synthetic */ void c(a aVar, String str, Map map, int i) {
        if ((i & 2) != 0) {
            map = b.f();
        }
        aVar.b(str, null, map);
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.c;
    }

    public final void b(String str, Throwable th, Map map) {
        StackTraceElement stackTraceElement;
        String str2;
        if (this.b != null) {
            ErrorTypes.TEMPLATED_ACTION_EXECUTION_FAILED.getClass();
        }
        String type = ErrorTypes.TEMPLATED_ACTION_EXECUTION_FAILED.getType();
        c2r0 c2r0Var = new c2r0(4, 1);
        c2r0Var.a(new Pair("locator", "TemplatedActionHandler.handle"));
        c2r0Var.a(xfz.d(th, "cause"));
        c2r0Var.b(dai0.J(map));
        c2r0Var.a(xfz.d(th != null ? th.getMessage() : null, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION));
        ArrayList arrayList = c2r0Var.b;
        i3y a = xfz.a((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
        zjr zjrVar = this.c;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str2);
        }
        tjr tjrVar2 = tjrVar;
        zjrVar.d(FlexLogLevel.ERROR, str, xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        Object obj;
        Object failure;
        cgy0 cgy0Var = (cgy0) krVar;
        pxl pxlVar = n6uVar.b;
        my myVar = (my) pxlVar.a.b(qoi0.a(my.class));
        if (myVar == null) {
            myVar = my.b;
            c(this, "No templates found", null, 6);
        }
        ewl ewlVar = (ewl) pxlVar.a.b(qoi0.a(ewl.class));
        Map map = ewlVar != null ? ewlVar.a : null;
        if (map == null) {
            map = b.f();
        }
        Map map2 = map;
        Map map3 = myVar.a;
        String str = cgy0Var.a;
        Map map4 = cgy0Var.b;
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) map3.get(str);
        if (bVar == null) {
            Pair pair = new Pair("templateId", str);
            Map map5 = myVar.a;
            ArrayList arrayList = new ArrayList(map5.size());
            Iterator it = map5.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getKey());
            }
            c(this, "Failed to find action template", b.i(pair, new Pair("knownTemplates", kotlin.collections.a.X(arrayList, ";", null, null, null, 62))), 4);
            return;
        }
        TemplatedActionHandler$handle$resolvedTemplate$1 templatedActionHandler$handle$resolvedTemplate$1 = new TemplatedActionHandler$handle$resolvedTemplate$1(2, this, a.class, "reportError", "reportError(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;)V", 0);
        ly lyVar = this.w;
        lyVar.getClass();
        try {
            kotlinx.serialization.json.b a = lyVar.a(bVar, map4);
            Object m = a != null ? qcx.m(a) : null;
            if (m != null) {
                obj = m;
            } else {
                dgy0.a.getClass();
                templatedActionHandler$handle$resolvedTemplate$1.invoke("Failed to enrich template", b.i(new Pair(dgy0.c, str), new Pair("action.params", map4.toString())));
                obj = bVar;
            }
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        Throwable a2 = Result.a(obj);
        if (a2 != null) {
            b("Failed to encode enriched action", a2, gw00.e(new Pair("templateId", str)));
            return;
        }
        c cVar = (kotlinx.serialization.json.b) obj;
        sbx sbxVar = (sbx) this.a.b.getValue();
        u2l u2lVar = new u2l(new px(0, h5z0.a));
        u2lVar.w.c(map2);
        bvf0.A(sbxVar).e(new xtl(u2lVar));
        try {
            failure = (kr) sbxVar.a(gtq0.B(sbxVar.b, qoi0.a(kr.class)), cVar);
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        Throwable a3 = Result.a(failure);
        if (a3 == null) {
            n6uVar.c.b((kr) failure, pxlVar, n6uVar.e);
        } else {
            b("Failed to decode action template", a3, gw00.e(new Pair("templateId", str)));
        }
    }
}
