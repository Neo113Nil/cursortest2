package com.yandex.plus.bdui.templating.render;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class e implements g {
    public final ArrayList a;

    public /* synthetic */ e(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.yandex.plus.bdui.templating.render.g
    public final Object a(Map map) {
        map.getClass();
        return r1.C(this.a, map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Template(template=" + this.a + ')';
    }
}
