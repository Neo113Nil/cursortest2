package com.yandex.plus.bdui.action;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements g {
    public final a a;
    public final com.yandex.plus.bdui.shared.b b;

    public f(a aVar, com.yandex.plus.bdui.shared.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b);
    }

    public final int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        com.yandex.plus.bdui.shared.b bVar = this.b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "Feedback(action=" + this.a + ", shared=" + this.b + ')';
    }
}
