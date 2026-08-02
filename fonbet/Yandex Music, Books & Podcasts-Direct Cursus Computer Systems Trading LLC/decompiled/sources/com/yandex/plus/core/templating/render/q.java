package com.yandex.plus.core.templating.render;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements y {
    public final Map a;

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return Intrinsics.d(this.a, ((q) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Dict(value=" + this.a + ')';
    }
}
