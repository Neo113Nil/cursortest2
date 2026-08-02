package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class bev {
    public static final tev a;

    static {
        tev impVar;
        try {
            impVar = new c5p(14, (WebViewProviderFactoryBoundaryInterface) lg3.J(WebViewProviderFactoryBoundaryInterface.class, fxf.z()));
        } catch (ClassNotFoundException unused) {
            impVar = new imp();
        } catch (IllegalAccessException e) {
            b6e.q(e);
            return;
        } catch (NoSuchMethodException e2) {
            b6e.q(e2);
            return;
        } catch (InvocationTargetException e3) {
            b6e.q(e3);
            return;
        }
        a = impVar;
    }
}
