package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rno extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ sno s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rno(sno snoVar, int i) {
        super(0);
        this.r = i;
        this.s = snoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        Class<?> cls;
        boolean z2;
        boolean z3;
        switch (this.r) {
            case 0:
                Class<?> loadClass = this.s.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                loadClass.getClass();
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                method.getClass();
                Class b = ern.a(Rect.class).b();
                b.getClass();
                if (method.getReturnType().equals(b) && Modifier.isPublic(method.getModifiers())) {
                    method2.getClass();
                    Class cls2 = Integer.TYPE;
                    Class b2 = ern.a(cls2).b();
                    b2.getClass();
                    if (method2.getReturnType().equals(b2) && Modifier.isPublic(method2.getModifiers())) {
                        method3.getClass();
                        Class b3 = ern.a(cls2).b();
                        b3.getClass();
                        if (method3.getReturnType().equals(b3) && Modifier.isPublic(method3.getModifiers())) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                sno snoVar = this.s;
                try {
                    cls = ((ClassLoader) snoVar.b.b).loadClass("java.util.function.Consumer");
                    cls.getClass();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = snoVar.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass2.getClass();
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                method4.getClass();
                if (Modifier.isPublic(method4.getModifiers())) {
                    method5.getClass();
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 2:
                Class<?> loadClass3 = this.s.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass3.getClass();
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    method7.getClass();
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            default:
                sno snoVar2 = this.s;
                Class<?> loadClass4 = ((ClassLoader) snoVar2.c.b).loadClass("androidx.window.extensions.WindowExtensions");
                loadClass4.getClass();
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = snoVar2.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass5.getClass();
                method8.getClass();
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
