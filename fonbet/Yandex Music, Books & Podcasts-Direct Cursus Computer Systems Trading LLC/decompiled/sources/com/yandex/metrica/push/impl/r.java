package com.yandex.metrica.push.impl;

import android.content.Context;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.core.PushServiceController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class r {
    private final Context a;
    private final Collection<PushServiceController> b;
    private final Collection<String> c;

    public r(Context context, Collection<PushServiceController> collection) {
        this.a = context;
        this.b = Collections.unmodifiableList(new ArrayList(collection));
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<PushServiceController> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTitle());
        }
        this.c = Collections.unmodifiableList(arrayList);
    }

    public Collection<String> a() {
        return this.c;
    }

    public Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (PushServiceController pushServiceController : this.b) {
            hashMap.put(pushServiceController.getTitle(), pushServiceController.getToken());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public void c() {
        Iterator<PushServiceController> it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= it.next().register();
        }
        if (z) {
            PushServiceFacade.initToken(this.a);
        }
    }
}
