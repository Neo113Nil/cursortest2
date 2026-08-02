package bo.app;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ke implements t9 {
    public final d9 a;
    public final int b;
    public final String c;

    public ke(d9 d9Var, int i, String str) {
        d9Var.getClass();
        this.a = d9Var;
        this.b = i;
        this.c = str;
    }

    @Override // bo.app.t9
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj;
        return Intrinsics.areEqual(this.a, keVar.a) && this.b == keVar.b && Intrinsics.areEqual(this.c, keVar.c);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{code = " + this.b + ", reason = " + this.c + "}";
    }
}
