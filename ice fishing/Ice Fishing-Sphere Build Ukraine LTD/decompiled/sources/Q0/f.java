package Q0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f880a;

    static {
        try {
            Iterator it = Arrays.asList(new M0.b()).iterator();
            E0.i.e(it, "<this>");
            f880a = J0.c.P(new J0.a(new J0.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
