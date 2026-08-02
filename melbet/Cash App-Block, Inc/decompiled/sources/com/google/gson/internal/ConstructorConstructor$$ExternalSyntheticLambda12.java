package com.google.gson.internal;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final /* synthetic */ class ConstructorConstructor$$ExternalSyntheticLambda12 implements ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Type f$0;

    public /* synthetic */ ConstructorConstructor$$ExternalSyntheticLambda12(int i, Type type2) {
        this.$r8$classId = i;
        this.f$0 = type2;
    }

    @Override // com.google.gson.internal.ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public final Object construct() {
        Object lambda$newSpecialCollectionConstructor$5;
        Object lambda$newSpecialCollectionConstructor$6;
        int i = this.$r8$classId;
        Type type2 = this.f$0;
        switch (i) {
            case 0:
                lambda$newSpecialCollectionConstructor$5 = ConstructorConstructor.lambda$newSpecialCollectionConstructor$5(type2);
                break;
            case 1:
                lambda$newSpecialCollectionConstructor$6 = ConstructorConstructor.lambda$newSpecialCollectionConstructor$6(type2);
                break;
            case 2:
                if (!(type2 instanceof ParameterizedType)) {
                    JWK$$ExternalSyntheticBUOutline0.m$4(type2, "Invalid EnumSet type: ");
                    break;
                } else {
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (!(type3 instanceof Class)) {
                        JWK$$ExternalSyntheticBUOutline0.m$4(type2, "Invalid EnumSet type: ");
                        break;
                    } else {
                        break;
                    }
                }
            default:
                if (!(type2 instanceof ParameterizedType)) {
                    JWK$$ExternalSyntheticBUOutline0.m$4(type2, "Invalid EnumMap type: ");
                    break;
                } else {
                    Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (!(type4 instanceof Class)) {
                        JWK$$ExternalSyntheticBUOutline0.m$4(type2, "Invalid EnumMap type: ");
                        break;
                    } else {
                        break;
                    }
                }
        }
        return null;
    }
}
