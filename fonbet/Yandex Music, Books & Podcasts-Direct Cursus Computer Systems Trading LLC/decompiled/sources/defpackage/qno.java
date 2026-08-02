package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class qno extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ knn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qno(knn knnVar, int i) {
        super(0);
        this.r = i;
        this.s = knnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                Class<?> loadClass = ((ClassLoader) this.s.b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                return loadClass;
            default:
                knn knnVar = this.s;
                Class<?> loadClass2 = ((ClassLoader) knnVar.b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass2.getClass();
                Method declaredMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = ((ClassLoader) knnVar.b).loadClass("androidx.window.extensions.WindowExtensions");
                loadClass3.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(declaredMethod.getModifiers()));
        }
    }
}
