package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public final class yqd extends uj6 {
    public final Gson a;

    public yqd(Gson gson) {
        this.a = gson;
    }

    @Override // defpackage.uj6
    public final vj6 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, vao vaoVar) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.a;
        return new brd(gson, gson.f(typeToken));
    }

    @Override // defpackage.uj6
    public final vj6 b(Type type, Annotation[] annotationArr, vao vaoVar) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.a;
        return new crd(gson, gson.f(typeToken));
    }
}
