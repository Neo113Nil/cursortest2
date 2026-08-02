package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.a;

/* loaded from: classes.dex */
public final class s701 {
    public final Context a;
    public final i3y b = a.a(new oay0(5, this));

    public s701(Context context) {
        this.a = context;
    }

    public final synchronized long a(String str) {
        long longValue;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) ((m1r) this.b.getValue()).a(new LinkedHashMap()));
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = Long.valueOf(vng.I());
                linkedHashMap.put(str, obj);
            }
            longValue = ((Number) obj).longValue();
            ((m1r) this.b.getValue()).set(linkedHashMap);
        } catch (Throwable th) {
            throw th;
        }
        return longValue;
    }

    public final synchronized void b(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) ((m1r) this.b.getValue()).a(new LinkedHashMap()));
        linkedHashMap.remove(str);
        ((m1r) this.b.getValue()).set(linkedHashMap);
    }
}
