package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class sia1 {
    public static au2 a;

    public static Object a(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        Object obj2 = null;
        try {
            Method d = d(cls, str, clsArr);
            if (d == null) {
                return null;
            }
            d.setAccessible(true);
            obj2 = d.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            d.setAccessible(false);
            return obj2;
        } catch (Throwable unused) {
            return obj2;
        }
    }

    public static Object b(Object obj, String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = copyOf.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = copyOf[i];
            Class<?> cls = obj2 != null ? obj2.getClass() : null;
            if (cls != null) {
                arrayList.add(cls);
            }
        }
        return a(obj.getClass(), str, obj, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(objArr, objArr.length));
    }

    public static Object c(String str, Object... objArr) {
        Class<?> cls = Class.forName(str);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList(copyOf.length);
        for (Object obj : copyOf) {
            arrayList.add(obj.getClass());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            boolean isAccessible = declaredConstructor.isAccessible();
            if (!isAccessible) {
                declaredConstructor.setAccessible(true);
            }
            Object newInstance = declaredConstructor.newInstance(Arrays.copyOf(copyOf, copyOf.length));
            if (!isAccessible) {
                declaredConstructor.setAccessible(false);
            }
            return newInstance;
        } catch (Throwable unused) {
            Arrays.toString(copyOf);
            return null;
        }
    }

    public static Method d(Class cls, String str, Class[] clsArr) {
        while (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (str.equals(method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == clsArr2.length) {
                        int length = parameterTypes.length;
                        for (int i = 0; i < length; i++) {
                            if (!parameterTypes[i].isAssignableFrom(clsArr2[i])) {
                                break;
                            }
                        }
                        return method;
                    }
                    continue;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static LinkedHashMap e(ar7 ar7Var) {
        Set<String> set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String c = ar7Var.c();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) ar7Var.o();
        linkedHashMap.put(c, cameraCharacteristics);
        try {
            set = cameraCharacteristics.getPhysicalCameraIds();
        } catch (Exception unused) {
            set = Collections.EMPTY_SET;
        }
        if (set != null) {
            for (String str : set) {
                if (!Objects.equals(str, c)) {
                    linkedHashMap.put(str, (CameraCharacteristics) ar7Var.A(str));
                }
            }
        }
        return linkedHashMap;
    }

    public static ah f(Locale locale) {
        if (ah.e == null) {
            ah ahVar = new ah(0);
            ahVar.d = BreakIterator.getCharacterInstance(locale);
            ah.e = ahVar;
        }
        return ah.e;
    }

    public static final au2 g() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(5.54f, 2.55f);
        uq90Var.g(-2.0f);
        uq90Var.p(6.66f);
        uq90Var.g(6.66f);
        uq90Var.p(-2.0f);
        uq90Var.f(6.96f);
        uq90Var.i(0.14f, -0.15f);
        uq90Var.b(7.0f, 7.0f, true, true, -2.05f, 4.95f);
        uq90Var.g(-2.0f);
        uq90Var.b(9.0f, 9.0f, true, false, 2.5f, -6.22f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static HashSet h(List list) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        HashSet hashSet = new HashSet();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            key2 = CaptureRequest.CONTROL_ZOOM_RATIO;
            if (list.contains(key2) || list.contains(CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(Arrays.asList(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_MODE;
        if (list.containsAll(Arrays.asList(key3, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(Arrays.asList(key3, CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        if (i >= 34) {
            key = CaptureRequest.EXTENSION_STRENGTH;
            if (list.contains(key)) {
                hashSet.add(8);
            }
        }
        return hashSet;
    }
}
