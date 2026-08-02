package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ci6 implements gfu {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object d;

    public ci6(hek hekVar, egk egkVar, eg6 eg6Var) {
        hekVar.getClass();
        egkVar.getClass();
        eg6Var.getClass();
        this.b = hekVar;
        this.c = egkVar;
        this.d = eg6Var;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        Object obj;
        Constructor<?> constructor;
        Object obj2;
        switch (this.a) {
            case 0:
                if (cls.equals(ki6.class)) {
                    return new ki6((hek) this.b, (egk) this.c, (eg6) this.d);
                }
                xq0.q("Unknown view model");
                return null;
            case 1:
                if (cls.equals(z07.class)) {
                    return new z07((gs4) this.b, (g0c) this.c, (sdk) this.d);
                }
                xq0.q("Unknown view model");
                return null;
            default:
                xiu xiuVar = (xiu) this.b;
                Class cls2 = (Class) this.c;
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    constructors.getClass();
                    int length = constructors.length;
                    int i = 0;
                    while (true) {
                        obj = null;
                        if (i < length) {
                            constructor = constructors[i];
                            if (constructor.getAnnotation(wiu.class) == null) {
                                i++;
                            }
                        } else {
                            constructor = null;
                        }
                    }
                    Object obj3 = this.d;
                    if (constructor != null) {
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 2 && Intrinsics.d(parameterTypes[0], xiu.class) && Intrinsics.d(parameterTypes[1], cls2)) {
                            obj2 = constructor.newInstance(xiuVar, obj3);
                        } else {
                            if (parameterTypes.length == 2 && Intrinsics.d(parameterTypes[0], cls2) && Intrinsics.d(parameterTypes[1], xiu.class)) {
                                obj2 = constructor.newInstance(obj3, xiuVar);
                            } else {
                                if (parameterTypes.length != 1 || !Intrinsics.d(parameterTypes[0], cls2)) {
                                    throw new RuntimeException("Invalid constructor found " + constructor + ", please check VmDi doc");
                                }
                                obj2 = constructor.newInstance(obj3);
                            }
                        }
                        obj = obj2;
                    }
                    if (obj != null) {
                        return (bfu) obj;
                    }
                    throw new RuntimeException("No suitable constructor found for " + cls.getName() + " and key " + obj3 + ", please check VmDi doc.");
                } catch (ReflectiveOperationException e) {
                    if ((e instanceof InvocationTargetException) && ((InvocationTargetException) e).getCause() != null) {
                        throw e;
                    }
                    b6e.q(e);
                    return null;
                }
        }
    }

    public ci6(gs4 gs4Var, g0c g0cVar, sdk sdkVar) {
        gs4Var.getClass();
        sdkVar.getClass();
        this.b = gs4Var;
        this.c = g0cVar;
        this.d = sdkVar;
    }

    public ci6(xiu xiuVar, Class cls, Object obj) {
        this.b = xiuVar;
        this.c = cls;
        this.d = obj;
    }
}
