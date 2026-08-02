package ru.yandex.taxi.logistics.sdk.network;

import defpackage.ag7;
import defpackage.an2;
import defpackage.jl40;
import defpackage.lb7;
import defpackage.t0k0;
import defpackage.tls;
import defpackage.udq0;
import defpackage.zf7;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes9.dex */
public final class a extends zf7 {
    public final tls a;

    public /* synthetic */ a(int i) {
        this(new ApiCallAdapterFactory$1());
    }

    @Override // defpackage.zf7
    public final ag7 a(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        if (jl40.l(udq0.y(type), an2.class)) {
            return new lb7(5, udq0.x(0, (ParameterizedType) type), this.a);
        }
        return null;
    }

    public a() {
        this(0);
    }

    public a(tls tlsVar) {
        this.a = tlsVar;
    }
}
