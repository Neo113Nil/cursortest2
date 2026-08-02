package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class z2q0 extends u5e0 {
    public final a3q0 d;
    public final uyg e;
    public final seu f;
    public final zjr g;

    public z2q0(t6f0 t6f0Var, a3q0 a3q0Var, uyg uygVar, seu seuVar) {
        super(t6f0Var);
        this.d = a3q0Var;
        this.e = uygVar;
        this.f = seuVar;
        this.g = new zjr(xfz.b(z2q0.class.getSimpleName()));
    }

    public static String d(b bVar) {
        String a;
        if (!(bVar instanceof c)) {
            return null;
        }
        c cVar = (c) bVar;
        b bVar2 = (b) cVar.get("origType");
        if (bVar2 != null && (a = qcx.n(bVar2).a()) != null) {
            return a;
        }
        b bVar3 = (b) cVar.get("type");
        if (bVar3 != null) {
            return qcx.n(bVar3).a();
        }
        return null;
    }

    @Override // defpackage.u5e0, defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        String str;
        u1m u1mVar;
        String uuid = UUID.randomUUID().toString();
        w1m w1mVar = (w1m) bvf0.A(sbxVar).c(qoi0.a(w1m.class));
        if (w1mVar == null || (u1mVar = w1mVar.a) == null || (str = u1mVar.a) == null) {
            str = "api/screen/unknown";
        }
        String d = d(bVar);
        String p = d != null ? g8e.p(d, Extension.DOT_CHAR, str) : null;
        lg90 lg90Var = (lg90) bvf0.A(sbxVar).c(qoi0.a(lg90.class));
        xez0 xez0Var = lg90Var != null ? lg90Var.a : null;
        e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        String str2 = e7j0Var != null ? e7j0Var.a : null;
        uyg uygVar = this.e;
        if (p != null && xez0Var != null) {
            if (uygVar != null) {
                uygVar.logJsonCreationTimings(p, str, xez0Var, kotlin.collections.b.i(new Pair("reqId", str2), new Pair("jsonType", d(bVar))));
            }
            if (uygVar != null) {
                uygVar.startDecodingSection(p, uuid);
            }
        }
        try {
            return (pyp0) super.a(sbxVar, bVar);
        } finally {
            if (p != null) {
                e7j0 e7j0Var2 = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
                r3 = e7j0Var2 != null ? e7j0Var2.a : null;
                if (uygVar != null) {
                    uygVar.endDecodingSection(p, uuid, str, g8e.z("reqId", r3));
                }
            }
        }
    }

    @Override // defpackage.u5e0
    public final Object b(sbx sbxVar, String str, c cVar) {
        StackTraceElement stackTraceElement;
        String str2;
        b bVar;
        String str3;
        w1m w1mVar = (w1m) bvf0.A(sbxVar).c(qoi0.a(w1m.class));
        u1m u1mVar = w1mVar != null ? w1mVar.a : null;
        e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        String str4 = e7j0Var != null ? e7j0Var.a : null;
        nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
        zjr zjrVar = this.g;
        if (nezVar != null && (str3 = nezVar.a) != null) {
            zjrVar.f(str3);
        }
        String a = (cVar == null || (bVar = (b) cVar.get("id")) == null) ? null : qcx.n(bVar).a();
        this.d.c(new j1q0(u1mVar, str4, a, str));
        if (this.f != null) {
            ErrorTypes.UNSUPPORTED_SECTION.getClass();
            kotlin.collections.b.i(new Pair("section_id", a == null ? "" : a), new Pair("type", str));
        }
        String type = ErrorTypes.UNSUPPORTED_SECTION.getType();
        i3y a2 = xfz.a(new Pair("locator", "SectionParser.parse"), xfz.d(a, "section_id"), new Pair("type", str));
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
        zjrVar.d(FlexLogLevel.WARNING, "Section is unsupported", xfz.c(a2, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        hns0 hns0Var = (hns0) bvf0.A(sbxVar).c(qoi0.a(hns0.class));
        if (hns0Var != null) {
            hns0.b(hns0Var, oyr.p("Failed to parse action. Type ", str, " is not supported."), str, a, 16);
        }
        return new pwg(oyr.p("Не удалось распарсить секцию типа '", str, "': тип секции не поддержан в приложении"), sbxVar.c(cVar, c.Companion.serializer()));
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
        zjr zjrVar = this.g;
        if (nezVar != null && (str2 = nezVar.a) != null) {
            zjrVar.f(str2);
        }
        String a = (!(bVar instanceof c) || (bVar2 = (b) ((c) bVar).get("id")) == null) ? null : qcx.n(bVar2).a();
        String d = d(bVar);
        String a2 = k791.a(th);
        if (a2 == null) {
            a2 = "неизвестная ошибка";
        }
        String str4 = a2;
        this.d.c(new i1q0(u1mVar, str3, a, d, th));
        String type = ErrorTypes.CORRUPTED_SECTION.getType();
        i3y a3 = xfz.a(new Pair("locator", "SectionParser.parse"), new Pair("cause", th), xfz.d(a, "section_id"), xfz.d(d, "type"), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, oyr.p("Section corrupted: failed to parse section (", th.getMessage(), Extension.C_BRAKE)));
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
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.ERROR, "Failed to parse section", xfz.c(a3, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        if (this.f != null) {
            kotlin.collections.b.i(new Pair("section_id", a == null ? "" : a), new Pair("type", d != null ? d : ""));
        }
        hns0 hns0Var = (hns0) bvf0.A(sbxVar).c(qoi0.a(hns0.class));
        if (hns0Var != null) {
            String message = th.getMessage();
            if (message == null) {
                message = unr0.p("Failed to parse section (id = '", a, "', type = '", d, "').");
            }
            hns0Var.a.add(new lyg(message, d, a, th));
        }
        return new pwg(unr0.p("Произошла ошибка во время парсинга секции типа '", d, "' (", str4, Extension.C_BRAKE), sbxVar.c(bVar, b.Companion.serializer()));
    }
}
