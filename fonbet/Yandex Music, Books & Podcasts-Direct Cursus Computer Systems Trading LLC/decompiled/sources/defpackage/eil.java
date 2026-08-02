package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class eil implements kil {
    public final l1g a;
    public final s8i b;
    public final a1l c;
    public final yc4 d;

    public eil(oq7 oq7Var, l1g l1gVar, s8i s8iVar) {
        this.a = l1gVar;
        this.b = s8iVar;
        this.c = new a1l(oq7Var.b.f, 16);
        Continuation continuation = null;
        this.d = zsd.M0(zsd.b0(zsd.C(zsd.M0(oq7Var.a.c, new cil(continuation, this, 0)), 0)), new cil(continuation, this, 1));
    }

    @Override // defpackage.kil
    public final pjc a() {
        return this.d;
    }
}
