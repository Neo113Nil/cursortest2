package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class dah extends eah {
    public final LinkedHashMap a;
    public String b = null;

    public dah(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Map ("), this.b, ')');
    }
}
