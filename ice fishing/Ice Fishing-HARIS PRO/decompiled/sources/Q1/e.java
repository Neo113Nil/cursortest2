package Q1;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f942a;

    static {
        try {
            f942a = J1.h.g0(J1.h.e0(Arrays.asList(new M1.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
