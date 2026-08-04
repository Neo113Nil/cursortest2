package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1lSDK {
    public static final Object AFAdRevenueData = new Object() { // from class: com.appsflyer.internal.AFa1lSDK.1
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double getRevenue = Double.valueOf(-0.0d);
    final LinkedHashMap<String, Object> getMediationNetwork;

    public AFa1lSDK() {
        this.getMediationNetwork = new LinkedHashMap<>();
    }

    public static Object AFAdRevenueData(Object obj) throws Throwable {
        if (obj == null) {
            return AFAdRevenueData;
        }
        if (((Class) AFa1vSDK.getRevenue((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, TextUtils.lastIndexOf("", '0') + 160, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1))).isInstance(obj) || (obj instanceof AFa1lSDK)) {
            return obj;
        }
        try {
            if (obj instanceof JSONArray) {
                try {
                    Object[] objArr = {obj.toString()};
                    Map map = AFa1vSDK.registerClient;
                    Object declaredConstructor = map.get(2121538775);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 160 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22))).getDeclaredConstructor(String.class);
                        map.put(2121538775, declaredConstructor);
                    }
                    obj = ((Constructor) declaredConstructor).newInstance(objArr);
                    return obj;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (obj instanceof JSONObject) {
                return new AFa1lSDK(obj.toString());
            }
            if (obj.equals(AFAdRevenueData)) {
                return obj;
            }
            try {
                if (obj instanceof Collection) {
                    try {
                        Object[] objArr2 = {(Collection) obj};
                        Map map2 = AFa1vSDK.registerClient;
                        Object declaredConstructor2 = map2.get(2111093904);
                        if (declaredConstructor2 == null) {
                            declaredConstructor2 = ((Class) AFa1vSDK.getRevenue(TextUtils.indexOf((CharSequence) "", '0', 0) + 38, TextUtils.getTrimmedLength("") + 159, (char) (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredConstructor(Collection.class);
                            map2.put(2111093904, declaredConstructor2);
                        }
                        return ((Constructor) declaredConstructor2).newInstance(objArr2);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                if (obj.getClass().isArray()) {
                    try {
                        Object[] objArr3 = {obj};
                        Map map3 = AFa1vSDK.registerClient;
                        Object declaredConstructor3 = map3.get(417025157);
                        if (declaredConstructor3 == null) {
                            declaredConstructor3 = ((Class) AFa1vSDK.getRevenue(37 - (Process.myPid() >> 22), (-16777057) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Object.class);
                            map3.put(417025157, declaredConstructor3);
                        }
                        return ((Constructor) declaredConstructor3).newInstance(objArr3);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
                if (obj instanceof Map) {
                    return new AFa1lSDK((Map) obj);
                }
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            } catch (Exception unused) {
            }
            return null;
        } catch (AFa1gSDK unused2) {
        }
    }

    public final AFa1lSDK getCurrencyIso4217Code(String str, Object obj) throws Throwable {
        if (obj == null) {
            this.getMediationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1vSDK.registerClient;
                Object method = map.get(-1977863553);
                if (method == null) {
                    method = ((Class) AFa1vSDK.getRevenue(37 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 122, (char) (22434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)))).getMethod("getRevenue", Double.TYPE);
                    map.put(-1977863553, method);
                }
                ((Double) ((Method) method).invoke(null, objArr)).doubleValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getMediationNetwork;
        if (str == null) {
            throw new AFa1gSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public final String toString() {
        try {
            AFa1kSDK aFa1kSDK = new AFa1kSDK();
            getCurrencyIso4217Code(aFa1kSDK);
            return aFa1kSDK.toString();
        } catch (AFa1gSDK unused) {
            return null;
        }
    }

    private AFa1lSDK(Object obj) throws Throwable {
        try {
            Map map = AFa1vSDK.registerClient;
            Object declaredMethod = map.get(-807770607);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1vSDK.getRevenue(Color.green(0) + 37, (ViewConfiguration.getLongPressTimeout() >> 16) + 196, (char) (KeyEvent.normalizeMetaState(0) + 2457))).getDeclaredMethod("getMonetizationNetwork", null);
                map.put(-807770607, declaredMethod);
            }
            Object objInvoke = ((Method) declaredMethod).invoke(obj, null);
            if (objInvoke instanceof AFa1lSDK) {
                this.getMediationNetwork = ((AFa1lSDK) objInvoke).getMediationNetwork;
                return;
            }
            Object[] objArr = {objInvoke, "AFJsonObject"};
            Object declaredMethod2 = map.get(1756973990);
            if (declaredMethod2 == null) {
                declaredMethod2 = ((Class) AFa1vSDK.getRevenue(38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 122, (char) (22433 - TextUtils.lastIndexOf("", '0')))).getDeclaredMethod("getCurrencyIso4217Code", Object.class, String.class);
                map.put(1756973990, declaredMethod2);
            }
            throw ((Throwable) ((Method) declaredMethod2).invoke(null, objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static String getCurrencyIso4217Code(Number number) throws Throwable {
        if (number == null) {
            throw new AFa1gSDK("Number must be non-null");
        }
        double dDoubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(dDoubleValue)};
            Map map = AFa1vSDK.registerClient;
            Object declaredMethod = map.get(-1977863553);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1vSDK.getRevenue(37 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 123 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (22433 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)))).getDeclaredMethod("getRevenue", Double.TYPE);
                map.put(-1977863553, declaredMethod);
            }
            ((Double) ((Method) declaredMethod).invoke(null, objArr)).doubleValue();
            if (number.equals(getRevenue)) {
                return "-0";
            }
            long jLongValue = number.longValue();
            return dDoubleValue == ((double) jLongValue) ? Long.toString(jLongValue) : number.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFa1lSDK(String str) throws Throwable {
        try {
            Object[] objArr = {str};
            Map map = AFa1vSDK.registerClient;
            Object declaredConstructor = map.get(-1479677238);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1vSDK.getRevenue(View.MeasureSpec.getSize(0) + 37, 195 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 2458))).getDeclaredConstructor(String.class);
                map.put(-1479677238, declaredConstructor);
            }
            this(((Constructor) declaredConstructor).newInstance(objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static String getCurrencyIso4217Code(String str) throws AFa1gSDK {
        if (str != null) {
            return str;
        }
        throw new AFa1gSDK("Names must be non-null");
    }

    public AFa1lSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("key == null");
            }
            this.getMediationNetwork.put(str, AFAdRevenueData(entry.getValue()));
        }
    }

    public final void getCurrencyIso4217Code(AFa1kSDK aFa1kSDK) {
        aFa1kSDK.AFAdRevenueData(AFa1kSDK.AFa1ySDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMediationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new AFa1gSDK("Names must be non-null");
            }
            aFa1kSDK.getCurrencyIso4217Code();
            aFa1kSDK.getMediationNetwork(key);
            aFa1kSDK.getMonetizationNetwork(entry.getValue());
        }
        aFa1kSDK.AFAdRevenueData(AFa1kSDK.AFa1ySDK.EMPTY_OBJECT, AFa1kSDK.AFa1ySDK.NONEMPTY_OBJECT, "}");
    }
}
