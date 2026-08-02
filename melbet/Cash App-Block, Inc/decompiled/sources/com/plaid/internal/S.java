package com.plaid.internal;

import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes4.dex */
public final class S<S, E> implements CallAdapter {
    public final Type a;
    public final Converter b;

    public S(Type type2, Converter converter) {
        type2.getClass();
        converter.getClass();
        this.a = type2;
        this.b = converter;
    }

    @Override // retrofit2.CallAdapter
    public final Object adapt(Call call) {
        call.getClass();
        return new U(call, this.b);
    }

    @Override // retrofit2.CallAdapter
    public final Type responseType() {
        return this.a;
    }
}
