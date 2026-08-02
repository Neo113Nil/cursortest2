package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class sm0 {
    public final oct a;
    public final Object b;
    public final long c;
    public final uif d;
    public final x6k e;
    public cn0 f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final x6k i = szf.g0(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public sm0(Object obj, oct octVar, cn0 cn0Var, long j, Object obj2, long j2, Function0 function0) {
        this.a = octVar;
        this.b = obj2;
        this.c = j2;
        this.d = (uif) function0;
        this.e = szf.g0(obj);
        this.f = qwp.H(cn0Var);
        this.g = j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, uif] */
    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final Object b() {
        return this.a.b.invoke(this.f);
    }
}
