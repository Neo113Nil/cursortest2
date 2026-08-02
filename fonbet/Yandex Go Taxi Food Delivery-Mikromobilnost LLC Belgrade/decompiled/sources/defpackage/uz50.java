package defpackage;

import com.yandex.plus.home.common.network.NetworkResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.Call;

/* loaded from: classes8.dex */
public final class uz50 extends zf7 {
    @Override // defpackage.zf7
    public final ag7 a(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        if (!jl40.l(udq0.y(type), Call.class)) {
            return null;
        }
        Type x = udq0.x(0, (ParameterizedType) type);
        if (jl40.l(udq0.y(x), NetworkResponse.class)) {
            return new yo40(udq0.x(0, (ParameterizedType) x));
        }
        return null;
    }
}
