package com.yandex.plus.core.network.api;

import com.yandex.plus.home.common.network.NetworkResponse;
import defpackage.fs3;
import defpackage.gs3;
import defpackage.jf0;
import defpackage.l1j;
import defpackage.vao;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class d extends fs3 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // defpackage.fs3
    public final gs3 a(Type type, Annotation[] annotationArr, vao vaoVar) {
        switch (this.a) {
            case 0:
                type.getClass();
                annotationArr.getClass();
                if (Intrinsics.d(jf0.I(type), Call.class)) {
                    Type H = jf0.H(0, (ParameterizedType) type);
                    if (Intrinsics.d(jf0.I(H), NetworkResponse.class)) {
                        Type H2 = jf0.H(0, (ParameterizedType) H);
                        H2.getClass();
                        return new a(0, H2);
                    }
                }
                return null;
            default:
                type.getClass();
                annotationArr.getClass();
                if (Call.class.equals(jf0.I(type))) {
                    if (type instanceof ParameterizedType) {
                        Type H3 = jf0.H(0, (ParameterizedType) type);
                        if (com.yandex.plus.core.openapi.a.class.equals(jf0.I(H3))) {
                            if (H3 instanceof ParameterizedType) {
                                return new a(1, jf0.H(0, (ParameterizedType) H3));
                            }
                            l1j.m(H3, "Response must be parameterized as PlusNetworkResponse<out Any>, but was ");
                        }
                    } else {
                        l1j.m(type, "Return type must be parameterized as Call<PlusNetworkResponse<out Any>> or be suspend, but was ");
                    }
                }
                return null;
        }
    }
}
