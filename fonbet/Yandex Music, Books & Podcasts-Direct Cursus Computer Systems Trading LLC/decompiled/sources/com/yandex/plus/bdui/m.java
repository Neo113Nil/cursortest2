package com.yandex.plus.bdui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m {
    public final com.yandex.plus.bdui.action.c a;

    public m(com.yandex.plus.bdui.action.c cVar) {
        cVar.getClass();
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EngineContext(actionDispatcher=" + this.a + ')';
    }
}
