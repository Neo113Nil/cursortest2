package defpackage;

import java.text.NumberFormat;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public abstract class zdf {
    public static final ThreadLocal a = ThreadLocal.withInitial(new ydf(0));
    public static final Pattern b = Pattern.compile("^(0*)(0|\\d*)([.]*|[.][0-9]*[1-9]+)(0*)$");
    public static final Pattern c = Pattern.compile("\\s" + Pattern.quote("$SIGN$"));

    public static final NumberFormat a() {
        return (NumberFormat) a.get();
    }
}
