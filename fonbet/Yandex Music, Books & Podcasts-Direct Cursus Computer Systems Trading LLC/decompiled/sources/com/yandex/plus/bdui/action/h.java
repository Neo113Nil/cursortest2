package com.yandex.plus.bdui.action;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {
    public final com.yandex.plus.bdui.shared.b a;

    public h(com.yandex.plus.bdui.shared.b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DocumentContext(shared=" + this.a + ')';
    }
}
