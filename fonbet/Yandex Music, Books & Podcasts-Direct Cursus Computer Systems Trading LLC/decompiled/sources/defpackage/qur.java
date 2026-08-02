package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qur implements sur {
    public final nur a;
    public final Function2 b;
    public final wn5 c;

    public qur(nur nurVar, Function2 function2, wn5 wn5Var) {
        function2.getClass();
        this.a = nurVar;
        this.b = function2;
        this.c = wn5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qur)) {
            return false;
        }
        qur qurVar = (qur) obj;
        return this.a.equals(qurVar.a) && Intrinsics.d(this.b, qurVar.b) && this.c.equals(qurVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Change(config=" + this.a + ", oldContent=" + this.b + ", newContent=" + this.c + ")";
    }
}
