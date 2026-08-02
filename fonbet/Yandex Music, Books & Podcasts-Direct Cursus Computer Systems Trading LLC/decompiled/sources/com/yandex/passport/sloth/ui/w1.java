package com.yandex.passport.sloth.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1 implements x1 {
    public final y0 a;

    public w1(y0 y0Var) {
        y0Var.getClass();
        this.a = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && Intrinsics.d(this.a, ((w1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiEvent(event=" + this.a + ')';
    }
}
