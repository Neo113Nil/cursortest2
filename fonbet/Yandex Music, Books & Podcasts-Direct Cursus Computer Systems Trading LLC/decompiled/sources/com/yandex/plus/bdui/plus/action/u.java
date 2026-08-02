package com.yandex.plus.bdui.plus.action;

import defpackage.k32;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u {
    public final k32 a;
    public final Function2 b;
    public final Function1 c;

    public u(k32 k32Var, Function2 function2, Function1 function1) {
        this.a = k32Var;
        this.b = function2;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a.equals(uVar.a) && Intrinsics.d(this.b, uVar.b) && Intrinsics.d(this.c, uVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Function2 function2 = this.b;
        int hashCode2 = (hashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1 function1 = this.c;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "FieldInfo(get=" + this.a + ", customEquals=" + this.b + ", customHashCode=" + this.c + ')';
    }
}
