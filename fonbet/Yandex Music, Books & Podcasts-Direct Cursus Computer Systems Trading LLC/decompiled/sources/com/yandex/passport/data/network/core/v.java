package com.yandex.passport.data.network.core;

import defpackage.k5r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v {
    public final u a;
    public final String b;
    public final Function1 c;

    public v(u uVar, String str, Function1 function1) {
        uVar.getClass();
        this.a = uVar;
        this.b = str;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.a, vVar.a) && this.b.equals(vVar.b) && this.c.equals(vVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Params(param=" + this.a + ", source=" + this.b + ", request=" + this.c + ')';
    }
}
