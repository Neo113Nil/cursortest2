package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ejo {
    public static final ejo c = new ejo(0, -9223372036854775807L);
    public static final Pattern d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");
    public final long a;
    public final long b;

    public ejo(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static ejo a(String str) {
        long parseFloat;
        Matcher matcher = d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = cjo.a;
        if (!matches) {
            throw r7k.b(str, null);
        }
        String group = matcher.group(1);
        if (group == null) {
            throw r7k.b(str, null);
        }
        int i = dvt.a;
        long parseFloat2 = group.equals("now") ? 0L : (long) (Float.parseFloat(group) * 1000.0f);
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = (long) (Float.parseFloat(group2) * 1000.0f);
                if (parseFloat < parseFloat2) {
                    throw r7k.b(str, null);
                }
            } catch (NumberFormatException e) {
                throw r7k.b(group2, e);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new ejo(parseFloat2, parseFloat);
    }
}
