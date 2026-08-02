package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class qmo {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(9);
        a = hashMap;
        hashMap.put("xx-small", new rko(7, 0.694f));
        hashMap.put("x-small", new rko(7, 0.833f));
        hashMap.put("small", new rko(7, 10.0f));
        hashMap.put("medium", new rko(7, 12.0f));
        hashMap.put("large", new rko(7, 14.4f));
        hashMap.put("x-large", new rko(7, 17.3f));
        hashMap.put("xx-large", new rko(7, 20.7f));
        hashMap.put("smaller", new rko(9, 83.33f));
        hashMap.put("larger", new rko(9, 120.0f));
    }
}
