package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.AFa1kSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFa1lSDK {
    public static final Object AFAdRevenueData = new Object() { // from class: com.appsflyer.internal.AFa1lSDK.1
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return Objects.hashCode(null);
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

    private AFa1lSDK(Object obj) throws AFa1gSDK {
        try {
            Object obj2 = AFa1vSDK.registerClient.get(-807770607);
            if (obj2 == null) {
                obj2 = ((Class) AFa1vSDK.getRevenue(Color.green(0) + 37, (ViewConfiguration.getLongPressTimeout() >> 16) + 196, (char) (KeyEvent.normalizeMetaState(0) + 2457))).getDeclaredMethod("getMonetizationNetwork", null);
                AFa1vSDK.registerClient.put(-807770607, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (invoke instanceof AFa1lSDK) {
                this.getMediationNetwork = ((AFa1lSDK) invoke).getMediationNetwork;
                return;
            }
            Object[] objArr = {invoke, "AFJsonObject"};
            Object obj3 = AFa1vSDK.registerClient.get(1756973990);
            if (obj3 == null) {
                obj3 = ((Class) AFa1vSDK.getRevenue(38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 122, (char) (22433 - TextUtils.lastIndexOf("", '0')))).getDeclaredMethod("getCurrencyIso4217Code", Object.class, String.class);
                AFa1vSDK.registerClient.put(1756973990, obj3);
            }
            throw ((Throwable) ((Method) obj3).invoke(null, objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFa1lSDK(String str) throws AFa1gSDK {
        this(((Constructor) r1).newInstance(r7));
        try {
            Object[] objArr = {str};
            Object obj = AFa1vSDK.registerClient.get(-1479677238);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue(View.MeasureSpec.getSize(0) + 37, 195 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 2458))).getDeclaredConstructor(String.class);
                AFa1vSDK.registerClient.put(-1479677238, obj);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static String getCurrencyIso4217Code(Number number) throws AFa1gSDK {
        if (number == null) {
            throw new AFa1gSDK("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(doubleValue)};
            Object obj = AFa1vSDK.registerClient.get(-1977863553);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.getRevenue(37 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 123 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (22433 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)))).getDeclaredMethod("getRevenue", Double.TYPE);
                AFa1vSDK.registerClient.put(-1977863553, obj);
            }
            ((Double) ((Method) obj).invoke(null, objArr)).doubleValue();
            if (number.equals(getRevenue)) {
                return "-0";
            }
            long longValue = number.longValue();
            if (doubleValue == longValue) {
                return Long.toString(longValue);
            }
            return number.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AFAdRevenueData(Object obj) {
        if (obj == null) {
            return AFAdRevenueData;
        }
        if (((Class) AFa1vSDK.getRevenue((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, TextUtils.lastIndexOf("", '0') + 160, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1))).isInstance(obj) || (obj instanceof AFa1lSDK)) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Object obj2 = AFa1vSDK.registerClient.get(2121538775);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1vSDK.getRevenue((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 160 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22))).getDeclaredConstructor(String.class);
                    AFa1vSDK.registerClient.put(2121538775, obj2);
                }
                obj = ((Constructor) obj2).newInstance(objArr);
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
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Object obj3 = AFa1vSDK.registerClient.get(2111093904);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1vSDK.getRevenue(TextUtils.indexOf((CharSequence) "", '0', 0) + 38, TextUtils.getTrimmedLength("") + 159, (char) (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredConstructor(Collection.class);
                    AFa1vSDK.registerClient.put(2111093904, obj3);
                }
                return ((Constructor) obj3).newInstance(objArr2);
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
                Object obj4 = AFa1vSDK.registerClient.get(417025157);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1vSDK.getRevenue(37 - (Process.myPid() >> 22), (-16777057) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Object.class);
                    AFa1vSDK.registerClient.put(417025157, obj4);
                }
                return ((Constructor) obj4).newInstance(objArr3);
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
        return null;
    }

    public final AFa1lSDK getCurrencyIso4217Code(String str, Object obj) throws AFa1gSDK {
        if (obj == null) {
            this.getMediationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Object obj2 = AFa1vSDK.registerClient.get(-1977863553);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1vSDK.getRevenue(37 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 122, (char) (22434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)))).getMethod("getRevenue", Double.TYPE);
                    AFa1vSDK.registerClient.put(-1977863553, obj2);
                }
                ((Double) ((Method) obj2).invoke(null, objArr)).doubleValue();
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

    static String getCurrencyIso4217Code(String str) throws AFa1gSDK {
        if (str != null) {
            return str;
        }
        throw new AFa1gSDK("Names must be non-null");
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

    final void getCurrencyIso4217Code(AFa1kSDK aFa1kSDK) throws AFa1gSDK {
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
