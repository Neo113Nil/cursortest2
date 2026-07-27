package I0;

import g1.C4522b;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1274a;

    static {
        o eVar;
        try {
            eVar = new C4522b(5, (WebViewProviderFactoryBoundaryInterface) A8.b.d(WebViewProviderFactoryBoundaryInterface.class, V2.a.j()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
        f1274a = eVar;
    }
}
