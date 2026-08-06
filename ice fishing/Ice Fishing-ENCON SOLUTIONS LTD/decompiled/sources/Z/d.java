package Z;

import a.AbstractC0083a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.q;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i2) {
        super(0);
        this.f1933e = i2;
        this.f1934f = eVar;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        boolean z2;
        Class cls;
        boolean z3;
        boolean z4;
        switch (this.f1933e) {
            case 0:
                Class<?> loadClass = this.f1934f.f1935a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                kotlin.jvm.internal.i.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method getBoundsMethod = loadClass.getMethod("getBounds", null);
                Method getTypeMethod = loadClass.getMethod("getType", null);
                Method getStateMethod = loadClass.getMethod("getState", null);
                kotlin.jvm.internal.i.d(getBoundsMethod, "getBoundsMethod");
                if (AbstractC0083a.g(getBoundsMethod, q.a(Rect.class)) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
                    kotlin.jvm.internal.i.d(getTypeMethod, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0083a.g(getTypeMethod, q.a(cls2)) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                        kotlin.jvm.internal.i.d(getStateMethod, "getStateMethod");
                        if (AbstractC0083a.g(getStateMethod, q.a(cls2)) && Modifier.isPublic(getStateMethod.getModifiers())) {
                            z2 = true;
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 1:
                e eVar = this.f1934f;
                try {
                    cls = eVar.f1936b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f1935a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method removeListenerMethod = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                kotlin.jvm.internal.i.d(addListenerMethod, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    kotlin.jvm.internal.i.d(removeListenerMethod, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 2:
                Class<?> loadClass3 = this.f1934f.f1935a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod2 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                kotlin.jvm.internal.i.d(addListenerMethod2, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    kotlin.jvm.internal.i.d(removeListenerMethod2, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            default:
                e eVar2 = this.f1934f;
                Class<?> loadClass4 = eVar2.f1937c.f1828a.loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.i.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method getWindowLayoutComponentMethod = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar2.f1935a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                kotlin.jvm.internal.i.d(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(loadClass5));
        }
    }
}
