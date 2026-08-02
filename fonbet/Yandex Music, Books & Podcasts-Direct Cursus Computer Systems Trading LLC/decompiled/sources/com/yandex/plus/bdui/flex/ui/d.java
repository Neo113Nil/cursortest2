package com.yandex.plus.bdui.flex.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements f {
    public final Throwable a;
    public final p b;

    public d(p pVar, Throwable th) {
        th.getClass();
        this.a = th;
        this.b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p pVar = this.b;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        return "Failure(error=" + this.a + ", updateTask=" + this.b + ')';
    }
}
