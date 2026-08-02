package com.yandex.plus.core.graphql;

import defpackage.q6n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w2 implements q6n {
    public final a3 a;

    public w2(a3 a3Var) {
        this.a = a3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2) && Intrinsics.d(this.a, ((w2) obj).a);
    }

    public final int hashCode() {
        a3 a3Var = this.a;
        if (a3Var == null) {
            return 0;
        }
        return a3Var.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ')';
    }
}
