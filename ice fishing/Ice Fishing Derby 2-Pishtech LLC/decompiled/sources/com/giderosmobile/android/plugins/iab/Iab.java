package com.giderosmobile.android.plugins.iab;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class Iab {
    private static Hashtable<String, Boolean> consumables;
    private static Hashtable<String, IabInterface> iab;
    private static Hashtable<String, Hashtable<String, String>> products;
    private static WeakReference<Activity> sActivity;
    private static long sData;
    private static String[] stores = {"Google", "Amazon", "Ouya", "Samsung", "Fortumo", "Nokia"};

    private static native void onAvailable(String str, long j);

    private static native void onNotAvailable(String str, long j);

    private static native void onProductsComplete(String str, Object obj, long j);

    private static native void onProductsError(String str, String str2, long j);

    private static native void onPurchaseComplete(String str, String str2, String str3, long j);

    private static native void onPurchaseError(String str, String str2, long j);

    private static native void onRestoreComplete(String str, long j);

    private static native void onRestoreError(String str, String str2, long j);

    public static void onCreate(Activity activity) {
        sActivity = new WeakReference<>(activity);
        iab = new Hashtable<>();
        products = new Hashtable<>();
        consumables = new Hashtable<>();
        try {
            Class.forName("com.giderosmobile.android.plugins.iab.frameworks.IabAmazon").getMethod("onActivityCreate", Activity.class).invoke(null, activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onDestroy() {
        cleanup();
    }

    public static void onStart() {
        Iterator<IabInterface> it = iab.values().iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    public static void onActivityResult(int i, int i2, Intent intent) {
        Iterator<IabInterface> it = iab.values().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    public static Object detectStores(Object obj) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = (SparseArray) obj;
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            String str = (String) sparseArray2.get(i);
            if (checkStore(modifyName(str)).booleanValue()) {
                sparseArray.put(sparseArray.size(), str.toLowerCase());
            }
        }
        int length = stores.length;
        for (int i2 = 0; i2 < length; i2++) {
            int size2 = sparseArray.size();
            int i3 = 0;
            while (true) {
                if (i3 < size2) {
                    if (stores[i2].toLowerCase().equals(sparseArray.get(i3))) {
                        break;
                    }
                    i3++;
                } else if (checkStore(stores[i2]).booleanValue()) {
                    sparseArray.put(sparseArray.size(), stores[i2].toLowerCase());
                }
            }
        }
        return sparseArray;
    }

    private static Boolean checkStore(String str) {
        Class<?> cls;
        Method method;
        try {
            cls = Class.forName("com.giderosmobile.android.plugins.iab.frameworks.Iab" + str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return false;
        }
        try {
            method = cls.getMethod("isInstalled", null);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        try {
            return (Boolean) method.invoke(null, null);
        } catch (Exception unused3) {
            return false;
        }
    }

    public static void init(long j) {
        sData = j;
    }

    public static void cleanup() {
        sData = 0L;
        Iterator<IabInterface> it = iab.values().iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        iab.clear();
    }

    public static void initialize(String str) {
        Class<?> cls;
        String modifyName = modifyName(str);
        if (iab.get(modifyName) == null) {
            try {
                cls = Class.forName("com.giderosmobile.android.plugins.iab.frameworks.Iab" + modifyName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                cls = null;
            }
            try {
                iab.put(modifyName, (IabInterface) cls.newInstance());
                products.put(modifyName, new Hashtable<>());
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            }
            iab.get(modifyName).onCreate(sActivity);
        }
    }

    public static void destroy(String str) {
        String modifyName = modifyName(str);
        if (iab.get(modifyName) != null) {
            iab.get(modifyName).onDestroy();
            iab.remove(modifyName);
        }
    }

    public static void setup(String str, Object obj) {
        iab.get(modifyName(str)).init(obj);
    }

    public static void setProducts(String str, Object obj, Object obj2) {
        String modifyName = modifyName(str);
        SparseArray sparseArray = (SparseArray) obj;
        SparseArray sparseArray2 = (SparseArray) obj2;
        int size = sparseArray.size();
        Hashtable<String, String> hashtable = products.get(modifyName);
        for (int i = 0; i < size; i++) {
            hashtable.put((String) sparseArray.get(i), (String) sparseArray2.get(i));
        }
    }

    public static void setConsumables(String str, Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            consumables.put((String) sparseArray.get(i), true);
        }
    }

    public static void check(String str) {
        iab.get(modifyName(str)).check();
    }

    public static void request(final String str) {
        try {
            sActivity.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.plugins.iab.Iab.1
                @Override // java.lang.Runnable
                public void run() {
                    String modifyName = Iab.modifyName(str);
                    if (modifyName != null) {
                        ((IabInterface) Iab.iab.get(modifyName)).request((Hashtable) Iab.products.get(modifyName));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void purchase(final String str, final String str2) {
        try {
            sActivity.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.plugins.iab.Iab.2
                @Override // java.lang.Runnable
                public void run() {
                    String modifyName = Iab.modifyName(str);
                    ((IabInterface) Iab.iab.get(modifyName)).purchase((String) ((Hashtable) Iab.products.get(modifyName)).get(str2));
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void restore(final String str) {
        try {
            sActivity.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.plugins.iab.Iab.3
                @Override // java.lang.Runnable
                public void run() {
                    ((IabInterface) Iab.iab.get(Iab.modifyName(str))).restore();
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void available(Object obj) {
        if (sData != 0) {
            onAvailable(getCallerName(obj), sData);
        }
    }

    public static void notAvailable(Object obj) {
        if (sData != 0) {
            onNotAvailable(getCallerName(obj), sData);
        }
    }

    public static void purchaseComplete(Object obj, String str, String str2) {
        if (sData != 0) {
            onPurchaseComplete(getCallerName(obj), getKey(str, obj), str2, sData);
        }
    }

    public static void purchaseError(Object obj, String str) {
        if (sData != 0) {
            onPurchaseError(getCallerName(obj), str, sData);
        }
    }

    public static void productsComplete(Object obj, SparseArray<Bundle> sparseArray) {
        if (sData != 0) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Bundle bundle = sparseArray.get(i);
                bundle.putString("productId", getKey(bundle.getString("productId"), obj));
            }
            onProductsComplete(getCallerName(obj), sparseArray, sData);
        }
    }

    public static void productsError(Object obj, String str) {
        if (sData != 0) {
            onProductsError(getCallerName(obj), str, sData);
        }
    }

    public static void restoreComplete(Object obj) {
        if (sData != 0) {
            onRestoreComplete(getCallerName(obj), sData);
        }
    }

    public static void restoreError(Object obj, String str) {
        if (sData != 0) {
            onRestoreError(getCallerName(obj), str, sData);
        }
    }

    public static boolean isPackageInstalled(String str) {
        try {
            sActivity.get().getApplication().getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static Hashtable<String, String> getProducts(Object obj) {
        return products.get(modifyName(getCallerName(obj)));
    }

    private static String getValue(String str, Object obj) {
        return getProducts(obj).get(str);
    }

    private static String getKey(String str, Object obj) {
        for (Map.Entry<String, String> entry : getProducts(obj).entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static boolean isConsumable(String str, Object obj) {
        return consumables.containsKey(getKey(str, obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String modifyName(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private static String getCallerName(Object obj) {
        String replace = obj.getClass().getName().replace("com.giderosmobile.android.plugins.iab.frameworks.Iab", "");
        if (replace.contains("$")) {
            replace = replace.substring(0, replace.indexOf("$"));
        }
        return replace.toLowerCase();
    }
}
