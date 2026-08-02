package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class im5 extends fs3 {
    public static final im5 a = new im5();

    @Override // defpackage.fs3
    public final gs3 a(Type type, Annotation[] annotationArr, vao vaoVar) {
        if (jf0.I(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            xq0.q("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type H = jf0.H(0, (ParameterizedType) type);
        if (jf0.I(H) != Response.class) {
            return new ix6(18, H);
        }
        if (H instanceof ParameterizedType) {
            return new bnd(16, jf0.H(0, (ParameterizedType) H));
        }
        xq0.q("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
