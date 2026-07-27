package U;

import E0.q;
import a.AbstractC0069a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class d extends E0.j implements D0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f1027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i2) {
        super(0);
        this.f1026f = i2;
        this.f1027g = eVar;
    }

    @Override // D0.a
    public final Object a() {
        boolean z2;
        Class cls;
        boolean z3;
        boolean z4;
        switch (this.f1026f) {
            case 0:
                Class<?> loadClass = this.f1027g.f1028a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                E0.i.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                E0.i.d(method, "getBoundsMethod");
                if (AbstractC0069a.l(method, q.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    E0.i.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0069a.l(method2, q.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        E0.i.d(method3, "getStateMethod");
                        if (AbstractC0069a.l(method3, q.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z2 = true;
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 1:
                e eVar = this.f1027g;
                try {
                    cls = eVar.f1029b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f1028a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                E0.i.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                E0.i.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    E0.i.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Class<?> loadClass3 = this.f1027g.f1028a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                E0.i.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                E0.i.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    E0.i.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            default:
                e eVar2 = this.f1027g;
                Class<?> loadClass4 = eVar2.f1030c.f866a.loadClass("androidx.window.extensions.WindowExtensions");
                E0.i.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar2.f1028a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                E0.i.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                E0.i.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
