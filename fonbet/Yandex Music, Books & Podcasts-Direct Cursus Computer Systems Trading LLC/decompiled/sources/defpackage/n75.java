package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n75 implements p75 {
    public final mmu a;
    public final pfn b;

    public n75(mmu mmuVar, x65 x65Var) {
        this.a = mmuVar;
        this.b = x65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n75)) {
            return false;
        }
        n75 n75Var = (n75) obj;
        return this.a.equals(n75Var.a) && Intrinsics.d(this.b, n75Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pfn pfnVar = this.b;
        return hashCode + (pfnVar == null ? 0 : pfnVar.hashCode());
    }

    public final String toString() {
        return "BackendWaveButton(waveButtonInfo=" + this.a + ", radioFrom=" + this.b + ")";
    }
}
