package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tee {
    public static final tee f = new tee();
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();
    public static final String c = j3c.b().getPackageName();
    public static final SharedPreferences d = j3c.b().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    public static final SharedPreferences e = j3c.b().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (bp6.a.contains(tee.class)) {
            return null;
        }
        try {
            context.getClass();
            tee teeVar = f;
            return teeVar.a(teeVar.e(context, obj, "inapp"));
        } catch (Throwable th) {
            bp6.a(tee.class, th);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        SharedPreferences sharedPreferences = e;
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            long j = 1000;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j2 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j2 / j) <= 86400 && !Intrinsics.d(sharedPreferences.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
                j = 1000;
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final Class b(Context context, String str) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            HashMap hashMap = b;
            Class<?> cls = (Class) hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            try {
                cls = context.getClassLoader().loadClass(str);
                cls.getClass();
                hashMap.put(str, cls);
                return cls;
            } catch (ClassNotFoundException unused) {
                return cls;
            }
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method c(String str, Class cls) {
        Class[] clsArr;
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            HashMap hashMap = a;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            try {
                int hashCode = str.hashCode();
                Class cls2 = Integer.TYPE;
                switch (hashCode) {
                    case -1801122596:
                        if (str.equals("getPurchases")) {
                            cls2.getClass();
                            clsArr = new Class[]{cls2, String.class, String.class, String.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    case -1450694211:
                        if (str.equals("isBillingSupported")) {
                            cls2.getClass();
                            clsArr = new Class[]{cls2, String.class, String.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    case -1123215065:
                        if (str.equals("asInterface")) {
                            clsArr = new Class[]{IBinder.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    case -594356707:
                        if (str.equals("getPurchaseHistory")) {
                            cls2.getClass();
                            clsArr = new Class[]{cls2, String.class, String.class, String.class, Bundle.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    case -573310373:
                        if (str.equals("getSkuDetails")) {
                            cls2.getClass();
                            clsArr = new Class[]{cls2, String.class, String.class, Bundle.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    default:
                        clsArr = null;
                        break;
                }
                method = clsArr == null ? cls.getDeclaredMethod(str, null) : cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                hashMap.put(str, method);
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final ArrayList d(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Context context2 = context;
            Object obj2 = obj;
            if (i(context2, obj2, "inapp")) {
                int i = 0;
                boolean z = false;
                String str = null;
                while (true) {
                    Object h = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj2, new Object[]{6, c, "inapp", str, new Bundle()});
                    if (h != null) {
                        long j = 1000;
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) h;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / j) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                                j = 1000;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i < 30 || str == null || z) {
                                break;
                                break;
                            }
                            context2 = context;
                            obj2 = obj;
                        }
                    }
                    str = null;
                    if (i < 30) {
                        break;
                    }
                    context2 = context;
                    obj2 = obj;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final ArrayList e(Context context, Object obj, String str) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && i(context, obj, str)) {
                int i = 0;
                String str2 = null;
                while (true) {
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object h = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, c, str, str2});
                        if (h != null) {
                            Bundle bundle = (Bundle) h;
                            if (bundle.getInt("RESPONSE_CODE") == 0) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                if (stringArrayList == null) {
                                    break;
                                }
                                i += stringArrayList.size();
                                arrayList.addAll(stringArrayList);
                                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                if (i < 30 || str2 == null) {
                                    break;
                                    break;
                                }
                                context = context2;
                                obj = obj2;
                            }
                        }
                        str2 = null;
                        if (i < 30) {
                            break;
                        }
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th) {
                        th = th;
                        bp6.a(this, th);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                try {
                    Object h = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, c, z ? "subs" : "inapp", bundle});
                    if (h != null) {
                        Bundle bundle2 = (Bundle) h;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    Object obj2 = arrayList.get(i);
                                    obj2.getClass();
                                    String str = stringArrayList.get(i);
                                    str.getClass();
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            k(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bp6.a(this, th);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method c2;
        if (!bp6.a.contains(this)) {
            try {
                Class b2 = b(context, str);
                if (b2 != null && (c2 = c(str2, b2)) != null) {
                    if (obj != null) {
                        obj = b2.cast(obj);
                    }
                    try {
                        return c2.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str) {
        if (!bp6.a.contains(this) && obj != null) {
            try {
                try {
                    Object h = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, c, str});
                    if (h != null) {
                        if (((Integer) h).intValue() == 0) {
                            return true;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bp6.a(this, th);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        List split$default;
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = d.getString(str, null);
                if (string != null) {
                    split$default = StringsKt__StringsKt.split$default(string, new String[]{";"}, false, 2, 2, null);
                    if (currentTimeMillis - Long.parseLong((String) split$default.get(0)) < 43200) {
                        str.getClass();
                        linkedHashMap.put(str, split$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = d.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
