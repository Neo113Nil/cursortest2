package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vm implements o0k {
    public final o0k a;
    public final o0k b;

    public vm(o0k o0kVar, o0k o0kVar2) {
        o0kVar.getClass();
        o0kVar2.getClass();
        this.a = o0kVar;
        this.b = o0kVar2;
    }

    @Override // defpackage.o0k
    public final float a() {
        return this.b.a() + this.a.a();
    }

    @Override // defpackage.o0k
    public final float b(xof xofVar) {
        xofVar.getClass();
        return this.b.b(xofVar) + this.a.b(xofVar);
    }

    @Override // defpackage.o0k
    public final float c(xof xofVar) {
        xofVar.getClass();
        return this.b.c(xofVar) + this.a.c(xofVar);
    }

    @Override // defpackage.o0k
    public final float d() {
        return this.b.d() + this.a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm)) {
            return false;
        }
        vm vmVar = (vm) obj;
        return Intrinsics.d(vmVar.a, this.a) && Intrinsics.d(vmVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ")";
    }
}
