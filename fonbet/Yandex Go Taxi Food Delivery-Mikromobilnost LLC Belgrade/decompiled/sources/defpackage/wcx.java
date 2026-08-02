package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.Expression;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wcx {
    public static final kbs a = new kbs(17);

    public static exq a(d290 d290Var, JSONObject jSONObject, String str, boolean z, exq exqVar) {
        return b(d290Var, jSONObject, str, z, exqVar, q5z.c, q5z.b);
    }

    public static exq b(d290 d290Var, JSONObject jSONObject, String str, boolean z, exq exqVar, tls tlsVar, r131 r131Var) {
        try {
            return new cxq(z, wwg.H(jSONObject, str, tlsVar, r131Var));
        } catch (ParsingException e) {
            if (e.getReason() != ParsingExceptionReason.MISSING_VALUE) {
                throw e;
            }
            exq o = o(z, n(d290Var, jSONObject, str), exqVar);
            if (o != null) {
                return o;
            }
            throw e;
        }
    }

    public static exq c(d290 d290Var, JSONObject jSONObject, String str, boolean z, exq exqVar, i3y i3yVar) {
        try {
            return new cxq(z, wwg.E(d290Var, jSONObject, str, i3yVar));
        } catch (ParsingException e) {
            if (e.getReason() != ParsingExceptionReason.MISSING_VALUE) {
                throw e;
            }
            exq o = o(z, n(d290Var, jSONObject, str), exqVar);
            if (o != null) {
                return o;
            }
            throw e;
        }
    }

    public static exq d(d290 d290Var, JSONObject jSONObject, String str, vm11 vm11Var, boolean z, exq exqVar) {
        return e(d290Var, jSONObject, str, vm11Var, z, exqVar, q5z.c, q5z.b);
    }

    public static exq e(d290 d290Var, JSONObject jSONObject, String str, vm11 vm11Var, boolean z, exq exqVar, tls tlsVar, r131 r131Var) {
        try {
            return new cxq(z, a.b(d290Var, jSONObject, str, vm11Var, tlsVar, r131Var));
        } catch (ParsingException e) {
            if (e.getReason() != ParsingExceptionReason.MISSING_VALUE) {
                throw e;
            }
            exq o = o(z, n(d290Var, jSONObject, str), exqVar);
            if (o != null) {
                return o;
            }
            throw e;
        }
    }

    public static exq f(d290 d290Var, JSONObject jSONObject, String str, boolean z, exq exqVar, i3y i3yVar, sty styVar) {
        try {
            return new cxq(z, wwg.J(d290Var, jSONObject, str, i3yVar, styVar));
        } catch (ParsingException e) {
            if (e.getReason() != ParsingExceptionReason.MISSING_VALUE) {
                throw e;
            }
            exq o = o(z, n(d290Var, jSONObject, str), exqVar);
            if (o != null) {
                return o;
            }
            throw e;
        }
    }

    public static exq g(d290 d290Var, JSONObject jSONObject, vm11 vm11Var, boolean z, exq exqVar, sty styVar) {
        pvo f = a.f(d290Var, jSONObject, "colors", vm11Var, styVar);
        if (f != null) {
            return new cxq(z, f);
        }
        String n = n(d290Var, jSONObject, "colors");
        return n != null ? new bxq(z, n) : exqVar != null ? zla1.h(exqVar, z) : z ? axq.d : axq.c;
    }

    public static exq h(d290 d290Var, JSONObject jSONObject, String str, boolean z, exq exqVar, tls tlsVar) {
        Object L = wwg.L(d290Var, jSONObject, str, tlsVar);
        if (L != null) {
            return new cxq(z, L);
        }
        String n = n(d290Var, jSONObject, str);
        return n != null ? new bxq(z, n) : exqVar != null ? zla1.h(exqVar, z) : z ? axq.d : axq.c;
    }

    public static exq i(d290 d290Var, JSONObject jSONObject, String str, boolean z, exq exqVar, i3y i3yVar) {
        Object M = wwg.M(d290Var, jSONObject, str, i3yVar);
        if (M != null) {
            return new cxq(z, M);
        }
        String n = n(d290Var, jSONObject, str);
        return n != null ? new bxq(z, n) : exqVar != null ? zla1.h(exqVar, z) : z ? axq.d : axq.c;
    }

    public static exq j(d290 d290Var, JSONObject jSONObject, String str, vm11 vm11Var, boolean z, exq exqVar, tls tlsVar, r131 r131Var) {
        Expression e = a.e(d290Var, jSONObject, str, vm11Var, tlsVar, r131Var, null);
        if (e != null) {
            return new cxq(z, e);
        }
        String n = n(d290Var, jSONObject, str);
        return n != null ? new bxq(z, n) : exqVar != null ? zla1.h(exqVar, z) : z ? axq.d : axq.c;
    }

    public static exq k(d290 d290Var, JSONObject jSONObject, String str, boolean z, exq exqVar, i3y i3yVar) {
        List O = wwg.O(d290Var, jSONObject, str, i3yVar);
        if (O != null) {
            return new cxq(z, O);
        }
        String n = n(d290Var, jSONObject, str);
        return n != null ? new bxq(z, n) : exqVar != null ? zla1.h(exqVar, z) : z ? axq.d : axq.c;
    }

    public static exq l(d290 d290Var, JSONObject jSONObject, boolean z, exq exqVar, tls tlsVar, sty styVar) {
        List Q = wwg.Q(d290Var, jSONObject, "transition_triggers", tlsVar, styVar);
        if (Q != null) {
            return new cxq(z, Q);
        }
        String n = n(d290Var, jSONObject, "transition_triggers");
        return n != null ? new bxq(z, n) : exqVar != null ? zla1.h(exqVar, z) : z ? axq.d : axq.c;
    }

    public static exq m(d290 d290Var, JSONObject jSONObject, boolean z, exq exqVar, i3y i3yVar, sty styVar) {
        List P = wwg.P(d290Var, jSONObject, "color_map", i3yVar, styVar);
        if (P != null) {
            return new cxq(z, P);
        }
        String n = n(d290Var, jSONObject, "color_map");
        return n != null ? new bxq(z, n) : exqVar != null ? zla1.h(exqVar, z) : z ? axq.d : axq.c;
    }

    public static String n(yf90 yf90Var, JSONObject jSONObject, String str) {
        return (String) wwg.N(yf90Var, jSONObject, g8e.o("$", str), a);
    }

    public static exq o(boolean z, String str, exq exqVar) {
        if (str != null) {
            return new bxq(z, str);
        }
        if (exqVar != null) {
            return zla1.h(exqVar, z);
        }
        if (z) {
            return z ? axq.d : axq.c;
        }
        return null;
    }

    public static void p(exq exqVar, tls tlsVar, yf90 yf90Var, String str, JSONObject jSONObject) {
        if (exqVar instanceof cxq) {
            a.h(yf90Var, jSONObject, str, (Expression) ((cxq) exqVar).c, tlsVar);
        } else if (exqVar instanceof bxq) {
            wwg.Z(yf90Var, jSONObject, "$".concat(str), ((bxq) exqVar).c);
        }
    }

    public static void q(yf90 yf90Var, JSONObject jSONObject, String str, exq exqVar) {
        p(exqVar, q5z.c, yf90Var, str, jSONObject);
    }

    public static void r(yf90 yf90Var, JSONObject jSONObject, exq exqVar) {
        if (exqVar instanceof cxq) {
            a.i(yf90Var, jSONObject, (pvo) ((cxq) exqVar).c);
        } else if (exqVar instanceof bxq) {
            wwg.Z(yf90Var, jSONObject, "$colors", ((bxq) exqVar).c);
        }
    }

    public static void s(exq exqVar, tls tlsVar, yf90 yf90Var, String str, JSONObject jSONObject) {
        if (exqVar instanceof cxq) {
            wwg.a0(yf90Var, jSONObject, str, ((cxq) exqVar).c, tlsVar);
        } else if (exqVar instanceof bxq) {
            wwg.Z(yf90Var, jSONObject, "$".concat(str), ((bxq) exqVar).c);
        }
    }

    public static void t(yf90 yf90Var, JSONObject jSONObject, String str, exq exqVar) {
        s(exqVar, q5z.c, yf90Var, str, jSONObject);
    }

    public static void u(yf90 yf90Var, JSONObject jSONObject, String str, exq exqVar, i3y i3yVar) {
        if (exqVar instanceof cxq) {
            wwg.b0(yf90Var, jSONObject, str, ((cxq) exqVar).c, i3yVar);
        } else if (exqVar instanceof bxq) {
            wwg.Z(yf90Var, jSONObject, "$".concat(str), ((bxq) exqVar).c);
        }
    }

    public static void v(yf90 yf90Var, JSONObject jSONObject, exq exqVar, tls tlsVar) {
        if (exqVar instanceof cxq) {
            wwg.d0(yf90Var, jSONObject, (List) ((cxq) exqVar).c, tlsVar);
        } else if (exqVar instanceof bxq) {
            wwg.Z(yf90Var, jSONObject, "$transition_triggers", ((bxq) exqVar).c);
        }
    }

    public static void w(yf90 yf90Var, JSONObject jSONObject, String str, exq exqVar, i3y i3yVar) {
        if (exqVar instanceof cxq) {
            wwg.c0(yf90Var, jSONObject, str, (List) ((cxq) exqVar).c, i3yVar);
        } else if (exqVar instanceof bxq) {
            wwg.Z(yf90Var, jSONObject, "$".concat(str), ((bxq) exqVar).c);
        }
    }
}
