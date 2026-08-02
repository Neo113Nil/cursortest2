package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xdf {
    public final zby a;

    public xdf(zby zbyVar) {
        this.a = zbyVar;
    }

    public static String e(String str) {
        Pattern pattern;
        pattern = zdf.b;
        Matcher matcher = pattern.matcher(cvu0.v(str, ",", Extension.DOT_CHAR, false));
        if (!matcher.matches()) {
            return str;
        }
        String group = matcher.group(2);
        if (group == null || group.length() == 0) {
            group = null;
        }
        if (group == null) {
            group = "0";
        }
        String group2 = matcher.group(3);
        String str2 = jl40.l(group2, Extension.DOT_CHAR) ? null : group2;
        if (str2 == null) {
            str2 = "";
        }
        return group.concat(str2);
    }

    public static String g(fef fefVar, String str) {
        String str2 = fefVar.a;
        if (str2 == null) {
            str2 = "";
        }
        return cvu0.v(cvu0.v(str, "$CURRENCY$", str2, false), "$SIGN$", "", false);
    }

    public final String a(fef fefVar, String str, boolean z, boolean z2) {
        String str2;
        Pattern pattern;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!evu0.y(str, "$CURRENCY$", false)) {
            return str;
        }
        if (fefVar == null) {
            return cvu0.v(cvu0.v(cvu0.v(cvu0.v(str, "$CURRENCY$", "", false), "$SIGN$", "", false), "$PRICE$", "", false), "$VALUE$", "", false);
        }
        if (z2 && ((str2 = fefVar.c) == null || !cvu0.x(str2, "$SIGN$", false))) {
            StringBuffer stringBuffer = new StringBuffer();
            pattern = zdf.c;
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, cvu0.v("$SIGN$", "$", "\\$", false));
            }
            matcher.appendTail(stringBuffer);
            str = stringBuffer.toString();
        }
        return d(fefVar, z, str);
    }

    public final String b(fef fefVar, Double d) {
        return c(fefVar, zdf.a().format(d), false);
    }

    public final String c(fef fefVar, String str, boolean z) {
        String str2 = fefVar != null ? fefVar.c : null;
        return (str2 == null || str2.length() == 0) ? str : cvu0.v(a(fefVar, str2, false, z), "$VALUE$", str, false);
    }

    public final String d(fef fefVar, boolean z, String str) {
        boolean a;
        String str2 = fefVar.d;
        if (str2 == null || str2.length() == 0) {
            return g(fefVar, str);
        }
        zby zbyVar = this.a;
        if (z) {
            zbyVar.getClass();
            Boolean bool = tp11.a;
            if (str2 != null) {
                ArrayList arrayList = tp11.d;
                if (arrayList.contains(str2)) {
                    a = true;
                } else {
                    ArrayList arrayList2 = tp11.e;
                    if (!arrayList2.contains(str2)) {
                        boolean d = tp11.d(str2, Typeface.DEFAULT);
                        if (d) {
                            arrayList.add(str2);
                            xby.d.n("Char is supported in system default typeface: [" + str2 + "]");
                        } else {
                            arrayList2.add(str2);
                            xby.d.n("Char is not supported in system default typeface: [" + str2 + "]");
                        }
                        a = d;
                    }
                }
            }
            a = false;
        } else {
            zbyVar.getClass();
            a = zby.a(str2);
        }
        if (!a) {
            return g(fefVar, str);
        }
        String str3 = fefVar.d;
        return str3 == null ? str : cvu0.v(cvu0.v(str, "$CURRENCY$", "", false), "$SIGN$", str3, false);
    }

    public final MapBuilder f(fef fefVar) {
        boolean a;
        String str = fefVar.d;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            a = false;
        } else {
            this.a.getClass();
            a = zby.a(str);
        }
        if (!a) {
            if (a) {
                w511.b();
                return null;
            }
            str = "";
        }
        if (!a) {
            if (a) {
                w511.b();
                return null;
            }
            String str3 = fefVar.a;
            if (str3 != null) {
                str2 = str3;
            }
        }
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("$SIGN$", str);
        mapBuilder.put("$CURRENCY$", str2);
        return mapBuilder.j();
    }
}
