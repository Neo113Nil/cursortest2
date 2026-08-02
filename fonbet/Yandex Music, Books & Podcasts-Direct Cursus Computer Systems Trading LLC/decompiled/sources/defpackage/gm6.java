package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* loaded from: classes5.dex */
public abstract class gm6 {
    public static final Collection a;

    static {
        try {
            a = jhp.k(ghp.b(Arrays.asList(new sg0()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
