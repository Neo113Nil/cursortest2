package com.yandex.plus.bdui.failure;

import com.yandex.plus.bdui.action.k;
import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements d, k {
    public final Throwable a;

    public c(Throwable th) {
        th.getClass();
        this.a = th;
    }

    @Override // com.yandex.plus.bdui.action.k
    public final com.yandex.plus.bdui.action.a a() {
        Object obj = this.a;
        k kVar = obj instanceof k ? (k) obj : null;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("ExceptionFailure(cause="), this.a, ')');
    }
}
