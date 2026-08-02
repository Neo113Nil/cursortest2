package com.yandex.plus.core.templating.render;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d0 implements f0 {
    public final ArrayList a;

    @Override // com.yandex.plus.core.templating.render.f0
    public final String a(Map map) {
        map.getClass();
        return r1.C(this.a, map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.a.equals(((d0) obj).a);
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
