package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class wgu {
    public abstract void a();

    public abstract List b();

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        for (ygu yguVar : b()) {
            hashMap.put(yguVar.a, Long.valueOf(yguVar.b));
        }
        return hashMap;
    }

    public abstract Long d(String str);

    public abstract void e(ArrayList arrayList);
}
