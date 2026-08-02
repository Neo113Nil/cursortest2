package I0;

import N3.C;
import i1.C4585b;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1301a;

    static {
        o eVar;
        try {
            eVar = new C4585b(8, (WebViewProviderFactoryBoundaryInterface) A8.b.b(WebViewProviderFactoryBoundaryInterface.class, C.H()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
        f1301a = eVar;
    }
}
