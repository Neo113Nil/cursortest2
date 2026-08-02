package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ze6 implements mhp {
    public final ohp a;
    public final f9f b;
    public final String c;

    public ze6(ohp ohpVar, f9f f9fVar) {
        f9fVar.getClass();
        this.a = ohpVar;
        this.b = f9fVar;
        this.c = ohpVar.a + '<' + ((lm4) f9fVar).h() + '>';
    }

    @Override // defpackage.mhp
    public final ivf a() {
        return this.a.b;
    }

    @Override // defpackage.mhp
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mhp
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.mhp
    public final int e() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        ze6 ze6Var = obj instanceof ze6 ? (ze6) obj : null;
        return ze6Var != null && this.a.equals(ze6Var.a) && Intrinsics.d(ze6Var.b, this.b);
    }

    @Override // defpackage.mhp
    public final String f(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.mhp
    public final List g(int i) {
        return this.a.h[i];
    }

    @Override // defpackage.mhp
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.mhp
    public final mhp h(int i) {
        return this.a.g[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (((lm4) this.b).hashCode() * 31);
    }

    @Override // defpackage.mhp
    public final String i() {
        return this.c;
    }

    @Override // defpackage.mhp
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.mhp
    public final boolean j(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
