package com.yandex.plus.core.reflect;

import android.util.Log;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.templating.render.z;
import defpackage.q5b;
import defpackage.qo1;
import defpackage.wop;
import defpackage.xz0;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    public static final boolean a(String str, String str2) {
        return Intrinsics.d(str, str2) || kotlin.text.c.v(str, str2.concat("."), false);
    }

    public static final String b(Class cls) {
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        String str = (String) r1.e(a, cls, new k(19, cls));
        if (str.length() <= 0) {
            str = null;
        }
        if (canonicalName != null && str != null && canonicalName.length() > str.length() && kotlin.text.c.v(canonicalName, str, false)) {
            canonicalName = canonicalName.substring(str.length() + 1);
        } else if (canonicalName == null) {
            canonicalName = str != null ? str.concat(".(UNKNOWN)") : null;
            if (canonicalName == null) {
                canonicalName = "(UNKNOWN)";
            }
        }
        return kotlin.text.c.r(canonicalName, "$", ".", false);
    }

    public static final Set c(int i, Class cls) {
        Set set;
        Class superclass;
        if (cls.equals(Object.class)) {
            return q5b.a;
        }
        Set set2 = null;
        Pair pair = new Pair(cls, null);
        ConcurrentHashMap concurrentHashMap = b;
        Object obj = concurrentHashMap.get(pair);
        if (obj != null) {
            return (Set) obj;
        }
        int i2 = i + 2;
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            set = xz0.Y(declaredFields);
        } catch (Throwable th) {
            Log.w("ClassUtils", cls + ".declaredFields failed!", th);
            set = q5b.a;
        }
        if (!cls.equals(null) && (superclass = cls.getSuperclass()) != null) {
            set2 = c(i2, superclass);
        }
        LinkedHashSet i3 = wop.i(set, set2 != null ? set2 : q5b.a);
        Set set3 = (Set) concurrentHashMap.putIfAbsent(pair, i3);
        return set3 == null ? i3 : set3;
    }

    public static final Object d(Object obj, Field field) {
        obj.getClass();
        try {
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            try {
                Object obj2 = field.get(obj);
            } finally {
                if (!isAccessible) {
                    field.setAccessible(false);
                }
            }
        } catch (Throwable th) {
            Log.e("ClassUtils", "Getting value of field " + field + " for object " + obj + " is failed!", th);
            return null;
        }
    }

    public static final void e(Object obj, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        if (obj == null) {
            return;
        }
        if (z.class.isAssignableFrom(obj.getClass())) {
            linkedHashSet.add(obj);
            return;
        }
        h(obj, null, linkedHashSet, linkedHashSet2, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, obj, b.class, "isUserSpaceClass", "isUserSpaceClass(Ljava/lang/Object;Ljava/lang/String;)Z", 1, 4), i + 1);
    }

    public static final boolean f(Field field) {
        return field.isAnnotationPresent(TraversableCollectionField.class) || field.isAnnotationPresent(TraversableCollectionProperty.class);
    }

    public static final boolean g(Object obj, String str) {
        obj.getClass();
        str.getClass();
        return (a(str, "sun") || a(str, "java") || a(str, "kotlin") || a(str, "kotlinx") || a(str, ConstantDeviceInfo.APP_PLATFORM) || a(str, "androidx") || a(str, "com.android") || a(str, "com.google")) ? false : true;
    }

    public static final void h(Object obj, Field field, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, Function1 function1, int i) {
        LinkedHashSet linkedHashSet3 = linkedHashSet;
        LinkedHashSet linkedHashSet4 = linkedHashSet2;
        Class<?> cls = obj.getClass();
        if ((obj instanceof Class) || (obj instanceof Throwable) || Proxy.isProxyClass(cls)) {
            return;
        }
        Set set = com.yandex.plus.home.common.utils.reflection.a.a;
        if (cls.isPrimitive() || CollectionsKt.I(com.yandex.plus.home.common.utils.reflection.a.a, cls) || cls.isAnnotation()) {
            return;
        }
        String str = (String) r1.e(a, cls, new k(19, cls));
        if (a(str, "java.lang.reflect") || a(str, "kotlin.reflect")) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (field != null && f(field)) {
                for (Object obj2 : objArr) {
                    e(obj2, linkedHashSet3, linkedHashSet4, i + 1);
                }
            }
        } else {
            try {
                if (obj instanceof LinkedList) {
                    i((LinkedList) obj, field, linkedHashSet3, linkedHashSet4, i);
                } else if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    if (field != null && f(field)) {
                        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                        try {
                            Iterator it = collection.iterator();
                            while (it.hasNext()) {
                                e(it.next(), linkedHashSet5, linkedHashSet4, i + 1);
                            }
                            linkedHashSet3.addAll(linkedHashSet5);
                        } catch (Throwable th) {
                            Log.w("ClassUtils", "Iterating through Collection failed!", th);
                            throw th;
                        }
                    }
                } else if (obj instanceof Map) {
                    j((Map) obj, field, linkedHashSet3, linkedHashSet4, i);
                } else if ((obj instanceof boolean[]) || (obj instanceof char[]) || (obj instanceof byte[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[])) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str.length() <= 0 || ((Boolean) function1.invoke(str)).booleanValue()) {
            for (Field field2 : (Set) r1.e(c, new Pair(cls, null), new qo1(cls, i + 1, 8))) {
                if (z.class.isAssignableFrom(field2.getType())) {
                    Object d = d(obj, field2);
                    if (d == null) {
                        d = null;
                    }
                    if (d != null && !Proxy.isProxyClass(d.getClass())) {
                        linkedHashSet3.add(d);
                        linkedHashSet4.add(d);
                    }
                } else {
                    Object d2 = d(obj, field2);
                    if (d2 != null && !Proxy.isProxyClass(d2.getClass())) {
                        if (d2 instanceof LinkedList) {
                            try {
                                Object clone = ((LinkedList) d2).clone();
                                d2 = clone instanceof Collection ? (Collection) clone : null;
                                if (d2 == null) {
                                    Log.w("ClassUtils", "LinkedList.clone() is not Collection!");
                                }
                            } catch (Throwable th2) {
                                Log.w("ClassUtils", "LinkedList.clone() failed!", th2);
                            }
                        }
                        Object obj3 = d2;
                        if (linkedHashSet4.add(obj3)) {
                            h(obj3, field2, linkedHashSet3, linkedHashSet4, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, obj3, b.class, "isUserSpaceClass", "isUserSpaceClass(Ljava/lang/Object;Ljava/lang/String;)Z", 1, 4), i + 2);
                        }
                    }
                }
                linkedHashSet3 = linkedHashSet;
                linkedHashSet4 = linkedHashSet2;
            }
        }
    }

    public static final void i(LinkedList linkedList, Field field, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        if (field == null || !f(field)) {
            return;
        }
        try {
            Object clone = linkedList.clone();
            Collection collection = clone instanceof Collection ? (Collection) clone : null;
            if (collection == null) {
                Log.w("ClassUtils", "LinkedList.clone() is not Collection!");
                throw new Exception();
            }
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    e(it.next(), linkedHashSet3, linkedHashSet2, i + 1);
                }
                linkedHashSet.addAll(linkedHashSet3);
            } catch (Throwable th) {
                Log.w("ClassUtils", "Iterating through LinkedList failed!", th);
                throw th;
            }
        } catch (Throwable th2) {
            Log.w("ClassUtils", "LinkedList.clone() failed!", th2);
            throw th2;
        }
    }

    public static final void j(Map map, Field field, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        if (field == null || !f(field)) {
            return;
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        try {
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                int i2 = i + 1;
                e(obj, linkedHashSet3, linkedHashSet2, i2);
                e(obj2, linkedHashSet3, linkedHashSet2, i2);
            }
            linkedHashSet.addAll(linkedHashSet3);
        } catch (Throwable th) {
            Log.w("ClassUtils", "Iterating through Map failed!", th);
            throw th;
        }
    }
}
