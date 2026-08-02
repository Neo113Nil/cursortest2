package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import retrofit2.Call;

/* loaded from: classes9.dex */
public final class r7h extends zf7 {
    public final Executor a;

    public r7h(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.zf7
    public final ag7 a(Type type, Annotation[] annotationArr, t0k0 t0k0Var) {
        if (udq0.y(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new xjg(udq0.x(0, (ParameterizedType) type), udq0.C(annotationArr, xms0.class) ? null : this.a, false, 3);
        }
        ny61.g("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
