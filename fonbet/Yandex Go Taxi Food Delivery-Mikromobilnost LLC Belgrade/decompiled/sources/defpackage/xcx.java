package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xcx {
    public static Object a(exq exqVar, JSONObject jSONObject, String str, tls tlsVar, r131 r131Var) {
        if (exqVar.b && jSONObject.has(str)) {
            return wwg.H(jSONObject, str, tlsVar, r131Var);
        }
        int i = exqVar.a;
        if (i == 2) {
            return ((cxq) exqVar).c;
        }
        if (i == 3) {
            return wwg.H(jSONObject, ((bxq) exqVar).c, tlsVar, r131Var);
        }
        throw fg90.h(str, jSONObject);
    }

    public static Object b(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, i3y i3yVar, i3y i3yVar2) {
        if (exqVar.b && jSONObject.has(str)) {
            return wwg.E(yf90Var, jSONObject, str, i3yVar2);
        }
        int i = exqVar.a;
        if (i != 2) {
            if (i == 3) {
                return wwg.E(yf90Var, jSONObject, ((bxq) exqVar).c, i3yVar2);
            }
            throw fg90.h(str, jSONObject);
        }
        try {
            return ((qfy0) i3yVar.getValue()).a(yf90Var, (hex) ((cxq) exqVar).c, jSONObject);
        } catch (ParsingException e) {
            throw fg90.b(jSONObject, str, e);
        }
    }

    public static Expression c(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, vm11 vm11Var) {
        if (exqVar.b && jSONObject.has(str)) {
            return a.b(yf90Var, jSONObject, str, vm11Var, q5z.c, q5z.b);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.a(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var);
        }
        throw fg90.h(str, jSONObject);
    }

    public static Expression d(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar) {
        kbs kbsVar = q5z.b;
        if (exqVar.b && jSONObject.has(str)) {
            return a.b(yf90Var, jSONObject, str, vm11Var, tlsVar, kbsVar);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.b(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var, tlsVar, kbsVar);
        }
        throw fg90.h(str, jSONObject);
    }

    public static Expression e(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar, r131 r131Var) {
        if (exqVar.b && jSONObject.has(str)) {
            return a.b(yf90Var, jSONObject, str, vm11Var, tlsVar, r131Var);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.b(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var, tlsVar, r131Var);
        }
        throw fg90.h(str, jSONObject);
    }

    public static Expression f(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, r131 r131Var) {
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        if (exqVar.b && jSONObject.has(str)) {
            return a.b(yf90Var, jSONObject, str, umsVar, abl0Var, r131Var);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.b(yf90Var, jSONObject, ((bxq) exqVar).c, umsVar, abl0Var, r131Var);
        }
        throw fg90.h(str, jSONObject);
    }

    public static List g(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, i3y i3yVar, i3y i3yVar2, sty styVar) {
        if (exqVar.b && jSONObject.has(str)) {
            return wwg.J(yf90Var, jSONObject, str, i3yVar2, styVar);
        }
        int i = exqVar.a;
        if (i != 2) {
            if (i == 3) {
                return wwg.J(yf90Var, jSONObject, ((bxq) exqVar).c, i3yVar2, styVar);
            }
            throw fg90.h(str, jSONObject);
        }
        List list = (List) ((cxq) exqVar).c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        qfy0 qfy0Var = (qfy0) i3yVar.getValue();
        for (int i2 = 0; i2 < size; i2++) {
            Object j = j(yf90Var, (hex) list.get(i2), jSONObject, qfy0Var);
            if (j != null) {
                arrayList.add(j);
            }
        }
        if (styVar.b(arrayList)) {
            return arrayList;
        }
        throw fg90.f(jSONObject, str, arrayList);
    }

    public static Object h(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, i3y i3yVar, i3y i3yVar2) {
        if (exqVar.b && jSONObject.has(str)) {
            return wwg.M(yf90Var, jSONObject, str, i3yVar2);
        }
        int i = exqVar.a;
        if (i == 2) {
            return j(yf90Var, (hex) ((cxq) exqVar).c, jSONObject, (qfy0) i3yVar.getValue());
        }
        if (i == 3) {
            return wwg.M(yf90Var, jSONObject, ((bxq) exqVar).c, i3yVar2);
        }
        return null;
    }

    public static Object i(exq exqVar, tls tlsVar, yf90 yf90Var, String str, JSONObject jSONObject) {
        if (exqVar.b && jSONObject.has(str)) {
            return wwg.L(yf90Var, jSONObject, str, tlsVar);
        }
        int i = exqVar.a;
        if (i == 2) {
            return ((cxq) exqVar).c;
        }
        if (i == 3) {
            return wwg.L(yf90Var, jSONObject, ((bxq) exqVar).c, tlsVar);
        }
        return null;
    }

    public static Object j(yf90 yf90Var, hex hexVar, JSONObject jSONObject, qfy0 qfy0Var) {
        try {
            return qfy0Var.a(yf90Var, hexVar, jSONObject);
        } catch (ParsingException e) {
            yf90Var.a().a(e);
            return null;
        }
    }

    public static Expression k(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, vm11 vm11Var) {
        abl0 abl0Var = q5z.c;
        if (exqVar.b && jSONObject.has(str)) {
            return a.e(yf90Var, jSONObject, str, vm11Var, abl0Var, q5z.b, null);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.d(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var, abl0Var);
        }
        return null;
    }

    public static Expression l(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar) {
        if (exqVar.b && jSONObject.has(str)) {
            return a.e(yf90Var, jSONObject, str, vm11Var, tlsVar, q5z.b, null);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.d(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var, tlsVar);
        }
        return null;
    }

    public static Expression m(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar, r131 r131Var) {
        if (exqVar.b && jSONObject.has(str)) {
            return a.e(yf90Var, jSONObject, str, vm11Var, tlsVar, r131Var, null);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.e(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var, tlsVar, r131Var, null);
        }
        return null;
    }

    public static Expression n(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar, r131 r131Var, Expression expression) {
        if (exqVar.b && jSONObject.has(str)) {
            return a.e(yf90Var, jSONObject, str, vm11Var, tlsVar, r131Var, expression);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.e(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var, tlsVar, r131Var, expression);
        }
        return null;
    }

    public static Expression o(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, vm11 vm11Var, tls tlsVar, Expression expression) {
        kbs kbsVar = q5z.b;
        if (exqVar.b && jSONObject.has(str)) {
            return a.e(yf90Var, jSONObject, str, vm11Var, tlsVar, kbsVar, expression);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (Expression) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.e(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var, tlsVar, kbsVar, expression);
        }
        return null;
    }

    public static pvo p(yf90 yf90Var, exq exqVar, JSONObject jSONObject, vm11 vm11Var, sty styVar) {
        if (exqVar.b && jSONObject.has("colors")) {
            return a.f(yf90Var, jSONObject, "colors", vm11Var, styVar);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (pvo) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return a.f(yf90Var, jSONObject, ((bxq) exqVar).c, vm11Var, styVar);
        }
        return null;
    }

    public static List q(yf90 yf90Var, exq exqVar, JSONObject jSONObject, tls tlsVar, sty styVar) {
        if (exqVar.b && jSONObject.has("transition_triggers")) {
            return wwg.Q(yf90Var, jSONObject, "transition_triggers", tlsVar, styVar);
        }
        int i = exqVar.a;
        if (i == 2) {
            return (List) ((cxq) exqVar).c;
        }
        if (i == 3) {
            return wwg.Q(yf90Var, jSONObject, ((bxq) exqVar).c, tlsVar, styVar);
        }
        return null;
    }

    public static List r(yf90 yf90Var, exq exqVar, JSONObject jSONObject, i3y i3yVar, i3y i3yVar2, sty styVar) {
        if (exqVar.b && jSONObject.has("color_map")) {
            return wwg.P(yf90Var, jSONObject, "color_map", i3yVar2, styVar);
        }
        int i = exqVar.a;
        if (i != 2) {
            if (i == 3) {
                return wwg.P(yf90Var, jSONObject, ((bxq) exqVar).c, i3yVar2, styVar);
            }
            return null;
        }
        List list = (List) ((cxq) exqVar).c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        qfy0 qfy0Var = (qfy0) i3yVar.getValue();
        for (int i2 = 0; i2 < size; i2++) {
            Object j = j(yf90Var, (hex) list.get(i2), jSONObject, qfy0Var);
            if (j != null) {
                arrayList.add(j);
            }
        }
        if (styVar.b(arrayList)) {
            return arrayList;
        }
        yf90Var.a().a(fg90.f(jSONObject, "color_map", arrayList));
        return null;
    }

    public static List s(yf90 yf90Var, exq exqVar, JSONObject jSONObject, String str, i3y i3yVar, i3y i3yVar2) {
        if (exqVar.b && jSONObject.has(str)) {
            return wwg.O(yf90Var, jSONObject, str, i3yVar2);
        }
        int i = exqVar.a;
        if (i != 2) {
            if (i == 3) {
                return wwg.O(yf90Var, jSONObject, ((bxq) exqVar).c, i3yVar2);
            }
            return null;
        }
        List list = (List) ((cxq) exqVar).c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        qfy0 qfy0Var = (qfy0) i3yVar.getValue();
        for (int i2 = 0; i2 < size; i2++) {
            Object j = j(yf90Var, (hex) list.get(i2), jSONObject, qfy0Var);
            if (j != null) {
                arrayList.add(j);
            }
        }
        return arrayList;
    }
}
