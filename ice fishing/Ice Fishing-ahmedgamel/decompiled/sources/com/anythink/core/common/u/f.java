package com.anythink.core.common.u;

import android.content.Context;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.h.u;
import com.anythink.core.common.m;
import com.anythink.core.common.m.d.d;
import com.anythink.core.common.m.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f extends m<u> {

    /* renamed from: g, reason: collision with root package name */
    private static volatile f f17336g;

    private f(Context context) {
        super(context);
    }

    public static f a(Context context) {
        if (f17336g == null) {
            synchronized (f.class) {
                try {
                    if (f17336g == null) {
                        f17336g = new f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17336g;
    }

    @Override // com.anythink.core.common.m
    public final void a(List<u> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a().toString());
        }
        com.anythink.core.d.b k9 = k.k(k.l());
        if (k9 != null) {
            if (k9.G() != 1) {
                com.anythink.core.common.m.d dVar = new com.anythink.core.common.m.d(this.f15180d, k9.G(), arrayList);
                dVar.s();
                dVar.a(0, (q) null);
                return;
            } else {
                com.anythink.core.common.m.d.a aVar = new com.anythink.core.common.m.d.a(arrayList);
                aVar.a(1, k9.F());
                aVar.a();
                aVar.a((d.a) null);
                return;
            }
        }
        com.anythink.core.common.m.d dVar2 = new com.anythink.core.common.m.d(this.f15180d, 0, arrayList);
        dVar2.s();
        dVar2.a(0, (q) null);
    }
}
