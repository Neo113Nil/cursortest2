package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* loaded from: classes5.dex */
public final class nwj extends uj6 {
    public static final nwj b = new nwj(0);
    public final /* synthetic */ int a;

    public /* synthetic */ nwj(int i) {
        this.a = i;
    }

    @Override // defpackage.uj6
    public vj6 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, vao vaoVar) {
        switch (this.a) {
            case 1:
                if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
                    return lso.a;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, vaoVar);
        }
    }

    @Override // defpackage.uj6
    public final vj6 b(Type type, Annotation[] annotationArr, vao vaoVar) {
        switch (this.a) {
            case 0:
                if (jf0.I(type) != Optional.class) {
                    return null;
                }
                return new crd(vaoVar.d(jf0.H(0, (ParameterizedType) type), annotationArr));
            default:
                if (type == String.class) {
                    return pj3.p;
                }
                if (type == Boolean.class || type == Boolean.TYPE) {
                    return pj3.h;
                }
                if (type == Byte.class || type == Byte.TYPE) {
                    return pj3.i;
                }
                if (type == Character.class || type == Character.TYPE) {
                    return pj3.j;
                }
                if (type == Double.class || type == Double.TYPE) {
                    return pj3.k;
                }
                if (type == Float.class || type == Float.TYPE) {
                    return pj3.l;
                }
                if (type == Integer.class || type == Integer.TYPE) {
                    return pj3.m;
                }
                if (type == Long.class || type == Long.TYPE) {
                    return pj3.n;
                }
                if (type == Short.class || type == Short.TYPE) {
                    return pj3.o;
                }
                return null;
        }
    }
}
