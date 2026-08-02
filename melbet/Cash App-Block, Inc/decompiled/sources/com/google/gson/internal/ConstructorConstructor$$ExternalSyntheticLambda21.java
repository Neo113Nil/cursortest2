package com.google.gson.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import operations.ComparingOperation;

/* loaded from: classes4.dex */
public final /* synthetic */ class ConstructorConstructor$$ExternalSyntheticLambda21 implements ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Constructor f$0;

    public /* synthetic */ ConstructorConstructor$$ExternalSyntheticLambda21(Constructor constructor, int i) {
        this.$r8$classId = i;
        this.f$0 = constructor;
    }

    @Override // com.google.gson.internal.ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public final Object construct() {
        Object lambda$newDefaultConstructor$9;
        int i = this.$r8$classId;
        Constructor constructor = this.f$0;
        switch (i) {
            case 0:
                lambda$newDefaultConstructor$9 = ConstructorConstructor.lambda$newDefaultConstructor$9(constructor);
                return lambda$newDefaultConstructor$9;
            default:
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    ComparingOperation.DefaultImpls defaultImpls = ReflectionHelper.RECORD_HELPER;
                    OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", (Throwable) e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e3.getCause());
                    return null;
                }
        }
    }
}
