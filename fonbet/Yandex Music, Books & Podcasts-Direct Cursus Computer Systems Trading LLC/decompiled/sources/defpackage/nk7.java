package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import retrofit2.Call;

/* loaded from: classes5.dex */
public final class nk7 extends fs3 {
    public final Executor a;

    public nk7(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.fs3
    public final gs3 a(Type type, Annotation[] annotationArr, vao vaoVar) {
        if (jf0.I(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new nnk(jf0.H(0, (ParameterizedType) type), jf0.M(annotationArr, zqq.class) ? null : this.a);
        }
        xq0.x("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
