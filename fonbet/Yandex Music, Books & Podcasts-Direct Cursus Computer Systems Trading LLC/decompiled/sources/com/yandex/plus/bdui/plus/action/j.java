package com.yandex.plus.bdui.plus.action;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements com.yandex.plus.bdui.action.a {
    public final com.yandex.plus.bdui.failure.d a;

    public j(com.yandex.plus.bdui.failure.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlusFailureAction(failure=" + this.a + ')';
    }
}
