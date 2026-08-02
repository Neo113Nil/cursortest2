package com.yandex.plus.core.templating.render;

import defpackage.ouj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class e0 implements f0 {
    public final String a;

    @Override // com.yandex.plus.core.templating.render.f0
    public final String a(Map map) {
        map.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return this.a.equals(((e0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "Value(value=", this.a);
    }
}
