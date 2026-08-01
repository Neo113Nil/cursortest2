package X7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f3831a;

    static {
        try {
            Iterator it = Arrays.asList(new T7.b()).iterator();
            kotlin.jvm.internal.h.e(it, "<this>");
            f3831a = P7.i.u(new P7.a(new P7.g(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
