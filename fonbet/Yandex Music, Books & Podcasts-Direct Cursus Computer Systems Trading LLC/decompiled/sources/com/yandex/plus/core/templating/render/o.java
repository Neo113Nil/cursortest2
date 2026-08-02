package com.yandex.plus.core.templating.render;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements y {
    public final List a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return Intrinsics.d(this.a, ((o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Array(value=" + this.a + ')';
    }
}
