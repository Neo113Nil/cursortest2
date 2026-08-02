package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class T extends CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        type2.getClass();
        annotationArr.getClass();
        retrofit.getClass();
        if (Call.class.equals(CallAdapter.Factory.getRawType(type2))) {
            if (!(type2 instanceof ParameterizedType)) {
                a$$ExternalSyntheticBUOutline0.m$1("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
                return null;
            }
            Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type2);
            if (Intrinsics.areEqual(CallAdapter.Factory.getRawType(parameterUpperBound), AbstractC0193i4.class)) {
                if (!(parameterUpperBound instanceof ParameterizedType)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
                    return null;
                }
                ParameterizedType parameterizedType = (ParameterizedType) parameterUpperBound;
                Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, parameterizedType);
                Converter nextResponseBodyConverter = retrofit.nextResponseBodyConverter(CallAdapter.Factory.getParameterUpperBound(1, parameterizedType), annotationArr);
                parameterUpperBound2.getClass();
                return new S(parameterUpperBound2, nextResponseBodyConverter);
            }
        }
        return null;
    }
}
