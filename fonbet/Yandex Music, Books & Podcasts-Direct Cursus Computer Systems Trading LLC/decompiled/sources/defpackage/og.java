package defpackage;

import com.connectsdk.service.DeviceService;
import com.yandex.plus.bdui.flex.factory.e;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class og extends jgm {
    public final e d;
    public final g06 e;

    public og(xiu xiuVar, e eVar) {
        super(xiuVar);
        this.d = eVar;
        this.e = new g06(fsg.b(og.class.getSimpleName()));
    }

    @Override // defpackage.jgm
    public final Object l(String str, x3f x3fVar, q5f q5fVar) {
        StackTraceElement stackTraceElement;
        String str2;
        String str3;
        u5a u5aVar = (u5a) w1g.w(x3fVar).g(ern.a(u5a.class));
        t5a t5aVar = u5aVar != null ? u5aVar.a : null;
        y0o y0oVar = (y0o) w1g.w(x3fVar).g(ern.a(y0o.class));
        String str4 = y0oVar != null ? y0oVar.a : null;
        grg grgVar = (grg) w1g.w(x3fVar).g(ern.a(grg.class));
        g06 g06Var = this.e;
        if (grgVar != null && (str3 = grgVar.a) != null) {
            g06Var.W(str3);
        }
        this.d.c(new hf(t5aVar, str4, str));
        mrq mrqVar = (mrq) w1g.w(x3fVar).g(ern.a(mrq.class));
        if (mrqVar != null) {
            mrq.b(mrqVar, "Failed to parse action. Type " + str + " is not supported.", str);
        }
        xgb xgbVar = xgb.ACTION_SERVICE_REQUEST_ERROR;
        jyr a = fsg.a(new Pair("locator", "ActionParser.parse"), new Pair("actionType", str));
        c5b c5bVar = c5b.a;
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
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            vhcVar = new vhc(fileName, methodName, str2);
        }
        g06Var.N(yhc.WARNING, "Action is unsupported", fsg.c(a, fsg.a(new Pair("errorType", "Action.Decoding.Unsupported"))), c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
        return new ke7(str, hrg.q("Не удалось распарсить действие типа '", str, "': тип действия не поддержан в приложении"), x3fVar.c(q5f.Companion.serializer(), q5fVar));
    }

    @Override // defpackage.jgm
    public final Object m(x3f x3fVar, w4f w4fVar, Throwable th) {
        StackTraceElement stackTraceElement;
        String str;
        w4f w4fVar2;
        String str2;
        u5a u5aVar = (u5a) w1g.w(x3fVar).g(ern.a(u5a.class));
        t5a t5aVar = u5aVar != null ? u5aVar.a : null;
        y0o y0oVar = (y0o) w1g.w(x3fVar).g(ern.a(y0o.class));
        String str3 = y0oVar != null ? y0oVar.a : null;
        grg grgVar = (grg) w1g.w(x3fVar).g(ern.a(grg.class));
        g06 g06Var = this.e;
        if (grgVar != null && (str2 = grgVar.a) != null) {
            g06Var.W(str2);
        }
        String a = (!(w4fVar instanceof q5f) || (w4fVar2 = (w4f) ((q5f) w4fVar).get("type")) == null) ? null : x4f.g(w4fVar2).a();
        this.d.c(new gf(t5aVar, str3, a, th));
        mrq mrqVar = (mrq) w1g.w(x3fVar).g(ern.a(mrq.class));
        if (mrqVar != null) {
            String message = th.getMessage();
            if (message == null) {
                message = hrg.q("Failed to parse action (type = '", a, "').");
            }
            mrq.a(mrqVar, message, a, th);
        }
        xgb xgbVar = xgb.ACTION_SERVICE_REQUEST_ERROR;
        jyr a2 = fsg.a(new Pair("locator", "ActionParser.parse"), new Pair("cause", th), fsg.d(a, "actionType"), new Pair(DeviceService.KEY_DESC, hrg.q("Action corrupted: failed to parse action (", th.getMessage(), ")")));
        c5b c5bVar = c5b.a;
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
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            vhcVar = new vhc(fileName, methodName, str);
        }
        g06Var.N(yhc.ERROR, "Action is corrupted", fsg.c(a2, fsg.a(new Pair("errorType", "Action.Decoding.Corrupted"))), c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
        String E = o2g.E(th);
        if (E == null) {
            E = "неизвестная ошибка";
        }
        return new ke7(a, hrg.s("Произошла ошибка во время парсинга действия типа '", a, "' (", E, ")"), x3fVar.c(w4f.Companion.serializer(), w4fVar));
    }
}
