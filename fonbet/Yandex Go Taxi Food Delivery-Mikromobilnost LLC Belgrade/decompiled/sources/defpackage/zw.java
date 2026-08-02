package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class zw extends u5e0 {
    public final ax d;
    public final seu e;
    public final zjr f;

    public zw(cy cyVar, ax axVar, seu seuVar) {
        super(cyVar);
        this.d = axVar;
        this.e = seuVar;
        this.f = new zjr(xfz.b(zw.class.getSimpleName()));
    }

    @Override // defpackage.u5e0
    public final Object b(sbx sbxVar, String str, c cVar) {
        StackTraceElement stackTraceElement;
        String str2;
        String str3;
        w1m w1mVar = (w1m) bvf0.A(sbxVar).c(qoi0.a(w1m.class));
        u1m u1mVar = w1mVar != null ? w1mVar.a : null;
        e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        String str4 = e7j0Var != null ? e7j0Var.a : null;
        nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
        zjr zjrVar = this.f;
        if (nezVar != null && (str3 = nezVar.a) != null) {
            zjrVar.f(str3);
        }
        this.d.j(new iw(u1mVar, str4, str));
        hns0 hns0Var = (hns0) bvf0.A(sbxVar).c(qoi0.a(hns0.class));
        if (hns0Var != null) {
            hns0.b(hns0Var, oyr.p("Failed to parse action. Type ", str, " is not supported."), str, null, 24);
        }
        if (this.e != null) {
            ErrorTypes.UNSUPPORTED_ACTION.getClass();
            gw00.e(new Pair("type", str));
        }
        String type = ErrorTypes.UNSUPPORTED_ACTION.getType();
        i3y a = xfz.a(new Pair("locator", "ActionParser.parse"), new Pair("actionType", str));
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
        zjrVar.d(FlexLogLevel.WARNING, "Action is unsupported", xfz.c(a, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        return new uug(str, oyr.p("Не удалось распарсить действие типа '", str, "': тип действия не поддержан в приложении"), sbxVar.c(cVar, c.Companion.serializer()));
    }

    @Override // defpackage.u5e0
    public final Object c(sbx sbxVar, b bVar, Throwable th) {
        StackTraceElement stackTraceElement;
        String str;
        b bVar2;
        String str2;
        w1m w1mVar = (w1m) bvf0.A(sbxVar).c(qoi0.a(w1m.class));
        u1m u1mVar = w1mVar != null ? w1mVar.a : null;
        e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        String str3 = e7j0Var != null ? e7j0Var.a : null;
        nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
        zjr zjrVar = this.f;
        if (nezVar != null && (str2 = nezVar.a) != null) {
            zjrVar.f(str2);
        }
        String a = (!(bVar instanceof c) || (bVar2 = (b) ((c) bVar).get("type")) == null) ? null : qcx.n(bVar2).a();
        this.d.j(new hw(u1mVar, str3, a, th));
        hns0 hns0Var = (hns0) bvf0.A(sbxVar).c(qoi0.a(hns0.class));
        if (hns0Var != null) {
            String message = th.getMessage();
            if (message == null) {
                message = oyr.p("Failed to parse action (type = '", a, "').");
            }
            hns0.a(hns0Var, message, a, th);
        }
        if (this.e != null) {
            ErrorTypes.CORRUPTED_ACTION.getClass();
            gw00.e(new Pair("type", a == null ? "" : a));
        }
        String type = ErrorTypes.CORRUPTED_ACTION.getType();
        i3y a2 = xfz.a(new Pair("locator", "ActionParser.parse"), new Pair("cause", th), xfz.d(a, "actionType"), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, oyr.p("Action corrupted: failed to parse action (", th.getMessage(), Extension.C_BRAKE)));
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
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.ERROR, "Action is corrupted", xfz.c(a2, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        String a3 = k791.a(th);
        if (a3 == null) {
            a3 = "неизвестная ошибка";
        }
        return new uug(a, unr0.p("Произошла ошибка во время парсинга действия типа '", a, "' (", a3, Extension.C_BRAKE), sbxVar.c(bVar, b.Companion.serializer()));
    }
}
