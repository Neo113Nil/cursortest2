package com.yandex.passport.internal.ui.challenge.delete;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z {
    public final w a;
    public final v1 b;

    public z(w wVar, v1 v1Var) {
        this.a = wVar;
        this.b = v1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.a, zVar.a) && Intrinsics.d(this.b, zVar.b);
    }

    public final int hashCode() {
        w wVar = this.a;
        int hashCode = (wVar == null ? 0 : wVar.hashCode()) * 31;
        v1 v1Var = this.b;
        return hashCode + (v1Var != null ? v1Var.hashCode() : 0);
    }

    public final String toString() {
        return "State(deleteMode=" + this.a + ", result=" + this.b + ')';
    }
}
