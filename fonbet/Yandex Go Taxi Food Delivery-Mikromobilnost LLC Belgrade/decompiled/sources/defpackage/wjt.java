package defpackage;

import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.internal.search.GlobalSearchRecentItems$PersistModel;
import com.yandex.messaging.internal.search.a;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class wjt {
    public final u1n a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public wjt(u1n u1nVar) {
        this.a = u1nVar;
    }

    public final void a(long j, tjt tjtVar) {
        r0 r0Var;
        Object value;
        vjt vjtVar;
        Long valueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.b;
        a aVar = (a) concurrentHashMap.get(valueOf);
        if (aVar == null) {
            u1n u1nVar = this.a;
            aVar = new a((SharedPreferences) u1nVar.b, (gym) u1nVar.c, qv10.j(j, "recents_key "));
            a aVar2 = (a) concurrentHashMap.putIfAbsent(Long.valueOf(j), aVar);
            if (aVar2 != null) {
                aVar = aVar2;
            }
        }
        pz40 pz40Var = (pz40) aVar.d.getValue();
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
            vjt vjtVar2 = (vjt) value;
            vjtVar2.getClass();
            LinkedList linkedList = new LinkedList(vjtVar2);
            vjtVar = new vjt(linkedList);
            int indexOf = vjtVar.indexOf(tjtVar);
            if (indexOf != -1) {
                linkedList.remove(indexOf);
                linkedList.addFirst(tjtVar);
            } else {
                if (linkedList.size() == 5) {
                    linkedList.removeLast();
                }
                linkedList.addFirst(tjtVar);
            }
            SharedPreferences.Editor edit = aVar.a.edit();
            String str = aVar.c;
            gym gymVar = aVar.b;
            gymVar.getClass();
            tje.f();
            edit.putString(str, ((Moshi) gymVar.a).adapter(GlobalSearchRecentItems$PersistModel.class).toJson(new GlobalSearchRecentItems$PersistModel(vjtVar)));
            edit.apply();
        } while (!r0Var.k(value, vjtVar));
    }
}
