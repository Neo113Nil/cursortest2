package defpackage;

import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.taxi.preorder.source.cars.a;

/* loaded from: classes14.dex */
public final class wz8 {
    public final uz8 a;
    public final a b;
    public final pav c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public wz8(uz8 uz8Var, a aVar, pav pavVar) {
        this.a = uz8Var;
        this.b = aVar;
        this.c = pavVar;
    }

    public final ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((ImageProvider) this.a.b.get(((m58) obj).b.a)) != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b(String str, boolean z) {
        ConcurrentHashMap concurrentHashMap = this.d;
        if (z || (((ImageProvider) this.a.b.get(str)) == null && !concurrentHashMap.containsKey(str))) {
            if (z) {
                concurrentHashMap.remove(str);
            }
            concurrentHashMap.computeIfAbsent(str, new yu0(3, new vz8(this, str, 0)));
        }
    }
}
