package com.yandex.plus.core.templating.template;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class f implements g {
    public final Class a;
    public final boolean b;
    public final ArrayList c;

    public f(Class cls, boolean z, ArrayList arrayList) {
        this.a = cls;
        this.b = z;
        this.c = arrayList;
    }

    @Override // com.yandex.plus.core.templating.template.g
    public final Object a(Map map) {
        Object t7oVar;
        map.getClass();
        ArrayList arrayList = this.c;
        if (arrayList.size() != 1 || !(CollectionsKt.Q(arrayList) instanceof c)) {
            return r1.C(arrayList, map);
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = r1.C(arrayList, map);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return t7oVar;
        }
        if (this.b) {
            return null;
        }
        throw a;
    }

    @Override // com.yandex.plus.core.templating.template.g
    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.c) {
            if (obj instanceof c) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.yandex.plus.core.templating.template.g
    public final Class c() {
        return this.a;
    }
}
