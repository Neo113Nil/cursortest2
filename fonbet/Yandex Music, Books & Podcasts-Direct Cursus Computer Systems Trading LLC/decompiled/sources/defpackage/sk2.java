package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class sk2 {
    public static final x2i b = new x2i(15);
    public static volatile sk2 c;
    public final SharedPreferences a;

    public sk2(SharedPreferences sharedPreferences, int i) {
        switch (i) {
            case 2:
                sharedPreferences.getClass();
                this.a = sharedPreferences;
                break;
            default:
                this.a = sharedPreferences;
                break;
        }
    }

    public LinkedHashMap a() {
        Map<String, ?> all = this.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            value.getClass();
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public sk2() {
        SharedPreferences sharedPreferences = j3c.b().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }
}
