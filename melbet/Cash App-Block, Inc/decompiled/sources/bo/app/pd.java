package bo.app;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pd implements t9 {
    public final d9 a;
    public final int b;
    public final String c;
    public final String d;

    public pd(d9 d9Var, int i, String str, String str2) {
        d9Var.getClass();
        this.a = d9Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // bo.app.t9
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return Intrinsics.areEqual(this.a, pdVar.a) && this.b == pdVar.b && Intrinsics.areEqual(this.c, pdVar.c) && Intrinsics.areEqual(this.d, pdVar.d);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.b;
        String str = this.c;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("{code = ", i, ", reason = ", str, ", message = "), this.d, "}");
    }
}
