package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class qj3 extends uj6 {
    public boolean a;

    @Override // defpackage.uj6
    public final vj6 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, vao vaoVar) {
        if (h0o.class.isAssignableFrom(jf0.I(type))) {
            return pj3.d;
        }
        return null;
    }

    @Override // defpackage.uj6
    public final vj6 b(Type type, Annotation[] annotationArr, vao vaoVar) {
        if (type == o3o.class) {
            return jf0.M(annotationArr, vjr.class) ? pj3.e : pj3.c;
        }
        if (type == Void.class) {
            return pj3.g;
        }
        if (!this.a || type != Unit.class) {
            return null;
        }
        try {
            return pj3.f;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }
}
