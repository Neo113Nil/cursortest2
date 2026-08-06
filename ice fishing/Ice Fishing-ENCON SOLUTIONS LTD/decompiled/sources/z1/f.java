package z1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f8637a;

    public f(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        this.f8637a = compile;
    }

    public final String toString() {
        String pattern = this.f8637a.toString();
        kotlin.jvm.internal.i.d(pattern, "toString(...)");
        return pattern;
    }
}
