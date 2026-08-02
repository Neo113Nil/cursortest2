package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import ru.yandex.music.utils.Assertions;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class vos {
    public final hq0 a;
    public final HashMap b = new HashMap();

    public vos(hq0 hq0Var) {
        this.a = hq0Var;
    }

    public final void a(Menu menu) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty()) {
            Timber.d("onCreateOptionsMenu(): menu is empty", new Object[0]);
            return;
        }
        for (uos uosVar : hashMap.values()) {
            for (int i : uosVar.a) {
                this.a.getMenuInflater().inflate(i, menu);
            }
            lum lumVar = uosVar.b;
            Set set = uosVar.c;
            ArrayList arrayList = (ArrayList) lumVar.b;
            HashMap hashMap2 = (HashMap) lumVar.a;
            hashMap2.clear();
            for (Object obj : set) {
                MenuItem findItem = menu.findItem(uosVar.d.b(obj).intValue());
                Assertions.assertNonNull(findItem, "fill(): view not found for item " + obj);
                if (findItem != null) {
                    hashMap2.put(obj, findItem);
                }
            }
            if (!arrayList.isEmpty()) {
                Timber.v("fill(): invoke %d pending actions", Integer.valueOf(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                arrayList.clear();
            }
            kd kdVar = (kd) lumVar.c;
            if (kdVar != null) {
                lumVar.j0(kdVar);
            }
        }
    }
}
