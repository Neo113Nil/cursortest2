package jason.statham.interpreter.error;

import defpackage.cvu0;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.hif;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes4.dex */
public abstract class a {
    public static final Throwable a(String str) {
        return new ArgumentError("Argument error: ".concat(str));
    }

    public static final Throwable b() {
        return new AssertionError("Assertion error: ".concat("Condition failed"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public static final Throwable c(Throwable th, hif hifVar) {
        String message = th.getMessage();
        if (message == null) {
            message = "<empty error message>";
        }
        int i = hifVar.c;
        char[] cArr = (char[]) hifVar.d;
        int i2 = i + 1;
        if (i2 < 0) {
            w511.f(oyr.j(i2, "Requested element count ", " is less than zero."));
            return null;
        }
        ?? r6 = EmptyList.a;
        if (i2 != 0) {
            if (i2 >= cArr.length) {
                int length = cArr.length;
                if (length != 0) {
                    if (length != 1) {
                        r6 = new ArrayList(cArr.length);
                        for (char c : cArr) {
                            r6.add(Character.valueOf(c));
                        }
                    } else {
                        r6 = Collections.singletonList(Character.valueOf(cArr[0]));
                    }
                }
            } else if (i2 == 1) {
                r6 = Collections.singletonList(Character.valueOf(cArr[0]));
            } else {
                r6 = new ArrayList(i2);
                int i3 = 0;
                for (char c2 : cArr) {
                    r6.add(Character.valueOf(c2));
                    i3++;
                    if (i3 == i2) {
                        break;
                    }
                }
            }
        }
        String str = new String(kotlin.collections.a.E0((Collection) r6));
        int G = evu0.G(gvu0.z0(str).toString(), '\n', 0, 6);
        Integer valueOf = G != -1 ? Integer.valueOf(G) : null;
        return new EvaluateError(message + '\n' + str + '\n' + cvu0.u(Integer.max((valueOf != null ? valueOf.intValue() : str.length()) - 1, 0), " ") + '^', th);
    }

    public static final Throwable d(Object obj) {
        return new SyntaxError(qv10.p("Access to dictionary by key ", " is not defined", obj));
    }

    public static final Throwable e(char c, int i) {
        return new SyntaxError("Missing character '" + c + "' at position " + i);
    }

    public static final Throwable f(String str) {
        return new ParsingError("Parsing error: ".concat(str));
    }

    public static final Throwable g(String str) {
        return new ScenarioError("Scenario error: ".concat(str));
    }

    public static final Throwable h() {
        return new SyntaxError("Expected underscore or latin letter");
    }

    public static final Throwable i(String str) {
        return new SyntaxError(str);
    }

    public static final Throwable j(String str) {
        return new TimeoutError("Timeout error: ".concat(str));
    }

    public static final Throwable k(String str) {
        return new SyntaxError(oyr.p("Function '", str, "' is not defined"));
    }

    public static final Throwable l(String str) {
        return new SyntaxError(oyr.p("Variable '", str, "' is not defined"));
    }

    public static final Throwable m(char c, int i, Character ch) {
        String str;
        if (ch != null) {
            str = " (expected '" + ch + "')";
        } else {
            str = "";
        }
        return new SyntaxError("Unexpected character '" + c + "' at position " + i + str);
    }

    public static final Throwable n(String str) {
        return new SyntaxError(unr0.l(OpenList.CHAR_QUOTE, "Unused symbol \"", str));
    }
}
