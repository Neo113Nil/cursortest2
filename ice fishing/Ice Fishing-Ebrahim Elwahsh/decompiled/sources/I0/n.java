package I0;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1243a;

    static {
        o eVar;
        try {
            eVar = new h4.c(5, (WebViewProviderFactoryBoundaryInterface) w8.a.b(WebViewProviderFactoryBoundaryInterface.class, S0.f.h()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
        f1243a = eVar;
    }
}
