package defpackage;

import androidx.media3.common.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class qjl0 {
    public static final qjl0 c = new qjl0(0, -9223372036854775807L);
    public static final Pattern d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");
    public final long a;
    public final long b;

    public qjl0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static qjl0 a(String str) {
        long parseFloat;
        Matcher matcher = d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = ojl0.a;
        if (!matches) {
            throw ParserException.b(null, str);
        }
        String group = matcher.group(1);
        if (group == null) {
            throw ParserException.b(null, str);
        }
        int i = tw21.a;
        long parseFloat2 = group.equals("now") ? 0L : (long) (Float.parseFloat(group) * 1000.0f);
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = (long) (Float.parseFloat(group2) * 1000.0f);
                if (parseFloat < parseFloat2) {
                    throw ParserException.b(null, str);
                }
            } catch (NumberFormatException e) {
                throw ParserException.b(e, group2);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new qjl0(parseFloat2, parseFloat);
    }
}
