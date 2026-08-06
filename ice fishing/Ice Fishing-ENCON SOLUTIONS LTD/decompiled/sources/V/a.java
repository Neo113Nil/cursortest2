package V;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class a extends j implements InterfaceC1046a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f1827f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i2) {
        super(0);
        this.f1826e = i2;
        this.f1827f = bVar;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        switch (this.f1826e) {
            case 0:
                Class<?> loadClass = this.f1827f.f1828a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                b bVar = this.f1827f;
                Class<?> loadClass2 = bVar.f1828a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                i.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = bVar.f1828a.loadClass("androidx.window.extensions.WindowExtensions");
                i.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                i.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(getWindowExtensionsMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers()));
        }
    }
}
