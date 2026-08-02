package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class qw41 {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(ef90 ef90Var) {
        ef90Var.getClass();
        String l = ef90Var.l(StandardCharsets.UTF_8);
        return l != null && l.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = tw21.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                ny61.g("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static void d(ef90 ef90Var) {
        int i = ef90Var.b;
        if (a(ef90Var)) {
            return;
        }
        ef90Var.K(i);
        throw ParserException.a(null, "Expected WEBVTT. Got " + ef90Var.l(StandardCharsets.UTF_8));
    }
}
