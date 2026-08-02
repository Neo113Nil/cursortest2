package com.yandex.passport.internal.core.linkage;

import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.core.accounts.e;
import com.yandex.passport.internal.h;
import com.yandex.passport.internal.i;
import com.yandex.passport.internal.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {
    public final e a;
    public final com.yandex.passport.common.a b;

    public a(e eVar, com.yandex.passport.common.a aVar) {
        this.a = eVar;
        this.b = aVar;
    }

    public final l a(f fVar) {
        com.yandex.passport.internal.d a = this.a.a();
        l e = a.e(fVar);
        if (e == null) {
            throw new com.yandex.passport.api.exception.b(fVar);
        }
        List<i> h = a.h(e);
        if (h.size() == 0) {
            return null;
        }
        for (i iVar : h) {
            h hVar = iVar.b.i;
            f fVar2 = iVar.c.b;
            this.b.getClass();
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            ArrayList arrayList = hVar.c;
            fVar2.getClass();
            if (hVar.a == 3 && hVar.d.contains(fVar2)) {
                int size = arrayList.size();
                int size2 = hVar.b.size();
                if (size != 0) {
                    if (size > size2) {
                        continue;
                    } else {
                        int i = size - 1;
                        if (currentTimeMillis >= ((Number) hVar.b.get(i)).intValue() + ((Number) arrayList.get(i)).intValue()) {
                        }
                    }
                }
                return iVar.a;
            }
        }
        return null;
    }
}
