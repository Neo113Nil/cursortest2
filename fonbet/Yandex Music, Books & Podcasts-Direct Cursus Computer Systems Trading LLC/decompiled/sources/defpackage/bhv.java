package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class bhv {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(d7k d7kVar) {
        d7kVar.getClass();
        String i = d7kVar.i(StandardCharsets.UTF_8);
        return i != null && i.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = dvt.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                xq0.x("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static void d(d7k d7kVar) {
        int i = d7kVar.b;
        if (a(d7kVar)) {
            return;
        }
        d7kVar.H(i);
        throw r7k.a(null, "Expected WEBVTT. Got " + d7kVar.i(StandardCharsets.UTF_8));
    }
}
