package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a6p implements gfu {
    public final /* synthetic */ int a;
    public final Object b;

    public a6p(Map map) {
        this.a = 13;
        map.getClass();
        map.getClass();
        this.b = map;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        Object obj;
        Constructor<?> constructor;
        Object obj2;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return (bfu) ((r5p) obj3).invoke();
            case 1:
                return (bfu) ((r5p) obj3).invoke();
            case 2:
                return (bfu) ((r5p) obj3).invoke();
            case 3:
                return (bfu) ((r5p) obj3).invoke();
            case 4:
                return (bfu) ((rln) obj3).invoke();
            case 5:
                return (bfu) ((jgq) obj3).invoke();
            case 6:
                return (bfu) ((jpq) obj3).invoke();
            case 7:
                return (bfu) ((lqq) obj3).invoke();
            case 8:
                return (bfu) ((rln) obj3).invoke();
            case 9:
                Object invoke = ((b7r) obj3).invoke();
                invoke.getClass();
                return (bfu) invoke;
            case 10:
                return (bfu) ((j3s) obj3).invoke();
            case 11:
                return (bfu) ((g7s) obj3).invoke();
            case 12:
                return (bfu) ((c5t) obj3).invoke();
            case 13:
                Map map = (Map) obj3;
                szm szmVar = (szm) map.get(cls);
                if (szmVar == null) {
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (cls.isAssignableFrom((Class) ((Map.Entry) obj).getKey())) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    szmVar = entry != null ? (szm) entry.getValue() : null;
                    if (szmVar == null) {
                        xq0.x(tlm.j("unknown model class ", cls));
                        return null;
                    }
                }
                try {
                    Object obj4 = szmVar.get();
                    obj4.getClass();
                    return (bfu) obj4;
                } catch (Exception e) {
                    LinkedHashMap linkedHashMap = sqg.a;
                    uwf.l("Error creating viewmodel " + cls + ": " + e.getMessage());
                    throw new ClassCastException(e.getMessage());
                }
            case 14:
                return (bfu) ((i8u) obj3).invoke();
            case 15:
                if (!cls.equals(u8q.class)) {
                    xq0.q("Unknown view model");
                    return null;
                }
                g0c g0cVar = (g0c) obj3;
                g0cVar.getClass();
                return new u8q(g0cVar);
            case 16:
                xiu xiuVar = (xiu) obj3;
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    constructors.getClass();
                    int length = constructors.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            constructor = constructors[i2];
                            if (constructor.getAnnotation(wiu.class) == null) {
                                i2++;
                            }
                        } else {
                            constructor = null;
                        }
                    }
                    if (constructor != null) {
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        if (Arrays.equals(xiu.d, parameterTypes)) {
                            obj2 = constructor.newInstance(null);
                        } else {
                            if (!Arrays.equals(xiu.e, parameterTypes)) {
                                throw new RuntimeException("Invalid constructor found " + constructor + ", please check VmDi doc");
                            }
                            obj2 = constructor.newInstance(xiuVar);
                        }
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        return (bfu) obj2;
                    }
                    wvs.p(hrg.q("No suitable VmConstructor found for ", cls.getName(), ", please check VmDi doc"));
                    return null;
                } catch (ReflectiveOperationException e2) {
                    if ((e2 instanceof InvocationTargetException) && ((InvocationTargetException) e2).getCause() != null) {
                        throw e2;
                    }
                    b6e.q(e2);
                    return null;
                }
            case 17:
                return (bfu) ((btu) obj3).invoke();
            case 18:
                return (bfu) ((btu) obj3).invoke();
            case 19:
                return (bfu) ((btu) obj3).invoke();
            case 20:
                return (bfu) ((jvu) obj3).invoke();
            case 21:
                return (bfu) ((jvu) obj3).invoke();
            default:
                return (bfu) ((u0w) obj3).invoke();
        }
    }

    public /* synthetic */ a6p(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public a6p(g0c g0cVar) {
        this.a = 15;
        g0cVar.getClass();
        this.b = g0cVar;
    }
}
