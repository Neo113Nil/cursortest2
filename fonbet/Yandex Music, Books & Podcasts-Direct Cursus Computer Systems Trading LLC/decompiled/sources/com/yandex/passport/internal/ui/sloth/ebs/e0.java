package com.yandex.passport.internal.ui.sloth.ebs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 implements h0 {
    public final k1 a;
    public final com.yandex.passport.sloth.data.m b;

    public e0(k1 k1Var, com.yandex.passport.sloth.data.m mVar) {
        mVar.getClass();
        this.a = k1Var;
        this.b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a.equals(e0Var.a) && Intrinsics.d(this.b, e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetEbsProcessState(newState=" + this.a + ", params=" + this.b + ')';
    }
}
