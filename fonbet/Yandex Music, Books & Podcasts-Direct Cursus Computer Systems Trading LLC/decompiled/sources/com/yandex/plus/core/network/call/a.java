package com.yandex.plus.core.network.call;

import com.yandex.plus.core.network.error.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements c {
    public final l a;

    public a(l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ')';
    }
}
