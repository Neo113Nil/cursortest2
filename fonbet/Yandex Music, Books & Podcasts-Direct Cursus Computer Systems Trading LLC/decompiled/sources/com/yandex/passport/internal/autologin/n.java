package com.yandex.passport.internal.autologin;

import defpackage.gl5;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class n implements Comparator {
    public final /* synthetic */ Map a;

    public n(Map map) {
        this.a = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.yandex.passport.common.core.f fVar = ((c) obj2).a;
        Map map = this.a;
        List list = (List) map.get(fVar);
        Integer valueOf = Integer.valueOf(list != null ? list.size() : 0);
        List list2 = (List) map.get(((c) obj).a);
        return gl5.b(valueOf, Integer.valueOf(list2 != null ? list2.size() : 0));
    }
}
