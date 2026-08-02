package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e23 {
    public final gc8 a;
    public final xzb b;

    public e23(gc8 gc8Var, xzb xzbVar) {
        this.a = gc8Var;
        this.b = xzbVar;
    }

    public final e23 a(xzb xzbVar) {
        return Intrinsics.d(this.b, xzbVar) ? this : new e23(this.a, xzbVar);
    }
}
