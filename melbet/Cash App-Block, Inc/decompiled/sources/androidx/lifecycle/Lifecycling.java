package androidx.lifecycle;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public abstract class Lifecycling {
    public static final HashMap callbackCache = new HashMap();
    public static final HashMap classToAdapters = new HashMap();

    public static void createGeneratedAdapter(Constructor constructor, LifecycleObserver lifecycleObserver) {
        try {
            Object newInstance = constructor.newInstance(lifecycleObserver);
            newInstance.getClass();
            Recorder$$ExternalSyntheticOutline1.m(newInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int getObserverConstructorType(Class cls) {
        Constructor<?> constructor;
        HashMap hashMap = callbackCache;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            int i2 = 0;
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String concat = StringsKt__StringsJVMKt.replace$default(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return 0;
            }
            HashMap hashMap2 = classToAdapters;
            if (constructor != null) {
                hashMap2.put(cls, CollectionsKt__CollectionsJVMKt.listOf(constructor));
            } else if (!ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && LifecycleObserver.class.isAssignableFrom(superclass)) {
                    superclass.getClass();
                    if (getObserverConstructorType(superclass) != 1) {
                        Object obj = hashMap2.get(superclass);
                        obj.getClass();
                        arrayList = new ArrayList((Collection) obj);
                    }
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int length = interfaces.length;
                while (true) {
                    if (i2 < length) {
                        Class<?> cls2 = interfaces[i2];
                        if (cls2 != null && LifecycleObserver.class.isAssignableFrom(cls2)) {
                            cls2.getClass();
                            if (getObserverConstructorType(cls2) == 1) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Object obj2 = hashMap2.get(cls2);
                            obj2.getClass();
                            arrayList.addAll((Collection) obj2);
                        }
                        i2++;
                    } else if (arrayList != null) {
                        hashMap2.put(cls, arrayList);
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
