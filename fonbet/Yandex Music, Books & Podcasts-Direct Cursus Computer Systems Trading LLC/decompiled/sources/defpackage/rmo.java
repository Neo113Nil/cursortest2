package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class rmo {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(13);
        a = hashMap;
        hashMap.put("normal", 400);
        hashMap.put("bold", 700);
        su4.u(1, hashMap, "bolder", -1, "lighter");
        su4.u(100, hashMap, "100", 200, "200");
        hashMap.put("300", 300);
        hashMap.put("400", 400);
        su4.u(500, hashMap, "500", 600, "600");
        su4.w(hashMap, "700", 700, 800, "800");
        hashMap.put("900", 900);
    }
}
