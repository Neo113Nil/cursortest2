package com.yandex.plus.bdui.plus.scenario;

import com.yandex.passport.sloth.command.data.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {
    public final Function1 a;
    public final Function1 b;
    public final Function2 c;
    public final Function0 d;
    public final Function0 e;

    public o(Function1 function1, Function1 function12, com.yandex.passport.internal.ui.bouncer.p pVar, com.yandex.plus.bdui.plus.checkout.d dVar, k0 k0Var, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        pVar = (i & 4) != 0 ? null : pVar;
        dVar = (i & 8) != 0 ? null : dVar;
        k0Var = (i & 16) != 0 ? null : k0Var;
        this.a = function1;
        this.b = function12;
        this.c = pVar;
        this.d = dVar;
        this.e = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.a, oVar.a) && this.b.equals(oVar.b) && Intrinsics.d(this.c, oVar.c) && Intrinsics.d(this.d, oVar.d) && Intrinsics.d(this.e, oVar.e);
    }

    public final int hashCode() {
        Function1 function1 = this.a;
        int hashCode = (this.b.hashCode() + ((function1 == null ? 0 : function1.hashCode()) * 31)) * 31;
        Function2 function2 = this.c;
        int hashCode2 = (hashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function0 function0 = this.d;
        int hashCode3 = (hashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function02 = this.e;
        return hashCode3 + (function02 != null ? function02.hashCode() : 0);
    }

    public final String toString() {
        return "PlusFeatures(actions=" + this.a + ", contents=" + this.b + ", scaffolds=" + this.c + ", slices=" + this.d + ", dataSources=" + this.e + ')';
    }
}
