package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p64 implements s64 {
    public final kk4 a;
    public final String b;

    public p64(kk4 kk4Var) {
        kk4Var.getClass();
        this.a = kk4Var;
        this.b = kk4Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p64) && Intrinsics.d(this.a, ((p64) obj).a);
    }

    @Override // defpackage.u64
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChromeDescriptor(item=" + this.a + ")";
    }
}
