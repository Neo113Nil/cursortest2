package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class sk6 {
    public int a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public final int a(geh gehVar) {
        gehVar.getClass();
        HashMap hashMap = this.c;
        Integer num = (Integer) hashMap.get(gehVar);
        if (num != null) {
            return num.intValue();
        }
        int i = this.a;
        this.a = i + 1;
        this.b.put(Integer.valueOf(i), gehVar);
        hashMap.put(gehVar, Integer.valueOf(i));
        return i;
    }
}
