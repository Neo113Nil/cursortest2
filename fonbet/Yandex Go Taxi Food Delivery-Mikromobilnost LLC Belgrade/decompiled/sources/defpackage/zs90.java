package defpackage;

import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes2.dex */
public final class zs90 {
    public final gym a;
    public final at90 b;
    public final jln c;

    public zs90(gym gymVar, at90 at90Var, jln jlnVar) {
        this.a = gymVar;
        this.b = at90Var;
        this.c = jlnVar;
    }

    public static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        hashMap.putAll((Map) this.b.a().a);
        hashMap.putAll(((uxd) this.c.b).a);
        ((ped0) ((jdj) this.a.a).w).b(new tbd0(PlusPayEvent$Type.CLIENT, str, hashMap, (Throwable) null));
    }
}
