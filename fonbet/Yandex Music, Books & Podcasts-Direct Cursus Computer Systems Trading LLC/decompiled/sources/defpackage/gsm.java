package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gsm implements mhp {
    public final String a;
    public final csm b;

    public gsm(String str, csm csmVar) {
        csmVar.getClass();
        this.a = str;
        this.b = csmVar;
    }

    @Override // defpackage.mhp
    public final ivf a() {
        return this.b;
    }

    public final void b() {
        throw new IllegalStateException(su4.o(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.mhp
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mhp
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // defpackage.mhp
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsm)) {
            return false;
        }
        gsm gsmVar = (gsm) obj;
        return this.a.equals(gsmVar.a) && Intrinsics.d(this.b, gsmVar.b);
    }

    @Override // defpackage.mhp
    public final String f(int i) {
        b();
        throw null;
    }

    @Override // defpackage.mhp
    public final List g(int i) {
        b();
        throw null;
    }

    @Override // defpackage.mhp
    public final List getAnnotations() {
        return c5b.a;
    }

    @Override // defpackage.mhp
    public final mhp h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.mhp
    public final String i() {
        return this.a;
    }

    @Override // defpackage.mhp
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.mhp
    public final boolean j(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return dfi.i(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
