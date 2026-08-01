package com.google.android.datatransport;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkService extends WinterFlowSessionDeserialization {
    @Override // com.google.android.datatransport.WinterFlowSessionDeserialization
    public final Typeface WinterFlowPackageIDE(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.WinterFlowRouterStructure, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.WinterFlowUnitTestResponse.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowSessionDeserialization
    public final Method WinterFlowSyntaxSubsystem(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
