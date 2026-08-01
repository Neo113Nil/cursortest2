package com.anythink.core.common.u;

import D.y;
import android.content.Context;
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
    private static volatile f f16549g;

    private f(Context context) {
        super(context);
    }

    public static f a(Context context) {
        if (f16549g == null) {
            synchronized (f.class) {
                try {
                    if (f16549g == null) {
                        f16549g = new f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16549g;
    }

    @Override // com.anythink.core.common.m
    public final void a(List<u> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a().toString());
        }
        com.anythink.core.d.b g4 = y.g(y.h());
        if (g4 != null) {
            if (g4.G() != 1) {
                com.anythink.core.common.m.d dVar = new com.anythink.core.common.m.d(this.f14394d, g4.G(), arrayList);
                dVar.s();
                dVar.a(0, (q) null);
                return;
            } else {
                com.anythink.core.common.m.d.a aVar = new com.anythink.core.common.m.d.a(arrayList);
                aVar.a(1, g4.F());
                aVar.a();
                aVar.a((d.a) null);
                return;
            }
        }
        com.anythink.core.common.m.d dVar2 = new com.anythink.core.common.m.d(this.f14394d, 0, arrayList);
        dVar2.s();
        dVar2.a(0, (q) null);
    }
}
