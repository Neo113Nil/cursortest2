package com.yandex.passport.sloth.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v0 implements y0 {
    public final int a;
    public final String b;

    public v0(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && Intrinsics.d(this.b, v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Error(code=" + this.a + ", url=" + ((Object) com.yandex.passport.common.url.b.m(this.b)) + ')';
    }
}
