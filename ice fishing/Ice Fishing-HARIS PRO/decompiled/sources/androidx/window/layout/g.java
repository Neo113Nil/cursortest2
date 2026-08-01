package androidx.window.layout;

import a.AbstractC0078a;
import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class g extends D1.j implements C1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f2234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ClassLoader classLoader, int i) {
        super(0);
        this.f2233b = i;
        this.f2234c = classLoader;
    }

    @Override // C1.a
    public final Object c() {
        boolean z2 = false;
        ClassLoader classLoader = this.f2234c;
        switch (this.f2233b) {
            case 0:
                t1.h hVar = i.f2236a;
                Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                D1.i.d(method, "getBoundsMethod");
                if (method.getReturnType().equals(AbstractC0078a.F(D1.o.a(Rect.class))) && Modifier.isPublic(method.getModifiers())) {
                    D1.i.d(method2, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (method2.getReturnType().equals(AbstractC0078a.F(D1.o.a(cls))) && Modifier.isPublic(method2.getModifiers())) {
                        D1.i.d(method3, "getStateMethod");
                        if (method3.getReturnType().equals(AbstractC0078a.F(D1.o.a(cls))) && Modifier.isPublic(method3.getModifiers())) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 1:
                t1.h hVar2 = i.f2236a;
                Method method4 = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass2 = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                D1.i.d(method4, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    D1.i.d(loadClass2, "windowLayoutComponentClass");
                    if (method4.getReturnType().equals(loadClass2)) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 2:
                t1.h hVar3 = i.f2236a;
                Class<?> loadClass3 = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Method method5 = loadClass3.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method method6 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                D1.i.d(method5, "addListenerMethod");
                if (Modifier.isPublic(method5.getModifiers())) {
                    D1.i.d(method6, "removeListenerMethod");
                    if (Modifier.isPublic(method6.getModifiers())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                t1.h hVar4 = i.f2236a;
                Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass4 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                D1.i.d(declaredMethod, "getWindowExtensionsMethod");
                D1.i.d(loadClass4, "windowExtensionsClass");
                if (declaredMethod.getReturnType().equals(loadClass4) && Modifier.isPublic(declaredMethod.getModifiers())) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
