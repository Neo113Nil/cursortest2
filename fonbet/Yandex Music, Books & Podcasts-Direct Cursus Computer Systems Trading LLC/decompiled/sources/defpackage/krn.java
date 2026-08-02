package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class krn implements Serializable {

    @NotNull
    public static final jrn c = new jrn(null);
    private static final long serialVersionUID = 0;
    public final String a;
    public final int b;

    public krn(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.a, this.b);
        compile.getClass();
        return new Regex(compile);
    }
}
