package jason.statham.utils;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.hif;
import defpackage.qir;
import defpackage.qv10;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public final class a {
    public static final a a = new a();

    public static void a(StringBuilder sb, Object obj) {
        if (obj instanceof Long) {
            sb.append(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            sb.append(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            sb.append(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            sb.append(OpenList.CHAR_QUOTE);
            sb.append((String) obj);
            sb.append(OpenList.CHAR_QUOTE);
            return;
        }
        if (obj instanceof List) {
            sb.append('[');
            if (!((Collection) obj).isEmpty()) {
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Object next = it.next();
                    if (next == null) {
                        qir.p("An operation is not implemented: 1");
                        return;
                    }
                    a(sb, next);
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb.append(HexString.CHAR_COMMA);
                    }
                }
            }
            sb.append(']');
            return;
        }
        if (!(obj instanceof Map)) {
            throw new JsonFormatException("Json formatting failed: ".concat(qv10.o("Json format is not defined for ", obj)));
        }
        sb.append('{');
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Iterator it2 = map.entrySet().iterator();
            while (true) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                sb.append(OpenList.CHAR_QUOTE);
                sb.append(key);
                sb.append(OpenList.CHAR_QUOTE);
                sb.append(':');
                if (value == null) {
                    qir.p("An operation is not implemented: 2");
                    return;
                }
                a(sb, value);
                if (!it2.hasNext()) {
                    break;
                } else {
                    sb.append(HexString.CHAR_COMMA);
                }
            }
        }
        sb.append('}');
    }

    public static Number c(hif hifVar, char c) {
        char d;
        long j = c == '-' ? -1L : c - MoneyInputEditView.DEFAULT_VALUE;
        while (hifVar.c()) {
            char d2 = hifVar.d();
            if ('0' > d2 || d2 >= ':') {
                if (d2 != '.') {
                    return Long.valueOf(j);
                }
                hifVar.e();
                double d3 = j;
                double d4 = 0.0d;
                double d5 = 0.1d;
                while (hifVar.c() && '0' <= (d = hifVar.d()) && d < ':') {
                    d4 += (d - '0') * d5;
                    d5 /= 10.0d;
                    hifVar.e();
                }
                return Double.valueOf(d3 + d4);
            }
            j = (j * 10) + (d2 - '0');
            hifVar.e();
        }
        return Long.valueOf(j);
    }

    public static Character e(hif hifVar) {
        while (hifVar.c()) {
            char f = hifVar.f();
            if (f != ' ' && f != '\n') {
                return Character.valueOf(f);
            }
        }
        return null;
    }

    public static String f(hif hifVar) {
        StringBuilder sb = new StringBuilder();
        while (hifVar.c()) {
            char f = hifVar.f();
            if (f == '\\') {
                if (!hifVar.c()) {
                    b.a("Expecting escaped character, got 'EOF'");
                    throw null;
                }
                char f2 = hifVar.f();
                if (f2 != '\\') {
                    b.a("Invalid escape sequence '\\" + f2 + '\'');
                    throw null;
                }
                sb.append(f2);
            } else {
                if (f == '\"') {
                    return sb.toString();
                }
                sb.append(f);
            }
        }
        b.a("Expecting '\"', got 'EOF'");
        throw null;
    }

    public final ArrayList b(hif hifVar) {
        ArrayList arrayList = new ArrayList();
        while (hifVar.c()) {
            char f = hifVar.f();
            if (f != ' ' && f != '\n') {
                if (f == ',') {
                    b.a("Expected array element, got ','");
                    throw null;
                }
                if (f != ']') {
                    arrayList.add(g(hifVar, f));
                    Character e = e(hifVar);
                    if (e == null || e.charValue() != ',') {
                        if (e == null || e.charValue() != ']') {
                            if (e == null) {
                                b.a("Expecting ',' or ']', got 'EOF'");
                                throw null;
                            }
                            b.a("Expecting ',' or ']', got '" + e + '\'');
                            throw null;
                        }
                    }
                }
                return arrayList;
            }
        }
        b.a("Expected '[', got 'EOF'");
        throw null;
    }

    public final LinkedHashMap d(hif hifVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (hifVar.c()) {
            char f = hifVar.f();
            if (f != ' ' && f != '\n') {
                if (f == '\"') {
                    String f2 = f(hifVar);
                    if (linkedHashMap.containsKey(f2)) {
                        b.a("Duplicated key '" + f2 + '\'');
                        throw null;
                    }
                    Character e = e(hifVar);
                    if (e == null || e.charValue() != ':') {
                        b.a("Expecting key-value separator, got '" + e + '\'');
                        throw null;
                    }
                    Character e2 = e(hifVar);
                    if (e2 == null) {
                        b.a("Expecting property value, got 'EOF'");
                        throw null;
                    }
                    linkedHashMap.put(f2, g(hifVar, e2.charValue()));
                    Character e3 = e(hifVar);
                    if (e3 == null || e3.charValue() != ',') {
                        if (e3 == null || e3.charValue() != '}') {
                            b.a("Expecting ',' or '}', got '" + e3 + '\'');
                            throw null;
                        }
                    }
                } else if (f != '}') {
                    b.a("Unexpected character '" + f + '\'');
                    throw null;
                }
                return linkedHashMap;
            }
        }
        b.a("Expected '{', got 'EOF'");
        throw null;
    }

    public final Object g(hif hifVar, char c) {
        if ('0' <= c && c < ':') {
            return c(hifVar, c);
        }
        if (c == '{') {
            return d(hifVar);
        }
        if (c == '[') {
            return b(hifVar);
        }
        if (c == '\"') {
            return f(hifVar);
        }
        if (c == '-') {
            return c(hifVar, c);
        }
        if (c == 't') {
            if (!hifVar.c()) {
                b.a("Expecting 'r', got 'EOF'");
                throw null;
            }
            if (hifVar.f() != 'r') {
                hifVar.b();
                b.a("Unexpected character '" + hifVar.f() + '\'');
                throw null;
            }
            if (!hifVar.c()) {
                b.a("Expecting 'u', got 'EOF'");
                throw null;
            }
            if (hifVar.f() != 'u') {
                hifVar.b();
                b.a("Unexpected character '" + hifVar.f() + '\'');
                throw null;
            }
            if (!hifVar.c()) {
                b.a("Expecting 'e', got 'EOF'");
                throw null;
            }
            if (hifVar.f() == 'e') {
                return Boolean.TRUE;
            }
            hifVar.b();
            b.a("Unexpected character '" + hifVar.f() + '\'');
            throw null;
        }
        if (c != 'f') {
            b.a("Unexpected character '" + c + '\'');
            throw null;
        }
        if (!hifVar.c()) {
            b.a("Expecting 'a', got 'EOF'");
            throw null;
        }
        if (hifVar.f() != 'a') {
            hifVar.b();
            b.a("Unexpected character '" + hifVar.f() + '\'');
            throw null;
        }
        if (!hifVar.c()) {
            b.a("Expecting 'l', got 'EOF'");
            throw null;
        }
        if (hifVar.f() != 'l') {
            hifVar.b();
            b.a("Unexpected character '" + hifVar.f() + '\'');
            throw null;
        }
        if (!hifVar.c()) {
            b.a("Expecting 's', got 'EOF'");
            throw null;
        }
        if (hifVar.f() != 's') {
            hifVar.b();
            b.a("Unexpected character '" + hifVar.f() + '\'');
            throw null;
        }
        if (!hifVar.c()) {
            b.a("Expecting 'e', got 'EOF'");
            throw null;
        }
        if (hifVar.f() == 'e') {
            return Boolean.FALSE;
        }
        hifVar.b();
        b.a("Unexpected character '" + hifVar.f() + '\'');
        throw null;
    }
}
