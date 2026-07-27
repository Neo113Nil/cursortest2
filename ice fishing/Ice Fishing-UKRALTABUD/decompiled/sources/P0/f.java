package P0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f871a;

    static {
        try {
            Iterator it = Arrays.asList(new L0.b()).iterator();
            E0.i.e(it, "<this>");
            f871a = I0.c.P(new I0.a(new I0.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
