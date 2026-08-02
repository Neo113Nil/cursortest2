package com.yandex.plus.bdui.plus.action;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w implements x {
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return Intrinsics.d(this.a, ((w) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.a + ')';
    }
}
