package com.yandex.plus.bdui.plus.action;

import com.yandex.passport.internal.methods.performer.v0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t {
    public final Function1 a;
    public final Function2 b;
    public final Function1 c;

    public t(Function1 function1, v0 v0Var, com.yandex.plus.bdui.flex.ui.content.c cVar) {
        this.a = function1;
        this.b = v0Var;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.a, tVar.a) && Intrinsics.d(this.b, tVar.b) && Intrinsics.d(this.c, tVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Function2 function2 = this.b;
        int hashCode2 = (hashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1 function1 = this.c;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "FieldDescriptor(select=" + this.a + ", customEquals=" + this.b + ", customHashCode=" + this.c + ')';
    }
}
