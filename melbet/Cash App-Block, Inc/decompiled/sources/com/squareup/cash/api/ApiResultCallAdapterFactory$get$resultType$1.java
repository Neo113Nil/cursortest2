package com.squareup.cash.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes.dex */
public final class ApiResultCallAdapterFactory$get$resultType$1 implements ParameterizedType {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $responseType;

    public /* synthetic */ ApiResultCallAdapterFactory$get$resultType$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$responseType = obj;
    }

    public boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 2:
                if (obj instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) obj;
                    if (Intrinsics.areEqual(parameterizedType.getRawType(), List.class) && parameterizedType.getOwnerType() == null && Arrays.equals(parameterizedType.getActualTypeArguments(), (Type[]) this.$responseType)) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        int i = this.$r8$classId;
        Object obj = this.$responseType;
        switch (i) {
            case 0:
                return new ApiResultCallAdapterFactory$get$resultType$1[]{(ApiResultCallAdapterFactory$get$resultType$1) obj};
            case 1:
                return new Type[]{(Type) obj};
            default:
                Type[] typeArr = (Type[]) obj;
                return (Type[]) Arrays.copyOf(typeArr, typeArr.length);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        switch (this.$r8$classId) {
        }
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        switch (this.$r8$classId) {
            case 0:
                return Call.class;
            case 1:
                return Response.class;
            default:
                return List.class;
        }
    }

    public int hashCode() {
        switch (this.$r8$classId) {
            case 2:
                return Arrays.hashCode((Type[]) this.$responseType) ^ List.class.hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 2:
                return Boxes$$ExternalSyntheticOutline1.m(List.class.getName(), "<", ArraysKt___ArraysKt.joinToString$default((Type[]) this.$responseType, ", ", null, null, null, 62), ">");
            default:
                return super.toString();
        }
    }
}
