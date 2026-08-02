package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class mlk implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    public final HashMap a;

    public mlk(HashMap hashMap) {
        hashMap.getClass();
        HashMap hashMap2 = new HashMap();
        this.a = hashMap2;
        hashMap2.putAll(hashMap);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            return new llk(this.a);
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final void a(la laVar, List list) {
        HashMap hashMap = this.a;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            list.getClass();
            if (!hashMap.containsKey(laVar)) {
                hashMap.put(laVar, new ArrayList(list));
                return;
            }
            List list2 = (List) hashMap.get(laVar);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public mlk() {
        this.a = new HashMap();
    }
}
