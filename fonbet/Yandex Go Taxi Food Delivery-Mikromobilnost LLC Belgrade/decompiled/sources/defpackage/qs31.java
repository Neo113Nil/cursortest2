package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class qs31 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((yr31) it.next()).T();
        }
        linkedHashMap.clear();
    }
}
