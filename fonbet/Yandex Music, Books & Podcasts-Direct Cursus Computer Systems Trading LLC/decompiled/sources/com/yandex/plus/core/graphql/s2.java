package com.yandex.plus.core.graphql;

import defpackage.q6n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s2 implements q6n {
    public final t2 a;

    public s2(t2 t2Var) {
        this.a = t2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2) && Intrinsics.d(this.a, ((s2) obj).a);
    }

    public final int hashCode() {
        t2 t2Var = this.a;
        if (t2Var == null) {
            return 0;
        }
        return t2Var.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ')';
    }
}
