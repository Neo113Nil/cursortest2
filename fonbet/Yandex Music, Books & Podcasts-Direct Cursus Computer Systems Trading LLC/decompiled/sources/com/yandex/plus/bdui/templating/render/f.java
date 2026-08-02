package com.yandex.plus.bdui.templating.render;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements g {
    public final Object a;

    @Override // com.yandex.plus.bdui.templating.render.g
    public final Object a(Map map) {
        map.getClass();
        map.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Intrinsics.d(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.a + ')';
    }
}
