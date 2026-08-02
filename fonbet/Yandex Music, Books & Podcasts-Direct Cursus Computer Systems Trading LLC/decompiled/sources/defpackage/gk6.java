package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class gk6 implements itf {
    public final at5 a;
    public final ny2 b;
    public final pyc c;

    public gk6(at5 at5Var, ny2 ny2Var, pyc pycVar) {
        pycVar.getClass();
        this.a = at5Var;
        this.b = ny2Var;
        this.c = pycVar;
    }

    @Override // defpackage.itf
    public final Function1 getKey() {
        return this.a;
    }

    @Override // defpackage.itf
    public final Function1 getType() {
        return this.b;
    }
}
