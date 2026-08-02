package Q7;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class i implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Pattern f2722n;

    public i(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        this.f2722n = compile;
    }

    public final b3.e a(int i, String input) {
        kotlin.jvm.internal.h.e(input, "input");
        Matcher region = this.f2722n.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i, input.length());
        if (region.lookingAt()) {
            return new b3.e(region, input);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.f2722n.toString();
        kotlin.jvm.internal.h.d(pattern, "toString(...)");
        return pattern;
    }
}
